.class final Landroid/support/v7/widget/v;
.super Landroid/support/v7/widget/aa;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/support/v7/widget/LinearLayoutManager;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/LinearLayoutManager;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 425
    iput-object p1, p0, Landroid/support/v7/widget/v;->a:Landroid/support/v7/widget/LinearLayoutManager;

    invoke-direct {p0, p2}, Landroid/support/v7/widget/aa;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final a(I)Landroid/graphics/PointF;
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    const/4 v4, 0x0

    .line 428
    iget-object v2, p0, Landroid/support/v7/widget/v;->a:Landroid/support/v7/widget/LinearLayoutManager;

    .line 1437
    invoke-virtual {v2}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v3

    if-nez v3, :cond_0

    .line 1438
    const/4 v0, 0x0

    .line 1443
    :goto_0
    return-object v0

    .line 1440
    :cond_0
    invoke-virtual {v2, v0}, Landroid/support/v7/widget/LinearLayoutManager;->c(I)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v3

    .line 1441
    if-ge p1, v3, :cond_1

    move v0, v1

    :cond_1
    iget-boolean v3, v2, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eq v0, v3, :cond_2

    const/4 v1, -0x1

    .line 1442
    :cond_2
    iget v0, v2, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    if-nez v0, :cond_3

    .line 1443
    new-instance v0, Landroid/graphics/PointF;

    int-to-float v1, v1

    invoke-direct {v0, v1, v4}, Landroid/graphics/PointF;-><init>(FF)V

    goto :goto_0

    .line 1445
    :cond_3
    new-instance v0, Landroid/graphics/PointF;

    int-to-float v1, v1

    invoke-direct {v0, v4, v1}, Landroid/graphics/PointF;-><init>(FF)V

    goto :goto_0
.end method
