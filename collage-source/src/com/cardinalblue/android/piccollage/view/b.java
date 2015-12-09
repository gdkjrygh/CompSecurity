// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import bolts.i;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.g;
import com.bumptech.glide.j;
import com.cardinalblue.android.b.a;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.model.gson.BaseNativeAdWebPhoto;
import com.cardinalblue.android.piccollage.model.gson.WebPhoto;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeAppInstallAdView;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.NativeContentAdView;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.view:
//            a

public class b extends com.cardinalblue.android.piccollage.view.a
{

    public b(Context context, View view)
    {
        super(context, view);
        ((LayerDrawable)((RatingBar)view.findViewById(0x7f10017b)).getProgressDrawable()).getDrawable(2).setColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP);
    }

    private com.google.android.gms.ads.formats.NativeAd.Image a(List list)
    {
        if (list != null && !list.isEmpty()) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((com.google.android.gms.ads.formats.NativeAd.Image) (obj));
_L2:
        com.google.android.gms.ads.formats.NativeAd.Image image = (com.google.android.gms.ads.formats.NativeAd.Image)list.get(0);
        int i = 1;
        do
        {
            obj = image;
            if (i >= list.size())
            {
                continue;
            }
            Drawable drawable = image.getDrawable();
            obj = ((com.google.android.gms.ads.formats.NativeAd.Image)list.get(i)).getDrawable();
            int l = drawable.getMinimumWidth();
            int i1 = drawable.getMinimumHeight();
            int j1 = ((Drawable) (obj)).getMinimumWidth();
            if (((Drawable) (obj)).getMinimumHeight() * j1 > i1 * l)
            {
                image = (com.google.android.gms.ads.formats.NativeAd.Image)list.get(i);
            }
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void a(b b1, NativeAppInstallAd nativeappinstallad, NativeAppInstallAdView nativeappinstalladview)
    {
        b1.a(nativeappinstallad, nativeappinstalladview);
    }

    static void a(b b1, NativeContentAd nativecontentad, NativeContentAdView nativecontentadview)
    {
        b1.a(nativecontentad, nativecontentadview);
    }

    private void a(com.google.android.gms.ads.formats.NativeAd.Image image, ImageView imageview, ImageView imageview1)
    {
        Drawable drawable = image.getDrawable();
        if (drawable instanceof BitmapDrawable)
        {
            Bitmap bitmap = ((BitmapDrawable)drawable).getBitmap();
            if (bitmap != null)
            {
                Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                com.cardinalblue.android.b.a.a(k.a(), bitmap, bitmap1, 10);
                imageview1.setImageBitmap(bitmap1);
            }
        }
        g.b(a).a(image.getUri()).a(drawable).a(imageview);
    }

    private void a(NativeAppInstallAd nativeappinstallad, NativeAppInstallAdView nativeappinstalladview)
    {
        boolean flag = false;
        nativeappinstalladview.setHeadlineView(nativeappinstalladview.findViewById(0x7f10017a));
        nativeappinstalladview.setImageView(nativeappinstalladview.findViewById(0x7f100178));
        nativeappinstalladview.setCallToActionView(nativeappinstalladview.findViewById(0x7f10017d));
        nativeappinstalladview.setStarRatingView(nativeappinstalladview.findViewById(0x7f10017b));
        nativeappinstalladview.setStoreView(nativeappinstalladview.findViewById(0x7f10017c));
        ((TextView)nativeappinstalladview.getHeadlineView()).setText(nativeappinstallad.getHeadline());
        Object obj;
        int i;
        if (nativeappinstallad.getStore().toString().toLowerCase().contains("google"))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        obj = nativeappinstalladview.getStoreView();
        if (i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
        ((TextView)nativeappinstalladview.getCallToActionView()).setText(nativeappinstallad.getCallToAction());
        ((RatingBar)nativeappinstalladview.getStarRatingView()).setRating(nativeappinstallad.getStarRating().floatValue());
        obj = nativeappinstallad.getImages();
        if (!((List) (obj)).isEmpty())
        {
            try
            {
                a((com.google.android.gms.ads.formats.NativeAd.Image)((List) (obj)).get(0), (ImageView)nativeappinstalladview.getImageView(), (ImageView)nativeappinstalladview.findViewById(0x7f100177));
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                f.a(outofmemoryerror);
            }
        }
        nativeappinstalladview.setNativeAd(nativeappinstallad);
    }

    private void a(NativeContentAd nativecontentad, NativeContentAdView nativecontentadview)
    {
        nativecontentadview.setHeadlineView(nativecontentadview.findViewById(0x7f100174));
        nativecontentadview.setImageView(nativecontentadview.findViewById(0x7f100171));
        nativecontentadview.setBodyView(nativecontentadview.findViewById(0x7f100173));
        nativecontentadview.setAdvertiserView(nativecontentadview.findViewById(0x7f100175));
        ((TextView)nativecontentadview.getHeadlineView()).setText(nativecontentad.getHeadline());
        ((TextView)nativecontentadview.getBodyView()).setText(nativecontentad.getBody());
        ((TextView)nativecontentadview.getAdvertiserView()).setText(nativecontentad.getAdvertiser());
        com.google.android.gms.ads.formats.NativeAd.Image image = a(nativecontentad.getImages());
        if (image != null)
        {
            try
            {
                a(image, (ImageView)nativecontentadview.getImageView(), (ImageView)nativecontentadview.findViewById(0x7f100170));
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                f.a(outofmemoryerror);
            }
        }
        nativecontentadview.setNativeAd(nativecontentad);
    }

    public void a(int i, WebPhoto webphoto)
    {
        if (webphoto instanceof BaseNativeAdWebPhoto)
        {
            ((BaseNativeAdWebPhoto)webphoto).getLoadingResult().c(new i() {

                final b a;

                public Object then(bolts.j j1)
                    throws Exception
                {
                    if (j1.e() instanceof NativeContentAd)
                    {
                        j1 = (NativeContentAd)j1.e();
                        NativeContentAdView nativecontentadview = (NativeContentAdView)a.itemView.findViewById(0x7f10016f);
                        nativecontentadview.setVisibility(0);
                        a.itemView.findViewById(0x7f100176).setVisibility(8);
                        com.cardinalblue.android.piccollage.view.b.a(a, j1, nativecontentadview);
                    } else
                    if (j1.e() instanceof NativeAppInstallAd)
                    {
                        j1 = (NativeAppInstallAd)j1.e();
                        NativeAppInstallAdView nativeappinstalladview = (NativeAppInstallAdView)a.itemView.findViewById(0x7f100176);
                        nativeappinstalladview.setVisibility(0);
                        a.itemView.findViewById(0x7f10016f).setVisibility(8);
                        com.cardinalblue.android.piccollage.view.b.a(a, j1, nativeappinstalladview);
                        return null;
                    }
                    return null;
                }

            
            {
                a = b.this;
                super();
            }
            }, bolts.j.b);
        }
    }
}
