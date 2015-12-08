// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.Uri;

public class clo
    implements nou
{

    private static final String a = clo.getSimpleName();
    private static final bim b;
    private final bnl c;
    private final clr d = new clr(this);
    private final Context e;
    private final nff f;
    private final nnr g;
    private final cwn h;
    private boolean i;
    private cls j;
    private cwr k;
    private biw l;
    private bju m;

    public clo(Context context)
    {
        e = context;
        c = (bnl)olm.a(context, bnl);
        nfj nfj = ((cit)olm.a(context, cit)).a("LocalBackgroundAnalysisLog");
        f = nfe.a(false, a, nfj);
        g = (nnr)olm.a(context, nnr);
        h = (cwn)olm.a(context, cwn);
    }

    static nff a(clo clo1)
    {
        return clo1.f;
    }

    private void a(long l1)
    {
        if (f != null)
        {
            f.a((new StringBuilder(38)).append("Rescheduling in ").append(l1).append("ms").toString());
        }
        cwx.a(e, l1, false);
    }

    private boolean a(boolean flag, String s)
    {
        if (flag && f != null)
        {
            f.a(s);
        }
        return flag;
    }

    static bju b(clo clo1)
    {
        return clo1.m;
    }

    private void b()
    {
        if (f != null)
        {
            f.a("stopping");
        }
    }

    public final void a(boolean flag)
    {
    }

    public final void a(boolean flag, nlr nlr)
    {
        if (!i)
        {
            throw new IllegalStateException("Called cleanup() while synchronizer was not prepared.");
        } else
        {
            i = false;
            l.a();
            k.b();
            return;
        }
    }

    public final boolean a(int i1, boolean flag)
    {
        if (i)
        {
            throw new IllegalStateException("Called prepare() while synchronizer was already prepared.");
        }
        if (i1 == -1)
        {
            return false;
        } else
        {
            j = new cls(this, i1);
            k = bin.a(e);
            k.a();
            m = (bju)olm.a(e, bju);
            bjq bjq1 = (bjq)olm.a(e, bjq);
            bju bju1 = m;
            cwr cwr1 = k;
            l = new biw(bjq1.b.b(), bjq1.b.b(), new bjh(bjq1.a, bju1, bjq.a(cwr1), bjq1.f, bjq1.c));
            i = true;
            return true;
        }
    }

    public final boolean a(Context context, Cursor cursor, Uri uri)
    {
        boolean flag;
        boolean flag1 = true;
        if (!i)
        {
            throw new IllegalStateException("Called processMedia() while synchronizer was not prepared.");
        }
        cursor = ContentUris.withAppendedId(uri, cursor.getLong(0));
        int i1;
        if (!lvd.a(c.a, "moviemaker:plugged_in_analysis_enabled", true))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (a(flag, "analysis not enabled: abort now"))
        {
            i1 = clq.a;
        } else
        if (a(h.a(), "power disconnected: abort now"))
        {
            i1 = clq.c;
        } else
        if (a(h.c(), "battery too low: abort now"))
        {
            i1 = clq.b;
        } else
        if (a(h.b(), "screen on: abort now"))
        {
            i1 = clq.d;
        } else
        if (oql.c(oql.b(context.getContentResolver(), cursor)))
        {
            if (f != null)
            {
                context = f;
                uri = String.valueOf(cursor);
                context.a((new StringBuilder(String.valueOf(uri).length() + 16)).append("start analysis: ").append(uri).toString());
            }
            g.a(cursor);
            l.a(cursor, b, d);
            if (d.b)
            {
                i1 = clq.e;
            } else
            {
                g.a(cursor, d.a);
                if (d.a)
                {
                    i1 = clq.h;
                } else
                {
                    i1 = clq.f;
                }
            }
        } else
        {
            f.a("not video: abort now");
            i1 = clq.g;
        }
        clp.a[i1 - 1];
        JVM INSTR tableswitch 1 7: default 116
    //                   1 402
    //                   2 409
    //                   3 432
    //                   4 439
    //                   5 462
    //                   6 462
    //                   7 462;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L6 _L6
_L1:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_462;
_L7:
        if (i1 == clq.h)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        g.a(flag);
        return flag;
_L2:
        b();
          goto _L7
_L3:
        a(lvd.a(c.a, "moviemaker:plugged_in_analysis_delay_between_battery_level_checks_ms", 0x1b7740L));
          goto _L7
_L4:
        b();
          goto _L7
_L5:
        a(lvd.a(c.a, "moviemaker:plugged_in_analysis_delay_between_screen_off_checks_ms", 0x927c0L));
          goto _L7
        a(lvd.a(c.a, "moviemaker:plugged_in_analysis_delay_between_analyses_ms", 0x927c0L));
          goto _L7
    }

    public final SQLiteTransactionListener f_()
    {
        if (!i)
        {
            throw new IllegalStateException("Called getListener while synchronizer was not prepared");
        } else
        {
            return j;
        }
    }

    static 
    {
        b = new bim(bil.a, bih.b);
    }
}
