// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.handwriting.service;

import android.app.Service;

// Referenced classes of package com.google.android.apps.handwriting.service:
//            f, d

public abstract class HandwritingRecognitionService extends Service
{

    private final f a = new f(this);
    private final d b = new d(this);
    private int c;

    public HandwritingRecognitionService()
    {
        c = 0;
    }

    static d a(HandwritingRecognitionService handwritingrecognitionservice)
    {
        return handwritingrecognitionservice.b;
    }

    static int b(HandwritingRecognitionService handwritingrecognitionservice)
    {
        int i = handwritingrecognitionservice.c + 1;
        handwritingrecognitionservice.c = i;
        return i;
    }
}
