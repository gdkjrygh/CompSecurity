// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.FriendProfile;
import com.netflix.mediaclient.servicemgr.Trackable;
import com.netflix.mediaclient.servicemgr.Video;
import com.netflix.mediaclient.servicemgr.VideoDetails;
import com.netflix.mediaclient.servicemgr.VideoType;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.android.widget:
//            VideoView, VideoDetailsClickListener

public class SocialVideoView extends VideoView
{
    private class ImageLoadedListener
        implements com.netflix.mediaclient.util.gfx.ImageLoader.ImageLoaderListener
    {

        private final int index;
        final SocialVideoView this$0;

        public void onErrorResponse(String s)
        {
            Log.w("SocialVideoView", (new StringBuilder()).append("Could not load img: ").append(s).append(", index: ").append(index).toString());
        }

        public void onResponse(Bitmap bitmap, String s)
        {
            if (bitmap == null)
            {
                return;
            } else
            {
                Log.v("SocialVideoView", (new StringBuilder()).append("Loaded bitmap: ").append(s).append(", index: ").append(index).append(", size: ").append(bitmap.getWidth()).append("x").append(bitmap.getHeight()).toString());
                bitmaps[index] = bitmap;
                invalidate();
                return;
            }
        }

        public ImageLoadedListener(int i)
        {
            this$0 = SocialVideoView.this;
            super();
            index = i;
        }
    }


    public static final int MAX_SOCIAL_BITMAP_IMGS = 9;
    private static final String TAG = "SocialVideoView";
    private static TextPaint microSecondaryCenterPaint;
    private static TextPaint microSecondaryLeftPaint;
    private static TextPaint smallPrimaryLeftPaint;
    private final Bitmap bitmaps[];
    private String cachedName;
    private StaticLayout connectText;
    private final Rect drawRect;
    private int friendCount;
    private boolean isSocialView;
    private int padding;
    private int singleImgSize;
    private VideoDetails socialData;
    private StaticLayout socialGroupText;
    private int textSizeMicro;

    public SocialVideoView(Context context)
    {
        super(context);
        bitmaps = new Bitmap[9];
        drawRect = new Rect();
        init();
    }

    public SocialVideoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        bitmaps = new Bitmap[9];
        drawRect = new Rect();
        init();
    }

    public SocialVideoView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        bitmaps = new Bitmap[9];
        drawRect = new Rect();
        init();
    }

    private int centerXOffset(int i)
    {
        return (getWidth() - i) / 2;
    }

    private int centerYOffset(int i)
    {
        return (getHeight() - i) / 2;
    }

    private void clearBitmaps()
    {
        for (int i = 0; i < bitmaps.length; i++)
        {
            bitmaps[i] = null;
        }

    }

    private void drawConnectToFacebook(Canvas canvas)
    {
        setImageResource(0x7f0200b3);
        super.onDraw(canvas);
        Log.v("SocialVideoView", (new StringBuilder()).append("drawConnectToFacebook: ").append(getWidth()).append("x").append(getHeight()).toString());
        canvas.save();
        canvas.translate(padding, (getHeight() * 2) / 3 - connectText.getHeight() / 2);
        connectText.draw(canvas);
        canvas.restore();
    }

    private void drawMultipleFriends(Canvas canvas, VideoDetails videodetails)
    {
        int k = padding / 2;
        int i = 1;
        int j;
        int l;
        int i1;
        int j1;
        int k1;
        boolean flag;
        if (friendCount == 1)
        {
            j = singleImgSize;
        } else
        {
            if (friendCount <= 4)
            {
                i = 2;
            } else
            {
                i = 3;
            }
            j = (int)((float)getWidth() * 0.8F);
        }
        j1 = (int)((float)(j / i - k) + 0.5F);
        l = (j1 + k) * (((friendCount + i) - 1) / i);
        i1 = socialGroupText.getHeight() + l + padding;
        if (padding * 2 + i1 < getHeight())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k1 = centerXOffset(j);
        if (flag)
        {
            k = i1;
        } else
        {
            k = l;
        }
        k = centerYOffset(k);
        if (Log.isLoggable("SocialVideoView", 2))
        {
            Log.v("SocialVideoView", String.format("view height: %d, view width: %d, friend count: %d, totalImgWidth: %d, boxSize: %d, totalImageHeight: %d, totalHeight: %d, showText: %s, dx: %d, dy: %d", new Object[] {
                Integer.valueOf(getHeight()), Integer.valueOf(getWidth()), Integer.valueOf(friendCount), Integer.valueOf(j), Integer.valueOf(j1), Integer.valueOf(l), Integer.valueOf(i1), Boolean.valueOf(flag), Integer.valueOf(k1), Integer.valueOf(k)
            }));
        }
        j = k;
        if (flag)
        {
            drawSocialGroupText(canvas, k);
            j = k + (socialGroupText.getHeight() + padding);
        }
        if (Log.isLoggable("SocialVideoView", 2))
        {
            Log.v("SocialVideoView", (new StringBuilder()).append("dy: ").append(j).toString());
        }
        drawSocialBitmaps(canvas, i, j1, k1, j);
    }

    private void drawSingleFriend(Canvas canvas, VideoDetails videodetails)
    {
        videodetails = bitmaps[0];
        if (videodetails == null || videodetails.isRecycled())
        {
            return;
        }
        int i = centerXOffset(singleImgSize);
        int j = singleImgSize + textSizeMicro + padding;
        int k = centerYOffset(j);
        drawRect.set(i, k, singleImgSize + i, singleImgSize + k);
        safelyDrawBitmap(canvas, videodetails, drawRect);
        videodetails = microSecondaryCenterPaint;
        if (cachedName == null)
        {
            cachedName = getTruncatedName(videodetails);
        }
        canvas.drawText(cachedName, getWidth() / 2, k + j, videodetails);
    }

    private void drawSocialBitmaps(Canvas canvas, int i, int j, int k, int l)
    {
        int i1 = padding / 2;
        drawRect.set(k, l, k + j, l + j);
        l = 0;
        do
        {
label0:
            {
                if (l < 9)
                {
                    safelyDrawBitmap(canvas, bitmaps[l], drawRect);
                    if (l != friendCount - 1)
                    {
                        break label0;
                    }
                }
                return;
            }
            if ((l + 1) % i == 0)
            {
                drawRect.offset(k - drawRect.left, j + i1);
            } else
            {
                drawRect.offset(j + i1, 0);
            }
            l++;
        } while (true);
    }

    private void drawSocialGroupText(Canvas canvas, int i)
    {
        Log.v("SocialVideoView", (new StringBuilder()).append("text dy: ").append(i).toString());
        canvas.save();
        canvas.translate(padding, i);
        socialGroupText.draw(canvas);
        canvas.restore();
    }

    private void drawSocialView(Canvas canvas)
    {
        VideoType videotype = socialData.getType();
        Log.v("SocialVideoView", (new StringBuilder()).append("** Drawing social view for: ").append(socialData.getTitle()).append(", type: ").append(videotype).append(", friend count: ").append(friendCount).toString());
        if (videotype == VideoType.SOCIAL_POPULAR && friendCount == 0)
        {
            drawConnectToFacebook(canvas);
            return;
        }
        if (videotype == VideoType.SOCIAL_FRIEND)
        {
            drawSingleFriend(canvas, socialData);
            return;
        }
        if (videotype == VideoType.SOCIAL_GROUP)
        {
            drawMultipleFriends(canvas, socialData);
            return;
        } else
        {
            Log.w("SocialVideoView", (new StringBuilder()).append("Couldn't draw unknown social type: ").append(videotype).toString());
            return;
        }
    }

    private void fetchImages()
    {
        ImageLoader imageloader = NetflixActivity.getImageLoader(getContext());
        int i = 0;
        while (i < friendCount) 
        {
            FriendProfile friendprofile = (FriendProfile)socialData.getFacebookFriends().get(i);
            if (StringUtils.isEmpty(friendprofile.getImageUrl()))
            {
                Log.w("SocialVideoView", (new StringBuilder()).append("Empty image url for friend: ").append(friendprofile.getFullName()).toString());
            } else
            {
                imageloader.getImg(friendprofile.getImageUrl(), com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.profileAvatar, singleImgSize, singleImgSize, new ImageLoadedListener(i));
            }
            i++;
        }
    }

    private String getTruncatedName(Paint paint)
    {
        String s;
        for (s = socialData.getTitle(); paint.measureText(s) > (float)getWidth(); s = (new StringBuilder()).append(s.substring(0, s.length() / 2)).append("...").toString())
        {
            Log.v("SocialVideoView", "Name too long... halving");
        }

        return s;
    }

    private void init()
    {
        Resources resources = getResources();
        singleImgSize = resources.getDimensionPixelOffset(0x7f0a004f);
        textSizeMicro = resources.getDimensionPixelOffset(0x7f0a002d);
        padding = resources.getDimensionPixelOffset(0x7f0a002b);
        initTextPaint(resources);
    }

    private void initTextPaint(Resources resources)
    {
        if (microSecondaryLeftPaint == null)
        {
            microSecondaryLeftPaint = new TextPaint();
            microSecondaryLeftPaint.setTextSize(textSizeMicro);
            microSecondaryLeftPaint.setColor(resources.getColor(0x7f09003b));
            microSecondaryLeftPaint.setTextAlign(android.graphics.Paint.Align.LEFT);
        }
        if (microSecondaryCenterPaint == null)
        {
            microSecondaryCenterPaint = new TextPaint();
            microSecondaryCenterPaint.setTextSize(textSizeMicro);
            microSecondaryCenterPaint.setColor(resources.getColor(0x7f09003b));
            microSecondaryCenterPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
        }
        if (smallPrimaryLeftPaint == null)
        {
            smallPrimaryLeftPaint = new TextPaint();
            smallPrimaryLeftPaint.setTextSize(resources.getDimensionPixelOffset(0x7f0a002e));
            smallPrimaryLeftPaint.setColor(resources.getColor(0x7f09003a));
            smallPrimaryLeftPaint.setTextAlign(android.graphics.Paint.Align.LEFT);
        }
    }

    private void logCurrentBitmap(Drawable drawable)
    {
        if (!(drawable instanceof BitmapDrawable)) goto _L2; else goto _L1
_L1:
        drawable = ((BitmapDrawable)drawable).getBitmap();
        if (drawable != null) goto _L4; else goto _L3
_L3:
        Log.v("SocialVideoView", (new StringBuilder()).append("bitmap is null, tag: ").append(getUrlTag()).toString());
_L6:
        return;
_L4:
        Log.v("SocialVideoView", (new StringBuilder()).append("drawing bitmap: ").append(drawable.toString()).append(", recycled: ").append(drawable.isRecycled()).append(", tag: ").append(getUrlTag()).toString());
        return;
_L2:
        if (drawable instanceof LayerDrawable)
        {
            drawable = (LayerDrawable)drawable;
            int i = 0;
            while (i < drawable.getNumberOfLayers()) 
            {
                logCurrentBitmap(drawable.getDrawable(i));
                i++;
            }
        } else
        {
            Log.v("SocialVideoView", (new StringBuilder()).append("drawable is: ").append(drawable.getClass().getSimpleName()).append(", tag: ").append(getUrlTag()).toString());
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void safelyDrawBitmap(Canvas canvas, Bitmap bitmap, Rect rect)
    {
        if (bitmap == null)
        {
            return;
        }
        if (bitmap.isRecycled())
        {
            Log.w("SocialVideoView", "Trying to draw recycled bitmap");
            return;
        } else
        {
            canvas.drawBitmap(bitmap, null, rect, null);
            return;
        }
    }

    boolean isSocialView()
    {
        return isSocialView;
    }

    protected void onDraw(Canvas canvas)
    {
        if (isSocialView)
        {
            drawSocialView(canvas);
            return;
        }
        try
        {
            super.onDraw(canvas);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            Log.w("SocialVideoView", (new StringBuilder()).append("IAE while drawing img: ").append(canvas.getMessage()).toString());
        }
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        if (i == 0 || i == k)
        {
            return;
        } else
        {
            connectText = new StaticLayout(getResources().getString(0x7f0c0169), smallPrimaryLeftPaint, i - padding * 2, android.text.Layout.Alignment.ALIGN_CENTER, 1.0F, 0.0F, false);
            socialGroupText = new StaticLayout(getResources().getString(0x7f0c0168), microSecondaryLeftPaint, i - padding * 2, android.text.Layout.Alignment.ALIGN_CENTER, 1.0F, 0.0F, false);
            return;
        }
    }

    protected boolean shouldDispatchToPressHandler()
    {
        return !isSocialView;
    }

    public void update(Video video, Trackable trackable, int i, boolean flag)
    {
        boolean flag1 = false;
        isSocialView = com.netflix.mediaclient.service.webclient.model.branches.Video.isSocialVideoType(video.getType());
        if (!isSocialView)
        {
            super.update(video, trackable, i, flag);
            return;
        }
        Log.v("SocialVideoView", (new StringBuilder()).append("Updating for social view: ").append(video.getTitle()).toString());
        NetflixActivity.getImageLoader(getContext()).showImg(this, null, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.boxArt, video.getTitle(), false, false);
        setImageBitmap(null);
        setVisibility(0);
        socialData = (VideoDetails)video;
        cachedName = null;
        if (VideoType.SOCIAL_POPULAR.equals(socialData.getType()))
        {
            clicker.update(this, video);
        } else
        {
            clicker.remove(this);
        }
        if (socialData.getFacebookFriends() == null)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = socialData.getFacebookFriends().size();
        }
        friendCount = i;
        if (friendCount > 9)
        {
            Log.w("SocialVideoView", "More than 9 facebook friends - skipping more than max");
            friendCount = 9;
        }
        clearBitmaps();
        fetchImages();
    }

    public volatile void update(Object obj, Trackable trackable, int i, boolean flag)
    {
        update((Video)obj, trackable, i, flag);
    }

}
