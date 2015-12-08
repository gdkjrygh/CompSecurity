// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;
import com.snapchat.android.SnapchatApplication;

final class lang.Object
    implements Runnable
{

    final LF this$0;
    final String val$message;

    public final void run()
    {
        Toast.makeText(SnapchatApplication.get(), val$message, 1).show();
    }

    >()
    {
        this$0 = final_lf;
        val$message = String.this;
        super();
    }
}
