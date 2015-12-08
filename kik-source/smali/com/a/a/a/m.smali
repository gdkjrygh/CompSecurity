.class final Lcom/a/a/a/m;
.super Lb/a/a/a/a/d/d;
.source "SourceFile"


# instance fields
.field private g:Lb/a/a/a/a/g/b;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/a/a/a/s;Lb/a/a/a/a/b/m;Lb/a/a/a/a/d/l;)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0, p1, p2, p3, p4}, Lb/a/a/a/a/d/d;-><init>(Landroid/content/Context;Lb/a/a/a/a/d/c;Lb/a/a/a/a/b/m;Lb/a/a/a/a/d/l;)V

    .line 33
    return-void
.end method


# virtual methods
.method protected final a()Ljava/lang/String;
    .locals 4

    .prologue
    .line 37
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    .line 39
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

    iget-object v1, p0, Lcom/a/a/a/m;->c:Lb/a/a/a/a/b/m;

    invoke-interface {v1}, Lb/a/a/a/a/b/m;->a()J

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

.method final a(Lb/a/a/a/a/g/b;)V
    .locals 0

    .prologue
    .line 64
    iput-object p1, p0, Lcom/a/a/a/m;->g:Lb/a/a/a/a/g/b;

    .line 65
    return-void
.end method

.method protected final b()I
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/a/a/a/m;->g:Lb/a/a/a/a/g/b;

    if-nez v0, :cond_0

    invoke-super {p0}, Lb/a/a/a/a/d/d;->b()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/a/a/a/m;->g:Lb/a/a/a/a/g/b;

    iget v0, v0, Lb/a/a/a/a/g/b;->e:I

    goto :goto_0
.end method

.method protected final c()I
    .locals 1

    .prologue
    .line 58
    iget-object v0, p0, Lcom/a/a/a/m;->g:Lb/a/a/a/a/g/b;

    if-nez v0, :cond_0

    invoke-super {p0}, Lb/a/a/a/a/d/d;->c()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/a/a/a/m;->g:Lb/a/a/a/a/g/b;

    iget v0, v0, Lb/a/a/a/a/g/b;->c:I

    goto :goto_0
.end method
