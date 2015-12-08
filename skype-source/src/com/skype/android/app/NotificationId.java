// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app;


public class NotificationId
{

    private static final int NOTIFICATION_MASK_START = 0x10000000;
    private static int next = 0;

    private NotificationId()
    {
    }

    public static int newId()
    {
        com/skype/android/app/NotificationId;
        JVM INSTR monitorenter ;
        int i;
        i = next + 0x10000000;
        next = i;
        com/skype/android/app/NotificationId;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

}
