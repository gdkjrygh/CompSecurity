// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import com.tinder.utils.DateUtils;
import com.tinder.utils.v;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class SuperlikeStatus
{

    public int numAllotted;
    public int numRemaining;
    public String resetDate;

    public SuperlikeStatus()
    {
    }

    public boolean isOutOfSuperlikes()
    {
        (new StringBuilder("resetDate is set to:")).append(resetDate);
        if (resetDate != null && !resetDate.equalsIgnoreCase("null")) goto _L2; else goto _L1
_L1:
        if (numRemaining > 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        Date date = DateUtils.b().parse(resetDate);
        if (numRemaining > 0 || date.getTime() <= System.currentTimeMillis())
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
        ParseException parseexception;
        parseexception;
        v.a("parsing reset date in Super Like Status", parseexception);
        if (numRemaining > 0)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public void reset()
    {
        numRemaining = numAllotted;
        resetDate = null;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("superlikes: [");
        stringbuilder.append((new StringBuilder("remaining:")).append(numRemaining).toString());
        stringbuilder.append((new StringBuilder(",allotment:")).append(numAllotted).toString());
        stringbuilder.append((new StringBuilder(",reset date:")).append(resetDate).toString());
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
