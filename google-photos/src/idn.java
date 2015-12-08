// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.apps.photos.share.copylink.CopyLinkActivity;

final class idn
{

    private final Context a;

    idn(Context context)
    {
        a = context;
    }

    final iei a(int i)
    {
        boolean flag = false;
        if (i != -1)
        {
            flag = true;
        }
        p.a(flag, "must provide a valid accountId");
        ComponentName componentname = new ComponentName(a, com/google/android/apps/photos/share/copylink/CopyLinkActivity);
        Object obj = new ResolveInfo();
        ifc ifc1;
        Intent intent;
        try
        {
            obj.activityInfo = a.getPackageManager().getActivityInfo(componentname, 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            throw new IllegalStateException("CopyLinkActivity missing", namenotfoundexception);
        }
        obj = new iei(componentname.getPackageName(), ((ResolveInfo) (obj)));
        ifc1 = ((iei) (obj)).c;
        intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.setComponent(componentname);
        intent.putExtra("account_id", i);
        ifc1.b = intent;
        return ((iei) (obj));
    }
}
