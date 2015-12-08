// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.a;
import com.tinder.managers.ae;
import com.tinder.managers.f;
import com.tinder.managers.x;
import com.tinder.managers.z;
import com.tinder.model.SparksEvent;
import com.tinder.model.User;
import java.util.Locale;

// Referenced classes of package com.tinder.fragments:
//            FragmentSideMenu

final class a
    implements android.view.r
{

    final FragmentSideMenu a;

    public final void onClick(View view)
    {
        com.tinder.managers.a.a(new SparksEvent("Menu.Faq"));
        view = a.q;
        com.tinder.managers.  = new com.tinder.managers.f.a() {

            final FragmentSideMenu._cls3 a;

            public final void a(String s1)
            {
                if (a.a.getActivity() != null)
                {
                    Object obj = a.a.s;
                    android.support.v4.app.i i = a.a.getActivity();
                    StringBuilder stringbuilder = new StringBuilder();
                    boolean flag = ae.a();
                    if (!TextUtils.isEmpty(s1))
                    {
                        stringbuilder.append("fbe=");
                        stringbuilder.append(s1);
                    }
                    if (((x) (obj)).a.b() != null)
                    {
                        stringbuilder.append("&u=");
                        stringbuilder.append(((x) (obj)).a.b().getId());
                    }
                    if (flag)
                    {
                        stringbuilder.append("&p=true");
                    }
                    stringbuilder.append("&d=Android");
                    stringbuilder.append("&m=");
                    stringbuilder.append(Build.MODEL);
                    stringbuilder.append("&os=");
                    stringbuilder.append(android.os.Build.VERSION.SDK_INT);
                    stringbuilder.append("&ti=");
                    stringbuilder.append(ManagerApp.e());
                    stringbuilder.append("&loc=");
                    stringbuilder.append(Locale.getDefault());
                    s1 = stringbuilder.toString();
                    s1 = (new StringBuilder()).append("https://www.gotinder.com/faq").append('?').append(s1).toString();
                    obj = new Intent("android.intent.action.VIEW");
                    ((Intent) (obj)).setData(Uri.parse(s1));
                    i.startActivity(((Intent) (obj)));
                }
            }

            
            {
                a = FragmentSideMenu._cls3.this;
                super();
            }
        };
        String s = f.a();
        view = new com.tinder.managers.(view, (new StringBuilder("https://graph.facebook.com/me/?access_token=")).append(s).toString(), new com.tinder.managers.(view, ), new com.tinder.managers.(view, ));
        ManagerApp.b().a(view);
    }

    _cls1.a(FragmentSideMenu fragmentsidemenu)
    {
        a = fragmentsidemenu;
        super();
    }
}
