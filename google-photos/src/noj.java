// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

public abstract class noj
{

    public noj()
    {
    }

    public abstract Intent a(Uri uri, int i);

    public abstract Intent a(boolean flag, boolean flag1, int i);

    public abstract Uri a(Uri uri);

    public abstract Parcelable a(int i, List list);

    public abstract Parcelable a(Context context, int i, String s);

    public abstract String a(String s, String s1);

    public abstract List a(Context context, Intent intent);

    public abstract List a(Intent intent);

    public abstract Map a(int i, Collection collection);

    public abstract mtf a(Parcelable parcelable);

    public abstract nns a(int i, String s);

    public abstract okf a(Context context, int i, String s, okj okj);

    public abstract void a(Context context);

    public abstract void a(Context context, Parcelable parcelable);

    public abstract void a(Context context, String s);

    public abstract void a(String s, Uri uri);

    public abstract void a(olm olm);

    public abstract boolean a();

    public abstract boolean a(int i);

    public abstract Uri b(Context context, int i, String s);

    public abstract List b();

    public abstract Map b(int i);

    public abstract mtf b(Context context);

    public abstract int c(Context context);

    public abstract Future c(Context context, int i, String s);

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean d(Context context, int i, String s);

    public abstract String e();

    public abstract void f();
}
