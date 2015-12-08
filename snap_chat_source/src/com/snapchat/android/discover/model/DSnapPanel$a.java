// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model;

import com.snapchat.android.Timber;
import uA;

// Referenced classes of package com.snapchat.android.discover.model:
//            DSnapPanel

public static final class cking
{

    public String a;
    public String b;
    public String c;
    public cking d;
    diaType e;
    public de f;
    public cking g;
    public String h;
    public String i;

    public final cking a(String s)
    {
        e = diaType.valueOf(s);
        return this;
    }

    public final DSnapPanel a()
    {
        if (a == null && e != diaType.REMOTE_VIDEO)
        {
            throw new uA("Cannot build dsnap panel with null uri.", "uri");
        }
        if (e == null)
        {
            throw new uA("Cannot build dsnap panel with null media type.", "media_type");
        }
        if (e == diaType.VIDEO && h == null)
        {
            throw new uA("Cannot build video dsnap panel with null first frame URI.", "video_first_frame");
        }
        if (e == diaType.VIDEO && i == null)
        {
            Timber.d("DSnapPanel", "Did not find uri for video share frame. Using first frame uri instead. DSnapPanel.Builder: %s", new Object[] {
                this
            });
            i = h;
        }
        if (f == null)
        {
            f = de.LOOPING;
        }
        if (g == null)
        {
            g = cking.MEDIA_TOP;
        }
        if (d == null)
        {
            d = cking.MEDIA_TOP;
        }
        return new DSnapPanel(this, (byte)0);
    }

    public cking()
    {
    }
}
