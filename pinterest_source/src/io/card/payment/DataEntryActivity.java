// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DateKeyListener;
import android.text.method.DigitsKeyListener;
import android.util.Log;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import io.card.payment.i18n.LocalizedStrings;
import io.card.payment.i18n.StringKey;
import io.card.payment.ui.ActivityHelper;
import io.card.payment.ui.Appearance;
import io.card.payment.ui.ViewUtil;

// Referenced classes of package io.card.payment:
//            CreditCard, ExpiryValidator, Validator, CardIOActivity, 
//            CardType, FixedLengthValidator, CardNumberValidator, MaxLengthValidator, 
//            AlwaysValid

public final class DataEntryActivity extends Activity
    implements TextWatcher
{

    private final String TAG = getClass().getName();
    private TextView activityTitleTextView;
    private boolean autoAcceptDone;
    private Button cancelBtn;
    private CreditCard capture;
    private ImageView cardView;
    private EditText cvvEdit;
    private Validator cvvValidator;
    private int defaultTextColor;
    private Button doneBtn;
    private int editTextIdCounter;
    private EditText expiryEdit;
    private Validator expiryValidator;
    private String labelLeftPadding;
    private EditText numberEdit;
    private Validator numberValidator;
    private EditText postalCodeEdit;
    private Validator postalCodeValidator;
    private boolean useApplicationTheme;
    private int viewIdCounter;

    public DataEntryActivity()
    {
        viewIdCounter = 1;
        editTextIdCounter = 100;
    }

    private EditText advanceToNextEmptyField()
    {
        int i = 100;
        do
        {
            EditText edittext = (EditText)findViewById(i);
            if (edittext != null)
            {
                if (edittext.getText().length() == 0 && edittext.requestFocus())
                {
                    return edittext;
                }
            } else
            {
                return null;
            }
            i++;
        } while (true);
    }

    private void completed()
    {
        if (capture == null)
        {
            capture = new CreditCard();
        }
        if (expiryEdit != null)
        {
            capture.expiryMonth = ((ExpiryValidator)expiryValidator).month;
            capture.expiryYear = ((ExpiryValidator)expiryValidator).year;
        }
        CreditCard creditcard = new CreditCard(numberValidator.getValue(), capture.expiryMonth, capture.expiryYear, cvvValidator.getValue(), postalCodeValidator.getValue());
        Intent intent = new Intent();
        intent.putExtra("io.card.payment.scanResult", creditcard);
        if (getIntent().hasExtra("io.card.payment.capturedCardImage"))
        {
            intent.putExtra("io.card.payment.capturedCardImage", getIntent().getByteArrayExtra("io.card.payment.capturedCardImage"));
        }
        setResult(CardIOActivity.RESULT_CARD_INFO, intent);
        finish();
    }

    private void setDefaultColor(EditText edittext)
    {
        if (useApplicationTheme)
        {
            edittext.setTextColor(defaultTextColor);
            return;
        } else
        {
            edittext.setTextColor(0xff444444);
            return;
        }
    }

    private void validateAndEnableDoneButtonIfValid()
    {
        Button button = doneBtn;
        boolean flag;
        if (numberValidator.isValid() && expiryValidator.isValid() && cvvValidator.isValid() && postalCodeValidator.isValid())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        button.setEnabled(flag);
        Log.d(TAG, (new StringBuilder("setting doneBtn.enabled=")).append(doneBtn.isEnabled()).toString());
        if (autoAcceptDone && numberValidator.isValid() && expiryValidator.isValid() && cvvValidator.isValid() && postalCodeValidator.isValid())
        {
            completed();
        }
    }

    public final void afterTextChanged(Editable editable)
    {
        if (numberEdit == null || editable != numberEdit.getText()) goto _L2; else goto _L1
_L1:
        if (numberValidator.hasFullLength())
        {
            if (!numberValidator.isValid())
            {
                numberEdit.setTextColor(Appearance.TEXT_COLOR_ERROR);
            } else
            {
                setDefaultColor(numberEdit);
                advanceToNextEmptyField();
            }
        } else
        {
            setDefaultColor(numberEdit);
        }
        if (cvvEdit != null)
        {
            editable = CardType.fromCardNumber(numberValidator.getValue().toString());
            Object obj = (FixedLengthValidator)cvvValidator;
            int i = editable.cvvLength();
            obj.requiredLength = i;
            obj = cvvEdit;
            if (i == 4)
            {
                editable = "1234";
            } else
            {
                editable = "123";
            }
            ((EditText) (obj)).setHint(editable);
        }
_L4:
        validateAndEnableDoneButtonIfValid();
        return;
_L2:
        if (expiryEdit != null && editable == expiryEdit.getText())
        {
            if (expiryValidator.hasFullLength())
            {
                if (!expiryValidator.isValid())
                {
                    expiryEdit.setTextColor(Appearance.TEXT_COLOR_ERROR);
                } else
                {
                    setDefaultColor(expiryEdit);
                    advanceToNextEmptyField();
                }
            } else
            {
                setDefaultColor(expiryEdit);
            }
        } else
        if (cvvEdit != null && editable == cvvEdit.getText())
        {
            if (cvvValidator.hasFullLength())
            {
                if (!cvvValidator.isValid())
                {
                    cvvEdit.setTextColor(Appearance.TEXT_COLOR_ERROR);
                } else
                {
                    setDefaultColor(cvvEdit);
                    advanceToNextEmptyField();
                }
            } else
            {
                setDefaultColor(cvvEdit);
            }
        } else
        if (postalCodeEdit != null && editable == postalCodeEdit.getText())
        {
            if (postalCodeValidator.hasFullLength())
            {
                if (!postalCodeValidator.isValid())
                {
                    postalCodeEdit.setTextColor(Appearance.TEXT_COLOR_ERROR);
                } else
                {
                    setDefaultColor(postalCodeEdit);
                    advanceToNextEmptyField();
                }
            } else
            {
                setDefaultColor(postalCodeEdit);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onBackPressed()
    {
        setResult(CardIOActivity.RESULT_ENTRY_CANCELED);
        finish();
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Log.d(TAG, "onCreate()");
        if (getIntent().getExtras() == null)
        {
            onBackPressed();
            return;
        }
        useApplicationTheme = getIntent().getBooleanExtra("io.card.payment.keepApplicationTheme", false);
        ActivityHelper.setActivityTheme(this, useApplicationTheme);
        defaultTextColor = (new TextView(this)).getTextColors().getDefaultColor();
        RelativeLayout relativelayout;
        Object obj2;
        LinearLayout linearlayout;
        LinearLayout linearlayout1;
        android.widget.LinearLayout.LayoutParams layoutparams;
        LinearLayout linearlayout2;
        android.widget.LinearLayout.LayoutParams layoutparams1;
        int i;
        int l;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (ActivityHelper.holoSupported())
        {
            bundle = "12dip";
        } else
        {
            bundle = "2dip";
        }
        labelLeftPadding = bundle;
        LocalizedStrings.setLanguage(getIntent());
        l = ViewUtil.typedDimensionValueToPixelsInt("4dip", this);
        relativelayout = new RelativeLayout(this);
        if (!useApplicationTheme)
        {
            relativelayout.setBackgroundColor(Appearance.DEFAULT_BACKGROUND_COLOR);
        }
        bundle = new ScrollView(this);
        i = viewIdCounter;
        viewIdCounter = i + 1;
        bundle.setId(i);
        obj2 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(10);
        relativelayout.addView(bundle, ((android.view.ViewGroup.LayoutParams) (obj2)));
        linearlayout = new LinearLayout(this);
        linearlayout.setOrientation(1);
        bundle.addView(linearlayout, -1, -1);
        linearlayout1 = new LinearLayout(this);
        linearlayout1.setOrientation(1);
        layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        capture = (CreditCard)getIntent().getParcelableExtra("io.card.payment.scanResult");
        autoAcceptDone = getIntent().getBooleanExtra("debug_autoAcceptResult", false);
        if (capture != null)
        {
            numberValidator = new CardNumberValidator(capture.cardNumber);
            cardView = new ImageView(this);
            bundle = new android.widget.LinearLayout.LayoutParams(-1, -2);
            cardView.setPadding(0, 0, 0, l);
            bundle.weight = 1.0F;
            cardView.setImageBitmap(CardIOActivity.markedCardImage);
            linearlayout1.addView(cardView, bundle);
            ViewUtil.setMargins(cardView, null, null, null, "8dip");
        } else
        {
            activityTitleTextView = new TextView(this);
            activityTitleTextView.setTextSize(24F);
            if (!useApplicationTheme)
            {
                activityTitleTextView.setTextColor(Appearance.PAY_BLUE_COLOR);
            }
            linearlayout1.addView(activityTitleTextView);
            ViewUtil.setPadding(activityTitleTextView, null, null, null, "8dip");
            ViewUtil.setDimensions(activityTitleTextView, -2, -2);
            bundle = new LinearLayout(this);
            bundle.setOrientation(1);
            ViewUtil.setPadding(bundle, null, "4dip", null, "4dip");
            obj1 = new TextView(this);
            ViewUtil.setPadding(((View) (obj1)), labelLeftPadding, null, null, null);
            ((TextView) (obj1)).setText(LocalizedStrings.getString(StringKey.ENTRY_CARD_NUMBER));
            if (!useApplicationTheme)
            {
                ((TextView) (obj1)).setTextColor(Appearance.TEXT_COLOR_LABEL);
            }
            bundle.addView(((View) (obj1)), -2, -2);
            numberEdit = new EditText(this);
            obj1 = numberEdit;
            int k = editTextIdCounter;
            editTextIdCounter = k + 1;
            ((EditText) (obj1)).setId(k);
            numberEdit.setMaxLines(1);
            numberEdit.setImeOptions(6);
            numberEdit.setTextAppearance(getApplicationContext(), 0x1010040);
            numberEdit.setInputType(3);
            numberEdit.setHint("1234 5678 1234 5678");
            if (!useApplicationTheme)
            {
                numberEdit.setHintTextColor(0xffcccccc);
            }
            numberValidator = new CardNumberValidator();
            numberEdit.addTextChangedListener(numberValidator);
            numberEdit.addTextChangedListener(this);
            numberEdit.setFilters(new InputFilter[] {
                new DigitsKeyListener(), numberValidator
            });
            bundle.addView(numberEdit, -1, -2);
            linearlayout1.addView(bundle, -1, -1);
        }
        linearlayout2 = new LinearLayout(this);
        layoutparams1 = new android.widget.LinearLayout.LayoutParams(-1, -2);
        ViewUtil.setPadding(linearlayout2, null, "4dip", null, null);
        linearlayout2.setOrientation(0);
        flag = getIntent().getBooleanExtra("io.card.payment.requireExpiry", false);
        flag1 = getIntent().getBooleanExtra("io.card.payment.requireCVV", false);
        flag2 = getIntent().getBooleanExtra("io.card.payment.requirePostalCode", false);
        if (flag)
        {
            Object obj = new LinearLayout(this);
            bundle = new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F);
            ((LinearLayout) (obj)).setOrientation(1);
            Object obj3 = new TextView(this);
            if (!useApplicationTheme)
            {
                ((TextView) (obj3)).setTextColor(Appearance.TEXT_COLOR_LABEL);
            }
            ((TextView) (obj3)).setText(LocalizedStrings.getString(StringKey.ENTRY_EXPIRES));
            ViewUtil.setPadding(((View) (obj3)), labelLeftPadding, null, null, null);
            ((LinearLayout) (obj)).addView(((View) (obj3)), -2, -2);
            expiryEdit = new EditText(this);
            obj3 = expiryEdit;
            int j = editTextIdCounter;
            editTextIdCounter = j + 1;
            ((EditText) (obj3)).setId(j);
            expiryEdit.setMaxLines(1);
            expiryEdit.setImeOptions(6);
            expiryEdit.setTextAppearance(getApplicationContext(), 0x1010040);
            expiryEdit.setInputType(3);
            expiryEdit.setHint(LocalizedStrings.getString(StringKey.EXPIRES_PLACEHOLDER));
            if (!useApplicationTheme)
            {
                expiryEdit.setHintTextColor(0xffcccccc);
            }
            if (capture != null)
            {
                expiryValidator = new ExpiryValidator(capture.expiryMonth, capture.expiryYear);
            } else
            {
                expiryValidator = new ExpiryValidator();
            }
            if (expiryValidator.hasFullLength())
            {
                expiryEdit.setText(expiryValidator.getValue());
            }
            expiryEdit.addTextChangedListener(expiryValidator);
            expiryEdit.addTextChangedListener(this);
            expiryEdit.setFilters(new InputFilter[] {
                new DateKeyListener(), expiryValidator
            });
            ((LinearLayout) (obj)).addView(expiryEdit, -1, -2);
            linearlayout2.addView(((View) (obj)), bundle);
            if (flag1 || flag2)
            {
                bundle = "4dip";
            } else
            {
                bundle = null;
            }
            ViewUtil.setMargins(((View) (obj)), null, null, bundle, null);
        } else
        {
            expiryValidator = new AlwaysValid();
        }
        if (flag1)
        {
            obj3 = new LinearLayout(this);
            bundle = new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F);
            ((LinearLayout) (obj3)).setOrientation(1);
            obj = new TextView(this);
            if (!useApplicationTheme)
            {
                ((TextView) (obj)).setTextColor(Appearance.TEXT_COLOR_LABEL);
            }
            ViewUtil.setPadding(((View) (obj)), labelLeftPadding, null, null, null);
            ((TextView) (obj)).setText(LocalizedStrings.getString(StringKey.ENTRY_CVV));
            ((LinearLayout) (obj3)).addView(((View) (obj)), -2, -2);
            cvvEdit = new EditText(this);
            obj = cvvEdit;
            j = editTextIdCounter;
            editTextIdCounter = j + 1;
            ((EditText) (obj)).setId(j);
            cvvEdit.setMaxLines(1);
            cvvEdit.setImeOptions(6);
            cvvEdit.setTextAppearance(getApplicationContext(), 0x1010040);
            cvvEdit.setInputType(3);
            cvvEdit.setHint("123");
            if (!useApplicationTheme)
            {
                cvvEdit.setHintTextColor(0xffcccccc);
            }
            j = 4;
            if (capture != null)
            {
                j = CardType.fromCardNumber(numberValidator.getValue()).cvvLength();
            }
            cvvValidator = new FixedLengthValidator(j);
            cvvEdit.setFilters(new InputFilter[] {
                new DigitsKeyListener(), cvvValidator
            });
            cvvEdit.addTextChangedListener(cvvValidator);
            cvvEdit.addTextChangedListener(this);
            ((LinearLayout) (obj3)).addView(cvvEdit, -1, -2);
            linearlayout2.addView(((View) (obj3)), bundle);
            Object obj1;
            if (flag)
            {
                bundle = "4dip";
            } else
            {
                bundle = null;
            }
            if (flag2)
            {
                obj1 = "4dip";
            } else
            {
                obj1 = null;
            }
            ViewUtil.setMargins(((View) (obj3)), bundle, null, ((String) (obj1)), null);
        } else
        {
            cvvValidator = new AlwaysValid();
        }
        if (flag2)
        {
            obj1 = new LinearLayout(this);
            bundle = new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F);
            ((LinearLayout) (obj1)).setOrientation(1);
            obj3 = new TextView(this);
            if (!useApplicationTheme)
            {
                ((TextView) (obj3)).setTextColor(Appearance.TEXT_COLOR_LABEL);
            }
            ViewUtil.setPadding(((View) (obj3)), labelLeftPadding, null, null, null);
            ((TextView) (obj3)).setText(LocalizedStrings.getString(StringKey.ENTRY_POSTAL_CODE));
            ((LinearLayout) (obj1)).addView(((View) (obj3)), -2, -2);
            postalCodeEdit = new EditText(this);
            obj3 = postalCodeEdit;
            j = editTextIdCounter;
            editTextIdCounter = j + 1;
            ((EditText) (obj3)).setId(j);
            postalCodeEdit.setMaxLines(1);
            postalCodeEdit.setImeOptions(6);
            postalCodeEdit.setTextAppearance(getApplicationContext(), 0x1010040);
            postalCodeEdit.setInputType(1);
            if (!useApplicationTheme)
            {
                postalCodeEdit.setHintTextColor(0xffcccccc);
            }
            postalCodeValidator = new MaxLengthValidator(20);
            postalCodeEdit.addTextChangedListener(postalCodeValidator);
            postalCodeEdit.addTextChangedListener(this);
            ((LinearLayout) (obj1)).addView(postalCodeEdit, -1, -2);
            linearlayout2.addView(((View) (obj1)), bundle);
            if (flag || flag1)
            {
                bundle = "4dip";
            } else
            {
                bundle = null;
            }
            ViewUtil.setMargins(((View) (obj1)), bundle, null, null, null);
        } else
        {
            postalCodeValidator = new AlwaysValid();
        }
        linearlayout1.addView(linearlayout2, layoutparams1);
        linearlayout.addView(linearlayout1, layoutparams);
        ViewUtil.setMargins(linearlayout1, "16dip", "20dip", "16dip", "20dip");
        bundle = new LinearLayout(this);
        j = viewIdCounter;
        viewIdCounter = j + 1;
        bundle.setId(j);
        obj1 = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(12);
        bundle.setPadding(0, l, 0, 0);
        bundle.setBackgroundColor(0);
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(2, bundle.getId());
        doneBtn = new Button(this);
        obj2 = new android.widget.LinearLayout.LayoutParams(-1, -2, 1.0F);
        doneBtn.setText(LocalizedStrings.getString(StringKey.DONE));
        doneBtn.setOnClickListener(new _cls1());
        doneBtn.setEnabled(false);
        bundle.addView(doneBtn, ((android.view.ViewGroup.LayoutParams) (obj2)));
        ViewUtil.styleAsButton(doneBtn, true, this, useApplicationTheme);
        ViewUtil.setPadding(doneBtn, "5dip", null, "5dip", null);
        ViewUtil.setMargins(doneBtn, "8dip", "8dip", "8dip", "8dip");
        if (!useApplicationTheme)
        {
            doneBtn.setTextSize(16F);
        }
        cancelBtn = new Button(this);
        obj2 = new android.widget.LinearLayout.LayoutParams(-1, -2, 1.0F);
        cancelBtn.setText(LocalizedStrings.getString(StringKey.CANCEL));
        cancelBtn.setOnClickListener(new _cls2());
        bundle.addView(cancelBtn, ((android.view.ViewGroup.LayoutParams) (obj2)));
        ViewUtil.styleAsButton(cancelBtn, false, this, useApplicationTheme);
        ViewUtil.setPadding(cancelBtn, "5dip", null, "5dip", null);
        ViewUtil.setMargins(cancelBtn, "4dip", "8dip", "8dip", "8dip");
        if (!useApplicationTheme)
        {
            cancelBtn.setTextSize(16F);
        }
        relativelayout.addView(bundle, ((android.view.ViewGroup.LayoutParams) (obj1)));
        ActivityHelper.addActionBarIfSupported(this);
        setContentView(relativelayout);
        bundle = null;
        if (getIntent().getBooleanExtra("io.card.payment.intentSenderIsPayPal", true))
        {
            bundle = ViewUtil.base64ToBitmap("iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyRpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNiAoTWFjaW50b3NoKSIgeG1wTU06SW5zdGFuY2VJRD0ieG1wLmlpZDpCNDMzRTRFQ0M2MjQxMUUzOURBQ0E3QTY0NjU3OUI5QiIgeG1wTU06RG9jdW1lbnRJRD0ieG1wLmRpZDpCNDMzRTRFREM2MjQxMUUzOURBQ0E3QTY0NjU3OUI5QiI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOkI0MzNFNEVBQzYyNDExRTM5REFDQTdBNjQ2NTc5QjlCIiBzdFJlZjpkb2N1bWVudElEPSJ4bXAuZGlkOkI0MzNFNEVCQzYyNDExRTM5REFDQTdBNjQ2NTc5QjlCIi8+IDwvcmRmOkRlc2NyaXB0aW9uPiA8L3JkZjpSREY+IDwveDp4bXBtZXRhPiA8P3hwYWNrZXQgZW5kPSJyIj8+Eyd0MQAABoFJREFUeNrMWl1M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", this, 240);
            bundle = new BitmapDrawable(getResources(), bundle);
        }
        if (flag && expiryValidator.isValid())
        {
            afterTextChanged(expiryEdit.getEditableText());
        }
        ActivityHelper.setupActionBarIfSupported(this, activityTitleTextView, LocalizedStrings.getString(StringKey.MANUAL_ENTRY_TITLE), "card.io - ", bundle);
    }

    protected final void onResume()
    {
        super.onResume();
        Log.d(TAG, "onResume()");
        getWindow().setFlags(0, 1024);
        ActivityHelper.setFlagSecure(this);
        validateAndEnableDoneButtonIfValid();
        if (numberEdit == null && expiryEdit != null && !expiryValidator.isValid())
        {
            expiryEdit.requestFocus();
        } else
        {
            advanceToNextEmptyField();
        }
        if (numberEdit != null || expiryEdit != null || cvvEdit != null || postalCodeEdit != null)
        {
            getWindow().setSoftInputMode(5);
        }
        Log.i(TAG, "ready for manual entry");
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final DataEntryActivity this$0;

        public void onClick(View view)
        {
            completed();
        }

        _cls1()
        {
            this$0 = DataEntryActivity.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final DataEntryActivity this$0;

        public void onClick(View view)
        {
            onBackPressed();
        }

        _cls2()
        {
            this$0 = DataEntryActivity.this;
            super();
        }
    }

}
