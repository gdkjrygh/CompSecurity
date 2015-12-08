// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.kik.scan.KikCode;

// Referenced classes of package kik.android.widget:
//            KikCodeImageView

public class KikFinderCodeImageView extends KikCodeImageView
{

    public KikFinderCodeImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public final void a(KikCode kikcode)
    {
        super.a(kikcode);
        byte abyte0[] = null;
        if (kikcode != null)
        {
            abyte0 = a();
            b(new byte[] {
                -78, -53, 37, -58
            });
        }
        a(abyte0);
    }
}
