// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.spotify.mobile.android.ui.ActionBarTitle;

public abstract class fok
{

    public ActionBarTitle d;

    public fok(Context context, Bundle bundle)
    {
        String s = bundle.getString("title");
        float f = bundle.getFloat("title_alpha");
        d = new ActionBarTitle(context, s);
        d.a = f;
    }

    public fok(ActionBarTitle actionbartitle)
    {
        d = actionbartitle;
    }

    public abstract int a();

    public abstract foj a(ah ah);

    public abstract View b();

    public abstract foh b(ah ah);

    public abstract Class c();

    public void c(ah ah)
    {
    }

    public Bundle d()
    {
        Bundle bundle = new Bundle();
        bundle.putString("title", d.toString());
        bundle.putFloat("title_alpha", d.a);
        bundle.putInt("type", a());
        return bundle;
    }
}
