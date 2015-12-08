// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.filenames;

import android.app.Application;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import java.io.File;

public final class Filenames
{

    public static String getHceDatabaseName(String s)
    {
        s = String.valueOf(getUniqueUserFilePrefix(s));
        String s1 = String.valueOf("hce.db");
        if (s1.length() != 0)
        {
            return s.concat(s1);
        } else
        {
            return new String(s);
        }
    }

    public static String getImageUploadIdentifier(String s, long l, int i)
    {
        s = String.valueOf(Hashing.md5().hashUnencodedChars((new StringBuilder(String.valueOf(s).length() + 21)).append(s).append("@").append(l).toString()));
        return (new StringBuilder(String.valueOf(s).length() + 12)).append(s).append("/").append(i).toString();
    }

    public static File getSharedPrefsFile(Application application, String s)
    {
        application = String.valueOf(application.getFilesDir().getParent());
        return new File((new StringBuilder(String.valueOf(application).length() + 18 + String.valueOf(s).length())).append(application).append("/shared_prefs/").append(s).append(".xml").toString());
    }

    private static String getUniqueUserFilePrefix(String s)
    {
        return String.valueOf(Hashing.md5().hashUnencodedChars(s).toString()).concat("_");
    }

    public static String getUserSharedPreferenceName(String s)
    {
        s = String.valueOf(getUniqueUserFilePrefix(s));
        String s1 = String.valueOf("user_prefs");
        if (s1.length() != 0)
        {
            return s.concat(s1);
        } else
        {
            return new String(s);
        }
    }

    public static String getWalletDatabaseName(String s)
    {
        s = String.valueOf(getUniqueUserFilePrefix(s));
        String s1 = String.valueOf("wallet.db");
        if (s1.length() != 0)
        {
            return s.concat(s1);
        } else
        {
            return new String(s);
        }
    }
}
