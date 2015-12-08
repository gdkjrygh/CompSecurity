// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.restrictions;


// Referenced classes of package com.fitbit.serverinteraction.restrictions:
//            RestrictionsController

static class esenceListener.OfflineReason
{

    static final int a[];

    static 
    {
        a = new int[esenceListener.OfflineReason.values().length];
        try
        {
            a[esenceListener.OfflineReason.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[esenceListener.OfflineReason.e.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[esenceListener.OfflineReason.d.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
