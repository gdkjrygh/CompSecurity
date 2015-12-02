.class public Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;
.super Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;
.source "GenericFirstPartySsoViewGroup.java"

# interfaces
.implements Lcom/facebook/auth/login/ab;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/auth/login/AuthFragmentLogoViewGroup",
        "<",
        "Lcom/facebook/auth/login/ac;",
        ">;",
        "Lcom/facebook/auth/login/ab;"
    }
.end annotation


# instance fields
.field private final loginButton:Landroid/widget/Button;

.field private final loginText:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/auth/login/ac;)V
    .locals 2

    .prologue
    .line 34
    invoke-direct {p0, p1, p2}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;-><init>(Landroid/content/Context;Lcom/facebook/auth/login/c;)V

    .line 36
    sget v0, Lcom/facebook/i;->login:I

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;->loginButton:Landroid/widget/Button;

    .line 37
    sget v0, Lcom/facebook/i;->login_sso_text:I

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;->loginText:Landroid/widget/TextView;

    .line 38
    iget-object v0, p0, Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;->loginText:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 39
    iget-object v0, p0, Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;->loginButton:Landroid/widget/Button;

    new-instance v1, Lcom/facebook/auth/login/ad;

    invoke-direct {v1, p0}, Lcom/facebook/auth/login/ad;-><init>(Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 45
    return-void
.end method

.method static synthetic access$000(Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;->onLoginClicked()V

    return-void
.end method

.method static synthetic access$100(Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;->onNotYouClicked()V

    return-void
.end method

.method private onLoginClicked()V
    .locals 4

    .prologue
    .line 84
    iget-object v0, p0, Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;->control:Lcom/facebook/auth/login/c;

    check-cast v0, Lcom/facebook/auth/login/ac;

    new-instance v1, Lcom/facebook/fbservice/ops/aa;

    invoke-virtual {p0}, Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, Lcom/facebook/o;->login_screen_login_progress:I

    invoke-direct {v1, v2, v3}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;I)V

    invoke-interface {v0, v1}, Lcom/facebook/auth/login/ac;->a(Lcom/facebook/fbservice/ops/ab;)V

    .line 86
    return-void
.end method

.method private onNotYouClicked()V
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;->control:Lcom/facebook/auth/login/c;

    check-cast v0, Lcom/facebook/auth/login/ac;

    invoke-interface {v0}, Lcom/facebook/auth/login/ac;->Q()V

    .line 81
    return-void
.end method


# virtual methods
.method protected getDefaultLayoutResource()I
    .locals 1

    .prologue
    .line 49
    sget v0, Lcom/facebook/k;->orca_login_start_screen:I

    return v0
.end method

.method public setSsoSessionInfo(Lcom/facebook/auth/credentials/b;)V
    .locals 6

    .prologue
    const/16 v5, 0x21

    .line 54
    invoke-virtual {p1}, Lcom/facebook/auth/credentials/b;->b()Ljava/lang/String;

    move-result-object v0

    .line 55
    const/16 v1, 0x20

    const/16 v2, 0xa0

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    .line 57
    invoke-virtual {p0}, Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 58
    new-instance v2, Lcom/facebook/common/w/o;

    invoke-direct {v2, v1}, Lcom/facebook/common/w/o;-><init>(Landroid/content/res/Resources;)V

    .line 59
    sget v3, Lcom/facebook/o;->start_screen_sso_text:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;)Lcom/facebook/common/w/o;

    .line 60
    const-string v3, "[[name]]"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v0, v4, v5}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Lcom/facebook/common/w/o;

    .line 61
    iget-object v0, p0, Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;->loginButton:Landroid/widget/Button;

    invoke-virtual {v2}, Lcom/facebook/common/w/o;->b()Landroid/text/SpannableString;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 63
    new-instance v0, Lcom/facebook/widget/text/CustomUrlLikeSpan;

    invoke-direct {v0}, Lcom/facebook/widget/text/CustomUrlLikeSpan;-><init>()V

    .line 64
    new-instance v2, Lcom/facebook/auth/login/ae;

    invoke-direct {v2, p0}, Lcom/facebook/auth/login/ae;-><init>(Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;)V

    invoke-virtual {v0, v2}, Lcom/facebook/widget/text/CustomUrlLikeSpan;->a(Lcom/facebook/widget/text/f;)V

    .line 71
    new-instance v2, Lcom/facebook/common/w/o;

    invoke-direct {v2, v1}, Lcom/facebook/common/w/o;-><init>(Landroid/content/res/Resources;)V

    .line 72
    invoke-virtual {v2, v0, v5}, Lcom/facebook/common/w/o;->a(Ljava/lang/Object;I)Lcom/facebook/common/w/o;

    .line 73
    sget v0, Lcom/facebook/o;->start_screen_sso_text_not_you_link:I

    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;)Lcom/facebook/common/w/o;

    .line 74
    invoke-virtual {v2}, Lcom/facebook/common/w/o;->a()Lcom/facebook/common/w/o;

    .line 75
    iget-object v0, p0, Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;->loginText:Landroid/widget/TextView;

    invoke-virtual {v2}, Lcom/facebook/common/w/o;->b()Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    iget-object v0, p0, Lcom/facebook/auth/login/GenericFirstPartySsoViewGroup;->loginText:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSaveEnabled(Z)V

    .line 77
    return-void
.end method
