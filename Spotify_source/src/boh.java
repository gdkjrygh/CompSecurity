// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Looper;

public final class boh
{

    public static final bql a;
    public static final boj b = new bok();
    private static final bqq c;

    static 
    {
        c = new bqq() {

            public final bqr a(Context context, Looper looper, bry bry, Object obj, bqw bqw, bqx bqx)
            {
                obj = (bol)obj;
                btl.a(obj, "Setting the API options is required.");
                return new bpm(context, looper, bry, ((bol) (obj)).a, ((bol) (obj)).b, bqw, bqx);
            }

        };
        a = new bql("Cast.API", c, bpx.a);
    }
}
