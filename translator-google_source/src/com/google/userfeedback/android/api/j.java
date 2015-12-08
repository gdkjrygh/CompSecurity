// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api;

import android.app.Service;
import android.os.Looper;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.google.userfeedback.android.api:
//            SendUserFeedbackService, ad, z, i

final class j
    implements Runnable
{

    final z a;
    final Service b;
    final SendUserFeedbackService c;

    j(SendUserFeedbackService senduserfeedbackservice, z z1, Service service)
    {
        c = senduserfeedbackservice;
        a = z1;
        b = service;
        super();
    }

    private void a(File file)
    {
        if (file != null)
        {
            c.a(SendUserFeedbackService.a(c));
            file.delete();
            b.stopSelf();
        }
    }

    public final void run()
    {
        File file;
        File file1;
        Object obj;
        Object obj1;
        ad ad1;
        Looper.prepare();
        ad1 = new ad(c.b);
        obj1 = null;
        obj = null;
        file1 = ((File) (obj));
        file = obj1;
        a.a(true);
        file1 = ((File) (obj));
        file = obj1;
        obj = ad1.a(a);
        int k = 0;
_L10:
        if (k >= 3) goto _L2; else goto _L1
_L1:
        file1 = ((File) (obj));
        file = ((File) (obj));
        int l = c.a(((File) (obj))) / 100;
        if (l != 2) goto _L4; else goto _L3
_L3:
        file1 = ((File) (obj));
        file = ((File) (obj));
        SendUserFeedbackService.a(c, i.gf_report_being_sent);
_L2:
        file1 = ((File) (obj));
        file = ((File) (obj));
        a(((File) (obj)));
        a(((File) (obj)));
_L7:
        Looper.loop();
        return;
_L4:
        if (l == 5)
        {
            k++;
            continue; /* Loop/switch isn't completed */
        }
          goto _L2
        IOException ioexception;
        ioexception;
        file = file1;
        ioexception = String.valueOf(ioexception.getMessage());
        file = file1;
        if (ioexception.length() == 0) goto _L6; else goto _L5
_L5:
        file = file1;
        "IOException: ".concat(ioexception);
_L8:
        a(file1);
          goto _L7
_L6:
        file = file1;
        new String("IOException: ");
          goto _L8
        Exception exception;
        exception;
        a(file);
        throw exception;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
