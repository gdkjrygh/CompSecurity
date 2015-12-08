.class Lcom/aetn/history/android/historyhere/fragment/MenuFragment$10;
.super Ljava/lang/Object;
.source "MenuFragment.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->hideFavoritesIntro()V
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
    .line 256
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    const/high16 v1, 0x3f800000    # 1.0f

    .line 266
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnPlaces:Landroid/widget/Button;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$700(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setAlpha(F)V

    .line 267
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnFavorites:Landroid/widget/Button;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$800(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setAlpha(F)V

    .line 268
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnMore:Landroid/widget/Button;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$900(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setAlpha(F)V

    .line 269
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnTours:Landroid/widget/Button;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$1000(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setAlpha(F)V

    .line 270
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnSurpriseMe:Landroid/widget/Button;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$1100(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 271
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$10;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mFavoritesIntro:Landroid/view/ViewGroup;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$600(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Landroid/view/ViewGroup;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 272
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 262
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 259
    return-void
.end method
