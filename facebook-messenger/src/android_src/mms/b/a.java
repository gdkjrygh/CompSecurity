// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.b;

import android.net.Uri;
import android_src.drm.mobile1.DrmRawContent;
import android_src.drm.mobile1.DrmRights;
import android_src.drm.mobile1.DrmRightsManager;
import android_src.drm.mobile1.b;
import java.io.ByteArrayInputStream;

public class a
{

    private DrmRights a;
    private final DrmRawContent b;
    private final Uri c;
    private final byte d[];

    public a(String s, Uri uri, byte abyte0[])
    {
        if (s == null || abyte0 == null)
        {
            throw new IllegalArgumentException("Content-Type or data may not be null.");
        }
        c = uri;
        d = abyte0;
        uri = new ByteArrayInputStream(abyte0);
        b = new DrmRawContent(uri, uri.available(), s);
        if (!a())
        {
            a(abyte0);
        }
    }

    public void a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new b("Right data may not be null.");
        } else
        {
            ByteArrayInputStream bytearrayinputstream = new ByteArrayInputStream(abyte0);
            a = DrmRightsManager.a().a(bytearrayinputstream, abyte0.length, "application/vnd.oma.drm.message");
            return;
        }
    }

    public boolean a()
    {
        if (a == null)
        {
            a = DrmRightsManager.a().a(b);
            if (a == null)
            {
                return false;
            }
        }
        return true;
    }

    public String b()
    {
        return b.a();
    }
}
