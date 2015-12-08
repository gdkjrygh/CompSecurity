.class public abstract Lb/a/a/a/a/c/j;
.super Lb/a/a/a/a/c/a;
.source "SourceFile"

# interfaces
.implements Lb/a/a/a/a/c/f;
.implements Lb/a/a/a/a/c/n;
.implements Lb/a/a/a/a/c/q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb/a/a/a/a/c/j$a;
    }
.end annotation


# instance fields
.field private final a:Lb/a/a/a/a/c/o;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Lb/a/a/a/a/c/a;-><init>()V

    .line 37
    new-instance v0, Lb/a/a/a/a/c/o;

    invoke-direct {v0}, Lb/a/a/a/a/c/o;-><init>()V

    iput-object v0, p0, Lb/a/a/a/a/c/j;->a:Lb/a/a/a/a/c/o;

    .line 38
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lb/a/a/a/a/c/j;->a:Lb/a/a/a/a/c/o;

    check-cast v0, Lb/a/a/a/a/c/n;

    invoke-interface {v0}, Lb/a/a/a/a/c/n;->a()I

    move-result v0

    return v0
.end method

.method public final a(Lb/a/a/a/a/c/q;)V
    .locals 2

    .prologue
    .line 58
    invoke-virtual {p0}, Lb/a/a/a/a/c/j;->h_()I

    move-result v0

    sget v1, Lb/a/a/a/a/c/a$d;->a:I

    if-eq v0, v1, :cond_0

    .line 59
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Must not add Dependency after task is running"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 61
    :cond_0
    iget-object v0, p0, Lb/a/a/a/a/c/j;->a:Lb/a/a/a/a/c/o;

    check-cast v0, Lb/a/a/a/a/c/n;

    check-cast v0, Lb/a/a/a/a/c/f;

    invoke-interface {v0, p1}, Lb/a/a/a/a/c/f;->a(Ljava/lang/Object;)V

    .line 62
    return-void
.end method

.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 27
    check-cast p1, Lb/a/a/a/a/c/q;

    invoke-virtual {p0, p1}, Lb/a/a/a/a/c/j;->a(Lb/a/a/a/a/c/q;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lb/a/a/a/a/c/j;->a:Lb/a/a/a/a/c/o;

    check-cast v0, Lb/a/a/a/a/c/n;

    check-cast v0, Lb/a/a/a/a/c/q;

    invoke-interface {v0, p1}, Lb/a/a/a/a/c/q;->a(Ljava/lang/Throwable;)V

    .line 92
    return-void
.end method

.method public final varargs a(Ljava/util/concurrent/ExecutorService;[Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 42
    new-instance v0, Lb/a/a/a/a/c/j$a;

    invoke-direct {v0, p1, p0}, Lb/a/a/a/a/c/j$a;-><init>(Ljava/util/concurrent/Executor;Lb/a/a/a/a/c/j;)V

    .line 43
    invoke-super {p0, v0, p2}, Lb/a/a/a/a/c/a;->a(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lb/a/a/a/a/c/a;

    .line 44
    return-void
.end method

.method public final a(Z)V
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Lb/a/a/a/a/c/j;->a:Lb/a/a/a/a/c/o;

    check-cast v0, Lb/a/a/a/a/c/n;

    check-cast v0, Lb/a/a/a/a/c/q;

    invoke-interface {v0, p1}, Lb/a/a/a/a/c/q;->a(Z)V

    .line 82
    return-void
.end method

.method public compareTo(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 48
    invoke-static {p0, p1}, Lb/a/a/a/a/c/i;->a(Lb/a/a/a/a/c/n;Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final f()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lb/a/a/a/a/c/j;->a:Lb/a/a/a/a/c/o;

    check-cast v0, Lb/a/a/a/a/c/n;

    check-cast v0, Lb/a/a/a/a/c/f;

    invoke-interface {v0}, Lb/a/a/a/a/c/f;->f()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final g()Z
    .locals 1

    .prologue
    .line 71
    iget-object v0, p0, Lb/a/a/a/a/c/j;->a:Lb/a/a/a/a/c/o;

    check-cast v0, Lb/a/a/a/a/c/n;

    check-cast v0, Lb/a/a/a/a/c/f;

    invoke-interface {v0}, Lb/a/a/a/a/c/f;->g()Z

    move-result v0

    return v0
.end method

.method public final j()Z
    .locals 1

    .prologue
    .line 86
    iget-object v0, p0, Lb/a/a/a/a/c/j;->a:Lb/a/a/a/a/c/o;

    check-cast v0, Lb/a/a/a/a/c/n;

    check-cast v0, Lb/a/a/a/a/c/q;

    invoke-interface {v0}, Lb/a/a/a/a/c/q;->j()Z

    move-result v0

    return v0
.end method
