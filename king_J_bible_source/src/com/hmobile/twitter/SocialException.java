// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.twitter;


public class SocialException extends Exception
{
    public static final class SocialExceptionType extends Enum
    {

        public static final SocialExceptionType APP_IdNotSet;
        public static final SocialExceptionType ConsumerDataNotSet;
        public static final SocialExceptionType ContextNotSet;
        private static final SocialExceptionType ENUM$VALUES[];

        public static SocialExceptionType valueOf(String s)
        {
            return (SocialExceptionType)Enum.valueOf(com/hmobile/twitter/SocialException$SocialExceptionType, s);
        }

        public static SocialExceptionType[] values()
        {
            SocialExceptionType asocialexceptiontype[] = ENUM$VALUES;
            int i = asocialexceptiontype.length;
            SocialExceptionType asocialexceptiontype1[] = new SocialExceptionType[i];
            System.arraycopy(asocialexceptiontype, 0, asocialexceptiontype1, 0, i);
            return asocialexceptiontype1;
        }

        static 
        {
            ContextNotSet = new SocialExceptionType("ContextNotSet", 0);
            APP_IdNotSet = new SocialExceptionType("APP_IdNotSet", 1);
            ConsumerDataNotSet = new SocialExceptionType("ConsumerDataNotSet", 2);
            ENUM$VALUES = (new SocialExceptionType[] {
                ContextNotSet, APP_IdNotSet, ConsumerDataNotSet
            });
        }

        private SocialExceptionType(String s, int i)
        {
            super(s, i);
        }
    }


    private SocialExceptionType m_type;

    public SocialException()
    {
    }

    public SocialException(SocialExceptionType socialexceptiontype)
    {
        m_type = socialexceptiontype;
    }

    public SocialException(String s)
    {
        super(s);
    }

    public SocialExceptionType getExceptionType()
    {
        return m_type;
    }
}
