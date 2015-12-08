// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import android.view.View;
import com.cmcm.adsdk.a;
import com.cmcm.adsdk.b.c.b;
import com.facebook.ads.NativeAd;
import com.picksinit.PicksMob;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            d, l

public final class k extends d
{

    private NativeAd c;
    private final int d = 3000;
    private final String e = "com.facebook.ad";
    private String f;
    private String g;
    private long h;

    public k(String s, String s1, NativeAd nativead)
    {
        c = nativead;
        f = s;
        g = s1;
        h = System.currentTimeMillis();
    }

    public final void a(View view)
    {
        if (view == null)
        {
            return;
        }
        c.setImpressionListener(new l(this));
        try
        {
            c.registerViewForInteraction(view);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            view.printStackTrace();
        }
    }

    public final String c()
    {
        return "fb";
    }

    public final String d()
    {
        if (c != null)
        {
            return c.getAdTitle();
        } else
        {
            return null;
        }
    }

    public final String e()
    {
        if (c != null)
        {
            return c.getAdCoverImage().getUrl();
        } else
        {
            return null;
        }
    }

    public final String f()
    {
        if (c != null)
        {
            return c.getAdIcon().getUrl();
        } else
        {
            return null;
        }
    }

    public final String g()
    {
        if (c != null)
        {
            return c.getAdCallToAction();
        } else
        {
            return null;
        }
    }

    public final String h()
    {
        if (c != null)
        {
            return c.getAdBody();
        } else
        {
            return null;
        }
    }

    public final boolean i()
    {
        long l1 = com.cmcm.adsdk.a.g();
        if (l1 != 0L) goto _L2; else goto _L1
_L1:
        if (System.currentTimeMillis() - h < 0x36ee80L) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (System.currentTimeMillis() - h < l1)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public final boolean j()
    {
        return true;
    }

    public final void k()
    {
        b.a("CMFBNativeAd", (new StringBuilder("FaceBook handleImpressionAdtitle:")).append(d()).toString());
        String s = com.cmcm.adsdk.c.b.a(1, c);
        b.a("CMFBNativeAd", (new StringBuilder("raw :")).append(s).toString());
        if (!a)
        {
            PicksMob.getInstance().doFaceBookViewReport(g, s, "com.facebook.ad", f, 3000);
            a = true;
        }
    }
}
