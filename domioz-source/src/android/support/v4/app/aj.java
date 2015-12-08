// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;

final class aj extends android.transition.Transition.EpicenterCallback
{

    final Rect a;

    aj(Rect rect)
    {
        a = rect;
        super();
    }

    public final Rect onGetEpicenter(Transition transition)
    {
        return a;
    }
}
