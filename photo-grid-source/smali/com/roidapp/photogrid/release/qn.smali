.class final Lcom/roidapp/photogrid/release/qn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/photogrid/a/j;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/qi;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/qi;)V
    .locals 0

    .prologue
    .line 156
    iput-object p1, p0, Lcom/roidapp/photogrid/release/qn;->a:Lcom/roidapp/photogrid/release/qi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/roidapp/photogrid/a/l;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 160
    invoke-virtual {p1}, Lcom/roidapp/photogrid/a/l;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qn;->a:Lcom/roidapp/photogrid/release/qi;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/qi;->a(Lcom/roidapp/photogrid/release/qi;Z)Z

    .line 164
    const-string v0, "iab"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "setup failed"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/roidapp/photogrid/a/l;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lcom/roidapp/photogrid/a/l;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 165
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 166
    const/4 v1, 0x3

    iput v1, v0, Landroid/os/Message;->what:I

    .line 167
    iput v3, v0, Landroid/os/Message;->arg1:I

    .line 168
    iget-object v1, p0, Lcom/roidapp/photogrid/release/qn;->a:Lcom/roidapp/photogrid/release/qi;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/qi;->d(Lcom/roidapp/photogrid/release/qi;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 174
    :goto_0
    return-void

    .line 170
    :cond_0
    const-string v0, "iab"

    const-string v1, "setup success"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 171
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qn;->a:Lcom/roidapp/photogrid/release/qi;

    invoke-static {v0, v3}, Lcom/roidapp/photogrid/release/qi;->a(Lcom/roidapp/photogrid/release/qi;Z)Z

    .line 172
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qn;->a:Lcom/roidapp/photogrid/release/qi;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/qi;->d(Lcom/roidapp/photogrid/release/qi;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0
.end method
