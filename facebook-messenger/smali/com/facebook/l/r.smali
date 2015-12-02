.class Lcom/facebook/l/r;
.super Ljava/lang/Object;
.source "PresenceManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/messages/model/threads/Message;

.field final synthetic b:Lcom/facebook/l/k;


# direct methods
.method constructor <init>(Lcom/facebook/l/k;Lcom/facebook/messages/model/threads/Message;)V
    .locals 0

    .prologue
    .line 548
    iput-object p1, p0, Lcom/facebook/l/r;->b:Lcom/facebook/l/k;

    iput-object p2, p0, Lcom/facebook/l/r;->a:Lcom/facebook/messages/model/threads/Message;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 551
    iget-object v0, p0, Lcom/facebook/l/r;->b:Lcom/facebook/l/k;

    iget-object v1, p0, Lcom/facebook/l/r;->a:Lcom/facebook/messages/model/threads/Message;

    invoke-static {v0, v1}, Lcom/facebook/l/k;->a(Lcom/facebook/l/k;Lcom/facebook/messages/model/threads/Message;)V

    .line 552
    return-void
.end method
