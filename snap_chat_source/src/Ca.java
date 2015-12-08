// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.snapchat.android.model.Mediabryo;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public final class Ca extends Mediabryo
{
    public static final class a extends com.snapchat.android.model.Mediabryo.a
    {

        List mFormats;
        public String mText;

        public final Ca b()
        {
            return new Ca(this);
        }

        public a()
        {
            a((new StringBuilder()).append(Bt.q()).append("~").append(UUID.randomUUID().toString()).toString().toUpperCase(Locale.US));
            super.mMediaMailingMetadata = new vC();
            b(com.snapchat.android.model.Mediabryo.SnapType.TEXT);
        }
    }


    public List mFormats;
    public String mText;

    public Ca(a a1)
    {
        super(a1);
        mText = a1.mText;
        mFormats = a1.mFormats;
    }

    public final Object clone()
    {
        return ((a)(new a()).a(this)).b();
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof Ca))
        {
            return false;
        }
        Ca ca = (Ca)obj;
        if (!TextUtils.equals(mText, ca.mText))
        {
            return false;
        } else
        {
            return super.equals(obj);
        }
    }

    public final byte[] h()
    {
        return new byte[0];
    }

    public final int i()
    {
        return 0;
    }
}
