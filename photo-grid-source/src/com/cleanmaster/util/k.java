// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.util;

import android.text.TextUtils;
import com.cleanmaster.ui.app.market.data.MarketResponse;
import java.util.Hashtable;
import java.util.Map;

public class k
{

    private static k b;
    private Map a;

    public k()
    {
    }

    public static k a()
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        com/cleanmaster/util/k;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new k();
        }
        com/cleanmaster/util/k;
        JVM INSTR monitorexit ;
_L2:
        return b;
        Exception exception;
        exception;
        com/cleanmaster/util/k;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public MarketResponse a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null) goto _L2; else goto _L1
_L1:
        s = (MarketResponse)a.get(s);
_L4:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public void a(String s, MarketResponse marketresponse)
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new Hashtable();
        }
        if (TextUtils.isEmpty(s) || marketresponse == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        a.put(s, marketresponse);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        s = (MarketResponse)a.get(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        a.remove(s);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }
}
