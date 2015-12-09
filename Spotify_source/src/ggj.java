// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;

public final class ggj
{

    private static final int a[] = {
        180, 360, 720, 1080
    };

    public static String a(Flags flags, String s, long l)
    {
        ctz.a(flags);
        ctz.a(s);
        Assertion.b(s, "manifestId passed to getUrlForVideoFrame() may not be empty");
        if (TextUtils.isEmpty(s))
        {
            Assertion.b("manifestId passed to getUrlForVideoFrame() may not be empty");
            return Uri.EMPTY.toString();
        }
        flags = (String)flags.a(fys.ap);
        Assertion.b(TextUtils.isEmpty(flags), "Flags does not contain non-empty keyframe url");
        float f = 3.402823E+38F;
        int ai[] = a;
        int j = 0;
        int i = 0;
        for (; j < 4; j++)
        {
            int k = ai[j];
            float f1 = Math.abs(k - 720);
            if (f1 < f)
            {
                f = f1;
                i = k;
            }
        }

        return flags.replace("{source_id}", s).replace("{height}", Integer.toString(i)).replace("{timestamp_ms}", Long.toString(l));
    }

}
