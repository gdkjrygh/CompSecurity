// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MotionEvent;
import com.snapchat.android.ui.snapeditormotion.SwipeHandlerType;

public final class GS
    implements GP
{

    public GS()
    {
    }

    public final SwipeHandlerType a(Fo fo, GW gw, int i)
    {
        gw.a(i);
        return null;
    }

    public final SwipeHandlerType a(Fo fo, GW gw, int i, int j)
    {
        fo.a(false, gw.c);
        return null;
    }

    public final SwipeHandlerType a(Fo fo, GW gw, MotionEvent motionevent)
    {
        if (gw.f == 0 || gw.a())
        {
            fo.h();
            return SwipeHandlerType.NO_SWIPE_STARTED;
        } else
        {
            return null;
        }
    }
}
