// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.content.Context;
import android.widget.Toast;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.collections.PropertySet;

public class RepostResultSubscriber extends DefaultSubscriber
{

    private final Context context;
    private final boolean repostStatus;

    public RepostResultSubscriber(Context context1, boolean flag)
    {
        context = context1;
        repostStatus = flag;
    }

    private boolean isCorrectRepostStatus(PropertySet propertyset)
    {
        com.soundcloud.java.collections.Property property = PlayableProperty.IS_REPOSTED;
        boolean flag;
        if (!repostStatus)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return ((Boolean)propertyset.getOrElse(property, Boolean.valueOf(flag))).booleanValue() == repostStatus;
    }

    public void onError(Throwable throwable)
    {
        Toast.makeText(context, 0x7f0701cf, 0).show();
    }

    public void onNext(PropertySet propertyset)
    {
        if (isCorrectRepostStatus(propertyset))
        {
            if (repostStatus)
            {
                Toast.makeText(context, 0x7f0701d0, 0).show();
                return;
            } else
            {
                Toast.makeText(context, 0x7f070218, 0).show();
                return;
            }
        } else
        {
            Toast.makeText(context, 0x7f0701cf, 0).show();
            return;
        }
    }

    public volatile void onNext(Object obj)
    {
        onNext((PropertySet)obj);
    }
}
