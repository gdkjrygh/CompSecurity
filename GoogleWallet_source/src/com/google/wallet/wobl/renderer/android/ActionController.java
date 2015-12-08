// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.renderer.android;

import android.view.View;
import java.net.URI;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.wallet.wobl.renderer.android:
//            OnActionHandler

public class ActionController
{

    private final OnActionHandler actionHandler;
    private final Pattern pattern;

    public ActionController(Pattern pattern1, OnActionHandler onactionhandler)
    {
        pattern = pattern1;
        actionHandler = onactionhandler;
    }

    public boolean matches(String s)
    {
        return pattern.matcher(s).matches();
    }

    public void onAction(URI uri, View view)
    {
        actionHandler.onAction(uri, view);
    }
}
