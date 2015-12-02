.class Lcom/facebook/orca/protocol/methods/q;
.super Ljava/lang/Object;
.source "FetchThreadsFqlHelper.java"


# annotations
.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# instance fields
.field final a:Lcom/google/common/a/es;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;"
        }
    .end annotation
.end field

.field final b:I


# direct methods
.method public constructor <init>(Lcom/google/common/a/es;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/es",
            "<",
            "Lcom/facebook/messages/model/threads/Message;",
            ">;I)V"
        }
    .end annotation

    .prologue
    .line 296
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 297
    iput-object p1, p0, Lcom/facebook/orca/protocol/methods/q;->a:Lcom/google/common/a/es;

    .line 298
    iput p2, p0, Lcom/facebook/orca/protocol/methods/q;->b:I

    .line 299
    return-void
.end method
