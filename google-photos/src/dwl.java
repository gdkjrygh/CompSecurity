// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.photos.assistant.cardui.CardPhotoView;

public final class dwl
{

    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public final CardPhotoView d[] = new CardPhotoView[6];

    public dwl(View view)
    {
        d[0] = (CardPhotoView)view.findViewById(q.x);
        d[1] = (CardPhotoView)view.findViewById(q.y);
        d[2] = (CardPhotoView)view.findViewById(q.z);
        d[3] = (CardPhotoView)view.findViewById(q.A);
        d[4] = (CardPhotoView)view.findViewById(q.B);
        d[5] = (CardPhotoView)view.findViewById(q.C);
        a = (TextView)view.findViewById(q.w);
        b = (TextView)view.findViewById(q.v);
        c = (ImageView)view.findViewById(q.p);
    }
}
