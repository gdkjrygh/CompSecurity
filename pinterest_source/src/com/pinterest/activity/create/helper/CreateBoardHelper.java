// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.helper;

import com.pinterest.kit.data.DiskCache;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;

public class CreateBoardHelper
{

    public CreateBoardHelper()
    {
    }

    private static PinterestJsonObject addNewBoardToCache(PinterestJsonObject pinterestjsonobject)
    {
        PinterestJsonObject pinterestjsonobject1;
        try
        {
            pinterestjsonobject1 = DiskCache.getJsonObject("MY_PICKER_BOARDS");
            PinterestJsonArray pinterestjsonarray = pinterestjsonobject1.e("data");
            pinterestjsonarray.a(pinterestjsonobject);
            pinterestjsonobject1.a("data", pinterestjsonarray);
            DiskCache.setJsonObject("MY_PICKER_BOARDS", pinterestjsonobject1);
        }
        // Misplaced declaration of an exception variable
        catch (PinterestJsonObject pinterestjsonobject)
        {
            return null;
        }
        return pinterestjsonobject1;
    }

    public static PinterestJsonObject removeBoardFromCache(String s)
    {
        PinterestJsonObject pinterestjsonobject;
        PinterestJsonArray pinterestjsonarray;
        pinterestjsonobject = DiskCache.getJsonObject("MY_PICKER_BOARDS");
        pinterestjsonarray = pinterestjsonobject.e("data");
        if (pinterestjsonarray.a() <= 0) goto _L2; else goto _L1
_L1:
        PinterestJsonArray pinterestjsonarray1 = new PinterestJsonArray();
        int i;
        i = 0;
        PinterestJsonObject pinterestjsonobject1;
        int j;
        try
        {
            j = pinterestjsonarray.a();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
_L8:
        if (i >= j) goto _L4; else goto _L3
_L3:
        pinterestjsonobject1 = pinterestjsonarray.c(i);
        if (pinterestjsonobject1 == null) goto _L6; else goto _L5
_L5:
        if (!pinterestjsonobject1.a("id", "").equalsIgnoreCase(s))
        {
            pinterestjsonarray1.a(pinterestjsonobject1);
        }
          goto _L6
_L4:
        pinterestjsonobject.a("data", pinterestjsonarray1);
        DiskCache.setJsonObject("MY_PICKER_BOARDS", pinterestjsonobject);
_L2:
        return pinterestjsonobject;
_L6:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

}
