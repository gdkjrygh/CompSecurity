// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.renderer.android;

import android.content.ComponentName;
import android.content.Intent;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.wallet.wobl.renderer.android:
//            IntentGenerator, ActionController, AnalyticsLogger

public class RendererClient
{

    private final List actionControllers = new ArrayList();
    private AnalyticsLogger analyticsLogger;
    private final IntentGenerator intentGenerator;

    public RendererClient(IntentGenerator intentgenerator)
    {
        intentGenerator = (IntentGenerator)Preconditions.checkNotNull(intentgenerator);
    }

    public void addActionController(ActionController actioncontroller)
    {
        actionControllers.add(actioncontroller);
    }

    public void addConditionalComponentName(Predicate predicate, ComponentName componentname)
    {
        Preconditions.checkNotNull(predicate, "Predicate cannot be null!");
        Preconditions.checkNotNull(componentname, "Component name cannot be null!");
        intentGenerator.addConditionalComponentName(predicate, componentname);
    }

    public void addConditionalPackageName(Predicate predicate, String s)
    {
        Preconditions.checkNotNull(predicate, "Predicate cannot be null!");
        Preconditions.checkNotNull(s, "Package name cannot be null!");
        intentGenerator.addConditionalPackageName(predicate, s);
    }

    public Intent createIntentFromUri(URI uri)
    {
        return intentGenerator.fromUri(uri);
    }

    public ActionController getActionControllerForUriPattern(String s)
    {
        for (Iterator iterator = actionControllers.iterator(); iterator.hasNext();)
        {
            ActionController actioncontroller = (ActionController)iterator.next();
            if (actioncontroller.matches(s))
            {
                return actioncontroller;
            }
        }

        return null;
    }

    public AnalyticsLogger getAnalyticsLogger()
    {
        return analyticsLogger;
    }

    public void setAbsoluteUri(URI uri)
    {
        intentGenerator.setAbsoluteUri(uri);
    }

    public void setAnalyticsLogger(AnalyticsLogger analyticslogger)
    {
        analyticsLogger = analyticslogger;
    }
}
