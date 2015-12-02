// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.f.c;
import com.facebook.ads.internal.util.l;

// Referenced classes of package com.facebook.ads:
//            NativeAd

public class MediaView extends RelativeLayout
{

    private final c a;
    private boolean b;

    public MediaView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = false;
        a = new c(context);
        a.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        addView(a);
    }

    public void setNativeAd(NativeAd nativead)
    {
        if (b)
        {
            a.a(null, null);
            b = false;
        }
        if (nativead != null && nativead.e() != null)
        {
            b = true;
            (new l(a)).execute(new String[] {
                nativead.e().a()
            });
        }
    }
}
