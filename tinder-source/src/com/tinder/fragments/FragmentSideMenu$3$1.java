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
    implements com.tinder.managers.
{

    final ctivity a;

    public final void a(String s)
    {
        if (a.a.getActivity() != null)
        {
            Object obj = a.a.s;
            android.support.v4.app.i i = a.a.getActivity();
            StringBuilder stringbuilder = new StringBuilder();
            boolean flag = ae.a();
            if (!TextUtils.isEmpty(s))
            {
                stringbuilder.append("fbe=");
                stringbuilder.append(s);
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
            stringbuilder.append(android.os.);
            stringbuilder.append("&ti=");
            stringbuilder.append(ManagerApp.e());
            stringbuilder.append("&loc=");
            stringbuilder.append(Locale.getDefault());
            s = stringbuilder.toString();
            s = (new StringBuilder()).append("https://www.gotinder.com/faq").append('?').append(s).toString();
            obj = new Intent("android.intent.action.VIEW");
            ((Intent) (obj)).setData(Uri.parse(s));
            i.startActivity(((Intent) (obj)));
        }
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/tinder/fragments/FragmentSideMenu$3

/* anonymous class */
    final class FragmentSideMenu._cls3
        implements android.view.View.OnClickListener
    {

        final FragmentSideMenu a;

        public final void onClick(View view)
        {
            com.tinder.managers.a.a(new SparksEvent("Menu.Faq"));
            view = a.q;
            FragmentSideMenu._cls3._cls1 _lcls1 = new FragmentSideMenu._cls3._cls1(this);
            String s = f.a();
            view = new com.tinder.managers.f._cls6(view, (new StringBuilder("https://graph.facebook.com/me/?access_token=")).append(s).toString(), new com.tinder.managers.f._cls4(view, _lcls1), new com.tinder.managers.f._cls5(view, _lcls1));
            ManagerApp.b().a(view);
        }

            
            {
                a = fragmentsidemenu;
                super();
            }
    }

}
