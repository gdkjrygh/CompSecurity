// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import com.cardinalblue.android.piccollage.a.c;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.a.i;
import com.cardinalblue.android.piccollage.model.k;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.millennialmedia.d;
import org.json.JSONObject;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            AbsDrawerActivity

public class BaseActivity extends AppCompatActivity
{

    public BaseActivity()
    {
    }

    private void a()
    {
        if (m())
        {
            if (ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") == -1)
            {
                ActivityCompat.requestPermissions(this, new String[] {
                    "android.permission.WRITE_EXTERNAL_STORAGE"
                }, 200);
            } else
            if (!k.a() && !k.a(this))
            {
                com.cardinalblue.android.b.k.a(this, 0x7f070142, 1);
                finish();
                return;
            }
        }
    }

    private void b()
    {
        AccessToken accesstoken = AccessToken.getCurrentAccessToken();
        if (accesstoken != null)
        {
            Object obj = getSharedPreferences("cardinalblue_3", 0);
            String s = ((SharedPreferences) (obj)).getString("facebook_uid", "");
            obj = ((SharedPreferences) (obj)).getString("facebook_email", "");
            if (s.isEmpty() || ((String) (obj)).isEmpty())
            {
                GraphRequest.newMeRequest(accesstoken, new com.facebook.GraphRequest.GraphJSONObjectCallback() {

                    final BaseActivity a;

                    public void onCompleted(JSONObject jsonobject, GraphResponse graphresponse)
                    {
                        if (graphresponse.getError() != null)
                        {
                            return;
                        } else
                        {
                            c.a(a.getApplicationContext(), jsonobject);
                            i.a(a);
                            return;
                        }
                    }

            
            {
                a = BaseActivity.this;
                super();
            }
                }).executeAsync();
                return;
            }
        }
    }

    protected boolean m()
    {
        return false;
    }

    protected void n()
    {
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        if (AbsDrawerActivity.b())
        {
            AbsDrawerActivity.a(true);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        b();
        AbsDrawerActivity.b(true);
        try
        {
            d.a(this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            return;
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
    }

    public void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        switch (i)
        {
        default:
            super.onRequestPermissionsResult(i, as, ai);
            return;

        case 200: 
            break;
        }
        if (ai.length > 0 && ai[0] == 0)
        {
            a();
            n();
            return;
        } else
        {
            com.cardinalblue.android.b.k.a(this, 0x7f070142, 1);
            finish();
            return;
        }
    }

    protected void onResume()
    {
        super.onResume();
        f.c(this);
        a();
    }

    protected void onStart()
    {
        super.onStart();
        f.a(this, com.cardinalblue.android.b.k.a(this));
        f.a(getIntent());
        f.b(getIntent());
    }

    protected void onStop()
    {
        super.onStop();
        f.b(this, com.cardinalblue.android.b.k.a(this));
    }

    public void startManagingCursor(Cursor cursor)
    {
        if (cursor == null)
        {
            try
            {
                throw new NullPointerException("Managing null cursor");
            }
            catch (NullPointerException nullpointerexception)
            {
                f.a(nullpointerexception);
            }
        }
        super.startManagingCursor(cursor);
    }
}
