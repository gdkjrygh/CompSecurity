// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.views;

import afH;
import afV;
import agk;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;

public class AttachmentView extends FrameLayout
{

    final ViewGroup a;
    final Uri b;
    public TextView c;
    public int d;
    public int e;
    public int f;
    public int g;
    int h;
    int i;
    private final Context j;
    private final String k;
    private ImageView l;

    public AttachmentView(Context context, ViewGroup viewgroup, afV afv)
    {
        super(context);
        j = context;
        a = viewgroup;
        b = Uri.fromFile(new File(afH.a(), afv.a()));
        k = afv.c;
        a(30);
        a(context, false);
        i = 0;
        c.setText("Loading...");
        a(false);
    }

    public AttachmentView(Context context, ViewGroup viewgroup, Uri uri)
    {
        super(context);
        j = context;
        a = viewgroup;
        b = uri;
        k = uri.getLastPathSegment();
        a(20);
        a(context, true);
        c.setText(k);
        (new AsyncTask() {

            private AttachmentView a;

            protected final Object doInBackground(Object aobj[])
            {
                return AttachmentView.a(a);
            }

            protected final void onPostExecute(Object obj)
            {
                obj = (Bitmap)obj;
                if (obj != null)
                {
                    AttachmentView.a(a, ((Bitmap) (obj)));
                    return;
                } else
                {
                    AttachmentView.b(a);
                    return;
                }
            }

            
            {
                a = AttachmentView.this;
                super();
            }
        }).execute(new Void[0]);
    }

    private Bitmap a()
    {
        int j1;
        try
        {
            i = agk.a(j, b);
            Context context;
            Uri uri;
            android.graphics.BitmapFactory.Options options;
            int i1;
            if (i == 1)
            {
                i1 = f;
            } else
            {
                i1 = d;
            }
        }
        catch (Throwable throwable)
        {
            return null;
        }
        if (i != 1)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        j1 = g;
        context = j;
        uri = b;
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options);
        options.inSampleSize = agk.a(options, i1, j1);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(context.getContentResolver().openInputStream(uri), null, options);
        j1 = e;
        break MISSING_BLOCK_LABEL_43;
    }

    static Bitmap a(AttachmentView attachmentview)
    {
        return attachmentview.a();
    }

    private Drawable a(String s)
    {
        return getResources().getDrawable(getResources().getIdentifier(s, "drawable", "android"));
    }

    private void a(int i1)
    {
        DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
        h = Math.round(TypedValue.applyDimension(1, 10F, displaymetrics));
        i1 = Math.round(TypedValue.applyDimension(1, i1, displaymetrics));
        int j1 = displaymetrics.widthPixels;
        int k1 = h;
        int l1 = h;
        d = (j1 - i1 * 2 - k1 * 2) / 3;
        f = (j1 - i1 * 2 - l1 * 1) / 2;
        e = d << 1;
        g = f;
    }

    private void a(Context context, boolean flag)
    {
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2, 80));
        setPadding(0, h, 0, 0);
        l = new ImageView(context);
        LinearLayout linearlayout = new LinearLayout(context);
        linearlayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2, 80));
        linearlayout.setGravity(3);
        linearlayout.setOrientation(1);
        linearlayout.setBackgroundColor(Color.parseColor("#80262626"));
        c = new TextView(context);
        c.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2, 17));
        c.setGravity(17);
        c.setTextColor(Color.parseColor("#FFFFFF"));
        c.setSingleLine();
        c.setEllipsize(android.text.TextUtils.TruncateAt.MIDDLE);
        if (flag)
        {
            context = new ImageButton(context);
            context.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2, 80));
            context.setAdjustViewBounds(true);
            context.setImageDrawable(a("ic_menu_delete"));
            context.setBackgroundResource(0);
            context.setOnClickListener(new android.view.View.OnClickListener() {

                private AttachmentView a;

                public final void onClick(View view)
                {
                    view = a;
                    ((AttachmentView) (view)).a.removeView(view);
                }

            
            {
                a = AttachmentView.this;
                super();
            }
            });
            linearlayout.addView(context);
        }
        linearlayout.addView(c);
        addView(l);
        addView(linearlayout);
    }

    private void a(Bitmap bitmap, boolean flag)
    {
        int i1;
        int j1;
        if (i == 1)
        {
            i1 = f;
        } else
        {
            i1 = d;
        }
        if (i == 1)
        {
            j1 = g;
        } else
        {
            j1 = e;
        }
        c.setMaxWidth(i1);
        c.setMinWidth(i1);
        l.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        l.setAdjustViewBounds(true);
        l.setMinimumWidth(i1);
        l.setMaxWidth(i1);
        l.setMaxHeight(j1);
        l.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        l.setImageBitmap(bitmap);
        l.setOnClickListener(new android.view.View.OnClickListener(flag) {

            private boolean a;
            private AttachmentView b;

            public final void onClick(View view)
            {
                if (!a)
                {
                    return;
                } else
                {
                    view = new Intent();
                    view.setAction("android.intent.action.VIEW");
                    view.setDataAndType(AttachmentView.c(b), "image/*");
                    AttachmentView.d(b).startActivity(view);
                    return;
                }
            }

            
            {
                b = AttachmentView.this;
                a = flag;
                super();
            }
        });
    }

    static void a(AttachmentView attachmentview, Bitmap bitmap)
    {
        attachmentview.a(bitmap, false);
    }

    private void a(boolean flag)
    {
        c.setMaxWidth(d);
        c.setMinWidth(d);
        l.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        l.setAdjustViewBounds(false);
        l.setBackgroundColor(Color.parseColor("#eeeeee"));
        l.setMinimumHeight((int)((float)d * 1.2F));
        l.setMinimumWidth(d);
        l.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        l.setImageDrawable(a("ic_menu_attachment"));
        l.setOnClickListener(new android.view.View.OnClickListener(flag) {

            private boolean a;
            private AttachmentView b;

            public final void onClick(View view)
            {
                if (!a)
                {
                    return;
                } else
                {
                    view = new Intent();
                    view.setAction("android.intent.action.VIEW");
                    view.setDataAndType(AttachmentView.c(b), "*/*");
                    AttachmentView.d(b).startActivity(view);
                    return;
                }
            }

            
            {
                b = AttachmentView.this;
                a = flag;
                super();
            }
        });
    }

    static void b(AttachmentView attachmentview)
    {
        attachmentview.a(false);
    }

    static Uri c(AttachmentView attachmentview)
    {
        return attachmentview.b;
    }

    static Context d(AttachmentView attachmentview)
    {
        return attachmentview.j;
    }

    public void setImage(Bitmap bitmap, int i1)
    {
        c.setText(k);
        i = i1;
        if (bitmap == null)
        {
            a(true);
            return;
        } else
        {
            a(bitmap, true);
            return;
        }
    }
}
