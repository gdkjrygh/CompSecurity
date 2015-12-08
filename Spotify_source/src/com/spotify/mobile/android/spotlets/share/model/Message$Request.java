// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.share.model;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class mRecipients
    implements JacksonModel
{

    private String mMessage;
    private Recipients mRecipients;
    private String mTitle;
    private String mUri;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Recipients.mFacebook))
            {
                return false;
            }
            obj = (Recipients.mFacebook)obj;
            if (mMessage == null ? ((mMessage) (obj)).mMessage != null : !mMessage.equals(((mMessage) (obj)).mMessage))
            {
                return false;
            }
            class Recipients
                implements JacksonModel
            {

                List mFacebook;
                List mSpotify;

                public boolean equals(Object obj1)
                {
                    if (this != obj1)
                    {
                        if (!(obj1 instanceof Recipients))
                        {
                            return false;
                        }
                        obj1 = (Recipients)obj1;
                        if (mFacebook == null ? ((Recipients) (obj1)).mFacebook != null : !mFacebook.equals(((Recipients) (obj1)).mFacebook))
                        {
                            return false;
                        }
                        if (mSpotify == null ? ((Recipients) (obj1)).mSpotify != null : !mSpotify.equals(((Recipients) (obj1)).mSpotify))
                        {
                            return false;
                        }
                    }
                    return true;
                }

                public List getFacebook()
                {
                    return mFacebook;
                }

                public List getSpotify()
                {
                    return mSpotify;
                }

                public int hashCode()
                {
                    int j = 0;
                    int i;
                    if (mSpotify != null)
                    {
                        i = mSpotify.hashCode();
                    } else
                    {
                        i = 0;
                    }
                    if (mFacebook != null)
                    {
                        j = mFacebook.hashCode();
                    }
                    return i * 31 + j;
                }

            public Recipients(List list, List list1)
            {
                mSpotify = list;
                mFacebook = list1;
            }
            }

            if (mRecipients == null ? ((mRecipients) (obj)).mRecipients != null : !mRecipients.equals(((Recipients.equals) (obj)).mRecipients))
            {
                return false;
            }
            if (mTitle == null ? ((mTitle) (obj)).mTitle != null : !mTitle.equals(((mTitle) (obj)).mTitle))
            {
                return false;
            }
            if (mUri == null ? ((mUri) (obj)).mUri != null : !mUri.equals(((mUri) (obj)).mUri))
            {
                return false;
            }
        }
        return true;
    }

    public String getMessage()
    {
        return mMessage;
    }

    public Recipients getRecipients()
    {
        return mRecipients;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public String getUri()
    {
        return mUri;
    }

    public int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (mUri != null)
        {
            i = mUri.hashCode();
        } else
        {
            i = 0;
        }
        if (mTitle != null)
        {
            j = mTitle.hashCode();
        } else
        {
            j = 0;
        }
        if (mMessage != null)
        {
            k = mMessage.hashCode();
        } else
        {
            k = 0;
        }
        if (mRecipients != null)
        {
            l = mRecipients.hashCode();
        }
        return (k + (j + i * 31) * 31) * 31 + l;
    }

    public Recipients(String s, String s1, String s2, Recipients recipients)
    {
        mUri = s;
        mTitle = s1;
        mMessage = s2;
        mRecipients = recipients;
    }
}
