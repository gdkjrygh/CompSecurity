// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.tools.dextr.runtime.detour;

import com.facebook.loom.core.TraceEvents;
import com.facebook.loom.logger.Logger;
import com.facebook.sequencelogger.Sequence;
import com.google.common.collect.ImmutableMap;

public class SequenceLoggerDetour
{

    public SequenceLoggerDetour()
    {
    }

    private static long a(Sequence sequence)
    {
        String s = sequence.a();
        long l;
        if (s != null)
        {
            l = s.hashCode();
        } else
        {
            l = 0L;
        }
        return l << 32 | (long)sequence.b();
    }

    public static Sequence a(Sequence sequence, String s, int i)
    {
        Sequence sequence1 = sequence.a(s);
        if (!TraceEvents.a(8))
        {
            return sequence1;
        } else
        {
            Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_START, i, s.hashCode(), a(sequence));
            return sequence1;
        }
    }

    public static Sequence a(Sequence sequence, String s, ImmutableMap immutablemap, long l, int i)
    {
        immutablemap = sequence.a(s, immutablemap, l);
        if (!TraceEvents.a(8))
        {
            return immutablemap;
        } else
        {
            Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_FLAG, i, s.hashCode(), a(sequence));
            return immutablemap;
        }
    }

    public static Sequence a(Sequence sequence, String s, String s1, int i)
    {
        s1 = sequence.a(s, s1);
        if (!TraceEvents.a(8))
        {
            return s1;
        } else
        {
            Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_CANCEL, i, s.hashCode(), a(sequence));
            return s1;
        }
    }

    public static Sequence a(Sequence sequence, String s, String s1, long l, int i)
    {
        s1 = sequence.a(s, s1, l);
        if (!TraceEvents.a(8))
        {
            return s1;
        } else
        {
            Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_CANCEL, i, s.hashCode(), a(sequence));
            return s1;
        }
    }

    public static Sequence a(Sequence sequence, String s, String s1, ImmutableMap immutablemap, int i)
    {
        s1 = sequence.a(s, s1, immutablemap);
        if (!TraceEvents.a(8))
        {
            return s1;
        } else
        {
            Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_START, i, s.hashCode(), a(sequence));
            return s1;
        }
    }

    public static Sequence a(Sequence sequence, String s, String s1, ImmutableMap immutablemap, long l, int i)
    {
        s1 = sequence.a(s, s1, immutablemap, l);
        if (!TraceEvents.a(8))
        {
            return s1;
        } else
        {
            Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_START, i, s.hashCode(), a(sequence));
            return s1;
        }
    }

    public static Sequence a(Sequence sequence, String s, String s1, ImmutableMap immutablemap, long l, Boolean boolean1, int i)
    {
        s1 = sequence.a(s, s1, immutablemap, l, boolean1);
        if (!TraceEvents.a(8))
        {
            return s1;
        } else
        {
            Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_START, i, s.hashCode(), a(sequence));
            return s1;
        }
    }

    public static Sequence b(Sequence sequence, String s, int i)
    {
        Sequence sequence1 = sequence.b(s);
        if (!TraceEvents.a(8))
        {
            return sequence1;
        } else
        {
            Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_STOP, i, s.hashCode(), a(sequence));
            return sequence1;
        }
    }

    public static Sequence b(Sequence sequence, String s, String s1, ImmutableMap immutablemap, int i)
    {
        s1 = sequence.b(s, s1, immutablemap);
        if (!TraceEvents.a(8))
        {
            return s1;
        } else
        {
            Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_STOP, i, s.hashCode(), a(sequence));
            return s1;
        }
    }

    public static Sequence b(Sequence sequence, String s, String s1, ImmutableMap immutablemap, long l, int i)
    {
        s1 = sequence.b(s, s1, immutablemap, l);
        if (!TraceEvents.a(8))
        {
            return s1;
        } else
        {
            Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_STOP, i, s.hashCode(), a(sequence));
            return s1;
        }
    }

    public static Sequence b(Sequence sequence, String s, String s1, ImmutableMap immutablemap, long l, Boolean boolean1, int i)
    {
        s1 = sequence.b(s, s1, immutablemap, l, boolean1);
        if (!TraceEvents.a(8))
        {
            return s1;
        } else
        {
            Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_STOP, i, s.hashCode(), a(sequence));
            return s1;
        }
    }

    public static Sequence c(Sequence sequence, String s, int i)
    {
        Sequence sequence1 = sequence.c(s);
        if (!TraceEvents.a(8))
        {
            return sequence1;
        } else
        {
            Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_FAIL, i, s.hashCode(), a(sequence));
            return sequence1;
        }
    }

    public static Sequence c(Sequence sequence, String s, String s1, ImmutableMap immutablemap, int i)
    {
        s1 = sequence.c(s, s1, immutablemap);
        if (!TraceEvents.a(8))
        {
            return s1;
        } else
        {
            Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_FAIL, i, s.hashCode(), a(sequence));
            return s1;
        }
    }

    public static Sequence c(Sequence sequence, String s, String s1, ImmutableMap immutablemap, long l, int i)
    {
        s1 = sequence.c(s, s1, immutablemap, l);
        if (!TraceEvents.a(8))
        {
            return s1;
        } else
        {
            Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_FAIL, i, s.hashCode(), a(sequence));
            return s1;
        }
    }

    public static Sequence d(Sequence sequence, String s, int i)
    {
        Sequence sequence1 = sequence.d(s);
        if (!TraceEvents.a(8))
        {
            return sequence1;
        } else
        {
            Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_CANCEL, i, s.hashCode(), a(sequence));
            return sequence1;
        }
    }

    public static Sequence e(Sequence sequence, String s, int i)
    {
        Sequence sequence1 = sequence.e(s);
        if (!TraceEvents.a(8))
        {
            return sequence1;
        } else
        {
            Logger.a(8, com.facebook.loom.logger.LogEntry.EntryType.MARK_FLAG, i, s.hashCode(), a(sequence));
            return sequence1;
        }
    }
}
