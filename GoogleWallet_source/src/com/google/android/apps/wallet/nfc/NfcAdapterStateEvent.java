// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.nfc;


public class NfcAdapterStateEvent
{

    private final int state;

    private NfcAdapterStateEvent(int i)
    {
        state = i;
    }

    public static NfcAdapterStateEvent off()
    {
        return new NfcAdapterStateEvent(1);
    }

    public static NfcAdapterStateEvent on()
    {
        return new NfcAdapterStateEvent(0);
    }

    public static NfcAdapterStateEvent unsupported()
    {
        return new NfcAdapterStateEvent(2);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof NfcAdapterStateEvent)
        {
            obj = (NfcAdapterStateEvent)obj;
            flag = flag1;
            if (state == ((NfcAdapterStateEvent) (obj)).state)
            {
                flag = true;
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return state;
    }

    public final boolean isAdapterStateOn()
    {
        return state == 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        stringbuilder.append("NfcAdapterStateEvent: ");
        state;
        JVM INSTR tableswitch 0 2: default 44
    //                   0 72
    //                   1 82
    //                   2 92;
           goto _L1 _L2 _L3 _L4
_L1:
        stringbuilder.append("UNKNOWN (");
        stringbuilder.append(state);
        stringbuilder.append(")");
_L6:
        return stringbuilder.toString();
_L2:
        stringbuilder.append("ON");
        continue; /* Loop/switch isn't completed */
_L3:
        stringbuilder.append("OFF");
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuilder.append("UNSUPPORTED");
        if (true) goto _L6; else goto _L5
_L5:
    }
}
