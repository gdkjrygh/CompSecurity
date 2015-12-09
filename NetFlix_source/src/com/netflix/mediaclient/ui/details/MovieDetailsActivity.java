// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.common.PlayContextImp;
import com.netflix.mediaclient.util.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            DetailsActivity, MovieDetailsFrag

public class MovieDetailsActivity extends DetailsActivity
    implements ManagerStatusListener
{
    public static class BackStackData
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public BackStackData createFromParcel(Parcel parcel)
            {
                return new BackStackData(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public BackStackData[] newArray(int i)
            {
                return new BackStackData[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        private final PlayContext playContext;
        private final String videoId;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(videoId);
            parcel.writeParcelable(playContext, i);
        }




        private BackStackData(Parcel parcel)
        {
            videoId = parcel.readString();
            playContext = (PlayContext)parcel.readParcelable(com/netflix/mediaclient/ui/common/PlayContextImp.getClassLoader());
        }


        public BackStackData(String s, PlayContext playcontext)
        {
            videoId = s;
            playContext = playcontext;
        }
    }


    private static final String EXTRA_BACK_STACK = "extra_back_stack";
    private static final String TAG = "MovieDetailsActivity";
    private final ArrayList backStack = new ArrayList();
    private ServiceManager manager;

    public MovieDetailsActivity()
    {
    }

    private void handleNewVideoId()
    {
        if (StringUtils.isNotEmpty(getVideoId()))
        {
            if (Log.isLoggable("MovieDetailsActivity", 2))
            {
                Log.v("MovieDetailsActivity", (new StringBuilder()).append("Adding curr video to back stack: ").append(getVideoId()).append(", ").append("TRACK_ID: ").append(getPlayContext().getTrackId()).toString());
            }
            backStack.add(new BackStackData(getVideoId(), getPlayContext()));
        }
        setVideoId(getIntent().getStringExtra("extra_video_id"));
        setPlayContext((PlayContextImp)getIntent().getParcelableExtra("extra_playcontext"));
    }

    private void showNewDetailsFrag()
    {
        setPrimaryFrag(createPrimaryFrag());
        getFragmentManager().beginTransaction().replace(0x7f0700b7, getPrimaryFrag(), "primary").setTransition(4099).commit();
        getFragmentManager().executePendingTransactions();
        ((ManagerStatusListener)getPrimaryFrag()).onManagerReady(manager, 0);
    }

    protected volatile Fragment createPrimaryFrag()
    {
        return createPrimaryFrag();
    }

    protected MovieDetailsFrag createPrimaryFrag()
    {
        return MovieDetailsFrag.create(getVideoId());
    }

    protected boolean handleBackPressed()
    {
        Log.v("MovieDetailsActivity", (new StringBuilder()).append("Back pressed, backStack size: ").append(backStack.size()).toString());
        if (backStack.size() > 0)
        {
            BackStackData backstackdata = (BackStackData)backStack.remove(backStack.size() - 1);
            setVideoId(backstackdata.videoId);
            setPlayContext(backstackdata.playContext);
            if (Log.isLoggable("MovieDetailsActivity", 2))
            {
                Log.v("MovieDetailsActivity", (new StringBuilder()).append("Video id from back stack: ").append(getVideoId()).append(", ").append("TRACK_ID: ").append(getPlayContext().getTrackId()).toString());
            }
            showNewDetailsFrag();
            return true;
        } else
        {
            Log.v("MovieDetailsActivity", "No more videos in back stack, finishing...");
            return false;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        if (bundle != null)
        {
            Parcelable parcelable;
            for (Iterator iterator = bundle.getParcelableArrayList("extra_back_stack").iterator(); iterator.hasNext(); backStack.add((BackStackData)parcelable))
            {
                parcelable = (Parcelable)iterator.next();
            }

        }
        handleNewVideoId();
        super.onCreate(bundle);
    }

    public void onManagerReady(ServiceManager servicemanager, int i)
    {
        super.onManagerReady(servicemanager, i);
        manager = servicemanager;
    }

    public void onManagerUnavailable(ServiceManager servicemanager, int i)
    {
        super.onManagerUnavailable(servicemanager, i);
        manager = null;
    }

    protected void onNewIntent(Intent intent)
    {
        Log.v("MovieDetailsActivity", (new StringBuilder()).append("onNewIntent: ").append(intent).toString());
        super.onNewIntent(intent);
        setIntent(intent);
        handleNewVideoId();
        showNewDetailsFrag();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("extra_back_stack", backStack);
    }
}
