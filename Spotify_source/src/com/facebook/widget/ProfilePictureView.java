// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import apn;
import aqb;
import aqg;
import aqh;
import aqi;
import aqj;
import arb;
import ars;
import com.facebook.LoggingBehavior;
import java.net.URI;
import java.net.URISyntaxException;

public class ProfilePictureView extends FrameLayout
{

    private String a;
    private int b;
    private int c;
    private boolean d;
    private Bitmap e;
    private ImageView f;
    private int g;
    private aqg h;

    public ProfilePictureView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = 0;
        c = 0;
        d = true;
        g = -1;
        a(context);
        a(attributeset);
    }

    public ProfilePictureView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = 0;
        c = 0;
        d = true;
        g = -1;
        a(context);
        a(attributeset);
    }

    private void a(Context context)
    {
        removeAllViews();
        f = new ImageView(context);
        context = new android.widget.FrameLayout.LayoutParams(-1, -1);
        f.setLayoutParams(context);
        f.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        addView(f);
    }

    private void a(Bitmap bitmap)
    {
        if (f != null && bitmap != null)
        {
            e = bitmap;
            f.setImageBitmap(bitmap);
        }
    }

    private void a(AttributeSet attributeset)
    {
        attributeset = getContext().obtainStyledAttributes(attributeset, apn.c);
        int i = attributeset.getInt(0, -1);
        switch (i)
        {
        default:
            throw new IllegalArgumentException("Must use a predefined preset size");

        case -4: 
        case -3: 
        case -2: 
        case -1: 
            g = i;
            break;
        }
        requestLayout();
        d = attributeset.getBoolean(1, true);
        attributeset.recycle();
    }

    static void a(ProfilePictureView profilepictureview, aqj aqj1)
    {
        if (aqj1.a == profilepictureview.h)
        {
            profilepictureview.h = null;
            Bitmap bitmap = aqj1.d;
            Exception exception = aqj1.b;
            if (exception != null)
            {
                profilepictureview = LoggingBehavior.a;
                exception.toString();
                arb.c();
            } else
            if (bitmap != null)
            {
                profilepictureview.a(bitmap);
                if (aqj1.c)
                {
                    profilepictureview.b(false);
                    return;
                }
            }
        }
    }

    private void a(boolean flag)
    {
        int i;
        int j;
        int k;
        boolean flag1;
        boolean flag2;
        flag1 = false;
        flag2 = false;
        i = getHeight();
        k = getWidth();
        j = ((flag2) ? 1 : 0);
        if (k <= 0) goto _L2; else goto _L1
_L1:
        if (i > 0) goto _L4; else goto _L3
_L3:
        j = ((flag2) ? 1 : 0);
_L2:
        if (a != null && a.length() != 0 && (c != 0 || b != 0)) goto _L6; else goto _L5
_L5:
        if (d)
        {
            i = 0x7f020139;
        } else
        {
            i = 0x7f020138;
        }
        a(BitmapFactory.decodeResource(getResources(), i));
_L8:
        return;
_L4:
label0:
        {
            j = c(false);
            if (j != 0)
            {
                i = j;
            } else
            {
                j = k;
            }
            if (j <= i)
            {
                if (d)
                {
                    i = j;
                    k = j;
                } else
                {
                    i = 0;
                    k = j;
                }
            } else
            {
                if (d)
                {
                    j = i;
                } else
                {
                    j = 0;
                }
                k = j;
            }
            if (k == c)
            {
                j = ((flag1) ? 1 : 0);
                if (i == b)
                {
                    break label0;
                }
            }
            j = 1;
        }
        c = k;
        b = i;
        continue; /* Loop/switch isn't completed */
_L6:
        if (j == 0 && !flag) goto _L8; else goto _L7
_L7:
        b(true);
        return;
        if (true) goto _L2; else goto _L9
_L9:
    }

    private void b(boolean flag)
    {
        Object obj;
        Object obj1;
        int i;
        int j;
        obj = getContext();
        obj1 = a;
        j = c;
        i = b;
        ars.a(((String) (obj1)), "userId");
        j = Math.max(j, 0);
        i = Math.max(i, 0);
        if (j == 0 && i == 0)
        {
            try
            {
                throw new IllegalArgumentException("Either width or height must be greater than 0");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj1 = LoggingBehavior.a;
            }
            ((URISyntaxException) (obj)).toString();
            arb.c();
            return;
        }
        obj1 = (new android.net.Uri.Builder()).encodedPath(String.format("https://graph.facebook.com/%s/picture", new Object[] {
            obj1
        }));
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        ((android.net.Uri.Builder) (obj1)).appendQueryParameter("height", String.valueOf(i));
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        ((android.net.Uri.Builder) (obj1)).appendQueryParameter("width", String.valueOf(j));
        ((android.net.Uri.Builder) (obj1)).appendQueryParameter("migration_overrides", "{october_2012:true}");
        obj = new aqh(((Context) (obj)), new URI(((android.net.Uri.Builder) (obj1)).toString()));
        obj.d = flag;
        obj.e = this;
        obj.c = new aqi() {

            private ProfilePictureView a;

            public final void a(aqj aqj1)
            {
                ProfilePictureView.a(a, aqj1);
            }

            
            {
                a = ProfilePictureView.this;
                super();
            }
        };
        obj = new aqg(((aqh) (obj)), (byte)0);
        if (h != null)
        {
            aqb.b(h);
        }
        h = ((aqg) (obj));
        aqb.a(((aqg) (obj)));
        return;
    }

    private int c(boolean flag)
    {
        int i;
        int j;
        j = 0x7f0c00ba;
        i = j;
        g;
        JVM INSTR tableswitch -4 -1: default 40
    //                   -4 55
    //                   -3 46
    //                   -2 42
    //                   -1 62;
           goto _L1 _L2 _L3 _L4 _L5
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        return 0;
_L4:
        i = 0x7f0c00bb;
_L7:
        return getResources().getDimensionPixelSize(i);
_L2:
        i = 0x7f0c00b9;
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        i = j;
        if (!flag)
        {
            return 0;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        h = null;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        a(false);
    }

    protected void onMeasure(int i, int j)
    {
        boolean flag1 = true;
        android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
        boolean flag2 = false;
        int j1 = android.view.View.MeasureSpec.getSize(j);
        int i1 = android.view.View.MeasureSpec.getSize(i);
        int l = j1;
        boolean flag = flag2;
        int k = j;
        if (android.view.View.MeasureSpec.getMode(j) != 0x40000000)
        {
            l = j1;
            flag = flag2;
            k = j;
            if (layoutparams.height == -2)
            {
                l = c(true);
                k = android.view.View.MeasureSpec.makeMeasureSpec(l, 0x40000000);
                flag = true;
            }
        }
        if (android.view.View.MeasureSpec.getMode(i) != 0x40000000 && layoutparams.width == -2)
        {
            j = c(true);
            i = android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
            flag = flag1;
        } else
        {
            j = i1;
        }
        if (flag)
        {
            setMeasuredDimension(j, l);
            measureChildren(i, k);
            return;
        } else
        {
            super.onMeasure(i, k);
            return;
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable.getClass() != android/os/Bundle)
        {
            super.onRestoreInstanceState(parcelable);
        } else
        {
            parcelable = (Bundle)parcelable;
            super.onRestoreInstanceState(parcelable.getParcelable("ProfilePictureView_superState"));
            a = parcelable.getString("ProfilePictureView_profileId");
            g = parcelable.getInt("ProfilePictureView_presetSize");
            d = parcelable.getBoolean("ProfilePictureView_isCropped");
            c = parcelable.getInt("ProfilePictureView_width");
            b = parcelable.getInt("ProfilePictureView_height");
            a((Bitmap)parcelable.getParcelable("ProfilePictureView_bitmap"));
            if (parcelable.getBoolean("ProfilePictureView_refresh"))
            {
                a(true);
                return;
            }
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        Parcelable parcelable = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ProfilePictureView_superState", parcelable);
        bundle.putString("ProfilePictureView_profileId", a);
        bundle.putInt("ProfilePictureView_presetSize", g);
        bundle.putBoolean("ProfilePictureView_isCropped", d);
        bundle.putParcelable("ProfilePictureView_bitmap", e);
        bundle.putInt("ProfilePictureView_width", c);
        bundle.putInt("ProfilePictureView_height", b);
        boolean flag;
        if (h != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.putBoolean("ProfilePictureView_refresh", flag);
        return bundle;
    }

    static 
    {
        com/facebook/widget/ProfilePictureView.getSimpleName();
    }
}
