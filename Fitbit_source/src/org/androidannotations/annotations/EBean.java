// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.androidannotations.annotations;

import java.lang.annotation.Annotation;

public interface EBean
    extends Annotation
{
    public static final class Scope extends Enum
    {

        public static final Scope a;
        public static final Scope b;
        private static final Scope c[];

        public static Scope valueOf(String s)
        {
            return (Scope)Enum.valueOf(org/androidannotations/annotations/EBean$Scope, s);
        }

        public static Scope[] values()
        {
            return (Scope[])c.clone();
        }

        static 
        {
            a = new Scope("Default", 0);
            b = new Scope("Singleton", 1);
            c = (new Scope[] {
                a, b
            });
        }

        private Scope(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract Scope a();
}
