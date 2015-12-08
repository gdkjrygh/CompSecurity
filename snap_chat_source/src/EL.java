// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public final class EL extends EJ
{

    public EL(View view)
    {
        TextView textview = (TextView)view.findViewById(0x7f0d01bd);
        ImageView imageview = (ImageView)view.findViewById(0x7f0d0381);
        ProgressBar progressbar = (ProgressBar)view.findViewById(0x7f0d009a);
        Je je = Je.a();
        new ta();
        super(view, textview, imageview, progressbar, je);
    }
}
