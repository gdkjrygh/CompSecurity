// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.brightcove.player.media.Catalog;
import com.brightcove.player.model.Video;
import com.jcp.g.a;
import com.jcp.util.ae;
import com.squareup.a.ak;
import com.squareup.a.ba;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

// Referenced classes of package com.jcp.adapters:
//            bl, bm

public class MultipleVideoItemAdapter extends BaseAdapter
{

    private static final String a = com/jcp/adapters/MultipleVideoItemAdapter.getName();
    private LayoutInflater b;
    private List c;
    private Map d;

    public MultipleVideoItemAdapter(Context context, List list)
    {
        c = list;
        d = new WeakHashMap();
        b = (LayoutInflater)context.getSystemService("layout_inflater");
        b();
    }

    static String a()
    {
        return a;
    }

    private String a(Video video)
    {
        if (video != null && video.getProperties() != null)
        {
            video = ((Video) (video.getProperties().get("thumbnailURL")));
            if (video != null)
            {
                return video.toString();
            }
        }
        return null;
    }

    static String a(MultipleVideoItemAdapter multiplevideoitemadapter, Video video)
    {
        return multiplevideoitemadapter.a(video);
    }

    static Map a(MultipleVideoItemAdapter multiplevideoitemadapter)
    {
        return multiplevideoitemadapter.d;
    }

    private void a(ViewHolder viewholder)
    {
        if (viewholder != null)
        {
            viewholder.mMainProgressBar.setVisibility(8);
            viewholder.mThumbnailImageView.setVisibility(0);
            viewholder.mPlayIcon.setVisibility(0);
        }
    }

    private void a(ViewHolder viewholder, String s)
    {
        ae.d(a, (new StringBuilder()).append("Image URL : ").append(s).toString());
        if (s == null)
        {
            a(viewholder);
            return;
        } else
        {
            com.jcp.g.a.a().a(s).b(0x7f02023c).a(viewholder.mThumbnailImageView, new bl(this, viewholder));
            return;
        }
    }

    static void a(MultipleVideoItemAdapter multiplevideoitemadapter, ViewHolder viewholder)
    {
        multiplevideoitemadapter.a(viewholder);
    }

    static void a(MultipleVideoItemAdapter multiplevideoitemadapter, ViewHolder viewholder, String s)
    {
        multiplevideoitemadapter.a(viewholder, s);
    }

    private void a(String s, View view)
    {
        ViewHolder viewholder = (ViewHolder)view.getTag();
        Catalog catalog = new Catalog("c7KW_5dOVeDnTpceisJWavGpFEWZY_OjPwMZ11SF-iybuem0-bdPzQ..");
        HashMap hashmap = new HashMap();
        hashmap.put("video_fields", com.jcp.b.a.k());
        catalog.findVideoByID(s, hashmap, new bm(this, s, viewholder, view));
    }

    private void b()
    {
        if (c != null)
        {
            Iterator iterator = c.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                if (!TextUtils.isEmpty(s))
                {
                    d.put(s, null);
                }
            } while (true);
        }
    }

    public Video a(int i)
    {
        if (i >= 0 && i < c.size() && !TextUtils.isEmpty((CharSequence)c.get(i)))
        {
            return (Video)d.get(c.get(i));
        } else
        {
            return null;
        }
    }

    public int getCount()
    {
        return c.size();
    }

    public Object getItem(int i)
    {
        return a(i);
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        ae.c(a, (new StringBuilder()).append("Position ").append(i).append("Video id:").append((String)c.get(i)).toString());
        Video video = a(i);
        viewgroup = (String)c.get(i);
        if (view == null)
        {
            view = b.inflate(0x7f03008c, null);
            viewgroup = new ViewHolder(view);
        } else
        {
            viewgroup = (ViewHolder)view.getTag();
        }
        view.setTag(viewgroup);
        if (video == null)
        {
            ae.c(a, (new StringBuilder()).append("The Video at ").append(i).append(" has not been loaded yet").toString());
            ((ViewHolder) (viewgroup)).mMainProgressBar.setVisibility(0);
            ((ViewHolder) (viewgroup)).mThumbnailImageView.setVisibility(4);
            ((ViewHolder) (viewgroup)).mPlayIcon.setVisibility(4);
            view.setEnabled(false);
            a((String)c.get(i), view);
            return view;
        } else
        {
            ae.c(a, (new StringBuilder()).append("The video at ").append(i).append(" has  been loaded ").toString());
            view.setEnabled(true);
            ((ViewHolder) (viewgroup)).mPlayIcon.setVisibility(0);
            a(viewgroup, a(video));
            return view;
        }
    }


    private class ViewHolder
    {

        protected ProgressBar mMainProgressBar;
        protected ImageView mPlayIcon;
        protected ImageView mThumbnailImageView;

        public ViewHolder(View view)
        {
            ButterKnife.inject(this, view);
        }
    }

}
