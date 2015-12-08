// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.cameradecor;

import BT;
import Gt;
import android.support.v4.app.FragmentActivity;
import re;

// Referenced classes of package com.snapchat.android.camera.cameradecor:
//            CameraDecor

public static interface TakeSnapButtonAction
{
    public static final class TakeSnapButtonAction extends Enum
    {

        private static final TakeSnapButtonAction $VALUES[];
        public static final TakeSnapButtonAction FINGER_DOWN;
        public static final TakeSnapButtonAction FINGER_UP;
        public static final TakeSnapButtonAction START_PASSING_TOUCH_EVENTS_TO_LENSES_VIEW;

        public static TakeSnapButtonAction valueOf(String s1)
        {
            return (TakeSnapButtonAction)Enum.valueOf(com/snapchat/android/camera/cameradecor/CameraDecor$CameraDecorInterface$TakeSnapButtonAction, s1);
        }

        public static TakeSnapButtonAction[] values()
        {
            return (TakeSnapButtonAction[])$VALUES.clone();
        }

        static 
        {
            FINGER_DOWN = new TakeSnapButtonAction("FINGER_DOWN", 0);
            FINGER_UP = new TakeSnapButtonAction("FINGER_UP", 1);
            START_PASSING_TOUCH_EVENTS_TO_LENSES_VIEW = new TakeSnapButtonAction("START_PASSING_TOUCH_EVENTS_TO_LENSES_VIEW", 2);
            $VALUES = (new TakeSnapButtonAction[] {
                FINGER_DOWN, FINGER_UP, START_PASSING_TOUCH_EVENTS_TO_LENSES_VIEW
            });
        }

        private TakeSnapButtonAction(String s1, int i)
        {
            super(s1, i);
        }
    }


    public abstract void A();

    public abstract void D();

    public abstract FragmentActivity H_();

    public abstract void a(double d, int i, int j, int k, int i1);

    public abstract void a(float f);

    public abstract void a(int i, int j);

    public abstract void a(int i, int j, boolean flag);

    public abstract void a(int i, boolean flag);

    public abstract void a(BT bt, int i);

    public abstract void a(TakeSnapButtonAction takesnapbuttonaction);

    public abstract void a(com.snapchat.android.camera.model.rface rface);

    public abstract void b(int i, int j);

    public abstract void b(boolean flag);

    public abstract void c(boolean flag);

    public abstract boolean l();

    public abstract boolean m();

    public abstract boolean n();

    public abstract Gt n_();

    public abstract void p();

    public abstract boolean q();

    public abstract re s();

    public abstract BT t();

    public abstract int u();

    public abstract boolean v();

    public abstract boolean x();

    public abstract boolean y();

    public abstract boolean z();
}
