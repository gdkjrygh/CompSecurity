// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public interface LifecycleDelegate
{

    public abstract View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle);

    public abstract void a();

    public abstract void a(Activity activity, Bundle bundle, Bundle bundle1);

    public abstract void a(Bundle bundle);

    public abstract void b();

    public abstract void b(Bundle bundle);

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();
}
