// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.subst;

import fs.ch.qos.logback.core.CoreConstants;
import fs.ch.qos.logback.core.spi.ScanException;
import java.util.List;

// Referenced classes of package fs.ch.qos.logback.core.subst:
//            Token, Node

public class Parser
{

    int pointer;
    final List tokenList;

    public Parser(List list)
    {
        pointer = 0;
        tokenList = list;
    }

    private Node E()
        throws ScanException
    {
        Node node1 = T();
        Node node;
        if (node1 == null)
        {
            node = null;
        } else
        {
            Node node2 = Eopt();
            node = node1;
            if (node2 != null)
            {
                appendNode(node1, node2);
                return node1;
            }
        }
        return node;
    }

    private Node Eopt()
        throws ScanException
    {
        if (getCurentToken() == null)
        {
            return null;
        } else
        {
            return E();
        }
    }

    private Node T()
        throws ScanException
    {
        Token token = getCurentToken();
        static class _cls1
        {

            static final int $SwitchMap$ch$qos$logback$core$subst$Token$Type[];

            static 
            {
                $SwitchMap$ch$qos$logback$core$subst$Token$Type = new int[Token.Type.values().length];
                try
                {
                    $SwitchMap$ch$qos$logback$core$subst$Token$Type[Token.Type.LITERAL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$ch$qos$logback$core$subst$Token$Type[Token.Type.CURLY_LEFT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$ch$qos$logback$core$subst$Token$Type[Token.Type.START.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.ch.qos.logback.core.subst.Token.Type[token.type.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            advanceTokenPointer();
            return new Node(Node.Type.LITERAL, token.payload);

        case 2: // '\002'
            advanceTokenPointer();
            Node node = E();
            expectCurlyRight(getCurentToken());
            advanceTokenPointer();
            Node node2 = new Node(Node.Type.LITERAL, CoreConstants.LEFT_ACCOLADE);
            node2.next = node;
            Node node3 = new Node(Node.Type.LITERAL, CoreConstants.RIGHT_ACCOLADE);
            if (node == null)
            {
                node2.next = node3;
                return node2;
            } else
            {
                appendNode(node, node3);
                return node2;
            }

        case 3: // '\003'
            advanceTokenPointer();
            Node node1 = V();
            expectCurlyRight(getCurentToken());
            advanceTokenPointer();
            return node1;
        }
    }

    private Node V()
        throws ScanException
    {
        Node node = E();
        node = new Node(Node.Type.VARIABLE, node);
        Token token = getCurentToken();
        if (token != null && token.type == Token.Type.DEFAULT)
        {
            advanceTokenPointer();
            node.defaultPart = E();
        }
        return node;
    }

    private void appendNode(Node node, Node node1)
    {
        do
        {
            if (node.next == null)
            {
                node.next = node1;
                return;
            }
            node = node.next;
        } while (true);
    }

    void advanceTokenPointer()
    {
        pointer = pointer + 1;
    }

    void expectCurlyRight(Token token)
        throws ScanException
    {
        expectNotNull(token, "}");
        if (token.type != Token.Type.CURLY_RIGHT)
        {
            throw new ScanException("Expecting }");
        } else
        {
            return;
        }
    }

    void expectNotNull(Token token, String s)
    {
        if (token == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("All tokens consumed but was expecting \"").append(s).append("\"").toString());
        } else
        {
            return;
        }
    }

    Token getCurentToken()
    {
        if (pointer < tokenList.size())
        {
            return (Token)tokenList.get(pointer);
        } else
        {
            return null;
        }
    }

    public Node parse()
        throws ScanException
    {
        return E();
    }
}
