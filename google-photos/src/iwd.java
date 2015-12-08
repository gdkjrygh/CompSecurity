// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.view.View;
import com.google.android.apps.photos.touchcapture.TouchCaptureView;

public final class iwd
    implements iwc
{

    private final Activity a;
    private final am b;
    private final int c;

    public iwd(am am1, int i)
    {
        a = null;
        b = am1;
        c = i;
    }

    public iwd(Activity activity, int i)
    {
        a = activity;
        b = null;
        c = i;
    }

    public final TouchCaptureView a()
    {
        View view;
        if (b != null)
        {
            view = b.R;
        } else
        {
            view = null;
        }
        if (view == null && a == null)
        {
            return null;
        }
        if (view != null)
        {
            view = view.findViewById(c);
        } else
        {
            view = a.findViewById(c);
        }
        return (TouchCaptureView)view;
    }

    public final iwd a(olm olm1)
    {
        olm1.a(iwc, this);
        return this;
    }
}
