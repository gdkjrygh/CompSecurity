.class final Landroid/support/v7/widget/bn;
.super Landroid/support/v7/widget/aa;
.source "SourceFile"


# instance fields
.field final synthetic a:Landroid/support/v7/widget/StaggeredGridLayoutManager;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/StaggeredGridLayoutManager;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 1852
    iput-object p1, p0, Landroid/support/v7/widget/bn;->a:Landroid/support/v7/widget/StaggeredGridLayoutManager;

    invoke-direct {p0, p2}, Landroid/support/v7/widget/aa;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final a(I)Landroid/graphics/PointF;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1855
    iget-object v0, p0, Landroid/support/v7/widget/bn;->a:Landroid/support/v7/widget/StaggeredGridLayoutManager;

    invoke-static {v0, p1}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a(Landroid/support/v7/widget/StaggeredGridLayoutManager;I)I

    move-result v1

    .line 1856
    if-nez v1, :cond_0

    .line 1857
    const/4 v0, 0x0

    .line 1862
    :goto_0
    return-object v0

    .line 1859
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/bn;->a:Landroid/support/v7/widget/StaggeredGridLayoutManager;

    invoke-static {v0}, Landroid/support/v7/widget/StaggeredGridLayoutManager;->b(Landroid/support/v7/widget/StaggeredGridLayoutManager;)I

    move-result v0

    if-nez v0, :cond_1

    .line 1860
    new-instance v0, Landroid/graphics/PointF;

    int-to-float v1, v1

    invoke-direct {v0, v1, v2}, Landroid/graphics/PointF;-><init>(FF)V

    goto :goto_0

    .line 1862
    :cond_1
    new-instance v0, Landroid/graphics/PointF;

    int-to-float v1, v1

    invoke-direct {v0, v2, v1}, Landroid/graphics/PointF;-><init>(FF)V

    goto :goto_0
.end method
