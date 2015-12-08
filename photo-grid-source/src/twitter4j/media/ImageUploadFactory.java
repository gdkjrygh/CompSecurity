// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.media;

import twitter4j.auth.Authorization;
import twitter4j.auth.AuthorizationFactory;
import twitter4j.auth.OAuthAuthorization;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationContext;

// Referenced classes of package twitter4j.media:
//            MediaProvider, TwitterUpload, ImgLyUpload, PlixiUpload, 
//            TwippleUpload, TwitgooUpload, TwitpicUpload, YFrogUpload, 
//            MobypictureUpload, PosterousUpload, ImageUpload

public class ImageUploadFactory
{

    private final String apiKey;
    private final Configuration conf;
    private final MediaProvider defaultMediaProvider;

    public ImageUploadFactory()
    {
        this(ConfigurationContext.getInstance());
    }

    public ImageUploadFactory(Configuration configuration)
    {
        String s = configuration.getMediaProvider().toLowerCase();
        if ("twitter".equals(s))
        {
            defaultMediaProvider = MediaProvider.TWITTER;
        } else
        if ("imgly".equals(s) || "img_ly".equals(s))
        {
            defaultMediaProvider = MediaProvider.IMG_LY;
        } else
        if ("plixi".equals(s))
        {
            defaultMediaProvider = MediaProvider.PLIXI;
        } else
        if ("lockerz".equals(s))
        {
            defaultMediaProvider = MediaProvider.LOCKERZ;
        } else
        if ("twipple".equals(s))
        {
            defaultMediaProvider = MediaProvider.TWIPPLE;
        } else
        if ("twitgoo".equals(s))
        {
            defaultMediaProvider = MediaProvider.TWITGOO;
        } else
        if ("twitpic".equals(s))
        {
            defaultMediaProvider = MediaProvider.TWITPIC;
        } else
        if ("yfrog".equals(s))
        {
            defaultMediaProvider = MediaProvider.YFROG;
        } else
        if ("mobypicture".equals(s))
        {
            defaultMediaProvider = MediaProvider.MOBYPICTURE;
        } else
        if ("posterous".equals(s))
        {
            defaultMediaProvider = MediaProvider.POSTEROUS;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("unsupported media provider:")).append(s).toString());
        }
        conf = configuration;
        apiKey = configuration.getMediaProviderAPIKey();
    }

    public ImageUpload getInstance()
    {
        return getInstance(defaultMediaProvider);
    }

    public ImageUpload getInstance(Authorization authorization)
    {
        return getInstance(defaultMediaProvider, authorization);
    }

    public ImageUpload getInstance(MediaProvider mediaprovider)
    {
        return getInstance(mediaprovider, AuthorizationFactory.getInstance(conf));
    }

    public ImageUpload getInstance(MediaProvider mediaprovider, Authorization authorization)
    {
        if (!(authorization instanceof OAuthAuthorization))
        {
            throw new IllegalArgumentException("OAuth authorization is required.");
        }
        authorization = (OAuthAuthorization)authorization;
        if (mediaprovider == MediaProvider.TWITTER)
        {
            return new TwitterUpload(conf, authorization);
        }
        if (mediaprovider == MediaProvider.IMG_LY)
        {
            return new ImgLyUpload(conf, authorization);
        }
        if (mediaprovider == MediaProvider.PLIXI)
        {
            return new PlixiUpload(conf, apiKey, authorization);
        }
        if (mediaprovider == MediaProvider.LOCKERZ)
        {
            return new PlixiUpload(conf, apiKey, authorization);
        }
        if (mediaprovider == MediaProvider.TWIPPLE)
        {
            return new TwippleUpload(conf, authorization);
        }
        if (mediaprovider == MediaProvider.TWITGOO)
        {
            return new TwitgooUpload(conf, authorization);
        }
        if (mediaprovider == MediaProvider.TWITPIC)
        {
            return new TwitpicUpload(conf, apiKey, authorization);
        }
        if (mediaprovider == MediaProvider.YFROG)
        {
            return new YFrogUpload(conf, authorization);
        }
        if (mediaprovider == MediaProvider.MOBYPICTURE)
        {
            return new MobypictureUpload(conf, apiKey, authorization);
        }
        if (mediaprovider == MediaProvider.POSTEROUS)
        {
            return new PosterousUpload(conf, authorization);
        } else
        {
            throw new AssertionError("Unknown provider");
        }
    }
}
