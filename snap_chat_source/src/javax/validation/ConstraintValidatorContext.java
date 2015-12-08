// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation;


public interface ConstraintValidatorContext
{
    public static interface ConstraintViolationBuilder
    {

        public abstract LeafNodeBuilderCustomizableContext addBeanNode();

        public abstract ConstraintValidatorContext addConstraintViolation();

        public abstract NodeBuilderDefinedContext addNode$572f8a2b();

        public abstract NodeBuilderDefinedContext addParameterNode$47816fdc();

        public abstract NodeBuilderCustomizableContext addPropertyNode$1cba0a72();
    }

    public static interface ConstraintViolationBuilder.LeafNodeBuilderCustomizableContext
    {

        public abstract ConstraintValidatorContext addConstraintViolation();

        public abstract ConstraintViolationBuilder.LeafNodeContextBuilder inIterable();
    }

    public static interface ConstraintViolationBuilder.LeafNodeBuilderDefinedContext
    {

        public abstract ConstraintValidatorContext addConstraintViolation();
    }

    public static interface ConstraintViolationBuilder.LeafNodeContextBuilder
    {

        public abstract ConstraintValidatorContext addConstraintViolation();

        public abstract ConstraintViolationBuilder.LeafNodeBuilderDefinedContext atIndex$77ebdfa6();

        public abstract ConstraintViolationBuilder.LeafNodeBuilderDefinedContext atKey$8a86629();
    }

    public static interface ConstraintViolationBuilder.NodeBuilderCustomizableContext
    {

        public abstract ConstraintViolationBuilder.LeafNodeBuilderCustomizableContext addBeanNode();

        public abstract ConstraintValidatorContext addConstraintViolation();

        public abstract ConstraintViolationBuilder.NodeBuilderCustomizableContext addNode$1cba0a72();

        public abstract ConstraintViolationBuilder.NodeBuilderCustomizableContext addPropertyNode$1cba0a72();

        public abstract ConstraintViolationBuilder.NodeContextBuilder inIterable();
    }

    public static interface ConstraintViolationBuilder.NodeBuilderDefinedContext
    {

        public abstract ConstraintViolationBuilder.LeafNodeBuilderCustomizableContext addBeanNode();

        public abstract ConstraintValidatorContext addConstraintViolation();

        public abstract ConstraintViolationBuilder.NodeBuilderCustomizableContext addNode$1cba0a72();

        public abstract ConstraintViolationBuilder.NodeBuilderCustomizableContext addPropertyNode$1cba0a72();
    }

    public static interface ConstraintViolationBuilder.NodeContextBuilder
    {

        public abstract ConstraintViolationBuilder.LeafNodeBuilderCustomizableContext addBeanNode();

        public abstract ConstraintValidatorContext addConstraintViolation();

        public abstract ConstraintViolationBuilder.NodeBuilderCustomizableContext addNode$1cba0a72();

        public abstract ConstraintViolationBuilder.NodeBuilderCustomizableContext addPropertyNode$1cba0a72();

        public abstract ConstraintViolationBuilder.NodeBuilderDefinedContext atIndex$18d59c58();

        public abstract ConstraintViolationBuilder.NodeBuilderDefinedContext atKey$d5b21a7();
    }


    public abstract ConstraintViolationBuilder buildConstraintViolationWithTemplate$4a3345c6();

    public abstract void disableDefaultConstraintViolation();

    public abstract String getDefaultConstraintMessageTemplate();

    public abstract Object unwrap$659effca();
}
