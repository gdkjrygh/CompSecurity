// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.matcher;

import com.google.inject.internal.util.$Preconditions;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

// Referenced classes of package com.google.inject.matcher:
//            Matcher, AbstractMatcher

public class Matchers
{
    private static class AnnotatedWith extends AbstractMatcher
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Annotation annotation;

        public boolean equals(Object obj)
        {
            return (obj instanceof AnnotatedWith) && ((AnnotatedWith)obj).annotation.equals(annotation);
        }

        public int hashCode()
        {
            return annotation.hashCode() * 37;
        }

        public volatile boolean matches(Object obj)
        {
            return matches((AnnotatedElement)obj);
        }

        public boolean matches(AnnotatedElement annotatedelement)
        {
            annotatedelement = annotatedelement.getAnnotation(annotation.annotationType());
            return annotatedelement != null && annotation.equals(annotatedelement);
        }

        public String toString()
        {
            return (new StringBuilder()).append("annotatedWith(").append(annotation).append(")").toString();
        }

        public AnnotatedWith(Annotation annotation1)
        {
            annotation = (Annotation)$Preconditions.checkNotNull(annotation1, "annotation");
            Matchers.checkForRuntimeRetention(annotation1.annotationType());
        }
    }

    private static class AnnotatedWithType extends AbstractMatcher
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Class annotationType;

        public boolean equals(Object obj)
        {
            return (obj instanceof AnnotatedWithType) && ((AnnotatedWithType)obj).annotationType.equals(annotationType);
        }

        public int hashCode()
        {
            return annotationType.hashCode() * 37;
        }

        public volatile boolean matches(Object obj)
        {
            return matches((AnnotatedElement)obj);
        }

        public boolean matches(AnnotatedElement annotatedelement)
        {
            return annotatedelement.getAnnotation(annotationType) != null;
        }

        public String toString()
        {
            return (new StringBuilder()).append("annotatedWith(").append(annotationType.getSimpleName()).append(".class)").toString();
        }

        public AnnotatedWithType(Class class1)
        {
            annotationType = (Class)$Preconditions.checkNotNull(class1, "annotation type");
            Matchers.checkForRuntimeRetention(class1);
        }
    }

    private static class Any extends AbstractMatcher
        implements Serializable
    {

        private static final long serialVersionUID = 0L;

        public boolean matches(Object obj)
        {
            return true;
        }

        public Object readResolve()
        {
            return Matchers.any();
        }

        public String toString()
        {
            return "any()";
        }

        private Any()
        {
        }

    }

    private static class IdenticalTo extends AbstractMatcher
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Object value;

        public boolean equals(Object obj)
        {
            return (obj instanceof IdenticalTo) && ((IdenticalTo)obj).value == value;
        }

        public int hashCode()
        {
            return System.identityHashCode(value) * 37;
        }

        public boolean matches(Object obj)
        {
            return value == obj;
        }

        public String toString()
        {
            return (new StringBuilder()).append("identicalTo(").append(value).append(")").toString();
        }

        public IdenticalTo(Object obj)
        {
            value = $Preconditions.checkNotNull(obj, "value");
        }
    }

    private static class InPackage extends AbstractMatcher
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final String packageName;
        private final transient Package targetPackage;

        public boolean equals(Object obj)
        {
            return (obj instanceof InPackage) && ((InPackage)obj).targetPackage.equals(targetPackage);
        }

        public int hashCode()
        {
            return targetPackage.hashCode() * 37;
        }

        public boolean matches(Class class1)
        {
            return class1.getPackage().equals(targetPackage);
        }

        public volatile boolean matches(Object obj)
        {
            return matches((Class)obj);
        }

        public Object readResolve()
        {
            return Matchers.inPackage(Package.getPackage(packageName));
        }

        public String toString()
        {
            return (new StringBuilder()).append("inPackage(").append(targetPackage.getName()).append(")").toString();
        }

        public InPackage(Package package1)
        {
            targetPackage = (Package)$Preconditions.checkNotNull(package1, "package");
            packageName = package1.getName();
        }
    }

    private static class InSubpackage extends AbstractMatcher
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final String targetPackageName;

        public boolean equals(Object obj)
        {
            return (obj instanceof InSubpackage) && ((InSubpackage)obj).targetPackageName.equals(targetPackageName);
        }

        public int hashCode()
        {
            return targetPackageName.hashCode() * 37;
        }

        public boolean matches(Class class1)
        {
            class1 = class1.getPackage().getName();
            return class1.equals(targetPackageName) || class1.startsWith((new StringBuilder()).append(targetPackageName).append(".").toString());
        }

        public volatile boolean matches(Object obj)
        {
            return matches((Class)obj);
        }

        public String toString()
        {
            return (new StringBuilder()).append("inSubpackage(").append(targetPackageName).append(")").toString();
        }

        public InSubpackage(String s)
        {
            targetPackageName = s;
        }
    }

    private static class Not extends AbstractMatcher
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final Matcher _flddelegate;

        public boolean equals(Object obj)
        {
            return (obj instanceof Not) && ((Not)obj)._flddelegate.equals(_flddelegate);
        }

        public int hashCode()
        {
            return -_flddelegate.hashCode();
        }

        public boolean matches(Object obj)
        {
            return !_flddelegate.matches(obj);
        }

        public String toString()
        {
            return (new StringBuilder()).append("not(").append(_flddelegate).append(")").toString();
        }

        private Not(Matcher matcher)
        {
            _flddelegate = (Matcher)$Preconditions.checkNotNull(matcher, "delegate");
        }

    }

    private static class Only extends AbstractMatcher
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Object value;

        public boolean equals(Object obj)
        {
            return (obj instanceof Only) && ((Only)obj).value.equals(value);
        }

        public int hashCode()
        {
            return value.hashCode() * 37;
        }

        public boolean matches(Object obj)
        {
            return value.equals(obj);
        }

        public String toString()
        {
            return (new StringBuilder()).append("only(").append(value).append(")").toString();
        }

        public Only(Object obj)
        {
            value = $Preconditions.checkNotNull(obj, "value");
        }
    }

    private static class Returns extends AbstractMatcher
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Matcher returnType;

        public boolean equals(Object obj)
        {
            return (obj instanceof Returns) && ((Returns)obj).returnType.equals(returnType);
        }

        public int hashCode()
        {
            return returnType.hashCode() * 37;
        }

        public volatile boolean matches(Object obj)
        {
            return matches((Method)obj);
        }

        public boolean matches(Method method)
        {
            return returnType.matches(method.getReturnType());
        }

        public String toString()
        {
            return (new StringBuilder()).append("returns(").append(returnType).append(")").toString();
        }

        public Returns(Matcher matcher)
        {
            returnType = (Matcher)$Preconditions.checkNotNull(matcher, "return type matcher");
        }
    }

    private static class SubclassesOf extends AbstractMatcher
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Class superclass;

        public boolean equals(Object obj)
        {
            return (obj instanceof SubclassesOf) && ((SubclassesOf)obj).superclass.equals(superclass);
        }

        public int hashCode()
        {
            return superclass.hashCode() * 37;
        }

        public boolean matches(Class class1)
        {
            return superclass.isAssignableFrom(class1);
        }

        public volatile boolean matches(Object obj)
        {
            return matches((Class)obj);
        }

        public String toString()
        {
            return (new StringBuilder()).append("subclassesOf(").append(superclass.getSimpleName()).append(".class)").toString();
        }

        public SubclassesOf(Class class1)
        {
            superclass = (Class)$Preconditions.checkNotNull(class1, "superclass");
        }
    }


    private static final Matcher ANY = new Any();

    private Matchers()
    {
    }

    public static Matcher annotatedWith(Class class1)
    {
        return new AnnotatedWithType(class1);
    }

    public static Matcher annotatedWith(Annotation annotation)
    {
        return new AnnotatedWith(annotation);
    }

    public static Matcher any()
    {
        return ANY;
    }

    private static void checkForRuntimeRetention(Class class1)
    {
        Retention retention = (Retention)class1.getAnnotation(java/lang/annotation/Retention);
        boolean flag;
        if (retention != null && retention.value() == RetentionPolicy.RUNTIME)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $Preconditions.checkArgument(flag, (new StringBuilder()).append("Annotation ").append(class1.getSimpleName()).append(" is missing RUNTIME retention").toString());
    }

    public static Matcher identicalTo(Object obj)
    {
        return new IdenticalTo(obj);
    }

    public static Matcher inPackage(Package package1)
    {
        return new InPackage(package1);
    }

    public static Matcher inSubpackage(String s)
    {
        return new InSubpackage(s);
    }

    public static Matcher not(Matcher matcher)
    {
        return new Not(matcher);
    }

    public static Matcher only(Object obj)
    {
        return new Only(obj);
    }

    public static Matcher returns(Matcher matcher)
    {
        return new Returns(matcher);
    }

    public static Matcher subclassesOf(Class class1)
    {
        return new SubclassesOf(class1);
    }


}
