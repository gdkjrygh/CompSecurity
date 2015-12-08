// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

public class fnt
    implements mti, omb, opv
{

    private static Uri a = Uri.parse("https://support.google.com/plus/topic/3049663");
    private final Activity b;
    private mmr c;
    private mtj d;
    private mbx e;
    private mbz f;
    private String g;
    private String h;

    public fnt(Activity activity, opd opd1)
    {
        b = activity;
        opd1.a(this);
    }

    private mbw a(Activity activity, String s)
    {
        s = e.a(s);
        s.a(a);
        s.a(activity);
        if (g != null)
        {
            s.a(new Account(g, "com.google"));
        }
        return s;
    }

    private void a()
    {
        android.content.Intent intent = a(b, h).a(b);
        f.a(b).a(intent);
    }

    public final fnt a(olm olm1)
    {
        olm1.a(fnt, this);
        return this;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (mmr)olm1.a(mmr);
        d = ((mtj)olm1.a(mtj)).a(this);
        e = (mbx)olm1.a(mbx);
        f = (mbz)olm1.a(mbz);
    }

    public final void a(fnl fnl1)
    {
        p.a(fnl1);
        a(fnl1.toString());
    }

    public final void a(String s)
    {
        p.a(s);
        h = s;
        if (c.e())
        {
            g = c.g().b("account_name");
            s = new fnk(g, c.d());
            d.b(s);
            return;
        } else
        {
            a();
            return;
        }
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if (!"com.google.android.apps.photos.help.FetchPhotosSpecificDataTask".equals(s))
        {
            return;
        }
        if (mue1 != null && !mue1.c())
        {
            s = (fnu)mue1.a().getParcelable("PhotosSpecificData");
            mue1 = a(b, h);
            mua = new HashMap();
            if (((fnu) (s)).b != null)
            {
                mua.put("ab_enabled", ((fnu) (s)).b.toString());
            }
            if (((fnu) (s)).c != null)
            {
                mua.put("ab_fullsize", ((fnu) (s)).c.toString());
            }
            if (((fnu) (s)).d != null)
            {
                mua.put("trash_empty", ((fnu) (s)).d.toString());
            }
            if (((fnu) (s)).e != null)
            {
                mua.put("is_dogfood", ((fnu) (s)).e.toString());
            }
            if (!mua.isEmpty())
            {
                mue1.a(mua);
            }
            s = mue1.a(b);
            f.a(b).a(s);
            return;
        } else
        {
            a();
            return;
        }
    }

}
