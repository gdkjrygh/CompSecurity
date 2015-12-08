// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.ui;

import Bk;
import EU;
import Fh;
import Je;
import Jf;
import Mf;
import Or;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.snapchat.android.Timber;
import com.snapchat.android.stories.StoriesThumbnailType;
import com.snapchat.android.ui.StoryTimerView;
import com.squareup.otto.Bus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.snapchat.android.stories.ui:
//            StoryThumbnailView

public class StoryThumbnailLayout extends LinearLayout
    implements com.snapchat.android.ui.VerticalSwipeLayout.a
{
    public static interface a
    {

        public abstract void b(int l);
    }


    StoryTimerView a;
    Bus b;
    final List c;
    final Map d;
    int e;
    boolean f;
    private final Je g;
    private final Fh h;
    private final EU i;
    private a j;
    private int k;

    public StoryThumbnailLayout(Context context)
    {
        this(context, null);
    }

    public StoryThumbnailLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, Je.a(), Fh.a(), new EU(context), Mf.a());
    }

    private StoryThumbnailLayout(Context context, AttributeSet attributeset, Je je, Fh fh, EU eu, Bus bus)
    {
        super(context, attributeset);
        g = je;
        h = fh;
        i = eu;
        b = bus;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        setPadding(0, getResources().getDimensionPixelSize(0x7f0a014d), getResources().getDimensionPixelSize(0x7f0a014d), 0);
        setGravity(5);
        setOrientation(1);
        c = new ArrayList();
        d = new HashMap();
        e = 0;
        k = 0;
        f = false;
    }

    static a a(StoryThumbnailLayout storythumbnaillayout)
    {
        return storythumbnaillayout.j;
    }

    static EU b(StoryThumbnailLayout storythumbnaillayout)
    {
        return storythumbnaillayout.i;
    }

    public final void a(int l, int i1, int j1)
    {
        boolean flag4 = true;
        if (l != 1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        e = j1;
        if (c.isEmpty())
        {
            Timber.a("StoryThumbnailLayout", "Thumbnails list is empty when settling from %d to %d", new Object[] {
                Integer.valueOf(i1), Integer.valueOf(j1)
            });
            return;
        }
        boolean flag1;
        if (i1 > j1)
        {
            if (i1 - j1 > 1)
            {
                l = c.size() - 1;
                while (l >= j1) 
                {
                    EU eu = i;
                    ImageView imageview = (ImageView)c.get(l);
                    boolean flag;
                    if (l == 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    eu.a(imageview, flag, false);
                    l--;
                }
                continue; /* Loop/switch isn't completed */
            }
            flag1 = false;
        } else
        if (i1 < j1)
        {
            flag1 = true;
            j1 = i1;
        } else
        if (k <= j1 && j1 > 0)
        {
            j1--;
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        l = 0;
        while (l < j1) 
        {
            EU eu1 = i;
            ImageView imageview1 = (ImageView)c.get(l);
            boolean flag2;
            if (l == 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            eu1.a(imageview1, flag2, true);
            l++;
        }
        EU eu2 = i;
        ImageView imageview2 = (ImageView)c.get(j1);
        boolean flag3;
        if (j1 == 0)
        {
            flag3 = flag4;
        } else
        {
            flag3 = false;
        }
        eu2.a(imageview2, flag3, flag1);
        l = j1 + 1;
        while (l < c.size()) 
        {
            ((StoryThumbnailView)c.get(l)).setVisibility(8);
            l++;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final void a(Bk bk, Bk bk1, int l)
    {
        if (c.size() >= l) goto _L2; else goto _L1
_L1:
        Timber.d("StoryThumbnailLayout", "Attempt to add new thumbnail for snap without setting previous thumbnail.", new Object[0]);
_L4:
        return;
_L2:
        String s;
        android.graphics.Bitmap bitmap;
        if (c.size() == l)
        {
            StoryThumbnailView storythumbnailview = (StoryThumbnailView)h.a(0x7f0400f6, null);
            addView(storythumbnailview);
            c.add(storythumbnailview);
            storythumbnailview.setOnClickListener(new android.view.View.OnClickListener(l) {

                private int a;
                private StoryThumbnailLayout b;

                public final void onClick(View view)
                {
                    if (StoryThumbnailLayout.a(b) == null)
                    {
                        Timber.c("StoryThumbnailLayout", "Cannot tap on thumbnail since listener is null.", new Object[0]);
                        return;
                    }
                    if (StoryThumbnailLayout.b(b).f)
                    {
                        Timber.c("StoryThumbnailLayout", "Cannot tap on thumbnail since thumbnails are animating.", new Object[0]);
                        return;
                    } else
                    {
                        StoryThumbnailLayout.a(b).b(a);
                        return;
                    }
                }

            
            {
                b = StoryThumbnailLayout.this;
                a = l;
                super();
            }
            });
        }
        s = bk.aB();
        if (s == null)
        {
            Timber.d("StoryThumbnailLayout", "StorySnap is missing thumbnail cache key: %s", new Object[] {
                bk.d()
            });
            return;
        }
        StoryThumbnailView storythumbnailview1 = (StoryThumbnailView)c.get(l);
        bitmap = g.a(s);
        storythumbnailview1.setImageBitmap(bitmap);
        storythumbnailview1.setCacheKey(s);
        if (bitmap != null) goto _L4; else goto _L3
_L3:
        String s1;
        Timber.d("StoryThumbnailLayout", "Thumbnail is not in cache for snap %s with cache key: %s", new Object[] {
            bk.d(), s
        });
        s1 = bk.aB();
        synchronized (d)
        {
            if (d.get(s1) == null)
            {
                break MISSING_BLOCK_LABEL_222;
            }
        }
        return;
        bk;
        map;
        JVM INSTR monitorexit ;
        throw bk;
        d.put(s1, Integer.valueOf(l));
        if (!f)
        {
            b.c(this);
            f = true;
        }
        bk = new Jf(StoriesThumbnailType.NEWEST_SNAP_THUMBNAIL_WITHOUT_DECAY, Collections.singletonList(bk), s1);
        if (bk1 == null)
        {
            break MISSING_BLOCK_LABEL_299;
        }
        g.a(getContext(), bk, bk1.ad());
_L6:
        map;
        JVM INSTR monitorexit ;
        return;
        g.a(getContext(), bk);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void b(int l, int i1, int j1)
    {
        float f1;
        EU eu;
        ImageView imageview;
label0:
        {
            k = j1;
            if (k >= e)
            {
                j1 = e;
            } else
            {
                j1 = e - 1;
            }
            if (j1 >= 0 && j1 < c.size())
            {
                android.widget.LinearLayout.LayoutParams layoutparams;
                boolean flag;
                if (i1 == 0)
                {
                    f1 = 0.0F;
                } else
                {
                    f1 = (float)l / (float)i1;
                }
                eu = i;
                imageview = (ImageView)c.get(j1);
                if (j1 == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                eu.a(imageview, flag);
                if (!flag)
                {
                    break label0;
                }
                l = (int)((float)(eu.a - eu.b) * f1);
                l = eu.b + l;
                i1 = (int)((1.0F - f1) * (float)eu.c);
                layoutparams = (android.widget.LinearLayout.LayoutParams)imageview.getLayoutParams();
                layoutparams.width = l;
                layoutparams.height = l;
                layoutparams.rightMargin = i1;
                layoutparams.topMargin = i1;
                imageview.setLayoutParams(layoutparams);
                imageview.setAlpha(f1);
                eu.g.setScaleFactor(0.65F * f1 + 1.0F);
                eu.g.setAlpha(1.0F - f1);
            }
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutparams1 = (android.widget.LinearLayout.LayoutParams)imageview.getLayoutParams();
        layoutparams1.width = eu.a;
        layoutparams1.height = eu.a;
        float f2 = eu.d;
        layoutparams1.topMargin = (int)((float)(eu.e - eu.d) * (1.0F - f1) + f2);
        imageview.setLayoutParams(layoutparams1);
        imageview.setAlpha(f1);
    }

    public final void b_(int l)
    {
    }

    public void onStoryThumbnailLoadedEvent(Or or)
    {
        String s = or.mStoriesThumbnailCacheItem.mCacheKey;
        or = d;
        or;
        JVM INSTR monitorenter ;
        Object obj = (Integer)d.get(s);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        or;
        JVM INSTR monitorexit ;
        return;
        obj = (StoryThumbnailView)c.get(((Integer) (obj)).intValue());
        if (((StoryThumbnailView) (obj)).a == s)
        {
            Timber.c("StoryThumbnailLayout", "Thumbnail loaded with cache key: %s", new Object[] {
                s
            });
            ((StoryThumbnailView) (obj)).setImageBitmap(g.a(s));
        }
        d.remove(s);
        if (d.isEmpty())
        {
            b.b(this);
            f = false;
        }
        or;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        or;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setOnStoryThumbnailClickedListener(a a1)
    {
        j = a1;
    }

    public void setStoryTimerView(StoryTimerView storytimerview)
    {
        a = storytimerview;
        i.g = a;
    }
}
