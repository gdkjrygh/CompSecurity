// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaFormat;
import com.snapchat.android.Timber;
import com.snapchat.android.camera.transcoding.TranscodingPreferencesWrapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public final class rJ
    implements rF
{

    public float a;
    public float b;
    private final LB c;
    private VX d;

    public rJ()
    {
        LB lb = new LB();
        TranscodingPreferencesWrapper.a();
        this(lb);
    }

    private rJ(LB lb)
    {
        a = 0.0F;
        b = 0.0F;
        c = lb;
    }

    public final VX a(List list)
    {
        Object obj;
        if (d != null)
        {
            return d;
        }
        double d1;
        double d2;
        Object obj1;
        WA wa;
        int i;
        long l;
        boolean flag;
        if (list.size() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dv.a(flag);
        wa = (WA)dv.a((WA)list.get(0));
        list = new WN(new File(((Wq) (wa)).a));
        obj = list;
        obj1 = new IK(list.b(), list.c());
        obj = list;
        d1 = list.e();
        obj = list;
        d2 = wa.h;
        l = (long)(d1 / d2);
        list.a();
        list = new rE(((IK) (obj1)));
        i = (int)Math.min((0x1a6667L / l) * 1000L << 3, 0x3d0900L);
        obj = list.a(i);
        list = ((List) (obj));
        if (obj == null)
        {
            list = new lE(((IK) (obj1)));
            c.a(list);
            list = ((List) (obj1));
        }
        obj = MediaFormat.createVideoFormat("video/avc", list.a(), list.b());
        ((MediaFormat) (obj)).setInteger("width", list.a());
        ((MediaFormat) (obj)).setInteger("height", list.b());
        Timber.c("SendingVideoEncoderConfiguration", "Transcoder Configuration getting KEY_HEIGHT %d, KEY_WIDTH %d ", new Object[] {
            Integer.valueOf(((MediaFormat) (obj)).getInteger("height")), Integer.valueOf(((MediaFormat) (obj)).getInteger("width"))
        });
        ((MediaFormat) (obj)).setInteger("color-format", 0x7f000789);
        ((MediaFormat) (obj)).setInteger("bitrate", i);
        ((MediaFormat) (obj)).setLong("durationUs", l * 1000L);
        ((MediaFormat) (obj)).setInteger("frame-rate", 30);
        ((MediaFormat) (obj)).setInteger("i-frame-interval", 10);
        obj1 = new ry(list.b(), list.a(), ((IK) (obj1)).b(), ((IK) (obj1)).a());
        a = ((ry) (obj1)).c;
        b = ((ry) (obj1)).d;
        if (TranscodingPreferencesWrapper.d())
        {
            (new rL(list.a(), list.b(), i)).a(((MediaFormat) (obj)));
        }
        d = new VX("video/avc", ((MediaFormat) (obj)));
        return d;
        obj;
        list = null;
_L4:
        throw new Wu(String.format("InvalidMediaException in %s: %s", new Object[] {
            "SendingVideoEncoderConfiguration", ((Ws) (obj)).toString()
        }), ((Throwable) (obj)));
        Object obj2;
        obj2;
        obj = list;
        list = ((List) (obj2));
_L1:
        ((WN) (obj)).a();
        throw list;
        obj2;
        list = null;
_L2:
        obj = list;
        throw new Wu((new StringBuilder("Failed to read video metadata: ")).append(((IOException) (obj2)).toString()).toString(), ((Throwable) (obj2)));
        list;
          goto _L1
        list;
        obj = null;
          goto _L1
        obj2;
          goto _L2
        obj;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
