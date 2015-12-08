.class Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$8;
.super Ljava/lang/Object;
.source "ListOverlayDetailFragment.java"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->animateInNavItems()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    .prologue
    .line 717
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$8;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 728
    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 723
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$8;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->setScrollerPosition()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->access$1500(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V

    .line 724
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment$8;->this$0:Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->setPhotoNumber()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;->access$1000(Lcom/aetn/history/android/historyhere/fragment/ListOverlayDetailFragment;)V

    .line 725
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 731
    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 0
    .param p1, "animation"    # Landroid/animation/Animator;

    .prologue
    .line 719
    return-void
.end method
