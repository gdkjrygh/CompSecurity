// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.transition.Transition;

public final class bs extends android.transition.Transition.EpicenterCallback
{

    private Rect a;
    private bu b;

    public bs(bu bu1)
    {
        b = bu1;
        super();
    }

    public final Rect onGetEpicenter(Transition transition)
    {
        if (a == null && b.a != null)
        {
            a = b.a(b.a);
        }
        return a;
    }
}
