.class public abstract Lcom/kik/cache/ac;
.super Lcom/kik/cache/z;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/String;Lcom/android/volley/r$b;IILandroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;)V
    .locals 0

    .prologue
    .line 16
    invoke-direct/range {p0 .. p7}, Lcom/kik/cache/z;-><init>(Ljava/lang/Object;Ljava/lang/String;Lcom/android/volley/r$b;IILandroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;)V

    .line 17
    return-void
.end method


# virtual methods
.method protected final a(Lcom/android/volley/k;)Lcom/android/volley/r;
    .locals 2

    .prologue
    .line 24
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/kik/cache/ac;->b(Lcom/android/volley/k;)Lcom/android/volley/r;
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 28
    :goto_0
    return-object v0

    .line 27
    :catch_0
    move-exception v0

    .line 28
    new-instance v1, Lcom/android/volley/m;

    invoke-direct {v1, v0}, Lcom/android/volley/m;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v1}, Lcom/android/volley/r;->a(Lcom/android/volley/w;)Lcom/android/volley/r;

    move-result-object v0

    goto :goto_0
.end method

.method protected abstract b(Lcom/android/volley/k;)Lcom/android/volley/r;
.end method

.method public final w()Z
    .locals 1

    .prologue
    .line 42
    const/4 v0, 0x0

    return v0
.end method
