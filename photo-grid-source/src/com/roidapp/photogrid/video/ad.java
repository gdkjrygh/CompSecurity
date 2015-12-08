// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.h;
import com.bumptech.glide.load.b.e;
import com.bumptech.glide.p;
import com.roidapp.baselib.b.a;
import com.roidapp.baselib.c.u;
import com.roidapp.photogrid.common.cc;
import com.roidapp.photogrid.video.onlinemusic.LocalTrack;
import com.roidapp.photogrid.video.onlinemusic.Track;
import java.io.File;

// Referenced classes of package com.roidapp.photogrid.video:
//            f

public final class ad extends BaseAdapter
    implements android.view.View.OnClickListener
{

    private final Context a;
    private final Activity b;
    private final LayoutInflater c;
    private boolean d;
    private f e;
    private Handler f;
    private int g;
    private int h;

    public ad(Activity activity, f f1)
    {
        d = false;
        f = null;
        g = -1;
        h = 0;
        a = activity;
        b = activity;
        c = LayoutInflater.from(activity);
        e = f1;
        if (e != null)
        {
            f = e.d();
        }
    }

    protected final void a()
    {
        g = -1;
        notifyDataSetChanged();
    }

    public final void a(int i)
    {
        h = i;
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return e.b();
    }

    public final Object getItem(int i)
    {
        return e.b(i);
    }

    public final long getItemId(int i)
    {
        return 0L;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (!d) goto _L2; else goto _L1
_L1:
        view = new TextView(a);
        view.setText(" ");
_L8:
        return view;
_L2:
        View view1;
        Object obj;
        view1 = view;
        if (view == null)
        {
            try
            {
                view = c.inflate(0x7f0300eb, viewgroup, false);
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                view.printStackTrace();
                view = null;
            }
            view1 = view;
            if (view == null)
            {
                System.gc();
                System.gc();
                TextView textview;
                TextView textview1;
                RelativeLayout relativelayout;
                try
                {
                    view1 = c.inflate(0x7f0300eb, viewgroup, false);
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    view.printStackTrace();
                    d = true;
                    (new cc(a)).a();
                    view = new TextView(a);
                    view.setText(" ");
                    return view;
                }
            }
        }
        textview = (TextView)u.a(view1, 0x7f0d03bc);
        textview1 = (TextView)u.a(view1, 0x7f0d03bd);
        view = (ImageView)u.a(view1, 0x7f0d022b);
        obj = (ProgressBar)u.a(view1, 0x7f0d03bb);
        relativelayout = (RelativeLayout)u.a(view1, 0x7f0d03ba);
        viewgroup = (ImageView)u.a(view1, 0x7f0d0380);
        relativelayout.setTag(Integer.valueOf(i));
        relativelayout.setOnClickListener(this);
        if (g != i)
        {
            break MISSING_BLOCK_LABEL_428;
        }
        h;
        JVM INSTR tableswitch 0 3: default 200
    //                   0 346
    //                   1 382
    //                   2 382
    //                   3 397;
           goto _L3 _L4 _L5 _L5 _L6
_L3:
        break; /* Loop/switch isn't completed */
_L4:
        break; /* Loop/switch isn't completed */
_L9:
        obj = e.b(i);
        view = view1;
        if (obj != null)
        {
            textview1.setText((new StringBuilder("By ")).append(((LocalTrack) (obj)).getTrack().artist_name).toString());
            textview.setText(((LocalTrack) (obj)).getTrack().track_title);
            view = ((LocalTrack) (obj)).getTrack().thumb_url;
            viewgroup.setTag(view);
            if (TextUtils.isEmpty(view))
            {
                viewgroup.setImageBitmap(com.roidapp.baselib.b.a.a());
                return view1;
            }
            break MISSING_BLOCK_LABEL_459;
        }
        if (true) goto _L8; else goto _L7
_L7:
        ((ProgressBar) (obj)).setVisibility(8);
        view.setVisibility(0);
        view.setImageDrawable(a.getResources().getDrawable(0x7f0203be));
        g = -1;
          goto _L9
_L5:
        ((ProgressBar) (obj)).setVisibility(0);
        view.setVisibility(8);
          goto _L9
_L6:
        ((ProgressBar) (obj)).setVisibility(8);
        view.setVisibility(0);
        view.setImageDrawable(a.getResources().getDrawable(0x7f0203bd));
          goto _L9
        ((ProgressBar) (obj)).setVisibility(8);
        view.setVisibility(0);
        view.setImageDrawable(a.getResources().getDrawable(0x7f0203be));
          goto _L9
        if ("Photo Grid".equalsIgnoreCase(view))
        {
            viewgroup.setImageDrawable(a.getResources().getDrawable(0x7f020357));
            return view1;
        } else
        {
            com.bumptech.glide.h.a(b).a(view).a(e.c).g().b(com.roidapp.baselib.b.a.b()).a(viewgroup);
            return view1;
        }
    }

    public final void onClick(View view)
    {
        int i;
label0:
        {
            i = ((Integer)view.getTag()).intValue();
            view = e.b(i);
            if (view != null)
            {
                if (view.getTrackPath() != null && (new File(view.getTrackPath())).exists())
                {
                    view = view.getTrackPath();
                } else
                {
                    view = view.getTrack().mp3_url;
                }
                if (view != null)
                {
                    break label0;
                }
            }
            return;
        }
        if (g == i)
        {
            g = -1;
            f.removeMessages(12289);
            view = new Message();
            view.what = 12290;
            f.sendMessage(view);
        } else
        {
            g = i;
            h = 1;
            f.removeMessages(12289);
            Message message = new Message();
            message.what = 12289;
            message.obj = view;
            f.sendMessage(message);
        }
        notifyDataSetChanged();
    }
}
