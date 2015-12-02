.class public Lcom/facebook/orca/o/a;
.super Ljava/lang/Exception;
.source "SendMessageException.java"

# interfaces
.implements Lcom/facebook/fbservice/c/c;


# instance fields
.field private final a:Lcom/facebook/messages/model/threads/Message;


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;Lcom/facebook/messages/model/threads/Message;)V
    .locals 1

    .prologue
    .line 18
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 19
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/model/threads/Message;

    iput-object v0, p0, Lcom/facebook/orca/o/a;->a:Lcom/facebook/messages/model/threads/Message;

    .line 20
    return-void
.end method


# virtual methods
.method public synthetic a()Landroid/os/Parcelable;
    .locals 1

    .prologue
    .line 13
    invoke-virtual {p0}, Lcom/facebook/orca/o/a;->b()Lcom/facebook/messages/model/threads/Message;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/facebook/messages/model/threads/Message;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/facebook/orca/o/a;->a:Lcom/facebook/messages/model/threads/Message;

    return-object v0
.end method
