.class public Lcom/android/volley/toolbox/h;
.super Lcom/android/volley/Request;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/android/volley/Request",
        "<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# static fields
.field private static final e:Ljava/lang/Object;


# instance fields
.field private final a:Lcom/android/volley/k$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/volley/k$b",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Landroid/graphics/Bitmap$Config;

.field private final c:I

.field private final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 50
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/android/volley/toolbox/h;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/android/volley/k$b;IILandroid/graphics/Bitmap$Config;Lcom/android/volley/k$a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/android/volley/k$b",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;II",
            "Landroid/graphics/Bitmap$Config;",
            "Lcom/android/volley/k$a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 77
    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p6}, Lcom/android/volley/Request;-><init>(ILjava/lang/String;Lcom/android/volley/k$a;)V

    .line 78
    new-instance v0, Lcom/android/volley/c;

    const/16 v1, 0x3e8

    const/4 v2, 0x2

    .line 79
    const/high16 v3, 0x40000000    # 2.0f

    invoke-direct {v0, v1, v2, v3}, Lcom/android/volley/c;-><init>(IIF)V

    .line 78
    invoke-virtual {p0, v0}, Lcom/android/volley/toolbox/h;->a(Lcom/android/volley/m;)Lcom/android/volley/Request;

    .line 80
    iput-object p2, p0, Lcom/android/volley/toolbox/h;->a:Lcom/android/volley/k$b;

    .line 81
    iput-object p5, p0, Lcom/android/volley/toolbox/h;->b:Landroid/graphics/Bitmap$Config;

    .line 82
    iput p3, p0, Lcom/android/volley/toolbox/h;->c:I

    .line 83
    iput p4, p0, Lcom/android/volley/toolbox/h;->d:I

    .line 84
    return-void
.end method

.method static a(IIII)I
    .locals 7

    .prologue
    const/high16 v6, 0x40000000    # 2.0f

    .line 208
    int-to-double v0, p0

    int-to-double v2, p2

    div-double/2addr v0, v2

    .line 209
    int-to-double v2, p1

    int-to-double v4, p3

    div-double/2addr v2, v4

    .line 210
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    move-result-wide v2

    .line 211
    const/high16 v0, 0x3f800000    # 1.0f

    .line 212
    :goto_0
    mul-float v1, v0, v6

    float-to-double v4, v1

    cmpg-double v1, v4, v2

    if-lez v1, :cond_0

    .line 216
    float-to-int v0, v0

    return v0

    .line 213
    :cond_0
    mul-float/2addr v0, v6

    goto :goto_0
.end method

.method private static b(IIII)I
    .locals 6

    .prologue
    .line 108
    if-nez p0, :cond_1

    if-nez p1, :cond_1

    move p0, p2

    .line 127
    :cond_0
    :goto_0
    return p0

    .line 113
    :cond_1
    if-nez p0, :cond_2

    .line 114
    int-to-double v0, p1

    int-to-double v2, p3

    div-double/2addr v0, v2

    .line 115
    int-to-double v2, p2

    mul-double/2addr v0, v2

    double-to-int p0, v0

    goto :goto_0

    .line 118
    :cond_2
    if-eqz p1, :cond_0

    .line 122
    int-to-double v0, p3

    int-to-double v2, p2

    div-double/2addr v0, v2

    .line 124
    int-to-double v2, p0

    mul-double/2addr v2, v0

    int-to-double v4, p1

    cmpl-double v2, v2, v4

    if-lez v2, :cond_0

    .line 125
    int-to-double v2, p1

    div-double v0, v2, v0

    double-to-int p0, v0

    goto :goto_0
.end method

.method private b(Lcom/android/volley/i;)Lcom/android/volley/k;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/volley/i;",
            ")",
            "Lcom/android/volley/k",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 147
    iget-object v0, p1, Lcom/android/volley/i;->b:[B

    .line 148
    new-instance v1, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 150
    iget v2, p0, Lcom/android/volley/toolbox/h;->c:I

    if-nez v2, :cond_0

    iget v2, p0, Lcom/android/volley/toolbox/h;->d:I

    if-nez v2, :cond_0

    .line 151
    iget-object v2, p0, Lcom/android/volley/toolbox/h;->b:Landroid/graphics/Bitmap$Config;

    iput-object v2, v1, Landroid/graphics/BitmapFactory$Options;->inPreferredConfig:Landroid/graphics/Bitmap$Config;

    .line 152
    array-length v2, v0

    invoke-static {v0, v7, v2, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 181
    :goto_0
    if-nez v0, :cond_3

    .line 182
    new-instance v0, Lcom/android/volley/ParseError;

    invoke-direct {v0, p1}, Lcom/android/volley/ParseError;-><init>(Lcom/android/volley/i;)V

    invoke-static {v0}, Lcom/android/volley/k;->a(Lcom/android/volley/VolleyError;)Lcom/android/volley/k;

    move-result-object v0

    .line 184
    :goto_1
    return-object v0

    .line 155
    :cond_0
    iput-boolean v8, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 156
    array-length v2, v0

    invoke-static {v0, v7, v2, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 157
    iget v2, v1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 158
    iget v3, v1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 161
    iget v4, p0, Lcom/android/volley/toolbox/h;->c:I

    iget v5, p0, Lcom/android/volley/toolbox/h;->d:I

    invoke-static {v4, v5, v2, v3}, Lcom/android/volley/toolbox/h;->b(IIII)I

    move-result v4

    .line 162
    iget v5, p0, Lcom/android/volley/toolbox/h;->d:I

    iget v6, p0, Lcom/android/volley/toolbox/h;->c:I

    invoke-static {v5, v6, v3, v2}, Lcom/android/volley/toolbox/h;->b(IIII)I

    move-result v5

    .line 165
    iput-boolean v7, v1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 168
    invoke-static {v2, v3, v4, v5}, Lcom/android/volley/toolbox/h;->a(IIII)I

    move-result v2

    iput v2, v1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    .line 170
    array-length v2, v0

    invoke-static {v0, v7, v2, v1}, Landroid/graphics/BitmapFactory;->decodeByteArray([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 173
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-gt v0, v4, :cond_1

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    if-le v0, v5, :cond_2

    .line 174
    :cond_1
    invoke-static {v1, v4, v5, v8}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 175
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    goto :goto_0

    :cond_2
    move-object v0, v1

    .line 177
    goto :goto_0

    .line 184
    :cond_3
    invoke-static {p1}, Lcom/android/volley/toolbox/d;->a(Lcom/android/volley/i;)Lcom/android/volley/a$a;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/android/volley/k;->a(Ljava/lang/Object;Lcom/android/volley/a$a;)Lcom/android/volley/k;

    move-result-object v0

    goto :goto_1
.end method


# virtual methods
.method protected a(Lcom/android/volley/i;)Lcom/android/volley/k;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/volley/i;",
            ")",
            "Lcom/android/volley/k",
            "<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .prologue
    .line 133
    sget-object v1, Lcom/android/volley/toolbox/h;->e:Ljava/lang/Object;

    monitor-enter v1

    .line 135
    :try_start_0
    invoke-direct {p0, p1}, Lcom/android/volley/toolbox/h;->b(Lcom/android/volley/i;)Lcom/android/volley/k;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    :try_start_1
    monitor-exit v1

    .line 138
    :goto_0
    return-object v0

    .line 136
    :catch_0
    move-exception v0

    .line 137
    const-string/jumbo v2, "Caught OOM for %d byte image, url=%s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p1, Lcom/android/volley/i;->b:[B

    array-length v5, v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    invoke-virtual {p0}, Lcom/android/volley/toolbox/h;->d()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-static {v2, v3}, Lcom/android/volley/n;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    new-instance v2, Lcom/android/volley/ParseError;

    invoke-direct {v2, v0}, Lcom/android/volley/ParseError;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v2}, Lcom/android/volley/k;->a(Lcom/android/volley/VolleyError;)Lcom/android/volley/k;

    move-result-object v0

    monitor-exit v1

    goto :goto_0

    .line 133
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method protected a(Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 190
    iget-object v0, p0, Lcom/android/volley/toolbox/h;->a:Lcom/android/volley/k$b;

    invoke-interface {v0, p1}, Lcom/android/volley/k$b;->a(Ljava/lang/Object;)V

    .line 191
    return-void
.end method

.method protected synthetic b(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1}, Lcom/android/volley/toolbox/h;->a(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public s()Lcom/android/volley/Request$Priority;
    .locals 1

    .prologue
    .line 88
    sget-object v0, Lcom/android/volley/Request$Priority;->LOW:Lcom/android/volley/Request$Priority;

    return-object v0
.end method
