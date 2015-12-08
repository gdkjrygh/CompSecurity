// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.Random;

// Referenced classes of package com.splunk.mint:
//            Properties

class UidManager
{

    private static final char DIGITS[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
    private static final int UID_CORRECT_LENTH = 32;
    private static final String UID_ERROR_ID = "12345678901234567890123456789012";
    private static final String UID_FIELD = "UID_FIELD";
    private static final String UID_NOSAVED = "UID_NOSAVED";
    private static final String UID_PREFERENCES = "UIDPREFERENCES";

    UidManager()
    {
    }

    private static final char[] encodeHex(byte abyte0[])
    {
        int k = abyte0.length;
        char ac[] = new char[k << 1];
        int i = 0;
        int j = 0;
        for (; i < k; i++)
        {
            int l = j + 1;
            ac[j] = DIGITS[(abyte0[i] & 0xf0) >>> 4];
            j = l + 1;
            ac[l] = DIGITS[abyte0[i] & 0xf];
        }

        return ac;
    }

    private static final String generateUid()
    {
        byte abyte0[];
        String s1;
        String s = Long.valueOf((new Date()).getTime()).toString();
        s1 = (new Object()).toString();
        long l = System.nanoTime();
        String s2 = Integer.valueOf((int)((new Random(System.currentTimeMillis())).nextDouble() * 65535D)).toString();
        s1 = (new StringBuilder()).append(s).append(s1).append(String.valueOf(l)).append(s2).append("android_id").toString();
        abyte0 = null;
        byte abyte1[];
        abyte1 = s1.getBytes("UTF-8");
        abyte1 = MessageDigest.getInstance("MD5").digest(abyte1);
        abyte0 = abyte1;
_L2:
        return new String(encodeHex(abyte0));
        Object obj;
        obj;
        ((UnsupportedEncodingException) (obj)).printStackTrace();
        continue; /* Loop/switch isn't completed */
        obj;
        ((NoSuchAlgorithmException) (obj)).printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected static final String getUid(Context context)
    {
        if (Properties.UID == null || Properties.UID.length() != 32) goto _L2; else goto _L1
_L1:
        String s2 = Properties.UID;
_L4:
        return s2;
_L2:
        String s;
        s2 = "12345678901234567890123456789012";
        s = s2;
        if (context != null)
        {
            SharedPreferences sharedpreferences = context.getSharedPreferences("UIDPREFERENCES", 0);
            s = s2;
            if (sharedpreferences != null)
            {
                s = sharedpreferences.getString("UID_FIELD", "UID_NOSAVED");
            }
        }
        if (s.equals("UID_NOSAVED"))
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = s;
        if (!s.equals("12345678901234567890123456789012")) goto _L4; else goto _L3
_L3:
        String s1 = generateUid();
        saveUid(context, s1);
        return s1;
    }

    protected static boolean saveUid(Context context, String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (s != null)
        {
            flag = flag1;
            if (s.length() == 32)
            {
                Properties.UID = s;
                context = context.getSharedPreferences("UIDPREFERENCES", 0);
                flag = flag1;
                if (context != null)
                {
                    flag = context.edit().putString("UID_FIELD", s).commit();
                }
            }
        }
        return flag;
    }

}
