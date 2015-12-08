// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.internal;

import java.util.Set;

// Referenced classes of package dagger.internal:
//            Binding, Linker

static class <init> extends Binding
{

    private final Binding binding;
    private volatile Object onlyInstance;

    public void attach(Linker linker)
    {
        binding.attach(linker);
    }

    public boolean dependedOn()
    {
        return binding.dependedOn();
    }

    public Object get()
    {
        if (onlyInstance != Linker.access$200()) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (onlyInstance == Linker.access$200())
        {
            onlyInstance = binding.get();
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return onlyInstance;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void getDependencies(Set set, Set set1)
    {
        binding.getDependencies(set, set1);
    }

    public void injectMembers(Object obj)
    {
        binding.injectMembers(obj);
    }

    public boolean isCycleFree()
    {
        return binding.isCycleFree();
    }

    public boolean isLinked()
    {
        return binding.isLinked();
    }

    protected boolean isSingleton()
    {
        return true;
    }

    public boolean isVisiting()
    {
        return binding.isVisiting();
    }

    public boolean library()
    {
        return binding.library();
    }

    public void setCycleFree(boolean flag)
    {
        binding.setCycleFree(flag);
    }

    public void setDependedOn(boolean flag)
    {
        binding.setDependedOn(flag);
    }

    public void setLibrary(boolean flag)
    {
        binding.setLibrary(true);
    }

    protected void setLinked()
    {
        binding.setLinked();
    }

    public void setVisiting(boolean flag)
    {
        binding.setVisiting(flag);
    }

    public String toString()
    {
        String s = String.valueOf(binding.toString());
        if (s.length() != 0)
        {
            return "@Singleton/".concat(s);
        } else
        {
            return new String("@Singleton/");
        }
    }

    private (Binding binding1)
    {
        super(binding1.provideKey, binding1.membersKey, true, binding1.requiredBy);
        onlyInstance = Linker.access$200();
        binding = binding1;
    }

    binding(Binding binding1, binding binding2)
    {
        this(binding1);
    }
}
