.class final Lcom/roidapp/photogrid/video/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/photogrid/video/p;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/q;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/q;)V
    .locals 0

    .prologue
    .line 1341
    iput-object p1, p0, Lcom/roidapp/photogrid/video/x;->a:Lcom/roidapp/photogrid/video/q;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    .prologue
    .line 1344
    new-instance v0, Landroid/os/Message;

    invoke-direct {v0}, Landroid/os/Message;-><init>()V

    .line 1345
    const/16 v1, 0x2001

    iput v1, v0, Landroid/os/Message;->what:I

    .line 1346
    iput p1, v0, Landroid/os/Message;->arg1:I

    .line 1347
    iget-object v1, p0, Lcom/roidapp/photogrid/video/x;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/q;->j(Lcom/roidapp/photogrid/video/q;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1348
    return-void
.end method

.method public final a(ILjava/lang/String;)V
    .locals 2

    .prologue
    .line 1360
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 1361
    const/16 v0, 0x2004

    iput v0, v1, Landroid/os/Message;->what:I

    .line 1362
    iput p1, v1, Landroid/os/Message;->arg1:I

    .line 1363
    iget-object v0, p0, Lcom/roidapp/photogrid/video/x;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0, p2}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/q;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput v0, v1, Landroid/os/Message;->arg2:I

    .line 1364
    iget-object v0, p0, Lcom/roidapp/photogrid/video/x;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->j(Lcom/roidapp/photogrid/video/q;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1365
    return-void

    .line 1363
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(IZ)V
    .locals 2

    .prologue
    .line 1352
    new-instance v1, Landroid/os/Message;

    invoke-direct {v1}, Landroid/os/Message;-><init>()V

    .line 1353
    if-eqz p2, :cond_0

    const/16 v0, 0x2002

    :goto_0
    iput v0, v1, Landroid/os/Message;->what:I

    .line 1354
    iput p1, v1, Landroid/os/Message;->arg1:I

    .line 1355
    iget-object v0, p0, Lcom/roidapp/photogrid/video/x;->a:Lcom/roidapp/photogrid/video/q;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->j(Lcom/roidapp/photogrid/video/q;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1356
    return-void

    .line 1353
    :cond_0
    const/16 v0, 0x2003

    goto :goto_0
.end method
