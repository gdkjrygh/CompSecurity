.class Lcom/facebook/backgroundtasks/i;
.super Lcom/facebook/inject/d;
.source "BackgroundTaskModule.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/inject/d",
        "<",
        "Lcom/facebook/backgroundtasks/e;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/backgroundtasks/f;


# direct methods
.method private constructor <init>(Lcom/facebook/backgroundtasks/f;)V
    .locals 0

    .prologue
    .line 41
    iput-object p1, p0, Lcom/facebook/backgroundtasks/i;->a:Lcom/facebook/backgroundtasks/f;

    invoke-direct {p0}, Lcom/facebook/inject/d;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/backgroundtasks/f;Lcom/facebook/backgroundtasks/g;)V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0, p1}, Lcom/facebook/backgroundtasks/i;-><init>(Lcom/facebook/backgroundtasks/f;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/backgroundtasks/e;
    .locals 9

    .prologue
    .line 45
    new-instance v0, Lcom/facebook/backgroundtasks/e;

    const-class v1, Lcom/facebook/common/v/f;

    invoke-virtual {p0, v1}, Lcom/facebook/backgroundtasks/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/common/v/f;

    const-class v2, Lcom/facebook/common/v/a;

    invoke-virtual {p0, v2}, Lcom/facebook/backgroundtasks/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/common/v/a;

    const-class v3, Landroid/support/v4/a/e;

    invoke-virtual {p0, v3}, Lcom/facebook/backgroundtasks/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/support/v4/a/e;

    const-class v4, Lcom/facebook/backgroundtasks/c;

    invoke-virtual {p0, v4}, Lcom/facebook/backgroundtasks/i;->c(Ljava/lang/Class;)Ljava/util/Set;

    move-result-object v4

    const-class v5, Lcom/facebook/backgroundtasks/d;

    invoke-virtual {p0, v5}, Lcom/facebook/backgroundtasks/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/facebook/backgroundtasks/d;

    const-class v6, Lcom/facebook/common/executors/a;

    invoke-virtual {p0, v6}, Lcom/facebook/backgroundtasks/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/facebook/common/executors/a;

    const-class v7, Ljava/lang/Boolean;

    const-class v8, Lcom/facebook/backgroundtasks/AreBackgroundTasksEnabled;

    invoke-virtual {p0, v7, v8}, Lcom/facebook/backgroundtasks/i;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    const-class v8, Lcom/facebook/common/time/a;

    invoke-virtual {p0, v8}, Lcom/facebook/backgroundtasks/i;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/facebook/common/time/a;

    invoke-direct/range {v0 .. v8}, Lcom/facebook/backgroundtasks/e;-><init>(Lcom/facebook/common/v/f;Lcom/facebook/common/v/a;Landroid/support/v4/a/e;Ljava/util/Set;Lcom/facebook/backgroundtasks/d;Lcom/facebook/common/executors/a;ZLcom/facebook/common/time/a;)V

    return-object v0
.end method

.method public synthetic b()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 41
    invoke-virtual {p0}, Lcom/facebook/backgroundtasks/i;->a()Lcom/facebook/backgroundtasks/e;

    move-result-object v0

    return-object v0
.end method
