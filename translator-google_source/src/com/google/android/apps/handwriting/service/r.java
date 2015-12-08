// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.handwriting.service;

import android.content.Context;
import android.os.Handler;
import com.google.android.libraries.handwriting.base.HandwritingRecognizer;
import com.google.android.libraries.handwriting.base.RecognitionResult;
import com.google.android.libraries.handwriting.base.StrokeList;
import com.google.android.libraries.handwriting.base.b;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

// Referenced classes of package com.google.android.apps.handwriting.service:
//            u, v, s, HandwritingRecognizer, 
//            t, a

public final class r extends HandwritingRecognizer
{

    public final b a;
    public final Context b;
    final TreeMap c = new TreeMap();
    final TreeMap d = new TreeMap();
    com.google.android.apps.handwriting.service.HandwritingRecognizer e;
    public t f;
    private final a h = new u(this);
    private final Handler i;

    public r(Context context, b b1)
    {
        a = b1;
        b = context;
        i = new v(this, context.getMainLooper());
        a(context);
    }

    private RecognitionResult a(int j)
    {
        (new StringBuilder(65)).append("waitForServiceRecognitionFinishedOrFailed externalId: ").append(j);
_L2:
        synchronized (c)
        {
            if (!c.containsKey(Integer.valueOf(j)))
            {
                break MISSING_BLOCK_LABEL_125;
            }
        }
        synchronized (c)
        {
            obj1 = (RecognitionResult)c.remove(Integer.valueOf(j));
        }
        try
        {
            obj = String.valueOf(obj1);
            (new StringBuilder(String.valueOf(obj).length() + 8)).append("result: ").append(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new com.google.android.libraries.handwriting.base.HandwritingRecognizer.RecognitionFailedException("Interrupted", ((Exception) (obj)));
        }
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        throw new com.google.android.libraries.handwriting.base.HandwritingRecognizer.RecognitionFailedException("no result", null);
        c.wait();
        obj;
        JVM INSTR monitorexit ;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        return ((RecognitionResult) (obj1));
    }

    public final RecognitionResult a(StrokeList strokelist)
    {
        strokelist = new FutureTask(new s(this, strokelist));
        i.post(strokelist);
        try
        {
            strokelist = (Integer)strokelist.get();
        }
        // Misplaced declaration of an exception variable
        catch (StrokeList strokelist)
        {
            throw new com.google.android.libraries.handwriting.base.HandwritingRecognizer.RecognitionFailedException("InterruptedException while calling the recognizer", strokelist);
        }
        // Misplaced declaration of an exception variable
        catch (StrokeList strokelist)
        {
            throw new com.google.android.libraries.handwriting.base.HandwritingRecognizer.RecognitionFailedException("ExecutionException while calling the recognizer", strokelist);
        }
        return a(strokelist.intValue());
    }

    public final b a()
    {
        return a;
    }

    public final void a(Context context)
    {
        if (e != null)
        {
            e.a();
            e = null;
        }
        HandwritingRecognizer.HandwritingRecognizerSettings handwritingrecognizersettings = new HandwritingRecognizer.HandwritingRecognizerSettings(a.a, HandwritingRecognizer.HandwritingRecognizerSettings.RecognizerType.ON_DEVICE);
        a a1 = h;
        if (context == null)
        {
            throw new IllegalArgumentException("Context cannot be null");
        } else
        {
            e = new com.google.android.apps.handwriting.service.HandwritingRecognizer(context, handwritingrecognizersettings, a1);
            return;
        }
    }

    public final boolean b()
    {
        return false;
    }

    public final boolean c()
    {
        return false;
    }

    protected final void finalize()
    {
        e.a();
        e = null;
        super.finalize();
    }
}
