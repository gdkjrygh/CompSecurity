.class public final Lcom/cm/kinfoc/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private a:[B

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Z

.field private e:J

.field private f:I

.field private g:Lcom/cm/kinfoc/l;

.field private h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object v1, p0, Lcom/cm/kinfoc/i;->a:[B

    .line 15
    iput-object v1, p0, Lcom/cm/kinfoc/i;->b:Ljava/lang/String;

    .line 16
    iput-object v1, p0, Lcom/cm/kinfoc/i;->c:Ljava/lang/String;

    .line 17
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/cm/kinfoc/i;->d:Z

    .line 19
    const/4 v0, -0x1

    iput v0, p0, Lcom/cm/kinfoc/i;->f:I

    .line 21
    iput-object v1, p0, Lcom/cm/kinfoc/i;->h:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    .prologue
    .line 91
    iput p1, p0, Lcom/cm/kinfoc/i;->f:I

    .line 92
    return-void
.end method

.method public final a(J)V
    .locals 1

    .prologue
    .line 71
    iput-wide p1, p0, Lcom/cm/kinfoc/i;->e:J

    .line 72
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 51
    iput-object p1, p0, Lcom/cm/kinfoc/i;->c:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public final a([B)V
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/cm/kinfoc/i;->a:[B

    .line 42
    return-void
.end method

.method public final a()[B
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/cm/kinfoc/i;->a:[B

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lcom/cm/kinfoc/i;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 56
    iget-boolean v0, p0, Lcom/cm/kinfoc/i;->d:Z

    return v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 24
    const/4 v1, 0x0

    .line 26
    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/cm/kinfoc/i;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    :goto_0
    return-object v0

    .line 28
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/CloneNotSupportedException;->printStackTrace()V

    move-object v0, v1

    goto :goto_0
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 61
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/cm/kinfoc/i;->d:Z

    .line 62
    return-void
.end method

.method public final e()J
    .locals 2

    .prologue
    .line 66
    iget-wide v0, p0, Lcom/cm/kinfoc/i;->e:J

    return-wide v0
.end method

.method public final f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/cm/kinfoc/i;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final g()I
    .locals 1

    .prologue
    .line 86
    iget v0, p0, Lcom/cm/kinfoc/i;->f:I

    return v0
.end method

.method public final h()V
    .locals 1

    .prologue
    .line 95
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cm/kinfoc/i;->g:Lcom/cm/kinfoc/l;

    .line 96
    return-void
.end method

.method public final i()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 110
    iget-object v0, p0, Lcom/cm/kinfoc/i;->h:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 115
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 116
    const-string v0, " KHttpData : \n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    const-string v0, "  * tname  : "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1046
    iget-object v2, p0, Lcom/cm/kinfoc/i;->c:Ljava/lang/String;

    .line 117
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    const-string v0, "  * ctime  : "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1066
    iget-wide v2, p0, Lcom/cm/kinfoc/i;->e:J

    .line 118
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    const-string v0, "  * sproi  : "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 1086
    iget v2, p0, Lcom/cm/kinfoc/i;->f:I

    .line 119
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    const-string v0, "  * force  : "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 2056
    iget-boolean v2, p0, Lcom/cm/kinfoc/i;->d:Z

    .line 120
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    const-string v0, "  * dsize  : "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 2127
    iget-object v0, p0, Lcom/cm/kinfoc/i;->a:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 121
    :goto_0
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    const-string v0, "  * -----  : "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 3076
    iget-object v1, p0, Lcom/cm/kinfoc/i;->b:Ljava/lang/String;

    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 2127
    :cond_0
    iget-object v0, p0, Lcom/cm/kinfoc/i;->a:[B

    array-length v0, v0

    goto :goto_0
.end method
