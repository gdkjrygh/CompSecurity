// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models;

import org.a.a.a.a.f;
import org.a.a.a.a.g;

public class LabsPromotionValid
{

    String code;
    boolean isValidInStore;

    public LabsPromotionValid()
    {
    }

    public String getCode()
    {
        return code;
    }

    public boolean isValidInStore()
    {
        return isValidInStore;
    }

    public void setCode(String s)
    {
        code = s;
    }

    public void setValidInStore(boolean flag)
    {
        isValidInStore = flag;
    }

    public String toString()
    {
        return f.b(this, g.d);
    }
}
