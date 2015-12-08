// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.rx.observers;


// Referenced classes of package com.soundcloud.android.rx.observers:
//            DefaultSubscriber

public class SuccessSubscriber extends DefaultSubscriber
{

    private boolean isSuccess;

    public SuccessSubscriber()
    {
    }

    public void onCompleted()
    {
        isSuccess = true;
    }

    public boolean wasSuccess()
    {
        return isSuccess;
    }
}
