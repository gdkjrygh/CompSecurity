// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;

public final class ncx
    implements android.media.MediaScannerConnection.MediaScannerConnectionClient
{

    public ArrayList a;
    public MediaScannerConnection b;
    public boolean c;
    public final Object d = new Object();

    public ncx(Context context)
    {
        a = new ArrayList();
        b = new MediaScannerConnection(context, this);
    }

    public final void onMediaScannerConnected()
    {
        Object obj = d;
        obj;
        JVM INSTR monitorenter ;
        c = true;
        if (a.isEmpty())
        {
            break MISSING_BLOCK_LABEL_73;
        }
        String s;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); b.scanFile(s, null))
        {
            s = (String)iterator.next();
        }

        break MISSING_BLOCK_LABEL_66;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        a.clear();
        obj;
        JVM INSTR monitorexit ;
    }

    public final void onScanCompleted(String s, Uri uri)
    {
    }
}
