// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import java.util.Arrays;

public final class ebe
    implements ebi
{

    private final Context a;
    private final String b;

    public ebe(Context context, String s)
    {
        a = (Context)ctz.a(context);
        b = (String)ctz.a(s);
    }

    public final void a()
    {
    }

    public final void a(String s, ebg ebg1, Flags flags)
    {
        Object obj1;
        if (!a(s))
        {
            ebg1.a(new IllegalArgumentException());
            return;
        }
        obj1 = new eay(a);
        if (flags != null) goto _L2; else goto _L1
_L1:
        s = a;
_L6:
        int i = 0x7f0801ad;
_L4:
        s = s.getString(i);
        flags = a;
        Object obj = new ebh(Uri.parse("your_music"));
        obj.a = com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.b;
        obj.b = s;
        obj.d = eck.a(flags, 0x7f02023d);
        s = ((ebh) (obj)).a();
        flags = ebn.a(a, ((eay) (obj1)));
        obj = a;
        obj1 = new ebh(((eay) (obj1)).d());
        obj1.a = com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType.b;
        obj1.b = ((Context) (obj)).getString(0x7f080442);
        obj1.d = eck.a(((Context) (obj)), 0x7f02022e);
        ebg1.a(Arrays.asList(new MediaBrowserItem[] {
            s, flags, ((ebh) (obj1)).a()
        }));
        return;
_L2:
        Context context = a;
        s = context;
        if (!fiy.a(flags))
        {
            continue; /* Loop/switch isn't completed */
        }
        s = context;
        i = 0x7f0801ae;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final boolean a(String s)
    {
        return b.equals(s);
    }
}
