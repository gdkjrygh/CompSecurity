// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import dagger.a;

// Referenced classes of package dagger.internal:
//            MembersInjectors

private static final class  extends Enum
    implements a
{

    public static final a a;
    private static final a b[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(dagger/internal/MembersInjectors$NoOpMembersInjector, s);
    }

    public static [] values()
    {
        return ([])b.clone();
    }

    public final void injectMembers(Object obj)
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
        a = new <init>("INSTANCE");
        b = (new b[] {
            a
        });
    }

    private (String s)
    {
        super(s, 0);
    }
}
