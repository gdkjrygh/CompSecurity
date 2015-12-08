.class final Lcom/roidapp/photogrid/release/dl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field a:Z

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Lcom/roidapp/photogrid/release/dk;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/dk;Landroid/view/View;)V
    .locals 1

    .prologue
    .line 166
    iput-object p1, p0, Lcom/roidapp/photogrid/release/dl;->c:Lcom/roidapp/photogrid/release/dk;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/dl;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 167
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/dl;->a:Z

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 1

    .prologue
    .line 171
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dl;->b:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 172
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/dl;->a:Z

    if-eqz v0, :cond_0

    .line 173
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/dl;->a:Z

    .line 174
    iget-object v0, p0, Lcom/roidapp/photogrid/release/dl;->c:Lcom/roidapp/photogrid/release/dk;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/dk;->c()V

    .line 176
    :cond_0
    return-void
.end method
