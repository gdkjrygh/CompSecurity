// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;

public class bkp
{

    private final Context a;
    private final bld b;
    private final bmm c;
    private final buf d;
    private final bkq e;
    private bks f;

    public bkp(Context context, bld bld1, bmm bmm1, buf buf1, bkq bkq1)
    {
        a = (Context)b.a(context, "context", null);
        b = (bld)b.a(bld1, "appInfo", null);
        c = (bmm)b.a(bmm1, "deviceInfo", null);
        d = (buf)b.a(buf1, "stateTracker", null);
        e = (bkq)b.a(bkq1, "analysisPerformanceLogs", null);
    }

    public final void a(Uri uri, bim bim, cmb cmb1)
    {
        f = new bks(uri, bim, b, c);
        f.a = (bkt)b.a(bkt.a(a), "startCounters", null);
        uri = d;
        bim = f;
        ((buf) (uri)).b.a(bim);
    }

    public final void a(cmb cmb1)
    {
        f.b = (bkt)b.a(bkt.a(a), "endCounters", null);
        bks bks1 = f;
        bkv bkv1;
        if (cmb1 == null)
        {
            bkv1 = new bkv(-1, -1, -1L);
        } else
        {
            bkv1 = new bkv(-1, -1, cmb1.b);
        }
        bks1.c = (bkv)b.a(bkv1, "analyzedVideoInfo", null);
        if (cmb1 != null)
        {
            f.d = cmb1.e;
            f.e = cmb1.c;
        }
        if (e != null)
        {
            cmb1 = f;
            e.a(cmb1.toString());
        }
        f = null;
    }

    static 
    {
        bkp.getSimpleName();
    }
}
