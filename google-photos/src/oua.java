// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.libraries.video.preview.VideoWithPreviewView;

public final class oua extends jig
{

    private final VideoWithPreviewView a;
    private final ovn b;
    private final ovr d;
    private final long e;
    private long f;
    private boolean g;

    public oua(Context context, VideoWithPreviewView videowithpreviewview, ovn ovn1)
    {
        a = (VideoWithPreviewView)p.a(videowithpreviewview);
        b = (ovn)p.a(ovn1);
        d = (ovr)p.a(ovn1.e());
        context = context.getResources();
        int i = context.getDisplayMetrics().widthPixels;
        float f1 = context.getDimension(b.Iy);
        long l = ovn1.d().f;
        e = (long)((f1 / (float)i) * (float)l);
    }

    protected final jjh a(int i)
    {
        return jjh.a(-1, "application/octet-stream", -1, -2L);
    }

    protected final void a(int i, long l, boolean flag)
    {
        f = l;
    }

    protected final void a(long l, long l1)
    {
        f = l;
    }

    protected final boolean a(long l)
    {
        g = true;
        return true;
    }

    protected final int aB_()
    {
        return 1;
    }

    protected final void b(long l)
    {
        boolean flag = true;
        if (Math.abs(l - f) >= 1000L) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ovg ovg2 = d.a(l, true);
        ovg ovg1 = ovg2;
        if (ovg2 == null)
        {
            ovg1 = d.a(l);
        }
        if (ovg1 != null)
        {
            VideoWithPreviewView videowithpreviewview;
            if (b.d().a(l) != ovg1.a)
            {
                flag = false;
            }
            videowithpreviewview = a;
            ovg1.d();
            videowithpreviewview.post(new ouc(videowithpreviewview, ovg1, flag));
            ovg1.e();
        }
        if (!g)
        {
            break; /* Loop/switch isn't completed */
        }
        g = false;
        if (l == 0L) goto _L1; else goto _L3
_L3:
        b.a(l - e / 2L, e / 2L + l);
        return;
    }

    protected final boolean c()
    {
        return true;
    }

    protected final boolean d()
    {
        return true;
    }

    protected final void e()
    {
    }

    protected final long f()
    {
        return -2L;
    }

    protected final long g()
    {
        return -3L;
    }
}
