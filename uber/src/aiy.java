// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Future;

public final class aiy
{

    static SharedPreferences a(Context context)
    {
        return b(context);
    }

    public static Future a(Context context, int i)
    {
        return (new _cls3(context, i)).e();
    }

    public static Future a(Context context, aja aja)
    {
        return (new _cls2(context, aja)).e();
    }

    public static Future a(Context context, boolean flag)
    {
        return (new _cls1(context, flag)).e();
    }

    private static SharedPreferences b(Context context)
    {
        return context.getSharedPreferences("admob", 0);
    }

    public static Future b(Context context, aja aja)
    {
        return (new _cls4(context, aja)).e();
    }

    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls4 {}

}
