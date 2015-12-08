.class Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$10;
.super Ljava/lang/Object;
.source "MapOverlayDetailFragment.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->setListeners()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    .prologue
    .line 809
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5
    .param p1, "v"    # Landroid/view/View;
    .param p2, "event"    # Landroid/view/MotionEvent;

    .prologue
    const/4 v2, 0x1

    .line 814
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 846
    const/4 v1, 0x0

    :goto_0
    return v1

    .line 816
    :pswitch_0
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    # setter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->downX:F
    invoke-static {v1, v3}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$1802(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;F)F

    .line 817
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    # setter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->downY:F
    invoke-static {v1, v3}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$1902(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;F)F

    .line 818
    const-string v1, "MapOverlayDetailFragment"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onTouch(): GOT ACTION_DOWN: downY:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->downY:F
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$1900(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)F

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    move v1, v2

    .line 819
    goto :goto_0

    .line 822
    :pswitch_1
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    # setter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->upX:F
    invoke-static {v1, v3}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$2002(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;F)F

    .line 823
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    # setter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->upY:F
    invoke-static {v1, v3}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$2102(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;F)F

    .line 824
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->downY:F
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$1900(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)F

    move-result v1

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->upY:F
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$2100(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)F

    move-result v3

    sub-float v0, v1, v3

    .line 825
    .local v0, "deltaY":F
    const-string v1, "MapOverlayDetailFragment"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onTouch(): -- GOT ACTION_DOWN: downY:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->downY:F
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$1900(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)F

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 826
    const-string v1, "MapOverlayDetailFragment"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onTouch(): -- GOT ACTION_UP: upY:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->upY:F
    invoke-static {v4}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$2100(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)F

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 827
    const-string v1, "MapOverlayDetailFragment"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onTouch(): -- GOT ACTION_UP: deltaY:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 829
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->downY:F
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$1900(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)F

    move-result v1

    iget-object v3, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->upY:F
    invoke-static {v3}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$2100(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)F

    move-result v3

    cmpl-float v1, v1, v3

    if-nez v1, :cond_0

    .line 831
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$100(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->animateOpenMapDetail()V

    move v1, v2

    .line 832
    goto/16 :goto_0

    .line 834
    :cond_0
    const/high16 v1, 0x41f00000    # 30.0f

    cmpl-float v1, v0, v1

    if-lez v1, :cond_1

    .line 835
    const-string v1, "MapOverlayDetailFragment"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "onTouch(): this is considered an up swipe: close the detail: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 836
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->hideDetailPager()V

    move v1, v2

    .line 837
    goto/16 :goto_0

    .line 839
    :cond_1
    const-string v1, "MapOverlayDetailFragment"

    const-string v3, "onTouch(): this is considered an down swipe: close the detail"

    invoke-static {v1, v3}, Lcom/aetn/history/android/historyhere/utils/Utils;->logger(Ljava/lang/String;Ljava/lang/String;)V

    .line 840
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->mNav:Lcom/aetn/history/android/historyhere/MainNavigationActivity;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;->access$100(Lcom/aetn/history/android/historyhere/fragment/MapOverlayDetailFragment;)Lcom/aetn/history/android/historyhere/MainNavigationActivity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/MainNavigationActivity;->animateOpenMapDetail()V

    move v1, v2

    .line 841
    goto/16 :goto_0

    .line 814
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
