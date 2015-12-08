// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.a;

import dagger.a;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package dagger.a:
//            c, h, l

public abstract class b
    implements dagger.a, Provider
{
    public static final class a extends RuntimeException
    {

        public final String a;

        public a(String s, String s1)
        {
            super(s1);
            a = s;
        }
    }


    private static final int CYCLE_FREE = 8;
    private static final int DEPENDED_ON = 16;
    protected static final boolean IS_SINGLETON = true;
    private static final int LIBRARY = 32;
    private static final int LINKED = 2;
    protected static final boolean NOT_SINGLETON = false;
    private static final int SINGLETON = 1;
    public static final b UNRESOLVED = new c();
    private static final int VISITING = 4;
    private int bits;
    public final String membersKey;
    public final String provideKey;
    public final Object requiredBy;

    public b(String s, String s1, boolean flag, Object obj)
    {
        if (flag && s == null)
        {
            throw new a(h.d(s1), "is exclusively members injected and therefore cannot be scoped");
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

    public void attach(l l)
    {
    }

    public boolean dependedOn()
    {
        return (bits & 0x10) != 0;
    }

    public Object get()
    {
        throw new UnsupportedOperationException((new StringBuilder("No injectable constructor on ")).append(getClass().getName()).toString());
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
        return (new StringBuilder()).append(getClass().getSimpleName()).append("[provideKey=\"").append(provideKey).append("\", memberskey=\"").append(membersKey).append("\"]").toString();
    }

}
