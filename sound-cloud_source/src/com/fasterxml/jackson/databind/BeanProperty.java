// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.util.Annotations;

// Referenced classes of package com.fasterxml.jackson.databind:
//            JavaType

public interface BeanProperty
{
    public static class Std
        implements BeanProperty
    {

        protected final Annotations _contextAnnotations;
        public final AnnotatedMember _member;
        protected final String _name;
        protected final JavaType _type;

        public AnnotatedMember getMember()
        {
            return _member;
        }

        public JavaType getType()
        {
            return _type;
        }

        public Std withType(JavaType javatype)
        {
            return new Std(_name, javatype, _contextAnnotations, _member);
        }

        public Std(String s, JavaType javatype, Annotations annotations, AnnotatedMember annotatedmember)
        {
            _name = s;
            _type = javatype;
            _member = annotatedmember;
            _contextAnnotations = annotations;
        }
    }


    public abstract AnnotatedMember getMember();

    public abstract JavaType getType();
}
