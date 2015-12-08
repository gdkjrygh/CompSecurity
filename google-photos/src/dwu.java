// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class dwu
{

    static final Uri a = Uri.parse("content://com.google.android.apps.photos.assistant.devicefolders");
    private static final TimeUnit b;

    public static void a(Context context)
    {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("is_device_folders_card_dismissed", true).apply();
        context.getContentResolver().notifyChange(a, null);
    }

    public static boolean a(Context context, int i)
    {
        mhe mhe1;
        Object obj;
        if (PreferenceManager.getDefaultSharedPreferences(context).getBoolean("is_device_folders_card_dismissed", false))
        {
            return false;
        }
        obj = ((mmv)olm.a(context, mmv)).a(i).b("account_name");
        mhe1 = ((mhh)olm.a(context, mhh)).a(context, ((String) (obj)));
        boolean flag;
        mhe1.a(500L, b);
        flag = mhe1.c();
        if (!flag)
        {
            mhe1.b();
            return false;
        }
        Object obj1;
        obj1 = (mhn)mhe1.a(((String) (obj))).a(500L, b);
        flag = ((mhn) (obj1)).r().a();
        if (!flag)
        {
            mhe1.b();
            return false;
        }
        obj1 = ((mhn) (obj1)).a().e();
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        flag = ((String) (obj1)).equals(obj);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        mhe1.b();
        return false;
        obj = (mhq)mhe1.b(((String) (obj))).a(500L, b);
        flag = ((mhq) (obj)).r().a();
        if (!flag)
        {
            mhe1.b();
            return false;
        }
        ((mhq) (obj)).a();
        boolean flag1;
        if (!((mhq) (obj)).a().isEmpty())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_245;
        }
        a(context);
        mhe1.b();
        return flag1;
        context;
        mhe1.b();
        throw context;
    }

    static 
    {
        b = TimeUnit.MILLISECONDS;
    }
}
