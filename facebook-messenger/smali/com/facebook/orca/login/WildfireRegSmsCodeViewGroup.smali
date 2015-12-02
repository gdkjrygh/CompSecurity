.class public Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;
.super Lcom/facebook/auth/login/m;
.source "WildfireRegSmsCodeViewGroup.java"

# interfaces
.implements Lcom/facebook/orca/login/p;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/auth/login/m",
        "<",
        "Lcom/facebook/orca/login/q;",
        ">;",
        "Lcom/facebook/orca/login/p;"
    }
.end annotation


# static fields
.field public static final LOGO1_RESOURCE:Ljava/lang/String; = "orca:authparam:logo1"

.field public static final LOGO2_RESOURCE:Ljava/lang/String; = "orca:authparam:logo2"

.field private static final TAG:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final mInputMethodManager:Landroid/view/inputmethod/InputMethodManager;

.field private final mNextButton:Landroid/widget/Button;

.field private final mProgressIndicator:Lcom/facebook/fbservice/ops/ab;

.field private final mSmsCodeErrorIcon:Landroid/graphics/drawable/Drawable;

.field private final mSmsCodePrompt:Landroid/widget/TextView;

.field private final mSmsCodeText:Landroid/widget/EditText;

.field private final mTryAgainButton:Landroid/widget/Button;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 40
    const-class v0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;

    sput-object v0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->TAG:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/orca/login/q;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 87
    invoke-direct {p0, p1, p2}, Lcom/facebook/auth/login/m;-><init>(Landroid/content/Context;Lcom/facebook/auth/login/c;)V

    .line 89
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->getInjector()Lcom/facebook/inject/t;

    move-result-object v0

    .line 90
    const-class v1, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mInputMethodManager:Landroid/view/inputmethod/InputMethodManager;

    .line 92
    sget v0, Lcom/facebook/k;->orca_wildfire_reg_sms_code:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->setContentView(I)V

    .line 93
    sget v0, Lcom/facebook/i;->sms_code_prompt:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mSmsCodePrompt:Landroid/widget/TextView;

    .line 94
    sget v0, Lcom/facebook/i;->sms_code:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mSmsCodeText:Landroid/widget/EditText;

    .line 95
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/facebook/h;->orca_field_error_icon:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mSmsCodeErrorIcon:Landroid/graphics/drawable/Drawable;

    .line 96
    sget v0, Lcom/facebook/i;->try_again:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mTryAgainButton:Landroid/widget/Button;

    .line 97
    sget v0, Lcom/facebook/i;->next:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mNextButton:Landroid/widget/Button;

    .line 98
    new-instance v0, Lcom/facebook/fbservice/ops/aa;

    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/facebook/o;->wildfire_reg_verification_progress:I

    invoke-direct {v0, v1, v2}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mProgressIndicator:Lcom/facebook/fbservice/ops/ab;

    .line 101
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mTryAgainButton:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/orca/login/r;

    invoke-direct {v1, p0}, Lcom/facebook/orca/login/r;-><init>(Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 108
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mNextButton:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/orca/login/s;

    invoke-direct {v1, p0}, Lcom/facebook/orca/login/s;-><init>(Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 115
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mSmsCodeText:Landroid/widget/EditText;

    new-instance v1, Lcom/facebook/orca/login/t;

    invoke-direct {v1, p0}, Lcom/facebook/orca/login/t;-><init>(Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;)V

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 131
    sget v0, Lcom/facebook/i;->name_logo1:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 132
    sget v1, Lcom/facebook/i;->name_logo2:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 133
    const-string v2, "orca:authparam:logo1"

    invoke-virtual {p0, v2, v4}, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->getResource(Ljava/lang/String;I)I

    move-result v2

    .line 134
    const-string v3, "orca:authparam:logo2"

    invoke-virtual {p0, v3, v4}, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->getResource(Ljava/lang/String;I)I

    move-result v3

    .line 136
    if-eqz v2, :cond_0

    .line 137
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 140
    :cond_0
    if-eqz v3, :cond_1

    .line 141
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 143
    :cond_1
    return-void
.end method

.method static synthetic access$000(Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->onTryAgainClick()V

    return-void
.end method

.method static synthetic access$100(Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->onNextClick()V

    return-void
.end method

.method static synthetic access$200(Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;)Lcom/facebook/auth/login/c;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->control:Lcom/facebook/auth/login/c;

    return-object v0
.end method

.method public static createParameterBundle(II)Landroid/os/Bundle;
    .locals 2

    .prologue
    .line 69
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 70
    const-string v1, "orca:authparam:logo1"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 71
    const-string v1, "orca:authparam:logo2"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 72
    return-object v0
.end method

.method private getDrawableBoundsForEditText(Landroid/widget/EditText;Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 192
    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/widget/EditText;->getHeight()I

    move-result v1

    invoke-virtual {p1}, Landroid/widget/EditText;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p1}, Landroid/widget/EditText;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p1}, Landroid/widget/EditText;->getHeight()I

    move-result v2

    invoke-virtual {p1}, Landroid/widget/EditText;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p1}, Landroid/widget/EditText;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-direct {v0, v4, v4, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method private onNextClick()V
    .locals 4

    .prologue
    .line 152
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mSmsCodeText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 153
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_0

    .line 159
    :goto_0
    return-void

    .line 157
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mInputMethodManager:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 158
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->control:Lcom/facebook/auth/login/c;

    check-cast v0, Lcom/facebook/orca/login/q;

    invoke-interface {v0, v1}, Lcom/facebook/orca/login/q;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private onTryAgainClick()V
    .locals 4

    .prologue
    .line 146
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mInputMethodManager:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 147
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->control:Lcom/facebook/auth/login/c;

    check-cast v0, Lcom/facebook/orca/login/q;

    new-instance v1, Lcom/facebook/fbservice/ops/aa;

    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/facebook/o;->wildfire_reg_request_sms_progress:I

    invoke-direct {v1, v2, v3}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;I)V

    invoke-interface {v0, v1}, Lcom/facebook/orca/login/q;->a(Lcom/facebook/fbservice/ops/ab;)V

    .line 149
    return-void
.end method


# virtual methods
.method public beginShowingProgress()V
    .locals 1

    .prologue
    .line 226
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mProgressIndicator:Lcom/facebook/fbservice/ops/ab;

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/ab;->a()V

    .line 227
    return-void
.end method

.method public hideSmsCodeError()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 209
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mSmsCodeText:Landroid/widget/EditText;

    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/widget/EditText;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 211
    return-void
.end method

.method public setSmsCode(Ljava/lang/String;Z)V
    .locals 2

    .prologue
    .line 215
    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mSmsCodeText:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 216
    :cond_0
    sget-object v0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->TAG:Ljava/lang/Class;

    const-string v1, "Pre-filling confirmation code field and submitting it."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->c(Ljava/lang/Class;Ljava/lang/String;)V

    .line 217
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mSmsCodeText:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 218
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->onNextClick()V

    .line 222
    :goto_0
    return-void

    .line 220
    :cond_1
    sget-object v0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->TAG:Ljava/lang/Class;

    const-string v1, "Not pre-filling confirmation code field!"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public setSmsCodePrompt(Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 163
    new-instance v0, Lcom/facebook/widget/text/CustomUrlLikeSpan;

    invoke-direct {v0}, Lcom/facebook/widget/text/CustomUrlLikeSpan;-><init>()V

    .line 164
    new-instance v1, Lcom/facebook/orca/login/u;

    invoke-direct {v1, p0}, Lcom/facebook/orca/login/u;-><init>(Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/text/CustomUrlLikeSpan;->a(Lcom/facebook/widget/text/f;)V

    .line 171
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 172
    new-instance v2, Lcom/facebook/common/w/o;

    invoke-direct {v2, v1}, Lcom/facebook/common/w/o;-><init>(Landroid/content/res/Resources;)V

    .line 173
    invoke-virtual {v2, p1}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;)Lcom/facebook/common/w/o;

    .line 174
    const-string v3, "[[edit_phone_link]]"

    sget v4, Lcom/facebook/o;->wildfire_reg_edit_phone_number:I

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/16 v4, 0x21

    invoke-virtual {v2, v3, v1, v0, v4}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Lcom/facebook/common/w/o;

    .line 179
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mSmsCodePrompt:Landroid/widget/TextView;

    invoke-virtual {v2}, Lcom/facebook/common/w/o;->b()Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 180
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mSmsCodePrompt:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 181
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mSmsCodePrompt:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSaveEnabled(Z)V

    .line 182
    return-void
.end method

.method public setSmsCodePromptResource(I)V
    .locals 1

    .prologue
    .line 186
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->setSmsCodePrompt(Ljava/lang/String;)V

    .line 187
    return-void
.end method

.method public showSmsCodeError()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 201
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mSmsCodeErrorIcon:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mSmsCodeText:Landroid/widget/EditText;

    iget-object v2, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mSmsCodeErrorIcon:Landroid/graphics/drawable/Drawable;

    invoke-direct {p0, v1, v2}, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->getDrawableBoundsForEditText(Landroid/widget/EditText;Landroid/graphics/drawable/Drawable;)Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 203
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mSmsCodeText:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mSmsCodeErrorIcon:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v3, v3, v1, v3}, Landroid/widget/EditText;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 205
    return-void
.end method

.method public stopShowingProgress()V
    .locals 1

    .prologue
    .line 231
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegSmsCodeViewGroup;->mProgressIndicator:Lcom/facebook/fbservice/ops/ab;

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/ab;->b()V

    .line 232
    return-void
.end method
