// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.transition.Transition;

public final class bq extends android.transition.Transition.EpicenterCallback
{

    private Rect a;

    public bq(Rect rect)
    {
        a = rect;
        super();
    }

    public final Rect onGetEpicenter(Transition transition)
    {
        return a;
    }
}
