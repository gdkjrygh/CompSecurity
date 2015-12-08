// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.chat;

import FE;
import FF;
import FP;
import FQ;
import FR;
import FS;
import Jo;
import aU;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObservable;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ChatStickersDrawerView extends LinearLayout
    implements FQ.a, android.support.v4.view.ViewPager.e
{
    public final class a extends android.support.v7.widget.RecyclerView.g
    {

        private int a;

        public final void a(Rect rect, View view, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.s s)
        {
            rect.set(a, a, a, a);
        }

        public a()
        {
            a = 10;
        }
    }

    public final class b extends aU
    {

        final ChatStickersDrawerView a;

        public final Object a(ViewGroup viewgroup, int j)
        {
            FF ff = null;
            RecyclerView recyclerview = new RecyclerView(a.getContext(), null);
            viewgroup.addView(recyclerview);
            a.getContext();
            recyclerview.setLayoutManager(new GridLayoutManager(6));
            viewgroup = ChatStickersDrawerView.b(a);
            if (j < 0 || j >= ((FQ) (viewgroup)).a.size())
            {
                Timber.f("StickerPackManager", "[Stickers] Tried to access pack %d of %d", new Object[] {
                    Integer.valueOf(j), Integer.valueOf(((FQ) (viewgroup)).a.size())
                });
                viewgroup = ff;
            } else
            {
                viewgroup = (FP)((FQ) (viewgroup)).a.get(j);
            }
            ff = new FF(viewgroup, ChatStickersDrawerView.c(a), FS.a());
            recyclerview.setAdapter(ff);
            (new FQ._cls1(ChatStickersDrawerView.b(a), viewgroup, ff)).execute(new Void[0]);
            a.getContext();
            recyclerview.a(new a());
            recyclerview.setOverScrollMode(2);
            recyclerview.setOnTouchListener(new android.view.View.OnTouchListener(this, recyclerview) {

                private RecyclerView a;
                private b b;

                public final boolean onTouch(View view, MotionEvent motionevent)
                {
                    int j = motionevent.getAction();
                    view = a.getChildAt(0);
                    boolean flag;
                    if (view == null || view.getTop() >= 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    view = ChatStickersDrawerView.d(b.a).iterator();
                    do
                    {
                        if (!view.hasNext())
                        {
                            break;
                        }
                        d d1 = (d)view.next();
                        if (motionevent.getAction() == 2)
                        {
                            d1.b(motionevent, flag);
                        } else
                        if (j == 1)
                        {
                            d1.b();
                        }
                    } while (true);
                    return false;
                }

            
            {
                b = b1;
                a = recyclerview;
                super();
            }
            });
            return recyclerview;
        }

        public final void a(ViewGroup viewgroup, int j, Object obj)
        {
            viewgroup.removeView((RecyclerView)obj);
        }

        public final boolean a(View view, Object obj)
        {
            return view == obj;
        }

        public final int c()
        {
            return ChatStickersDrawerView.b(a).a.size();
        }

        private b()
        {
            a = ChatStickersDrawerView.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }

    public static interface c
    {

        public abstract void a(Drawable drawable);
    }

    public static interface d
    {

        public abstract void b();

        public abstract void b(MotionEvent motionevent, boolean flag);
    }


    public ViewPager a;
    LinearLayout b;
    final Context c;
    public final HorizontalScrollView d = (HorizontalScrollView)findViewById(0x7f0d01a6);
    public final List e = new ArrayList();
    View f;
    private final FQ g;
    private final Handler h = new Handler(Looper.getMainLooper());
    private FE i;

    public ChatStickersDrawerView(Context context, FQ fq)
    {
        super(context, null);
        inflate(context, 0x7f040040, this);
        c = context;
        FR.a();
        a = (ViewPager)findViewById(0x7f0d01a5);
        b = (LinearLayout)findViewById(0x7f0d01a7);
        context = a;
        if (((ViewPager) (context)).mOnPageChangeListeners == null)
        {
            context.mOnPageChangeListeners = new ArrayList();
        }
        ((ViewPager) (context)).mOnPageChangeListeners.add(this);
        g = fq;
        g.c = this;
        a.setAdapter(new b((byte)0));
    }

    static Handler a(ChatStickersDrawerView chatstickersdrawerview)
    {
        return chatstickersdrawerview.h;
    }

    static FQ b(ChatStickersDrawerView chatstickersdrawerview)
    {
        return chatstickersdrawerview.g;
    }

    static FE c(ChatStickersDrawerView chatstickersdrawerview)
    {
        return chatstickersdrawerview.i;
    }

    static List d(ChatStickersDrawerView chatstickersdrawerview)
    {
        return chatstickersdrawerview.e;
    }

    public final void a()
    {
        for (Iterator iterator = (new ArrayList(g.b.values())).iterator(); iterator.hasNext();)
        {
            FP fp = (FP)iterator.next();
            FQ fq = g;
            c c1 = new c(fp) {

                final FP a;
                final ChatStickersDrawerView b;

                public final void a(Drawable drawable)
                {
                    ChatStickersDrawerView.a(b).post(new Runnable(this, drawable) {

                        private Drawable a;
                        private _cls1 b;

                        public final void run()
                        {
                            int i1 = b.a.e;
                            ChatStickersDrawerView chatstickersdrawerview = b.b;
                            Drawable drawable = a;
                            int j = chatstickersdrawerview.b.getChildCount();
                            int k = (int)Jo.a(50F, chatstickersdrawerview.c);
                            j = Math.max(Jo.a(chatstickersdrawerview.c) / (j + 1), k);
                            ImageView imageview = new ImageView(chatstickersdrawerview.c);
                            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(j, -1);
                            imageview.setImageDrawable(drawable);
                            imageview.setLayoutParams(layoutparams);
                            imageview.setAlpha(0.98F);
                            imageview.setTag(Integer.valueOf(i1));
                            imageview.setOnClickListener(chatstickersdrawerview. new android.view.View.OnClickListener() {

                                private ChatStickersDrawerView a;

                                public final void onClick(View view)
                                {
                                    a.a.setCurrentItem(a.b.indexOfChild(view));
                                }

            
            {
                a = ChatStickersDrawerView.this;
                super();
            }
                            });
                            j = 0;
                            int l;
                            for (k = -1; j < chatstickersdrawerview.b.getChildCount(); k = l)
                            {
                                View view = chatstickersdrawerview.b.getChildAt(j);
                                l = k;
                                if (k == -1)
                                {
                                    l = k;
                                    if (((Integer)view.getTag()).intValue() > i1)
                                    {
                                        l = j;
                                    }
                                }
                                view.setLayoutParams(layoutparams);
                                j++;
                            }

                            if (i1 == 0)
                            {
                                imageview.setSelected(true);
                                chatstickersdrawerview.f = imageview;
                            }
                            chatstickersdrawerview.b.addView(imageview, k);
                            b.b.a.mAdapter.mObservable.notifyChanged();
                        }

            
            {
                b = _pcls1;
                a = drawable;
                super();
            }
                    });
                }

            
            {
                b = ChatStickersDrawerView.this;
                a = fp;
                super();
            }
            };
            if (fp.g)
            {
                fq.a(fp);
                c1.a(SnapchatApplication.get().getResources().getDrawable(0x7f0200b5));
            } else
            {
                (new FQ._cls2(fq, fp, c1)).execute(new Void[0]);
            }
        }

    }

    public final void a(int j)
    {
        if (f == null)
        {
            f = b.getChildAt(0);
        }
        f.setSelected(false);
        f = b.getChildAt(j);
        f.setSelected(true);
        Rect rect = new Rect();
        d.getDrawingRect(rect);
        j = b.indexOfChild(f);
        View view = b.getChildAt(j - 1);
        View view1 = b.getChildAt(j + 1);
        if (view1 != null && view != null)
        {
            j = view1.getRight() - rect.right;
            int k = view.getLeft() - rect.left;
            if (j > 0)
            {
                d.smoothScrollBy(j, 0);
            } else
            if (k < 0)
            {
                d.smoothScrollBy(k, 0);
                return;
            }
        }
    }

    public final void a(int j, float f1, int k)
    {
    }

    public final void b(int j)
    {
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        a.requestDisallowInterceptTouchEvent(true);
        return super.onInterceptTouchEvent(motionevent);
    }

    public void setChatAdapterActionHandler(FE fe)
    {
        i = fe;
    }
}
