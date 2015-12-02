.class Lcom/qihoo/security/clearengine/sdk/c$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/clearengine/sdk/c;
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
        "Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1
    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)I
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 71
    .line 72
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 81
    :cond_0
    :goto_0
    return v0

    .line 75
    :cond_1
    iget-wide v2, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    iget-wide v4, p2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    cmp-long v1, v2, v4

    if-lez v1, :cond_2

    .line 76
    const/4 v0, -0x1

    goto :goto_0

    .line 77
    :cond_2
    iget-wide v2, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    iget-wide v4, p2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    cmp-long v1, v2, v4

    if-gez v1, :cond_0

    .line 78
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 1
    check-cast p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    check-cast p2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/clearengine/sdk/c$1;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)I

    move-result v0

    return v0
.end method
