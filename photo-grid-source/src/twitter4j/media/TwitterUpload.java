// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.media;

import java.io.File;
import java.io.InputStream;
import twitter4j.Status;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.OAuthAuthorization;
import twitter4j.conf.Configuration;

// Referenced classes of package twitter4j.media:
//            ImageUpload

class TwitterUpload
    implements ImageUpload
{

    private Twitter twitter;

    public TwitterUpload(Configuration configuration, OAuthAuthorization oauthauthorization)
    {
        twitter = (new TwitterFactory(configuration)).getInstance(oauthauthorization);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (TwitterUpload)obj;
            if (twitter == null ? ((TwitterUpload) (obj)).twitter != null : !twitter.equals(((TwitterUpload) (obj)).twitter))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        if (twitter != null)
        {
            return twitter.hashCode();
        } else
        {
            return 0;
        }
    }

    public String toString()
    {
        return (new StringBuilder("TwitterUpload{twitter=")).append(twitter).append('}').toString();
    }

    public String upload(File file)
    {
        return twitter.updateStatus((new StatusUpdate("")).media(file)).getText();
    }

    public String upload(File file, String s)
    {
        return twitter.updateStatus((new StatusUpdate(s)).media(file)).getText();
    }

    public String upload(String s, InputStream inputstream)
    {
        return twitter.updateStatus((new StatusUpdate("")).media(s, inputstream)).getText();
    }

    public String upload(String s, InputStream inputstream, String s1)
    {
        return twitter.updateStatus((new StatusUpdate(s1)).media(s, inputstream)).getText();
    }
}
