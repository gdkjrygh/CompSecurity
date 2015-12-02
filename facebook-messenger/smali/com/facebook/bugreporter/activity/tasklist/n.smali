.class Lcom/facebook/bugreporter/activity/tasklist/n;
.super Lcom/facebook/inject/d;
.source "TaskListModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/bugreporter/activity/tasklist/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/bugreporter/activity/tasklist/j;


# direct methods
.method private constructor <init>(Lcom/facebook/bugreporter/activity/tasklist/j;)V
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/facebook/bugreporter/activity/tasklist/n;->a:Lcom/facebook/bugreporter/activity/tasklist/j;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/bugreporter/activity/tasklist/j;Lcom/facebook/bugreporter/activity/tasklist/k;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0, p1}, Lcom/facebook/bugreporter/activity/tasklist/n;-><init>(Lcom/facebook/bugreporter/activity/tasklist/j;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/bugreporter/activity/tasklist/e;
    .locals 1

    .prologue
    .line 45
    new-instance v0, Lcom/facebook/bugreporter/activity/tasklist/e;

    invoke-direct {v0}, Lcom/facebook/bugreporter/activity/tasklist/e;-><init>()V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 41
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/tasklist/n;->a()Lcom/facebook/bugreporter/activity/tasklist/e;

    move-result-object v0

    return-object v0
.end method
