// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.a;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.io.f;
import com.fasterxml.jackson.core.util.a;
import com.fasterxml.jackson.core.util.g;
import java.io.IOException;

public abstract class c extends JsonParser
{

    protected static final int aA = 39;
    protected static final int aB = 98;
    protected static final int aC = 102;
    protected static final int aD = 110;
    protected static final int aE = 114;
    protected static final int aF = 116;
    protected static final int aG = 117;
    protected static final int am = 9;
    protected static final int an = 10;
    protected static final int ao = 13;
    protected static final int ap = 32;
    protected static final int aq = 91;
    protected static final int ar = 93;
    protected static final int as = 123;
    protected static final int at = 125;
    protected static final int au = 34;
    protected static final int av = 92;
    protected static final int aw = 47;
    protected static final int ax = 58;
    protected static final int ay = 44;
    protected static final int az = 42;
    protected JsonToken aH;
    protected JsonToken aI;

    protected c()
    {
    }

    protected c(int i)
    {
        super(i);
    }

    protected static final String e(int i)
    {
        char c1 = (char)i;
        if (Character.isISOControl(c1))
        {
            return (new StringBuilder()).append("(CTRL-CHAR, code ").append(i).append(")").toString();
        }
        if (i > 255)
        {
            return (new StringBuilder()).append("'").append(c1).append("' (code ").append(i).append(" / 0x").append(Integer.toHexString(i)).append(")").toString();
        } else
        {
            return (new StringBuilder()).append("'").append(c1).append("' (code ").append(i).append(")").toString();
        }
    }

    protected char a(char c1)
        throws JsonProcessingException
    {
        while (c(com.fasterxml.jackson.core.JsonParser.Feature.f) || c1 == '\'' && c(com.fasterxml.jackson.core.JsonParser.Feature.d)) 
        {
            return c1;
        }
        f((new StringBuilder()).append("Unrecognized character escape ").append(e(c1)).toString());
        return c1;
    }

    public double a(double d1)
        throws IOException, JsonParseException
    {
        if (aH == null) goto _L2; else goto _L1
_L1:
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[JsonToken.values().length];
                try
                {
                    a[JsonToken.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[JsonToken.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[JsonToken.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[JsonToken.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[JsonToken.i.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[JsonToken.k.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[JsonToken.l.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[JsonToken.m.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[JsonToken.g.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[JsonToken.h.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[JsonToken.j.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.fasterxml.jackson.core.a._cls1.a[aH.ordinal()];
        JVM INSTR tableswitch 5 11: default 60
    //                   5 62
    //                   6 67
    //                   7 69
    //                   8 69
    //                   9 80
    //                   10 71
    //                   11 62;
           goto _L2 _L3 _L4 _L5 _L5 _L6 _L7 _L3
_L2:
        return d1;
_L3:
        return H();
_L4:
        return 1.0D;
_L5:
        return 0.0D;
_L7:
        return com.fasterxml.jackson.core.io.f.a(u(), d1);
_L6:
        Object obj = K();
        if (obj instanceof Number)
        {
            return ((Number)obj).doubleValue();
        }
        if (true) goto _L2; else goto _L8
_L8:
    }

    protected void a(Base64Variant base64variant, char c1, int i, String s1)
        throws JsonParseException
    {
        Object obj;
        if (c1 <= ' ')
        {
            base64variant = (new StringBuilder()).append("Illegal white space character (code 0x").append(Integer.toHexString(c1)).append(") as character #").append(i + 1).append(" of 4-char base64 unit: can only used between units").toString();
        } else
        if (base64variant.a(c1))
        {
            base64variant = (new StringBuilder()).append("Unexpected padding character ('").append(base64variant.c()).append("') as character #").append(i + 1).append(" of 4-char base64 unit: padding only legal as 3rd or 4th character").toString();
        } else
        if (!Character.isDefined(c1) || Character.isISOControl(c1))
        {
            base64variant = (new StringBuilder()).append("Illegal character (code 0x").append(Integer.toHexString(c1)).append(") in base64 content").toString();
        } else
        {
            base64variant = (new StringBuilder()).append("Illegal character '").append(c1).append("' (code 0x").append(Integer.toHexString(c1)).append(") in base64 content").toString();
        }
        obj = base64variant;
        if (s1 != null)
        {
            obj = (new StringBuilder()).append(base64variant).append(": ").append(s1).toString();
        }
        throw c(((String) (obj)));
    }

    public abstract void a(String s1);

    protected void a(String s1, a a1, Base64Variant base64variant)
        throws IOException, JsonParseException
    {
        try
        {
            base64variant.a(s1, a1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            f(s1.getMessage());
        }
    }

    protected final void a(String s1, Throwable throwable)
        throws JsonParseException
    {
        throw b(s1, throwable);
    }

    public boolean a(boolean flag)
        throws IOException, JsonParseException
    {
        boolean flag2 = false;
        if (aH == null) goto _L2; else goto _L1
_L1:
        boolean flag1 = flag2;
        com.fasterxml.jackson.core.a._cls1.a[aH.ordinal()];
        JVM INSTR tableswitch 5 10: default 64
    //                   5 68
    //                   6 80
    //                   7 66
    //                   8 66
    //                   9 82
    //                   10 102;
           goto _L2 _L3 _L4 _L5 _L5 _L6 _L7
_L2:
        flag1 = flag;
_L5:
        return flag1;
_L3:
        flag1 = flag2;
        if (D() == 0) goto _L5; else goto _L8
_L8:
        return true;
_L4:
        return true;
_L6:
        Object obj = K();
        if (obj instanceof Boolean)
        {
            return ((Boolean)obj).booleanValue();
        }
_L7:
        if (!"true".equals(u().trim())) goto _L2; else goto _L9
_L9:
        return true;
    }

    public abstract byte[] a(Base64Variant base64variant)
        throws IOException, JsonParseException;

    protected abstract void ac()
        throws JsonParseException;

    protected void am()
        throws JsonParseException
    {
        throw c("Unexpected end-of-String in base64 content");
    }

    protected void an()
        throws JsonParseException
    {
        e((new StringBuilder()).append(" in ").append(aH).toString());
    }

    protected void ao()
        throws JsonParseException
    {
        e(" in a value");
    }

    protected final void ap()
    {
        com.fasterxml.jackson.core.util.g.b();
    }

    public int b(int i)
        throws IOException, JsonParseException
    {
        if (aH == null) goto _L2; else goto _L1
_L1:
        com.fasterxml.jackson.core.a._cls1.a[aH.ordinal()];
        JVM INSTR tableswitch 5 11: default 60
    //                   5 62
    //                   6 67
    //                   7 69
    //                   8 69
    //                   9 80
    //                   10 71
    //                   11 62;
           goto _L2 _L3 _L4 _L5 _L5 _L6 _L7 _L3
_L2:
        return i;
_L3:
        return D();
_L4:
        return 1;
_L5:
        return 0;
_L7:
        return com.fasterxml.jackson.core.io.f.a(u(), i);
_L6:
        Object obj = K();
        if (obj instanceof Number)
        {
            return ((Number)obj).intValue();
        }
        if (true) goto _L2; else goto _L8
_L8:
    }

    public long b(long l1)
        throws IOException, JsonParseException
    {
        if (aH == null) goto _L2; else goto _L1
_L1:
        com.fasterxml.jackson.core.a._cls1.a[aH.ordinal()];
        JVM INSTR tableswitch 5 11: default 60
    //                   5 62
    //                   6 67
    //                   7 69
    //                   8 69
    //                   9 80
    //                   10 71
    //                   11 62;
           goto _L2 _L3 _L4 _L5 _L5 _L6 _L7 _L3
_L2:
        return l1;
_L3:
        return E();
_L4:
        return 1L;
_L5:
        return 0L;
_L7:
        return com.fasterxml.jackson.core.io.f.a(u(), l1);
_L6:
        Object obj = K();
        if (obj instanceof Number)
        {
            return ((Number)obj).longValue();
        }
        if (true) goto _L2; else goto _L8
_L8:
    }

    protected final JsonParseException b(String s1, Throwable throwable)
    {
        return new JsonParseException(s1, q(), throwable);
    }

    public String b(String s1)
        throws IOException, JsonParseException
    {
        if (aH != JsonToken.h && (aH == null || aH == JsonToken.m || !aH.e()))
        {
            return s1;
        } else
        {
            return u();
        }
    }

    protected void b(int i, String s1)
        throws JsonParseException
    {
        String s3 = (new StringBuilder()).append("Unexpected character (").append(e(i)).append(")").toString();
        String s2 = s3;
        if (s1 != null)
        {
            s2 = (new StringBuilder()).append(s3).append(": ").append(s1).toString();
        }
        f(s2);
    }

    protected void c(int i, String s1)
        throws JsonParseException
    {
        if (!c(com.fasterxml.jackson.core.JsonParser.Feature.e) || i >= 32)
        {
            i = (char)i;
            f((new StringBuilder()).append("Illegal unquoted character (").append(e(i)).append("): has to be escaped using backslash to be included in ").append(s1).toString());
        }
    }

    public abstract void close()
        throws IOException;

    public Version d()
    {
        return com.fasterxml.jackson.core.util.g.a(getClass());
    }

    protected void d(int i)
        throws JsonParseException
    {
        i = (char)i;
        f((new StringBuilder()).append("Illegal character (").append(e(i)).append("): only regular white space (\\r, \\n, \\t) is allowed between tokens").toString());
    }

    protected void e(String s1)
        throws JsonParseException
    {
        f((new StringBuilder()).append("Unexpected end-of-input").append(s1).toString());
    }

    public abstract JsonToken f()
        throws IOException, JsonParseException;

    protected final void f(String s1)
        throws JsonParseException
    {
        throw c(s1);
    }

    public JsonToken g()
        throws IOException, JsonParseException
    {
        JsonToken jsontoken1 = f();
        JsonToken jsontoken = jsontoken1;
        if (jsontoken1 == JsonToken.f)
        {
            jsontoken = f();
        }
        return jsontoken;
    }

    public JsonParser j()
        throws IOException, JsonParseException
    {
        if (aH != JsonToken.b && aH != JsonToken.d)
        {
            return this;
        }
        int i = 1;
        int i1;
        do
        {
label0:
            do
            {
                JsonToken jsontoken = f();
                if (jsontoken == null)
                {
                    ac();
                    return this;
                }
                switch (com.fasterxml.jackson.core.a._cls1.a[jsontoken.ordinal()])
                {
                default:
                    break;

                case 1: // '\001'
                case 2: // '\002'
                    i++;
                    break;

                case 3: // '\003'
                case 4: // '\004'
                    i1 = i - 1;
                    break label0;
                }
            } while (true);
            i = i1;
        } while (i1 != 0);
        return this;
    }

    public abstract boolean k();

    public JsonToken l()
    {
        return aH;
    }

    public boolean m()
    {
        return aH != null;
    }

    public abstract String n()
        throws IOException, JsonParseException;

    public abstract com.fasterxml.jackson.core.c o();

    public void s()
    {
        if (aH != null)
        {
            aI = aH;
            aH = null;
        }
    }

    public JsonToken t()
    {
        return aI;
    }

    public abstract String u()
        throws IOException, JsonParseException;

    public abstract char[] v()
        throws IOException, JsonParseException;

    public abstract int w()
        throws IOException, JsonParseException;

    public abstract int x()
        throws IOException, JsonParseException;

    public abstract boolean y();
}
