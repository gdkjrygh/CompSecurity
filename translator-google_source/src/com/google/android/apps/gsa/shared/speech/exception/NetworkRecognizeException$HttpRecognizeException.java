// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.speech.exception;


// Referenced classes of package com.google.android.apps.gsa.shared.speech.exception:
//            NetworkRecognizeException

public class  extends NetworkRecognizeException
{

    public int getErrorType()
    {
        return 212;
    }

    public boolean isAuthError()
    {
        return getErrorCode() == 401;
    }

    public (int i)
    {
        super(i);
    }
}
