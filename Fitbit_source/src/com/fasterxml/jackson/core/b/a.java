// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.b;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.c.b;
import com.fasterxml.jackson.core.d;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.c;
import com.fasterxml.jackson.core.io.e;
import com.fasterxml.jackson.core.io.i;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

// Referenced classes of package com.fasterxml.jackson.core.b:
//            h, f

public final class a
{

    static final byte a = -17;
    static final byte b = -69;
    static final byte c = -65;
    protected final c d;
    protected final InputStream e;
    protected final byte f[];
    protected int g;
    protected boolean h;
    protected int i;
    private int j;
    private int k;
    private final boolean l;

    public a(c c1, InputStream inputstream)
    {
        h = true;
        i = 0;
        d = c1;
        e = inputstream;
        f = c1.e();
        j = 0;
        k = 0;
        g = 0;
        l = true;
    }

    public a(c c1, byte abyte0[], int i1, int j1)
    {
        h = true;
        i = 0;
        d = c1;
        e = null;
        f = abyte0;
        j = i1;
        k = i1 + j1;
        g = -i1;
        l = false;
    }

    private static int a(com.fasterxml.jackson.core.format.c c1, byte byte0)
        throws IOException
    {
        do
        {
            byte0 &= 0xff;
            if (byte0 != 32 && byte0 != 13 && byte0 != 10 && byte0 != 9)
            {
                return byte0;
            }
            if (!c1.a())
            {
                return -1;
            }
            byte0 = c1.b();
        } while (true);
    }

    public static MatchStrength a(com.fasterxml.jackson.core.format.c c1)
        throws IOException
    {
        if (c1.a()) goto _L2; else goto _L1
_L1:
        MatchStrength matchstrength = MatchStrength.b;
_L4:
        return matchstrength;
_L2:
        MatchStrength matchstrength1;
        int i1;
        byte byte1 = c1.b();
        byte byte0 = byte1;
        if (byte1 == -17)
        {
            if (!c1.a())
            {
                return MatchStrength.b;
            }
            if (c1.b() != -69)
            {
                return MatchStrength.a;
            }
            if (!c1.a())
            {
                return MatchStrength.b;
            }
            if (c1.b() != -65)
            {
                return MatchStrength.a;
            }
            if (!c1.a())
            {
                return MatchStrength.b;
            }
            byte0 = c1.b();
        }
        i1 = a(c1, byte0);
        if (i1 < 0)
        {
            return MatchStrength.b;
        }
        if (i1 == 123)
        {
            i1 = b(c1);
            if (i1 < 0)
            {
                return MatchStrength.b;
            }
            if (i1 == 34 || i1 == 125)
            {
                return MatchStrength.d;
            } else
            {
                return MatchStrength.a;
            }
        }
        if (i1 == 91)
        {
            i1 = b(c1);
            if (i1 < 0)
            {
                return MatchStrength.b;
            }
            if (i1 == 93 || i1 == 91)
            {
                return MatchStrength.d;
            } else
            {
                return MatchStrength.d;
            }
        }
        matchstrength1 = MatchStrength.c;
        matchstrength = matchstrength1;
        if (i1 == 34) goto _L4; else goto _L3
_L3:
        if (i1 > 57)
        {
            break; /* Loop/switch isn't completed */
        }
        matchstrength = matchstrength1;
        if (i1 >= 48) goto _L4; else goto _L5
_L5:
        if (i1 != 45)
        {
            break MISSING_BLOCK_LABEL_285;
        }
        i1 = b(c1);
        if (i1 < 0)
        {
            return MatchStrength.b;
        }
        if (i1 > 57)
        {
            break; /* Loop/switch isn't completed */
        }
        matchstrength = matchstrength1;
        if (i1 >= 48) goto _L4; else goto _L6
_L6:
        return MatchStrength.a;
        if (i1 == 110)
        {
            return a(c1, "ull", matchstrength1);
        }
        if (i1 == 116)
        {
            return a(c1, "rue", matchstrength1);
        }
        if (i1 == 102)
        {
            return a(c1, "alse", matchstrength1);
        } else
        {
            return MatchStrength.a;
        }
    }

    private static MatchStrength a(com.fasterxml.jackson.core.format.c c1, String s, MatchStrength matchstrength)
        throws IOException
    {
        int i1 = 0;
        int j1 = s.length();
        do
        {
label0:
            {
                MatchStrength matchstrength1 = matchstrength;
                if (i1 < j1)
                {
                    if (c1.a())
                    {
                        break label0;
                    }
                    matchstrength1 = MatchStrength.b;
                }
                return matchstrength1;
            }
            if (c1.b() != s.charAt(i1))
            {
                return MatchStrength.a;
            }
            i1++;
        } while (true);
    }

    private void a(String s)
        throws IOException
    {
        throw new CharConversionException((new StringBuilder()).append("Unsupported UCS-4 endianness (").append(s).append(") detected").toString());
    }

    private static int b(com.fasterxml.jackson.core.format.c c1)
        throws IOException
    {
        if (!c1.a())
        {
            return -1;
        } else
        {
            return a(c1, c1.b());
        }
    }

    private boolean b(int i1)
        throws IOException
    {
        i1;
        JVM INSTR lookupswitch 4: default 44
    //                   -16842752: 127
    //                   -131072: 99
    //                   65279: 77
    //                   65534: 121;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        int j1;
        j1 = i1 >>> 16;
        if (j1 == 65279)
        {
            j = j + 2;
            i = 2;
            h = true;
            return true;
        }
        break; /* Loop/switch isn't completed */
_L4:
        h = true;
        j = j + 4;
        i = 4;
        return true;
_L3:
        j = j + 4;
        i = 4;
        h = false;
        return true;
_L5:
        a("2143");
_L2:
        a("3412");
        if (true) goto _L1; else goto _L6
_L6:
        if (j1 == 65534)
        {
            j = j + 2;
            i = 2;
            h = false;
            return true;
        }
        if (i1 >>> 8 == 0xefbbbf)
        {
            j = j + 3;
            i = 1;
            h = true;
            return true;
        } else
        {
            return false;
        }
    }

    private boolean c(int i1)
        throws IOException
    {
        boolean flag = false;
        if (i1 >> 8 == 0)
        {
            h = true;
        } else
        if ((0xffffff & i1) == 0)
        {
            h = false;
        } else
        {
            if ((0xff00ffff & i1) != 0)
            {
                continue;
            }
            a("3412");
        }
        do
        {
            i = 4;
            flag = true;
            do
            {
                return flag;
            } while ((0xffff00ff & i1) != 0);
            a("2143");
        } while (true);
    }

    private boolean d(int i1)
    {
        boolean flag = false;
        if ((0xff00 & i1) != 0) goto _L2; else goto _L1
_L1:
        h = true;
_L6:
        i = 2;
        flag = true;
_L4:
        return flag;
_L2:
        if ((i1 & 0xff) != 0) goto _L4; else goto _L3
_L3:
        h = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public JsonEncoding a()
        throws IOException, JsonParseException
    {
        boolean flag1 = true;
        if (!a(4)) goto _L2; else goto _L1
_L1:
        int i1 = f[j] << 24 | (f[j + 1] & 0xff) << 16 | (f[j + 2] & 0xff) << 8 | f[j + 3] & 0xff;
        if (!b(i1)) goto _L4; else goto _L3
_L3:
        boolean flag = flag1;
_L12:
        if (flag) goto _L6; else goto _L5
_L5:
        JsonEncoding jsonencoding = JsonEncoding.a;
_L10:
        d.a(jsonencoding);
        return jsonencoding;
_L4:
        flag = flag1;
        if (c(i1))
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (d(i1 >>> 16))
        {
            continue; /* Loop/switch isn't completed */
        }
_L8:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L2:
        if (!a(2) || !d((f[j] & 0xff) << 8 | f[j + 1] & 0xff)) goto _L8; else goto _L7
_L7:
        flag = flag1;
        continue; /* Loop/switch isn't completed */
_L6:
        switch (i)
        {
        case 3: // '\003'
        default:
            throw new RuntimeException("Internal error");

        case 1: // '\001'
            jsonencoding = JsonEncoding.a;
            break;

        case 2: // '\002'
            if (h)
            {
                jsonencoding = JsonEncoding.b;
            } else
            {
                jsonencoding = JsonEncoding.c;
            }
            break;

        case 4: // '\004'
            if (h)
            {
                jsonencoding = JsonEncoding.d;
            } else
            {
                jsonencoding = JsonEncoding.e;
            }
            break;
        }
        if (true) goto _L10; else goto _L9
_L9:
        if (true) goto _L12; else goto _L11
_L11:
    }

    public JsonParser a(int i1, d d1, com.fasterxml.jackson.core.c.a a1, b b1, boolean flag, boolean flag1)
        throws IOException, JsonParseException
    {
        if (a() == JsonEncoding.a && flag)
        {
            a1 = a1.a(flag, flag1);
            return new h(d, i1, e, d1, a1, f, j, k, l);
        } else
        {
            return new f(d, i1, b(), d1, b1.a(flag, flag1));
        }
    }

    protected boolean a(int i1)
        throws IOException
    {
        boolean flag1 = true;
        int j1 = k - j;
        do
        {
            int k1;
label0:
            {
                boolean flag = flag1;
                if (j1 < i1)
                {
                    if (e == null)
                    {
                        k1 = -1;
                    } else
                    {
                        k1 = e.read(f, k, f.length - k);
                    }
                    if (k1 >= 1)
                    {
                        break label0;
                    }
                    flag = false;
                }
                return flag;
            }
            k = k + k1;
            j1 = k1 + j1;
        } while (true);
    }

    public Reader b()
        throws IOException
    {
        Object obj;
        JsonEncoding jsonencoding;
        jsonencoding = d.b();
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[JsonEncoding.values().length];
                try
                {
                    a[JsonEncoding.d.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[JsonEncoding.e.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[JsonEncoding.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[JsonEncoding.c.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[JsonEncoding.a.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[jsonencoding.ordinal()])
        {
        default:
            throw new RuntimeException("Internal error");

        case 1: // '\001'
        case 2: // '\002'
            return new i(d, e, f, j, k, d.b().b());

        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            obj = e;
            break;
        }
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = new ByteArrayInputStream(f, j, k);
_L4:
        return new InputStreamReader(((InputStream) (obj)), jsonencoding.a());
_L2:
        if (j < k)
        {
            obj = new e(d, ((InputStream) (obj)), f, j, k);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
