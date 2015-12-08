// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.add;

import android.util.Base64;
import com.google.android.apps.wallet.logging.WLog;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;

public class PromptValueSerialization
{
    public static final class LogoInfo
    {

        public final String colorHex;
        public final Integer programIcon;

        public LogoInfo(Integer integer, String s)
        {
            programIcon = integer;
            colorHex = s;
        }
    }


    private static final String TAG = com/google/android/apps/wallet/wobs/add/PromptValueSerialization.getSimpleName();

    public PromptValueSerialization()
    {
    }

    public static com.google.wallet.proto.NanoWalletEntities.Barcode deserializeBarcode(String s)
    {
        com.google.wallet.proto.NanoWalletEntities.Barcode barcode = new com.google.wallet.proto.NanoWalletEntities.Barcode();
        try
        {
            MessageNano.mergeFrom(barcode, Base64.decode(s, 0));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            WLog.e(TAG, "Could not deserialize barcode.", s);
            throw new RuntimeException(s);
        }
        return barcode;
    }

    public static LogoInfo deserializeLogoInfo(String s)
    {
        s = s.split(":");
        return new LogoInfo(Integer.valueOf(s[0]), s[1]);
    }

    public static String serializeBarcode(com.google.wallet.proto.NanoWalletEntities.Barcode barcode)
    {
        return Base64.encodeToString(MessageNano.toByteArray(barcode), 0);
    }

    public static String serializeLogoInfo(int i, String s)
    {
        return (new StringBuilder(String.valueOf(s).length() + 12)).append(i).append(":").append(s).toString();
    }

}
