.class Lroboguice/util/SafeAsyncTask$Task$2;
.super Ljava/lang/Object;
.source "SafeAsyncTask.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lroboguice/util/SafeAsyncTask$Task;->doSuccess(Ljava/lang/Object;)V
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

.field final synthetic val$r:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lroboguice/util/SafeAsyncTask$Task;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 208
    .local p0, "this":Lroboguice/util/SafeAsyncTask$Task$2;, "Lroboguice/util/SafeAsyncTask$Task.2;"
    iput-object p1, p0, Lroboguice/util/SafeAsyncTask$Task$2;->this$0:Lroboguice/util/SafeAsyncTask$Task;

    iput-object p2, p0, Lroboguice/util/SafeAsyncTask$Task$2;->val$r:Ljava/lang/Object;

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
    .line 210
    .local p0, "this":Lroboguice/util/SafeAsyncTask$Task$2;, "Lroboguice/util/SafeAsyncTask$Task.2;"
    iget-object v0, p0, Lroboguice/util/SafeAsyncTask$Task$2;->this$0:Lroboguice/util/SafeAsyncTask$Task;

    iget-object v0, v0, Lroboguice/util/SafeAsyncTask$Task;->parent:Lroboguice/util/SafeAsyncTask;

    iget-object v1, p0, Lroboguice/util/SafeAsyncTask$Task$2;->val$r:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lroboguice/util/SafeAsyncTask;->onSuccess(Ljava/lang/Object;)V

    .line 211
    const/4 v0, 0x0

    return-object v0
.end method
