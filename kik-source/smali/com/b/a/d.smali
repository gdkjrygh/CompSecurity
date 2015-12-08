.class public Lcom/b/a/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/b/a/k;


# instance fields
.field protected final a:Lcom/b/a/k;


# direct methods
.method public constructor <init>(Lcom/b/a/k;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/b/a/d;->a:Lcom/b/a/k;

    .line 34
    return-void
.end method


# virtual methods
.method public a(Lcom/b/a/u;)I
    .locals 1

    .prologue
    .line 43
    iget-object v0, p0, Lcom/b/a/d;->a:Lcom/b/a/k;

    invoke-interface {v0, p1}, Lcom/b/a/k;->a(Lcom/b/a/u;)I

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/Object;Lcom/b/a/u;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 133
    iget-object v0, p0, Lcom/b/a/d;->a:Lcom/b/a/k;

    invoke-interface {v0, p1, p2}, Lcom/b/a/k;->a(Ljava/lang/Object;Lcom/b/a/u;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final a(ILcom/b/a/u;)V
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/b/a/d;->a:Lcom/b/a/k;

    invoke-interface {v0, p1, p2}, Lcom/b/a/k;->a(ILcom/b/a/u;)V

    .line 39
    return-void
.end method

.method public final b()J
    .locals 2

    .prologue
    .line 128
    iget-object v0, p0, Lcom/b/a/d;->a:Lcom/b/a/k;

    invoke-interface {v0}, Lcom/b/a/k;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/b/a/d;->a:Lcom/b/a/k;

    invoke-interface {v0}, Lcom/b/a/k;->c()I

    move-result v0

    return v0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/b/a/d;->a:Lcom/b/a/k;

    invoke-interface {v0}, Lcom/b/a/k;->d()Z

    move-result v0

    return v0
.end method

.method public final f()I
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/b/a/d;->a:Lcom/b/a/k;

    invoke-interface {v0}, Lcom/b/a/k;->f()I

    move-result v0

    return v0
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 118
    iget-object v0, p0, Lcom/b/a/d;->a:Lcom/b/a/k;

    invoke-interface {v0}, Lcom/b/a/k;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h()Lcom/b/a/b;
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/b/a/d;->a:Lcom/b/a/k;

    invoke-interface {v0}, Lcom/b/a/k;->h()Lcom/b/a/b;

    move-result-object v0

    return-object v0
.end method
