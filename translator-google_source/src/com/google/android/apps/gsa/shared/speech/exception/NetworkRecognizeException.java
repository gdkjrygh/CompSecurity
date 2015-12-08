// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.speech.exception;


// Referenced classes of package com.google.android.apps.gsa.shared.speech.exception:
//            RecognizeException

public class NetworkRecognizeException extends RecognizeException
{

    public NetworkRecognizeException(int i)
    {
        super(2, i);
    }

    public NetworkRecognizeException(String s, int i)
    {
        super(s, 2, i);
    }

    public NetworkRecognizeException(Throwable throwable, int i)
    {
        super(throwable, 2, i);
    }
}
