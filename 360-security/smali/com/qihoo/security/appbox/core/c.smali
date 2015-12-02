.class public Lcom/qihoo/security/appbox/core/c;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Cloneable;",
        "Ljava/lang/Comparable",
        "<",
        "Lcom/qihoo/security/appbox/core/c;",
        ">;"
    }
.end annotation


# instance fields
.field public a:I

.field public b:Ljava/lang/String;

.field public c:Z

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:I

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:J

.field public m:F

.field public n:Ljava/lang/String;

.field public o:Lcom/facebook/ads/NativeAd;

.field public p:Z

.field public q:Z

.field public r:J

.field public s:Ljava/lang/String;

.field public t:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    const/4 v0, -0x1

    iput v0, p0, Lcom/qihoo/security/appbox/core/c;->a:I

    .line 28
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/appbox/core/c;->b:Ljava/lang/String;

    .line 30
    iput-boolean v2, p0, Lcom/qihoo/security/appbox/core/c;->c:Z

    .line 32
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/appbox/core/c;->d:Ljava/lang/String;

    .line 34
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/appbox/core/c;->e:Ljava/lang/String;

    .line 36
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/appbox/core/c;->f:Ljava/lang/String;

    .line 38
    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/appbox/core/c;->g:I

    .line 40
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/appbox/core/c;->h:Ljava/lang/String;

    .line 42
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/appbox/core/c;->i:Ljava/lang/String;

    .line 44
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/appbox/core/c;->j:Ljava/lang/String;

    .line 46
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/appbox/core/c;->k:Ljava/lang/String;

    .line 48
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/appbox/core/c;->l:J

    .line 50
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/appbox/core/c;->m:F

    .line 52
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/appbox/core/c;->n:Ljava/lang/String;

    .line 54
    iput-object v3, p0, Lcom/qihoo/security/appbox/core/c;->o:Lcom/facebook/ads/NativeAd;

    .line 56
    iput-boolean v2, p0, Lcom/qihoo/security/appbox/core/c;->p:Z

    .line 58
    iput-boolean v2, p0, Lcom/qihoo/security/appbox/core/c;->q:Z

    .line 62
    const-string/jumbo v0, ""

    iput-object v0, p0, Lcom/qihoo/security/appbox/core/c;->s:Ljava/lang/String;

    .line 64
    iput-object v3, p0, Lcom/qihoo/security/appbox/core/c;->t:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/appbox/core/c;)I
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 83
    iget-boolean v1, p0, Lcom/qihoo/security/appbox/core/c;->c:Z

    if-eqz v1, :cond_2

    .line 84
    iget-boolean v1, p1, Lcom/qihoo/security/appbox/core/c;->c:Z

    if-eqz v1, :cond_1

    .line 93
    :cond_0
    :goto_0
    return v0

    .line 87
    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    .line 90
    :cond_2
    iget-boolean v1, p1, Lcom/qihoo/security/appbox/core/c;->c:Z

    if-eqz v1, :cond_0

    .line 91
    const/4 v0, -0x1

    goto :goto_0
.end method

.method public a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 71
    iput-object p1, p0, Lcom/qihoo/security/appbox/core/c;->t:Ljava/lang/Object;

    .line 72
    return-void
.end method

.method public a()Z
    .locals 1

    .prologue
    .line 23
    iget v0, p0, Lcom/qihoo/security/appbox/core/c;->g:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/c;->t:Ljava/lang/Object;

    return-object v0
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 4
    check-cast p1, Lcom/qihoo/security/appbox/core/c;

    invoke-virtual {p0, p1}, Lcom/qihoo/security/appbox/core/c;->a(Lcom/qihoo/security/appbox/core/c;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 76
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "AppItem [description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/appbox/core/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", pkg_name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/appbox/core/c;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", installed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/qihoo/security/appbox/core/c;->c:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", label="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/appbox/core/c;->j:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/qihoo/security/appbox/core/c;->l:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", marketFlag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/appbox/core/c;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", iconUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/appbox/core/c;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", downloadUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/appbox/core/c;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
