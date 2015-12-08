// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.cameradecor;

import BT;
import Gt;
import Os;
import android.support.v4.app.FragmentActivity;
import android.view.MotionEvent;
import re;

public abstract class CameraDecor
{
    public static interface CameraDecorInterface
    {

        public abstract void A();

        public abstract void D();

        public abstract FragmentActivity H_();

        public abstract void a(double d1, int i1, int j1, int k1, int l1);

        public abstract void a(float f1);

        public abstract void a(int i1, int j1);

        public abstract void a(int i1, int j1, boolean flag);

        public abstract void a(int i1, boolean flag);

        public abstract void a(BT bt, int i1);

        public abstract void a(TakeSnapButtonAction takesnapbuttonaction);

        public abstract void a(com.snapchat.android.camera.model.CameraModel.CameraType cameratype);

        public abstract void b(int i1, int j1);

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

    public static final class CameraDecorInterface.TakeSnapButtonAction extends Enum
    {

        private static final CameraDecorInterface.TakeSnapButtonAction $VALUES[];
        public static final CameraDecorInterface.TakeSnapButtonAction FINGER_DOWN;
        public static final CameraDecorInterface.TakeSnapButtonAction FINGER_UP;
        public static final CameraDecorInterface.TakeSnapButtonAction START_PASSING_TOUCH_EVENTS_TO_LENSES_VIEW;

        public static CameraDecorInterface.TakeSnapButtonAction valueOf(String s)
        {
            return (CameraDecorInterface.TakeSnapButtonAction)Enum.valueOf(com/snapchat/android/camera/cameradecor/CameraDecor$CameraDecorInterface$TakeSnapButtonAction, s);
        }

        public static CameraDecorInterface.TakeSnapButtonAction[] values()
        {
            return (CameraDecorInterface.TakeSnapButtonAction[])$VALUES.clone();
        }

        static 
        {
            FINGER_DOWN = new CameraDecorInterface.TakeSnapButtonAction("FINGER_DOWN", 0);
            FINGER_UP = new CameraDecorInterface.TakeSnapButtonAction("FINGER_UP", 1);
            START_PASSING_TOUCH_EVENTS_TO_LENSES_VIEW = new CameraDecorInterface.TakeSnapButtonAction("START_PASSING_TOUCH_EVENTS_TO_LENSES_VIEW", 2);
            $VALUES = (new CameraDecorInterface.TakeSnapButtonAction[] {
                FINGER_DOWN, FINGER_UP, START_PASSING_TOUCH_EVENTS_TO_LENSES_VIEW
            });
        }

        private CameraDecorInterface.TakeSnapButtonAction(String s, int i1)
        {
            super(s, i1);
        }
    }


    public final CameraDecorInterface a;

    public CameraDecor(CameraDecorInterface cameradecorinterface)
    {
        a = cameradecorinterface;
    }

    public void a()
    {
    }

    public void a(double d1)
    {
    }

    public void a(int i1)
    {
    }

    public void a(int i1, int j1)
    {
    }

    public void a(BT bt)
    {
    }

    public void a(Os os)
    {
    }

    public void a(boolean flag)
    {
    }

    public boolean a(MotionEvent motionevent)
    {
        return false;
    }

    public void b()
    {
    }

    public void b(int i1)
    {
    }

    public void b(int i1, int j1)
    {
    }

    public void b(BT bt)
    {
    }

    public void b(boolean flag)
    {
    }

    public void c()
    {
    }

    public void c(boolean flag)
    {
    }

    public boolean d()
    {
        return false;
    }

    public void e()
    {
    }

    public void f()
    {
    }

    public void g()
    {
    }

    public void h()
    {
    }

    public void i()
    {
    }

    public void j()
    {
    }

    public void k()
    {
    }

    public void l()
    {
    }

    public boolean m()
    {
        return false;
    }
}
