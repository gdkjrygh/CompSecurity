// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.f;
import android.support.v4.app.g;
import android.view.ViewGroup;
import com.qihoo.security.locale.d;
import java.util.ArrayList;

public class com.qihoo.security.ui.fragment.a extends g
{
    static final class a
    {

        private final String a;
        private final Fragment b;

        static String a(a a1)
        {
            return a1.b();
        }

        private String b()
        {
            return a;
        }

        public Fragment a()
        {
            return b;
        }

        a(Context context, String s, Class class1, Bundle bundle)
        {
            a = s;
            b = Fragment.instantiate(context, class1.getName(), bundle);
        }
    }


    private final ArrayList a = new ArrayList();

    public com.qihoo.security.ui.fragment.a(f f)
    {
        super(f);
    }

    public Fragment a(int i)
    {
        a a1 = (a)a.get(i);
        if (a1 == null)
        {
            return null;
        } else
        {
            return a1.a();
        }
    }

    public void a(Context context, int i, Class class1, Bundle bundle)
    {
        context = new a(context, d.a().a(i), class1, bundle);
        a.add(context);
        c();
    }

    public void a(ViewGroup viewgroup, int i, Object obj)
    {
        super.a(viewgroup, i, obj);
    }

    public int b()
    {
        return a.size();
    }

    public CharSequence c(int i)
    {
        return a.a((a)a.get(i));
    }
}
