// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import com.skype.android.util.concurrent.KeyedJoin;

// Referenced classes of package com.skype.android.push:
//            b, SkypePushListener, SkyLibPushMessage

final class this._cls0
    implements b
{

    final SkypePushListener this$0;

    public final void onStamped(int i, SkyLibPushMessage skylibpushmessage)
    {
        SkypePushListener.access$200(SkypePushListener.this).putFirst(Integer.valueOf(i), skylibpushmessage);
    }

    public final volatile void onStamped(int i, Object obj)
    {
        onStamped(i, (SkyLibPushMessage)obj);
    }

    ()
    {
        this$0 = SkypePushListener.this;
        super();
    }
}
