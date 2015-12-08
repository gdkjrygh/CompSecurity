// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import com.google.android.apps.photos.assistant.cardui.CardPhotoView;

final class dwf
    implements android.view.View.OnClickListener
{

    private Context a;
    private CardPhotoView b;
    private ekp c;
    private dwa d;

    dwf(dwa dwa1, Context context, CardPhotoView cardphotoview, ekp ekp)
    {
        d = dwa1;
        a = context;
        b = cardphotoview;
        c = ekp;
        super();
    }

    public final void onClick(View view)
    {
        d.b.a(a, b, d.d, c);
    }
}
