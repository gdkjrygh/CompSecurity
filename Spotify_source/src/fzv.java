// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;

public class fzv
{

    public Context p;
    public View q;

    public fzv(Context context)
    {
        new fzw();
        p = context;
    }

    public void a()
    {
    }

    public void b()
    {
    }

    public final void b(View view)
    {
        q = view;
        q.getId();
    }

    public final LayoutInflater c()
    {
        return (LayoutInflater)p.getSystemService("layout_inflater");
    }
}
