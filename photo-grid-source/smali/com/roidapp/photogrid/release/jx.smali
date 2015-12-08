.class final Lcom/roidapp/photogrid/release/jx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:I

.field final synthetic b:Landroid/view/ViewGroup;

.field final synthetic c:Lcom/roidapp/photogrid/release/ImageSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ImageSelector;ILandroid/view/ViewGroup;)V
    .locals 0

    .prologue
    .line 419
    iput-object p1, p0, Lcom/roidapp/photogrid/release/jx;->c:Lcom/roidapp/photogrid/release/ImageSelector;

    iput p2, p0, Lcom/roidapp/photogrid/release/jx;->a:I

    iput-object p3, p0, Lcom/roidapp/photogrid/release/jx;->b:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 422
    iget v0, p0, Lcom/roidapp/photogrid/release/jx;->a:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/jx;->b:Landroid/view/ViewGroup;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    sub-int/2addr v0, v1

    .line 423
    iget-object v1, p0, Lcom/roidapp/photogrid/release/jx;->b:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0, v2, v2, v2}, Landroid/view/ViewGroup;->setPadding(IIII)V

    .line 424
    return-void
.end method
