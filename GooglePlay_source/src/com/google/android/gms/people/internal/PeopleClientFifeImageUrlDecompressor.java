// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class PeopleClientFifeImageUrlDecompressor
{

    public static final PeopleClientFifeImageUrlDecompressor INSTANCE = new PeopleClientFifeImageUrlDecompressor();
    private Pattern mPatterns[];
    private String mReplacements[];

    private PeopleClientFifeImageUrlDecompressor()
    {
        mPatterns = new Pattern[0];
        mReplacements = new String[0];
    }

    public final String decompress(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = TextUtils.isEmpty(s);
        if (!flag) goto _L2; else goto _L1
_L1:
        String s1 = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return s1;
_L2:
        int i = 0;
_L5:
        s1 = s;
        if (i >= mPatterns.length) goto _L4; else goto _L3
_L3:
        s = mPatterns[i].matcher(s).replaceAll(mReplacements[i]);
        i++;
          goto _L5
        s;
        throw s;
    }

    public final void setPatterns(String as[], String as1[])
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        boolean flag;
        if (as.length == as1.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        mPatterns = new Pattern[as.length];
        mReplacements = as1;
        i = 0;
_L2:
        if (i >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        mPatterns[i] = Pattern.compile(as[i]);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        return;
        as;
        throw as;
    }

}
