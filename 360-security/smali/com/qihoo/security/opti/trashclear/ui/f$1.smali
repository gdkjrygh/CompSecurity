.class Lcom/qihoo/security/opti/trashclear/ui/f$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/opti/trashclear/ui/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/f;

.field private final b:Ljava/text/Collator;


# direct methods
.method constructor <init>(Lcom/qihoo/security/opti/trashclear/ui/f;)V
    .locals 1

    .prologue
    .line 1694
    iput-object p1, p0, Lcom/qihoo/security/opti/trashclear/ui/f$1;->a:Lcom/qihoo/security/opti/trashclear/ui/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1695
    invoke-static {}, Ljava/text/Collator;->getInstance()Ljava/text/Collator;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/opti/trashclear/ui/f$1;->b:Ljava/text/Collator;

    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)I
    .locals 4

    .prologue
    .line 1699
    iget-wide v0, p1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->size:J

    iget-wide v2, p2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->size:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 1700
    const/4 v0, 0x1

    .line 1716
    :goto_0
    return v0

    .line 1702
    :cond_0
    iget-wide v0, p1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->size:J

    iget-wide v2, p2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->size:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 1703
    const/4 v0, -0x1

    goto :goto_0

    .line 1705
    :cond_1
    iget-object v1, p1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    .line 1706
    iget-object v0, p2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;->name:Ljava/lang/String;

    .line 1707
    if-nez v1, :cond_2

    .line 1708
    const-string/jumbo v1, ""

    .line 1710
    :cond_2
    if-nez v0, :cond_3

    .line 1711
    const-string/jumbo v0, ""

    .line 1716
    :cond_3
    iget-object v2, p0, Lcom/qihoo/security/opti/trashclear/ui/f$1;->b:Ljava/text/Collator;

    invoke-virtual {v2, v1, v0}, Ljava/text/Collator;->compare(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    goto :goto_0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 1694
    check-cast p1, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    check-cast p2, Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;

    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/opti/trashclear/ui/f$1;->a(Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;Lcom/qihoo/security/opti/trashclear/ui/TrashItemInfo;)I

    move-result v0

    return v0
.end method
