// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;


// Referenced classes of package com.google.android.gms.common.api:
//            ResultCallback, Status

public interface PendingResult
{
    public static interface BatchCallback
    {

        public abstract void zzs(Status status);
    }


    public abstract void setResultCallback(ResultCallback resultcallback);
}
