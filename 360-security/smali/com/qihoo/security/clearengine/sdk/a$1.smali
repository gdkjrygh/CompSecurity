.class Lcom/qihoo/security/clearengine/sdk/a$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/clearengine/sdk/a;
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


# instance fields
.field final synthetic a:Lcom/qihoo/security/clearengine/sdk/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/clearengine/sdk/a;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo/security/clearengine/sdk/a$1;->a:Lcom/qihoo/security/clearengine/sdk/a;

    .line 321
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)I
    .locals 4

    .prologue
    .line 325
    iget-wide v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    iget-wide v2, p2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 326
    const/4 v0, -0x1

    .line 332
    :goto_0
    return v0

    .line 328
    :cond_0
    iget-wide v0, p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    iget-wide v2, p2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;->size:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    .line 329
    const/4 v0, 0x1

    goto :goto_0

    .line 332
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 1
    check-cast p1, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    check-cast p2, Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;

    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/clearengine/sdk/a$1;->a(Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;Lcom/qihoo360/mobilesafe/opti/i/trashclear/TrashInfo;)I

    move-result v0

    return v0
.end method
