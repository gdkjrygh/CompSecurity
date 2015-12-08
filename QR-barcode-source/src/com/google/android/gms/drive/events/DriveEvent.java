// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.events:
//            c

public interface DriveEvent
    extends SafeParcelable
{
    public static interface Listener
        extends c
    {

        public abstract void onEvent(DriveEvent driveevent);
    }


    public abstract int getType();
}
