// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.InputFilter;
import android.text.TextUtils;
import android.widget.EditText;
import com.accuweather.android.models.location.LocationModel;

// Referenced classes of package com.accuweather.android.utilities:
//            ILocationNameAliaser

public class LocationNameAliaser
{

    private ILocationNameAliaser locationNameAliaser;

    public LocationNameAliaser(ILocationNameAliaser ilocationnamealiaser)
    {
        locationNameAliaser = ilocationnamealiaser;
    }

    private void handleNegativeAliasClick(LocationModel locationmodel)
    {
        locationmodel.setAliased(false);
    }

    private void handlePositiveAliasClick(LocationModel locationmodel, String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            locationmodel.setAliased(true);
            locationmodel.setAliasName(s);
        }
    }

    public void showAliasDialog(final LocationModel locationModel, Context context)
    {
        final EditText aliasNameEditor = new EditText(context);
        aliasNameEditor.setMaxLines(1);
        aliasNameEditor.setSingleLine();
        aliasNameEditor.setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(15)
        });
        aliasNameEditor.setHint(locationModel.getAliasedName());
        android.content.DialogInterface.OnClickListener onclicklistener = new android.content.DialogInterface.OnClickListener() {

            final LocationNameAliaser this$0;
            final EditText val$aliasNameEditor;
            final LocationModel val$locationModel;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                handlePositiveAliasClick(locationModel, aliasNameEditor.getText().toString());
                dialoginterface.dismiss();
                locationNameAliaser.onAliasChanged(locationModel);
            }

            
            {
                this$0 = LocationNameAliaser.this;
                locationModel = locationmodel;
                aliasNameEditor = edittext;
                super();
            }
        };
        locationModel = new android.content.DialogInterface.OnClickListener() {

            final LocationNameAliaser this$0;
            final LocationModel val$locationModel;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                handleNegativeAliasClick(locationModel);
                dialoginterface.dismiss();
                locationNameAliaser.onAliasChanged(locationModel);
            }

            
            {
                this$0 = LocationNameAliaser.this;
                locationModel = locationmodel;
                super();
            }
        };
        android.content.DialogInterface.OnClickListener onclicklistener1 = new android.content.DialogInterface.OnClickListener() {

            final LocationNameAliaser this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface.dismiss();
            }

            
            {
                this$0 = LocationNameAliaser.this;
                super();
            }
        };
        android.content.DialogInterface.OnCancelListener oncancellistener = new android.content.DialogInterface.OnCancelListener() {

            final LocationNameAliaser this$0;

            public void onCancel(DialogInterface dialoginterface)
            {
                dialoginterface.dismiss();
            }

            
            {
                this$0 = LocationNameAliaser.this;
                super();
            }
        };
        (new android.app.AlertDialog.Builder(context)).setTitle(com.accuweather.android.R.string.Nickname).setCancelable(true).setPositiveButton(com.accuweather.android.R.string.OK, onclicklistener).setNeutralButton(com.accuweather.android.R.string.Delete, locationModel).setNegativeButton(com.accuweather.android.R.string.Cancel, onclicklistener1).setOnCancelListener(oncancellistener).setView(aliasNameEditor).create().show();
    }



}
