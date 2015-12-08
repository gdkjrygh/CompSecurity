// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class mjw
{

    public int a;
    public boolean b;
    public int c;
    private int d;

    public mjw()
    {
        c = -1;
    }

    public mjw(mjw mjw1)
    {
        c = -1;
        a = mjw1.a;
        d = mjw1.d;
        b = mjw1.b;
    }

    public final String a(String s, int i, int j)
    {
        return nkj.a(s, a, i, j, c);
    }

    public final mjw a()
    {
        if ((a & 0x80) != 0)
        {
            throw new IllegalStateException("Cannot set both app and sync domains");
        } else
        {
            a = a | 0x2000;
            return this;
        }
    }

    public void a(int i)
    {
        a = a | i;
        d = d | i;
    }

    public final mjw b()
    {
        a(512);
        return this;
    }

    public final mjw c()
    {
        a(2048);
        return this;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof mjw)
        {
            obj = (mjw)obj;
            flag = flag1;
            if (d == ((mjw) (obj)).d)
            {
                flag = flag1;
                if (b == ((mjw) (obj)).b)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        byte byte0;
        if (b)
        {
            byte0 = 17;
        } else
        {
            byte0 = 31;
        }
        return byte0 * 31 + d;
    }

    public final String toString()
    {
        String s;
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        String s7;
        String s8;
        String s9;
        String s10;
        if ((a & 0x10) != 0)
        {
            s = "kill_animation ";
        } else
        {
            s = "";
        }
        if ((a & 4) != 0)
        {
            s1 = "no_overlay ";
        } else
        {
            s1 = "";
        }
        if ((a & 0x2000) != 0)
        {
            s2 = "app_domain ";
        } else
        {
            s2 = "";
        }
        if ((a & 1) != 0)
        {
            s3 = "crop ";
        } else
        {
            s3 = "";
        }
        if ((a & 0x1000) != 0)
        {
            s4 = "loose_face_crop ";
        } else
        {
            s4 = "";
        }
        if ((a & 0x200) != 0)
        {
            s5 = "exif ";
        } else
        {
            s5 = "";
        }
        if ((a & 0x800) != 0)
        {
            s6 = "jpeg ";
        } else
        {
            s6 = "";
        }
        if ((a & 0x8000) != 0)
        {
            s7 = "blur ";
        } else
        {
            s7 = "";
        }
        if ((a & 0x20000) != 0)
        {
            s8 = "mp4 ";
        } else
        {
            s8 = "";
        }
        if ((a & 0x10000) != 0)
        {
            s9 = "loop ";
        } else
        {
            s9 = "";
        }
        if (b)
        {
            s10 = "custom_size";
        } else
        {
            s10 = "";
        }
        return (new StringBuilder(String.valueOf(s).length() + 18 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length() + String.valueOf(s7).length() + String.valueOf(s8).length() + String.valueOf(s9).length() + String.valueOf(s10).length())).append("FifeUrlOptions{ ").append(s).append(s1).append(s2).append(s3).append(s4).append(s5).append(s6).append(s7).append(s8).append(s9).append(s10).append(" }").toString();
    }
}
