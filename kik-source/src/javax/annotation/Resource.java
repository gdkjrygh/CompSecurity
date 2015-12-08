// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.annotation;

import java.lang.annotation.Annotation;

public interface Resource
    extends Annotation
{
    public static final class AuthenticationType extends Enum
    {

        private static final AuthenticationType $VALUES[];
        public static final AuthenticationType APPLICATION;
        public static final AuthenticationType CONTAINER;

        public static AuthenticationType valueOf(String s)
        {
            return (AuthenticationType)Enum.valueOf(javax/annotation/Resource$AuthenticationType, s);
        }

        public static final AuthenticationType[] values()
        {
            return (AuthenticationType[])$VALUES.clone();
        }

        static 
        {
            CONTAINER = new AuthenticationType("CONTAINER", 0);
            APPLICATION = new AuthenticationType("APPLICATION", 1);
            $VALUES = (new AuthenticationType[] {
                CONTAINER, APPLICATION
            });
        }

        private AuthenticationType(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract AuthenticationType authenticationType();

    public abstract String description();

    public abstract String mappedName();

    public abstract String name();

    public abstract boolean shareable();

    public abstract Class type();
}
