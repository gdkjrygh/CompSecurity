.class final Lcom/roidapp/photogrid/release/pj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/rm;

.field final synthetic b:Lcom/roidapp/photogrid/release/pi;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/pi;Lcom/roidapp/photogrid/release/rm;)V
    .locals 0

    .prologue
    .line 31
    iput-object p1, p0, Lcom/roidapp/photogrid/release/pj;->b:Lcom/roidapp/photogrid/release/pi;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/pj;->a:Lcom/roidapp/photogrid/release/rm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    const/16 v5, 0x2bc

    const/4 v4, 0x7

    const/4 v3, 0x1

    .line 35
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pj;->a:Lcom/roidapp/photogrid/release/rm;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/rm;->c()[Ljava/lang/String;

    move-result-object v0

    .line 36
    if-eqz v0, :cond_4

    .line 37
    const/4 v1, 0x0

    aget-object v1, v0, v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    aget-object v1, v0, v1

    const-string v2, "0"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 38
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pj;->b:Lcom/roidapp/photogrid/release/pi;

    const/4 v2, 0x1

    aget-object v0, v0, v2

    iput-object v0, v1, Lcom/roidapp/photogrid/release/pi;->e:Ljava/lang/String;

    .line 39
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pj;->b:Lcom/roidapp/photogrid/release/pi;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pi;->e:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/pj;->b:Lcom/roidapp/photogrid/release/pi;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pi;->e:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 40
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pj;->b:Lcom/roidapp/photogrid/release/pi;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pi;->d:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x5f

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 41
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pj;->b:Lcom/roidapp/photogrid/release/pi;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/pj;->b:Lcom/roidapp/photogrid/release/pi;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/pi;->b:Landroid/app/Activity;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/pj;->b:Lcom/roidapp/photogrid/release/pi;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/pi;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/pi;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 79
    :cond_0
    :goto_0
    return-void

    .line 43
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pj;->b:Lcom/roidapp/photogrid/release/pi;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pi;->d:Lcom/roidapp/photogrid/release/ml;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 60
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 61
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 62
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 63
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pj;->b:Lcom/roidapp/photogrid/release/pi;

    iget v0, v0, Lcom/roidapp/photogrid/release/pi;->f:I

    const/16 v1, 0x1e0

    if-ne v0, v1, :cond_5

    .line 64
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pj;->b:Lcom/roidapp/photogrid/release/pi;

    const/16 v1, 0x140

    iput v1, v0, Lcom/roidapp/photogrid/release/pi;->f:I

    .line 65
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pj;->b:Lcom/roidapp/photogrid/release/pi;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pi;->q:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 45
    :cond_2
    const/4 v1, 0x0

    :try_start_1
    aget-object v1, v0, v1

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    aget-object v1, v0, v1

    const-string v2, "1"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 46
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 47
    const/16 v2, 0x2bc

    iput v2, v1, Landroid/os/Message;->what:I

    .line 48
    const/4 v2, 0x1

    aget-object v0, v0, v2

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 49
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pj;->b:Lcom/roidapp/photogrid/release/pi;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pi;->q:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    .line 69
    :catch_1
    move-exception v0

    .line 70
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 71
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 72
    const-string v2, "No space"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 73
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pj;->b:Lcom/roidapp/photogrid/release/pi;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pi;->q:Landroid/os/Handler;

    const/16 v1, 0x2be

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 50
    :cond_3
    const/4 v1, 0x0

    :try_start_2
    aget-object v1, v0, v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    aget-object v1, v0, v1

    const-string v2, "2"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 51
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 52
    const/16 v2, 0x2bd

    iput v2, v1, Landroid/os/Message;->what:I

    .line 53
    const/4 v2, 0x1

    aget-object v0, v0, v2

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 54
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pj;->b:Lcom/roidapp/photogrid/release/pi;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pi;->q:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_0

    .line 57
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pj;->b:Lcom/roidapp/photogrid/release/pi;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pi;->d:Lcom/roidapp/photogrid/release/ml;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto/16 :goto_0

    .line 67
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pj;->b:Lcom/roidapp/photogrid/release/pi;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pi;->d:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ml;->sendEmptyMessage(I)Z

    goto/16 :goto_0

    .line 75
    :cond_6
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pj;->b:Lcom/roidapp/photogrid/release/pi;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/pi;->q:Landroid/os/Handler;

    invoke-virtual {v1, v5}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 76
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pj;->b:Lcom/roidapp/photogrid/release/pi;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/pi;->q:Landroid/os/Handler;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/c;->a(Landroid/os/Handler;Ljava/lang/Throwable;)V

    goto/16 :goto_0
.end method
