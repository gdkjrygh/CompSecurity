// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import java.util.Comparator;

// Referenced classes of package me.lyft.android.utils:
//            CameraExtensions

final class 
    implements Comparator
{

    public int compare(android.hardware.ns._cls1 _pcls1, android.hardware.ns._cls1 _pcls1_1)
    {
        return _pcls1._fld1 - _pcls1_1._fld1;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((android.hardware.ns._cls1.compare)obj, (android.hardware.ns._cls1.compare)obj1);
    }

    ()
    {
    }
}
