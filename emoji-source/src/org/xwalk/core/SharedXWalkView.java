// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;

// Referenced classes of package org.xwalk.core:
//            XWalkView, ReflectionHelper, XWalkApplication, XWalkActivity, 
//            SharedXWalkExceptionHandler

public class SharedXWalkView extends XWalkView
{

    static final boolean $assertionsDisabled;
    private static boolean initialized = false;

    public SharedXWalkView(Context context, XWalkActivity xwalkactivity)
    {
        super(context, verifyActivity(xwalkactivity));
    }

    public SharedXWalkView(XWalkActivity xwalkactivity, AttributeSet attributeset, SharedXWalkExceptionHandler sharedxwalkexceptionhandler)
    {
        super(verifyActivity(xwalkactivity), attributeset);
    }

    public static boolean containsLibrary()
    {
        return !ReflectionHelper.shouldUseLibrary();
    }

    public static void initialize(Context context, SharedXWalkExceptionHandler sharedxwalkexceptionhandler)
    {
        if (initialized)
        {
            return;
        }
        if (!$assertionsDisabled && !(context.getApplicationContext() instanceof XWalkApplication))
        {
            throw new AssertionError();
        }
        ReflectionHelper.allowCrossPackage();
        if (sharedxwalkexceptionhandler != null)
        {
            ReflectionHelper.setExceptionHandler(sharedxwalkexceptionhandler);
        }
        initialized = true;
    }

    public static boolean isUsingLibrary()
    {
        return ReflectionHelper.isUsingLibrary();
    }

    private static Activity verifyActivity(XWalkActivity xwalkactivity)
    {
        if (!initialized)
        {
            initialize(xwalkactivity, null);
        }
        return xwalkactivity;
    }

    static 
    {
        boolean flag;
        if (!org/xwalk/core/SharedXWalkView.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
