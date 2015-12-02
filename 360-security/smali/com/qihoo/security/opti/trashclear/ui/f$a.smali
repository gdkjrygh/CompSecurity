.class Lcom/qihoo/security/opti/trashclear/ui/f$a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/ui/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:J

.field final synthetic e:Lcom/qihoo/security/opti/trashclear/ui/f;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/f;)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 1557
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/f$a;->e:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1558
    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/f$a;->a:I

    .line 1559
    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/f$a;->b:I

    .line 1560
    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/f$a;->c:I

    .line 1561
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/f$a;->d:J

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 1565
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1566
    const-string/jumbo v1, "clearListLevelOneData [selectedCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1567
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/f$a;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1568
    const-string/jumbo v1, ", lockedCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1569
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/f$a;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1570
    const-string/jumbo v1, ", totalCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1571
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/f$a;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1572
    const-string/jumbo v1, ", totalLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1573
    iget-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/f$a;->d:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1574
    const-string/jumbo v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1575
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
