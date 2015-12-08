// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.constants;

import me.lyft.android.common.INullable;

public class HintMetaDTO
    implements INullable
{

    String backgroundColor;
    String id;
    Integer numDisplays;
    String text;

    public HintMetaDTO()
    {
    }

    public static HintMetaDTO empty()
    {
        return NullHintDTO.getInstance();
    }

    public String getBackgroundColor()
    {
        return backgroundColor;
    }

    public String getId()
    {
        return id;
    }

    public Integer getNumDisplays()
    {
        return numDisplays;
    }

    public String getText()
    {
        return text;
    }

    public boolean isNull()
    {
        return false;
    }

    public void setBackgroundColor(String s)
    {
        backgroundColor = s;
    }

    private class NullHintDTO extends HintMetaDTO
    {

        private static final NullHintDTO INSTANCE = new NullHintDTO();

        static NullHintDTO getInstance()
        {
            return INSTANCE;
        }

        public String getId()
        {
            return "";
        }

        public Integer getNumDisplays()
        {
            return Integer.valueOf(0);
        }

        public String getText()
        {
            return "";
        }

        public boolean isNull()
        {
            return true;
        }


        public NullHintDTO()
        {
        }
    }

}
