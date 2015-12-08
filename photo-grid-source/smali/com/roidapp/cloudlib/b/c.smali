.class final Lcom/roidapp/cloudlib/b/c;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/b/a;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/b/a;)V
    .locals 0

    .prologue
    .line 223
    iput-object p1, p0, Lcom/roidapp/cloudlib/b/c;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 226
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 227
    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_1

    .line 228
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 229
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 230
    iget-object v1, p0, Lcom/roidapp/cloudlib/b/c;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v1}, Lcom/roidapp/cloudlib/b/a;->c(Lcom/roidapp/cloudlib/b/a;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 231
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/c;->a:Lcom/roidapp/cloudlib/b/a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/b/a;->a(I)V

    .line 242
    :cond_0
    :goto_0
    return-void

    .line 234
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    if-ne v0, v2, :cond_0

    .line 235
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 236
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .line 237
    iget-object v1, p0, Lcom/roidapp/cloudlib/b/c;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-static {v1}, Lcom/roidapp/cloudlib/b/a;->c(Lcom/roidapp/cloudlib/b/a;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 238
    iget-object v0, p0, Lcom/roidapp/cloudlib/b/c;->a:Lcom/roidapp/cloudlib/b/a;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/b/a;->a(I)V

    goto :goto_0
.end method
