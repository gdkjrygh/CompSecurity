// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.iso7816;

import com.google.android.apps.wallet.hce.primitives.ByteArrayWrapper;
import com.google.android.apps.wallet.hce.util.Hex;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Bytes;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class Aid extends ByteArrayWrapper
{

    public static final Aid CARDMANAGER_AID;
    public static final Aid CASD_AID = new Aid(new byte[] {
        -96, 0, 0, 1, 81, 83, 80, 67, 65, 83, 
        68, 0
    });
    public static final Aid DISCOVER_RID = new Aid(new byte[] {
        -96, 0, 0, 3, 36
    });
    public static final Aid GOOGLE_CONTROLLER_AID;
    public static final Aid GOOGLE_LOCKET_AID;
    public static final Aid GOOGLE_MIFARE_MANAGER_AID;
    public static final Aid GOOGLE_PAYMENT_VAID_PREFIX;
    public static final Aid GOOGLE_RID;
    public static final Aid GSD_MANAGER_AID;
    public static final Aid MASTERCARD_AID_PREFIX_CREDIT_OR_DEBIT;
    public static final Aid MASTERCARD_RID;
    public static final Aid MMPP_PREFIX;
    public static final Aid PPSE_AID;
    private static final Map SINGLETONS;
    public static final Aid VISA_AID_PREFIX_CREDIT_OR_DEBIT;
    public static final Aid VISA_RID;

    private Aid(byte abyte0[])
    {
        super(abyte0);
    }

    public static Aid valueOf(byte abyte0[])
        throws IllegalArgumentException
    {
        int i = abyte0.length;
        Aid aid;
        boolean flag;
        if (i >= 5 && i <= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Illegal length for AID: %s", new Object[] {
            Integer.valueOf(i)
        });
        abyte0 = new Aid(abyte0);
        aid = (Aid)SINGLETONS.get(abyte0);
        if (aid != null)
        {
            return aid;
        } else
        {
            return abyte0;
        }
    }

    public final boolean hasPrefix(Aid aid)
    {
        aid = aid.array();
        int i = aid.length;
        return mBytes.length >= i && Arrays.equals(Arrays.copyOf(mBytes, i), aid);
    }

    public final String toString()
    {
        if (mBytes.length > 0)
        {
            return Hex.encode(mBytes);
        } else
        {
            return "[default CardManager]";
        }
    }

    static 
    {
        int i = 0;
        CARDMANAGER_AID = new Aid(new byte[0]);
        PPSE_AID = new Aid(new byte[] {
            50, 80, 65, 89, 46, 83, 89, 83, 46, 68, 
            68, 70, 48, 49
        });
        MASTERCARD_RID = new Aid(new byte[] {
            -96, 0, 0, 0, 4
        });
        VISA_RID = new Aid(new byte[] {
            -96, 0, 0, 0, 3
        });
        VISA_AID_PREFIX_CREDIT_OR_DEBIT = new Aid(Bytes.concat(new byte[][] {
            VISA_RID.array(), new byte[] {
                16, 16
            }
        }));
        MASTERCARD_AID_PREFIX_CREDIT_OR_DEBIT = new Aid(Bytes.concat(new byte[][] {
            MASTERCARD_RID.array(), new byte[] {
                16, 16
            }
        }));
        MMPP_PREFIX = new Aid(Bytes.concat(new byte[][] {
            MASTERCARD_AID_PREFIX_CREDIT_OR_DEBIT.array(), new byte[] {
                -86
            }
        }));
        GOOGLE_RID = new Aid(new byte[] {
            -96, 0, 0, 4, 118
        });
        GOOGLE_PAYMENT_VAID_PREFIX = new Aid(Bytes.concat(new byte[][] {
            GOOGLE_RID.array(), new byte[] {
                108
            }
        }));
        Aid aid = new Aid(Bytes.concat(new byte[][] {
            GOOGLE_RID.array(), new byte[] {
                32, 16
            }
        }));
        GOOGLE_CONTROLLER_AID = aid;
        GOOGLE_LOCKET_AID = aid;
        GOOGLE_MIFARE_MANAGER_AID = new Aid(Bytes.concat(new byte[][] {
            GOOGLE_RID.array(), new byte[] {
                48, 48
            }
        }));
        GSD_MANAGER_AID = new Aid(Bytes.concat(new byte[][] {
            GOOGLE_RID.array(), new byte[] {
                -95, 16
            }
        }));
        aid = CARDMANAGER_AID;
        Aid aid1 = PPSE_AID;
        Aid aid2 = GOOGLE_CONTROLLER_AID;
        Aid aid3 = GOOGLE_MIFARE_MANAGER_AID;
        Aid aid4 = GSD_MANAGER_AID;
        HashMap hashmap = new HashMap(5);
        for (; i < 5; i++)
        {
            Aid aid5 = (new Aid[] {
                aid, aid1, aid2, aid3, aid4
            })[i];
            hashmap.put(aid5, aid5);
        }

        SINGLETONS = Collections.unmodifiableMap(hashmap);
    }
}
