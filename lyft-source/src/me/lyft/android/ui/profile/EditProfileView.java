// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import com.squareup.picasso.RequestCreator;
import java.io.File;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.profile.IProfileProvider;
import me.lyft.android.application.profile.IProfileService;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.controls.Toggle;
import me.lyft.android.controls.Toolbar;
import me.lyft.android.domain.profile.Profile;
import me.lyft.android.domain.profile.ProfileFieldMapper;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.infrastructure.photo.IPhotoPickerService;
import me.lyft.android.infrastructure.profile.IProfilePhotoLoader;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.rx.ReactiveUI;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.dialogs.Toast;
import me.lyft.android.utils.FileUtils;
import me.lyft.android.utils.Keyboard;
import rx.Observable;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.profile:
//            EditProfileSession

public class EditProfileView extends LinearLayout
{

    AdvancedEditText aboutEditText;
    AppFlow appFlow;
    private Binder binder;
    IConstantsProvider constantsProvider;
    DialogFlow dialogFlow;
    private EditProfileSession editProfileSession;
    LinearLayout editProfileSwitcherView;
    TextView hometownTextView;
    AdvancedEditText musicEditText;
    Toggle mutualFriendsSwitchToggle;
    View mutualFriendsToogleDividerView;
    private final Action1 onHomeClick = new Action1() {

        final EditProfileView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            appFlow.goBack();
        }

            
            {
                this$0 = EditProfileView.this;
                super();
            }
    };
    private final Action1 onImageCaptured = new Action1() {

        final EditProfileView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            unit = getTemporaryUserPhotoFile();
            editProfileSession.setUserPhotoFile(unit);
            updatePreview(unit);
        }

            
            {
                this$0 = EditProfileView.this;
                super();
            }
    };
    private final Action1 onNoImageSelected = new Action1() {

        final EditProfileView this$0;

        public volatile void call(Object obj)
        {
            call((Unit)obj);
        }

        public void call(Unit unit)
        {
            unit = params.getEditProfileSession().getUserPhotoFile();
            updatePreview(unit);
        }

            
            {
                this$0 = EditProfileView.this;
                super();
            }
    };
    private final AsyncCall onSaveProfile = new AsyncCall() {

        final EditProfileView this$0;

        public void onFail(Throwable throwable)
        {
            dialogFlow.show(new Toast(getResources().getString(0x7f0702d3)));
            viewErrorHandler.handle(throwable);
            updatePreview(null);
        }

        public volatile void onSuccess(Object obj)
        {
            onSuccess((Unit)obj);
        }

        public void onSuccess(Unit unit)
        {
            dialogFlow.show(new Toast(getResources().getString(0x7f0702ca)));
            appFlow.goBack();
        }

        public void onUnsubscribe()
        {
            progressController.hideProgress();
        }

            
            {
                this$0 = EditProfileView.this;
                super();
            }
    };
    private final Action1 onToolbarItemClicked = new Action1() {

        final EditProfileView this$0;

        public void call(Integer integer)
        {
            if (integer.intValue() == 0x7f0d000d)
            {
                onDoneClicked();
            }
        }

        public volatile void call(Object obj)
        {
            call((Integer)obj);
        }

            
            {
                this$0 = EditProfileView.this;
                super();
            }
    };
    private final ProfileScreens.EditProfileScreen params;
    ImageView photoImageView;
    IPhotoPickerService photoPickerService;
    IProfilePhotoLoader profilePhotoLoader;
    LinearLayout profilePhotoView;
    IProfileProvider profileProvider;
    IProfileService profileService;
    IProgressController progressController;
    Toolbar toolbar;
    IViewErrorHandler viewErrorHandler;

    public EditProfileView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = Scoop.a(this);
        context.b(this);
        params = (ProfileScreens.EditProfileScreen)context.a();
    }

    private void facebookSettingsSwitcher()
    {
        byte byte0;
        if (profileService.shouldRequestProfileV1FacebookPermissions())
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        mutualFriendsToogleDividerView.setVisibility(byte0);
        editProfileSwitcherView.setVisibility(byte0);
    }

    private File getTemporaryUserPhotoFile()
    {
        return FileUtils.getTemporaryFile(getContext(), "profile_photo.jpg");
    }

    private void onDoneClicked()
    {
        saveProfile();
    }

    private void saveProfile()
    {
        Object obj = getFocusedChild();
        if (obj != null)
        {
            Keyboard.hideKeyboard(((View) (obj)));
        }
        progressController.showProgress();
        obj = editProfileSession.getUserPhotoFile();
        if (obj == null)
        {
            binder.bind(profileService.uploadProfileData(updateUserFields()), onSaveProfile);
            return;
        } else
        {
            binder.bind(profileService.uploadProfilePictureAndData(((File) (obj)), updateUserFields()), onSaveProfile);
            return;
        }
    }

    private void saveViewData()
    {
        editProfileSession.setUseSessionData(true);
        editProfileSession.setHometown(hometownTextView.getText().toString().trim());
        editProfileSession.setMusic(musicEditText.getText().toString().trim());
        editProfileSession.setAbout(aboutEditText.getText().toString().trim());
        editProfileSession.setShowMutualFriends(mutualFriendsSwitchToggle.isChecked());
    }

    private void setToolbarItemProperties(boolean flag)
    {
        TextView textview = (TextView)ButterKnife.a(toolbar.getToolbarItemView(0x7f0d000d), 0x7f0d0061);
        textview.setTypeface(null, 1);
        if (flag)
        {
            textview.setTextColor(getResources().getColor(0x7f0c000b));
            return;
        } else
        {
            textview.setTextColor(getResources().getColor(0x7f0c0065));
            return;
        }
    }

    private void setViewText(AdvancedEditText advancededittext, String s)
    {
        advancededittext.setText(s);
    }

    private void setViewTextHint(AdvancedEditText advancededittext, String s)
    {
        advancededittext.setHint(Html.fromHtml(getContext().getString(0x7f0702c4, new Object[] {
            s
        })));
    }

    private void updatePreview(File file)
    {
        profilePhotoLoader.usePhotoFilePreview(file);
        updateProfileImage();
    }

    private void updateProfileImage()
    {
        android.graphics.drawable.Drawable drawable = photoImageView.getDrawable();
        profilePhotoLoader.loadPreview().fit().centerCrop().placeholder(drawable).error(drawable).into(photoImageView);
    }

    private Profile updateUserFields()
    {
        Profile profile = new Profile();
        profile.setHometown(hometownTextView.getText().toString().trim());
        profile.setFavoriteMusic(musicEditText.getText().toString().trim());
        profile.setAboutMe(aboutEditText.getText().toString().trim());
        profile.setCanShowMutualFriends(mutualFriendsSwitchToggle.isChecked());
        return profile;
    }

    private void updateViews()
    {
        hometownTextView.setHint(Html.fromHtml(getContext().getString(0x7f0702c4, new Object[] {
            editProfileSession.getHometownHint()
        })));
        hometownTextView.setText(editProfileSession.getHometown());
        hometownTextView.setOnClickListener(new android.view.View.OnClickListener() {

            final EditProfileView this$0;

            public void onClick(View view)
            {
                saveViewData();
                appFlow.goTo(new ProfileScreens.ProfileHomeTownSearchScreen(editProfileSession));
            }

            
            {
                this$0 = EditProfileView.this;
                super();
            }
        });
        setViewTextHint(musicEditText, editProfileSession.getFavoriteMusicHint());
        setViewTextHint(aboutEditText, editProfileSession.getAboutMeHint());
        setViewText(musicEditText, editProfileSession.getMusic());
        setViewText(aboutEditText, editProfileSession.getAbout());
        mutualFriendsSwitchToggle.setChecked(editProfileSession.showMutualFriends());
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            Object obj = profileProvider.getMyProfile();
            editProfileSession = params.getEditProfileSession();
            me.lyft.android.domain.profile.ProfileFields profilefields = ProfileFieldMapper.fromDTOs(constantsProvider.getConstants().getProfileFields());
            editProfileSession.setDefaultProfileFields(profilefields);
            editProfileSession.setProfile(((Profile) (obj)));
            editProfileSession.setUserShowMutualFriends(((Profile) (obj)).isCanShowMutualFriends());
            binder = Binder.attach(this);
            binder.bind(toolbar.observeItemClick(), onToolbarItemClicked);
            binder.bind(toolbar.observeHomeClick(), onHomeClick);
            obj = photoPickerService.observePhotoPickerResult();
            binder.bind(((Observable) (obj)), onImageCaptured);
            binder.bind(ReactiveUI.isTrue(((Observable) (obj)).isEmpty()), onNoImageSelected);
            profilePhotoView.setOnClickListener(new android.view.View.OnClickListener() {

                final EditProfileView this$0;

                public void onClick(View view)
                {
                    if (profileService.isPassengerPhotoUploadEnabled())
                    {
                        appFlow.goTo(new ProfileScreens.UpdatePassengerPhotoFromEditProfileScreen(editProfileSession));
                        return;
                    } else
                    {
                        profilePhotoView.setClickable(false);
                        return;
                    }
                }

            
            {
                this$0 = EditProfileView.this;
                super();
            }
            });
            updateViews();
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.a(this);
            toolbar.setTitle(getContext().getString(0x7f0702c1)).addItem(0x7f0d000d, getContext().getString(0x7f0702c0));
            toolbar.setHomeIcon(0x7f0200ff);
            setToolbarItemProperties(true);
            facebookSettingsSwitcher();
            return;
        }
    }






}
