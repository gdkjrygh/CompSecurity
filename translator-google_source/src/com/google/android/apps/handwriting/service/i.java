// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.handwriting.service;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;

// Referenced classes of package com.google.android.apps.handwriting.service:
//            p, HandwritingRecognizer, o, j

final class i
    implements ServiceConnection
{

    final HandwritingRecognizer a;

    i(HandwritingRecognizer handwritingrecognizer)
    {
        a = handwritingrecognizer;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        a.c = p.a(ibinder);
        componentname = new Intent();
        ibinder = a.a;
        componentname.putExtra("LANGUAGE_CODE", ((HandwritingRecognizer.HandwritingRecognizerSettings) (ibinder)).a);
        componentname.putExtra("RECOGNIZER_TYPE", ((HandwritingRecognizer.HandwritingRecognizerSettings) (ibinder)).b.ordinal());
        componentname.putExtra("CLIENT_ID", ((HandwritingRecognizer.HandwritingRecognizerSettings) (ibinder)).c);
        componentname.putExtra("CLIENT_VERSION", ((HandwritingRecognizer.HandwritingRecognizerSettings) (ibinder)).d);
        try
        {
            a.c.a(componentname, a.b);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            a.b.a(3, null);
        }
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        a.c = null;
        a.d = null;
    }
}
