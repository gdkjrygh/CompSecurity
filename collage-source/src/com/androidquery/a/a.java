// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.androidquery.a;

import com.androidquery.callback.AbstractAjaxCallback;
import java.net.HttpURLConnection;
import java.util.LinkedHashSet;
import org.apache.http.HttpRequest;

public abstract class a
{

    private LinkedHashSet a;

    public a()
    {
    }

    public String a(String s)
    {
        return s;
    }

    public void a(AbstractAjaxCallback abstractajaxcallback)
    {
        this;
        JVM INSTR monitorenter ;
        if (a != null) goto _L2; else goto _L1
_L1:
        a = new LinkedHashSet();
        a.add(abstractajaxcallback);
        b();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a.add(abstractajaxcallback);
        if (true) goto _L4; else goto _L3
_L3:
        abstractajaxcallback;
        throw abstractajaxcallback;
    }

    public void a(AbstractAjaxCallback abstractajaxcallback, HttpURLConnection httpurlconnection)
    {
    }

    public void a(AbstractAjaxCallback abstractajaxcallback, HttpRequest httprequest)
    {
    }

    public abstract boolean a();

    public abstract boolean a(AbstractAjaxCallback abstractajaxcallback, com.androidquery.callback.a a1);

    public String b(String s)
    {
        return s;
    }

    protected abstract void b();

    public abstract boolean b(AbstractAjaxCallback abstractajaxcallback);
}
