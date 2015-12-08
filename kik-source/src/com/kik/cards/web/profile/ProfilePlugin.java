// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.profile;

import android.content.Context;
import android.content.res.Resources;
import com.kik.cards.web.plugin.d;
import com.kik.cards.web.plugin.j;
import com.kik.g.p;
import kik.a.e.r;
import kik.android.chat.activity.k;
import kik.android.chat.fragment.KikScopedDialogFragment;
import kik.android.chat.fragment.ProgressDialogFragment;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.profile:
//            a

public class ProfilePlugin extends d
{

    private Context a;
    private int b;
    private p d;
    private KikScopedDialogFragment e;
    private r f;
    private String g;
    private com.kik.cards.web.browser.BrowserPlugin.a h;

    public ProfilePlugin(Context context, KikScopedDialogFragment kikscopeddialogfragment, r r1, com.kik.cards.web.browser.BrowserPlugin.a a1)
    {
        super("Profile");
        b = 4;
        a = context;
        e = kikscopeddialogfragment;
        f = r1;
        h = a1;
    }

    static KikScopedDialogFragment a(ProfilePlugin profileplugin)
    {
        return profileplugin.e;
    }

    static void a(ProfilePlugin profileplugin, kik.a.d.k k1)
    {
        profileplugin.a(k1);
    }

    private void a(kik.a.d.k k1)
    {
        k.a((new kik.android.chat.fragment.KikChatInfoFragment.a()).a(k1).b(b), a).f();
    }

    static Context b(ProfilePlugin profileplugin)
    {
        return profileplugin.a;
    }

    static String c(ProfilePlugin profileplugin)
    {
        return profileplugin.g;
    }

    public j openProfile(JSONObject jsonobject)
    {
        if (h.e())
        {
            return new j(405);
        }
        jsonobject = jsonobject.optString("username", "");
        g = jsonobject;
        if (jsonobject.equals(""))
        {
            return new j(400);
        }
        kik.a.d.k k1 = f.b(jsonobject);
        if (k1 != null)
        {
            a(k1);
        } else
        {
            ProgressDialogFragment progressdialogfragment = new ProgressDialogFragment(a.getResources().getString(0x7f0900ff), false);
            e.a(progressdialogfragment);
            d = f.d(jsonobject);
            d.a(new a(this));
        }
        return new j();
    }
}
