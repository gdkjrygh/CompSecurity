// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v7.internal.widget:
//            b, ActionBarContainer

final class c extends b
{

    public c(ActionBarContainer actionbarcontainer)
    {
        super(actionbarcontainer);
    }

    public final void getOutline(Outline outline)
    {
        if (a.d)
        {
            if (a.c != null)
            {
                a.c.getOutline(outline);
            }
        } else
        if (a.a != null)
        {
            a.a.getOutline(outline);
            return;
        }
    }
}
