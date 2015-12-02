// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.support;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.qihoo.security.SecurityApplication;

// Referenced classes of package com.qihoo.security.support:
//            b, StatisticianProvider

private static final class  extends Handler
{

    public void handleMessage(Message message)
    {
        if (message != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i = message.arg1;
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            message = b.d(i);
            Object obj;
            Object obj1;
            String s;
            int j;
            int k;
            long l;
            try
            {
                b.b(message, b.a(message, 0) + 1);
                if (b.e(i))
                {
                    message = b.f(i);
                    b.d(message, b.c(message, 0) + 1);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Message message) { }
            b.b(i);
            return;

        case 1: // '\001'
            j = message.arg2;
            message = b.d(i);
            try
            {
                b.b(message, b.a(message, 0) + j);
                if (b.e(i))
                {
                    message = b.f(i);
                    b.d(message, b.c(message, 0) + 1);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Message message) { }
            b.a(i, j);
            return;

        case 2: // '\002'
            j = message.arg2;
            message = b.d(i);
            try
            {
                b.b(message, j);
            }
            // Misplaced declaration of an exception variable
            catch (Message message) { }
            b.a(i, j);
            return;

        case 3: // '\003'
            obj = b.d(i);
            l = message.getData().getLong("value");
            try
            {
                b.b(((String) (obj)), b.a(((String) (obj)), 0L) + l);
                if (b.e(i))
                {
                    message = b.f(i);
                    b.d(message, b.c(message, 0) + 1);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Message message) { }
            b.a(i, l);
            return;

        case 4: // '\004'
            j = message.arg2;
            k = message.getData().getInt("value");
            try
            {
                message = b.d(i);
                b.c(message, b.a(b.b(message, ""), j, k));
            }
            // Misplaced declaration of an exception variable
            catch (Message message) { }
            b.a(i, j);
            return;

        case 5: // '\005'
            b.a(i, String.valueOf(message.arg2), String.valueOf(message.getData().getInt("value")));
            return;

        case 6: // '\006'
            message = SecurityApplication.a().getContentResolver();
            if (message != null)
            {
                obj = b.a(i, 0L, System.currentTimeMillis(), false);
                if (obj != null)
                {
                    try
                    {
                        message.insert(StatisticianProvider.a, ((android.content.ContentValues) (obj)));
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Message message)
                    {
                        return;
                    }
                }
            }
            break;

        case 7: // '\007'
            obj1 = message.getData();
            message = ((Bundle) (obj1)).getString("value");
            obj = ((Bundle) (obj1)).getString("value2");
            l = ((Bundle) (obj1)).getLong("value3");
            obj1 = SecurityApplication.a().getContentResolver();
            if (obj1 != null)
            {
                message = b.a(i, message, ((String) (obj)), l, System.currentTimeMillis(), true);
                if (message != null)
                {
                    try
                    {
                        ((ContentResolver) (obj1)).insert(StatisticianProvider.a, message);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Message message)
                    {
                        return;
                    }
                }
            }
            break;

        case 8: // '\b'
            obj1 = message.getData();
            message = ((Bundle) (obj1)).getString("value");
            obj = ((Bundle) (obj1)).getString("value2");
            s = ((Bundle) (obj1)).getString("value3");
            obj1 = SecurityApplication.a().getContentResolver();
            if (obj1 != null)
            {
                message = b.a(i, message, ((String) (obj)), s, System.currentTimeMillis(), true);
                if (message != null)
                {
                    try
                    {
                        ((ContentResolver) (obj1)).insert(StatisticianProvider.a, message);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Message message)
                    {
                        return;
                    }
                }
            }
            break;

        case 9: // '\t'
            obj = message.getData();
            message = ((Bundle) (obj)).getString("value");
            obj1 = ((Bundle) (obj)).getString("value2");
            obj = SecurityApplication.a().getContentResolver();
            if (obj != null)
            {
                message = b.a(i, message, ((String) (obj1)), System.currentTimeMillis(), true);
                if (message != null)
                {
                    try
                    {
                        ((ContentResolver) (obj)).insert(StatisticianProvider.a, message);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Message message)
                    {
                        return;
                    }
                }
            }
            break;

        case 10: // '\n'
            l = message.getData().getLong("value");
            message = SecurityApplication.a().getContentResolver();
            continue; /* Loop/switch isn't completed */
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (message == null) goto _L1; else goto _L3
_L3:
        obj = b.a(i, l, System.currentTimeMillis(), true);
        if (obj != null)
        {
            try
            {
                message.insert(StatisticianProvider.a, ((android.content.ContentValues) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                return;
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public (Looper looper)
    {
        super(looper);
    }
}
