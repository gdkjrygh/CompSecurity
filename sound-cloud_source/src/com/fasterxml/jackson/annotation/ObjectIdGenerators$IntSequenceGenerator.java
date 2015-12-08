// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.annotation;


// Referenced classes of package com.fasterxml.jackson.annotation:
//            ObjectIdGenerators, ObjectIdGenerator

public static final class _nextValue extends _nextValue
{

    private static final long serialVersionUID = 1L;
    protected transient int _nextValue;

    public final volatile boolean canUseFor(ObjectIdGenerator objectidgenerator)
    {
        return super._nextValue(objectidgenerator);
    }

    public final ObjectIdGenerator forScope(Class class1)
    {
        if (_scope == class1)
        {
            return this;
        } else
        {
            return new <init>(class1, _nextValue);
        }
    }

    public final Integer generateId(Object obj)
    {
        int i = _nextValue;
        _nextValue = _nextValue + 1;
        return Integer.valueOf(i);
    }

    public final volatile Object generateId(Object obj)
    {
        return generateId(obj);
    }

    protected final int initialValue()
    {
        return 1;
    }

    public final generateId key(Object obj)
    {
        return new generateId(getClass(), _scope, obj);
    }

    public final ObjectIdGenerator newForSerialization(Object obj)
    {
        return new <init>(_scope, initialValue());
    }

    public ()
    {
        this(java/lang/Object, -1);
    }

    public <init>(Class class1, int i)
    {
        super(class1);
        _nextValue = i;
    }
}
