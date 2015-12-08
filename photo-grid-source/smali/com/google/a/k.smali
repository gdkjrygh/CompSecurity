.class public final Lcom/google/a/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:Lcom/google/a/v;

.field final b:Lcom/google/a/ae;

.field private final c:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal",
            "<",
            "Ljava/util/Map",
            "<",
            "Lcom/google/a/c/a",
            "<*>;",
            "Lcom/google/a/r",
            "<*>;>;>;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/a/c/a",
            "<*>;",
            "Lcom/google/a/am",
            "<*>;>;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/a/an;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/google/a/b/f;

.field private final g:Z

.field private final h:Z

.field private final i:Z

.field private final j:Z


# direct methods
.method public constructor <init>()V
    .locals 12

    .prologue
    const/4 v4, 0x0

    .line 179
    sget-object v1, Lcom/google/a/b/o;->a:Lcom/google/a/b/o;

    sget-object v2, Lcom/google/a/d;->a:Lcom/google/a/d;

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v3

    const/4 v7, 0x1

    sget-object v10, Lcom/google/a/ah;->a:Lcom/google/a/ah;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v11

    move-object v0, p0

    move v5, v4

    move v6, v4

    move v8, v4

    move v9, v4

    invoke-direct/range {v0 .. v11}, Lcom/google/a/k;-><init>(Lcom/google/a/b/o;Lcom/google/a/j;Ljava/util/Map;ZZZZZZLcom/google/a/ah;Ljava/util/List;)V

    .line 183
    return-void
.end method

.method constructor <init>(Lcom/google/a/b/o;Lcom/google/a/j;Ljava/util/Map;ZZZZZZLcom/google/a/ah;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/a/b/o;",
            "Lcom/google/a/j;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/reflect/Type;",
            "Lcom/google/a/t",
            "<*>;>;ZZZZZZ",
            "Lcom/google/a/ah;",
            "Ljava/util/List",
            "<",
            "Lcom/google/a/an;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 190
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    new-instance v0, Lcom/google/a/l;

    invoke-direct {v0, p0}, Lcom/google/a/l;-><init>(Lcom/google/a/k;)V

    iput-object v0, p0, Lcom/google/a/k;->c:Ljava/lang/ThreadLocal;

    .line 117
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lcom/google/a/k;->d:Ljava/util/Map;

    .line 128
    new-instance v0, Lcom/google/a/m;

    invoke-direct {v0, p0}, Lcom/google/a/m;-><init>(Lcom/google/a/k;)V

    iput-object v0, p0, Lcom/google/a/k;->a:Lcom/google/a/v;

    .line 135
    new-instance v0, Lcom/google/a/n;

    invoke-direct {v0, p0}, Lcom/google/a/n;-><init>(Lcom/google/a/k;)V

    iput-object v0, p0, Lcom/google/a/k;->b:Lcom/google/a/ae;

    .line 191
    new-instance v0, Lcom/google/a/b/f;

    invoke-direct {v0, p3}, Lcom/google/a/b/f;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lcom/google/a/k;->f:Lcom/google/a/b/f;

    .line 192
    iput-boolean p4, p0, Lcom/google/a/k;->g:Z

    .line 193
    iput-boolean p6, p0, Lcom/google/a/k;->i:Z

    .line 194
    iput-boolean p7, p0, Lcom/google/a/k;->h:Z

    .line 195
    iput-boolean p8, p0, Lcom/google/a/k;->j:Z

    .line 197
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 200
    sget-object v0, Lcom/google/a/b/a/y;->Q:Lcom/google/a/an;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 201
    sget-object v0, Lcom/google/a/b/a/m;->a:Lcom/google/a/an;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 204
    invoke-interface {v1, p11}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 207
    sget-object v0, Lcom/google/a/b/a/y;->x:Lcom/google/a/an;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 208
    sget-object v0, Lcom/google/a/b/a/y;->m:Lcom/google/a/an;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 209
    sget-object v0, Lcom/google/a/b/a/y;->g:Lcom/google/a/an;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 210
    sget-object v0, Lcom/google/a/b/a/y;->i:Lcom/google/a/an;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 211
    sget-object v0, Lcom/google/a/b/a/y;->k:Lcom/google/a/an;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 212
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    const-class v3, Ljava/lang/Long;

    .line 1308
    sget-object v0, Lcom/google/a/ah;->a:Lcom/google/a/ah;

    if-ne p10, v0, :cond_0

    .line 1309
    sget-object v0, Lcom/google/a/b/a/y;->n:Lcom/google/a/am;

    .line 212
    :goto_0
    invoke-static {v2, v3, v0}, Lcom/google/a/b/a/y;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/a/am;)Lcom/google/a/an;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 214
    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    const-class v3, Ljava/lang/Double;

    .line 2252
    if-eqz p9, :cond_1

    .line 2253
    sget-object v0, Lcom/google/a/b/a/y;->p:Lcom/google/a/am;

    .line 214
    :goto_1
    invoke-static {v2, v3, v0}, Lcom/google/a/b/a/y;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/a/am;)Lcom/google/a/an;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 216
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    const-class v3, Ljava/lang/Float;

    .line 2276
    if-eqz p9, :cond_2

    .line 2277
    sget-object v0, Lcom/google/a/b/a/y;->o:Lcom/google/a/am;

    .line 216
    :goto_2
    invoke-static {v2, v3, v0}, Lcom/google/a/b/a/y;->a(Ljava/lang/Class;Ljava/lang/Class;Lcom/google/a/am;)Lcom/google/a/an;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 218
    sget-object v0, Lcom/google/a/b/a/y;->r:Lcom/google/a/an;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 219
    sget-object v0, Lcom/google/a/b/a/y;->t:Lcom/google/a/an;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 220
    sget-object v0, Lcom/google/a/b/a/y;->z:Lcom/google/a/an;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 221
    sget-object v0, Lcom/google/a/b/a/y;->B:Lcom/google/a/an;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 222
    const-class v0, Ljava/math/BigDecimal;

    sget-object v2, Lcom/google/a/b/a/y;->v:Lcom/google/a/am;

    invoke-static {v0, v2}, Lcom/google/a/b/a/y;->a(Ljava/lang/Class;Lcom/google/a/am;)Lcom/google/a/an;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 223
    const-class v0, Ljava/math/BigInteger;

    sget-object v2, Lcom/google/a/b/a/y;->w:Lcom/google/a/am;

    invoke-static {v0, v2}, Lcom/google/a/b/a/y;->a(Ljava/lang/Class;Lcom/google/a/am;)Lcom/google/a/an;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 224
    sget-object v0, Lcom/google/a/b/a/y;->D:Lcom/google/a/an;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 225
    sget-object v0, Lcom/google/a/b/a/y;->F:Lcom/google/a/an;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 226
    sget-object v0, Lcom/google/a/b/a/y;->J:Lcom/google/a/an;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 227
    sget-object v0, Lcom/google/a/b/a/y;->O:Lcom/google/a/an;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 228
    sget-object v0, Lcom/google/a/b/a/y;->H:Lcom/google/a/an;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 229
    sget-object v0, Lcom/google/a/b/a/y;->d:Lcom/google/a/an;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 230
    sget-object v0, Lcom/google/a/b/a/e;->a:Lcom/google/a/an;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 231
    sget-object v0, Lcom/google/a/b/a/y;->M:Lcom/google/a/an;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 232
    sget-object v0, Lcom/google/a/b/a/v;->a:Lcom/google/a/an;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 233
    sget-object v0, Lcom/google/a/b/a/t;->a:Lcom/google/a/an;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 234
    sget-object v0, Lcom/google/a/b/a/y;->K:Lcom/google/a/an;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 235
    sget-object v0, Lcom/google/a/b/a/a;->a:Lcom/google/a/an;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 236
    sget-object v0, Lcom/google/a/b/a/y;->R:Lcom/google/a/an;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 237
    sget-object v0, Lcom/google/a/b/a/y;->b:Lcom/google/a/an;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 240
    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 243
    new-instance v0, Lcom/google/a/b/a/c;

    iget-object v2, p0, Lcom/google/a/k;->f:Lcom/google/a/b/f;

    invoke-direct {v0, v2}, Lcom/google/a/b/a/c;-><init>(Lcom/google/a/b/f;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 244
    new-instance v0, Lcom/google/a/b/a/k;

    iget-object v2, p0, Lcom/google/a/k;->f:Lcom/google/a/b/f;

    invoke-direct {v0, v2, p5}, Lcom/google/a/b/a/k;-><init>(Lcom/google/a/b/f;Z)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 245
    new-instance v0, Lcom/google/a/b/a/p;

    iget-object v2, p0, Lcom/google/a/k;->f:Lcom/google/a/b/f;

    invoke-direct {v0, v2, p2, p1}, Lcom/google/a/b/a/p;-><init>(Lcom/google/a/b/f;Lcom/google/a/j;Lcom/google/a/b/o;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 248
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/google/a/k;->e:Ljava/util/List;

    .line 249
    return-void

    .line 1311
    :cond_0
    new-instance v0, Lcom/google/a/q;

    invoke-direct {v0, p0}, Lcom/google/a/q;-><init>(Lcom/google/a/k;)V

    goto/16 :goto_0

    .line 2255
    :cond_1
    new-instance v0, Lcom/google/a/o;

    invoke-direct {v0, p0}, Lcom/google/a/o;-><init>(Lcom/google/a/k;)V

    goto/16 :goto_1

    .line 2279
    :cond_2
    new-instance v0, Lcom/google/a/p;

    invoke-direct {v0, p0}, Lcom/google/a/p;-><init>(Lcom/google/a/k;)V

    goto/16 :goto_2
.end method

.method private a(Ljava/io/Writer;)Lcom/google/a/d/f;
    .locals 2

    .prologue
    .line 631
    iget-boolean v0, p0, Lcom/google/a/k;->i:Z

    if-eqz v0, :cond_0

    .line 632
    const-string v0, ")]}\'\n"

    invoke-virtual {p1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 634
    :cond_0
    new-instance v0, Lcom/google/a/d/f;

    invoke-direct {v0, p1}, Lcom/google/a/d/f;-><init>(Ljava/io/Writer;)V

    .line 635
    iget-boolean v1, p0, Lcom/google/a/k;->j:Z

    if-eqz v1, :cond_1

    .line 636
    const-string v1, "  "

    invoke-virtual {v0, v1}, Lcom/google/a/d/f;->c(Ljava/lang/String;)V

    .line 638
    :cond_1
    iget-boolean v1, p0, Lcom/google/a/k;->g:Z

    invoke-virtual {v0, v1}, Lcom/google/a/d/f;->d(Z)V

    .line 639
    return-object v0
.end method

.method private a(Lcom/google/a/d/a;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/a/d/a;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    .line 788
    .line 789
    invoke-virtual {p1}, Lcom/google/a/d/a;->p()Z

    move-result v2

    .line 790
    invoke-virtual {p1, v1}, Lcom/google/a/d/a;->a(Z)V

    .line 792
    :try_start_0
    invoke-virtual {p1}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    .line 793
    const/4 v1, 0x0

    .line 794
    invoke-static {p2}, Lcom/google/a/c/a;->a(Ljava/lang/reflect/Type;)Lcom/google/a/c/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/a/k;->a(Lcom/google/a/c/a;)Lcom/google/a/am;

    move-result-object v0

    .line 795
    invoke-virtual {v0, p1}, Lcom/google/a/am;->a(Lcom/google/a/d/a;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 811
    invoke-virtual {p1, v2}, Lcom/google/a/d/a;->a(Z)V

    :goto_0
    return-object v0

    .line 796
    :catch_0
    move-exception v0

    .line 801
    if-eqz v1, :cond_0

    .line 811
    invoke-virtual {p1, v2}, Lcom/google/a/d/a;->a(Z)V

    const/4 v0, 0x0

    goto :goto_0

    .line 804
    :cond_0
    :try_start_1
    new-instance v1, Lcom/google/a/ag;

    invoke-direct {v1, v0}, Lcom/google/a/ag;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 811
    :catchall_0
    move-exception v0

    invoke-virtual {p1, v2}, Lcom/google/a/d/a;->a(Z)V

    throw v0

    .line 805
    :catch_1
    move-exception v0

    .line 806
    :try_start_2
    new-instance v1, Lcom/google/a/ag;

    invoke-direct {v1, v0}, Lcom/google/a/ag;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 807
    :catch_2
    move-exception v0

    .line 809
    new-instance v1, Lcom/google/a/ag;

    invoke-direct {v1, v0}, Lcom/google/a/ag;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0
.end method

.method static synthetic a(D)V
    .locals 4

    .prologue
    .line 98
    .line 6300
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6301
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialDoubleValues() method."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 98
    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/a/an;Lcom/google/a/c/a;)Lcom/google/a/am;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/a/an;",
            "Lcom/google/a/c/a",
            "<TT;>;)",
            "Lcom/google/a/am",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 413
    const/4 v0, 0x0

    .line 415
    iget-object v1, p0, Lcom/google/a/k;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v1, v0

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/a/an;

    .line 416
    if-nez v1, :cond_1

    .line 417
    if-ne v0, p1, :cond_0

    .line 418
    const/4 v0, 0x1

    move v1, v0

    goto :goto_0

    .line 423
    :cond_1
    invoke-interface {v0, p0, p2}, Lcom/google/a/an;->a(Lcom/google/a/k;Lcom/google/a/c/a;)Lcom/google/a/am;

    move-result-object v0

    .line 424
    if-eqz v0, :cond_0

    .line 425
    return-object v0

    .line 428
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "GSON cannot serialize "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final a(Lcom/google/a/c/a;)Lcom/google/a/am;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/a/c/a",
            "<TT;>;)",
            "Lcom/google/a/am",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 337
    iget-object v0, p0, Lcom/google/a/k;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/a/am;

    .line 338
    if-eqz v0, :cond_0

    .line 362
    :goto_0
    return-object v0

    .line 342
    :cond_0
    iget-object v0, p0, Lcom/google/a/k;->c:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 344
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/a/r;

    .line 345
    if-eqz v1, :cond_1

    move-object v0, v1

    .line 346
    goto :goto_0

    .line 349
    :cond_1
    new-instance v2, Lcom/google/a/r;

    invoke-direct {v2}, Lcom/google/a/r;-><init>()V

    .line 350
    invoke-interface {v0, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    :try_start_0
    iget-object v1, p0, Lcom/google/a/k;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/a/an;

    .line 353
    invoke-interface {v1, p0, p1}, Lcom/google/a/an;->a(Lcom/google/a/k;Lcom/google/a/c/a;)Lcom/google/a/am;

    move-result-object v1

    .line 354
    if-eqz v1, :cond_2

    .line 355
    invoke-virtual {v2, v1}, Lcom/google/a/r;->a(Lcom/google/a/am;)V

    .line 356
    iget-object v2, p0, Lcom/google/a/k;->d:Ljava/util/Map;

    invoke-interface {v2, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 362
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v1

    goto :goto_0

    .line 360
    :cond_3
    :try_start_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "GSON cannot handle "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 362
    :catchall_0
    move-exception v1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    throw v1
.end method

.method public final a(Ljava/lang/Class;)Lcom/google/a/am;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class",
            "<TT;>;)",
            "Lcom/google/a/am",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 438
    invoke-static {p1}, Lcom/google/a/c/a;->a(Ljava/lang/Class;)Lcom/google/a/c/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/a/k;->a(Lcom/google/a/c/a;)Lcom/google/a/am;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/google/a/x;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/a/x;",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    .prologue
    .line 832
    invoke-virtual {p0, p1, p2}, Lcom/google/a/k;->a(Lcom/google/a/x;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    .line 833
    invoke-static {p2}, Lcom/google/a/b/t;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/google/a/x;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/a/x;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 856
    if-nez p1, :cond_0

    .line 857
    const/4 v0, 0x0

    .line 859
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/a/b/a/g;

    invoke-direct {v0, p1}, Lcom/google/a/b/a/g;-><init>(Lcom/google/a/x;)V

    invoke-direct {p0, v0, p2}, Lcom/google/a/k;->a(Lcom/google/a/d/a;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class",
            "<TT;>;)TT;"
        }
    .end annotation

    .prologue
    .line 682
    invoke-virtual {p0, p1, p2}, Lcom/google/a/k;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    .line 683
    invoke-static {p2}, Lcom/google/a/b/t;->a(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    .prologue
    .line 706
    if-nez p1, :cond_1

    .line 707
    const/4 v0, 0x0

    .line 711
    :cond_0
    return-object v0

    .line 709
    :cond_1
    new-instance v0, Ljava/io/StringReader;

    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 5760
    new-instance v1, Lcom/google/a/d/a;

    invoke-direct {v1, v0}, Lcom/google/a/d/a;-><init>(Ljava/io/Reader;)V

    .line 5761
    invoke-direct {p0, v1, p2}, Lcom/google/a/k;->a(Lcom/google/a/d/a;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    .line 5768
    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v1}, Lcom/google/a/d/a;->f()Lcom/google/a/d/e;

    move-result-object v1

    sget-object v2, Lcom/google/a/d/e;->j:Lcom/google/a/d/e;

    if-eq v1, v2, :cond_0

    .line 5769
    new-instance v0, Lcom/google/a/y;

    const-string v1, "JSON document was not fully consumed."

    invoke-direct {v0, v1}, Lcom/google/a/y;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Lcom/google/a/d/h; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 5771
    :catch_0
    move-exception v0

    .line 5772
    new-instance v1, Lcom/google/a/ag;

    invoke-direct {v1, v0}, Lcom/google/a/ag;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 5773
    :catch_1
    move-exception v0

    .line 5774
    new-instance v1, Lcom/google/a/y;

    invoke-direct {v1, v0}, Lcom/google/a/y;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 8

    .prologue
    .line 497
    if-nez p1, :cond_0

    .line 498
    sget-object v3, Lcom/google/a/z;->a:Lcom/google/a/z;

    .line 2604
    new-instance v2, Ljava/io/StringWriter;

    invoke-direct {v2}, Ljava/io/StringWriter;-><init>()V

    .line 3072
    :try_start_0
    move-object v0, v2

    check-cast v0, Ljava/io/Writer;

    move-object v1, v0

    .line 2619
    invoke-direct {p0, v1}, Lcom/google/a/k;->a(Ljava/io/Writer;)Lcom/google/a/d/f;

    move-result-object v4

    .line 3647
    invoke-virtual {v4}, Lcom/google/a/d/f;->g()Z

    move-result v5

    .line 3648
    const/4 v1, 0x1

    invoke-virtual {v4, v1}, Lcom/google/a/d/f;->b(Z)V

    .line 3649
    invoke-virtual {v4}, Lcom/google/a/d/f;->h()Z

    move-result v6

    .line 3650
    iget-boolean v1, p0, Lcom/google/a/k;->h:Z

    invoke-virtual {v4, v1}, Lcom/google/a/d/f;->c(Z)V

    .line 3651
    invoke-virtual {v4}, Lcom/google/a/d/f;->i()Z

    move-result v7

    .line 3652
    iget-boolean v1, p0, Lcom/google/a/k;->g:Z

    invoke-virtual {v4, v1}, Lcom/google/a/d/f;->d(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 3654
    :try_start_1
    invoke-static {v3, v4}, Lcom/google/a/b/u;->a(Lcom/google/a/x;Lcom/google/a/d/f;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 3658
    :try_start_2
    invoke-virtual {v4, v5}, Lcom/google/a/d/f;->b(Z)V

    .line 3659
    invoke-virtual {v4, v6}, Lcom/google/a/d/f;->c(Z)V

    .line 3660
    invoke-virtual {v4, v7}, Lcom/google/a/d/f;->d(Z)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 2606
    invoke-virtual {v2}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v1

    .line 500
    :goto_0
    return-object v1

    .line 3655
    :catch_0
    move-exception v1

    .line 3656
    :try_start_3
    new-instance v2, Lcom/google/a/y;

    invoke-direct {v2, v1}, Lcom/google/a/y;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 3658
    :catchall_0
    move-exception v1

    :try_start_4
    invoke-virtual {v4, v5}, Lcom/google/a/d/f;->b(Z)V

    .line 3659
    invoke-virtual {v4, v6}, Lcom/google/a/d/f;->c(Z)V

    .line 3660
    invoke-virtual {v4, v7}, Lcom/google/a/d/f;->d(Z)V

    throw v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 2621
    :catch_1
    move-exception v1

    .line 2622
    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2

    .line 500
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lcom/google/a/k;->a(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0
.end method

.method public final a(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;
    .locals 8

    .prologue
    .line 519
    new-instance v2, Ljava/io/StringWriter;

    invoke-direct {v2}, Ljava/io/StringWriter;-><init>()V

    .line 5072
    :try_start_0
    move-object v0, v2

    check-cast v0, Ljava/io/Writer;

    move-object v1, v0

    .line 4564
    invoke-direct {p0, v1}, Lcom/google/a/k;->a(Ljava/io/Writer;)Lcom/google/a/d/f;

    move-result-object v3

    .line 5578
    invoke-static {p2}, Lcom/google/a/c/a;->a(Ljava/lang/reflect/Type;)Lcom/google/a/c/a;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/google/a/k;->a(Lcom/google/a/c/a;)Lcom/google/a/am;

    move-result-object v1

    .line 5579
    invoke-virtual {v3}, Lcom/google/a/d/f;->g()Z

    move-result v4

    .line 5580
    const/4 v5, 0x1

    invoke-virtual {v3, v5}, Lcom/google/a/d/f;->b(Z)V

    .line 5581
    invoke-virtual {v3}, Lcom/google/a/d/f;->h()Z

    move-result v5

    .line 5582
    iget-boolean v6, p0, Lcom/google/a/k;->h:Z

    invoke-virtual {v3, v6}, Lcom/google/a/d/f;->c(Z)V

    .line 5583
    invoke-virtual {v3}, Lcom/google/a/d/f;->i()Z

    move-result v6

    .line 5584
    iget-boolean v7, p0, Lcom/google/a/k;->g:Z

    invoke-virtual {v3, v7}, Lcom/google/a/d/f;->d(Z)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    .line 5586
    :try_start_1
    invoke-virtual {v1, v3, p1}, Lcom/google/a/am;->a(Lcom/google/a/d/f;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 5590
    :try_start_2
    invoke-virtual {v3, v4}, Lcom/google/a/d/f;->b(Z)V

    .line 5591
    invoke-virtual {v3, v5}, Lcom/google/a/d/f;->c(Z)V

    .line 5592
    invoke-virtual {v3, v6}, Lcom/google/a/d/f;->d(Z)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 521
    invoke-virtual {v2}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1

    .line 5587
    :catch_0
    move-exception v1

    .line 5588
    :try_start_3
    new-instance v2, Lcom/google/a/y;

    invoke-direct {v2, v1}, Lcom/google/a/y;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 5590
    :catchall_0
    move-exception v1

    :try_start_4
    invoke-virtual {v3, v4}, Lcom/google/a/d/f;->b(Z)V

    .line 5591
    invoke-virtual {v3, v5}, Lcom/google/a/d/f;->c(Z)V

    .line 5592
    invoke-virtual {v3, v6}, Lcom/google/a/d/f;->d(Z)V

    throw v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 4566
    :catch_1
    move-exception v1

    .line 4567
    new-instance v2, Lcom/google/a/y;

    invoke-direct {v2, v1}, Lcom/google/a/y;-><init>(Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 889
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{serializeNulls:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/google/a/k;->g:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "factories:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/a/k;->e:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",instanceCreators:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/google/a/k;->f:Lcom/google/a/b/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 894
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
