// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget;


// Referenced classes of package com.skype.android.widget:
//            GestureTracker

public static abstract class <init> extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/skype/android/widget/GestureTracker$PassThroughStrategy, s);
    }

    public static <init>[] values()
    {
        return (<init>[])e.clone();
    }

    abstract boolean a(GestureTracker gesturetracker);

    static 
    {
        a = new GestureTracker.PassThroughStrategy("PASS_ALL") {

            final boolean a(GestureTracker gesturetracker)
            {
                return true;
            }

        };
        b = new GestureTracker.PassThroughStrategy("PASS_SINGLE_TAP") {

            final boolean a(GestureTracker gesturetracker)
            {
                return gesturetracker.a;
            }

        };
        c = new GestureTracker.PassThroughStrategy("PASS_UNCONSUMED") {

            final boolean a(GestureTracker gesturetracker)
            {
                return !gesturetracker.b;
            }

        };
        d = new GestureTracker.PassThroughStrategy("PASS_NONE") {

            final boolean a(GestureTracker gesturetracker)
            {
                return false;
            }

        };
        e = (new e[] {
            a, b, c, d
        });
    }

    private _cls4(String s, int i)
    {
        super(s, i);
    }

    _cls4(String s, int i, byte byte0)
    {
        this(s, i);
    }
}
