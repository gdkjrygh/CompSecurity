.class final Lcom/b/a/a/t;
.super La/a/a/a/a/d/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/a/a/a/a/d/d",
        "<",
        "Lcom/b/a/a/x;",
        ">;"
    }
.end annotation


# instance fields
.field private g:La/a/a/a/a/g/b;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/b/a/a/ab;La/a/a/a/a/b/q;La/a/a/a/a/d/h;)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1, p2, p3, p4}, La/a/a/a/a/d/d;-><init>(Landroid/content/Context;La/a/a/a/a/d/c;La/a/a/a/a/b/q;La/a/a/a/a/d/h;)V

    .line 31
    return-void
.end method


# virtual methods
.method protected final a()Ljava/lang/String;
    .locals 4

    .prologue
    .line 35
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "sa_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/b/a/a/t;->c:La/a/a/a/a/b/q;

    invoke-interface {v1}, La/a/a/a/a/b/q;->a()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".tap"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method final a(La/a/a/a/a/g/b;)V
    .locals 0

    .prologue
    .line 62
    iput-object p1, p0, Lcom/b/a/a/t;->g:La/a/a/a/a/g/b;

    .line 63
    return-void
.end method

.method protected final b()I
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/b/a/a/t;->g:La/a/a/a/a/g/b;

    if-nez v0, :cond_0

    invoke-super {p0}, La/a/a/a/a/d/d;->b()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/b/a/a/t;->g:La/a/a/a/a/g/b;

    iget v0, v0, La/a/a/a/a/g/b;->e:I

    goto :goto_0
.end method

.method protected final c()I
    .locals 1

    .prologue
    .line 56
    iget-object v0, p0, Lcom/b/a/a/t;->g:La/a/a/a/a/g/b;

    if-nez v0, :cond_0

    invoke-super {p0}, La/a/a/a/a/d/d;->c()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/b/a/a/t;->g:La/a/a/a/a/g/b;

    iget v0, v0, La/a/a/a/a/g/b;->c:I

    goto :goto_0
.end method
