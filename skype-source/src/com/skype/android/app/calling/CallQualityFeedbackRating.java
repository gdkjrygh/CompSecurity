// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;


public class CallQualityFeedbackRating
{
    public static final class CQFType extends Enum
    {

        private static final CQFType $VALUES[];
        public static final CQFType MPA;
        public static final CQFType MPV;
        public static final CQFType SKYPE_OUT;
        public static final CQFType SKYPE_TO_SKYPE;
        private final String label;

        public static CQFType valueOf(String s)
        {
            return (CQFType)Enum.valueOf(com/skype/android/app/calling/CallQualityFeedbackRating$CQFType, s);
        }

        public static CQFType[] values()
        {
            return (CQFType[])$VALUES.clone();
        }

        public final String getLabel()
        {
            return label;
        }

        static 
        {
            SKYPE_OUT = new CQFType("SKYPE_OUT", 0, "25");
            SKYPE_TO_SKYPE = new CQFType("SKYPE_TO_SKYPE", 1, "26");
            MPA = new CQFType("MPA", 2, "27");
            MPV = new CQFType("MPV", 3, "28");
            $VALUES = (new CQFType[] {
                SKYPE_OUT, SKYPE_TO_SKYPE, MPA, MPV
            });
        }

        private CQFType(String s, int i, String s1)
        {
            super(s, i);
            label = s1;
        }
    }

    public static final class State extends Enum
    {

        private static final State $VALUES[];
        public static final State PENDING;
        public static final State SUBMITTED;
        public static final State UPLOADED;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/skype/android/app/calling/CallQualityFeedbackRating$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            PENDING = new State("PENDING", 0);
            SUBMITTED = new State("SUBMITTED", 1);
            UPLOADED = new State("UPLOADED", 2);
            $VALUES = (new State[] {
                PENDING, SUBMITTED, UPLOADED
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    public static final int NONE = 0;
    private static final int RATING_TIMEOUT_MILLIS = 30000;
    private final int convoId;
    private CQFType cqfType;
    private long expiryTimestamp;
    private final int id;
    private State state;
    private int value;

    public CallQualityFeedbackRating(int i, int j, CQFType cqftype)
    {
        value = 0;
        state = State.PENDING;
        id = i;
        convoId = j;
        cqfType = cqftype;
        expiryTimestamp = System.currentTimeMillis() + 30000L;
    }

    public int getConvoId()
    {
        return convoId;
    }

    public CQFType getCqfType()
    {
        return cqfType;
    }

    public int getId()
    {
        return id;
    }

    public State getState()
    {
        return state;
    }

    public int getValue()
    {
        return value;
    }

    public boolean isExpired()
    {
        return state == State.PENDING && System.currentTimeMillis() >= expiryTimestamp;
    }

    public void setSubmitted()
    {
        state = State.SUBMITTED;
    }

    public void setUploaded()
    {
        state = State.UPLOADED;
    }

    public void setValue(int i)
    {
        value = i;
        state = State.PENDING;
    }
}
