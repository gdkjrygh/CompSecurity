// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

public final class blq extends bmb
{

    private static final String e = blq.getSimpleName();
    final bsm a;
    public final bto b = new blu(this, this, bly);
    private final bsr f = new blr(this, "saveOfflineStoryboard");
    private final bsr g = new bls(this, "saveCloudStoryboard");
    private final bsr h = new blt(this, "photosSync");
    private final Context i;
    private final noj j;
    private final can k;
    private final cap l;
    private final cah m;
    private final blw n;
    private final bxp o;
    private final mmr p;
    private final blz q = new blx(this);

    public blq(bmb bmb1, Bundle bundle, Context context, noj noj1, cag cag, can can1, cap cap1, 
            cah cah1, blw blw1)
    {
        super(bmb1);
        i = (Context)b.a(context, "context", null);
        j = (noj)b.a(noj1, "provider", null);
        k = (can)b.a(can1, "saveCloudStoryboardTaskFactory", null);
        l = (cap)b.a(cap1, "saveOfflineStoryboardTaskFactory", null);
        m = (cah)b.a(cah1, "connectivityChecker", null);
        n = (blw)b.a(blw1, "display", null);
        o = (bxp)olm.a(context, bxp);
        p = (mmr)olm.a(context, mmr);
        a = (new bsp()).a(f).a(g).a(h).a(this, e, bundle, cag).a(new blv(this));
    }

    static cap a(blq blq1)
    {
        return blq1.l;
    }

    private static pkl a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new dey("No response bytes");
        }
        pkm pkm1;
        try
        {
            abyte0 = (pkl)qlw.a(new pkl(), abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new dey(abyte0);
        }
        pkm1 = ((pkl) (abyte0)).c;
        if (pkm1 == null)
        {
            throw new dey("No result");
        }
        if (((pkl) (abyte0)).b == null)
        {
            throw new dey("No filters");
        }
        if (((pkl) (abyte0)).b.a == null)
        {
            throw new dey("No photoRef");
        }
        if (((pkl) (abyte0)).a == null)
        {
            throw new dey("No versionId");
        }
        if (pkm1.a != 1 && pkm1.a != 2)
        {
            int i1 = pkm1.a;
            throw new dey((new StringBuilder(35)).append("Unkown mutation status: ").append(i1).toString());
        }
        if (pkm1.a == 1)
        {
            if (((pkl) (abyte0)).b.b == null)
            {
                throw new dey("Mutation applied. No renderParams");
            }
            if (((pkl) (abyte0)).b.b.b != 8)
            {
                int j1 = ((pkl) (abyte0)).b.b.b;
                throw new dey((new StringBuilder(45)).append("mutation applied but renderType = ").append(j1).toString());
            }
            if (((pkl) (abyte0)).b.b.c == null || ((pkl) (abyte0)).b.b.c.a == null)
            {
                throw new dey("mutation applied but missing storyboard");
            }
        }
        return abyte0;
    }

    static void a(blq blq1, pye pye1)
    {
        blq1 = pye1.b;
        int j1 = blq1.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            blq1[i1].d = null;
        }

    }

    static boolean a(blq blq1, mue mue1)
    {
        return blq1.a(mue1);
    }

    private boolean a(mue mue1)
    {
        if (mue1.c())
        {
            String s = e;
            String s1 = String.valueOf(mue1);
            Log.w(s, (new StringBuilder(String.valueOf(s1).length() + 32)).append("Failed to save cloud storyboard ").append(s1).toString(), mue1.c);
        } else
        {
            mue1 = mue1.a();
            byte abyte0[] = mue1.getByteArray("mutate_filters_response");
            mue1 = mue1.getByteArray("storyboard_token");
            b.a(mue1, "storyboardToken", null);
            Object obj;
            pns pns1;
            String s2;
            boolean flag;
            try
            {
                obj = a(abyte0);
            }
            // Misplaced declaration of an exception variable
            catch (mue mue1)
            {
                Log.w(e, "Invalid response", mue1);
                return false;
            }
            pns1 = ((pkl) (obj)).b.a;
            s2 = c.b.X;
            if (s2 != null && s2.equals(pns1.c))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                switch (((pkl) (obj)).c.a)
                {
                default:
                    throw new AssertionError();

                case 1: // '\001'
                    c.b.ad = null;
                    c.a(((pkl) (obj)).a, mue1);
                    c.w();
                    c.p(false);
                    o.b(c.b.X);
                    return true;

                case 2: // '\002'
                    mue1 = c.b.p;
                    break;
                }
                obj = ((pkl) (obj)).a;
                if (obj != null && !((String) (obj)).equals(mue1))
                {
                    c.c(((String) (obj)));
                    n.a();
                    return true;
                } else
                {
                    Log.w(e, "MutateFilters rejected for unknown reason.");
                    return false;
                }
            }
        }
        return false;
    }

    static cah b(blq blq1)
    {
        return blq1.m;
    }

    static String b()
    {
        return e;
    }

    static mmr c(blq blq1)
    {
        return blq1.p;
    }

    static can d(blq blq1)
    {
        return blq1.k;
    }

    static Context e(blq blq1)
    {
        return blq1.i;
    }

    static noj f(blq blq1)
    {
        return blq1.j;
    }

    static blz g(blq blq1)
    {
        return blq1.q;
    }

    static bsm h(blq blq1)
    {
        return blq1.a;
    }

}
