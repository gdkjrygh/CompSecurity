// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import dagger.internal.Factory;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerActivity

public final class module
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final .assertionsDisabled module;

    public static Factory create(module module1)
    {
        return new <init>(module1);
    }

    public PlayerActivity get()
    {
        PlayerActivity playeractivity = module.module();
        if (playeractivity == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return playeractivity;
        }
    }

    public volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/nbcsports/liveextra/ui/player/PlayerActivity$Module_PlayerActivityFactory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

    public ( )
    {
        if (!$assertionsDisabled &&  == null)
        {
            throw new AssertionError();
        } else
        {
            module = ;
            return;
        }
    }
}
