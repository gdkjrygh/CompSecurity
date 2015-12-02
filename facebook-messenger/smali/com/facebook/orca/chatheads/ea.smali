.class public Lcom/facebook/orca/chatheads/ea;
.super Ljava/lang/Object;
.source "MarginLayoutChildPositioner.java"

# interfaces
.implements Lcom/facebook/widget/l;


# instance fields
.field private final a:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ea;->a:Landroid/view/View;

    .line 26
    return-void
.end method


# virtual methods
.method public setX(F)V
    .locals 2

    .prologue
    .line 40
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ea;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 41
    float-to-int v1, p1

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 42
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ea;->a:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 43
    return-void
.end method

.method public setY(F)V
    .locals 2

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ea;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 58
    float-to-int v1, p1

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 59
    iget-object v1, p0, Lcom/facebook/orca/chatheads/ea;->a:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 60
    return-void
.end method
