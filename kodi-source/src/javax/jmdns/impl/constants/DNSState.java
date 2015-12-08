// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns.impl.constants;


public final class DNSState extends Enum
{
    private static final class StateClass extends Enum
    {

        private static final StateClass $VALUES[];
        public static final StateClass announced;
        public static final StateClass announcing;
        public static final StateClass canceled;
        public static final StateClass canceling;
        public static final StateClass closed;
        public static final StateClass closing;
        public static final StateClass probing;

        public static StateClass valueOf(String s)
        {
            return (StateClass)Enum.valueOf(javax/jmdns/impl/constants/DNSState$StateClass, s);
        }

        public static StateClass[] values()
        {
            return (StateClass[])$VALUES.clone();
        }

        static 
        {
            probing = new StateClass("probing", 0);
            announcing = new StateClass("announcing", 1);
            announced = new StateClass("announced", 2);
            canceling = new StateClass("canceling", 3);
            canceled = new StateClass("canceled", 4);
            closing = new StateClass("closing", 5);
            closed = new StateClass("closed", 6);
            $VALUES = (new StateClass[] {
                probing, announcing, announced, canceling, canceled, closing, closed
            });
        }

        private StateClass(String s, int i)
        {
            super(s, i);
        }
    }


    private static final DNSState $VALUES[];
    public static final DNSState ANNOUNCED;
    public static final DNSState ANNOUNCING_1;
    public static final DNSState ANNOUNCING_2;
    public static final DNSState CANCELED;
    public static final DNSState CANCELING_1;
    public static final DNSState CANCELING_2;
    public static final DNSState CANCELING_3;
    public static final DNSState CLOSED;
    public static final DNSState CLOSING;
    public static final DNSState PROBING_1;
    public static final DNSState PROBING_2;
    public static final DNSState PROBING_3;
    private final String _name;
    private final StateClass _state;

    private DNSState(String s, int i, String s1, StateClass stateclass)
    {
        super(s, i);
        _name = s1;
        _state = stateclass;
    }

    public static DNSState valueOf(String s)
    {
        return (DNSState)Enum.valueOf(javax/jmdns/impl/constants/DNSState, s);
    }

    public static DNSState[] values()
    {
        return (DNSState[])$VALUES.clone();
    }

    public final DNSState advance()
    {
        static class _cls1
        {

            static final int $SwitchMap$javax$jmdns$impl$constants$DNSState[];

            static 
            {
                $SwitchMap$javax$jmdns$impl$constants$DNSState = new int[DNSState.values().length];
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSState[DNSState.PROBING_1.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSState[DNSState.PROBING_2.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSState[DNSState.PROBING_3.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSState[DNSState.ANNOUNCING_1.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSState[DNSState.ANNOUNCING_2.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSState[DNSState.ANNOUNCED.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSState[DNSState.CANCELING_1.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSState[DNSState.CANCELING_2.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSState[DNSState.CANCELING_3.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSState[DNSState.CANCELED.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSState[DNSState.CLOSING.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$javax$jmdns$impl$constants$DNSState[DNSState.CLOSED.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.javax.jmdns.impl.constants.DNSState[ordinal()])
        {
        default:
            return this;

        case 1: // '\001'
            return PROBING_2;

        case 2: // '\002'
            return PROBING_3;

        case 3: // '\003'
            return ANNOUNCING_1;

        case 4: // '\004'
            return ANNOUNCING_2;

        case 5: // '\005'
            return ANNOUNCED;

        case 6: // '\006'
            return ANNOUNCED;

        case 7: // '\007'
            return CANCELING_2;

        case 8: // '\b'
            return CANCELING_3;

        case 9: // '\t'
            return CANCELED;

        case 10: // '\n'
            return CANCELED;

        case 11: // '\013'
            return CLOSED;

        case 12: // '\f'
            return CLOSED;
        }
    }

    public final boolean isAnnounced()
    {
        return _state == StateClass.announced;
    }

    public final boolean isAnnouncing()
    {
        return _state == StateClass.announcing;
    }

    public final boolean isCanceled()
    {
        return _state == StateClass.canceled;
    }

    public final boolean isCanceling()
    {
        return _state == StateClass.canceling;
    }

    public final boolean isClosed()
    {
        return _state == StateClass.closed;
    }

    public final boolean isClosing()
    {
        return _state == StateClass.closing;
    }

    public final boolean isProbing()
    {
        return _state == StateClass.probing;
    }

    public final DNSState revert()
    {
        switch (_cls1..SwitchMap.javax.jmdns.impl.constants.DNSState[ordinal()])
        {
        default:
            return this;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return PROBING_1;

        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
            return CANCELING_1;

        case 10: // '\n'
            return CANCELED;

        case 11: // '\013'
            return CLOSING;

        case 12: // '\f'
            return CLOSED;
        }
    }

    public final String toString()
    {
        return _name;
    }

    static 
    {
        PROBING_1 = new DNSState("PROBING_1", 0, "probing 1", StateClass.probing);
        PROBING_2 = new DNSState("PROBING_2", 1, "probing 2", StateClass.probing);
        PROBING_3 = new DNSState("PROBING_3", 2, "probing 3", StateClass.probing);
        ANNOUNCING_1 = new DNSState("ANNOUNCING_1", 3, "announcing 1", StateClass.announcing);
        ANNOUNCING_2 = new DNSState("ANNOUNCING_2", 4, "announcing 2", StateClass.announcing);
        ANNOUNCED = new DNSState("ANNOUNCED", 5, "announced", StateClass.announced);
        CANCELING_1 = new DNSState("CANCELING_1", 6, "canceling 1", StateClass.canceling);
        CANCELING_2 = new DNSState("CANCELING_2", 7, "canceling 2", StateClass.canceling);
        CANCELING_3 = new DNSState("CANCELING_3", 8, "canceling 3", StateClass.canceling);
        CANCELED = new DNSState("CANCELED", 9, "canceled", StateClass.canceled);
        CLOSING = new DNSState("CLOSING", 10, "closing", StateClass.closing);
        CLOSED = new DNSState("CLOSED", 11, "closed", StateClass.closed);
        $VALUES = (new DNSState[] {
            PROBING_1, PROBING_2, PROBING_3, ANNOUNCING_1, ANNOUNCING_2, ANNOUNCED, CANCELING_1, CANCELING_2, CANCELING_3, CANCELED, 
            CLOSING, CLOSED
        });
    }
}
