// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import java.util.ArrayList;
import java.util.List;

public class OpenSourceLicensesActivity extends NetflixActivity
{
    private static class Holder
    {

        final TextView license;
        final TextView title;

        public Holder(TextView textview, TextView textview1)
        {
            title = textview;
            license = textview1;
        }
    }

    private class OslAdapter extends BaseAdapter
    {

        final OpenSourceLicensesActivity this$0;

        public int getCount()
        {
            return OpenSourceLicensesActivity.oslInfo.size();
        }

        public OslInfo getItem(int i)
        {
            return (OslInfo)OpenSourceLicensesActivity.oslInfo.get(i);
        }

        public volatile Object getItem(int i)
        {
            return getItem(i);
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            viewgroup = view;
            if (view == null)
            {
                viewgroup = getLayoutInflater().inflate(0x7f030060, null);
                viewgroup.setTag(new Holder((TextView)viewgroup.findViewById(0x7f070138), (TextView)viewgroup.findViewById(0x7f070139)));
            }
            view = (Holder)viewgroup.getTag();
            OslInfo oslinfo = getItem(i);
            ((Holder) (view)).title.setText(oslinfo.title);
            ((Holder) (view)).license.setText(oslinfo.license);
            Linkify.addLinks(((Holder) (view)).license, 1);
            return viewgroup;
        }

        private OslAdapter()
        {
            this$0 = OpenSourceLicensesActivity.this;
            super();
        }

    }

    private static class OslInfo
    {

        final String license;
        final String title;

        public OslInfo(String s, String s1)
        {
            title = s;
            license = s1;
        }
    }


    private static final String APACHE_LICENSE_20 = "\nLicensed under the Apache License, Version 2.0 (the \"License\"); you may not use this file except in compliance with the License.  You may obtain a copy of the License at:\n\n    http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software distributed under the License is distributed on an \"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the License for the specific language governing permissions and limitations under the License.";
    private static final String ROUNDED_IMAGE_VIEW_LICENSE = "Copyright (c) 2013, Vincent Mi\n\nLicensed under the Apache License, Version 2.0 (the \"License\"); you may not use this file except in compliance with the License.  You may obtain a copy of the License at:\n\n    http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software distributed under the License is distributed on an \"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the License for the specific language governing permissions and limitations under the License.";
    private static final String STICKY_GRID_HEADERS_LICENSE = "Copyright 2013 Tonic Artos\n\nLicensed under the Apache License, Version 2.0 (the \"License\"); you may not use this file except in compliance with the License.  You may obtain a copy of the License at:\n\n    http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software distributed under the License is distributed on an \"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the License for the specific language governing permissions and limitations under the License.";
    private static final List oslInfo = new ArrayList();

    public OpenSourceLicensesActivity()
    {
    }

    public static Intent create(Context context)
    {
        return new Intent(context, com/netflix/mediaclient/ui/settings/OpenSourceLicensesActivity);
    }

    private String createHeaderText(String s)
    {
        return String.format(getString(0x7f0c0153), new Object[] {
            s
        });
    }

    private void createOslInfo()
    {
        oslInfo.clear();
        oslInfo.add(new OslInfo(createHeaderText("StickyGridHeaders"), "Copyright 2013 Tonic Artos\n\nLicensed under the Apache License, Version 2.0 (the \"License\"); you may not use this file except in compliance with the License.  You may obtain a copy of the License at:\n\n    http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software distributed under the License is distributed on an \"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the License for the specific language governing permissions and limitations under the License."));
        oslInfo.add(new OslInfo(createHeaderText("RoundedImageView"), "Copyright (c) 2013, Vincent Mi\n\nLicensed under the Apache License, Version 2.0 (the \"License\"); you may not use this file except in compliance with the License.  You may obtain a copy of the License at:\n\n    http://www.apache.org/licenses/LICENSE-2.0\n\nUnless required by applicable law or agreed to in writing, software distributed under the License is distributed on an \"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the License for the specific language governing permissions and limitations under the License."));
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getUiScreen()
    {
        return com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.openSourceLicenses;
    }

    public boolean isLoadingData()
    {
        return false;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        createOslInfo();
        bundle = getNetflixActionBar();
        if (bundle != null)
        {
            bundle.setTitle(getString(0x7f0c0152));
        }
        bundle = new ListView(this);
        bundle.setAdapter(new OslAdapter());
        setContentView(bundle);
    }

    protected boolean showSettingsInMenu()
    {
        return false;
    }

    protected boolean showSignOutInMenu()
    {
        return false;
    }


}
