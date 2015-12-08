// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.spotify.mobile.android.spotlets.openaccess.model.Track;
import com.spotify.mobile.android.spotlets.openaccess.util.TrackState;
import com.spotify.mobile.android.spotlets.openaccess.view.ProgressPlayButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class exo extends BaseAdapter
    implements exy
{

    private Context a;
    private exp b;
    private Track c[];

    public exo(Context context, exp exp1)
    {
        c = new Track[0];
        a = context;
        b = exp1;
    }

    public final List a()
    {
        List list = a(0);
        Collections.shuffle(list);
        return list;
    }

    public final List a(int i)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(Arrays.asList(c).subList(i, c.length));
        return arraylist;
    }

    public final void a(Track track, TrackState trackstate)
    {
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[TrackState.values().length];
                try
                {
                    a[TrackState.d.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[TrackState.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[TrackState.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[TrackState.a.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[trackstate.ordinal()];
        JVM INSTR tableswitch 1 4: default 40
    //                   1 45
    //                   2 58
    //                   3 71
    //                   4 84;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        notifyDataSetChanged();
        return;
_L2:
        track.setIsCurrentTrack(true);
        track.setIsPlaying(true);
        continue; /* Loop/switch isn't completed */
_L3:
        track.setIsCurrentTrack(true);
        track.setIsPlaying(true);
        continue; /* Loop/switch isn't completed */
_L4:
        track.setIsCurrentTrack(true);
        track.setIsPlaying(false);
        continue; /* Loop/switch isn't completed */
_L5:
        track.setIsPlaying(false);
        track.setIsCurrentTrack(false);
        track.setProgress(0.0F);
        if (true) goto _L1; else goto _L6
_L6:
    }

    public final void a(Track atrack[])
    {
        if (atrack == null)
        {
            c = new Track[0];
            notifyDataSetInvalidated();
            return;
        } else
        {
            c = atrack;
            notifyDataSetChanged();
            return;
        }
    }

    public final int getCount()
    {
        return c.length;
    }

    public final Object getItem(int i)
    {
        return c[i];
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        byte byte1 = 8;
        view = (ddl)dds.a(view);
        ProgressPlayButton progressplaybutton;
        if (view == null)
        {
            View view1;
            boolean flag;
            if (b.a())
            {
                view = dds.e(a, viewgroup);
                viewgroup = view.d().getTextColors();
                TextView textview = view.e();
                dgo.b(a, textview, 0x7f0101d6);
                textview.setTextColor(viewgroup);
                textview.setLayoutParams(new android.widget.LinearLayout.LayoutParams(dgg.a(textview.getPaint(), 2), -2));
            } else
            {
                view = dds.c(a, viewgroup);
            }
            view.a(new ProgressPlayButton(a));
            view.b().setVisibility(8);
        }
        viewgroup = c[i];
        view.a(viewgroup.getName());
        view.a().setTag(viewgroup);
        progressplaybutton = (ProgressPlayButton)view.b();
        view.b(viewgroup.isCurrentTrack());
        if (viewgroup.isCurrentTrack())
        {
            progressplaybutton.setVisibility(0);
            flag = viewgroup.isPlaying();
            view1 = progressplaybutton.a;
            byte byte0;
            if (flag)
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            view1.setVisibility(byte0);
            view1 = progressplaybutton.b;
            if (!flag)
            {
                byte0 = byte1;
            } else
            {
                byte0 = 0;
            }
            view1.setVisibility(byte0);
            progressplaybutton.a(viewgroup.getProgress());
        } else
        {
            progressplaybutton.setVisibility(8);
        }
        if (b.a())
        {
            ((ddp)view).a(i + 1);
        }
        if (b.b())
        {
            view.b(viewgroup.getArtistString());
        }
        return view.a();
    }
}
