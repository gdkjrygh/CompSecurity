// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

public class imw extends ResultReceiver
{

    imx a;

    public imw(Handler handler)
    {
        super(handler);
    }

    protected void onReceiveResult(int i, Bundle bundle)
    {
        if (a != null)
        {
            a.d_(bundle);
        }
    }
}
