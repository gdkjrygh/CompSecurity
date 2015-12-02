.class Lcom/facebook/bugreporter/activity/tasklist/m;
.super Lcom/facebook/inject/d;
.source "TaskListModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/bugreporter/activity/tasklist/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/bugreporter/activity/tasklist/j;


# direct methods
.method private constructor <init>(Lcom/facebook/bugreporter/activity/tasklist/j;)V
    .locals 0

    .prologue
    .line 57
    iput-object p1, p0, Lcom/facebook/bugreporter/activity/tasklist/m;->a:Lcom/facebook/bugreporter/activity/tasklist/j;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/bugreporter/activity/tasklist/j;Lcom/facebook/bugreporter/activity/tasklist/k;)V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0, p1}, Lcom/facebook/bugreporter/activity/tasklist/m;-><init>(Lcom/facebook/bugreporter/activity/tasklist/j;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/bugreporter/activity/tasklist/b;
    .locals 2

    .prologue
    .line 61
    new-instance v1, Lcom/facebook/bugreporter/activity/tasklist/b;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/tasklist/m;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-direct {v1, v0}, Lcom/facebook/bugreporter/activity/tasklist/b;-><init>(Landroid/content/Context;)V

    return-object v1
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 57
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/tasklist/m;->a()Lcom/facebook/bugreporter/activity/tasklist/b;

    move-result-object v0

    return-object v0
.end method
