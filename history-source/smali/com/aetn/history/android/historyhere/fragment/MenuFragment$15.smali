.class Lcom/aetn/history/android/historyhere/fragment/MenuFragment$15;
.super Ljava/lang/Object;
.source "MenuFragment.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->animateSplashOut()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;


# direct methods
.method constructor <init>(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V
    .locals 0
    .param p1, "this$0"    # Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    .prologue
    .line 415
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$15;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 426
    :try_start_0
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$15;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mSplashView:Landroid/view/ViewGroup;
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$1800(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Landroid/view/ViewGroup;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 428
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$15;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getApplication()Landroid/app/Application;

    move-result-object v1

    check-cast v1, Lcom/aetn/history/android/historyhere/HistoryHereApplication;

    invoke-static {}, Lcom/aetn/history/android/historyhere/HistoryHereApplication;->getConfiguration()Lcom/aetn/history/android/historyhere/model/Configuration;

    move-result-object v1

    iget-object v1, v1, Lcom/aetn/history/android/historyhere/model/Configuration;->sponsorImageURL:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 429
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$15;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->animateSponsorImageIn()V
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$1900(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V

    .line 437
    :goto_0
    return-void

    .line 431
    :cond_0
    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$15;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->initMenu()V
    invoke-static {v1}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$1500(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 433
    :catch_0
    move-exception v0

    .line 435
    .local v0, "e":Ljava/lang/Exception;
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 421
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 418
    return-void
.end method
