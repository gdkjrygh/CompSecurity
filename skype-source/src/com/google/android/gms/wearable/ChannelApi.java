// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.gms.wearable:
//            Channel

public interface ChannelApi
{
    public static interface CloseReason
        extends Annotation
    {
    }

    public static interface a
    {

        public abstract void onChannelClosed(Channel channel, int i, int j);

        public abstract void onChannelOpened(Channel channel);

        public abstract void onInputClosed(Channel channel, int i, int j);

        public abstract void onOutputClosed(Channel channel, int i, int j);
    }

}
