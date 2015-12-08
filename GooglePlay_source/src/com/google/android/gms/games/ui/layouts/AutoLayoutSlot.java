// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.layouts;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.graphics.ColorUtils;
import android.support.v7.widget.CardView;
import android.text.Html;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.images.ImageRequest;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.games.appcontent.AppContentAnnotation;
import com.google.android.gms.games.ui.appcontent.AppContentUtils;
import com.google.android.gms.games.ui.appcontent.utils.AnnotationUtils;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.ui.layouts:
//            LayoutSlot

public class AutoLayoutSlot extends LayoutSlot
{
    private static final class TextInitState
    {

        public final Drawable mBackground;
        public final ColorStateList mColors;

        public TextInitState(ColorStateList colorstatelist, Drawable drawable)
        {
            mColors = colorstatelist;
            mBackground = drawable;
        }
    }


    protected final int mAnimationType;
    private final ArrayList mClickableViews;
    protected final Context mContext;
    protected final ImageView mImage;
    protected final ViewGroup mImageContainer;
    protected int mImageDefaultResId;
    private int mImageHideVis;
    private int mImageResizeMode;
    protected Uri mImageUri;
    protected final String mLayoutSlotName;
    protected final View mOverlay;
    private int mOverlayHideVis;
    protected final ProgressBar mProgressBar;
    private int mProgressBarHideVis;
    private ClipDrawable mProgressClipDrawable;
    private ShapeDrawable mProgressShapeDrawable;
    protected final View mRoot;
    private int mRootHideVis;
    protected final List mSharedViews;
    protected final TextView mSubtitle;
    private int mSubtitleHideVis;
    protected final TextInitState mSubtitleInitState;
    protected final TextView mTitle;
    public int mTitleHideVis;
    protected final TextInitState mTitleInitState;

    public AutoLayoutSlot(Context context, String s, View view, ViewGroup viewgroup, ImageView imageview, TextView textview, TextView textview1, 
            ProgressBar progressbar, View view1, int i, List list, int j)
    {
        mContext = context;
        mLayoutSlotName = s;
        mRoot = view;
        mImageContainer = viewgroup;
        mImage = imageview;
        mTitle = textview;
        mTitleInitState = getTextInitState(mTitle);
        mSubtitle = textview1;
        mSubtitleInitState = getTextInitState(mSubtitle);
        mProgressBar = progressbar;
        mOverlay = view1;
        mAnimationType = i;
        mSharedViews = list;
        mImageResizeMode = j;
        mClickableViews = new ArrayList();
        if (mOverlay != null)
        {
            mClickableViews.add(mOverlay);
        } else
        if (mLayoutSlotName.equals("SCORE_BAR"))
        {
            if (mImageContainer != null)
            {
                mClickableViews.add(mImageContainer);
            }
        } else
        {
            if (mRoot != null)
            {
                mClickableViews.add(mRoot);
            }
            if (mImageContainer != null)
            {
                mClickableViews.add(mImageContainer);
            } else
            if (mImage != null)
            {
                mClickableViews.add(mImage);
            }
            if (mTitle != null)
            {
                mClickableViews.add(mTitle);
            }
            if (mSubtitle != null)
            {
                mClickableViews.add(mSubtitle);
            }
            if (mProgressBar != null)
            {
                mClickableViews.add(mProgressBar);
            }
        }
        mRootHideVis = getHideVisibility(mRoot);
        if (mImageContainer != null)
        {
            mImageHideVis = getHideVisibility(mImageContainer);
        } else
        {
            mImageHideVis = getHideVisibility(mImage);
        }
        mTitleHideVis = getHideVisibility(mTitle);
        mSubtitleHideVis = getHideVisibility(mSubtitle);
        mProgressBarHideVis = getHideVisibility(mProgressBar);
        mOverlayHideVis = getHideVisibility(mOverlay);
    }

    public AutoLayoutSlot(ViewGroup viewgroup)
    {
        this(null, "WHOLE_CARD", ((View) (viewgroup)), null, null, null, null, null, null, 0, null, 0);
        mRootHideVis = 0;
    }

    private static boolean annotationContainsImage(AppContentAnnotation appcontentannotation)
    {
        return appcontentannotation.getImageUri() != null || !TextUtils.isEmpty(appcontentannotation.getImageDefaultId());
    }

    protected static int getHideVisibility(View view)
    {
        return view == null || view.getVisibility() != 8 ? 4 : 8;
    }

    private static TextInitState getTextInitState(TextView textview)
    {
        if (textview == null)
        {
            return null;
        } else
        {
            return new TextInitState(textview.getTextColors(), textview.getBackground());
        }
    }

    private static void resetTextView(TextView textview, TextInitState textinitstate)
    {
        textview.setTextColor(textinitstate.mColors);
        if (PlatformVersion.checkVersion(16))
        {
            textview.setBackground(textinitstate.mBackground);
            return;
        } else
        {
            textview.setBackgroundDrawable(textinitstate.mBackground);
            return;
        }
    }

    private static void setTextColorForContrast(int i, TextView textview)
    {
        if (Color.alpha(i) != 255)
        {
            throw new IllegalArgumentException("background can not be translucent");
        }
        double d;
        double d1;
        int j;
        if (Color.alpha(0xff000000) < 255)
        {
            j = ColorUtils.compositeColors(0xff000000, i);
        } else
        {
            j = 0xff000000;
        }
        d = ColorUtils.calculateLuminance(j) + 0.050000000000000003D;
        d1 = ColorUtils.calculateLuminance(i) + 0.050000000000000003D;
        if (Math.max(d, d1) / Math.min(d, d1) < 4.5D)
        {
            textview.setTextColor(-1);
            return;
        } else
        {
            textview.setTextColor(0xff000000);
            return;
        }
    }

    private void setTextView(TextView textview, String s, AppContentAnnotation appcontentannotation)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        textview.setText(Html.fromHtml(s1));
        s = appcontentannotation.getModifiers();
        if (s != null)
        {
            if (!TextUtils.isEmpty(s.getString("textColor")))
            {
                textview.setTextColor(AnnotationUtils.getColor(appcontentannotation, mContext.getResources().getColor(0x7f0b0064), "textColor"));
            }
            int i = AppContentUtils.translateAssetId(s.getString("backgroundResourceId"));
            if (i > 0)
            {
                textview.setBackgroundResource(i);
            }
        }
    }

    public final void addSharedViews(SharedElementTransition sharedelementtransition)
    {
        for (Iterator iterator = mSharedViews.iterator(); iterator.hasNext();)
        {
            Pair pair = (Pair)iterator.next();
            if (pair.first == mImage && (mImage instanceof LoadingImageView))
            {
                sharedelementtransition.addSharedLoadingImageView((LoadingImageView)mImage, (String)pair.second, mImageUri, mImageDefaultResId);
            } else
            if (pair.first instanceof TextView)
            {
                sharedelementtransition.addSharedTextView((TextView)pair.first, (String)pair.second);
            } else
            if (pair.first == mImageContainer && (mImageContainer instanceof MetagameAvatarView))
            {
                sharedelementtransition.addSharedLoadingImageView((LoadingImageView)mImage, (String)pair.second, mImageUri, mImageDefaultResId);
            } else
            {
                sharedelementtransition.addSharedView((View)pair.first, (String)pair.second);
            }
        }

    }

    public final int getAnimationType()
    {
        return mAnimationType;
    }

    public final List getClickableViews()
    {
        return mClickableViews;
    }

    public final String getLayoutSlotName()
    {
        return mLayoutSlotName;
    }

    public final void resetAnnotation()
    {
        super.resetAnnotation();
        if (mRoot != null)
        {
            mRoot.setVisibility(mRootHideVis);
            if (mRoot instanceof CardView)
            {
                ((CardView)mRoot).setCardBackgroundColor(-1);
            } else
            {
                mRoot.setBackgroundColor(0);
            }
            mRoot.setTag(0x7f0d0047, null);
        }
        if (mImageContainer == null) goto _L2; else goto _L1
_L1:
        mImageContainer.setVisibility(mImageHideVis);
_L4:
        if (mTitle != null)
        {
            resetTextView(mTitle, mTitleInitState);
            mTitle.setVisibility(mTitleHideVis);
        }
        if (mSubtitle != null)
        {
            resetTextView(mSubtitle, mSubtitleInitState);
            mSubtitle.setVisibility(mSubtitleHideVis);
        }
        if (mProgressBar != null)
        {
            mProgressBar.setVisibility(mProgressBarHideVis);
        }
        if (mOverlay != null)
        {
            mOverlay.setVisibility(mOverlayHideVis);
        }
        return;
_L2:
        if (mImage != null)
        {
            mImage.setVisibility(mImageHideVis);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void setAnnotation(AppContentAnnotation appcontentannotation)
    {
label0:
        {
            super.setAnnotation(appcontentannotation);
            Object obj;
            if (mImage != null && annotationContainsImage(appcontentannotation))
            {
                Object obj3 = mContext;
                Object obj1 = mImage;
                obj2 = appcontentannotation.getImageUri();
                i = AppContentUtils.translateAssetId(appcontentannotation.getImageDefaultId());
                if (obj1 instanceof LoadingImageView)
                {
                    ((LoadingImageView)obj1).loadUri$3329f911(((Uri) (obj2)), i, true);
                } else
                {
                    AnnotationUtils.ensureImageManager(((Context) (obj3)));
                    obj3 = AnnotationUtils.mImageManager;
                    obj1 = new com.google.android.gms.common.images.ImageRequest.ImageViewImageRequest(((ImageView) (obj1)), ((Uri) (obj2)));
                    ((ImageRequest) (obj1)).setNoDataPlaceholder(i);
                    ((ImageManager) (obj3)).loadImage(((ImageRequest) (obj1)));
                }
                mImageUri = appcontentannotation.getImageUri();
                mImageDefaultResId = AppContentUtils.translateAssetId(appcontentannotation.getImageDefaultId());
                if (mImage instanceof LoadingImageView)
                {
                    i = appcontentannotation.getImageHeight();
                    float f;
                    if (i > 0)
                    {
                        f = (float)appcontentannotation.getImageWidth() / (float)i;
                    } else
                    {
                        f = -1F;
                    }
                    if (f > 0.0F)
                    {
                        if (mImageResizeMode == 1)
                        {
                            ((LoadingImageView)mImage).setImageAspectRatioAdjust(1, f);
                        } else
                        {
                            ((LoadingImageView)mImage).setImageAspectRatioAdjust(2, f);
                        }
                    }
                }
                if (mImageContainer != null)
                {
                    mImageContainer.setVisibility(0);
                }
                mImage.setVisibility(0);
            }
            if (mTitle == null)
            {
                break label0;
            }
            obj = appcontentannotation.getModifiers();
            if (obj != null)
            {
                obj = ((Bundle) (obj)).getString("hideTitle");
                if (obj != null && Boolean.parseBoolean(((String) (obj))))
                {
                    break label0;
                }
            }
            setTextView(mTitle, appcontentannotation.getTitle(), appcontentannotation);
            if (mImage == null && annotationContainsImage(appcontentannotation))
            {
                AnnotationUtils.putImageInTextView(mContext, mTitle, 0, appcontentannotation);
            }
            mTitle.setVisibility(0);
        }
        if (mSubtitle != null && !Strings.isEmptyOrWhitespace(appcontentannotation.getDescription()))
        {
            setTextView(mSubtitle, appcontentannotation.getDescription(), appcontentannotation);
            mSubtitle.setVisibility(0);
        }
        if (mRoot != null)
        {
            obj = appcontentannotation.getModifiers();
            if (obj != null && ((Bundle) (obj)).containsKey("backgroundColor"))
            {
                int i = AnnotationUtils.getColor(appcontentannotation, 0, "backgroundColor");
                mRoot.setTag(0x7f0d0047, Boolean.valueOf(true));
                if (mRoot instanceof CardView)
                {
                    ((CardView)mRoot).setCardBackgroundColor(i);
                } else
                if (mLayoutSlotName.equals("BANNER_OVERLAY_ICON") && (mRoot instanceof ImageView))
                {
                    obj2 = (ImageView)mRoot;
                    if (appcontentannotation.getImageDefaultId().equals("PLAY_NOW_WHITE"))
                    {
                        int k = AnnotationUtils.getColor(appcontentannotation, -1, "foregroundColor");
                        int i1 = AnnotationUtils.getColor(appcontentannotation, 0, "backgroundColor");
                        ((ImageView) (obj2)).getDrawable().setColorFilter(k, android.graphics.PorterDuff.Mode.SRC_ATOP);
                        Drawable drawable = UiUtils.constructColorButtonBackground$548e7414(i1, ((ImageView) (obj2)).getResources().getColor(0x7f0b00cb));
                        if (PlatformVersion.checkVersion(16))
                        {
                            ((ImageView) (obj2)).setBackground(drawable);
                        } else
                        {
                            ((ImageView) (obj2)).setBackgroundDrawable(drawable);
                        }
                    }
                } else
                {
                    mRoot.setBackgroundColor(i);
                }
                if (TextUtils.isEmpty(((Bundle) (obj)).getString("textColor")))
                {
                    if (mTitle != null)
                    {
                        setTextColorForContrast(i, mTitle);
                    }
                    if (mSubtitle != null)
                    {
                        setTextColorForContrast(i, mSubtitle);
                    }
                }
            }
        }
        if (mProgressBar != null)
        {
            Object obj2 = appcontentannotation.getModifiers();
            if (obj2 != null)
            {
                if (mProgressBar.isIndeterminate())
                {
                    obj = ((Bundle) (obj2)).getString("showSpinner");
                    if (obj != null && Boolean.parseBoolean(((String) (obj))))
                    {
                        mProgressBar.setVisibility(0);
                    }
                } else
                {
                    String s = ((Bundle) (obj2)).getString("currentSteps");
                    obj2 = ((Bundle) (obj2)).getString("totalSteps");
                    if (!TextUtils.isEmpty(s) && TextUtils.isDigitsOnly(s) && !TextUtils.isEmpty(((CharSequence) (obj2))) && TextUtils.isDigitsOnly(((CharSequence) (obj2))))
                    {
                        int j = Integer.parseInt(s);
                        int l = Integer.parseInt(((String) (obj2)));
                        if (l > 0 && j >= 0)
                        {
                            if (mProgressShapeDrawable == null || mProgressClipDrawable == null)
                            {
                                mProgressShapeDrawable = new ShapeDrawable(new RoundRectShape(new float[] {
                                    0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F
                                }, null, null));
                                mProgressClipDrawable = new ClipDrawable(mProgressShapeDrawable, 3, 1);
                                mProgressBar.setProgressDrawable(mProgressClipDrawable);
                            }
                            Resources resources = mContext.getResources();
                            int j1 = AnnotationUtils.getColor(appcontentannotation, resources.getColor(0x7f0b00b7), "backgroundColor");
                            mProgressBar.setBackgroundColor(j1);
                            j1 = AnnotationUtils.getColor(appcontentannotation, resources.getColor(0x7f0b0257), "themeColor");
                            mProgressShapeDrawable.getPaint().setColor(j1);
                            mProgressBar.setMax(l);
                            mProgressBar.setProgress(j);
                            mProgressBar.setVisibility(0);
                        }
                    }
                }
            }
        }
        if (mRoot != null && appcontentannotation.getModifiers().containsKey("scorePercentage"))
        {
            appcontentannotation = appcontentannotation.getModifiers();
            float f1;
            android.widget.LinearLayout.LayoutParams layoutparams;
            try
            {
                f1 = Float.parseFloat(appcontentannotation.getString("scorePercentage"));
            }
            // Misplaced declaration of an exception variable
            catch (AppContentAnnotation appcontentannotation)
            {
                f1 = 0.0F;
            }
            f1 = AppContentUtils.fixScoreBarPercentage(f1);
            appcontentannotation = mRoot.findViewById(0x7f0d0270);
            layoutparams = (android.widget.LinearLayout.LayoutParams)appcontentannotation.getLayoutParams();
            layoutparams.weight = f1;
            appcontentannotation.setLayoutParams(layoutparams);
            appcontentannotation = mRoot.findViewById(0x7f0d0274);
            layoutparams = (android.widget.LinearLayout.LayoutParams)appcontentannotation.getLayoutParams();
            layoutparams.weight = 100F - f1;
            appcontentannotation.setLayoutParams(layoutparams);
            mRoot.setVisibility(0);
        }
        if (mRoot != null)
        {
            mRoot.setVisibility(0);
        }
        if (mOverlay != null)
        {
            mOverlay.setVisibility(0);
        }
    }
}
