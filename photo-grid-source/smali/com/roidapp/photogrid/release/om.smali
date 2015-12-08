.class final Lcom/roidapp/photogrid/release/om;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ol;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ol;)V
    .locals 0

    .prologue
    .line 57
    iput-object p1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .prologue
    const/16 v6, 0x1e0

    const/16 v5, 0x800

    const/16 v4, 0x2bc

    const/4 v3, 0x1

    .line 60
    const-wide/16 v0, 0x3e8

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    :goto_0
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ol;->a(Lcom/roidapp/photogrid/release/ol;)V

    .line 66
    iget-object v0, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget v1, v1, Lcom/roidapp/photogrid/release/ol;->f:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ol;->c()I

    move-result v2

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/release/ol;->a(Lcom/roidapp/photogrid/release/ol;II)[Ljava/lang/String;

    move-result-object v0

    .line 67
    if-eqz v0, :cond_5

    .line 68
    const/4 v1, 0x0

    aget-object v1, v0, v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    aget-object v1, v0, v1

    const-string v2, "0"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 69
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    const/4 v2, 0x1

    aget-object v0, v0, v2

    iput-object v0, v1, Lcom/roidapp/photogrid/release/ol;->e:Ljava/lang/String;

    .line 70
    iget-object v0, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ol;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ol;->e:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 71
    iget-object v0, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ol;->b:Landroid/app/Activity;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ol;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ol;->a(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 140
    :goto_1
    return-void

    .line 62
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0

    .line 73
    :cond_0
    :try_start_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ol;->d:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x90

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->a(I)V
    :try_end_2
    .catch Ljava/lang/OutOfMemoryError; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    .line 96
    :catch_1
    move-exception v0

    .line 97
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 98
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 99
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget v1, v1, Lcom/roidapp/photogrid/release/ol;->f:I

    if-ne v1, v6, :cond_6

    .line 100
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    const/16 v2, 0x140

    iput v2, v1, Lcom/roidapp/photogrid/release/ol;->f:I

    .line 101
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ol;->q:Landroid/os/Handler;

    invoke-virtual {v1, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 129
    :goto_2
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_1

    .line 75
    :cond_1
    const/4 v1, 0x0

    :try_start_3
    aget-object v1, v0, v1

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    aget-object v1, v0, v1

    const-string v2, "1"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 76
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 77
    const/16 v2, 0x2bc

    iput v2, v1, Landroid/os/Message;->what:I

    .line 78
    const/4 v2, 0x1

    aget-object v0, v0, v2

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 79
    iget-object v0, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ol;->q:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_1

    .line 130
    :catch_2
    move-exception v0

    .line 131
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 132
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 133
    const-string v2, "No space"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_f

    .line 134
    iget-object v0, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ol;->q:Landroid/os/Handler;

    const/16 v1, 0x2be

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_1

    .line 80
    :cond_2
    const/4 v1, 0x0

    :try_start_4
    aget-object v1, v0, v1

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    aget-object v1, v0, v1

    const-string v2, "2"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 81
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 82
    const/16 v2, 0x2bd

    iput v2, v1, Landroid/os/Message;->what:I

    .line 83
    const/4 v2, 0x1

    aget-object v0, v0, v2

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ol;->q:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_1

    .line 85
    :cond_3
    const/4 v1, 0x0

    aget-object v1, v0, v1

    if-eqz v1, :cond_4

    const/4 v1, 0x0

    aget-object v1, v0, v1

    const-string v2, "3"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 86
    iget-object v0, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ol;->q:Landroid/os/Handler;

    const/16 v1, 0x2be

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_1

    .line 88
    :cond_4
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 89
    const/16 v2, 0x2bc

    iput v2, v1, Landroid/os/Message;->what:I

    .line 90
    const/4 v2, 0x1

    aget-object v0, v0, v2

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 91
    iget-object v0, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ol;->q:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_1

    .line 94
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ol;->d:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x91

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->a(I)V
    :try_end_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto/16 :goto_1

    .line 102
    :cond_6
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget v1, v1, Lcom/roidapp/photogrid/release/ol;->f:I

    const/16 v2, 0x21c

    if-ne v1, v2, :cond_7

    .line 103
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iput v6, v1, Lcom/roidapp/photogrid/release/ol;->f:I

    .line 104
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ol;->q:Landroid/os/Handler;

    invoke-virtual {v1, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_2

    .line 105
    :cond_7
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget v1, v1, Lcom/roidapp/photogrid/release/ol;->f:I

    const/16 v2, 0x2d0

    if-ne v1, v2, :cond_8

    .line 106
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    const/16 v2, 0x21c

    iput v2, v1, Lcom/roidapp/photogrid/release/ol;->f:I

    .line 107
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ol;->q:Landroid/os/Handler;

    invoke-virtual {v1, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_2

    .line 108
    :cond_8
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget v1, v1, Lcom/roidapp/photogrid/release/ol;->f:I

    const/16 v2, 0x400

    if-ne v1, v2, :cond_9

    .line 109
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    const/16 v2, 0x2d0

    iput v2, v1, Lcom/roidapp/photogrid/release/ol;->f:I

    .line 110
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ol;->q:Landroid/os/Handler;

    invoke-virtual {v1, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_2

    .line 111
    :cond_9
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget v1, v1, Lcom/roidapp/photogrid/release/ol;->f:I

    const/16 v2, 0x438

    if-ne v1, v2, :cond_a

    .line 112
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    const/16 v2, 0x400

    iput v2, v1, Lcom/roidapp/photogrid/release/ol;->f:I

    .line 113
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ol;->q:Landroid/os/Handler;

    invoke-virtual {v1, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_2

    .line 114
    :cond_a
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget v1, v1, Lcom/roidapp/photogrid/release/ol;->f:I

    const/16 v2, 0x67c

    if-ne v1, v2, :cond_b

    .line 115
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    const/16 v2, 0x438

    iput v2, v1, Lcom/roidapp/photogrid/release/ol;->f:I

    .line 116
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ol;->q:Landroid/os/Handler;

    invoke-virtual {v1, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_2

    .line 117
    :cond_b
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget v1, v1, Lcom/roidapp/photogrid/release/ol;->f:I

    const/16 v2, 0x780

    if-ne v1, v2, :cond_c

    .line 118
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    const/16 v2, 0x67c

    iput v2, v1, Lcom/roidapp/photogrid/release/ol;->f:I

    .line 119
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ol;->q:Landroid/os/Handler;

    invoke-virtual {v1, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_2

    .line 120
    :cond_c
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget v1, v1, Lcom/roidapp/photogrid/release/ol;->f:I

    if-ne v1, v5, :cond_d

    .line 121
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    const/16 v2, 0x780

    iput v2, v1, Lcom/roidapp/photogrid/release/ol;->f:I

    .line 122
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ol;->q:Landroid/os/Handler;

    invoke-virtual {v1, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_2

    .line 123
    :cond_d
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget v1, v1, Lcom/roidapp/photogrid/release/ol;->f:I

    if-le v1, v5, :cond_e

    .line 124
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iput v5, v1, Lcom/roidapp/photogrid/release/ol;->f:I

    .line 125
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ol;->q:Landroid/os/Handler;

    invoke-virtual {v1, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_2

    .line 127
    :cond_e
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ol;->d:Lcom/roidapp/photogrid/release/ml;

    const/16 v2, 0x92

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(I)V

    goto/16 :goto_2

    .line 136
    :cond_f
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ol;->q:Landroid/os/Handler;

    invoke-virtual {v1, v4}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 137
    iget-object v1, p0, Lcom/roidapp/photogrid/release/om;->a:Lcom/roidapp/photogrid/release/ol;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ol;->q:Landroid/os/Handler;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/c;->a(Landroid/os/Handler;Ljava/lang/Throwable;)V

    goto/16 :goto_1
.end method
