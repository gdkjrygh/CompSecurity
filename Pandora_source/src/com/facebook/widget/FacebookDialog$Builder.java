// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.facebook.FacebookException;
import com.facebook.NativeAppCallAttachmentStore;
import com.facebook.NativeAppCallContentProvider;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

// Referenced classes of package com.facebook.widget:
//            FacebookDialog

public static abstract class plicationId
{

    protected final Activity activity;
    protected final all appCall = new all(64207);
    protected final String applicationId;
    protected String applicationName;
    protected Fragment fragment;
    protected HashMap imageAttachmentFiles;
    protected HashMap imageAttachments;

    protected plicationId addImageAttachment(String s, Bitmap bitmap)
    {
        imageAttachments.put(s, bitmap);
        return this;
    }

    protected imageAttachments addImageAttachment(String s, File file)
    {
        imageAttachmentFiles.put(s, file);
        return this;
    }

    protected List addImageAttachmentFiles(Collection collection)
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (collection = collection.iterator(); collection.hasNext(); arraylist.add(NativeAppCallContentProvider.getAttachmentUrl(applicationId, appCall.getCallId(), s)))
        {
            File file = (File)collection.next();
            s = UUID.randomUUID().toString();
            addImageAttachment(s, file);
        }

        return arraylist;
    }

    protected List addImageAttachments(Collection collection)
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (collection = collection.iterator(); collection.hasNext(); arraylist.add(NativeAppCallContentProvider.getAttachmentUrl(applicationId, appCall.getCallId(), s)))
        {
            Bitmap bitmap = (Bitmap)collection.next();
            s = UUID.randomUUID().toString();
            addImageAttachment(s, bitmap);
        }

        return arraylist;
    }

    public FacebookDialog build()
    {
        validate();
        String s = FacebookDialog.access$100(getDialogFeatures());
        int i = FacebookDialog.access$300(activity, s, FacebookDialog.access$200(applicationId, s, getDialogFeatures()));
        Bundle bundle;
        android.content.Intent intent;
        if (NativeProtocol.isVersionCompatibleWithBucketedIntent(i))
        {
            bundle = getMethodArguments();
        } else
        {
            bundle = setBundleExtras(new Bundle());
        }
        intent = NativeProtocol.createPlatformActivityIntent(activity, appCall.getCallId().toString(), s, i, applicationName, bundle);
        if (intent == null)
        {
            FacebookDialog.access$500(activity, fragment, FacebookDialog.access$400(s, bundle.containsKey("com.facebook.platform.extra.PHOTOS")), "Failed");
            throw new FacebookException("Unable to create Intent; this likely means the Facebook app is not installed.");
        } else
        {
            all.access._mth600(appCall, intent);
            return new FacebookDialog(activity, fragment, appCall, getOnPresentCallback(), null);
        }
    }

    public boolean canPresent()
    {
        return FacebookDialog.access$800(activity, getDialogFeatures());
    }

    protected abstract EnumSet getDialogFeatures();

    List getImageAttachmentNames()
    {
        return new ArrayList(imageAttachments.keySet());
    }

    protected abstract Bundle getMethodArguments();

    tCallback getOnPresentCallback()
    {
        return new FacebookDialog.OnPresentCallback() {

            final FacebookDialog.Builder this$0;

            public void onPresent(Context context)
                throws Exception
            {
                if (imageAttachments != null && imageAttachments.size() > 0)
                {
                    FacebookDialog.access$900().addAttachmentsForCall(context, appCall.getCallId(), imageAttachments);
                }
                if (imageAttachmentFiles != null && imageAttachmentFiles.size() > 0)
                {
                    FacebookDialog.access$900().addAttachmentFilesForCall(context, appCall.getCallId(), imageAttachmentFiles);
                }
            }

            
            {
                this$0 = FacebookDialog.Builder.this;
                super();
            }
        };
    }

    protected String getWebFallbackUrlInternal()
    {
        Object obj = getDialogFeatures().iterator();
        Object obj1;
        if (((Iterator) (obj)).hasNext())
        {
            obj = (ature)((Iterator) (obj)).next();
            obj1 = ((ature) (obj)).name();
            obj = ((ature) (obj)).getAction();
        } else
        {
            obj = null;
            obj1 = null;
        }
        obj = Utility.getDialogFeatureConfig(applicationId, ((String) (obj)), ((String) (obj1)));
        if (obj != null)
        {
            obj1 = ((com.facebook.internal.nfig) (obj)).getFallbackUrl();
            if (obj1 != null)
            {
                obj = getMethodArguments();
                int i = NativeProtocol.getLatestKnownVersion();
                Bundle bundle = ServerProtocol.getQueryParamsForPlatformActivityIntentWebFallback(activity, appCall.getCallId().toString(), i, applicationName, ((Bundle) (obj)));
                if (bundle != null)
                {
                    obj = obj1;
                    if (((Uri) (obj1)).isRelative())
                    {
                        obj = Utility.buildUri(ServerProtocol.getDialogAuthority(), ((Uri) (obj1)).toString(), bundle);
                    }
                    return ((Uri) (obj)).toString();
                }
            }
        }
        return null;
    }

    protected void putExtra(Bundle bundle, String s, String s1)
    {
        if (s1 != null)
        {
            bundle.putString(s, s1);
        }
    }

    public logAuthority setApplicationName(String s)
    {
        applicationName = s;
        return this;
    }

    protected Bundle setBundleExtras(Bundle bundle)
    {
        return bundle;
    }

    public applicationName setFragment(Fragment fragment1)
    {
        fragment = fragment1;
        return this;
    }

    public fragment setRequestCode(int i)
    {
        all.access._mth000(appCall, i);
        return this;
    }

    void validate()
    {
    }

    public _cls1.this._cls0(Activity activity1)
    {
        imageAttachments = new HashMap();
        imageAttachmentFiles = new HashMap();
        Validate.notNull(activity1, "activity");
        activity = activity1;
        applicationId = Utility.getMetadataApplicationId(activity1);
    }
}
