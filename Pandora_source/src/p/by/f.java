// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.by;

import android.os.Bundle;
import com.google.android.gms.cast.MediaMetadata;
import org.json.JSONObject;

// Referenced classes of package p.by:
//            e

public interface f
{
    public static interface a
    {

        public abstract void a(JSONObject jsonobject);
    }

    public static interface b
    {

        public abstract void a(double d1);
    }


    public abstract void a();

    public abstract void a(double d1);

    public abstract void a(String s, String s1, Bundle bundle);

    public abstract void a(String s, JSONObject jsonobject, MediaMetadata mediametadata, boolean flag);

    public abstract void a(JSONObject jsonobject);

    public abstract void a(a a1);

    public abstract void a(b b1);

    public abstract void a(boolean flag);

    public abstract boolean b();

    public abstract boolean c();

    public abstract void d();

    public abstract void e();

    public abstract e f();

    public abstract String g();

    public abstract boolean h();

    public abstract void i();

    public abstract void j();
}
