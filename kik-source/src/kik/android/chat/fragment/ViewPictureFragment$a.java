// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import com.kik.cards.web.kik.KikContentMessageParcelable;
import kik.android.util.an;

// Referenced classes of package kik.android.chat.fragment:
//            ViewPictureFragment

public static final class e extends an
{

    public final e a()
    {
        a("VIEW_PICTURE_TYPE", 3);
        return this;
    }

    public final e a(KikContentMessageParcelable kikcontentmessageparcelable)
    {
        a("CONTENT_MESSAGE", ((android.os.Parcelable) (kikcontentmessageparcelable)));
        return this;
    }

    public final a a(String s)
    {
        a("JID", s);
        return this;
    }

    public final a a(byte abyte0[])
    {
        a("MESSAGING_KEY", abyte0);
        return this;
    }

    public final a b()
    {
        a("VIEW_PICTURE_TYPE", 7);
        return this;
    }

    public final a b(String s)
    {
        a("PREVIEW", s);
        return this;
    }

    public final a c()
    {
        a("VIEW_PICTURE_TYPE", 4);
        return this;
    }

    public final a c(String s)
    {
        a("PHOTOURL", s);
        return this;
    }

    public final a d()
    {
        a("VIEW_PICTURE_TYPE", 2);
        return this;
    }

    public final a e()
    {
        a("VIEW_PICTURE_TYPE", 5);
        a("ALLOW_TO_ATTACH_MESSAGE", false);
        return this;
    }

    public e()
    {
    }
}
