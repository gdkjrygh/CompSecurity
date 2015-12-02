.class public Lcom/facebook/orca/d/a;
.super Lcom/facebook/ui/media/cache/g;
.source "AudioCache.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/ui/media/cache/g",
        "<",
        "Lcom/facebook/orca/d/c;",
        "[B>;"
    }
.end annotation

.annotation build Ljavax/annotation/concurrent/ThreadSafe;
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/common/time/a;Lcom/facebook/ui/c/d;Lcom/facebook/analytics/cache/h;Lcom/facebook/analytics/j/a;Lcom/facebook/common/e/h;Lcom/facebook/analytics/av;Lcom/facebook/cache/j;Ljavax/inject/a;)V
    .locals 11
    .param p8    # Lcom/facebook/cache/j;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p9    # Ljavax/inject/a;
        .annotation runtime Lcom/facebook/analytics/cache/IsAccessPatternLoggingEnabled;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/common/time/a;",
            "Lcom/facebook/ui/c/d;",
            "Lcom/facebook/analytics/cache/h;",
            "Lcom/facebook/analytics/j/a;",
            "Lcom/facebook/common/e/h;",
            "Lcom/facebook/analytics/av;",
            "Lcom/facebook/cache/j;",
            "Ljavax/inject/a",
            "<",
            "Lcom/facebook/common/w/q;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 67
    invoke-static {}, Lcom/facebook/orca/d/a;->h()Lcom/facebook/ui/media/cache/m;

    move-result-object v7

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v0 .. v10}, Lcom/facebook/ui/media/cache/g;-><init>(Landroid/content/Context;Lcom/facebook/common/time/a;Lcom/facebook/ui/c/d;Lcom/facebook/analytics/cache/h;Lcom/facebook/analytics/j/a;Lcom/facebook/common/e/h;Lcom/facebook/ui/media/cache/m;Lcom/facebook/analytics/av;Lcom/facebook/cache/j;Ljavax/inject/a;)V

    .line 69
    return-void
.end method

.method private static h()Lcom/facebook/ui/media/cache/m;
    .locals 4

    .prologue
    const v3, 0x7fffffff

    const/4 v2, 0x0

    .line 121
    new-instance v0, Lcom/facebook/ui/media/cache/m;

    invoke-direct {v0}, Lcom/facebook/ui/media/cache/m;-><init>()V

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Lcom/facebook/ui/media/cache/m;->a(Ljava/lang/String;)Lcom/facebook/ui/media/cache/m;

    move-result-object v0

    const-string v1, ".audio"

    invoke-virtual {v0, v1}, Lcom/facebook/ui/media/cache/m;->b(Ljava/lang/String;)Lcom/facebook/ui/media/cache/m;

    move-result-object v0

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Lcom/facebook/ui/media/cache/m;->c(Ljava/lang/String;)Lcom/facebook/ui/media/cache/m;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/media/cache/m;->a(I)Lcom/facebook/ui/media/cache/m;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/facebook/ui/media/cache/m;->b(I)Lcom/facebook/ui/media/cache/m;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/facebook/ui/media/cache/m;->c(I)Lcom/facebook/ui/media/cache/m;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/facebook/ui/media/cache/m;->d(I)Lcom/facebook/ui/media/cache/m;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/facebook/ui/media/cache/m;->e(I)Lcom/facebook/ui/media/cache/m;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/facebook/ui/media/cache/m;->a(Z)Lcom/facebook/ui/media/cache/m;

    move-result-object v0

    const-wide/32 v1, 0xa00000

    invoke-virtual {v0, v1, v2}, Lcom/facebook/ui/media/cache/m;->a(J)Lcom/facebook/ui/media/cache/m;

    move-result-object v0

    const-wide/32 v1, 0x500000

    invoke-virtual {v0, v1, v2}, Lcom/facebook/ui/media/cache/m;->b(J)Lcom/facebook/ui/media/cache/m;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method protected bridge synthetic a(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 35
    check-cast p1, [B

    invoke-virtual {p0, p1}, Lcom/facebook/orca/d/a;->a([B)I

    move-result v0

    return v0
.end method

.method protected a([B)I
    .locals 1

    .prologue
    .line 117
    array-length v0, p1

    return v0
.end method

.method protected a(Landroid/content/Context;Lcom/facebook/common/e/h;Lcom/facebook/ui/c/d;Lcom/facebook/analytics/cache/h;Lcom/facebook/common/time/a;Lcom/facebook/ui/media/cache/m;)Lcom/facebook/ui/media/cache/a;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/facebook/common/e/h;",
            "Lcom/facebook/ui/c/d;",
            "Lcom/facebook/analytics/cache/h;",
            "Lcom/facebook/common/time/a;",
            "Lcom/facebook/ui/media/cache/m;",
            ")",
            "Lcom/facebook/ui/media/cache/a",
            "<",
            "Lcom/facebook/orca/d/c;",
            "[B>;"
        }
    .end annotation

    .prologue
    .line 79
    new-instance v0, Lcom/facebook/orca/d/b;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lcom/facebook/orca/d/b;-><init>(Lcom/facebook/orca/d/a;Landroid/content/Context;Lcom/facebook/common/e/h;Lcom/facebook/ui/c/d;Lcom/facebook/analytics/cache/h;Lcom/facebook/common/time/a;Lcom/facebook/ui/media/cache/m;)V

    return-object v0
.end method
