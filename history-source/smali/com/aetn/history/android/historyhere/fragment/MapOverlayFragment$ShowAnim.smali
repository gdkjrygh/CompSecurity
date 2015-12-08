.class public Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$ShowAnim;
.super Landroid/view/animation/Animation;
.source "MapOverlayFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ShowAnim"
.end annotation


# instance fields
.field targetHeight:I

.field targetY:F

.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

.field view:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;Landroid/view/View;I)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;
    .param p2, "view"    # Landroid/view/View;
    .param p3, "targetHeight"    # I

    .prologue
    .line 836
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$ShowAnim;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    .line 837
    iput-object p2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$ShowAnim;->view:Landroid/view/View;

    .line 838
    iput p3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$ShowAnim;->targetHeight:I

    .line 839
    return-void
.end method


# virtual methods
.method protected applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 4
    .param p1, "interpolatedTime"    # F
    .param p2, "t"    # Landroid/view/animation/Transformation;

    .prologue
    .line 843
    iget v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$ShowAnim;->targetHeight:I

    int-to-float v1, v1

    mul-float/2addr v1, p1

    float-to-int v1, v1

    iget-object v2, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$ShowAnim;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->mDetailViewPagerClosedHeight:I
    invoke-static {v2}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$1700(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)I

    move-result v2

    add-int v0, v1, v2

    .line 844
    .local v0, "nextHeight":I
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$ShowAnim;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->TAG:Ljava/lang/String;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;->access$000(Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "interpolatedTime | ShowAnim: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "|"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 845
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$ShowAnim;->view:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 846
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayFragment$ShowAnim;->view:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->requestLayout()V

    .line 847
    return-void
.end method

.method public initialize(IIII)V
    .locals 0
    .param p1, "width"    # I
    .param p2, "height"    # I
    .param p3, "parentWidth"    # I
    .param p4, "parentHeight"    # I

    .prologue
    .line 852
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/animation/Animation;->initialize(IIII)V

    .line 853
    return-void
.end method

.method public willChangeBounds()Z
    .locals 1

    .prologue
    .line 857
    const/4 v0, 0x1

    return v0
.end method
