// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.api2;

import android.widget.Toast;
import com.snapchat.android.SnapchatApplication;

// Referenced classes of package com.snapchat.android.api2:
//            LogoutTask

final class val.printableReason
    implements Runnable
{

    final LogoutTask this$0;
    final String val$printableReason;

    public final void run()
    {
        Toast toast = Toast.makeText(SnapchatApplication.get(), (new StringBuilder("[DEBUG] LogoutReason ")).append(val$printableReason).toString(), 1);
        toast.setGravity(17, 0, 0);
        toast.show();
    }

    n()
    {
        this$0 = final_logouttask;
        val$printableReason = String.this;
        super();
    }
}
