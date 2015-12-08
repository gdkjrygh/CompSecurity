// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.exception;

import com.auditude.ads.core.AdSettings;
import com.auditude.ads.core.AuditudeEnv;
import com.auditude.ads.util.ObjectUtil;
import java.util.HashMap;

public class PlayerException extends Exception
{

    private static final long serialVersionUID = 1L;
    public int id;

    public PlayerException(int i, String s)
    {
        super(s);
        id = i;
    }

    public HashMap toParams()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("errorId", ObjectUtil.convertToString(Integer.valueOf(id), "0"));
        hashmap.put("message", getMessage());
        int i = AuditudeEnv.getInstance().getAdSettings().getZoneId();
        if (i > 0)
        {
            hashmap.put("z", ObjectUtil.convertToString(Integer.valueOf(i), "0"));
        }
        return hashmap;
    }
}
