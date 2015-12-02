.class Lcom/qihoo360/mobilesafe/core/a$a;
.super Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;
.source "360Security"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo360/mobilesafe/core/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Void;",
        ">;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/qihoo360/mobilesafe/service/KillBean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic c:Lcom/qihoo360/mobilesafe/core/a;

.field private d:I

.field private e:I

.field private f:I

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/KillBean;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lcom/qihoo360/mobilesafe/core/a/a;

.field private i:Z


# direct methods
.method public constructor <init>(Lcom/qihoo360/mobilesafe/core/a;ZLjava/util/List;Lcom/qihoo360/mobilesafe/core/a/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/KillBean;",
            ">;",
            "Lcom/qihoo360/mobilesafe/core/a/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 255
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/core/a$a;->c:Lcom/qihoo360/mobilesafe/core/a;

    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;-><init>()V

    .line 256
    iput-object p3, p0, Lcom/qihoo360/mobilesafe/core/a$a;->g:Ljava/util/List;

    .line 257
    iput-object p4, p0, Lcom/qihoo360/mobilesafe/core/a$a;->h:Lcom/qihoo360/mobilesafe/core/a/a;

    .line 258
    iput-boolean p2, p0, Lcom/qihoo360/mobilesafe/core/a$a;->i:Z

    .line 259
    return-void
.end method

.method static synthetic a(Lcom/qihoo360/mobilesafe/core/a$a;I)V
    .locals 0

    .prologue
    .line 238
    iput p1, p0, Lcom/qihoo360/mobilesafe/core/a$a;->d:I

    return-void
.end method

.method private a(Lcom/qihoo360/mobilesafe/service/KillBean;)V
    .locals 5

    .prologue
    .line 272
    const v0, 0x7fffffff

    iput v0, p1, Lcom/qihoo360/mobilesafe/service/KillBean;->oom_adj:I

    .line 273
    iget-object v1, p1, Lcom/qihoo360/mobilesafe/service/KillBean;->pids:[I

    .line 274
    if-eqz v1, :cond_0

    .line 275
    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-lt v0, v2, :cond_1

    .line 288
    :cond_0
    return-void

    .line 275
    :cond_1
    aget v3, v1, v0

    .line 276
    invoke-static {v3}, Lcom/qihoo360/mobilesafe/core/d/d;->a(I)I

    move-result v3

    .line 277
    const/4 v4, -0x1

    if-ne v3, v4, :cond_3

    .line 275
    :cond_2
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 283
    :cond_3
    iget v4, p1, Lcom/qihoo360/mobilesafe/service/KillBean;->oom_adj:I

    if-ge v3, v4, :cond_2

    .line 284
    iput v3, p1, Lcom/qihoo360/mobilesafe/service/KillBean;->oom_adj:I

    goto :goto_1
.end method


# virtual methods
.method public a(Lcom/qihoo360/mobilesafe/service/KillBean;Lcom/qihoo360/mobilesafe/service/KillBean;)I
    .locals 2

    .prologue
    .line 242
    iget v0, p1, Lcom/qihoo360/mobilesafe/service/KillBean;->oom_adj:I

    iget v1, p2, Lcom/qihoo360/mobilesafe/service/KillBean;->oom_adj:I

    if-eq v0, v1, :cond_0

    .line 243
    iget v0, p2, Lcom/qihoo360/mobilesafe/service/KillBean;->oom_adj:I

    iget v1, p1, Lcom/qihoo360/mobilesafe/service/KillBean;->oom_adj:I

    sub-int/2addr v0, v1

    .line 245
    :goto_0
    return v0

    :cond_0
    iget v0, p2, Lcom/qihoo360/mobilesafe/service/KillBean;->memory:I

    iget v1, p1, Lcom/qihoo360/mobilesafe/service/KillBean;->memory:I

    sub-int/2addr v0, v1

    goto :goto_0
.end method

.method protected bridge varargs synthetic a([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/qihoo360/mobilesafe/core/a$a;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 10

    .prologue
    const/16 v9, 0x12c

    const/4 v8, 0x1

    const/4 v2, 0x0

    .line 292
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/a$a;->c:Lcom/qihoo360/mobilesafe/core/a;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/core/a;->b()V

    .line 293
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/a$a;->g:Ljava/util/List;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/a$a;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 295
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/a$a;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lcom/qihoo360/mobilesafe/core/a$a;->e:I

    .line 296
    const/4 v0, 0x5

    .line 297
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/a$a;->g:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v1, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    .line 310
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/a$a;->g:Ljava/util/List;

    invoke-static {v0, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 318
    :goto_1
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/core/a$a;->i:Z

    if-eqz v0, :cond_0

    .line 319
    new-array v0, v8, [Ljava/lang/Integer;

    const/16 v3, -0x3e8

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v2

    invoke-virtual {p0, v0}, Lcom/qihoo360/mobilesafe/core/a$a;->c([Ljava/lang/Object;)V

    .line 322
    :cond_0
    iget v0, p0, Lcom/qihoo360/mobilesafe/core/a$a;->f:I

    .line 324
    iget-object v3, p0, Lcom/qihoo360/mobilesafe/core/a$a;->c:Lcom/qihoo360/mobilesafe/core/a;

    invoke-static {v3}, Lcom/qihoo360/mobilesafe/core/a;->a(Lcom/qihoo360/mobilesafe/core/a;)Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/qihoo360/mobilesafe/support/a;->c(Landroid/content/Context;)Z

    move-result v5

    move v3, v0

    move v0, v2

    .line 325
    :goto_2
    iget v4, p0, Lcom/qihoo360/mobilesafe/core/a$a;->e:I

    if-lt v0, v4, :cond_4

    .line 422
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 297
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/service/KillBean;

    .line 298
    invoke-direct {p0, v0}, Lcom/qihoo360/mobilesafe/core/a$a;->a(Lcom/qihoo360/mobilesafe/service/KillBean;)V

    .line 299
    iget v4, v0, Lcom/qihoo360/mobilesafe/service/KillBean;->importance:I

    if-ne v4, v9, :cond_3

    .line 300
    iget v4, v0, Lcom/qihoo360/mobilesafe/service/KillBean;->oom_adj:I

    if-ge v4, v1, :cond_3

    .line 301
    iget v1, v0, Lcom/qihoo360/mobilesafe/service/KillBean;->oom_adj:I

    .line 304
    :cond_3
    iget v4, p0, Lcom/qihoo360/mobilesafe/core/a$a;->f:I

    iget v0, v0, Lcom/qihoo360/mobilesafe/service/KillBean;->memory:I

    add-int/2addr v0, v4

    iput v0, p0, Lcom/qihoo360/mobilesafe/core/a$a;->f:I

    goto :goto_0

    .line 311
    :catch_0
    move-exception v0

    .line 312
    invoke-static {}, Lcom/qihoo360/mobilesafe/core/a;->a()Ljava/lang/String;

    move-result-object v3

    const-string/jumbo v4, "Collections.sort "

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 326
    :cond_4
    iget-object v4, p0, Lcom/qihoo360/mobilesafe/core/a$a;->c:Lcom/qihoo360/mobilesafe/core/a;

    invoke-static {v4}, Lcom/qihoo360/mobilesafe/core/a;->b(Lcom/qihoo360/mobilesafe/core/a;)Lcom/qihoo/security/ui/b/e;

    move-result-object v4

    const/4 v6, -0x1

    invoke-virtual {v4, v6}, Lcom/qihoo/security/ui/b/e;->b(I)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 331
    const-wide/16 v6, 0x3e8

    :try_start_1
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    .line 333
    :catch_1
    move-exception v4

    .line 337
    :cond_5
    int-to-float v4, v3

    iget-object v6, p0, Lcom/qihoo360/mobilesafe/core/a$a;->c:Lcom/qihoo360/mobilesafe/core/a;

    invoke-static {v6}, Lcom/qihoo360/mobilesafe/core/a;->c(Lcom/qihoo360/mobilesafe/core/a;)I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v4, v6

    const v6, 0x3cf5c28f    # 0.03f

    cmpg-float v4, v4, v6

    if-lez v4, :cond_1

    .line 349
    iget v4, p0, Lcom/qihoo360/mobilesafe/core/a$a;->d:I

    iget-object v6, p0, Lcom/qihoo360/mobilesafe/core/a$a;->c:Lcom/qihoo360/mobilesafe/core/a;

    invoke-static {v6}, Lcom/qihoo360/mobilesafe/core/a;->d(Lcom/qihoo360/mobilesafe/core/a;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v6

    if-lt v4, v6, :cond_1

    .line 355
    const/16 v4, 0x1e

    if-ge v2, v4, :cond_1

    .line 361
    iget-object v6, p0, Lcom/qihoo360/mobilesafe/core/a$a;->g:Ljava/util/List;

    add-int/lit8 v4, v0, 0x1

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo360/mobilesafe/service/KillBean;

    .line 362
    iget-boolean v6, v0, Lcom/qihoo360/mobilesafe/service/KillBean;->skip:Z

    if-nez v6, :cond_9

    iget v6, v0, Lcom/qihoo360/mobilesafe/service/KillBean;->oom_adj:I

    if-gt v6, v1, :cond_6

    if-nez v5, :cond_6

    move v0, v4

    .line 367
    goto :goto_2

    .line 369
    :cond_6
    iget-object v6, v0, Lcom/qihoo360/mobilesafe/service/KillBean;->packageName:Ljava/lang/String;

    .line 370
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_9

    .line 375
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 376
    iget v7, v0, Lcom/qihoo360/mobilesafe/service/KillBean;->memory:I

    sub-int/2addr v3, v7

    .line 377
    iget v0, v0, Lcom/qihoo360/mobilesafe/service/KillBean;->importance:I

    if-gt v0, v9, :cond_8

    .line 378
    add-int/lit8 v0, v2, 0x1

    .line 380
    :goto_3
    iget-object v2, p0, Lcom/qihoo360/mobilesafe/core/a$a;->c:Lcom/qihoo360/mobilesafe/core/a;

    invoke-virtual {v2, v6}, Lcom/qihoo360/mobilesafe/core/a;->a(Ljava/lang/String;)V

    .line 384
    iget v2, p0, Lcom/qihoo360/mobilesafe/core/a$a;->e:I

    if-le v2, v8, :cond_7

    .line 391
    const-wide/16 v6, 0xc8

    :try_start_2
    invoke-static {v6, v7}, Ljava/lang/Thread;->sleep(J)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move v2, v0

    move v0, v4

    .line 392
    goto/16 :goto_2

    :catch_2
    move-exception v2

    move v2, v0

    move v0, v4

    goto/16 :goto_2

    :cond_7
    move v2, v0

    move v0, v4

    goto/16 :goto_2

    :cond_8
    move v0, v2

    goto :goto_3

    :cond_9
    move v0, v4

    goto/16 :goto_2
.end method

.method protected a()V
    .locals 2

    .prologue
    .line 263
    invoke-super {p0}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->a()V

    .line 264
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/a$a;->c:Lcom/qihoo360/mobilesafe/core/a;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/core/a;->d()V

    .line 265
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/a$a;->h:Lcom/qihoo360/mobilesafe/core/a/a;

    if-eqz v0, :cond_0

    .line 266
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/a$a;->h:Lcom/qihoo360/mobilesafe/core/a/a;

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/a$a;->g:Ljava/util/List;

    invoke-interface {v0, v1}, Lcom/qihoo360/mobilesafe/core/a/a;->b(Ljava/util/List;)V

    .line 269
    :cond_0
    return-void
.end method

.method protected bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/qihoo360/mobilesafe/core/a$a;->a(Ljava/lang/Void;)V

    return-void
.end method

.method protected a(Ljava/lang/Void;)V
    .locals 3

    .prologue
    .line 446
    invoke-super {p0, p1}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->a(Ljava/lang/Object;)V

    .line 447
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/a$a;->c:Lcom/qihoo360/mobilesafe/core/a;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/core/a;->c()V

    .line 449
    iget-boolean v0, p0, Lcom/qihoo360/mobilesafe/core/a$a;->i:Z

    if-nez v0, :cond_0

    .line 450
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/a$a;->h:Lcom/qihoo360/mobilesafe/core/a/a;

    if-eqz v0, :cond_0

    .line 451
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/a$a;->h:Lcom/qihoo360/mobilesafe/core/a/a;

    iget v1, p0, Lcom/qihoo360/mobilesafe/core/a$a;->e:I

    iget v2, p0, Lcom/qihoo360/mobilesafe/core/a$a;->f:I

    invoke-interface {v0, v1, v2}, Lcom/qihoo360/mobilesafe/core/a/a;->a(II)V

    .line 454
    :cond_0
    return-void
.end method

.method protected varargs a([Ljava/lang/Integer;)V
    .locals 3

    .prologue
    .line 427
    invoke-super {p0, p1}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->b([Ljava/lang/Object;)V

    .line 429
    if-eqz p1, :cond_0

    array-length v0, p1

    if-lez v0, :cond_0

    .line 430
    const/4 v0, 0x0

    aget-object v0, p1, v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 431
    const/16 v1, -0x3e8

    if-ne v0, v1, :cond_1

    .line 433
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/a$a;->h:Lcom/qihoo360/mobilesafe/core/a/a;

    if-eqz v0, :cond_0

    .line 434
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/a$a;->h:Lcom/qihoo360/mobilesafe/core/a/a;

    iget v1, p0, Lcom/qihoo360/mobilesafe/core/a$a;->e:I

    iget v2, p0, Lcom/qihoo360/mobilesafe/core/a$a;->f:I

    invoke-interface {v0, v1, v2}, Lcom/qihoo360/mobilesafe/core/a/a;->a(II)V

    .line 442
    :cond_0
    :goto_0
    return-void

    .line 437
    :cond_1
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/a$a;->h:Lcom/qihoo360/mobilesafe/core/a/a;

    if-eqz v0, :cond_0

    .line 438
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/a$a;->h:Lcom/qihoo360/mobilesafe/core/a/a;

    invoke-interface {v0}, Lcom/qihoo360/mobilesafe/core/a/a;->c()V

    goto :goto_0
.end method

.method protected varargs synthetic b([Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lcom/qihoo360/mobilesafe/core/a$a;->a([Ljava/lang/Integer;)V

    return-void
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 1
    check-cast p1, Lcom/qihoo360/mobilesafe/service/KillBean;

    check-cast p2, Lcom/qihoo360/mobilesafe/service/KillBean;

    invoke-virtual {p0, p1, p2}, Lcom/qihoo360/mobilesafe/core/a$a;->a(Lcom/qihoo360/mobilesafe/service/KillBean;Lcom/qihoo360/mobilesafe/service/KillBean;)I

    move-result v0

    return v0
.end method
