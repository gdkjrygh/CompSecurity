.class final Lcom/roidapp/photogrid/n;
.super Landroid/support/v7/widget/as;
.source "SourceFile"


# instance fields
.field final synthetic a:I

.field final synthetic b:Landroid/support/v7/widget/GridLayoutManager;

.field final synthetic c:Lcom/roidapp/photogrid/k;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/k;ILandroid/support/v7/widget/GridLayoutManager;)V
    .locals 0

    .prologue
    .line 271
    iput-object p1, p0, Lcom/roidapp/photogrid/n;->c:Lcom/roidapp/photogrid/k;

    iput p2, p0, Lcom/roidapp/photogrid/n;->a:I

    iput-object p3, p0, Lcom/roidapp/photogrid/n;->b:Landroid/support/v7/widget/GridLayoutManager;

    invoke-direct {p0}, Landroid/support/v7/widget/as;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Rect;Landroid/view/View;)V
    .locals 4

    .prologue
    .line 274
    instance-of v0, p2, Lcom/roidapp/photogrid/a;

    if-eqz v0, :cond_1

    .line 275
    iget v0, p0, Lcom/roidapp/photogrid/n;->a:I

    neg-int v0, v0

    mul-int/lit8 v0, v0, 0x2

    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 276
    iget v0, p0, Lcom/roidapp/photogrid/n;->a:I

    neg-int v0, v0

    mul-int/lit8 v0, v0, 0x2

    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 290
    :cond_0
    :goto_0
    return-void

    .line 278
    :cond_1
    invoke-static {p2}, Landroid/support/v7/widget/RecyclerView;->c(Landroid/view/View;)I

    move-result v0

    .line 279
    iget-object v1, p0, Lcom/roidapp/photogrid/n;->b:Landroid/support/v7/widget/GridLayoutManager;

    invoke-virtual {v1}, Landroid/support/v7/widget/GridLayoutManager;->c()Landroid/support/v7/widget/t;

    move-result-object v1

    .line 280
    invoke-virtual {v1, v0}, Landroid/support/v7/widget/t;->a(I)I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    .line 281
    const/4 v2, 0x2

    invoke-virtual {v1, v0, v2}, Landroid/support/v7/widget/t;->a(II)I

    move-result v0

    .line 282
    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_2

    .line 283
    iget v0, p0, Lcom/roidapp/photogrid/n;->a:I

    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 287
    :goto_1
    iget v0, p0, Lcom/roidapp/photogrid/n;->a:I

    mul-int/lit8 v0, v0, 0x2

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    goto :goto_0

    .line 285
    :cond_2
    iget v0, p0, Lcom/roidapp/photogrid/n;->a:I

    iput v0, p1, Landroid/graphics/Rect;->left:I

    goto :goto_1
.end method
