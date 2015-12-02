// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v4.app.Fragment;
import java.util.List;

public abstract class m
{
    public static interface a
    {

        public abstract String d();
    }

    public static interface b
    {

        public abstract void a();
    }


    public m()
    {
    }

    public abstract android.support.v4.app.Fragment.SavedState a(Fragment fragment);

    public abstract Fragment a(int i);

    public abstract Fragment a(Bundle bundle, String s);

    public abstract Fragment a(String s);

    public abstract q a();

    public abstract void a(int i, int j);

    public abstract void a(Bundle bundle, String s, Fragment fragment);

    public abstract void a(String s, int i);

    public abstract void a(b b1);

    public abstract a b(int i);

    public abstract boolean b();

    public abstract boolean b(String s, int i);

    public abstract void c();

    public abstract boolean d();

    public abstract int e();

    public abstract List f();
}
