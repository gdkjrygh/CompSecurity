// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.networkrecognizer;


// Referenced classes of package com.google.android.libraries.handwriting.networkrecognizer:
//            CloudRecognizer

public class errorMessage extends Exception
{

    final String errorMessage;
    final CloudRecognizer this$0;

    (String s)
    {
        this$0 = CloudRecognizer.this;
        super();
        errorMessage = s;
    }
}
