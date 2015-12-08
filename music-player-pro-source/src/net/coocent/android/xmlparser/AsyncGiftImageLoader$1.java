// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.coocent.android.xmlparser;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package net.coocent.android.xmlparser:
//            AsyncGiftImageLoader

class this._cls0 extends Handler
{

    final AsyncGiftImageLoader this$0;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            break;
        }
        try
        {
            ageLoadTask ageloadtask = (ageLoadTask)message.obj;
            ageLoadTask.access._mth0(ageloadtask).imageLoaded(ageLoadTask.access._mth1(ageloadtask), ageLoadTask.access._mth2(ageloadtask));
        }
        catch (Exception exception) { }
        try
        {
            message = (ageLoadTask)message.obj;
            ageLoadTask.access._mth0(message).imageLoaded(ageLoadTask.access._mth1(message), ageLoadTask.access._mth2(message));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            return;
        }
    }

    llback()
    {
        this$0 = AsyncGiftImageLoader.this;
        super();
    }
}
