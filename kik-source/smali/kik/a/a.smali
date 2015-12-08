.class public final Lkik/a/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkik/a/aa;
.implements Lkik/a/ab;


# static fields
.field protected static final a:Ljava/lang/Object;


# instance fields
.field private A:Lkik/a/e/c;

.field private B:Lcom/kik/g/p;

.field private C:Lcom/kik/g/p;

.field protected b:Z

.field protected c:Lkik/a/e/o;

.field protected d:Lkik/a/e/d;

.field protected e:Lkik/a/e/t;

.field protected f:Lkik/a/e/k;

.field protected g:Lkik/a/e/v;

.field protected h:Lkik/a/e/f;

.field protected i:Lkik/a/e/l;

.field protected j:Lkik/a/e/n;

.field protected k:Lkik/a/f/k;

.field protected l:Lkik/a/e/w;

.field protected m:Lkik/a/g/v;

.field protected n:Lkik/a/e/b;

.field protected o:Lkik/a/e/e;

.field protected p:Lkik/a/e/i;

.field protected q:Lkik/a/e/u;

.field protected r:Lkik/a/i/h;

.field protected s:Lkik/a/e/m;

.field protected t:Lkik/a/j/o;

.field protected u:Lcom/kik/g/f;

.field private v:Lcom/kik/g/k;

.field private w:Lcom/kik/g/k;

.field private x:Lcom/kik/g/k;

.field private final y:Ljava/lang/String;

.field private final z:Lcom/kik/g/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 115
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lkik/a/a;->a:Ljava/lang/Object;

    return-void
.end method

.method protected constructor <init>()V
    .locals 1

    .prologue
    .line 159
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkik/a/a;-><init>(Ljava/lang/String;)V

    .line 160
    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 163
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/a/a;->b:Z

    .line 139
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lkik/a/a;->z:Lcom/kik/g/k;

    .line 144
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    iput-object v0, p0, Lkik/a/a;->B:Lcom/kik/g/p;

    .line 145
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    iput-object v0, p0, Lkik/a/a;->C:Lcom/kik/g/p;

    .line 164
    iput-object p1, p0, Lkik/a/a;->y:Ljava/lang/String;

    .line 165
    return-void
.end method


# virtual methods
.method public final a()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lkik/a/a;->v:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lkik/a/c;)V
    .locals 16

    .prologue
    .line 296
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v6

    .line 298
    new-instance v1, Lcom/kik/g/a;

    move-object/from16 v0, p0

    invoke-direct {v1, v0, v6}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    move-object/from16 v0, p0

    iput-object v1, v0, Lkik/a/a;->v:Lcom/kik/g/k;

    .line 299
    new-instance v1, Lcom/kik/g/a;

    move-object/from16 v0, p0

    invoke-direct {v1, v0, v6}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    move-object/from16 v0, p0

    iput-object v1, v0, Lkik/a/a;->w:Lcom/kik/g/k;

    .line 300
    new-instance v1, Lcom/kik/g/a;

    move-object/from16 v0, p0

    invoke-direct {v1, v0, v6}, Lcom/kik/g/a;-><init>(Ljava/lang/Object;Ljava/util/concurrent/ExecutorService;)V

    move-object/from16 v0, p0

    iput-object v1, v0, Lkik/a/a;->x:Lcom/kik/g/k;

    .line 302
    new-instance v1, Lcom/kik/g/f;

    invoke-direct {v1}, Lcom/kik/g/f;-><init>()V

    move-object/from16 v0, p0

    iput-object v1, v0, Lkik/a/a;->u:Lcom/kik/g/f;

    .line 304
    new-instance v1, Lkik/a/b/a;

    invoke-direct {v1}, Lkik/a/b/a;-><init>()V

    move-object/from16 v0, p0

    iput-object v1, v0, Lkik/a/a;->c:Lkik/a/e/o;

    .line 306
    invoke-virtual/range {p1 .. p1}, Lkik/a/c;->e()Lkik/a/f/k;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lkik/a/a;->k:Lkik/a/f/k;

    .line 307
    invoke-virtual/range {p1 .. p1}, Lkik/a/c;->c()Lkik/a/e/t;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lkik/a/a;->e:Lkik/a/e/t;

    .line 308
    move-object/from16 v0, p0

    iget-object v1, v0, Lkik/a/a;->e:Lkik/a/e/t;

    invoke-interface {v1}, Lkik/a/e/t;->a()V

    .line 309
    invoke-virtual/range {p1 .. p1}, Lkik/a/c;->b()Lkik/a/e/k;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lkik/a/a;->f:Lkik/a/e/k;

    .line 310
    move-object/from16 v0, p0

    iget-object v1, v0, Lkik/a/a;->f:Lkik/a/e/k;

    move-object/from16 v0, p0

    invoke-interface {v1, v6, v0}, Lkik/a/e/k;->a(Ljava/util/concurrent/ExecutorService;Lkik/a/a;)V

    .line 311
    move-object/from16 v0, p0

    iget-object v1, v0, Lkik/a/a;->e:Lkik/a/e/t;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/a/a;->k:Lkik/a/f/k;

    move-object/from16 v0, p1

    invoke-virtual {v0, v1, v6, v2}, Lkik/a/c;->a(Lkik/a/e/t;Ljava/util/concurrent/ExecutorService;Lkik/a/f/k;)Lkik/a/e/v;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lkik/a/a;->g:Lkik/a/e/v;

    .line 312
    invoke-virtual/range {p1 .. p1}, Lkik/a/c;->a()Lkik/a/e/f;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lkik/a/a;->h:Lkik/a/e/f;

    .line 316
    move-object/from16 v0, p0

    iget-object v1, v0, Lkik/a/a;->h:Lkik/a/e/f;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/a/a;->k:Lkik/a/f/k;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/a/a;->c:Lkik/a/e/o;

    invoke-interface {v1, v6, v2, v3}, Lkik/a/e/f;->a(Ljava/util/concurrent/ExecutorService;Lkik/a/f/k;Lkik/a/e/o;)V

    .line 317
    move-object/from16 v0, p0

    iget-object v1, v0, Lkik/a/a;->g:Lkik/a/e/v;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/a/a;->h:Lkik/a/e/f;

    move-object/from16 v0, p1

    invoke-virtual {v0, v1, v2}, Lkik/a/c;->a(Lkik/a/e/v;Lkik/a/e/f;)Lkik/a/e/w;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lkik/a/a;->l:Lkik/a/e/w;

    .line 318
    move-object/from16 v0, p0

    iget-object v1, v0, Lkik/a/a;->l:Lkik/a/e/w;

    invoke-interface {v1, v6}, Lkik/a/e/w;->a(Ljava/util/concurrent/ExecutorService;)V

    .line 319
    new-instance v1, Lkik/a/g/v;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/a/a;->g:Lkik/a/e/v;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/a/a;->h:Lkik/a/e/f;

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/a/a;->f:Lkik/a/e/k;

    invoke-direct {v1, v2, v3, v4, v6}, Lkik/a/g/v;-><init>(Lkik/a/e/v;Lkik/a/e/f;Lkik/a/e/k;Ljava/util/concurrent/ExecutorService;)V

    move-object/from16 v0, p0

    iput-object v1, v0, Lkik/a/a;->m:Lkik/a/g/v;

    .line 320
    move-object/from16 v0, p0

    iget-object v1, v0, Lkik/a/a;->m:Lkik/a/g/v;

    invoke-virtual {v1}, Lkik/a/g/v;->l()V

    .line 321
    new-instance v1, Lkik/a/g/b;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/a/a;->m:Lkik/a/g/v;

    invoke-virtual {v2}, Lkik/a/g/v;->n()Ljava/util/Map;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/a/a;->m:Lkik/a/g/v;

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/a/a;->h:Lkik/a/e/f;

    move-object/from16 v0, p0

    iget-object v5, v0, Lkik/a/a;->g:Lkik/a/e/v;

    invoke-direct/range {v1 .. v6}, Lkik/a/g/b;-><init>(Ljava/util/Map;Lkik/a/e/r;Lkik/a/e/f;Lkik/a/e/v;Ljava/util/concurrent/ExecutorService;)V

    move-object/from16 v0, p0

    iput-object v1, v0, Lkik/a/a;->i:Lkik/a/e/l;

    .line 322
    new-instance v1, Lkik/a/c/b;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/a/a;->g:Lkik/a/e/v;

    invoke-direct {v1, v2}, Lkik/a/c/b;-><init>(Lkik/a/e/v;)V

    move-object/from16 v0, p0

    iput-object v1, v0, Lkik/a/a;->j:Lkik/a/e/n;

    .line 323
    move-object/from16 v0, p0

    iget-object v1, v0, Lkik/a/a;->g:Lkik/a/e/v;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/a/a;->h:Lkik/a/e/f;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/a/a;->l:Lkik/a/e/w;

    move-object/from16 v0, p1

    invoke-virtual {v0, v1, v2, v3}, Lkik/a/c;->a(Lkik/a/e/v;Lkik/a/e/f;Lkik/a/e/w;)Lkik/a/e/b;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lkik/a/a;->n:Lkik/a/e/b;

    .line 324
    move-object/from16 v0, p0

    iget-object v1, v0, Lkik/a/a;->g:Lkik/a/e/v;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/a/a;->h:Lkik/a/e/f;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/a/a;->k:Lkik/a/f/k;

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/a/a;->z:Lcom/kik/g/k;

    invoke-virtual {v4}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v4

    move-object/from16 v0, p1

    invoke-virtual {v0, v1, v2, v3, v4}, Lkik/a/c;->a(Lkik/a/e/v;Lkik/a/e/f;Lkik/a/f/k;Lcom/kik/g/e;)Lkik/a/e/e;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lkik/a/a;->o:Lkik/a/e/e;

    .line 325
    move-object/from16 v0, p0

    iget-object v8, v0, Lkik/a/a;->h:Lkik/a/e/f;

    move-object/from16 v0, p0

    iget-object v9, v0, Lkik/a/a;->m:Lkik/a/g/v;

    move-object/from16 v0, p0

    iget-object v10, v0, Lkik/a/a;->g:Lkik/a/e/v;

    move-object/from16 v0, p0

    iget-object v11, v0, Lkik/a/a;->c:Lkik/a/e/o;

    move-object/from16 v0, p0

    iget-object v12, v0, Lkik/a/a;->m:Lkik/a/g/v;

    move-object/from16 v0, p0

    iget-object v13, v0, Lkik/a/a;->l:Lkik/a/e/w;

    move-object/from16 v0, p0

    iget-object v14, v0, Lkik/a/a;->i:Lkik/a/e/l;

    move-object/from16 v7, p1

    move-object v15, v6

    invoke-virtual/range {v7 .. v15}, Lkik/a/c;->a(Lkik/a/e/f;Lkik/a/e/r;Lkik/a/e/v;Lkik/a/e/o;Lkik/a/e/p;Lkik/a/e/w;Lkik/a/e/l;Ljava/util/concurrent/ExecutorService;)Lkik/a/e/i;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lkik/a/a;->p:Lkik/a/e/i;

    .line 326
    move-object/from16 v0, p0

    iget-object v1, v0, Lkik/a/a;->m:Lkik/a/g/v;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/a/a;->p:Lkik/a/e/i;

    invoke-interface {v2}, Lkik/a/e/i;->e()Lcom/kik/g/e;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkik/a/g/v;->a(Lcom/kik/g/e;)V

    .line 327
    move-object/from16 v0, p0

    iget-object v1, v0, Lkik/a/a;->p:Lkik/a/e/i;

    invoke-interface {v1}, Lkik/a/e/i;->y()V

    .line 328
    move-object/from16 v0, p0

    iget-object v1, v0, Lkik/a/a;->i:Lkik/a/e/l;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/a/a;->p:Lkik/a/e/i;

    invoke-interface {v1, v2}, Lkik/a/e/l;->a(Lkik/a/e/i;)V

    .line 330
    move-object/from16 v0, p0

    iget-object v1, v0, Lkik/a/a;->u:Lcom/kik/g/f;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/a/a;->l:Lkik/a/e/w;

    invoke-interface {v2}, Lkik/a/e/w;->c()Lcom/kik/g/e;

    move-result-object v2

    new-instance v3, Lkik/a/b;

    move-object/from16 v0, p0

    invoke-direct {v3, v0}, Lkik/a/b;-><init>(Lkik/a/a;)V

    invoke-virtual {v1, v2, v3}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 341
    move-object/from16 v0, p0

    iget-object v1, v0, Lkik/a/a;->h:Lkik/a/e/f;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/a/a;->g:Lkik/a/e/v;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/a/a;->e:Lkik/a/e/t;

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/a/a;->l:Lkik/a/e/w;

    move-object/from16 v0, p1

    invoke-virtual {v0, v1, v2, v3, v4}, Lkik/a/c;->a(Lkik/a/e/f;Lkik/a/e/v;Lkik/a/e/t;Lkik/a/e/w;)Lkik/a/e/d;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lkik/a/a;->d:Lkik/a/e/d;

    .line 342
    invoke-virtual/range {p1 .. p1}, Lkik/a/c;->g()Lkik/a/e/c;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lkik/a/a;->A:Lkik/a/e/c;

    .line 344
    new-instance v1, Lkik/a/j/o;

    invoke-direct {v1}, Lkik/a/j/o;-><init>()V

    move-object/from16 v0, p0

    iput-object v1, v0, Lkik/a/a;->t:Lkik/a/j/o;

    .line 346
    move-object/from16 v0, p0

    iget-object v1, v0, Lkik/a/a;->t:Lkik/a/j/o;

    invoke-virtual/range {p1 .. p1}, Lkik/a/c;->f()Lkik/a/e/x;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/a/a;->h:Lkik/a/e/f;

    invoke-virtual {v1, v2, v3}, Lkik/a/j/o;->a(Lkik/a/e/x;Lkik/a/e/f;)V

    .line 347
    move-object/from16 v0, p0

    iget-object v1, v0, Lkik/a/a;->c:Lkik/a/e/o;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/a/a;->t:Lkik/a/j/o;

    invoke-interface {v1, v2}, Lkik/a/e/o;->a(Lkik/a/j/m;)V

    .line 349
    new-instance v1, Lkik/a/i/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/a/a;->t:Lkik/a/j/o;

    invoke-direct {v1, v2}, Lkik/a/i/a;-><init>(Lkik/a/j/n;)V

    move-object/from16 v0, p0

    iput-object v1, v0, Lkik/a/a;->r:Lkik/a/i/h;

    .line 350
    new-instance v1, Lkik/a/c/a;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/a/a;->g:Lkik/a/e/v;

    invoke-direct {v1, v2}, Lkik/a/c/a;-><init>(Lkik/a/e/v;)V

    move-object/from16 v0, p0

    iput-object v1, v0, Lkik/a/a;->s:Lkik/a/e/m;

    .line 352
    move-object/from16 v0, p0

    iget-object v1, v0, Lkik/a/a;->h:Lkik/a/e/f;

    move-object/from16 v0, p1

    invoke-virtual {v0, v1}, Lkik/a/c;->a(Lkik/a/e/f;)Lkik/a/e/u;

    move-result-object v1

    move-object/from16 v0, p0

    iput-object v1, v0, Lkik/a/a;->q:Lkik/a/e/u;

    .line 353
    move-object/from16 v0, p0

    iget-object v1, v0, Lkik/a/a;->q:Lkik/a/e/u;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/a/a;->t:Lkik/a/j/o;

    invoke-interface {v1, v2}, Lkik/a/e/u;->a(Lkik/a/j/n;)V

    .line 354
    move-object/from16 v0, p0

    iget-object v1, v0, Lkik/a/a;->A:Lkik/a/e/c;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/a/a;->t:Lkik/a/j/o;

    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/a/a;->g:Lkik/a/e/v;

    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/a/a;->C:Lcom/kik/g/p;

    move-object/from16 v0, p0

    iget-object v5, v0, Lkik/a/a;->l:Lkik/a/e/w;

    invoke-interface {v5}, Lkik/a/e/w;->h()Lcom/kik/g/p;

    move-result-object v5

    invoke-interface {v1, v2, v3, v4, v5}, Lkik/a/e/c;->a(Lkik/a/j/n;Lkik/a/e/v;Lcom/kik/g/p;Lcom/kik/g/p;)V

    .line 355
    move-object/from16 v0, p0

    iget-object v1, v0, Lkik/a/a;->n:Lkik/a/e/b;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/a/a;->A:Lkik/a/e/c;

    invoke-interface {v1, v2}, Lkik/a/e/b;->a(Lkik/a/e/c;)V

    .line 356
    move-object/from16 v0, p0

    iget-object v1, v0, Lkik/a/a;->o:Lkik/a/e/e;

    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/a/a;->t:Lkik/a/j/o;

    invoke-interface {v1, v2}, Lkik/a/e/e;->a(Lkik/a/j/n;)V

    .line 358
    const/4 v1, 0x1

    move-object/from16 v0, p0

    iput-boolean v1, v0, Lkik/a/a;->b:Z

    .line 359
    move-object/from16 v0, p0

    iget-object v1, v0, Lkik/a/a;->g:Lkik/a/e/v;

    invoke-interface {v1}, Lkik/a/e/v;->e()V

    .line 362
    move-object/from16 v0, p0

    iget-object v1, v0, Lkik/a/a;->g:Lkik/a/e/v;

    invoke-static {v1}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v1

    .line 364
    if-eqz v1, :cond_0

    .line 365
    invoke-virtual {v1}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v2

    invoke-virtual {v1}, Lkik/a/z;->d()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v1, v3}, Lkik/a/a;->a(Lkik/a/d/j;Ljava/lang/String;Z)V

    .line 370
    :cond_0
    move-object/from16 v0, p0

    iget-object v1, v0, Lkik/a/a;->p:Lkik/a/e/i;

    invoke-interface {v1}, Lkik/a/e/i;->w()V

    .line 371
    return-void
.end method

.method public final a(Lkik/a/d/j;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 376
    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lkik/a/a;->a(Lkik/a/d/j;Ljava/lang/String;Z)V

    .line 377
    return-void
.end method

.method public final a(Lkik/a/d/j;Ljava/lang/String;Z)V
    .locals 8

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 382
    iget-object v0, p0, Lkik/a/a;->l:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v5

    .line 384
    iget-object v0, p0, Lkik/a/a;->g:Lkik/a/e/v;

    invoke-static {v0}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v0

    .line 385
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lkik/a/z;->c()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lkik/a/z;->b()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_5

    :cond_0
    move v4, v3

    .line 386
    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lkik/a/z;->d()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Lkik/a/z;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    :cond_1
    move v1, v3

    .line 389
    :goto_1
    if-nez v4, :cond_2

    if-eqz v1, :cond_3

    .line 391
    :cond_2
    iget-object v0, v5, Lkik/a/d/aa;->c:Ljava/lang/String;

    iget-object v1, v5, Lkik/a/d/aa;->a:Ljava/lang/String;

    iget-object v4, p0, Lkik/a/a;->g:Lkik/a/e/v;

    const-string v6, "niCRwL7isZHny24qgLvy"

    invoke-static {p2, v0, v6}, Lkik/a/h/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v0

    const-string v6, "niCRwL7isZHny24qgLvy"

    invoke-static {p2, v1, v6}, Lkik/a/h/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v1

    const-string v6, "CredentialData.jid"

    invoke-virtual {p1}, Lkik/a/d/j;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v4, v6, v7}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    const-string v6, "CredentialData.password"

    invoke-interface {v4, v6, p2}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    const-string v6, "CredentialData.username_passkey"

    invoke-static {v0}, Lkik/a/h/i;->a([B)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v4, v6, v0}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    const-string v0, "CredentialData.email_passkey"

    invoke-static {v1}, Lkik/a/h/i;->a([B)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Lkik/a/e/v;->c(Ljava/lang/String;Ljava/lang/String;)Z

    .line 394
    iget-object v0, p0, Lkik/a/a;->g:Lkik/a/e/v;

    invoke-static {v0}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v0

    .line 397
    :cond_3
    if-eqz v0, :cond_4

    .line 398
    iget-object v1, p0, Lkik/a/a;->h:Lkik/a/e/f;

    invoke-interface {v1}, Lkik/a/e/f;->b()Lcom/kik/g/e;

    move-result-object v1

    invoke-static {v1}, Lcom/kik/g/s;->b(Lcom/kik/g/e;)Lcom/kik/g/p;

    move-result-object v1

    .line 400
    iget-object v4, p0, Lkik/a/a;->B:Lcom/kik/g/p;

    invoke-static {v1, v4}, Lcom/kik/g/s;->a(Lcom/kik/g/p;Lcom/kik/g/p;)Lcom/kik/g/aq;

    move-result-object v1

    iget-object v4, p0, Lkik/a/a;->C:Lcom/kik/g/p;

    invoke-static {v1, v4}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/p;)Lcom/kik/g/p;

    .line 402
    iget-object v1, p0, Lkik/a/a;->h:Lkik/a/e/f;

    invoke-interface {v1, v0}, Lkik/a/e/f;->a(Lkik/a/z;)V

    .line 403
    iget-object v1, p0, Lkik/a/a;->t:Lkik/a/j/o;

    iget-object v4, v5, Lkik/a/d/aa;->c:Ljava/lang/String;

    invoke-virtual {v1, v0, v4}, Lkik/a/j/o;->a(Lkik/a/z;Ljava/lang/String;)V

    .line 405
    if-eqz p3, :cond_7

    .line 407
    iget-object v1, p0, Lkik/a/a;->c:Lkik/a/e/o;

    invoke-interface {v1, v3}, Lkik/a/e/o;->a(Z)Lcom/kik/g/p;

    .line 413
    :goto_2
    iget-object v1, p0, Lkik/a/a;->z:Lcom/kik/g/k;

    invoke-virtual {v1, v0}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 415
    iget-object v1, p0, Lkik/a/a;->B:Lcom/kik/g/p;

    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    .line 416
    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Object;)Lcom/kik/g/p;

    move-result-object v0

    iput-object v0, p0, Lkik/a/a;->B:Lcom/kik/g/p;

    .line 418
    :cond_4
    return-void

    :cond_5
    move v4, v2

    .line 385
    goto/16 :goto_0

    :cond_6
    move v1, v2

    .line 386
    goto :goto_1

    .line 410
    :cond_7
    iget-object v1, p0, Lkik/a/a;->c:Lkik/a/e/o;

    invoke-interface {v1, v2}, Lkik/a/e/o;->a(Z)Lcom/kik/g/p;

    goto :goto_2
.end method

.method public final b()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lkik/a/a;->w:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lkik/a/a;->x:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lcom/kik/g/p;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lkik/a/a;->C:Lcom/kik/g/p;

    return-object v0
.end method

.method public final e()V
    .locals 2

    .prologue
    .line 100
    iget-object v0, p0, Lkik/a/a;->w:Lcom/kik/g/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 101
    return-void
.end method

.method public final f()V
    .locals 2

    .prologue
    .line 106
    iget-object v0, p0, Lkik/a/a;->v:Lcom/kik/g/k;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    .line 107
    return-void
.end method

.method public final g()Z
    .locals 1

    .prologue
    .line 169
    iget-boolean v0, p0, Lkik/a/a;->b:Z

    return v0
.end method

.method public final h()Lkik/a/e/f;
    .locals 1

    .prologue
    .line 174
    iget-object v0, p0, Lkik/a/a;->h:Lkik/a/e/f;

    return-object v0
.end method

.method public final i()Lkik/a/e/t;
    .locals 1

    .prologue
    .line 179
    iget-object v0, p0, Lkik/a/a;->e:Lkik/a/e/t;

    return-object v0
.end method

.method public final j()Lkik/a/f/k;
    .locals 1

    .prologue
    .line 184
    iget-object v0, p0, Lkik/a/a;->k:Lkik/a/f/k;

    return-object v0
.end method

.method public final k()Lkik/a/e/v;
    .locals 1

    .prologue
    .line 189
    iget-object v0, p0, Lkik/a/a;->g:Lkik/a/e/v;

    return-object v0
.end method

.method public final l()Lkik/a/e/w;
    .locals 1

    .prologue
    .line 194
    iget-object v0, p0, Lkik/a/a;->l:Lkik/a/e/w;

    return-object v0
.end method

.method public final m()Lkik/a/e/b;
    .locals 1

    .prologue
    .line 199
    iget-object v0, p0, Lkik/a/a;->n:Lkik/a/e/b;

    return-object v0
.end method

.method public final n()Lkik/a/e/e;
    .locals 1

    .prologue
    .line 204
    iget-object v0, p0, Lkik/a/a;->o:Lkik/a/e/e;

    return-object v0
.end method

.method public final o()Lkik/a/e/i;
    .locals 1

    .prologue
    .line 209
    iget-object v0, p0, Lkik/a/a;->p:Lkik/a/e/i;

    return-object v0
.end method

.method public final p()Lkik/a/e/d;
    .locals 1

    .prologue
    .line 214
    iget-object v0, p0, Lkik/a/a;->d:Lkik/a/e/d;

    return-object v0
.end method

.method public final q()Lkik/a/e/r;
    .locals 1

    .prologue
    .line 219
    iget-object v0, p0, Lkik/a/a;->m:Lkik/a/g/v;

    return-object v0
.end method

.method public final r()Lkik/a/e/l;
    .locals 1

    .prologue
    .line 224
    iget-object v0, p0, Lkik/a/a;->i:Lkik/a/e/l;

    return-object v0
.end method

.method public final s()Lkik/a/e/n;
    .locals 1

    .prologue
    .line 229
    iget-object v0, p0, Lkik/a/a;->j:Lkik/a/e/n;

    return-object v0
.end method

.method public final t()Lkik/a/e/o;
    .locals 1

    .prologue
    .line 234
    iget-object v0, p0, Lkik/a/a;->c:Lkik/a/e/o;

    return-object v0
.end method

.method public final u()Lkik/a/e/u;
    .locals 1

    .prologue
    .line 244
    iget-object v0, p0, Lkik/a/a;->q:Lkik/a/e/u;

    return-object v0
.end method

.method public final v()Lkik/a/i/h;
    .locals 1

    .prologue
    .line 249
    iget-object v0, p0, Lkik/a/a;->r:Lkik/a/i/h;

    return-object v0
.end method

.method public final w()Lkik/a/e/m;
    .locals 1

    .prologue
    .line 254
    iget-object v0, p0, Lkik/a/a;->s:Lkik/a/e/m;

    return-object v0
.end method

.method public final x()Lkik/a/j/m;
    .locals 1

    .prologue
    .line 259
    iget-object v0, p0, Lkik/a/a;->t:Lkik/a/j/o;

    return-object v0
.end method

.method public final y()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 264
    iget-object v0, p0, Lkik/a/a;->l:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    .line 265
    iget-object v1, p0, Lkik/a/a;->g:Lkik/a/e/v;

    .line 266
    iget-object v2, p0, Lkik/a/a;->p:Lkik/a/e/i;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lkik/a/a;->p:Lkik/a/e/i;

    invoke-interface {v2}, Lkik/a/e/i;->z()V

    :cond_0
    iget-object v2, p0, Lkik/a/a;->n:Lkik/a/e/b;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lkik/a/a;->n:Lkik/a/e/b;

    invoke-interface {v2}, Lkik/a/e/b;->a()V

    :cond_1
    iget-object v2, p0, Lkik/a/a;->m:Lkik/a/g/v;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lkik/a/a;->m:Lkik/a/g/v;

    invoke-virtual {v2}, Lkik/a/g/v;->k()V

    :cond_2
    iget-object v2, p0, Lkik/a/a;->l:Lkik/a/e/w;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lkik/a/a;->l:Lkik/a/e/w;

    invoke-interface {v2}, Lkik/a/e/w;->i()V

    :cond_3
    iget-object v2, p0, Lkik/a/a;->h:Lkik/a/e/f;

    if-eqz v2, :cond_4

    iget-object v2, p0, Lkik/a/a;->h:Lkik/a/e/f;

    invoke-interface {v2}, Lkik/a/e/f;->n()V

    :cond_4
    iget-object v2, p0, Lkik/a/a;->g:Lkik/a/e/v;

    if-eqz v2, :cond_5

    iget-object v2, p0, Lkik/a/a;->g:Lkik/a/e/v;

    invoke-interface {v2}, Lkik/a/e/v;->k()V

    :cond_5
    iget-object v2, p0, Lkik/a/a;->f:Lkik/a/e/k;

    if-eqz v2, :cond_6

    iget-object v2, p0, Lkik/a/a;->f:Lkik/a/e/k;

    invoke-interface {v2}, Lkik/a/e/k;->b()V

    :cond_6
    iget-object v2, p0, Lkik/a/a;->t:Lkik/a/j/o;

    if-eqz v2, :cond_7

    iget-object v2, p0, Lkik/a/a;->t:Lkik/a/j/o;

    invoke-virtual {v2}, Lkik/a/j/o;->c()V

    :cond_7
    iget-object v2, p0, Lkik/a/a;->d:Lkik/a/e/d;

    if-eqz v2, :cond_8

    iget-object v2, p0, Lkik/a/a;->d:Lkik/a/e/d;

    invoke-interface {v2}, Lkik/a/e/d;->a()V

    :cond_8
    iget-object v2, p0, Lkik/a/a;->i:Lkik/a/e/l;

    if-eqz v2, :cond_9

    iget-object v2, p0, Lkik/a/a;->i:Lkik/a/e/l;

    invoke-interface {v2}, Lkik/a/e/l;->f()V

    :cond_9
    iput-object v3, p0, Lkik/a/a;->p:Lkik/a/e/i;

    iput-object v3, p0, Lkik/a/a;->m:Lkik/a/g/v;

    iput-object v3, p0, Lkik/a/a;->l:Lkik/a/e/w;

    iput-object v3, p0, Lkik/a/a;->h:Lkik/a/e/f;

    iput-object v3, p0, Lkik/a/a;->g:Lkik/a/e/v;

    iput-object v3, p0, Lkik/a/a;->f:Lkik/a/e/k;

    iput-object v3, p0, Lkik/a/a;->k:Lkik/a/f/k;

    iput-object v3, p0, Lkik/a/a;->q:Lkik/a/e/u;

    iput-object v3, p0, Lkik/a/a;->c:Lkik/a/e/o;

    iput-object v3, p0, Lkik/a/a;->t:Lkik/a/j/o;

    iput-object v3, p0, Lkik/a/a;->e:Lkik/a/e/t;

    iput-object v3, p0, Lkik/a/a;->i:Lkik/a/e/l;

    iput-object v3, p0, Lkik/a/a;->j:Lkik/a/e/n;

    const/4 v2, 0x0

    iput-boolean v2, p0, Lkik/a/a;->b:Z

    .line 267
    invoke-interface {v1, v0}, Lkik/a/e/v;->a(Lkik/a/d/aa;)V

    .line 268
    return-void
.end method

.method public final z()Lkik/a/e/k;
    .locals 1

    .prologue
    .line 272
    iget-object v0, p0, Lkik/a/a;->f:Lkik/a/e/k;

    return-object v0
.end method
