// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.spotify.mobile.android.video.drm.DrmException;
import com.spotify.mobile.android.video.drm.DrmLicenseServerException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public final class gkv
    implements bbn
{

    public static final Set a;
    public static final UUID b;
    private static final grn c = grn.a("application/octet-stream");
    private static final grn d = grn.a("application/x-www-form-urlencoded");
    private String e;

    public gkv(String s)
    {
        e = s;
    }

    public final byte[] a(UUID uuid, android.media.MediaDrm.KeyRequest keyrequest)
    {
        keyrequest.getDefaultUrl();
        keyrequest = keyrequest.getData();
        if (b.equals(uuid))
        {
            if (TextUtils.isEmpty(e))
            {
                throw new DrmException(3);
            }
            uuid = ((dms)dmz.a(dms)).a.a((new grr()).a(e).a(grs.a(c, keyrequest)).b()).a();
            if (uuid.a() == 200)
            {
                return uuid.e().e();
            } else
            {
                throw new DrmLicenseServerException(uuid.a(), uuid.c());
            }
        } else
        {
            throw new DrmException(1);
        }
    }

    public final byte[] a(UUID uuid, android.media.MediaDrm.ProvisionRequest provisionrequest)
    {
        String s = provisionrequest.getDefaultUrl();
        provisionrequest = provisionrequest.getData();
        if (b.equals(uuid))
        {
            uuid = ((dms)dmz.a(dms)).a;
            provisionrequest = (new StringBuilder()).append(s).append("&signedRequest=").append(new String(provisionrequest)).toString();
            return uuid.a((new grr()).a(provisionrequest).a(grs.a(d, new byte[0])).b()).a().e().e();
        } else
        {
            throw new DrmException(1);
        }
    }

    static 
    {
        b = UUID.fromString("edef8ba9-79d6-4ace-a3c8-27dcd51d21ed");
        HashSet hashset = new HashSet();
        hashset.add(b);
        a = Collections.unmodifiableSet(hashset);
    }
}
