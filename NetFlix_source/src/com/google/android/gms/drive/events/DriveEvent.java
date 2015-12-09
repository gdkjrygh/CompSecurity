// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;

public interface DriveEvent
    extends SafeParcelable
{
    public static interface Listener
    {

        public abstract void onEvent(DriveEvent driveevent);
    }


    public static final int TYPE_CHANGE = 1;

    public abstract DriveId getDriveId();

    public abstract int getType();
}
