.class public Lkik/a/d/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected final a:Lkik/a/d/j;

.field protected b:Ljava/lang/String;

.field protected c:Ljava/lang/String;

.field protected d:Z

.field protected e:Z

.field protected f:Z

.field protected g:[B

.field protected h:Z

.field protected i:Z

.field protected j:Z

.field protected k:Z

.field protected l:I

.field protected m:Ljava/lang/String;

.field protected n:Ljava/lang/String;

.field protected o:Z

.field protected p:Lcom/kik/f/a/a/c;

.field protected q:Z


# direct methods
.method private constructor <init>(Lkik/a/d/j;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 40
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lkik/a/d/k;-><init>(Lkik/a/d/j;Ljava/lang/String;B)V

    .line 41
    return-void
.end method

.method private constructor <init>(Lkik/a/d/j;Ljava/lang/String;B)V
    .locals 8

    .prologue
    const/4 v2, 0x0

    const/4 v4, 0x0

    .line 51
    const-string v5, "0"

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v6, v2

    move v7, v4

    invoke-direct/range {v0 .. v7}, Lkik/a/d/k;-><init>(Lkik/a/d/j;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V

    .line 52
    return-void
.end method

.method public constructor <init>(Lkik/a/d/j;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 8

    .prologue
    .line 57
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v5, p5

    move-object v6, p6

    move v7, p4

    invoke-direct/range {v0 .. v7}, Lkik/a/d/k;-><init>(Lkik/a/d/j;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V

    .line 58
    return-void
.end method

.method public constructor <init>(Lkik/a/d/j;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V
    .locals 17

    .prologue
    .line 62
    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v10, p7

    invoke-direct/range {v0 .. v16}, Lkik/a/d/k;-><init>(Lkik/a/d/j;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZZZZZIZ[BZ)V

    .line 63
    return-void
.end method

.method public constructor <init>(Lkik/a/d/j;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZZZZZIZ[BZ)V
    .locals 5

    .prologue
    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const-string v1, "0"

    iput-object v1, p0, Lkik/a/d/k;->m:Ljava/lang/String;

    .line 67
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lkik/a/d/j;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lkik/a/d/j;->d()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    .line 68
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid JID"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 73
    :cond_1
    if-eqz p6, :cond_2

    const-string v1, "0"

    invoke-virtual {p6, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_2
    const-string v1, "0"

    :goto_0
    iput-object v1, p0, Lkik/a/d/k;->m:Ljava/lang/String;

    .line 74
    iput-object p7, p0, Lkik/a/d/k;->n:Ljava/lang/String;

    .line 78
    new-instance v1, Lkik/a/d/j;

    invoke-virtual {p1}, Lkik/a/d/j;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lkik/a/d/j;->d()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Lkik/a/d/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v1, p0, Lkik/a/d/k;->a:Lkik/a/d/j;

    .line 79
    iput-object p2, p0, Lkik/a/d/k;->b:Ljava/lang/String;

    .line 80
    iput-object p3, p0, Lkik/a/d/k;->c:Ljava/lang/String;

    .line 81
    iput-boolean p4, p0, Lkik/a/d/k;->h:Z

    .line 82
    iput-boolean p5, p0, Lkik/a/d/k;->d:Z

    .line 83
    iput-boolean p8, p0, Lkik/a/d/k;->i:Z

    .line 84
    iput-boolean p9, p0, Lkik/a/d/k;->e:Z

    .line 85
    iput-boolean p10, p0, Lkik/a/d/k;->j:Z

    .line 86
    move/from16 v0, p11

    iput-boolean v0, p0, Lkik/a/d/k;->k:Z

    .line 87
    move/from16 v0, p12

    iput-boolean v0, p0, Lkik/a/d/k;->q:Z

    .line 88
    move/from16 v0, p13

    iput v0, p0, Lkik/a/d/k;->l:I

    .line 89
    move/from16 v0, p14

    iput-boolean v0, p0, Lkik/a/d/k;->f:Z

    .line 90
    move-object/from16 v0, p15

    iput-object v0, p0, Lkik/a/d/k;->g:[B

    .line 91
    move/from16 v0, p16

    iput-boolean v0, p0, Lkik/a/d/k;->o:Z

    .line 92
    return-void

    .line 73
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {p6}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x3

    invoke-virtual {p6, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "000"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;)Lkik/a/d/k;
    .locals 3

    .prologue
    .line 96
    new-instance v0, Lkik/a/d/k;

    invoke-static {p0}, Lkik/a/d/j;->a(Ljava/lang/String;)Lkik/a/d/j;

    move-result-object v1

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Lkik/a/d/k;-><init>(Lkik/a/d/j;Ljava/lang/String;)V

    .line 97
    const/4 v1, 0x1

    iput-boolean v1, v0, Lkik/a/d/k;->d:Z

    .line 98
    return-object v0
.end method

.method public static a(Lkik/a/d/k;)Lkik/a/d/k;
    .locals 3

    .prologue
    .line 108
    new-instance v0, Lkik/a/d/k;

    iget-object v1, p0, Lkik/a/d/k;->a:Lkik/a/d/j;

    const-string v2, ""

    invoke-direct {v0, v1, v2}, Lkik/a/d/k;-><init>(Lkik/a/d/j;Ljava/lang/String;)V

    .line 110
    invoke-virtual {v0, p0}, Lkik/a/d/k;->c(Lkik/a/d/k;)V

    .line 112
    return-object v0
.end method


# virtual methods
.method public final a()Lkik/a/d/j;
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lkik/a/d/k;->a:Lkik/a/d/j;

    return-object v0
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 172
    iput p1, p0, Lkik/a/d/k;->l:I

    .line 173
    return-void
.end method

.method public final a(Lcom/kik/f/a/a/c;)V
    .locals 0

    .prologue
    .line 222
    iput-object p1, p0, Lkik/a/d/k;->p:Lcom/kik/f/a/a/c;

    .line 223
    return-void
.end method

.method public final a(Z)V
    .locals 0

    .prologue
    .line 187
    iput-boolean p1, p0, Lkik/a/d/k;->e:Z

    .line 188
    return-void
.end method

.method public final a([B)V
    .locals 0

    .prologue
    .line 202
    iput-object p1, p0, Lkik/a/d/k;->g:[B

    .line 203
    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Lkik/a/d/k;->a:Lkik/a/d/j;

    invoke-virtual {v0}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 150
    iput-object p1, p0, Lkik/a/d/k;->b:Ljava/lang/String;

    .line 151
    return-void
.end method

.method public final b(Lkik/a/d/k;)V
    .locals 1

    .prologue
    .line 324
    iget-boolean v0, p1, Lkik/a/d/k;->h:Z

    iput-boolean v0, p0, Lkik/a/d/k;->h:Z

    .line 325
    iget-boolean v0, p1, Lkik/a/d/k;->i:Z

    iput-boolean v0, p0, Lkik/a/d/k;->i:Z

    .line 326
    iget-boolean v0, p1, Lkik/a/d/k;->j:Z

    iput-boolean v0, p0, Lkik/a/d/k;->j:Z

    .line 327
    iget-boolean v0, p1, Lkik/a/d/k;->k:Z

    iput-boolean v0, p0, Lkik/a/d/k;->k:Z

    .line 328
    iget v0, p1, Lkik/a/d/k;->l:I

    iput v0, p0, Lkik/a/d/k;->l:I

    .line 329
    return-void
.end method

.method public final b(Z)V
    .locals 0

    .prologue
    .line 197
    iput-boolean p1, p0, Lkik/a/d/k;->f:Z

    .line 198
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 140
    iget-object v0, p0, Lkik/a/d/k;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 304
    iput-object p1, p0, Lkik/a/d/k;->n:Ljava/lang/String;

    .line 305
    return-void
.end method

.method public c(Lkik/a/d/k;)V
    .locals 2

    .prologue
    .line 333
    iget-object v0, p0, Lkik/a/d/k;->a:Lkik/a/d/j;

    iget-object v1, p1, Lkik/a/d/k;->a:Lkik/a/d/j;

    invoke-virtual {v0, v1}, Lkik/a/d/j;->a(Lkik/a/d/j;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 334
    iget-object v0, p1, Lkik/a/d/k;->b:Ljava/lang/String;

    iput-object v0, p0, Lkik/a/d/k;->b:Ljava/lang/String;

    .line 335
    iget-object v0, p1, Lkik/a/d/k;->c:Ljava/lang/String;

    iput-object v0, p0, Lkik/a/d/k;->c:Ljava/lang/String;

    .line 336
    iget-boolean v0, p1, Lkik/a/d/k;->d:Z

    iput-boolean v0, p0, Lkik/a/d/k;->d:Z

    .line 337
    iget-object v0, p1, Lkik/a/d/k;->m:Ljava/lang/String;

    iput-object v0, p0, Lkik/a/d/k;->m:Ljava/lang/String;

    .line 338
    iget-object v0, p1, Lkik/a/d/k;->n:Ljava/lang/String;

    iput-object v0, p0, Lkik/a/d/k;->n:Ljava/lang/String;

    .line 339
    iget-boolean v0, p1, Lkik/a/d/k;->e:Z

    iput-boolean v0, p0, Lkik/a/d/k;->e:Z

    .line 340
    iget-boolean v0, p1, Lkik/a/d/k;->f:Z

    iput-boolean v0, p0, Lkik/a/d/k;->f:Z

    .line 341
    iget-object v0, p1, Lkik/a/d/k;->g:[B

    iput-object v0, p0, Lkik/a/d/k;->g:[B

    .line 342
    iget-boolean v0, p1, Lkik/a/d/k;->o:Z

    iput-boolean v0, p0, Lkik/a/d/k;->o:Z

    .line 343
    iget-object v0, p1, Lkik/a/d/k;->p:Lcom/kik/f/a/a/c;

    iput-object v0, p0, Lkik/a/d/k;->p:Lcom/kik/f/a/a/c;

    .line 344
    iget-boolean v0, p1, Lkik/a/d/k;->q:Z

    iput-boolean v0, p0, Lkik/a/d/k;->q:Z

    .line 346
    invoke-virtual {p0, p1}, Lkik/a/d/k;->b(Lkik/a/d/k;)V

    .line 348
    :cond_0
    return-void
.end method

.method public final c(Z)V
    .locals 0

    .prologue
    .line 217
    iput-boolean p1, p0, Lkik/a/d/k;->o:Z

    .line 218
    return-void
.end method

.method public final d()Lcom/kik/f/a/a/c;
    .locals 1

    .prologue
    .line 145
    iget-object v0, p0, Lkik/a/d/k;->p:Lcom/kik/f/a/a/c;

    return-object v0
.end method

.method public final d(Z)V
    .locals 0

    .prologue
    .line 252
    iput-boolean p1, p0, Lkik/a/d/k;->h:Z

    .line 253
    return-void
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 159
    iget-object v0, p0, Lkik/a/d/k;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 160
    const-string v0, ""

    .line 162
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lkik/a/d/k;->c:Ljava/lang/String;

    goto :goto_0
.end method

.method public final e(Z)V
    .locals 0

    .prologue
    .line 266
    iput-boolean p1, p0, Lkik/a/d/k;->i:Z

    .line 267
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .prologue
    .line 373
    if-eqz p1, :cond_0

    instance-of v0, p1, Lkik/a/d/k;

    if-eqz v0, :cond_0

    .line 374
    check-cast p1, Lkik/a/d/k;

    .line 375
    iget-object v0, p0, Lkik/a/d/k;->a:Lkik/a/d/j;

    invoke-virtual {v0}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lkik/a/d/k;->a:Lkik/a/d/j;

    invoke-virtual {v1}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 378
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final f()I
    .locals 1

    .prologue
    .line 167
    iget v0, p0, Lkik/a/d/k;->l:I

    return v0
.end method

.method public final f(Z)V
    .locals 0

    .prologue
    .line 280
    iput-boolean p1, p0, Lkik/a/d/k;->j:Z

    .line 281
    return-void
.end method

.method public final g(Z)V
    .locals 0

    .prologue
    .line 294
    iput-boolean p1, p0, Lkik/a/d/k;->k:Z

    .line 295
    return-void
.end method

.method public final g()Z
    .locals 1

    .prologue
    .line 177
    iget-boolean v0, p0, Lkik/a/d/k;->d:Z

    return v0
.end method

.method public final h(Z)V
    .locals 0

    .prologue
    .line 357
    iput-boolean p1, p0, Lkik/a/d/k;->q:Z

    .line 358
    return-void
.end method

.method public final h()Z
    .locals 1

    .prologue
    .line 182
    iget-boolean v0, p0, Lkik/a/d/k;->e:Z

    return v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 384
    iget-object v0, p0, Lkik/a/d/k;->a:Lkik/a/d/j;

    invoke-virtual {v0}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/lit8 v0, v0, 0x1f

    .line 389
    return v0
.end method

.method public final i()Z
    .locals 1

    .prologue
    .line 192
    iget-boolean v0, p0, Lkik/a/d/k;->f:Z

    return v0
.end method

.method public final j()[B
    .locals 1

    .prologue
    .line 207
    iget-object v0, p0, Lkik/a/d/k;->g:[B

    return-object v0
.end method

.method public final k()Z
    .locals 1

    .prologue
    .line 212
    iget-boolean v0, p0, Lkik/a/d/k;->o:Z

    return v0
.end method

.method public final l()Z
    .locals 1

    .prologue
    .line 230
    iget-boolean v0, p0, Lkik/a/d/k;->j:Z

    return v0
.end method

.method public final m()Z
    .locals 1

    .prologue
    .line 238
    iget-boolean v0, p0, Lkik/a/d/k;->k:Z

    return v0
.end method

.method public final n()Z
    .locals 1

    .prologue
    .line 247
    iget-boolean v0, p0, Lkik/a/d/k;->h:Z

    return v0
.end method

.method public final o()Z
    .locals 1

    .prologue
    .line 261
    iget-boolean v0, p0, Lkik/a/d/k;->i:Z

    return v0
.end method

.method public final p()Z
    .locals 1

    .prologue
    .line 275
    iget-boolean v0, p0, Lkik/a/d/k;->j:Z

    return v0
.end method

.method public final q()Z
    .locals 1

    .prologue
    .line 285
    iget-boolean v0, p0, Lkik/a/d/k;->k:Z

    return v0
.end method

.method public final r()Ljava/lang/String;
    .locals 1

    .prologue
    .line 299
    iget-object v0, p0, Lkik/a/d/k;->n:Ljava/lang/String;

    return-object v0
.end method

.method public final s()Ljava/lang/String;
    .locals 1

    .prologue
    .line 309
    iget-object v0, p0, Lkik/a/d/k;->m:Ljava/lang/String;

    return-object v0
.end method

.method public t()Z
    .locals 1

    .prologue
    .line 352
    const/4 v0, 0x0

    return v0
.end method

.method public final u()Z
    .locals 1

    .prologue
    .line 362
    iget-boolean v0, p0, Lkik/a/d/k;->q:Z

    return v0
.end method

.method public final v()Z
    .locals 1

    .prologue
    .line 367
    iget-boolean v0, p0, Lkik/a/d/k;->q:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lkik/a/d/k;->j:Z

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
