// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.transfer;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import com.skype.Conversation;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.contacts.ConversationLoader;
import com.skype.android.app.media.MediaDocumentUploadUtil;
import com.skype.android.app.media.MediaPhotoViewerActivity;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.transfer:
//            TransferPickConversationFragment

public class TransferPhotoPickConversationFragment extends TransferPickConversationFragment
{

    private static final String PHOTO_SHARING_PHOTO_PREVIEW_CANCEL = "Photo Preview";
    private AsyncCallback mediaDocumentUploadCallback;

    public TransferPhotoPickConversationFragment()
    {
        mediaDocumentUploadCallback = new AsyncCallback() {

            final TransferPhotoPickConversationFragment this$0;

            public final void done(AsyncResult asyncresult)
            {
label0:
                {
                    Boolean boolean1;
                    boolean flag;
                    boolean flag1;
                    if (!asyncresult.e())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    flag1 = flag;
                    if (flag)
                    {
                        break label0;
                    }
                    asyncresult = ((Map)asyncresult.a()).values().iterator();
                    do
                    {
                        flag1 = flag;
                        if (!asyncresult.hasNext())
                        {
                            break label0;
                        }
                        boolean1 = (Boolean)asyncresult.next();
                    } while (boolean1.booleanValue());
                    if (!boolean1.booleanValue())
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                }
                if (flag1)
                {
                    asyncresult = getString(0x7f08044a);
                    Toast.makeText(getActivity(), asyncresult, 1).show();
                }
            }

            
            {
                this$0 = TransferPhotoPickConversationFragment.this;
                super();
            }
        };
    }

    private void reportCancelPhotoSharing()
    {
        if (com/skype/android/app/media/MediaPhotoViewerActivity.toString().equals(getActivity().getIntent().getSerializableExtra("INTENT_ORIGIN")))
        {
            analytics.a(AnalyticsEvent.bL, "Photo Preview");
        }
    }

    protected Callable getLoader()
    {
        return new ConversationLoader(lib, userPrefs, isConversationEnabled());
    }

    protected void onBackPressed()
    {
        super.onBackPressed();
        reportCancelPhotoSharing();
    }

    protected void onSupportNavigateUp()
    {
        super.onSupportNavigateUp();
        reportCancelPhotoSharing();
    }

    protected void uploadOrSendFile(Intent intent, Uri uri, Conversation conversation)
    {
        mediaDocumentUploadUtil.uploadPictureAsync(conversation, uri, mediaDocumentUploadCallback);
    }
}
