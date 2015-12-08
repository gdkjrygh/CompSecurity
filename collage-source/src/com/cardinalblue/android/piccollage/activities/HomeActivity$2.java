// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.f;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            HomeActivity

class a
    implements android.content..OnClickListener
{

    final AtomicBoolean a;
    final HomeActivity b;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.set(true);
        com.cardinalblue.android.piccollage.a.b.aN("rate");
        dialoginterface = b.getApplicationInfo().packageName;
        String s = String.format("market://details?id=%s", new Object[] {
            dialoginterface
        });
        try
        {
            Intent intent1 = new Intent("android.intent.action.VIEW");
            intent1.setData(Uri.parse(s));
            b.startActivity(intent1);
            return;
        }
        catch (Exception exception)
        {
            f.a(exception);
        }
        try
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(String.format("http://play.google.com/store/apps/details?id=%s", new Object[] {
                dialoginterface
            })));
            b.startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            f.a(dialoginterface);
        }
    }

    (HomeActivity homeactivity, AtomicBoolean atomicboolean)
    {
        b = homeactivity;
        a = atomicboolean;
        super();
    }
}
