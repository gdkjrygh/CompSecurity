.class Lcom/facebook/orca/nux/f;
.super Ljava/lang/Object;
.source "NuxPopover.java"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/nux/e;


# direct methods
.method constructor <init>(Lcom/facebook/orca/nux/e;)V
    .locals 0

    .prologue
    .line 110
    iput-object p1, p0, Lcom/facebook/orca/nux/f;->a:Lcom/facebook/orca/nux/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 2

    .prologue
    .line 113
    iget-object v0, p0, Lcom/facebook/orca/nux/f;->a:Lcom/facebook/orca/nux/e;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/facebook/orca/nux/e;->setVisibility(I)V

    .line 114
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 117
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .prologue
    .line 120
    return-void
.end method
