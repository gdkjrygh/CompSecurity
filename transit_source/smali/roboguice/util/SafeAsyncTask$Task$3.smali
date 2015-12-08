.class Lroboguice/util/SafeAsyncTask$Task$3;
.super Ljava/lang/Object;
.source "SafeAsyncTask.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lroboguice/util/SafeAsyncTask$Task;->doException(Ljava/lang/Exception;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lroboguice/util/SafeAsyncTask$Task;

.field final synthetic val$e:Ljava/lang/Exception;


# direct methods
.method constructor <init>(Lroboguice/util/SafeAsyncTask$Task;Ljava/lang/Exception;)V
    .locals 0

    .prologue
    .line 222
    .local p0, "this":Lroboguice/util/SafeAsyncTask$Task$3;, "Lroboguice/util/SafeAsyncTask$Task.3;"
    iput-object p1, p0, Lroboguice/util/SafeAsyncTask$Task$3;->this$0:Lroboguice/util/SafeAsyncTask$Task;

    iput-object p2, p0, Lroboguice/util/SafeAsyncTask$Task$3;->val$e:Ljava/lang/Exception;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 224
    .local p0, "this":Lroboguice/util/SafeAsyncTask$Task$3;, "Lroboguice/util/SafeAsyncTask$Task.3;"
    iget-object v0, p0, Lroboguice/util/SafeAsyncTask$Task$3;->val$e:Ljava/lang/Exception;

    instance-of v0, v0, Ljava/lang/InterruptedException;

    if-nez v0, :cond_0

    iget-object v0, p0, Lroboguice/util/SafeAsyncTask$Task$3;->val$e:Ljava/lang/Exception;

    instance-of v0, v0, Ljava/io/InterruptedIOException;

    if-eqz v0, :cond_1

    .line 225
    :cond_0
    iget-object v0, p0, Lroboguice/util/SafeAsyncTask$Task$3;->this$0:Lroboguice/util/SafeAsyncTask$Task;

    iget-object v0, v0, Lroboguice/util/SafeAsyncTask$Task;->parent:Lroboguice/util/SafeAsyncTask;

    iget-object v1, p0, Lroboguice/util/SafeAsyncTask$Task$3;->val$e:Ljava/lang/Exception;

    invoke-virtual {v0, v1}, Lroboguice/util/SafeAsyncTask;->onInterrupted(Ljava/lang/Exception;)V

    .line 228
    :goto_0
    const/4 v0, 0x0

    return-object v0

    .line 227
    :cond_1
    iget-object v0, p0, Lroboguice/util/SafeAsyncTask$Task$3;->this$0:Lroboguice/util/SafeAsyncTask$Task;

    iget-object v0, v0, Lroboguice/util/SafeAsyncTask$Task;->parent:Lroboguice/util/SafeAsyncTask;

    iget-object v1, p0, Lroboguice/util/SafeAsyncTask$Task$3;->val$e:Ljava/lang/Exception;

    invoke-virtual {v0, v1}, Lroboguice/util/SafeAsyncTask;->onException(Ljava/lang/Exception;)V

    goto :goto_0
.end method
