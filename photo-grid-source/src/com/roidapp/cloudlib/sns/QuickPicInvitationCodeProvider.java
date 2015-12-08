// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.roidapp.baselib.c.aj;

// Referenced classes of package com.roidapp.cloudlib.sns:
//            f

public class QuickPicInvitationCodeProvider extends ContentProvider
{

    public QuickPicInvitationCodeProvider()
    {
    }

    public int delete(Uri uri, String s, String as[])
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public String getType(Uri uri)
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public boolean onCreate()
    {
        return false;
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        as = null;
        uri = as;
        if (!PreferenceManager.getDefaultSharedPreferences(aj.a()).getBoolean("QPicFailed", false))
        {
            s = PreferenceManager.getDefaultSharedPreferences(aj.a()).getString("QPicCode", null);
            uri = as;
            if (!TextUtils.isEmpty(s))
            {
                uri = new f(new String[] {
                    s, String.valueOf(PreferenceManager.getDefaultSharedPreferences(aj.a()).getLong("QPicCodeTime", System.currentTimeMillis()))
                }, (byte)0);
            }
        }
        return uri;
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
