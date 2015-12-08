.class final Lcom/roidapp/baselib/view/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field final synthetic a:I

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Landroid/view/View;

.field final synthetic d:I

.field final synthetic e:Lcom/roidapp/baselib/view/r;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/view/r;ILandroid/view/View;Landroid/view/View;I)V
    .locals 0

    .prologue
    .line 198
    iput-object p1, p0, Lcom/roidapp/baselib/view/s;->e:Lcom/roidapp/baselib/view/r;

    iput p2, p0, Lcom/roidapp/baselib/view/s;->a:I

    iput-object p3, p0, Lcom/roidapp/baselib/view/s;->b:Landroid/view/View;

    iput-object p4, p0, Lcom/roidapp/baselib/view/s;->c:Landroid/view/View;

    iput p5, p0, Lcom/roidapp/baselib/view/s;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 6

    .prologue
    .line 201
    iget v0, p0, Lcom/roidapp/baselib/view/s;->a:I

    iget-object v1, p0, Lcom/roidapp/baselib/view/s;->b:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x3fa00000    # 1.25f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    add-int/2addr v0, v1

    neg-int v3, v0

    .line 202
    iget-object v0, p0, Lcom/roidapp/baselib/view/s;->e:Lcom/roidapp/baselib/view/r;

    invoke-static {v0}, Lcom/roidapp/baselib/view/r;->a(Lcom/roidapp/baselib/view/r;)Landroid/widget/PopupWindow;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/baselib/view/s;->c:Landroid/view/View;

    iget v2, p0, Lcom/roidapp/baselib/view/s;->d:I

    iget-object v4, p0, Lcom/roidapp/baselib/view/s;->e:Lcom/roidapp/baselib/view/r;

    invoke-static {v4}, Lcom/roidapp/baselib/view/r;->a(Lcom/roidapp/baselib/view/r;)Landroid/widget/PopupWindow;

    move-result-object v4

    invoke-virtual {v4}, Landroid/widget/PopupWindow;->getWidth()I

    move-result v4

    iget-object v5, p0, Lcom/roidapp/baselib/view/s;->e:Lcom/roidapp/baselib/view/r;

    invoke-static {v5}, Lcom/roidapp/baselib/view/r;->a(Lcom/roidapp/baselib/view/r;)Landroid/widget/PopupWindow;

    move-result-object v5

    invoke-virtual {v5}, Landroid/widget/PopupWindow;->getHeight()I

    move-result v5

    invoke-virtual/range {v0 .. v5}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    .line 203
    iget-object v0, p0, Lcom/roidapp/baselib/view/s;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 204
    return-void
.end method
