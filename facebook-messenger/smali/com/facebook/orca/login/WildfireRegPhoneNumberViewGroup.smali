.class public Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;
.super Lcom/facebook/auth/login/m;
.source "WildfireRegPhoneNumberViewGroup.java"

# interfaces
.implements Lcom/facebook/orca/login/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/auth/login/m",
        "<",
        "Lcom/facebook/orca/login/j;",
        ">;",
        "Lcom/facebook/orca/login/i;"
    }
.end annotation


# static fields
.field public static final LOGO1_RESOURCE:Ljava/lang/String; = "orca:authparam:logo1"

.field public static final LOGO2_RESOURCE:Ljava/lang/String; = "orca:authparam:logo2"

.field private static final WTF_WILDFIRE_SIGNUP_CC_SELECTOR_SELECTED_NOTHING:Lcom/facebook/debug/log/l;


# instance fields
.field private mCountryCodeListAdapter:Landroid/widget/ArrayAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/widget/ArrayAdapter",
            "<",
            "Lcom/facebook/orca/login/n;",
            ">;"
        }
    .end annotation
.end field

.field private final mCountryCodeSpinner:Landroid/widget/Spinner;

.field private final mInputMethodManager:Landroid/view/inputmethod/InputMethodManager;

.field private final mNextButton:Landroid/widget/Button;

.field private mPhoneNumberFormattingTextWatcher:Landroid_src/d/a;

.field private final mPhoneNumberText:Landroid/widget/EditText;

.field private final mPhoneNumberUtil:Lcom/facebook/phonenumbers/PhoneNumberUtil;

.field private final mProgressIndicator:Lcom/facebook/fbservice/ops/ab;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 106
    new-instance v0, Lcom/facebook/debug/log/l;

    invoke-direct {v0}, Lcom/facebook/debug/log/l;-><init>()V

    sput-object v0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->WTF_WILDFIRE_SIGNUP_CC_SELECTOR_SELECTED_NOTHING:Lcom/facebook/debug/log/l;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/orca/login/j;)V
    .locals 10

    .prologue
    const/4 v2, 0x0

    .line 115
    invoke-direct {p0, p1, p2}, Lcom/facebook/auth/login/m;-><init>(Landroid/content/Context;Lcom/facebook/auth/login/c;)V

    .line 117
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->getInjector()Lcom/facebook/inject/t;

    move-result-object v1

    .line 118
    const-class v0, Lcom/facebook/phonenumbers/PhoneNumberUtil;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/phonenumbers/PhoneNumberUtil;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mPhoneNumberUtil:Lcom/facebook/phonenumbers/PhoneNumberUtil;

    .line 119
    const-class v0, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mInputMethodManager:Landroid/view/inputmethod/InputMethodManager;

    .line 121
    sget v0, Lcom/facebook/k;->orca_wildfire_reg_phone:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->setContentView(I)V

    .line 122
    sget v0, Lcom/facebook/i;->country_code_spinner:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mCountryCodeSpinner:Landroid/widget/Spinner;

    .line 124
    sget v0, Lcom/facebook/i;->phone_number:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mPhoneNumberText:Landroid/widget/EditText;

    .line 125
    sget v0, Lcom/facebook/i;->next:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mNextButton:Landroid/widget/Button;

    .line 126
    new-instance v0, Lcom/facebook/fbservice/ops/aa;

    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v3, Lcom/facebook/o;->wildfire_reg_request_sms_progress:I

    invoke-direct {v0, v1, v3}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mProgressIndicator:Lcom/facebook/fbservice/ops/ab;

    .line 129
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mCountryCodeSpinner:Landroid/widget/Spinner;

    new-instance v1, Lcom/facebook/orca/login/k;

    invoke-direct {v1, p0}, Lcom/facebook/orca/login/k;-><init>(Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 145
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mNextButton:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/orca/login/l;

    invoke-direct {v1, p0}, Lcom/facebook/orca/login/l;-><init>(Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 152
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mPhoneNumberText:Landroid/widget/EditText;

    new-instance v1, Lcom/facebook/orca/login/m;

    invoke-direct {v1, p0}, Lcom/facebook/orca/login/m;-><init>(Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 169
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 170
    invoke-static {}, Ljava/util/Locale;->getISOCountries()[Ljava/lang/String;

    move-result-object v3

    .line 171
    array-length v0, v3

    new-array v4, v0, [Lcom/facebook/orca/login/n;

    move v0, v2

    .line 172
    :goto_0
    array-length v5, v3

    if-ge v0, v5, :cond_0

    .line 173
    new-instance v5, Lcom/facebook/orca/login/n;

    aget-object v6, v3, v0

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "+"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v8, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mPhoneNumberUtil:Lcom/facebook/phonenumbers/PhoneNumberUtil;

    aget-object v9, v3, v0

    invoke-virtual {v8, v9}, Lcom/facebook/phonenumbers/PhoneNumberUtil;->getCountryCodeForRegion(Ljava/lang/String;)I

    move-result v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/util/Locale;

    aget-object v9, v3, v0

    invoke-direct {v8, v1, v9}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/util/Locale;->getDisplayCountry()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v5, p0, v6, v7, v8}, Lcom/facebook/orca/login/n;-><init>(Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    aput-object v5, v4, v0

    .line 172
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 178
    :cond_0
    invoke-static {v4}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 181
    new-instance v0, Landroid/widget/ArrayAdapter;

    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v3, Lcom/facebook/k;->orca_wildfire_reg_phone_spinner:I

    sget v5, Lcom/facebook/i;->country_code_text:I

    invoke-direct {v0, v1, v3, v5, v4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mCountryCodeListAdapter:Landroid/widget/ArrayAdapter;

    .line 186
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mCountryCodeSpinner:Landroid/widget/Spinner;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mCountryCodeListAdapter:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 188
    sget v0, Lcom/facebook/i;->name_logo1:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 189
    sget v1, Lcom/facebook/i;->name_logo2:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 190
    const-string v3, "orca:authparam:logo1"

    invoke-virtual {p0, v3, v2}, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->getResource(Ljava/lang/String;I)I

    move-result v3

    .line 191
    const-string v4, "orca:authparam:logo2"

    invoke-virtual {p0, v4, v2}, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->getResource(Ljava/lang/String;I)I

    move-result v2

    .line 193
    if-eqz v3, :cond_1

    .line 194
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 197
    :cond_1
    if-eqz v2, :cond_2

    .line 198
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 200
    :cond_2
    return-void
.end method

.method static synthetic access$000(Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->onCountryCodeChanged()V

    return-void
.end method

.method static synthetic access$100()Lcom/facebook/debug/log/l;
    .locals 1

    .prologue
    .line 39
    sget-object v0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->WTF_WILDFIRE_SIGNUP_CC_SELECTOR_SELECTED_NOTHING:Lcom/facebook/debug/log/l;

    return-object v0
.end method

.method static synthetic access$200(Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;)V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->onNextClick()V

    return-void
.end method

.method public static createParameterBundle(II)Landroid/os/Bundle;
    .locals 2

    .prologue
    .line 92
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 93
    const-string v1, "orca:authparam:logo1"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 94
    const-string v1, "orca:authparam:logo2"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 95
    return-object v0
.end method

.method private getSelectedCountryCode()Lcom/facebook/orca/login/n;
    .locals 1

    .prologue
    .line 234
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mCountryCodeSpinner:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/login/n;

    return-object v0
.end method

.method private onCountryCodeChanged()V
    .locals 4

    .prologue
    .line 203
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->getSelectedCountryCode()Lcom/facebook/orca/login/n;

    move-result-object v1

    .line 204
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->control:Lcom/facebook/auth/login/c;

    check-cast v0, Lcom/facebook/orca/login/j;

    iget-object v2, v1, Lcom/facebook/orca/login/n;->a:Ljava/lang/String;

    invoke-interface {v0, v2}, Lcom/facebook/orca/login/j;->a(Ljava/lang/String;)V

    .line 207
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mPhoneNumberFormattingTextWatcher:Landroid_src/d/a;

    if-eqz v0, :cond_1

    .line 208
    const/4 v0, 0x1

    .line 209
    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mPhoneNumberText:Landroid/widget/EditText;

    iget-object v3, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mPhoneNumberFormattingTextWatcher:Landroid_src/d/a;

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 214
    :goto_0
    new-instance v2, Landroid_src/d/a;

    iget-object v1, v1, Lcom/facebook/orca/login/n;->a:Ljava/lang/String;

    invoke-direct {v2, v1}, Landroid_src/d/a;-><init>(Ljava/lang/String;)V

    iput-object v2, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mPhoneNumberFormattingTextWatcher:Landroid_src/d/a;

    .line 215
    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mPhoneNumberText:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mPhoneNumberFormattingTextWatcher:Landroid_src/d/a;

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 217
    if-eqz v0, :cond_0

    .line 219
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mPhoneNumberText:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mPhoneNumberText:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setTextKeepState(Ljava/lang/CharSequence;)V

    .line 221
    :cond_0
    return-void

    .line 211
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private onNextClick()V
    .locals 4

    .prologue
    .line 224
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mPhoneNumberText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 225
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_0

    .line 231
    :goto_0
    return-void

    .line 229
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mInputMethodManager:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 230
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->control:Lcom/facebook/auth/login/c;

    check-cast v0, Lcom/facebook/orca/login/j;

    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->getSelectedCountryCode()Lcom/facebook/orca/login/n;

    move-result-object v2

    iget-object v2, v2, Lcom/facebook/orca/login/n;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/facebook/orca/login/j;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method


# virtual methods
.method public beginShowingProgress()V
    .locals 1

    .prologue
    .line 249
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mProgressIndicator:Lcom/facebook/fbservice/ops/ab;

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/ab;->a()V

    .line 250
    return-void
.end method

.method public setCountryCode(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 239
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mCountryCodeListAdapter:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0}, Landroid/widget/ArrayAdapter;->getCount()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 240
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mCountryCodeListAdapter:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/login/n;

    .line 241
    iget-object v0, v0, Lcom/facebook/orca/login/n;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 242
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mCountryCodeSpinner:Landroid/widget/Spinner;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setSelection(I)V

    .line 239
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 245
    :cond_1
    return-void
.end method

.method public stopShowingProgress()V
    .locals 1

    .prologue
    .line 254
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegPhoneNumberViewGroup;->mProgressIndicator:Lcom/facebook/fbservice/ops/ab;

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/ab;->b()V

    .line 255
    return-void
.end method
