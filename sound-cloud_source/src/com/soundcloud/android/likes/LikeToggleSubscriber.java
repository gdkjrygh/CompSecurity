// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import android.content.Context;
import android.widget.Toast;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.collections.PropertySet;

public class LikeToggleSubscriber extends DefaultSubscriber
{

    private final Context context;
    private final boolean likeStatus;

    public LikeToggleSubscriber(Context context1, boolean flag)
    {
        context = context1;
        likeStatus = flag;
    }

    public void onError(Throwable throwable)
    {
        Toast.makeText(context, 0x7f070150, 0).show();
    }

    public void onNext(PropertySet propertyset)
    {
        if (likeStatus)
        {
            Toast.makeText(context, 0x7f070151, 0).show();
            return;
        } else
        {
            Toast.makeText(context, 0x7f070215, 0).show();
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((PropertySet)obj);
    }
}
