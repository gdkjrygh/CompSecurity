// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.s3;

import java.util.ArrayList;

// Referenced classes of package me.lyft.android.infrastructure.s3:
//            ConfigDTO

public class ConfigsDTO extends ArrayList
{

    public ConfigsDTO()
    {
    }

    public CharSequence[] asStringsArray()
    {
        CharSequence acharsequence[] = new CharSequence[size()];
        for (int i = 0; i < size(); i++)
        {
            acharsequence[i] = ((ConfigDTO)get(i)).getDisplayName();
        }

        return acharsequence;
    }

    public int getIndexForApiRoot(String s)
    {
        for (int i = 0; i < size(); i++)
        {
            if (((ConfigDTO)get(i)).getUrl().equals(s))
            {
                return i;
            }
        }

        return 0;
    }
}
