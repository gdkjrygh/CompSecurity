// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.view.View;
import com.qihoo.security.malware.vo.MaliciousInfo;
import com.qihoo360.mobilesafe.b.q;

// Referenced classes of package com.qihoo.security.ui.antivirus:
//            AppDetailActivity

class a
    implements android.view.
{

    final AppDetailActivity a;

    public void onClick(View view)
    {
        if (AppDetailActivity.a(a).isUninstall(a))
        {
            a.finish();
            return;
        }
        if (!AppDetailActivity.a(a).isInstalled)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        Intent intent;
        try
        {
            intent = a.getPackageManager().getLaunchIntentForPackage(AppDetailActivity.a(a).packageName);
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            q.a().a(0x7f0c0110);
            return;
        }
        view = intent;
        if (intent != null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        view = new Intent("android.intent.action.MAIN");
        view.addCategory("android.intent.category.LAUNCHER");
        view.setPackage(AppDetailActivity.a(a).packageName);
        view.addFlags(0x10000000);
        a.startActivity(view);
        return;
        q.a().a(0x7f0c010f);
        return;
    }

    _cls9(AppDetailActivity appdetailactivity)
    {
        a = appdetailactivity;
        super();
    }
}
