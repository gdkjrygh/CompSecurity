// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;


// Referenced classes of package com.soundcloud.android.tracks:
//            DelayedLoadingDialogPresenter

public static class I
{

    private String loadingMessage;
    private android.content.enter.Builder.onErrorToastText onCancelListener;
    private String onErrorToastText;

    public DelayedLoadingDialogPresenter create()
    {
        return new DelayedLoadingDialogPresenter(loadingMessage, onErrorToastText, onCancelListener);
    }

    public onCancelListener setLoadingMessage(String s)
    {
        loadingMessage = s;
        return this;
    }

    public loadingMessage setOnCancelListener(android.content.enter.Builder builder)
    {
        onCancelListener = builder;
        return this;
    }

    public onCancelListener setOnErrorToastText(String s)
    {
        onErrorToastText = s;
        return this;
    }

    I()
    {
    }
}
