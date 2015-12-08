.class public Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;
.super Landroid/widget/RelativeLayout;
.source "AppHeader.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$1;,
        Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderLeftButtons;,
        Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;
    }
.end annotation


# static fields
.field public static final BACK:I = 0x1

.field public static final BOLD:I = 0x1

.field public static final BOLD_ITALIC:I = 0x3

.field public static final CLOSE:I = 0x2

.field public static final GLOBAL_HOME:I = 0x0

.field public static final GLOBAL_UNKNOWN:I = 0x10

.field public static final ITALIC:I = 0x2

.field public static final MENU:I = 0x0

.field public static final NAV_UNKNOWN:I = 0x10

.field public static final NORMAL:I = 0x0

.field public static final TAG:Ljava/lang/String; = "AppHeader"


# instance fields
.field public backButtonResId:I

.field private buried:Z

.field public homeButtonResId:I

.field private mGlobalButton:Landroid/widget/ImageButton;

.field private mIsAppHeaderDisabled:Z

.field private mNavBtnColor:I

.field private mNavButton:Landroid/widget/ImageButton;

.field private mNavOption:I

.field private mText:Ljava/lang/String;

.field private mTextColor:I

.field private mTextSize:F

.field private mTextStyle:I

.field private mTextView:Landroid/widget/TextView;

.field public menuButtonResId:I

.field public xButtonResId:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v2, 0x0

    .line 111
    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    .line 77
    iput-boolean v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mIsAppHeaderDisabled:Z

    .line 107
    iput-boolean v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->buried:Z

    .line 112
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 113
    .local v0, "r":Landroid/content/res/Resources;
    const-string v1, ""

    iput-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mText:Ljava/lang/String;

    .line 114
    const v1, 0x7f0a0004

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    iput v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mTextSize:F

    .line 115
    const/4 v1, 0x1

    iput v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mTextStyle:I

    .line 116
    const v1, 0x106000b

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    iput v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mTextColor:I

    .line 117
    iput v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavOption:I

    .line 119
    const v1, 0x7f030002

    invoke-static {p1, v1, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 120
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    const/4 v4, 0x0

    .line 123
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 77
    iput-boolean v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mIsAppHeaderDisabled:Z

    .line 107
    iput-boolean v4, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->buried:Z

    .line 124
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    sget-object v3, Lcom/konylabs/capitalone/R$styleable;->C1Attrs:[I

    invoke-virtual {v2, p2, v3, v4, v4}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 126
    .local v0, "a":Landroid/content/res/TypedArray;
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 129
    .local v1, "r":Landroid/content/res/Resources;
    const/4 v2, 0x4

    :try_start_0
    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mText:Ljava/lang/String;

    .line 130
    iget-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mText:Ljava/lang/String;

    if-nez v2, :cond_0

    .line 131
    const-string v2, ""

    iput-object v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mText:Ljava/lang/String;

    .line 132
    :cond_0
    const/4 v2, 0x1

    const v3, 0x7f0a0004

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    iput v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mTextSize:F

    .line 133
    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mTextStyle:I

    .line 134
    const/4 v2, 0x3

    const v3, 0x106000b

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v2

    iput v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mTextColor:I

    .line 136
    const/16 v2, 0x9

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavOption:I

    .line 137
    const/16 v2, 0xa

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    iput v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavBtnColor:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 141
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 143
    const v2, 0x7f030002

    invoke-static {p1, v2, p0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 144
    return-void

    .line 141
    :catchall_0
    move-exception v2

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    throw v2
.end method


# virtual methods
.method public buryNavButton()V
    .locals 2

    .prologue
    const/4 v1, 0x4

    .line 426
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->buried:Z

    .line 428
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavButton:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_0

    .line 429
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavButton:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 430
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->postInvalidate()V

    .line 432
    :cond_0
    return-void
.end method

.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .param p1, "ev"    # Landroid/view/MotionEvent;

    .prologue
    .line 487
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mIsAppHeaderDisabled:Z

    if-nez v0, :cond_0

    .line 488
    invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 490
    :goto_0
    return v0

    :cond_0
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mIsAppHeaderDisabled:Z

    goto :goto_0
.end method

.method public getGlobalButton()Landroid/widget/ImageButton;
    .locals 1

    .prologue
    .line 400
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mGlobalButton:Landroid/widget/ImageButton;

    return-object v0
.end method

.method public getNavButton()Landroid/widget/ImageButton;
    .locals 1

    .prologue
    .line 391
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavButton:Landroid/widget/ImageButton;

    return-object v0
.end method

.method public getNavOption()I
    .locals 1

    .prologue
    .line 287
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavOption:I

    return v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 291
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mText:Ljava/lang/String;

    return-object v0
.end method

.method public getTextColor()I
    .locals 1

    .prologue
    .line 318
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mTextColor:I

    return v0
.end method

.method public getTextSize()F
    .locals 1

    .prologue
    .line 300
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mTextSize:F

    return v0
.end method

.method public getTextStyle()I
    .locals 1

    .prologue
    .line 309
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mTextStyle:I

    return v0
.end method

.method public hasBack()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 254
    iget v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavOption:I

    if-ne v1, v0, :cond_0

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavButton:Landroid/widget/ImageButton;

    invoke-virtual {v1}, Landroid/widget/ImageButton;->getVisibility()I

    move-result v1

    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hasClose()Z
    .locals 2

    .prologue
    .line 272
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavOption:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavButton:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hasMenu()Z
    .locals 1

    .prologue
    .line 263
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavOption:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavButton:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hideGlobalButton()V
    .locals 2

    .prologue
    .line 469
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mGlobalButton:Landroid/widget/ImageButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 470
    return-void
.end method

.method public hideNavButton()V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 440
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->buried:Z

    .line 442
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavButton:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_0

    .line 443
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavButton:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 444
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->postInvalidate()V

    .line 446
    :cond_0
    return-void
.end method

.method public isAppHeaderDisabled()Z
    .locals 1

    .prologue
    .line 408
    iget-boolean v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mIsAppHeaderDisabled:Z

    return v0
.end method

.method protected onFinishInflate()V
    .locals 1

    .prologue
    .line 148
    invoke-super {p0}, Landroid/widget/RelativeLayout;->onFinishInflate()V

    .line 151
    const v0, 0x7f080021

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mGlobalButton:Landroid/widget/ImageButton;

    .line 153
    const v0, 0x7f080020

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavButton:Landroid/widget/ImageButton;

    .line 154
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavOption:I

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setNavOption(I)V

    .line 156
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavBtnColor:I

    if-nez v0, :cond_0

    .line 158
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;->BLUE:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setNavButtonColor(Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;)V

    .line 166
    :goto_0
    const v0, 0x7f08001f

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mTextView:Landroid/widget/TextView;

    .line 167
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mText:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setText(Ljava/lang/String;)V

    .line 168
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mTextSize:F

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setTextSize(F)V

    .line 169
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mTextColor:I

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setTextColor(I)V

    .line 170
    iget v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mTextStyle:I

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setTextStyle(I)V

    .line 171
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mTextView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->bringToFront()V

    .line 173
    return-void

    .line 162
    :cond_0
    sget-object v0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;->RED:Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;

    invoke-virtual {p0, v0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setNavButtonColor(Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;)V

    goto :goto_0
.end method

.method public setAppHeaderDisabled(Z)V
    .locals 0
    .param p1, "mAppHeaderDisable"    # Z

    .prologue
    .line 416
    iput-boolean p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mIsAppHeaderDisabled:Z

    .line 417
    return-void
.end method

.method public setHasHomeButton(Z)V
    .locals 2
    .param p1, "hasHome"    # Z

    .prologue
    .line 181
    if-eqz p1, :cond_0

    .line 183
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mGlobalButton:Landroid/widget/ImageButton;

    iget v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->homeButtonResId:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 184
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mGlobalButton:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 190
    :goto_0
    return-void

    .line 188
    :cond_0
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mGlobalButton:Landroid/widget/ImageButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto :goto_0
.end method

.method public setNavButtonColor(Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;)V
    .locals 4
    .param p1, "color"    # Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;

    .prologue
    const/4 v3, 0x1

    .line 332
    if-nez p1, :cond_1

    .line 365
    :cond_0
    :goto_0
    return-void

    .line 334
    :cond_1
    const/4 v0, 0x0

    .line 335
    .local v0, "set":Z
    sget-object v1, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$1;->$SwitchMap$com$EnterpriseMobileBanking$Plugins$Components$AppHeader$HeaderButtonColors:[I

    invoke-virtual {p1}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader$HeaderButtonColors;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 353
    :goto_1
    if-eqz v0, :cond_0

    .line 355
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->hasBack()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 357
    invoke-virtual {p0, v3}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setNavOption(I)V

    .line 363
    :goto_2
    invoke-virtual {p0, v3}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setHasHomeButton(Z)V

    goto :goto_0

    .line 338
    :pswitch_0
    const v1, 0x7f0200a5

    iput v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->backButtonResId:I

    .line 339
    const v1, 0x7f0200ba

    iput v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->menuButtonResId:I

    .line 340
    const v1, 0x7f0200ae

    iput v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->xButtonResId:I

    .line 341
    const v1, 0x7f0200b3

    iput v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->homeButtonResId:I

    .line 342
    const/4 v0, 0x1

    .line 343
    goto :goto_1

    .line 345
    :pswitch_1
    const v1, 0x7f0200a4

    iput v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->backButtonResId:I

    .line 346
    const v1, 0x7f0200b9

    iput v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->menuButtonResId:I

    .line 347
    const v1, 0x7f0200ad

    iput v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->xButtonResId:I

    .line 348
    const v1, 0x7f0200b2

    iput v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->homeButtonResId:I

    .line 349
    const/4 v0, 0x1

    goto :goto_1

    .line 361
    :cond_2
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->setNavOption(I)V

    goto :goto_2

    .line 335
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public setNavOption(I)V
    .locals 4
    .param p1, "navOption"    # I

    .prologue
    const/4 v3, 0x0

    .line 199
    const-string v0, ""

    .line 201
    .local v0, "contentDescription":Ljava/lang/String;
    iget-boolean v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->buried:Z

    if-eqz v1, :cond_0

    .line 202
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavButton:Landroid/widget/ImageButton;

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 204
    :cond_0
    packed-switch p1, :pswitch_data_0

    .line 239
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->postInvalidate()V

    .line 241
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x10

    if-ge v1, v2, :cond_2

    .line 242
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f09012e

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 244
    :cond_2
    const v1, 0x7f080020

    invoke-virtual {p0, v1}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 246
    return-void

    .line 207
    :pswitch_0
    const/4 v1, 0x1

    iput v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavOption:I

    .line 208
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavButton:Landroid/widget/ImageButton;

    iget v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->backButtonResId:I

    invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 210
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavButton:Landroid/widget/ImageButton;

    const-string v2, "back"

    invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setTag(Ljava/lang/Object;)V

    .line 211
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f09012a

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 213
    iget-boolean v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->buried:Z

    if-eqz v1, :cond_1

    .line 214
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavButton:Landroid/widget/ImageButton;

    invoke-virtual {v1, v3}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto :goto_0

    .line 219
    :pswitch_1
    iput v3, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavOption:I

    .line 220
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavButton:Landroid/widget/ImageButton;

    iget v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->menuButtonResId:I

    invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 222
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavButton:Landroid/widget/ImageButton;

    const-string v2, "menu"

    invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setTag(Ljava/lang/Object;)V

    .line 225
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f090128

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 226
    goto :goto_0

    .line 228
    :pswitch_2
    const/4 v1, 0x2

    iput v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavOption:I

    .line 229
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavButton:Landroid/widget/ImageButton;

    iget v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->xButtonResId:I

    invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 231
    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavButton:Landroid/widget/ImageButton;

    const-string v2, "close"

    invoke-virtual {v1, v2}, Landroid/widget/ImageButton;->setTag(Ljava/lang/Object;)V

    .line 234
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f09012c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 204
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public setOnGlobalButtonClick(Landroid/view/View$OnClickListener;)V
    .locals 1
    .param p1, "l"    # Landroid/view/View$OnClickListener;

    .prologue
    .line 382
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mGlobalButton:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 383
    return-void
.end method

.method public setOnNavOptionClick(Landroid/view/View$OnClickListener;)V
    .locals 1
    .param p1, "l"    # Landroid/view/View$OnClickListener;

    .prologue
    .line 373
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavButton:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 374
    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 2
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    .line 295
    iput-object p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mText:Ljava/lang/String;

    .line 296
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mTextView:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 297
    return-void
.end method

.method public setTextColor(I)V
    .locals 2
    .param p1, "textColor"    # I

    .prologue
    .line 322
    iput p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mTextColor:I

    .line 323
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mTextView:Landroid/widget/TextView;

    iget v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mTextColor:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 324
    return-void
.end method

.method public setTextSize(F)V
    .locals 3
    .param p1, "textSize"    # F

    .prologue
    .line 304
    iput p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mTextSize:F

    .line 305
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mTextView:Landroid/widget/TextView;

    const/4 v1, 0x0

    iget v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mTextSize:F

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 306
    return-void
.end method

.method public setTextStyle(I)V
    .locals 3
    .param p1, "textStyle"    # I

    .prologue
    .line 313
    iput p1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mTextStyle:I

    .line 314
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mTextView:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mTextView:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v1

    iget v2, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mTextStyle:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 315
    return-void
.end method

.method public showGlobalButton()V
    .locals 2

    .prologue
    .line 479
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mGlobalButton:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 480
    return-void
.end method

.method public showNavButton()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 455
    iput-boolean v1, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->buried:Z

    .line 456
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavButton:Landroid/widget/ImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageButton;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    .line 457
    iget-object v0, p0, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->mNavButton:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 458
    invoke-virtual {p0}, Lcom/EnterpriseMobileBanking/Plugins/Components/AppHeader;->postInvalidate()V

    .line 460
    :cond_0
    return-void
.end method
