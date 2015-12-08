.class final Lcom/roidapp/photogrid/a/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/a/j;

.field final synthetic b:Lcom/roidapp/photogrid/a/d;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/a/d;Lcom/roidapp/photogrid/a/j;)V
    .locals 0

    .prologue
    .line 205
    iput-object p1, p0, Lcom/roidapp/photogrid/a/e;->b:Lcom/roidapp/photogrid/a/d;

    iput-object p2, p0, Lcom/roidapp/photogrid/a/e;->a:Lcom/roidapp/photogrid/a/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .prologue
    .line 214
    iget-object v0, p0, Lcom/roidapp/photogrid/a/e;->b:Lcom/roidapp/photogrid/a/d;

    const-string v1, "Billing service connected."

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 215
    iget-object v0, p0, Lcom/roidapp/photogrid/a/e;->b:Lcom/roidapp/photogrid/a/d;

    invoke-static {p2}, Lcom/a/d/a/b;->a(Landroid/os/IBinder;)Lcom/a/d/a/a;

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/photogrid/a/d;->h:Lcom/a/d/a/a;

    .line 217
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/photogrid/a/f;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/a/f;-><init>(Lcom/roidapp/photogrid/a/e;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 279
    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .prologue
    .line 208
    iget-object v0, p0, Lcom/roidapp/photogrid/a/e;->b:Lcom/roidapp/photogrid/a/d;

    const-string v1, "Billing service disconnected."

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/a/d;->a(Ljava/lang/String;)V

    .line 209
    iget-object v0, p0, Lcom/roidapp/photogrid/a/e;->b:Lcom/roidapp/photogrid/a/d;

    const/4 v1, 0x0

    iput-object v1, v0, Lcom/roidapp/photogrid/a/d;->h:Lcom/a/d/a/a;

    .line 210
    return-void
.end method
