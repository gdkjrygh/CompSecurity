.class public Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$HideAnim;
.super Landroid/view/animation/Animation;
.source "MapOverlayFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "HideAnim"
.end annotation


# instance fields
.field index:I

.field startHeight:I

.field targetHeight:I

.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

.field view:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;Landroid/view/View;II)V
    .locals 1
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;
    .param p2, "view"    # Landroid/view/View;
    .param p3, "startHeight"    # I
    .param p4, "targetHeight"    # I

    .prologue
    .line 867
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$HideAnim;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    .line 864
    const/4 v0, 0x0

    iput v0, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$HideAnim;->index:I

    .line 868
    iput-object p2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$HideAnim;->view:Landroid/view/View;

    .line 869
    iput p4, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$HideAnim;->targetHeight:I

    .line 870
    iput p3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$HideAnim;->startHeight:I

    .line 871
    return-void
.end method


# virtual methods
.method protected applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 3
    .param p1, "interpolatedTime"    # F
    .param p2, "t"    # Landroid/view/animation/Transformation;

    .prologue
    .line 875
    iget v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$HideAnim;->index:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$HideAnim;->index:I

    .line 876
    iget v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$HideAnim;->startHeight:I

    iget v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$HideAnim;->startHeight:I

    int-to-float v2, v2

    mul-float/2addr v2, p1

    float-to-int v2, v2

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$HideAnim;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPagerClosedHeight:I
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$1700(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)I

    move-result v2

    add-int v0, v1, v2

    .line 877
    .local v0, "newHeight":I
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$HideAnim;->view:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 878
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$HideAnim;->view:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->requestLayout()V

    .line 879
    return-void
.end method

.method public initialize(IIII)V
    .locals 0
    .param p1, "width"    # I
    .param p2, "height"    # I
    .param p3, "parentWidth"    # I
    .param p4, "parentHeight"    # I

    .prologue
    .line 884
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/animation/Animation;->initialize(IIII)V

    .line 885
    return-void
.end method

.method public willChangeBounds()Z
    .locals 1

    .prologue
    .line 889
    const/4 v0, 0x1

    return v0
.end method
