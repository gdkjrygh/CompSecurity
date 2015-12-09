// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.net.Uri;

// Referenced classes of package com.google.android.gms.games.broker:
//            NotificationAgent

public static final class imageUri
{

    public final String externalGameId;
    public final String externalNotificationId;
    public final String externalSubId;
    public final Uri imageUri;
    public final String text;
    public final String ticker;
    public final String title;
    public final int type;

    public (String s, String s1, String s2, int i, String s3, String s4, String s5, 
            Uri uri)
    {
        externalGameId = s;
        externalNotificationId = s1;
        externalSubId = s2;
        type = i;
        ticker = s3;
        title = s4;
        text = s5;
        imageUri = uri;
    }
}
