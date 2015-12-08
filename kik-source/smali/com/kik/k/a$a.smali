.class public final Lcom/kik/k/a$a;
.super Lcom/c/b/as;
.source "SourceFile"

# interfaces
.implements Lcom/kik/k/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kik/k/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kik/k/a$a$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/c/b/bk;

.field private static final q:Lcom/kik/k/a$a;


# instance fields
.field private f:I

.field private g:Z

.field private volatile h:Ljava/lang/Object;

.field private i:I

.field private j:I

.field private k:J

.field private l:J

.field private m:I

.field private n:I

.field private o:B

.field private p:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 1057
    new-instance v0, Lcom/kik/k/a$a;

    invoke-direct {v0}, Lcom/kik/k/a$a;-><init>()V

    sput-object v0, Lcom/kik/k/a$a;->q:Lcom/kik/k/a$a;

    .line 1064
    new-instance v0, Lcom/kik/k/c;

    invoke-direct {v0}, Lcom/kik/k/c;-><init>()V

    sput-object v0, Lcom/kik/k/a$a;->c:Lcom/c/b/bk;

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .prologue
    const-wide/16 v2, 0x0

    const/4 v0, -0x1

    const/4 v1, 0x0

    .line 120
    invoke-direct {p0}, Lcom/c/b/as;-><init>()V

    .line 388
    iput-byte v0, p0, Lcom/kik/k/a$a;->o:B

    .line 427
    iput v0, p0, Lcom/kik/k/a$a;->p:I

    .line 121
    iput-boolean v1, p0, Lcom/kik/k/a$a;->g:Z

    .line 122
    const-string v0, ""

    iput-object v0, p0, Lcom/kik/k/a$a;->h:Ljava/lang/Object;

    .line 123
    iput v1, p0, Lcom/kik/k/a$a;->i:I

    .line 124
    iput v1, p0, Lcom/kik/k/a$a;->j:I

    .line 125
    iput-wide v2, p0, Lcom/kik/k/a$a;->k:J

    .line 126
    iput-wide v2, p0, Lcom/kik/k/a$a;->l:J

    .line 127
    iput v1, p0, Lcom/kik/k/a$a;->m:I

    .line 128
    iput v1, p0, Lcom/kik/k/a$a;->n:I

    .line 129
    return-void
.end method

.method private constructor <init>(Lcom/c/b/as$a;)V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 118
    invoke-direct {p0, p1}, Lcom/c/b/as;-><init>(Lcom/c/b/as$a;)V

    .line 388
    iput-byte v0, p0, Lcom/kik/k/a$a;->o:B

    .line 427
    iput v0, p0, Lcom/kik/k/a$a;->p:I

    .line 119
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/as$a;B)V
    .locals 0

    .prologue
    .line 112
    invoke-direct {p0, p1}, Lcom/kik/k/a$a;-><init>(Lcom/c/b/as$a;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;)V
    .locals 6

    .prologue
    const/4 v1, 0x1

    .line 139
    invoke-direct {p0}, Lcom/kik/k/a$a;-><init>()V

    .line 140
    invoke-static {}, Lcom/c/b/by;->c()Lcom/c/b/by$a;

    move-result-object v2

    .line 144
    const/4 v0, 0x0

    .line 145
    :cond_0
    :goto_0
    if-nez v0, :cond_1

    .line 146
    :try_start_0
    invoke-virtual {p1}, Lcom/c/b/g;->a()I

    move-result v3

    .line 147
    sparse-switch v3, :sswitch_data_0

    .line 152
    invoke-virtual {p0, p1, v2, p2, v3}, Lcom/kik/k/a$a;->a(Lcom/c/b/g;Lcom/c/b/by$a;Lcom/c/b/aq;I)Z

    move-result v3

    if-nez v3, :cond_0

    move v0, v1

    .line 154
    goto :goto_0

    :sswitch_0
    move v0, v1

    .line 150
    goto :goto_0

    .line 159
    :sswitch_1
    iget v3, p0, Lcom/kik/k/a$a;->f:I

    or-int/lit8 v3, v3, 0x1

    iput v3, p0, Lcom/kik/k/a$a;->f:I

    .line 160
    invoke-virtual {p1}, Lcom/c/b/g;->i()Z

    move-result v3

    iput-boolean v3, p0, Lcom/kik/k/a$a;->g:Z
    :try_end_0
    .catch Lcom/c/b/av; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 201
    :catch_0
    move-exception v0

    .line 202
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    invoke-virtual {v0, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 208
    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v1

    iput-object v1, p0, Lcom/kik/k/a$a;->e:Lcom/c/b/by;

    .line 209
    invoke-virtual {p0}, Lcom/kik/k/a$a;->L()V

    throw v0

    .line 164
    :sswitch_2
    :try_start_2
    invoke-virtual {p1}, Lcom/c/b/g;->l()Lcom/c/b/f;

    move-result-object v3

    .line 165
    iget v4, p0, Lcom/kik/k/a$a;->f:I

    or-int/lit8 v4, v4, 0x2

    iput v4, p0, Lcom/kik/k/a$a;->f:I

    .line 166
    iput-object v3, p0, Lcom/kik/k/a$a;->h:Ljava/lang/Object;
    :try_end_2
    .catch Lcom/c/b/av; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 203
    :catch_1
    move-exception v0

    .line 204
    :try_start_3
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v3, Lcom/c/b/av;

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Lcom/c/b/av;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Lcom/c/b/av;->a(Lcom/c/b/be;)Lcom/c/b/av;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 170
    :sswitch_3
    :try_start_4
    iget v3, p0, Lcom/kik/k/a$a;->f:I

    or-int/lit8 v3, v3, 0x4

    iput v3, p0, Lcom/kik/k/a$a;->f:I

    .line 171
    invoke-virtual {p1}, Lcom/c/b/g;->f()I

    move-result v3

    iput v3, p0, Lcom/kik/k/a$a;->i:I

    goto :goto_0

    .line 175
    :sswitch_4
    iget v3, p0, Lcom/kik/k/a$a;->f:I

    or-int/lit8 v3, v3, 0x8

    iput v3, p0, Lcom/kik/k/a$a;->f:I

    .line 176
    invoke-virtual {p1}, Lcom/c/b/g;->f()I

    move-result v3

    iput v3, p0, Lcom/kik/k/a$a;->j:I

    goto :goto_0

    .line 180
    :sswitch_5
    iget v3, p0, Lcom/kik/k/a$a;->f:I

    or-int/lit8 v3, v3, 0x10

    iput v3, p0, Lcom/kik/k/a$a;->f:I

    .line 181
    invoke-virtual {p1}, Lcom/c/b/g;->p()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/kik/k/a$a;->k:J

    goto :goto_0

    .line 185
    :sswitch_6
    iget v3, p0, Lcom/kik/k/a$a;->f:I

    or-int/lit8 v3, v3, 0x20

    iput v3, p0, Lcom/kik/k/a$a;->f:I

    .line 186
    invoke-virtual {p1}, Lcom/c/b/g;->p()J

    move-result-wide v4

    iput-wide v4, p0, Lcom/kik/k/a$a;->l:J

    goto/16 :goto_0

    .line 190
    :sswitch_7
    iget v3, p0, Lcom/kik/k/a$a;->f:I

    or-int/lit8 v3, v3, 0x40

    iput v3, p0, Lcom/kik/k/a$a;->f:I

    .line 191
    invoke-virtual {p1}, Lcom/c/b/g;->m()I

    move-result v3

    iput v3, p0, Lcom/kik/k/a$a;->m:I

    goto/16 :goto_0

    .line 195
    :sswitch_8
    iget v3, p0, Lcom/kik/k/a$a;->f:I

    or-int/lit16 v3, v3, 0x80

    iput v3, p0, Lcom/kik/k/a$a;->f:I

    .line 196
    invoke-virtual {p1}, Lcom/c/b/g;->m()I

    move-result v3

    iput v3, p0, Lcom/kik/k/a$a;->n:I
    :try_end_4
    .catch Lcom/c/b/av; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto/16 :goto_0

    .line 208
    :cond_1
    invoke-virtual {v2}, Lcom/c/b/by$a;->b()Lcom/c/b/by;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/k/a$a;->e:Lcom/c/b/by;

    .line 209
    invoke-virtual {p0}, Lcom/kik/k/a$a;->L()V

    .line 210
    return-void

    .line 147
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x8 -> :sswitch_1
        0x12 -> :sswitch_2
        0x28 -> :sswitch_3
        0x30 -> :sswitch_4
        0x39 -> :sswitch_5
        0x41 -> :sswitch_6
        0x78 -> :sswitch_7
        0x80 -> :sswitch_8
    .end sparse-switch
.end method

.method synthetic constructor <init>(Lcom/c/b/g;Lcom/c/b/aq;B)V
    .locals 0

    .prologue
    .line 112
    invoke-direct {p0, p1, p2}, Lcom/kik/k/a$a;-><init>(Lcom/c/b/g;Lcom/c/b/aq;)V

    return-void
.end method

.method public static A()Lcom/kik/k/a$a;
    .locals 1

    .prologue
    .line 1061
    sget-object v0, Lcom/kik/k/a$a;->q:Lcom/kik/k/a$a;

    return-object v0
.end method

.method static synthetic B()Z
    .locals 1

    .prologue
    .line 112
    sget-boolean v0, Lcom/kik/k/a$a;->d:Z

    return v0
.end method

.method private C()Lcom/c/b/f;
    .locals 2

    .prologue
    .line 278
    iget-object v0, p0, Lcom/kik/k/a$a;->h:Ljava/lang/Object;

    .line 279
    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 280
    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/c/b/f;->a(Ljava/lang/String;)Lcom/c/b/f;

    move-result-object v0

    .line 283
    iput-object v0, p0, Lcom/kik/k/a$a;->h:Ljava/lang/Object;

    .line 286
    :goto_0
    return-object v0

    :cond_0
    check-cast v0, Lcom/c/b/f;

    goto :goto_0
.end method

.method private D()Lcom/kik/k/a$a$a;
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 532
    sget-object v0, Lcom/kik/k/a$a;->q:Lcom/kik/k/a$a;

    if-ne p0, v0, :cond_0

    new-instance v0, Lcom/kik/k/a$a$a;

    invoke-direct {v0, v1}, Lcom/kik/k/a$a$a;-><init>(B)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/kik/k/a$a$a;

    invoke-direct {v0, v1}, Lcom/kik/k/a$a$a;-><init>(B)V

    invoke-virtual {v0, p0}, Lcom/kik/k/a$a$a;->a(Lcom/kik/k/a$a;)Lcom/kik/k/a$a$a;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/kik/k/a$a;I)I
    .locals 0

    .prologue
    .line 112
    iput p1, p0, Lcom/kik/k/a$a;->i:I

    return p1
.end method

.method static synthetic a(Lcom/kik/k/a$a;J)J
    .locals 1

    .prologue
    .line 112
    iput-wide p1, p0, Lcom/kik/k/a$a;->k:J

    return-wide p1
.end method

.method static synthetic a(Lcom/kik/k/a$a;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 112
    iget-object v0, p0, Lcom/kik/k/a$a;->h:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lcom/kik/k/a$a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .prologue
    .line 112
    iput-object p1, p0, Lcom/kik/k/a$a;->h:Ljava/lang/Object;

    return-object p1
.end method

.method static synthetic a(Lcom/kik/k/a$a;Z)Z
    .locals 0

    .prologue
    .line 112
    iput-boolean p1, p0, Lcom/kik/k/a$a;->g:Z

    return p1
.end method

.method static synthetic b(Lcom/kik/k/a$a;I)I
    .locals 0

    .prologue
    .line 112
    iput p1, p0, Lcom/kik/k/a$a;->j:I

    return p1
.end method

.method static synthetic b(Lcom/kik/k/a$a;J)J
    .locals 1

    .prologue
    .line 112
    iput-wide p1, p0, Lcom/kik/k/a$a;->l:J

    return-wide p1
.end method

.method static synthetic b(Lcom/kik/k/a$a;)Lcom/c/b/by;
    .locals 1

    .prologue
    .line 112
    iget-object v0, p0, Lcom/kik/k/a$a;->e:Lcom/c/b/by;

    return-object v0
.end method

.method static synthetic c(Lcom/kik/k/a$a;I)I
    .locals 0

    .prologue
    .line 112
    iput p1, p0, Lcom/kik/k/a$a;->m:I

    return p1
.end method

.method static synthetic d(Lcom/kik/k/a$a;I)I
    .locals 0

    .prologue
    .line 112
    iput p1, p0, Lcom/kik/k/a$a;->n:I

    return p1
.end method

.method static synthetic e(Lcom/kik/k/a$a;I)I
    .locals 0

    .prologue
    .line 112
    iput p1, p0, Lcom/kik/k/a$a;->f:I

    return p1
.end method


# virtual methods
.method protected final synthetic a(Lcom/c/b/as$b;)Lcom/c/b/bd$a;
    .locals 2

    .prologue
    .line 112
    new-instance v0, Lcom/kik/k/a$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/kik/k/a$a$a;-><init>(Lcom/c/b/as$b;B)V

    return-object v0
.end method

.method public final a(Lcom/c/b/h;)V
    .locals 6

    .prologue
    const/16 v5, 0x10

    const/16 v4, 0x8

    const/4 v2, 0x2

    const/4 v1, 0x1

    .line 400
    iget v0, p0, Lcom/kik/k/a$a;->f:I

    and-int/lit8 v0, v0, 0x1

    if-ne v0, v1, :cond_0

    .line 401
    iget-boolean v0, p0, Lcom/kik/k/a$a;->g:Z

    invoke-virtual {p1, v1, v0}, Lcom/c/b/h;->a(IZ)V

    .line 403
    :cond_0
    iget v0, p0, Lcom/kik/k/a$a;->f:I

    and-int/lit8 v0, v0, 0x2

    if-ne v0, v2, :cond_1

    .line 404
    invoke-direct {p0}, Lcom/kik/k/a$a;->C()Lcom/c/b/f;

    move-result-object v0

    invoke-virtual {p1, v2, v0}, Lcom/c/b/h;->a(ILcom/c/b/f;)V

    .line 406
    :cond_1
    iget v0, p0, Lcom/kik/k/a$a;->f:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    if-ne v0, v1, :cond_2

    .line 407
    const/4 v0, 0x5

    iget v1, p0, Lcom/kik/k/a$a;->i:I

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(II)V

    .line 409
    :cond_2
    iget v0, p0, Lcom/kik/k/a$a;->f:I

    and-int/lit8 v0, v0, 0x8

    if-ne v0, v4, :cond_3

    .line 410
    const/4 v0, 0x6

    iget v1, p0, Lcom/kik/k/a$a;->j:I

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->a(II)V

    .line 412
    :cond_3
    iget v0, p0, Lcom/kik/k/a$a;->f:I

    and-int/lit8 v0, v0, 0x10

    if-ne v0, v5, :cond_4

    .line 413
    const/4 v0, 0x7

    iget-wide v2, p0, Lcom/kik/k/a$a;->k:J

    invoke-virtual {p1, v0, v2, v3}, Lcom/c/b/h;->c(IJ)V

    .line 415
    :cond_4
    iget v0, p0, Lcom/kik/k/a$a;->f:I

    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    if-ne v0, v1, :cond_5

    .line 416
    iget-wide v0, p0, Lcom/kik/k/a$a;->l:J

    invoke-virtual {p1, v4, v0, v1}, Lcom/c/b/h;->c(IJ)V

    .line 418
    :cond_5
    iget v0, p0, Lcom/kik/k/a$a;->f:I

    and-int/lit8 v0, v0, 0x40

    const/16 v1, 0x40

    if-ne v0, v1, :cond_6

    .line 419
    const/16 v0, 0xf

    iget v1, p0, Lcom/kik/k/a$a;->m:I

    invoke-virtual {p1, v0, v1}, Lcom/c/b/h;->b(II)V

    .line 421
    :cond_6
    iget v0, p0, Lcom/kik/k/a$a;->f:I

    and-int/lit16 v0, v0, 0x80

    const/16 v1, 0x80

    if-ne v0, v1, :cond_7

    .line 422
    iget v0, p0, Lcom/kik/k/a$a;->n:I

    invoke-virtual {p1, v5, v0}, Lcom/c/b/h;->b(II)V

    .line 424
    :cond_7
    iget-object v0, p0, Lcom/kik/k/a$a;->e:Lcom/c/b/by;

    invoke-virtual {v0, p1}, Lcom/c/b/by;->a(Lcom/c/b/h;)V

    .line 425
    return-void
.end method

.method public final a()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 390
    iget-byte v1, p0, Lcom/kik/k/a$a;->o:B

    .line 391
    if-ne v1, v0, :cond_0

    .line 395
    :goto_0
    return v0

    .line 392
    :cond_0
    if-nez v1, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    .line 394
    :cond_1
    iput-byte v0, p0, Lcom/kik/k/a$a;->o:B

    goto :goto_0
.end method

.method public final b()I
    .locals 6

    .prologue
    const/16 v5, 0x10

    const/16 v4, 0x8

    const/4 v3, 0x2

    const/4 v2, 0x1

    .line 429
    iget v0, p0, Lcom/kik/k/a$a;->p:I

    .line 430
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 467
    :goto_0
    return v0

    .line 432
    :cond_0
    const/4 v0, 0x0

    .line 433
    iget v1, p0, Lcom/kik/k/a$a;->f:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v2, :cond_1

    .line 434
    invoke-static {v2}, Lcom/c/b/h;->g(I)I

    move-result v0

    add-int/lit8 v0, v0, 0x0

    .line 437
    :cond_1
    iget v1, p0, Lcom/kik/k/a$a;->f:I

    and-int/lit8 v1, v1, 0x2

    if-ne v1, v3, :cond_2

    .line 438
    invoke-direct {p0}, Lcom/kik/k/a$a;->C()Lcom/c/b/f;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/c/b/h;->c(ILcom/c/b/f;)I

    move-result v1

    add-int/2addr v0, v1

    .line 441
    :cond_2
    iget v1, p0, Lcom/kik/k/a$a;->f:I

    and-int/lit8 v1, v1, 0x4

    const/4 v2, 0x4

    if-ne v1, v2, :cond_3

    .line 442
    const/4 v1, 0x5

    iget v2, p0, Lcom/kik/k/a$a;->i:I

    invoke-static {v1, v2}, Lcom/c/b/h;->d(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 445
    :cond_3
    iget v1, p0, Lcom/kik/k/a$a;->f:I

    and-int/lit8 v1, v1, 0x8

    if-ne v1, v4, :cond_4

    .line 446
    const/4 v1, 0x6

    iget v2, p0, Lcom/kik/k/a$a;->j:I

    invoke-static {v1, v2}, Lcom/c/b/h;->d(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 449
    :cond_4
    iget v1, p0, Lcom/kik/k/a$a;->f:I

    and-int/lit8 v1, v1, 0x10

    if-ne v1, v5, :cond_5

    .line 450
    const/4 v1, 0x7

    invoke-static {v1}, Lcom/c/b/h;->h(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 453
    :cond_5
    iget v1, p0, Lcom/kik/k/a$a;->f:I

    and-int/lit8 v1, v1, 0x20

    const/16 v2, 0x20

    if-ne v1, v2, :cond_6

    .line 454
    invoke-static {v4}, Lcom/c/b/h;->h(I)I

    move-result v1

    add-int/2addr v0, v1

    .line 457
    :cond_6
    iget v1, p0, Lcom/kik/k/a$a;->f:I

    and-int/lit8 v1, v1, 0x40

    const/16 v2, 0x40

    if-ne v1, v2, :cond_7

    .line 458
    const/16 v1, 0xf

    iget v2, p0, Lcom/kik/k/a$a;->m:I

    invoke-static {v1, v2}, Lcom/c/b/h;->e(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 461
    :cond_7
    iget v1, p0, Lcom/kik/k/a$a;->f:I

    and-int/lit16 v1, v1, 0x80

    const/16 v2, 0x80

    if-ne v1, v2, :cond_8

    .line 462
    iget v1, p0, Lcom/kik/k/a$a;->n:I

    invoke-static {v5, v1}, Lcom/c/b/h;->e(II)I

    move-result v1

    add-int/2addr v0, v1

    .line 465
    :cond_8
    iget-object v1, p0, Lcom/kik/k/a$a;->e:Lcom/c/b/by;

    invoke-virtual {v1}, Lcom/c/b/by;->b()I

    move-result v1

    add-int/2addr v0, v1

    .line 466
    iput v0, p0, Lcom/kik/k/a$a;->p:I

    goto :goto_0
.end method

.method protected final c_()Lcom/c/b/as$g;
    .locals 3

    .prologue
    .line 219
    invoke-static {}, Lcom/kik/k/a;->c()Lcom/c/b/as$g;

    move-result-object v0

    const-class v1, Lcom/kik/k/a$a;

    const-class v2, Lcom/kik/k/a$a$a;

    invoke-virtual {v0, v1, v2}, Lcom/c/b/as$g;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/c/b/as$g;

    move-result-object v0

    return-object v0
.end method

.method public final f()Lcom/c/b/by;
    .locals 1

    .prologue
    .line 134
    iget-object v0, p0, Lcom/kik/k/a$a;->e:Lcom/c/b/by;

    return-object v0
.end method

.method public final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 235
    iget v1, p0, Lcom/kik/k/a$a;->f:I

    and-int/lit8 v1, v1, 0x1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final i()Z
    .locals 1

    .prologue
    .line 245
    iget-boolean v0, p0, Lcom/kik/k/a$a;->g:Z

    return v0
.end method

.method public final j()Z
    .locals 2

    .prologue
    .line 254
    iget v0, p0, Lcom/kik/k/a$a;->f:I

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

.method public final k()Z
    .locals 2

    .prologue
    .line 300
    iget v0, p0, Lcom/kik/k/a$a;->f:I

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

.method public final l()I
    .locals 1

    .prologue
    .line 310
    iget v0, p0, Lcom/kik/k/a$a;->i:I

    return v0
.end method

.method public final m()Z
    .locals 2

    .prologue
    .line 319
    iget v0, p0, Lcom/kik/k/a$a;->f:I

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

.method public final n()I
    .locals 1

    .prologue
    .line 325
    iget v0, p0, Lcom/kik/k/a$a;->j:I

    return v0
.end method

.method public final o()Z
    .locals 2

    .prologue
    .line 334
    iget v0, p0, Lcom/kik/k/a$a;->f:I

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

.method public final p()J
    .locals 2

    .prologue
    .line 340
    iget-wide v0, p0, Lcom/kik/k/a$a;->k:J

    return-wide v0
.end method

.method public final q()Z
    .locals 2

    .prologue
    .line 349
    iget v0, p0, Lcom/kik/k/a$a;->f:I

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

.method public final r()J
    .locals 2

    .prologue
    .line 355
    iget-wide v0, p0, Lcom/kik/k/a$a;->l:J

    return-wide v0
.end method

.method public final s()Z
    .locals 2

    .prologue
    .line 364
    iget v0, p0, Lcom/kik/k/a$a;->f:I

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

.method public final t()Lcom/c/b/bk;
    .locals 1

    .prologue
    .line 1089
    sget-object v0, Lcom/kik/k/a$a;->c:Lcom/c/b/bk;

    return-object v0
.end method

.method public final synthetic u()Lcom/c/b/bd$a;
    .locals 1

    .prologue
    .line 112
    sget-object v0, Lcom/kik/k/a$a;->q:Lcom/kik/k/a$a;

    invoke-direct {v0}, Lcom/kik/k/a$a;->D()Lcom/kik/k/a$a$a;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic v()Lcom/c/b/be$a;
    .locals 1

    .prologue
    .line 112
    invoke-direct {p0}, Lcom/kik/k/a$a;->D()Lcom/kik/k/a$a$a;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic w()Lcom/c/b/bd;
    .locals 1

    .prologue
    .line 112
    sget-object v0, Lcom/kik/k/a$a;->q:Lcom/kik/k/a$a;

    return-object v0
.end method

.method public final x()I
    .locals 1

    .prologue
    .line 370
    iget v0, p0, Lcom/kik/k/a$a;->m:I

    return v0
.end method

.method public final y()Z
    .locals 2

    .prologue
    .line 379
    iget v0, p0, Lcom/kik/k/a$a;->f:I

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

.method public final z()I
    .locals 1

    .prologue
    .line 385
    iget v0, p0, Lcom/kik/k/a$a;->n:I

    return v0
.end method
