// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.impl.capture;

import java.util.Comparator;

// Referenced classes of package com.skype.android.impl.capture:
//            CameraImpl

final class a
    implements Comparator
{

    final CameraImpl a;

    public final int compare(Object obj, Object obj1)
    {
        obj = (android.hardware..CameraImpl._cls1)obj;
        obj1 = (android.hardware.)obj1;
        return Integer.signum(((android.hardware.) (obj)).idth * ((android.hardware.idth) (obj)).eight - ((android.hardware.eight) (obj1)).idth * ((android.hardware.idth) (obj1)).eight);
    }

    (CameraImpl cameraimpl)
    {
        a = cameraimpl;
        super();
    }
}
