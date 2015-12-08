// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.share;

import android.content.Context;
import android.content.Intent;
import com.soundcloud.android.analytics.PromotedSourceInfo;
import com.soundcloud.android.events.EntityMetadata;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.model.EntityProperty;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.strings.Strings;
import com.soundcloud.rx.eventbus.EventBus;

public class ShareOperations
{

    private static final String SHARE_TYPE = "text/plain";
    private final EventBus eventBus;

    public ShareOperations(EventBus eventbus)
    {
        eventBus = eventbus;
    }

    private Intent buildShareIntent(Context context, PropertySet propertyset)
    {
        String s = (String)propertyset.get(PlayableProperty.TITLE);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(0x80000);
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", context.getString(0x7f0701e0, new Object[] {
            s
        }));
        intent.putExtra("android.intent.extra.TEXT", buildShareText(context, propertyset));
        return intent;
    }

    private String buildShareText(Context context, PropertySet propertyset)
    {
        String s = (String)propertyset.get(PlayableProperty.TITLE);
        String s1 = (String)propertyset.getOrElse(PlayableProperty.CREATOR_NAME, "");
        propertyset = (String)propertyset.get(PlayableProperty.PERMALINK_URL);
        if (Strings.isNotBlank(s1))
        {
            return context.getString(0x7f0701e1, new Object[] {
                s, s1, propertyset
            });
        } else
        {
            return context.getString(0x7f0701e2, new Object[] {
                s, propertyset
            });
        }
    }

    private void publishShareTracking(PropertySet propertyset, String s, String s1, Urn urn, PromotedSourceInfo promotedsourceinfo)
    {
        eventBus.publish(EventQueue.TRACKING, UIEvent.fromShare(s, s1, (Urn)propertyset.get(EntityProperty.URN), urn, promotedsourceinfo, EntityMetadata.from(propertyset)));
    }

    private void startShareActivity(Context context, PropertySet propertyset)
    {
        context.startActivity(buildShareIntent(context, propertyset));
    }

    public void share(Context context, PropertySet propertyset, String s, String s1, Urn urn, PromotedSourceInfo promotedsourceinfo)
    {
        if (!((Boolean)propertyset.get(PlayableProperty.IS_PRIVATE)).booleanValue())
        {
            startShareActivity(context, propertyset);
            publishShareTracking(propertyset, s, s1, urn, promotedsourceinfo);
        }
    }
}
