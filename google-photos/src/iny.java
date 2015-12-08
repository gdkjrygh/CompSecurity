// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class iny
    implements nus
{

    private inl a;

    iny(inl inl1)
    {
        a = inl1;
        super();
    }

    public final String a()
    {
        return "OfflineRetryTagEditStoryCaption";
    }

    public final void c_(Bundle bundle)
    {
        inl.a(a, (String)bundle.get("extra_media_key"), (String)bundle.get("extra_caption_text"));
    }
}
