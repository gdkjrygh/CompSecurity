.class Lcom/localytics/android/AmpDialogFragment$AmpDialog;
.super Landroid/app/Dialog;
.source "AmpDialogFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/localytics/android/AmpDialogFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "AmpDialog"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/localytics/android/AmpDialogFragment$AmpDialog$CloseButton;,
        Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;
    }
.end annotation


# static fields
.field private static final LOCATION_BOTTOM:Ljava/lang/String; = "bottom"

.field private static final LOCATION_CENTER:Ljava/lang/String; = "center"

.field private static final LOCATION_FULL:Ljava/lang/String; = "full"

.field private static final LOCATION_TOP:Ljava/lang/String; = "top"

.field private static final MARGIN:I = 0xa

.field private static final MAX_BANNER_WIDTH_DIP:I = 0x168


# instance fields
.field private mAnimBottomIn:Landroid/view/animation/TranslateAnimation;

.field private mAnimBottomOut:Landroid/view/animation/TranslateAnimation;

.field private mAnimCenterIn:Landroid/view/animation/TranslateAnimation;

.field private mAnimCenterOut:Landroid/view/animation/TranslateAnimation;

.field private mAnimFullIn:Landroid/view/animation/TranslateAnimation;

.field private mAnimFullOut:Landroid/view/animation/TranslateAnimation;

.field private mAnimTopIn:Landroid/view/animation/TranslateAnimation;

.field private mAnimTopOut:Landroid/view/animation/TranslateAnimation;

.field private mBtnClose:Lcom/localytics/android/AmpDialogFragment$AmpDialog$CloseButton;

.field private mDialogLayout:Landroid/widget/RelativeLayout;

.field private mHeight:F

.field private mLocation:Ljava/lang/String;

.field private mMetrics:Landroid/util/DisplayMetrics;

.field private mRootLayout:Landroid/widget/RelativeLayout;

.field private mWebView:Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;

.field private mWidth:F

.field final synthetic this$0:Lcom/localytics/android/AmpDialogFragment;


# direct methods
.method public constructor <init>(Lcom/localytics/android/AmpDialogFragment;Landroid/content/Context;I)V
    .locals 3
    .param p2, "context"    # Landroid/content/Context;
    .param p3, "theme"    # I

    .prologue
    .line 566
    iput-object p1, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->this$0:Lcom/localytics/android/AmpDialogFragment;

    .line 567
    invoke-direct {p0, p2, p3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 570
    # getter for: Lcom/localytics/android/AmpDialogFragment;->mAmpMessage:Ljava/util/Map;
    invoke-static {p1}, Lcom/localytics/android/AmpDialogFragment;->access$200(Lcom/localytics/android/AmpDialogFragment;)Ljava/util/Map;

    move-result-object v1

    if-nez v1, :cond_1

    .line 572
    invoke-virtual {p1}, Lcom/localytics/android/AmpDialogFragment;->dismiss()V

    .line 591
    :cond_0
    :goto_0
    return-void

    .line 575
    :cond_1
    # getter for: Lcom/localytics/android/AmpDialogFragment;->mAmpMessage:Ljava/util/Map;
    invoke-static {p1}, Lcom/localytics/android/AmpDialogFragment;->access$200(Lcom/localytics/android/AmpDialogFragment;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "location"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mLocation:Ljava/lang/String;

    .line 577
    invoke-direct {p0}, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->setupViews()V

    .line 578
    invoke-direct {p0}, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->createAnimations()V

    .line 579
    invoke-direct {p0}, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->adjustLayout()V

    .line 586
    # getter for: Lcom/localytics/android/AmpDialogFragment;->mAmpMessage:Ljava/util/Map;
    invoke-static {p1}, Lcom/localytics/android/AmpDialogFragment;->access$200(Lcom/localytics/android/AmpDialogFragment;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "html_url"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 587
    .local v0, "htmlUrl":Ljava/lang/String;
    if-eqz v0, :cond_0

    .line 589
    iget-object v1, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mWebView:Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;

    invoke-virtual {v1, v0}, Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic access$100(Lcom/localytics/android/AmpDialogFragment$AmpDialog;)Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;
    .locals 1
    .param p0, "x0"    # Lcom/localytics/android/AmpDialogFragment$AmpDialog;

    .prologue
    .line 475
    iget-object v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mWebView:Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;

    return-object v0
.end method

.method static synthetic access$600(Lcom/localytics/android/AmpDialogFragment$AmpDialog;)Landroid/util/DisplayMetrics;
    .locals 1
    .param p0, "x0"    # Lcom/localytics/android/AmpDialogFragment$AmpDialog;

    .prologue
    .line 475
    iget-object v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mMetrics:Landroid/util/DisplayMetrics;

    return-object v0
.end method

.method static synthetic access$700(Lcom/localytics/android/AmpDialogFragment$AmpDialog;)F
    .locals 1
    .param p0, "x0"    # Lcom/localytics/android/AmpDialogFragment$AmpDialog;

    .prologue
    .line 475
    iget v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mWidth:F

    return v0
.end method

.method static synthetic access$800(Lcom/localytics/android/AmpDialogFragment$AmpDialog;)F
    .locals 1
    .param p0, "x0"    # Lcom/localytics/android/AmpDialogFragment$AmpDialog;

    .prologue
    .line 475
    iget v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mHeight:F

    return v0
.end method

.method private adjustLayout()V
    .locals 15
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    const/16 v14, 0x400

    const/16 v13, 0x20

    const/4 v12, 0x0

    const/4 v11, 0x0

    const/high16 v10, 0x3f000000    # 0.5f

    .line 662
    new-instance v7, Landroid/util/DisplayMetrics;

    invoke-direct {v7}, Landroid/util/DisplayMetrics;-><init>()V

    iput-object v7, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mMetrics:Landroid/util/DisplayMetrics;

    .line 663
    iget-object v7, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->this$0:Lcom/localytics/android/AmpDialogFragment;

    invoke-virtual {v7}, Lcom/localytics/android/AmpDialogFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v7

    const-string v8, "window"

    invoke-virtual {v7, v8}, Landroid/support/v4/app/FragmentActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/WindowManager;

    .line 664
    .local v6, "windowManager":Landroid/view/WindowManager;
    invoke-interface {v6}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v7

    iget-object v8, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mMetrics:Landroid/util/DisplayMetrics;

    invoke-virtual {v7, v8}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 667
    iget-object v7, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->this$0:Lcom/localytics/android/AmpDialogFragment;

    # getter for: Lcom/localytics/android/AmpDialogFragment;->mAmpMessage:Ljava/util/Map;
    invoke-static {v7}, Lcom/localytics/android/AmpDialogFragment;->access$200(Lcom/localytics/android/AmpDialogFragment;)Ljava/util/Map;

    move-result-object v7

    const-string v8, "display_width"

    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Float;

    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v7

    iput v7, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mWidth:F

    .line 668
    iget-object v7, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->this$0:Lcom/localytics/android/AmpDialogFragment;

    # getter for: Lcom/localytics/android/AmpDialogFragment;->mAmpMessage:Ljava/util/Map;
    invoke-static {v7}, Lcom/localytics/android/AmpDialogFragment;->access$200(Lcom/localytics/android/AmpDialogFragment;)Ljava/util/Map;

    move-result-object v7

    const-string v8, "display_height"

    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Float;

    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v7

    iput v7, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mHeight:F

    .line 671
    iget v7, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mHeight:F

    iget v8, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mWidth:F

    div-float v0, v7, v8

    .line 672
    .local v0, "aspectRatio":F
    const/high16 v7, 0x43b40000    # 360.0f

    iget-object v8, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mMetrics:Landroid/util/DisplayMetrics;

    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v7, v8

    iget-object v8, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mMetrics:Landroid/util/DisplayMetrics;

    iget v8, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    iget-object v9, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mMetrics:Landroid/util/DisplayMetrics;

    iget v9, v9, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v8

    int-to-float v8, v8

    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    move-result v3

    .line 677
    .local v3, "maxWidth":F
    invoke-virtual {p0}, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->getWindow()Landroid/view/Window;

    move-result-object v5

    .line 678
    .local v5, "window":Landroid/view/Window;
    invoke-virtual {v5}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    .line 680
    .local v1, "attributes":Landroid/view/WindowManager$LayoutParams;
    new-instance v7, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v7, v12}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v5, v7}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 681
    invoke-virtual {v5, v13, v13}, Landroid/view/Window;->setFlags(II)V

    .line 684
    iget-object v7, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mLocation:Ljava/lang/String;

    const-string v8, "center"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 687
    iget-object v7, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mMetrics:Landroid/util/DisplayMetrics;

    iget v7, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    iget-object v8, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mMetrics:Landroid/util/DisplayMetrics;

    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-virtual {v5, v7, v8}, Landroid/view/Window;->setLayout(II)V

    .line 689
    const/high16 v7, 0x41200000    # 10.0f

    iget-object v8, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mMetrics:Landroid/util/DisplayMetrics;

    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v7, v8

    add-float/2addr v7, v10

    float-to-int v2, v7

    .line 690
    .local v2, "margin":I
    iget-object v7, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mWebView:Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;

    invoke-virtual {v7}, Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 691
    .local v4, "params":Landroid/view/ViewGroup$MarginLayoutParams;
    shl-int/lit8 v7, v2, 0x1

    int-to-float v7, v7

    sub-float v7, v3, v7

    iget v8, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mWidth:F

    iget-object v9, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mMetrics:Landroid/util/DisplayMetrics;

    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v8, v9

    add-float/2addr v8, v10

    float-to-int v8, v8

    int-to-float v8, v8

    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    move-result v7

    float-to-int v7, v7

    shl-int/lit8 v8, v2, 0x1

    add-int/2addr v7, v8

    iput v7, v4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 692
    shl-int/lit8 v7, v2, 0x1

    int-to-float v7, v7

    sub-float v7, v3, v7

    iget v8, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mWidth:F

    iget-object v9, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mMetrics:Landroid/util/DisplayMetrics;

    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v8, v9

    add-float/2addr v8, v10

    float-to-int v8, v8

    int-to-float v8, v8

    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    move-result v7

    mul-float/2addr v7, v0

    float-to-int v7, v7

    shl-int/lit8 v8, v2, 0x1

    add-int/2addr v7, v8

    iput v7, v4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 693
    invoke-virtual {v4, v2, v2, v2, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 694
    iget-object v7, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mWebView:Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;

    invoke-virtual {v7, v4}, Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 695
    iget-object v7, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mWebView:Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;

    invoke-virtual {v7}, Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;->requestLayout()V

    .line 721
    .end local v2    # "margin":I
    .end local v4    # "params":Landroid/view/ViewGroup$MarginLayoutParams;
    :cond_0
    :goto_0
    iget-object v7, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->this$0:Lcom/localytics/android/AmpDialogFragment;

    # getter for: Lcom/localytics/android/AmpDialogFragment;->mEnterAnimatable:Ljava/util/concurrent/atomic/AtomicBoolean;
    invoke-static {v7}, Lcom/localytics/android/AmpDialogFragment;->access$400(Lcom/localytics/android/AmpDialogFragment;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v7

    invoke-virtual {v7, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 723
    invoke-virtual {p0}, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->enterWithAnimation()V

    .line 727
    :cond_1
    invoke-virtual {v5, v14, v14}, Landroid/view/Window;->setFlags(II)V

    .line 728
    return-void

    .line 698
    :cond_2
    iget-object v7, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mLocation:Ljava/lang/String;

    const-string v8, "full"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 701
    iget-object v7, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mMetrics:Landroid/util/DisplayMetrics;

    iget v7, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    iget-object v8, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mMetrics:Landroid/util/DisplayMetrics;

    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-virtual {v5, v7, v8}, Landroid/view/Window;->setLayout(II)V

    goto :goto_0

    .line 704
    :cond_3
    iget-object v7, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mLocation:Ljava/lang/String;

    const-string v8, "top"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 706
    const v7, -0xfffffff

    iput v7, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 707
    iput v11, v1, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    .line 709
    float-to-int v7, v3

    mul-float v8, v3, v0

    add-float/2addr v8, v10

    float-to-int v8, v8

    invoke-virtual {v5, v7, v8}, Landroid/view/Window;->setLayout(II)V

    goto :goto_0

    .line 712
    :cond_4
    iget-object v7, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mLocation:Ljava/lang/String;

    const-string v8, "bottom"

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 714
    const v7, 0xfffffff

    iput v7, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 715
    iput v11, v1, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    .line 717
    float-to-int v7, v3

    mul-float v8, v3, v0

    add-float/2addr v8, v10

    float-to-int v8, v8

    invoke-virtual {v5, v7, v8}, Landroid/view/Window;->setLayout(II)V

    goto :goto_0
.end method

.method private createAnimations()V
    .locals 10

    .prologue
    .line 735
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    iput-object v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimCenterIn:Landroid/view/animation/TranslateAnimation;

    .line 736
    iget-object v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimCenterIn:Landroid/view/animation/TranslateAnimation;

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 737
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    iput-object v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimCenterOut:Landroid/view/animation/TranslateAnimation;

    .line 738
    iget-object v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimCenterOut:Landroid/view/animation/TranslateAnimation;

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 740
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/high16 v6, -0x40800000    # -1.0f

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    iput-object v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimTopIn:Landroid/view/animation/TranslateAnimation;

    .line 741
    iget-object v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimTopIn:Landroid/view/animation/TranslateAnimation;

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 742
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/high16 v8, -0x40800000    # -1.0f

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    iput-object v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimTopOut:Landroid/view/animation/TranslateAnimation;

    .line 743
    iget-object v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimTopOut:Landroid/view/animation/TranslateAnimation;

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 745
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    iput-object v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimBottomIn:Landroid/view/animation/TranslateAnimation;

    .line 746
    iget-object v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimBottomIn:Landroid/view/animation/TranslateAnimation;

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 747
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    iput-object v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimBottomOut:Landroid/view/animation/TranslateAnimation;

    .line 748
    iget-object v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimBottomOut:Landroid/view/animation/TranslateAnimation;

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 750
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    iput-object v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimFullIn:Landroid/view/animation/TranslateAnimation;

    .line 751
    iget-object v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimFullIn:Landroid/view/animation/TranslateAnimation;

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 752
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-direct/range {v0 .. v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V

    iput-object v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimFullOut:Landroid/view/animation/TranslateAnimation;

    .line 753
    iget-object v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimFullOut:Landroid/view/animation/TranslateAnimation;

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 755
    new-instance v9, Lcom/localytics/android/AmpDialogFragment$AmpDialog$2;

    invoke-direct {v9, p0}, Lcom/localytics/android/AmpDialogFragment$AmpDialog$2;-><init>(Lcom/localytics/android/AmpDialogFragment$AmpDialog;)V

    .line 763
    .local v9, "listenerOut":Landroid/view/animation/Animation$AnimationListener;
    iget-object v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimCenterOut:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {v0, v9}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 764
    iget-object v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimTopOut:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {v0, v9}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 765
    iget-object v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimBottomOut:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {v0, v9}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 766
    iget-object v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimFullOut:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {v0, v9}, Landroid/view/animation/TranslateAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 767
    return-void
.end method

.method private setupViews()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, -0x2

    .line 620
    new-instance v1, Landroid/widget/RelativeLayout;

    invoke-virtual {p0}, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mRootLayout:Landroid/widget/RelativeLayout;

    .line 621
    iget-object v1, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mRootLayout:Landroid/widget/RelativeLayout;

    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v2, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 624
    new-instance v1, Landroid/widget/RelativeLayout;

    invoke-virtual {p0}, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mDialogLayout:Landroid/widget/RelativeLayout;

    .line 625
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v0, v3, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 626
    .local v0, "params":Landroid/widget/RelativeLayout$LayoutParams;
    const/16 v1, 0xd

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 627
    iget-object v1, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mDialogLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 628
    iget-object v1, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mRootLayout:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mDialogLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 631
    new-instance v1, Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;

    invoke-virtual {p0}, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, p0, v2, v4}, Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;-><init>(Lcom/localytics/android/AmpDialogFragment$AmpDialog;Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v1, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mWebView:Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;

    .line 632
    iget-object v1, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mDialogLayout:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mWebView:Lcom/localytics/android/AmpDialogFragment$AmpDialog$AmpWebView;

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 635
    new-instance v1, Lcom/localytics/android/AmpDialogFragment$AmpDialog$CloseButton;

    invoke-virtual {p0}, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, p0, v2, v4}, Lcom/localytics/android/AmpDialogFragment$AmpDialog$CloseButton;-><init>(Lcom/localytics/android/AmpDialogFragment$AmpDialog;Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v1, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mBtnClose:Lcom/localytics/android/AmpDialogFragment$AmpDialog$CloseButton;

    .line 636
    iget-object v1, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mBtnClose:Lcom/localytics/android/AmpDialogFragment$AmpDialog$CloseButton;

    new-instance v2, Lcom/localytics/android/AmpDialogFragment$AmpDialog$1;

    invoke-direct {v2, p0}, Lcom/localytics/android/AmpDialogFragment$AmpDialog$1;-><init>(Lcom/localytics/android/AmpDialogFragment$AmpDialog;)V

    invoke-virtual {v1, v2}, Lcom/localytics/android/AmpDialogFragment$AmpDialog$CloseButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 646
    iget-object v1, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mDialogLayout:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mBtnClose:Lcom/localytics/android/AmpDialogFragment$AmpDialog$CloseButton;

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 648
    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->requestWindowFeature(I)Z

    .line 655
    iget-object v1, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mRootLayout:Landroid/widget/RelativeLayout;

    invoke-virtual {p0, v1}, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->setContentView(Landroid/view/View;)V

    .line 656
    return-void
.end method


# virtual methods
.method public dismissWithAnimation()V
    .locals 3

    .prologue
    .line 804
    iget-object v1, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->this$0:Lcom/localytics/android/AmpDialogFragment;

    # getter for: Lcom/localytics/android/AmpDialogFragment;->mAmpMessage:Ljava/util/Map;
    invoke-static {v1}, Lcom/localytics/android/AmpDialogFragment;->access$200(Lcom/localytics/android/AmpDialogFragment;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "location"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 807
    .local v0, "location":Ljava/lang/String;
    const-string v1, "center"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 809
    iget-object v1, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mRootLayout:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimCenterOut:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 826
    :cond_0
    :goto_0
    return-void

    .line 812
    :cond_1
    const-string v1, "full"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 814
    iget-object v1, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mRootLayout:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimFullOut:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 817
    :cond_2
    const-string v1, "top"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 819
    iget-object v1, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mRootLayout:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimTopOut:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 822
    :cond_3
    const-string v1, "bottom"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 824
    iget-object v1, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mRootLayout:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimBottomOut:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0
.end method

.method public enterWithAnimation()V
    .locals 3

    .prologue
    .line 774
    iget-object v1, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->this$0:Lcom/localytics/android/AmpDialogFragment;

    # getter for: Lcom/localytics/android/AmpDialogFragment;->mAmpMessage:Ljava/util/Map;
    invoke-static {v1}, Lcom/localytics/android/AmpDialogFragment;->access$200(Lcom/localytics/android/AmpDialogFragment;)Ljava/util/Map;

    move-result-object v1

    const-string v2, "location"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 777
    .local v0, "location":Ljava/lang/String;
    const-string v1, "center"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 779
    iget-object v1, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mRootLayout:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimCenterIn:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 796
    :cond_0
    :goto_0
    return-void

    .line 782
    :cond_1
    const-string v1, "full"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 784
    iget-object v1, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mRootLayout:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimFullIn:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 787
    :cond_2
    const-string v1, "top"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 789
    iget-object v1, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mRootLayout:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimTopIn:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0

    .line 792
    :cond_3
    const-string v1, "bottom"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 794
    iget-object v1, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mRootLayout:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mAnimBottomIn:Landroid/view/animation/TranslateAnimation;

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    goto :goto_0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2
    .param p1, "keyCode"    # I
    .param p2, "event"    # Landroid/view/KeyEvent;

    .prologue
    .line 596
    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    .line 598
    iget-object v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->this$0:Lcom/localytics/android/AmpDialogFragment;

    # getter for: Lcom/localytics/android/AmpDialogFragment;->mExitAnimatable:Ljava/util/concurrent/atomic/AtomicBoolean;
    invoke-static {v0}, Lcom/localytics/android/AmpDialogFragment;->access$300(Lcom/localytics/android/AmpDialogFragment;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 600
    invoke-virtual {p0}, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->dismissWithAnimation()V

    .line 602
    :cond_0
    const/4 v0, 0x1

    .line 604
    :goto_0
    return v0

    :cond_1
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method protected onStop()V
    .locals 1

    .prologue
    .line 610
    iget-object v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mBtnClose:Lcom/localytics/android/AmpDialogFragment$AmpDialog$CloseButton;

    if-eqz v0, :cond_0

    .line 612
    iget-object v0, p0, Lcom/localytics/android/AmpDialogFragment$AmpDialog;->mBtnClose:Lcom/localytics/android/AmpDialogFragment$AmpDialog$CloseButton;

    invoke-virtual {v0}, Lcom/localytics/android/AmpDialogFragment$AmpDialog$CloseButton;->release()V

    .line 614
    :cond_0
    invoke-super {p0}, Landroid/app/Dialog;->onStop()V

    .line 615
    return-void
.end method
