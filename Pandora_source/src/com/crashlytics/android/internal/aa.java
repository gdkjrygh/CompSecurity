// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.crashlytics.android.internal:
//            ab

public interface aa
{

    public static final aa a = new ab();

    public abstract HttpURLConnection a(URL url)
        throws IOException;

}
