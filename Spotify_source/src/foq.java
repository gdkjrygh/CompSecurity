// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.text.TextUtils;
import com.spotify.mobile.android.model.TermsAndConditionsModel;

public final class foq
{

    private static final String a[] = {
        "unaccepted_licenses"
    };

    public foq()
    {
    }

    public static void a(Context context, com.spotify.mobile.android.model.TermsAndConditionsFactory.Decision decision, String s, String s1)
    {
        String s2 = s1.substring(s1.lastIndexOf('=') + 1);
        geh.a(s2, (new StringBuilder()).append(s1).append(" has no license version").toString());
        boolean flag;
        if (decision == com.spotify.mobile.android.model.TermsAndConditionsFactory.Decision.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        decision = new TermsAndConditionsModel(flag, System.currentTimeMillis() / 1000L, s2, s);
        s = dvv.a(context, "com.spotify.mobile.android.service.action.log.ACCEPT_USER_TERMS");
        s.putExtra("accept_user_terms", decision);
        context.startService(s);
    }

    public static String[] a(Context context)
    {
        ctz.a(context);
        context = context.getApplicationContext().getContentResolver().query(dtx.a, a, null, null, null);
        String as[] = a(((Cursor) (context)));
        context.close();
        return as;
    }

    public static String[] a(Cursor cursor)
    {
        if (cursor == null || !cursor.moveToFirst())
        {
            return new String[0];
        }
        cursor = cursor.getString(0);
        if (TextUtils.isEmpty(cursor))
        {
            return new String[0];
        } else
        {
            return cursor.split(",");
        }
    }

}
