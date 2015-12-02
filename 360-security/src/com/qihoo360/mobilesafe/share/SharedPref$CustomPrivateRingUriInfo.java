// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.share;


// Referenced classes of package com.qihoo360.mobilesafe.share:
//            SharedPref

public static class RingType
{
    public static final class RingType extends Enum
    {

        public static final RingType CUSTOM;
        public static final RingType DEFUALT;
        public static final RingType MUTE;
        private static final RingType a[];

        public static RingType valueOf(String s)
        {
            return (RingType)Enum.valueOf(com/qihoo360/mobilesafe/share/SharedPref$CustomPrivateRingUriInfo$RingType, s);
        }

        public static RingType[] values()
        {
            return (RingType[])a.clone();
        }

        static 
        {
            DEFUALT = new RingType("DEFUALT", 0);
            MUTE = new RingType("MUTE", 1);
            CUSTOM = new RingType("CUSTOM", 2);
            a = (new RingType[] {
                DEFUALT, MUTE, CUSTOM
            });
        }

        private RingType(String s, int i)
        {
            super(s, i);
        }
    }

}
