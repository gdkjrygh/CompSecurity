.class final Lcom/roidapp/photogrid/release/mv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/mu;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/mu;)V
    .locals 0

    .prologue
    .line 74
    iput-object p1, p0, Lcom/roidapp/photogrid/release/mv;->a:Lcom/roidapp/photogrid/release/mu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 76
    const/4 v1, 0x0

    move v2, v0

    .line 80
    :goto_0
    :try_start_0
    iget-object v3, p0, Lcom/roidapp/photogrid/release/mv;->a:Lcom/roidapp/photogrid/release/mu;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/mu;->a(Lcom/roidapp/photogrid/release/mu;)[Lcom/roidapp/photogrid/release/ig;

    move-result-object v3

    array-length v3, v3

    if-ge v2, v3, :cond_3

    .line 81
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/mv;->a:Lcom/roidapp/photogrid/release/mu;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/mu;->a(Lcom/roidapp/photogrid/release/mu;)[Lcom/roidapp/photogrid/release/ig;

    move-result-object v3

    aget-object v3, v3, v2

    iget-object v4, p0, Lcom/roidapp/photogrid/release/mv;->a:Lcom/roidapp/photogrid/release/mu;

    invoke-static {v4}, Lcom/roidapp/photogrid/release/mu;->b(Lcom/roidapp/photogrid/release/mu;)I

    move-result v4

    iget-object v5, p0, Lcom/roidapp/photogrid/release/mv;->a:Lcom/roidapp/photogrid/release/mu;

    invoke-static {v5}, Lcom/roidapp/photogrid/release/mu;->c(Lcom/roidapp/photogrid/release/mu;)I

    move-result v5

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v3, v4, v5, v6}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/ig;IILjava/lang/Boolean;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 82
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 84
    :cond_0
    const/4 v0, 0x1

    .line 91
    :goto_1
    if-eqz v0, :cond_2

    .line 93
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mv;->a:Lcom/roidapp/photogrid/release/mu;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/mu;->e(Lcom/roidapp/photogrid/release/mu;)V

    .line 94
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 95
    const/16 v3, 0x2bf

    iput v3, v0, Landroid/os/Message;->what:I

    .line 96
    iget-object v3, p0, Lcom/roidapp/photogrid/release/mv;->a:Lcom/roidapp/photogrid/release/mu;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/mu;->a(Lcom/roidapp/photogrid/release/mu;)[Lcom/roidapp/photogrid/release/ig;

    move-result-object v3

    aget-object v2, v3, v2

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    iput-object v2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 97
    iget-object v2, p0, Lcom/roidapp/photogrid/release/mv;->a:Lcom/roidapp/photogrid/release/mu;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/mu;->K:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 109
    :goto_2
    return-void

    .line 88
    :cond_1
    iget-object v3, p0, Lcom/roidapp/photogrid/release/mv;->a:Lcom/roidapp/photogrid/release/mu;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/mu;->d(Lcom/roidapp/photogrid/release/mu;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    iget-object v3, p0, Lcom/roidapp/photogrid/release/mv;->a:Lcom/roidapp/photogrid/release/mu;

    iget-object v3, v3, Lcom/roidapp/photogrid/release/mu;->l:Lcom/roidapp/photogrid/release/ml;

    mul-int/lit8 v4, v2, 0x4

    add-int/lit8 v4, v4, 0x22

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 80
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 100
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mv;->a:Lcom/roidapp/photogrid/release/mu;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/mu;->l:Lcom/roidapp/photogrid/release/ml;

    const/4 v2, 0x3

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 103
    :catch_0
    move-exception v0

    .line 104
    invoke-static {v1}, Lcom/roidapp/photogrid/release/mu;->a(Landroid/graphics/Bitmap;)V

    .line 105
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mv;->a:Lcom/roidapp/photogrid/release/mu;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/mu;->e(Lcom/roidapp/photogrid/release/mu;)V

    .line 106
    iget-object v1, p0, Lcom/roidapp/photogrid/release/mv;->a:Lcom/roidapp/photogrid/release/mu;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/mu;->l:Lcom/roidapp/photogrid/release/ml;

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 107
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_2

    :cond_3
    move v2, v0

    goto :goto_1
.end method
