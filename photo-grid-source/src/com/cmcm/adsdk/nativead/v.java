// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.cmcm.adsdk.a;
import com.mopub.nativeads.NativeResponse;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            d

public final class v extends d
    implements android.view.View.OnClickListener, android.view.View.OnTouchListener
{

    private final long c = 0x36ee80L;
    private NativeResponse d;
    private View e;
    private long f;

    public v(NativeResponse nativeresponse)
    {
        d = nativeresponse;
        f = System.currentTimeMillis();
    }

    public final void a(View view)
    {
        e = view;
        d.recordImpression(view);
        view = e;
        if (view != null)
        {
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
            if (view instanceof ViewGroup)
            {
                view = (ViewGroup)view;
                for (int k = 0; k < view.getChildCount(); k++)
                {
                    View view1 = view.getChildAt(k);
                    view1.setOnClickListener(this);
                    view1.setOnTouchListener(this);
                }

            }
        }
    }

    public final String c()
    {
        return "mp";
    }

    public final String d()
    {
        if (d != null)
        {
            return d.getTitle();
        } else
        {
            return null;
        }
    }

    public final String e()
    {
        if (d != null)
        {
            return d.getMainImageUrl();
        } else
        {
            return null;
        }
    }

    public final String f()
    {
        if (d != null)
        {
            return d.getIconImageUrl();
        } else
        {
            return null;
        }
    }

    public final String g()
    {
        if (d != null)
        {
            return d.getCallToAction();
        } else
        {
            return null;
        }
    }

    public final String h()
    {
        if (d != null)
        {
            return d.getText();
        } else
        {
            return "";
        }
    }

    public final boolean i()
    {
        long l = com.cmcm.adsdk.a.h();
        if (l != 0L) goto _L2; else goto _L1
_L1:
        if (System.currentTimeMillis() - f < 0x36ee80L) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (System.currentTimeMillis() - f < l)
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

    public final void onClick(View view)
    {
        d.handleClick(view);
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        return false;
    }
}
