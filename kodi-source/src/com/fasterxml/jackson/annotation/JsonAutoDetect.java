// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

public interface JsonAutoDetect
    extends Annotation
{
    public static final class Visibility extends Enum
    {

        private static final Visibility $VALUES[];
        public static final Visibility ANY;
        public static final Visibility DEFAULT;
        public static final Visibility NONE;
        public static final Visibility NON_PRIVATE;
        public static final Visibility PROTECTED_AND_PUBLIC;
        public static final Visibility PUBLIC_ONLY;

        public static Visibility valueOf(String s)
        {
            return (Visibility)Enum.valueOf(com/fasterxml/jackson/annotation/JsonAutoDetect$Visibility, s);
        }

        public static Visibility[] values()
        {
            return (Visibility[])$VALUES.clone();
        }

        public boolean isVisible(Member member)
        {
            boolean flag;
            boolean flag1;
            flag1 = true;
            flag = flag1;
            static class _cls1
            {

                static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[];

                static 
                {
                    $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility = new int[Visibility.values().length];
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[Visibility.ANY.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[Visibility.NONE.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[Visibility.NON_PRIVATE.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[Visibility.PROTECTED_AND_PUBLIC.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$fasterxml$jackson$annotation$JsonAutoDetect$Visibility[Visibility.PUBLIC_ONLY.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            _cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility[ordinal()];
            JVM INSTR tableswitch 1 5: default 48
        //                       1 50
        //                       2 52
        //                       3 54
        //                       4 70
        //                       5 84;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L2:
            break MISSING_BLOCK_LABEL_50;
_L1:
            flag = false;
_L8:
            return flag;
_L3:
            return false;
_L4:
            flag = flag1;
            if (!Modifier.isPrivate(member.getModifiers())) goto _L8; else goto _L7
_L7:
            return false;
_L5:
            flag = flag1;
            if (Modifier.isProtected(member.getModifiers())) goto _L8; else goto _L6
_L6:
            return Modifier.isPublic(member.getModifiers());
        }

        static 
        {
            ANY = new Visibility("ANY", 0);
            NON_PRIVATE = new Visibility("NON_PRIVATE", 1);
            PROTECTED_AND_PUBLIC = new Visibility("PROTECTED_AND_PUBLIC", 2);
            PUBLIC_ONLY = new Visibility("PUBLIC_ONLY", 3);
            NONE = new Visibility("NONE", 4);
            DEFAULT = new Visibility("DEFAULT", 5);
            $VALUES = (new Visibility[] {
                ANY, NON_PRIVATE, PROTECTED_AND_PUBLIC, PUBLIC_ONLY, NONE, DEFAULT
            });
        }

        private Visibility(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract Visibility creatorVisibility();

    public abstract Visibility fieldVisibility();

    public abstract Visibility getterVisibility();

    public abstract Visibility isGetterVisibility();

    public abstract Visibility setterVisibility();
}
