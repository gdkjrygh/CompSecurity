// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.util.k;
import com.facebook.ads.internal.util.s;
import com.facebook.ads.internal.view.e;
import com.facebook.ads.internal.view.video.a;

// Referenced classes of package com.facebook.ads:
//            NativeAd

public class MediaView extends RelativeLayout
{

    private final e a;
    private final a b;
    private boolean c;
    private boolean d;

    public MediaView(Context context)
    {
        this(context, null);
    }

    public MediaView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = false;
        d = true;
        a = new e(context);
        a.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        addView(a);
        b = new a(context);
        context = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        context.addRule(13);
        b.setLayoutParams(context);
        b.setAutoplay(d);
        addView(b);
    }

    private boolean a(NativeAd nativead)
    {
        return !s.a(nativead.a());
    }

    public boolean isAutoplay()
    {
        return d;
    }

    public void setAutoplay(boolean flag)
    {
        d = flag;
        b.setAutoplay(flag);
    }

    public void setNativeAd(NativeAd nativead)
    {
        nativead.b(true);
        nativead.setMediaViewAutoplay(d);
        if (c)
        {
            a.a(null, null);
            b.b();
            c = false;
        }
        if (nativead == null || !a(nativead))
        {
            break MISSING_BLOCK_LABEL_122;
        }
        a.setVisibility(4);
        b.setVisibility(0);
        bringChildToFront(b);
        c = true;
        b.setVideoPlayReportURI(nativead.b());
        b.setVideoTimeReportURI(nativead.c());
        b.setVideoURI(nativead.a());
_L1:
        return;
        nativead;
        nativead.printStackTrace();
        return;
        if (nativead != null && nativead.getAdCoverImage() != null)
        {
            b.a();
            b.setVisibility(4);
            a.setVisibility(0);
            bringChildToFront(a);
            c = true;
            (new k(a)).execute(new String[] {
                nativead.getAdCoverImage().getUrl()
            });
            return;
        }
          goto _L1
    }
}
