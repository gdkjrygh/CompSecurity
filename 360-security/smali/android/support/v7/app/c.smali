.class Landroid/support/v7/app/c;
.super Landroid/support/v7/app/a;
.source "360Security"

# interfaces
.implements Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;
.implements Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;


# static fields
.field private static final d:[I


# instance fields
.field private e:Landroid/support/v7/internal/widget/ActionBarView;

.field private f:Landroid/support/v7/internal/view/menu/ListMenuPresenter;

.field private g:Landroid/support/v7/internal/view/menu/MenuBuilder;

.field private h:Landroid/support/v7/b/a;

.field private i:Z

.field private j:Ljava/lang/CharSequence;

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 52
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    sget v2, Landroid/support/v7/a/a$b;->homeAsUpIndicator:I

    aput v2, v0, v1

    sput-object v0, Landroid/support/v7/app/c;->d:[I

    return-void
.end method

.method constructor <init>(Landroid/support/v7/app/ActionBarActivity;)V
    .locals 0

    .prologue
    .line 77
    invoke-direct {p0, p1}, Landroid/support/v7/app/a;-><init>(Landroid/support/v7/app/ActionBarActivity;)V

    .line 78
    return-void
.end method

.method private a(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)Landroid/support/v7/internal/view/menu/MenuView;
    .locals 3

    .prologue
    .line 441
    iget-object v0, p0, Landroid/support/v7/app/c;->g:Landroid/support/v7/internal/view/menu/MenuBuilder;

    if-nez v0, :cond_0

    .line 442
    const/4 v0, 0x0

    .line 461
    :goto_0
    return-object v0

    .line 445
    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/c;->f:Landroid/support/v7/internal/view/menu/ListMenuPresenter;

    if-nez v0, :cond_1

    .line 446
    sget-object v0, Landroid/support/v7/a/a$j;->Theme:[I

    invoke-virtual {p1, v0}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 447
    const/4 v1, 0x4

    sget v2, Landroid/support/v7/a/a$i;->Theme_AppCompat_CompactMenu:I

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 450
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 452
    new-instance v0, Landroid/support/v7/internal/view/menu/ListMenuPresenter;

    sget v2, Landroid/support/v7/a/a$g;->abc_list_menu_item_layout:I

    invoke-direct {v0, v2, v1}, Landroid/support/v7/internal/view/menu/ListMenuPresenter;-><init>(II)V

    iput-object v0, p0, Landroid/support/v7/app/c;->f:Landroid/support/v7/internal/view/menu/ListMenuPresenter;

    .line 454
    iget-object v0, p0, Landroid/support/v7/app/c;->f:Landroid/support/v7/internal/view/menu/ListMenuPresenter;

    invoke-virtual {v0, p2}, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->setCallback(Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V

    .line 455
    iget-object v0, p0, Landroid/support/v7/app/c;->g:Landroid/support/v7/internal/view/menu/MenuBuilder;

    iget-object v1, p0, Landroid/support/v7/app/c;->f:Landroid/support/v7/internal/view/menu/ListMenuPresenter;

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V

    .line 461
    :goto_1
    iget-object v0, p0, Landroid/support/v7/app/c;->f:Landroid/support/v7/internal/view/menu/ListMenuPresenter;

    new-instance v1, Landroid/widget/FrameLayout;

    invoke-direct {v1, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->getMenuView(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView;

    move-result-object v0

    goto :goto_0

    .line 458
    :cond_1
    iget-object v0, p0, Landroid/support/v7/app/c;->f:Landroid/support/v7/internal/view/menu/ListMenuPresenter;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->updateMenuView(Z)V

    goto :goto_1
.end method

.method private a(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V
    .locals 1

    .prologue
    .line 426
    iget-object v0, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->isOverflowReserved()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 427
    iget-object v0, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->isOverflowMenuShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    if-nez p2, :cond_2

    .line 428
    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    .line 429
    iget-object v0, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->showOverflowMenu()Z

    .line 438
    :cond_1
    :goto_0
    return-void

    .line 432
    :cond_2
    iget-object v0, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->hideOverflowMenu()Z

    goto :goto_0

    .line 437
    :cond_3
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->close()V

    goto :goto_0
.end method

.method private l()V
    .locals 11

    .prologue
    const/4 v3, 0x3

    const/4 v1, 0x0

    const/4 v10, 0x6

    const/4 v9, 0x5

    const/4 v4, -0x1

    .line 237
    iget-object v0, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    sget-object v2, Landroid/support/v7/a/a$j;->ActionBarWindow:[I

    invoke-virtual {v0, v2}, Landroid/support/v7/app/ActionBarActivity;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v6

    .line 244
    invoke-virtual {v6, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 245
    if-nez v1, :cond_f

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 246
    :goto_0
    invoke-virtual {v6, v3, v0}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 248
    :goto_1
    invoke-virtual {v6, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_e

    .line 249
    if-nez v1, :cond_d

    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 250
    :goto_2
    invoke-virtual {v6, v9, v2}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 252
    :goto_3
    invoke-virtual {v6, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_c

    .line 253
    if-nez v1, :cond_b

    new-instance v3, Landroid/util/TypedValue;

    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    .line 254
    :goto_4
    invoke-virtual {v6, v10, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 256
    :goto_5
    const/4 v5, 0x4

    invoke-virtual {v6, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 257
    if-nez v1, :cond_0

    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    .line 258
    :cond_0
    const/4 v5, 0x4

    invoke-virtual {v6, v5, v1}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 261
    :cond_1
    iget-object v5, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v5}, Landroid/support/v7/app/ActionBarActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v7

    .line 262
    iget v5, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v8, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    if-ge v5, v8, :cond_4

    const/4 v5, 0x1

    .line 266
    :goto_6
    if-eqz v5, :cond_5

    .line 267
    :goto_7
    if-eqz v2, :cond_a

    iget v0, v2, Landroid/util/TypedValue;->type:I

    if-eqz v0, :cond_a

    .line 268
    iget v0, v2, Landroid/util/TypedValue;->type:I

    if-ne v0, v9, :cond_6

    .line 269
    invoke-virtual {v2, v7}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    move v2, v0

    .line 275
    :goto_8
    if-eqz v5, :cond_7

    .line 276
    :goto_9
    if-eqz v3, :cond_9

    iget v0, v3, Landroid/util/TypedValue;->type:I

    if-eqz v0, :cond_9

    .line 277
    iget v0, v3, Landroid/util/TypedValue;->type:I

    if-ne v0, v9, :cond_8

    .line 278
    invoke-virtual {v3, v7}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    .line 284
    :goto_a
    if-ne v2, v4, :cond_2

    if-eq v0, v4, :cond_3

    .line 285
    :cond_2
    iget-object v1, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v1}, Landroid/support/v7/app/ActionBarActivity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1, v2, v0}, Landroid/view/Window;->setLayout(II)V

    .line 288
    :cond_3
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 289
    return-void

    .line 262
    :cond_4
    const/4 v5, 0x0

    goto :goto_6

    :cond_5
    move-object v2, v0

    .line 266
    goto :goto_7

    .line 270
    :cond_6
    iget v0, v2, Landroid/util/TypedValue;->type:I

    if-ne v0, v10, :cond_a

    .line 271
    iget v0, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v0, v0

    iget v8, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v8, v8

    invoke-virtual {v2, v0, v8}, Landroid/util/TypedValue;->getFraction(FF)F

    move-result v0

    float-to-int v0, v0

    move v2, v0

    goto :goto_8

    :cond_7
    move-object v3, v1

    .line 275
    goto :goto_9

    .line 279
    :cond_8
    iget v0, v3, Landroid/util/TypedValue;->type:I

    if-ne v0, v10, :cond_9

    .line 280
    iget v0, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v0, v0

    iget v1, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    int-to-float v1, v1

    invoke-virtual {v3, v0, v1}, Landroid/util/TypedValue;->getFraction(FF)F

    move-result v0

    float-to-int v0, v0

    goto :goto_a

    :cond_9
    move v0, v4

    goto :goto_a

    :cond_a
    move v2, v4

    goto :goto_8

    :cond_b
    move-object v3, v1

    goto/16 :goto_4

    :cond_c
    move-object v3, v1

    goto/16 :goto_5

    :cond_d
    move-object v2, v1

    goto/16 :goto_2

    :cond_e
    move-object v2, v1

    goto/16 :goto_3

    :cond_f
    move-object v0, v1

    goto/16 :goto_0

    :cond_10
    move-object v0, v1

    goto/16 :goto_1
.end method

.method private m()Z
    .locals 2

    .prologue
    .line 589
    new-instance v0, Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {p0}, Landroid/support/v7/app/c;->j()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Landroid/support/v7/app/c;->g:Landroid/support/v7/internal/view/menu/MenuBuilder;

    .line 590
    iget-object v0, p0, Landroid/support/v7/app/c;->g:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v0, p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->setCallback(Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;)V

    .line 591
    const/4 v0, 0x1

    return v0
.end method

.method private n()Z
    .locals 5

    .prologue
    const/4 v0, 0x1

    const/4 v4, 0x0

    const/4 v1, 0x0

    .line 596
    iget-boolean v2, p0, Landroid/support/v7/app/c;->n:Z

    if-eqz v2, :cond_0

    .line 659
    :goto_0
    return v0

    .line 601
    :cond_0
    iget-object v2, p0, Landroid/support/v7/app/c;->g:Landroid/support/v7/internal/view/menu/MenuBuilder;

    if-eqz v2, :cond_1

    iget-boolean v2, p0, Landroid/support/v7/app/c;->o:Z

    if-eqz v2, :cond_7

    .line 602
    :cond_1
    iget-object v2, p0, Landroid/support/v7/app/c;->g:Landroid/support/v7/internal/view/menu/MenuBuilder;

    if-nez v2, :cond_3

    .line 603
    invoke-direct {p0}, Landroid/support/v7/app/c;->m()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Landroid/support/v7/app/c;->g:Landroid/support/v7/internal/view/menu/MenuBuilder;

    if-nez v2, :cond_3

    :cond_2
    move v0, v1

    .line 604
    goto :goto_0

    .line 608
    :cond_3
    iget-object v2, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    if-eqz v2, :cond_4

    .line 609
    iget-object v2, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    iget-object v3, p0, Landroid/support/v7/app/c;->g:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v2, v3, p0}, Landroid/support/v7/internal/widget/ActionBarView;->setMenu(Landroid/support/v4/a/a/a;Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V

    .line 614
    :cond_4
    iget-object v2, p0, Landroid/support/v7/app/c;->g:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->stopDispatchingItemsChanged()V

    .line 617
    iget-object v2, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    iget-object v3, p0, Landroid/support/v7/app/c;->g:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v2, v1, v3}, Landroid/support/v7/app/ActionBarActivity;->a(ILandroid/view/Menu;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 619
    iput-object v4, p0, Landroid/support/v7/app/c;->g:Landroid/support/v7/internal/view/menu/MenuBuilder;

    .line 621
    iget-object v0, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    if-eqz v0, :cond_5

    .line 623
    iget-object v0, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, v4, p0}, Landroid/support/v7/internal/widget/ActionBarView;->setMenu(Landroid/support/v4/a/a/a;Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V

    :cond_5
    move v0, v1

    .line 626
    goto :goto_0

    .line 629
    :cond_6
    iput-boolean v1, p0, Landroid/support/v7/app/c;->o:Z

    .line 634
    :cond_7
    iget-object v2, p0, Landroid/support/v7/app/c;->g:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->stopDispatchingItemsChanged()V

    .line 638
    iget-object v2, p0, Landroid/support/v7/app/c;->p:Landroid/os/Bundle;

    if-eqz v2, :cond_8

    .line 639
    iget-object v2, p0, Landroid/support/v7/app/c;->g:Landroid/support/v7/internal/view/menu/MenuBuilder;

    iget-object v3, p0, Landroid/support/v7/app/c;->p:Landroid/os/Bundle;

    invoke-virtual {v2, v3}, Landroid/support/v7/internal/view/menu/MenuBuilder;->restoreActionViewStates(Landroid/os/Bundle;)V

    .line 640
    iput-object v4, p0, Landroid/support/v7/app/c;->p:Landroid/os/Bundle;

    .line 644
    :cond_8
    iget-object v2, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    iget-object v3, p0, Landroid/support/v7/app/c;->g:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v2, v1, v4, v3}, Landroid/support/v7/app/ActionBarActivity;->a(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v2

    if-nez v2, :cond_a

    .line 645
    iget-object v0, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    if-eqz v0, :cond_9

    .line 648
    iget-object v0, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, v4, p0}, Landroid/support/v7/internal/widget/ActionBarView;->setMenu(Landroid/support/v4/a/a/a;Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V

    .line 650
    :cond_9
    iget-object v0, p0, Landroid/support/v7/app/c;->g:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->startDispatchingItemsChanged()V

    move v0, v1

    .line 651
    goto :goto_0

    .line 654
    :cond_a
    iget-object v1, p0, Landroid/support/v7/app/c;->g:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->startDispatchingItemsChanged()V

    .line 657
    iput-boolean v0, p0, Landroid/support/v7/app/c;->n:Z

    goto :goto_0
.end method


# virtual methods
.method public a()Landroid/support/v7/app/ActionBar;
    .locals 3

    .prologue
    .line 82
    invoke-virtual {p0}, Landroid/support/v7/app/c;->k()V

    .line 83
    new-instance v0, Landroid/support/v7/app/h;

    iget-object v1, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    iget-object v2, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    invoke-direct {v0, v1, v2}, Landroid/support/v7/app/h;-><init>(Landroid/support/v7/app/ActionBarActivity;Landroid/support/v7/app/ActionBar$a;)V

    return-object v0
.end method

.method public a(I)V
    .locals 2

    .prologue
    .line 125
    invoke-virtual {p0}, Landroid/support/v7/app/c;->k()V

    .line 126
    iget-object v0, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 127
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 128
    iget-object v1, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v1}, Landroid/support/v7/app/ActionBarActivity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 129
    iget-object v0, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0}, Landroid/support/v7/app/ActionBarActivity;->h()V

    .line 130
    return-void
.end method

.method public a(Landroid/content/res/Configuration;)V
    .locals 1

    .prologue
    .line 90
    iget-boolean v0, p0, Landroid/support/v7/app/c;->b:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/app/c;->i:Z

    if-eqz v0, :cond_0

    .line 93
    invoke-virtual {p0}, Landroid/support/v7/app/c;->b()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    check-cast v0, Landroid/support/v7/app/h;

    .line 94
    invoke-virtual {v0, p1}, Landroid/support/v7/app/h;->a(Landroid/content/res/Configuration;)V

    .line 96
    :cond_0
    return-void
.end method

.method public a(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 116
    invoke-virtual {p0}, Landroid/support/v7/app/c;->k()V

    .line 117
    iget-object v0, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 118
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 119
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 120
    iget-object v0, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0}, Landroid/support/v7/app/ActionBarActivity;->h()V

    .line 121
    return-void
.end method

.method public a(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .prologue
    .line 134
    invoke-virtual {p0}, Landroid/support/v7/app/c;->k()V

    .line 135
    iget-object v0, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 136
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 137
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 138
    iget-object v0, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0}, Landroid/support/v7/app/ActionBarActivity;->h()V

    .line 139
    return-void
.end method

.method public a(Ljava/lang/CharSequence;)V
    .locals 1

    .prologue
    .line 313
    iget-object v0, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    if-eqz v0, :cond_0

    .line 314
    iget-object v0, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setWindowTitle(Ljava/lang/CharSequence;)V

    .line 318
    :goto_0
    return-void

    .line 316
    :cond_0
    iput-object p1, p0, Landroid/support/v7/app/c;->j:Ljava/lang/CharSequence;

    goto :goto_0
.end method

.method public a(ILandroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 333
    if-eqz p1, :cond_0

    .line 334
    iget-object v0, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/ActionBarActivity;->a(ILandroid/view/Menu;)Z

    move-result v0

    .line 336
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(ILandroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 349
    if-nez p1, :cond_0

    .line 350
    invoke-static {p2}, Landroid/support/v7/internal/view/menu/MenuWrapperFactory;->createMenuItemWrapper(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    move-result-object p2

    .line 352
    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/ActionBarActivity;->a(ILandroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public a(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 341
    if-eqz p1, :cond_0

    .line 342
    iget-object v0, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v7/app/ActionBarActivity;->a(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    .line 344
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(I)Landroid/view/View;
    .locals 2

    .prologue
    .line 322
    const/4 v0, 0x0

    .line 324
    if-nez p1, :cond_0

    invoke-direct {p0}, Landroid/support/v7/app/c;->n()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 325
    iget-object v0, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    invoke-direct {p0, v0, p0}, Landroid/support/v7/app/c;->a(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)Landroid/support/v7/internal/view/menu/MenuView;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 328
    :cond_0
    return-object v0
.end method

.method public b(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    .prologue
    .line 143
    invoke-virtual {p0}, Landroid/support/v7/app/c;->k()V

    .line 144
    iget-object v0, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 145
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 146
    iget-object v0, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0}, Landroid/support/v7/app/ActionBarActivity;->h()V

    .line 147
    return-void
.end method

.method public d()V
    .locals 2

    .prologue
    .line 100
    invoke-virtual {p0}, Landroid/support/v7/app/c;->b()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    check-cast v0, Landroid/support/v7/app/h;

    .line 101
    if-eqz v0, :cond_0

    .line 102
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/app/h;->g(Z)V

    .line 104
    :cond_0
    return-void
.end method

.method public e()V
    .locals 2

    .prologue
    .line 108
    invoke-virtual {p0}, Landroid/support/v7/app/c;->b()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    check-cast v0, Landroid/support/v7/app/h;

    .line 109
    if-eqz v0, :cond_0

    .line 110
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v7/app/h;->g(Z)V

    .line 112
    :cond_0
    return-void
.end method

.method public f()V
    .locals 2

    .prologue
    .line 406
    iget-object v0, p0, Landroid/support/v7/app/c;->g:Landroid/support/v7/internal/view/menu/MenuBuilder;

    if-eqz v0, :cond_1

    .line 407
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 408
    iget-object v1, p0, Landroid/support/v7/app/c;->g:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v1, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->saveActionViewStates(Landroid/os/Bundle;)V

    .line 409
    invoke-virtual {v0}, Landroid/os/Bundle;->size()I

    move-result v1

    if-lez v1, :cond_0

    .line 410
    iput-object v0, p0, Landroid/support/v7/app/c;->p:Landroid/os/Bundle;

    .line 413
    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/c;->g:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->stopDispatchingItemsChanged()V

    .line 414
    iget-object v0, p0, Landroid/support/v7/app/c;->g:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->clear()V

    .line 416
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/app/c;->o:Z

    .line 419
    iget-object v0, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    if-eqz v0, :cond_2

    .line 420
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/app/c;->n:Z

    .line 421
    invoke-direct {p0}, Landroid/support/v7/app/c;->n()Z

    .line 423
    :cond_2
    return-void
.end method

.method public g()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 467
    iget-object v1, p0, Landroid/support/v7/app/c;->h:Landroid/support/v7/b/a;

    if-eqz v1, :cond_0

    .line 468
    iget-object v1, p0, Landroid/support/v7/app/c;->h:Landroid/support/v7/b/a;

    invoke-virtual {v1}, Landroid/support/v7/b/a;->finish()V

    .line 478
    :goto_0
    return v0

    .line 473
    :cond_0
    iget-object v1, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarView;->hasExpandedActionView()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 474
    iget-object v1, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarView;->collapseActionView()V

    goto :goto_0

    .line 478
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public h()V
    .locals 0

    .prologue
    .line 152
    return-void
.end method

.method final k()V
    .locals 6

    .prologue
    const v5, 0x1020002

    .line 155
    iget-boolean v0, p0, Landroid/support/v7/app/c;->i:Z

    if-nez v0, :cond_4

    .line 156
    iget-boolean v0, p0, Landroid/support/v7/app/c;->b:Z

    if-eqz v0, :cond_7

    .line 157
    iget-boolean v0, p0, Landroid/support/v7/app/c;->c:Z

    if-eqz v0, :cond_5

    .line 158
    iget-object v0, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    sget v1, Landroid/support/v7/a/a$g;->abc_action_bar_decor_overlay:I

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBarActivity;->a_(I)V

    .line 162
    :goto_0
    iget-object v0, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    sget v1, Landroid/support/v7/a/a$e;->action_bar:I

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/widget/ActionBarView;

    iput-object v0, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    .line 163
    iget-object v0, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    iget-object v1, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->setWindowCallback(Landroid/view/Window$Callback;)V

    .line 168
    iget-boolean v0, p0, Landroid/support/v7/app/c;->k:Z

    if-eqz v0, :cond_0

    .line 169
    iget-object v0, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->initProgress()V

    .line 171
    :cond_0
    iget-boolean v0, p0, Landroid/support/v7/app/c;->l:Z

    if-eqz v0, :cond_1

    .line 172
    iget-object v0, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->initIndeterminateProgress()V

    .line 178
    :cond_1
    const-string/jumbo v0, "splitActionBarWhenNarrow"

    invoke-virtual {p0}, Landroid/support/v7/app/c;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    .line 182
    if-eqz v3, :cond_6

    .line 183
    iget-object v0, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0}, Landroid/support/v7/app/ActionBarActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Landroid/support/v7/a/a$c;->abc_split_action_bar_is_narrow:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    move v2, v0

    .line 192
    :goto_1
    iget-object v0, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    sget v1, Landroid/support/v7/a/a$e;->split_action_bar:I

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/widget/ActionBarContainer;

    .line 194
    if-eqz v0, :cond_2

    .line 195
    iget-object v1, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v1, v0}, Landroid/support/v7/internal/widget/ActionBarView;->setSplitView(Landroid/support/v7/internal/widget/ActionBarContainer;)V

    .line 196
    iget-object v1, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v1, v2}, Landroid/support/v7/internal/widget/ActionBarView;->setSplitActionBar(Z)V

    .line 197
    iget-object v1, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ActionBarView;->setSplitWhenNarrow(Z)V

    .line 199
    iget-object v1, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    sget v4, Landroid/support/v7/a/a$e;->action_context_bar:I

    invoke-virtual {v1, v4}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/support/v7/internal/widget/ActionBarContextView;

    .line 201
    invoke-virtual {v1, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->setSplitView(Landroid/support/v7/internal/widget/ActionBarContainer;)V

    .line 202
    invoke-virtual {v1, v2}, Landroid/support/v7/internal/widget/ActionBarContextView;->setSplitActionBar(Z)V

    .line 203
    invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ActionBarContextView;->setSplitWhenNarrow(Z)V

    .line 211
    :cond_2
    :goto_2
    iget-object v0, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0, v5}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 212
    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 213
    iget-object v0, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    sget v1, Landroid/support/v7/a/a$e;->action_bar_activity_content:I

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 214
    invoke-virtual {v0, v5}, Landroid/view/View;->setId(I)V

    .line 217
    iget-object v0, p0, Landroid/support/v7/app/c;->j:Ljava/lang/CharSequence;

    if-eqz v0, :cond_3

    .line 218
    iget-object v0, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    iget-object v1, p0, Landroid/support/v7/app/c;->j:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->setWindowTitle(Ljava/lang/CharSequence;)V

    .line 219
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/app/c;->j:Ljava/lang/CharSequence;

    .line 222
    :cond_3
    invoke-direct {p0}, Landroid/support/v7/app/c;->l()V

    .line 224
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/app/c;->i:Z

    .line 227
    iget-object v0, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0}, Landroid/support/v7/app/ActionBarActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Landroid/support/v7/app/c$1;

    invoke-direct {v1, p0}, Landroid/support/v7/app/c$1;-><init>(Landroid/support/v7/app/c;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 234
    :cond_4
    return-void

    .line 160
    :cond_5
    iget-object v0, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    sget v1, Landroid/support/v7/a/a$g;->abc_action_bar_decor:I

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBarActivity;->a_(I)V

    goto/16 :goto_0

    .line 186
    :cond_6
    iget-object v0, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    sget-object v1, Landroid/support/v7/a/a$j;->ActionBarWindow:[I

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBarActivity;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 187
    const/4 v0, 0x2

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    .line 189
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    move v2, v0

    goto/16 :goto_1

    .line 206
    :cond_7
    iget-object v0, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    sget v1, Landroid/support/v7/a/a$g;->abc_simple_decor:I

    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBarActivity;->a_(I)V

    goto :goto_2
.end method

.method public onCloseMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V
    .locals 1

    .prologue
    .line 367
    iget-boolean v0, p0, Landroid/support/v7/app/c;->m:Z

    if-eqz v0, :cond_0

    .line 374
    :goto_0
    return-void

    .line 370
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/app/c;->m:Z

    .line 371
    iget-object v0, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v0}, Landroid/support/v7/app/ActionBarActivity;->closeOptionsMenu()V

    .line 372
    iget-object v0, p0, Landroid/support/v7/app/c;->e:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->dismissPopupMenus()V

    .line 373
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v7/app/c;->m:Z

    goto :goto_0
.end method

.method public onMenuItemSelected(Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/MenuItem;)Z
    .locals 2

    .prologue
    .line 357
    iget-object v0, p0, Landroid/support/v7/app/c;->a:Landroid/support/v7/app/ActionBarActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p2}, Landroid/support/v7/app/ActionBarActivity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    return v0
.end method

.method public onMenuModeChange(Landroid/support/v7/internal/view/menu/MenuBuilder;)V
    .locals 1

    .prologue
    .line 362
    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Landroid/support/v7/app/c;->a(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V

    .line 363
    return-void
.end method

.method public onOpenSubMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;)Z
    .locals 1

    .prologue
    .line 378
    const/4 v0, 0x0

    return v0
.end method
