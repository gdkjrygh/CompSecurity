.class public final Lcom/android/volley/toolbox/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/volley/toolbox/i$a;,
        Lcom/android/volley/toolbox/i$c;,
        Lcom/android/volley/toolbox/i$d;,
        Lcom/android/volley/toolbox/i$b;
    }
.end annotation


# instance fields
.field protected final a:Lcom/android/volley/p;

.field protected final b:Lcom/android/volley/toolbox/i$b;

.field protected final c:Ljava/util/HashMap;

.field private d:I

.field private final e:Ljava/util/HashMap;

.field private final f:Landroid/os/Handler;

.field private g:Ljava/lang/Runnable;


# direct methods
.method static synthetic a(Lcom/android/volley/toolbox/i;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/android/volley/toolbox/i;->e:Ljava/util/HashMap;

    return-object v0
.end method

.method private a(Ljava/lang/String;Lcom/android/volley/toolbox/i$a;)V
    .locals 4

    .prologue
    .line 460
    iget-object v0, p0, Lcom/android/volley/toolbox/i;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 463
    iget-object v0, p0, Lcom/android/volley/toolbox/i;->g:Ljava/lang/Runnable;

    if-nez v0, :cond_0

    .line 464
    new-instance v0, Lcom/android/volley/toolbox/l;

    invoke-direct {v0, p0}, Lcom/android/volley/toolbox/l;-><init>(Lcom/android/volley/toolbox/i;)V

    iput-object v0, p0, Lcom/android/volley/toolbox/i;->g:Ljava/lang/Runnable;

    .line 491
    iget-object v0, p0, Lcom/android/volley/toolbox/i;->f:Landroid/os/Handler;

    iget-object v1, p0, Lcom/android/volley/toolbox/i;->g:Ljava/lang/Runnable;

    iget v2, p0, Lcom/android/volley/toolbox/i;->d:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 493
    :cond_0
    return-void
.end method

.method static synthetic b(Lcom/android/volley/toolbox/i;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/android/volley/toolbox/i;->g:Ljava/lang/Runnable;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/android/volley/toolbox/i$d;II)Lcom/android/volley/toolbox/i$c;
    .locals 13

    .prologue
    .line 199
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    if-eq v1, v2, :cond_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "ImageLoader must be invoked from the main thread."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 201
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0xc

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "#W"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v0, p3

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "#H"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    move/from16 v0, p4

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 204
    iget-object v1, p0, Lcom/android/volley/toolbox/i;->b:Lcom/android/volley/toolbox/i$b;

    invoke-interface {v1, v5}, Lcom/android/volley/toolbox/i$b;->a(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 205
    if-eqz v3, :cond_1

    .line 207
    new-instance v1, Lcom/android/volley/toolbox/i$c;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    move-object v4, p1

    invoke-direct/range {v1 .. v6}, Lcom/android/volley/toolbox/i$c;-><init>(Lcom/android/volley/toolbox/i;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lcom/android/volley/toolbox/i$d;)V

    .line 208
    const/4 v2, 0x1

    invoke-interface {p2, v1, v2}, Lcom/android/volley/toolbox/i$d;->a(Lcom/android/volley/toolbox/i$c;Z)V

    .line 248
    :goto_0
    return-object v1

    .line 213
    :cond_1
    new-instance v1, Lcom/android/volley/toolbox/i$c;

    const/4 v3, 0x0

    move-object v2, p0

    move-object v4, p1

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lcom/android/volley/toolbox/i$c;-><init>(Lcom/android/volley/toolbox/i;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lcom/android/volley/toolbox/i$d;)V

    .line 217
    const/4 v2, 0x1

    invoke-interface {p2, v1, v2}, Lcom/android/volley/toolbox/i$d;->a(Lcom/android/volley/toolbox/i$c;Z)V

    .line 220
    iget-object v2, p0, Lcom/android/volley/toolbox/i;->c:Ljava/util/HashMap;

    invoke-virtual {v2, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/android/volley/toolbox/i$a;

    .line 221
    if-eqz v2, :cond_2

    .line 223
    invoke-virtual {v2, v1}, Lcom/android/volley/toolbox/i$a;->a(Lcom/android/volley/toolbox/i$c;)V

    goto :goto_0

    .line 229
    :cond_2
    new-instance v6, Lcom/android/volley/toolbox/m;

    new-instance v8, Lcom/android/volley/toolbox/j;

    invoke-direct {v8, p0, v5}, Lcom/android/volley/toolbox/j;-><init>(Lcom/android/volley/toolbox/i;Ljava/lang/String;)V

    sget-object v11, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    new-instance v12, Lcom/android/volley/toolbox/k;

    invoke-direct {v12, p0, v5}, Lcom/android/volley/toolbox/k;-><init>(Lcom/android/volley/toolbox/i;Ljava/lang/String;)V

    move-object v7, p1

    move/from16 v9, p3

    move/from16 v10, p4

    invoke-direct/range {v6 .. v12}, Lcom/android/volley/toolbox/m;-><init>(Ljava/lang/String;Lcom/android/volley/r$b;IILandroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;)V

    .line 245
    iget-object v2, p0, Lcom/android/volley/toolbox/i;->a:Lcom/android/volley/p;

    invoke-virtual {v2, v6}, Lcom/android/volley/p;->a(Lcom/android/volley/n;)Lcom/android/volley/n;

    .line 246
    iget-object v2, p0, Lcom/android/volley/toolbox/i;->c:Ljava/util/HashMap;

    new-instance v3, Lcom/android/volley/toolbox/i$a;

    invoke-direct {v3, p0, v6, v1}, Lcom/android/volley/toolbox/i$a;-><init>(Lcom/android/volley/toolbox/i;Lcom/android/volley/n;Lcom/android/volley/toolbox/i$c;)V

    invoke-virtual {v2, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method protected final a(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 1

    .prologue
    .line 269
    iget-object v0, p0, Lcom/android/volley/toolbox/i;->b:Lcom/android/volley/toolbox/i$b;

    invoke-interface {v0, p1, p2}, Lcom/android/volley/toolbox/i$b;->a(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 272
    iget-object v0, p0, Lcom/android/volley/toolbox/i;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/volley/toolbox/i$a;

    .line 274
    if-eqz v0, :cond_0

    .line 276
    invoke-static {v0, p2}, Lcom/android/volley/toolbox/i$a;->a(Lcom/android/volley/toolbox/i$a;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 279
    invoke-direct {p0, p1, v0}, Lcom/android/volley/toolbox/i;->a(Ljava/lang/String;Lcom/android/volley/toolbox/i$a;)V

    .line 281
    :cond_0
    return-void
.end method

.method protected final a(Ljava/lang/String;Lcom/android/volley/w;)V
    .locals 1

    .prologue
    .line 291
    iget-object v0, p0, Lcom/android/volley/toolbox/i;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/volley/toolbox/i$a;

    .line 294
    invoke-virtual {v0, p2}, Lcom/android/volley/toolbox/i$a;->a(Lcom/android/volley/w;)V

    .line 296
    if-eqz v0, :cond_0

    .line 298
    invoke-direct {p0, p1, v0}, Lcom/android/volley/toolbox/i;->a(Ljava/lang/String;Lcom/android/volley/toolbox/i$a;)V

    .line 300
    :cond_0
    return-void
.end method
