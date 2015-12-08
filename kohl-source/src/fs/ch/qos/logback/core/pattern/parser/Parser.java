// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.pattern.parser;

import fs.ch.qos.logback.core.pattern.Converter;
import fs.ch.qos.logback.core.pattern.FormatInfo;
import fs.ch.qos.logback.core.pattern.IdentityCompositeConverter;
import fs.ch.qos.logback.core.pattern.ReplacingCompositeConverter;
import fs.ch.qos.logback.core.pattern.util.IEscapeUtil;
import fs.ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import fs.ch.qos.logback.core.spi.ContextAwareBase;
import fs.ch.qos.logback.core.spi.ScanException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package fs.ch.qos.logback.core.pattern.parser:
//            Token, TokenStream, CompositeNode, Node, 
//            SimpleKeywordNode, FormattingNode, Compiler

public class Parser extends ContextAwareBase
{

    public static final Map DEFAULT_COMPOSITE_CONVERTER_MAP;
    int pointer;
    final List tokenList;

    public Parser(String s)
        throws ScanException
    {
        this(s, ((IEscapeUtil) (new RegularEscapeUtil())));
    }

    public Parser(String s, IEscapeUtil iescapeutil)
        throws ScanException
    {
        pointer = 0;
        try
        {
            tokenList = (new TokenStream(s, iescapeutil)).tokenize();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ScanException("Failed to initialize Parser", s);
        }
    }

    FormattingNode C()
        throws ScanException
    {
        Token token = getCurentToken();
        expectNotNull(token, "a LEFT_PARENTHESIS or KEYWORD");
        switch (token.getType())
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unexpected token ").append(token).toString());

        case 1004: 
            return SINGLE();

        case 1005: 
            advanceTokenPointer();
            break;
        }
        return COMPOSITE(token.getValue().toString());
    }

    FormattingNode COMPOSITE(String s)
        throws ScanException
    {
        s = new CompositeNode(s);
        s.setChildNode(E());
        Token token = getNextToken();
        if (token == null || token.getType() != 41)
        {
            s = (new StringBuilder()).append("Expecting RIGHT_PARENTHESIS token but got ").append(token).toString();
            addError(s);
            addError("See also http://logback.qos.ch/codes.html#missingRightParenthesis");
            throw new ScanException(s);
        }
        token = getCurentToken();
        if (token != null && token.getType() == 1006)
        {
            s.setOptions((List)token.getValue());
            advanceTokenPointer();
        }
        return s;
    }

    Node E()
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
                node1.setNext(node2);
                return node1;
            }
        }
        return node;
    }

    Node Eopt()
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

    FormattingNode SINGLE()
        throws ScanException
    {
        SimpleKeywordNode simplekeywordnode = new SimpleKeywordNode(getNextToken().getValue());
        Token token = getCurentToken();
        if (token != null && token.getType() == 1006)
        {
            simplekeywordnode.setOptions((List)token.getValue());
            advanceTokenPointer();
        }
        return simplekeywordnode;
    }

    Node T()
        throws ScanException
    {
        Object obj = getCurentToken();
        expectNotNull(((Token) (obj)), "a LITERAL or '%'");
        switch (((Token) (obj)).getType())
        {
        default:
            return null;

        case 1000: 
            advanceTokenPointer();
            return new Node(0, ((Token) (obj)).getValue());

        case 37: // '%'
            advanceTokenPointer();
            obj = getCurentToken();
            expectNotNull(((Token) (obj)), "a FORMAT_MODIFIER, SIMPLE_KEYWORD or COMPOUND_KEYWORD");
            break;
        }
        if (((Token) (obj)).getType() == 1002)
        {
            obj = FormatInfo.valueOf((String)((Token) (obj)).getValue());
            advanceTokenPointer();
            FormattingNode formattingnode = C();
            formattingnode.setFormatInfo(((FormatInfo) (obj)));
            return formattingnode;
        } else
        {
            return C();
        }
    }

    void advanceTokenPointer()
    {
        pointer = pointer + 1;
    }

    public Converter compile(Node node, Map map)
    {
        node = new Compiler(node, map);
        node.setContext(context);
        return node.compile();
    }

    void expectNotNull(Token token, String s)
    {
        if (token == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("All tokens consumed but was expecting ").append(s).toString());
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

    Token getNextToken()
    {
        if (pointer < tokenList.size())
        {
            List list = tokenList;
            int i = pointer;
            pointer = i + 1;
            return (Token)list.get(i);
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

    static 
    {
        DEFAULT_COMPOSITE_CONVERTER_MAP = new HashMap();
        DEFAULT_COMPOSITE_CONVERTER_MAP.put(Token.BARE_COMPOSITE_KEYWORD_TOKEN.getValue().toString(), fs/ch/qos/logback/core/pattern/IdentityCompositeConverter.getName());
        DEFAULT_COMPOSITE_CONVERTER_MAP.put("replace", fs/ch/qos/logback/core/pattern/ReplacingCompositeConverter.getName());
    }
}
