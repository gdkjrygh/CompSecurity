// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.event;

import com.auditude.ads.model.smil.Par;
import com.auditude.ads.model.smil.Sequence;
import com.auditude.ads.util.event.Event;
import com.auditude.ads.util.event.IEventDispatcher;

public class SMILEvent extends Event
{
    public static final class SMILEventType extends Enum
    {

        private static final SMILEventType ENUM$VALUES[];
        public static final SMILEventType PAR_BEGIN;
        public static final SMILEventType PAR_END;
        public static final SMILEventType SEQUENCE_BEGIN;
        public static final SMILEventType SEQUENCE_END;

        public static SMILEventType valueOf(String s)
        {
            return (SMILEventType)Enum.valueOf(com/auditude/ads/event/SMILEvent$SMILEventType, s);
        }

        public static SMILEventType[] values()
        {
            SMILEventType asmileventtype[] = ENUM$VALUES;
            int i = asmileventtype.length;
            SMILEventType asmileventtype1[] = new SMILEventType[i];
            System.arraycopy(asmileventtype, 0, asmileventtype1, 0, i);
            return asmileventtype1;
        }

        static 
        {
            SEQUENCE_BEGIN = new SMILEventType("SEQUENCE_BEGIN", 0);
            SEQUENCE_END = new SMILEventType("SEQUENCE_END", 1);
            PAR_BEGIN = new SMILEventType("PAR_BEGIN", 2);
            PAR_END = new SMILEventType("PAR_END", 3);
            ENUM$VALUES = (new SMILEventType[] {
                SEQUENCE_BEGIN, SEQUENCE_END, PAR_BEGIN, PAR_END
            });
        }

        private SMILEventType(String s, int i)
        {
            super(s, i);
        }
    }


    private boolean advancePattern;
    private Par par;
    private Sequence sequence;
    private SMILEventType type;

    public SMILEvent(IEventDispatcher ieventdispatcher, SMILEventType smileventtype, Sequence sequence1, Par par1, boolean flag)
    {
        super(ieventdispatcher);
        advancePattern = true;
        type = smileventtype;
        sequence = sequence1;
        par = par1;
        advancePattern = flag;
    }

    public final boolean getAdvancePattern()
    {
        return advancePattern;
    }

    public final Par getPar()
    {
        return par;
    }

    public final Sequence getSequence()
    {
        return sequence;
    }

    public final SMILEventType getType()
    {
        return type;
    }
}
