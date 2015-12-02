.class public Lcom/facebook/orca/chatheads/cl;
.super Lcom/facebook/widget/d;
.source "ChatHeadsMiniView.java"


# instance fields
.field private a:D

.field private b:Lcom/a/a/a;

.field private c:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private d:Landroid/widget/FrameLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    .prologue
    const/4 v3, -0x2

    .line 38
    invoke-direct {p0, p1}, Lcom/facebook/widget/d;-><init>(Landroid/content/Context;)V

    .line 40
    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/cl;->d:Landroid/widget/FrameLayout;

    .line 41
    iget-object v0, p0, Lcom/facebook/orca/chatheads/cl;->d:Landroid/widget/FrameLayout;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v2, 0x33

    invoke-direct {v1, v3, v3, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {p0, v0, v1}, Lcom/facebook/orca/chatheads/cl;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 46
    return-void
.end method

.method private b()V
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 93
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/cl;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/facebook/g;->chat_head_first_stack_offset:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    .line 94
    iget-object v1, p0, Lcom/facebook/orca/chatheads/cl;->d:Landroid/widget/FrameLayout;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getChildCount()I

    move-result v4

    move v2, v0

    .line 96
    :goto_0
    if-ge v2, v4, :cond_0

    .line 97
    if-lez v2, :cond_1

    .line 98
    div-int v1, v3, v2

    add-int/2addr v0, v1

    move v1, v0

    .line 100
    :goto_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/cl;->d:Landroid/widget/FrameLayout;

    sub-int v5, v4, v2

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v0, v5}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 101
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 102
    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 103
    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 96
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    move v0, v1

    goto :goto_0

    .line 105
    :cond_0
    return-void

    :cond_1
    move v1, v0

    goto :goto_1
.end method


# virtual methods
.method protected a(FI)Lcom/google/common/d/a/s;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FI)",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 125
    iget-wide v0, p0, Lcom/facebook/orca/chatheads/cl;->a:D

    float-to-double v2, p1

    cmpl-double v0, v0, v2

    if-nez v0, :cond_1

    .line 126
    iget-object v0, p0, Lcom/facebook/orca/chatheads/cl;->c:Lcom/google/common/d/a/s;

    if-nez v0, :cond_0

    .line 127
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/common/d/a/i;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/cl;->c:Lcom/google/common/d/a/s;

    .line 129
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/cl;->c:Lcom/google/common/d/a/s;

    .line 143
    :goto_0
    return-object v0

    .line 132
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/cl;->b:Lcom/a/a/a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/chatheads/cl;->b:Lcom/a/a/a;

    invoke-virtual {v0}, Lcom/a/a/a;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 133
    iget-object v0, p0, Lcom/facebook/orca/chatheads/cl;->b:Lcom/a/a/a;

    invoke-virtual {v0}, Lcom/a/a/a;->b()V

    .line 136
    :cond_2
    float-to-double v0, p1

    iput-wide v0, p0, Lcom/facebook/orca/chatheads/cl;->a:D

    .line 138
    iget-object v0, p0, Lcom/facebook/orca/chatheads/cl;->d:Landroid/widget/FrameLayout;

    const-string v1, "alpha"

    const/4 v2, 0x1

    new-array v2, v2, [F

    const/4 v3, 0x0

    aput p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/a/a/q;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/a/a/q;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/cl;->b:Lcom/a/a/a;

    .line 139
    iget-object v0, p0, Lcom/facebook/orca/chatheads/cl;->b:Lcom/a/a/a;

    int-to-long v1, p2

    invoke-virtual {v0, v1, v2}, Lcom/a/a/a;->a(J)Lcom/a/a/a;

    .line 140
    iget-object v0, p0, Lcom/facebook/orca/chatheads/cl;->b:Lcom/a/a/a;

    invoke-virtual {v0}, Lcom/a/a/a;->a()V

    .line 142
    new-instance v0, Lcom/facebook/ui/a/e;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/cl;->b:Lcom/a/a/a;

    invoke-direct {v0, v1}, Lcom/facebook/ui/a/e;-><init>(Lcom/a/a/a;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/cl;->c:Lcom/google/common/d/a/s;

    .line 143
    iget-object v0, p0, Lcom/facebook/orca/chatheads/cl;->c:Lcom/google/common/d/a/s;

    goto :goto_0
.end method

.method public a(I)Lcom/google/common/d/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 111
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0, p1}, Lcom/facebook/orca/chatheads/cl;->a(FI)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 4

    .prologue
    .line 82
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/cl;->getChildCount()I

    move-result v2

    .line 83
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 84
    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/cl;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 85
    instance-of v3, v0, Lcom/facebook/orca/chatheads/ag;

    if-eqz v3, :cond_0

    .line 86
    check-cast v0, Lcom/facebook/orca/chatheads/ag;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/ag;->a()V

    .line 83
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 89
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/cl;->d:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViewsInLayout()V

    .line 90
    return-void
.end method

.method public a(Lcom/facebook/orca/chatheads/ag;)V
    .locals 3

    .prologue
    const/4 v2, -0x2

    .line 61
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/16 v1, 0x33

    invoke-direct {v0, v2, v2, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {p1, v0}, Lcom/facebook/orca/chatheads/ag;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 66
    iget-object v0, p0, Lcom/facebook/orca/chatheads/cl;->d:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 67
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/cl;->b()V

    .line 68
    return-void
.end method

.method public b(Lcom/facebook/orca/chatheads/ag;)V
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lcom/facebook/orca/chatheads/cl;->d:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->bringChildToFront(Landroid/view/View;)V

    .line 72
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/cl;->b()V

    .line 73
    return-void
.end method

.method public c(Lcom/facebook/orca/chatheads/ag;)V
    .locals 1

    .prologue
    .line 76
    invoke-virtual {p1}, Lcom/facebook/orca/chatheads/ag;->a()V

    .line 77
    iget-object v0, p0, Lcom/facebook/orca/chatheads/cl;->d:Landroid/widget/FrameLayout;

    invoke-virtual {v0, p1}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 78
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/cl;->b()V

    .line 79
    return-void
.end method

.method public setChatHeadsOffsetX(I)V
    .locals 2

    .prologue
    .line 53
    iget-object v0, p0, Lcom/facebook/orca/chatheads/cl;->d:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 54
    iget v1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    if-eq v1, p1, :cond_0

    .line 55
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 56
    iget-object v1, p0, Lcom/facebook/orca/chatheads/cl;->d:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 58
    :cond_0
    return-void
.end method
