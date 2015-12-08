.class final Lcom/roidapp/photogrid/bd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/ba;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/ba;)V
    .locals 0

    .prologue
    .line 197
    iput-object p1, p0, Lcom/roidapp/photogrid/bd;->a:Lcom/roidapp/photogrid/ba;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 200
    const/16 v1, 0x52

    if-ne p2, v1, :cond_0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_0

    .line 201
    iget-object v1, p0, Lcom/roidapp/photogrid/bd;->a:Lcom/roidapp/photogrid/ba;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/ba;->a()V

    .line 208
    :goto_0
    return v0

    .line 204
    :cond_0
    const/4 v1, 0x4

    if-ne p2, v1, :cond_1

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_1

    .line 205
    iget-object v1, p0, Lcom/roidapp/photogrid/bd;->a:Lcom/roidapp/photogrid/ba;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/ba;->a()V

    goto :goto_0

    .line 208
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
