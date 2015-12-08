// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import dagger.MembersInjector;

// Referenced classes of package dagger.internal:
//            MembersInjectors

private static final class  extends Enum
    implements MembersInjector
{

    private static final INSTANCE $VALUES[];
    public static final INSTANCE INSTANCE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(dagger/internal/MembersInjectors$NoOpMembersInjector, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public void injectMembers(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        } else
        {
            return;
        }
    }

    static 
    {
        INSTANCE = new <init>("INSTANCE", 0);
        $VALUES = (new .VALUES[] {
            INSTANCE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
