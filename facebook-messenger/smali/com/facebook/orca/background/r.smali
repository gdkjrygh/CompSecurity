.class Lcom/facebook/orca/background/r;
.super Lcom/facebook/backgroundtasks/r;
.source "TopGroupsSyncBackgroundTask.java"


# instance fields
.field final synthetic a:Lcom/facebook/orca/background/q;


# direct methods
.method constructor <init>(Lcom/facebook/orca/background/q;Ljava/lang/Class;)V
    .locals 0

    .prologue
    .line 106
    iput-object p1, p0, Lcom/facebook/orca/background/r;->a:Lcom/facebook/orca/background/q;

    invoke-direct {p0, p2}, Lcom/facebook/backgroundtasks/r;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/OperationResult;)V
    .locals 5

    .prologue
    .line 109
    invoke-super {p0, p1}, Lcom/facebook/backgroundtasks/r;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    .line 110
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/OperationResult;->i()Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/server/FetchGroupThreadsResult;

    .line 111
    const/4 v1, 0x0

    .line 112
    if-eqz v0, :cond_0

    .line 113
    invoke-virtual {v0}, Lcom/facebook/orca/server/FetchGroupThreadsResult;->a()Lcom/facebook/orca/threads/ThreadsCollection;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threads/ThreadsCollection;->b()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    .line 115
    :goto_0
    iget-object v1, p0, Lcom/facebook/orca/background/r;->a:Lcom/facebook/orca/background/q;

    invoke-static {v1}, Lcom/facebook/orca/background/q;->b(Lcom/facebook/orca/background/q;)Lcom/facebook/prefs/shared/d;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v1

    sget-object v2, Lcom/facebook/orca/background/n;->b:Lcom/facebook/prefs/shared/ae;

    iget-object v3, p0, Lcom/facebook/orca/background/r;->a:Lcom/facebook/orca/background/q;

    invoke-static {v3}, Lcom/facebook/orca/background/q;->a(Lcom/facebook/orca/background/q;)Lcom/facebook/common/time/a;

    move-result-object v3

    invoke-interface {v3}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v3

    invoke-interface {v1, v2, v3, v4}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v1

    sget-object v2, Lcom/facebook/orca/background/n;->c:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 120
    iget-object v0, p0, Lcom/facebook/orca/background/r;->a:Lcom/facebook/orca/background/q;

    invoke-static {v0}, Lcom/facebook/orca/background/q;->c(Lcom/facebook/orca/background/q;)Lcom/facebook/base/broadcast/a;

    move-result-object v0

    const-string v1, "com.facebook.intent.action.TOP_GROUP_THREADS_SYNC_PROGRESS"

    invoke-virtual {v0, v1}, Lcom/facebook/base/broadcast/a;->a(Ljava/lang/String;)V

    .line 123
    return-void

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 106
    check-cast p1, Lcom/facebook/fbservice/service/OperationResult;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/background/r;->a(Lcom/facebook/fbservice/service/OperationResult;)V

    return-void
.end method
