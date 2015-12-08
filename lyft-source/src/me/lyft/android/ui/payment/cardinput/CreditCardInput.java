// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment.cardinput;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.lyft.scoop.Scoop;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import me.lyft.android.analytics.studies.PaymentAnalytics;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.common.IntegerExtensions;
import me.lyft.android.common.Objects;
import me.lyft.android.common.Strings;
import me.lyft.android.common.Unit;
import me.lyft.android.controls.AdvancedEditText;
import me.lyft.android.controls.SimpleTextWatcher;
import me.lyft.android.controls.ZipCodeFormattingTextWatcher;
import me.lyft.android.domain.User;
import me.lyft.android.domain.geo.Address;
import me.lyft.android.domain.payment.Card;
import me.lyft.android.domain.payment.ICard;
import me.lyft.android.infrastructure.cardscan.ICardScanService;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.Binder;
import me.lyft.android.utils.CardExtensions;
import me.lyft.android.utils.Keyboard;
import me.lyft.android.utils.MetricsUtils;
import rx.Observable;
import rx.functions.Action1;
import rx.subjects.PublishSubject;

// Referenced classes of package me.lyft.android.ui.payment.cardinput:
//            ZipCodeFormatRegistry, ZipCodeFormat, ZipCodeTextWatcher, CardExpiryFormattingTextWatcher, 
//            CVCTextWatcher, CardNumberFormattingTextWatcher

public class CreditCardInput extends LinearLayout
{

    private static final String INSTANCE_STATE = "instanceState";
    private static final String SELECTED_LOCALE = "selectedLocale";
    AdvancedEditText addressEditText;
    View billingAddressSpace;
    View billingAddressViewGroup;
    private Binder binder;
    AdvancedEditText cardNumberEditText;
    ICardScanService cardScanService;
    ImageView cardTypeImage;
    ImageView changeZipCodeCountryButton;
    AdvancedEditText cityEditText;
    TextView creditCardErrorTextView;
    private EditText currentEditText;
    AdvancedEditText cvcEditText;
    AdvancedEditText expiresEditText;
    IGeoService geoService;
    private Action1 onCreditCardScanned;
    PublishSubject onDonePressedSubject;
    private ArrayList onInputChangedListeners;
    private boolean requiresBillingAddress;
    private Resources resources;
    View scanCardButton;
    private String selectedCountryCode;
    private String selectedLocale;
    AdvancedEditText stateEditText;
    IUserProvider userProvider;
    private ZipCodeTextWatcher zipCodeTextWatcher;
    AdvancedEditText zipEditText;

    public CreditCardInput(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        onDonePressedSubject = PublishSubject.create();
        onInputChangedListeners = new ArrayList();
        onCreditCardScanned = new Action1() {

            final CreditCardInput this$0;

            public volatile void call(Object obj)
            {
                call((ICard)obj);
            }

            public void call(ICard icard)
            {
                clearCardEditTexts();
                cardNumberEditText.setTextAndMoveCursor(icard.getNumber());
                showSoftwareKeyboard();
            }

            
            {
                this$0 = CreditCardInput.this;
                super();
            }
        };
        setOrientation(1);
        init(context);
    }

    private ICard addBillingAddress(ICard icard)
    {
        icard.setAddressLine1(addressEditText.getText().toString().trim());
        icard.setCity(cityEditText.getText().toString().trim());
        icard.setState(stateEditText.getText().toString().trim());
        return icard;
    }

    private void applyZipCodeFormat()
    {
        byte byte0 = 1;
        ZipCodeFormat zipcodeformat = ZipCodeFormatRegistry.getZipCodeFormat(selectedLocale);
        android.text.InputFilter.LengthFilter lengthfilter = new android.text.InputFilter.LengthFilter(zipcodeformat.getMaxLength());
        zipEditText.setFilters(new InputFilter[] {
            lengthfilter
        });
        if (zipcodeformat.isDigitsOnly())
        {
            byte0 = 2;
        }
        resetZipCodeTextWatcher();
        zipEditText.setInputType(byte0);
        changeZipCodeCountryButton.setImageResource(zipcodeformat.getCountryFlagResourceId());
    }

    private void changeZipCodeCountry()
    {
        PaymentAnalytics.changeCardCountry();
        if (selectedLocale.equals(Locale.US.toString()))
        {
            selectedLocale = Locale.CANADA.toString();
            selectedCountryCode = Locale.CANADA.getCountry();
        } else
        {
            selectedLocale = Locale.US.toString();
            selectedCountryCode = Locale.US.getCountry();
        }
        zipEditText.setText("");
        resetAddressEditTexts();
        applyZipCodeFormat();
    }

    private void checkCardNumber()
    {
        if (getCard().validateNumber())
        {
            setFocus(expiresEditText);
            return;
        } else
        {
            playCardNumberErrorAnimation();
            return;
        }
    }

    private void checkCvc()
    {
        if (getCard().validateCVC())
        {
            setFocus(zipEditText);
        }
    }

    private void checkExpiry()
    {
        if (getCard().validateExpiryDate())
        {
            setFocus(cvcEditText);
        }
    }

    private String getDefaultCountryCode()
    {
        Locale locale = Locale.getDefault();
        if (locale == Locale.CANADA || locale == Locale.CANADA_FRENCH)
        {
            return Locale.CANADA.getCountry();
        } else
        {
            return Locale.US.getCountry();
        }
    }

    private EditText getFocusedEditText()
    {
        return (EditText)Objects.firstNonNull(currentEditText, cardNumberEditText);
    }

    private String getSafeDefaultLocale()
    {
        Locale locale = Locale.getDefault();
        if (locale == Locale.CANADA || locale == Locale.CANADA_FRENCH)
        {
            return Locale.CANADA.toString();
        } else
        {
            return Locale.US.toString();
        }
    }

    private void highlightBillingAddress()
    {
        if (Strings.isNullOrBlank(stateEditText.getText().toString()))
        {
            highlightEditTextAndSetFocus(stateEditText);
        }
        if (Strings.isNullOrBlank(cityEditText.getText().toString()))
        {
            highlightEditTextAndSetFocus(cityEditText);
        }
        if (Strings.isNullOrBlank(addressEditText.getText().toString()))
        {
            highlightEditTextAndSetFocus(addressEditText);
        }
    }

    private void highlightBillingAddressFields()
    {
        highlightEditText(stateEditText);
        highlightEditText(cityEditText);
        highlightEditTextAndSetFocus(addressEditText);
    }

    private void highlightCreditCard(ICard icard)
    {
        if (!icard.validateZip())
        {
            highlightEditTextAndSetFocus(zipEditText);
        }
        if (!icard.validateCVC())
        {
            highlightEditTextAndSetFocus(cvcEditText);
        }
        if (!icard.validateExpiryDate())
        {
            highlightEditTextAndSetFocus(expiresEditText);
        }
        if (!icard.validateNumber())
        {
            highlightEditTextAndSetFocus(cardNumberEditText);
        }
    }

    private void highlightEditText(AdvancedEditText advancededittext)
    {
        advancededittext.setTextColor(getResources().getColor(0x7f0c008f));
        advancededittext.setHintTextColor(getResources().getColor(0x7f0c008f));
        advancededittext.setValidationErrorId(Integer.valueOf(0x7f0d0161));
        advancededittext.showValidationMessage();
    }

    private void highlightEditTextAndSetFocus(AdvancedEditText advancededittext)
    {
        highlightEditText(advancededittext);
        setFocus(advancededittext);
    }

    private void init(Context context)
    {
        context = LayoutInflater.from(context).inflate(0x7f030047, this, true);
        resources = getResources();
        if (!isInEditMode())
        {
            Scoop.a(this).b(this);
            ButterKnife.a(this, context);
            selectedLocale = getSafeDefaultLocale();
            selectedCountryCode = getDefaultCountryCode();
            zipEditText.setOnKeyListener(new android.view.View.OnKeyListener() {

                final CreditCardInput this$0;

                public boolean onKey(View view, int i, KeyEvent keyevent)
                {
                    if (shouldGoBack(view, i))
                    {
                        setFocus(cvcEditText);
                        return true;
                    } else
                    {
                        return false;
                    }
                }

            
            {
                this$0 = CreditCardInput.this;
                super();
            }
            });
            cvcEditText.setOnKeyListener(new android.view.View.OnKeyListener() {

                final CreditCardInput this$0;

                public boolean onKey(View view, int i, KeyEvent keyevent)
                {
                    if (shouldGoBack(view, i))
                    {
                        setFocus(expiresEditText);
                        return true;
                    } else
                    {
                        return false;
                    }
                }

            
            {
                this$0 = CreditCardInput.this;
                super();
            }
            });
            expiresEditText.setOnKeyListener(new android.view.View.OnKeyListener() {

                final CreditCardInput this$0;

                public boolean onKey(View view, int i, KeyEvent keyevent)
                {
                    if (shouldGoBack(view, i))
                    {
                        setFocus(cardNumberEditText);
                        return true;
                    } else
                    {
                        return false;
                    }
                }

            
            {
                this$0 = CreditCardInput.this;
                super();
            }
            });
            cardNumberEditText.addTextChangedListener(new CardNumberFormattingTextWatcher() {

                final CreditCardInput this$0;

                public void onCardNumberChanged(String s)
                {
                    super.onCardNumberChanged(s);
                    updateCardTypeImage();
                    invokeInputChanged();
                }

                public void onMaxLengthReached()
                {
                    super.onMaxLengthReached();
                    checkCardNumber();
                }

            
            {
                this$0 = CreditCardInput.this;
                super();
            }
            });
            cardNumberEditText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

                final CreditCardInput this$0;

                public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
                {
                    if (i == 5 && getCard().validateNumber())
                    {
                        setFocus(expiresEditText);
                    }
                    return true;
                }

            
            {
                this$0 = CreditCardInput.this;
                super();
            }
            });
            cardNumberEditText.setOnFocusChangeListener(new OnCCInputFocusListener(this) {

                final CreditCardInput this$0;

                public void onFocusChange(View view, boolean flag)
                {
                    super.onFocusChange(view, flag);
                    if (flag)
                    {
                        updateCardTypeImage();
                    }
                }

            
            {
                this$0 = CreditCardInput.this;
                creditcardinput1. super();
            }
            });
            expiresEditText.addTextChangedListener(new CardExpiryFormattingTextWatcher() {

                final CreditCardInput this$0;

                public void onCardExpiryChanged(String s)
                {
                    super.onCardExpiryChanged(s);
                    invokeInputChanged();
                }

                public void onMaxLengthReached()
                {
                    super.onMaxLengthReached();
                    checkExpiry();
                }

            
            {
                this$0 = CreditCardInput.this;
                super();
            }
            });
            expiresEditText.setOnFocusChangeListener(new OnCCInputFocusListener(this) {
            private class OnCCInputFocusListener
                implements android.view.View.OnFocusChangeListener
            {

                private CreditCardInput input;

                public void onFocusChange(View view, boolean flag)
                {
                    if (flag)
                    {
                        input.currentEditText = (EditText)view;
                    }
                }

                protected OnCCInputFocusListener()
                {
                    input = CreditCardInput.this;
                }
            }


                final CreditCardInput this$0;

                public void onFocusChange(View view, boolean flag)
                {
                    super.onFocusChange(view, flag);
                    if (flag)
                    {
                        updateCardTypeImage();
                    }
                }

            
            {
                this$0 = CreditCardInput.this;
                creditcardinput1. super();
            }
            });
            expiresEditText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

                final CreditCardInput this$0;

                public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
                {
                    if (i == 5)
                    {
                        cvcEditText.requestFocusAndMoverCursor();
                    }
                    return false;
                }

            
            {
                this$0 = CreditCardInput.this;
                super();
            }
            });
            cvcEditText.addTextChangedListener(new CVCTextWatcher() {

                final CreditCardInput this$0;

                public String getCardType()
                {
                    return getCard().getType();
                }

                public void onCVCChanged(String s)
                {
                    super.onCVCChanged(s);
                    invokeInputChanged();
                }

                public void onMaxLengthReached()
                {
                    super.onMaxLengthReached();
                    checkCvc();
                }

            
            {
                this$0 = CreditCardInput.this;
                super();
            }
            });
            cvcEditText.setOnFocusChangeListener(new OnCCInputFocusListener(this) {

                final CreditCardInput this$0;

                public void onFocusChange(View view, boolean flag)
                {
                    super.onFocusChange(view, flag);
                    if (flag)
                    {
                        cardTypeImage.setImageResource(0x7f020068);
                    }
                }

            
            {
                this$0 = CreditCardInput.this;
                creditcardinput1. super();
            }
            });
            zipEditText.setOnFocusChangeListener(new OnCCInputFocusListener(this) {

                final CreditCardInput this$0;

                public void onFocusChange(View view, boolean flag)
                {
                    super.onFocusChange(view, flag);
                    if (flag)
                    {
                        updateCardTypeImage();
                    }
                }

            
            {
                this$0 = CreditCardInput.this;
                creditcardinput1. super();
            }
            });
            zipEditText.addTextChangedListener(new ZipCodeFormattingTextWatcher() {

                final CreditCardInput this$0;

                public void onZipCodeChanged(String s)
                {
                    super.onZipCodeChanged(s);
                    invokeInputChanged();
                }

            
            {
                this$0 = CreditCardInput.this;
                super();
            }
            });
            zipEditText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

                final CreditCardInput this$0;

                public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
                {
                    switch (i)
                    {
                    default:
                        return false;

                    case 6: // '\006'
                        onDonePressed();
                        return true;

                    case 5: // '\005'
                        addressEditText.requestFocusAndMoverCursor();
                        return true;
                    }
                }

            
            {
                this$0 = CreditCardInput.this;
                super();
            }
            });
            scanCardButton.setOnClickListener(new android.view.View.OnClickListener() {

                final CreditCardInput this$0;

                public void onClick(View view)
                {
                    cardScanService.startCardScan();
                }

            
            {
                this$0 = CreditCardInput.this;
                super();
            }
            });
            changeZipCodeCountryButton.setOnClickListener(new android.view.View.OnClickListener() {

                final CreditCardInput this$0;

                public void onClick(View view)
                {
                    changeZipCodeCountry();
                }

            
            {
                this$0 = CreditCardInput.this;
                super();
            }
            });
            addressEditText.addTextChangedListener(new SimpleTextWatcher() {

                final CreditCardInput this$0;

                public void onTextChanged(CharSequence charsequence, int i, int j, int k)
                {
                    super.onTextChanged(charsequence, i, j, k);
                    invokeInputChanged();
                }

            
            {
                this$0 = CreditCardInput.this;
                super();
            }
            });
            cityEditText.addTextChangedListener(new SimpleTextWatcher() {

                final CreditCardInput this$0;

                public void onTextChanged(CharSequence charsequence, int i, int j, int k)
                {
                    super.onTextChanged(charsequence, i, j, k);
                    invokeInputChanged();
                }

            
            {
                this$0 = CreditCardInput.this;
                super();
            }
            });
            stateEditText.addTextChangedListener(new SimpleTextWatcher() {

                final CreditCardInput this$0;

                public void onTextChanged(CharSequence charsequence, int i, int j, int k)
                {
                    super.onTextChanged(charsequence, i, j, k);
                    invokeInputChanged();
                }

            
            {
                this$0 = CreditCardInput.this;
                super();
            }
            });
        }
    }

    private void invokeInputChanged()
    {
        if (requiresBillingAddress)
        {
            billingAddressSpace.setVisibility(0);
        }
        if (onInputChangedListeners.size() > 0)
        {
            for (Iterator iterator = onInputChangedListeners.iterator(); iterator.hasNext(); ((OnInputChangedListener)iterator.next()).onInputChanged()) { }
        }
    }

    private void playCardNumberErrorAnimation()
    {
        highlightEditTextAndSetFocus(cardNumberEditText);
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(cardNumberEditText, "translationX", new float[] {
            (float)MetricsUtils.fromView(this).dpToPixels(-20F)
        });
        objectanimator.setInterpolator(new AccelerateInterpolator());
        objectanimator.setDuration(150L);
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(cardNumberEditText, "translationX", new float[] {
            0.0F
        });
        objectanimator1.setInterpolator(new BounceInterpolator());
        objectanimator1.setDuration(500L);
        AnimatorSet animatorset = new AnimatorSet();
        animatorset.playSequentially(new Animator[] {
            objectanimator, objectanimator1
        });
        animatorset.start();
    }

    private void prefillCityState(String s, String s1)
    {
        binder.bind(geoService.addressLookupFromZip(s, s1), new AsyncCall() {

            final CreditCardInput this$0;

            public volatile void onSuccess(Object obj)
            {
                onSuccess((Address)obj);
            }

            public void onSuccess(Address address)
            {
                if (address != null)
                {
                    if (Strings.isNullOrBlank(stateEditText.getText().toString()))
                    {
                        stateEditText.setText(address.getState());
                    }
                    if (Strings.isNullOrBlank(cityEditText.getText().toString()))
                    {
                        cityEditText.setText(address.getCity());
                    }
                }
            }

            
            {
                this$0 = CreditCardInput.this;
                super();
            }
        });
    }

    private void resetAddressEditTexts()
    {
        addressEditText.setText("");
        cityEditText.setText("");
        stateEditText.setText("");
    }

    private void resetEditTexts(int i, int j)
    {
        boolean flag = false;
        AdvancedEditText aadvancededittext[] = new AdvancedEditText[7];
        aadvancededittext[0] = cardNumberEditText;
        aadvancededittext[1] = expiresEditText;
        aadvancededittext[2] = cvcEditText;
        aadvancededittext[3] = zipEditText;
        aadvancededittext[4] = stateEditText;
        aadvancededittext[5] = cityEditText;
        aadvancededittext[6] = addressEditText;
        int k = resources.getColor(i);
        j = resources.getColor(j);
        int l = aadvancededittext.length;
        for (i = ((flag) ? 1 : 0); i < l; i++)
        {
            AdvancedEditText advancededittext = aadvancededittext[i];
            advancededittext.setTextColor(k);
            advancededittext.setHintTextColor(j);
            advancededittext.resetValidationError();
        }

    }

    private void resetZipCodeTextWatcher()
    {
        zipEditText.removeTextChangedListener(zipCodeTextWatcher);
        zipCodeTextWatcher = new ZipCodeTextWatcher(selectedLocale) {

            final CreditCardInput this$0;

            public void onMaxLengthReached()
            {
                super.onMaxLengthReached();
                if (requiresBillingAddress)
                {
                    addressEditText.requestFocusAndMoverCursor();
                    prefillCityState(zipEditText.getText().toString(), selectedCountryCode);
                }
            }

            
            {
                this$0 = CreditCardInput.this;
                super(s);
            }
        };
        zipEditText.addTextChangedListener(zipCodeTextWatcher);
    }

    private void setFocus(AdvancedEditText advancededittext)
    {
        currentEditText = advancededittext;
        advancededittext.requestFocusAndMoverCursor();
    }

    private boolean shouldGoBack(View view, int i)
    {
        return ((AdvancedEditText)view).isCursorAtStart() && i == 67;
    }

    private void updateCardTypeImage()
    {
        ICard icard = getCard();
        cardTypeImage.setImageResource(CardExtensions.getCardTypeImageResourceWithOutline(icard.getType()));
    }

    public void addOnInputChangedListener(OnInputChangedListener oninputchangedlistener)
    {
        onInputChangedListeners.add(oninputchangedlistener);
    }

    public void clearCardEditTexts()
    {
        int i = 0;
        AdvancedEditText aadvancededittext[] = new AdvancedEditText[4];
        aadvancededittext[0] = cardNumberEditText;
        aadvancededittext[1] = expiresEditText;
        aadvancededittext[2] = cvcEditText;
        aadvancededittext[3] = zipEditText;
        for (int j = aadvancededittext.length; i < j; i++)
        {
            aadvancededittext[i].setText("");
        }

    }

    public ICard getCard()
    {
        Integer integer = null;
        String s = cardNumberEditText.getText().toString();
        String s1 = cvcEditText.getText().toString();
        Object obj = expiresEditText.getText().toString();
        String s2 = zipEditText.getText().toString();
        if (!Strings.isNullOrEmpty(((String) (obj))))
        {
            String as[] = ((String) (obj)).split("/");
            Integer integer1 = IntegerExtensions.tryParse(as[0]);
            obj = integer1;
            if (as.length > 1)
            {
                integer = IntegerExtensions.tryParse(as[1]);
                obj = integer1;
            }
        } else
        {
            obj = null;
        }
        obj = Card.create(s, ((Integer) (obj)), integer, s1, s2, selectedLocale);
        if (requiresBillingAddress)
        {
            addBillingAddress(((ICard) (obj)));
        }
        return ((ICard) (obj));
    }

    public void highlightCreditCardFields()
    {
        highlightEditText(zipEditText);
        highlightEditText(expiresEditText);
        highlightEditText(cvcEditText);
        highlightEditTextAndSetFocus(cardNumberEditText);
    }

    public void highlightErrorFields()
    {
        ICard icard = getCard();
        if (requiresBillingAddress)
        {
            if (icard.isBillingAddressEmpty())
            {
                highlightBillingAddressFields();
            } else
            {
                highlightBillingAddress();
            }
        }
        if (icard.isEmpty())
        {
            highlightCreditCardFields();
            return;
        } else
        {
            highlightCreditCard(icard);
            return;
        }
    }

    public void highlightErrorFields(String s)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 5: default 56
    //                   -857379549: 112
    //                   -532441436: 97
    //                   -350486099: 157
    //                   2037370550: 127
    //                   2037392263: 142;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_157;
_L7:
        switch (byte0)
        {
        default:
            highlightCreditCardFields();
            return;

        case 0: // '\0'
            highlightEditTextAndSetFocus(expiresEditText);
            return;

        case 1: // '\001'
            highlightEditTextAndSetFocus(cardNumberEditText);
            return;

        case 2: // '\002'
            highlightEditText(cardNumberEditText);
            highlightEditTextAndSetFocus(cvcEditText);
            return;

        case 3: // '\003'
            highlightEditText(cardNumberEditText);
            highlightEditTextAndSetFocus(zipEditText);
            return;

        case 4: // '\004'
            highlightEditText(cityEditText);
            break;
        }
        break MISSING_BLOCK_LABEL_232;
_L3:
        if (s.equals("incorrect_expiration_date"))
        {
            byte0 = 0;
        }
          goto _L7
_L2:
        if (s.equals("incorrect_number"))
        {
            byte0 = 1;
        }
          goto _L7
_L5:
        if (s.equals("incorrect_cvc"))
        {
            byte0 = 2;
        }
          goto _L7
_L6:
        if (s.equals("incorrect_zip"))
        {
            byte0 = 3;
        }
          goto _L7
        if (s.equals("billing_address_rejected"))
        {
            byte0 = 4;
        }
          goto _L7
        highlightEditText(stateEditText);
        highlightEditTextAndSetFocus(addressEditText);
        return;
    }

    public Observable observeOnDonePressed()
    {
        return onDonePressedSubject.asObservable();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        }
        binder = Binder.attach(this);
        binder.bind(cardScanService.observeScannedCard(), onCreditCardScanned);
        applyZipCodeFormat();
        requiresBillingAddress = userProvider.getUser().isBillingAddressRequired();
        if (requiresBillingAddress)
        {
            billingAddressViewGroup.setVisibility(0);
            billingAddressSpace.setVisibility(0);
            zipEditText.setImeOptions(5);
        }
        addOnInputChangedListener(new OnInputChangedListener() {

            final CreditCardInput this$0;

            public void onInputChanged()
            {
                creditCardErrorTextView.setVisibility(8);
                resetHighlight();
                cardNumberEditText.setHint(0x7f070252);
            }

            
            {
                this$0 = CreditCardInput.this;
                super();
            }
        });
        stateEditText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final CreditCardInput this$0;

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                if (i == 6)
                {
                    onDonePressed();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = CreditCardInput.this;
                super();
            }
        });
    }

    protected void onDonePressed()
    {
        onDonePressedSubject.onNext(Unit.create());
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        Parcelable parcelable1 = parcelable;
        if (parcelable instanceof Bundle)
        {
            parcelable = (Bundle)parcelable;
            selectedLocale = parcelable.getString("selectedLocale");
            parcelable1 = parcelable.getParcelable("instanceState");
        }
        super.onRestoreInstanceState(parcelable1);
    }

    protected Parcelable onSaveInstanceState()
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putString("selectedLocale", selectedLocale);
        return bundle;
    }

    public void resetHighlight()
    {
        resetEditTexts(0x7f0c00b3, 0x7f0c006e);
    }

    public void setExistingCard(String s, String s1, boolean flag)
    {
        cardNumberEditText.setHint(Html.fromHtml(getResources().getString(0x7f070253, new Object[] {
            s
        })));
        if (flag)
        {
            highlightEditTextAndSetFocus(cardNumberEditText);
        }
        s = getCard().getType();
        cardTypeImage.setImageResource(CardExtensions.getCardTypeImageResourceWithOutline((String)Objects.firstNonNull(s, s1)));
    }

    public void showCreditCardInlineError(String s)
    {
        creditCardErrorTextView.setText(s);
        creditCardErrorTextView.setVisibility(0);
    }

    public void showSoftwareKeyboard()
    {
        Keyboard.showKeyboard(getFocusedEditText());
    }





/*
    static EditText access$1102(CreditCardInput creditcardinput, EditText edittext)
    {
        creditcardinput.currentEditText = edittext;
        return edittext;
    }

*/









    private class OnInputChangedListener
    {

        public abstract void onInputChanged();
    }

}
