// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;

public abstract class XWalkActivity extends Activity
{

    public XWalkActivity()
    {
    }

    public Resources getResources()
    {
        return getApplicationContext().getResources();
    }
}
