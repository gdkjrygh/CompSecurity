// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import dagger.MembersInjector;

public final class MembersInjectors
{
    private static final class NoOpMembersInjector extends Enum
        implements MembersInjector
    {

        private static final NoOpMembersInjector $VALUES[];
        public static final NoOpMembersInjector INSTANCE;

        public static NoOpMembersInjector valueOf(String s)
        {
            return (NoOpMembersInjector)Enum.valueOf(dagger/internal/MembersInjectors$NoOpMembersInjector, s);
        }

        public static NoOpMembersInjector[] values()
        {
            return (NoOpMembersInjector[])$VALUES.clone();
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
            INSTANCE = new NoOpMembersInjector("INSTANCE", 0);
            $VALUES = (new NoOpMembersInjector[] {
                INSTANCE
            });
        }

        private NoOpMembersInjector(String s, int i)
        {
            super(s, i);
        }
    }


    private MembersInjectors()
    {
    }

    public static MembersInjector delegatingTo(MembersInjector membersinjector)
    {
        return membersinjector;
    }

    public static MembersInjector noOp()
    {
        return NoOpMembersInjector.INSTANCE;
    }
}
