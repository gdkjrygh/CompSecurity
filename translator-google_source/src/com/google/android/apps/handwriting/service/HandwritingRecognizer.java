// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.handwriting.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.libraries.handwriting.base.StrokeList;

// Referenced classes of package com.google.android.apps.handwriting.service:
//            j, i, o, a

public final class HandwritingRecognizer
{

    final HandwritingRecognizerSettings a;
    final j b;
    o c;
    i d;
    String e;
    private final Context f;
    private final ComponentName g = null;

    HandwritingRecognizer(Context context, HandwritingRecognizerSettings handwritingrecognizersettings, a a1)
    {
        f = context;
        a = handwritingrecognizersettings;
        b = new j(this, a1);
        d = new i(this);
        context = new Intent("com.google.android.apps.handwriting.service.HandwritingRecognitionService");
        if (g == null)
        {
            context.setComponent(new ComponentName("com.google.android.apps.handwriting.ime", "com.google.android.apps.handwriting.ime.GoogleHandwritingRecognitionService"));
        } else
        {
            context.setComponent(g);
        }
        if (!f.bindService(context, d, 1))
        {
            d = null;
            c = null;
            b.a(1, null);
        }
    }

    public final int a(StrokeList strokelist)
    {
        int k;
        try
        {
            k = c.a(e, strokelist, b);
        }
        // Misplaced declaration of an exception variable
        catch (StrokeList strokelist)
        {
            b.a(-1, 2, null);
            return -1;
        }
        return k;
    }

    public final void a()
    {
        try
        {
            if (c != null)
            {
                c.a(e);
            }
        }
        catch (RemoteException remoteexception) { }
        if (d != null)
        {
            f.unbindService(d);
            d = null;
        }
    }

    protected final void finalize()
    {
        a();
        super.finalize();
    }
}
