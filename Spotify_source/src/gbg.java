// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import java.text.DateFormat;
import java.util.Calendar;

public class gbg extends LinearLayout
{

    public TextView a;
    public ImageView b;
    private Button c;
    private TextView d;
    private TextView e;
    private TextView f;

    public gbg(Context context)
    {
        super(context);
        inflate(getContext(), 0x7f0300c4, this);
        int i = dft.b(16F, getResources());
        setPadding(i, 0, i, dft.b(6F, getResources()));
        setGravity(17);
        setOrientation(1);
        a = (TextView)findViewById(0x7f1102a3);
        b = (ImageView)findViewById(0x7f11026a);
        c = (Button)findViewById(0x7f11025e);
        f = (TextView)findViewById(0x7f1103f6);
        context = new dfz(getContext(), SpotifyIcon.an);
        context.a(gcg.b(getContext(), 0x7f0f00bf));
        d = (TextView)findViewById(0x7f1103f7);
        context.a(d.getTextSize() * 1.25F);
        d.setCompoundDrawablesWithIntrinsicBounds(context, null, null, null);
        context = new dfz(getContext(), SpotifyIcon.Y);
        context.a(gcg.b(getContext(), 0x7f0f00bf));
        e = (TextView)findViewById(0x7f1103f8);
        context.a(e.getTextSize() * 1.25F);
        e.setCompoundDrawablesWithIntrinsicBounds(context, null, null, null);
    }

    public final void a(int i)
    {
        int j = i / 60;
        i = j / 60;
        j %= 60;
        String s;
        if (i > 0)
        {
            s = getResources().getString(0x7f0802fa, new Object[] {
                Integer.valueOf(i), Integer.valueOf(j)
            });
        } else
        {
            s = getResources().getString(0x7f0802fb, new Object[] {
                Integer.valueOf(j)
            });
        }
        e.setText(s);
    }

    public final void a(long l)
    {
        if (l > 0L)
        {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(1000L * l);
            DateFormat dateformat = DateFormat.getDateInstance(2);
            d.setText(dateformat.format(calendar.getTime()));
            d.setVisibility(0);
            return;
        } else
        {
            d.setVisibility(8);
            return;
        }
    }

    public final void a(android.view.View.OnClickListener onclicklistener)
    {
        b.setOnClickListener(onclicklistener);
        c.setOnClickListener(onclicklistener);
    }

    public final void a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            d.setText(s);
            d.setVisibility(0);
            return;
        } else
        {
            d.setVisibility(8);
            return;
        }
    }

    public final void a(boolean flag)
    {
        c.setEnabled(flag);
        b.setEnabled(flag);
    }

    public final void b(String s)
    {
        f.setText(s);
    }

    public final void c(String s)
    {
        c.setText(s);
    }
}
