.class final Lcom/roidapp/photogrid/common/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/common/e;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/common/e;)V
    .locals 0

    .prologue
    .line 165
    iput-object p1, p0, Lcom/roidapp/photogrid/common/k;->a:Lcom/roidapp/photogrid/common/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .prologue
    .line 168
    iget-object v0, p0, Lcom/roidapp/photogrid/common/k;->a:Lcom/roidapp/photogrid/common/e;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/e;->b(Lcom/roidapp/photogrid/common/e;)Landroid/app/Activity;

    move-result-object v0

    instance-of v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    if-eqz v0, :cond_0

    .line 169
    iget-object v0, p0, Lcom/roidapp/photogrid/common/k;->a:Lcom/roidapp/photogrid/common/e;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/e;->b(Lcom/roidapp/photogrid/common/e;)Landroid/app/Activity;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v1, p0, Lcom/roidapp/photogrid/common/k;->a:Lcom/roidapp/photogrid/common/e;

    invoke-static {v1}, Lcom/roidapp/photogrid/common/e;->c(Lcom/roidapp/photogrid/common/e;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(Z)V

    .line 170
    :cond_0
    return-void
.end method
