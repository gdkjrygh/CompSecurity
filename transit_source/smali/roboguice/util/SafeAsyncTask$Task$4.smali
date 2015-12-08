.class Lroboguice/util/SafeAsyncTask$Task$4;
.super Ljava/lang/Object;
.source "SafeAsyncTask.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lroboguice/util/SafeAsyncTask$Task;->doThrowable(Ljava/lang/Throwable;)V
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

.field final synthetic val$e:Ljava/lang/Throwable;


# direct methods
.method constructor <init>(Lroboguice/util/SafeAsyncTask$Task;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 239
    .local p0, "this":Lroboguice/util/SafeAsyncTask$Task$4;, "Lroboguice/util/SafeAsyncTask$Task.4;"
    iput-object p1, p0, Lroboguice/util/SafeAsyncTask$Task$4;->this$0:Lroboguice/util/SafeAsyncTask$Task;

    iput-object p2, p0, Lroboguice/util/SafeAsyncTask$Task$4;->val$e:Ljava/lang/Throwable;

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
    .line 241
    .local p0, "this":Lroboguice/util/SafeAsyncTask$Task$4;, "Lroboguice/util/SafeAsyncTask$Task.4;"
    iget-object v0, p0, Lroboguice/util/SafeAsyncTask$Task$4;->this$0:Lroboguice/util/SafeAsyncTask$Task;

    iget-object v0, v0, Lroboguice/util/SafeAsyncTask$Task;->parent:Lroboguice/util/SafeAsyncTask;

    iget-object v1, p0, Lroboguice/util/SafeAsyncTask$Task$4;->val$e:Ljava/lang/Throwable;

    invoke-virtual {v0, v1}, Lroboguice/util/SafeAsyncTask;->onThrowable(Ljava/lang/Throwable;)V

    .line 242
    const/4 v0, 0x0

    return-object v0
.end method
