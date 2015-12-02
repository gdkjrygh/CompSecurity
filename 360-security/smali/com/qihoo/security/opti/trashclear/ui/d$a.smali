.class Lcom/qihoo/security/opti/trashclear/ui/d$a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/ui/d;
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

.field final synthetic e:Lcom/qihoo/security/opti/trashclear/ui/d;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/d;)V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 1754
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/d$a;->e:Lcom/qihoo/security/opti/trashclear/ui/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1755
    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/d$a;->a:I

    .line 1756
    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/d$a;->b:I

    .line 1757
    iput v0, p0, Lcom/qihoo/security/opti/trashclear/ui/d$a;->c:I

    .line 1758
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/qihoo/security/opti/trashclear/ui/d$a;->d:J

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 1762
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1763
    const-string/jumbo v1, "clearListLevelOneData [selectedCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1764
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/d$a;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1765
    const-string/jumbo v1, ", lockedCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1766
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/d$a;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1767
    const-string/jumbo v1, ", totalCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1768
    iget v1, p0, Lcom/qihoo/security/opti/trashclear/ui/d$a;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1769
    const-string/jumbo v1, ", totalLength="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1770
    iget-wide v2, p0, Lcom/qihoo/security/opti/trashclear/ui/d$a;->d:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 1771
    const-string/jumbo v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1772
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
