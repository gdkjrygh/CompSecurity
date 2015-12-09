// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.Context;
import android.view.View;
import com.pandora.radio.data.aa;
import com.pandora.radio.data.ac;
import p.cn.e;

// Referenced classes of package com.pandora.android.activity:
//            o

public class m extends o
{

    public m(Context context, e e1, String s, com.pandora.android.coachmark.e e2)
    {
        super(context, e1, s, e2);
    }

    public int a(Object obj)
    {
        return super.a(obj) != a.d() - 1 ? -2 : 0;
    }

    public View a(int i)
    {
        return super.a(a.d() - 1);
    }

    protected View a(int i, View view)
    {
        return super.a(a.d() - 1, view);
    }

    public int b()
    {
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.d();
        }
        return Math.min(1, i);
    }

    public int b(int i)
    {
        if (i >= 0)
        {
            aa aa1 = a.a(a.d() - 1);
            if (aa1 != null)
            {
                return aa1.l().ordinal();
            }
        }
        return -1;
    }
}
