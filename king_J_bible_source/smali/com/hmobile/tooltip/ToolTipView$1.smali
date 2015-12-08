.class Lcom/hmobile/tooltip/ToolTipView$1;
.super Ljava/lang/Object;
.source "ToolTipView.java"

# interfaces
.implements Lcom/nineoldandroids/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/tooltip/ToolTipView;->applyToolTipPosition()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/tooltip/ToolTipView;

.field private final synthetic val$fToolTipViewX:F

.field private final synthetic val$fToolTipViewY:F


# direct methods
.method constructor <init>(Lcom/hmobile/tooltip/ToolTipView;FF)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/tooltip/ToolTipView$1;->this$0:Lcom/hmobile/tooltip/ToolTipView;

    iput p2, p0, Lcom/hmobile/tooltip/ToolTipView$1;->val$fToolTipViewX:F

    iput p3, p0, Lcom/hmobile/tooltip/ToolTipView$1;->val$fToolTipViewY:F

    .line 207
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Lcom/nineoldandroids/animation/Animator;)V
    .locals 0
    .param p1, "animator"    # Lcom/nineoldandroids/animation/Animator;

    .prologue
    .line 226
    return-void
.end method

.method public onAnimationEnd(Lcom/nineoldandroids/animation/Animator;)V
    .locals 3
    .param p1, "animator"    # Lcom/nineoldandroids/animation/Animator;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 216
    iget-object v1, p0, Lcom/hmobile/tooltip/ToolTipView$1;->this$0:Lcom/hmobile/tooltip/ToolTipView;

    invoke-virtual {v1}, Lcom/hmobile/tooltip/ToolTipView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 217
    .local v0, "params":Landroid/widget/RelativeLayout$LayoutParams;
    iget v1, p0, Lcom/hmobile/tooltip/ToolTipView$1;->val$fToolTipViewX:F

    float-to-int v1, v1

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 218
    iget v1, p0, Lcom/hmobile/tooltip/ToolTipView$1;->val$fToolTipViewY:F

    float-to-int v1, v1

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 219
    iget-object v1, p0, Lcom/hmobile/tooltip/ToolTipView$1;->this$0:Lcom/hmobile/tooltip/ToolTipView;

    invoke-virtual {v1, v2}, Lcom/hmobile/tooltip/ToolTipView;->setX(F)V

    .line 220
    iget-object v1, p0, Lcom/hmobile/tooltip/ToolTipView$1;->this$0:Lcom/hmobile/tooltip/ToolTipView;

    invoke-virtual {v1, v2}, Lcom/hmobile/tooltip/ToolTipView;->setY(F)V

    .line 221
    iget-object v1, p0, Lcom/hmobile/tooltip/ToolTipView$1;->this$0:Lcom/hmobile/tooltip/ToolTipView;

    invoke-virtual {v1, v0}, Lcom/hmobile/tooltip/ToolTipView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 222
    return-void
.end method

.method public onAnimationRepeat(Lcom/nineoldandroids/animation/Animator;)V
    .locals 0
    .param p1, "animator"    # Lcom/nineoldandroids/animation/Animator;

    .prologue
    .line 230
    return-void
.end method

.method public onAnimationStart(Lcom/nineoldandroids/animation/Animator;)V
    .locals 0
    .param p1, "animator"    # Lcom/nineoldandroids/animation/Animator;

    .prologue
    .line 211
    return-void
.end method
