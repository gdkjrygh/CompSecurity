// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.assistant.cardui.CardPhotoView;

public final class dvu
    implements nug
{

    private CardPhotoView a;

    public dvu(CardPhotoView cardphotoview)
    {
        a = cardphotoview;
        super();
    }

    public final void b_(Object obj)
    {
        obj = (hrd)obj;
        if (CardPhotoView.b(a) != null)
        {
            CardPhotoView.a(a, ((hrd) (obj)).b);
            if (CardPhotoView.c(a) == dvv.b && CardPhotoView.d(a) != hrc.c && !CardPhotoView.e(a) || CardPhotoView.d(a) == hrc.c && (CardPhotoView.b(a, CardPhotoView.b(a)) || CardPhotoView.c(a, CardPhotoView.b(a))))
            {
                CardPhotoView.a(a, CardPhotoView.b(a));
            }
        }
    }
}
