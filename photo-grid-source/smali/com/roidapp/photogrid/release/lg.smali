.class final Lcom/roidapp/photogrid/release/lg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ld;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ld;)V
    .locals 0

    .prologue
    .line 294
    iput-object p1, p0, Lcom/roidapp/photogrid/release/lg;->a:Lcom/roidapp/photogrid/release/ld;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 297
    const/16 v1, 0x52

    if-ne p2, v1, :cond_0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_0

    .line 298
    iget-object v1, p0, Lcom/roidapp/photogrid/release/lg;->a:Lcom/roidapp/photogrid/release/ld;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ld;->b()V

    .line 305
    :goto_0
    return v0

    .line 301
    :cond_0
    const/4 v1, 0x4

    if-ne p2, v1, :cond_1

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_1

    .line 302
    iget-object v1, p0, Lcom/roidapp/photogrid/release/lg;->a:Lcom/roidapp/photogrid/release/ld;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ld;->b()V

    goto :goto_0

    .line 305
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
