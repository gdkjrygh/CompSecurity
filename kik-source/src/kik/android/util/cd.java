// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.kik.android.a;
import com.kik.view.adapters.bc;

// Referenced classes of package kik.android.util:
//            cc, cq

final class cd
    implements android.content.DialogInterface.OnClickListener
{

    final bc a;
    final String b;
    final Uri c;
    final String d;
    final String e;
    final String f;
    final cc g;

    cd(cc cc1, bc bc1, String s, Uri uri, String s1, String s2, String s3)
    {
        g = cc1;
        a = bc1;
        b = s;
        c = uri;
        d = s1;
        e = s2;
        f = s3;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = (ResolveInfo)a.getItem(i);
        String s = ((ResolveInfo) (dialoginterface)).activityInfo.packageName;
        Intent intent;
        if (b != null)
        {
            kik.android.util.cc.a(g).b("Share Code Completed").a("Colour", b).b();
        } else
        {
            kik.android.util.cc.a(g).b("Share Profile Completed").a("Shared Via", s).b();
        }
        intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", c);
        intent.putExtra("android.intent.extra.SUBJECT", d);
        intent.setClassName(s, ((ResolveInfo) (dialoginterface)).activityInfo.name);
        intent.addFlags(0x80000);
        if ("com.facebook.katana".equals(s))
        {
            if (!cq.c(e))
            {
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", e);
            } else
            {
                intent.setType("image/*");
            }
        } else
        {
            intent.putExtra("android.intent.extra.TEXT", f);
            intent.setType("image/*");
        }
        cc.b(g).startActivity(intent);
    }
}
