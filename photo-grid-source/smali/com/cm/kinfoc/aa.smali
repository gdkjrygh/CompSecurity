.class final Lcom/cm/kinfoc/aa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cm/kinfoc/d;


# instance fields
.field final synthetic a:Lcom/cm/kinfoc/z;


# direct methods
.method constructor <init>(Lcom/cm/kinfoc/z;)V
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/cm/kinfoc/aa;->a:Lcom/cm/kinfoc/z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(JLcom/cm/kinfoc/i;)V
    .locals 11

    .prologue
    const-wide/16 v8, 0x0

    const/4 v7, -0x1

    .line 59
    if-nez p3, :cond_1

    .line 83
    :cond_0
    :goto_0
    return-void

    .line 63
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Post successed, server Priority: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Lcom/cm/kinfoc/i;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", table: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p3}, Lcom/cm/kinfoc/i;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", last time: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/cm/kinfoc/a/f;->a(Ljava/lang/String;)V

    .line 66
    invoke-virtual {p3}, Lcom/cm/kinfoc/i;->c()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p3}, Lcom/cm/kinfoc/i;->i()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 67
    invoke-virtual {p3}, Lcom/cm/kinfoc/i;->i()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 68
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 69
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 70
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    goto :goto_1

    .line 75
    :cond_3
    invoke-virtual {p3}, Lcom/cm/kinfoc/i;->e()J

    move-result-wide v4

    .line 76
    cmp-long v0, v4, v8

    if-lez v0, :cond_4

    iget-object v0, p0, Lcom/cm/kinfoc/aa;->a:Lcom/cm/kinfoc/z;

    invoke-static {v0}, Lcom/cm/kinfoc/z;->a(Lcom/cm/kinfoc/z;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p3}, Lcom/cm/kinfoc/i;->a()[B

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {p3}, Lcom/cm/kinfoc/i;->g()I

    move-result v0

    if-eq v0, v7, :cond_4

    .line 77
    iget-object v1, p0, Lcom/cm/kinfoc/aa;->a:Lcom/cm/kinfoc/z;

    invoke-virtual {p3}, Lcom/cm/kinfoc/i;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3}, Lcom/cm/kinfoc/i;->c()Z

    move-result v3

    invoke-virtual {p3}, Lcom/cm/kinfoc/i;->g()I

    move-result v6

    invoke-virtual/range {v1 .. v6}, Lcom/cm/kinfoc/z;->a(Ljava/lang/String;ZJI)V

    .line 80
    :cond_4
    cmp-long v0, v4, v8

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/cm/kinfoc/aa;->a:Lcom/cm/kinfoc/z;

    invoke-static {v0}, Lcom/cm/kinfoc/z;->a(Lcom/cm/kinfoc/z;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p3}, Lcom/cm/kinfoc/i;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 81
    iget-object v1, p0, Lcom/cm/kinfoc/aa;->a:Lcom/cm/kinfoc/z;

    invoke-virtual {p3}, Lcom/cm/kinfoc/i;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3}, Lcom/cm/kinfoc/i;->c()Z

    move-result v3

    move v6, v7

    invoke-virtual/range {v1 .. v6}, Lcom/cm/kinfoc/z;->a(Ljava/lang/String;ZJI)V

    goto/16 :goto_0
.end method

.method public final a(Lcom/cm/kinfoc/i;)V
    .locals 6

    .prologue
    const/4 v5, -0x1

    .line 88
    if-nez p1, :cond_1

    .line 104
    :cond_0
    :goto_0
    return-void

    .line 92
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Post failed, server Priority: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/cm/kinfoc/i;->g()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", table: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p1}, Lcom/cm/kinfoc/i;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/cm/kinfoc/a/f;->a(Ljava/lang/String;)V

    .line 95
    invoke-virtual {p1}, Lcom/cm/kinfoc/i;->e()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/cm/kinfoc/aa;->a:Lcom/cm/kinfoc/z;

    invoke-static {v0}, Lcom/cm/kinfoc/z;->a(Lcom/cm/kinfoc/z;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/cm/kinfoc/i;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 96
    invoke-virtual {p1}, Lcom/cm/kinfoc/i;->a()[B

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/cm/kinfoc/i;->g()I

    move-result v0

    if-eq v0, v5, :cond_2

    .line 97
    iget-object v0, p0, Lcom/cm/kinfoc/aa;->a:Lcom/cm/kinfoc/z;

    invoke-virtual {p1}, Lcom/cm/kinfoc/i;->a()[B

    move-result-object v1

    invoke-virtual {p1}, Lcom/cm/kinfoc/i;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/cm/kinfoc/i;->c()Z

    move-result v3

    invoke-virtual {p1}, Lcom/cm/kinfoc/i;->g()I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/cm/kinfoc/z;->a([BLjava/lang/String;ZI)Z

    .line 100
    :cond_2
    invoke-virtual {p1}, Lcom/cm/kinfoc/i;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 101
    iget-object v0, p0, Lcom/cm/kinfoc/aa;->a:Lcom/cm/kinfoc/z;

    invoke-virtual {p1}, Lcom/cm/kinfoc/i;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {p1}, Lcom/cm/kinfoc/i;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/cm/kinfoc/i;->c()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3, v5}, Lcom/cm/kinfoc/z;->a([BLjava/lang/String;ZI)Z

    goto :goto_0
.end method
