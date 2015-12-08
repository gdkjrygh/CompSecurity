// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.development;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import butterknife.ButterKnife;
import com.appboy.enums.inappmessage.ClickAction;
import com.appboy.models.InAppMessageFull;
import com.appboy.models.MessageButton;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import java.io.File;
import java.util.ArrayList;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.infrastructure.camera.ICaptureImage;
import me.lyft.android.infrastructure.lyft.work.UserOrganizationDTO;
import me.lyft.android.managers.ImageLoader;
import me.lyft.android.utils.FileUtils;

public class TestScreensView extends LinearLayout
{

    private static final String CAMERA_ITEMS[] = {
        "User Profile", "Car Photo", "Driver License", "Insurance", "Mentee Photo"
    };
    AppFlow appFlow;
    Spinner cameraItemsSpinner;
    ICaptureImage captureImage;
    DialogFlow dialogFlow;
    ImageLoader imageLoader;
    Toolbar toolbar;

    public TestScreensView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        Scoop.a(this).b(this);
    }

    private File getTemporaryFile()
    {
        return FileUtils.getTemporaryFile(getContext(), "temp_file.jpg");
    }

    private void initCameraSpinner()
    {
        ArrayAdapter arrayadapter = new ArrayAdapter(getContext(), 0x1090009, CAMERA_ITEMS);
        arrayadapter.setDropDownViewResource(0x1090009);
        cameraItemsSpinner.setAdapter(arrayadapter);
        cameraItemsSpinner.setSelection(0);
    }

    private void showCustomAppboyInAppNote()
    {
        Object obj = new InAppMessageFull();
        ((InAppMessageFull) (obj)).setBackgroundColor(getResources().getColor(0x7f0c000b));
        ((InAppMessageFull) (obj)).setHeader("Free ice cream today!");
        ((InAppMessageFull) (obj)).setHeaderTextColor(getResources().getColor(0x7f0c00a4));
        ((InAppMessageFull) (obj)).setMessage("For a limited time");
        ((InAppMessageFull) (obj)).setMessageTextColor(getResources().getColor(0x7f0c000b));
        imageLoader.load("https://d13yacurqjgara.cloudfront.net/users/59100/screenshots/1938930/untitled-1.jpg").fetch();
        ((InAppMessageFull) (obj)).setImageUrl("https://d13yacurqjgara.cloudfront.net/users/59100/screenshots/1938930/untitled-1.jpg");
        ArrayList arraylist = new ArrayList();
        MessageButton messagebutton = new MessageButton();
        messagebutton.setClickAction(ClickAction.URI, Uri.parse("lyft://profile"));
        messagebutton.setText("Open your profile");
        messagebutton.setTextColor(getResources().getColor(0x7f0c000b));
        arraylist.add(messagebutton);
        messagebutton = new MessageButton();
        messagebutton.setClickAction(ClickAction.URI, Uri.parse("http://www.lyft.com"));
        messagebutton.setText("Open lyft.net");
        messagebutton.setTextColor(getResources().getColor(0x7f0c000b));
        arraylist.add(messagebutton);
        ((InAppMessageFull) (obj)).setMessageButtons(arraylist);
        obj = new me.lyft.android.ui.AppboyScreens.AppBoyInappDialog(((com.appboy.models.IInAppMessage) (obj)));
        dialogFlow.show(((com.lyft.scoop.Screen) (obj)));
    }

    private void showInsuranceDialog()
    {
        dialogFlow.show((new me.lyft.android.ui.Dialogs.InsuranceExpiringDialog()).setAttemptEnterDriverMode(true));
    }

    private void startCamera(String s)
    {
        com.lyft.scoop.Screen screen;
        byte byte0;
        screen = Scoop.a(this).a();
        byte0 = -1;
        s.hashCode();
        JVM INSTR tableswitch 622330452 622330452: default 32
    //                   622330452 84;
           goto _L1 _L2
_L2:
        if (s.equals("User Profile"))
        {
            byte0 = 0;
        }
_L1:
        switch (byte0)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Not a valid argument! (").append(s).append(")").toString());

        case 0: // '\0'
            s = new me.lyft.android.ui.camera.CameraScreens.CaptureUserPhotoScreen();
            break;
        }
        captureImage.capturePhoto(s, screen, getTemporaryFile());
        return;
    }

    public void goToView(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131559413: 
            appFlow.goTo(new me.lyft.android.ui.invites.InvitesScreens.InviteScreen());
            return;

        case 2131559414: 
            appFlow.goTo(new me.lyft.android.ui.splitfare.SplitScreens.InviteToSplitScreen());
            return;

        case 2131559415: 
            view = new UserOrganizationDTO(null, null, null);
            appFlow.goTo(new me.lyft.android.ui.enterprise.EnterpriseScreens.WorkPerksInviteCoworkersViaContactsScreen("fake@lyft.com", view));
            return;

        case 2131559420: 
            startCamera(cameraItemsSpinner.getSelectedItem().toString());
            // fall through

        case 2131559416: 
            appFlow.goTo(new me.lyft.android.ui.payment.PaymentScreens.PaymentFraudScreen());
            return;

        case 2131559417: 
            appFlow.goTo(new me.lyft.android.ui.passenger.PassengerScreens.PassengerRideExpenseNoteScreen());
            return;

        case 2131559418: 
            appFlow.goTo(new DevelopmentScreens.ButtonsScreen());
            return;

        case 2131559412: 
            showInsuranceDialog();
            return;

        case 2131559419: 
            appFlow.goTo(new me.lyft.android.ui.payment.PaymentScreens.ConcurSendRideReceiptsScreen());
            return;

        case 2131559411: 
            showCustomAppboyInAppNote();
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        ButterKnife.a(this);
        toolbar.setTitle("Test Views");
        initCameraSpinner();
    }

}
