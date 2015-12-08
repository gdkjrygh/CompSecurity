// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.fl;
import com.google.android.gms.plus.model.people.Person;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.plus:
//            PlusShare, PlusClient

public static class mIntent
{

    private final Context mContext;
    private final Intent mIntent;
    private boolean rl;
    private ArrayList rm;
    protected boolean rn;

    public mIntent addCallToAction(String s, Uri uri, String s1)
    {
        dm.a(rl, "Must include the launching activity with PlusShare.Builder constructor before setting call-to-action");
        Bundle bundle;
        boolean flag;
        if (uri != null && !TextUtils.isEmpty(uri.toString()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dm.b(flag, "Must provide a call to action URL");
        dm.a(rn, "Must include PlusClient in PlusShare.Builder constructor to create an interactive post");
        bundle = new Bundle();
        if (!TextUtils.isEmpty(s))
        {
            bundle.putString("label", s);
        }
        bundle.putString("url", uri.toString());
        if (!TextUtils.isEmpty(s1))
        {
            dm.a(PlusShare.V(s1), "The specified deep-link ID was malformed.");
            bundle.putString("deepLinkId", s1);
        }
        mIntent.putExtra("com.google.android.apps.plus.CALL_TO_ACTION", bundle);
        mIntent.putExtra("com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST", true);
        mIntent.setType("text/plain");
        return this;
    }

    public mIntent addStream(Uri uri)
    {
        Uri uri1 = (Uri)mIntent.getParcelableExtra("android.intent.extra.STREAM");
        if (uri1 == null)
        {
            return setStream(uri);
        }
        if (rm == null)
        {
            rm = new ArrayList();
        }
        rm.add(uri1);
        rm.add(uri);
        return this;
    }

    protected boolean cV()
    {
        Object obj = mContext.getPackageManager();
        if (obj != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        boolean flag;
        try
        {
            obj = ((PackageManager) (obj)).getApplicationInfo("com.google.android.apps.plus", 0);
        }
        catch (android.content.pm.eNotFoundException enotfoundexception)
        {
            return false;
        }
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = ((ApplicationInfo) (obj)).enabled;
        if (flag)
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public Intent getIntent()
    {
        boolean flag2 = true;
        boolean flag;
        boolean flag1;
        boolean flag3;
        boolean flag4;
        if (rm != null && rm.size() > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag3 = "android.intent.action.SEND_MULTIPLE".equals(mIntent.getAction());
        flag4 = mIntent.getBooleanExtra("com.google.android.apps.plus.GOOGLE_INTERACTIVE_POST", false);
        if (!flag || !flag4)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        dm.a(flag1, "Call-to-action buttons are only available for URLs.");
        if (!flag4 || mIntent.hasExtra("com.google.android.apps.plus.CONTENT_URL"))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        dm.a(flag1, "The content URL is required for interactive posts.");
        flag1 = flag2;
        if (flag4)
        {
            flag1 = flag2;
            if (!mIntent.hasExtra("com.google.android.apps.plus.CONTENT_URL"))
            {
                if (mIntent.hasExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID"))
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
            }
        }
        dm.a(flag1, "Must set content URL or content deep-link ID to use a call-to-action button.");
        if (mIntent.hasExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID"))
        {
            dm.a(PlusShare.V(mIntent.getStringExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID")), "The specified deep-link ID was malformed.");
        }
        if (!flag && flag3)
        {
            mIntent.setAction("android.intent.action.SEND");
            if (rm != null && !rm.isEmpty())
            {
                mIntent.putExtra("android.intent.extra.STREAM", (Parcelable)rm.get(0));
            } else
            {
                mIntent.removeExtra("android.intent.extra.STREAM");
            }
            rm = null;
        }
        if (flag && !flag3)
        {
            mIntent.setAction("android.intent.action.SEND_MULTIPLE");
            if (rm != null && !rm.isEmpty())
            {
                mIntent.putParcelableArrayListExtra("android.intent.extra.STREAM", rm);
            } else
            {
                mIntent.removeExtra("android.intent.extra.STREAM");
            }
        }
        if ("com.google.android.gms.plus.action.SHARE_INTERNAL_GOOGLE".equals(mIntent.getAction()))
        {
            mIntent.setPackage("com.google.android.gms");
            return mIntent;
        }
        if (!cV() && !mIntent.hasExtra("android.intent.extra.STREAM"))
        {
            mIntent.setAction("com.google.android.gms.plus.action.SHARE_GOOGLE");
            mIntent.setPackage("com.google.android.gms");
            return mIntent;
        } else
        {
            mIntent.setPackage("com.google.android.apps.plus");
            return mIntent;
        }
    }

    public mIntent setContentDeepLinkId(String s)
    {
        return setContentDeepLinkId(s, null, null, null);
    }

    public setContentDeepLinkId setContentDeepLinkId(String s, String s1, String s2, Uri uri)
    {
        dm.b(rl, "Must include the launching activity with PlusShare.Builder constructor before setting deep links");
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dm.b(flag, "The deepLinkId parameter is required.");
        s1 = PlusShare.a(s1, s2, uri);
        mIntent.putExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_ID", s);
        mIntent.putExtra("com.google.android.apps.plus.CONTENT_DEEP_LINK_METADATA", s1);
        mIntent.setType("text/plain");
        return this;
    }

    public mIntent setContentUrl(Uri uri)
    {
        String s = null;
        if (uri != null)
        {
            s = uri.toString();
        }
        if (TextUtils.isEmpty(s))
        {
            mIntent.removeExtra("com.google.android.apps.plus.CONTENT_URL");
            return this;
        } else
        {
            mIntent.putExtra("com.google.android.apps.plus.CONTENT_URL", s);
            return this;
        }
    }

    public mIntent setRecipients(List list)
    {
        int i;
        if (list != null)
        {
            i = list.size();
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            mIntent.removeExtra("com.google.android.apps.plus.RECIPIENT_IDS");
            mIntent.removeExtra("com.google.android.apps.plus.RECIPIENT_DISPLAY_NAMES");
            return this;
        }
        ArrayList arraylist = new ArrayList(i);
        ArrayList arraylist1 = new ArrayList(i);
        Person person;
        for (list = list.iterator(); list.hasNext(); arraylist1.add(person.getDisplayName()))
        {
            person = (Person)list.next();
            arraylist.add(person.getId());
        }

        mIntent.putStringArrayListExtra("com.google.android.apps.plus.RECIPIENT_IDS", arraylist);
        mIntent.putStringArrayListExtra("com.google.android.apps.plus.RECIPIENT_DISPLAY_NAMES", arraylist1);
        return this;
    }

    public  setStream(Uri uri)
    {
        rm = null;
        mIntent.putExtra("android.intent.extra.STREAM", uri);
        return this;
    }

    public mIntent setText(CharSequence charsequence)
    {
        mIntent.putExtra("android.intent.extra.TEXT", charsequence);
        return this;
    }

    public mIntent setType(String s)
    {
        mIntent.setType(s);
        return this;
    }

    public Exception(Activity activity)
    {
        mContext = activity;
        mIntent = (new Intent()).setAction("android.intent.action.SEND");
        mIntent.addFlags(0x80000);
        if (activity.getComponentName() != null)
        {
            rl = true;
        }
    }

    public rl(Activity activity, PlusClient plusclient)
    {
        this(activity);
        boolean flag;
        if (plusclient != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dm.a(flag, "Must include the PlusClient object in PlusShare.Builder constructor to create an interactive post.");
        dm.a(plusclient.isConnected(), "PlusClient must be connected to create an interactive post.");
        dm.a(plusclient.cR().Y("https://www.googleapis.com/auth/plus.login"), "Must request PLUS_LOGIN scope in PlusClient to create an interactive post.");
        activity = plusclient.getCurrentPerson();
        if (activity != null)
        {
            activity = activity.getId();
        } else
        {
            activity = "0";
        }
        mIntent.putExtra("com.google.android.apps.plus.SENDER_ID", activity);
        rn = true;
    }

    public rn(Context context)
    {
        mContext = context;
        mIntent = (new Intent()).setAction("android.intent.action.SEND");
    }
}
