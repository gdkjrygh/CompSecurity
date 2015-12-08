// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Collection;

final class icq
    implements icp
{

    icq()
    {
    }

    public final void a(Context context, int i, Collection collection)
    {
        String s = ((mmv)olm.a(context, mmv)).a(i).b("account_name");
        collection = new mry(-1, (new msn()).a(new ogy(pwq.a, new ArrayList(collection))).a(new msm(pwq.c)));
        collection.c = s;
        collection.b(context);
    }

    public final void a(Intent intent, Collection collection)
    {
        intent.putExtra("com.google.android.libraries.social.notifications.FROM_NOTIFICATION", true);
        intent.putExtra("com.google.android.libraries.social.notifications.local_ids", new ArrayList(collection));
    }

    public final void a(Intent intent, Collection collection, Collection collection1)
    {
        intent.putExtra("com.google.android.libraries.social.notifications.FROM_NOTIFICATION", true);
        intent.putExtra("com.google.android.libraries.social.notifications.ext_ids", new ArrayList(collection));
        intent.putExtra("com.google.android.libraries.social.notifications.coalescing_codes", new ArrayList(collection1));
    }
}
