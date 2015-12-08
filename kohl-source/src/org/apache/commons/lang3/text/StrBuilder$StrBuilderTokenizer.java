// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.text;

import java.util.List;

// Referenced classes of package org.apache.commons.lang3.text:
//            StrTokenizer, StrBuilder

class this._cls0 extends StrTokenizer
{

    final StrBuilder this$0;

    public String getContent()
    {
        String s1 = super.getContent();
        String s = s1;
        if (s1 == null)
        {
            s = toString();
        }
        return s;
    }

    protected List tokenize(char ac[], int i, int j)
    {
        if (ac == null)
        {
            return super.tokenize(buffer, 0, size());
        } else
        {
            return super.tokenize(ac, i, j);
        }
    }

    ()
    {
        this$0 = StrBuilder.this;
        super();
    }
}
