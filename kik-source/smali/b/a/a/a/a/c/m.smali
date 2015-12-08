.class public Lb/a/a/a/a/c/m;
.super Ljava/util/concurrent/FutureTask;
.source "SourceFile"

# interfaces
.implements Lb/a/a/a/a/c/f;
.implements Lb/a/a/a/a/c/n;
.implements Lb/a/a/a/a/c/q;


# instance fields
.field final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 44
    invoke-direct {p0, p1, p2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/lang/Runnable;Ljava/lang/Object;)V

    .line 45
    invoke-static {p1}, Lb/a/a/a/a/c/m;->b(Ljava/lang/Object;)Lb/a/a/a/a/c/f;

    move-result-object v0

    iput-object v0, p0, Lb/a/a/a/a/c/m;->b:Ljava/lang/Object;

    .line 46
    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Callable;)V
    .locals 1

    .prologue
    .line 39
    invoke-direct {p0, p1}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 40
    invoke-static {p1}, Lb/a/a/a/a/c/m;->b(Ljava/lang/Object;)Lb/a/a/a/a/c/f;

    move-result-object v0

    iput-object v0, p0, Lb/a/a/a/a/c/m;->b:Ljava/lang/Object;

    .line 41
    return-void
.end method

.method private static b(Ljava/lang/Object;)Lb/a/a/a/a/c/f;
    .locals 1

    .prologue
    .line 102
    invoke-static {p0}, Lb/a/a/a/a/c/o;->b(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 103
    check-cast p0, Lb/a/a/a/a/c/f;

    .line 105
    :goto_0
    return-object p0

    :cond_0
    new-instance p0, Lb/a/a/a/a/c/o;

    invoke-direct {p0}, Lb/a/a/a/a/c/o;-><init>()V

    goto :goto_0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .prologue
    .line 70
    invoke-virtual {p0}, Lb/a/a/a/a/c/m;->b()Lb/a/a/a/a/c/f;

    move-result-object v0

    check-cast v0, Lb/a/a/a/a/c/n;

    invoke-interface {v0}, Lb/a/a/a/a/c/n;->a()I

    move-result v0

    return v0
.end method

.method public final synthetic a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 33
    check-cast p1, Lb/a/a/a/a/c/q;

    invoke-virtual {p0}, Lb/a/a/a/a/c/m;->b()Lb/a/a/a/a/c/f;

    move-result-object v0

    check-cast v0, Lb/a/a/a/a/c/n;

    check-cast v0, Lb/a/a/a/a/c/f;

    invoke-interface {v0, p1}, Lb/a/a/a/a/c/f;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 85
    invoke-virtual {p0}, Lb/a/a/a/a/c/m;->b()Lb/a/a/a/a/c/f;

    move-result-object v0

    check-cast v0, Lb/a/a/a/a/c/n;

    check-cast v0, Lb/a/a/a/a/c/q;

    invoke-interface {v0, p1}, Lb/a/a/a/a/c/q;->a(Ljava/lang/Throwable;)V

    .line 86
    return-void
.end method

.method public final a(Z)V
    .locals 1

    .prologue
    .line 75
    invoke-virtual {p0}, Lb/a/a/a/a/c/m;->b()Lb/a/a/a/a/c/f;

    move-result-object v0

    check-cast v0, Lb/a/a/a/a/c/n;

    check-cast v0, Lb/a/a/a/a/c/q;

    invoke-interface {v0, p1}, Lb/a/a/a/a/c/q;->a(Z)V

    .line 76
    return-void
.end method

.method public b()Lb/a/a/a/a/c/f;
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Lb/a/a/a/a/c/m;->b:Ljava/lang/Object;

    check-cast v0, Lb/a/a/a/a/c/f;

    return-object v0
.end method

.method public compareTo(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 50
    invoke-virtual {p0}, Lb/a/a/a/a/c/m;->b()Lb/a/a/a/a/c/f;

    move-result-object v0

    check-cast v0, Lb/a/a/a/a/c/n;

    invoke-interface {v0, p1}, Lb/a/a/a/a/c/n;->compareTo(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final f()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 60
    invoke-virtual {p0}, Lb/a/a/a/a/c/m;->b()Lb/a/a/a/a/c/f;

    move-result-object v0

    check-cast v0, Lb/a/a/a/a/c/n;

    check-cast v0, Lb/a/a/a/a/c/f;

    invoke-interface {v0}, Lb/a/a/a/a/c/f;->f()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final g()Z
    .locals 1

    .prologue
    .line 65
    invoke-virtual {p0}, Lb/a/a/a/a/c/m;->b()Lb/a/a/a/a/c/f;

    move-result-object v0

    check-cast v0, Lb/a/a/a/a/c/n;

    check-cast v0, Lb/a/a/a/a/c/f;

    invoke-interface {v0}, Lb/a/a/a/a/c/f;->g()Z

    move-result v0

    return v0
.end method

.method public final j()Z
    .locals 1

    .prologue
    .line 80
    invoke-virtual {p0}, Lb/a/a/a/a/c/m;->b()Lb/a/a/a/a/c/f;

    move-result-object v0

    check-cast v0, Lb/a/a/a/a/c/n;

    check-cast v0, Lb/a/a/a/a/c/q;

    invoke-interface {v0}, Lb/a/a/a/a/c/q;->j()Z

    move-result v0

    return v0
.end method
