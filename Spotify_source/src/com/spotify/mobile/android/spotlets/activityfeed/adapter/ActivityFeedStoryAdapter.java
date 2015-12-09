// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.activityfeed.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.text.style.TextAppearanceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.spotlets.activityfeed.model.ResourceModel;
import com.spotify.mobile.android.spotlets.activityfeed.model.StoryModel;
import com.spotify.mobile.android.spotlets.activityfeed.model.StreamsModel;
import com.spotify.mobile.android.spotlets.activityfeed.model.UserModel;
import com.spotify.mobile.android.spotlets.activityfeed.widget.CircleImageCompoundTextView;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.squareup.picasso.Picasso;
import dff;
import dfo;
import dgo;
import dmz;
import fuj;
import fuo;
import fup;
import fuq;
import fur;
import fut;
import fuu;
import fuy;
import fuz;
import fvb;
import fvc;
import fve;
import fvt;
import fvu;
import fvv;
import fvw;
import fvy;
import fwv;
import fww;
import fwx;
import fwy;
import fwz;
import fxa;
import fxd;
import fxh;
import gae;
import gcg;
import gji;
import gjj;
import gwb;
import java.util.Locale;

public final class ActivityFeedStoryAdapter extends ArrayAdapter
{

    private static final ViewType a[] = ViewType.values();
    private int b;
    private final Flags c;
    private Drawable d;
    private Drawable e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private fuj j;

    public ActivityFeedStoryAdapter(Context context, Flags flags)
    {
        super(context, 0x7f03004e);
        j = new fuj() {

            private ActivityFeedStoryAdapter a;

            public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
            {
                obj = (ResourceModel)obj;
                final class _cls2
                {

                    static final int a[];
                    static final int b[];

                    static 
                    {
                        b = new int[ViewType.values().length];
                        try
                        {
                            b[ViewType.a.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror8) { }
                        try
                        {
                            b[ViewType.b.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror7) { }
                        try
                        {
                            b[ViewType.c.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror6) { }
                        try
                        {
                            b[ViewType.d.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror5) { }
                        try
                        {
                            b[ViewType.e.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        a = new int[com.spotify.mobile.android.spotlets.activityfeed.model.ResourceModel.Types.values().length];
                        try
                        {
                            a[com.spotify.mobile.android.spotlets.activityfeed.model.ResourceModel.Types.a.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            a[com.spotify.mobile.android.spotlets.activityfeed.model.ResourceModel.Types.b.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[com.spotify.mobile.android.spotlets.activityfeed.model.ResourceModel.Types.c.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[com.spotify.mobile.android.spotlets.activityfeed.model.ResourceModel.Types.d.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }

                    private class ViewType extends Enum
                    {

                        public static final ViewType a;
                        public static final ViewType b;
                        public static final ViewType c;
                        public static final ViewType d;
                        public static final ViewType e;
                        private static final ViewType f[];
                        private final int mPosition;

                        public static ViewType valueOf(String s)
                        {
                            return (ViewType)Enum.valueOf(com/spotify/mobile/android/spotlets/activityfeed/adapter/ActivityFeedStoryAdapter$ViewType, s);
                        }

                        public static ViewType[] values()
                        {
                            return (ViewType[])f.clone();
                        }

                        static 
                        {
                            a = new ViewType("AUTHOR", 0, 0);
                            b = new ViewType("CAPTION", 1, 1);
                            c = new ViewType("HAIRLINE", 2, 2);
                            d = new ViewType("LIST_ITEM_VIEW", 3, 3);
                            e = new ViewType("REPLAYS", 4, 4);
                            f = (new ViewType[] {
                                a, b, c, d, e
                            });
                        }

                        private ViewType(String s, int k, int l)
                        {
                            super(s, k);
                            mPosition = l;
                        }
                    }

                }

                switch (_cls2.a[com.spotify.mobile.android.spotlets.activityfeed.model.ResourceModel.Types.valueOf(((ResourceModel) (obj)).getType()).ordinal()])
                {
                default:
                    throw new AssertionError((new StringBuilder("Unexpected ResourceModel type ")).append(((ResourceModel) (obj)).getType()).toString());

                case 1: // '\001'
                    fve.a(a.getContext()).b(((ResourceModel) (obj)).getUri(), ((ResourceModel) (obj)).getName()).a(ViewUri.q).a(true).a().b(false).a(ActivityFeedStoryAdapter.a(a)).a(spotifycontextmenu);
                    return;

                case 2: // '\002'
                    fve.a(a.getContext()).c(((ResourceModel) (obj)).getUri(), ((ResourceModel) (obj)).getName()).a(ViewUri.q).a(false).a(ActivityFeedStoryAdapter.a(a)).a(spotifycontextmenu);
                    return;

                case 3: // '\003'
                    fve.a(a.getContext()).d(((ResourceModel) (obj)).getUri(), ((ResourceModel) (obj)).getName()).a(ViewUri.q).a(false).a(false).a(ActivityFeedStoryAdapter.a(a)).a(spotifycontextmenu);
                    return;

                case 4: // '\004'
                    fve.a(a.getContext()).a(((ResourceModel) (obj)).getUri(), ((ResourceModel) (obj)).getName()).a(ViewUri.q).a(true).a(true).a(true).a(false, null).a(ActivityFeedStoryAdapter.a(a)).a(spotifycontextmenu);
                    break;
                }
            }

            
            {
                a = ActivityFeedStoryAdapter.this;
                super();
            }
        };
        b = 0x7f03004e;
        c = flags;
        d = dff.j(context);
        e = dff.a(context, SpotifyIcon.E);
        f = context.getResources().getDimensionPixelOffset(0x7f0c0081);
        g = context.getResources().getDimensionPixelOffset(0x7f0c0082);
        h = context.getResources().getDimensionPixelOffset(0x7f0c0080);
    }

    private static View a(View view, int k)
    {
        view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, k));
        return view;
    }

    private static View a(View view, int k, int l, int i1, int j1)
    {
        view.setPadding(k, l, i1, j1);
        return view;
    }

    static Flags a(ActivityFeedStoryAdapter activityfeedstoryadapter)
    {
        return activityfeedstoryadapter.c;
    }

    public final StoryModel a(int k)
    {
        return (StoryModel)super.getItem(k / getViewTypeCount());
    }

    public final void a(boolean flag)
    {
        if (i != flag)
        {
            i = flag;
            notifyDataSetChanged();
        }
    }

    public final ViewType b(int k)
    {
        return a[getItemViewType(k)];
    }

    public final int getCount()
    {
        return super.getCount() * getViewTypeCount();
    }

    public final Object getItem(int k)
    {
        return a(k);
    }

    public final long getItemId(int k)
    {
        return (long)(k / getViewTypeCount());
    }

    public final int getItemViewType(int k)
    {
        return k % getViewTypeCount();
    }

    public final View getView(int k, View view, ViewGroup viewgroup)
    {
        Object obj;
        ViewType viewtype;
        viewtype = b(k);
        obj = getContext();
        if (view != null) goto _L2; else goto _L1
_L1:
        View view1;
        view1 = LayoutInflater.from(getContext()).inflate(b, null);
        viewgroup = (ViewGroup)view1.findViewById(0x7f1102f8);
        _cls2.b[viewtype.ordinal()];
        JVM INSTR tableswitch 1 5: default 88
    //                   1 113
    //                   2 246
    //                   3 298
    //                   4 371
    //                   5 384;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        throw new AssertionError((new StringBuilder("Unexpected view type ")).append(viewtype).toString());
_L4:
        view1.setPadding(view1.getPaddingLeft(), f, view1.getPaddingRight(), view1.getPaddingBottom());
        view = a(a(new CircleImageCompoundTextView(((Context) (obj))), -2), f, f, f, g);
_L11:
        view.setId(0x7f110012);
        viewgroup.addView(view);
        obj = view;
        view = view1;
          goto _L9
_L5:
        viewgroup.setEnabled(false);
        view = new TextView(((Context) (obj)));
        dgo.b(((Context) (obj)), view, 0x7f0101d6);
        view = a(a(view, -2), f, g, f, g);
        continue; /* Loop/switch isn't completed */
_L6:
        viewgroup.setEnabled(false);
        view = new View(((Context) (obj)));
        view.setBackgroundColor(gcg.b(((Context) (obj)), 0x7f0f000a));
        view = a(view, h);
        int l = f;
        int i1 = g;
        int j1 = f;
        ((android.widget.FrameLayout.LayoutParams)view.getLayoutParams()).setMargins(l, i1, j1, 0);
        continue; /* Loop/switch isn't completed */
_L7:
        view = new ListItemView(((Context) (obj)));
        continue; /* Loop/switch isn't completed */
_L8:
        view = new TextView(((Context) (obj)));
        dgo.b(((Context) (obj)), view, 0x7f0101dc);
        continue; /* Loop/switch isn't completed */
_L2:
        viewgroup = (ViewGroup)view.findViewById(0x7f1102f8);
        obj = view.findViewById(0x7f110012);
_L9:
        StoryModel storymodel = a(k);
        view.setTag(storymodel);
        switch (_cls2.b[viewtype.ordinal()])
        {
        case 3: // '\003'
        default:
            return view;

        case 1: // '\001'
            CircleImageCompoundTextView circleimagecompoundtextview = (CircleImageCompoundTextView)obj;
            viewgroup = storymodel.getAuthor();
            obj = viewgroup.getImage();
            Object obj1 = d;
            circleimagecompoundtextview.setCompoundDrawablePadding(circleimagecompoundtextview.getResources().getDimensionPixelSize(0x7f0c00a0));
            k = circleimagecompoundtextview.getResources().getDimensionPixelSize(0x7f0c00a1);
            circleimagecompoundtextview.a.b.a(((String) (obj))).b(((Drawable) (obj1))).a(((Drawable) (obj1))).b(k, k).b().a(circleimagecompoundtextview);
            obj1 = viewgroup.getName();
            obj = DateUtils.getRelativeTimeSpanString(storymodel.getTimestamp()).toString();
            viewgroup = ((ViewGroup) (obj));
            if (((String) (obj)).substring(0, 1).equals("0"))
            {
                viewgroup = circleimagecompoundtextview.getResources().getString(0x7f08005a);
            }
            viewgroup = new SpannableString((new StringBuilder()).append(((String) (obj1))).append("\n").append(viewgroup.toUpperCase(Locale.getDefault())).toString());
            viewgroup.setSpan(new TextAppearanceSpan(circleimagecompoundtextview.getContext(), 0x7f0b014b), viewgroup.toString().indexOf("\n") + 1, viewgroup.length(), 33);
            circleimagecompoundtextview.setText(viewgroup);
            return view;

        case 2: // '\002'
            viewgroup = (TextView)obj;
            viewgroup.setText(storymodel.getDescription());
            if (TextUtils.isEmpty(storymodel.getDescription()))
            {
                k = 8;
            } else
            {
                k = 0;
            }
            viewgroup.setVisibility(k);
            return view;

        case 4: // '\004'
            obj = (ListItemView)obj;
            ResourceModel resourcemodel = storymodel.getResource();
            ((ListItemView) (obj)).a().setImageResource(0);
            ((ListItemView) (obj)).setEnabled(i);
            ((ListItemView) (obj)).b(storymodel.getIsPlaying());
            ((ListItemView) (obj)).a(resourcemodel.getName());
            ((ListItemView) (obj)).setTag(0x7f110041, new fxh(j, storymodel.getResource()));
            ((ListItemView) (obj)).a(gae.a(getContext(), j, resourcemodel));
            if (com.spotify.mobile.android.spotlets.activityfeed.model.ResourceModel.Types.valueOf(resourcemodel.getType()) == com.spotify.mobile.android.spotlets.activityfeed.model.ResourceModel.Types.c)
            {
                ((ListItemView) (obj)).b(getContext().getString(0x7f0803fb, new Object[] {
                    resourcemodel.getSubName()
                }));
            } else
            {
                ((ListItemView) (obj)).b(resourcemodel.getSubName());
            }
            if (com.spotify.mobile.android.spotlets.activityfeed.model.ResourceModel.Types.valueOf(resourcemodel.getType()) == com.spotify.mobile.android.spotlets.activityfeed.model.ResourceModel.Types.b)
            {
                viewgroup = dfo.a();
            } else
            {
                viewgroup = null;
            }
            switch (_cls2.a[com.spotify.mobile.android.spotlets.activityfeed.model.ResourceModel.Types.valueOf(resourcemodel.getType()).ordinal()])
            {
            default:
                return view;

            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                ((ListItemView) (obj)).a().setVisibility(0);
                break;
            }
            dmz.a(gjj);
            gjj.a(getContext()).a(((ListItemView) (obj)).a(), resourcemodel.getImage(), e, viewgroup);
            return view;

        case 5: // '\005'
            obj = (TextView)obj;
            break;
        }
        boolean flag;
        if (storymodel.getStreams().getCount() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        viewgroup.setEnabled(flag);
        if (storymodel.getStreams().getCount() > 0)
        {
            a(a(((View) (obj)), -2), f, f, f, f);
        } else
        {
            a(a(((View) (obj)), f), f, 0, f, 0);
        }
        k = storymodel.getStreams().getCount();
        if (k > 0)
        {
            viewgroup = getContext().getResources().getQuantityString(0x7f090000, k, new Object[] {
                Integer.valueOf(k)
            }).toUpperCase(Locale.getDefault());
        } else
        {
            viewgroup = "";
        }
        ((TextView) (obj)).setText(viewgroup);
        return view;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final int getViewTypeCount()
    {
        return a.length;
    }

}
