// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language;


// Referenced classes of package org.apache.commons.codec.language:
//            ColognePhonetic

private abstract class length
{

    protected final char data[];
    protected int length;
    final ColognePhonetic this$0;

    protected abstract char[] copyData(int i, int j);

    public int length()
    {
        return length;
    }

    public String toString()
    {
        return new String(copyData(0, length));
    }

    public (int i)
    {
        this$0 = ColognePhonetic.this;
        super();
        length = 0;
        data = new char[i];
        length = 0;
    }

    public length(char ac[])
    {
        this$0 = ColognePhonetic.this;
        super();
        length = 0;
        data = ac;
        length = ac.length;
    }
}
