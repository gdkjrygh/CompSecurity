// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public class dgz
{

    final View a;
    int b;

    public dgz(View view)
    {
        a = (View)p.a(view);
    }

    public void a(int i)
    {
        b = i;
    }

    public void a(dge dge1, float f)
    {
        boolean flag;
        if (dge1.e == 80)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        a.setTranslationY((float)b - (float)dge1.b() * f);
    }

    public void b(dge dge1, float f)
    {
        boolean flag;
        if (dge1.e == 80)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        a.setTranslationY((float)b - (float)dge1.b() * f);
    }
}
