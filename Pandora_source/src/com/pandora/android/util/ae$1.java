// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import com.pandora.radio.data.aa;
import com.pandora.radio.data.ac;

// Referenced classes of package com.pandora.android.util:
//            ae, ThumbImageButton

static final class c
    implements Runnable
{

    final aa a;
    final ThumbImageButton b;
    final ThumbImageButton c;

    public void run()
    {
        boolean flag1 = false;
        if (a != null)
        {
            boolean flag = flag1;
            switch (a[a.l().ordinal()])
            {
            default:
                throw new IllegalArgumentException((new StringBuilder()).append("toggleThumbs: unknown TrackData type ").append(a).toString());

            case 3: // '\003'
                flag = flag1;
                if (!a.k())
                {
                    flag = true;
                }
                // fall through

            case 1: // '\001'
            case 2: // '\002'
                b.setEnabled(flag);
                c.setEnabled(flag);
                break;
            }
        }
    }

    ImageButton(aa aa1, ThumbImageButton thumbimagebutton, ThumbImageButton thumbimagebutton1)
    {
        a = aa1;
        b = thumbimagebutton;
        c = thumbimagebutton1;
        super();
    }
}
