// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Handler;
import android.widget.TextView;
import com.pinterest.activity.create.PinItActivity;
import com.pinterest.activity.create.model.PinnableImage;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.text.PButton;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            CreateBaseFragment, PinMarkletFragment

class this._cls0 extends AsyncTask
{

    final CreateBaseFragment this$0;

    protected transient Boolean doInBackground(Void avoid[])
    {
        pin();
        return Boolean.valueOf(true);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected void onPostExecute(final Boolean message)
    {
        CreateBaseFragment.access$100(CreateBaseFragment.this);
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity instanceof PinItActivity)
        {
            if (((PinItActivity)fragmentactivity).isExternalIntent())
            {
                class _cls1
                    implements Runnable
                {

                    final CreateBaseFragment.AsyncPinTask this$1;
                    final String val$message;

                    public void run()
                    {
                        Application.showToastShort(message);
                    }

            _cls1()
            {
                this$1 = CreateBaseFragment.AsyncPinTask.this;
                message = s;
                super();
            }
                }

                if (boardTv == null)
                {
                    message = Resources.string(0x7f07041e);
                } else
                {
                    message = Resources.string(0x7f0704c2, new Object[] {
                        boardTv.getText()
                    });
                }
                (new Handler()).postDelayed(new _cls1(), 500L);
            }
            message = ((PinItActivity)fragmentactivity).getActiveFragment();
            if ((message instanceof PinMarkletFragment) && ((PinMarkletFragment)message).setPinAnother())
            {
                _pinnableImage.setPinned(true);
                CreateBaseFragment.access$200(CreateBaseFragment.this);
                return;
            }
        }
        fragmentactivity.finish();
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Boolean)obj);
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
        _positiveBtn.setOnClickListener(null);
    }

    _cls1()
    {
        this$0 = CreateBaseFragment.this;
        super();
    }
}
