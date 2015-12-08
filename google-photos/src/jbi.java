// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.List;

final class jbi extends mtf
{

    private static final ekk a = (new ekm()).a(hpg).a();
    private final int b;

    public jbi(int i)
    {
        super("com.google.android.apps.photos.trash.EMPTY_TRASH_TASK");
        boolean flag;
        if (i != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "invalid account id");
        b = i;
    }

    private mue a(Exception exception, String s)
    {
        exception = new mue(0, exception, s);
        exception.a().putInt("extra_account_id", b);
        return exception;
    }

    private mue f()
    {
        mue mue1 = new mue(true);
        mue1.a().putInt("extra_account_id", b);
        return mue1;
    }

    protected final mue a(Context context)
    {
        Object obj = iyw.a(b);
        obj = b.a(context, ((ekq) (obj))).a(((ekq) (obj)), ekw.a, a);
        try
        {
            obj = (List)((elb) (obj)).a();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return a(((Exception) (obj)), context.getString(b.BL));
        }
        if (((List) (obj)).isEmpty())
        {
            return f();
        }
        obj = ((iyi)b.a(context, iyi, ((java.util.Collection) (obj)))).a(b, ((java.util.Collection) (obj)), gaw.c);
        try
        {
            ((elb) (obj)).a();
        }
        catch (eke eke1)
        {
            return a(((Exception) (eke1)), context.getString(b.BL));
        }
        return f();
    }

}
