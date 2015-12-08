// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.roidapp.cloudlib.ads.l;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

// Referenced classes of package com.roidapp.cloudlib:
//            ak

public interface aj
{

    public abstract Intent a(Context context, String s, String s1);

    public abstract InputStream a(Context context, int i);

    public abstract InputStream a(Context context, String s, int i);

    public abstract Class a();

    public abstract void a(Activity activity);

    public abstract void a(Activity activity, Bundle bundle);

    public abstract void a(Context context);

    public abstract void a(Context context, int i, String s);

    public abstract void a(Context context, String s);

    public abstract void a(Context context, String s, String s1, String s2, Long long1, Map map);

    public abstract void a(String s);

    public abstract void a(String s, int i, int j);

    public abstract boolean a(Bundle bundle);

    public abstract String[] a(Context context, Uri uri, boolean flag);

    public abstract ak b(String s);

    public abstract InputStream b(Context context);

    public abstract Class b();

    public abstract void b(Context context, String s);

    public abstract InputStream c(Context context, String s);

    public abstract Class c();

    public abstract boolean c(Context context);

    public abstract l d(Context context, String s);

    public abstract Class d();

    public abstract boolean d(Context context);

    public abstract Intent e(Context context, String s);

    public abstract ArrayList e();

    public abstract boolean e(Context context);

    public abstract boolean f();
}
