.class public final Lcom/roidapp/videolib/b/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;


# static fields
.field static final a:[F


# instance fields
.field private A:J

.field private B:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private C:J

.field private D:J

.field private E:Landroid/os/Handler;

.field private F:J

.field private G:I

.field private H:Z

.field private I:Z

.field private J:Z

.field public final b:Ljava/lang/Object;

.field public c:Z

.field private d:Lcom/roidapp/videolib/b/m;

.field private e:I

.field private final f:Ljava/nio/FloatBuffer;

.field private final g:Ljava/nio/FloatBuffer;

.field private final h:Ljava/nio/FloatBuffer;

.field private i:I

.field private j:I

.field private k:I

.field private l:I

.field private m:F

.field private final n:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue",
            "<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private p:I

.field private q:Z

.field private r:Z

.field private s:I

.field private t:Lcom/roidapp/videolib/gl/f;

.field private u:J

.field private v:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private w:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private x:Ljava/lang/String;

.field private y:Z

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const/16 v0, 0x8

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    sput-object v0, Lcom/roidapp/videolib/b/i;->a:[F

    return-void

    :array_0
    .array-data 4
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        -0x40800000    # -1.0f
        -0x40800000    # -1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(Lcom/roidapp/videolib/b/m;)V
    .locals 6

    .prologue
    const-wide/16 v4, 0x0

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/i;->b:Ljava/lang/Object;

    .line 35
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/videolib/b/i;->e:I

    .line 44
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/roidapp/videolib/b/i;->m:F

    .line 52
    sget v0, Lcom/roidapp/videolib/b/j;->a:I

    iput v0, p0, Lcom/roidapp/videolib/b/i;->s:I

    .line 56
    iput-boolean v2, p0, Lcom/roidapp/videolib/b/i;->c:Z

    .line 60
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/roidapp/videolib/b/i;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 61
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/roidapp/videolib/b/i;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/videolib/b/i;->x:Ljava/lang/String;

    .line 65
    iput v3, p0, Lcom/roidapp/videolib/b/i;->z:I

    .line 66
    const-wide/16 v0, 0x96

    iput-wide v0, p0, Lcom/roidapp/videolib/b/i;->A:J

    .line 67
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/roidapp/videolib/b/i;->B:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 136
    iput-wide v4, p0, Lcom/roidapp/videolib/b/i;->C:J

    .line 144
    iput-wide v4, p0, Lcom/roidapp/videolib/b/i;->D:J

    .line 361
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/videolib/b/i;->E:Landroid/os/Handler;

    .line 371
    iput-wide v4, p0, Lcom/roidapp/videolib/b/i;->F:J

    .line 372
    iput v2, p0, Lcom/roidapp/videolib/b/i;->G:I

    .line 373
    iput-boolean v3, p0, Lcom/roidapp/videolib/b/i;->H:Z

    .line 374
    iput-boolean v2, p0, Lcom/roidapp/videolib/b/i;->I:Z

    .line 430
    iput-boolean v2, p0, Lcom/roidapp/videolib/b/i;->J:Z

    .line 70
    iput-object p1, p0, Lcom/roidapp/videolib/b/i;->d:Lcom/roidapp/videolib/b/m;

    .line 71
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/i;->n:Ljava/util/Queue;

    .line 72
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/i;->o:Ljava/util/Queue;

    .line 74
    sget-object v0, Lcom/roidapp/videolib/b/i;->a:[F

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/videolib/b/i;->f:Ljava/nio/FloatBuffer;

    .line 76
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->f:Ljava/nio/FloatBuffer;

    sget-object v1, Lcom/roidapp/videolib/b/i;->a:[F

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 78
    sget-object v0, Ljp/co/cyberagent/android/a/a/a;->a:[F

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/videolib/b/i;->g:Ljava/nio/FloatBuffer;

    .line 82
    sget-object v0, Ljp/co/cyberagent/android/a/a/a;->a:[F

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/videolib/b/i;->h:Ljava/nio/FloatBuffer;

    .line 87
    sget v0, Ljp/co/cyberagent/android/a/an;->a:I

    invoke-static {v0, v2, v3}, Ljp/co/cyberagent/android/a/a/a;->a(IZZ)[F

    move-result-object v0

    .line 89
    iget-object v1, p0, Lcom/roidapp/videolib/b/i;->h:Ljava/nio/FloatBuffer;

    invoke-virtual {v1}, Ljava/nio/FloatBuffer;->clear()Ljava/nio/Buffer;

    .line 90
    iget-object v1, p0, Lcom/roidapp/videolib/b/i;->h:Ljava/nio/FloatBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 92
    sget v0, Ljp/co/cyberagent/android/a/an;->a:I

    .line 1324
    iput-boolean v2, p0, Lcom/roidapp/videolib/b/i;->q:Z

    .line 1325
    iput-boolean v2, p0, Lcom/roidapp/videolib/b/i;->r:Z

    .line 2318
    iput v0, p0, Lcom/roidapp/videolib/b/i;->p:I

    .line 2319
    invoke-direct {p0}, Lcom/roidapp/videolib/b/i;->e()V

    .line 94
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-ne v0, v1, :cond_0

    .line 95
    const-wide/16 v0, 0xc8

    iput-wide v0, p0, Lcom/roidapp/videolib/b/i;->A:J

    .line 97
    :cond_0
    return-void
.end method

.method private static a(FF)F
    .locals 1

    .prologue
    .line 309
    const/4 v0, 0x0

    cmpl-float v0, p0, v0

    if-nez v0, :cond_0

    :goto_0
    return p1

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    sub-float p1, v0, p1

    goto :goto_0
.end method

.method private static a(Ljava/util/Queue;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Queue",
            "<",
            "Ljava/lang/Runnable;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 239
    monitor-enter p0

    .line 240
    :goto_0
    :try_start_0
    invoke-interface {p0}, Ljava/util/Queue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 241
    invoke-interface {p0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 243
    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-void
.end method

.method private e()V
    .locals 12

    .prologue
    const/4 v10, 0x3

    const/4 v9, 0x2

    const/4 v8, 0x1

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v7, 0x0

    .line 256
    iget v0, p0, Lcom/roidapp/videolib/b/i;->i:I

    int-to-float v1, v0

    .line 257
    iget v0, p0, Lcom/roidapp/videolib/b/i;->j:I

    int-to-float v0, v0

    .line 258
    iget v2, p0, Lcom/roidapp/videolib/b/i;->p:I

    sget v3, Ljp/co/cyberagent/android/a/an;->d:I

    if-eq v2, v3, :cond_0

    iget v2, p0, Lcom/roidapp/videolib/b/i;->p:I

    sget v3, Ljp/co/cyberagent/android/a/an;->b:I

    if-ne v2, v3, :cond_1

    .line 260
    :cond_0
    iget v0, p0, Lcom/roidapp/videolib/b/i;->j:I

    int-to-float v1, v0

    .line 261
    iget v0, p0, Lcom/roidapp/videolib/b/i;->i:I

    int-to-float v0, v0

    .line 263
    :cond_1
    iget-object v2, p0, Lcom/roidapp/videolib/b/i;->t:Lcom/roidapp/videolib/gl/f;

    if-eqz v2, :cond_2

    .line 264
    float-to-int v2, v1

    iput v2, p0, Lcom/roidapp/videolib/b/i;->k:I

    .line 265
    float-to-int v2, v0

    iput v2, p0, Lcom/roidapp/videolib/b/i;->l:I

    .line 267
    :cond_2
    iget v2, p0, Lcom/roidapp/videolib/b/i;->k:I

    int-to-float v2, v2

    div-float v2, v1, v2

    .line 268
    iget v3, p0, Lcom/roidapp/videolib/b/i;->l:I

    int-to-float v3, v3

    div-float v3, v0, v3

    .line 269
    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    move-result v2

    .line 270
    iget v3, p0, Lcom/roidapp/videolib/b/i;->k:I

    int-to-float v3, v3

    mul-float/2addr v3, v2

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    .line 271
    iget v4, p0, Lcom/roidapp/videolib/b/i;->l:I

    int-to-float v4, v4

    mul-float/2addr v2, v4

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 273
    int-to-float v3, v3

    div-float/2addr v3, v1

    .line 274
    int-to-float v1, v2

    div-float v4, v1, v0

    .line 276
    sget-object v2, Lcom/roidapp/videolib/b/i;->a:[F

    .line 277
    iget v0, p0, Lcom/roidapp/videolib/b/i;->p:I

    iget-boolean v1, p0, Lcom/roidapp/videolib/b/i;->q:Z

    iget-boolean v5, p0, Lcom/roidapp/videolib/b/i;->r:Z

    invoke-static {v0, v1, v5}, Ljp/co/cyberagent/android/a/a/a;->a(IZZ)[F

    move-result-object v1

    .line 279
    iget v0, p0, Lcom/roidapp/videolib/b/i;->s:I

    sget v5, Lcom/roidapp/videolib/b/j;->b:I

    if-ne v0, v5, :cond_3

    .line 280
    div-float v0, v6, v3

    sub-float v0, v6, v0

    const/high16 v3, 0x40000000    # 2.0f

    div-float v3, v0, v3

    .line 281
    div-float v0, v6, v4

    sub-float v0, v6, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float v4, v0, v4

    .line 282
    const/16 v0, 0x8

    new-array v0, v0, [F

    aget v5, v1, v7

    invoke-static {v5, v3}, Lcom/roidapp/videolib/b/i;->a(FF)F

    move-result v5

    aput v5, v0, v7

    aget v5, v1, v8

    invoke-static {v5, v4}, Lcom/roidapp/videolib/b/i;->a(FF)F

    move-result v5

    aput v5, v0, v8

    aget v5, v1, v9

    invoke-static {v5, v3}, Lcom/roidapp/videolib/b/i;->a(FF)F

    move-result v5

    aput v5, v0, v9

    aget v5, v1, v10

    invoke-static {v5, v4}, Lcom/roidapp/videolib/b/i;->a(FF)F

    move-result v5

    aput v5, v0, v10

    const/4 v5, 0x4

    const/4 v6, 0x4

    aget v6, v1, v6

    invoke-static {v6, v3}, Lcom/roidapp/videolib/b/i;->a(FF)F

    move-result v6

    aput v6, v0, v5

    const/4 v5, 0x5

    const/4 v6, 0x5

    aget v6, v1, v6

    invoke-static {v6, v4}, Lcom/roidapp/videolib/b/i;->a(FF)F

    move-result v6

    aput v6, v0, v5

    const/4 v5, 0x6

    const/4 v6, 0x6

    aget v6, v1, v6

    invoke-static {v6, v3}, Lcom/roidapp/videolib/b/i;->a(FF)F

    move-result v3

    aput v3, v0, v5

    const/4 v3, 0x7

    const/4 v5, 0x7

    aget v1, v1, v5

    invoke-static {v1, v4}, Lcom/roidapp/videolib/b/i;->a(FF)F

    move-result v1

    aput v1, v0, v3

    move-object v1, v2

    .line 302
    :goto_0
    iget-object v2, p0, Lcom/roidapp/videolib/b/i;->f:Ljava/nio/FloatBuffer;

    invoke-virtual {v2}, Ljava/nio/FloatBuffer;->clear()Ljava/nio/Buffer;

    .line 303
    iget-object v2, p0, Lcom/roidapp/videolib/b/i;->f:Ljava/nio/FloatBuffer;

    invoke-virtual {v2, v1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 304
    iget-object v1, p0, Lcom/roidapp/videolib/b/i;->g:Ljava/nio/FloatBuffer;

    invoke-virtual {v1}, Ljava/nio/FloatBuffer;->clear()Ljava/nio/Buffer;

    .line 305
    iget-object v1, p0, Lcom/roidapp/videolib/b/i;->g:Ljava/nio/FloatBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 306
    return-void

    .line 292
    :cond_3
    iget-boolean v0, p0, Lcom/roidapp/videolib/b/i;->c:Z

    if-nez v0, :cond_4

    .line 293
    const/16 v0, 0x8

    new-array v0, v0, [F

    sget-object v2, Lcom/roidapp/videolib/b/i;->a:[F

    aget v2, v2, v7

    div-float/2addr v2, v4

    aput v2, v0, v7

    sget-object v2, Lcom/roidapp/videolib/b/i;->a:[F

    aget v2, v2, v8

    div-float/2addr v2, v3

    aput v2, v0, v8

    sget-object v2, Lcom/roidapp/videolib/b/i;->a:[F

    aget v2, v2, v9

    div-float/2addr v2, v4

    aput v2, v0, v9

    sget-object v2, Lcom/roidapp/videolib/b/i;->a:[F

    aget v2, v2, v10

    div-float/2addr v2, v3

    aput v2, v0, v10

    const/4 v2, 0x4

    sget-object v5, Lcom/roidapp/videolib/b/i;->a:[F

    const/4 v6, 0x4

    aget v5, v5, v6

    div-float/2addr v5, v4

    aput v5, v0, v2

    const/4 v2, 0x5

    sget-object v5, Lcom/roidapp/videolib/b/i;->a:[F

    const/4 v6, 0x5

    aget v5, v5, v6

    div-float/2addr v5, v3

    aput v5, v0, v2

    const/4 v2, 0x6

    sget-object v5, Lcom/roidapp/videolib/b/i;->a:[F

    const/4 v6, 0x6

    aget v5, v5, v6

    div-float v4, v5, v4

    aput v4, v0, v2

    const/4 v2, 0x7

    sget-object v4, Lcom/roidapp/videolib/b/i;->a:[F

    const/4 v5, 0x7

    aget v4, v4, v5

    div-float v3, v4, v3

    aput v3, v0, v2

    move-object v11, v1

    move-object v1, v0

    move-object v0, v11

    goto :goto_0

    :cond_4
    move-object v0, v1

    move-object v1, v2

    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 408
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 409
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 410
    iget-wide v0, p0, Lcom/roidapp/videolib/b/i;->D:J

    iput-wide v0, p0, Lcom/roidapp/videolib/b/i;->F:J

    .line 411
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->B:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 413
    return-void
.end method

.method public final a(F)V
    .locals 1

    .prologue
    .line 354
    iput p1, p0, Lcom/roidapp/videolib/b/i;->m:F

    .line 355
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->d:Lcom/roidapp/videolib/b/m;

    if-eqz v0, :cond_0

    .line 356
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->d:Lcom/roidapp/videolib/b/m;

    invoke-virtual {v0, p1}, Lcom/roidapp/videolib/b/m;->a(F)V

    .line 357
    :cond_0
    return-void
.end method

.method public final a(I)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 386
    iput p1, p0, Lcom/roidapp/videolib/b/i;->G:I

    .line 387
    iput-boolean v1, p0, Lcom/roidapp/videolib/b/i;->H:Z

    .line 388
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 389
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 390
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->B:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 392
    return-void
.end method

.method public final a(J)V
    .locals 1

    .prologue
    .line 139
    iput-wide p1, p0, Lcom/roidapp/videolib/b/i;->C:J

    .line 140
    return-void
.end method

.method public final a(Landroid/os/Handler;)V
    .locals 0

    .prologue
    .line 364
    iput-object p1, p0, Lcom/roidapp/videolib/b/i;->E:Landroid/os/Handler;

    .line 365
    return-void
.end method

.method public final a(Z)V
    .locals 2

    .prologue
    .line 433
    iput-boolean p1, p0, Lcom/roidapp/videolib/b/i;->J:Z

    .line 434
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->d:Lcom/roidapp/videolib/b/m;

    if-eqz v0, :cond_0

    .line 435
    iget-object v1, p0, Lcom/roidapp/videolib/b/i;->d:Lcom/roidapp/videolib/b/m;

    iget-boolean v0, p0, Lcom/roidapp/videolib/b/i;->J:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1, v0}, Lcom/roidapp/videolib/b/m;->b(I)V

    .line 437
    :cond_0
    return-void

    .line 435
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 416
    iget-wide v0, p0, Lcom/roidapp/videolib/b/i;->D:J

    iput-wide v0, p0, Lcom/roidapp/videolib/b/i;->F:J

    .line 417
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 418
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->B:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 419
    return-void
.end method

.method public final b(I)V
    .locals 2

    .prologue
    .line 402
    iput p1, p0, Lcom/roidapp/videolib/b/i;->G:I

    .line 403
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/videolib/b/i;->H:Z

    .line 404
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 405
    return-void
.end method

.method public final b(J)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 378
    iput-wide p1, p0, Lcom/roidapp/videolib/b/i;->F:J

    .line 379
    iput-boolean v2, p0, Lcom/roidapp/videolib/b/i;->H:Z

    .line 380
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 381
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 382
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->B:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 383
    return-void
.end method

.method public final c()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 422
    iget-wide v0, p0, Lcom/roidapp/videolib/b/i;->D:J

    iput-wide v0, p0, Lcom/roidapp/videolib/b/i;->F:J

    .line 423
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 424
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->B:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 425
    return-void
.end method

.method public final c(J)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 395
    iput-wide p1, p0, Lcom/roidapp/videolib/b/i;->F:J

    .line 396
    iput-boolean v1, p0, Lcom/roidapp/videolib/b/i;->H:Z

    .line 397
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 399
    return-void
.end method

.method public final d(J)I
    .locals 1

    .prologue
    .line 440
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->d:Lcom/roidapp/videolib/b/m;

    if-eqz v0, :cond_0

    .line 441
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->d:Lcom/roidapp/videolib/b/m;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/videolib/b/m;->a(J)I

    move-result v0

    .line 442
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 428
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/videolib/b/i;->I:Z

    .line 429
    return-void
.end method

.method public final onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 12

    .prologue
    const/16 v9, 0x2016

    const-wide/16 v10, 0x1

    const/4 v8, 0x1

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    .line 164
    iget-boolean v0, p0, Lcom/roidapp/videolib/b/i;->H:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->d:Lcom/roidapp/videolib/b/m;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/videolib/b/i;->y:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 166
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->d:Lcom/roidapp/videolib/b/m;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/m;->a()V

    .line 167
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->d:Lcom/roidapp/videolib/b/m;

    iget v1, p0, Lcom/roidapp/videolib/b/i;->G:I

    invoke-virtual {v0, v1}, Lcom/roidapp/videolib/b/m;->a(I)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/videolib/b/i;->F:J

    .line 168
    iput-boolean v8, p0, Lcom/roidapp/videolib/b/i;->H:Z

    .line 170
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->B:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_6

    iget-boolean v0, p0, Lcom/roidapp/videolib/b/i;->J:Z

    if-nez v0, :cond_6

    .line 171
    iget-wide v0, p0, Lcom/roidapp/videolib/b/i;->F:J

    .line 172
    iput-wide v0, p0, Lcom/roidapp/videolib/b/i;->D:J

    .line 3148
    :goto_0
    iget-boolean v2, p0, Lcom/roidapp/videolib/b/i;->J:Z

    if-nez v2, :cond_d

    .line 3150
    iget-object v2, p0, Lcom/roidapp/videolib/b/i;->d:Lcom/roidapp/videolib/b/m;

    if-eqz v2, :cond_d

    .line 3152
    iget-wide v2, p0, Lcom/roidapp/videolib/b/i;->D:J

    iget-object v4, p0, Lcom/roidapp/videolib/b/i;->d:Lcom/roidapp/videolib/b/m;

    invoke-virtual {v4}, Lcom/roidapp/videolib/b/m;->e()J

    move-result-wide v4

    add-long/2addr v2, v4

    cmp-long v2, v0, v2

    if-lez v2, :cond_d

    .line 3153
    iget-wide v0, p0, Lcom/roidapp/videolib/b/i;->D:J

    iget-object v2, p0, Lcom/roidapp/videolib/b/i;->d:Lcom/roidapp/videolib/b/m;

    invoke-virtual {v2}, Lcom/roidapp/videolib/b/m;->e()J

    move-result-wide v2

    add-long v4, v0, v2

    .line 199
    :goto_1
    invoke-static {v7, v7, v7, v7}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    .line 200
    const-string v0, "glClearColor"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 201
    const/16 v0, 0x4100

    invoke-static {v0}, Landroid/opengl/GLES20;->glClear(I)V

    .line 202
    const-string v0, "glClear"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 204
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->n:Ljava/util/Queue;

    invoke-static {v0}, Lcom/roidapp/videolib/b/i;->a(Ljava/util/Queue;)V

    .line 206
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->d:Lcom/roidapp/videolib/b/m;

    if-eqz v0, :cond_2

    .line 207
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->d:Lcom/roidapp/videolib/b/m;

    iget v1, p0, Lcom/roidapp/videolib/b/i;->e:I

    iget-object v2, p0, Lcom/roidapp/videolib/b/i;->f:Ljava/nio/FloatBuffer;

    iget-boolean v3, p0, Lcom/roidapp/videolib/b/i;->J:Z

    if-eqz v3, :cond_e

    iget-object v3, p0, Lcom/roidapp/videolib/b/i;->h:Ljava/nio/FloatBuffer;

    :goto_2
    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/videolib/b/m;->a(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/videolib/b/i;->D:J

    .line 210
    :cond_2
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->E:Landroid/os/Handler;

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lcom/roidapp/videolib/b/i;->y:Z

    if-eqz v0, :cond_3

    .line 211
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->E:Landroid/os/Handler;

    const/16 v1, 0x2015

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 212
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 214
    :cond_3
    iget-boolean v0, p0, Lcom/roidapp/videolib/b/i;->y:Z

    if-eqz v0, :cond_4

    .line 215
    iput-boolean v6, p0, Lcom/roidapp/videolib/b/i;->y:Z

    .line 219
    :cond_4
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->E:Landroid/os/Handler;

    if-eqz v0, :cond_5

    .line 220
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->d:Lcom/roidapp/videolib/b/m;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/m;->d()Z

    move-result v0

    if-eqz v0, :cond_f

    .line 221
    iget-wide v0, p0, Lcom/roidapp/videolib/b/i;->D:J

    iget-wide v2, p0, Lcom/roidapp/videolib/b/i;->A:J

    div-long/2addr v0, v2

    add-long/2addr v0, v10

    long-to-int v0, v0

    iput v0, p0, Lcom/roidapp/videolib/b/i;->z:I

    .line 222
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->E:Landroid/os/Handler;

    const/4 v1, 0x0

    iget v2, p0, Lcom/roidapp/videolib/b/i;->z:I

    invoke-static {v1, v9, v2, v6}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 225
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->E:Landroid/os/Handler;

    const/16 v1, 0x2014

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 234
    :cond_5
    :goto_3
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->o:Ljava/util/Queue;

    invoke-static {v0}, Lcom/roidapp/videolib/b/i;->a(Ljava/util/Queue;)V

    .line 236
    return-void

    .line 173
    :cond_6
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 174
    iget-wide v0, p0, Lcom/roidapp/videolib/b/i;->F:J

    .line 175
    iput-wide v0, p0, Lcom/roidapp/videolib/b/i;->D:J

    goto/16 :goto_0

    .line 176
    :cond_7
    iget-boolean v0, p0, Lcom/roidapp/videolib/b/i;->y:Z

    if-eqz v0, :cond_8

    .line 177
    iget-wide v0, p0, Lcom/roidapp/videolib/b/i;->F:J

    .line 178
    iput-wide v0, p0, Lcom/roidapp/videolib/b/i;->D:J

    goto/16 :goto_0

    .line 181
    :cond_8
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 182
    iget-boolean v0, p0, Lcom/roidapp/videolib/b/i;->I:Z

    if-eqz v0, :cond_9

    .line 183
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 185
    :cond_9
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/roidapp/videolib/b/i;->F:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/roidapp/videolib/b/i;->u:J

    .line 186
    iget-wide v0, p0, Lcom/roidapp/videolib/b/i;->F:J

    iput-wide v0, p0, Lcom/roidapp/videolib/b/i;->D:J

    .line 188
    :cond_a
    iget-boolean v0, p0, Lcom/roidapp/videolib/b/i;->I:Z

    if-eqz v0, :cond_b

    .line 189
    iput-boolean v6, p0, Lcom/roidapp/videolib/b/i;->I:Z

    .line 191
    :cond_b
    iget-boolean v0, p0, Lcom/roidapp/videolib/b/i;->J:Z

    if-eqz v0, :cond_c

    .line 192
    iget-wide v0, p0, Lcom/roidapp/videolib/b/i;->C:J

    goto/16 :goto_0

    .line 194
    :cond_c
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/roidapp/videolib/b/i;->u:J

    sub-long/2addr v0, v2

    goto/16 :goto_0

    :cond_d
    move-wide v4, v0

    .line 3155
    goto/16 :goto_1

    .line 207
    :cond_e
    iget-object v3, p0, Lcom/roidapp/videolib/b/i;->g:Ljava/nio/FloatBuffer;

    goto/16 :goto_2

    .line 226
    :cond_f
    iget v0, p0, Lcom/roidapp/videolib/b/i;->z:I

    int-to-long v0, v0

    iget-wide v2, p0, Lcom/roidapp/videolib/b/i;->D:J

    iget-wide v4, p0, Lcom/roidapp/videolib/b/i;->A:J

    div-long/2addr v2, v4

    add-long/2addr v2, v10

    cmp-long v0, v0, v2

    if-eqz v0, :cond_5

    .line 228
    iget-wide v0, p0, Lcom/roidapp/videolib/b/i;->D:J

    iget-wide v2, p0, Lcom/roidapp/videolib/b/i;->A:J

    div-long/2addr v0, v2

    add-long/2addr v0, v10

    long-to-int v0, v0

    iput v0, p0, Lcom/roidapp/videolib/b/i;->z:I

    .line 229
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->E:Landroid/os/Handler;

    const/4 v1, 0x0

    iget v2, p0, Lcom/roidapp/videolib/b/i;->z:I

    invoke-static {v1, v9, v2, v6}, Landroid/os/Message;->obtain(Landroid/os/Handler;III)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_3
.end method

.method public final onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 118
    iput p2, p0, Lcom/roidapp/videolib/b/i;->i:I

    .line 119
    iput p3, p0, Lcom/roidapp/videolib/b/i;->j:I

    .line 120
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->t:Lcom/roidapp/videolib/gl/f;

    if-nez v0, :cond_0

    .line 121
    iput p2, p0, Lcom/roidapp/videolib/b/i;->l:I

    .line 122
    iput p3, p0, Lcom/roidapp/videolib/b/i;->k:I

    .line 124
    :cond_0
    invoke-static {v1, v1, p2, p3}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 125
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->d:Lcom/roidapp/videolib/b/m;

    invoke-virtual {v0, p2, p3}, Lcom/roidapp/videolib/b/m;->a(II)V

    .line 126
    invoke-direct {p0}, Lcom/roidapp/videolib/b/i;->e()V

    .line 128
    return-void
.end method

.method public final onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 101
    iput-boolean v1, p0, Lcom/roidapp/videolib/b/i;->y:Z

    .line 102
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->v:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 103
    const/16 v0, 0xb71

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisable(I)V

    .line 104
    const/16 v0, 0xbe2

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnable(I)V

    .line 105
    const/16 v0, 0x302

    const/16 v1, 0x303

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBlendFunc(II)V

    .line 107
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->d:Lcom/roidapp/videolib/b/m;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/m;->f()V

    .line 108
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->d:Lcom/roidapp/videolib/b/m;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/m;->b()V

    .line 109
    iget-object v0, p0, Lcom/roidapp/videolib/b/i;->d:Lcom/roidapp/videolib/b/m;

    iget v1, p0, Lcom/roidapp/videolib/b/i;->m:F

    invoke-virtual {v0, v1}, Lcom/roidapp/videolib/b/m;->a(F)V

    .line 110
    const/4 v0, -0x1

    iput v0, p0, Lcom/roidapp/videolib/b/i;->e:I

    .line 112
    return-void
.end method
