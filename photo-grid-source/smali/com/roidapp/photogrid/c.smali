.class public final Lcom/roidapp/photogrid/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/a;


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/a;)V
    .locals 0

    .prologue
    .line 67
    iput-object p1, p0, Lcom/roidapp/photogrid/c;->a:Lcom/roidapp/photogrid/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 70
    iget-object v0, p0, Lcom/roidapp/photogrid/c;->a:Lcom/roidapp/photogrid/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/a;->e(Lcom/roidapp/photogrid/a;)I

    .line 71
    iget-object v0, p0, Lcom/roidapp/photogrid/c;->a:Lcom/roidapp/photogrid/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/a;->a(Lcom/roidapp/photogrid/a;)I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/c;->a:Lcom/roidapp/photogrid/a;

    invoke-static {v1}, Lcom/roidapp/photogrid/a;->f(Lcom/roidapp/photogrid/a;)I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-le v0, v1, :cond_0

    .line 72
    iget-object v0, p0, Lcom/roidapp/photogrid/c;->a:Lcom/roidapp/photogrid/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/a;->g(Lcom/roidapp/photogrid/a;)I

    .line 74
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/c;->a:Lcom/roidapp/photogrid/a;

    invoke-static {v0}, Lcom/roidapp/photogrid/a;->c(Lcom/roidapp/photogrid/a;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 75
    return-void
.end method
