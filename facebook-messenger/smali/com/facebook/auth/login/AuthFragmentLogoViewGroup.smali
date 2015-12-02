.class public abstract Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;
.super Lcom/facebook/auth/login/m;
.source "AuthFragmentLogoViewGroup.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lcom/facebook/auth/login/c;",
        ">",
        "Lcom/facebook/auth/login/m",
        "<TT;>;"
    }
.end annotation


# static fields
.field public static final HELP_URL:Ljava/lang/String; = "orca:authparam:help_url"

.field public static final LAYOUT_RESOURCE:Ljava/lang/String; = "orca:authparam:layout_resource"

.field private static final LOGIN_GROUP_ANIM_DELAY_MS:I = 0x177

.field private static final LOGIN_GROUP_ANIM_DURATION_MS:I = 0x7d

.field public static final LOGO1_RESOURCE:Ljava/lang/String; = "orca:authparam:logo1"

.field public static final LOGO2_RESOURCE:Ljava/lang/String; = "orca:authparam:logo2"

.field private static final SLIDE_ANIM_DELAY_MS:I = 0xc8

.field private static final SLIDE_ANIM_DURATION_MS:I = 0x1f4

.field public static final SPLASH_LOGO1_RESOURCE:Ljava/lang/String; = "orca:authparam:spash_logo1"

.field public static final SPLASH_LOGO2_RESOURCE:Ljava/lang/String; = "orca:authparam:spash_logo2"

.field public static final SPLASH_TRANSITION:Ljava/lang/String; = "orca:authparam:splash_transition"


# instance fields
.field private final mBottomGroup:Landroid/view/View;

.field private final mHelpButton:Landroid/widget/ImageButton;

.field private final mLayoutDelegate:Lcom/facebook/auth/login/e;

.field private final mLogo1ResId:I

.field private final mLogo1View:Landroid/widget/ImageView;

.field private final mLogo2ResId:I

.field private final mLogo2View:Landroid/widget/ImageView;

.field private final mLogoGroup:Landroid/view/View;

.field private final mMainGroup:Landroid/view/View;

.field private final mRootGroup:Landroid/view/View;

.field private final mSplashGroup:Landroid/view/View;

.field private mSplashLogo1ResId:I

.field private final mSplashLogo1View:Landroid/widget/ImageView;

.field private mSplashLogo2ResId:I

.field private final mSplashLogo2View:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/auth/login/c;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "TT;)V"
        }
    .end annotation

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 200
    invoke-direct {p0, p1, p2}, Lcom/facebook/auth/login/m;-><init>(Landroid/content/Context;Lcom/facebook/auth/login/c;)V

    .line 203
    const-string v0, "orca:authparam:layout_resource"

    invoke-virtual {p0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->getDefaultLayoutResource()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->getResource(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->setContentView(I)V

    .line 206
    sget v0, Lcom/facebook/i;->login_splash:I

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashGroup:Landroid/view/View;

    .line 207
    sget v0, Lcom/facebook/i;->login_logo1_splash:I

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashLogo1View:Landroid/widget/ImageView;

    .line 208
    sget v0, Lcom/facebook/i;->login_logo2_splash:I

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashLogo2View:Landroid/widget/ImageView;

    .line 209
    sget v0, Lcom/facebook/i;->login_root:I

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mRootGroup:Landroid/view/View;

    .line 210
    sget v0, Lcom/facebook/i;->login_main_group:I

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mMainGroup:Landroid/view/View;

    .line 211
    sget v0, Lcom/facebook/i;->login_bottom_group:I

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mBottomGroup:Landroid/view/View;

    .line 212
    sget v0, Lcom/facebook/i;->login_logo_container:I

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogoGroup:Landroid/view/View;

    .line 213
    sget v0, Lcom/facebook/i;->login_logo1:I

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogo1View:Landroid/widget/ImageView;

    .line 214
    sget v0, Lcom/facebook/i;->login_logo2:I

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogo2View:Landroid/widget/ImageView;

    .line 215
    sget v0, Lcom/facebook/i;->login_help_button:I

    invoke-virtual {p0, v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mHelpButton:Landroid/widget/ImageButton;

    .line 218
    const-string v0, "orca:authparam:logo1"

    invoke-virtual {p0, v0, v2}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->getResource(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogo1ResId:I

    .line 219
    const-string v0, "orca:authparam:logo2"

    invoke-virtual {p0, v0, v2}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->getResource(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogo2ResId:I

    .line 220
    const-string v0, "orca:authparam:spash_logo1"

    invoke-virtual {p0, v0, v2}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->getResource(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashLogo1ResId:I

    .line 221
    const-string v0, "orca:authparam:spash_logo2"

    invoke-virtual {p0, v0, v2}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->getResource(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashLogo2ResId:I

    .line 222
    iget v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashLogo1ResId:I

    if-nez v0, :cond_0

    .line 223
    iget v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogo1ResId:I

    iput v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashLogo1ResId:I

    .line 225
    :cond_0
    iget v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashLogo2ResId:I

    if-nez v0, :cond_1

    .line 226
    iget v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogo2ResId:I

    iput v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashLogo2ResId:I

    .line 229
    :cond_1
    invoke-direct {p0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->isLegacyLayout()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 230
    new-instance v0, Lcom/facebook/auth/login/f;

    invoke-direct {v0, p0, v3}, Lcom/facebook/auth/login/f;-><init>(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;Lcom/facebook/auth/login/d;)V

    iput-object v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLayoutDelegate:Lcom/facebook/auth/login/e;

    .line 234
    :goto_0
    return-void

    .line 232
    :cond_2
    new-instance v0, Lcom/facebook/auth/login/g;

    invoke-direct {v0, p0, v3}, Lcom/facebook/auth/login/g;-><init>(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;Lcom/facebook/auth/login/d;)V

    iput-object v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLayoutDelegate:Lcom/facebook/auth/login/e;

    goto :goto_0
.end method

.method static synthetic access$1000(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)I
    .locals 1

    .prologue
    .line 35
    iget v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashLogo1ResId:I

    return v0
.end method

.method static synthetic access$1100(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)I
    .locals 1

    .prologue
    .line 35
    iget v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashLogo2ResId:I

    return v0
.end method

.method static synthetic access$1200(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashLogo1View:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic access$1400(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashLogo2View:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic access$200(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/widget/ImageButton;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mHelpButton:Landroid/widget/ImageButton;

    return-object v0
.end method

.method static synthetic access$300(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogoGroup:Landroid/view/View;

    return-object v0
.end method

.method static synthetic access$400(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashGroup:Landroid/view/View;

    return-object v0
.end method

.method static synthetic access$500(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)I
    .locals 1

    .prologue
    .line 35
    iget v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogo1ResId:I

    return v0
.end method

.method static synthetic access$600(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogo1View:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic access$700(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)I
    .locals 1

    .prologue
    .line 35
    iget v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogo2ResId:I

    return v0
.end method

.method static synthetic access$800(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogo2View:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic access$900(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/view/View;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mRootGroup:Landroid/view/View;

    return-object v0
.end method

.method public static createParameterBundle(III)Landroid/os/Bundle;
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 154
    sget-object v5, Lcom/facebook/auth/login/l;->NONE:Lcom/facebook/auth/login/l;

    const/4 v6, 0x0

    move v0, p0

    move v1, p1

    move v2, p2

    move v4, v3

    invoke-static/range {v0 .. v6}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->createParameterBundle(IIIIILcom/facebook/auth/login/l;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method public static createParameterBundle(IIIIILcom/facebook/auth/login/l;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 2

    .prologue
    .line 177
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 178
    const-string v1, "orca:authparam:layout_resource"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 179
    const-string v1, "orca:authparam:logo1"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 180
    const-string v1, "orca:authparam:logo2"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 181
    const-string v1, "orca:authparam:spash_logo1"

    invoke-virtual {v0, v1, p3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 182
    const-string v1, "orca:authparam:spash_logo2"

    invoke-virtual {v0, v1, p4}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 183
    const-string v1, "orca:authparam:splash_transition"

    invoke-virtual {v0, v1, p5}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 184
    const-string v1, "orca:authparam:help_url"

    invoke-virtual {v0, v1, p6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    return-object v0
.end method

.method private isLegacyLayout()Z
    .locals 6

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 281
    const/16 v2, 0x8

    new-array v3, v2, [Landroid/view/View;

    iget-object v2, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashGroup:Landroid/view/View;

    aput-object v2, v3, v1

    iget-object v2, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashLogo1View:Landroid/widget/ImageView;

    aput-object v2, v3, v0

    const/4 v2, 0x2

    iget-object v4, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashLogo2View:Landroid/widget/ImageView;

    aput-object v4, v3, v2

    const/4 v2, 0x3

    iget-object v4, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mRootGroup:Landroid/view/View;

    aput-object v4, v3, v2

    const/4 v2, 0x4

    iget-object v4, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mMainGroup:Landroid/view/View;

    aput-object v4, v3, v2

    const/4 v2, 0x5

    iget-object v4, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mBottomGroup:Landroid/view/View;

    aput-object v4, v3, v2

    const/4 v2, 0x6

    iget-object v4, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogoGroup:Landroid/view/View;

    aput-object v4, v3, v2

    const/4 v2, 0x7

    iget-object v4, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mHelpButton:Landroid/widget/ImageButton;

    aput-object v4, v3, v2

    .line 291
    array-length v4, v3

    move v2, v1

    :goto_0
    if-ge v2, v4, :cond_1

    aget-object v5, v3, v2

    .line 292
    if-nez v5, :cond_0

    .line 296
    :goto_1
    return v0

    .line 291
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    move v0, v1

    .line 296
    goto :goto_1
.end method


# virtual methods
.method protected abstract getDefaultLayoutResource()I
.end method

.method public onAttachedToWindow()V
    .locals 1

    .prologue
    .line 238
    invoke-super {p0}, Lcom/facebook/auth/login/m;->onAttachedToWindow()V

    .line 239
    iget-object v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLayoutDelegate:Lcom/facebook/auth/login/e;

    invoke-interface {v0}, Lcom/facebook/auth/login/e;->a()V

    .line 240
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 244
    invoke-super {p0, p1}, Lcom/facebook/auth/login/m;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 245
    iget-object v0, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLayoutDelegate:Lcom/facebook/auth/login/e;

    invoke-interface {v0, p1}, Lcom/facebook/auth/login/e;->a(Landroid/content/res/Configuration;)V

    .line 246
    return-void
.end method

.method protected onHelpClick()V
    .locals 4

    .prologue
    .line 249
    invoke-virtual {p0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "orca:authparam:help_url"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 250
    iget-object v1, p0, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->control:Lcom/facebook/auth/login/c;

    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.VIEW"

    invoke-direct {v2, v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-interface {v1, v2}, Lcom/facebook/auth/login/c;->b(Landroid/content/Intent;)V

    .line 251
    return-void
.end method
