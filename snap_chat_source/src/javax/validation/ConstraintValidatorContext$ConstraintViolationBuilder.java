// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation;


// Referenced classes of package javax.validation:
//            ConstraintValidatorContext

public static interface NodeBuilderDefinedContext
{
    public static interface LeafNodeBuilderCustomizableContext
    {

        public abstract ConstraintValidatorContext addConstraintViolation();

        public abstract LeafNodeContextBuilder inIterable();
    }

    public static interface LeafNodeBuilderDefinedContext
    {

        public abstract ConstraintValidatorContext addConstraintViolation();
    }

    public static interface LeafNodeContextBuilder
    {

        public abstract ConstraintValidatorContext addConstraintViolation();

        public abstract LeafNodeBuilderDefinedContext atIndex$77ebdfa6();

        public abstract LeafNodeBuilderDefinedContext atKey$8a86629();
    }

    public static interface NodeBuilderCustomizableContext
    {

        public abstract LeafNodeBuilderCustomizableContext addBeanNode();

        public abstract ConstraintValidatorContext addConstraintViolation();

        public abstract NodeBuilderCustomizableContext addNode$1cba0a72();

        public abstract NodeBuilderCustomizableContext addPropertyNode$1cba0a72();

        public abstract NodeContextBuilder inIterable();
    }

    public static interface NodeBuilderDefinedContext
    {

        public abstract LeafNodeBuilderCustomizableContext addBeanNode();

        public abstract ConstraintValidatorContext addConstraintViolation();

        public abstract NodeBuilderCustomizableContext addNode$1cba0a72();

        public abstract NodeBuilderCustomizableContext addPropertyNode$1cba0a72();
    }

    public static interface NodeContextBuilder
    {

        public abstract LeafNodeBuilderCustomizableContext addBeanNode();

        public abstract ConstraintValidatorContext addConstraintViolation();

        public abstract NodeBuilderCustomizableContext addNode$1cba0a72();

        public abstract NodeBuilderCustomizableContext addPropertyNode$1cba0a72();

        public abstract NodeBuilderDefinedContext atIndex$18d59c58();

        public abstract NodeBuilderDefinedContext atKey$d5b21a7();
    }


    public abstract LeafNodeBuilderCustomizableContext addBeanNode();

    public abstract ConstraintValidatorContext addConstraintViolation();

    public abstract NodeBuilderDefinedContext addNode$572f8a2b();

    public abstract NodeBuilderDefinedContext addParameterNode$47816fdc();

    public abstract NodeBuilderCustomizableContext addPropertyNode$1cba0a72();
}
