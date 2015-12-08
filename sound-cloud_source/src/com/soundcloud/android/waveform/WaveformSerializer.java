// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.waveform;


public class WaveformSerializer
{

    public WaveformSerializer()
    {
    }

    public int[] deserialize(String s)
    {
        s = s.split(",");
        int ai[] = new int[s.length];
        for (int i = 0; i < s.length; i++)
        {
            ai[i] = Integer.parseInt(s[i]);
        }

        return ai;
    }

    public String serialize(int ai[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        boolean flag = true;
        int j = ai.length;
        int i = 0;
        while (i < j) 
        {
            int k = ai[i];
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append(',');
            }
            stringbuilder.append(k);
            i++;
        }
        return stringbuilder.toString();
    }
}
