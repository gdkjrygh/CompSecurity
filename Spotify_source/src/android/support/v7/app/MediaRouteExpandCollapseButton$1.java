// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.graphics.drawable.AnimationDrawable;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            MediaRouteExpandCollapseButton

final class a
    implements android.view.eButton._cls1
{

    private MediaRouteExpandCollapseButton a;

    public final void onClick(View view)
    {
        MediaRouteExpandCollapseButton mediarouteexpandcollapsebutton = a;
        boolean flag;
        if (!MediaRouteExpandCollapseButton.a(a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        MediaRouteExpandCollapseButton.a(mediarouteexpandcollapsebutton, flag);
        if (MediaRouteExpandCollapseButton.a(a))
        {
            a.setImageDrawable(MediaRouteExpandCollapseButton.b(a));
            MediaRouteExpandCollapseButton.b(a).start();
            a.setContentDescription(MediaRouteExpandCollapseButton.c(a));
        } else
        {
            a.setImageDrawable(MediaRouteExpandCollapseButton.d(a));
            MediaRouteExpandCollapseButton.d(a).start();
            a.setContentDescription(MediaRouteExpandCollapseButton.e(a));
        }
        if (MediaRouteExpandCollapseButton.f(a) != null)
        {
            MediaRouteExpandCollapseButton.f(a).a(view);
        }
    }

    (MediaRouteExpandCollapseButton mediarouteexpandcollapsebutton)
    {
        a = mediarouteexpandcollapsebutton;
        super();
    }
}
