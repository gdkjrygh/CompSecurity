// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import android.content.Intent;

// Referenced classes of package com.skype.android.push:
//            PushServiceType

public interface PushMessage
{

    public abstract Intent getIntent();

    public abstract Object getMessage();

    public abstract long getReceivedTimestamp();

    public abstract PushServiceType getServiceType();

    public abstract void setMessage(Object obj);

    public abstract void setReceivedTimestamp(long l);
}
