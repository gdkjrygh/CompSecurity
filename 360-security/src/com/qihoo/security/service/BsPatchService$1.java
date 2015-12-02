// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.service;

import android.content.Context;
import android.content.Intent;
import com.qihoo.security.dialog.DataFailDialog;
import com.qihoo360.mobilesafe.support.BsPatch;
import java.io.File;

// Referenced classes of package com.qihoo.security.service:
//            BsPatchService

class c
    implements Runnable
{

    final File a;
    final String b;
    final String c;
    final BsPatchService d;

    public void run()
    {
        BsPatch.applyPatch(b, b, c);
        if (!a.exists() || !a.isFile())
        {
            Intent intent = new Intent(BsPatchService.a(d), com/qihoo/security/dialog/DataFailDialog);
            intent.addFlags(0x10000000);
            BsPatchService.b(d).startActivity(intent);
        }
        d.stopSelf();
    }

    (BsPatchService bspatchservice, File file, String s, String s1)
    {
        d = bspatchservice;
        a = file;
        b = s;
        c = s1;
        super();
    }
}
