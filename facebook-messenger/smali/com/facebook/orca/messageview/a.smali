.class public Lcom/facebook/orca/messageview/a;
.super Ljava/lang/Object;
.source "MessageReaderListView.java"


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/RowReceiptParticipant;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/facebook/orca/threads/ThreadSummary;

.field private d:Lcom/facebook/messages/model/threads/Message;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
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
    .line 39
    iget-object v0, p0, Lcom/facebook/orca/messageview/a;->a:Ljava/util/List;

    return-object v0
.end method

.method public a(Lcom/facebook/messages/model/threads/Message;)V
    .locals 0

    .prologue
    .line 67
    iput-object p1, p0, Lcom/facebook/orca/messageview/a;->d:Lcom/facebook/messages/model/threads/Message;

    .line 68
    return-void
.end method

.method public a(Lcom/facebook/orca/threads/ThreadSummary;)V
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lcom/facebook/orca/messageview/a;->c:Lcom/facebook/orca/threads/ThreadSummary;

    .line 60
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/orca/threadview/RowReceiptParticipant;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 43
    iput-object p1, p0, Lcom/facebook/orca/messageview/a;->a:Ljava/util/List;

    .line 44
    return-void
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 47
    iget-object v0, p0, Lcom/facebook/orca/messageview/a;->b:Ljava/util/List;

    return-object v0
.end method

.method public b(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 51
    iput-object p1, p0, Lcom/facebook/orca/messageview/a;->b:Ljava/util/List;

    .line 52
    return-void
.end method

.method public c()Lcom/facebook/orca/threads/ThreadSummary;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/orca/messageview/a;->c:Lcom/facebook/orca/threads/ThreadSummary;

    return-object v0
.end method

.method public d()Lcom/facebook/messages/model/threads/Message;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/facebook/orca/messageview/a;->d:Lcom/facebook/messages/model/threads/Message;

    return-object v0
.end method
