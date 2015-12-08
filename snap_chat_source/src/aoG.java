// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;

public abstract class aoG
    implements aoE
{

    private final aoB a;

    public aoG(aoB aob)
    {
        a = aob;
    }

    public final float a(MotionEvent motionevent)
    {
        float f = motionevent.getY();
        if (f <= a.a())
        {
            return 0.0F;
        }
        if (f >= a.b())
        {
            return 1.0F;
        } else
        {
            return f / a.b();
        }
    }
}
