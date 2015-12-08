.class Landroid/support/v7/app/ActionBarActivityDelegateBase;
.super Landroid/support/v7/app/ActionBarActivityDelegate;
.source "ActionBarActivityDelegateBase.java"

# interfaces
.implements Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;
.implements Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/app/ActionBarActivityDelegateBase$ActionModeCallbackWrapper;
    }
.end annotation


# static fields
.field private static final ACTION_BAR_DRAWABLE_TOGGLE_ATTRS:[I

.field private static final TAG:Ljava/lang/String; = "ActionBarActivityDelegateBase"


# instance fields
.field private mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

.field private mActionMode:Landroid/support/v7/view/ActionMode;

.field private mClosingActionMenu:Z

.field private mFeatureIndeterminateProgress:Z

.field private mFeatureProgress:Z

.field private mListMenuPresenter:Landroid/support/v7/internal/view/menu/ListMenuPresenter;

.field private mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

.field private mPanelFrozenActionViewState:Landroid/os/Bundle;

.field private mPanelIsPrepared:Z

.field private mPanelRefreshContent:Z

.field private mSubDecorInstalled:Z

.field private mTitleToSet:Ljava/lang/CharSequence;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 52
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, Landroid/support/v7/appcompat/R$attr;->homeAsUpIndicator:I

    aput v2, v0, v1

    sput-object v0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->ACTION_BAR_DRAWABLE_TOGGLE_ATTRS:[I

    return-void
.end method

.method constructor <init>(Landroid/support/v7/app/ActionBarActivity;)V
    .locals 0
    .param p1, "activity"    # Landroid/support/v7/app/ActionBarActivity;

    .prologue
    .line 77
    invoke-direct {p0, p1}, Landroid/support/v7/app/ActionBarActivityDelegate;-><init>(Landroid/support/v7/app/ActionBarActivity;)V

    .line 78
    return-void
.end method

.method static synthetic access$002(Landroid/support/v7/app/ActionBarActivityDelegateBase;Landroid/support/v7/view/ActionMode;)Landroid/support/v7/view/ActionMode;
    .locals 0
    .param p0, "x0"    # Landroid/support/v7/app/ActionBarActivityDelegateBase;
    .param p1, "x1"    # Landroid/support/v7/view/ActionMode;

    .prologue
    .line 48
    iput-object p1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionMode:Landroid/support/v7/view/ActionMode;

    return-object p1
.end method

.method private applyFixedSizeWindow()V
    .locals 13

    .prologue
    .line 237
    iget-object v11, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    sget-object v12, Landroid/support/v7/appcompat/R$styleable;->ActionBarWindow:[I

    invoke-virtual {v11, v12}, Landroid/support/v7/app/ActionBarActivity;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 239
    .local v0, "a":Landroid/content/res/TypedArray;
    const/4 v5, 0x0

    .line 240
    .local v5, "mFixedWidthMajor":Landroid/util/TypedValue;
    const/4 v6, 0x0

    .line 241
    .local v6, "mFixedWidthMinor":Landroid/util/TypedValue;
    const/4 v3, 0x0

    .line 242
    .local v3, "mFixedHeightMajor":Landroid/util/TypedValue;
    const/4 v4, 0x0

    .line 244
    .local v4, "mFixedHeightMinor":Landroid/util/TypedValue;
    const/4 v11, 0x3

    invoke-virtual {v0, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v11

    if-eqz v11, :cond_1

    .line 245
    if-nez v5, :cond_0

    new-instance v5, Landroid/util/TypedValue;

    .end local v5    # "mFixedWidthMajor":Landroid/util/TypedValue;
    invoke-direct {v5}, Landroid/util/TypedValue;-><init>()V

    .line 246
    .restart local v5    # "mFixedWidthMajor":Landroid/util/TypedValue;
    :cond_0
    const/4 v11, 0x3

    invoke-virtual {v0, v11, v5}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 248
    :cond_1
    const/4 v11, 0x5

    invoke-virtual {v0, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v11

    if-eqz v11, :cond_3

    .line 249
    if-nez v6, :cond_2

    new-instance v6, Landroid/util/TypedValue;

    .end local v6    # "mFixedWidthMinor":Landroid/util/TypedValue;
    invoke-direct {v6}, Landroid/util/TypedValue;-><init>()V

    .line 250
    .restart local v6    # "mFixedWidthMinor":Landroid/util/TypedValue;
    :cond_2
    const/4 v11, 0x5

    invoke-virtual {v0, v11, v6}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 252
    :cond_3
    const/4 v11, 0x6

    invoke-virtual {v0, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v11

    if-eqz v11, :cond_5

    .line 253
    if-nez v3, :cond_4

    new-instance v3, Landroid/util/TypedValue;

    .end local v3    # "mFixedHeightMajor":Landroid/util/TypedValue;
    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    .line 254
    .restart local v3    # "mFixedHeightMajor":Landroid/util/TypedValue;
    :cond_4
    const/4 v11, 0x6

    invoke-virtual {v0, v11, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 256
    :cond_5
    const/4 v11, 0x4

    invoke-virtual {v0, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v11

    if-eqz v11, :cond_7

    .line 257
    if-nez v4, :cond_6

    new-instance v4, Landroid/util/TypedValue;

    .end local v4    # "mFixedHeightMinor":Landroid/util/TypedValue;
    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    .line 258
    .restart local v4    # "mFixedHeightMinor":Landroid/util/TypedValue;
    :cond_6
    const/4 v11, 0x4

    invoke-virtual {v0, v11, v4}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 261
    :cond_7
    iget-object v11, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v11}, Landroid/support/v7/app/ActionBarActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v7

    .line 262
    .local v7, "metrics":Landroid/util/DisplayMetrics;
    iget v11, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v12, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    if-ge v11, v12, :cond_c

    const/4 v2, 0x1

    .line 263
    .local v2, "isPortrait":Z
    :goto_0
    const/4 v10, -0x1

    .line 264
    .local v10, "w":I
    const/4 v1, -0x1

    .line 266
    .local v1, "h":I
    if-eqz v2, :cond_d

    move-object v9, v6

    .line 267
    .local v9, "tvw":Landroid/util/TypedValue;
    :goto_1
    if-eqz v9, :cond_8

    iget v11, v9, Landroid/util/TypedValue;->type:I

    if-eqz v11, :cond_8

    .line 268
    iget v11, v9, Landroid/util/TypedValue;->type:I

    const/4 v12, 0x5

    if-ne v11, v12, :cond_e

    .line 269
    invoke-virtual {v9, v7}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    move-result v11

    float-to-int v10, v11

    .line 275
    :cond_8
    :goto_2
    if-eqz v2, :cond_f

    move-object v8, v3

    .line 276
    .local v8, "tvh":Landroid/util/TypedValue;
    :goto_3
    if-eqz v8, :cond_9

    iget v11, v8, Landroid/util/TypedValue;->type:I

    if-eqz v11, :cond_9

    .line 277
    iget v11, v8, Landroid/util/TypedValue;->type:I

    const/4 v12, 0x5

    if-ne v11, v12, :cond_10

    .line 278
    invoke-virtual {v8, v7}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    move-result v11

    float-to-int v1, v11

    .line 284
    :cond_9
    :goto_4
    const/4 v11, -0x1

    if-ne v10, v11, :cond_a

    const/4 v11, -0x1

    if-eq v1, v11, :cond_b

    .line 285
    :cond_a
    iget-object v11, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v11}, Landroid/support/v7/app/ActionBarActivity;->getWindow()Landroid/view/Window;

    move-result-object v11

    invoke-virtual {v11, v10, v1}, Landroid/view/Window;->setLayout(II)V

    .line 288
    :cond_b
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 289
    return-void

    .line 262
    .end local v1    # "h":I
    .end local v2    # "isPortrait":Z
    .end local v8    # "tvh":Landroid/util/TypedValue;
    .end local v9    # "tvw":Landroid/util/TypedValue;
    .end local v10    # "w":I
    :cond_c
    const/4 v2, 0x0

    goto :goto_0

    .restart local v1    # "h":I
    .restart local v2    # "isPortrait":Z
    .restart local v10    # "w":I
    :cond_d
    move-object v9, v5

    .line 266
    goto :goto_1

    .line 270
    .restart local v9    # "tvw":Landroid/util/TypedValue;
    :cond_e
    iget v11, v9, Landroid/util/TypedValue;->type:I

    const/4 v12, 0x6

    if-ne v11, v12, :cond_8

    .line 271
    iget v11, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v11, v11

    iget v12, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v12, v12

    invoke-virtual {v9, v11, v12}, Landroid/util/TypedValue;->getFraction(FF)F

    move-result v11

    float-to-int v10, v11

    goto :goto_2

    :cond_f
    move-object v8, v4

    .line 275
    goto :goto_3

    .line 279
    .restart local v8    # "tvh":Landroid/util/TypedValue;
    :cond_10
    iget v11, v8, Landroid/util/TypedValue;->type:I

    const/4 v12, 0x6

    if-ne v11, v12, :cond_9

    .line 280
    iget v11, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v11, v11

    iget v12, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v12, v12

    invoke-virtual {v8, v11, v12}, Landroid/util/TypedValue;->getFraction(FF)F

    move-result v11

    float-to-int v1, v11

    goto :goto_4
.end method

.method private getCircularProgressBar()Landroid/support/v7/internal/widget/ProgressBarICS;
    .locals 3

    .prologue
    .line 573
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    sget v2, Landroid/support/v7/appcompat/R$id;->progress_circular:I

    invoke-virtual {v1, v2}, Landroid/support/v7/internal/widget/ActionBarView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/widget/ProgressBarICS;

    .line 574
    .local v0, "pb":Landroid/support/v7/internal/widget/ProgressBarICS;
    if-eqz v0, :cond_0

    .line 575
    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V

    .line 577
    :cond_0
    return-object v0
.end method

.method private getHorizontalProgressBar()Landroid/support/v7/internal/widget/ProgressBarICS;
    .locals 3

    .prologue
    .line 581
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    sget v2, Landroid/support/v7/appcompat/R$id;->progress_horizontal:I

    invoke-virtual {v1, v2}, Landroid/support/v7/internal/widget/ActionBarView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/widget/ProgressBarICS;

    .line 582
    .local v0, "pb":Landroid/support/v7/internal/widget/ProgressBarICS;
    if-eqz v0, :cond_0

    .line 583
    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V

    .line 585
    :cond_0
    return-object v0
.end method

.method private getListMenuView(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)Landroid/support/v7/internal/view/menu/MenuView;
    .locals 4
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "cb"    # Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;

    .prologue
    .line 441
    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    if-nez v2, :cond_0

    .line 442
    const/4 v2, 0x0

    .line 461
    :goto_0
    return-object v2

    .line 445
    :cond_0
    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mListMenuPresenter:Landroid/support/v7/internal/view/menu/ListMenuPresenter;

    if-nez v2, :cond_1

    .line 446
    sget-object v2, Landroid/support/v7/appcompat/R$styleable;->Theme:[I

    invoke-virtual {p1, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 447
    .local v0, "a":Landroid/content/res/TypedArray;
    const/4 v2, 0x4

    sget v3, Landroid/support/v7/appcompat/R$style;->Theme_AppCompat_CompactMenu:I

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 450
    .local v1, "listPresenterTheme":I
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 452
    new-instance v2, Landroid/support/v7/internal/view/menu/ListMenuPresenter;

    sget v3, Landroid/support/v7/appcompat/R$layout;->abc_list_menu_item_layout:I

    invoke-direct {v2, v3, v1}, Landroid/support/v7/internal/view/menu/ListMenuPresenter;-><init>(II)V

    iput-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mListMenuPresenter:Landroid/support/v7/internal/view/menu/ListMenuPresenter;

    .line 454
    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mListMenuPresenter:Landroid/support/v7/internal/view/menu/ListMenuPresenter;

    invoke-virtual {v2, p2}, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->setCallback(Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V

    .line 455
    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    iget-object v3, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mListMenuPresenter:Landroid/support/v7/internal/view/menu/ListMenuPresenter;

    invoke-virtual {v2, v3}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V

    .line 461
    .end local v0    # "a":Landroid/content/res/TypedArray;
    .end local v1    # "listPresenterTheme":I
    :goto_1
    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mListMenuPresenter:Landroid/support/v7/internal/view/menu/ListMenuPresenter;

    new-instance v3, Landroid/widget/FrameLayout;

    invoke-direct {v3, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v3}, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->getMenuView(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView;

    move-result-object v2

    goto :goto_0

    .line 458
    :cond_1
    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mListMenuPresenter:Landroid/support/v7/internal/view/menu/ListMenuPresenter;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->updateMenuView(Z)V

    goto :goto_1
.end method

.method private hideProgressBars(Landroid/support/v7/internal/widget/ProgressBarICS;Landroid/support/v7/internal/widget/ProgressBarICS;)V
    .locals 2
    .param p1, "horizontalProgressBar"    # Landroid/support/v7/internal/widget/ProgressBarICS;
    .param p2, "spinnyProgressBar"    # Landroid/support/v7/internal/widget/ProgressBarICS;

    .prologue
    const/4 v1, 0x4

    .line 564
    iget-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mFeatureIndeterminateProgress:Z

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Landroid/support/v7/internal/widget/ProgressBarICS;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 565
    invoke-virtual {p2, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V

    .line 567
    :cond_0
    iget-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mFeatureProgress:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/support/v7/internal/widget/ProgressBarICS;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 568
    invoke-virtual {p1, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V

    .line 570
    :cond_1
    return-void
.end method

.method private initializePanelMenu()Z
    .locals 2

    .prologue
    .line 589
    new-instance v0, Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->getActionBarThemedContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    .line 590
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v0, p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->setCallback(Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;)V

    .line 591
    const/4 v0, 0x1

    return v0
.end method

.method private preparePanel()Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v4, 0x0

    const/4 v1, 0x0

    .line 596
    iget-boolean v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mPanelIsPrepared:Z

    if-eqz v2, :cond_0

    .line 659
    :goto_0
    return v0

    .line 601
    :cond_0
    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    if-eqz v2, :cond_1

    iget-boolean v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mPanelRefreshContent:Z

    if-eqz v2, :cond_7

    .line 602
    :cond_1
    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    if-nez v2, :cond_3

    .line 603
    invoke-direct {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->initializePanelMenu()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    if-nez v2, :cond_3

    :cond_2
    move v0, v1

    .line 604
    goto :goto_0

    .line 608
    :cond_3
    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    if-eqz v2, :cond_4

    .line 609
    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    iget-object v3, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v2, v3, p0}, Landroid/support/v7/internal/widget/ActionBarView;->setMenu(Landroid/support/v4/internal/view/SupportMenu;Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V

    .line 614
    :cond_4
    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->stopDispatchingItemsChanged()V

    .line 617
    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    iget-object v3, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v2, v1, v3}, Landroid/support/v7/app/ActionBarActivity;->superOnCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 619
    iput-object v4, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    .line 621
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    if-eqz v0, :cond_5

    .line 623
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, v4, p0}, Landroid/support/v7/internal/widget/ActionBarView;->setMenu(Landroid/support/v4/internal/view/SupportMenu;Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V

    :cond_5
    move v0, v1

    .line 626
    goto :goto_0

    .line 629
    :cond_6
    iput-boolean v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mPanelRefreshContent:Z

    .line 634
    :cond_7
    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->stopDispatchingItemsChanged()V

    .line 638
    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mPanelFrozenActionViewState:Landroid/os/Bundle;

    if-eqz v2, :cond_8

    .line 639
    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    iget-object v3, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mPanelFrozenActionViewState:Landroid/os/Bundle;

    invoke-virtual {v2, v3}, Landroid/support/v7/internal/view/menu/MenuBuilder;->restoreActionViewStates(Landroid/os/Bundle;)V

    .line 640
    iput-object v4, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mPanelFrozenActionViewState:Landroid/os/Bundle;

    .line 644
    :cond_8
    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    iget-object v3, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v2, v1, v4, v3}, Landroid/support/v7/app/ActionBarActivity;->superOnPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v2

    if-nez v2, :cond_a

    .line 645
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    if-eqz v0, :cond_9

    .line 648
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, v4, p0}, Landroid/support/v7/internal/widget/ActionBarView;->setMenu(Landroid/support/v4/internal/view/SupportMenu;Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V

    .line 650
    :cond_9
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->startDispatchingItemsChanged()V

    move v0, v1

    .line 651
    goto :goto_0

    .line 654
    :cond_a
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->startDispatchingItemsChanged()V

    .line 657
    iput-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mPanelIsPrepared:Z

    goto :goto_0
.end method

.method private reopenMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V
    .locals 1
    .param p1, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
    .param p2, "toggleMenuMode"    # Z

    .prologue
    .line 426
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->isOverflowReserved()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 427
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->isOverflowMenuShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    if-nez p2, :cond_2

    .line 428
    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 429
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->showOverflowMenu()Z

    .line 438
    :cond_1
    :goto_0
    return-void

    .line 432
    :cond_2
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->hideOverflowMenu()Z

    goto :goto_0

    .line 437
    :cond_3
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->close()V

    goto :goto_0
.end method

.method private showProgressBars(Landroid/support/v7/internal/widget/ProgressBarICS;Landroid/support/v7/internal/widget/ProgressBarICS;)V
    .locals 3
    .param p1, "horizontalProgressBar"    # Landroid/support/v7/internal/widget/ProgressBarICS;
    .param p2, "spinnyProgressBar"    # Landroid/support/v7/internal/widget/ProgressBarICS;

    .prologue
    const/4 v2, 0x0

    .line 553
    iget-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mFeatureIndeterminateProgress:Z

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Landroid/support/v7/internal/widget/ProgressBarICS;->getVisibility()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 554
    invoke-virtual {p2, v2}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V

    .line 557
    :cond_0
    iget-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mFeatureProgress:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/support/v7/internal/widget/ProgressBarICS;->getProgress()I

    move-result v0

    const/16 v1, 0x2710

    if-ge v0, v1, :cond_1

    .line 558
    invoke-virtual {p1, v2}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V

    .line 560
    :cond_1
    return-void
.end method

.method private updateProgressBars(I)V
    .locals 8
    .param p1, "value"    # I

    .prologue
    const/16 v7, 0x8

    const/16 v6, 0x2710

    const/4 v4, 0x0

    .line 513
    invoke-direct {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->getCircularProgressBar()Landroid/support/v7/internal/widget/ProgressBarICS;

    move-result-object v0

    .line 514
    .local v0, "circularProgressBar":Landroid/support/v7/internal/widget/ProgressBarICS;
    invoke-direct {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->getHorizontalProgressBar()Landroid/support/v7/internal/widget/ProgressBarICS;

    move-result-object v1

    .line 516
    .local v1, "horizontalProgressBar":Landroid/support/v7/internal/widget/ProgressBarICS;
    const/4 v5, -0x1

    if-ne p1, v5, :cond_4

    .line 517
    iget-boolean v5, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mFeatureProgress:Z

    if-eqz v5, :cond_1

    .line 518
    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->getProgress()I

    move-result v2

    .line 519
    .local v2, "level":I
    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->isIndeterminate()Z

    move-result v5

    if-nez v5, :cond_0

    if-ge v2, v6, :cond_3

    :cond_0
    move v3, v4

    .line 521
    .local v3, "visibility":I
    :goto_0
    invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V

    .line 523
    .end local v2    # "level":I
    .end local v3    # "visibility":I
    :cond_1
    iget-boolean v5, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mFeatureIndeterminateProgress:Z

    if-eqz v5, :cond_2

    .line 524
    invoke-virtual {v0, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V

    .line 549
    :cond_2
    :goto_1
    return-void

    .line 519
    .restart local v2    # "level":I
    :cond_3
    const/4 v3, 0x4

    goto :goto_0

    .line 526
    .end local v2    # "level":I
    :cond_4
    const/4 v5, -0x2

    if-ne p1, v5, :cond_6

    .line 527
    iget-boolean v4, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mFeatureProgress:Z

    if-eqz v4, :cond_5

    .line 528
    invoke-virtual {v1, v7}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V

    .line 530
    :cond_5
    iget-boolean v4, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mFeatureIndeterminateProgress:Z

    if-eqz v4, :cond_2

    .line 531
    invoke-virtual {v0, v7}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V

    goto :goto_1

    .line 533
    :cond_6
    const/4 v5, -0x3

    if-ne p1, v5, :cond_7

    .line 534
    const/4 v4, 0x1

    invoke-virtual {v1, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;->setIndeterminate(Z)V

    goto :goto_1

    .line 535
    :cond_7
    const/4 v5, -0x4

    if-ne p1, v5, :cond_8

    .line 536
    invoke-virtual {v1, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;->setIndeterminate(Z)V

    goto :goto_1

    .line 537
    :cond_8
    if-ltz p1, :cond_2

    if-gt p1, v6, :cond_2

    .line 541
    add-int/lit8 v4, p1, 0x0

    invoke-virtual {v1, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;->setProgress(I)V

    .line 543
    if-ge p1, v6, :cond_9

    .line 544
    invoke-direct {p0, v1, v0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->showProgressBars(Landroid/support/v7/internal/widget/ProgressBarICS;Landroid/support/v7/internal/widget/ProgressBarICS;)V

    goto :goto_1

    .line 546
    :cond_9
    invoke-direct {p0, v1, v0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->hideProgressBars(Landroid/support/v7/internal/widget/ProgressBarICS;Landroid/support/v7/internal/widget/ProgressBarICS;)V

    goto :goto_1
.end method


# virtual methods
.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;
    .param p2, "lp"    # Landroid/view/ViewGroup$LayoutParams;

    .prologue
    .line 143
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->ensureSubDecor()V

    .line 144
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    const v2, 0x1020002

    invoke-virtual {v1, v2}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 145
    .local v0, "contentParent":Landroid/view/ViewGroup;
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 146
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v1}, Landroid/support/v7/app/ActionBarActivity;->onSupportContentChanged()V

    .line 147
    return-void
.end method

.method public createSupportActionBar()Landroid/support/v7/app/ActionBar;
    .locals 3

    .prologue
    .line 82
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->ensureSubDecor()V

    .line 83
    new-instance v0, Landroid/support/v7/app/ActionBarImplBase;

    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-direct {v0, v1, v2}, Landroid/support/v7/app/ActionBarImplBase;-><init>(Landroid/support/v7/app/ActionBarActivity;Landroid/support/v7/app/ActionBar$Callback;)V

    return-object v0
.end method

.method final ensureSubDecor()V
    .locals 10

    .prologue
    const v9, 0x1020002

    .line 155
    iget-boolean v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mSubDecorInstalled:Z

    if-nez v7, :cond_4

    .line 156
    iget-boolean v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mHasActionBar:Z

    if-eqz v7, :cond_7

    .line 157
    iget-boolean v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mOverlayActionBar:Z

    if-eqz v7, :cond_5

    .line 158
    iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    sget v8, Landroid/support/v7/appcompat/R$layout;->abc_action_bar_decor_overlay:I

    invoke-virtual {v7, v8}, Landroid/support/v7/app/ActionBarActivity;->superSetContentView(I)V

    .line 162
    :goto_0
    iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    sget v8, Landroid/support/v7/appcompat/R$id;->action_bar:I

    invoke-virtual {v7, v8}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/support/v7/internal/widget/ActionBarView;

    iput-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    .line 163
    iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    iget-object v8, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v7, v8}, Landroid/support/v7/internal/widget/ActionBarView;->setWindowCallback(Landroid/view/Window$Callback;)V

    .line 168
    iget-boolean v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mFeatureProgress:Z

    if-eqz v7, :cond_0

    .line 169
    iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v7}, Landroid/support/v7/internal/widget/ActionBarView;->initProgress()V

    .line 171
    :cond_0
    iget-boolean v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mFeatureIndeterminateProgress:Z

    if-eqz v7, :cond_1

    .line 172
    iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v7}, Landroid/support/v7/internal/widget/ActionBarView;->initIndeterminateProgress()V

    .line 178
    :cond_1
    const-string v7, "splitActionBarWhenNarrow"

    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->getUiOptionsFromMetadata()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    .line 182
    .local v6, "splitWhenNarrow":Z
    if-eqz v6, :cond_6

    .line 183
    iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v7}, Landroid/support/v7/app/ActionBarActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v8, Landroid/support/v7/appcompat/R$bool;->abc_split_action_bar_is_narrow:I

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v4

    .line 192
    .local v4, "splitActionBar":Z
    :goto_1
    iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    sget v8, Landroid/support/v7/appcompat/R$id;->split_action_bar:I

    invoke-virtual {v7, v8}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/support/v7/internal/widget/ActionBarContainer;

    .line 194
    .local v5, "splitView":Landroid/support/v7/internal/widget/ActionBarContainer;
    if-eqz v5, :cond_2

    .line 195
    iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v7, v5}, Landroid/support/v7/internal/widget/ActionBarView;->setSplitView(Landroid/support/v7/internal/widget/ActionBarContainer;)V

    .line 196
    iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v7, v4}, Landroid/support/v7/internal/widget/ActionBarView;->setSplitActionBar(Z)V

    .line 197
    iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v7, v6}, Landroid/support/v7/internal/widget/ActionBarView;->setSplitWhenNarrow(Z)V

    .line 199
    iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    sget v8, Landroid/support/v7/appcompat/R$id;->action_context_bar:I

    invoke-virtual {v7, v8}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/support/v7/internal/widget/ActionBarContextView;

    .line 201
    .local v2, "cab":Landroid/support/v7/internal/widget/ActionBarContextView;
    invoke-virtual {v2, v5}, Landroid/support/v7/internal/widget/ActionBarContextView;->setSplitView(Landroid/support/v7/internal/widget/ActionBarContainer;)V

    .line 202
    invoke-virtual {v2, v4}, Landroid/support/v7/internal/widget/ActionBarContextView;->setSplitActionBar(Z)V

    .line 203
    invoke-virtual {v2, v6}, Landroid/support/v7/internal/widget/ActionBarContextView;->setSplitWhenNarrow(Z)V

    .line 211
    .end local v2    # "cab":Landroid/support/v7/internal/widget/ActionBarContextView;
    .end local v4    # "splitActionBar":Z
    .end local v5    # "splitView":Landroid/support/v7/internal/widget/ActionBarContainer;
    .end local v6    # "splitWhenNarrow":Z
    :cond_2
    :goto_2
    iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v7, v9}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 212
    .local v3, "content":Landroid/view/View;
    const/4 v7, -0x1

    invoke-virtual {v3, v7}, Landroid/view/View;->setId(I)V

    .line 213
    iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    sget v8, Landroid/support/v7/appcompat/R$id;->action_bar_activity_content:I

    invoke-virtual {v7, v8}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 214
    .local v1, "abcContent":Landroid/view/View;
    invoke-virtual {v1, v9}, Landroid/view/View;->setId(I)V

    .line 217
    iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mTitleToSet:Ljava/lang/CharSequence;

    if-eqz v7, :cond_3

    .line 218
    iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    iget-object v8, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mTitleToSet:Ljava/lang/CharSequence;

    invoke-virtual {v7, v8}, Landroid/support/v7/internal/widget/ActionBarView;->setWindowTitle(Ljava/lang/CharSequence;)V

    .line 219
    const/4 v7, 0x0

    iput-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mTitleToSet:Ljava/lang/CharSequence;

    .line 222
    :cond_3
    invoke-direct {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->applyFixedSizeWindow()V

    .line 224
    const/4 v7, 0x1

    iput-boolean v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mSubDecorInstalled:Z

    .line 227
    iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v7}, Landroid/support/v7/app/ActionBarActivity;->getWindow()Landroid/view/Window;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v7

    new-instance v8, Landroid/support/v7/app/ActionBarActivityDelegateBase$1;

    invoke-direct {v8, p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase$1;-><init>(Landroid/support/v7/app/ActionBarActivityDelegateBase;)V

    invoke-virtual {v7, v8}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 234
    .end local v1    # "abcContent":Landroid/view/View;
    .end local v3    # "content":Landroid/view/View;
    :cond_4
    return-void

    .line 160
    :cond_5
    iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    sget v8, Landroid/support/v7/appcompat/R$layout;->abc_action_bar_decor:I

    invoke-virtual {v7, v8}, Landroid/support/v7/app/ActionBarActivity;->superSetContentView(I)V

    goto/16 :goto_0

    .line 186
    .restart local v6    # "splitWhenNarrow":Z
    :cond_6
    iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    sget-object v8, Landroid/support/v7/appcompat/R$styleable;->ActionBarWindow:[I

    invoke-virtual {v7, v8}, Landroid/support/v7/app/ActionBarActivity;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 187
    .local v0, "a":Landroid/content/res/TypedArray;
    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-virtual {v0, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    .line 189
    .restart local v4    # "splitActionBar":Z
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    goto/16 :goto_1

    .line 206
    .end local v0    # "a":Landroid/content/res/TypedArray;
    .end local v4    # "splitActionBar":Z
    .end local v6    # "splitWhenNarrow":Z
    :cond_7
    iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    sget v8, Landroid/support/v7/appcompat/R$layout;->abc_simple_decor:I

    invoke-virtual {v7, v8}, Landroid/support/v7/app/ActionBarActivity;->superSetContentView(I)V

    goto :goto_2
.end method

.method getHomeAsUpIndicatorAttrId()I
    .locals 1

    .prologue
    .line 506
    sget v0, Landroid/support/v7/appcompat/R$attr;->homeAsUpIndicator:I

    return v0
.end method

.method public onBackPressed()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 467
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionMode:Landroid/support/v7/view/ActionMode;

    if-eqz v1, :cond_0

    .line 468
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionMode:Landroid/support/v7/view/ActionMode;

    invoke-virtual {v1}, Landroid/support/v7/view/ActionMode;->finish()V

    .line 478
    :goto_0
    return v0

    .line 473
    :cond_0
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarView;->hasExpandedActionView()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 474
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarView;->collapseActionView()V

    goto :goto_0

    .line 478
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onCloseMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V
    .locals 1
    .param p1, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
    .param p2, "allMenusAreClosing"    # Z

    .prologue
    .line 367
    iget-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mClosingActionMenu:Z

    if-eqz v0, :cond_0

    .line 374
    :goto_0
    return-void

    .line 370
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mClosingActionMenu:Z

    .line 371
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0}, Landroid/support/v7/app/ActionBarActivity;->closeOptionsMenu()V

    .line 372
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->dismissPopupMenus()V

    .line 373
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mClosingActionMenu:Z

    goto :goto_0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2
    .param p1, "newConfig"    # Landroid/content/res/Configuration;

    .prologue
    .line 90
    iget-boolean v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mHasActionBar:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mSubDecorInstalled:Z

    if-eqz v1, :cond_0

    .line 93
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    check-cast v0, Landroid/support/v7/app/ActionBarImplBase;

    .line 94
    .local v0, "actionBar":Landroid/support/v7/app/ActionBarImplBase;
    invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBarImplBase;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 96
    .end local v0    # "actionBar":Landroid/support/v7/app/ActionBarImplBase;
    :cond_0
    return-void
.end method

.method public onContentChanged()V
    .locals 0

    .prologue
    .line 152
    return-void
.end method

.method public onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 1
    .param p1, "featureId"    # I
    .param p2, "menu"    # Landroid/view/Menu;

    .prologue
    .line 333
    if-eqz p1, :cond_0

    .line 334
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/ActionBarActivity;->superOnCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v0

    .line 336
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onCreatePanelView(I)Landroid/view/View;
    .locals 2
    .param p1, "featureId"    # I

    .prologue
    .line 322
    const/4 v0, 0x0

    .line 324
    .local v0, "createdPanelView":Landroid/view/View;
    if-nez p1, :cond_0

    invoke-direct {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->preparePanel()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 325
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-direct {p0, v1, p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->getListMenuView(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)Landroid/support/v7/internal/view/menu/MenuView;

    move-result-object v0

    .end local v0    # "createdPanelView":Landroid/view/View;
    check-cast v0, Landroid/view/View;

    .line 328
    .restart local v0    # "createdPanelView":Landroid/view/View;
    :cond_0
    return-object v0
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1
    .param p1, "featureId"    # I
    .param p2, "item"    # Landroid/view/MenuItem;

    .prologue
    .line 349
    if-nez p1, :cond_0

    .line 350
    invoke-static {p2}, Landroid/support/v7/internal/view/menu/MenuWrapperFactory;->createMenuItemWrapper(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    move-result-object p2

    .line 352
    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/ActionBarActivity;->superOnMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onMenuItemSelected(Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/MenuItem;)Z
    .locals 2
    .param p1, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
    .param p2, "item"    # Landroid/view/MenuItem;

    .prologue
    .line 357
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p2}, Landroid/support/v7/app/ActionBarActivity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onMenuModeChange(Landroid/support/v7/internal/view/menu/MenuBuilder;)V
    .locals 1
    .param p1, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;

    .prologue
    .line 362
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->reopenMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V

    .line 363
    return-void
.end method

.method public onOpenSubMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;)Z
    .locals 1
    .param p1, "subMenu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;

    .prologue
    .line 378
    const/4 v0, 0x0

    return v0
.end method

.method public onPostResume()V
    .locals 2

    .prologue
    .line 108
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    check-cast v0, Landroid/support/v7/app/ActionBarImplBase;

    .line 109
    .local v0, "ab":Landroid/support/v7/app/ActionBarImplBase;
    if-eqz v0, :cond_0

    .line 110
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBarImplBase;->setShowHideAnimationEnabled(Z)V

    .line 112
    :cond_0
    return-void
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 1
    .param p1, "featureId"    # I
    .param p2, "view"    # Landroid/view/View;
    .param p3, "menu"    # Landroid/view/Menu;

    .prologue
    .line 341
    if-eqz p1, :cond_0

    .line 342
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v7/app/ActionBarActivity;->superOnPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    .line 344
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onStop()V
    .locals 2

    .prologue
    .line 100
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    check-cast v0, Landroid/support/v7/app/ActionBarImplBase;

    .line 101
    .local v0, "ab":Landroid/support/v7/app/ActionBarImplBase;
    if-eqz v0, :cond_0

    .line 102
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBarImplBase;->setShowHideAnimationEnabled(Z)V

    .line 104
    :cond_0
    return-void
.end method

.method public onTitleChanged(Ljava/lang/CharSequence;)V
    .locals 1
    .param p1, "title"    # Ljava/lang/CharSequence;

    .prologue
    .line 313
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    if-eqz v0, :cond_0

    .line 314
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setWindowTitle(Ljava/lang/CharSequence;)V

    .line 318
    :goto_0
    return-void

    .line 316
    :cond_0
    iput-object p1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mTitleToSet:Ljava/lang/CharSequence;

    goto :goto_0
.end method

.method public setContentView(I)V
    .locals 3
    .param p1, "resId"    # I

    .prologue
    .line 125
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->ensureSubDecor()V

    .line 126
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    const v2, 0x1020002

    invoke-virtual {v1, v2}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 127
    .local v0, "contentParent":Landroid/view/ViewGroup;
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 128
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v1}, Landroid/support/v7/app/ActionBarActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 129
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v1}, Landroid/support/v7/app/ActionBarActivity;->onSupportContentChanged()V

    .line 130
    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 116
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->ensureSubDecor()V

    .line 117
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    const v2, 0x1020002

    invoke-virtual {v1, v2}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 118
    .local v0, "contentParent":Landroid/view/ViewGroup;
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 119
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 120
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v1}, Landroid/support/v7/app/ActionBarActivity;->onSupportContentChanged()V

    .line 121
    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;
    .param p2, "lp"    # Landroid/view/ViewGroup$LayoutParams;

    .prologue
    .line 134
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->ensureSubDecor()V

    .line 135
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    const v2, 0x1020002

    invoke-virtual {v1, v2}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 136
    .local v0, "contentParent":Landroid/view/ViewGroup;
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 137
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 138
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v1}, Landroid/support/v7/app/ActionBarActivity;->onSupportContentChanged()V

    .line 139
    return-void
.end method

.method setSupportProgress(I)V
    .locals 1
    .param p1, "progress"    # I

    .prologue
    .line 501
    add-int/lit8 v0, p1, 0x0

    invoke-direct {p0, v0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->updateProgressBars(I)V

    .line 502
    return-void
.end method

.method setSupportProgressBarIndeterminate(Z)V
    .locals 1
    .param p1, "indeterminate"    # Z

    .prologue
    .line 495
    if-eqz p1, :cond_0

    const/4 v0, -0x3

    :goto_0
    invoke-direct {p0, v0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->updateProgressBars(I)V

    .line 497
    return-void

    .line 495
    :cond_0
    const/4 v0, -0x4

    goto :goto_0
.end method

.method setSupportProgressBarIndeterminateVisibility(Z)V
    .locals 1
    .param p1, "visible"    # Z

    .prologue
    .line 489
    if-eqz p1, :cond_0

    const/4 v0, -0x1

    :goto_0
    invoke-direct {p0, v0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->updateProgressBars(I)V

    .line 491
    return-void

    .line 489
    :cond_0
    const/4 v0, -0x2

    goto :goto_0
.end method

.method setSupportProgressBarVisibility(Z)V
    .locals 1
    .param p1, "visible"    # Z

    .prologue
    .line 483
    if-eqz p1, :cond_0

    const/4 v0, -0x1

    :goto_0
    invoke-direct {p0, v0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->updateProgressBars(I)V

    .line 485
    return-void

    .line 483
    :cond_0
    const/4 v0, -0x2

    goto :goto_0
.end method

.method public startSupportActionMode(Landroid/support/v7/view/ActionMode$Callback;)Landroid/support/v7/view/ActionMode;
    .locals 4
    .param p1, "callback"    # Landroid/support/v7/view/ActionMode$Callback;

    .prologue
    .line 383
    if-nez p1, :cond_0

    .line 384
    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "ActionMode callback can not be null."

    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 387
    :cond_0
    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionMode:Landroid/support/v7/view/ActionMode;

    if-eqz v2, :cond_1

    .line 388
    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionMode:Landroid/support/v7/view/ActionMode;

    invoke-virtual {v2}, Landroid/support/v7/view/ActionMode;->finish()V

    .line 391
    :cond_1
    new-instance v1, Landroid/support/v7/app/ActionBarActivityDelegateBase$ActionModeCallbackWrapper;

    invoke-direct {v1, p0, p1}, Landroid/support/v7/app/ActionBarActivityDelegateBase$ActionModeCallbackWrapper;-><init>(Landroid/support/v7/app/ActionBarActivityDelegateBase;Landroid/support/v7/view/ActionMode$Callback;)V

    .line 393
    .local v1, "wrappedCallback":Landroid/support/v7/view/ActionMode$Callback;
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    check-cast v0, Landroid/support/v7/app/ActionBarImplBase;

    .line 394
    .local v0, "ab":Landroid/support/v7/app/ActionBarImplBase;
    if-eqz v0, :cond_2

    .line 395
    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBarImplBase;->startActionMode(Landroid/support/v7/view/ActionMode$Callback;)Landroid/support/v7/view/ActionMode;

    move-result-object v2

    iput-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionMode:Landroid/support/v7/view/ActionMode;

    .line 398
    :cond_2
    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionMode:Landroid/support/v7/view/ActionMode;

    if-eqz v2, :cond_3

    .line 399
    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    iget-object v3, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionMode:Landroid/support/v7/view/ActionMode;

    invoke-virtual {v2, v3}, Landroid/support/v7/app/ActionBarActivity;->onSupportActionModeStarted(Landroid/support/v7/view/ActionMode;)V

    .line 401
    :cond_3
    iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionMode:Landroid/support/v7/view/ActionMode;

    return-object v2
.end method

.method public supportInvalidateOptionsMenu()V
    .locals 2

    .prologue
    .line 406
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    if-eqz v1, :cond_1

    .line 407
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 408
    .local v0, "savedActionViewStates":Landroid/os/Bundle;
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v1, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->saveActionViewStates(Landroid/os/Bundle;)V

    .line 409
    invoke-virtual {v0}, Landroid/os/Bundle;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 410
    iput-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mPanelFrozenActionViewState:Landroid/os/Bundle;

    .line 413
    :cond_0
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->stopDispatchingItemsChanged()V

    .line 414
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->clear()V

    .line 416
    .end local v0    # "savedActionViewStates":Landroid/os/Bundle;
    :cond_1
    const/4 v1, 0x1

    iput-boolean v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mPanelRefreshContent:Z

    .line 419
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;

    if-eqz v1, :cond_2

    .line 420
    const/4 v1, 0x0

    iput-boolean v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mPanelIsPrepared:Z

    .line 421
    invoke-direct {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->preparePanel()Z

    .line 423
    :cond_2
    return-void
.end method

.method public supportRequestWindowFeature(I)Z
    .locals 1
    .param p1, "featureId"    # I

    .prologue
    const/4 v0, 0x1

    .line 293
    packed-switch p1, :pswitch_data_0

    .line 307
    :pswitch_0
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBarActivity;->requestWindowFeature(I)Z

    move-result v0

    :goto_0
    return v0

    .line 295
    :pswitch_1
    iput-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mHasActionBar:Z

    goto :goto_0

    .line 298
    :pswitch_2
    iput-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mOverlayActionBar:Z

    goto :goto_0

    .line 301
    :pswitch_3
    iput-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mFeatureProgress:Z

    goto :goto_0

    .line 304
    :pswitch_4
    iput-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mFeatureIndeterminateProgress:Z

    goto :goto_0

    .line 293
    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
