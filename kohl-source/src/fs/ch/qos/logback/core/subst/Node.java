// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.subst;


public class Node
{
    static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type LITERAL;
        public static final Type VARIABLE;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(fs/ch/qos/logback/core/subst/Node$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            LITERAL = new Type("LITERAL", 0);
            VARIABLE = new Type("VARIABLE", 1);
            $VALUES = (new Type[] {
                LITERAL, VARIABLE
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    Object defaultPart;
    Node next;
    Object payload;
    Type type;

    public Node(Type type1, Object obj)
    {
        type = type1;
        payload = obj;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Node)obj;
            if (type != ((Node) (obj)).type)
            {
                return false;
            }
            if (payload == null ? ((Node) (obj)).payload != null : !payload.equals(((Node) (obj)).payload))
            {
                return false;
            }
            if (defaultPart == null ? ((Node) (obj)).defaultPart != null : !defaultPart.equals(((Node) (obj)).defaultPart))
            {
                return false;
            }
            if (next == null ? ((Node) (obj)).next != null : !next.equals(((Node) (obj)).next))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (type != null)
        {
            i = type.hashCode();
        } else
        {
            i = 0;
        }
        if (payload != null)
        {
            j = payload.hashCode();
        } else
        {
            j = 0;
        }
        if (defaultPart != null)
        {
            k = defaultPart.hashCode();
        } else
        {
            k = 0;
        }
        if (next != null)
        {
            l = next.hashCode();
        }
        return (k + (j + i * 31) * 31) * 31 + l;
    }

    void recursive(Node node, StringBuilder stringbuilder)
    {
        for (; node != null; node = node.next)
        {
            stringbuilder.append(node.toString()).append(" --> ");
        }

        stringbuilder.append("null ");
    }

    public String toString()
    {
        static class _cls1
        {

            static final int $SwitchMap$ch$qos$logback$core$subst$Node$Type[];

            static 
            {
                $SwitchMap$ch$qos$logback$core$subst$Node$Type = new int[Type.values().length];
                try
                {
                    $SwitchMap$ch$qos$logback$core$subst$Node$Type[Type.LITERAL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$ch$qos$logback$core$subst$Node$Type[Type.VARIABLE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        Object obj;
        switch (_cls1..SwitchMap.ch.qos.logback.core.subst.Node.Type[type.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return (new StringBuilder()).append("Node{type=").append(type).append(", payload='").append(payload).append("'}").toString();

        case 2: // '\002'
            obj = new StringBuilder();
            break;
        }
        StringBuilder stringbuilder = new StringBuilder();
        if (defaultPart != null)
        {
            recursive((Node)defaultPart, stringbuilder);
        }
        recursive((Node)payload, ((StringBuilder) (obj)));
        String s = (new StringBuilder()).append("Node{type=").append(type).append(", payload='").append(((StringBuilder) (obj)).toString()).append("'").toString();
        obj = s;
        if (defaultPart != null)
        {
            obj = (new StringBuilder()).append(s).append(", defaultPart=").append(stringbuilder.toString()).toString();
        }
        return (new StringBuilder()).append(((String) (obj))).append('}').toString();
    }
}
