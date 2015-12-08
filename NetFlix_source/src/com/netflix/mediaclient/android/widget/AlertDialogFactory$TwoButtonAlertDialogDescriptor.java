// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;


// Referenced classes of package com.netflix.mediaclient.android.widget:
//            AlertDialogFactory

public static class negButtonHandler extends negButtonHandler
{

    Runnable negButtonHandler;
    String negButtonLabel;

    public (String s, String s1, String s2, Runnable runnable, String s3, Runnable runnable1)
    {
        super(s, s1, s2, runnable);
        negButtonLabel = s3;
        negButtonHandler = runnable1;
    }
}
