// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;


// Referenced classes of package com.soundcloud.android.events:
//            TrackingEvent

public class EncryptionEvent extends TrackingEvent
{

    public static final String KIND_ENCRYPTION_ERROR = "encryption_error";
    public static final String KIND_KEY_GENERATION_ERROR = "key_generation_error";
    public static final String KIND_SUCCESSUFULL_ENCRYPTION = "encryption_success";

    protected EncryptionEvent(String s)
    {
        super(s, System.currentTimeMillis());
    }

    public static EncryptionEvent fromEncryptionError()
    {
        return new EncryptionEvent("encryption_error");
    }

    public static EncryptionEvent fromEncryptionSuccess()
    {
        return new EncryptionEvent("encryption_success");
    }

    public static EncryptionEvent fromKeyGenerationError()
    {
        return new EncryptionEvent("key_generation_error");
    }
}
