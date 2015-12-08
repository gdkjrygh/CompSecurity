.class final Lcom/roidapp/photogrid/release/oq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ie;

.field final synthetic b:I

.field final synthetic c:Lcom/roidapp/photogrid/release/oo;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/oo;Lcom/roidapp/photogrid/release/ie;I)V
    .locals 0

    .prologue
    .line 272
    iput-object p1, p0, Lcom/roidapp/photogrid/release/oq;->c:Lcom/roidapp/photogrid/release/oo;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/oq;->a:Lcom/roidapp/photogrid/release/ie;

    iput p3, p0, Lcom/roidapp/photogrid/release/oq;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 276
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oq;->c:Lcom/roidapp/photogrid/release/oo;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/oo;->b:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hw;->a(Landroid/content/Context;)Z

    move-result v1

    .line 278
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oq;->a:Lcom/roidapp/photogrid/release/ie;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ie;->c(Z)[Ljava/lang/String;

    move-result-object v0

    .line 279
    if-eqz v0, :cond_6

    .line 280
    const/4 v2, 0x0

    aget-object v2, v0, v2

    if-eqz v2, :cond_3

    const/4 v2, 0x0

    aget-object v2, v0, v2

    const-string v3, "0"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 281
    iget-object v2, p0, Lcom/roidapp/photogrid/release/oq;->c:Lcom/roidapp/photogrid/release/oo;

    const/4 v3, 0x1

    aget-object v0, v0, v3

    iput-object v0, v2, Lcom/roidapp/photogrid/release/oo;->n:Ljava/lang/String;

    .line 282
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oq;->c:Lcom/roidapp/photogrid/release/oo;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/oo;->n:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/oq;->c:Lcom/roidapp/photogrid/release/oo;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/oo;->n:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 283
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oq;->c:Lcom/roidapp/photogrid/release/oo;

    const/16 v2, 0x5f

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/oo;->b(I)V

    .line 287
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 288
    const/16 v2, 0x8

    iput v2, v0, Landroid/os/Message;->what:I

    .line 289
    iget v2, p0, Lcom/roidapp/photogrid/release/oq;->b:I

    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 290
    const/4 v2, 0x1

    iput v2, v0, Landroid/os/Message;->arg2:I

    .line 291
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 292
    iget-object v2, p0, Lcom/roidapp/photogrid/release/oq;->c:Lcom/roidapp/photogrid/release/oo;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/oo;->q:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 335
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oq;->c:Lcom/roidapp/photogrid/release/oo;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/oo;->g:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_1

    .line 336
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oq;->c:Lcom/roidapp/photogrid/release/oo;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/oo;->g:Lcom/roidapp/photogrid/release/PhotoView;

    iput-boolean v4, v0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    .line 339
    :cond_1
    :goto_1
    return-void

    .line 294
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oq;->c:Lcom/roidapp/photogrid/release/oo;

    const/16 v2, 0x93

    iput v2, v0, Lcom/roidapp/photogrid/release/oo;->m:I

    .line 295
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 296
    const/4 v2, 0x7

    iput v2, v0, Landroid/os/Message;->what:I

    .line 297
    iget-object v2, p0, Lcom/roidapp/photogrid/release/oq;->c:Lcom/roidapp/photogrid/release/oo;

    iget v2, v2, Lcom/roidapp/photogrid/release/oo;->m:I

    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 298
    iget-object v2, p0, Lcom/roidapp/photogrid/release/oq;->c:Lcom/roidapp/photogrid/release/oo;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/oo;->d:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/ml;->sendMessage(Landroid/os/Message;)Z
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 325
    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 326
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 327
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 328
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 329
    const/16 v2, 0x8

    iput v2, v0, Landroid/os/Message;->what:I

    .line 330
    iget v2, p0, Lcom/roidapp/photogrid/release/oq;->b:I

    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 331
    const/4 v2, 0x0

    iput v2, v0, Landroid/os/Message;->arg2:I

    .line 332
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 333
    iget-object v1, p0, Lcom/roidapp/photogrid/release/oq;->c:Lcom/roidapp/photogrid/release/oo;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/oo;->q:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 335
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oq;->c:Lcom/roidapp/photogrid/release/oo;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/oo;->g:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_1

    .line 336
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oq;->c:Lcom/roidapp/photogrid/release/oo;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/oo;->g:Lcom/roidapp/photogrid/release/PhotoView;

    iput-boolean v4, v0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    goto :goto_1

    .line 301
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

    .line 302
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 303
    const/16 v2, 0x8

    iput v2, v0, Landroid/os/Message;->what:I

    .line 304
    iget v2, p0, Lcom/roidapp/photogrid/release/oq;->b:I

    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 305
    const/4 v2, 0x0

    iput v2, v0, Landroid/os/Message;->arg2:I

    .line 306
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 307
    iget-object v2, p0, Lcom/roidapp/photogrid/release/oq;->c:Lcom/roidapp/photogrid/release/oo;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/oo;->q:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_0

    .line 335
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/oq;->c:Lcom/roidapp/photogrid/release/oo;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/oo;->g:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v1, :cond_4

    .line 336
    iget-object v1, p0, Lcom/roidapp/photogrid/release/oq;->c:Lcom/roidapp/photogrid/release/oo;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/oo;->g:Lcom/roidapp/photogrid/release/PhotoView;

    iput-boolean v4, v1, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    :cond_4
    throw v0

    .line 308
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

    .line 309
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 310
    const/16 v2, 0x8

    iput v2, v0, Landroid/os/Message;->what:I

    .line 311
    iget v2, p0, Lcom/roidapp/photogrid/release/oq;->b:I

    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 312
    const/4 v2, 0x0

    iput v2, v0, Landroid/os/Message;->arg2:I

    .line 313
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 314
    iget-object v2, p0, Lcom/roidapp/photogrid/release/oq;->c:Lcom/roidapp/photogrid/release/oo;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/oo;->q:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_0

    .line 317
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/oq;->c:Lcom/roidapp/photogrid/release/oo;

    const/16 v2, 0x94

    iput v2, v0, Lcom/roidapp/photogrid/release/oo;->m:I

    .line 318
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 319
    const/4 v2, 0x7

    iput v2, v0, Landroid/os/Message;->what:I

    .line 320
    iget-object v2, p0, Lcom/roidapp/photogrid/release/oq;->c:Lcom/roidapp/photogrid/release/oo;

    iget v2, v2, Lcom/roidapp/photogrid/release/oo;->m:I

    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 321
    iget-object v2, p0, Lcom/roidapp/photogrid/release/oq;->c:Lcom/roidapp/photogrid/release/oo;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/oo;->d:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/ml;->sendMessage(Landroid/os/Message;)Z
    :try_end_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_0
.end method
