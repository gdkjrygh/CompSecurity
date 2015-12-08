// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.kik.android.a;
import kik.a.f.k;

// Referenced classes of package kik.android.chat.fragment:
//            KikLoginFragment

final class mg
    implements android.view.View.OnClickListener
{

    final KikLoginFragment a;

    mg(KikLoginFragment kikloginfragment)
    {
        a = kikloginfragment;
        super();
    }

    public final void onClick(View view)
    {
        a.g.b("Forgot Password Clicked").g().b();
        view = new Intent(new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append(a.a.d()).append("/p").toString())));
        a.startActivity(view);
    }
}
