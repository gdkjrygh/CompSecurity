// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class fzt
{

    private static final SimpleDateFormat a = new SimpleDateFormat("yyyy:MM:dd kk:mm:ss", Locale.getDefault());

    public static Long a(String s)
    {
        mxm mxm1 = new mxm();
        mxm1.a(s);
_L2:
        return a(mxm1);
        s;
        if (Log.isLoggable("ExifTimeUtil", 6))
        {
            Log.e("ExifTimeUtil", "Failed to parse exif from file", s);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static Long a(mxm mxm1)
    {
        Object obj = null;
        String s = mxm1.b(mxm.j);
        mxm1 = obj;
        if (!TextUtils.isEmpty(s))
        {
            long l;
            try
            {
                l = a.parse(s).getTime();
            }
            // Misplaced declaration of an exception variable
            catch (mxm mxm1)
            {
                return null;
            }
            mxm1 = Long.valueOf(l);
        }
        return mxm1;
    }

}
