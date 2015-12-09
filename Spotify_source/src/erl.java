// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.android.paste.widget.SpotifyIconView;

public final class erl extends LinearLayout
{

    public dhu a;
    public erm b;
    private View c;
    private TextView d;
    private final Paint e = new Paint();
    private final Path f = new Path();
    private int g;

    public erl(Context context)
    {
        super(context);
        setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
        setOrientation(1);
        LayoutInflater.from(context).inflate(0x7f030068, this, true);
        c = findViewById(0x7f110323);
        d = (TextView)findViewById(0x7f110326);
        ((SpotifyIconView)findViewById(0x7f110327)).setOnClickListener(new android.view.View.OnClickListener() {

            private erl a;

            public final void onClick(View view)
            {
                erl.a(a).setVisibility(8);
                if (erl.b(a) != null)
                {
                    erl.b(a).a();
                }
            }

            
            {
                a = erl.this;
                super();
            }
        });
        context = getResources();
        e.setStyle(android.graphics.Paint.Style.FILL);
        e.setAntiAlias(true);
        e.setColor(gcg.b(getContext(), 0x7f0f0086));
        g = context.getDimensionPixelSize(0x7f0c015d);
        setWillNotDraw(false);
    }

    static View a(erl erl1)
    {
        return erl1.c;
    }

    static erm b(erl erl1)
    {
        return erl1.b;
    }

    public final void a(String s)
    {
        if (s != null)
        {
            d.setText(s);
            c.setVisibility(0);
            return;
        } else
        {
            d.setText("");
            c.setVisibility(8);
            return;
        }
    }

    protected final void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (c.getVisibility() == 0)
        {
            f.reset();
            float f1 = ((float)getWidth() / 4F) * 3F;
            float f2 = c.getHeight();
            f.moveTo(f1 - (float)g, f2);
            f.lineTo(f1, (float)g + f2);
            f.lineTo(f1 + (float)g, f2);
            f.close();
            canvas.drawPath(f, e);
        }
    }
}
