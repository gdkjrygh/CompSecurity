// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import dagger.a;

public final class MembersInjectors
{
    private static final class NoOpMembersInjector extends Enum
        implements a
    {

        public static final NoOpMembersInjector a;
        private static final NoOpMembersInjector b[];

        public static NoOpMembersInjector valueOf(String s)
        {
            return (NoOpMembersInjector)Enum.valueOf(dagger/internal/MembersInjectors$NoOpMembersInjector, s);
        }

        public static NoOpMembersInjector[] values()
        {
            return (NoOpMembersInjector[])b.clone();
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
            a = new NoOpMembersInjector("INSTANCE");
            b = (new NoOpMembersInjector[] {
                a
            });
        }

        private NoOpMembersInjector(String s)
        {
            super(s, 0);
        }
    }

}
