.class public Lcom/android/volley/toolbox/g;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/volley/toolbox/g$a;,
        Lcom/android/volley/toolbox/g$b;,
        Lcom/android/volley/toolbox/g$c;,
        Lcom/android/volley/toolbox/g$d;
    }
.end annotation


# instance fields
.field private final a:Lcom/android/volley/j;

.field private b:I

.field private final c:Lcom/android/volley/toolbox/g$b;

.field private final d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/android/volley/toolbox/g$a;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/android/volley/toolbox/g$a;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Landroid/os/Handler;

.field private g:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/android/volley/j;Lcom/android/volley/toolbox/g$b;)V
    .locals 2

    .prologue
    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    const/16 v0, 0x64

    iput v0, p0, Lcom/android/volley/toolbox/g;->b:I

    .line 55
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/android/volley/toolbox/g;->d:Ljava/util/HashMap;

    .line 58
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/android/volley/toolbox/g;->e:Ljava/util/HashMap;

    .line 61
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/android/volley/toolbox/g;->f:Landroid/os/Handler;

    .line 86
    iput-object p1, p0, Lcom/android/volley/toolbox/g;->a:Lcom/android/volley/j;

    .line 87
    iput-object p2, p0, Lcom/android/volley/toolbox/g;->c:Lcom/android/volley/toolbox/g$b;

    .line 88
    return-void
.end method

.method static synthetic a(Lcom/android/volley/toolbox/g;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/android/volley/toolbox/g;->d:Ljava/util/HashMap;

    return-object v0
.end method

.method private a()V
    .locals 2

    .prologue
    .line 497
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-eq v0, v1, :cond_0

    .line 498
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "ImageLoader must be invoked from the main thread."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 500
    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/android/volley/toolbox/g;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/android/volley/toolbox/g;->g:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic a(Lcom/android/volley/toolbox/g;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 270
    invoke-direct {p0, p1, p2}, Lcom/android/volley/toolbox/g;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method static synthetic a(Lcom/android/volley/toolbox/g;Ljava/lang/String;Lcom/android/volley/VolleyError;)V
    .locals 0

    .prologue
    .line 292
    invoke-direct {p0, p1, p2}, Lcom/android/volley/toolbox/g;->a(Ljava/lang/String;Lcom/android/volley/VolleyError;)V

    return-void
.end method

.method private a(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 272
    iget-object v0, p0, Lcom/android/volley/toolbox/g;->c:Lcom/android/volley/toolbox/g$b;

    invoke-interface {v0, p1, p2}, Lcom/android/volley/toolbox/g$b;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 275
    iget-object v0, p0, Lcom/android/volley/toolbox/g;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/volley/toolbox/g$a;

    .line 277
    if-eqz v0, :cond_0

    .line 279
    invoke-static {v0, p2}, Lcom/android/volley/toolbox/g$a;->a(Lcom/android/volley/toolbox/g$a;Landroid/graphics/Bitmap;)V

    .line 282
    invoke-direct {p0, p1, v0}, Lcom/android/volley/toolbox/g;->a(Ljava/lang/String;Lcom/android/volley/toolbox/g$a;)V

    .line 284
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;Lcom/android/volley/VolleyError;)V
    .locals 1

    .prologue
    .line 295
    iget-object v0, p0, Lcom/android/volley/toolbox/g;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/volley/toolbox/g$a;

    .line 297
    if-eqz v0, :cond_0

    .line 299
    invoke-virtual {v0, p2}, Lcom/android/volley/toolbox/g$a;->a(Lcom/android/volley/VolleyError;)V

    .line 302
    invoke-direct {p0, p1, v0}, Lcom/android/volley/toolbox/g;->a(Ljava/lang/String;Lcom/android/volley/toolbox/g$a;)V

    .line 304
    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;Lcom/android/volley/toolbox/g$a;)V
    .locals 4

    .prologue
    .line 463
    iget-object v0, p0, Lcom/android/volley/toolbox/g;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 466
    iget-object v0, p0, Lcom/android/volley/toolbox/g;->g:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    .line 467
    new-instance v0, Lcom/android/volley/toolbox/g$3;

    invoke-direct {v0, p0}, Lcom/android/volley/toolbox/g$3;-><init>(Lcom/android/volley/toolbox/g;)V

    iput-object v0, p0, Lcom/android/volley/toolbox/g;->g:Ljava/lang/Runnable;

    .line 492
    iget-object v0, p0, Lcom/android/volley/toolbox/g;->f:Landroid/os/Handler;

    iget-object v1, p0, Lcom/android/volley/toolbox/g;->g:Ljava/lang/Runnable;

    iget v2, p0, Lcom/android/volley/toolbox/g;->b:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 494
    :cond_0
    return-void
.end method

.method private static b(Ljava/lang/String;II)Ljava/lang/String;
    .locals 2

    .prologue
    .line 513
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0xc

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string/jumbo v1, "#W"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "#H"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 514
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 513
    return-object v0
.end method

.method static synthetic b(Lcom/android/volley/toolbox/g;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/android/volley/toolbox/g;->e:Ljava/util/HashMap;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Lcom/android/volley/toolbox/g$d;)Lcom/android/volley/toolbox/g$c;
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 183
    invoke-virtual {p0, p1, p2, v0, v0}, Lcom/android/volley/toolbox/g;->a(Ljava/lang/String;Lcom/android/volley/toolbox/g$d;II)Lcom/android/volley/toolbox/g$c;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;Lcom/android/volley/toolbox/g$d;II)Lcom/android/volley/toolbox/g$c;
    .locals 14

    .prologue
    .line 205
    invoke-direct {p0}, Lcom/android/volley/toolbox/g;->a()V

    .line 207
    move/from16 v0, p3

    move/from16 v1, p4

    invoke-static {p1, v0, v1}, Lcom/android/volley/toolbox/g;->b(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v6

    .line 210
    iget-object v2, p0, Lcom/android/volley/toolbox/g;->c:Lcom/android/volley/toolbox/g$b;

    invoke-interface {v2, v6}, Lcom/android/volley/toolbox/g$b;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 211
    if-eqz v4, :cond_0

    .line 213
    new-instance v2, Lcom/android/volley/toolbox/g$c;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p0

    move-object v5, p1

    invoke-direct/range {v2 .. v7}, Lcom/android/volley/toolbox/g$c;-><init>(Lcom/android/volley/toolbox/g;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lcom/android/volley/toolbox/g$d;)V

    .line 214
    const/4 v3, 0x1

    move-object/from16 v0, p2

    invoke-interface {v0, v2, v3}, Lcom/android/volley/toolbox/g$d;->a(Lcom/android/volley/toolbox/g$c;Z)V

    .line 248
    :goto_0
    return-object v2

    .line 219
    :cond_0
    new-instance v2, Lcom/android/volley/toolbox/g$c;

    const/4 v4, 0x0

    move-object v3, p0

    move-object v5, p1

    move-object/from16 v7, p2

    invoke-direct/range {v2 .. v7}, Lcom/android/volley/toolbox/g$c;-><init>(Lcom/android/volley/toolbox/g;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lcom/android/volley/toolbox/g$d;)V

    .line 222
    const/4 v3, 0x1

    move-object/from16 v0, p2

    invoke-interface {v0, v2, v3}, Lcom/android/volley/toolbox/g$d;->a(Lcom/android/volley/toolbox/g$c;Z)V

    .line 225
    iget-object v3, p0, Lcom/android/volley/toolbox/g;->d:Ljava/util/HashMap;

    invoke-virtual {v3, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/android/volley/toolbox/g$a;

    .line 226
    if-eqz v3, :cond_1

    .line 228
    invoke-virtual {v3, v2}, Lcom/android/volley/toolbox/g$a;->a(Lcom/android/volley/toolbox/g$c;)V

    goto :goto_0

    .line 234
    :cond_1
    new-instance v7, Lcom/android/volley/toolbox/h;

    new-instance v9, Lcom/android/volley/toolbox/g$1;

    invoke-direct {v9, p0, v6}, Lcom/android/volley/toolbox/g$1;-><init>(Lcom/android/volley/toolbox/g;Ljava/lang/String;)V

    .line 239
    sget-object v12, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    new-instance v13, Lcom/android/volley/toolbox/g$2;

    invoke-direct {v13, p0, v6}, Lcom/android/volley/toolbox/g$2;-><init>(Lcom/android/volley/toolbox/g;Ljava/lang/String;)V

    move-object v8, p1

    move/from16 v10, p3

    move/from16 v11, p4

    .line 234
    invoke-direct/range {v7 .. v13}, Lcom/android/volley/toolbox/h;-><init>(Ljava/lang/String;Lcom/android/volley/k$b;IILandroid/graphics/Bitmap$Config;Lcom/android/volley/k$a;)V

    .line 246
    iget-object v3, p0, Lcom/android/volley/toolbox/g;->a:Lcom/android/volley/j;

    invoke-virtual {v3, v7}, Lcom/android/volley/j;->a(Lcom/android/volley/Request;)Lcom/android/volley/Request;

    .line 247
    iget-object v3, p0, Lcom/android/volley/toolbox/g;->d:Ljava/util/HashMap;

    new-instance v4, Lcom/android/volley/toolbox/g$a;

    invoke-direct {v4, p0, v7, v2}, Lcom/android/volley/toolbox/g$a;-><init>(Lcom/android/volley/toolbox/g;Lcom/android/volley/Request;Lcom/android/volley/toolbox/g$c;)V

    invoke-virtual {v3, v6, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public a(Ljava/lang/String;II)Z
    .locals 2

    .prologue
    .line 164
    invoke-direct {p0}, Lcom/android/volley/toolbox/g;->a()V

    .line 166
    invoke-static {p1, p2, p3}, Lcom/android/volley/toolbox/g;->b(Ljava/lang/String;II)Ljava/lang/String;

    move-result-object v0

    .line 167
    iget-object v1, p0, Lcom/android/volley/toolbox/g;->c:Lcom/android/volley/toolbox/g$b;

    invoke-interface {v1, v0}, Lcom/android/volley/toolbox/g$b;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
