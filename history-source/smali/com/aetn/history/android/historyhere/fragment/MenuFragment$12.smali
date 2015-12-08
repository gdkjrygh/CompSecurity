.class Lcom/aetn/history/android/historyhere/fragment/MenuFragment$12;
.super Ljava/lang/Object;
.source "MenuFragment.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->closeTourIntro()V
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
    .line 309
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$12;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 3
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    const/high16 v2, 0x3f800000    # 1.0f

    .line 320
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$12;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mTourIntro:Landroid/view/ViewGroup;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$1200(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Landroid/view/ViewGroup;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 321
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$12;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnPlaces:Landroid/widget/Button;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$700(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setAlpha(F)V

    .line 322
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$12;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnFavorites:Landroid/widget/Button;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$800(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setAlpha(F)V

    .line 323
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$12;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnMore:Landroid/widget/Button;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$900(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setAlpha(F)V

    .line 324
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$12;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mBtnTours:Landroid/widget/Button;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$1000(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Landroid/widget/Button;

    move-result-object v0

    iget-object v1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$12;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-virtual {v1}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020102

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 325
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$12;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # invokes: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->setListeners()V
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$1300(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)V

    .line 327
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 315
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 312
    return-void
.end method
