.class public Lcom/facebook/orca/messageview/k;
.super Ljava/lang/Object;
.source "MessageViewFragment.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field public final a:Lcom/facebook/messages/model/threads/Message;

.field public final b:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threadview/RowReceiptParticipant;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lcom/facebook/orca/threads/ThreadSummary;


# direct methods
.method public constructor <init>(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/messages/model/threads/Message;Lcom/google/common/a/es;Lcom/google/common/a/es;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            "Lcom/facebook/messages/model/threads/Message;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/orca/threadview/RowReceiptParticipant;",
            ">;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/ParticipantInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    iput-object p1, p0, Lcom/facebook/orca/messageview/k;->d:Lcom/facebook/orca/threads/ThreadSummary;

    .line 99
    iput-object p2, p0, Lcom/facebook/orca/messageview/k;->a:Lcom/facebook/messages/model/threads/Message;

    .line 100
    iput-object p3, p0, Lcom/facebook/orca/messageview/k;->b:Lcom/google/common/a/es;

    .line 101
    iput-object p4, p0, Lcom/facebook/orca/messageview/k;->c:Lcom/google/common/a/es;

    .line 102
    return-void
.end method
