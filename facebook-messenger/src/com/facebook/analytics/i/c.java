// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.analytics.av;
import com.facebook.inject.t;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.Set;

public final class c
{

    public c()
    {
    }

    public static av a(Context context)
    {
        Preconditions.checkNotNull(context);
        return (av)t.a(context).a(com/facebook/analytics/av);
    }

    public static ObjectNode a(Intent intent)
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        if (intent != null)
        {
            if (intent.getAction() != null)
            {
                objectnode.put("action", intent.getAction());
            }
            if (intent.getComponent() != null)
            {
                objectnode.put("component", intent.getComponent().toString());
            }
            if (intent.getExtras() != null)
            {
                String s;
                for (Iterator iterator = intent.getExtras().keySet().iterator(); iterator.hasNext(); objectnode.put(s, intent.getExtras().get(s).toString()))
                {
                    s = (String)iterator.next();
                }

            }
        }
        return objectnode;
    }
}
