// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public class hfy
    implements nuc, opl, ops, opv
{

    String a;
    double b;
    boolean c;
    nud d;

    public hfy(opd opd1)
    {
        d = new ntz(this);
        opd1.a(this);
    }

    public final nud a()
    {
        return d;
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            a = bundle.getString("com.google.android.apps.photos.progress.DynamicProgressModel_title");
            b = bundle.getDouble("com.google.android.apps.photos.progress.DynamicProgressModel_progress");
            c = bundle.getBoolean("com.google.android.apps.photos.progress.DynamicProgressModel_indeterminate");
        }
    }

    public final void a(String s)
    {
        a = s;
        d.b();
    }

    public final void a(boolean flag)
    {
        c = flag;
        d.b();
    }

    public final void e(Bundle bundle)
    {
        bundle.putString("com.google.android.apps.photos.progress.DynamicProgressModel_title", a);
        bundle.putDouble("com.google.android.apps.photos.progress.DynamicProgressModel_progress", b);
        bundle.putBoolean("com.google.android.apps.photos.progress.DynamicProgressModel_indeterminate", c);
    }

    public String toString()
    {
        String s = a;
        double d1 = b;
        boolean flag = c;
        return (new StringBuilder(String.valueOf(s).length() + 83)).append("ProgressModel {title: ").append(s).append(", progress: ").append(d1).append(", isIndeterminate: ").append(flag).append("}").toString();
    }
}
