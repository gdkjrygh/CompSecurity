.class final Lcom/roidapp/photogrid/release/qo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/photogrid/a/i;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/qi;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/qi;)V
    .locals 0

    .prologue
    .line 202
    iput-object p1, p0, Lcom/roidapp/photogrid/release/qo;->a:Lcom/roidapp/photogrid/release/qi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/roidapp/photogrid/a/l;Lcom/roidapp/photogrid/a/o;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 207
    invoke-virtual {p1}, Lcom/roidapp/photogrid/a/l;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 209
    const-string v0, "iab"

    const-string v1, "purchase success"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 211
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qo;->a:Lcom/roidapp/photogrid/release/qi;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qi;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/a/m;->a(Landroid/content/Context;I)V

    .line 212
    invoke-virtual {p2}, Lcom/roidapp/photogrid/a/o;->a()Ljava/lang/String;

    move-result-object v0

    .line 213
    const-string v1, "com.roidapp.photogrid.remove_ad_year"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 214
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qo;->a:Lcom/roidapp/photogrid/release/qi;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qi;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/a/m;->b(Landroid/content/Context;I)V

    .line 219
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qo;->a:Lcom/roidapp/photogrid/release/qi;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/qi;->d(Lcom/roidapp/photogrid/release/qi;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 231
    :goto_1
    return-void

    .line 215
    :cond_1
    const-string v1, "com.roidapp.photogrid.remove_ad_lifelong"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 216
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qo;->a:Lcom/roidapp/photogrid/release/qi;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qi;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/a/m;->c(Landroid/content/Context;I)V

    goto :goto_0

    .line 222
    :cond_2
    const-string v0, "iab"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "purchase failed"

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

    .line 225
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qo;->a:Lcom/roidapp/photogrid/release/qi;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qi;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/a/m;->a(Landroid/content/Context;I)V

    .line 226
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 227
    const/4 v1, 0x3

    iput v1, v0, Landroid/os/Message;->what:I

    .line 228
    const/4 v1, 0x2

    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 229
    iget-object v1, p0, Lcom/roidapp/photogrid/release/qo;->a:Lcom/roidapp/photogrid/release/qi;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/qi;->d(Lcom/roidapp/photogrid/release/qi;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_1
.end method
