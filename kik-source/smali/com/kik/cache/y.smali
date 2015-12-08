.class public abstract Lcom/kik/cache/y;
.super Lcom/kik/cache/z;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/String;Lcom/android/volley/r$b;IILandroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct/range {p0 .. p7}, Lcom/kik/cache/z;-><init>(Ljava/lang/Object;Ljava/lang/String;Lcom/android/volley/r$b;IILandroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;)V

    .line 24
    return-void
.end method


# virtual methods
.method protected a(Lcom/android/volley/k;)Lcom/android/volley/r;
    .locals 6

    .prologue
    const-wide/32 v4, 0x41353000

    .line 29
    invoke-super {p0, p1}, Lcom/kik/cache/z;->a(Lcom/android/volley/k;)Lcom/android/volley/r;

    move-result-object v0

    .line 32
    if-eqz v0, :cond_0

    iget-object v1, v0, Lcom/android/volley/r;->b:Lcom/android/volley/b$a;

    if-eqz v1, :cond_0

    .line 34
    iget-object v1, v0, Lcom/android/volley/r;->b:Lcom/android/volley/b$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    add-long/2addr v2, v4

    iput-wide v2, v1, Lcom/android/volley/b$a;->e:J

    .line 35
    iget-object v1, v0, Lcom/android/volley/r;->b:Lcom/android/volley/b$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    add-long/2addr v2, v4

    iput-wide v2, v1, Lcom/android/volley/b$a;->d:J

    .line 37
    :cond_0
    return-object v0
.end method
