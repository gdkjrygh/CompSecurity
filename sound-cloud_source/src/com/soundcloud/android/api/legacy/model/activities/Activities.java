// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model.activities;

import android.content.ContentValues;
import android.util.Log;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.legacy.InvalidTokenException;
import com.soundcloud.android.api.legacy.PublicApi;
import com.soundcloud.android.api.legacy.Request;
import com.soundcloud.android.api.legacy.model.CollectionHolder;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.utils.ErrorUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

// Referenced classes of package com.soundcloud.android.api.legacy.model.activities:
//            Activity, CommentActivity, AffiliationActivity, TrackLikeActivity, 
//            TrackRepostActivity, TrackActivity

public class Activities extends CollectionHolder
{

    public static final Activities EMPTY = new Activities();
    public static final int MAX_REQUESTS = 5;
    public String future_href;

    public Activities()
    {
        collection = new ArrayList();
    }

    public Activities(List list)
    {
        collection = list;
    }

    public Activities(List list, String s, String s1)
    {
        collection = list;
        future_href = s;
        next_href = s1;
    }

    public transient Activities(Activity aactivity[])
    {
        collection = Arrays.asList(aactivity);
    }

    public static Activities fetch(PublicApi publicapi, Request request)
        throws IOException
    {
        HttpResponse httpresponse = publicapi.get(request);
        if (httpresponse.getStatusLine().getStatusCode() == 200)
        {
            return (Activities)publicapi.getMapper().readValue(httpresponse.getEntity().getContent(), com/soundcloud/android/api/legacy/model/activities/Activities);
        } else
        {
            return handleUnexpectedResponse(request, httpresponse);
        }
    }

    public static Activities fetchRecent(PublicApi publicapi, Request request, int i)
        throws IOException
    {
        return fetchRecent(publicapi, request, i, 0);
    }

    private static Activities fetchRecent(PublicApi publicapi, Request request, int i, int j)
        throws IOException
    {
        if (i <= 0)
        {
            request = EMPTY;
        } else
        {
            request = (new Request(request)).set("limit", Integer.valueOf(i));
            Object obj = publicapi.get(request);
            if (((HttpResponse) (obj)).getStatusLine().getStatusCode() == 200)
            {
                obj = (Activities)publicapi.getMapper().readValue(((HttpResponse) (obj)).getEntity().getContent(), com/soundcloud/android/api/legacy/model/activities/Activities);
                request = ((Request) (obj));
                if (((Activities) (obj)).size() < i)
                {
                    request = ((Request) (obj));
                    if (((Activities) (obj)).moreResourcesExist())
                    {
                        request = ((Request) (obj));
                        if (!((Activities) (obj)).isEmpty())
                        {
                            request = ((Request) (obj));
                            if (j < 5)
                            {
                                return ((Activities) (obj)).merge(fetchRecent(publicapi, ((Activities) (obj)).getNextRequest(), i - ((Activities) (obj)).size(), j + 1));
                            }
                        }
                    }
                }
            } else
            {
                return handleUnexpectedResponse(request, ((HttpResponse) (obj)));
            }
        }
        return request;
    }

    private static Activities handleUnexpectedResponse(Request request, HttpResponse httpresponse)
        throws IOException
    {
        int i = httpresponse.getStatusLine().getStatusCode();
        if (i == 204)
        {
            if (Log.isLoggable(SoundCloudApplication.TAG, 3))
            {
                request = SoundCloudApplication.TAG;
            }
            return EMPTY;
        }
        if (PublicApi.isStatusCodeClientError(i))
        {
            throw new InvalidTokenException(httpresponse.getStatusLine().getStatusCode(), httpresponse.getStatusLine().getReasonPhrase());
        } else
        {
            httpresponse = new IOException(httpresponse.getStatusLine().toString());
            ErrorUtils.handleSilentException((new StringBuilder("Activities fetchRecent failed ")).append(request).toString(), httpresponse);
            throw httpresponse;
        }
    }

    public ContentValues[] buildContentValues(int i)
    {
        ContentValues acontentvalues[] = new ContentValues[size()];
        for (int j = 0; j < size(); j++)
        {
            acontentvalues[j] = ((Activity)get(j)).buildContentValues();
            if (i >= 0)
            {
                acontentvalues[j].put("content_id", Integer.valueOf(i));
            }
        }

        return acontentvalues;
    }

    public Activities comments()
    {
        return selectType(new Class[] {
            com/soundcloud/android/api/legacy/model/activities/CommentActivity
        });
    }

    public Activities filter(long l)
    {
        Iterator iterator = collection.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((Activity)iterator.next()).getCreatedAt().getTime() <= l)
            {
                iterator.remove();
            }
        } while (true);
        return this;
    }

    public Activities filter(Date date)
    {
        return filter(date.getTime());
    }

    public Activities followers()
    {
        return selectType(new Class[] {
            com/soundcloud/android/api/legacy/model/activities/AffiliationActivity
        });
    }

    public String getFirstAvailableAvatar()
    {
        for (Iterator iterator = getUniqueUsers().iterator(); iterator.hasNext();)
        {
            PublicApiUser publicapiuser = (PublicApiUser)iterator.next();
            if (publicapiuser.shouldLoadIcon())
            {
                return publicapiuser.avatar_url;
            }
        }

        return null;
    }

    public long getTimestamp()
    {
        if (collection.isEmpty())
        {
            return 0L;
        } else
        {
            return ((Activity)collection.get(0)).getCreatedAt().getTime();
        }
    }

    public List getUniquePlayables()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Activity activity = (Activity)iterator.next();
            if (activity.getPlayable() != null && !arraylist.contains(activity.getPlayable()))
            {
                arraylist.add(activity.getPlayable());
            }
        } while (true);
        return arraylist;
    }

    public List getUniqueUsers()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Activity activity = (Activity)iterator.next();
            if (activity.getUser() != null && !arraylist.contains(activity.getUser()))
            {
                arraylist.add(activity.getUser());
            }
        } while (true);
        return arraylist;
    }

    Activities merge(Activities activities)
    {
        if (activities == EMPTY)
        {
            return this;
        }
        Activities activities1 = new Activities(new ArrayList(collection));
        activities1.future_href = future_href;
        activities1.next_href = activities.next_href;
        activities = activities.iterator();
        do
        {
            if (!activities.hasNext())
            {
                break;
            }
            Activity activity = (Activity)activities.next();
            if (!activities1.collection.contains(activity))
            {
                activities1.collection.add(activity);
            }
        } while (true);
        return activities1;
    }

    public transient Activities merge(Activities aactivities[])
    {
        int j = aactivities.length;
        int i = 0;
        Activities activities = this;
        for (; i < j; i++)
        {
            activities = merge(aactivities[i]);
        }

        return activities;
    }

    public boolean newerThan(long l)
    {
        return !isEmpty() && ((Activity)collection.get(0)).getCreatedAt().getTime() > l;
    }

    public boolean olderThan(long l)
    {
        return !isEmpty() && ((Activity)collection.get(0)).getCreatedAt().getTime() <= l;
    }

    public transient Activities selectType(Class aclass[])
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = iterator(); iterator.hasNext();)
        {
            Activity activity = (Activity)iterator.next();
            int j = aclass.length;
            int i = 0;
            while (i < j) 
            {
                if (aclass[i].isAssignableFrom(activity.getClass()))
                {
                    arraylist.add(activity);
                }
                i++;
            }
        }

        return new Activities(arraylist);
    }

    public void sort()
    {
        Collections.sort(collection);
    }

    public String toString()
    {
        return (new StringBuilder("Activities{collection=")).append(collection).append(", next_href='").append(next_href).append('\'').append(", future_href='").append(future_href).append('\'').append('}').toString();
    }

    public Activities trackLikes()
    {
        return selectType(new Class[] {
            com/soundcloud/android/api/legacy/model/activities/TrackLikeActivity
        });
    }

    public Activities trackReposts()
    {
        return selectType(new Class[] {
            com/soundcloud/android/api/legacy/model/activities/TrackRepostActivity
        });
    }

    public Activities tracks()
    {
        return selectType(new Class[] {
            com/soundcloud/android/api/legacy/model/activities/TrackActivity
        });
    }

}
