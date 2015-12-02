.class public Lcom/facebook/orca/threadview/do;
.super Ljava/lang/Object;
.source "ThreadViewUtil.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/app/Activity;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 21
    const/4 v0, 0x0

    .line 22
    instance-of v1, p1, Lcom/facebook/orca/threadview/ThreadViewActivity;

    if-eqz v1, :cond_1

    .line 23
    check-cast p1, Lcom/facebook/orca/threadview/ThreadViewActivity;

    invoke-virtual {p1}, Lcom/facebook/orca/threadview/ThreadViewActivity;->j()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    .line 27
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 24
    :cond_1
    instance-of v1, p1, Lcom/facebook/orca/threadlist/s;

    if-eqz v1, :cond_0

    .line 25
    check-cast p1, Lcom/facebook/orca/threadlist/s;

    invoke-interface {p1}, Lcom/facebook/orca/threadlist/s;->a()Lcom/facebook/orca/threadlist/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/t;->v()Lcom/facebook/messages/threads/model/ThreadViewSpec;

    move-result-object v0

    goto :goto_0
.end method

.method public b(Landroid/app/Activity;)Z
    .locals 1

    .prologue
    .line 37
    instance-of v0, p1, Lcom/facebook/orca/threadview/ThreadViewActivity;

    if-nez v0, :cond_0

    instance-of v0, p1, Lcom/facebook/orca/threadlist/s;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/facebook/orca/threadlist/s;

    invoke-interface {p1}, Lcom/facebook/orca/threadlist/s;->a()Lcom/facebook/orca/threadlist/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/t;->w()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
