// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.annotation;

import java.util.UUID;

// Referenced classes of package com.fasterxml.jackson.annotation:
//            ObjectIdGenerator

public class ObjectIdGenerators
{
    private static abstract class Base extends ObjectIdGenerator
    {

        public final Class _scope;

        public boolean canUseFor(ObjectIdGenerator objectidgenerator)
        {
            return objectidgenerator.getClass() == getClass() && objectidgenerator.getScope() == _scope;
        }

        public abstract Object generateId(Object obj);

        public final Class getScope()
        {
            return _scope;
        }

        protected Base(Class class1)
        {
            _scope = class1;
        }
    }

    public static final class IntSequenceGenerator extends Base
    {

        private static final long serialVersionUID = 1L;
        protected transient int _nextValue;

        public final volatile boolean canUseFor(ObjectIdGenerator objectidgenerator)
        {
            return super.canUseFor(objectidgenerator);
        }

        public final ObjectIdGenerator forScope(Class class1)
        {
            if (_scope == class1)
            {
                return this;
            } else
            {
                return new IntSequenceGenerator(class1, _nextValue);
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

        public final ObjectIdGenerator.IdKey key(Object obj)
        {
            return new ObjectIdGenerator.IdKey(getClass(), _scope, obj);
        }

        public final ObjectIdGenerator newForSerialization(Object obj)
        {
            return new IntSequenceGenerator(_scope, initialValue());
        }

        public IntSequenceGenerator()
        {
            this(java/lang/Object, -1);
        }

        public IntSequenceGenerator(Class class1, int i)
        {
            super(class1);
            _nextValue = i;
        }
    }

    public static abstract class None extends ObjectIdGenerator
    {

        public None()
        {
        }
    }

    public static abstract class PropertyGenerator extends Base
    {

        private static final long serialVersionUID = 1L;

        public volatile boolean canUseFor(ObjectIdGenerator objectidgenerator)
        {
            return super.canUseFor(objectidgenerator);
        }

        public PropertyGenerator(Class class1)
        {
            super(class1);
        }
    }

    public static final class UUIDGenerator extends Base
    {

        private static final long serialVersionUID = 1L;

        public final boolean canUseFor(ObjectIdGenerator objectidgenerator)
        {
            return objectidgenerator.getClass() == getClass();
        }

        public final ObjectIdGenerator forScope(Class class1)
        {
            return this;
        }

        public final volatile Object generateId(Object obj)
        {
            return generateId(obj);
        }

        public final UUID generateId(Object obj)
        {
            return UUID.randomUUID();
        }

        public final ObjectIdGenerator.IdKey key(Object obj)
        {
            return new ObjectIdGenerator.IdKey(getClass(), null, obj);
        }

        public final ObjectIdGenerator newForSerialization(Object obj)
        {
            return this;
        }

        public UUIDGenerator()
        {
            this(java/lang/Object);
        }

        private UUIDGenerator(Class class1)
        {
            super(java/lang/Object);
        }
    }


    public ObjectIdGenerators()
    {
    }
}
