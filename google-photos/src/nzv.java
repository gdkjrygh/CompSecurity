// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class nzv extends oad
    implements opc
{

    public final oow c = new oow();

    public nzv()
    {
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        c.b(bundle);
        return super.a(layoutinflater, viewgroup, bundle);
    }

    public final void a(int i, int j, Intent intent)
    {
        c.a(i, j, intent);
        super.a(i, j, intent);
    }

    public final void a(int i, String as[], int ai[])
    {
        c.a(i, as, ai);
    }

    public void a(Activity activity)
    {
        c.a(activity);
        super.a(activity);
    }

    public void a(Bundle bundle)
    {
        c.c(bundle);
        super.a(bundle);
    }

    public final void a(View view, Bundle bundle)
    {
        c.a(view, bundle);
        super.a(view, bundle);
    }

    public final void aj_()
    {
        c.m();
        super.aj_();
    }

    public final void ak_()
    {
        c.a();
        super.ak_();
    }

    public final void au_()
    {
        c.k();
        super.au_();
    }

    public final void d(Bundle bundle)
    {
        c.a(bundle);
        super.d(bundle);
    }

    public final void e(Bundle bundle)
    {
        c.d(bundle);
        super.e(bundle);
    }

    public final void g_(boolean flag)
    {
        c.a(flag);
        super.g_(flag);
    }

    public final void l()
    {
        c.l();
        super.l();
    }

    public final void m()
    {
        c.b();
        super.m();
    }

    public void n()
    {
        c.c();
        super.n();
    }

    public void onLowMemory()
    {
        c.n();
        super.onLowMemory();
    }

    public final opd x_()
    {
        return c;
    }
}
