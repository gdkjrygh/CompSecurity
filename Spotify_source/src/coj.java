// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.concurrent.Executors;

public final class coj
{

    public static final bqq a;
    public static final bql b;
    private static bqs c;
    private static bqs d;
    private static bqq e;

    static 
    {
        c = new bqs();
        d = new bqs();
        a = new bqq() {

            public final bqr a(Context context, Looper looper, bry bry, Object obj, bqw bqw, bqx bqx)
            {
                obj = (col)obj;
                if (obj == null)
                {
                    obj = col.a;
                }
                return new cqg(context, looper, true, bry, ((col) (obj)), bqw, bqx, Executors.newSingleThreadExecutor());
            }

        };
        e = new bqq() {

            public final bqr a(Context context, Looper looper, bry bry, Object obj, bqw bqw, bqx bqx)
            {
                return new cqg(context, looper, false, bry, col.a, bqw, bqx, Executors.newSingleThreadExecutor());
            }

        };
        new Scope("profile");
        new Scope("email");
        b = new bql("SignIn.API", a, c);
        new bql("SignIn.INTERNAL_API", e, d);
        new cqf();
    }
}
