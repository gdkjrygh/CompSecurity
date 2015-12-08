// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.address;

import android.text.TextUtils;

public final class AddressFormatter
{

    public static String formatAddressValue(com.google.location.country.NanoPostaladdress.PostalAddress postaladdress, char c)
    {
        if (postaladdress != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        c;
        JVM INSTR lookupswitch 17: default 152
    //                   49: 154
    //                   50: 229
    //                   51: 245
    //                   65: 306
    //                   66: 384
    //                   67: 184
    //                   68: 261
    //                   70: 339
    //                   78: 199
    //                   79: 214
    //                   80: 354
    //                   82: 399
    //                   83: 169
    //                   84: 369
    //                   85: 324
    //                   88: 291
    //                   90: 276;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20
_L15:
        continue; /* Loop/switch isn't completed */
_L3:
        return null;
_L4:
        if (postaladdress.addressLine.length <= 0) goto _L1; else goto _L21
_L21:
        return postaladdress.addressLine[0];
_L16:
        if (TextUtils.isEmpty(postaladdress.administrativeAreaName)) goto _L1; else goto _L22
_L22:
        return postaladdress.administrativeAreaName;
_L9:
        if (TextUtils.isEmpty(postaladdress.localityName)) goto _L1; else goto _L23
_L23:
        return postaladdress.localityName;
_L12:
        if (TextUtils.isEmpty(postaladdress.recipientName)) goto _L1; else goto _L24
_L24:
        return postaladdress.recipientName;
_L13:
        if (TextUtils.isEmpty(postaladdress.firmName)) goto _L1; else goto _L25
_L25:
        return postaladdress.firmName;
_L5:
        if (postaladdress.addressLine.length < 2) goto _L1; else goto _L26
_L26:
        return postaladdress.addressLine[1];
_L6:
        if (postaladdress.addressLine.length < 3) goto _L1; else goto _L27
_L27:
        return postaladdress.addressLine[2];
_L10:
        if (TextUtils.isEmpty(postaladdress.dependentLocalityName)) goto _L1; else goto _L28
_L28:
        return postaladdress.dependentLocalityName;
_L20:
        if (TextUtils.isEmpty(postaladdress.postalCodeNumber)) goto _L1; else goto _L29
_L29:
        return postaladdress.postalCodeNumber;
_L19:
        if (TextUtils.isEmpty(postaladdress.sortingCode)) goto _L1; else goto _L30
_L30:
        return postaladdress.sortingCode;
_L7:
        if (postaladdress.addressLine.length <= 0) goto _L1; else goto _L31
_L31:
        return TextUtils.join("\n", postaladdress.addressLine);
_L18:
        if (TextUtils.isEmpty(postaladdress.subAdministrativeAreaName)) goto _L1; else goto _L32
_L32:
        return postaladdress.subAdministrativeAreaName;
_L11:
        if (TextUtils.isEmpty(postaladdress.subPremiseName)) goto _L1; else goto _L33
_L33:
        return postaladdress.subPremiseName;
_L14:
        if (TextUtils.isEmpty(postaladdress.premiseName)) goto _L1; else goto _L34
_L34:
        return postaladdress.premiseName;
_L17:
        if (TextUtils.isEmpty(postaladdress.thoroughfareName)) goto _L1; else goto _L35
_L35:
        return postaladdress.thoroughfareName;
_L8:
        if (TextUtils.isEmpty(postaladdress.thoroughfareNumber)) goto _L1; else goto _L36
_L36:
        return postaladdress.thoroughfareNumber;
        if (TextUtils.isEmpty(postaladdress.countryName)) goto _L1; else goto _L37
_L37:
        return postaladdress.countryName;
    }
}
