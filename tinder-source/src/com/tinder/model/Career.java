// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessToken;
import com.google.gson.e;
import com.tinder.e.ab;
import com.tinder.e.m;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.d;
import com.tinder.managers.z;
import com.tinder.utils.v;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.tinder.model:
//            Teaser, Job, School, SparksEvent, 
//            User

public class Career
    implements Parcelable, Serializable
{
    public static interface ForceRefreshListener
    {

        public abstract void onFailure();

        public abstract void onProfileLoaded();
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Career createFromParcel(Parcel parcel)
        {
            return new Career(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Career[] newArray(int i)
        {
            return new Career[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private List mJobs;
    private List mSchools;
    private Teaser mTeaser;

    public Career()
    {
    }

    protected Career(Parcel parcel)
    {
        mTeaser = (Teaser)parcel.readValue(com/tinder/model/Teaser.getClassLoader());
        if (parcel.readByte() == 1)
        {
            mJobs = new ArrayList();
            parcel.readList(mJobs, com/tinder/model/Job.getClassLoader());
        } else
        {
            mJobs = null;
        }
        if (parcel.readByte() == 1)
        {
            mSchools = new ArrayList();
            parcel.readList(mSchools, com/tinder/model/School.getClassLoader());
            return;
        } else
        {
            mSchools = null;
            return;
        }
    }

    public static void forceRefreshCareer(ForceRefreshListener forcerefreshlistener)
    {
        ManagerApp.h().g().a(new m(forcerefreshlistener) {

            final ForceRefreshListener val$listener;

            public final void onTinderLoginFailure()
            {
                listener.onFailure();
                v.b("Career refresh auth failure");
            }

            public final void onTinderLoginFailureAccessDenied()
            {
                listener.onFailure();
            }

            public final void onTinderLoginSuccess()
            {
                ManagerApp.h().i().a(new ab() {

                    final _cls1 this$0;

                    public void onProfileLoadFailed()
                    {
                        listener.onFailure();
                    }

                    public void onProfileLoaded(User user)
                    {
                        listener.onProfileLoaded();
                    }

            
            {
                this$0 = _cls1.this;
                super();
            }
                });
            }

            public final void onVerificationNeeded(boolean flag, boolean flag1, boolean flag2)
            {
                listener.onFailure();
            }

            
            {
                listener = forcerefreshlistener;
                super();
            }
        }, AccessToken.a().d, true);
    }

    public void appendAnalyticsInfo(SparksEvent sparksevent)
    {
        if (hasTeaser())
        {
            sparksevent.put("teaserType", getTeaser().getType());
            sparksevent.put("teaserValue", getTeaser().toString());
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public Job getJob()
    {
        return (Job)mJobs.get(0);
    }

    public List getJobs()
    {
        return mJobs;
    }

    public Job getMyJob()
    {
        for (Iterator iterator = mJobs.iterator(); iterator.hasNext();)
        {
            Job job = (Job)iterator.next();
            if (job.companyShown || job.titleShown)
            {
                return job;
            }
        }

        return null;
    }

    public List getSchools()
    {
        return mSchools;
    }

    public Teaser getTeaser()
    {
        return mTeaser;
    }

    public boolean hasJobs()
    {
        return mJobs != null && !mJobs.isEmpty();
    }

    public boolean hasSchools()
    {
        return mSchools != null && !mSchools.isEmpty();
    }

    public boolean hasTeaser()
    {
        return mTeaser != null && mTeaser.toString() != null && !mTeaser.toString().isEmpty();
    }

    public void setJobs(List list)
    {
        mJobs = list;
    }

    public void setSchools(List list)
    {
        mSchools = list;
    }

    public void setTeaser(Teaser teaser)
    {
        mTeaser = teaser;
    }

    public String toString()
    {
        return (new e()).a(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(mTeaser);
        if (mJobs == null)
        {
            parcel.writeByte((byte)0);
        } else
        {
            parcel.writeByte((byte)1);
            parcel.writeList(mJobs);
        }
        if (mSchools == null)
        {
            parcel.writeByte((byte)0);
            return;
        } else
        {
            parcel.writeByte((byte)1);
            parcel.writeList(mSchools);
            return;
        }
    }

}
