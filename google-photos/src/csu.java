// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.ConditionVariable;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;

final class csu
    implements HttpUrlRequestListener
{

    private ConditionVariable a;

    csu(cst cst, ConditionVariable conditionvariable)
    {
        a = conditionvariable;
        super();
    }

    public final void a(HttpUrlRequest httpurlrequest)
    {
    }

    public final void b(HttpUrlRequest httpurlrequest)
    {
        a.open();
    }
}
