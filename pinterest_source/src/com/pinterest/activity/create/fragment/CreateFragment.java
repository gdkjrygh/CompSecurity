// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.EditText;
import com.pinterest.activity.create.helper.CreateImageHelper;
import com.pinterest.activity.create.model.PinnableImage;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.ApiClientHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.kit.activity.BaseActivity;
import com.pinterest.kit.utils.ImageUtils;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            CreateBaseFragment

public class CreateFragment extends CreateBaseFragment
{

    public CreateFragment()
    {
    }

    public int getTitleId()
    {
        return 0x7f0701ab;
    }

    public void onResume()
    {
        String s;
        Object obj;
        Bundle bundle;
label0:
        {
            super.onResume();
            obj = getActivity().getIntent();
            bundle = ((Intent) (obj)).getExtras();
            s = null;
            if (bundle != null)
            {
                s = bundle.getString("com.pinterest.EXTRA_SOURCE");
                ((Intent) (obj)).removeExtra("com.pinterest.EXTRA_SOURCE");
            }
            if (s != null)
            {
                if (!s.equalsIgnoreCase("com.pinterest.EXTRA_SOURCE_PLACE"))
                {
                    break label0;
                }
                _pinnableImage = new PinnableImage();
                _pinnableImage.setPlaceUid(((Intent) (obj)).getStringExtra("com.pinterest.EXTRA_PLACE_ID"));
                _pinnableImage.setImageUrl(((Intent) (obj)).getStringExtra("com.pinterest.EXTRA_IMAGE"));
                descriptionEt.setHint(0x7f070446);
                setPinnableImage(_pinnableImage);
            }
            return;
        }
        if (s.equalsIgnoreCase("com.pinterest.EXTRA_SOURCE_CSR"))
        {
            _pinnableImage = new PinnableImage();
            _pinnableImage.setImageUrl(((Intent) (obj)).getStringExtra("com.pinterest.EXTRA_IMAGE"));
            _pinnableImage.setSourceUrl(((Intent) (obj)).getStringExtra("com.pinterest.EXTRA_URL"));
            setPinnableImage(_pinnableImage);
            return;
        }
        Application.context().getPackageManager();
        obj = bundle.getString("com.pinterest.EXTRA_SOURCE_PACKAGE");
        if (!s.equalsIgnoreCase("com.pinterest.EXTRA_SOURCE_GALLERY")) goto _L2; else goto _L1
_L1:
        CreateImageHelper.showGallery((BaseActivity)getActivity(), ((String) (obj)));
_L4:
        updateFromIntent();
        return;
_L2:
        if (s.equalsIgnoreCase("com.pinterest.EXTRA_SOURCE_CAMERA"))
        {
            CreateImageHelper.showCamera(getActivity(), ((String) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void pin()
    {
        com.pinterest.api.remote.PinApi.PinSubmitParams pinsubmitparams = getPinSubmitParams();
        if (pinsubmitparams != null && getActivity() != null && getActivity().getIntent() != null)
        {
            if (imageUri != null)
            {
                com.pinterest.activity.task.model.Navigation.Remove remove;
                try
                {
                    pinsubmitparams.g = ImageUtils.scaleImageFromUri(getActivity(), imageUri, 720, 720);
                }
                catch (Exception exception) { }
                pinsubmitparams.k = getActivity().getIntent().getStringExtra("com.pinterest.EXTRA_PLACE_ID");
            } else
            if (_pinnableImage != null && _pinnableImage.getImageUrl() != null)
            {
                if (_pinnableImage.getSourceUrl() != null && StringUtils.isBlank(_pinnableImage.getPlaceUid()))
                {
                    pinsubmitparams.c = _pinnableImage.getSourceUrl();
                }
                pinsubmitparams.d = _pinnableImage.getImageUrl();
                if (_pinnableImage.getPlaceUid() != null)
                {
                    pinsubmitparams.k = _pinnableImage.getPlaceUid();
                }
            }
            MyUser.addLastUsedBoard(pinsubmitparams.a);
            ApiClientHelper.a(pinsubmitparams, getActivity());
            if (pinsubmitparams.k != null)
            {
                remove = new com.pinterest.activity.task.model.Navigation.Remove();
                remove.add(new Navigation(Location.PLACE_PICKER));
                remove.add(new Navigation(Location.PLACE_IMAGE_PICKER, pinsubmitparams.k));
                Events.post(remove);
                return;
            }
        }
    }
}
