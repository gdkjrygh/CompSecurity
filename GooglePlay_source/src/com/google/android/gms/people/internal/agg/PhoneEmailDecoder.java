// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal.agg;

import android.os.Bundle;
import java.util.regex.Pattern;

public abstract class PhoneEmailDecoder
{
    public static final class EmailDecoder extends PhoneEmailDecoder
    {

        public EmailDecoder(Bundle bundle)
        {
            super(bundle);
        }
    }

    public static final class PhoneDecoder extends PhoneEmailDecoder
    {

        public PhoneDecoder(Bundle bundle)
        {
            super(bundle);
        }
    }


    public static EmailDecoder DummyEmailDecoder;
    public static PhoneDecoder DummyPhoneDecoder;
    private final char mSep1 = '\001';
    private final String mSep1StrPattern = Pattern.quote("\001");
    private final char mSep2 = '\002';
    private final String mSep2StrPattern = Pattern.quote("\002");
    private final Bundle mTypeLabelMap;

    PhoneEmailDecoder(Bundle bundle)
    {
        mTypeLabelMap = bundle;
    }

    static 
    {
        DummyPhoneDecoder = new PhoneDecoder(Bundle.EMPTY);
        DummyEmailDecoder = new EmailDecoder(Bundle.EMPTY);
    }
}
