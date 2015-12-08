.class public final Lcom/roidapp/videolib/b/m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static v:[Ljava/nio/ByteBuffer;


# instance fields
.field private A:I

.field private B:I

.field private C:Lcom/roidapp/videolib/b/h;

.field private D:Lcom/roidapp/videolib/b/h;

.field private E:[I

.field private F:[I

.field private G:[I

.field private H:[I

.field private I:[F

.field private J:[F

.field private K:[F

.field private L:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

.field private M:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljp/co/cyberagent/android/a/h;",
            ">;"
        }
    .end annotation
.end field

.field private N:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljp/co/cyberagent/android/a/h;",
            ">;"
        }
    .end annotation
.end field

.field private O:Ljp/co/cyberagent/android/a/n;

.field private P:Z

.field private Q:Lcom/roidapp/videolib/b/y;

.field private R:I

.field private S:Z

.field private T:I

.field private U:[Lcom/roidapp/videolib/b/u;

.field private V:Ljava/lang/String;

.field private W:Z

.field private X:Z

.field private Y:Z

.field private Z:Z

.field protected final a:Ljava/nio/FloatBuffer;

.field private aa:[I

.field private ab:I

.field private ac:Lcom/roidapp/videolib/gl/e;

.field private ad:[Lcom/roidapp/videolib/gl/e;

.field private ae:I

.field private af:I

.field private ag:J

.field private ah:I

.field protected final b:Ljava/nio/FloatBuffer;

.field protected final c:Ljava/nio/FloatBuffer;

.field protected final d:Ljava/nio/FloatBuffer;

.field public e:I

.field f:J

.field g:J

.field h:J

.field private i:Landroid/content/Context;

.field private j:Lcom/roidapp/videolib/b/u;

.field private k:J

.field private l:Lcom/roidapp/videolib/b/c;

.field private m:Ljp/co/cyberagent/android/a/h;

.field private n:Ljp/co/cyberagent/android/a/h;

.field private o:Ljp/co/cyberagent/android/a/h;

.field private p:Ljp/co/cyberagent/android/a/h;

.field private q:Ljp/co/cyberagent/android/a/h;

.field private r:Ljp/co/cyberagent/android/a/h;

.field private s:Lcom/roidapp/videolib/gl/f;

.field private t:I

.field private u:J

.field private w:I

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 65
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/videolib/b/m;->v:[Ljava/nio/ByteBuffer;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 8

    .prologue
    const/4 v5, 0x1

    const-wide/16 v6, 0x0

    const/4 v4, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    sget-object v0, Lcom/roidapp/videolib/b/u;->a:Lcom/roidapp/videolib/b/u;

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->j:Lcom/roidapp/videolib/b/u;

    .line 48
    const-wide/16 v0, 0x3e8

    iput-wide v0, p0, Lcom/roidapp/videolib/b/m;->k:J

    .line 61
    iput v3, p0, Lcom/roidapp/videolib/b/m;->t:I

    .line 63
    iput-wide v6, p0, Lcom/roidapp/videolib/b/m;->u:J

    .line 68
    iput v4, p0, Lcom/roidapp/videolib/b/m;->w:I

    .line 69
    iput v4, p0, Lcom/roidapp/videolib/b/m;->x:I

    .line 70
    iput v4, p0, Lcom/roidapp/videolib/b/m;->y:I

    .line 71
    iput v4, p0, Lcom/roidapp/videolib/b/m;->z:I

    .line 72
    iput v4, p0, Lcom/roidapp/videolib/b/m;->A:I

    .line 73
    iput v4, p0, Lcom/roidapp/videolib/b/m;->B:I

    .line 74
    iput-object v2, p0, Lcom/roidapp/videolib/b/m;->C:Lcom/roidapp/videolib/b/h;

    .line 75
    iput-object v2, p0, Lcom/roidapp/videolib/b/m;->D:Lcom/roidapp/videolib/b/h;

    .line 76
    iput-object v2, p0, Lcom/roidapp/videolib/b/m;->E:[I

    .line 77
    iput-object v2, p0, Lcom/roidapp/videolib/b/m;->F:[I

    .line 79
    iput-object v2, p0, Lcom/roidapp/videolib/b/m;->G:[I

    .line 80
    iput-object v2, p0, Lcom/roidapp/videolib/b/m;->H:[I

    .line 82
    const/4 v0, 0x4

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->I:[F

    .line 83
    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_1

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->J:[F

    .line 84
    iput-object v2, p0, Lcom/roidapp/videolib/b/m;->K:[F

    .line 85
    iput-object v2, p0, Lcom/roidapp/videolib/b/m;->L:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 86
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->M:Ljava/util/ArrayList;

    .line 87
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->N:Ljava/util/ArrayList;

    .line 89
    iput-boolean v3, p0, Lcom/roidapp/videolib/b/m;->P:Z

    .line 90
    iput-object v2, p0, Lcom/roidapp/videolib/b/m;->Q:Lcom/roidapp/videolib/b/y;

    .line 91
    const/16 v0, 0x64

    iput v0, p0, Lcom/roidapp/videolib/b/m;->R:I

    .line 92
    iput-boolean v3, p0, Lcom/roidapp/videolib/b/m;->S:Z

    .line 93
    const/16 v0, 0xa

    iput v0, p0, Lcom/roidapp/videolib/b/m;->T:I

    .line 95
    iput-object v2, p0, Lcom/roidapp/videolib/b/m;->U:[Lcom/roidapp/videolib/b/u;

    .line 96
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->V:Ljava/lang/String;

    .line 149
    iput-boolean v3, p0, Lcom/roidapp/videolib/b/m;->W:Z

    .line 187
    iput-boolean v3, p0, Lcom/roidapp/videolib/b/m;->X:Z

    .line 188
    iput-boolean v5, p0, Lcom/roidapp/videolib/b/m;->Y:Z

    .line 361
    iput-boolean v3, p0, Lcom/roidapp/videolib/b/m;->Z:Z

    .line 367
    iput-object v2, p0, Lcom/roidapp/videolib/b/m;->aa:[I

    .line 368
    iput v4, p0, Lcom/roidapp/videolib/b/m;->ab:I

    .line 369
    new-instance v0, Lcom/roidapp/videolib/b/o;

    invoke-direct {v0, p0}, Lcom/roidapp/videolib/b/o;-><init>(Lcom/roidapp/videolib/b/m;)V

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->ac:Lcom/roidapp/videolib/gl/e;

    .line 427
    iput v4, p0, Lcom/roidapp/videolib/b/m;->e:I

    .line 577
    iput-object v2, p0, Lcom/roidapp/videolib/b/m;->ad:[Lcom/roidapp/videolib/gl/e;

    .line 995
    iput v3, p0, Lcom/roidapp/videolib/b/m;->ae:I

    .line 996
    iput v3, p0, Lcom/roidapp/videolib/b/m;->af:I

    .line 1037
    iput-wide v6, p0, Lcom/roidapp/videolib/b/m;->ag:J

    .line 1054
    iput-wide v6, p0, Lcom/roidapp/videolib/b/m;->f:J

    .line 1055
    iput-wide v6, p0, Lcom/roidapp/videolib/b/m;->g:J

    .line 1056
    iput-wide v6, p0, Lcom/roidapp/videolib/b/m;->h:J

    .line 1196
    iput v3, p0, Lcom/roidapp/videolib/b/m;->ah:I

    .line 98
    iput-object p1, p0, Lcom/roidapp/videolib/b/m;->i:Landroid/content/Context;

    .line 99
    new-instance v0, Lcom/roidapp/videolib/b/y;

    invoke-direct {v0, p1}, Lcom/roidapp/videolib/b/y;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->Q:Lcom/roidapp/videolib/b/y;

    .line 100
    sget-object v0, Lcom/roidapp/videolib/gl/g;->a:[F

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

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->a:Ljava/nio/FloatBuffer;

    .line 103
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->a:Ljava/nio/FloatBuffer;

    sget-object v1, Lcom/roidapp/videolib/gl/g;->a:[F

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 105
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

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->b:Ljava/nio/FloatBuffer;

    .line 108
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->b:Ljava/nio/FloatBuffer;

    sget-object v1, Ljp/co/cyberagent/android/a/a/a;->a:[F

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 110
    sget v0, Ljp/co/cyberagent/android/a/an;->a:I

    invoke-static {v0, v3, v5}, Ljp/co/cyberagent/android/a/a/a;->a(IZZ)[F

    move-result-object v0

    .line 111
    array-length v1, v0

    mul-int/lit8 v1, v1, 0x4

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/videolib/b/m;->c:Ljava/nio/FloatBuffer;

    .line 114
    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->c:Ljava/nio/FloatBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 116
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

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->d:Ljava/nio/FloatBuffer;

    .line 119
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->d:Ljava/nio/FloatBuffer;

    sget-object v1, Ljp/co/cyberagent/android/a/a/a;->a:[F

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 120
    return-void

    .line 82
    :array_0
    .array-data 4
        0x0
        0x0
        0x0
        0x0
    .end array-data

    .line 83
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method static synthetic a(Lcom/roidapp/videolib/b/m;I)I
    .locals 0

    .prologue
    .line 34
    iput p1, p0, Lcom/roidapp/videolib/b/m;->z:I

    return p1
.end method

.method static synthetic a(Lcom/roidapp/videolib/b/m;)Lcom/roidapp/videolib/gl/f;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/videolib/b/m;[F)[F
    .locals 0

    .prologue
    .line 34
    iput-object p1, p0, Lcom/roidapp/videolib/b/m;->K:[F

    return-object p1
.end method

.method static synthetic a([Ljava/nio/ByteBuffer;)[Ljava/nio/ByteBuffer;
    .locals 0

    .prologue
    .line 34
    sput-object p0, Lcom/roidapp/videolib/b/m;->v:[Ljava/nio/ByteBuffer;

    return-object p0
.end method

.method static synthetic b(Lcom/roidapp/videolib/b/m;I)I
    .locals 0

    .prologue
    .line 34
    iput p1, p0, Lcom/roidapp/videolib/b/m;->A:I

    return p1
.end method

.method static synthetic b(Lcom/roidapp/videolib/b/m;)J
    .locals 2

    .prologue
    .line 34
    iget-wide v0, p0, Lcom/roidapp/videolib/b/m;->ag:J

    return-wide v0
.end method

.method static synthetic c(Lcom/roidapp/videolib/b/m;I)I
    .locals 0

    .prologue
    .line 34
    iput p1, p0, Lcom/roidapp/videolib/b/m;->B:I

    return p1
.end method

.method static synthetic c(Lcom/roidapp/videolib/b/m;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->V:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/videolib/b/m;)I
    .locals 1

    .prologue
    .line 34
    iget v0, p0, Lcom/roidapp/videolib/b/m;->ab:I

    return v0
.end method

.method static synthetic d(Lcom/roidapp/videolib/b/m;I)I
    .locals 0

    .prologue
    .line 34
    iput p1, p0, Lcom/roidapp/videolib/b/m;->w:I

    return p1
.end method

.method static synthetic e(Lcom/roidapp/videolib/b/m;)I
    .locals 1

    .prologue
    .line 34
    iget v0, p0, Lcom/roidapp/videolib/b/m;->t:I

    return v0
.end method

.method static synthetic e(Lcom/roidapp/videolib/b/m;I)I
    .locals 0

    .prologue
    .line 34
    iput p1, p0, Lcom/roidapp/videolib/b/m;->y:I

    return p1
.end method

.method static synthetic f(Lcom/roidapp/videolib/b/m;)Z
    .locals 1

    .prologue
    .line 34
    iget-boolean v0, p0, Lcom/roidapp/videolib/b/m;->S:Z

    return v0
.end method

.method static synthetic g(Lcom/roidapp/videolib/b/m;)Z
    .locals 1

    .prologue
    .line 34
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/videolib/b/m;->P:Z

    return v0
.end method

.method static synthetic h(Lcom/roidapp/videolib/b/m;)I
    .locals 1

    .prologue
    .line 34
    iget v0, p0, Lcom/roidapp/videolib/b/m;->z:I

    return v0
.end method

.method static synthetic h()[Ljava/nio/ByteBuffer;
    .locals 1

    .prologue
    .line 34
    sget-object v0, Lcom/roidapp/videolib/b/m;->v:[Ljava/nio/ByteBuffer;

    return-object v0
.end method

.method private i()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 430
    iget v0, p0, Lcom/roidapp/videolib/b/m;->e:I

    iget v1, p0, Lcom/roidapp/videolib/b/m;->t:I

    if-eq v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/videolib/b/m;->S:Z

    if-nez v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Lcom/roidapp/videolib/b/m;->P:Z

    if-eqz v0, :cond_4

    .line 432
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->D:Lcom/roidapp/videolib/b/h;

    if-nez v0, :cond_5

    .line 433
    invoke-direct {p0}, Lcom/roidapp/videolib/b/m;->k()V

    .line 434
    new-instance v0, Lcom/roidapp/videolib/b/h;

    invoke-direct {v0}, Lcom/roidapp/videolib/b/h;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->D:Lcom/roidapp/videolib/b/h;

    .line 435
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->D:Lcom/roidapp/videolib/b/h;

    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->N:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/roidapp/videolib/b/h;->a(Ljava/util/List;)V

    .line 436
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->D:Lcom/roidapp/videolib/b/h;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/h;->r_()V

    .line 437
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->D:Lcom/roidapp/videolib/b/h;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/h;->h()V

    .line 439
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->D:Lcom/roidapp/videolib/b/h;

    iget v1, p0, Lcom/roidapp/videolib/b/m;->ae:I

    iget v2, p0, Lcom/roidapp/videolib/b/m;->af:I

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/videolib/b/h;->a(II)V

    .line 444
    :goto_0
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->D:Lcom/roidapp/videolib/b/h;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->G:[I

    if-eqz v0, :cond_3

    .line 445
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->D:Lcom/roidapp/videolib/b/h;

    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->G:[I

    aget v1, v1, v5

    invoke-virtual {v0, v1}, Lcom/roidapp/videolib/b/h;->a(I)V

    .line 446
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->V:Ljava/lang/String;

    const-string v1, "updateImageTextures role onDraw "

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 458
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->d:Ljava/nio/FloatBuffer;

    invoke-virtual {v0}, Ljava/nio/FloatBuffer;->clear()Ljava/nio/Buffer;

    .line 459
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->K:[F

    if-eqz v0, :cond_2

    .line 460
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->d:Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->K:[F

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    move-result-object v0

    invoke-virtual {v0, v5}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    .line 461
    :cond_2
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->D:Lcom/roidapp/videolib/b/h;

    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->aa:[I

    aget v1, v1, v5

    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->a:Ljava/nio/FloatBuffer;

    iget-object v3, p0, Lcom/roidapp/videolib/b/m;->d:Ljava/nio/FloatBuffer;

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/roidapp/videolib/b/h;->a(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;[F)V

    .line 462
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->H:[I

    aget v0, v0, v5

    iput v0, p0, Lcom/roidapp/videolib/b/m;->x:I

    .line 464
    :cond_3
    iget v0, p0, Lcom/roidapp/videolib/b/m;->t:I

    iput v0, p0, Lcom/roidapp/videolib/b/m;->e:I

    .line 465
    iput-boolean v5, p0, Lcom/roidapp/videolib/b/m;->P:Z

    .line 467
    :cond_4
    return-void

    .line 441
    :cond_5
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->D:Lcom/roidapp/videolib/b/h;

    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->N:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Lcom/roidapp/videolib/b/h;->a(Ljava/util/List;)V

    .line 442
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->D:Lcom/roidapp/videolib/b/h;

    iget v1, p0, Lcom/roidapp/videolib/b/m;->ae:I

    iget v2, p0, Lcom/roidapp/videolib/b/m;->af:I

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/videolib/b/h;->a(II)V

    goto :goto_0
.end method

.method static synthetic i(Lcom/roidapp/videolib/b/m;)[I
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->aa:[I

    return-object v0
.end method

.method static synthetic j(Lcom/roidapp/videolib/b/m;)I
    .locals 1

    .prologue
    .line 34
    iget v0, p0, Lcom/roidapp/videolib/b/m;->A:I

    return v0
.end method

.method private j()V
    .locals 13

    .prologue
    const v12, 0x46180400    # 9729.0f

    const v11, 0x8d40

    const/4 v10, 0x1

    const/4 v1, 0x0

    const/16 v0, 0xde1

    .line 470
    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->E:[I

    if-eqz v2, :cond_1

    .line 509
    :cond_0
    return-void

    .line 472
    :cond_1
    iget v2, p0, Lcom/roidapp/videolib/b/m;->af:I

    if-eqz v2, :cond_0

    iget v2, p0, Lcom/roidapp/videolib/b/m;->ae:I

    if-eqz v2, :cond_0

    .line 474
    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->V:Ljava/lang/String;

    const-string v3, "initImageProcess"

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 476
    const/4 v2, 0x3

    new-array v2, v2, [I

    iput-object v2, p0, Lcom/roidapp/videolib/b/m;->E:[I

    .line 477
    const/4 v2, 0x3

    new-array v2, v2, [I

    iput-object v2, p0, Lcom/roidapp/videolib/b/m;->F:[I

    move v9, v1

    .line 478
    :goto_0
    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->E:[I

    array-length v2, v2

    if-ge v9, v2, :cond_0

    .line 479
    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->E:[I

    invoke-static {v10, v2, v9}, Landroid/opengl/GLES20;->glGenFramebuffers(I[II)V

    .line 480
    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->F:[I

    invoke-static {v10, v2, v9}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 481
    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->V:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "initImageProcess mProcessTargetFrameBuffers "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/videolib/b/m;->E:[I

    aget v4, v4, v9

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", texture:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/videolib/b/m;->F:[I

    aget v4, v4, v9

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "mViewWidth:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lcom/roidapp/videolib/b/m;->ae:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ",mViewHeight:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lcom/roidapp/videolib/b/m;->af:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 482
    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->F:[I

    aget v2, v2, v9

    const/4 v3, -0x1

    if-ne v2, v3, :cond_2

    .line 483
    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->F:[I

    invoke-static {v10, v2, v9}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 485
    :cond_2
    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->V:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "initImageProcess mProcessTargetFrameBuffers "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/videolib/b/m;->E:[I

    aget v4, v4, v9

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", texture:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/videolib/b/m;->F:[I

    aget v4, v4, v9

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 486
    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->F:[I

    aget v2, v2, v9

    const/4 v3, -0x1

    if-ne v2, v3, :cond_3

    .line 487
    const-string v2, "OpenglError"

    const-string v3, "G:opengl can\'t allocate texture....."

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 490
    :cond_3
    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->F:[I

    aget v2, v2, v9

    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 491
    const/16 v2, 0x1908

    iget v3, p0, Lcom/roidapp/videolib/b/m;->ae:I

    iget v4, p0, Lcom/roidapp/videolib/b/m;->af:I

    const/16 v6, 0x1908

    const/16 v7, 0x1401

    const/4 v8, 0x0

    move v5, v1

    invoke-static/range {v0 .. v8}, Landroid/opengl/GLES20;->glTexImage2D(IIIIIIIILjava/nio/Buffer;)V

    .line 493
    const/16 v2, 0x2800

    invoke-static {v0, v2, v12}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 495
    const/16 v2, 0x2801

    invoke-static {v0, v2, v12}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 497
    const/16 v2, 0x2802

    const v3, 0x47012f00    # 33071.0f

    invoke-static {v0, v2, v3}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 499
    const/16 v2, 0x2803

    const v3, 0x47012f00    # 33071.0f

    invoke-static {v0, v2, v3}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 502
    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->E:[I

    aget v2, v2, v9

    invoke-static {v11, v2}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 503
    const v2, 0x8ce0

    iget-object v3, p0, Lcom/roidapp/videolib/b/m;->F:[I

    aget v3, v3, v9

    invoke-static {v11, v2, v0, v3, v1}, Landroid/opengl/GLES20;->glFramebufferTexture2D(IIIII)V

    .line 506
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 507
    invoke-static {v11, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 478
    add-int/lit8 v2, v9, 0x1

    move v9, v2

    goto/16 :goto_0
.end method

.method static synthetic k(Lcom/roidapp/videolib/b/m;)I
    .locals 1

    .prologue
    .line 34
    iget v0, p0, Lcom/roidapp/videolib/b/m;->B:I

    return v0
.end method

.method private k()V
    .locals 13

    .prologue
    const v12, 0x46180400    # 9729.0f

    const v11, 0x8d40

    const/4 v10, 0x1

    const/4 v1, 0x0

    const/16 v0, 0xde1

    .line 512
    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->G:[I

    if-eqz v2, :cond_1

    .line 550
    :cond_0
    return-void

    .line 514
    :cond_1
    iget v2, p0, Lcom/roidapp/videolib/b/m;->af:I

    if-eqz v2, :cond_0

    iget v2, p0, Lcom/roidapp/videolib/b/m;->ae:I

    if-eqz v2, :cond_0

    .line 517
    new-array v2, v10, [I

    iput-object v2, p0, Lcom/roidapp/videolib/b/m;->G:[I

    .line 518
    new-array v2, v10, [I

    iput-object v2, p0, Lcom/roidapp/videolib/b/m;->H:[I

    move v9, v1

    .line 519
    :goto_0
    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->G:[I

    array-length v2, v2

    if-ge v9, v2, :cond_0

    .line 520
    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->G:[I

    invoke-static {v10, v2, v9}, Landroid/opengl/GLES20;->glGenFramebuffers(I[II)V

    .line 521
    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->H:[I

    invoke-static {v10, v2, v9}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 522
    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->V:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "initImageProcess mProcessBlurTargetFrameBuffers "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/videolib/b/m;->G:[I

    aget v4, v4, v9

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", texture:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/videolib/b/m;->H:[I

    aget v4, v4, v9

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "mViewWidth:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lcom/roidapp/videolib/b/m;->ae:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ",mViewHeight:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p0, Lcom/roidapp/videolib/b/m;->af:I

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 523
    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->H:[I

    aget v2, v2, v9

    const/4 v3, -0x1

    if-ne v2, v3, :cond_2

    .line 524
    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->H:[I

    invoke-static {v10, v2, v9}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    .line 526
    :cond_2
    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->V:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "initImageProcess mProcessTargetFrameBuffers "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/videolib/b/m;->G:[I

    aget v4, v4, v9

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", texture:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/videolib/b/m;->H:[I

    aget v4, v4, v9

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 527
    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->F:[I

    aget v2, v2, v9

    const/4 v3, -0x1

    if-ne v2, v3, :cond_3

    .line 528
    const-string v2, "OpenglError"

    const-string v3, "G:opengl can\'t allocate texture....."

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 531
    :cond_3
    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->H:[I

    aget v2, v2, v9

    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 532
    const/16 v2, 0x1908

    iget v3, p0, Lcom/roidapp/videolib/b/m;->ae:I

    iget v4, p0, Lcom/roidapp/videolib/b/m;->af:I

    const/16 v6, 0x1908

    const/16 v7, 0x1401

    const/4 v8, 0x0

    move v5, v1

    invoke-static/range {v0 .. v8}, Landroid/opengl/GLES20;->glTexImage2D(IIIIIIIILjava/nio/Buffer;)V

    .line 534
    const/16 v2, 0x2800

    invoke-static {v0, v2, v12}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 536
    const/16 v2, 0x2801

    invoke-static {v0, v2, v12}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 538
    const/16 v2, 0x2802

    const v3, 0x47012f00    # 33071.0f

    invoke-static {v0, v2, v3}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 540
    const/16 v2, 0x2803

    const v3, 0x47012f00    # 33071.0f

    invoke-static {v0, v2, v3}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    .line 543
    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->G:[I

    aget v2, v2, v9

    invoke-static {v11, v2}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 544
    const v2, 0x8ce0

    iget-object v3, p0, Lcom/roidapp/videolib/b/m;->H:[I

    aget v3, v3, v9

    invoke-static {v11, v2, v0, v3, v1}, Landroid/opengl/GLES20;->glFramebufferTexture2D(IIIII)V

    .line 547
    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glBindTexture(II)V

    .line 548
    invoke-static {v11, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 519
    add-int/lit8 v2, v9, 0x1

    move v9, v2

    goto/16 :goto_0
.end method

.method static synthetic l(Lcom/roidapp/videolib/b/m;)I
    .locals 1

    .prologue
    .line 34
    iget v0, p0, Lcom/roidapp/videolib/b/m;->x:I

    return v0
.end method

.method static synthetic m(Lcom/roidapp/videolib/b/m;)I
    .locals 1

    .prologue
    .line 34
    iget v0, p0, Lcom/roidapp/videolib/b/m;->w:I

    return v0
.end method

.method static synthetic n(Lcom/roidapp/videolib/b/m;)I
    .locals 1

    .prologue
    .line 34
    iget v0, p0, Lcom/roidapp/videolib/b/m;->y:I

    return v0
.end method


# virtual methods
.method public final a(J)I
    .locals 3

    .prologue
    .line 1065
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    if-eqz v0, :cond_0

    .line 1066
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Lcom/roidapp/videolib/b/c;->a(JZ)I

    move-result v0

    .line 1067
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(I)J
    .locals 2

    .prologue
    .line 1059
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    if-eqz v0, :cond_0

    .line 1060
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    invoke-virtual {v0, p1}, Lcom/roidapp/videolib/b/c;->a(I)J

    move-result-wide v0

    .line 1061
    :goto_0
    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_0
.end method

.method public final a(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;J)J
    .locals 10

    .prologue
    const/4 v8, 0x2

    const/4 v7, 0x1

    const/4 v2, 0x0

    .line 1083
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 5040
    iget v0, p0, Lcom/roidapp/videolib/b/m;->ah:I

    if-eq v0, v7, :cond_0

    .line 5042
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/c;->g()I

    move-result v0

    if-lez v0, :cond_0

    .line 5043
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->i()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->c()I

    move-result v0

    int-to-long v0, v0

    :goto_0
    invoke-static {p4, p5, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p4

    .line 5046
    iget-wide v0, p0, Lcom/roidapp/videolib/b/m;->ag:J

    cmp-long v0, p4, v0

    if-nez v0, :cond_0

    .line 5047
    iget-wide v0, p0, Lcom/roidapp/videolib/b/m;->ag:J

    const-wide/16 v4, 0xc

    add-long/2addr v0, v4

    const-wide/16 v4, 0x42

    add-long/2addr v4, p4

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p4

    .line 1084
    :cond_0
    iput-wide p4, p0, Lcom/roidapp/videolib/b/m;->ag:J

    .line 1085
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->V:Ljava/lang/String;

    const-string v1, "onDraw updateMVFilter"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1086
    invoke-virtual {p0}, Lcom/roidapp/videolib/b/m;->a()V

    .line 1087
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->V:Ljava/lang/String;

    const-string v1, "onDraw updateCurrentDataProviderIdx"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1088
    iget-wide v0, p0, Lcom/roidapp/videolib/b/m;->ag:J

    .line 6032
    iget-object v3, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    invoke-virtual {v3, v0, v1, v2}, Lcom/roidapp/videolib/b/c;->a(JZ)I

    move-result v0

    .line 6033
    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v1}, Lcom/roidapp/videolib/gl/f;->d()I

    move-result v1

    if-ge v0, v1, :cond_1

    if-ltz v0, :cond_1

    .line 6034
    iput v0, p0, Lcom/roidapp/videolib/b/m;->t:I

    .line 1089
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->V:Ljava/lang/String;

    const-string v1, "onDraw updateImageTextures"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    move v0, v2

    .line 6399
    :goto_1
    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->ad:[Lcom/roidapp/videolib/gl/e;

    array-length v1, v1

    if-ge v0, v1, :cond_8

    .line 6400
    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->ad:[Lcom/roidapp/videolib/gl/e;

    aget-object v1, v1, v0

    invoke-interface {v1}, Lcom/roidapp/videolib/gl/e;->d()Z

    move-result v1

    if-nez v1, :cond_2

    iget-boolean v1, p0, Lcom/roidapp/videolib/b/m;->X:Z

    if-eqz v1, :cond_4

    .line 6401
    :cond_2
    if-nez v0, :cond_6

    .line 6402
    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->aa:[I

    iget v3, p0, Lcom/roidapp/videolib/b/m;->z:I

    aput v3, v1, v2

    .line 6407
    :cond_3
    :goto_2
    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->V:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "updateImageTextures "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/videolib/b/m;->aa:[I

    aget v4, v4, v0

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 6408
    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->L:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->L:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    invoke-interface {v1}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->a()I

    move-result v1

    if-eqz v1, :cond_4

    .line 6411
    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->C:Lcom/roidapp/videolib/b/h;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->aa:[I

    aget v1, v1, v0

    const/4 v3, -0x1

    if-eq v1, v3, :cond_4

    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->E:[I

    if-eqz v1, :cond_4

    .line 6412
    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->aa:[I

    aget v1, v1, v0

    iput v1, p0, Lcom/roidapp/videolib/b/m;->ab:I

    .line 6413
    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->V:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "updateImageTextures role Target "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ":"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/videolib/b/m;->E:[I

    aget v4, v4, v0

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 6414
    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->C:Lcom/roidapp/videolib/b/h;

    iget-object v3, p0, Lcom/roidapp/videolib/b/m;->E:[I

    aget v3, v3, v0

    invoke-virtual {v1, v3}, Lcom/roidapp/videolib/b/h;->a(I)V

    .line 6415
    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->V:Ljava/lang/String;

    const-string v3, "updateImageTextures role onDraw "

    invoke-static {v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 6416
    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->C:Lcom/roidapp/videolib/b/h;

    iget-object v3, p0, Lcom/roidapp/videolib/b/m;->aa:[I

    aget v3, v3, v0

    iget-object v4, p0, Lcom/roidapp/videolib/b/m;->a:Ljava/nio/FloatBuffer;

    iget-object v5, p0, Lcom/roidapp/videolib/b/m;->c:Ljava/nio/FloatBuffer;

    const/4 v6, 0x0

    invoke-virtual {v1, v3, v4, v5, v6}, Lcom/roidapp/videolib/b/h;->a(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;[F)V

    .line 6417
    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->V:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "updateImageTextures role onDraw end:target texture: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/roidapp/videolib/b/m;->F:[I

    aget v4, v4, v0

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 6418
    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->aa:[I

    iget-object v3, p0, Lcom/roidapp/videolib/b/m;->F:[I

    aget v3, v3, v0

    aput v3, v1, v0

    .line 6399
    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_1

    .line 5043
    :cond_5
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->a()J

    move-result-wide v0

    goto/16 :goto_0

    .line 6403
    :cond_6
    if-ne v0, v7, :cond_7

    .line 6404
    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->aa:[I

    iget v3, p0, Lcom/roidapp/videolib/b/m;->A:I

    aput v3, v1, v7

    goto/16 :goto_2

    .line 6405
    :cond_7
    if-ne v0, v8, :cond_3

    .line 6406
    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->aa:[I

    iget v3, p0, Lcom/roidapp/videolib/b/m;->B:I

    aput v3, v1, v8

    goto/16 :goto_2

    .line 6424
    :cond_8
    iput-boolean v2, p0, Lcom/roidapp/videolib/b/m;->X:Z

    .line 1091
    invoke-direct {p0}, Lcom/roidapp/videolib/b/m;->i()V

    .line 1092
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1093
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    if-eqz v0, :cond_9

    .line 1094
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    iget-wide v2, p0, Lcom/roidapp/videolib/b/m;->ag:J

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/videolib/b/c;->a(J)Ljp/co/cyberagent/android/a/h;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->m:Ljp/co/cyberagent/android/a/h;

    .line 1097
    :cond_9
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/roidapp/videolib/b/m;->f:J

    .line 1098
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->V:Ljava/lang/String;

    const-string v1, "onDraw onDraw"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1099
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->m:Ljp/co/cyberagent/android/a/h;

    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->I:[F

    invoke-virtual {v0, p1, p2, p3, v1}, Ljp/co/cyberagent/android/a/h;->a(ILjava/nio/FloatBuffer;Ljava/nio/FloatBuffer;[F)V

    .line 1101
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    .line 1102
    iget-wide v2, p0, Lcom/roidapp/videolib/b/m;->f:J

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/roidapp/videolib/b/m;->f:J

    .line 1103
    iget-wide v0, p0, Lcom/roidapp/videolib/b/m;->g:J

    iget-wide v2, p0, Lcom/roidapp/videolib/b/m;->f:J

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/roidapp/videolib/b/m;->g:J

    .line 1104
    iget-wide v0, p0, Lcom/roidapp/videolib/b/m;->h:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/roidapp/videolib/b/m;->h:J

    .line 1108
    const-string v0, "onDraw"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 1109
    iget-wide v0, p0, Lcom/roidapp/videolib/b/m;->ag:J

    return-wide v0
.end method

.method public final a()V
    .locals 11

    .prologue
    const/4 v10, 0x2

    const/high16 v9, 0x3f800000    # 1.0f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x1

    .line 195
    .line 2152
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->g()Lcom/roidapp/videolib/b/u;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->j:Lcom/roidapp/videolib/b/u;

    if-ne v0, v2, :cond_0

    iget-wide v4, p0, Lcom/roidapp/videolib/b/m;->u:J

    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->c()I

    move-result v0

    int-to-long v6, v0

    cmp-long v0, v4, v6

    if-eqz v0, :cond_8

    :cond_0
    move v0, v3

    .line 196
    :goto_0
    if-eqz v0, :cond_2

    .line 197
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    if-eqz v0, :cond_1

    .line 198
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/c;->h()V

    .line 199
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    .line 200
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->g()Lcom/roidapp/videolib/b/u;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->j:Lcom/roidapp/videolib/b/u;

    .line 201
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->c()I

    move-result v0

    int-to-long v4, v0

    iput-wide v4, p0, Lcom/roidapp/videolib/b/m;->u:J

    .line 202
    iput v1, p0, Lcom/roidapp/videolib/b/m;->t:I

    .line 204
    :cond_2
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    if-nez v0, :cond_3

    .line 206
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->j:Lcom/roidapp/videolib/b/u;

    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->i:Landroid/content/Context;

    .line 3008
    sget-object v4, Lcom/roidapp/videolib/b/b;->a:[I

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v0

    aget v0, v4, v0

    packed-switch v0, :pswitch_data_0

    .line 3014
    new-instance v0, Lcom/roidapp/videolib/b/c;

    invoke-direct {v0, v2}, Lcom/roidapp/videolib/b/c;-><init>(Landroid/content/Context;)V

    .line 206
    :goto_1
    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    .line 208
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    new-instance v2, Lcom/roidapp/videolib/b/n;

    invoke-direct {v2, p0}, Lcom/roidapp/videolib/b/n;-><init>(Lcom/roidapp/videolib/b/m;)V

    invoke-virtual {v0, v2}, Lcom/roidapp/videolib/b/c;->a(Lcom/roidapp/videolib/gl/e;)V

    .line 253
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->j:Lcom/roidapp/videolib/b/u;

    sget-object v2, Lcom/roidapp/videolib/b/u;->c:Lcom/roidapp/videolib/b/u;

    if-ne v0, v2, :cond_11

    .line 254
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->I:[F

    aput v9, v0, v1

    .line 255
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->I:[F

    aput v9, v0, v3

    .line 256
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->I:[F

    aput v9, v0, v10

    .line 257
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->I:[F

    const/4 v2, 0x3

    aput v8, v0, v2

    .line 265
    :goto_2
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->q:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v0, v2}, Lcom/roidapp/videolib/b/c;->b(Ljp/co/cyberagent/android/a/h;)V

    .line 266
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    new-array v2, v10, [Ljp/co/cyberagent/android/a/h;

    iget-object v4, p0, Lcom/roidapp/videolib/b/m;->o:Ljp/co/cyberagent/android/a/h;

    aput-object v4, v2, v1

    iget-object v4, p0, Lcom/roidapp/videolib/b/m;->p:Ljp/co/cyberagent/android/a/h;

    aput-object v4, v2, v3

    invoke-virtual {v0, v2}, Lcom/roidapp/videolib/b/c;->a([Ljp/co/cyberagent/android/a/h;)V

    .line 267
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->n:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v0, v2}, Lcom/roidapp/videolib/b/c;->a(Ljp/co/cyberagent/android/a/h;)V

    .line 268
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->e()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_12

    .line 269
    iput-boolean v3, p0, Lcom/roidapp/videolib/b/m;->W:Z

    .line 270
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->r:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v0, v2}, Lcom/roidapp/videolib/b/c;->c(Ljp/co/cyberagent/android/a/h;)V

    .line 275
    :goto_3
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->j:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v0, v2}, Lcom/roidapp/videolib/b/c;->a(Lcom/roidapp/videolib/b/u;)V

    .line 276
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v2}, Lcom/roidapp/videolib/gl/f;->d()I

    move-result v2

    invoke-virtual {v0, v2}, Lcom/roidapp/videolib/b/c;->b(I)V

    .line 277
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v2}, Lcom/roidapp/videolib/gl/f;->c()I

    move-result v2

    int-to-long v4, v2

    invoke-virtual {v0, v4, v5}, Lcom/roidapp/videolib/b/c;->b(J)V

    .line 278
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->h()[Lcom/roidapp/videolib/b/u;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->U:[Lcom/roidapp/videolib/b/u;

    .line 279
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->U:[Lcom/roidapp/videolib/b/u;

    invoke-virtual {v0, v2}, Lcom/roidapp/videolib/b/c;->a([Lcom/roidapp/videolib/b/u;)V

    .line 281
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/c;->e()V

    .line 282
    iget v0, p0, Lcom/roidapp/videolib/b/m;->ae:I

    iget v2, p0, Lcom/roidapp/videolib/b/m;->af:I

    invoke-virtual {p0, v0, v2}, Lcom/roidapp/videolib/b/m;->a(II)V

    .line 284
    :cond_3
    invoke-direct {p0}, Lcom/roidapp/videolib/b/m;->j()V

    .line 3177
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->L:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    if-nez v0, :cond_13

    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->j()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v0

    if-eqz v0, :cond_13

    move v0, v3

    .line 285
    :goto_4
    if-eqz v0, :cond_1c

    .line 286
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->V:Ljava/lang/String;

    const-string v2, "update MV filter, needUpdateEffectFilters"

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 287
    iput-boolean v3, p0, Lcom/roidapp/videolib/b/m;->X:Z

    .line 288
    iget-boolean v0, p0, Lcom/roidapp/videolib/b/m;->S:Z

    if-eqz v0, :cond_4

    .line 289
    iput-boolean v3, p0, Lcom/roidapp/videolib/b/m;->P:Z

    .line 290
    :cond_4
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->C:Lcom/roidapp/videolib/b/h;

    if-eqz v0, :cond_5

    .line 291
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->C:Lcom/roidapp/videolib/b/h;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/h;->i()V

    .line 292
    :cond_5
    const-string v0, "destroy mImageTextureProcessRoler"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 293
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->C:Lcom/roidapp/videolib/b/h;

    .line 295
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->j()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->L:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 296
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->M:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 297
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->C:Lcom/roidapp/videolib/b/h;

    if-eqz v0, :cond_6

    .line 298
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->C:Lcom/roidapp/videolib/b/h;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/h;->i()V

    .line 299
    :cond_6
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->C:Lcom/roidapp/videolib/b/h;

    .line 300
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->L:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    if-eqz v0, :cond_1c

    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->L:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->a()I

    move-result v0

    if-eqz v0, :cond_1c

    .line 301
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->L:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    instance-of v0, v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    if-eqz v0, :cond_18

    .line 302
    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->M:Ljava/util/ArrayList;

    iget-object v4, p0, Lcom/roidapp/videolib/b/m;->Q:Lcom/roidapp/videolib/b/y;

    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->L:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    check-cast v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    iget v5, p0, Lcom/roidapp/videolib/b/m;->ae:I

    iget v6, p0, Lcom/roidapp/videolib/b/m;->af:I

    invoke-virtual {v4, v0, v5, v6}, Lcom/roidapp/videolib/b/y;->a(Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;II)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 305
    :goto_5
    const-string v0, "addAll mImageTextureProcessRoler"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 307
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->V:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "update MV filter, GPUImageProcessRoler init:"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Lcom/roidapp/videolib/b/m;->ae:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, ","

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v4, p0, Lcom/roidapp/videolib/b/m;->af:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 308
    invoke-direct {p0}, Lcom/roidapp/videolib/b/m;->j()V

    .line 309
    const-string v0, "initImageProcess"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 310
    new-instance v0, Lcom/roidapp/videolib/b/h;

    invoke-direct {v0}, Lcom/roidapp/videolib/b/h;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->C:Lcom/roidapp/videolib/b/h;

    .line 311
    const-string v0, "GPUImageProcessRoler"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 312
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->C:Lcom/roidapp/videolib/b/h;

    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->M:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Lcom/roidapp/videolib/b/h;->a(Ljava/util/List;)V

    .line 313
    const-string v0, "GPUImageProcessRoler setFilters"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 314
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->C:Lcom/roidapp/videolib/b/h;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/h;->h()V

    .line 315
    const-string v0, "GPUImageProcessRoler init"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 316
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->C:Lcom/roidapp/videolib/b/h;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/h;->p()I

    move-result v0

    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 317
    const-string v0, "GPUImageProcessRoler glUseProgram"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    .line 318
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->C:Lcom/roidapp/videolib/b/h;

    iget v2, p0, Lcom/roidapp/videolib/b/m;->ae:I

    iget v4, p0, Lcom/roidapp/videolib/b/m;->af:I

    invoke-virtual {v0, v2, v4}, Lcom/roidapp/videolib/b/h;->a(II)V

    .line 319
    const-string v0, "GPUImageProcessRoler onOutputSizeChanged"

    invoke-static {v0}, Lcom/roidapp/videolib/gl/g;->a(Ljava/lang/String;)V

    move v2, v1

    .line 322
    :goto_6
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->M:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_1c

    .line 323
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->M:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/a/h;

    .line 324
    instance-of v4, v0, Ljp/co/cyberagent/android/a/f;

    if-eqz v4, :cond_19

    .line 325
    iget-object v4, p0, Lcom/roidapp/videolib/b/m;->ac:Lcom/roidapp/videolib/gl/e;

    invoke-virtual {v0, v4}, Ljp/co/cyberagent/android/a/h;->a(Lcom/roidapp/videolib/gl/e;)V

    .line 322
    :cond_7
    :goto_7
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_6

    .line 2155
    :cond_8
    iget-boolean v0, p0, Lcom/roidapp/videolib/b/m;->W:Z

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->e()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_9

    move v0, v3

    .line 2156
    goto/16 :goto_0

    .line 2157
    :cond_9
    iget-boolean v0, p0, Lcom/roidapp/videolib/b/m;->W:Z

    if-nez v0, :cond_a

    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->e()Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_a

    move v0, v3

    .line 2158
    goto/16 :goto_0

    .line 2159
    :cond_a
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->h()[Lcom/roidapp/videolib/b/u;

    move-result-object v2

    .line 2160
    if-nez v2, :cond_b

    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->U:[Lcom/roidapp/videolib/b/u;

    if-nez v0, :cond_c

    :cond_b
    if-eqz v2, :cond_d

    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->U:[Lcom/roidapp/videolib/b/u;

    if-nez v0, :cond_d

    :cond_c
    move v0, v3

    .line 2161
    goto/16 :goto_0

    .line 2162
    :cond_d
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->U:[Lcom/roidapp/videolib/b/u;

    if-eqz v0, :cond_10

    if-eqz v2, :cond_10

    .line 2163
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->U:[Lcom/roidapp/videolib/b/u;

    array-length v0, v0

    array-length v4, v2

    if-eq v0, v4, :cond_e

    move v0, v3

    .line 2164
    goto/16 :goto_0

    :cond_e
    move v0, v1

    .line 2165
    :goto_8
    iget-object v4, p0, Lcom/roidapp/videolib/b/m;->U:[Lcom/roidapp/videolib/b/u;

    array-length v4, v4

    if-ge v0, v4, :cond_10

    .line 2166
    iget-object v4, p0, Lcom/roidapp/videolib/b/m;->U:[Lcom/roidapp/videolib/b/u;

    aget-object v4, v4, v0

    aget-object v5, v2, v0

    if-eq v4, v5, :cond_f

    move v0, v3

    .line 2167
    goto/16 :goto_0

    .line 2165
    :cond_f
    add-int/lit8 v0, v0, 0x1

    goto :goto_8

    :cond_10
    move v0, v1

    .line 2171
    goto/16 :goto_0

    .line 3010
    :pswitch_0
    new-instance v0, Lcom/roidapp/videolib/b/g;

    invoke-direct {v0, v2}, Lcom/roidapp/videolib/b/g;-><init>(Landroid/content/Context;)V

    goto/16 :goto_1

    .line 3012
    :pswitch_1
    new-instance v0, Lcom/roidapp/videolib/b/f;

    invoke-direct {v0, v2}, Lcom/roidapp/videolib/b/f;-><init>(Landroid/content/Context;)V

    goto/16 :goto_1

    .line 259
    :cond_11
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->I:[F

    aput v8, v0, v1

    .line 260
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->I:[F

    aput v8, v0, v3

    .line 261
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->I:[F

    aput v8, v0, v10

    .line 262
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->I:[F

    const/4 v2, 0x3

    aput v8, v0, v2

    goto/16 :goto_2

    .line 272
    :cond_12
    iput-boolean v1, p0, Lcom/roidapp/videolib/b/m;->W:Z

    goto/16 :goto_3

    .line 3179
    :cond_13
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->L:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    if-eqz v0, :cond_14

    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->j()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v0

    if-nez v0, :cond_14

    move v0, v3

    .line 3180
    goto/16 :goto_4

    .line 3181
    :cond_14
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->L:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    if-nez v0, :cond_15

    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->j()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v0

    if-eqz v0, :cond_17

    .line 3183
    :cond_15
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->L:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    invoke-interface {v0}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->a()I

    move-result v0

    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v2}, Lcom/roidapp/videolib/gl/f;->j()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v2

    invoke-interface {v2}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->a()I

    move-result v2

    if-ne v0, v2, :cond_16

    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->j()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v0

    instance-of v0, v0, Lcom/roidapp/imagelib/filter/filterinfo/CloudFilterInfo;

    if-eqz v0, :cond_17

    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->L:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v2}, Lcom/roidapp/videolib/gl/f;->j()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v2

    if-eq v0, v2, :cond_17

    :cond_16
    move v0, v3

    .line 3184
    goto/16 :goto_4

    :cond_17
    move v0, v1

    .line 3185
    goto/16 :goto_4

    .line 304
    :cond_18
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->M:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->Q:Lcom/roidapp/videolib/b/y;

    iget-object v4, p0, Lcom/roidapp/videolib/b/m;->L:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    invoke-interface {v4}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->a()I

    move-result v4

    iget v5, p0, Lcom/roidapp/videolib/b/m;->ae:I

    iget v6, p0, Lcom/roidapp/videolib/b/m;->af:I

    invoke-virtual {v2, v4, v5, v6}, Lcom/roidapp/videolib/b/y;->a(III)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_5

    .line 326
    :cond_19
    instance-of v4, v0, Ljp/co/cyberagent/android/a/ad;

    if-eqz v4, :cond_1b

    .line 327
    check-cast v0, Ljp/co/cyberagent/android/a/k;

    .line 328
    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/k;->q()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_7

    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/k;->q()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_7

    .line 329
    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/k;->q()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1a
    :goto_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/a/h;

    .line 330
    instance-of v5, v0, Ljp/co/cyberagent/android/a/f;

    if-eqz v5, :cond_1a

    .line 331
    iget-object v5, p0, Lcom/roidapp/videolib/b/m;->ac:Lcom/roidapp/videolib/gl/e;

    invoke-virtual {v0, v5}, Ljp/co/cyberagent/android/a/h;->a(Lcom/roidapp/videolib/gl/e;)V

    goto :goto_9

    .line 335
    :cond_1b
    instance-of v4, v0, Ljp/co/cyberagent/android/a/b;

    if-eqz v4, :cond_7

    .line 336
    iget-object v4, p0, Lcom/roidapp/videolib/b/m;->ac:Lcom/roidapp/videolib/gl/e;

    invoke-virtual {v0, v4}, Ljp/co/cyberagent/android/a/h;->a(Lcom/roidapp/videolib/gl/e;)V

    goto/16 :goto_7

    .line 342
    :cond_1c
    iget v0, p0, Lcom/roidapp/videolib/b/m;->R:I

    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v2}, Lcom/roidapp/videolib/gl/f;->k()I

    move-result v2

    if-ne v0, v2, :cond_1d

    iget-boolean v0, p0, Lcom/roidapp/videolib/b/m;->X:Z

    if-eqz v0, :cond_20

    .line 343
    :cond_1d
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->V:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "update MV filter, mAlphaProgress:"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, p0, Lcom/roidapp/videolib/b/m;->R:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 344
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->k()I

    move-result v0

    iput v0, p0, Lcom/roidapp/videolib/b/m;->R:I

    .line 345
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->M:Ljava/util/ArrayList;

    if-eqz v0, :cond_1f

    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->M:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1f

    .line 346
    :goto_a
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->M:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1f

    .line 347
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->M:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljp/co/cyberagent/android/a/b;

    if-eqz v0, :cond_1e

    .line 348
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->M:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/a/b;

    .line 349
    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->V:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "update MV filter i"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, ", mAlphaProgress:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget v5, p0, Lcom/roidapp/videolib/b/m;->R:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 350
    iget v2, p0, Lcom/roidapp/videolib/b/m;->R:I

    invoke-static {v2}, Lcom/roidapp/videolib/b/y;->a(I)F

    move-result v2

    invoke-virtual {v0, v2}, Ljp/co/cyberagent/android/a/b;->a(F)V

    .line 346
    :cond_1e
    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    .line 354
    :cond_1f
    iput-boolean v3, p0, Lcom/roidapp/videolib/b/m;->X:Z

    .line 359
    :cond_20
    return-void

    .line 3008
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final a(F)V
    .locals 1

    .prologue
    .line 1013
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->n:Ljp/co/cyberagent/android/a/h;

    if-eqz v0, :cond_0

    .line 1014
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->n:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/a/h;->f(F)V

    .line 1015
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->o:Ljp/co/cyberagent/android/a/h;

    if-eqz v0, :cond_1

    .line 1016
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->o:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/a/h;->f(F)V

    .line 1017
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->p:Ljp/co/cyberagent/android/a/h;

    if-eqz v0, :cond_2

    .line 1018
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->p:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v0, p1}, Ljp/co/cyberagent/android/a/h;->f(F)V

    .line 1019
    :cond_2
    return-void
.end method

.method public final a(II)V
    .locals 3

    .prologue
    .line 999
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->V:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onViewSizeChanged:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1000
    iput p1, p0, Lcom/roidapp/videolib/b/m;->ae:I

    .line 1001
    iput p2, p0, Lcom/roidapp/videolib/b/m;->af:I

    .line 1002
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/roidapp/videolib/b/m;->ae:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/roidapp/videolib/b/m;->af:I

    if-eqz v0, :cond_0

    .line 1003
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    iget v1, p0, Lcom/roidapp/videolib/b/m;->ae:I

    iget v2, p0, Lcom/roidapp/videolib/b/m;->af:I

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/videolib/b/c;->a(II)V

    .line 1004
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->C:Lcom/roidapp/videolib/b/h;

    if-eqz v0, :cond_1

    if-eqz p2, :cond_1

    if-eqz p1, :cond_1

    .line 1005
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->C:Lcom/roidapp/videolib/b/h;

    iget v1, p0, Lcom/roidapp/videolib/b/m;->ae:I

    iget v2, p0, Lcom/roidapp/videolib/b/m;->af:I

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/videolib/b/h;->a(II)V

    .line 1007
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->D:Lcom/roidapp/videolib/b/h;

    if-eqz v0, :cond_2

    if-eqz p2, :cond_2

    if-eqz p1, :cond_2

    .line 1008
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->D:Lcom/roidapp/videolib/b/h;

    iget v1, p0, Lcom/roidapp/videolib/b/m;->ae:I

    iget v2, p0, Lcom/roidapp/videolib/b/m;->af:I

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/videolib/b/h;->a(II)V

    .line 1009
    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/videolib/b/m;->X:Z

    .line 1010
    return-void
.end method

.method public final a(IZ)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 131
    iput-boolean p2, p0, Lcom/roidapp/videolib/b/m;->S:Z

    .line 132
    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    .line 133
    iput p1, p0, Lcom/roidapp/videolib/b/m;->T:I

    .line 134
    :cond_0
    iget-boolean v0, p0, Lcom/roidapp/videolib/b/m;->S:Z

    if-eqz v0, :cond_2

    .line 135
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->N:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->N:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 136
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->N:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljp/co/cyberagent/android/a/n;

    .line 137
    iget v1, p0, Lcom/roidapp/videolib/b/m;->T:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/n;->a(F)V

    .line 138
    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->N:Ljava/util/ArrayList;

    invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 140
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/videolib/b/m;->P:Z

    .line 146
    :goto_0
    return-void

    .line 142
    :cond_2
    iput-boolean v2, p0, Lcom/roidapp/videolib/b/m;->P:Z

    goto :goto_0
.end method

.method public final a(Lcom/roidapp/videolib/gl/f;)V
    .locals 0

    .prologue
    .line 127
    iput-object p1, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    .line 128
    return-void
.end method

.method public final b()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 581
    iget-boolean v0, p0, Lcom/roidapp/videolib/b/m;->Z:Z

    if-eqz v0, :cond_0

    .line 982
    :goto_0
    return-void

    .line 583
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->V:Ljava/lang/String;

    const-string v1, "init"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 584
    invoke-direct {p0}, Lcom/roidapp/videolib/b/m;->j()V

    .line 585
    invoke-direct {p0}, Lcom/roidapp/videolib/b/m;->k()V

    .line 586
    const/4 v0, 0x3

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->aa:[I

    .line 587
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->aa:[I

    array-length v0, v0

    new-array v0, v0, [Lcom/roidapp/videolib/gl/e;

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->ad:[Lcom/roidapp/videolib/gl/e;

    .line 589
    new-instance v0, Ljp/co/cyberagent/android/a/r;

    invoke-direct {v0}, Ljp/co/cyberagent/android/a/r;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->n:Ljp/co/cyberagent/android/a/h;

    .line 590
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->ad:[Lcom/roidapp/videolib/gl/e;

    new-instance v1, Lcom/roidapp/videolib/b/p;

    invoke-direct {v1, p0}, Lcom/roidapp/videolib/b/p;-><init>(Lcom/roidapp/videolib/b/m;)V

    aput-object v1, v0, v3

    .line 684
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->n:Ljp/co/cyberagent/android/a/h;

    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->ad:[Lcom/roidapp/videolib/gl/e;

    aget-object v1, v1, v3

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/h;->a(Lcom/roidapp/videolib/gl/e;)V

    .line 686
    new-instance v0, Ljp/co/cyberagent/android/a/r;

    invoke-direct {v0}, Ljp/co/cyberagent/android/a/r;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->o:Ljp/co/cyberagent/android/a/h;

    .line 688
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->ad:[Lcom/roidapp/videolib/gl/e;

    new-instance v1, Lcom/roidapp/videolib/b/q;

    invoke-direct {v1, p0}, Lcom/roidapp/videolib/b/q;-><init>(Lcom/roidapp/videolib/b/m;)V

    aput-object v1, v0, v2

    .line 761
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->o:Ljp/co/cyberagent/android/a/h;

    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->ad:[Lcom/roidapp/videolib/gl/e;

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/h;->a(Lcom/roidapp/videolib/gl/e;)V

    .line 763
    new-instance v0, Ljp/co/cyberagent/android/a/r;

    invoke-direct {v0}, Ljp/co/cyberagent/android/a/r;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->p:Ljp/co/cyberagent/android/a/h;

    .line 764
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->ad:[Lcom/roidapp/videolib/gl/e;

    new-instance v1, Lcom/roidapp/videolib/b/r;

    invoke-direct {v1, p0}, Lcom/roidapp/videolib/b/r;-><init>(Lcom/roidapp/videolib/b/m;)V

    aput-object v1, v0, v4

    .line 837
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->p:Ljp/co/cyberagent/android/a/h;

    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->ad:[Lcom/roidapp/videolib/gl/e;

    aget-object v1, v1, v4

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/h;->a(Lcom/roidapp/videolib/gl/e;)V

    .line 839
    new-instance v0, Ljp/co/cyberagent/android/a/c;

    invoke-direct {v0}, Ljp/co/cyberagent/android/a/c;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->q:Ljp/co/cyberagent/android/a/h;

    .line 840
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->q:Ljp/co/cyberagent/android/a/h;

    new-instance v1, Lcom/roidapp/videolib/b/s;

    invoke-direct {v1, p0}, Lcom/roidapp/videolib/b/s;-><init>(Lcom/roidapp/videolib/b/m;)V

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/h;->a(Lcom/roidapp/videolib/gl/e;)V

    .line 904
    new-instance v0, Ljp/co/cyberagent/android/a/r;

    invoke-direct {v0}, Ljp/co/cyberagent/android/a/r;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->r:Ljp/co/cyberagent/android/a/h;

    .line 905
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->r:Ljp/co/cyberagent/android/a/h;

    new-instance v1, Lcom/roidapp/videolib/b/t;

    invoke-direct {v1, p0}, Lcom/roidapp/videolib/b/t;-><init>(Lcom/roidapp/videolib/b/m;)V

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/h;->a(Lcom/roidapp/videolib/gl/e;)V

    .line 973
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->q:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->h()V

    .line 974
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->n:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->h()V

    .line 975
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->o:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->h()V

    .line 976
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->p:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->h()V

    .line 977
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->r:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->h()V

    .line 978
    invoke-virtual {p0}, Lcom/roidapp/videolib/b/m;->a()V

    .line 3985
    new-instance v0, Ljp/co/cyberagent/android/a/n;

    iget v1, p0, Lcom/roidapp/videolib/b/m;->T:I

    int-to-float v1, v1

    invoke-direct {v0, v1}, Ljp/co/cyberagent/android/a/n;-><init>(F)V

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->O:Ljp/co/cyberagent/android/a/n;

    .line 3986
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->N:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 3987
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->N:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->O:Ljp/co/cyberagent/android/a/n;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 980
    iput-boolean v2, p0, Lcom/roidapp/videolib/b/m;->Z:Z

    goto/16 :goto_0
.end method

.method public final b(I)V
    .locals 0

    .prologue
    .line 1199
    iput p1, p0, Lcom/roidapp/videolib/b/m;->ah:I

    .line 1200
    return-void
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 991
    invoke-virtual {p0}, Lcom/roidapp/videolib/b/m;->f()V

    .line 992
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    .line 993
    return-void
.end method

.method public final d()Z
    .locals 4

    .prologue
    .line 1022
    iget v0, p0, Lcom/roidapp/videolib/b/m;->t:I

    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v1}, Lcom/roidapp/videolib/gl/f;->d()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    .line 4648
    iget-object v0, v0, Lcom/roidapp/videolib/b/c;->q:[Lcom/roidapp/videolib/b/l;

    .line 1022
    if-eqz v0, :cond_2

    :cond_0
    iget-wide v0, p0, Lcom/roidapp/videolib/b/m;->ag:J

    iget-object v2, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v2}, Lcom/roidapp/videolib/gl/f;->c()I

    move-result v2

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->i()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/c;->g()I

    move-result v0

    if-nez v0, :cond_2

    .line 1027
    :cond_1
    const/4 v0, 0x1

    .line 1028
    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()J
    .locals 2

    .prologue
    .line 1071
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->d()I

    move-result v0

    if-nez v0, :cond_1

    .line 1072
    :cond_0
    const-wide/16 v0, 0x3a98

    .line 1077
    :goto_0
    return-wide v0

    .line 1074
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->c()I

    move-result v0

    const/16 v1, 0xbb8

    if-le v0, v1, :cond_2

    .line 1075
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->c()I

    move-result v0

    add-int/lit16 v0, v0, -0x3e8

    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v1}, Lcom/roidapp/videolib/gl/f;->d()I

    move-result v1

    div-int/2addr v0, v1

    int-to-long v0, v0

    goto :goto_0

    .line 1077
    :cond_2
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v0}, Lcom/roidapp/videolib/gl/f;->c()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->s:Lcom/roidapp/videolib/gl/f;

    invoke-interface {v1}, Lcom/roidapp/videolib/gl/f;->d()I

    move-result v1

    div-int/2addr v0, v1

    int-to-long v0, v0

    goto :goto_0
.end method

.method public final f()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v4, -0x1

    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 1113
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->V:Ljava/lang/String;

    const-string v1, "photoMV reset"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1114
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    if-eqz v0, :cond_0

    .line 1115
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/c;->h()V

    .line 1116
    iput-object v3, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    .line 1118
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->r:Ljp/co/cyberagent/android/a/h;

    if-eqz v0, :cond_1

    .line 1119
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->r:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->i()V

    .line 1120
    iput-object v3, p0, Lcom/roidapp/videolib/b/m;->r:Ljp/co/cyberagent/android/a/h;

    .line 1123
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->n:Ljp/co/cyberagent/android/a/h;

    if-eqz v0, :cond_2

    .line 1124
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->n:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->i()V

    .line 1125
    iput-object v3, p0, Lcom/roidapp/videolib/b/m;->n:Ljp/co/cyberagent/android/a/h;

    .line 1128
    :cond_2
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->q:Ljp/co/cyberagent/android/a/h;

    if-eqz v0, :cond_3

    .line 1129
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->q:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->i()V

    .line 1130
    iput-object v3, p0, Lcom/roidapp/videolib/b/m;->q:Ljp/co/cyberagent/android/a/h;

    .line 1133
    :cond_3
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->o:Ljp/co/cyberagent/android/a/h;

    if-eqz v0, :cond_4

    .line 1134
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->o:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->i()V

    .line 1135
    iput-object v3, p0, Lcom/roidapp/videolib/b/m;->o:Ljp/co/cyberagent/android/a/h;

    .line 1138
    :cond_4
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->p:Ljp/co/cyberagent/android/a/h;

    if-eqz v0, :cond_5

    .line 1139
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->p:Ljp/co/cyberagent/android/a/h;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/h;->i()V

    .line 1140
    iput-object v3, p0, Lcom/roidapp/videolib/b/m;->p:Ljp/co/cyberagent/android/a/h;

    .line 1143
    :cond_5
    iget v0, p0, Lcom/roidapp/videolib/b/m;->z:I

    if-eq v0, v4, :cond_6

    .line 1144
    new-array v0, v5, [I

    iget v1, p0, Lcom/roidapp/videolib/b/m;->z:I

    aput v1, v0, v2

    invoke-static {v5, v0, v2}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 1145
    iput v4, p0, Lcom/roidapp/videolib/b/m;->z:I

    .line 1147
    :cond_6
    iget v0, p0, Lcom/roidapp/videolib/b/m;->y:I

    if-eq v0, v4, :cond_7

    .line 1148
    new-array v0, v5, [I

    iget v1, p0, Lcom/roidapp/videolib/b/m;->y:I

    aput v1, v0, v2

    invoke-static {v5, v0, v2}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 1149
    iput v4, p0, Lcom/roidapp/videolib/b/m;->y:I

    .line 1152
    :cond_7
    iget v0, p0, Lcom/roidapp/videolib/b/m;->A:I

    if-eq v0, v4, :cond_8

    .line 1153
    new-array v0, v5, [I

    iget v1, p0, Lcom/roidapp/videolib/b/m;->A:I

    aput v1, v0, v2

    invoke-static {v5, v0, v2}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 1154
    iput v4, p0, Lcom/roidapp/videolib/b/m;->A:I

    .line 1157
    :cond_8
    iget v0, p0, Lcom/roidapp/videolib/b/m;->B:I

    if-eq v0, v4, :cond_9

    .line 1158
    new-array v0, v5, [I

    iget v1, p0, Lcom/roidapp/videolib/b/m;->B:I

    aput v1, v0, v2

    invoke-static {v5, v0, v2}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 1159
    iput v4, p0, Lcom/roidapp/videolib/b/m;->B:I

    .line 1162
    :cond_9
    iget v0, p0, Lcom/roidapp/videolib/b/m;->w:I

    if-eq v0, v4, :cond_a

    .line 1163
    new-array v0, v5, [I

    iget v1, p0, Lcom/roidapp/videolib/b/m;->w:I

    aput v1, v0, v2

    invoke-static {v5, v0, v2}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 1164
    iput v4, p0, Lcom/roidapp/videolib/b/m;->w:I

    .line 1166
    :cond_a
    iget v0, p0, Lcom/roidapp/videolib/b/m;->x:I

    if-eq v0, v4, :cond_b

    .line 1167
    new-array v0, v5, [I

    iget v1, p0, Lcom/roidapp/videolib/b/m;->x:I

    aput v1, v0, v2

    invoke-static {v5, v0, v2}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 1168
    iput v4, p0, Lcom/roidapp/videolib/b/m;->x:I

    .line 1170
    :cond_b
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->C:Lcom/roidapp/videolib/b/h;

    if-eqz v0, :cond_c

    .line 1171
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->C:Lcom/roidapp/videolib/b/h;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/h;->i()V

    .line 1172
    iput-object v3, p0, Lcom/roidapp/videolib/b/m;->C:Lcom/roidapp/videolib/b/h;

    .line 1174
    :cond_c
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->D:Lcom/roidapp/videolib/b/h;

    if-eqz v0, :cond_d

    .line 1175
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->D:Lcom/roidapp/videolib/b/h;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/h;->i()V

    .line 1176
    iput-object v3, p0, Lcom/roidapp/videolib/b/m;->D:Lcom/roidapp/videolib/b/h;

    .line 1178
    :cond_d
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->O:Ljp/co/cyberagent/android/a/n;

    if-eqz v0, :cond_e

    .line 1179
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->O:Ljp/co/cyberagent/android/a/n;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/n;->i()V

    .line 1180
    iput-object v3, p0, Lcom/roidapp/videolib/b/m;->O:Ljp/co/cyberagent/android/a/n;

    .line 1182
    :cond_e
    iput-object v3, p0, Lcom/roidapp/videolib/b/m;->L:Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    .line 1183
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->M:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 6553
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->V:Ljava/lang/String;

    const-string v1, "deInitImageProcess"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 6554
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->F:[I

    if-eqz v0, :cond_f

    .line 6555
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->F:[I

    array-length v0, v0

    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->F:[I

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 6556
    iput-object v3, p0, Lcom/roidapp/videolib/b/m;->F:[I

    .line 6558
    :cond_f
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->E:[I

    if-eqz v0, :cond_10

    .line 6559
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->E:[I

    array-length v0, v0

    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->E:[I

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glDeleteFramebuffers(I[II)V

    .line 6560
    iput-object v3, p0, Lcom/roidapp/videolib/b/m;->E:[I

    .line 6563
    :cond_10
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->H:[I

    if-eqz v0, :cond_11

    .line 6564
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->H:[I

    array-length v0, v0

    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->H:[I

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    .line 6565
    iput-object v3, p0, Lcom/roidapp/videolib/b/m;->H:[I

    .line 6567
    :cond_11
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->G:[I

    if-eqz v0, :cond_12

    .line 6568
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->G:[I

    array-length v0, v0

    iget-object v1, p0, Lcom/roidapp/videolib/b/m;->G:[I

    invoke-static {v0, v1, v2}, Landroid/opengl/GLES20;->glDeleteFramebuffers(I[II)V

    .line 6569
    iput-object v3, p0, Lcom/roidapp/videolib/b/m;->G:[I

    .line 1185
    :cond_12
    iput-object v3, p0, Lcom/roidapp/videolib/b/m;->aa:[I

    .line 1186
    iput-object v3, p0, Lcom/roidapp/videolib/b/m;->ad:[Lcom/roidapp/videolib/gl/e;

    .line 1187
    sget-object v0, Lcom/roidapp/videolib/b/u;->a:Lcom/roidapp/videolib/b/u;

    iput-object v0, p0, Lcom/roidapp/videolib/b/m;->j:Lcom/roidapp/videolib/b/u;

    .line 1188
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/roidapp/videolib/b/m;->ag:J

    .line 1189
    iput v2, p0, Lcom/roidapp/videolib/b/m;->t:I

    .line 1190
    iput-boolean v2, p0, Lcom/roidapp/videolib/b/m;->Z:Z

    .line 1191
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->V:Ljava/lang/String;

    const-string v1, "photoMV reset out"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1192
    return-void
.end method

.method protected final finalize()V
    .locals 0

    .prologue
    .line 1205
    invoke-virtual {p0}, Lcom/roidapp/videolib/b/m;->c()V

    .line 1206
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 1207
    return-void
.end method

.method public final g()I
    .locals 10

    .prologue
    const/4 v1, 0x0

    const/4 v3, -0x1

    .line 1214
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    if-nez v0, :cond_1

    move v1, v3

    .line 1232
    :cond_0
    :goto_0
    return v1

    .line 1217
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    iget-wide v4, p0, Lcom/roidapp/videolib/b/m;->ag:J

    const/4 v2, 0x1

    invoke-virtual {v0, v4, v5, v2}, Lcom/roidapp/videolib/b/c;->a(JZ)I

    move-result v2

    .line 1218
    if-ne v3, v2, :cond_6

    .line 1219
    iget-object v0, p0, Lcom/roidapp/videolib/b/m;->l:Lcom/roidapp/videolib/b/c;

    .line 6648
    iget-object v4, v0, Lcom/roidapp/videolib/b/c;->q:[Lcom/roidapp/videolib/b/l;

    .line 1220
    if-eqz v4, :cond_0

    move v0, v1

    .line 1223
    :goto_1
    array-length v5, v4

    if-ge v0, v5, :cond_5

    .line 1224
    iget-wide v6, p0, Lcom/roidapp/videolib/b/m;->ag:J

    aget-object v5, v4, v0

    iget-wide v8, v5, Lcom/roidapp/videolib/b/l;->b:J

    cmp-long v5, v6, v8

    if-gez v5, :cond_4

    .line 1225
    if-nez v0, :cond_3

    :goto_2
    move v0, v1

    .line 1229
    :goto_3
    if-ne v0, v3, :cond_2

    .line 1230
    array-length v0, v4

    add-int/lit8 v0, v0, -0x1

    :cond_2
    :goto_4
    move v1, v0

    .line 1232
    goto :goto_0

    .line 1225
    :cond_3
    add-int/lit8 v1, v0, -0x1

    goto :goto_2

    .line 1223
    :cond_4
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    move v0, v2

    goto :goto_3

    :cond_6
    move v0, v2

    goto :goto_4
.end method
