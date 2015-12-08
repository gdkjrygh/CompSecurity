// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.inmobi.rendering;


public class RenderingProperties
{
    public static final class PlacementType extends Enum
    {

        private static final PlacementType $VALUES[];
        public static final PlacementType FULL_SCREEN;
        public static final PlacementType INLINE;

        public static PlacementType valueOf(String s)
        {
            return (PlacementType)Enum.valueOf(com/inmobi/rendering/RenderingProperties$PlacementType, s);
        }

        public static PlacementType[] values()
        {
            return (PlacementType[])$VALUES.clone();
        }

        static 
        {
            FULL_SCREEN = new PlacementType("FULL_SCREEN", 0);
            INLINE = new PlacementType("INLINE", 1);
            $VALUES = (new PlacementType[] {
                FULL_SCREEN, INLINE
            });
        }

        private PlacementType(String s, int i)
        {
            super(s, i);
        }
    }


    private PlacementType a;

    public RenderingProperties(PlacementType placementtype)
    {
        a = placementtype;
    }

    public PlacementType a()
    {
        return a;
    }
}
