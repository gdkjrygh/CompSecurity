// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.notifications;

import android.os.Bundle;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import me.lyft.android.common.Objects;

// Referenced classes of package me.lyft.android.notifications:
//            StatusBarNotification

public class StatusBarNotificationMapper
{

    private static final String ACTIONS_PARAM = "actions";
    private static final String BIG_IMAGE_URL = "big_image_url";
    private static final String BIG_MESSAGE_PARAM = "big_message";
    private static final String BIG_TITLE_PARAM = "big_title";
    private static final String DEEP_LINK_PARAM = "deep_link";
    private static final String MESSAGE_PARAM = "message";
    private static final String TIMESTAMP_PARAM = "timestamp";
    private static final String TITLE_PARAM = "title";

    public StatusBarNotificationMapper()
    {
    }

    public static StatusBarNotification createStatusBarNotification(Bundle bundle, Gson gson)
    {
        StatusBarNotification statusbarnotification = new StatusBarNotification();
        statusbarnotification.setTimestamp(getTimestamp(bundle));
        statusbarnotification.setMessage(bundle.getString("message"));
        statusbarnotification.setTitle(bundle.getString("title"));
        statusbarnotification.setDeepLink(bundle.getString("deep_link"));
        statusbarnotification.setBigTitle((String)Objects.firstNonNull(new String[] {
            bundle.getString("big_title"), statusbarnotification.getTitle(), ""
        }));
        statusbarnotification.setBigMessage((String)Objects.firstNonNull(new String[] {
            bundle.getString("big_message"), statusbarnotification.getMessage(), ""
        }));
        statusbarnotification.setBigImageUrl(bundle.getString("big_image_url"));
        java.lang.reflect.Type type = (new TypeToken() {

        }).getType();
        statusbarnotification.setActions((List)gson.a(bundle.getString("actions"), type));
        return statusbarnotification;
    }

    private static long getTimestamp(Bundle bundle)
    {
        bundle = bundle.getString("timestamp");
        if (bundle == null)
        {
            return 0L;
        } else
        {
            return Long.valueOf(bundle).longValue();
        }
    }
}
