// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.annotation;


// Referenced classes of package com.fasterxml.jackson.annotation:
//            ObjectIdGenerator

public class ObjectIdGenerators
{
    private static abstract class Base extends ObjectIdGenerator
    {

        protected final Class _scope;

        public boolean canUseFor(ObjectIdGenerator objectidgenerator)
        {
            return objectidgenerator.getClass() == getClass() && objectidgenerator.getScope() == _scope;
        }

        public final Class getScope()
        {
            return _scope;
        }

        protected Base(Class class1)
        {
            _scope = class1;
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

        public volatile boolean canUseFor(ObjectIdGenerator objectidgenerator)
        {
            return super.canUseFor(objectidgenerator);
        }

        protected PropertyGenerator(Class class1)
        {
            super(class1);
        }
    }

}
