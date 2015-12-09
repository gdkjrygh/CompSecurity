// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.util.Arrays;

public final class ebj
    implements ebi
{

    private final Context a;

    public ebj(Context context)
    {
        a = context;
    }

    public final void a()
    {
    }

    public final void a(String s, ebg ebg1, Flags flags)
    {
        s = new eay(a);
        ebg1.a(Arrays.asList(new MediaBrowserItem[] {
            ebp.a(a, s), ebx.a(a, s), ebr.a(a, s), ebs.a(a, s)
        }));
    }

    public final boolean a(String s)
    {
        return String.valueOf("your_music").equals(s);
    }
}
