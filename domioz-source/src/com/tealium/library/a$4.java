// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tealium.library;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.tealium.library:
//            u, d

final class tReceiver extends BroadcastReceiver
{

    public final void onReceive(Context context, Intent intent)
    {
        int j = 0;
        context = intent.getStringExtra("SCRIPT");
        if (context == null)
        {
            int i;
            try
            {
                u.e("Received the intent \"tealium.intent.action.EVAL_JS\" but no \"script\" value was provided.");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                u.a(context);
            }
            break MISSING_BLOCK_LABEL_89;
        }
        intent = new byte[context.length() / 2];
        i = 0;
_L2:
        if (j >= context.length())
        {
            break; /* Loop/switch isn't completed */
        }
        intent[i] = Byte.parseByte(context.substring(j, j + 2), 16);
        j += 2;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        d.a(true, new String(intent));
        return;
    }

    tReceiver()
    {
    }
}
