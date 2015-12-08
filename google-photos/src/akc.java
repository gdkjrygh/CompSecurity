// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import androidx.media.filterfw.ViewFilter;

public final class akc
    implements ajq
{

    private ViewFilter a;

    public akc(ViewFilter viewfilter)
    {
        a = viewfilter;
        super();
    }

    public final void a(ajo ajo, ahs ahs1)
    {
label0:
        {
            ajo = (String)ahs1.d().m();
            if (!ajo.equals(ViewFilter.a(a)))
            {
                ViewFilter.a(a, ajo);
                if (!ajo.equals("stretch"))
                {
                    break label0;
                }
                a.mScaleMode = 1;
            }
            return;
        }
        if (ajo.equals("fit"))
        {
            a.mScaleMode = 2;
            return;
        }
        if (ajo.equals("fill"))
        {
            a.mScaleMode = 3;
            return;
        } else
        {
            throw new RuntimeException((new StringBuilder(String.valueOf(ajo).length() + 22)).append("Unknown scale-mode '").append(ajo).append("'!").toString());
        }
    }
}
