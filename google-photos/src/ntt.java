// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

public final class ntt
    implements nad
{

    public ntt()
    {
    }

    public final void a(Intent intent, Intent intent1)
    {
        intent1.putExtra("com.google.android.libraries.social.notifications.FROM_NOTIFICATION", intent.getBooleanExtra("com.google.android.libraries.social.notifications.FROM_NOTIFICATION", false));
        intent1.putExtra("com.google.android.libraries.social.notifications.notif_id", intent.getStringExtra("com.google.android.libraries.social.notifications.notif_id"));
    }
}
