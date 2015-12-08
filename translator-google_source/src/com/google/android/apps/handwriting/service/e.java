// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.handwriting.service;

import android.os.Message;

// Referenced classes of package com.google.android.apps.handwriting.service:
//            h, b, g, c, 
//            HandwritingRecognitionService

final class e
    implements android.os.Handler.Callback
{

    final HandwritingRecognitionService a;

    e(HandwritingRecognitionService handwritingrecognitionservice)
    {
        a = handwritingrecognitionservice;
        super();
    }

    public final boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 2: // '\002'
            message = (h)message.obj;
            new b(a, ((h) (message)).b);
            return true;

        case 1: // '\001'
            message = (g)message.obj;
            new b(a, ((g) (message)).b);
            return true;

        case 3: // '\003'
            message = ((Message) (message.obj));
            return true;

        case 4: // '\004'
            message = (c)message.obj;
            break;
        }
        new b(a, ((c) (message)).b);
        return true;
    }
}
