.class public Lcom/facebook/orca/login/WildfireRegStartViewGroup;
.super Lcom/facebook/auth/login/m;
.source "WildfireRegStartViewGroup.java"

# interfaces
.implements Lcom/facebook/orca/login/w;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/auth/login/m",
        "<",
        "Lcom/facebook/orca/login/x;",
        ">;",
        "Lcom/facebook/orca/login/w;"
    }
.end annotation


# static fields
.field public static final LOGO1_RESOURCE:Ljava/lang/String; = "orca:authparam:logo1"

.field public static final LOGO2_RESOURCE:Ljava/lang/String; = "orca:authparam:logo2"


# instance fields
.field private final mProgressIndicator:Lcom/facebook/fbservice/ops/ab;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/orca/login/x;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 72
    invoke-direct {p0, p1, p2}, Lcom/facebook/auth/login/m;-><init>(Landroid/content/Context;Lcom/facebook/auth/login/c;)V

    .line 74
    sget v0, Lcom/facebook/k;->orca_wildfire_reg_start:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->setContentView(I)V

    .line 77
    new-instance v0, Lcom/facebook/fbservice/ops/aa;

    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/facebook/o;->wildfire_reg_check:I

    invoke-direct {v0, v1, v2}, Lcom/facebook/fbservice/ops/aa;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->mProgressIndicator:Lcom/facebook/fbservice/ops/ab;

    .line 82
    new-instance v2, Lcom/facebook/orca/login/y;

    invoke-direct {v2, p0}, Lcom/facebook/orca/login/y;-><init>(Lcom/facebook/orca/login/WildfireRegStartViewGroup;)V

    .line 88
    sget v0, Lcom/facebook/i;->start:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 89
    sget v1, Lcom/facebook/i;->create_messenger_account:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    .line 90
    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 91
    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 94
    new-instance v2, Lcom/facebook/orca/login/z;

    invoke-direct {v2, p0}, Lcom/facebook/orca/login/z;-><init>(Lcom/facebook/orca/login/WildfireRegStartViewGroup;)V

    .line 100
    sget v0, Lcom/facebook/i;->login:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 101
    sget v1, Lcom/facebook/i;->login_with_account:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    .line 102
    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 103
    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 106
    const-string v0, "orca:authparam:logo1"

    invoke-virtual {p0, v0, v4}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->getResource(Ljava/lang/String;I)I

    move-result v2

    .line 107
    const-string v0, "orca:authparam:logo2"

    invoke-virtual {p0, v0, v4}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->getResource(Ljava/lang/String;I)I

    move-result v3

    .line 109
    if-eqz v2, :cond_0

    .line 110
    sget v0, Lcom/facebook/i;->reg_logo_primary_a:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 111
    sget v1, Lcom/facebook/i;->reg_logo_primary_b:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 112
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 113
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 116
    :cond_0
    if-eqz v3, :cond_1

    .line 117
    sget v0, Lcom/facebook/i;->reg_logo_secondary_a:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 118
    sget v1, Lcom/facebook/i;->reg_logo_secondary_b:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    .line 119
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 120
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 124
    :cond_1
    sget v0, Lcom/facebook/i;->reg_tos_text_a:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 125
    sget v1, Lcom/facebook/o;->wildfire_reg_start:I

    invoke-direct {p0, v1}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->createTermsOfService(I)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 126
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 127
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setSaveEnabled(Z)V

    .line 129
    sget v0, Lcom/facebook/i;->reg_tos_text_b:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 130
    sget v1, Lcom/facebook/o;->wildfire_reg_login_no_create:I

    invoke-direct {p0, v1}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->createTermsOfService(I)Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 131
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 132
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setSaveEnabled(Z)V

    .line 133
    return-void
.end method

.method static synthetic access$000(Lcom/facebook/orca/login/WildfireRegStartViewGroup;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->onSignupClicked()V

    return-void
.end method

.method static synthetic access$100(Lcom/facebook/orca/login/WildfireRegStartViewGroup;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->onLoginClicked()V

    return-void
.end method

.method static synthetic access$200(Lcom/facebook/orca/login/WildfireRegStartViewGroup;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->onTermsClicked()V

    return-void
.end method

.method static synthetic access$300(Lcom/facebook/orca/login/WildfireRegStartViewGroup;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->onDupClicked()V

    return-void
.end method

.method static synthetic access$400(Lcom/facebook/orca/login/WildfireRegStartViewGroup;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->onCookiesClicked()V

    return-void
.end method

.method static synthetic access$500(Lcom/facebook/orca/login/WildfireRegStartViewGroup;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->onLearnMoreClicked()V

    return-void
.end method

.method public static createParameterBundle(II)Landroid/os/Bundle;
    .locals 2

    .prologue
    .line 61
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 62
    const-string v1, "orca:authparam:logo1"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 63
    const-string v1, "orca:authparam:logo2"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 64
    return-object v0
.end method

.method private createTermsOfService(I)Landroid/text/SpannableString;
    .locals 10

    .prologue
    const/16 v9, 0x21

    .line 140
    invoke-virtual {p0}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 142
    new-instance v1, Lcom/facebook/widget/text/CustomUrlLikeSpan;

    invoke-direct {v1}, Lcom/facebook/widget/text/CustomUrlLikeSpan;-><init>()V

    .line 143
    new-instance v2, Lcom/facebook/orca/login/aa;

    invoke-direct {v2, p0}, Lcom/facebook/orca/login/aa;-><init>(Lcom/facebook/orca/login/WildfireRegStartViewGroup;)V

    invoke-virtual {v1, v2}, Lcom/facebook/widget/text/CustomUrlLikeSpan;->a(Lcom/facebook/widget/text/f;)V

    .line 150
    new-instance v2, Lcom/facebook/widget/text/CustomUrlLikeSpan;

    invoke-direct {v2}, Lcom/facebook/widget/text/CustomUrlLikeSpan;-><init>()V

    .line 151
    new-instance v3, Lcom/facebook/orca/login/ab;

    invoke-direct {v3, p0}, Lcom/facebook/orca/login/ab;-><init>(Lcom/facebook/orca/login/WildfireRegStartViewGroup;)V

    invoke-virtual {v2, v3}, Lcom/facebook/widget/text/CustomUrlLikeSpan;->a(Lcom/facebook/widget/text/f;)V

    .line 158
    new-instance v3, Lcom/facebook/widget/text/CustomUrlLikeSpan;

    invoke-direct {v3}, Lcom/facebook/widget/text/CustomUrlLikeSpan;-><init>()V

    .line 159
    new-instance v4, Lcom/facebook/orca/login/ac;

    invoke-direct {v4, p0}, Lcom/facebook/orca/login/ac;-><init>(Lcom/facebook/orca/login/WildfireRegStartViewGroup;)V

    invoke-virtual {v3, v4}, Lcom/facebook/widget/text/CustomUrlLikeSpan;->a(Lcom/facebook/widget/text/f;)V

    .line 166
    new-instance v4, Lcom/facebook/widget/text/CustomUrlLikeSpan;

    invoke-direct {v4}, Lcom/facebook/widget/text/CustomUrlLikeSpan;-><init>()V

    .line 167
    new-instance v5, Lcom/facebook/orca/login/ad;

    invoke-direct {v5, p0}, Lcom/facebook/orca/login/ad;-><init>(Lcom/facebook/orca/login/WildfireRegStartViewGroup;)V

    invoke-virtual {v4, v5}, Lcom/facebook/widget/text/CustomUrlLikeSpan;->a(Lcom/facebook/widget/text/f;)V

    .line 174
    new-instance v5, Lcom/facebook/common/w/o;

    invoke-direct {v5, v0}, Lcom/facebook/common/w/o;-><init>(Landroid/content/res/Resources;)V

    .line 175
    sget v6, Lcom/facebook/o;->wildfire_reg_tos:I

    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;)Lcom/facebook/common/w/o;

    .line 176
    const-string v6, "[[start]]"

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    invoke-virtual {v5, v6, v7, v8, v9}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Lcom/facebook/common/w/o;

    .line 181
    const-string v6, "[[terms]]"

    sget v7, Lcom/facebook/o;->wildfire_reg_tos_terms:I

    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7, v1, v9}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Lcom/facebook/common/w/o;

    .line 186
    const-string v1, "[[data_use_policy]]"

    sget v6, Lcom/facebook/o;->wildfire_reg_tos_dup:I

    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v1, v6, v2, v9}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Lcom/facebook/common/w/o;

    .line 191
    const-string v1, "[[about_cookie_use]]"

    sget v2, Lcom/facebook/o;->wildfire_reg_tos_cookies:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v1, v2, v3, v9}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Lcom/facebook/common/w/o;

    .line 196
    const-string v1, "[[learn_more]]"

    sget v2, Lcom/facebook/o;->wildfire_reg_tos_learn_more:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v1, v0, v4, v9}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Lcom/facebook/common/w/o;

    .line 202
    invoke-virtual {v5}, Lcom/facebook/common/w/o;->b()Landroid/text/SpannableString;

    move-result-object v0

    return-object v0
.end method

.method private onCookiesClicked()V
    .locals 1

    .prologue
    .line 218
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->control:Lcom/facebook/auth/login/c;

    check-cast v0, Lcom/facebook/orca/login/x;

    invoke-interface {v0}, Lcom/facebook/orca/login/x;->V()V

    .line 219
    return-void
.end method

.method private onDupClicked()V
    .locals 1

    .prologue
    .line 214
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->control:Lcom/facebook/auth/login/c;

    check-cast v0, Lcom/facebook/orca/login/x;

    invoke-interface {v0}, Lcom/facebook/orca/login/x;->U()V

    .line 215
    return-void
.end method

.method private onLearnMoreClicked()V
    .locals 1

    .prologue
    .line 222
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->control:Lcom/facebook/auth/login/c;

    check-cast v0, Lcom/facebook/orca/login/x;

    invoke-interface {v0}, Lcom/facebook/orca/login/x;->W()V

    .line 223
    return-void
.end method

.method private onLoginClicked()V
    .locals 2

    .prologue
    .line 226
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->control:Lcom/facebook/auth/login/c;

    check-cast v0, Lcom/facebook/orca/login/x;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/facebook/orca/login/x;->a(Z)V

    .line 227
    return-void
.end method

.method private onSignupClicked()V
    .locals 1

    .prologue
    .line 206
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->control:Lcom/facebook/auth/login/c;

    check-cast v0, Lcom/facebook/orca/login/x;

    invoke-interface {v0}, Lcom/facebook/orca/login/x;->Q()V

    .line 207
    return-void
.end method

.method private onTermsClicked()V
    .locals 1

    .prologue
    .line 210
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->control:Lcom/facebook/auth/login/c;

    check-cast v0, Lcom/facebook/orca/login/x;

    invoke-interface {v0}, Lcom/facebook/orca/login/x;->T()V

    .line 211
    return-void
.end method


# virtual methods
.method public beginShowingProgress()V
    .locals 1

    .prologue
    .line 231
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->setVisibility(I)V

    .line 232
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->mProgressIndicator:Lcom/facebook/fbservice/ops/ab;

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/ab;->a()V

    .line 233
    return-void
.end method

.method public showStartPage(Z)V
    .locals 4

    .prologue
    const/16 v3, 0x8

    const/4 v2, 0x0

    .line 243
    sget v0, Lcom/facebook/i;->get_started_layout:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 244
    sget v1, Lcom/facebook/i;->have_account_layout:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    .line 246
    if-eqz p1, :cond_0

    .line 247
    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 248
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 253
    :goto_0
    return-void

    .line 250
    :cond_0
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 251
    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method public stopShowingProgress()V
    .locals 1

    .prologue
    .line 237
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->setVisibility(I)V

    .line 238
    iget-object v0, p0, Lcom/facebook/orca/login/WildfireRegStartViewGroup;->mProgressIndicator:Lcom/facebook/fbservice/ops/ab;

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/ab;->b()V

    .line 239
    return-void
.end method
