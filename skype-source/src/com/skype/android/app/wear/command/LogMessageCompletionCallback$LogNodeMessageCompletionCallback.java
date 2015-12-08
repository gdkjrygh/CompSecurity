// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.command;

import android.util.Log;
import com.google.android.gms.wearable.l;

// Referenced classes of package com.skype.android.app.wear.command:
//            LogMessageCompletionCallback

public static class <init> extends LogMessageCompletionCallback
    implements <init>
{

    public void onNodeError(<init> <init>1, l l1)
    {
        Log.i(getTag(), (new StringBuilder("Command '")).append(getCommandDescription()).append("' failed to be sent to node ").append(<init>1.getCommandDescription().b()).toString());
    }

    public void onNodeResult(getCommandDescription getcommanddescription, l l1)
    {
        Log.i(getTag(), (new StringBuilder("Command '")).append(getCommandDescription()).append("' sent successfully to node ").append(getcommanddescription.getCommandDescription().b()).toString());
    }

    public getCommandDescription then(getCommandDescription getcommanddescription)
    {
        super.then(getcommanddescription);
        return this;
    }

    private (String s, String s1)
    {
        super(s, s1, null);
    }

    (String s, String s1,  )
    {
        this(s, s1);
    }
}
