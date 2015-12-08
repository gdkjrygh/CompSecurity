// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.v4.view:
//            dz, ec

class dy
{

    public static void a(View view)
    {
        view.animate().cancel();
    }

    public static void a(View view, float f)
    {
        view.animate().translationY(f);
    }

    public static void a(View view, ec ec)
    {
        if (ec != null)
        {
            view.animate().setListener(new dz(ec, view));
            return;
        } else
        {
            view.animate().setListener(null);
            return;
        }
    }
}
