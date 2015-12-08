.class public final Lcom/c/b/i$ae$b;
.super Lcom/c/b/as;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/i$ae$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/i$ae;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/i$ae$b$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final p:Lcom/c/b/i$ae$b;


# instance fields
.field private f:I

.field private g:Ljava/util/List;

.field private h:I

.field private i:Ljava/util/List;

.field private j:I

.field private volatile k:Ljava/lang/Object;

.field private volatile l:Ljava/lang/Object;

.field private m:Lcom/c/b/az;

.field private n:B

.field private o:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 30923
    new-instance v0, Lcom/c/b/i$ae$b;

    invoke-direct {v0}, Lcom/c/b/i$ae$b;-><init>()V

    sput-object v0, Lcom/c/b/i$ae$b;->p:Lcom/c/b/i$ae$b;

    .line 30930
    new-instance v0, Lcom/c/b/ah;

    invoke-direct {v0}, Lcom/c/b/ah;-><init>()V

    sput-object v0, Lcom/c/b/i$ae$b;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 29234
    invoke-direct {p0}, Lcom/c/b/as;-><init>()V

    .line 29460
    iput v0, p0, Lcom/c/b/i$ae$b;->h:I

    .line 29507
    iput v0, p0, Lcom/c/b/i$ae$b;->j:I

    .line 29739
    iput-byte v0, p0, Lcom/c/b/i$ae$b;->n:B

    .line 29778
    iput v0, p0, Lcom/c/b/i$ae$b;->o:I

    .line 29235
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$ae$b;->g:Ljava/util/List;

    .line 29236
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$ae$b;->i:Ljava/util/List;

    .line 29237
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$ae$b;->k:Ljava/lang/Object;

    .line 29238
    const-string v0, ""

    iput-object v0, p0, Lcom/c/b/i$ae$b;->l:Ljava/lang/Object;

    .line 29239
    sget-object v0, Lcom/c/b/ay;->a:Lcom/c/b/az;

    iput-object v0, p0, Lcom/c/b/i$ae$b;->m:Lcom/c/b/az;

    .line 29240
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$a;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 29232
    invoke-direct {p0, p1}, Lcom/c/b/as;-><init>(Lcom/c/b/as$a;)V

    .line 29460
    iput v0, p0, Lcom/c/b/i$ae$b;->h:I

    .line 29507
    iput v0, p0, Lcom/c/b/i$ae$b;->j:I

    .line 29739
    iput-byte v0, p0, Lcom/c/b/i$ae$b;->n:B

    .line 29778
    iput v0, p0, Lcom/c/b/i$ae$b;->o:I

    .line 29233
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$a;B)V
    .locals 0

    .prologue
    .line 29226
    invoke-direct {p0, p1}, Lcom/c/b/i$ae$b;-><init>(Lcom/c/b/as$a;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;)V
    .locals 10

    .prologue
    const/4 v0, 0x0

    const/16 v8, 0x10

    const/4 v7, 0x2

    const/4 v3, 0x1

    .line 29250
    invoke-direct {p0}, Lcom/c/b/i$ae$b;-><init>()V

    .line 29252
    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v4

    move v2, v0

    .line 29256
    :cond_0
    :goto_0
    if-nez v2, :cond_7

    .line 29257
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v1

    .line 29258
    sparse-switch v1, :sswitch_data_0

    .line 29263
    invoke-virtual {p0, p1, v4, p2, v1}, Lcom/c/b/i$ae$b;->a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;I)Z

    move-result v1

    if-nez v1, :cond_0

    move v2, v3

    .line 29265
    goto :goto_0

    :sswitch_0
    move v2, v3

    .line 29261
    goto :goto_0

    .line 29270
    :sswitch_1
    and-int/lit8 v1, v0, 0x1

    if-eq v1, v3, :cond_e

    .line 29271
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/c/b/i$ae$b;->g:Ljava/util/List;
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 29272
    or-int/lit8 v1, v0, 0x1

    .line 29274
    :goto_1
    :try_start_1
    iget-object v0, p0, Lcom/c/b/i$ae$b;->g:Ljava/util/List;

    invoke-virtual {p1}, Lcom/c/b/g;->f()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Lcom/c/b/av; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move v0, v1

    .line 29275
    goto :goto_0

    .line 29278
    :sswitch_2
    :try_start_2
    invoke-virtual {p1}, Lcom/c/b/g;->s()I

    move-result v1

    .line 29279
    invoke-virtual {p1, v1}, Lcom/c/b/g;->c(I)I

    move-result v5

    .line 29280
    and-int/lit8 v1, v0, 0x1

    if-eq v1, v3, :cond_d

    invoke-virtual {p1}, Lcom/c/b/g;->t()I

    move-result v1

    if-lez v1, :cond_d

    .line 29281
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/c/b/i$ae$b;->g:Ljava/util/List;
    :try_end_2
    .catch Lcom/c/b/av; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 29282
    or-int/lit8 v1, v0, 0x1

    .line 29284
    :goto_2
    :try_start_3
    invoke-virtual {p1}, Lcom/c/b/g;->t()I

    move-result v0

    if-lez v0, :cond_4

    .line 29285
    iget-object v0, p0, Lcom/c/b/i$ae$b;->g:Ljava/util/List;

    invoke-virtual {p1}, Lcom/c/b/g;->f()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Lcom/c/b/av; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    .line 29334
    :catch_0
    move-exception v0

    .line 29335
    :goto_3
    :try_start_4
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 29341
    :catchall_0
    move-exception v0

    :goto_4
    and-int/lit8 v2, v1, 0x1

    if-ne v2, v3, :cond_1

    .line 29342
    iget-object v2, p0, Lcom/c/b/i$ae$b;->g:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lcom/c/b/i$ae$b;->g:Ljava/util/List;

    .line 29344
    :cond_1
    and-int/lit8 v2, v1, 0x2

    if-ne v2, v7, :cond_2

    .line 29345
    iget-object v2, p0, Lcom/c/b/i$ae$b;->i:Ljava/util/List;

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lcom/c/b/i$ae$b;->i:Ljava/util/List;

    .line 29347
    :cond_2
    and-int/lit8 v1, v1, 0x10

    if-ne v1, v8, :cond_3

    .line 29348
    iget-object v1, p0, Lcom/c/b/i$ae$b;->m:Lcom/c/b/az;

    invoke-interface {v1}, Lcom/c/b/az;->e()Lcom/c/b/az;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$ae$b;->m:Lcom/c/b/az;

    .line 29350
    :cond_3
    invoke-virtual {v4}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$ae$b;->e:Lcom/c/b/by;

    .line 29351
    invoke-virtual {p0}, Lcom/c/b/i$ae$b;->L()V

    .line 29341
    throw v0

    .line 29287
    :cond_4
    :try_start_5
    invoke-virtual {p1, v5}, Lcom/c/b/g;->d(I)V
    :try_end_5
    .catch Lcom/c/b/av; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    move v0, v1

    .line 29288
    goto/16 :goto_0

    .line 29291
    :sswitch_3
    and-int/lit8 v1, v0, 0x2

    if-eq v1, v7, :cond_c

    .line 29292
    :try_start_6
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/c/b/i$ae$b;->i:Ljava/util/List;
    :try_end_6
    .catch Lcom/c/b/av; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 29293
    or-int/lit8 v1, v0, 0x2

    .line 29295
    :goto_5
    :try_start_7
    iget-object v0, p0, Lcom/c/b/i$ae$b;->i:Ljava/util/List;

    invoke-virtual {p1}, Lcom/c/b/g;->f()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catch Lcom/c/b/av; {:try_start_7 .. :try_end_7} :catch_0
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    move v0, v1

    .line 29296
    goto/16 :goto_0

    .line 29299
    :sswitch_4
    :try_start_8
    invoke-virtual {p1}, Lcom/c/b/g;->s()I

    move-result v1

    .line 29300
    invoke-virtual {p1, v1}, Lcom/c/b/g;->c(I)I

    move-result v5

    .line 29301
    and-int/lit8 v1, v0, 0x2

    if-eq v1, v7, :cond_b

    invoke-virtual {p1}, Lcom/c/b/g;->t()I

    move-result v1

    if-lez v1, :cond_b

    .line 29302
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/c/b/i$ae$b;->i:Ljava/util/List;
    :try_end_8
    .catch Lcom/c/b/av; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 29303
    or-int/lit8 v1, v0, 0x2

    .line 29305
    :goto_6
    :try_start_9
    invoke-virtual {p1}, Lcom/c/b/g;->t()I

    move-result v0

    if-lez v0, :cond_5

    .line 29306
    iget-object v0, p0, Lcom/c/b/i$ae$b;->i:Ljava/util/List;

    invoke-virtual {p1}, Lcom/c/b/g;->f()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_9
    .catch Lcom/c/b/av; {:try_start_9 .. :try_end_9} :catch_0
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_6

    .line 29336
    :catch_1
    move-exception v0

    .line 29337
    :goto_7
    :try_start_a
    new-instance v2, Ljava/lang/RuntimeException;

    new-instance v5, Lcom/c/b/av;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Lcom/c/b/av;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 29308
    :cond_5
    :try_start_b
    invoke-virtual {p1, v5}, Lcom/c/b/g;->d(I)V
    :try_end_b
    .catch Lcom/c/b/av; {:try_start_b .. :try_end_b} :catch_0
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    move v0, v1

    .line 29309
    goto/16 :goto_0

    .line 29312
    :sswitch_5
    :try_start_c
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v1

    .line 29313
    iget v5, p0, Lcom/c/b/i$ae$b;->f:I

    or-int/lit8 v5, v5, 0x1

    iput v5, p0, Lcom/c/b/i$ae$b;->f:I

    .line 29314
    iput-object v1, p0, Lcom/c/b/i$ae$b;->k:Ljava/lang/Object;

    goto/16 :goto_0

    .line 29334
    :catch_2
    move-exception v1

    move-object v9, v1

    move v1, v0

    move-object v0, v9

    goto/16 :goto_3

    .line 29318
    :sswitch_6
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v1

    .line 29319
    iget v5, p0, Lcom/c/b/i$ae$b;->f:I

    or-int/lit8 v5, v5, 0x2

    iput v5, p0, Lcom/c/b/i$ae$b;->f:I

    .line 29320
    iput-object v1, p0, Lcom/c/b/i$ae$b;->l:Ljava/lang/Object;

    goto/16 :goto_0

    .line 29336
    :catch_3
    move-exception v1

    move-object v9, v1

    move v1, v0

    move-object v0, v9

    goto :goto_7

    .line 29324
    :sswitch_7
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v1

    .line 29325
    and-int/lit8 v5, v0, 0x10

    if-eq v5, v8, :cond_6

    .line 29326
    new-instance v5, Lcom/c/b/ay;

    invoke-direct {v5}, Lcom/c/b/ay;-><init>()V

    iput-object v5, p0, Lcom/c/b/i$ae$b;->m:Lcom/c/b/az;

    .line 29327
    or-int/lit8 v0, v0, 0x10

    .line 29329
    :cond_6
    iget-object v5, p0, Lcom/c/b/i$ae$b;->m:Lcom/c/b/az;

    invoke-interface {v5, v1}, Lcom/c/b/az;->a(Lcom/c/b/f;)V
    :try_end_c
    .catch Lcom/c/b/av; {:try_start_c .. :try_end_c} :catch_2
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_3
    .catchall {:try_start_c .. :try_end_c} :catchall_1

    goto/16 :goto_0

    .line 29341
    :catchall_1
    move-exception v1

    move-object v9, v1

    move v1, v0

    move-object v0, v9

    goto/16 :goto_4

    :cond_7
    and-int/lit8 v1, v0, 0x1

    if-ne v1, v3, :cond_8

    .line 29342
    iget-object v1, p0, Lcom/c/b/i$ae$b;->g:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$ae$b;->g:Ljava/util/List;

    .line 29344
    :cond_8
    and-int/lit8 v1, v0, 0x2

    if-ne v1, v7, :cond_9

    .line 29345
    iget-object v1, p0, Lcom/c/b/i$ae$b;->i:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/c/b/i$ae$b;->i:Ljava/util/List;

    .line 29347
    :cond_9
    and-int/lit8 v0, v0, 0x10

    if-ne v0, v8, :cond_a

    .line 29348
    iget-object v0, p0, Lcom/c/b/i$ae$b;->m:Lcom/c/b/az;

    invoke-interface {v0}, Lcom/c/b/az;->e()Lcom/c/b/az;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$ae$b;->m:Lcom/c/b/az;

    .line 29350
    :cond_a
    invoke-virtual {v4}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/i$ae$b;->e:Lcom/c/b/by;

    .line 29351
    invoke-virtual {p0}, Lcom/c/b/i$ae$b;->L()V

    .line 29352
    return-void

    :cond_b
    move v1, v0

    goto/16 :goto_6

    :cond_c
    move v1, v0

    goto/16 :goto_5

    :cond_d
    move v1, v0

    goto/16 :goto_2

    :cond_e
    move v1, v0

    goto/16 :goto_1

    .line 29258
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0xa -> :sswitch_2
        0x10 -> :sswitch_3
        0x12 -> :sswitch_4
        0x1a -> :sswitch_5
        0x22 -> :sswitch_6
        0x32 -> :sswitch_7
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;B)V
    .locals 0

    .prologue
    .line 29226
    invoke-direct {p0, p1, p2}, Lcom/c/b/i$ae$b;-><init>(Lcom/c/b/g;Lcom/c/b/aq;)V

    return-void
.end method

.method static synthetic a(Lcom/c/b/i$ae$b;I)I
    .locals 0

    .prologue
    .line 29226
    iput p1, p0, Lcom/c/b/i$ae$b;->f:I

    return p1
.end method

.method static synthetic a(Lcom/c/b/i$ae$b;Lcom/c/b/az;)Lcom/c/b/az;
    .locals 0

    .prologue
    .line 29226
    iput-object p1, p0, Lcom/c/b/i$ae$b;->m:Lcom/c/b/az;

    return-object p1
.end method

.method static synthetic a(Lcom/c/b/i$ae$b;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 29226
    iput-object p1, p0, Lcom/c/b/i$ae$b;->k:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic a(Lcom/c/b/i$ae$b;)Ljava/util/List;
    .locals 1

    .prologue
    .line 29226
    iget-object v0, p0, Lcom/c/b/i$ae$b;->g:Ljava/util/List;

    return-object v0
.end method

.method static synthetic a(Lcom/c/b/i$ae$b;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 29226
    iput-object p1, p0, Lcom/c/b/i$ae$b;->g:Ljava/util/List;

    return-object p1
.end method

.method static synthetic b(Lcom/c/b/i$ae$b;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 29226
    iput-object p1, p0, Lcom/c/b/i$ae$b;->l:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic b(Lcom/c/b/i$ae$b;)Ljava/util/List;
    .locals 1

    .prologue
    .line 29226
    iget-object v0, p0, Lcom/c/b/i$ae$b;->i:Ljava/util/List;

    return-object v0
.end method

.method static synthetic b(Lcom/c/b/i$ae$b;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .prologue
    .line 29226
    iput-object p1, p0, Lcom/c/b/i$ae$b;->i:Ljava/util/List;

    return-object p1
.end method

.method static synthetic c(Lcom/c/b/i$ae$b;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 29226
    iget-object v0, p0, Lcom/c/b/i$ae$b;->k:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic d(Lcom/c/b/i$ae$b;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 29226
    iget-object v0, p0, Lcom/c/b/i$ae$b;->l:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic e(Lcom/c/b/i$ae$b;)Lcom/c/b/az;
    .locals 1

    .prologue
    .line 29226
    iget-object v0, p0, Lcom/c/b/i$ae$b;->m:Lcom/c/b/az;

    return-object v0
.end method

.method public static j()Lcom/c/b/i$ae$b;
    .locals 1

    .prologue
    .line 30927
    sget-object v0, Lcom/c/b/i$ae$b;->p:Lcom/c/b/i$ae$b;

    return-object v0
.end method

.method private k()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 29656
    iget-object v0, p0, Lcom/c/b/i$ae$b;->k:Ljava/lang/Object;

    .line 29657
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 29658
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 29661
    iput-object v0, p0, Lcom/c/b/i$ae$b;->k:Ljava/lang/Object;

    .line 29664
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private l()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 29698
    iget-object v0, p0, Lcom/c/b/i$ae$b;->l:Ljava/lang/Object;

    .line 29699
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 29700
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 29703
    iput-object v0, p0, Lcom/c/b/i$ae$b;->l:Ljava/lang/Object;

    .line 29706
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private m()Lcom/c/b/i$ae$b$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 29896
    sget-object v0, Lcom/c/b/i$ae$b;->p:Lcom/c/b/i$ae$b;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/c/b/i$ae$b$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$ae$b$a;-><init>(B)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/c/b/i$ae$b$a;

    invoke-direct {v0, v1}, Lcom/c/b/i$ae$b$a;-><init>(B)V

    invoke-virtual {v0, p0}, Lcom/c/b/i$ae$b$a;->a(Lcom/c/b/i$ae$b;)Lcom/c/b/i$ae$b$a;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 29226
    new-instance v0, Lcom/c/b/i$ae$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/c/b/i$ae$b$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 29751
    invoke-virtual {p0}, Lcom/c/b/i$ae$b;->b()I

    .line 29752
    iget-object v0, p0, Lcom/c/b/i$ae$b;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 29753
    const/16 v0, 0xa

    invoke-virtual {p1, v0}, Lcom/c/b/h;->k(I)V

    .line 29754
    iget v0, p0, Lcom/c/b/i$ae$b;->h:I

    invoke-virtual {p1, v0}, Lcom/c/b/h;->k(I)V

    :cond_0
    move v1, v2

    .line 29756
    :goto_0
    iget-object v0, p0, Lcom/c/b/i$ae$b;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 29757
    iget-object v0, p0, Lcom/c/b/i$ae$b;->g:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/c/b/h;->b(I)V

    .line 29756
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 29759
    :cond_1
    iget-object v0, p0, Lcom/c/b/i$ae$b;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 29760
    const/16 v0, 0x12

    invoke-virtual {p1, v0}, Lcom/c/b/h;->k(I)V

    .line 29761
    iget v0, p0, Lcom/c/b/i$ae$b;->j:I

    invoke-virtual {p1, v0}, Lcom/c/b/h;->k(I)V

    :cond_2
    move v1, v2

    .line 29763
    :goto_1
    iget-object v0, p0, Lcom/c/b/i$ae$b;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 29764
    iget-object v0, p0, Lcom/c/b/i$ae$b;->i:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/c/b/h;->b(I)V

    .line 29763
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 29766
    :cond_3
    iget v0, p0, Lcom/c/b/i$ae$b;->f:I

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 29767
    const/4 v0, 0x3

    invoke-direct {p0}, Lcom/c/b/i$ae$b;->k()Lcom/c/b/f;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 29769
    :cond_4
    iget v0, p0, Lcom/c/b/i$ae$b;->f:I

    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    .line 29770
    const/4 v0, 0x4

    invoke-direct {p0}, Lcom/c/b/i$ae$b;->l()Lcom/c/b/f;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 29772
    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/c/b/i$ae$b;->m:Lcom/c/b/az;

    invoke-interface {v0}, Lcom/c/b/az;->size()I

    move-result v0

    if-ge v2, v0, :cond_6

    .line 29773
    const/4 v0, 0x6

    iget-object v1, p0, Lcom/c/b/i$ae$b;->m:Lcom/c/b/az;

    invoke-interface {v1, v2}, Lcom/c/b/az;->a(I)Lcom/c/b/f;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 29772
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 29775
    :cond_6
    iget-object v0, p0, Lcom/c/b/i$ae$b;->e:Lcom/c/b/by;

    invoke-virtual {v0, p1}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    .line 29776
    return-void
.end method

.method public final a()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 29741
    iget-byte v1, p0, Lcom/c/b/i$ae$b;->n:B

    .line 29742
    if-ne v1, v0, :cond_0

    .line 29746
    :goto_0
    return v0

    .line 29743
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    .line 29745
    :cond_1
    iput-byte v0, p0, Lcom/c/b/i$ae$b;->n:B

    goto :goto_0
.end method

.method public final b()I
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 29780
    iget v0, p0, Lcom/c/b/i$ae$b;->o:I

    .line 29781
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 29831
    :goto_0
    return v0

    :cond_0
    move v1, v2

    move v3, v2

    .line 29786
    :goto_1
    iget-object v0, p0, Lcom/c/b/i$ae$b;->g:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 29787
    iget-object v0, p0, Lcom/c/b/i$ae$b;->g:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/c/b/h;->i(I)I

    move-result v0

    add-int/2addr v3, v0

    .line 29786
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 29790
    :cond_1
    add-int/lit8 v0, v3, 0x0

    .line 29791
    iget-object v1, p0, Lcom/c/b/i$ae$b;->g:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    .line 29792
    add-int/lit8 v0, v0, 0x1

    .line 29793
    invoke-static {v3}, Lcom/c/b/h;->i(I)I

    move-result v1

    add-int/2addr v0, v1

    move v1, v0

    .line 29796
    :goto_2
    iput v3, p0, Lcom/c/b/i$ae$b;->h:I

    move v3, v2

    move v4, v2

    .line 29800
    :goto_3
    iget-object v0, p0, Lcom/c/b/i$ae$b;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_2

    .line 29801
    iget-object v0, p0, Lcom/c/b/i$ae$b;->i:Ljava/util/List;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lcom/c/b/h;->i(I)I

    move-result v0

    add-int/2addr v4, v0

    .line 29800
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_3

    .line 29804
    :cond_2
    add-int v0, v1, v4

    .line 29805
    iget-object v1, p0, Lcom/c/b/i$ae$b;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    .line 29806
    add-int/lit8 v0, v0, 0x1

    .line 29807
    invoke-static {v4}, Lcom/c/b/h;->i(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 29810
    :cond_3
    iput v4, p0, Lcom/c/b/i$ae$b;->j:I

    .line 29812
    iget v1, p0, Lcom/c/b/i$ae$b;->f:I

    and-int/lit8 v1, v1, 0x1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_4

    .line 29813
    const/4 v1, 0x3

    invoke-direct {p0}, Lcom/c/b/i$ae$b;->k()Lcom/c/b/f;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v1

    add-int/2addr v0, v1

    .line 29816
    :cond_4
    iget v1, p0, Lcom/c/b/i$ae$b;->f:I

    and-int/lit8 v1, v1, 0x2

    const/4 v3, 0x2

    if-ne v1, v3, :cond_5

    .line 29817
    const/4 v1, 0x4

    invoke-direct {p0}, Lcom/c/b/i$ae$b;->l()Lcom/c/b/f;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_5
    move v1, v2

    .line 29822
    :goto_4
    iget-object v3, p0, Lcom/c/b/i$ae$b;->m:Lcom/c/b/az;

    invoke-interface {v3}, Lcom/c/b/az;->size()I

    move-result v3

    if-ge v2, v3, :cond_6

    .line 29823
    iget-object v3, p0, Lcom/c/b/i$ae$b;->m:Lcom/c/b/az;

    invoke-interface {v3, v2}, Lcom/c/b/az;->a(I)Lcom/c/b/f;

    move-result-object v3

    invoke-static {v3}, Lcom/c/b/h;->b(Lcom/c/b/f;)I

    move-result v3

    add-int/2addr v1, v3

    .line 29822
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 29826
    :cond_6
    add-int/2addr v0, v1

    .line 29827
    iget-object v1, p0, Lcom/c/b/i$ae$b;->m:Lcom/c/b/az;

    invoke-interface {v1}, Lcom/c/b/bm;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x1

    add-int/2addr v0, v1

    .line 29829
    iget-object v1, p0, Lcom/c/b/i$ae$b;->e:Lcom/c/b/by;

    invoke-virtual {v1}, Lcom/c/b/by;->b()I

    move-result v1

    add-int/2addr v0, v1

    .line 29830
    iput v0, p0, Lcom/c/b/i$ae$b;->o:I

    goto/16 :goto_0

    :cond_7
    move v1, v0

    goto/16 :goto_2
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 29361
    invoke-static {}, Lcom/c/b/i;->Q()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/c/b/i$ae$b;

    const-class v2, Lcom/c/b/i$ae$b$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 29245
    iget-object v0, p0, Lcom/c/b/i$ae$b;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 29554
    iget v1, p0, Lcom/c/b/i$ae$b;->f:I

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
    .line 29674
    iget v0, p0, Lcom/c/b/i$ae$b;->f:I

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

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 30955
    sget-object v0, Lcom/c/b/i$ae$b;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 29226
    sget-object v0, Lcom/c/b/i$ae$b;->p:Lcom/c/b/i$ae$b;

    invoke-direct {v0}, Lcom/c/b/i$ae$b;->m()Lcom/c/b/i$ae$b$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 29226
    invoke-direct {p0}, Lcom/c/b/i$ae$b;->m()Lcom/c/b/i$ae$b$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 29226
    sget-object v0, Lcom/c/b/i$ae$b;->p:Lcom/c/b/i$ae$b;

    return-object v0
.end method
