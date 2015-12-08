// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.os.Parcel;
import android.os.Parcelable;

public class OcrUserEventData
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        private static OcrUserEventData createFromParcel(Parcel parcel)
        {
            boolean flag1 = true;
            OcrUserEventData ocrusereventdata = new OcrUserEventData();
            ocrusereventdata.startMillis = parcel.readLong();
            ocrusereventdata.ocrResultCode = parcel.readInt();
            ocrusereventdata.scannedDiscoverableId = parcel.readString();
            ocrusereventdata.scannedMerchantName = parcel.readString();
            ocrusereventdata.scannedCardNumber = parcel.readString();
            boolean flag;
            if (parcel.readInt() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ocrusereventdata.canceled = flag;
            if (parcel.readInt() == 1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            ocrusereventdata.saveSuccessful = flag;
            return ocrusereventdata;
        }

        private static OcrUserEventData[] newArray(int i)
        {
            return new OcrUserEventData[i];
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private boolean canceled;
    private int ocrResultCode;
    private boolean saveSuccessful;
    private String scannedCardNumber;
    private String scannedDiscoverableId;
    private String scannedMerchantName;
    private long startMillis;

    public OcrUserEventData()
    {
    }

    public int describeContents()
    {
        return 0;
    }

    public final com.google.wallet.proto.NanoWalletLogging.OcrContextExtraInfo generateOcrExtraInfo(int i, String s, String s1, long l)
    {
        com.google.wallet.proto.NanoWalletLogging.OcrContextExtraInfo ocrcontextextrainfo;
        ocrcontextextrainfo = new com.google.wallet.proto.NanoWalletLogging.OcrContextExtraInfo();
        ocrcontextextrainfo.type = (new int[] {
            i
        });
        ocrcontextextrainfo.timeSinceOcrStartInMs = Long.valueOf(l - startMillis);
        ocrResultCode;
        JVM INSTR lookupswitch 7: default 108
    //                   -1: 213
    //                   0: 225
    //                   10004: 249
    //                   10005: 261
    //                   10006: 261
    //                   10007: 237
    //                   10008: 261;
           goto _L1 _L2 _L3 _L4 _L5 _L5 _L6 _L5
_L5:
        break MISSING_BLOCK_LABEL_261;
_L1:
        ocrcontextextrainfo.ocrCompletionReason = Integer.valueOf(0);
_L7:
        if (canceled)
        {
            ocrcontextextrainfo.ocrSubmissionReason = Integer.valueOf(3);
        } else
        if (saveSuccessful)
        {
            ocrcontextextrainfo.ocrSubmissionReason = Integer.valueOf(1);
        } else
        {
            ocrcontextextrainfo.ocrSubmissionReason = Integer.valueOf(5);
        }
        if (scannedMerchantName == null)
        {
            i = 0;
        } else
        if (canceled)
        {
            i = 1;
        } else
        if (scannedMerchantName.equals(s))
        {
            i = 2;
        } else
        {
            i = 3;
        }
        if (scannedDiscoverableId != null)
        {
            ocrcontextextrainfo.discoverableIdStatus = Integer.valueOf(i);
        } else
        {
            ocrcontextextrainfo.subtypeStatus = Integer.valueOf(i);
        }
        if (scannedCardNumber == null)
        {
            ocrcontextextrainfo.readableIdStatus = Integer.valueOf(0);
        } else
        if (canceled)
        {
            ocrcontextextrainfo.readableIdStatus = Integer.valueOf(1);
        } else
        if (scannedCardNumber.equals(s1))
        {
            ocrcontextextrainfo.readableIdStatus = Integer.valueOf(2);
        } else
        {
            ocrcontextextrainfo.readableIdStatus = Integer.valueOf(3);
        }
        if (scannedMerchantName != null)
        {
            ocrcontextextrainfo.recognizedSubType = (new String[] {
                scannedMerchantName
            });
            if (!canceled)
            {
                ocrcontextextrainfo.savedSubType = s;
            }
        }
        return ocrcontextextrainfo;
_L2:
        ocrcontextextrainfo.ocrCompletionReason = Integer.valueOf(1);
          goto _L7
_L3:
        ocrcontextextrainfo.ocrCompletionReason = Integer.valueOf(3);
          goto _L7
_L6:
        ocrcontextextrainfo.ocrCompletionReason = Integer.valueOf(4);
          goto _L7
_L4:
        ocrcontextextrainfo.ocrCompletionReason = Integer.valueOf(2);
          goto _L7
        ocrcontextextrainfo.ocrCompletionReason = Integer.valueOf(5);
          goto _L7
    }

    public final OcrUserEventData setCanceled()
    {
        canceled = true;
        return this;
    }

    public final OcrUserEventData setOcrResultCode(int i)
    {
        ocrResultCode = i;
        return this;
    }

    public final OcrUserEventData setSaveResult(boolean flag)
    {
        saveSuccessful = flag;
        return this;
    }

    public final OcrUserEventData setScannedCardNumber(String s)
    {
        scannedCardNumber = s;
        return this;
    }

    public final OcrUserEventData setScannedDiscoverableId(String s)
    {
        scannedDiscoverableId = s;
        return this;
    }

    public final OcrUserEventData setScannedMerchantName(String s)
    {
        scannedMerchantName = s;
        return this;
    }

    public final OcrUserEventData startTiming(long l)
    {
        startMillis = l;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeLong(startMillis);
        parcel.writeInt(ocrResultCode);
        parcel.writeString(scannedDiscoverableId);
        parcel.writeString(scannedMerchantName);
        parcel.writeString(scannedCardNumber);
        if (canceled)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (saveSuccessful)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }



/*
    static long access$002(OcrUserEventData ocrusereventdata, long l)
    {
        ocrusereventdata.startMillis = l;
        return l;
    }

*/


/*
    static int access$102(OcrUserEventData ocrusereventdata, int i)
    {
        ocrusereventdata.ocrResultCode = i;
        return i;
    }

*/


/*
    static String access$202(OcrUserEventData ocrusereventdata, String s)
    {
        ocrusereventdata.scannedDiscoverableId = s;
        return s;
    }

*/


/*
    static String access$302(OcrUserEventData ocrusereventdata, String s)
    {
        ocrusereventdata.scannedMerchantName = s;
        return s;
    }

*/


/*
    static String access$402(OcrUserEventData ocrusereventdata, String s)
    {
        ocrusereventdata.scannedCardNumber = s;
        return s;
    }

*/


/*
    static boolean access$502(OcrUserEventData ocrusereventdata, boolean flag)
    {
        ocrusereventdata.canceled = flag;
        return flag;
    }

*/


/*
    static boolean access$602(OcrUserEventData ocrusereventdata, boolean flag)
    {
        ocrusereventdata.saveSuccessful = flag;
        return flag;
    }

*/
}
