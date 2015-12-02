.class public Lcom/facebook/orca/threadview/i;
.super Ljava/lang/Object;
.source "MessageDeliveredReadInfo.java"


# instance fields
.field private final a:Lcom/facebook/orca/threadview/j;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/RowReceiptParticipant;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/facebook/messages/model/threads/ParticipantInfo;

.field private d:J


# direct methods
.method private constructor <init>(Lcom/facebook/orca/threadview/j;)V
    .locals 2

    .prologue
    .line 34
    const-wide/16 v0, -0x1

    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/orca/threadview/i;-><init>(Lcom/facebook/orca/threadview/j;J)V

    .line 35
    return-void
.end method

.method private constructor <init>(Lcom/facebook/orca/threadview/j;J)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/facebook/orca/threadview/i;->a:Lcom/facebook/orca/threadview/j;

    .line 39
    iput-wide p2, p0, Lcom/facebook/orca/threadview/i;->d:J

    .line 40
    return-void
.end method

.method public static a(J)Lcom/facebook/orca/threadview/i;
    .locals 2

    .prologue
    .line 91
    new-instance v0, Lcom/facebook/orca/threadview/i;

    sget-object v1, Lcom/facebook/orca/threadview/j;->READER:Lcom/facebook/orca/threadview/j;

    invoke-direct {v0, v1, p0, p1}, Lcom/facebook/orca/threadview/i;-><init>(Lcom/facebook/orca/threadview/j;J)V

    return-object v0
.end method

.method public static a(Lcom/facebook/messages/model/threads/ParticipantInfo;)Lcom/facebook/orca/threadview/i;
    .locals 2

    .prologue
    .line 99
    new-instance v0, Lcom/facebook/orca/threadview/i;

    sget-object v1, Lcom/facebook/orca/threadview/j;->SENDER:Lcom/facebook/orca/threadview/j;

    invoke-direct {v0, v1}, Lcom/facebook/orca/threadview/i;-><init>(Lcom/facebook/orca/threadview/j;)V

    .line 101
    invoke-direct {v0, p0}, Lcom/facebook/orca/threadview/i;->b(Lcom/facebook/messages/model/threads/ParticipantInfo;)V

    .line 102
    return-object v0
.end method

.method private b(Lcom/facebook/messages/model/threads/ParticipantInfo;)V
    .locals 0

    .prologue
    .line 79
    iput-object p1, p0, Lcom/facebook/orca/threadview/i;->c:Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 80
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/RowReceiptParticipant;",
            ">;"
        }
    .end annotation

    .prologue
    .line 43
    iget-object v0, p0, Lcom/facebook/orca/threadview/i;->a:Lcom/facebook/orca/threadview/j;

    sget-object v1, Lcom/facebook/orca/threadview/j;->READER:Lcom/facebook/orca/threadview/j;

    if-ne v0, v1, :cond_0

    .line 44
    iget-object v0, p0, Lcom/facebook/orca/threadview/i;->b:Ljava/util/List;

    .line 46
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/facebook/orca/threadview/RowReceiptParticipant;)V
    .locals 2

    .prologue
    .line 64
    iget-object v0, p0, Lcom/facebook/orca/threadview/i;->a:Lcom/facebook/orca/threadview/j;

    sget-object v1, Lcom/facebook/orca/threadview/j;->READER:Lcom/facebook/orca/threadview/j;

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    :goto_0
    const-string v1, "MessageDeliveredReadInfo is not of type READER - Cannot add a reader"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 67
    iget-object v0, p0, Lcom/facebook/orca/threadview/i;->b:Ljava/util/List;

    if-nez v0, :cond_0

    .line 68
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/i;->b:Ljava/util/List;

    .line 70
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/i;->b:Ljava/util/List;

    sget-object v1, Lcom/facebook/orca/threadview/RowReceiptParticipant;->a:Ljava/util/Comparator;

    invoke-static {v0, p1, v1}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result v0

    .line 72
    if-gez v0, :cond_1

    .line 73
    neg-int v0, v0

    add-int/lit8 v0, v0, -0x1

    .line 75
    :cond_1
    iget-object v1, p0, Lcom/facebook/orca/threadview/i;->b:Ljava/util/List;

    invoke-interface {v1, v0, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 76
    return-void

    .line 64
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Lcom/facebook/messages/model/threads/ParticipantInfo;
    .locals 2

    .prologue
    .line 50
    iget-object v0, p0, Lcom/facebook/orca/threadview/i;->a:Lcom/facebook/orca/threadview/j;

    sget-object v1, Lcom/facebook/orca/threadview/j;->SENDER:Lcom/facebook/orca/threadview/j;

    if-ne v0, v1, :cond_0

    .line 51
    iget-object v0, p0, Lcom/facebook/orca/threadview/i;->c:Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 53
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Lcom/facebook/messages/model/threads/ParticipantInfo;
    .locals 2

    .prologue
    .line 57
    iget-object v0, p0, Lcom/facebook/orca/threadview/i;->a:Lcom/facebook/orca/threadview/j;

    sget-object v1, Lcom/facebook/orca/threadview/j;->DELIVEREE:Lcom/facebook/orca/threadview/j;

    if-ne v0, v1, :cond_0

    .line 58
    iget-object v0, p0, Lcom/facebook/orca/threadview/i;->c:Lcom/facebook/messages/model/threads/ParticipantInfo;

    .line 60
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()Lcom/facebook/orca/threadview/j;
    .locals 1

    .prologue
    .line 83
    iget-object v0, p0, Lcom/facebook/orca/threadview/i;->a:Lcom/facebook/orca/threadview/j;

    return-object v0
.end method

.method public e()J
    .locals 2

    .prologue
    .line 87
    iget-wide v0, p0, Lcom/facebook/orca/threadview/i;->d:J

    return-wide v0
.end method
