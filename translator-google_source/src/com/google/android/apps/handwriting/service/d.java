// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.handwriting.service;

import android.os.Handler;

// Referenced classes of package com.google.android.apps.handwriting.service:
//            e, HandwritingRecognitionService

final class d extends Handler
{

    final HandwritingRecognitionService a;

    d(HandwritingRecognitionService handwritingrecognitionservice)
    {
        a = handwritingrecognitionservice;
        super(new e(handwritingrecognitionservice));
    }
}
