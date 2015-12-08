.class final Lcom/roidapp/photogrid/ar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/photogrid/a/j;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/MainPage;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/MainPage;)V
    .locals 0

    .prologue
    .line 1249
    iput-object p1, p0, Lcom/roidapp/photogrid/ar;->a:Lcom/roidapp/photogrid/MainPage;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/roidapp/photogrid/a/l;)V
    .locals 2

    .prologue
    .line 1254
    invoke-virtual {p1}, Lcom/roidapp/photogrid/a/l;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1255
    iget-object v0, p0, Lcom/roidapp/photogrid/ar;->a:Lcom/roidapp/photogrid/MainPage;

    iget-object v0, v0, Lcom/roidapp/photogrid/MainPage;->i:Landroid/os/Handler;

    new-instance v1, Lcom/roidapp/photogrid/as;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/as;-><init>(Lcom/roidapp/photogrid/ar;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1311
    :cond_0
    return-void
.end method
