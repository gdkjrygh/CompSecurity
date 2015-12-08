// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.BindingAnnotation;
import com.google.inject.Key;
import com.google.inject.ScopeAnnotation;
import com.google.inject.TypeLiteral;
import com.google.inject.internal.util.$Classes;
import com.google.inject.internal.util.$Function;
import com.google.inject.internal.util.$MapMaker;
import com.google.inject.name.Names;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Member;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import javax.inject.Named;
import javax.inject.Qualifier;
import javax.inject.Scope;

// Referenced classes of package com.google.inject.internal:
//            Errors, ErrorsException

public class Annotations
{
    static class AnnotationChecker
    {

        private final Collection annotationTypes;
        final Map cache;
        private $Function hasAnnotations;

        boolean hasAnnotations(Class class1)
        {
            return ((Boolean)cache.get(class1)).booleanValue();
        }


        AnnotationChecker(Collection collection)
        {
            hasAnnotations = new _cls1();
            cache = (new $MapMaker()).weakKeys().makeComputingMap(hasAnnotations);
            annotationTypes = collection;
        }
    }


    private static final AnnotationChecker bindingAnnotationChecker = new AnnotationChecker(Arrays.asList(new Class[] {
        com/google/inject/BindingAnnotation, javax/inject/Qualifier
    }));
    private static final AnnotationChecker scopeChecker = new AnnotationChecker(Arrays.asList(new Class[] {
        com/google/inject/ScopeAnnotation, javax/inject/Scope
    }));

    public Annotations()
    {
    }

    public static Class canonicalizeIfNamed(Class class1)
    {
        Object obj = class1;
        if (class1 == javax/inject/Named)
        {
            obj = com/google/inject/name/Named;
        }
        return ((Class) (obj));
    }

    public static Annotation canonicalizeIfNamed(Annotation annotation)
    {
        Object obj = annotation;
        if (annotation instanceof Named)
        {
            obj = Names.named(((Named)annotation).value());
        }
        return ((Annotation) (obj));
    }

    public static void checkForMisplacedScopeAnnotations(Class class1, Object obj, Errors errors)
    {
        Class class2;
        if (!$Classes.isConcrete(class1))
        {
            if ((class2 = findScopeAnnotation(errors, class1)) != null)
            {
                errors.withSource(class1).scopeAnnotationOnAbstractType(class2, class1, obj);
                return;
            }
        }
    }

    public static Annotation findBindingAnnotation(Errors errors, Member member, Annotation aannotation[])
    {
        Annotation annotation = null;
        int j = aannotation.length;
        int i = 0;
        while (i < j) 
        {
            Annotation annotation2 = aannotation[i];
            Class class1 = annotation2.annotationType();
            Annotation annotation1 = annotation;
            if (isBindingAnnotation(class1))
            {
                if (annotation != null)
                {
                    errors.duplicateBindingAnnotations(member, annotation.annotationType(), class1);
                    annotation1 = annotation;
                } else
                {
                    annotation1 = annotation2;
                }
            }
            i++;
            annotation = annotation1;
        }
        return annotation;
    }

    public static Class findScopeAnnotation(Errors errors, Class class1)
    {
        return findScopeAnnotation(errors, class1.getAnnotations());
    }

    public static Class findScopeAnnotation(Errors errors, Annotation aannotation[])
    {
        Class class1 = null;
        int j = aannotation.length;
        int i = 0;
        while (i < j) 
        {
            Class class3 = aannotation[i].annotationType();
            Class class2 = class1;
            if (isScopeAnnotation(class3))
            {
                if (class1 != null)
                {
                    errors.duplicateScopeAnnotations(class1, class3);
                    class2 = class1;
                } else
                {
                    class2 = class3;
                }
            }
            i++;
            class1 = class2;
        }
        return class1;
    }

    public static Key getKey(TypeLiteral typeliteral, Member member, Annotation aannotation[], Errors errors)
        throws ErrorsException
    {
        int i = errors.size();
        member = findBindingAnnotation(errors, member, aannotation);
        errors.throwIfNewErrors(i);
        if (member == null)
        {
            return Key.get(typeliteral);
        } else
        {
            return Key.get(typeliteral, member);
        }
    }

    public static boolean isBindingAnnotation(Class class1)
    {
        return bindingAnnotationChecker.hasAnnotations(class1);
    }

    public static boolean isMarker(Class class1)
    {
        return class1.getDeclaredMethods().length == 0;
    }

    public static boolean isRetainedAtRuntime(Class class1)
    {
        class1 = (Retention)class1.getAnnotation(java/lang/annotation/Retention);
        return class1 != null && class1.value() == RetentionPolicy.RUNTIME;
    }

    public static boolean isScopeAnnotation(Class class1)
    {
        return scopeChecker.hasAnnotations(class1);
    }


    // Unreferenced inner class com/google/inject/internal/Annotations$AnnotationChecker$1

/* anonymous class */
    class AnnotationChecker._cls1
        implements $Function
    {

        final AnnotationChecker this$0;

        public Boolean apply(Class class1)
        {
            class1 = class1.getAnnotations();
            int j = class1.length;
            for (int i = 0; i < j; i++)
            {
                Annotation annotation = class1[i];
                if (annotationTypes.contains(annotation.annotationType()))
                {
                    return Boolean.valueOf(true);
                }
            }

            return Boolean.valueOf(false);
        }

        public volatile Object apply(Object obj)
        {
            return apply((Class)obj);
        }

            
            {
                this$0 = AnnotationChecker.this;
                super();
            }
    }

}
