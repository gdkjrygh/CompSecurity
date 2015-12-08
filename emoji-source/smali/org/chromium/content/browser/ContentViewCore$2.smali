.class Lorg/chromium/content/browser/ContentViewCore$2;
.super Ljava/lang/Object;
.source "ContentViewCore.java"

# interfaces
.implements Lorg/chromium/ui/base/ViewAndroidDelegate;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/ContentViewCore;->getViewAndroidDelegate()Lorg/chromium/ui/base/ViewAndroidDelegate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private final mContainerViewAtCreation:Landroid/view/ViewGroup;

.field final synthetic this$0:Lorg/chromium/content/browser/ContentViewCore;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 445
    const-class v0, Lorg/chromium/content/browser/ContentViewCore;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lorg/chromium/content/browser/ContentViewCore$2;->$assertionsDisabled:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Lorg/chromium/content/browser/ContentViewCore;)V
    .locals 1

    .prologue
    .line 445
    iput-object p1, p0, Lorg/chromium/content/browser/ContentViewCore$2;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 448
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$2;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mContainerView:Landroid/view/ViewGroup;
    invoke-static {v0}, Lorg/chromium/content/browser/ContentViewCore;->access$000(Lorg/chromium/content/browser/ContentViewCore;)Landroid/view/ViewGroup;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$2;->mContainerViewAtCreation:Landroid/view/ViewGroup;

    return-void
.end method


# virtual methods
.method public acquireAnchorView()Landroid/view/View;
    .locals 2

    .prologue
    .line 452
    new-instance v0, Landroid/view/View;

    iget-object v1, p0, Lorg/chromium/content/browser/ContentViewCore$2;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mContext:Landroid/content/Context;
    invoke-static {v1}, Lorg/chromium/content/browser/ContentViewCore;->access$100(Lorg/chromium/content/browser/ContentViewCore;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 453
    .local v0, "anchorView":Landroid/view/View;
    iget-object v1, p0, Lorg/chromium/content/browser/ContentViewCore$2;->mContainerViewAtCreation:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 454
    return-object v0
.end method

.method public releaseAnchorView(Landroid/view/View;)V
    .locals 1
    .param p1, "anchorView"    # Landroid/view/View;

    .prologue
    .line 511
    iget-object v0, p0, Lorg/chromium/content/browser/ContentViewCore$2;->mContainerViewAtCreation:Landroid/view/ViewGroup;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 512
    return-void
.end method

.method public setAnchorViewPosition(Landroid/view/View;FFFF)V
    .locals 9
    .param p1, "view"    # Landroid/view/View;
    .param p2, "x"    # F
    .param p3, "y"    # F
    .param p4, "width"    # F
    .param p5, "height"    # F

    .prologue
    .line 461
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    if-nez v6, :cond_0

    .line 507
    :goto_0
    return-void

    .line 466
    :cond_0
    sget-boolean v6, Lorg/chromium/content/browser/ContentViewCore$2;->$assertionsDisabled:Z

    if-nez v6, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    iget-object v7, p0, Lorg/chromium/content/browser/ContentViewCore$2;->mContainerViewAtCreation:Landroid/view/ViewGroup;

    if-eq v6, v7, :cond_1

    new-instance v6, Ljava/lang/AssertionError;

    invoke-direct {v6}, Ljava/lang/AssertionError;-><init>()V

    throw v6

    .line 468
    :cond_1
    iget-object v6, p0, Lorg/chromium/content/browser/ContentViewCore$2;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mContext:Landroid/content/Context;
    invoke-static {v6}, Lorg/chromium/content/browser/ContentViewCore;->access$100(Lorg/chromium/content/browser/ContentViewCore;)Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Lorg/chromium/ui/gfx/DeviceDisplayInfo;->create(Landroid/content/Context;)Lorg/chromium/ui/gfx/DeviceDisplayInfo;

    move-result-object v6

    invoke-virtual {v6}, Lorg/chromium/ui/gfx/DeviceDisplayInfo;->getDIPScale()D

    move-result-wide v6

    double-to-float v2, v6

    .line 471
    .local v2, "scale":F
    mul-float v6, p2, v2

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 472
    .local v0, "leftMargin":I
    iget-object v6, p0, Lorg/chromium/content/browser/ContentViewCore$2;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mRenderCoordinates:Lorg/chromium/content/browser/RenderCoordinates;
    invoke-static {v6}, Lorg/chromium/content/browser/ContentViewCore;->access$200(Lorg/chromium/content/browser/ContentViewCore;)Lorg/chromium/content/browser/RenderCoordinates;

    move-result-object v6

    invoke-virtual {v6}, Lorg/chromium/content/browser/RenderCoordinates;->getContentOffsetYPix()F

    move-result v6

    mul-float v7, p3, v2

    add-float/2addr v6, v7

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v5

    .line 473
    .local v5, "topMargin":I
    mul-float v6, p4, v2

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v3

    .line 475
    .local v3, "scaledWidth":I
    iget-object v6, p0, Lorg/chromium/content/browser/ContentViewCore$2;->mContainerViewAtCreation:Landroid/view/ViewGroup;

    instance-of v6, v6, Landroid/widget/FrameLayout;

    if-eqz v6, :cond_4

    .line 477
    iget-object v6, p0, Lorg/chromium/content/browser/ContentViewCore$2;->mContainerViewAtCreation:Landroid/view/ViewGroup;

    invoke-static {v6}, Lorg/chromium/base/ApiCompatibilityUtils;->isLayoutRtl(Landroid/view/View;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 478
    iget-object v6, p0, Lorg/chromium/content/browser/ContentViewCore$2;->mContainerViewAtCreation:Landroid/view/ViewGroup;

    invoke-virtual {v6}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v6

    add-float v7, p4, p2

    mul-float/2addr v7, v2

    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v7

    sub-int v4, v6, v7

    .line 483
    .local v4, "startMargin":I
    :goto_1
    add-int v6, v3, v4

    iget-object v7, p0, Lorg/chromium/content/browser/ContentViewCore$2;->mContainerViewAtCreation:Landroid/view/ViewGroup;

    invoke-virtual {v7}, Landroid/view/ViewGroup;->getWidth()I

    move-result v7

    if-le v6, v7, :cond_2

    .line 484
    iget-object v6, p0, Lorg/chromium/content/browser/ContentViewCore$2;->mContainerViewAtCreation:Landroid/view/ViewGroup;

    invoke-virtual {v6}, Landroid/view/ViewGroup;->getWidth()I

    move-result v6

    sub-int v3, v6, v4

    .line 486
    :cond_2
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    mul-float v6, p5, v2

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    invoke-direct {v1, v3, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 488
    .local v1, "lp":Landroid/widget/FrameLayout$LayoutParams;
    invoke-static {v1, v4}, Lorg/chromium/base/ApiCompatibilityUtils;->setMarginStart(Landroid/view/ViewGroup$MarginLayoutParams;I)V

    .line 489
    iput v5, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 490
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 481
    .end local v1    # "lp":Landroid/widget/FrameLayout$LayoutParams;
    .end local v4    # "startMargin":I
    :cond_3
    move v4, v0

    .restart local v4    # "startMargin":I
    goto :goto_1

    .line 491
    .end local v4    # "startMargin":I
    :cond_4
    iget-object v6, p0, Lorg/chromium/content/browser/ContentViewCore$2;->mContainerViewAtCreation:Landroid/view/ViewGroup;

    instance-of v6, v6, Landroid/widget/AbsoluteLayout;

    if-eqz v6, :cond_5

    .line 497
    iget-object v6, p0, Lorg/chromium/content/browser/ContentViewCore$2;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mRenderCoordinates:Lorg/chromium/content/browser/RenderCoordinates;
    invoke-static {v6}, Lorg/chromium/content/browser/ContentViewCore;->access$200(Lorg/chromium/content/browser/ContentViewCore;)Lorg/chromium/content/browser/RenderCoordinates;

    move-result-object v6

    invoke-virtual {v6}, Lorg/chromium/content/browser/RenderCoordinates;->getScrollXPixInt()I

    move-result v6

    add-int/2addr v0, v6

    .line 498
    iget-object v6, p0, Lorg/chromium/content/browser/ContentViewCore$2;->this$0:Lorg/chromium/content/browser/ContentViewCore;

    # getter for: Lorg/chromium/content/browser/ContentViewCore;->mRenderCoordinates:Lorg/chromium/content/browser/RenderCoordinates;
    invoke-static {v6}, Lorg/chromium/content/browser/ContentViewCore;->access$200(Lorg/chromium/content/browser/ContentViewCore;)Lorg/chromium/content/browser/RenderCoordinates;

    move-result-object v6

    invoke-virtual {v6}, Lorg/chromium/content/browser/RenderCoordinates;->getScrollYPixInt()I

    move-result v6

    add-int/2addr v5, v6

    .line 500
    new-instance v1, Landroid/widget/AbsoluteLayout$LayoutParams;

    mul-float v6, p5, v2

    float-to-int v6, v6

    invoke-direct {v1, v3, v6, v0, v5}, Landroid/widget/AbsoluteLayout$LayoutParams;-><init>(IIII)V

    .line 503
    .local v1, "lp":Landroid/widget/AbsoluteLayout$LayoutParams;
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    .line 505
    .end local v1    # "lp":Landroid/widget/AbsoluteLayout$LayoutParams;
    :cond_5
    const-string v6, "ContentViewCore"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Unknown layout "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v8, p0, Lorg/chromium/content/browser/ContentViewCore$2;->mContainerViewAtCreation:Landroid/view/ViewGroup;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_0
.end method
