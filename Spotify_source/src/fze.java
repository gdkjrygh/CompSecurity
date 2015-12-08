// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.spotify.mobile.android.util.DialogPresenter;

public abstract class fze extends Fragment
{

    public DialogPresenter Y;

    public fze()
    {
    }

    public abstract void F();

    public abstract void a();

    public void a(int i, int j, Intent intent)
    {
        super.a(i, j, intent);
        if (Y != null)
        {
            Y.a(i, j, intent);
        }
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            bundle = bundle.getString("presenter_tag");
            if (bundle != null)
            {
                Y = (DialogPresenter)m().a(bundle);
            }
        }
    }

    public void a(DialogPresenter dialogpresenter)
    {
        ctz.a(dialogpresenter);
        Y = dialogpresenter;
        F();
    }

    public void e(Bundle bundle)
    {
        super.e(bundle);
        if (Y != null)
        {
            String s = Y.f();
            if (s != null)
            {
                bundle.putString("presenter_tag", s);
            }
        }
    }
}
