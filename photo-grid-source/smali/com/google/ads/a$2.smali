.class final Lcom/google/ads/a$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Lcom/google/ads/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/ArrayList;

.field final synthetic b:Landroid/content/Context;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/util/ArrayList;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 81
    iput-object p1, p0, Lcom/google/ads/a$2;->a:Ljava/util/ArrayList;

    iput-object p2, p0, Lcom/google/ads/a$2;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/ads/a$2;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/ads/a;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 85
    :try_start_0
    iget-object v0, p0, Lcom/google/ads/a$2;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v3, v0, [Ljava/lang/String;

    .line 86
    const/4 v0, 0x0

    move v2, v0

    :goto_0
    iget-object v0, p0, Lcom/google/ads/a$2;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_1

    .line 87
    iget-object v0, p0, Lcom/google/ads/a$2;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    aput-object v0, v3, v2

    .line 88
    aget-object v0, v3, v2

    if-nez v0, :cond_0

    move-object v0, v1

    .line 98
    :goto_1
    return-object v0

    .line 86
    :cond_0
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    .line 92
    :cond_1
    new-instance v0, Lcom/google/ads/a;

    iget-object v2, p0, Lcom/google/ads/a$2;->b:Landroid/content/Context;

    iget-object v4, p0, Lcom/google/ads/a$2;->c:Ljava/lang/String;

    invoke-direct {v0, v2, v4, v3}, Lcom/google/ads/a;-><init>(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_1

    .line 97
    :catch_0
    move-exception v0

    :goto_2
    move-object v0, v1

    .line 98
    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_2
.end method

.method public final synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 81
    invoke-virtual {p0}, Lcom/google/ads/a$2;->a()Lcom/google/ads/a;

    move-result-object v0

    return-object v0
.end method
