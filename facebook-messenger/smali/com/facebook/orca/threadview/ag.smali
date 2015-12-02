.class final Lcom/facebook/orca/threadview/ag;
.super Ljava/lang/Object;
.source "RowReceiptParticipant.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/facebook/orca/threadview/RowReceiptParticipant;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/threadview/RowReceiptParticipant;Lcom/facebook/orca/threadview/RowReceiptParticipant;)I
    .locals 4

    .prologue
    .line 28
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/RowReceiptParticipant;->b()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/facebook/orca/threadview/RowReceiptParticipant;->b()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 29
    const/4 v0, 0x1

    .line 33
    :goto_0
    return v0

    .line 30
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/orca/threadview/RowReceiptParticipant;->b()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/facebook/orca/threadview/RowReceiptParticipant;->b()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 31
    const/4 v0, -0x1

    goto :goto_0

    .line 33
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 25
    check-cast p1, Lcom/facebook/orca/threadview/RowReceiptParticipant;

    check-cast p2, Lcom/facebook/orca/threadview/RowReceiptParticipant;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/threadview/ag;->a(Lcom/facebook/orca/threadview/RowReceiptParticipant;Lcom/facebook/orca/threadview/RowReceiptParticipant;)I

    move-result v0

    return v0
.end method
