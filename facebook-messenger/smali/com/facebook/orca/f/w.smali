.class Lcom/facebook/orca/f/w;
.super Ljava/lang/Object;
.source "SendMessageManager.java"

# interfaces
.implements Lcom/google/common/base/Predicate;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/base/Predicate",
        "<",
        "Lcom/facebook/messages/model/threads/Message;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/f/v;


# direct methods
.method constructor <init>(Lcom/facebook/orca/f/v;)V
    .locals 0

    .prologue
    .line 659
    iput-object p1, p0, Lcom/facebook/orca/f/w;->a:Lcom/facebook/orca/f/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/messages/model/threads/Message;)Z
    .locals 2

    .prologue
    .line 662
    iget-object v0, p0, Lcom/facebook/orca/f/w;->a:Lcom/facebook/orca/f/v;

    iget-object v0, v0, Lcom/facebook/orca/f/v;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/facebook/messages/model/threads/Message;->w()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public synthetic apply(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 659
    check-cast p1, Lcom/facebook/messages/model/threads/Message;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/f/w;->a(Lcom/facebook/messages/model/threads/Message;)Z

    move-result v0

    return v0
.end method
