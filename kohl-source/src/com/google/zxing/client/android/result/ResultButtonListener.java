// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.result;

import android.view.View;

// Referenced classes of package com.google.zxing.client.android.result:
//            ResultHandler

public final class ResultButtonListener
    implements android.view.View.OnClickListener
{

    private final int index;
    private final ResultHandler resultHandler;

    public ResultButtonListener(ResultHandler resulthandler, int i)
    {
        resultHandler = resulthandler;
        index = i;
    }

    public void onClick(View view)
    {
        resultHandler.handleButtonPress(index);
    }
}
