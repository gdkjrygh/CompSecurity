// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public final class lang.Object
    implements Runnable
{

    final LF this$0;
    final String val$bugDescription;
    final String val$deviceInfo;
    final File val$imageFile;
    final File val$logFiles[];
    final String val$otherEmailToSendTo;
    final String val$projectName;
    final String val$remoteChatRecipient;
    final String val$stepsToRepro;

    public final void run()
    {
        Object obj;
        FileOutputStream fileoutputstream;
        Object obj1;
        StringBuilder stringbuilder;
        String s;
        obj = (new StringBuilder()).append(Bt.q()).append("\n");
        Bt.a();
        stringbuilder = new StringBuilder(((StringBuilder) (obj)).append(Bt.S()).append("\nandroid\n").append(val$otherEmailToSendTo).append("\n").append(val$projectName).append("\n").toString());
        stringbuilder.append(val$deviceInfo).append("\n**BUG_DESCRIPTION**\n").append(val$bugDescription).append("\n**STEPS_TO_REPRO**\n").append(val$stepsToRepro).append("\n**ATTACHMENTS**\n");
        obj1 = SnapchatApplication.get();
        s = LF.a(LF.a(((Context) (obj1))));
        fileoutputstream = null;
        obj = null;
        obj1 = ((Context) (obj1)).openFileOutput(s, 0);
        obj = obj1;
        fileoutputstream = ((FileOutputStream) (obj1));
        ((FileOutputStream) (obj1)).write(stringbuilder.toString().getBytes());
        obj = obj1;
        fileoutputstream = ((FileOutputStream) (obj1));
        ((FileOutputStream) (obj1)).flush();
        Pf.a(((java.io.Closeable) (obj1)));
_L2:
        a(val$imageFile, stringbuilder, val$logFiles, val$remoteChatRecipient, s);
        return;
        IOException ioexception;
        ioexception;
        fileoutputstream = ((FileOutputStream) (obj));
        Timber.a("ManiphestAdapter", ioexception);
        Pf.a(((java.io.Closeable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        Pf.a(fileoutputstream);
        throw exception;
    }

    public >()
    {
        this$0 = final_lf;
        val$otherEmailToSendTo = s;
        val$projectName = s1;
        val$deviceInfo = s2;
        val$bugDescription = s3;
        val$stepsToRepro = s4;
        val$imageFile = file;
        val$logFiles = afile;
        val$remoteChatRecipient = String.this;
        super();
    }
}
