.class final Lcom/kik/o/d;
.super Lcom/c/b/c;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 423
    invoke-direct {p0}, Lcom/c/b/c;-><init>()V

    return-void
.end method

.method private static a(Lcom/c/b/g;)Lcom/kik/o/c;
    .locals 2

    .prologue
    .line 429
    :try_start_0
    new-instance v0, Lcom/kik/o/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/kik/o/c;-><init>(Lcom/c/b/g;B)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 430
    :catch_0
    move-exception v0

    .line 431
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Lcom/c/b/av;

    if-eqz v1, :cond_0

    .line 433
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Lcom/c/b/av;

    throw v0

    .line 436
    :cond_0
    throw v0
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 423
    invoke-static {p1}, Lcom/kik/o/d;->a(Lcom/c/b/g;)Lcom/kik/o/c;

    move-result-object v0

    return-object v0
.end method
