// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public final class ftp extends ArrayAdapter
{

    public ftp(Context context, String as[])
    {
        super(context, 0x1090003, as);
        setDropDownViewResource(0x1090009);
    }

    public final View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        view = (TextView)super.getDropDownView(i, view, viewgroup);
        view.setTypeface(dgd.c(viewgroup.getContext(), 0x7f010003));
        return view;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        view = (TextView)super.getView(i, view, viewgroup);
        view.setTypeface(dgd.c(viewgroup.getContext(), 0x7f010003));
        return view;
    }
}
