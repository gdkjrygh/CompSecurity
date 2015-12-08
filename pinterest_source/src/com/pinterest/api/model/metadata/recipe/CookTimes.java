// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model.metadata.recipe;

import com.pinterest.api.model.ModelHelper;
import com.pinterest.kit.application.Resources;
import com.pinterest.network.json.PinterestJsonObject;

public class CookTimes
{

    public static final int COOK = 2;
    public static final int NONE = -1;
    public static final int PREP = 1;
    public static final int TOTAL = 0;
    private String _cookDisplay;
    private String _prepDisplay;
    private String _totalDisplay;

    public CookTimes()
    {
        this(null);
    }

    public CookTimes(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject == null)
        {
            return;
        } else
        {
            resolveTimes(pinterestjsonobject);
            return;
        }
    }

    private void resolveTimes(PinterestJsonObject pinterestjsonobject)
    {
        PinterestJsonObject pinterestjsonobject1 = pinterestjsonobject.c("total");
        if (pinterestjsonobject1 != null)
        {
            resolveTypedTime(0, pinterestjsonobject1);
        }
        pinterestjsonobject1 = pinterestjsonobject.c("prep");
        if (pinterestjsonobject1 != null)
        {
            resolveTypedTime(1, pinterestjsonobject1);
        }
        pinterestjsonobject = pinterestjsonobject.c("cook");
        if (pinterestjsonobject != null)
        {
            resolveTypedTime(2, pinterestjsonobject);
        }
    }

    private void resolveTypedTime(int i, PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject == null)
        {
            return;
        }
        int j = pinterestjsonobject.a("h", 0);
        int k = pinterestjsonobject.a("m", 0);
        switch (i)
        {
        default:
            return;

        case 0: // '\0'
            _totalDisplay = findDisplay(i, j, k);
            return;

        case 1: // '\001'
            _prepDisplay = findDisplay(i, j, k);
            return;

        case 2: // '\002'
            _cookDisplay = findDisplay(i, j, k);
            break;
        }
    }

    public String findDisplay(int i, int j, int k)
    {
        if (j != 0 && k != 0)
        {
            i = 0x7f090021;
        } else
        if (j != 0)
        {
            i = 0x7f090022;
        } else
        {
            if (k != 0)
            {
                return Resources.string(0x7f07048a, new Object[] {
                    Integer.valueOf(k)
                });
            }
            i = -1;
        }
        if (i != -1)
        {
            if (j != 0)
            {
                return Resources.stringPlural(i, Integer.valueOf(j), new Object[] {
                    Integer.valueOf(j), Integer.valueOf(k)
                });
            } else
            {
                return Resources.stringPlural(i, Integer.valueOf(k), new Object[] {
                    Integer.valueOf(k)
                });
            }
        } else
        {
            return null;
        }
    }

    public String getCookDisplay()
    {
        return _cookDisplay;
    }

    public String getDisplay()
    {
        if (ModelHelper.isValid(_totalDisplay))
        {
            return _totalDisplay;
        }
        if (ModelHelper.isValid(_cookDisplay))
        {
            return _cookDisplay;
        }
        if (ModelHelper.isValid(_prepDisplay))
        {
            return _prepDisplay;
        } else
        {
            return null;
        }
    }

    public String getPrepDisplay()
    {
        return _prepDisplay;
    }

    public String getTotalDisplay()
    {
        return _totalDisplay;
    }

    public void setCookDisplay(String s)
    {
        _cookDisplay = s;
    }

    public void setPrepDisplay(String s)
    {
        _prepDisplay = s;
    }

    public void setTotalDisplay(String s)
    {
        _totalDisplay = s;
    }
}
