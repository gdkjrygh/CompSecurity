// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.enums.ReportCause;

// Referenced classes of package com.tinder.managers:
//            i

public static final class or
{

    public static final int a[];

    static 
    {
        a = new int[ReportCause.values().length];
        try
        {
            a[ReportCause.ABUSIVE_CONTENT.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            a[ReportCause.SPAM.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[ReportCause.INAPPROPRIATE_PHOTOS.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[ReportCause.OTHER.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[ReportCause.OFFLINE_BEHAVIOR.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
