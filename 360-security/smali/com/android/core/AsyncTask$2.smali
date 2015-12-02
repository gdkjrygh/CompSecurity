.class Lcom/android/core/AsyncTask$2;
.super Lcom/android/core/AsyncTask$d;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/android/core/AsyncTask;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/android/core/AsyncTask$d",
        "<TParams;TResult;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/android/core/AsyncTask;


# direct methods
.method constructor <init>(Lcom/android/core/AsyncTask;)V
    .locals 1

    .prologue
    .line 269
    iput-object p1, p0, Lcom/android/core/AsyncTask$2;->a:Lcom/android/core/AsyncTask;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/android/core/AsyncTask$d;-><init>(Lcom/android/core/AsyncTask$1;)V

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
    .line 272
    iget-object v0, p0, Lcom/android/core/AsyncTask$2;->a:Lcom/android/core/AsyncTask;

    invoke-static {v0}, Lcom/android/core/AsyncTask;->a(Lcom/android/core/AsyncTask;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 274
    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 276
    iget-object v0, p0, Lcom/android/core/AsyncTask$2;->a:Lcom/android/core/AsyncTask;

    iget-object v1, p0, Lcom/android/core/AsyncTask$2;->a:Lcom/android/core/AsyncTask;

    iget-object v2, p0, Lcom/android/core/AsyncTask$2;->b:[Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/android/core/AsyncTask;->a([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/android/core/AsyncTask;->a(Lcom/android/core/AsyncTask;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
