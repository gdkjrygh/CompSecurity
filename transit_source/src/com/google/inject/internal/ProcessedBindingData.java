// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.internal.util.$Lists;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.inject.internal:
//            CreationListener, Errors

class ProcessedBindingData
{

    private final List creationListeners = $Lists.newArrayList();
    private final List uninitializedBindings = $Lists.newArrayList();

    ProcessedBindingData()
    {
    }

    void addCreationListener(CreationListener creationlistener)
    {
        creationListeners.add(creationlistener);
    }

    void addUninitializedBinding(Runnable runnable)
    {
        uninitializedBindings.add(runnable);
    }

    void initializeBindings()
    {
        for (Iterator iterator = uninitializedBindings.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run()) { }
    }

    void runCreationListeners(Errors errors)
    {
        for (Iterator iterator = creationListeners.iterator(); iterator.hasNext(); ((CreationListener)iterator.next()).notify(errors)) { }
    }
}
