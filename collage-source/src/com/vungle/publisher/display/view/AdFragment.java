// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.display.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.vungle.log.Logger;
import com.vungle.publisher.inject.Injector;
import dagger.ObjectGraph;

public abstract class AdFragment extends Fragment
{

    public AdFragment()
    {
    }

    public abstract void a();

    public void a(boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (flag)
        {
            s = "gained";
        } else
        {
            s = "lost";
        }
        Logger.v("VungleAd", stringbuilder.append(s).append(" window focus").toString());
    }

    public boolean a(int i)
    {
        return false;
    }

    public abstract String b();

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Injector.getInstance().a.inject(this);
    }
}
