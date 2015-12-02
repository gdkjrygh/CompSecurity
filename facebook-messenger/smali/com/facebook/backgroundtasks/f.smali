.class public Lcom/facebook/backgroundtasks/f;
.super Lcom/facebook/inject/b;
.source "BackgroundTaskModule.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Lcom/facebook/inject/b;-><init>()V

    .line 58
    return-void
.end method


# virtual methods
.method protected a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 24
    const-class v0, Lcom/facebook/backgroundtasks/e;

    invoke-virtual {p0, v0}, Lcom/facebook/backgroundtasks/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/backgroundtasks/i;

    invoke-direct {v1, p0, v2}, Lcom/facebook/backgroundtasks/i;-><init>(Lcom/facebook/backgroundtasks/f;Lcom/facebook/backgroundtasks/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 27
    const-class v0, Lcom/facebook/backgroundtasks/d;

    invoke-virtual {p0, v0}, Lcom/facebook/backgroundtasks/f;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    new-instance v1, Lcom/facebook/backgroundtasks/h;

    invoke-direct {v1, p0, v2}, Lcom/facebook/backgroundtasks/h;-><init>(Lcom/facebook/backgroundtasks/f;Lcom/facebook/backgroundtasks/g;)V

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljavax/inject/a;)Lcom/facebook/inject/a/g;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/inject/a/g;->a()V

    .line 30
    const-class v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lcom/facebook/backgroundtasks/f;->b(Ljava/lang/Class;)Lcom/facebook/inject/a/a;

    move-result-object v0

    const-class v1, Lcom/facebook/backgroundtasks/AreBackgroundTasksEnabled;

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/a;->a(Ljava/lang/Class;)Lcom/facebook/inject/a/c;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/facebook/inject/a/c;->a(Ljava/lang/Object;)V

    .line 34
    const-class v0, Lcom/facebook/backgroundtasks/c;

    invoke-virtual {p0, v0}, Lcom/facebook/backgroundtasks/f;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 35
    const-class v0, Lcom/facebook/base/c;

    const-class v1, Lcom/facebook/common/init/NeedsLowPriorityInitOnUiThread;

    invoke-virtual {p0, v0, v1}, Lcom/facebook/backgroundtasks/f;->a(Ljava/lang/Class;Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/backgroundtasks/e;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 37
    const-class v0, Lcom/facebook/fbservice/service/n;

    invoke-virtual {p0, v0}, Lcom/facebook/backgroundtasks/f;->c(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    move-result-object v0

    const-class v1, Lcom/facebook/backgroundtasks/e;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/aj;->a(Ljava/lang/Class;)Lcom/facebook/inject/aj;

    .line 39
    return-void
.end method
