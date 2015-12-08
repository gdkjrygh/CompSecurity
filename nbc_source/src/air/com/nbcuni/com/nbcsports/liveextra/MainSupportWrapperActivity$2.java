// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package air.com.nbcuni.com.nbcsports.liveextra;

import android.content.Intent;

// Referenced classes of package air.com.nbcuni.com.nbcsports.liveextra:
//            MainSupportWrapperActivity

class val.intent
    implements Runnable
{

    final MainSupportWrapperActivity this$0;
    final Intent val$intent;

    public void run()
    {
        startActivity(val$intent);
        overridePendingTransition(0x10a0000, 0x10a0001);
    }

    I()
    {
        this$0 = final_mainsupportwrapperactivity;
        val$intent = Intent.this;
        super();
    }
}
