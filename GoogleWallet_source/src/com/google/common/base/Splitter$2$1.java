// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Iterator;

// Referenced classes of package com.google.common.base:
//            Splitter

final class ttingIterator extends ttingIterator
{

    final l.separator this$0;

    public final int separatorEnd(int i)
    {
        return separator.length() + i;
    }

    public final int separatorStart(int i)
    {
        int k;
label0:
        {
            int l = separator.length();
label1:
            for (int i1 = toSplit.length(); i <= i1 - l; i++)
            {
                int j = 0;
                do
                {
                    k = i;
                    if (j >= l)
                    {
                        break label0;
                    }
                    if (toSplit.charAt(j + i) != separator.charAt(j))
                    {
                        continue label1;
                    }
                    j++;
                } while (true);
            }

            k = -1;
        }
        return k;
    }

    l.separator(Splitter splitter, CharSequence charsequence)
    {
        this$0 = this._cls0.this;
        super(splitter, charsequence);
    }

    // Unreferenced inner class com/google/common/base/Splitter$2

/* anonymous class */
    static final class Splitter._cls2
        implements Splitter.Strategy
    {

        final String val$separator;

        private Splitter.SplittingIterator iterator(Splitter splitter, CharSequence charsequence)
        {
            return new Splitter._cls2._cls1(splitter, charsequence);
        }

        public final volatile Iterator iterator(Splitter splitter, CharSequence charsequence)
        {
            return iterator(splitter, charsequence);
        }

            
            {
                separator = s;
                super();
            }
    }

}
