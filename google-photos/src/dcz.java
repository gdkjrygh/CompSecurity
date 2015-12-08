// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.ConditionVariable;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestListener;

final class dcz
    implements HttpUrlRequestListener
{

    private ConditionVariable a;

    dcz(dcy dcy, ConditionVariable conditionvariable)
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
