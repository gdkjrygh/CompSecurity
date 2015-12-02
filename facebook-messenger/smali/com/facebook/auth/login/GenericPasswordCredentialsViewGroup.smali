.class public Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;
.super Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;
.source "GenericPasswordCredentialsViewGroup.java"

# interfaces
.implements Lcom/facebook/auth/login/bi;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/auth/login/AuthFragmentLogoViewGroup",
        "<",
        "Lcom/facebook/auth/login/bj;",
        ">;",
        "Lcom/facebook/auth/login/bi;"
    }
.end annotation


# instance fields
.field private final emailText:Landroid/widget/TextView;

.field private final inputMethodManager:Landroid/view/inputmethod/InputMethodManager;

.field private final loginButton:Landroid/widget/Button;

.field private final notYouLink:Landroid/widget/TextView;

.field private final passwordText:Landroid/widget/TextView;

.field private final signupButton:Landroid/widget/Button;

.field private final userDisplay:Landroid/view/View;

.field private final userName:Landroid/widget/TextView;

.field private final userPhoto:Lcom/facebook/widget/images/UrlImage;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/auth/login/bj;)V
    .locals 4

    .prologue
    .line 53
    invoke-direct {p0, p1, p2}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;-><init>(Landroid/content/Context;Lcom/facebook/auth/login/c;)V

    .line 55
    invoke-virtual {p0}, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->getInjector()Lcom/facebook/inject/t;

    move-result-object v0

    .line 56
    const-class v1, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iput-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->inputMethodManager:Landroid/view/inputmethod/InputMethodManager;

    .line 58
    sget v0, Lcom/facebook/i;->user_display:I

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->userDisplay:Landroid/view/View;

    .line 59
    sget v0, Lcom/facebook/i;->user_photo:I

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    iput-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->userPhoto:Lcom/facebook/widget/images/UrlImage;

    .line 60
    sget v0, Lcom/facebook/i;->user_name:I

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->userName:Landroid/widget/TextView;

    .line 61
    sget v0, Lcom/facebook/i;->not_you_link:I

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->notYouLink:Landroid/widget/TextView;

    .line 62
    sget v0, Lcom/facebook/i;->email:I

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->emailText:Landroid/widget/TextView;

    .line 63
    sget v0, Lcom/facebook/i;->password:I

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->passwordText:Landroid/widget/TextView;

    .line 64
    sget v0, Lcom/facebook/i;->login:I

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->loginButton:Landroid/widget/Button;

    .line 65
    sget v0, Lcom/facebook/i;->signup:I

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->signupButton:Landroid/widget/Button;

    .line 68
    new-instance v0, Lcom/facebook/widget/text/CustomUrlLikeSpan;

    invoke-direct {v0}, Lcom/facebook/widget/text/CustomUrlLikeSpan;-><init>()V

    .line 69
    invoke-virtual {p0}, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 70
    new-instance v2, Lcom/facebook/common/w/o;

    invoke-direct {v2, v1}, Lcom/facebook/common/w/o;-><init>(Landroid/content/res/Resources;)V

    .line 71
    const/16 v3, 0x21

    invoke-virtual {v2, v0, v3}, Lcom/facebook/common/w/o;->a(Ljava/lang/Object;I)Lcom/facebook/common/w/o;

    .line 72
    sget v0, Lcom/facebook/o;->start_screen_sso_text_not_you_link:I

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;)Lcom/facebook/common/w/o;

    .line 73
    invoke-virtual {v2}, Lcom/facebook/common/w/o;->a()Lcom/facebook/common/w/o;

    .line 74
    iget-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->notYouLink:Landroid/widget/TextView;

    invoke-virtual {v2}, Lcom/facebook/common/w/o;->b()Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    iget-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->notYouLink:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSaveEnabled(Z)V

    .line 77
    iget-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->notYouLink:Landroid/widget/TextView;

    new-instance v1, Lcom/facebook/auth/login/ah;

    invoke-direct {v1, p0}, Lcom/facebook/auth/login/ah;-><init>(Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 83
    iget-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->loginButton:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/auth/login/ai;

    invoke-direct {v1, p0}, Lcom/facebook/auth/login/ai;-><init>(Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 89
    iget-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->signupButton:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/auth/login/aj;

    invoke-direct {v1, p0}, Lcom/facebook/auth/login/aj;-><init>(Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 96
    iget-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->passwordText:Landroid/widget/TextView;

    new-instance v1, Lcom/facebook/auth/login/ak;

    invoke-direct {v1, p0}, Lcom/facebook/auth/login/ak;-><init>(Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 109
    iget-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->passwordText:Landroid/widget/TextView;

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 110
    return-void
.end method

.method static synthetic access$000(Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->clearUser()V

    return-void
.end method

.method static synthetic access$100(Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;)V
    .locals 0

    .prologue
    .line 36
    invoke-direct {p0}, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->onLoginClick()V

    return-void
.end method

.method private clearUser()V
    .locals 2

    .prologue
    .line 155
    iget-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->control:Lcom/facebook/auth/login/c;

    check-cast v0, Lcom/facebook/auth/login/bj;

    invoke-interface {v0}, Lcom/facebook/auth/login/bj;->Q()V

    .line 156
    iget-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->emailText:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 158
    iget-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->userDisplay:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 159
    iget-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->emailText:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 160
    return-void
.end method

.method private onLoginClick()V
    .locals 5

    .prologue
    .line 118
    iget-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->emailText:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 119
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    if-gtz v0, :cond_1

    .line 130
    :cond_0
    :goto_0
    return-void

    .line 122
    :cond_1
    iget-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->passwordText:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 123
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 127
    iget-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->inputMethodManager:Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {p0}, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->getWindowToken()Landroid/os/IBinder;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 128
    iget-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->control:Lcom/facebook/auth/login/c;

    check-cast v0, Lcom/facebook/auth/login/bj;

    new-instance v3, Lcom/facebook/auth/credentials/PasswordCredentials;

    invoke-direct {v3, v1, v2}, Lcom/facebook/auth/credentials/PasswordCredentials;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/facebook/fbservice/ops/aa;

    invoke-virtual {p0}, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v4, Lcom/facebook/o;->login_screen_login_progress:I

    invoke-direct {v1, v2, v4}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;I)V

    invoke-interface {v0, v3, v1}, Lcom/facebook/auth/login/bj;->a(Lcom/facebook/auth/credentials/PasswordCredentials;Lcom/facebook/fbservice/ops/ab;)V

    goto :goto_0
.end method


# virtual methods
.method protected getDefaultLayoutResource()I
    .locals 1

    .prologue
    .line 114
    sget v0, Lcom/facebook/k;->orca_login:I

    return v0
.end method

.method protected onSignupClick()V
    .locals 4

    .prologue
    .line 133
    const-string v0, "https://m.facebook.com/r.php"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v1

    .line 134
    const-string v0, "locale"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/k/a;->a(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 135
    iget-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->control:Lcom/facebook/auth/login/c;

    check-cast v0, Lcom/facebook/auth/login/bj;

    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-interface {v0, v2}, Lcom/facebook/auth/login/bj;->b(Landroid/content/Intent;)V

    .line 136
    return-void
.end method

.method protected setSignupButtonText(I)V
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->signupButton:Landroid/widget/Button;

    invoke-virtual {v0, p1}, Landroid/widget/Button;->setText(I)V

    .line 140
    return-void
.end method

.method public setUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 146
    iget-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->emailText:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 147
    iget-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->userName:Landroid/widget/TextView;

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 148
    iget-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->userPhoto:Lcom/facebook/widget/images/UrlImage;

    invoke-static {p3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Landroid/net/Uri;)V

    .line 150
    iget-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->emailText:Landroid/widget/TextView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 151
    iget-object v0, p0, Lcom/facebook/auth/login/GenericPasswordCredentialsViewGroup;->userDisplay:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 152
    return-void
.end method
