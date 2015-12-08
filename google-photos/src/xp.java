// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SpinnerAdapter;

public interface xp
{

    public abstract ViewGroup a();

    public abstract ob a(int i1, long l1);

    public abstract void a(int i1);

    public abstract void a(Drawable drawable);

    public abstract void a(Menu menu, wk wk);

    public abstract void a(View view);

    public abstract void a(android.view.Window.Callback callback);

    public abstract void a(SpinnerAdapter spinneradapter, android.widget.AdapterView.OnItemSelectedListener onitemselectedlistener);

    public abstract void a(CharSequence charsequence);

    public abstract void a(wk wk, vv vv);

    public abstract void a(xx xx);

    public abstract void a(boolean flag);

    public abstract Context b();

    public abstract void b(int i1);

    public abstract void b(Drawable drawable);

    public abstract void b(CharSequence charsequence);

    public abstract void c(int i1);

    public abstract void c(Drawable drawable);

    public abstract boolean c();

    public abstract void d();

    public abstract void d(int i1);

    public abstract CharSequence e();

    public abstract void e(int i1);

    public abstract void f(int i1);

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract void k();

    public abstract void l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract View p();

    public abstract int q();

    public abstract Menu r();
}
