// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.miniplayer;

import ho;
import java.util.ArrayList;
import java.util.List;

public final class MiniPlayerDisplayRule
{

    public List a;

    public MiniPlayerDisplayRule()
    {
        a = new ArrayList();
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (this != obj) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (getClass() == obj.getClass())
            {
                obj = (MiniPlayerDisplayRule)obj;
                flag = flag1;
                if (a.size() == ((MiniPlayerDisplayRule) (obj)).a.size())
                {
                    int i = 0;
label0:
                    do
                    {
label1:
                        {
                            if (i >= a.size())
                            {
                                break label1;
                            }
                            flag = flag1;
                            if (!((ho)a.get(i)).equals(((MiniPlayerDisplayRule) (obj)).a.get(i)))
                            {
                                break label0;
                            }
                            i++;
                        }
                    } while (true);
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        return true;
    }

    public final int hashCode()
    {
        return a.hashCode() * 31;
    }
}
