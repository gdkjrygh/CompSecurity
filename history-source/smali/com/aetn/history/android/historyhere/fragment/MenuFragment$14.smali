.class Lcom/aetn/history/android/historyhere/fragment/MenuFragment$14;
.super Ljava/lang/Object;
.source "MenuFragment.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->animateSponsorImageIn()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

.field final synthetic val$sponsorDuration:I


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;I)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .prologue
    .line 377
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$14;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    iput p2, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$14;->val$sponsorDuration:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 5
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 388
    :try_start_0
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$14;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mSponsorView:Landroid/view/ViewGroup;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$1600(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Landroid/view/ViewGroup;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 389
    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    new-instance v2, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$14$1;

    invoke-direct {v2, p0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$14$1;-><init>(Lcom/aetn/history/android/historyhere/fragment/MenuFragment$14;)V

    iget v3, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$14;->val$sponsorDuration:I

    int-to-long v3, v3

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 399
    :goto_0
    return-void

    .line 395
    :catch_0
    move-exception v0

    .line 397
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 383
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 380
    return-void
.end method
