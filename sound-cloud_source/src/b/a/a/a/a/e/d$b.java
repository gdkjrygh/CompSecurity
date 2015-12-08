// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.e;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

// Referenced classes of package b.a.a.a.a.e:
//            d, f

public static interface ion
{

    public static final ion a = new f();

    public abstract HttpURLConnection a(URL url)
        throws IOException;

    public abstract HttpURLConnection a(URL url, Proxy proxy)
        throws IOException;

}
