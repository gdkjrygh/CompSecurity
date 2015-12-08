// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.util.concurrent.TimeUnit;

final class dyu
{

    static final Uri a = Uri.parse("content://com.google.android.apps.photos.assistant.ratetheapp");
    static final long b;
    private static final TimeUnit f;
    final Context c;
    final mmv d;
    final int e;

    dyu(Context context, int i)
    {
        c = context;
        e = i;
        d = (mmv)olm.a(context, mmv);
    }

    static void a(Context context, dui dui1)
    {
        int i = dui1.a();
        ((mmv)olm.a(context, mmv)).b(i).c("is_rate_the_app_card_dismissed", true).d();
        context.getContentResolver().notifyChange(a, null);
    }

    static boolean a(mmv mmv1, int i, int j)
    {
        boolean flag = false;
        if (mmv1.a(i).a("assistant_view_experience_count", 0) >= 5)
        {
            flag = true;
        }
        return flag;
    }

    static boolean a(mmv mmv1, int i, long l, long l1)
    {
        return l - mmv1.a(i).a("first_assistant_load_time_stamp", l) >= l1;
    }

    final boolean a()
    {
        mhe mhe1;
        String s;
        s = d.a(e).b("account_name");
        mhe1 = ((mhh)olm.a(c, mhh)).a(c, s);
        boolean flag;
        mhe1.a(5000L, f);
        flag = mhe1.c();
        if (!flag)
        {
            mhe1.b();
            return false;
        }
        Object obj;
        obj = (mhn)mhe1.a(s).a(5000L, f);
        flag = ((mhn) (obj)).r().a();
        if (!flag)
        {
            mhe1.b();
            return false;
        }
        obj = ((mhn) (obj)).a().e();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        flag = ((String) (obj)).equals(s);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        mhe1.b();
        return false;
        mhe1.b();
        return true;
        Exception exception;
        exception;
        mhe1.b();
        throw exception;
    }

    static 
    {
        b = TimeUnit.DAYS.toMillis(7L);
        f = TimeUnit.MILLISECONDS;
    }
}
