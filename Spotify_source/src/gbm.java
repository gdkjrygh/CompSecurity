// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.mobile.android.ui.view.snackbar.SnackBar;

public final class gbm extends gbh
{

    private final int b;
    private TextView c;

    protected gbm(SnackBar snackbar, int i, String s)
    {
        super(snackbar, 0, s);
        b = i;
    }

    public final void a(ViewGroup viewgroup)
    {
        c = (TextView)LayoutInflater.from(viewgroup.getContext()).inflate(b, viewgroup, false);
        viewgroup.addView(c);
    }
}
