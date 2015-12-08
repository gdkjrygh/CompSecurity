// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import dagger.MembersInjector;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package dagger.internal:
//            Keys, Linker

public abstract class Binding
    implements MembersInjector, Provider
{
    public static class InvalidBindingException extends RuntimeException
    {

        public final String type;

        public InvalidBindingException(String s, String s1)
        {
            super(s1);
            type = s;
        }
    }


    private static final int CYCLE_FREE = 8;
    private static final int DEPENDED_ON = 16;
    protected static final boolean IS_SINGLETON = true;
    private static final int LIBRARY = 32;
    private static final int LINKED = 2;
    protected static final boolean NOT_SINGLETON = false;
    private static final int SINGLETON = 1;
    public static final Binding UNRESOLVED = new Binding(null, null, false, null) {

        public final Object get()
        {
            throw new AssertionError("Unresolved binding should never be called to inject.");
        }

        public final void injectMembers(Object obj)
        {
            throw new AssertionError("Unresolved binding should never be called to inject.");
        }

    };
    private static final int VISITING = 4;
    private int bits;
    public final String membersKey;
    public final String provideKey;
    public final Object requiredBy;

    protected Binding(String s, String s1, boolean flag, Object obj)
    {
        if (flag && s == null)
        {
            throw new InvalidBindingException(Keys.getClassName(s1), "is exclusively members injected and therefore cannot be scoped");
        }
        provideKey = s;
        membersKey = s1;
        requiredBy = obj;
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        bits = i;
    }

    public void attach(Linker linker)
    {
    }

    public boolean dependedOn()
    {
        return (bits & 0x10) != 0;
    }

    public Object get()
    {
        String s = String.valueOf(getClass().getName());
        if (s.length() != 0)
        {
            s = "No injectable constructor on ".concat(s);
        } else
        {
            s = new String("No injectable constructor on ");
        }
        throw new UnsupportedOperationException(s);
    }

    public void getDependencies(Set set, Set set1)
    {
    }

    public void injectMembers(Object obj)
    {
    }

    public boolean isCycleFree()
    {
        return (bits & 8) != 0;
    }

    public boolean isLinked()
    {
        return (bits & 2) != 0;
    }

    boolean isSingleton()
    {
        return (bits & 1) != 0;
    }

    public boolean isVisiting()
    {
        return (bits & 4) != 0;
    }

    public boolean library()
    {
        return (bits & 0x20) != 0;
    }

    public void setCycleFree(boolean flag)
    {
        int i;
        if (flag)
        {
            i = bits | 8;
        } else
        {
            i = bits & -9;
        }
        bits = i;
    }

    public void setDependedOn(boolean flag)
    {
        int i;
        if (flag)
        {
            i = bits | 0x10;
        } else
        {
            i = bits & 0xffffffef;
        }
        bits = i;
    }

    public void setLibrary(boolean flag)
    {
        int i;
        if (flag)
        {
            i = bits | 0x20;
        } else
        {
            i = bits & 0xffffffdf;
        }
        bits = i;
    }

    void setLinked()
    {
        bits = bits | 2;
    }

    public void setVisiting(boolean flag)
    {
        int i;
        if (flag)
        {
            i = bits | 4;
        } else
        {
            i = bits & -5;
        }
        bits = i;
    }

    public String toString()
    {
        String s = String.valueOf(getClass().getSimpleName());
        String s1 = provideKey;
        String s2 = membersKey;
        return (new StringBuilder(String.valueOf(s).length() + 30 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append("[provideKey=\"").append(s1).append("\", memberskey=\"").append(s2).append("\"]").toString();
    }

}
