.class public Lcom/facebook/orca/threadlist/FrameworkBasedThreadListActivity;
.super Lcom/facebook/base/activity/d;
.source "FrameworkBasedThreadListActivity.java"

# interfaces
.implements Lcom/facebook/orca/activity/k;
.implements Lcom/facebook/orca/threadlist/s;


# instance fields
.field private final p:Lcom/facebook/orca/threadlist/t;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 15
    new-instance v0, Lcom/facebook/orca/threadlist/t;

    invoke-direct {v0}, Lcom/facebook/orca/threadlist/t;-><init>()V

    invoke-direct {p0, v0}, Lcom/facebook/orca/threadlist/FrameworkBasedThreadListActivity;-><init>(Lcom/facebook/orca/threadlist/t;)V

    .line 16
    return-void
.end method

.method private constructor <init>(Lcom/facebook/orca/threadlist/t;)V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0, p1}, Lcom/facebook/base/activity/d;-><init>(Lcom/facebook/base/activity/l;)V

    .line 20
    iput-object p1, p0, Lcom/facebook/orca/threadlist/FrameworkBasedThreadListActivity;->p:Lcom/facebook/orca/threadlist/t;

    .line 21
    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/orca/threadlist/t;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/facebook/orca/threadlist/FrameworkBasedThreadListActivity;->p:Lcom/facebook/orca/threadlist/t;

    return-object v0
.end method

.method public c()Lcom/facebook/orca/common/ui/titlebar/a;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/orca/threadlist/FrameworkBasedThreadListActivity;->p:Lcom/facebook/orca/threadlist/t;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/t;->c()Lcom/facebook/orca/common/ui/titlebar/a;

    move-result-object v0

    return-object v0
.end method

.method public c_()Z
    .locals 1

    .prologue
    .line 30
    const/4 v0, 0x1

    return v0
.end method
