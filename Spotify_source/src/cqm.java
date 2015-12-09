// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Looper;

public final class cqm
{

    public static final cqj a = new crx();
    public static final bqs b;
    public static final bql c;
    private static final bqq d;

    static 
    {
        new cth();
        new csy();
        new csa();
        new cta();
        new csv();
        new cst();
        new ctg();
        new csj();
        new csq();
        b = new bqs();
        d = new bqq() {

            public final bqr a(Context context, Looper looper, bry bry, Object obj, bqw bqw, bqx bqx)
            {
                if ((cqn)obj == null)
                {
                    new cqo();
                    new cqn((byte)0);
                }
                return new cso(context, looper, bqw, bqx, bry);
            }

        };
        c = new bql("Wearable.API", d, b);
    }
}
