.class final Lcom/roidapp/photogrid/release/pf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ie;

.field final synthetic b:I

.field final synthetic c:Lcom/roidapp/photogrid/release/pd;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/pd;Lcom/roidapp/photogrid/release/ie;I)V
    .locals 0

    .prologue
    .line 259
    iput-object p1, p0, Lcom/roidapp/photogrid/release/pf;->c:Lcom/roidapp/photogrid/release/pd;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/pf;->a:Lcom/roidapp/photogrid/release/ie;

    iput p3, p0, Lcom/roidapp/photogrid/release/pf;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 263
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pf;->c:Lcom/roidapp/photogrid/release/pd;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pd;->b:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hw;->a(Landroid/content/Context;)Z

    move-result v1

    .line 265
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pf;->a:Lcom/roidapp/photogrid/release/ie;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ie;->c(Z)[Ljava/lang/String;

    move-result-object v0

    .line 266
    if-eqz v0, :cond_6

    .line 267
    const/4 v2, 0x0

    aget-object v2, v0, v2

    if-eqz v2, :cond_3

    const/4 v2, 0x0

    aget-object v2, v0, v2

    const-string v3, "0"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 268
    iget-object v2, p0, Lcom/roidapp/photogrid/release/pf;->c:Lcom/roidapp/photogrid/release/pd;

    const/4 v3, 0x1

    aget-object v0, v0, v3

    iput-object v0, v2, Lcom/roidapp/photogrid/release/pd;->n:Ljava/lang/String;

    .line 269
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pf;->c:Lcom/roidapp/photogrid/release/pd;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pd;->n:Ljava/lang/String;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/pf;->c:Lcom/roidapp/photogrid/release/pd;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pd;->n:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 270
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pf;->c:Lcom/roidapp/photogrid/release/pd;

    const/16 v2, 0x5f

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/pd;->b(I)V

    .line 274
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 275
    const/16 v2, 0x8

    iput v2, v0, Landroid/os/Message;->what:I

    .line 276
    iget v2, p0, Lcom/roidapp/photogrid/release/pf;->b:I

    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 277
    const/4 v2, 0x1

    iput v2, v0, Landroid/os/Message;->arg2:I

    .line 278
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 279
    iget-object v2, p0, Lcom/roidapp/photogrid/release/pf;->c:Lcom/roidapp/photogrid/release/pd;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/pd;->q:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 322
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pf;->c:Lcom/roidapp/photogrid/release/pd;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pd;->g:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_1

    .line 323
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pf;->c:Lcom/roidapp/photogrid/release/pd;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pd;->g:Lcom/roidapp/photogrid/release/PhotoView;

    iput-boolean v4, v0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    .line 326
    :cond_1
    :goto_1
    return-void

    .line 281
    :cond_2
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pf;->c:Lcom/roidapp/photogrid/release/pd;

    const/16 v2, 0x93

    iput v2, v0, Lcom/roidapp/photogrid/release/pd;->m:I

    .line 282
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 283
    const/4 v2, 0x7

    iput v2, v0, Landroid/os/Message;->what:I

    .line 284
    iget-object v2, p0, Lcom/roidapp/photogrid/release/pf;->c:Lcom/roidapp/photogrid/release/pd;

    iget v2, v2, Lcom/roidapp/photogrid/release/pd;->m:I

    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 285
    iget-object v2, p0, Lcom/roidapp/photogrid/release/pf;->c:Lcom/roidapp/photogrid/release/pd;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/pd;->d:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/ml;->sendMessage(Landroid/os/Message;)Z
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 312
    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    .line 313
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 314
    invoke-static {}, Ljava/lang/System;->gc()V

    .line 315
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 316
    const/16 v2, 0x8

    iput v2, v0, Landroid/os/Message;->what:I

    .line 317
    iget v2, p0, Lcom/roidapp/photogrid/release/pf;->b:I

    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 318
    const/4 v2, 0x0

    iput v2, v0, Landroid/os/Message;->arg2:I

    .line 319
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 320
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pf;->c:Lcom/roidapp/photogrid/release/pd;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/pd;->q:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 322
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pf;->c:Lcom/roidapp/photogrid/release/pd;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pd;->g:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v0, :cond_1

    .line 323
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pf;->c:Lcom/roidapp/photogrid/release/pd;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/pd;->g:Lcom/roidapp/photogrid/release/PhotoView;

    iput-boolean v4, v0, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    goto :goto_1

    .line 288
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

    .line 289
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 290
    const/16 v2, 0x8

    iput v2, v0, Landroid/os/Message;->what:I

    .line 291
    iget v2, p0, Lcom/roidapp/photogrid/release/pf;->b:I

    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 292
    const/4 v2, 0x0

    iput v2, v0, Landroid/os/Message;->arg2:I

    .line 293
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 294
    iget-object v2, p0, Lcom/roidapp/photogrid/release/pf;->c:Lcom/roidapp/photogrid/release/pd;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/pd;->q:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_3
    .catch Ljava/lang/OutOfMemoryError; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_0

    .line 322
    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/pf;->c:Lcom/roidapp/photogrid/release/pd;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/pd;->g:Lcom/roidapp/photogrid/release/PhotoView;

    if-eqz v1, :cond_4

    .line 323
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pf;->c:Lcom/roidapp/photogrid/release/pd;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/pd;->g:Lcom/roidapp/photogrid/release/PhotoView;

    iput-boolean v4, v1, Lcom/roidapp/photogrid/release/PhotoView;->a:Z

    :cond_4
    throw v0

    .line 295
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

    .line 296
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 297
    const/16 v2, 0x8

    iput v2, v0, Landroid/os/Message;->what:I

    .line 298
    iget v2, p0, Lcom/roidapp/photogrid/release/pf;->b:I

    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 299
    const/4 v2, 0x0

    iput v2, v0, Landroid/os/Message;->arg2:I

    .line 300
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 301
    iget-object v2, p0, Lcom/roidapp/photogrid/release/pf;->c:Lcom/roidapp/photogrid/release/pd;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/pd;->q:Landroid/os/Handler;

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto/16 :goto_0

    .line 304
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pf;->c:Lcom/roidapp/photogrid/release/pd;

    const/16 v2, 0x94

    iput v2, v0, Lcom/roidapp/photogrid/release/pd;->m:I

    .line 305
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 306
    const/4 v2, 0x7

    iput v2, v0, Landroid/os/Message;->what:I

    .line 307
    iget-object v2, p0, Lcom/roidapp/photogrid/release/pf;->c:Lcom/roidapp/photogrid/release/pd;

    iget v2, v2, Lcom/roidapp/photogrid/release/pd;->m:I

    iput v2, v0, Landroid/os/Message;->arg1:I

    .line 308
    iget-object v2, p0, Lcom/roidapp/photogrid/release/pf;->c:Lcom/roidapp/photogrid/release/pd;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/pd;->d:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/release/ml;->sendMessage(Landroid/os/Message;)Z
    :try_end_4
    .catch Ljava/lang/OutOfMemoryError; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_0
.end method
