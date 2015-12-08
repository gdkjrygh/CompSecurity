// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yong.gift;

import android.os.Handler;
import android.os.Message;
import com.arist.util.BitmapService;
import com.arist.util.HttpService;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.yong.gift:
//            AsyncGiftImageLoader

class this._cls0 extends Thread
{

    final AsyncGiftImageLoader this$0;

    public void run()
    {
_L4:
        if (AsyncGiftImageLoader.access$0(AsyncGiftImageLoader.this)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        while (AsyncGiftImageLoader.access$1(AsyncGiftImageLoader.this).size() > 0 && AsyncGiftImageLoader.access$0(AsyncGiftImageLoader.this)) 
        {
            try
            {
                ageLoadTask ageloadtask = (ageLoadTask)AsyncGiftImageLoader.access$1(AsyncGiftImageLoader.this).remove(0);
                ageLoadTask.access._mth3(ageloadtask, BitmapService.getBitmap(HttpService.getBytes(ageLoadTask.access._mth1(ageloadtask), null, 1), 200, 200));
                Message message = Message.obtain();
                message.what = 0;
                message.obj = ageloadtask;
                AsyncGiftImageLoader.access$2(AsyncGiftImageLoader.this).sendMessage(message);
                AsyncGiftImageLoader.access$3(AsyncGiftImageLoader.this).put(ageLoadTask.access._mth1(ageloadtask), new SoftReference(ageLoadTask.access._mth2(ageloadtask)));
                AsyncGiftImageLoader.save(ageLoadTask.access._mth2(ageloadtask), ageLoadTask.access._mth4(ageloadtask));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
            }
        }
        if (!AsyncGiftImageLoader.access$0(AsyncGiftImageLoader.this)) goto _L1; else goto _L3
_L3:
        this;
        JVM INSTR monitorenter ;
        wait();
_L5:
        this;
        JVM INSTR monitorexit ;
          goto _L4
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        ((InterruptedException) (obj)).printStackTrace();
          goto _L5
    }

    ageLoadTask()
    {
        this$0 = AsyncGiftImageLoader.this;
        super();
    }
}
