.class Lcom/aetn/history/android/historyhere/fragment/MenuFragment$9;
.super Ljava/lang/Object;
.source "MenuFragment.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->showFavoritesIntro()V
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
    .line 236
    iput-object p1, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$9;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 246
    iget-object v0, p0, Lcom/aetn/history/android/historyhere/fragment/MenuFragment$9;->this$0:Lcom/aetn/history/android/historyhere/fragment/MenuFragment;

    # getter for: Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->mFavoritesIntro:Landroid/view/ViewGroup;
    invoke-static {v0}, Lcom/aetn/history/android/historyhere/fragment/MenuFragment;->access$600(Lcom/aetn/history/android/historyhere/fragment/MenuFragment;)Landroid/view/ViewGroup;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 249
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 242
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0
    .param p1, "animation"    # Landroid/view/animation/Animation;

    .prologue
    .line 239
    return-void
.end method
