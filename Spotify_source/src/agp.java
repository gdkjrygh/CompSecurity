// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class agp
{

    private static final ahn a = ahn.a("CarSdkRemoteInterface");

    public static int[] a(String s)
    {
        int ai[] = new int[4];
        int[] _tmp = ai;
        ai[0] = -1;
        ai[1] = -1;
        ai[2] = -1;
        ai[3] = -1;
        if (s != null)
        {
            int k = s.lastIndexOf('/') + 1;
            String s1 = s.substring(k);
            int j = s1.indexOf('$');
            int i = j;
            if (j == -1)
            {
                i = s1.indexOf(':');
            }
            ai[3] = i + (s.length() - s1.length());
            i = s1.lastIndexOf(':');
            if (i != -1)
            {
                ai[1] = Integer.parseInt(s1.substring(i + 1));
            }
            j = s1.indexOf(':');
            if (j != -1)
            {
                if (i != j)
                {
                    ai[0] = Integer.parseInt(s1.substring(j + 1, i));
                } else
                {
                    ai[0] = Integer.parseInt(s1.substring(j + 1));
                }
                if (k == 0)
                {
                    ai[2] = i;
                } else
                {
                    ai[2] = s.length() - s1.length() - 1;
                }
            }
            a.b("parseIdent(%s) -> %d, %d, %d, %d", new Object[] {
                s, Integer.valueOf(ai[0]), Integer.valueOf(ai[1]), Integer.valueOf(ai[2]), Integer.valueOf(ai[3])
            });
        }
        return ai;
    }

}
