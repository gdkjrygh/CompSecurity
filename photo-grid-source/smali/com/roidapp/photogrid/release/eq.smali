.class final Lcom/roidapp/photogrid/release/eq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/app/AlertDialog;

.field final synthetic b:Lcom/roidapp/photogrid/release/el;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/el;Landroid/app/AlertDialog;)V
    .locals 0

    .prologue
    .line 278
    iput-object p1, p0, Lcom/roidapp/photogrid/release/eq;->b:Lcom/roidapp/photogrid/release/el;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/eq;->a:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 282
    iget-object v0, p0, Lcom/roidapp/photogrid/release/eq;->a:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 283
    iget-object v0, p0, Lcom/roidapp/photogrid/release/eq;->a:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 285
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/eq;->b:Lcom/roidapp/photogrid/release/el;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/el;->g(Lcom/roidapp/photogrid/release/el;)Z

    .line 286
    iget-object v0, p0, Lcom/roidapp/photogrid/release/eq;->b:Lcom/roidapp/photogrid/release/el;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/el;->i(Lcom/roidapp/photogrid/release/el;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/eq;->b:Lcom/roidapp/photogrid/release/el;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/el;->i(Lcom/roidapp/photogrid/release/el;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/eq;->b:Lcom/roidapp/photogrid/release/el;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/el;->isAdded()Z

    move-result v0

    if-nez v0, :cond_2

    .line 294
    :cond_1
    :goto_0
    return-void

    .line 289
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/eq;->b:Lcom/roidapp/photogrid/release/el;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/el;->j(Lcom/roidapp/photogrid/release/el;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 290
    iget-object v0, p0, Lcom/roidapp/photogrid/release/eq;->b:Lcom/roidapp/photogrid/release/el;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/el;->k(Lcom/roidapp/photogrid/release/el;)V

    goto :goto_0

    .line 292
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/eq;->b:Lcom/roidapp/photogrid/release/el;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/el;->l(Lcom/roidapp/photogrid/release/el;)V

    goto :goto_0
.end method
