.class public Lcom/qihoo/security/opti/trashclear/d;
.super Lcom/qihoo/security/opti/trashclear/c;
.source "360Security"


# instance fields
.field public c:Z

.field public d:Ljava/lang/String;

.field public e:J

.field public f:J
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public g:J
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public h:J
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public i:J

.field public j:Lcom/qihoo/security/opti/trashclear/e$a;

.field public k:Lcom/qihoo/security/opti/trashclear/e$a;

.field public l:Lcom/qihoo/security/opti/trashclear/e$a;

.field public m:I

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I


# direct methods
.method public constructor <init>()V
    .locals 4

    .prologue
    const/16 v3, 0x64

    const/4 v2, 0x0

    const-wide/16 v0, 0x0

    .line 164
    invoke-direct {p0}, Lcom/qihoo/security/opti/trashclear/c;-><init>()V

    .line 19
    iput-wide v0, p0, Lcom/qihoo/security/opti/trashclear/d;->e:J

    .line 24
    iput-wide v0, p0, Lcom/qihoo/security/opti/trashclear/d;->f:J

    .line 30
    iput-wide v0, p0, Lcom/qihoo/security/opti/trashclear/d;->g:J

    .line 36
    iput-wide v0, p0, Lcom/qihoo/security/opti/trashclear/d;->h:J

    .line 42
    iput-wide v0, p0, Lcom/qihoo/security/opti/trashclear/d;->i:J

    .line 74
    iput v2, p0, Lcom/qihoo/security/opti/trashclear/d;->m:I

    .line 78
    iput v3, p0, Lcom/qihoo/security/opti/trashclear/d;->n:I

    .line 82
    iput v2, p0, Lcom/qihoo/security/opti/trashclear/d;->o:I

    .line 86
    iput v3, p0, Lcom/qihoo/security/opti/trashclear/d;->p:I

    .line 90
    iput v2, p0, Lcom/qihoo/security/opti/trashclear/d;->q:I

    .line 94
    iput v3, p0, Lcom/qihoo/security/opti/trashclear/d;->r:I

    .line 165
    new-instance v0, Lcom/qihoo/security/opti/trashclear/e$a;

    invoke-direct {v0}, Lcom/qihoo/security/opti/trashclear/e$a;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/d;->j:Lcom/qihoo/security/opti/trashclear/e$a;

    .line 166
    new-instance v0, Lcom/qihoo/security/opti/trashclear/e$a;

    invoke-direct {v0}, Lcom/qihoo/security/opti/trashclear/e$a;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/d;->k:Lcom/qihoo/security/opti/trashclear/e$a;

    .line 167
    new-instance v0, Lcom/qihoo/security/opti/trashclear/e$a;

    invoke-direct {v0}, Lcom/qihoo/security/opti/trashclear/e$a;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/d;->l:Lcom/qihoo/security/opti/trashclear/e$a;

    .line 168
    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 183
    .line 184
    invoke-super {p0}, Lcom/qihoo/security/opti/trashclear/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/d;

    .line 185
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 172
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "OptiTrashInfo [mCurTrashPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/d;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", mTotalScanTrashSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/qihoo/security/opti/trashclear/d;->e:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", mTotalClearTrashSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/qihoo/security/opti/trashclear/d;->i:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", mTrashSizeInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/d;->j:Lcom/qihoo/security/opti/trashclear/e$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", mCleanableSizeInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/opti/trashclear/d;->k:Lcom/qihoo/security/opti/trashclear/e$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", currentAppTrashProgress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/d;->m:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", totalAppTrashProgress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/d;->n:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", currentDiskTrashProgress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/d;->o:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", totalDiskTrashProgress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/d;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", currentBigFileTrashProgress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/d;->q:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, ", totalBigFileTrashProgress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/qihoo/security/opti/trashclear/d;->r:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string/jumbo v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
