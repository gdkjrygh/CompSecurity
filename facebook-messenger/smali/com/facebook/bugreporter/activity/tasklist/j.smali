.class public Lcom/facebook/bugreporter/activity/tasklist/j;
.super Lcom/facebook/inject/c;
.source "TaskListModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/facebook/inject/c;-><init>()V

    .line 57
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 19
    const-class v0, Lcom/facebook/bugreporter/activity/tasklist/c;

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/tasklist/j;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/bugreporter/activity/tasklist/o;

    invoke-direct {v1, p0, v2}, Lcom/facebook/bugreporter/activity/tasklist/o;-><init>(Lcom/facebook/bugreporter/activity/tasklist/j;Lcom/facebook/bugreporter/activity/tasklist/k;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 21
    const-class v0, Lcom/facebook/bugreporter/activity/tasklist/e;

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/tasklist/j;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/bugreporter/activity/tasklist/n;

    invoke-direct {v1, p0, v2}, Lcom/facebook/bugreporter/activity/tasklist/n;-><init>(Lcom/facebook/bugreporter/activity/tasklist/j;Lcom/facebook/bugreporter/activity/tasklist/k;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 23
    const-class v0, Lcom/facebook/bugreporter/activity/categorylist/b;

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/tasklist/j;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/bugreporter/activity/tasklist/l;

    invoke-direct {v1, p0, v2}, Lcom/facebook/bugreporter/activity/tasklist/l;-><init>(Lcom/facebook/bugreporter/activity/tasklist/j;Lcom/facebook/bugreporter/activity/tasklist/k;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 25
    const-class v0, Lcom/facebook/bugreporter/activity/tasklist/b;

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/tasklist/j;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/bugreporter/activity/tasklist/m;

    invoke-direct {v1, p0, v2}, Lcom/facebook/bugreporter/activity/tasklist/m;-><init>(Lcom/facebook/bugreporter/activity/tasklist/j;Lcom/facebook/bugreporter/activity/tasklist/k;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    .line 27
    return-void
.end method
