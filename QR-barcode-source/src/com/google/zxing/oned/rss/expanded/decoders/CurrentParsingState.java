// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;


final class CurrentParsingState
{
    private static final class State extends Enum
    {

        private static final State $VALUES[];
        public static final State ALPHA;
        public static final State ISO_IEC_646;
        public static final State NUMERIC;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/google/zxing/oned/rss/expanded/decoders/CurrentParsingState$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            NUMERIC = new State("NUMERIC", 0);
            ALPHA = new State("ALPHA", 1);
            ISO_IEC_646 = new State("ISO_IEC_646", 2);
            $VALUES = (new State[] {
                NUMERIC, ALPHA, ISO_IEC_646
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    private State encoding;
    private int position;

    CurrentParsingState()
    {
        position = 0;
        encoding = State.NUMERIC;
    }

    int getPosition()
    {
        return position;
    }

    void incrementPosition(int i)
    {
        position = position + i;
    }

    boolean isAlpha()
    {
        return encoding == State.ALPHA;
    }

    boolean isIsoIec646()
    {
        return encoding == State.ISO_IEC_646;
    }

    boolean isNumeric()
    {
        return encoding == State.NUMERIC;
    }

    void setAlpha()
    {
        encoding = State.ALPHA;
    }

    void setIsoIec646()
    {
        encoding = State.ISO_IEC_646;
    }

    void setNumeric()
    {
        encoding = State.NUMERIC;
    }

    void setPosition(int i)
    {
        position = i;
    }
}
