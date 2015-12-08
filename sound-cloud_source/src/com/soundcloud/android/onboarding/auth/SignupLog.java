// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import com.soundcloud.android.Consts;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.utils.IOUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public final class SignupLog
{

    private static final File SIGNUP_LOG;
    protected static final int THROTTLE_AFTER_ATTEMPT = 5;
    protected static final int THROTTLE_WINDOW = 0x36ee80;

    private SignupLog()
    {
    }

    static long[] readLog()
    {
        Object obj1 = null;
        if (!SIGNUP_LOG.exists()) goto _L2; else goto _L1
_L1:
        Object obj = new ObjectInputStream(new FileInputStream(SIGNUP_LOG));
        obj1 = obj;
        long al[] = (long[])(long[])((ObjectInputStream) (obj)).readObject();
        IOUtils.close(((java.io.Closeable) (obj)));
        return al;
        obj;
        obj = null;
_L6:
        obj1 = obj;
        String s = SoundCloudApplication.TAG;
        IOUtils.close(((java.io.Closeable) (obj)));
_L2:
        return null;
        obj;
_L4:
        IOUtils.close(((java.io.Closeable) (obj1)));
        throw obj;
        obj;
        if (true) goto _L4; else goto _L3
_L3:
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        classnotfoundexception = null;
        continue; /* Loop/switch isn't completed */
        Object obj2;
        obj2;
        continue; /* Loop/switch isn't completed */
        obj2;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static boolean shouldThrottleSignup()
    {
        long al[] = readLog();
        if (al != null)
        {
            int i;
            for (i = al.length - 1; i >= 0 && System.currentTimeMillis() - al[i] < 0x36ee80L && al.length - i <= 5; i--) { }
            if (al.length - i > 5)
            {
                return true;
            }
        }
        return false;
    }

    static boolean writeLog(long al[])
    {
        Object obj = null;
        Object obj1;
        IOUtils.mkdirs(SIGNUP_LOG.getParentFile());
        obj1 = new ObjectOutputStream(new FileOutputStream(SIGNUP_LOG));
        obj = obj1;
        ((ObjectOutputStream) (obj1)).writeObject(al);
        IOUtils.close(((java.io.Closeable) (obj1)));
        return true;
        al;
        al = null;
_L4:
        obj = al;
        obj1 = SoundCloudApplication.TAG;
        if (al != null)
        {
            IOUtils.close(al);
        }
        return false;
        al;
_L2:
        if (obj != null)
        {
            IOUtils.close(((java.io.Closeable) (obj)));
        }
        throw al;
        al;
        if (true) goto _L2; else goto _L1
_L1:
        al;
        al = ((long []) (obj1));
        if (true) goto _L4; else goto _L3
_L3:
    }

    static boolean writeNewSignup(long l)
    {
        long al1[] = readLog();
        long al[];
        if (al1 == null)
        {
            al = new long[1];
        } else
        {
            al = new long[al1.length + 1];
            System.arraycopy(al1, 0, al, 0, al1.length);
        }
        al[al.length - 1] = l;
        return writeLog(al);
    }

    public static Thread writeNewSignupAsync()
    {
        Thread thread = new Thread(new _cls1());
        thread.start();
        return thread;
    }

    static 
    {
        SIGNUP_LOG = new File(Consts.EXTERNAL_STORAGE_DIRECTORY, ".dr");
    }

    private class _cls1
        implements Runnable
    {

        public final void run()
        {
            SignupLog.writeNewSignup(System.currentTimeMillis());
        }

        _cls1()
        {
        }
    }

}
