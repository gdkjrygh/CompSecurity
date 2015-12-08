// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.animation.ObjectAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a;
import android.support.v7.util.SortedList;
import android.support.v7.widget.util.SortedListAdapterCallback;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.squareup.picasso.x;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.model.Message;
import com.tinder.model.User;
import com.tinder.utils.DateUtils;
import com.tinder.utils.ad;
import com.tinder.utils.v;
import com.tinder.views.MessageMomentBackgroundDrawable;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

public final class z extends android.support.v7.widget.RecyclerView.Adapter
{
    public static final class a extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        public a(View view)
        {
            super(view);
        }
    }

    public static interface b
    {

        public abstract void a();

        public abstract void a(Message message);
    }

    public static final class c extends android.support.v7.widget.RecyclerView.ViewHolder
        implements x
    {

        RelativeLayout a;
        RelativeLayout b;
        TextView c;
        TextView d;
        TextView e;
        ImageView f;
        int g;

        public final void onBitmapFailed(Drawable drawable)
        {
        }

        public final void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
        {
            f.setImageBitmap(bitmap);
        }

        public final void onPrepareLoad(Drawable drawable)
        {
        }

        public c(View view)
        {
            super(view);
            view.setEnabled(false);
            a = (RelativeLayout)view.findViewById(0x7f0e01ff);
            b = (RelativeLayout)view.findViewById(0x7f0e01fd);
            c = (TextView)view.findViewById(0x7f0e0200);
            d = (TextView)view.findViewById(0x7f0e0201);
            e = (TextView)view.findViewById(0x7f0e0202);
            f = (ImageView)view.findViewById(0x7f0e01fe);
        }
    }


    com.tinder.managers.z a;
    public SortedList b;
    private final Context c;
    private final String d;
    private final b e;
    private SortedListAdapterCallback f;
    private LayoutInflater g;
    private String h;
    private int i;
    private int j;

    public z(Context context, Message amessage[], String s1, b b1)
    {
        ManagerApp.h().a(this);
        c = context;
        e = b1;
        d = s1;
        j = c.getResources().getDimensionPixelSize(0x7f090158);
        i = c.getResources().getDimensionPixelSize(0x7f09015c);
        g = LayoutInflater.from(context);
        context = a.b();
        if (context != null)
        {
            h = context.getId();
        }
        f = new SortedListAdapterCallback(this) {

            final z a;

            public final boolean areContentsTheSame(Object obj, Object obj1)
            {
                boolean flag1 = false;
                Object obj2 = (Message)obj;
                Object obj3 = (Message)obj1;
                boolean flag = flag1;
                if (obj2.getClass().equals(obj3.getClass()))
                {
                    obj = ((Message) (obj2)).getFromUserId();
                    obj1 = ((Message) (obj3)).getFromUserId();
                    String s2 = ((Message) (obj2)).getText();
                    String s3 = ((Message) (obj3)).getText();
                    boolean flag2 = ((Message) (obj2)).isPending();
                    boolean flag3 = ((Message) (obj3)).isPending();
                    obj2 = ((Message) (obj2)).getId();
                    obj3 = ((Message) (obj3)).getId();
                    flag = flag1;
                    if (flag2 == flag3)
                    {
                        flag = flag1;
                        if (((String) (obj)).equals(obj1))
                        {
                            flag = flag1;
                            if (s2.equals(s3))
                            {
                                flag = flag1;
                                if (((String) (obj2)).equals(obj3))
                                {
                                    flag = true;
                                }
                            }
                        }
                    }
                }
                return flag;
            }

            public final boolean areItemsTheSame(Object obj, Object obj1)
            {
                obj = (Message)obj;
                obj1 = (Message)obj1;
                boolean flag = ((Message) (obj)).getMatchId().equals(((Message) (obj1)).getMatchId());
                boolean flag1 = ((Message) (obj)).getFromUserId().equals(((Message) (obj1)).getFromUserId());
                boolean flag2 = ((Message) (obj)).getText().equals(((Message) (obj1)).getText());
                return flag && flag1 && flag2;
            }

            public final int compare(Object obj, Object obj1)
            {
                return ((Message)obj).compareTo((Message)obj1);
            }

            
            {
                a = z.this;
                super(adapter);
            }
        };
        b = new SortedList(com/tinder/model/Message, f, amessage.length);
        int k = 0;
        for (int l = amessage.length; k < l; k++)
        {
            amessage[k] = amessage[k].clone();
        }

        b.addAll(amessage, true);
    }

    static b a(z z1)
    {
        return z1.e;
    }

    private Message a(int k)
    {
        return (Message)b.get(k);
    }

    private void a(c c1, int k)
    {
        Object obj1;
        boolean flag;
        flag = false;
        obj1 = a(k);
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        v.b("Tried to bind a message to a view holder, but message did not exist in list.");
_L4:
        return;
_L2:
        Object obj = c;
        int l;
        int i1;
        if (((Message) (obj1)).isFromMe())
        {
            l = 0x7f0d0020;
        } else
        {
            l = 0x7f0d001f;
        }
        l = android.support.v4.b.a.b(((Context) (obj)), l);
        c1.g = l;
        obj = new MessageMomentBackgroundDrawable(null, 0, c.getResources().getDimensionPixelOffset(0x7f090112), l, ((Message) (obj1)).isFromMe());
        ad.a(c1.a, ((Drawable) (obj)));
        l = c1.b.getPaddingRight();
        i1 = c1.b.getPaddingLeft();
        if (k == 0)
        {
            c1.b.setPadding(i1, j, l, i);
        } else
        if (i != c1.b.getPaddingTop())
        {
            c1.b.setPadding(i1, i, l, i);
        }
        if (((Message) (obj1)).isFailed())
        {
            obj = new android.view.View.OnClickListener(((Message) (obj1))) {

                final Message a;
                final z b;

                public final void onClick(View view)
                {
                    com.tinder.adapters.z.a(b).a(a);
                }

            
            {
                b = z.this;
                a = message;
                super();
            }
            };
            c1.c.setOnClickListener(((android.view.View.OnClickListener) (obj)));
            c1.d.setOnClickListener(((android.view.View.OnClickListener) (obj)));
            c1.e.setOnClickListener(((android.view.View.OnClickListener) (obj)));
        } else
        {
            c1.c.setOnLongClickListener(new android.view.View.OnLongClickListener(c1) {

                final c a;
                final z b;

                public final boolean onLongClick(View view)
                {
                    Toast.makeText(z.b(b), 0x7f060091, 1).show();
                    view = a.c.getText().toString();
                    ((ClipboardManager)z.b(b).getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(view, view));
                    return true;
                }

            
            {
                b = z.this;
                a = c1;
                super();
            }
            });
        }
        TextView textview;
        TextView textview1;
        long l1;
        if (!((Message) (obj1)).isFromMe())
        {
            c1.f.setOnClickListener(new android.view.View.OnClickListener() {

                final z a;

                public final void onClick(View view)
                {
                    com.tinder.adapters.z.a(a).a();
                }

            
            {
                a = z.this;
                super();
            }
            });
            obj = d;
        } else
        {
            obj = null;
        }
        if (obj != null && ((String) (obj)).trim().length() != 0)
        {
            Picasso.a(c).a(((String) (obj))).a(0x7f02004f).a(0x7f090082, 0x7f090082).b().a(c1);
        }
        c1.c.setText(((Message) (obj1)).getText());
        if (!((Message) (obj1)).isPending())
        {
            break; /* Loop/switch isn't completed */
        }
        c1.d.setText("");
        c1.e.setText(0x7f0601cc);
        obj = ObjectAnimator.ofFloat(c1.d, "alpha", new float[] {
            0.2F, 1.0F
        });
        ((ObjectAnimator) (obj)).setDuration(1000L);
        ((ObjectAnimator) (obj)).setRepeatMode(2);
        ((ObjectAnimator) (obj)).setRepeatCount(-1);
        ((ObjectAnimator) (obj)).start();
        c1.e.setTag(obj);
        k = ((flag) ? 1 : 0);
_L9:
        if (k != 0 && c1.e.getTag() != null)
        {
            ((ObjectAnimator)c1.e.getTag()).cancel();
            c1.e.setTag(null);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
label0:
        {
            if (!((Message) (obj1)).isFailed())
            {
                break label0;
            }
            c1.d.setVisibility(8);
            c1.e.setText(0x7f0600c0);
            k = 1;
        }
        break MISSING_BLOCK_LABEL_343;
        c1.d.setVisibility(0);
        obj1 = DateUtils.a().parse(((Message) (obj1)).getCreationDate());
        textview = c1.e;
        textview1 = c1.d;
        obj = new Date();
        l1 = ((Date) (obj)).getTime() - ((Date) (obj1)).getTime();
        if (l1 >= 60000L) goto _L6; else goto _L5
_L5:
        obj1 = c.getString(0x7f06014b);
        obj = null;
_L7:
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_724;
        }
        textview1.setVisibility(0);
        textview1.setText(((CharSequence) (obj)));
_L8:
        textview.setText(((CharSequence) (obj1)));
        break MISSING_BLOCK_LABEL_756;
_L6:
        if (l1 >= 0x36ee80L)
        {
            break MISSING_BLOCK_LABEL_618;
        }
        obj1 = DateUtils.getRelativeTimeSpanString(((Date) (obj1)).getTime(), ((Date) (obj)).getTime(), 60000L, 0x60000).toString();
        obj = null;
          goto _L7
        if (!DateUtils.a(((Date) (obj)), ((Date) (obj1))))
        {
            break MISSING_BLOCK_LABEL_647;
        }
        obj1 = DateUtils.formatDateTime(c, ((Date) (obj1)).getTime(), 1);
        obj = null;
          goto _L7
        if (l1 >= 0x240c8400L)
        {
            break MISSING_BLOCK_LABEL_690;
        }
        obj = DateUtils.formatDateTime(c, ((Date) (obj1)).getTime(), 32770);
        obj1 = DateUtils.formatDateTime(c, ((Date) (obj1)).getTime(), 1);
          goto _L7
        obj = DateUtils.formatDateTime(c, ((Date) (obj1)).getTime(), 0x80000);
        obj1 = DateUtils.formatDateTime(c, ((Date) (obj1)).getTime(), 1);
          goto _L7
        textview1.setVisibility(8);
        textview1.setText(((CharSequence) (obj)));
          goto _L8
        obj;
        v.b(((ParseException) (obj)).toString());
        k = 1;
          goto _L9
    }

    static Context b(z z1)
    {
        return z1.c;
    }

    public final void a(Message message)
    {
        b.add(message.clone());
    }

    public final void a(Collection collection)
    {
        int i1;
label0:
        for (int k = b.size() - 1; k >= 0; k = i1 - 1)
        {
            Message message = (Message)b.get(k);
            if (message.isPending())
            {
                Iterator iterator = collection.iterator();
                do
                {
                    Message message1;
                    do
                    {
                        i1 = k;
                        if (!iterator.hasNext())
                        {
                            continue label0;
                        }
                        message1 = (Message)iterator.next();
                    } while (!f.areItemsTheSame(message, message1));
                    b.updateItemAt(k, message1.clone());
                    iterator.remove();
                    k--;
                } while (true);
            }
            i1 = k;
        }

        collection = (Message[])collection.toArray(new Message[collection.size()]);
        int l = 0;
        for (int j1 = collection.length; l < j1; l++)
        {
            collection[l] = collection[l].clone();
        }

        b.addAll(collection, true);
    }

    public final int getItemCount()
    {
        return b.size();
    }

    public final long getItemId(int k)
    {
        Message message = a(k);
        if (message != null)
        {
            return (long)message.getId().hashCode();
        } else
        {
            return 0L;
        }
    }

    public final int getItemViewType(int k)
    {
        Message message = (Message)a(k);
        return !h.equals(message.getFromUserId()) ? 0 : 1;
    }

    public final void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int k)
    {
        switch (getItemViewType(k))
        {
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        default:
            return;

        case 0: // '\0'
            a((c)viewholder, k);
            return;

        case 1: // '\001'
            a((c)viewholder, k);
            break;
        }
    }

    public final android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int k)
    {
        switch (k)
        {
        case 2: // '\002'
        case 3: // '\003'
        default:
            v.b("Unknown view type for messages, could not set up view holder.");
            throw new IllegalStateException("Unable to resolve view type. Check that it exists.");

        case 4: // '\004'
            return new a(g.inflate(0x7f0300a6, viewgroup, false));

        case 0: // '\0'
            return new c(g.inflate(0x7f030082, viewgroup, false));

        case 1: // '\001'
            return new c(g.inflate(0x7f030081, viewgroup, false));
        }
    }
}
