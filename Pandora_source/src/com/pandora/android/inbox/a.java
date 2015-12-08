// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.inbox;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.pandora.android.push.b;
import com.pandora.android.util.s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p.l.c;
import p.l.d;
import p.l.g;
import p.l.j;

// Referenced classes of package com.pandora.android.inbox:
//            InboxNotificationProcessor, InboxNotification

public class com.pandora.android.inbox.a extends CursorAdapter
{
    private class a extends p.ab.d
    {

        final com.pandora.android.inbox.a a;

        protected Bitmap a(p.t.c c1, Bitmap bitmap, int i, int k)
        {
            i = Math.min(bitmap.getWidth(), bitmap.getHeight());
            c1 = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - i) / 2, (bitmap.getHeight() - i) / 2, i, i);
            bitmap = new Paint();
            bitmap.setShader(new BitmapShader(c1, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP));
            bitmap.setAntiAlias(true);
            float f1 = (float)i / 2.0F;
            Bitmap bitmap1 = Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ARGB_8888);
            (new Canvas(bitmap1)).drawCircle(f1, f1, f1, bitmap);
            c1.recycle();
            return bitmap1;
        }

        public String a()
        {
            return "circle";
        }

        public a(Context context)
        {
            a = com.pandora.android.inbox.a.this;
            super(context);
        }
    }

    private class b extends p.ab.d
    {

        final com.pandora.android.inbox.a a;

        protected Bitmap a(p.t.c c1, Bitmap bitmap, int i, int k)
        {
            k = com.pandora.android.inbox.a.a(a).getResources().getDimensionPixelSize(0x7f0900f5);
            c1 = Bitmap.createBitmap(k, k, android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(c1);
            Paint paint = new Paint(2);
            bitmap = Bitmap.createScaledBitmap(bitmap, k, k, false);
            canvas.drawBitmap(bitmap, 0.0F, 0.0F, paint);
            Bitmap bitmap1 = BitmapFactory.decodeResource(com.pandora.android.inbox.a.a(a).getResources(), 0x7f02012f);
            i = (k - bitmap1.getWidth()) / 2;
            k = (k - bitmap1.getHeight()) / 2;
            canvas.drawBitmap(bitmap1, i, k, paint);
            bitmap.recycle();
            return c1;
        }

        public String a()
        {
            return "overlay";
        }

        public b(Context context)
        {
            a = com.pandora.android.inbox.a.this;
            super(context);
        }
    }

    private static class c
    {

        ImageView a;
        TextView b;
        TextView c;
        TextView d;
        ImageView e;
        TextView f;

        private c()
        {
        }

    }


    private Context a;
    private LayoutInflater b;
    private Set c;
    private Set d;
    private p.q.g e;
    private p.q.g f;

    public com.pandora.android.inbox.a(Context context, Cursor cursor)
    {
        super(context, cursor, false);
        a = context;
        b = LayoutInflater.from(context);
        c = new HashSet();
        e = new a(context);
        f = new b(context);
        d = new HashSet();
    }

    static Context a(com.pandora.android.inbox.a a1)
    {
        return a1.a;
    }

    void a()
    {
        if (c.size() > 0)
        {
            long al[] = new long[c.size()];
            Iterator iterator = c.iterator();
            for (int i = 0; iterator.hasNext(); i++)
            {
                al[i] = ((Long)iterator.next()).longValue();
            }

            com.pandora.android.inbox.InboxNotificationProcessor.b(a, al);
            c.clear();
        }
    }

    void b()
    {
        if (d.size() > 0)
        {
            ArrayList arraylist = new ArrayList();
            arraylist.addAll(d);
            (new com.pandora.android.push.b(null, arraylist, p.cx.x.a.k, p.cx.x.b.b)).a_(new Object[0]);
            d.clear();
        }
    }

    public void bindView(View view, Context context, Cursor cursor)
    {
        c c1 = (c)view.getTag();
        cursor = InboxNotification.a(cursor);
        int i;
        boolean flag;
        if (((InboxNotification) (cursor)).j == null)
        {
            flag = false;
        } else
        {
            flag = ((InboxNotification) (cursor)).j.booleanValue();
        }
        i = context.getResources().getColor(0x7f0b0066);
        if (((InboxNotification) (cursor)).h != null)
        {
            i = ((InboxNotification) (cursor)).h.intValue();
        } else
        if (flag)
        {
            Resources resources = context.getResources();
            if (((InboxNotification) (cursor)).d == null)
            {
                i = 0x7f0b0063;
            } else
            {
                i = 0x7f0b0062;
            }
            i = resources.getColor(i);
        }
        view.setBackgroundColor(i);
        if (((InboxNotification) (cursor)).e != null && !TextUtils.isEmpty(((InboxNotification) (cursor)).e.toString()))
        {
            g.b(context).a(((InboxNotification) (cursor)).e).h().a(0x7f02012e).a(new p.q.g[] {
                e
            }).a(c1.a);
        } else
        {
            c1.a.setImageResource(0x7f02012e);
        }
        if (!TextUtils.isEmpty(((InboxNotification) (cursor)).b))
        {
            c1.b.setText(s.b(((InboxNotification) (cursor)).b));
        } else
        {
            c1.b.setText("");
        }
        if (((InboxNotification) (cursor)).m)
        {
            c1.c.setVisibility(8);
        } else
        {
            long l = System.currentTimeMillis() - ((InboxNotification) (cursor)).n;
            if (l < 0L)
            {
                c1.c.setVisibility(8);
            } else
            {
                view = s.a(context, l);
                c1.c.setText(view);
                c1.c.setVisibility(0);
            }
        }
        if (!TextUtils.isEmpty(((InboxNotification) (cursor)).c))
        {
            c1.d.setText(s.b(((InboxNotification) (cursor)).c));
            c1.d.setVisibility(0);
        } else
        {
            c1.d.setVisibility(8);
        }
        if (((InboxNotification) (cursor)).f != null && !TextUtils.isEmpty(((InboxNotification) (cursor)).f.toString()))
        {
            if (((InboxNotification) (cursor)).i)
            {
                g.b(context).a(((InboxNotification) (cursor)).f).h().a(0x7f0200e9).a(new p.q.g[] {
                    f
                }).a(c1.e);
            } else
            {
                g.b(context).a(((InboxNotification) (cursor)).f).a(0x7f0200e9).a(c1.e);
            }
            c1.e.setVisibility(0);
        } else
        {
            c1.e.setVisibility(8);
        }
        if (!TextUtils.isEmpty(((InboxNotification) (cursor)).g))
        {
            c1.f.setText(s.b(((InboxNotification) (cursor)).g));
            c1.f.setVisibility(0);
        } else
        {
            c1.f.setVisibility(8);
        }
        d.add(Long.valueOf(((InboxNotification) (cursor)).a));
    }

    public void changeCursor(Cursor cursor)
    {
        super.changeCursor(cursor);
        if (cursor != null)
        {
            int i = cursor.getPosition();
            if (cursor.moveToFirst())
            {
                int k = cursor.getColumnIndex("_id");
                int l = cursor.getColumnIndex("isSeen");
                int i1 = cursor.getColumnIndex("neverSetSeen");
                do
                {
                    if (cursor.isNull(l) || cursor.getInt(l) != p.cx.x.d.c.a())
                    {
                        if (cursor.getInt(i1) != 1)
                        {
                            c.add(Long.valueOf(cursor.getLong(k)));
                        }
                    } else
                    if (!cursor.isNull(l) && cursor.getInt(l) != p.cx.x.d.b.a())
                    {
                        c.remove(Long.valueOf(cursor.getLong(k)));
                    }
                } while (cursor.moveToNext());
            }
            cursor.moveToPosition(i);
        }
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = b.inflate(0x7f040060, viewgroup, false);
        cursor = new c();
        cursor.a = (ImageView)context.findViewById(0x7f100078);
        cursor.b = (TextView)context.findViewById(0x7f100044);
        cursor.c = (TextView)context.findViewById(0x7f10019e);
        cursor.d = (TextView)context.findViewById(0x7f10019f);
        cursor.e = (ImageView)context.findViewById(0x7f100075);
        cursor.f = (TextView)context.findViewById(0x7f1001a0);
        context.setTag(cursor);
        return context;
    }
}
