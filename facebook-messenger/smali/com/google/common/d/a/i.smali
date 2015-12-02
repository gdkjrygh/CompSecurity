.class public final Lcom/google/common/d/a/i;
.super Ljava/lang/Object;
.source "Futures.java"


# annotations
.annotation build Lcom/google/common/annotations/Beta;
.end annotation


# static fields
.field private static final a:Lcom/google/common/a/jq;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/jq",
            "<",
            "Ljava/lang/reflect/Constructor",
            "<*>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 1333
    invoke-static {}, Lcom/google/common/a/jq;->b()Lcom/google/common/a/jq;

    move-result-object v0

    new-instance v1, Lcom/google/common/d/a/m;

    invoke-direct {v1}, Lcom/google/common/d/a/m;-><init>()V

    invoke-virtual {v0, v1}, Lcom/google/common/a/jq;->a(Lcom/google/common/base/Function;)Lcom/google/common/a/jq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/jq;->a()Lcom/google/common/a/jq;

    move-result-object v0

    sput-object v0, Lcom/google/common/d/a/i;->a:Lcom/google/common/a/jq;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/google/common/d/a/s;Lcom/google/common/base/Function;)Lcom/google/common/d/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/d/a/s",
            "<TI;>;",
            "Lcom/google/common/base/Function",
            "<-TI;+TO;>;)",
            "Lcom/google/common/d/a/s",
            "<TO;>;"
        }
    .end annotation

    .prologue
    .line 420
    invoke-static {}, Lcom/google/common/d/a/w;->a()Lcom/google/common/d/a/u;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/google/common/d/a/i;->b(Lcom/google/common/d/a/s;Lcom/google/common/base/Function;Ljava/util/concurrent/Executor;)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/google/common/d/a/s;Lcom/google/common/base/Function;Ljava/util/concurrent/Executor;)Lcom/google/common/d/a/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/d/a/s",
            "<TI;>;",
            "Lcom/google/common/base/Function",
            "<-TI;+",
            "Lcom/google/common/d/a/s",
            "<+TO;>;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lcom/google/common/d/a/s",
            "<TO;>;"
        }
    .end annotation

    .prologue
    .line 365
    new-instance v0, Lcom/google/common/d/a/n;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lcom/google/common/d/a/n;-><init>(Lcom/google/common/base/Function;Lcom/google/common/d/a/s;Lcom/google/common/d/a/j;)V

    .line 367
    invoke-interface {p0, v0, p2}, Lcom/google/common/d/a/s;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 368
    return-object v0
.end method

.method public static a(Ljava/lang/Iterable;)Lcom/google/common/d/a/s;
    .locals 4
    .annotation build Lcom/google/common/annotations/Beta;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable",
            "<+",
            "Lcom/google/common/d/a/s",
            "<+TV;>;>;)",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/util/List",
            "<TV;>;>;"
        }
    .end annotation

    .prologue
    .line 924
    new-instance v0, Lcom/google/common/d/a/p;

    invoke-static {p0}, Lcom/google/common/a/es;->a(Ljava/lang/Iterable;)Lcom/google/common/a/es;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {}, Lcom/google/common/d/a/w;->a()Lcom/google/common/d/a/u;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/common/d/a/p;-><init>(Lcom/google/common/a/es;ZLjava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static a(Ljava/lang/Object;)Lcom/google/common/d/a/s;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(TV;)",
            "Lcom/google/common/d/a/s",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 191
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    move-result-object v0

    .line 192
    invoke-virtual {v0, p0}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 193
    return-object v0
.end method

.method public static varargs a([Lcom/google/common/d/a/s;)Lcom/google/common/d/a/s;
    .locals 4
    .annotation build Lcom/google/common/annotations/Beta;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">([",
            "Lcom/google/common/d/a/s",
            "<+TV;>;)",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/util/List",
            "<TV;>;>;"
        }
    .end annotation

    .prologue
    .line 901
    new-instance v0, Lcom/google/common/d/a/p;

    invoke-static {p0}, Lcom/google/common/a/es;->a([Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {}, Lcom/google/common/d/a/w;->a()Lcom/google/common/d/a/u;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/common/d/a/p;-><init>(Lcom/google/common/a/es;ZLjava/util/concurrent/Executor;)V

    return-object v0
.end method

.method public static a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/d/a/s",
            "<TV;>;",
            "Lcom/google/common/d/a/h",
            "<-TV;>;)V"
        }
    .end annotation

    .prologue
    .line 1012
    invoke-static {}, Lcom/google/common/d/a/w;->a()Lcom/google/common/d/a/u;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;Ljava/util/concurrent/Executor;)V

    .line 1013
    return-void
.end method

.method public static a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;Ljava/util/concurrent/Executor;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/d/a/s",
            "<TV;>;",
            "Lcom/google/common/d/a/h",
            "<-TV;>;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    .prologue
    .line 1064
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1065
    new-instance v0, Lcom/google/common/d/a/l;

    invoke-direct {v0, p0, p1}, Lcom/google/common/d/a/l;-><init>(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;)V

    .line 1082
    invoke-interface {p0, v0, p2}, Lcom/google/common/d/a/s;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 1083
    return-void
.end method

.method public static b(Lcom/google/common/d/a/s;Lcom/google/common/base/Function;Ljava/util/concurrent/Executor;)Lcom/google/common/d/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<I:",
            "Ljava/lang/Object;",
            "O:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/d/a/s",
            "<TI;>;",
            "Lcom/google/common/base/Function",
            "<-TI;+TO;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lcom/google/common/d/a/s",
            "<TO;>;"
        }
    .end annotation

    .prologue
    .line 473
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 474
    new-instance v0, Lcom/google/common/d/a/k;

    invoke-direct {v0, p1}, Lcom/google/common/d/a/k;-><init>(Lcom/google/common/base/Function;)V

    .line 481
    invoke-static {p0, v0, p2}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/base/Function;Ljava/util/concurrent/Executor;)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method
