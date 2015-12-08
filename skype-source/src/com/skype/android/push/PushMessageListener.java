// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import java.util.EnumSet;

// Referenced classes of package com.skype.android.push:
//            PushMessage

public interface PushMessageListener
{

    public abstract EnumSet getSupportedEventTypes();

    public abstract void onPushMessage(PushMessage pushmessage);
}
