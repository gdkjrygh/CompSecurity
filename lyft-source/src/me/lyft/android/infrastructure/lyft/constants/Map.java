// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.constants;

import me.lyft.android.common.INullable;

public class Map
    implements INullable
{

    String iconFile;

    public Map()
    {
    }

    public static Map empty()
    {
        return NullMap.getInstance();
    }

    public String getIconFile()
    {
        return iconFile;
    }

    public boolean isNull()
    {
        return false;
    }

    private class NullMap extends Map
    {

        private static final Map INSTANCE = new NullMap();

        static Map getInstance()
        {
            return INSTANCE;
        }

        public String getIconFile()
        {
            return "";
        }

        public boolean isNull()
        {
            return true;
        }


        NullMap()
        {
        }
    }

}
