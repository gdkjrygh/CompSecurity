// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.subst;


public class Token
{
    public static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type CURLY_LEFT;
        public static final Type CURLY_RIGHT;
        public static final Type DEFAULT;
        public static final Type LITERAL;
        public static final Type START;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(fs/ch/qos/logback/core/subst/Token$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            LITERAL = new Type("LITERAL", 0);
            START = new Type("START", 1);
            CURLY_LEFT = new Type("CURLY_LEFT", 2);
            CURLY_RIGHT = new Type("CURLY_RIGHT", 3);
            DEFAULT = new Type("DEFAULT", 4);
            $VALUES = (new Type[] {
                LITERAL, START, CURLY_LEFT, CURLY_RIGHT, DEFAULT
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    public static final Token CURLY_LEFT_TOKEN;
    public static final Token CURLY_RIGHT_TOKEN;
    public static final Token DEFAULT_SEP_TOKEN;
    public static final Token START_TOKEN;
    String payload;
    Type type;

    public Token(Type type1, String s)
    {
        type = type1;
        payload = s;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Token)obj;
            if (type != ((Token) (obj)).type)
            {
                return false;
            }
            if (payload == null ? ((Token) (obj)).payload != null : !payload.equals(((Token) (obj)).payload))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
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
        }
        return i * 31 + j;
    }

    public String toString()
    {
        String s1 = (new StringBuilder()).append("Token{type=").append(type).toString();
        String s = s1;
        if (payload != null)
        {
            s = (new StringBuilder()).append(s1).append(", payload='").append(payload).append('\'').toString();
        }
        return (new StringBuilder()).append(s).append('}').toString();
    }

    static 
    {
        START_TOKEN = new Token(Type.START, null);
        CURLY_LEFT_TOKEN = new Token(Type.CURLY_LEFT, null);
        CURLY_RIGHT_TOKEN = new Token(Type.CURLY_RIGHT, null);
        DEFAULT_SEP_TOKEN = new Token(Type.DEFAULT, null);
    }
}
