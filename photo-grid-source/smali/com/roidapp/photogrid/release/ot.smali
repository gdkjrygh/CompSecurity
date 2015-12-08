.class final Lcom/roidapp/photogrid/release/ot;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ie;

.field final synthetic b:I

.field final synthetic c:Lcom/roidapp/photogrid/release/or;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/or;Lcom/roidapp/photogrid/release/ie;I)V
    .locals 0

    .prologue
    .line 270
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ot;->c:Lcom/roidapp/photogrid/release/or;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/ot;->a:Lcom/roidapp/photogrid/release/ie;

    iput p3, p0, Lcom/roidapp/photogrid/release/ot;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 274
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ot;->c:Lcom/roidapp/photogrid/release/or;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/or;->b:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hw;->a(Landroid/content/Context;)Z

    move-result v1

    .line 276
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ot;->a:Lcom/roidapp/photogrid/release/ie;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ie;->c(Z)[Ljava/lang/String;

    move-result-object v0

    .line 277
    if-eqz v0, :cond_6

    .line 278
    const/4 v2, 0x0

    aget-object v2, v0, v2

    if-eqz v2, :cond_3

    const/4 v2, 0x0

    aget-object v2, v0, v2

    const-string v3, "0"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 279
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ot;->c:Lcom/roidapp/photogrid/release/or;

    const/4 v3, 0x1

    aget-object v0, v0, v3

    iput-object v0, v2, Lcom/roidapp/photogrid/release/or;->n:Ljava/lang/String;

    .line 280
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ot;->c:Lcom/roidapp/photogrid/release/or;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/or;->n:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ot;->c:Lcom/roidapp/photogrid/release/or;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/or;->n:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 281
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ot;->c:Lcom/roidapp/photogrid/release/or;

    const/16 v2, 0x5f

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/or;->b(I)V

    .line 285
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 286
    const/16 v2, 0x8

    iput v2, v0, Landroid/os/Message;->what:I

    .line 287
    iget v2, p0, Lcom/roidapp/photogrid/release/ot;->b:I

    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 288
    const/4 v2, 0x1

    iput v2, v0, Landroid/os/Message;->arg2:I

    .line 289
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 290
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ot;->c:Lcom/roidapp/photogrid/release/or;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/or;->q:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 333
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ot;->c:Lcom/roidapp/photogrid/release/or;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/or;->g:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_1

    .line 334
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ot;->c:Lcom/roidapp/photogrid/release/or;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/or;->g:Lcom/roidapp/photogrid/release/PhotoView;

    iput-boolean v4, v0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    .line 337
    :cond_1
    :goto_1
    return-void

    .line 292
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ot;->c:Lcom/roidapp/photogrid/release/or;

    const/16 v2, 0x93

    iput v2, v0, Lcom/roidapp/photogrid/release/or;->m:I

    .line 293
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 294
    const/4 v2, 0x7

    iput v2, v0, Landroid/os/Message;->what:I

    .line 295
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ot;->c:Lcom/roidapp/photogrid/release/or;

    iget v2, v2, Lcom/roidapp/photogrid/release/or;->m:I

    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 296
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ot;->c:Lcom/roidapp/photogrid/release/or;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/or;->d:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/ml;->sendMessage(Landroid/os/Message;)Z
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 323
    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 324
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 325
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 326
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 327
    const/16 v2, 0x8

    iput v2, v0, Landroid/os/Message;->what:I

    .line 328
    iget v2, p0, Lcom/roidapp/photogrid/release/ot;->b:I

    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 329
    const/4 v2, 0x0

    iput v2, v0, Landroid/os/Message;->arg2:I

    .line 330
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 331
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ot;->c:Lcom/roidapp/photogrid/release/or;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/or;->q:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 333
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ot;->c:Lcom/roidapp/photogrid/release/or;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/or;->g:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_1

    .line 334
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ot;->c:Lcom/roidapp/photogrid/release/or;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/or;->g:Lcom/roidapp/photogrid/release/PhotoView;

    iput-boolean v4, v0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    goto :goto_1

    .line 299
    :cond_3
    const/4 v2, 0x0

    :try_start_3
    aget-object v2, v0, v2

    if-eqz v2, :cond_5

    const/4 v2, 0x0

    aget-object v2, v0, v2

    const-string v3, "1"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 300
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 301
    const/16 v2, 0x8

    iput v2, v0, Landroid/os/Message;->what:I

    .line 302
    iget v2, p0, Lcom/roidapp/photogrid/release/ot;->b:I

    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 303
    const/4 v2, 0x0

    iput v2, v0, Landroid/os/Message;->arg2:I

    .line 304
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 305
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ot;->c:Lcom/roidapp/photogrid/release/or;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/or;->q:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_0

    .line 333
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ot;->c:Lcom/roidapp/photogrid/release/or;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/or;->g:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v1, :cond_4

    .line 334
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ot;->c:Lcom/roidapp/photogrid/release/or;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/or;->g:Lcom/roidapp/photogrid/release/PhotoView;

    iput-boolean v4, v1, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    :cond_4
    throw v0

    .line 306
    :cond_5
    const/4 v2, 0x0

    :try_start_4
    aget-object v2, v0, v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    aget-object v0, v0, v2

    const-string v2, "2"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 307
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 308
    const/16 v2, 0x8

    iput v2, v0, Landroid/os/Message;->what:I

    .line 309
    iget v2, p0, Lcom/roidapp/photogrid/release/ot;->b:I

    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 310
    const/4 v2, 0x0

    iput v2, v0, Landroid/os/Message;->arg2:I

    .line 311
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 312
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ot;->c:Lcom/roidapp/photogrid/release/or;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/or;->q:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_0

    .line 315
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ot;->c:Lcom/roidapp/photogrid/release/or;

    const/16 v2, 0x94

    iput v2, v0, Lcom/roidapp/photogrid/release/or;->m:I

    .line 316
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 317
    const/4 v2, 0x7

    iput v2, v0, Landroid/os/Message;->what:I

    .line 318
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ot;->c:Lcom/roidapp/photogrid/release/or;

    iget v2, v2, Lcom/roidapp/photogrid/release/or;->m:I

    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 319
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ot;->c:Lcom/roidapp/photogrid/release/or;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/or;->d:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/ml;->sendMessage(Landroid/os/Message;)Z
    :try_end_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_0
.end method
