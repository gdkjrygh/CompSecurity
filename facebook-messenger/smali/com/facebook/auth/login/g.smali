.class Lcom/facebook/auth/login/g;
.super Ljava/lang/Object;
.source "AuthFragmentLogoViewGroup.java"

# interfaces
.implements Lcom/facebook/auth/login/e;


# instance fields
.field final synthetic a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;


# direct methods
.method private constructor <init>(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)V
    .locals 0

    .prologue
    .line 308
    iput-object p1, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;Lcom/facebook/auth/login/d;)V
    .locals 0

    .prologue
    .line 308
    invoke-direct {p0, p1}, Lcom/facebook/auth/login/g;-><init>(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)V

    return-void
.end method

.method private a(Landroid/view/View;Landroid/view/View;)Landroid/view/animation/AnimationSet;
    .locals 10

    .prologue
    const/high16 v9, 0x3f800000    # 1.0f

    const/4 v8, 0x0

    const/4 v7, 0x1

    const/4 v6, 0x3

    const/4 v5, 0x2

    .line 470
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    .line 471
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 472
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    aput v1, v0, v5

    .line 473
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v1

    aput v1, v0, v6

    .line 475
    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_1

    .line 476
    invoke-virtual {p2, v1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 477
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v2

    aput v2, v1, v5

    .line 478
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result v2

    aput v2, v1, v6

    .line 480
    new-instance v2, Landroid/view/animation/AnimationSet;

    invoke-direct {v2, v7}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    .line 482
    new-instance v3, Landroid/view/animation/ScaleAnimation;

    aget v4, v1, v5

    int-to-float v4, v4

    aget v5, v0, v5

    int-to-float v5, v5

    div-float/2addr v4, v5

    aget v5, v1, v6

    int-to-float v5, v5

    aget v6, v0, v6

    int-to-float v6, v6

    div-float/2addr v5, v6

    invoke-direct {v3, v9, v4, v9, v5}, Landroid/view/animation/ScaleAnimation;-><init>(FFFF)V

    invoke-virtual {v2, v3}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 486
    new-instance v3, Landroid/view/animation/TranslateAnimation;

    const/4 v4, 0x0

    aget v4, v1, v4

    const/4 v5, 0x0

    aget v5, v0, v5

    sub-int/2addr v4, v5

    int-to-float v4, v4

    aget v1, v1, v7

    aget v0, v0, v7

    sub-int v0, v1, v0

    int-to-float v0, v0

    invoke-direct {v3, v8, v4, v8, v0}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    invoke-virtual {v2, v3}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    .line 490
    return-object v2

    .line 470
    nop

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x0
    .end array-data

    .line 475
    :array_1
    .array-data 4
        0x0
        0x0
        0x0
        0x0
    .end array-data
.end method

.method static synthetic a(Lcom/facebook/auth/login/g;Landroid/view/View;Landroid/view/View;)Landroid/view/animation/AnimationSet;
    .locals 1

    .prologue
    .line 308
    invoke-direct {p0, p1, p2}, Lcom/facebook/auth/login/g;->a(Landroid/view/View;Landroid/view/View;)Landroid/view/animation/AnimationSet;

    move-result-object v0

    return-object v0
.end method

.method private a(II)[Landroid/graphics/Bitmap;
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 457
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/graphics/Bitmap;

    aput-object v1, v0, v2

    aput-object v1, v0, v3

    .line 458
    if-eqz p1, :cond_0

    .line 459
    iget-object v1, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    invoke-virtual {v1}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {v1, p1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v1

    aput-object v1, v0, v2

    .line 461
    :cond_0
    if-ne p2, p1, :cond_2

    .line 462
    aget-object v1, v0, v2

    aput-object v1, v0, v3

    .line 466
    :cond_1
    :goto_0
    return-object v0

    .line 463
    :cond_2
    if-eqz p2, :cond_1

    .line 464
    iget-object v1, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    invoke-virtual {v1}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {v1, p2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v1

    aput-object v1, v0, v3

    goto :goto_0
.end method

.method private b()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 361
    iget-object v0, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogoGroup:Landroid/view/View;
    invoke-static {v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$300(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 362
    iget-object v1, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashGroup:Landroid/view/View;
    invoke-static {v1}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$400(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    .line 364
    iget-object v2, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    invoke-virtual {v2}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    .line 365
    iget v3, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    if-ge v3, v2, :cond_0

    .line 366
    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 367
    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 372
    :goto_0
    return-void

    .line 369
    :cond_0
    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 370
    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    goto :goto_0
.end method

.method private c()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 376
    iget-object v0, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogo1View:Landroid/widget/ImageView;
    invoke-static {v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$600(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogo1ResId:I
    invoke-static {v1}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$500(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 377
    iget-object v0, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogo2View:Landroid/widget/ImageView;
    invoke-static {v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$800(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogo2ResId:I
    invoke-static {v1}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$700(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 379
    iget-object v0, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashGroup:Landroid/view/View;
    invoke-static {v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$400(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 380
    iget-object v0, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mRootGroup:Landroid/view/View;
    invoke-static {v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$900(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 381
    iget-object v0, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogoGroup:Landroid/view/View;
    invoke-static {v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$300(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 382
    return-void
.end method

.method private d()V
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 399
    new-instance v0, Lcom/facebook/auth/login/i;

    invoke-direct {v0, p0}, Lcom/facebook/auth/login/i;-><init>(Lcom/facebook/auth/login/g;)V

    .line 411
    iget-object v1, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashLogo1ResId:I
    invoke-static {v1}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$1000(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)I

    move-result v1

    iget-object v2, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogo1ResId:I
    invoke-static {v2}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$500(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)I

    move-result v2

    invoke-direct {p0, v1, v2}, Lcom/facebook/auth/login/g;->a(II)[Landroid/graphics/Bitmap;

    move-result-object v1

    .line 412
    iget-object v2, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashLogo2ResId:I
    invoke-static {v2}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$1100(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)I

    move-result v2

    iget-object v3, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogo2ResId:I
    invoke-static {v3}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$700(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)I

    move-result v3

    invoke-direct {p0, v2, v3}, Lcom/facebook/auth/login/g;->a(II)[Landroid/graphics/Bitmap;

    move-result-object v2

    .line 415
    new-instance v3, Lcom/facebook/auth/login/j;

    invoke-direct {v3, p0, v0}, Lcom/facebook/auth/login/j;-><init>(Lcom/facebook/auth/login/g;Ljava/lang/Runnable;)V

    .line 446
    iget-object v0, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashLogo1View:Landroid/widget/ImageView;
    invoke-static {v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$1200(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/widget/ImageView;

    move-result-object v0

    aget-object v4, v1, v5

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 447
    iget-object v0, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mSplashLogo2View:Landroid/widget/ImageView;
    invoke-static {v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$1400(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/widget/ImageView;

    move-result-object v0

    aget-object v4, v2, v5

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 449
    iget-object v0, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogo1View:Landroid/widget/ImageView;
    invoke-static {v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$600(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/widget/ImageView;

    move-result-object v0

    aget-object v1, v1, v6

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 450
    iget-object v0, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mLogo2View:Landroid/widget/ImageView;
    invoke-static {v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$800(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/widget/ImageView;

    move-result-object v0

    aget-object v1, v2, v6

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 453
    iget-object v0, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    const-wide/16 v1, 0xc8

    invoke-virtual {v0, v3, v1, v2}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 454
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 312
    invoke-direct {p0}, Lcom/facebook/auth/login/g;->b()V

    .line 315
    iget-object v0, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    invoke-virtual {v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "orca:authparam:help_url"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 316
    if-eqz v0, :cond_0

    .line 317
    iget-object v0, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mHelpButton:Landroid/widget/ImageButton;
    invoke-static {v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$200(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/widget/ImageButton;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 320
    :cond_0
    iget-object v0, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    # getter for: Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->mHelpButton:Landroid/widget/ImageButton;
    invoke-static {v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->access$200(Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;)Landroid/widget/ImageButton;

    move-result-object v0

    new-instance v1, Lcom/facebook/auth/login/h;

    invoke-direct {v1, p0}, Lcom/facebook/auth/login/h;-><init>(Lcom/facebook/auth/login/g;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 338
    iget-object v0, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    invoke-virtual {v0}, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "orca:authparam:splash_transition"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/login/l;

    .line 340
    iget-object v1, p0, Lcom/facebook/auth/login/g;->a:Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;

    iget-object v1, v1, Lcom/facebook/auth/login/AuthFragmentLogoViewGroup;->control:Lcom/facebook/auth/login/c;

    invoke-interface {v1}, Lcom/facebook/auth/login/c;->O()Z

    move-result v1

    if-nez v1, :cond_1

    .line 341
    sget-object v0, Lcom/facebook/auth/login/l;->NONE:Lcom/facebook/auth/login/l;

    .line 344
    :cond_1
    sget-object v1, Lcom/facebook/auth/login/d;->a:[I

    invoke-virtual {v0}, Lcom/facebook/auth/login/l;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    .line 352
    :goto_0
    return-void

    .line 346
    :pswitch_0
    invoke-direct {p0}, Lcom/facebook/auth/login/g;->c()V

    goto :goto_0

    .line 349
    :pswitch_1
    invoke-direct {p0}, Lcom/facebook/auth/login/g;->d()V

    goto :goto_0

    .line 344
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public a(Landroid/content/res/Configuration;)V
    .locals 0

    .prologue
    .line 356
    invoke-direct {p0}, Lcom/facebook/auth/login/g;->b()V

    .line 357
    return-void
.end method
