// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package net.hockeyapp.android:
//            UpdateInfoListener, DownloadFileTask, UpdateInfoAdapter, DownloadFileListener

public class UpdateFragment extends DialogFragment
    implements android.view.View.OnClickListener, UpdateInfoListener
{

    private UpdateInfoAdapter adapter;
    private DownloadFileTask downloadTask;
    private String urlString;
    private JSONArray versionInfo;

    public UpdateFragment()
    {
    }

    public static UpdateFragment newInstance(JSONArray jsonarray, String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("url", s);
        bundle.putString("versionInfo", jsonarray.toString());
        jsonarray = new UpdateFragment();
        jsonarray.setArguments(bundle);
        return jsonarray;
    }

    private void startDownloadTask(final Activity activity)
    {
        downloadTask = new DownloadFileTask(activity, urlString, new DownloadFileListener() {

            final UpdateFragment this$0;
            final Activity val$activity;

            public final void downloadFailed(DownloadFileTask downloadfiletask, Boolean boolean1)
            {
                if (boolean1.booleanValue())
                {
                    startDownloadTask(activity);
                }
            }

            public final void downloadSuccessful(DownloadFileTask downloadfiletask)
            {
            }

            
            {
                this$0 = UpdateFragment.this;
                activity = activity1;
                super();
            }
        });
        downloadTask.execute(new String[0]);
    }

    public int getCurrentVersionCode()
    {
        int i;
        try
        {
            i = getActivity().getPackageManager().getPackageInfo(getActivity().getPackageName(), 128).versionCode;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return -1;
        }
        catch (NullPointerException nullpointerexception)
        {
            return -1;
        }
        return i;
    }

    public int getLayout()
    {
        return R.layout.update_fragment;
    }

    public void onClick(View view)
    {
        startDownloadTask(getActivity());
        dismiss();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        try
        {
            urlString = getArguments().getString("url");
            versionInfo = new JSONArray(getArguments().getString("versionInfo"));
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            dismiss();
            return;
        }
        setStyle(1, 0x1030073);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(getLayout(), viewgroup, false);
        adapter = new UpdateInfoAdapter(getActivity(), versionInfo.toString(), this);
        viewgroup = (ListView)layoutinflater.findViewById(R.id.list_view);
        viewgroup.setDivider(null);
        viewgroup.setAdapter(adapter);
        ((TextView)layoutinflater.findViewById(R.id.version_label)).setText((new StringBuilder("Version ")).append(adapter.getVersionString()).append("\n").append(adapter.getFileInfoString()).toString());
        ((ImageButton)layoutinflater.findViewById(R.id.update_button)).setOnClickListener(this);
        return layoutinflater;
    }

}
