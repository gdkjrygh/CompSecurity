// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.URLUtil;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.create.fragment.CreatePinFragment;
import com.pinterest.activity.create.fragment.PinMarkletFragment;
import com.pinterest.activity.create.model.PinnableImage;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.MyUser;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.kit.activity.BaseActivity;
import com.pinterest.kit.application.Resources;
import com.pinterest.reporting.CrashReporting;
import org.apache.commons.lang3.StringUtils;

public class PinItActivity extends BaseActivity
{

    private BaseFragment _currentFragment;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private boolean _externalIntent;

    public PinItActivity()
    {
        _eventsSubscriber = new _cls1();
    }

    private Uri getImageUri(Bundle bundle)
    {
        Uri uri1 = (Uri)bundle.get("com.pinterest.EXTRA_URI");
        Uri uri = uri1;
        if (uri1 == null)
        {
            uri = (Uri)bundle.get("android.intent.extra.STREAM");
        }
        return uri;
    }

    private String getSourceURL(Bundle bundle)
    {
        String s = bundle.getString("com.pinterest.EXTRA_URL");
        Object obj = s;
        if (s == null)
        {
            bundle = bundle.getString("android.intent.extra.TEXT");
            obj = bundle;
            if (bundle != null)
            {
                obj = bundle;
                if (!URLUtil.isValidUrl(bundle))
                {
                    obj = StringUtils.substring(bundle, bundle.indexOf("http"), bundle.length());
                }
            }
        }
        return ((String) (obj));
    }

    private void initActivity()
    {
        Object obj = getIntent().getExtras();
        if (obj == null)
        {
            finish();
            return;
        }
        String s = getIntent().getAction();
        if (s != null && s.equals("android.intent.action.SEND"))
        {
            _externalIntent = true;
            ((Bundle) (obj)).putString("com.pinterest.EXTRA_PIN_CREATE_TYPE", Resources.string(0x7f070737));
        }
        s = getSourceURL(((Bundle) (obj)));
        Object obj1 = getImageUri(((Bundle) (obj)));
        if (obj1 != null)
        {
            CreatePinFragment createpinfragment = new CreatePinFragment();
            FragmentHelper.replaceFragment(this, createpinfragment, false);
            PinnableImage pinnableimage = new PinnableImage();
            pinnableimage.setSourceUrl(s);
            pinnableimage.setDescription(((Bundle) (obj)).getString("com.pinterest.EXTRA_DESCRIPTION"));
            createpinfragment.imageUri = ((Uri) (obj1));
            createpinfragment.setPinnableImage(pinnableimage);
            _currentFragment = createpinfragment;
            return;
        }
        obj1 = ((Bundle) (obj)).getString("com.pinterest.EXTRA_IMAGE");
        if (StringUtils.isNotEmpty(s) && StringUtils.isNotEmpty(((CharSequence) (obj1))))
        {
            CreatePinFragment createpinfragment1 = new CreatePinFragment();
            FragmentHelper.replaceFragment(this, createpinfragment1, false);
            PinnableImage pinnableimage1 = new PinnableImage();
            pinnableimage1.setSourceUrl(s);
            pinnableimage1.setImageUrl(((String) (obj1)));
            pinnableimage1.setDescription(((Bundle) (obj)).getString("com.pinterest.EXTRA_DESCRIPTION"));
            createpinfragment1.setPinnableImage(pinnableimage1);
            _currentFragment = createpinfragment1;
            return;
        }
        String s1 = ((Bundle) (obj)).getString("com.pinterest.EXTRA_ID");
        obj1 = ((Bundle) (obj)).getString("com.pinterest.EXTRA_MESSAGE");
        if (s1 != null && obj1 != null && s != null)
        {
            obj = new Navigation(Location.REPIN, s1);
            ((Navigation) (obj)).putStringParcelable("com.pinterest.EXTRA_MESSAGE", ((String) (obj1)));
            ((Navigation) (obj)).putStringParcelable("com.pinterest.EXTRA_URL", s);
            Events.post(obj);
            finish();
            return;
        }
        if (URLUtil.isNetworkUrl(s))
        {
            initPinMarklet(s);
            return;
        } else
        {
            Application.showToast(0x7f07037e);
            CrashReporting.a(new IllegalStateException(((Bundle) (obj)).toString()));
            finish();
            return;
        }
    }

    private void initPinMarklet(String s)
    {
        s = PinMarkletFragment.newInstance(s);
        FragmentHelper.replaceFragment(this, s, false);
        FragmentHelper.updateFragmentWidth(this);
        _currentFragment = s;
    }

    public BaseFragment getActiveFragment()
    {
        return _currentFragment;
    }

    public boolean isExternalIntent()
    {
        return _externalIntent;
    }

    protected void onActionBarClicked()
    {
        _currentFragment.scrollTo(0, 0);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!MyUser.hasAccessTokenAndUser())
        {
            ActivityHelper.goSplash(this);
            finish();
            return;
        } else
        {
            setContentView(0x7f030020);
            initActivity();
            Events.register(_eventsSubscriber, com/pinterest/base/Device$MetricsUpdateEvent, new Class[0]);
            return;
        }
    }

    protected void onDestroy()
    {
        Events.unregister(_eventsSubscriber);
        super.onDestroy();
    }

    protected void onPause()
    {
        super.onPause();
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/activity/task/model/Navigation
        });
    }

    protected void onResume()
    {
        super.onResume();
        Events.register(_eventsSubscriber, com/pinterest/activity/task/model/Navigation, new Class[0]);
    }

    private class _cls1
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final PinItActivity this$0;

        public void onEventMainThread(Navigation navigation)
        {
            ActivityHelper.goTask(PinItActivity.this, navigation);
        }

        public void onEventMainThread(com.pinterest.base.Device.MetricsUpdateEvent metricsupdateevent)
        {
            FragmentHelper.updateFragmentWidth(PinItActivity.this);
        }

        _cls1()
        {
            this$0 = PinItActivity.this;
            super();
        }
    }

}
