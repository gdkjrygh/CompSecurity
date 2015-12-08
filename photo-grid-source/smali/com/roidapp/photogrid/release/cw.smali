.class final Lcom/roidapp/photogrid/release/cw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/cs;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/cs;)V
    .locals 0

    .prologue
    .line 485
    iput-object p1, p0, Lcom/roidapp/photogrid/release/cw;->a:Lcom/roidapp/photogrid/release/cs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 1

    .prologue
    .line 489
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cw;->a:Lcom/roidapp/photogrid/release/cs;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cs;->b(Lcom/roidapp/photogrid/release/cs;)V

    .line 490
    iget-object v0, p0, Lcom/roidapp/photogrid/release/cw;->a:Lcom/roidapp/photogrid/release/cs;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cs;->c(Lcom/roidapp/photogrid/release/cs;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 492
    return-void
.end method
