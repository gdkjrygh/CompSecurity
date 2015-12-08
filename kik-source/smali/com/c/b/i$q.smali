.class public final Lcom/c/b/i$q;
.super Lcom/c/b/as$d;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$r;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "q"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/i$q$a;,
        Lcom/c/b/i$q$b;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final x:Lcom/c/b/i$q;


# instance fields
.field private f:I

.field private volatile g:Ljava/lang/Object;

.field private volatile h:Ljava/lang/Object;

.field private i:Z

.field private j:Z

.field private k:Z

.field private l:I

.field private volatile m:Ljava/lang/Object;

.field private n:Z

.field private o:Z

.field private p:Z

.field private q:Z

.field private r:Z

.field private volatile s:Ljava/lang/Object;

.field private volatile t:Ljava/lang/Object;

.field private u:Ljava/util/List;

.field private v:B

.field private w:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 19062
    new-instance v0, Lcom/c/b/i$q;

    invoke-direct {v0}, Lcom/c/b/i$q;-><init>()V

    sput-object v0, Lcom/c/b/i$q;->x:Lcom/c/b/i$q;

    .line 19069
    new-instance v0, Lcom/c/b/y;

    invoke-direct {v0}, Lcom/c/b/y;-><init>()V

    sput-object v0, Lcom/c/b/i$q;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .prologue
    const/4 v0, -0x1

    const/4 v1, 0x0

    .line 16260
    invoke-direct {p0}, Lcom/c/b/as$d;-><init>()V

    .line 17151
    iput-byte v0, p0, Lcom/c/b/i$q;->v:B

    .line 17225
    iput v0, p0, Lcom/c/b/i$q;->w:I

    .line 16261
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$q;->g:Ljava/lang/Object;

    .line 16262
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$q;->h:Ljava/lang/Object;

    .line 16263
    iput-boolean v1, p0, Lcom/c/b/i$q;->i:Z

    .line 16264
    iput-boolean v1, p0, Lcom/c/b/i$q;->j:Z

    .line 16265
    iput-boolean v1, p0, Lcom/c/b/i$q;->k:Z

    .line 16266
    const/4 v0, 0x1

    iput v0, p0, Lcom/c/b/i$q;->l:I

    .line 16267
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$q;->m:Ljava/lang/Object;

    .line 16268
    iput-boolean v1, p0, Lcom/c/b/i$q;->n:Z

    .line 16269
    iput-boolean v1, p0, Lcom/c/b/i$q;->o:Z

    .line 16270
    iput-boolean v1, p0, Lcom/c/b/i$q;->p:Z

    .line 16271
    iput-boolean v1, p0, Lcom/c/b/i$q;->q:Z

    .line 16272
    iput-boolean v1, p0, Lcom/c/b/i$q;->r:Z

    .line 16273
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$q;->s:Ljava/lang/Object;

    .line 16274
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$q;->t:Ljava/lang/Object;

    .line 16275
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$q;->u:Ljava/util/List;

    .line 16276
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$c;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 16258
    invoke-direct {p0, p1}, Lcom/c/b/as$d;-><init>(Lcom/c/b/as$c;)V

    .line 17151
    iput-byte v0, p0, Lcom/c/b/i$q;->v:B

    .line 17225
    iput v0, p0, Lcom/c/b/i$q;->w:I

    .line 16259
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$c;B)V
    .locals 0

    .prologue
    .line 16251
    invoke-direct {p0, p1}, Lcom/c/b/i$q;-><init>(Lcom/c/b/as$c;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;)V
    .locals 8

    .prologue
    const/4 v2, 0x1

    const/4 v0, 0x0

    const/16 v6, 0x4000

    .line 16286
    invoke-direct {p0}, Lcom/c/b/i$q;-><init>()V

    .line 16288
    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v3

    move v1, v0

    .line 16292
    :cond_0
    :goto_0
    if-nez v1, :cond_4

    .line 16293
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v4

    .line 16294
    sparse-switch v4, :sswitch_data_0

    .line 16299
    invoke-virtual {p0, p1, v3, p2, v4}, Lcom/c/b/i$q;->a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;I)Z

    move-result v4

    if-nez v4, :cond_0

    move v1, v2

    .line 16301
    goto :goto_0

    :sswitch_0
    move v1, v2

    .line 16297
    goto :goto_0

    .line 16306
    :sswitch_1
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v4

    .line 16307
    iget v5, p0, Lcom/c/b/i$q;->f:I

    or-int/lit8 v5, v5, 0x1

    iput v5, p0, Lcom/c/b/i$q;->f:I

    .line 16308
    iput-object v4, p0, Lcom/c/b/i$q;->g:Ljava/lang/Object;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_0

    .line 16396
    :catch_0
    move-exception v1

    move-object v7, v1

    move v1, v0

    move-object v0, v7

    .line 16397
    :try_start_1
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 16403
    :catchall_0
    move-exception v0

    :goto_1
    and-int/lit16 v1, v1, 0x4000

    if-ne v1, v6, :cond_1

    .line 16404
    iget-object v1, p0, Lcom/c/b/i$q;->u:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$q;->u:Ljava/util/List;

    .line 16406
    :cond_1
    invoke-virtual {v3}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$q;->e:Lcom/c/b/by;

    .line 16407
    invoke-virtual {p0}, Lcom/c/b/i$q;->L()V

    .line 16403
    throw v0

    .line 16312
    :sswitch_2
    :try_start_2
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v4

    .line 16313
    iget v5, p0, Lcom/c/b/i$q;->f:I

    or-int/lit8 v5, v5, 0x2

    iput v5, p0, Lcom/c/b/i$q;->f:I

    .line 16314
    iput-object v4, p0, Lcom/c/b/i$q;->h:Ljava/lang/Object;
    :try_end_2
    .catch Lcom/c/b/av; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    .line 16398
    :catch_1
    move-exception v1

    move-object v7, v1

    move v1, v0

    move-object v0, v7

    .line 16399
    :try_start_3
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v4, Lcom/c/b/av;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Lcom/c/b/av;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 16318
    :sswitch_3
    :try_start_4
    invoke-virtual {p1}, Lcom/c/b/g;->n()I

    move-result v4

    .line 16319
    invoke-static {v4}, Lcom/c/b/i$q$b;->a(I)Lcom/c/b/i$q$b;

    move-result-object v5

    .line 16320
    if-nez v5, :cond_2

    .line 16321
    const/16 v5, 0x9

    invoke-virtual {v3, v5, v4}, Lcom/c/b/by$a;->a(II)Lcom/c/b/by$a;

    goto :goto_0

    .line 16403
    :catchall_1
    move-exception v1

    move-object v7, v1

    move v1, v0

    move-object v0, v7

    goto :goto_1

    .line 16323
    :cond_2
    iget v5, p0, Lcom/c/b/i$q;->f:I

    or-int/lit8 v5, v5, 0x20

    iput v5, p0, Lcom/c/b/i$q;->f:I

    .line 16324
    iput v4, p0, Lcom/c/b/i$q;->l:I

    goto/16 :goto_0

    .line 16329
    :sswitch_4
    iget v4, p0, Lcom/c/b/i$q;->f:I

    or-int/lit8 v4, v4, 0x4

    iput v4, p0, Lcom/c/b/i$q;->f:I

    .line 16330
    invoke-virtual {p1}, Lcom/c/b/g;->i()Z

    move-result v4

    iput-boolean v4, p0, Lcom/c/b/i$q;->i:Z

    goto/16 :goto_0

    .line 16334
    :sswitch_5
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v4

    .line 16335
    iget v5, p0, Lcom/c/b/i$q;->f:I

    or-int/lit8 v5, v5, 0x40

    iput v5, p0, Lcom/c/b/i$q;->f:I

    .line 16336
    iput-object v4, p0, Lcom/c/b/i$q;->m:Ljava/lang/Object;

    goto/16 :goto_0

    .line 16340
    :sswitch_6
    iget v4, p0, Lcom/c/b/i$q;->f:I

    or-int/lit16 v4, v4, 0x80

    iput v4, p0, Lcom/c/b/i$q;->f:I

    .line 16341
    invoke-virtual {p1}, Lcom/c/b/g;->i()Z

    move-result v4

    iput-boolean v4, p0, Lcom/c/b/i$q;->n:Z

    goto/16 :goto_0

    .line 16345
    :sswitch_7
    iget v4, p0, Lcom/c/b/i$q;->f:I

    or-int/lit16 v4, v4, 0x100

    iput v4, p0, Lcom/c/b/i$q;->f:I

    .line 16346
    invoke-virtual {p1}, Lcom/c/b/g;->i()Z

    move-result v4

    iput-boolean v4, p0, Lcom/c/b/i$q;->o:Z

    goto/16 :goto_0

    .line 16350
    :sswitch_8
    iget v4, p0, Lcom/c/b/i$q;->f:I

    or-int/lit16 v4, v4, 0x200

    iput v4, p0, Lcom/c/b/i$q;->f:I

    .line 16351
    invoke-virtual {p1}, Lcom/c/b/g;->i()Z

    move-result v4

    iput-boolean v4, p0, Lcom/c/b/i$q;->p:Z

    goto/16 :goto_0

    .line 16355
    :sswitch_9
    iget v4, p0, Lcom/c/b/i$q;->f:I

    or-int/lit8 v4, v4, 0x8

    iput v4, p0, Lcom/c/b/i$q;->f:I

    .line 16356
    invoke-virtual {p1}, Lcom/c/b/g;->i()Z

    move-result v4

    iput-boolean v4, p0, Lcom/c/b/i$q;->j:Z

    goto/16 :goto_0

    .line 16360
    :sswitch_a
    iget v4, p0, Lcom/c/b/i$q;->f:I

    or-int/lit16 v4, v4, 0x400

    iput v4, p0, Lcom/c/b/i$q;->f:I

    .line 16361
    invoke-virtual {p1}, Lcom/c/b/g;->i()Z

    move-result v4

    iput-boolean v4, p0, Lcom/c/b/i$q;->q:Z

    goto/16 :goto_0

    .line 16365
    :sswitch_b
    iget v4, p0, Lcom/c/b/i$q;->f:I

    or-int/lit8 v4, v4, 0x10

    iput v4, p0, Lcom/c/b/i$q;->f:I

    .line 16366
    invoke-virtual {p1}, Lcom/c/b/g;->i()Z

    move-result v4

    iput-boolean v4, p0, Lcom/c/b/i$q;->k:Z

    goto/16 :goto_0

    .line 16370
    :sswitch_c
    iget v4, p0, Lcom/c/b/i$q;->f:I

    or-int/lit16 v4, v4, 0x800

    iput v4, p0, Lcom/c/b/i$q;->f:I

    .line 16371
    invoke-virtual {p1}, Lcom/c/b/g;->i()Z

    move-result v4

    iput-boolean v4, p0, Lcom/c/b/i$q;->r:Z

    goto/16 :goto_0

    .line 16375
    :sswitch_d
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v4

    .line 16376
    iget v5, p0, Lcom/c/b/i$q;->f:I

    or-int/lit16 v5, v5, 0x1000

    iput v5, p0, Lcom/c/b/i$q;->f:I

    .line 16377
    iput-object v4, p0, Lcom/c/b/i$q;->s:Ljava/lang/Object;

    goto/16 :goto_0

    .line 16381
    :sswitch_e
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v4

    .line 16382
    iget v5, p0, Lcom/c/b/i$q;->f:I

    or-int/lit16 v5, v5, 0x2000

    iput v5, p0, Lcom/c/b/i$q;->f:I

    .line 16383
    iput-object v4, p0, Lcom/c/b/i$q;->t:Ljava/lang/Object;

    goto/16 :goto_0

    .line 16387
    :sswitch_f
    and-int/lit16 v4, v0, 0x4000

    if-eq v4, v6, :cond_3

    .line 16388
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, Lcom/c/b/i$q;->u:Ljava/util/List;

    .line 16389
    or-int/lit16 v0, v0, 0x4000

    .line 16391
    :cond_3
    iget-object v4, p0, Lcom/c/b/i$q;->u:Ljava/util/List;

    sget-object v5, Lcom/c/b/i$ag;->c:Lcom/c/b/bk;

    invoke-virtual {p1, v5, p2}, Lcom/c/b/g;->a(Lcom/c/b/bk;Lcom/c/b/aq;)Lcom/c/b/be;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Lcom/c/b/av; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto/16 :goto_0

    .line 16403
    :cond_4
    and-int/lit16 v0, v0, 0x4000

    if-ne v0, v6, :cond_5

    .line 16404
    iget-object v0, p0, Lcom/c/b/i$q;->u:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$q;->u:Ljava/util/List;

    .line 16406
    :cond_5
    invoke-virtual {v3}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$q;->e:Lcom/c/b/by;

    .line 16407
    invoke-virtual {p0}, Lcom/c/b/i$q;->L()V

    .line 16408
    return-void

    .line 16294
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0xa -> :sswitch_1
        0x42 -> :sswitch_2
        0x48 -> :sswitch_3
        0x50 -> :sswitch_4
        0x5a -> :sswitch_5
        0x80 -> :sswitch_6
        0x88 -> :sswitch_7
        0x90 -> :sswitch_8
        0xa0 -> :sswitch_9
        0xb8 -> :sswitch_a
        0xd8 -> :sswitch_b
        0xf8 -> :sswitch_c
        0x122 -> :sswitch_d
        0x12a -> :sswitch_e
        0x1f3a -> :sswitch_f
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;B)V
    .locals 0

    .prologue
    .line 16251
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$q;-><init>(Lcom/c/b/g;Lcom/c/b/aq;)V

    return-void
.end method

.method public static J()Lcom/c/b/i$q;
    .locals 1

    .prologue
    .line 19066
    sget-object v0, Lcom/c/b/i$q;->x:Lcom/c/b/i$q;

    return-object v0
.end method

.method private P()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 16595
    iget-object v0, p0, Lcom/c/b/i$q;->g:Ljava/lang/Object;

    .line 16596
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 16597
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 16600
    iput-object v0, p0, Lcom/c/b/i$q;->g:Ljava/lang/Object;

    .line 16603
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private Q()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 16661
    iget-object v0, p0, Lcom/c/b/i$q;->h:Ljava/lang/Object;

    .line 16662
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 16663
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 16666
    iput-object v0, p0, Lcom/c/b/i$q;->h:Ljava/lang/Object;

    .line 16669
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private R()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 16850
    iget-object v0, p0, Lcom/c/b/i$q;->m:Ljava/lang/Object;

    .line 16851
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 16852
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 16855
    iput-object v0, p0, Lcom/c/b/i$q;->m:Ljava/lang/Object;

    .line 16858
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private S()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 17030
    iget-object v0, p0, Lcom/c/b/i$q;->s:Ljava/lang/Object;

    .line 17031
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 17032
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 17035
    iput-object v0, p0, Lcom/c/b/i$q;->s:Ljava/lang/Object;

    .line 17038
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private T()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 17084
    iget-object v0, p0, Lcom/c/b/i$q;->t:Ljava/lang/Object;

    .line 17085
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 17086
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 17089
    iput-object v0, p0, Lcom/c/b/i$q;->t:Ljava/lang/Object;

    .line 17092
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method static synthetic a(Lcom/c/b/i$q;I)I
    .locals 0

    .prologue
    .line 16251
    iput p1, p0, Lcom/c/b/i$q;->l:I

    return p1
.end method

.method public static a(Lcom/c/b/i$q;)Lcom/c/b/i$q$a;
    .locals 1

    .prologue
    .line 17356
    sget-object v0, Lcom/c/b/i$q;->x:Lcom/c/b/i$q;

    invoke-virtual {v0}, Lcom/c/b/i$q;->I()Lcom/c/b/i$q$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/c/b/i$q$a;->a(Lcom/c/b/i$q;)Lcom/c/b/i$q$a;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/c/b/i$q;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 16251
    iput-object p1, p0, Lcom/c/b/i$q;->g:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic a(Lcom/c/b/i$q;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 16251
    iput-object p1, p0, Lcom/c/b/i$q;->u:Ljava/util/List;

    return-object p1
.end method

.method static synthetic a(Lcom/c/b/i$q;Z)Z
    .locals 0

    .prologue
    .line 16251
    iput-boolean p1, p0, Lcom/c/b/i$q;->i:Z

    return p1
.end method

.method static synthetic b(Lcom/c/b/i$q;I)I
    .locals 0

    .prologue
    .line 16251
    iput p1, p0, Lcom/c/b/i$q;->f:I

    return p1
.end method

.method static synthetic b(Lcom/c/b/i$q;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 16251
    iget-object v0, p0, Lcom/c/b/i$q;->g:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic b(Lcom/c/b/i$q;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 16251
    iput-object p1, p0, Lcom/c/b/i$q;->h:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic b(Lcom/c/b/i$q;Z)Z
    .locals 0

    .prologue
    .line 16251
    iput-boolean p1, p0, Lcom/c/b/i$q;->j:Z

    return p1
.end method

.method static synthetic c(Lcom/c/b/i$q;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 16251
    iget-object v0, p0, Lcom/c/b/i$q;->h:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic c(Lcom/c/b/i$q;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 16251
    iput-object p1, p0, Lcom/c/b/i$q;->m:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic c(Lcom/c/b/i$q;Z)Z
    .locals 0

    .prologue
    .line 16251
    iput-boolean p1, p0, Lcom/c/b/i$q;->k:Z

    return p1
.end method

.method static synthetic d(Lcom/c/b/i$q;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 16251
    iget-object v0, p0, Lcom/c/b/i$q;->m:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic d(Lcom/c/b/i$q;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 16251
    iput-object p1, p0, Lcom/c/b/i$q;->s:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic d(Lcom/c/b/i$q;Z)Z
    .locals 0

    .prologue
    .line 16251
    iput-boolean p1, p0, Lcom/c/b/i$q;->n:Z

    return p1
.end method

.method static synthetic e(Lcom/c/b/i$q;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 16251
    iget-object v0, p0, Lcom/c/b/i$q;->s:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic e(Lcom/c/b/i$q;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 16251
    iput-object p1, p0, Lcom/c/b/i$q;->t:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic e(Lcom/c/b/i$q;Z)Z
    .locals 0

    .prologue
    .line 16251
    iput-boolean p1, p0, Lcom/c/b/i$q;->o:Z

    return p1
.end method

.method static synthetic f(Lcom/c/b/i$q;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 16251
    iget-object v0, p0, Lcom/c/b/i$q;->t:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic f(Lcom/c/b/i$q;Z)Z
    .locals 0

    .prologue
    .line 16251
    iput-boolean p1, p0, Lcom/c/b/i$q;->p:Z

    return p1
.end method

.method static synthetic g(Lcom/c/b/i$q;)Ljava/util/List;
    .locals 1

    .prologue
    .line 16251
    iget-object v0, p0, Lcom/c/b/i$q;->u:Ljava/util/List;

    return-object v0
.end method

.method static synthetic g(Lcom/c/b/i$q;Z)Z
    .locals 0

    .prologue
    .line 16251
    iput-boolean p1, p0, Lcom/c/b/i$q;->q:Z

    return p1
.end method

.method static synthetic h(Lcom/c/b/i$q;Z)Z
    .locals 0

    .prologue
    .line 16251
    iput-boolean p1, p0, Lcom/c/b/i$q;->r:Z

    return p1
.end method


# virtual methods
.method public final A()Z
    .locals 2

    .prologue
    .line 16922
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit16 v0, v0, 0x200

    const/16 v1, 0x200

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final B()Z
    .locals 1

    .prologue
    .line 16928
    iget-boolean v0, p0, Lcom/c/b/i$q;->p:Z

    return v0
.end method

.method public final C()Z
    .locals 2

    .prologue
    .line 16944
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit16 v0, v0, 0x400

    const/16 v1, 0x400

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final D()Z
    .locals 1

    .prologue
    .line 16957
    iget-boolean v0, p0, Lcom/c/b/i$q;->q:Z

    return v0
.end method

.method public final E()Z
    .locals 2

    .prologue
    .line 16971
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit16 v0, v0, 0x800

    const/16 v1, 0x800

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final F()Z
    .locals 1

    .prologue
    .line 16982
    iget-boolean v0, p0, Lcom/c/b/i$q;->r:Z

    return v0
.end method

.method public final G()Z
    .locals 2

    .prologue
    .line 16996
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit16 v0, v0, 0x1000

    const/16 v1, 0x1000

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final H()Z
    .locals 2

    .prologue
    .line 17052
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit16 v0, v0, 0x2000

    const/16 v1, 0x2000

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final I()Lcom/c/b/i$q$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 17359
    sget-object v0, Lcom/c/b/i$q;->x:Lcom/c/b/i$q;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/c/b/i$q$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$q$a;-><init>(B)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/c/b/i$q$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$q$a;-><init>(B)V

    invoke-virtual {v0, p0}, Lcom/c/b/i$q$a;->a(Lcom/c/b/i$q;)Lcom/c/b/i$q$a;

    move-result-object v0

    goto :goto_0
.end method

.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 16251
    new-instance v0, Lcom/c/b/i$q$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/c/b/i$q$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 5

    .prologue
    const/16 v4, 0x10

    const/16 v3, 0x8

    const/4 v1, 0x1

    .line 17175
    invoke-virtual {p0}, Lcom/c/b/i$q;->N()Lcom/c/b/as$d$a;

    move-result-object v2

    .line 17176
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v1, :cond_0

    .line 17177
    invoke-direct {p0}, Lcom/c/b/i$q;->P()Lcom/c/b/f;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 17179
    :cond_0
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 17180
    invoke-direct {p0}, Lcom/c/b/i$q;->Q()Lcom/c/b/f;

    move-result-object v0

    invoke-virtual {p1, v3, v0}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 17182
    :cond_1
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_2

    .line 17183
    const/16 v0, 0x9

    iget v1, p0, Lcom/c/b/i$q;->l:I

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->c(II)V

    .line 17185
    :cond_2
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_3

    .line 17186
    const/16 v0, 0xa

    iget-boolean v1, p0, Lcom/c/b/i$q;->i:Z

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(IZ)V

    .line 17188
    :cond_3
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_4

    .line 17189
    const/16 v0, 0xb

    invoke-direct {p0}, Lcom/c/b/i$q;->R()Lcom/c/b/f;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 17191
    :cond_4
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_5

    .line 17192
    iget-boolean v0, p0, Lcom/c/b/i$q;->n:Z

    invoke-virtual {p1, v4, v0}, Lcom/c/b/h;->a(IZ)V

    .line 17194
    :cond_5
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit16 v0, v0, 0x100

    const/16 v1, 0x100

    if-ne v0, v1, :cond_6

    .line 17195
    const/16 v0, 0x11

    iget-boolean v1, p0, Lcom/c/b/i$q;->o:Z

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(IZ)V

    .line 17197
    :cond_6
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit16 v0, v0, 0x200

    const/16 v1, 0x200

    if-ne v0, v1, :cond_7

    .line 17198
    const/16 v0, 0x12

    iget-boolean v1, p0, Lcom/c/b/i$q;->p:Z

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(IZ)V

    .line 17200
    :cond_7
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit8 v0, v0, 0x8

    if-ne v0, v3, :cond_8

    .line 17201
    const/16 v0, 0x14

    iget-boolean v1, p0, Lcom/c/b/i$q;->j:Z

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(IZ)V

    .line 17203
    :cond_8
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit16 v0, v0, 0x400

    const/16 v1, 0x400

    if-ne v0, v1, :cond_9

    .line 17204
    const/16 v0, 0x17

    iget-boolean v1, p0, Lcom/c/b/i$q;->q:Z

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(IZ)V

    .line 17206
    :cond_9
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit8 v0, v0, 0x10

    if-ne v0, v4, :cond_a

    .line 17207
    const/16 v0, 0x1b

    iget-boolean v1, p0, Lcom/c/b/i$q;->k:Z

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(IZ)V

    .line 17209
    :cond_a
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit16 v0, v0, 0x800

    const/16 v1, 0x800

    if-ne v0, v1, :cond_b

    .line 17210
    const/16 v0, 0x1f

    iget-boolean v1, p0, Lcom/c/b/i$q;->r:Z

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(IZ)V

    .line 17212
    :cond_b
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit16 v0, v0, 0x1000

    const/16 v1, 0x1000

    if-ne v0, v1, :cond_c

    .line 17213
    const/16 v0, 0x24

    invoke-direct {p0}, Lcom/c/b/i$q;->S()Lcom/c/b/f;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 17215
    :cond_c
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit16 v0, v0, 0x2000

    const/16 v1, 0x2000

    if-ne v0, v1, :cond_d

    .line 17216
    const/16 v0, 0x25

    invoke-direct {p0}, Lcom/c/b/i$q;->T()Lcom/c/b/f;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 17218
    :cond_d
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/c/b/i$q;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_e

    .line 17219
    const/16 v3, 0x3e7

    iget-object v0, p0, Lcom/c/b/i$q;->u:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-virtual {p1, v3, v0}, Lcom/c/b/h;->b(ILcom/c/b/be;)V

    .line 17218
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 17221
    :cond_e
    invoke-virtual {v2, p1}, Lcom/c/b/as$d$a;->a(Lcom/c/b/h;)V

    .line 17222
    iget-object v0, p0, Lcom/c/b/i$q;->e:Lcom/c/b/by;

    invoke-virtual {v0, p1}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    .line 17223
    return-void
.end method

.method public final a()Z
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 17153
    iget-byte v0, p0, Lcom/c/b/i$q;->v:B

    .line 17154
    if-ne v0, v3, :cond_1

    move v2, v3

    .line 17168
    :cond_0
    :goto_0
    return v2

    .line 17155
    :cond_1
    if-eqz v0, :cond_0

    move v1, v2

    .line 17157
    :goto_1
    iget-object v0, p0, Lcom/c/b/i$q;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 17158
    iget-object v0, p0, Lcom/c/b/i$q;->u:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/i$ag;

    invoke-virtual {v0}, Lcom/c/b/i$ag;->a()Z

    move-result v0

    if-nez v0, :cond_2

    .line 17159
    iput-byte v2, p0, Lcom/c/b/i$q;->v:B

    goto :goto_0

    .line 17157
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 17163
    :cond_3
    invoke-virtual {p0}, Lcom/c/b/i$q;->M()Z

    move-result v0

    if-nez v0, :cond_4

    .line 17164
    iput-byte v2, p0, Lcom/c/b/i$q;->v:B

    goto :goto_0

    .line 17167
    :cond_4
    iput-byte v3, p0, Lcom/c/b/i$q;->v:B

    move v2, v3

    .line 17168
    goto :goto_0
.end method

.method public final b()I
    .locals 6

    .prologue
    const/16 v5, 0x10

    const/16 v4, 0x8

    const/4 v3, 0x1

    const/4 v1, 0x0

    .line 17227
    iget v0, p0, Lcom/c/b/i$q;->w:I

    .line 17228
    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    .line 17294
    :goto_0
    return v0

    .line 17231
    :cond_0
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v3, :cond_f

    .line 17232
    invoke-direct {p0}, Lcom/c/b/i$q;->P()Lcom/c/b/f;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 17235
    :goto_1
    iget v2, p0, Lcom/c/b/i$q;->f:I

    and-int/lit8 v2, v2, 0x2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    .line 17236
    invoke-direct {p0}, Lcom/c/b/i$q;->Q()Lcom/c/b/f;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v2

    add-int/2addr v0, v2

    .line 17239
    :cond_1
    iget v2, p0, Lcom/c/b/i$q;->f:I

    and-int/lit8 v2, v2, 0x20

    const/16 v3, 0x20

    if-ne v2, v3, :cond_2

    .line 17240
    const/16 v2, 0x9

    iget v3, p0, Lcom/c/b/i$q;->l:I

    invoke-static {v2, v3}, Lcom/c/b/h;->f(II)I

    move-result v2

    add-int/2addr v0, v2

    .line 17243
    :cond_2
    iget v2, p0, Lcom/c/b/i$q;->f:I

    and-int/lit8 v2, v2, 0x4

    const/4 v3, 0x4

    if-ne v2, v3, :cond_3

    .line 17244
    const/16 v2, 0xa

    invoke-static {v2}, Lcom/c/b/h;->j(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v0, v2

    .line 17247
    :cond_3
    iget v2, p0, Lcom/c/b/i$q;->f:I

    and-int/lit8 v2, v2, 0x40

    const/16 v3, 0x40

    if-ne v2, v3, :cond_4

    .line 17248
    const/16 v2, 0xb

    invoke-direct {p0}, Lcom/c/b/i$q;->R()Lcom/c/b/f;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v2

    add-int/2addr v0, v2

    .line 17251
    :cond_4
    iget v2, p0, Lcom/c/b/i$q;->f:I

    and-int/lit16 v2, v2, 0x80

    const/16 v3, 0x80

    if-ne v2, v3, :cond_5

    .line 17252
    invoke-static {v5}, Lcom/c/b/h;->j(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v0, v2

    .line 17255
    :cond_5
    iget v2, p0, Lcom/c/b/i$q;->f:I

    and-int/lit16 v2, v2, 0x100

    const/16 v3, 0x100

    if-ne v2, v3, :cond_6

    .line 17256
    const/16 v2, 0x11

    invoke-static {v2}, Lcom/c/b/h;->j(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v0, v2

    .line 17259
    :cond_6
    iget v2, p0, Lcom/c/b/i$q;->f:I

    and-int/lit16 v2, v2, 0x200

    const/16 v3, 0x200

    if-ne v2, v3, :cond_7

    .line 17260
    const/16 v2, 0x12

    invoke-static {v2}, Lcom/c/b/h;->j(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v0, v2

    .line 17263
    :cond_7
    iget v2, p0, Lcom/c/b/i$q;->f:I

    and-int/lit8 v2, v2, 0x8

    if-ne v2, v4, :cond_8

    .line 17264
    const/16 v2, 0x14

    invoke-static {v2}, Lcom/c/b/h;->j(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v0, v2

    .line 17267
    :cond_8
    iget v2, p0, Lcom/c/b/i$q;->f:I

    and-int/lit16 v2, v2, 0x400

    const/16 v3, 0x400

    if-ne v2, v3, :cond_9

    .line 17268
    const/16 v2, 0x17

    invoke-static {v2}, Lcom/c/b/h;->j(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v0, v2

    .line 17271
    :cond_9
    iget v2, p0, Lcom/c/b/i$q;->f:I

    and-int/lit8 v2, v2, 0x10

    if-ne v2, v5, :cond_a

    .line 17272
    const/16 v2, 0x1b

    invoke-static {v2}, Lcom/c/b/h;->j(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v0, v2

    .line 17275
    :cond_a
    iget v2, p0, Lcom/c/b/i$q;->f:I

    and-int/lit16 v2, v2, 0x800

    const/16 v3, 0x800

    if-ne v2, v3, :cond_b

    .line 17276
    const/16 v2, 0x1f

    invoke-static {v2}, Lcom/c/b/h;->j(I)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v0, v2

    .line 17279
    :cond_b
    iget v2, p0, Lcom/c/b/i$q;->f:I

    and-int/lit16 v2, v2, 0x1000

    const/16 v3, 0x1000

    if-ne v2, v3, :cond_c

    .line 17280
    const/16 v2, 0x24

    invoke-direct {p0}, Lcom/c/b/i$q;->S()Lcom/c/b/f;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v2

    add-int/2addr v0, v2

    .line 17283
    :cond_c
    iget v2, p0, Lcom/c/b/i$q;->f:I

    and-int/lit16 v2, v2, 0x2000

    const/16 v3, 0x2000

    if-ne v2, v3, :cond_d

    .line 17284
    const/16 v2, 0x25

    invoke-direct {p0}, Lcom/c/b/i$q;->T()Lcom/c/b/f;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v2

    add-int/2addr v0, v2

    :cond_d
    move v2, v0

    .line 17287
    :goto_2
    iget-object v0, p0, Lcom/c/b/i$q;->u:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_e

    .line 17288
    const/16 v3, 0x3e7

    iget-object v0, p0, Lcom/c/b/i$q;->u:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/c/b/be;

    invoke-static {v3, v0}, Lcom/c/b/h;->d(ILcom/c/b/be;)I

    move-result v0

    add-int/2addr v0, v2

    .line 17287
    add-int/lit8 v1, v1, 0x1

    move v2, v0

    goto :goto_2

    .line 17291
    :cond_e
    invoke-virtual {p0}, Lcom/c/b/i$q;->O()I

    move-result v0

    add-int/2addr v0, v2

    .line 17292
    iget-object v1, p0, Lcom/c/b/i$q;->e:Lcom/c/b/by;

    invoke-virtual {v1}, Lcom/c/b/by;->b()I

    move-result v1

    add-int/2addr v0, v1

    .line 17293
    iput v0, p0, Lcom/c/b/i$q;->w:I

    goto/16 :goto_0

    :cond_f
    move v0, v1

    goto/16 :goto_1
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 16417
    invoke-static {}, Lcom/c/b/i;->w()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$q;

    const-class v2, Lcom/c/b/i$q$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 16281
    iget-object v0, p0, Lcom/c/b/i$q;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 16557
    iget v1, p0, Lcom/c/b/i$q;->f:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final i()Z
    .locals 2

    .prologue
    .line 16621
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final j()Z
    .locals 2

    .prologue
    .line 16688
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final k()Z
    .locals 1

    .prologue
    .line 16703
    iget-boolean v0, p0, Lcom/c/b/i$q;->i:Z

    return v0
.end method

.method public final l()Z
    .locals 2

    .prologue
    .line 16725
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit8 v0, v0, 0x8

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final m()Z
    .locals 1

    .prologue
    .line 16744
    iget-boolean v0, p0, Lcom/c/b/i$q;->j:Z

    return v0
.end method

.method public final n()Z
    .locals 2

    .prologue
    .line 16762
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit8 v0, v0, 0x10

    const/16 v1, 0x10

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final o()Z
    .locals 1

    .prologue
    .line 16777
    iget-boolean v0, p0, Lcom/c/b/i$q;->k:Z

    return v0
.end method

.method public final p()Z
    .locals 2

    .prologue
    .line 16786
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final q()Lcom/c/b/i$q$b;
    .locals 1

    .prologue
    .line 16792
    iget v0, p0, Lcom/c/b/i$q;->l:I

    invoke-static {v0}, Lcom/c/b/i$q$b;->a(I)Lcom/c/b/i$q$b;

    move-result-object v0

    .line 16793
    if-nez v0, :cond_0

    sget-object v0, Lcom/c/b/i$q$b;->a:Lcom/c/b/i$q$b;

    :cond_0
    return-object v0
.end method

.method public final r()Z
    .locals 2

    .prologue
    .line 16810
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final s()Z
    .locals 2

    .prologue
    .line 16880
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 19094
    sget-object v0, Lcom/c/b/i$q;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 16251
    sget-object v0, Lcom/c/b/i$q;->x:Lcom/c/b/i$q;

    invoke-virtual {v0}, Lcom/c/b/i$q;->I()Lcom/c/b/i$q$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 16251
    invoke-virtual {p0}, Lcom/c/b/i$q;->I()Lcom/c/b/i$q$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 16251
    sget-object v0, Lcom/c/b/i$q;->x:Lcom/c/b/i$q;

    return-object v0
.end method

.method public final x()Z
    .locals 1

    .prologue
    .line 16898
    iget-boolean v0, p0, Lcom/c/b/i$q;->n:Z

    return v0
.end method

.method public final y()Z
    .locals 2

    .prologue
    .line 16907
    iget v0, p0, Lcom/c/b/i$q;->f:I

    and-int/lit16 v0, v0, 0x100

    const/16 v1, 0x100

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final z()Z
    .locals 1

    .prologue
    .line 16913
    iget-boolean v0, p0, Lcom/c/b/i$q;->o:Z

    return v0
.end method
