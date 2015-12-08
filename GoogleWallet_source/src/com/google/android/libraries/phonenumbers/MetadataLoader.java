// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.phonenumbers;

import java.io.InputStream;

// Referenced classes of package com.google.android.libraries.phonenumbers:
//            PhoneNumberUtil

public class MetadataLoader
{

    MetadataLoader()
    {
    }

    public InputStream loadMetadata(String s)
    {
        return com/google/android/libraries/phonenumbers/PhoneNumberUtil.getResourceAsStream(s);
    }
}
