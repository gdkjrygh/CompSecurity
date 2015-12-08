// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject;

import com.google.inject.internal.Annotations;
import com.google.inject.internal.MoreTypes;
import com.google.inject.internal.util.$Preconditions;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

// Referenced classes of package com.google.inject:
//            TypeLiteral

public class Key
{
    static class AnnotationInstanceStrategy
        implements AnnotationStrategy
    {

        final Annotation annotation;

        public boolean equals(Object obj)
        {
            if (!(obj instanceof AnnotationInstanceStrategy))
            {
                return false;
            } else
            {
                obj = (AnnotationInstanceStrategy)obj;
                return annotation.equals(((AnnotationInstanceStrategy) (obj)).annotation);
            }
        }

        public Annotation getAnnotation()
        {
            return annotation;
        }

        public Class getAnnotationType()
        {
            return annotation.annotationType();
        }

        public boolean hasAttributes()
        {
            return true;
        }

        public int hashCode()
        {
            return annotation.hashCode();
        }

        public String toString()
        {
            return annotation.toString();
        }

        public AnnotationStrategy withoutAttributes()
        {
            return new AnnotationTypeStrategy(getAnnotationType(), annotation);
        }

        AnnotationInstanceStrategy(Annotation annotation1)
        {
            annotation = (Annotation)$Preconditions.checkNotNull(annotation1, "annotation");
        }
    }

    static interface AnnotationStrategy
    {

        public abstract Annotation getAnnotation();

        public abstract Class getAnnotationType();

        public abstract boolean hasAttributes();

        public abstract AnnotationStrategy withoutAttributes();
    }

    static class AnnotationTypeStrategy
        implements AnnotationStrategy
    {

        final Annotation annotation;
        final Class annotationType;

        public boolean equals(Object obj)
        {
            if (!(obj instanceof AnnotationTypeStrategy))
            {
                return false;
            } else
            {
                obj = (AnnotationTypeStrategy)obj;
                return annotationType.equals(((AnnotationTypeStrategy) (obj)).annotationType);
            }
        }

        public Annotation getAnnotation()
        {
            return annotation;
        }

        public Class getAnnotationType()
        {
            return annotationType;
        }

        public boolean hasAttributes()
        {
            return false;
        }

        public int hashCode()
        {
            return annotationType.hashCode();
        }

        public String toString()
        {
            return (new StringBuilder()).append("@").append(annotationType.getName()).toString();
        }

        public AnnotationStrategy withoutAttributes()
        {
            throw new UnsupportedOperationException("Key already has no attributes.");
        }

        AnnotationTypeStrategy(Class class1, Annotation annotation1)
        {
            annotationType = (Class)$Preconditions.checkNotNull(class1, "annotation type");
            annotation = annotation1;
        }
    }

    static final class NullAnnotationStrategy extends Enum
        implements AnnotationStrategy
    {

        private static final NullAnnotationStrategy $VALUES[];
        public static final NullAnnotationStrategy INSTANCE;

        public static NullAnnotationStrategy valueOf(String s)
        {
            return (NullAnnotationStrategy)Enum.valueOf(com/google/inject/Key$NullAnnotationStrategy, s);
        }

        public static NullAnnotationStrategy[] values()
        {
            return (NullAnnotationStrategy[])$VALUES.clone();
        }

        public Annotation getAnnotation()
        {
            return null;
        }

        public Class getAnnotationType()
        {
            return null;
        }

        public boolean hasAttributes()
        {
            return false;
        }

        public String toString()
        {
            return "[none]";
        }

        public AnnotationStrategy withoutAttributes()
        {
            throw new UnsupportedOperationException("Key already has no attributes.");
        }

        static 
        {
            INSTANCE = new NullAnnotationStrategy("INSTANCE", 0);
            $VALUES = (new NullAnnotationStrategy[] {
                INSTANCE
            });
        }

        private NullAnnotationStrategy(String s, int i)
        {
            super(s, i);
        }
    }


    private final AnnotationStrategy annotationStrategy;
    private final int hashCode;
    private final TypeLiteral typeLiteral;

    protected Key()
    {
        annotationStrategy = NullAnnotationStrategy.INSTANCE;
        typeLiteral = TypeLiteral.fromSuperclassTypeParameter(getClass());
        hashCode = computeHashCode();
    }

    private Key(TypeLiteral typeliteral, AnnotationStrategy annotationstrategy)
    {
        annotationStrategy = annotationstrategy;
        typeLiteral = MoreTypes.canonicalizeForKey(typeliteral);
        hashCode = computeHashCode();
    }

    protected Key(Class class1)
    {
        annotationStrategy = strategyFor(class1);
        typeLiteral = TypeLiteral.fromSuperclassTypeParameter(getClass());
        hashCode = computeHashCode();
    }

    protected Key(Annotation annotation)
    {
        annotationStrategy = strategyFor(annotation);
        typeLiteral = TypeLiteral.fromSuperclassTypeParameter(getClass());
        hashCode = computeHashCode();
    }

    private Key(Type type, AnnotationStrategy annotationstrategy)
    {
        annotationStrategy = annotationstrategy;
        typeLiteral = MoreTypes.canonicalizeForKey(TypeLiteral.get(type));
        hashCode = computeHashCode();
    }

    private int computeHashCode()
    {
        return typeLiteral.hashCode() * 31 + annotationStrategy.hashCode();
    }

    private static void ensureIsBindingAnnotation(Class class1)
    {
        $Preconditions.checkArgument(Annotations.isBindingAnnotation(class1), "%s is not a binding annotation. Please annotate it with @BindingAnnotation.", new Object[] {
            class1.getName()
        });
    }

    private static void ensureRetainedAtRuntime(Class class1)
    {
        $Preconditions.checkArgument(Annotations.isRetainedAtRuntime(class1), "%s is not retained at runtime. Please annotate it with @Retention(RUNTIME).", new Object[] {
            class1.getName()
        });
    }

    public static Key get(TypeLiteral typeliteral)
    {
        return new Key(typeliteral, NullAnnotationStrategy.INSTANCE);
    }

    public static Key get(TypeLiteral typeliteral, Class class1)
    {
        return new Key(typeliteral, strategyFor(class1));
    }

    public static Key get(TypeLiteral typeliteral, Annotation annotation)
    {
        return new Key(typeliteral, strategyFor(annotation));
    }

    public static Key get(Class class1)
    {
        return new Key(class1, NullAnnotationStrategy.INSTANCE);
    }

    static Key get(Class class1, AnnotationStrategy annotationstrategy)
    {
        return new Key(class1, annotationstrategy);
    }

    public static Key get(Class class1, Class class2)
    {
        return new Key(class1, strategyFor(class2));
    }

    public static Key get(Class class1, Annotation annotation)
    {
        return new Key(class1, strategyFor(annotation));
    }

    public static Key get(Type type)
    {
        return new Key(type, NullAnnotationStrategy.INSTANCE);
    }

    public static Key get(Type type, Class class1)
    {
        return new Key(type, strategyFor(class1));
    }

    public static Key get(Type type, Annotation annotation)
    {
        return new Key(type, strategyFor(annotation));
    }

    static AnnotationStrategy strategyFor(Class class1)
    {
        $Preconditions.checkNotNull(class1, "annotation type");
        ensureRetainedAtRuntime(class1);
        ensureIsBindingAnnotation(class1);
        return new AnnotationTypeStrategy(Annotations.canonicalizeIfNamed(class1), null);
    }

    static AnnotationStrategy strategyFor(Annotation annotation)
    {
        $Preconditions.checkNotNull(annotation, "annotation");
        Class class1 = annotation.annotationType();
        ensureRetainedAtRuntime(class1);
        ensureIsBindingAnnotation(class1);
        if (Annotations.isMarker(class1))
        {
            return new AnnotationTypeStrategy(class1, annotation);
        } else
        {
            return new AnnotationInstanceStrategy(Annotations.canonicalizeIfNamed(annotation));
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof Key))
            {
                return false;
            }
            obj = (Key)obj;
            if (!annotationStrategy.equals(((Key) (obj)).annotationStrategy) || !typeLiteral.equals(((Key) (obj)).typeLiteral))
            {
                return false;
            }
        }
        return true;
    }

    public final Annotation getAnnotation()
    {
        return annotationStrategy.getAnnotation();
    }

    String getAnnotationName()
    {
        Annotation annotation = annotationStrategy.getAnnotation();
        if (annotation != null)
        {
            return annotation.toString();
        } else
        {
            return annotationStrategy.getAnnotationType().toString();
        }
    }

    public final Class getAnnotationType()
    {
        return annotationStrategy.getAnnotationType();
    }

    Class getRawType()
    {
        return typeLiteral.getRawType();
    }

    public final TypeLiteral getTypeLiteral()
    {
        return typeLiteral;
    }

    boolean hasAnnotationType()
    {
        return annotationStrategy.getAnnotationType() != null;
    }

    public boolean hasAttributes()
    {
        return annotationStrategy.hasAttributes();
    }

    public final int hashCode()
    {
        return hashCode;
    }

    public Key ofType(TypeLiteral typeliteral)
    {
        return new Key(typeliteral, annotationStrategy);
    }

    public Key ofType(Class class1)
    {
        return new Key(class1, annotationStrategy);
    }

    public Key ofType(Type type)
    {
        return new Key(type, annotationStrategy);
    }

    Key providerKey()
    {
        return ofType(typeLiteral.providerType());
    }

    public final String toString()
    {
        return (new StringBuilder()).append("Key[type=").append(typeLiteral).append(", annotation=").append(annotationStrategy).append("]").toString();
    }

    public Key withoutAttributes()
    {
        return new Key(typeLiteral, annotationStrategy.withoutAttributes());
    }
}
