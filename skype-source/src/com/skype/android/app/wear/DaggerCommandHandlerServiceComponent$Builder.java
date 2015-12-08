// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear;

import com.skype.android.SkypeApplicationComponent;

// Referenced classes of package com.skype.android.app.wear:
//            DaggerCommandHandlerServiceComponent, CommandHandlerServiceComponent

public static final class <init>
{

    private SkypeApplicationComponent skypeApplicationComponent;

    public final CommandHandlerServiceComponent build()
    {
        if (skypeApplicationComponent == null)
        {
            throw new IllegalStateException((new StringBuilder()).append(com/skype/android/SkypeApplicationComponent.getCanonicalName()).append(" must be set").toString());
        } else
        {
            return new DaggerCommandHandlerServiceComponent(this, null);
        }
    }

    public final skypeApplicationComponent skypeApplicationComponent(SkypeApplicationComponent skypeapplicationcomponent)
    {
        if (skypeapplicationcomponent == null)
        {
            throw new NullPointerException();
        } else
        {
            skypeApplicationComponent = skypeapplicationcomponent;
            return this;
        }
    }


    private ()
    {
    }

    ( )
    {
        this();
    }
}
