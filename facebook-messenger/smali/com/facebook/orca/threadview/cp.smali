.class public Lcom/facebook/orca/threadview/cp;
.super Ljava/lang/Object;
.source "ThreadViewLoader.java"


# instance fields
.field public final a:Lcom/facebook/orca/threads/ThreadSummary;

.field public final b:Lcom/facebook/orca/threads/MessagesCollection;

.field public final c:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/orca/threads/ThreadSummary;Lcom/facebook/orca/threads/MessagesCollection;Lcom/google/common/a/es;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/orca/threads/ThreadSummary;",
            "Lcom/facebook/orca/threads/MessagesCollection;",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    iput-object p1, p0, Lcom/facebook/orca/threadview/cp;->a:Lcom/facebook/orca/threads/ThreadSummary;

    .line 85
    iput-object p2, p0, Lcom/facebook/orca/threadview/cp;->b:Lcom/facebook/orca/threads/MessagesCollection;

    .line 86
    iput-object p3, p0, Lcom/facebook/orca/threadview/cp;->c:Lcom/google/common/a/es;

    .line 87
    return-void
.end method
