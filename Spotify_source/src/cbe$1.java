// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

final class ang.Object
    implements Runnable
{

    private cbe a;

    public final void run()
    {
        cbe cbe1 = a;
_L5:
        Object obj;
        Object obj1;
        do
        {
            obj1 = (cbk)cbe1.a.take();
            obj = ((cbk) (obj1)).c();
        } while (TextUtils.isEmpty(((CharSequence) (obj))));
        Object obj2 = cbe1.a(cbe1.b, ((cbk) (obj1)).d());
        obj1 = Uri.parse(cbe1.c).buildUpon();
        java.util.try try1;
        for (obj2 = ((Map) (obj2)).entrySet().iterator(); ((Iterator) (obj2)).hasNext(); ((android.net.ilder) (obj1)).appendQueryParameter((String)try1.getKey(), (String)try1.getValue()))
        {
            try1 = (java.util.try)((Iterator) (obj2)).next();
        }

        break MISSING_BLOCK_LABEL_127;
        obj;
        bka.c("CsiReporter:reporter interrupted", ((Throwable) (obj)));
        return;
        Object obj3;
        obj1 = new StringBuilder(((android.net.ilder) (obj1)).build().toString());
        ((StringBuilder) (obj1)).append("&it=").append(((String) (obj)));
        obj3 = ((StringBuilder) (obj1)).toString();
        if (!cbe1.f.get()) goto _L2; else goto _L1
_L1:
        obj = cbe1.g;
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj1 = new FileOutputStream(((java.io.File) (obj)), true);
        obj = obj1;
        ((FileOutputStream) (obj1)).write(((String) (obj3)).getBytes());
        obj = obj1;
        ((FileOutputStream) (obj1)).write(10);
        try
        {
            ((FileOutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            bka.c("CsiReporter: Cannot close file: sdk_csi_data.txt.", ((Throwable) (obj)));
        }
          goto _L5
        obj3;
        obj1 = null;
_L7:
        obj = obj1;
        bka.c("CsiReporter: Cannot write to file: sdk_csi_data.txt.", ((Throwable) (obj3)));
        if (obj1 != null)
        {
            try
            {
                ((FileOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                bka.c("CsiReporter: Cannot close file: sdk_csi_data.txt.", ((Throwable) (obj)));
            }
        }
          goto _L5
        Exception exception;
        exception;
        obj = null;
_L6:
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            catch (IOException ioexception)
            {
                bka.c("CsiReporter: Cannot close file: sdk_csi_data.txt.", ioexception);
            }
        }
        throw exception;
_L4:
        bka.e("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
          goto _L5
_L2:
        bkv.e();
        cjj.a(cbe1.d, cbe1.e, ((String) (obj3)));
          goto _L5
        exception;
          goto _L6
        obj3;
          goto _L7
    }

    (cbe cbe1)
    {
        a = cbe1;
        super();
    }
}
