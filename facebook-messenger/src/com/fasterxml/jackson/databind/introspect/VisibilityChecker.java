// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//            AnnotatedMember, AnnotatedField, AnnotatedMethod

public interface VisibilityChecker
{

    public abstract boolean isCreatorVisible(AnnotatedMember annotatedmember);

    public abstract boolean isCreatorVisible(Member member);

    public abstract boolean isFieldVisible(AnnotatedField annotatedfield);

    public abstract boolean isFieldVisible(Field field);

    public abstract boolean isGetterVisible(AnnotatedMethod annotatedmethod);

    public abstract boolean isGetterVisible(Method method);

    public abstract boolean isIsGetterVisible(AnnotatedMethod annotatedmethod);

    public abstract boolean isIsGetterVisible(Method method);

    public abstract boolean isSetterVisible(AnnotatedMethod annotatedmethod);

    public abstract boolean isSetterVisible(Method method);

    public abstract VisibilityChecker with(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility);

    public abstract VisibilityChecker with(JsonAutoDetect jsonautodetect);

    public abstract VisibilityChecker withCreatorVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility);

    public abstract VisibilityChecker withFieldVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility);

    public abstract VisibilityChecker withGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility);

    public abstract VisibilityChecker withIsGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility);

    public abstract VisibilityChecker withSetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility);

    public abstract VisibilityChecker withVisibility(PropertyAccessor propertyaccessor, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility);
}
