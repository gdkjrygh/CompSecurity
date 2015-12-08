// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bx;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.pandora.android.data.h;

public interface p.bx.b
{
    public static interface a
    {

        public abstract void a();

        public abstract void b();
    }

    public static interface b
    {

        public abstract void a();

        public abstract void b();

        public abstract void c();
    }


    public abstract void a();

    public abstract void a(Activity activity, int i, int j, Intent intent);

    public abstract void a(Activity activity, a a1);

    public abstract void a(Bundle bundle, com.facebook.Request.Callback callback);

    public abstract void a(com.facebook.Request.GraphUserListCallback graphuserlistcallback);

    public abstract void a(b b1, Activity activity);

    public abstract void a(boolean flag, boolean flag1);

    public abstract void a(boolean flag, boolean flag1, boolean flag2);

    public abstract boolean a(b b1);

    public abstract boolean a(boolean flag);

    public abstract h b();

    public abstract void b(boolean flag);

    public abstract boolean b(b b1);

    public abstract boolean c();

    public abstract boolean d();

    public abstract void e();

    public abstract boolean f();

    public abstract boolean g();
}
