// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import dfi;
import dfj;
import k;
import l;

public class PermissionsRequestActivity extends Activity
    implements l
{

    private dfi a;
    private boolean b;

    public PermissionsRequestActivity()
    {
        b = true;
    }

    public static transient Intent a(Context context, String as[])
    {
        context = new Intent(context, com/spotify/mobile/android/ui/activity/PermissionsRequestActivity);
        context.putExtra("REQUESTED_PERMISSIONS", as);
        return context;
    }

    public static AndroidPermissionsResponse a(Intent intent)
    {
        return (AndroidPermissionsResponse)intent.getParcelableExtra("permission_result");
    }

    static void a(PermissionsRequestActivity permissionsrequestactivity, String as[])
    {
        k.a(permissionsrequestactivity, as);
    }

    static boolean a(PermissionsRequestActivity permissionsrequestactivity)
    {
        return permissionsrequestactivity.b;
    }

    static boolean b(PermissionsRequestActivity permissionsrequestactivity)
    {
        permissionsrequestactivity.b = false;
        return false;
    }

    protected void onCreate(Bundle bundle)
    {
label0:
        {
            super.onCreate(bundle);
            if (bundle == null)
            {
                bundle = getIntent().getStringArrayExtra("REQUESTED_PERMISSIONS");
                String s = getIntent().getExtras().getString("permission_rationale", "");
                int j = bundle.length;
                int i = 0;
                boolean flag = false;
                for (; i < j; i++)
                {
                    flag |= k.a(this, bundle[i]);
                }

                if (!flag || TextUtils.isEmpty(s))
                {
                    break label0;
                }
                setContentView(0x7f030021);
                setFinishOnTouchOutside(false);
                dfj dfj1 = new dfj(this, 0x7f0b0181);
                dfj1.a().b(s).a(0x7f080380, new android.content.DialogInterface.OnClickListener(bundle) {

                    private String a[];
                    private PermissionsRequestActivity b;

                    public final void onClick(DialogInterface dialoginterface, int i1)
                    {
                        PermissionsRequestActivity.a(b, a);
                        PermissionsRequestActivity.b(b);
                        dialoginterface.dismiss();
                    }

            
            {
                b = PermissionsRequestActivity.this;
                a = as;
                super();
            }
                }).a(new android.content.DialogInterface.OnDismissListener(bundle) {

                    private String a[];
                    private PermissionsRequestActivity b;

                    public final void onDismiss(DialogInterface dialoginterface)
                    {
                        if (PermissionsRequestActivity.a(b))
                        {
                            PermissionsRequestActivity.a(b, a);
                        }
                    }

            
            {
                b = PermissionsRequestActivity.this;
                a = as;
                super();
            }
                });
                a = dfj1.b();
                a.show();
            }
            return;
        }
        k.a(this, bundle);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (a != null && a.isShowing())
        {
            b = false;
            a.dismiss();
            a = null;
        }
    }

    public void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        as = new AndroidPermissionsResponse(as, ai);
        ai = new Intent();
        ai.putExtra("permission_result", as);
        setResult(-1, ai);
        finish();
    }

    private class AndroidPermissionsResponse
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new AndroidPermissionsResponse(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new AndroidPermissionsResponse[i];
            }

        };
        public int a[];
        private final String b[];

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeInt(b.length);
            parcel.writeStringArray(b);
            parcel.writeInt(a.length);
            parcel.writeIntArray(a);
        }


        protected AndroidPermissionsResponse(Parcel parcel)
        {
            b = new String[parcel.readInt()];
            parcel.readStringArray(b);
            a = new int[parcel.readInt()];
            parcel.readIntArray(a);
        }

        public AndroidPermissionsResponse(String as[], int ai[])
        {
            b = as;
            a = ai;
        }
    }

}
