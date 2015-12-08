// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.skype.Account;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.util.ImageCache;
import com.skype.android.util.async.UiCallback;
import com.skype.android.widget.CircleImageView;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.signin:
//            SignInConstants, LiveIdWebClient

public class LinkingUtil
    implements SignInConstants
{

    private static final Logger log = Logger.getLogger("LinkingUtil");
    private Activity activity;
    private DefaultAvatars defaultAvatars;
    private ImageCache imageCache;

    public LinkingUtil(Activity activity1, ImageCache imagecache, DefaultAvatars defaultavatars)
    {
        activity = activity1;
        imageCache = imagecache;
        defaultAvatars = defaultavatars;
    }

    private void prepareAvatar(CircleImageView circleimageview)
    {
        circleimageview.setVisibility(0);
    }

    private void setDefaultAvatar(CircleImageView circleimageview)
    {
        prepareAvatar(circleimageview);
        circleimageview.setImageDrawable(defaultAvatars.a(com.skype.android.res.DefaultAvatars.AvatarType.c, com.skype.android.res.DefaultAvatars.AvatarSize.b));
        circleimageview.setTag(0x7f100012, Integer.valueOf(-1));
    }

    public void centerAvatar(CircleImageView circleimageview)
    {
        circleimageview.bringToFront();
        circleimageview.invalidate();
    }

    public Bitmap getBitmap(String s)
    {
        return imageCache.a(s);
    }

    public boolean hasQueryParam(String s)
    {
        return s.contains((new StringBuilder("?")).append("auth_key").append("=").toString()) || s.contains((new StringBuilder("&")).append("auth_key").append("=").toString());
    }

    public boolean isDefaultAvatar(CircleImageView circleimageview, String s)
    {
        circleimageview = ((CircleImageView) (circleimageview.getTag(0x7f100012)));
        return circleimageview != null && circleimageview.equals(s);
    }

    public void putSkypeAvatarToCache(String s, byte abyte0[])
    {
        if (abyte0 == null || abyte0.length == 0)
        {
            return;
        }
        try
        {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inPurgeable = true;
            abyte0 = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length + 0, options);
            imageCache.a(s, abyte0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            log.severe((new StringBuilder("putSkypeAvatarToCache Exception: ")).append(s.getMessage()).toString());
        }
    }

    public Bitmap retrieveSkypeAvatar(String s, byte abyte0[])
    {
        Bitmap bitmap1 = imageCache.a(s);
        Bitmap bitmap = bitmap1;
        if (bitmap1 == null)
        {
            putSkypeAvatarToCache(s, abyte0);
            bitmap = imageCache.a(s);
        }
        return bitmap;
    }

    public void showMsaAvatar(LiveIdWebClient liveidwebclient, final String cid, final CircleImageView avatarImg)
    {
        if (isDefaultAvatar(avatarImg, cid))
        {
            return;
        } else
        {
            setDefaultAvatar(avatarImg);
            avatarImg = new AsyncCallback() {

                final LinkingUtil this$0;
                final CircleImageView val$avatarImg;
                final String val$cid;

                public final void done(AsyncResult asyncresult)
                {
                    if (asyncresult != null && asyncresult.e())
                    {
                        asyncresult = (byte[])asyncresult.a();
                        asyncresult = BitmapFactory.decodeByteArray(asyncresult, 0, asyncresult.length);
                        activity.runOnUiThread(asyncresult. new Runnable() {

                            final _cls3 this$1;
                            final Bitmap val$bitmap;

                            public final void run()
                            {
                                if (bitmap != null)
                                {
                                    avatarImg.setImageBitmap(bitmap);
                                    avatarImg.setTag(0x7f100012, cid);
                                }
                            }

            
            {
                this$1 = final__pcls3;
                bitmap = Bitmap.this;
                super();
            }
                        });
                        return;
                    }
                    Logger logger = LinkingUtil.log;
                    if ((new StringBuilder("getAvatarAsync error ")).append(asyncresult).toString() != null)
                    {
                        asyncresult = asyncresult.c().getMessage();
                    } else
                    {
                        asyncresult = "";
                    }
                    logger.warning(asyncresult);
                }

            
            {
                this$0 = LinkingUtil.this;
                avatarImg = circleimageview;
                cid = s;
                super();
            }
            };
            liveidwebclient.getAvatarAsync(cid, LiveIdWebClient.AvatarSize.UserTileMedium, avatarImg);
            return;
        }
    }

    public void showSkypeAvatar(Account account, CircleImageView circleimageview)
    {
        setDefaultAvatar(circleimageview);
        imageCache.a(account, circleimageview, new AsyncCallback() {

            final LinkingUtil this$0;

            public final void done(AsyncResult asyncresult)
            {
                Bitmap bitmap = (Bitmap)asyncresult.a();
                asyncresult = (CircleImageView)asyncresult.b();
                if (bitmap != null)
                {
                    asyncresult.setImageBitmap(bitmap);
                }
            }

            
            {
                this$0 = LinkingUtil.this;
                super();
            }
        });
    }

    public void showSkypeAvatar(final String avatarUrl, final CircleImageView avatarImg)
    {
        if (isDefaultAvatar(avatarImg, avatarUrl))
        {
            return;
        } else
        {
            setDefaultAvatar(avatarImg);
            UiCallback uicallback = new UiCallback(activity, new AsyncCallback() {

                final LinkingUtil this$0;
                final CircleImageView val$avatarImg;
                final String val$avatarUrl;

                public final void done(AsyncResult asyncresult)
                {
                    ImageView imageview = (ImageView)asyncresult.b();
                    if (asyncresult.a() != null && hasQueryParam(avatarUrl))
                    {
                        imageview.setImageBitmap((Bitmap)asyncresult.a());
                        avatarImg.setTag(0x7f100012, avatarUrl);
                    }
                }

            
            {
                this$0 = LinkingUtil.this;
                avatarUrl = s;
                avatarImg = circleimageview;
                super();
            }
            });
            imageCache.a(avatarUrl, avatarImg, uicallback);
            return;
        }
    }



}
