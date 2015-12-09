// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.b;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.e;
import com.bumptech.glide.load.g;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

// Referenced classes of package com.bumptech.glide.load.engine:
//            i

class f
    implements c
{

    private final String a;
    private final int b;
    private final int c;
    private final e d;
    private final e e;
    private final g f;
    private final com.bumptech.glide.load.f g;
    private final com.bumptech.glide.load.resource.e.c h;
    private final b i;
    private final c j;
    private String k;
    private int l;
    private c m;

    public f(String s, c c1, int i1, int j1, e e1, e e2, g g1, 
            com.bumptech.glide.load.f f1, com.bumptech.glide.load.resource.e.c c2, b b1)
    {
        a = s;
        j = c1;
        b = i1;
        c = j1;
        d = e1;
        e = e2;
        f = g1;
        g = f1;
        h = c2;
        i = b1;
    }

    public c a()
    {
        if (m == null)
        {
            m = new i(a, j);
        }
        return m;
    }

    public void a(MessageDigest messagedigest)
        throws UnsupportedEncodingException
    {
        byte abyte0[] = ByteBuffer.allocate(8).putInt(b).putInt(c).array();
        j.a(messagedigest);
        messagedigest.update(a.getBytes("UTF-8"));
        messagedigest.update(abyte0);
        String s;
        if (d != null)
        {
            s = d.a();
        } else
        {
            s = "";
        }
        messagedigest.update(s.getBytes("UTF-8"));
        if (e != null)
        {
            s = e.a();
        } else
        {
            s = "";
        }
        messagedigest.update(s.getBytes("UTF-8"));
        if (f != null)
        {
            s = f.a();
        } else
        {
            s = "";
        }
        messagedigest.update(s.getBytes("UTF-8"));
        if (g != null)
        {
            s = g.a();
        } else
        {
            s = "";
        }
        messagedigest.update(s.getBytes("UTF-8"));
        if (i != null)
        {
            s = i.a();
        } else
        {
            s = "";
        }
        messagedigest.update(s.getBytes("UTF-8"));
    }

    public boolean equals(Object obj)
    {
        boolean flag3 = false;
        if (this != obj) goto _L2; else goto _L1
_L1:
        boolean flag2 = true;
_L4:
        return flag2;
_L2:
        flag2 = flag3;
        if (obj == null) goto _L4; else goto _L3
_L3:
        flag2 = flag3;
        if (getClass() != obj.getClass()) goto _L4; else goto _L5
_L5:
        obj = (f)obj;
        flag2 = flag3;
        if (!a.equals(((f) (obj)).a)) goto _L4; else goto _L6
_L6:
        flag2 = flag3;
        if (!j.equals(((f) (obj)).j)) goto _L4; else goto _L7
_L7:
        flag2 = flag3;
        if (c != ((f) (obj)).c) goto _L4; else goto _L8
_L8:
        flag2 = flag3;
        if (b != ((f) (obj)).b) goto _L4; else goto _L9
_L9:
        boolean flag;
        boolean flag1;
        if (f == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((f) (obj)).f == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag3;
        if (flag ^ flag1) goto _L4; else goto _L10
_L10:
        if (f == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag3;
        if (!f.a().equals(((f) (obj)).f.a())) goto _L4; else goto _L11
_L11:
        if (e == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((f) (obj)).e == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag3;
        if (flag ^ flag1) goto _L4; else goto _L12
_L12:
        if (e == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag3;
        if (!e.a().equals(((f) (obj)).e.a())) goto _L4; else goto _L13
_L13:
        if (d == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((f) (obj)).d == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag3;
        if (flag ^ flag1) goto _L4; else goto _L14
_L14:
        if (d == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag3;
        if (!d.a().equals(((f) (obj)).d.a())) goto _L4; else goto _L15
_L15:
        if (g == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((f) (obj)).g == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag3;
        if (flag ^ flag1) goto _L4; else goto _L16
_L16:
        if (g == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag3;
        if (!g.a().equals(((f) (obj)).g.a())) goto _L4; else goto _L17
_L17:
        if (h == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((f) (obj)).h == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag3;
        if (flag ^ flag1) goto _L4; else goto _L18
_L18:
        if (h == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag3;
        if (!h.a().equals(((f) (obj)).h.a())) goto _L4; else goto _L19
_L19:
        if (i == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((f) (obj)).i == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag3;
        if (flag ^ flag1) goto _L4; else goto _L20
_L20:
        if (i == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag3;
        if (!i.a().equals(((f) (obj)).i.a())) goto _L4; else goto _L21
_L21:
        return true;
    }

    public int hashCode()
    {
        boolean flag = false;
        if (l == 0)
        {
            l = a.hashCode();
            l = l * 31 + j.hashCode();
            l = l * 31 + b;
            l = l * 31 + c;
            int j1 = l;
            int i1;
            if (d != null)
            {
                i1 = d.a().hashCode();
            } else
            {
                i1 = 0;
            }
            l = i1 + j1 * 31;
            j1 = l;
            if (e != null)
            {
                i1 = e.a().hashCode();
            } else
            {
                i1 = 0;
            }
            l = i1 + j1 * 31;
            j1 = l;
            if (f != null)
            {
                i1 = f.a().hashCode();
            } else
            {
                i1 = 0;
            }
            l = i1 + j1 * 31;
            j1 = l;
            if (g != null)
            {
                i1 = g.a().hashCode();
            } else
            {
                i1 = 0;
            }
            l = i1 + j1 * 31;
            j1 = l;
            if (h != null)
            {
                i1 = h.a().hashCode();
            } else
            {
                i1 = 0;
            }
            l = i1 + j1 * 31;
            j1 = l;
            i1 = ((flag) ? 1 : 0);
            if (i != null)
            {
                i1 = i.a().hashCode();
            }
            l = j1 * 31 + i1;
        }
        return l;
    }

    public String toString()
    {
        if (k == null)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("EngineKey{").append(a).append('+').append(j).append("+[").append(b).append('x').append(c).append("]+").append('\'');
            String s;
            if (d != null)
            {
                s = d.a();
            } else
            {
                s = "";
            }
            stringbuilder = stringbuilder.append(s).append('\'').append('+').append('\'');
            if (e != null)
            {
                s = e.a();
            } else
            {
                s = "";
            }
            stringbuilder = stringbuilder.append(s).append('\'').append('+').append('\'');
            if (f != null)
            {
                s = f.a();
            } else
            {
                s = "";
            }
            stringbuilder = stringbuilder.append(s).append('\'').append('+').append('\'');
            if (g != null)
            {
                s = g.a();
            } else
            {
                s = "";
            }
            stringbuilder = stringbuilder.append(s).append('\'').append('+').append('\'');
            if (h != null)
            {
                s = h.a();
            } else
            {
                s = "";
            }
            stringbuilder = stringbuilder.append(s).append('\'').append('+').append('\'');
            if (i != null)
            {
                s = i.a();
            } else
            {
                s = "";
            }
            k = stringbuilder.append(s).append('\'').append('}').toString();
        }
        return k;
    }
}
