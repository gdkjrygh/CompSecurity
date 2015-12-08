.class final Lcom/kik/a/a/c;
.super Lcom/c/b/c;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 832
    invoke-direct {p0}, Lcom/c/b/c;-><init>()V

    return-void
.end method

.method private static a(Lcom/c/b/g;)Lcom/kik/a/a/a$a;
    .locals 2

    .prologue
    .line 838
    :try_start_0
    new-instance v0, Lcom/kik/a/a/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/kik/a/a/a$a;-><init>(Lcom/c/b/g;B)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 839
    :catch_0
    move-exception v0

    .line 840
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    instance-of v1, v1, Lcom/c/b/av;

    if-eqz v1, :cond_0

    .line 842
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Lcom/c/b/av;

    throw v0

    .line 845
    :cond_0
    throw v0
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/c/b/g;Lcom/c/b/aq;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 832
    invoke-static {p1}, Lcom/kik/a/a/c;->a(Lcom/c/b/g;)Lcom/kik/a/a/a$a;

    move-result-object v0

    return-object v0
.end method
