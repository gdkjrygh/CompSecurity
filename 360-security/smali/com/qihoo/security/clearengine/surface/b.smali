.class public Lcom/qihoo/security/clearengine/surface/b;
.super Ljava/lang/Object;
.source "360Security"


# instance fields
.field public a:J

.field public b:J

.field public c:Lcom/qihoo/security/clearengine/TrashType;


# direct methods
.method public constructor <init>(Lcom/qihoo/security/clearengine/TrashType;)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/qihoo/security/clearengine/surface/b;->c:Lcom/qihoo/security/clearengine/TrashType;

    .line 15
    return-void
.end method


# virtual methods
.method public a()Lcom/qihoo/security/clearengine/surface/b;
    .locals 4

    .prologue
    .line 26
    new-instance v0, Lcom/qihoo/security/clearengine/surface/b;

    iget-object v1, p0, Lcom/qihoo/security/clearengine/surface/b;->c:Lcom/qihoo/security/clearengine/TrashType;

    invoke-direct {v0, v1}, Lcom/qihoo/security/clearengine/surface/b;-><init>(Lcom/qihoo/security/clearengine/TrashType;)V

    .line 27
    iget-wide v2, p0, Lcom/qihoo/security/clearengine/surface/b;->a:J

    iput-wide v2, v0, Lcom/qihoo/security/clearengine/surface/b;->a:J

    .line 28
    iget-wide v2, p0, Lcom/qihoo/security/clearengine/surface/b;->b:J

    iput-wide v2, v0, Lcom/qihoo/security/clearengine/surface/b;->b:J

    .line 29
    return-object v0
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .prologue
    .line 1
    invoke-virtual {p0}, Lcom/qihoo/security/clearengine/surface/b;->a()Lcom/qihoo/security/clearengine/surface/b;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "TrashCatgoryInfo [ type = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/qihoo/security/clearengine/surface/b;->c:Lcom/qihoo/security/clearengine/TrashType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "selectSize = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/qihoo/security/clearengine/surface/b;->a:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, " totalSize  = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/qihoo/security/clearengine/surface/b;->b:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
