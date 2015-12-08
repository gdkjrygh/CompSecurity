.class final Lcom/kik/a/a/e;
.super Lcom/c/b/c;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 2302
    invoke-direct {p0}, Lcom/c/b/c;-><init>()V

    return-void
.end method

.method private static b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/a/a/a$e;
    .locals 2

    .prologue
    .line 2308
    :try_start_0
    new-instance v0, Lcom/kik/a/a/a$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/kik/a/a/a$e;-><init>(Lcom/c/b/g;Lcom/c/b/aq;B)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 2309
    :catch_0
    move-exception v0

    .line 2310
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Lcom/c/b/av;

    if-eqz v1, :cond_0

    .line 2312
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Lcom/c/b/av;

    throw v0

    .line 2315
    :cond_0
    throw v0
.end method


# virtual methods
.method public final synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 2302
    invoke-static {p1, p2}, Lcom/kik/a/a/e;->b(Lcom/c/b/g;Lcom/c/b/aq;)Lcom/kik/a/a/a$e;

    move-result-object v0

    return-object v0
.end method
