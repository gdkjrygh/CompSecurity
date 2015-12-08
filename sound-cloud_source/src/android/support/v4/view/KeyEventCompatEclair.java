// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.KeyEvent;
import android.view.View;

class KeyEventCompatEclair
{

    KeyEventCompatEclair()
    {
    }

    public static boolean dispatch(KeyEvent keyevent, android.view.KeyEvent.Callback callback, Object obj, Object obj1)
    {
        return keyevent.dispatch(callback, (android.view.KeyEvent.DispatcherState)obj, obj1);
    }

    public static Object getKeyDispatcherState(View view)
    {
        return view.getKeyDispatcherState();
    }

    public static boolean isTracking(KeyEvent keyevent)
    {
        return keyevent.isTracking();
    }

    public static void startTracking(KeyEvent keyevent)
    {
        keyevent.startTracking();
    }
}
