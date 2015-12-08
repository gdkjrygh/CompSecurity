.class public abstract La/a/a/a/a/c/p;
.super La/a/a/a/a/c/a;
.source "SourceFile"

# interfaces
.implements La/a/a/a/a/c/l;
.implements La/a/a/a/a/c/u;
.implements La/a/a/a/a/c/y;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Params:",
        "Ljava/lang/Object;",
        "Progress:",
        "Ljava/lang/Object;",
        "Result:",
        "Ljava/lang/Object;",
        ">",
        "La/a/a/a/a/c/a",
        "<TParams;TProgress;TResult;>;",
        "La/a/a/a/a/c/l",
        "<",
        "La/a/a/a/a/c/y;",
        ">;",
        "La/a/a/a/a/c/u;",
        "La/a/a/a/a/c/y;"
    }
.end annotation


# instance fields
.field private final a:La/a/a/a/a/c/v;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, La/a/a/a/a/c/a;-><init>()V

    .line 37
    new-instance v0, La/a/a/a/a/c/v;

    invoke-direct {v0}, La/a/a/a/a/c/v;-><init>()V

    iput-object v0, p0, La/a/a/a/a/c/p;->a:La/a/a/a/a/c/v;

    .line 38
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 76
    .line 4101
    iget-object v0, p0, La/a/a/a/a/c/p;->a:La/a/a/a/a/c/v;

    .line 76
    check-cast v0, La/a/a/a/a/c/u;

    invoke-interface {v0}, La/a/a/a/a/c/u;->a()I

    move-result v0

    return v0
.end method

.method public final a(La/a/a/a/a/c/y;)V
    .locals 2

    .prologue
    .line 58
    invoke-virtual {p0}, La/a/a/a/a/c/p;->s_()I

    move-result v0

    sget v1, La/a/a/a/a/c/j;->a:I

    if-eq v0, v1, :cond_0

    .line 59
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must not add Dependency after task is running"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1101
    :cond_0
    iget-object v0, p0, La/a/a/a/a/c/p;->a:La/a/a/a/a/c/v;

    .line 61
    check-cast v0, La/a/a/a/a/c/u;

    check-cast v0, La/a/a/a/a/c/l;

    invoke-interface {v0, p1}, La/a/a/a/a/c/l;->a(Ljava/lang/Object;)V

    .line 62
    return-void
.end method

.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 27
    check-cast p1, La/a/a/a/a/c/y;

    invoke-virtual {p0, p1}, La/a/a/a/a/c/p;->a(La/a/a/a/a/c/y;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 91
    .line 7101
    iget-object v0, p0, La/a/a/a/a/c/p;->a:La/a/a/a/a/c/v;

    .line 91
    check-cast v0, La/a/a/a/a/c/u;

    check-cast v0, La/a/a/a/a/c/y;

    invoke-interface {v0, p1}, La/a/a/a/a/c/y;->a(Ljava/lang/Throwable;)V

    .line 92
    return-void
.end method

.method public final varargs a(Ljava/util/concurrent/ExecutorService;[Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ExecutorService;",
            "[TParams;)V"
        }
    .end annotation

    .prologue
    .line 42
    new-instance v0, La/a/a/a/a/c/q;

    invoke-direct {v0, p1, p0}, La/a/a/a/a/c/q;-><init>(Ljava/util/concurrent/Executor;La/a/a/a/a/c/p;)V

    .line 43
    invoke-super {p0, v0, p2}, La/a/a/a/a/c/a;->a(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)La/a/a/a/a/c/a;

    .line 44
    return-void
.end method

.method public final a(Z)V
    .locals 1

    .prologue
    .line 81
    .line 5101
    iget-object v0, p0, La/a/a/a/a/c/p;->a:La/a/a/a/a/c/v;

    .line 81
    check-cast v0, La/a/a/a/a/c/u;

    check-cast v0, La/a/a/a/a/c/y;

    invoke-interface {v0, p1}, La/a/a/a/a/c/y;->a(Z)V

    .line 82
    return-void
.end method

.method public compareTo(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 48
    invoke-static {p0, p1}, La/a/a/a/a/c/o;->a(La/a/a/a/a/c/u;Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final f()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "La/a/a/a/a/c/y;",
            ">;"
        }
    .end annotation

    .prologue
    .line 66
    .line 2101
    iget-object v0, p0, La/a/a/a/a/c/p;->a:La/a/a/a/a/c/v;

    .line 66
    check-cast v0, La/a/a/a/a/c/u;

    check-cast v0, La/a/a/a/a/c/l;

    invoke-interface {v0}, La/a/a/a/a/c/l;->f()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final g()Z
    .locals 1

    .prologue
    .line 71
    .line 3101
    iget-object v0, p0, La/a/a/a/a/c/p;->a:La/a/a/a/a/c/v;

    .line 71
    check-cast v0, La/a/a/a/a/c/u;

    check-cast v0, La/a/a/a/a/c/l;

    invoke-interface {v0}, La/a/a/a/a/c/l;->g()Z

    move-result v0

    return v0
.end method

.method public final j()Z
    .locals 1

    .prologue
    .line 86
    .line 6101
    iget-object v0, p0, La/a/a/a/a/c/p;->a:La/a/a/a/a/c/v;

    .line 86
    check-cast v0, La/a/a/a/a/c/u;

    check-cast v0, La/a/a/a/a/c/y;

    invoke-interface {v0}, La/a/a/a/a/c/y;->j()Z

    move-result v0

    return v0
.end method
