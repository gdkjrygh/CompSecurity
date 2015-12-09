// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;

public final class ghr
{

    private static final gip a = gip.b("preferred_locale_reporter_username");
    private static final gip b = gip.b("preferred_locale_reporter_locale");

    public ghr()
    {
    }

    public static void a(Context context, String s)
    {
        String s1 = ghp.a(String.valueOf(context.getResources().getConfiguration().locale));
        gin gin1 = ((giq)dmz.a(giq)).b(context);
        String s2 = gin1.a(a, null);
        String s3 = gin1.a(b, null);
        if (!TextUtils.equals(s, s2) || !TextUtils.equals(s1, s3))
        {
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("preferred_locale", s1);
            context.getContentResolver().update(dtx.a, contentvalues, null, null);
            gin1.b().a(a, s).a(b, s1).b();
        }
    }

}
