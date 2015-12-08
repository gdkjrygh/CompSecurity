.class Lcom/hmobile/tooltip/ToolTipView$2;
.super Ljava/lang/Object;
.source "ToolTipView.java"

# interfaces
.implements Lcom/nineoldandroids/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/tooltip/ToolTipView;->remove()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/tooltip/ToolTipView;


# direct methods
.method constructor <init>(Lcom/hmobile/tooltip/ToolTipView;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/tooltip/ToolTipView$2;->this$0:Lcom/hmobile/tooltip/ToolTipView;

    .line 296
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Lcom/nineoldandroids/animation/Animator;)V
    .locals 0
    .param p1, "animator"    # Lcom/nineoldandroids/animation/Animator;

    .prologue
    .line 310
    return-void
.end method

.method public onAnimationEnd(Lcom/nineoldandroids/animation/Animator;)V
    .locals 2
    .param p1, "animator"    # Lcom/nineoldandroids/animation/Animator;

    .prologue
    .line 303
    iget-object v0, p0, Lcom/hmobile/tooltip/ToolTipView$2;->this$0:Lcom/hmobile/tooltip/ToolTipView;

    invoke-virtual {v0}, Lcom/hmobile/tooltip/ToolTipView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 304
    iget-object v0, p0, Lcom/hmobile/tooltip/ToolTipView$2;->this$0:Lcom/hmobile/tooltip/ToolTipView;

    invoke-virtual {v0}, Lcom/hmobile/tooltip/ToolTipView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/hmobile/tooltip/ToolTipView$2;->this$0:Lcom/hmobile/tooltip/ToolTipView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 306
    :cond_0
    return-void
.end method

.method public onAnimationRepeat(Lcom/nineoldandroids/animation/Animator;)V
    .locals 0
    .param p1, "animator"    # Lcom/nineoldandroids/animation/Animator;

    .prologue
    .line 314
    return-void
.end method

.method public onAnimationStart(Lcom/nineoldandroids/animation/Animator;)V
    .locals 0
    .param p1, "animator"    # Lcom/nineoldandroids/animation/Animator;

    .prologue
    .line 299
    return-void
.end method
