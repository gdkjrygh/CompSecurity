// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.content.Context;
import android.content.Intent;
import java.util.HashMap;

public class CheckedReceiverFilter
{
    public static interface IntentHandler
    {

        public abstract void onReceiveFiltered(Context context, Intent intent, int i);
    }


    HashMap a;
    private final IntentHandler b;

    public CheckedReceiverFilter(String as[], IntentHandler intenthandler)
    {
        a = new HashMap();
        int i;
        int j;
        if (as == null)
        {
            i = 0;
        } else
        {
            i = as.length;
        }
        for (j = 0; j < i; j++)
        {
            a.put(as[j], Integer.valueOf(j));
        }

        b = intenthandler;
    }

    public final void a(Context context, Intent intent)
    {
        if (intent != null)
        {
            Object obj = intent.getAction();
            obj = (Integer)a.get(obj);
            if (obj != null)
            {
                b.onReceiveFiltered(context, intent, ((Integer) (obj)).intValue());
            }
        }
    }
}
