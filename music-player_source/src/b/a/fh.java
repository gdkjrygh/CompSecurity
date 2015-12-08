// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.b.a.l;

// Referenced classes of package b.a:
//            fi, ff, ez, fs

public final class fh
{

    private final byte a[] = {
        0, 0, 0, 0, 0, 0, 0, 0
    };
    private final int b = 1;
    private final int c = 0;
    private String d;
    private String e;
    private byte f[];
    private byte g[];
    private byte h[];
    private int i;
    private int j;
    private int k;
    private byte l[];
    private byte m[];
    private boolean n;

    private fh(byte abyte0[], String s, byte abyte1[])
    {
        d = "1.0";
        e = null;
        f = null;
        g = null;
        h = null;
        i = 0;
        j = 0;
        k = 0;
        l = null;
        m = null;
        n = false;
        if (abyte0 == null || abyte0.length == 0)
        {
            throw new Exception("entity is null or empty");
        } else
        {
            e = s;
            k = abyte0.length;
            l = fi.a(abyte0);
            j = (int)(System.currentTimeMillis() / 1000L);
            m = abyte1;
            return;
        }
    }

    public static fh a(Context context, String s, byte abyte0[])
    {
        try
        {
            String s1 = ff.k(context);
            String s2 = ff.c(context);
            context = context.getSharedPreferences("umeng_general_config", 0);
            String s3 = context.getString("signature", null);
            int i1 = context.getInt("serial", 1);
            s = new fh(abyte0, s, (new StringBuilder()).append(s2).append(s1).toString().getBytes());
            s.a(s3);
            s.i = i1;
            s.b();
            context.edit().putInt("serial", i1 + 1).putString("signature", com.b.a.l.a(((fh) (s)).f)).commit();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        return s;
    }

    private void a(String s)
    {
        f = com.b.a.l.a(s);
    }

    private byte[] a(byte abyte0[], int i1)
    {
        boolean flag = false;
        byte abyte1[] = com.b.a.l.b(m);
        byte abyte2[] = com.b.a.l.b(l);
        int l1 = abyte1.length;
        byte abyte3[] = new byte[l1 * 2];
        for (int j1 = 0; j1 < l1; j1++)
        {
            abyte3[j1 * 2] = abyte2[j1];
            abyte3[j1 * 2 + 1] = abyte1[j1];
        }

        for (int k1 = 0; k1 < 2; k1++)
        {
            abyte3[k1] = abyte0[k1];
            abyte3[abyte3.length - k1 - 1] = abyte0[abyte0.length - k1 - 1];
        }

        byte byte0 = (byte)(i1 & 0xff);
        byte byte1 = (byte)(i1 >> 8 & 0xff);
        byte byte2 = (byte)(i1 >> 16 & 0xff);
        byte byte3 = (byte)(i1 >>> 24);
        for (i1 = ((flag) ? 1 : 0); i1 < abyte3.length; i1++)
        {
            abyte3[i1] = (byte)(abyte3[i1] ^ (new byte[] {
                byte0, byte1, byte2, byte3
            })[i1 % 4]);
        }

        return abyte3;
    }

    public static fh b(Context context, String s, byte abyte0[])
    {
        try
        {
            String s1 = ff.k(context);
            String s2 = ff.c(context);
            context = context.getSharedPreferences("umeng_general_config", 0);
            String s3 = context.getString("signature", null);
            int i1 = context.getInt("serial", 1);
            s = new fh(abyte0, s, (new StringBuilder()).append(s2).append(s1).toString().getBytes());
            s.n = true;
            s.a(s3);
            s.i = i1;
            s.b();
            context.edit().putInt("serial", i1 + 1).putString("signature", com.b.a.l.a(((fh) (s)).f)).commit();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        return s;
    }

    private void b()
    {
        if (f == null)
        {
            f = a(a, (int)(System.currentTimeMillis() / 1000L));
        }
        if (n)
        {
            byte abyte0[] = new byte[16];
            StringBuilder stringbuilder;
            try
            {
                System.arraycopy(f, 1, abyte0, 0, 16);
                l = com.b.a.l.a(l, abyte0);
            }
            catch (Exception exception) { }
        }
        g = a(f, j);
        stringbuilder = new StringBuilder();
        stringbuilder.append(com.b.a.l.a(f));
        stringbuilder.append(i);
        stringbuilder.append(j);
        stringbuilder.append(k);
        stringbuilder.append(com.b.a.l.a(g));
        h = com.b.a.l.b(stringbuilder.toString().getBytes());
    }

    public final byte[] a()
    {
        ez ez1 = new ez();
        ez1.a(d);
        ez1.b(e);
        ez1.c(com.b.a.l.a(f));
        ez1.a(i);
        ez1.b(j);
        ez1.c(k);
        ez1.a(l);
        byte abyte0[];
        int i1;
        if (n)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        ez1.d(i1);
        ez1.d(com.b.a.l.a(g));
        ez1.e(com.b.a.l.a(h));
        try
        {
            abyte0 = (new fs()).a(ez1);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
        return abyte0;
    }

    public final String toString()
    {
        int i1 = 1;
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(String.format("version : %s\n", new Object[] {
            d
        }));
        stringbuilder.append(String.format("address : %s\n", new Object[] {
            e
        }));
        stringbuilder.append(String.format("signature : %s\n", new Object[] {
            com.b.a.l.a(f)
        }));
        stringbuilder.append(String.format("serial : %s\n", new Object[] {
            Integer.valueOf(i)
        }));
        stringbuilder.append(String.format("timestamp : %d\n", new Object[] {
            Integer.valueOf(j)
        }));
        stringbuilder.append(String.format("length : %d\n", new Object[] {
            Integer.valueOf(k)
        }));
        stringbuilder.append(String.format("guid : %s\n", new Object[] {
            com.b.a.l.a(g)
        }));
        stringbuilder.append(String.format("checksum : %s ", new Object[] {
            com.b.a.l.a(h)
        }));
        if (!n)
        {
            i1 = 0;
        }
        stringbuilder.append(String.format("codex : %d", new Object[] {
            Integer.valueOf(i1)
        }));
        return stringbuilder.toString();
    }
}
