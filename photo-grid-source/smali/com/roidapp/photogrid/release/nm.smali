.class final Lcom/roidapp/photogrid/release/nm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/nl;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/nl;)V
    .locals 0

    .prologue
    .line 73
    iput-object p1, p0, Lcom/roidapp/photogrid/release/nm;->a:Lcom/roidapp/photogrid/release/nl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .prologue
    const/4 v0, 0x0

    .line 75
    const/4 v1, 0x0

    move v2, v0

    .line 79
    :goto_0
    :try_start_0
    iget-object v3, p0, Lcom/roidapp/photogrid/release/nm;->a:Lcom/roidapp/photogrid/release/nl;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/nl;->a(Lcom/roidapp/photogrid/release/nl;)[Lcom/roidapp/photogrid/release/ig;

    move-result-object v3

    array-length v3, v3

    if-ge v2, v3, :cond_3

    .line 80
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->a()Lcom/roidapp/photogrid/release/rf;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/nm;->a:Lcom/roidapp/photogrid/release/nl;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/nl;->a(Lcom/roidapp/photogrid/release/nl;)[Lcom/roidapp/photogrid/release/ig;

    move-result-object v3

    aget-object v3, v3, v2

    iget-object v4, p0, Lcom/roidapp/photogrid/release/nm;->a:Lcom/roidapp/photogrid/release/nl;

    invoke-static {v4}, Lcom/roidapp/photogrid/release/nl;->b(Lcom/roidapp/photogrid/release/nl;)I

    move-result v4

    iget-object v5, p0, Lcom/roidapp/photogrid/release/nm;->a:Lcom/roidapp/photogrid/release/nl;

    invoke-static {v5}, Lcom/roidapp/photogrid/release/nl;->c(Lcom/roidapp/photogrid/release/nl;)I

    move-result v5

    const/4 v6, 0x0

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v3, v4, v5, v6}, Lcom/roidapp/photogrid/release/rf;->a(Lcom/roidapp/photogrid/release/ig;IILjava/lang/Boolean;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 81
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 83
    :cond_0
    const/4 v0, 0x1

    .line 90
    :goto_1
    if-eqz v0, :cond_2

    .line 92
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nm;->a:Lcom/roidapp/photogrid/release/nl;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/nl;->e(Lcom/roidapp/photogrid/release/nl;)V

    .line 93
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 94
    const/16 v3, 0x2bf

    iput v3, v0, Landroid/os/Message;->what:I

    .line 95
    iget-object v3, p0, Lcom/roidapp/photogrid/release/nm;->a:Lcom/roidapp/photogrid/release/nl;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/nl;->a(Lcom/roidapp/photogrid/release/nl;)[Lcom/roidapp/photogrid/release/ig;

    move-result-object v3

    aget-object v2, v3, v2

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    iput-object v2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 96
    iget-object v2, p0, Lcom/roidapp/photogrid/release/nm;->a:Lcom/roidapp/photogrid/release/nl;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/nl;->K:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 108
    :goto_2
    return-void

    .line 87
    :cond_1
    iget-object v3, p0, Lcom/roidapp/photogrid/release/nm;->a:Lcom/roidapp/photogrid/release/nl;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/nl;->d(Lcom/roidapp/photogrid/release/nl;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    iget-object v3, p0, Lcom/roidapp/photogrid/release/nm;->a:Lcom/roidapp/photogrid/release/nl;

    iget-object v3, v3, Lcom/roidapp/photogrid/release/nl;->l:Lcom/roidapp/photogrid/release/ml;

    mul-int/lit8 v4, v2, 0x4

    add-int/lit8 v4, v4, 0x22

    const/4 v5, 0x0

    invoke-virtual {v3, v4, v5}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 79
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 99
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/nm;->a:Lcom/roidapp/photogrid/release/nl;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/nl;->l:Lcom/roidapp/photogrid/release/ml;

    const/4 v2, 0x3

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 102
    :catch_0
    move-exception v0

    .line 103
    invoke-static {v1}, Lcom/roidapp/photogrid/release/nl;->a(Landroid/graphics/Bitmap;)V

    .line 104
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nm;->a:Lcom/roidapp/photogrid/release/nl;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/nl;->e(Lcom/roidapp/photogrid/release/nl;)V

    .line 105
    iget-object v1, p0, Lcom/roidapp/photogrid/release/nm;->a:Lcom/roidapp/photogrid/release/nl;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/nl;->l:Lcom/roidapp/photogrid/release/ml;

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    .line 106
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_2

    :cond_3
    move v2, v0

    goto :goto_1
.end method
