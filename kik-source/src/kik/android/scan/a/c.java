// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan.a;

import com.kik.scan.GroupKikCode;
import com.kik.scan.RemoteKikCode;
import com.kik.scan.UsernameKikCode;

// Referenced classes of package kik.android.scan.a:
//            a

public abstract class kik.android.scan.a.c
{
    private static final class a extends kik.android.scan.a.c
    {

        kik.android.scan.a.a a;

        public final byte[] a()
        {
            byte abyte1[] = null;
            byte abyte0[] = abyte1;
            if (a != null)
            {
                abyte0 = abyte1;
                if (a.c() != null)
                {
                    abyte0 = a.c().encode();
                }
            }
            abyte1 = abyte0;
            if (abyte0 == null)
            {
                abyte1 = new byte[0];
            }
            return abyte1;
        }

        public final String b()
        {
            if (a == null)
            {
                return "";
            } else
            {
                return a.d();
            }
        }

        public final int c()
        {
            if (a == null)
            {
                return 0;
            } else
            {
                return a.a();
            }
        }

        a(kik.android.scan.a.a a1)
        {
            a = a1;
        }
    }

    private static final class b extends kik.android.scan.a.c
    {

        GroupKikCode a;

        public final byte[] a()
        {
            byte abyte0[] = null;
            if (a != null)
            {
                abyte0 = a.encode();
            }
            byte abyte1[] = abyte0;
            if (abyte0 == null)
            {
                abyte1 = new byte[0];
            }
            return abyte1;
        }

        public final byte[] d()
        {
            if (a == null)
            {
                return null;
            } else
            {
                return a.getInviteCode();
            }
        }

        b(GroupKikCode groupkikcode)
        {
            a = groupkikcode;
        }
    }

    private static final class c extends kik.android.scan.a.c
    {

        final String a;
        final short b;
        final byte c[];
        final byte d[];

        public final byte[] a()
        {
            return c;
        }

        public final String b()
        {
            return a;
        }

        public final int c()
        {
            return b;
        }

        public final byte[] d()
        {
            return d;
        }

        c(byte abyte0[], byte abyte1[], String s, short word0)
        {
            b = word0;
            a = s;
            d = abyte1;
            c = abyte0;
        }
    }

    private static final class d extends kik.android.scan.a.c
    {

        UsernameKikCode a;

        public final byte[] a()
        {
            byte abyte0[] = null;
            if (a != null)
            {
                abyte0 = a.encode();
            }
            byte abyte1[] = abyte0;
            if (abyte0 == null)
            {
                abyte1 = new byte[0];
            }
            return abyte1;
        }

        public final int c()
        {
            if (a == null)
            {
                return 0;
            } else
            {
                return a.getNonce();
            }
        }

        d(UsernameKikCode usernamekikcode)
        {
            a = usernamekikcode;
        }
    }


    public kik.android.scan.a.c()
    {
    }

    public static kik.android.scan.a.c a(GroupKikCode groupkikcode)
    {
        return new b(groupkikcode);
    }

    public static kik.android.scan.a.c a(UsernameKikCode usernamekikcode)
    {
        return new d(usernamekikcode);
    }

    public static kik.android.scan.a.c a(kik.android.scan.a.a a1)
    {
        return new a(a1);
    }

    public static kik.android.scan.a.c a(byte abyte0[], byte abyte1[], String s, short word0)
    {
        return new c(abyte0, abyte1, s, word0);
    }

    public abstract byte[] a();

    public String b()
    {
        return null;
    }

    public int c()
    {
        return 0;
    }

    public byte[] d()
    {
        return null;
    }
}
