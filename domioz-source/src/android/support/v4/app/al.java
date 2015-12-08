// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;

// Referenced classes of package android.support.v4.app:
//            an, ai

final class al extends android.transition.Transition.EpicenterCallback
{

    final an a;
    private Rect b;

    al(an an1)
    {
        a = an1;
        super();
    }

    public final Rect onGetEpicenter(Transition transition)
    {
        if (b == null && a.a != null)
        {
            b = ai.a(a.a);
        }
        return b;
    }
}
