// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.content.ContentResolver;
import android.database.Cursor;
import android.support.v4.app.FragmentActivity;
import android.util.Pair;
import android.widget.TextView;
import com.pinterest.base.Device;
import com.pinterest.common.async.BackgroundTask;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.unauth.fragment:
//            NewLoginFragment

public class this._cls0 extends BackgroundTask
{

    String names[];
    final NewLoginFragment this$0;

    public void onFinish()
    {
        if (names != null && _userName != null)
        {
            if (names.length > 1)
            {
                _userName.setText((new StringBuilder()).append(names[0]).append(" ").append(names[1]).toString());
                NewLoginFragment.access$002(NewLoginFragment.this, names[0]);
                NewLoginFragment.access$102(NewLoginFragment.this, names[1]);
            } else
            {
                NewLoginFragment.access$002(NewLoginFragment.this, names[0]);
                _userName.setText(names[0]);
            }
            try
            {
                String s = Device.getDefaultEmailAddress();
                if (StringUtils.isNotEmpty(s))
                {
                    NewLoginFragment.access$202(NewLoginFragment.this, s);
                    _emailTv.setText(s);
                    return;
                }
            }
            catch (Exception exception)
            {
                return;
            }
        }
    }

    public void run()
    {
        Cursor cursor;
        if (getActivity() != null)
        {
            if ((cursor = getActivity().getContentResolver().query(android.provider._URI, null, null, null, null)) != null)
            {
                if (cursor.getCount() > 0 && cursor.moveToFirst())
                {
                    Pair pair = new Pair("display_name", cursor.getString(cursor.getColumnIndex("display_name")));
                    if ("display_name".equals(pair.first) && pair.second != null && (pair.second instanceof String))
                    {
                        names = ((String)pair.second).split(" ");
                    }
                }
                cursor.close();
                return;
            }
        }
    }

    public ()
    {
        this$0 = NewLoginFragment.this;
        super();
    }
}
