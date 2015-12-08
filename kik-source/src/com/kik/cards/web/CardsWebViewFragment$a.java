// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import com.kik.cards.web.kik.KikContentMessageParcelable;
import com.kik.cards.web.picker.PickerRequest;

// Referenced classes of package com.kik.cards.web:
//            CardsWebViewFragment

public static abstract class rcelable extends com.kik.ui.fragment.elable
{

    public final rcelable a(KikContentMessageParcelable kikcontentmessageparcelable)
    {
        a("CardsWebViewFragment.EXTRA_CONTENT_MESSAGE", ((android.os.Parcelable) (kikcontentmessageparcelable)));
        return this;
    }

    public final a a(PickerRequest pickerrequest)
    {
        a("CardsWebViewFragment.EXTRA_PICKER_REQUEST", ((android.os.Parcelable) (pickerrequest)));
        return this;
    }

    public final a a(String s)
    {
        if (s == null)
        {
            return this;
        }
        String s1 = s;
        if (s.startsWith("card"))
        {
            s1 = (new StringBuilder("http")).append(s.substring(4)).toString();
        }
        a("CardsWebViewFragment.EXTRA_URL_KEY", s1);
        return this;
    }

    protected final String a()
    {
        return g("CardsWebViewFragment.EXTRA_URL_KEY");
    }

    public final g b(String s)
    {
        a("CardsWebViewFragment.EXTRA_TAG_KEY", s);
        return this;
    }

    protected final Boolean b()
    {
        return f("CardsWebViewFragment.EXTRA_CLEAR_CACHE_KEY");
    }

    public final f c(String s)
    {
        a("CardsWebViewFragment.EXTRA_REFERER_URL", s);
        return this;
    }

    protected final PickerRequest c()
    {
        return (PickerRequest)l("CardsWebViewFragment.EXTRA_PICKER_REQUEST");
    }

    public final l d(String s)
    {
        a("CardsWebViewFragment.EXTRA_CONVO_ID", s);
        return this;
    }

    protected final String d()
    {
        return g("CardsWebViewFragment.EXTRA_REFERER_URL");
    }

    protected final String e()
    {
        return g("CardsWebViewFragment.EXTRA_CONVO_ID");
    }

    protected final KikContentMessageParcelable f()
    {
        return (KikContentMessageParcelable)l("CardsWebViewFragment.EXTRA_CONTENT_MESSAGE");
    }

    public final l g()
    {
        a("CardsWebViewFragment.FROM_MEDIA_TRAY", true);
        return this;
    }

    public rcelable()
    {
    }
}
