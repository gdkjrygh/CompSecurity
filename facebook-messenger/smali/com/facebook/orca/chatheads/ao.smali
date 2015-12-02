.class Lcom/facebook/orca/chatheads/ao;
.super Lcom/facebook/orca/chatheads/bw;
.source "ChatHeadWindowManager.java"


# instance fields
.field final synthetic a:Lcom/facebook/messages/model/threads/Message;

.field final synthetic b:Lcom/facebook/messages/threads/model/ThreadViewSpec;

.field final synthetic c:Lcom/facebook/orca/chatheads/al;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/al;Lcom/facebook/messages/model/threads/Message;Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 1

    .prologue
    .line 903
    iput-object p1, p0, Lcom/facebook/orca/chatheads/ao;->c:Lcom/facebook/orca/chatheads/al;

    iput-object p2, p0, Lcom/facebook/orca/chatheads/ao;->a:Lcom/facebook/messages/model/threads/Message;

    iput-object p3, p0, Lcom/facebook/orca/chatheads/ao;->b:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/facebook/orca/chatheads/bw;-><init>(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/am;)V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    .line 906
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ao;->c:Lcom/facebook/orca/chatheads/al;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/ao;->a:Lcom/facebook/messages/model/threads/Message;

    invoke-static {v0, v1}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Lcom/facebook/messages/model/threads/Message;)V

    .line 907
    iget-object v0, p0, Lcom/facebook/orca/chatheads/ao;->c:Lcom/facebook/orca/chatheads/al;

    const-string v1, "message"

    iget-object v2, p0, Lcom/facebook/orca/chatheads/ao;->b:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-static {v0, v1, v2}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Ljava/lang/String;Lcom/facebook/messages/threads/model/ThreadViewSpec;)V

    .line 908
    return-void
.end method
