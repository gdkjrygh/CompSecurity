// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import java.util.Map;

// Referenced classes of package com.microsoft.advertising.android:
//            AdWebView

public abstract class az
{

    protected AdWebView a;
    protected Context b;

    public az(AdWebView adwebview)
    {
        a = adwebview;
        b = adwebview.getContext();
    }

    public abstract void a(String s, Map map);
}
