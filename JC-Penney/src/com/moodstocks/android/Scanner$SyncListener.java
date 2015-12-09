// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.moodstocks.android;


// Referenced classes of package com.moodstocks.android:
//            MoodstocksError

public interface 
{

    public abstract void onSyncComplete();

    public abstract void onSyncFailed(MoodstocksError moodstockserror);

    public abstract void onSyncProgress(int i, int j);

    public abstract void onSyncStart();
}
