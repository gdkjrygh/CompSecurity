// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.gui;

import android.os.Handler;
import com.google.android.libraries.handwriting.base.HandwritingRecognizer;
import com.google.android.libraries.handwriting.base.RecognitionResult;
import com.google.android.libraries.handwriting.base.ScoredCandidate;
import com.google.android.libraries.handwriting.base.StrokeList;

// Referenced classes of package com.google.android.libraries.handwriting.gui:
//            q, p, t, r, 
//            o

public final class n
    implements Runnable
{

    final o a;
    final StrokeList b;
    boolean c;
    private final HandwritingRecognizer d;
    private final int e;
    private final Handler f;

    public n(int i, HandwritingRecognizer handwritingrecognizer, StrokeList strokelist, o o, Handler handler)
    {
        e = i;
        b = strokelist;
        a = o;
        d = handwritingrecognizer;
        f = handler;
    }

    static int a(n n1)
    {
        return n1.e;
    }

    public final void run()
    {
        int i = e;
        (new StringBuilder(33)).append("run() with requestID: ").append(i);
        if (b.isEmpty())
        {
            f.post(new q(this, this, b, null));
            return;
        }
        if (c)
        {
            f.post(new q(this, this, b, null));
            return;
        }
        try
        {
            long l = System.currentTimeMillis();
            Object obj = d;
            StrokeList strokelist = b;
            new p(this);
            obj = ((HandwritingRecognizer) (obj)).a(strokelist);
            obj.a = e;
            obj.j = b;
            obj.g = b.getFirstStrokeId();
            obj.h = b.getLastStrokeId();
            obj.b = l;
            obj.c = System.currentTimeMillis();
            obj = t.a(((RecognitionResult) (obj)), b.getInputType());
            if (((RecognitionResult) (obj)).a() > 0)
            {
                ((RecognitionResult) (obj)).a(0).a.length();
            }
            l = ((RecognitionResult) (obj)).c;
            l = ((RecognitionResult) (obj)).b;
            if (((RecognitionResult) (obj)).a() > 0)
            {
                ((RecognitionResult) (obj)).a(0).a.startsWith(" ");
            }
            b.size();
            f.post(new q(this, this, b, ((RecognitionResult) (obj))));
            return;
        }
        catch (com.google.android.libraries.handwriting.base.HandwritingRecognizer.RecognitionFailedException recognitionfailedexception)
        {
            f.post(new r(this, this, b, recognitionfailedexception));
        }
    }
}
