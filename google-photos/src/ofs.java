// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

final class ofs
    implements ofq
{

    ofs(ofn ofn)
    {
    }

    public final boolean a(Intent intent)
    {
        return intent.getBooleanExtra("com.google.android.libraries.social.notifications.FROM_NOTIFICATION", false);
    }

    public final msm b(Intent intent)
    {
        ArrayList arraylist = intent.getStringArrayListExtra("com.google.android.libraries.social.notifications.coalescing_codes");
        ArrayList arraylist1 = intent.getStringArrayListExtra("com.google.android.libraries.social.notifications.ext_ids");
        ArrayList arraylist2 = intent.getIntegerArrayListExtra("com.google.android.libraries.social.notifications.local_ids");
        if (arraylist == null && intent.hasExtra("com.google.android.libraries.social.notifications.notif_id"))
        {
            arraylist = new ArrayList();
            arraylist.add(intent.getStringExtra("com.google.android.libraries.social.notifications.notif_id"));
            intent = arraylist;
        } else
        {
            intent = arraylist;
        }
        if (intent != null || arraylist1 != null)
        {
            return new ogy(pwq.b, intent, arraylist1);
        }
        if (arraylist2 != null)
        {
            return new ogy(pwq.b, arraylist2);
        } else
        {
            return new msm(pwq.c);
        }
    }
}
