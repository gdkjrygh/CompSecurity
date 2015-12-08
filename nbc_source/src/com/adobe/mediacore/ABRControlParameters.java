// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


public final class ABRControlParameters
{
    public static final class ABRPolicy extends Enum
    {

        private static final ABRPolicy $VALUES[];
        public static final ABRPolicy ABR_AGGRESSIVE;
        public static final ABRPolicy ABR_CONSERVATIVE;
        public static final ABRPolicy ABR_MODERATE;
        private final int _value;

        public static ABRPolicy valueOf(String s)
        {
            return (ABRPolicy)Enum.valueOf(com/adobe/mediacore/ABRControlParameters$ABRPolicy, s);
        }

        public static ABRPolicy[] values()
        {
            return (ABRPolicy[])$VALUES.clone();
        }

        public int getValue()
        {
            return _value;
        }

        static 
        {
            ABR_CONSERVATIVE = new ABRPolicy("ABR_CONSERVATIVE", 0, 0);
            ABR_MODERATE = new ABRPolicy("ABR_MODERATE", 1, 1);
            ABR_AGGRESSIVE = new ABRPolicy("ABR_AGGRESSIVE", 2, 2);
            $VALUES = (new ABRPolicy[] {
                ABR_CONSERVATIVE, ABR_MODERATE, ABR_AGGRESSIVE
            });
        }

        private ABRPolicy(String s, int i, int j)
        {
            super(s, i);
            _value = j;
        }
    }


    private final ABRPolicy _abrPolicy;
    private final int _initialBitRate;
    private final int _maxBitRate;
    private final int _minBitRate;

    public ABRControlParameters(int i, int j, int k, ABRPolicy abrpolicy)
    {
        _initialBitRate = i;
        _minBitRate = j;
        _maxBitRate = k;
        _abrPolicy = abrpolicy;
    }

    public ABRPolicy getABRPolicy()
    {
        return _abrPolicy;
    }

    public int getInitialBitRate()
    {
        return _initialBitRate;
    }

    public int getMaxBitRate()
    {
        return _maxBitRate;
    }

    public int getMinBitRate()
    {
        return _minBitRate;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getClass().getName()).append("Object {");
        stringbuilder.append(" initialBitRate=").append(_initialBitRate);
        stringbuilder.append(" ,minBitRate=").append(_minBitRate);
        stringbuilder.append(" ,maxBitRate=").append(_maxBitRate);
        stringbuilder.append(" ,abrPolicy=").append(_abrPolicy.name());
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }
}
