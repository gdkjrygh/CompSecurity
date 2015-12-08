.class final Lcom/roidapp/photogrid/release/pb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ie;

.field final synthetic b:Lcom/roidapp/photogrid/release/pa;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/pa;Lcom/roidapp/photogrid/release/ie;)V
    .locals 0

    .prologue
    .line 82
    iput-object p1, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/pb;->a:Lcom/roidapp/photogrid/release/ie;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .prologue
    const/16 v5, 0x800

    const/16 v4, 0x438

    const/4 v3, 0x0

    .line 87
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->a:Lcom/roidapp/photogrid/release/ie;

    .line 1284
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ie;->c(Z)[Ljava/lang/String;

    move-result-object v0

    .line 88
    if-eqz v0, :cond_6

    .line 89
    const/4 v1, 0x0

    aget-object v1, v0, v1

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    aget-object v1, v0, v1

    const-string v2, "0"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 90
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    const/4 v2, 0x1

    aget-object v0, v0, v2

    iput-object v0, v1, Lcom/roidapp/photogrid/release/pa;->e:Ljava/lang/String;

    .line 91
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pa;->e:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pa;->e:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 92
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pa;->d:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x5f

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ml;->a(II)V

    .line 93
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/pa;->b:Landroid/app/Activity;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/pa;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/pa;->a(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pa;->g:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_1

    .line 162
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pa;->g:Lcom/roidapp/photogrid/release/PhotoView;

    iput-boolean v3, v0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    .line 165
    :cond_1
    :goto_1
    return-void

    .line 95
    :cond_2
    :try_start_1
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 96
    const/4 v1, 0x7

    iput v1, v0, Landroid/os/Message;->what:I

    .line 97
    const/16 v1, 0x90

    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 98
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/pa;->d:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ml;->sendMessage(Landroid/os/Message;)Z
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 119
    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 120
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 121
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 122
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget v0, v0, Lcom/roidapp/photogrid/release/pa;->f:I

    const/16 v1, 0x1e0

    if-ne v0, v1, :cond_7

    .line 123
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    const/16 v1, 0x140

    iput v1, v0, Lcom/roidapp/photogrid/release/pa;->f:I

    .line 124
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pa;->q:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 161
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pa;->g:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_1

    .line 162
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pa;->g:Lcom/roidapp/photogrid/release/PhotoView;

    iput-boolean v3, v0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    goto :goto_1

    .line 100
    :cond_3
    const/4 v1, 0x0

    :try_start_3
    aget-object v1, v0, v1

    if-eqz v1, :cond_4

    const/4 v1, 0x0

    aget-object v1, v0, v1

    const-string v2, "1"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 101
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 102
    const/16 v2, 0x2bc

    iput v2, v1, Landroid/os/Message;->what:I

    .line 103
    const/4 v2, 0x1

    aget-object v0, v0, v2

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 104
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pa;->q:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_0

    .line 152
    :catch_1
    move-exception v0

    .line 153
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 154
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 155
    const-string v2, "No space"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 156
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pa;->q:Landroid/os/Handler;

    const/16 v1, 0x2be

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 161
    :goto_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pa;->g:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_1

    .line 162
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pa;->g:Lcom/roidapp/photogrid/release/PhotoView;

    iput-boolean v3, v0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    goto/16 :goto_1

    .line 105
    :cond_4
    const/4 v1, 0x0

    :try_start_5
    aget-object v1, v0, v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    aget-object v1, v0, v1

    const-string v2, "2"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 106
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 107
    const/16 v2, 0x2bd

    iput v2, v1, Landroid/os/Message;->what:I

    .line 108
    const/4 v2, 0x1

    aget-object v0, v0, v2

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 109
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pa;->q:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_5
    .catch Ljava/lang/OutOfMemoryError; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto/16 :goto_0

    .line 161
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/pa;->g:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v1, :cond_5

    .line 162
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/pa;->g:Lcom/roidapp/photogrid/release/PhotoView;

    iput-boolean v3, v1, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    :cond_5
    throw v0

    .line 112
    :cond_6
    :try_start_6
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 113
    const/4 v1, 0x7

    iput v1, v0, Landroid/os/Message;->what:I

    .line 114
    const/16 v1, 0x91

    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 115
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/pa;->d:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ml;->sendMessage(Landroid/os/Message;)Z
    :try_end_6
    .catch Ljava/lang/OutOfMemoryError; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto/16 :goto_0

    .line 125
    :cond_7
    :try_start_7
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget v0, v0, Lcom/roidapp/photogrid/release/pa;->f:I

    const/16 v1, 0x21c

    if-ne v0, v1, :cond_8

    .line 126
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    const/16 v1, 0x1e0

    iput v1, v0, Lcom/roidapp/photogrid/release/pa;->f:I

    .line 127
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pa;->q:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_2

    .line 128
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget v0, v0, Lcom/roidapp/photogrid/release/pa;->f:I

    const/16 v1, 0x2d0

    if-ne v0, v1, :cond_9

    .line 129
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    const/16 v1, 0x21c

    iput v1, v0, Lcom/roidapp/photogrid/release/pa;->f:I

    .line 130
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pa;->q:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_2

    .line 131
    :cond_9
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget v0, v0, Lcom/roidapp/photogrid/release/pa;->f:I

    const/16 v1, 0x400

    if-ne v0, v1, :cond_a

    .line 132
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    const/16 v1, 0x2d0

    iput v1, v0, Lcom/roidapp/photogrid/release/pa;->f:I

    .line 133
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pa;->q:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_2

    .line 134
    :cond_a
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget v0, v0, Lcom/roidapp/photogrid/release/pa;->f:I

    if-ne v0, v4, :cond_b

    .line 135
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    const/16 v1, 0x400

    iput v1, v0, Lcom/roidapp/photogrid/release/pa;->f:I

    .line 136
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pa;->q:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_2

    .line 137
    :cond_b
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget v0, v0, Lcom/roidapp/photogrid/release/pa;->f:I

    const/16 v1, 0x67c

    if-ne v0, v1, :cond_c

    .line 138
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    const/16 v1, 0x438

    iput v1, v0, Lcom/roidapp/photogrid/release/pa;->f:I

    .line 139
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pa;->q:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_2

    .line 140
    :cond_c
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget v0, v0, Lcom/roidapp/photogrid/release/pa;->f:I

    const/16 v1, 0x780

    if-ne v0, v1, :cond_d

    .line 141
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    const/16 v1, 0x438

    iput v1, v0, Lcom/roidapp/photogrid/release/pa;->f:I

    .line 142
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pa;->q:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_2

    .line 143
    :cond_d
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget v0, v0, Lcom/roidapp/photogrid/release/pa;->f:I

    if-ne v0, v5, :cond_e

    .line 144
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    const/16 v1, 0x780

    iput v1, v0, Lcom/roidapp/photogrid/release/pa;->f:I

    .line 145
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pa;->q:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_2

    .line 146
    :cond_e
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget v0, v0, Lcom/roidapp/photogrid/release/pa;->f:I

    if-le v0, v5, :cond_f

    .line 147
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    const/16 v1, 0x800

    iput v1, v0, Lcom/roidapp/photogrid/release/pa;->f:I

    .line 148
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pa;->q:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto/16 :goto_2

    .line 150
    :cond_f
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pa;->d:Lcom/roidapp/photogrid/release/ml;

    const/16 v1, 0x92

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ml;->a(I)V

    goto/16 :goto_2

    .line 158
    :cond_10
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pb;->b:Lcom/roidapp/photogrid/release/pa;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/pa;->q:Landroid/os/Handler;

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/common/c;->a(Landroid/os/Handler;Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    goto/16 :goto_3
.end method
