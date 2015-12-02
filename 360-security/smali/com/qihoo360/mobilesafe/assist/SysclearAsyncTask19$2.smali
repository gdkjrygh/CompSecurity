.class Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$2;
.super Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$c;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$c",
        "<TParams;TResult;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;)V
    .locals 1

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$2;->a:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;

    .line 269
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$c;-><init>(Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$c;)V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TResult;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 271
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$2;->a:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->a(Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 272
    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 274
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$2;->a:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$2;->a:Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;

    iget-object v2, p0, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19$2;->b:[Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->a([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;->b(Lcom/qihoo360/mobilesafe/assist/SysclearAsyncTask19;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
