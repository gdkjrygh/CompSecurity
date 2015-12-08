// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.create.BoardSelectedEvent;
import com.pinterest.activity.create.model.PinnableImage;
import com.pinterest.activity.place.PlaceSelectedEvent;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.BoardFeed;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.Place;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.base.Application;
import com.pinterest.base.Constants;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.data.DiskCache;
import com.pinterest.kit.utils.ImageUtils;
import com.pinterest.kit.utils.LocaleUtils;
import com.pinterest.kit.utils.NetworkUtils;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.actions.Scrollable;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.text.IconTextView;
import com.pinterest.ui.text.PButton;
import java.io.IOException;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            RepinFragment, BoardPickerFragment

public abstract class CreateBaseFragment extends BaseFragment
    implements Scrollable
{

    private static final String BOARD_UID = "boardUid";
    private static final String CSR_METHOD_TYPE = "csr";
    private static final String IMAGE_URI = "imageUri";
    private static final String PLACE_UID = "placeUid";
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    protected boolean _hideSocialContainer;
    private Drawable _icChevron;
    private Drawable _icMap;
    protected PButton _negativeBtn;
    protected boolean _ontoSecretBoard;
    private android.view.View.OnClickListener _pinClick;
    protected PinnableImage _pinnableImage;
    protected PButton _positiveBtn;
    public WebImageView boardIv;
    public TextView boardTv;
    public String boardUid;
    protected IconTextView boardWrapper;
    private ComponentType componentType;
    protected EditText descriptionEt;
    public Uri imageUri;
    protected TextView locationTv;
    protected ViewGroup mainContent;
    protected android.view.View.OnClickListener onBoardsClicked;
    protected com.pinterest.api.remote.MyUserApi.BoardPickerApiResponse onBoardsLoaded;
    private android.view.View.OnClickListener onLocationEtClicked;
    protected WebImageView pinIv;
    public String placeUid;
    protected ScrollView scroller;

    public CreateBaseFragment()
    {
        _pinClick = new _cls1();
        _eventsSubscriber = new _cls2();
        onBoardsClicked = new _cls3();
        onLocationEtClicked = new _cls4();
        onBoardsLoaded = new _cls5();
        componentType = null;
    }

    private String getDescriptionText(Place place)
    {
        String s;
        String s1;
        String s2;
        if (place.getLocality() != null)
        {
            s = place.getLocality();
        } else
        {
            s = "";
        }
        if (place.getRegion() != null)
        {
            s1 = place.getRegion();
        } else
        {
            s1 = "";
        }
        if (place.getName() != null)
        {
            s2 = place.getName();
        } else
        {
            s2 = "";
        }
        if (s.length() > 0 && s1.length() > 0)
        {
            place = Resources.string(0x7f070459, new Object[] {
                s, s1
            });
        } else
        {
            place = s;
            if (s.length() <= 0)
            {
                place = s1;
            }
        }
        if (place.length() == 0)
        {
            return s2;
        } else
        {
            return Resources.string(0x7f070445, new Object[] {
                s2, place
            });
        }
    }

    private void setBoardSelector(Board board)
    {
        int i = 0;
        if (boardWrapper == null)
        {
            return;
        }
        if (board == null)
        {
            boardTv.setText(0x7f07019e);
            i = (int)Resources.dimension(0x7f0a0162);
            boardIv.setPadding(i, i, i, i);
            boardIv.setTintedDrawable(Resources.drawable(0x7f020180), 0x7f0e006d);
            boardIv.setBackgroundColor(Resources.color(0x106000d));
            return;
        }
        IconTextView icontextview;
        boolean flag;
        if (Constants.isTrue(board.getSecret()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _ontoSecretBoard = flag;
        _positiveBtn.setOnClickListener(_pinClick);
        boardUid = board.getUid();
        boardTv.setText(board.getName());
        icontextview = boardWrapper;
        if (!_ontoSecretBoard)
        {
            i = 8;
        }
        icontextview.setSecretIconVis(i);
        icontextview = boardWrapper;
        if (_ontoSecretBoard)
        {
            i = 0x7f07009d;
        } else
        {
            i = 0x7f07009c;
        }
        icontextview.setLabel(i);
        if (!ModelHelper.isValid(board.getImageCoverThumbnail()))
        {
            boardIv.setImageDrawable(null);
            return;
        } else
        {
            boardIv.loadUrl(board.getImageCoverThumbnail());
            return;
        }
    }

    protected void autoPickBoard()
    {
        if (boardWrapper == null || boardTv == null || boardIv == null)
        {
            return;
        }
        Object obj;
        if (StringUtils.isEmpty(boardUid))
        {
            obj = MyUser.getLastSelectedBoardId();
        } else
        {
            obj = boardUid;
        }
        obj = ModelHelper.getBoard(((String) (obj)));
        if (obj != null)
        {
            _positiveBtn.setOnClickListener(onBoardsClicked);
            setBoardSelector(((Board) (obj)));
            return;
        }
        obj = DiskCache.getJsonObject("MY_PICKER_BOARDS");
        if (obj != null)
        {
            _positiveBtn.setOnClickListener(onBoardsClicked);
            setBoardSelector((Board)(new BoardFeed(((com.pinterest.network.json.PinterestJsonObject) (obj)), null)).get(0));
            return;
        } else
        {
            showWaitDialog(0x7f070342);
            return;
        }
    }

    protected ComponentType getComponentType()
    {
        if (componentType == null)
        {
            componentType = ComponentType.MODAL_ADD_PIN;
            if (this instanceof RepinFragment)
            {
                componentType = ComponentType.MODAL_REPIN;
            }
        }
        return componentType;
    }

    protected com.pinterest.api.remote.PinApi.PinSubmitParams getPinSubmitParams()
    {
        com.pinterest.api.remote.PinApi.PinSubmitParams pinsubmitparams = new com.pinterest.api.remote.PinApi.PinSubmitParams();
        pinsubmitparams.a = String.valueOf(boardUid);
        pinsubmitparams.k = String.valueOf(placeUid);
        pinsubmitparams.b = descriptionEt.getText().toString();
        Object obj = getActivity();
        if (obj != null)
        {
            obj = ((Activity) (obj)).getIntent();
            if (obj != null)
            {
                obj = ((Intent) (obj)).getExtras();
                if (obj != null)
                {
                    String s = ((Bundle) (obj)).getString("com.pinterest.EXTRA_PARTNER_ID");
                    if (!TextUtils.isEmpty(s))
                    {
                        pinsubmitparams.j = s;
                    }
                    s = ((Bundle) (obj)).getString("com.pinterest.EXTRA_PARTNER_PACKAGE");
                    if (!TextUtils.isEmpty(s) && !s.equals(Application.context().getPackageName()))
                    {
                        pinsubmitparams.i = s;
                    }
                    s = ((Bundle) (obj)).getString("com.pinterest.EXTRA_PIN_CREATE_TYPE");
                    if (!TextUtils.isEmpty(s))
                    {
                        pinsubmitparams.l = s;
                    }
                    obj = ((Bundle) (obj)).getString("com.pinterest.EXTRA_CSR_ID");
                    if (!TextUtils.isEmpty(((CharSequence) (obj))))
                    {
                        pinsubmitparams.m = ((String) (obj));
                        pinsubmitparams.l = "csr";
                    }
                }
            }
        }
        return pinsubmitparams;
    }

    public abstract int getTitleId();

    protected void init(View view)
    {
        if (imageUri != null)
        {
            setImageUri(imageUri);
        }
    }

    public boolean isValid()
    {
        if (StringUtils.isEmpty(boardUid))
        {
            Application.showToast(0x7f070194);
            return false;
        }
        if (!NetworkUtils.getInstance().hasInternet())
        {
            Application.showNoInternetToast();
            return false;
        } else
        {
            return true;
        }
    }

    protected void navigateBoardSelectorFragment(Bundle bundle)
    {
        Pinalytics.a(getActivity(), com/pinterest/activity/create/fragment/BoardPickerFragment);
        BoardPickerFragment boardpickerfragment = new BoardPickerFragment();
        if (bundle != null)
        {
            boardpickerfragment.setArguments(bundle);
        }
        FragmentHelper.replaceFragment(getActivity(), boardpickerfragment, true);
    }

    public void onCreate(Bundle bundle)
    {
        setRetainInstance(true);
        super.onCreate(bundle);
        _layoutId = 0x7f0300bb;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (bundle != null)
        {
            boardUid = bundle.getString("boardUid");
            placeUid = bundle.getString("placeUid");
            imageUri = (Uri)bundle.getParcelable("imageUri");
        } else
        {
            boardUid = getActivity().getIntent().getStringExtra("com.pinterest.EXTRA_BOARD_ID");
            placeUid = getActivity().getIntent().getStringExtra("com.pinterest.EXTRA_PLACE_ID");
        }
        scroller = (ScrollView)layoutinflater.findViewById(0x7f0f0238);
        mainContent = (ViewGroup)layoutinflater.findViewById(0x7f0f01e6);
        pinIv = (WebImageView)layoutinflater.findViewById(0x7f0f0239);
        descriptionEt = (EditText)layoutinflater.findViewById(0x7f0f023b);
        locationTv = (TextView)layoutinflater.findViewById(0x7f0f023c);
        locationTv.setOnClickListener(onLocationEtClicked);
        boardWrapper = (IconTextView)layoutinflater.findViewById(0x7f0f023d);
        boardWrapper.setOnClickListener(onBoardsClicked);
        boardWrapper.setLabel(0x7f07009c);
        boardWrapper.setArrowVis(0);
        boardWrapper.setPaddingDimen(0x7f0a015f, 0x7f0a0159);
        boardTv = (TextView)boardWrapper.findViewById(0x7f0f0077);
        boardTv.setTypeface(Typeface.DEFAULT_BOLD);
        boardIv = (WebImageView)boardWrapper.findViewById(0x7f0f0325);
        _positiveBtn = (PButton)layoutinflater.findViewById(0x7f0f023e);
        _positiveBtn.setIconTint(0x106000b);
        if (LocaleUtils.isLanguageJa())
        {
            ViewHelper.setLeftDrawable(_positiveBtn, 0x7f0201d6);
            _positiveBtn.setText(0x7f0701a8);
            _positiveBtn.setTypeface(null, 1);
        } else
        {
            ViewHelper.setLeftDrawable(_positiveBtn, 0x7f0201d5);
        }
        _negativeBtn = (PButton)layoutinflater.findViewById(0x7f0f023f);
        _positiveBtn.setStyle(com.pinterest.ui.text.PButton.ButtonStyle.RED);
        _positiveBtn.setOnClickListener(_pinClick);
        MyUserApi.a(onBoardsLoaded, getApiTag());
        init(layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        pinIv.clear();
        super.onDestroyView();
    }

    public void onPause()
    {
        Device.hideSoftKeyboard(descriptionEt);
        Events.unregister(_eventsSubscriber);
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        Events.registerSticky(_eventsSubscriber, com/pinterest/activity/create/helper/CreateBoardHelper$BoardCreatedEvent, new Class[] {
            com/pinterest/activity/create/BoardSelectedEvent, com/pinterest/activity/place/PlaceSelectedEvent
        });
        autoPickBoard();
        updatePlaceDisplay(ModelHelper.getPlace(placeUid), descriptionEt.getText().toString());
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (boardUid != null)
        {
            bundle.putString("boardUid", boardUid);
        }
        if (imageUri != null)
        {
            bundle.putParcelable("imageUri", imageUri);
        }
        if (placeUid != null)
        {
            bundle.putString("placeUid", placeUid);
        }
        super.onSaveInstanceState(bundle);
    }

    public void onStart()
    {
        super.onStart();
        descriptionEt.clearFocus();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (_pinnableImage != null)
        {
            setPinnableImage(_pinnableImage);
        } else
        if (imageUri != null)
        {
            setImageUri(imageUri);
            return;
        }
    }

    public abstract void pin();

    public void scrollTo(int i, int j)
    {
        if (scroller != null)
        {
            scroller.smoothScrollTo(i, j);
        }
    }

    public void setImageUri(Uri uri)
    {
        imageUri = uri;
        try
        {
            uri = ImageUtils.imageFromUri(getActivity(), imageUri, 0, 0, 400, 267, false, null);
            pinIv.setImageBitmap(uri);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return;
        }
    }

    public void setNegativeButtonAction(String s, android.view.View.OnClickListener onclicklistener)
    {
        boolean flag = StringUtils.isEmpty(s);
        if (!flag)
        {
            _negativeBtn.setText(s);
            _negativeBtn.setOnClickListener(onclicklistener);
            _negativeBtn.setVisibility(0);
        } else
        {
            _negativeBtn.setVisibility(8);
        }
        s = (android.widget.RelativeLayout.LayoutParams)_positiveBtn.getLayoutParams();
        if (s != null)
        {
            byte byte0;
            if (flag)
            {
                byte0 = 14;
            } else
            {
                byte0 = 11;
            }
            s.addRule(byte0);
        }
    }

    public void setPinnableImage(PinnableImage pinnableimage)
    {
        _pinnableImage = pinnableimage;
        if (pinIv == null || descriptionEt == null)
        {
            return;
        }
        if (ModelHelper.isValidString(_pinnableImage.getImageUrl()))
        {
            pinIv.loadUrl(_pinnableImage.getImageUrl());
        }
        if (ModelHelper.isValidString(_pinnableImage.getDescription()))
        {
            descriptionEt.setText(_pinnableImage.getDescription());
        }
        updatePlaceDisplay(_pinnableImage.getPlace(), _pinnableImage.getDescription());
    }

    protected void showBoardSelector()
    {
        navigateBoardSelectorFragment(null);
    }

    public void storeImageUri(Uri uri)
    {
        imageUri = uri;
    }

    public void updateFromIntent()
    {
        updatePlaceDisplay(ModelHelper.getPlace(getActivity().getIntent().getStringExtra("com.pinterest.EXTRA_PLACE_ID")), descriptionEt.getText().toString());
    }

    public void updatePlaceDisplay(Place place, String s)
    {
        if (place != null && !place.getFromPinJoin().booleanValue())
        {
            if (_icChevron == null)
            {
                _icChevron = Resources.drawable(0x7f0200c3);
            }
            if (_icMap == null)
            {
                _icMap = Resources.drawable(0x7f0201cb);
            }
            getActivity().getIntent().putExtra("com.pinterest.EXTRA_PLACE_ID", place.getUid());
            locationTv.setText(place.getName());
            Object obj1 = locationTv;
            Object obj;
            Drawable drawable;
            if (place.canEdit())
            {
                obj = onLocationEtClicked;
            } else
            {
                obj = null;
            }
            ((TextView) (obj1)).setOnClickListener(((android.view.View.OnClickListener) (obj)));
            obj1 = locationTv;
            drawable = _icMap;
            if (place.canEdit())
            {
                obj = _icChevron;
            } else
            {
                obj = null;
            }
            ((TextView) (obj1)).setCompoundDrawablesWithIntrinsicBounds(drawable, null, ((Drawable) (obj)), null);
            obj1 = descriptionEt;
            obj = s;
            if (TextUtils.isEmpty(s))
            {
                obj = getDescriptionText(place);
            }
            ((EditText) (obj1)).setText(((CharSequence) (obj)));
            descriptionEt.setSelection(descriptionEt.getText().length());
        }
    }





    private class _cls1
        implements android.view.View.OnClickListener
    {

        final CreateBaseFragment this$0;

        public void onClick(View view)
        {
            if (!isValid() || !NetworkUtils.getInstance().hasInternet()) goto _L2; else goto _L1
_L1:
            if (!(CreateBaseFragment.this instanceof CreatePinFragment)) goto _L4; else goto _L3
_L3:
            showWaitDialog(0x7f0703af);
            (new AsyncPinTask()).execute(new Void[0]);
_L6:
            return;
_L4:
            if (CreateBaseFragment.this instanceof PinEditFragment)
            {
                pin();
                return;
            } else
            {
                _positiveBtn.setOnClickListener(null);
                pin();
                getActivity().onBackPressed();
                return;
            }
_L2:
            if (!NetworkUtils.getInstance().hasInternet())
            {
                _positiveBtn.setOnClickListener(null);
                getActivity().onBackPressed();
                Application.showNoInternetToast();
                return;
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        _cls1()
        {
            this$0 = CreateBaseFragment.this;
            super();
        }

        private class AsyncPinTask extends AsyncTask
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
                hideWaitDialog();
                FragmentActivity fragmentactivity = getActivity();
                if (fragmentactivity instanceof PinItActivity)
                {
                    if (((PinItActivity)fragmentactivity).isExternalIntent())
                    {
                        class _cls1
                            implements Runnable
                        {

                            final AsyncPinTask this$1;
                            final String val$message;

                            public void run()
                            {
                                Application.showToastShort(message);
                            }

                    _cls1()
                    {
                        this$1 = AsyncPinTask.this;
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
                        pressBackButton();
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

            AsyncPinTask()
            {
                this$0 = CreateBaseFragment.this;
                super();
            }
        }

    }


    private class _cls2
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final CreateBaseFragment this$0;

        public void onEventMainThread(BoardSelectedEvent boardselectedevent)
        {
            Events.removeStickyEvent(boardselectedevent);
            boardUid = boardselectedevent.getBoardId();
            autoPickBoard();
        }

        public void onEventMainThread(com.pinterest.activity.create.helper.CreateBoardHelper.BoardCreatedEvent boardcreatedevent)
        {
            Events.removeStickyEvent(boardcreatedevent);
            boardUid = boardcreatedevent.getBoardId();
            autoPickBoard();
        }

        public void onEventMainThread(PlaceSelectedEvent placeselectedevent)
        {
            Events.removeStickyEvent(placeselectedevent);
            placeUid = placeselectedevent.getSelectedPlace().getUid();
            getActivity().getIntent().putExtra("com.pinterest.EXTRA_PLACE_ID", placeUid);
            updatePlaceDisplay(placeselectedevent.getSelectedPlace(), descriptionEt.getText().toString());
        }

        _cls2()
        {
            this$0 = CreateBaseFragment.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final CreateBaseFragment this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.BOARD_PICKER, getComponentType());
            Device.hideSoftKeyboard(descriptionEt);
            showBoardSelector();
        }

        _cls3()
        {
            this$0 = CreateBaseFragment.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final CreateBaseFragment this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.ADD_PLACE_BUTTON);
            view = new Navigation(Location.PLACE_PICKER);
            view.putExtra("com.pinterest.EXTRA_MODE", com.pinterest.activity.place.fragment.PlacePickerFragment.Mode.EDIT);
            PlacePickerFragment placepickerfragment = new PlacePickerFragment();
            placepickerfragment.setNavigation(view);
            FragmentHelper.replaceFragment(getActivity(), placepickerfragment, true);
        }

        _cls4()
        {
            this$0 = CreateBaseFragment.this;
            super();
        }
    }


    private class _cls5 extends com.pinterest.api.remote.MyUserApi.BoardPickerApiResponse
    {

        final CreateBaseFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            try
            {
                if (DiskCache.getJsonObject("MY_PICKER_BOARDS") != null)
                {
                    break MISSING_BLOCK_LABEL_30;
                }
                throwable = getActivity();
            }
            // Misplaced declaration of an exception variable
            catch (Throwable throwable)
            {
                return;
            }
            if (throwable == null)
            {
                break MISSING_BLOCK_LABEL_30;
            }
            throwable.onBackPressed();
        }

        public void onFinish()
        {
            hideWaitDialog();
        }

        public void onSuccess(Feed feed)
        {
            super.onSuccess(feed);
            if (StringUtils.isEmpty(boardUid))
            {
                autoPickBoard();
            }
        }

        _cls5()
        {
            this$0 = CreateBaseFragment.this;
            super();
        }
    }

}
