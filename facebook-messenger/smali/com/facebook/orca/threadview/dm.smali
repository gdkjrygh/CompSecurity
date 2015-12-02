.class public Lcom/facebook/orca/threadview/dm;
.super Ljava/lang/Object;
.source "ThreadViewSpecUtil.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Intent;)Lcom/facebook/messages/threads/model/ThreadViewSpec;
    .locals 1

    .prologue
    .line 30
    const-string v0, "thread_id"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 31
    const-string v0, "thread_view_spec"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 32
    const-string v0, "thread_id"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Ljava/lang/String;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 39
    :goto_1
    return-object v0

    .line 31
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 36
    :cond_1
    const-string v0, "thread_view_spec"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 37
    const-string v0, "thread_view_spec"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/messages/threads/model/ThreadViewSpec;

    goto :goto_1

    .line 39
    :cond_2
    sget-object v0, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    goto :goto_1
.end method

.method public static a(Lcom/facebook/messages/model/threads/Message;)Lcom/facebook/messages/threads/model/ThreadViewSpec;
    .locals 1

    .prologue
    .line 49
    invoke-static {p0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    invoke-virtual {p0}, Lcom/facebook/messages/model/threads/Message;->G()Lcom/facebook/user/RecipientInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 51
    invoke-virtual {p0}, Lcom/facebook/messages/model/threads/Message;->G()Lcom/facebook/user/RecipientInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a(Lcom/facebook/user/RecipientInfo;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 53
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/facebook/messages/model/threads/Message;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b(Ljava/lang/String;)Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    goto :goto_0
.end method

.method public static a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Z
    .locals 2

    .prologue
    .line 65
    invoke-virtual {p0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    invoke-virtual {p0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/orca/threads/m;->g(Ljava/lang/String;)Z

    move-result v0

    .line 71
    :goto_0
    return v0

    .line 67
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 68
    invoke-virtual {p0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->e()Lcom/facebook/user/RecipientInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/user/RecipientInfo;->a()Lcom/facebook/user/UserIdentifier;

    move-result-object v0

    .line 69
    invoke-virtual {v0}, Lcom/facebook/user/UserIdentifier;->e()Lcom/facebook/user/s;

    move-result-object v0

    sget-object v1, Lcom/facebook/user/s;->PHONE:Lcom/facebook/user/s;

    invoke-virtual {v0, v1}, Lcom/facebook/user/s;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    .line 71
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
