// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import com.skype.android.app.ObjectInterfaceMenuDialog;
import com.skype.android.app.ProgressSpinnerDialogFragment;
import com.skype.android.app.account.BuyCallForwardingDialog;
import com.skype.android.app.account.BuyCreditDialog;
import com.skype.android.app.account.BuyOnlineNumberDialog;
import com.skype.android.app.account.ChangeAvatarDialog;
import com.skype.android.app.account.ChangeBirthdayDialog;
import com.skype.android.app.account.ChangeGenderDialog;
import com.skype.android.app.account.ChangeLanguageDialog;
import com.skype.android.app.account.CustomizeRingtoneDialog;
import com.skype.android.app.account.DeleteCallForwardingNumberDialog;
import com.skype.android.app.account.DeletePhoneNumberDialog;
import com.skype.android.app.chat.CancelTransferDialog;
import com.skype.android.app.chat.ChangeGroupPictureDialog;
import com.skype.android.app.chat.HeartsDialog;
import com.skype.android.app.chat.ParticipantRemoveDialog;
import com.skype.android.app.chat.PlayVoicemailDialog;
import com.skype.android.app.chat.RemoveMessageDialog;
import com.skype.android.app.chat.SmsFailedNoCreditDialog;
import com.skype.android.app.chat.TransferDetailsDialog;
import com.skype.android.app.chat.TranslatorSettingDialog;
import com.skype.android.app.chat.picker.ExtensiblePickerDialogFragment;
import com.skype.android.app.chat.picker.MojiPreviewDialogFragment;
import com.skype.android.app.chat.picker.PickerDialogFragment;
import com.skype.android.app.contacts.ContactBlockConfirmDialog;
import com.skype.android.app.contacts.ContactBlockDialog;
import com.skype.android.app.contacts.ContactBlockedDialog;
import com.skype.android.app.contacts.ContactRemoveConfirmDialog;
import com.skype.android.app.contacts.ContactRequestDeclineDialog;
import com.skype.android.app.main.EditPropertyFragment;
import com.skype.android.app.recents.RecentItemMenuDialog;
import com.skype.android.app.recents.RecentRemoveHistoryDialog;
import com.skype.android.app.signin.AccountBlockedDialogFragment;
import com.skype.android.app.signin.AlreadyMergedDialog;
import com.skype.android.app.signin.PotentiallyMSACredentialsDialog;
import com.skype.android.app.signin.UpdateMandatoryDialog;
import com.skype.android.app.signin.UpdateOptionalDialog;

// Referenced classes of package com.skype.android:
//            SkypeDialogFragment

public interface SkypeDialogFragmentComponent
{

    public abstract void inject(SkypeDialogFragment skypedialogfragment);

    public abstract void inject(ObjectInterfaceMenuDialog objectinterfacemenudialog);

    public abstract void inject(ProgressSpinnerDialogFragment progressspinnerdialogfragment);

    public abstract void inject(BuyCallForwardingDialog buycallforwardingdialog);

    public abstract void inject(BuyCreditDialog buycreditdialog);

    public abstract void inject(BuyOnlineNumberDialog buyonlinenumberdialog);

    public abstract void inject(ChangeAvatarDialog changeavatardialog);

    public abstract void inject(ChangeBirthdayDialog changebirthdaydialog);

    public abstract void inject(ChangeGenderDialog changegenderdialog);

    public abstract void inject(ChangeLanguageDialog changelanguagedialog);

    public abstract void inject(CustomizeRingtoneDialog customizeringtonedialog);

    public abstract void inject(DeleteCallForwardingNumberDialog deletecallforwardingnumberdialog);

    public abstract void inject(DeletePhoneNumberDialog deletephonenumberdialog);

    public abstract void inject(CancelTransferDialog canceltransferdialog);

    public abstract void inject(ChangeGroupPictureDialog changegrouppicturedialog);

    public abstract void inject(HeartsDialog heartsdialog);

    public abstract void inject(ParticipantRemoveDialog participantremovedialog);

    public abstract void inject(PlayVoicemailDialog playvoicemaildialog);

    public abstract void inject(RemoveMessageDialog removemessagedialog);

    public abstract void inject(SmsFailedNoCreditDialog smsfailednocreditdialog);

    public abstract void inject(TransferDetailsDialog transferdetailsdialog);

    public abstract void inject(TranslatorSettingDialog translatorsettingdialog);

    public abstract void inject(ExtensiblePickerDialogFragment extensiblepickerdialogfragment);

    public abstract void inject(MojiPreviewDialogFragment mojipreviewdialogfragment);

    public abstract void inject(PickerDialogFragment pickerdialogfragment);

    public abstract void inject(ContactBlockConfirmDialog contactblockconfirmdialog);

    public abstract void inject(ContactBlockDialog contactblockdialog);

    public abstract void inject(ContactBlockedDialog contactblockeddialog);

    public abstract void inject(ContactRemoveConfirmDialog contactremoveconfirmdialog);

    public abstract void inject(ContactRequestDeclineDialog contactrequestdeclinedialog);

    public abstract void inject(EditPropertyFragment editpropertyfragment);

    public abstract void inject(RecentItemMenuDialog recentitemmenudialog);

    public abstract void inject(RecentRemoveHistoryDialog recentremovehistorydialog);

    public abstract void inject(AccountBlockedDialogFragment accountblockeddialogfragment);

    public abstract void inject(AlreadyMergedDialog alreadymergeddialog);

    public abstract void inject(PotentiallyMSACredentialsDialog potentiallymsacredentialsdialog);

    public abstract void inject(UpdateMandatoryDialog updatemandatorydialog);

    public abstract void inject(UpdateOptionalDialog updateoptionaldialog);
}
