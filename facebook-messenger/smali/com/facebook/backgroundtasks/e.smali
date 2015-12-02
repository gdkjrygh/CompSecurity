.class public Lcom/facebook/backgroundtasks/e;
.super Ljava/lang/Object;
.source "BackgroundTaskManager.java"

# interfaces
.implements Lcom/facebook/base/c;
.implements Lcom/facebook/fbservice/service/n;


# static fields
.field private static a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/common/v/f;

.field private final c:Lcom/facebook/common/v/a;

.field private final d:Landroid/support/v4/a/e;

.field private final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/backgroundtasks/c;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lcom/facebook/backgroundtasks/d;

.field private final g:Lcom/facebook/common/executors/a;

.field private final h:Z

.field private final i:Lcom/facebook/common/time/a;

.field private j:Lcom/facebook/backgroundtasks/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 26
    const-class v0, Lcom/facebook/backgroundtasks/e;

    sput-object v0, Lcom/facebook/backgroundtasks/e;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/common/v/f;Lcom/facebook/common/v/a;Landroid/support/v4/a/e;Ljava/util/Set;Lcom/facebook/backgroundtasks/d;Lcom/facebook/common/executors/a;ZLcom/facebook/common/time/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/common/v/f;",
            "Lcom/facebook/common/v/a;",
            "Landroid/support/v4/a/e;",
            "Ljava/util/Set",
            "<",
            "Lcom/facebook/backgroundtasks/c;",
            ">;",
            "Lcom/facebook/backgroundtasks/d;",
            "Lcom/facebook/common/executors/a;",
            "Z",
            "Lcom/facebook/common/time/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/facebook/backgroundtasks/e;->b:Lcom/facebook/common/v/f;

    .line 49
    iput-object p2, p0, Lcom/facebook/backgroundtasks/e;->c:Lcom/facebook/common/v/a;

    .line 50
    iput-object p3, p0, Lcom/facebook/backgroundtasks/e;->d:Landroid/support/v4/a/e;

    .line 51
    iput-object p6, p0, Lcom/facebook/backgroundtasks/e;->g:Lcom/facebook/common/executors/a;

    .line 52
    iput-object p4, p0, Lcom/facebook/backgroundtasks/e;->e:Ljava/util/Set;

    .line 53
    iput-object p5, p0, Lcom/facebook/backgroundtasks/e;->f:Lcom/facebook/backgroundtasks/d;

    .line 54
    iput-boolean p7, p0, Lcom/facebook/backgroundtasks/e;->h:Z

    .line 55
    iput-object p8, p0, Lcom/facebook/backgroundtasks/e;->i:Lcom/facebook/common/time/a;

    .line 56
    return-void
.end method


# virtual methods
.method public a()V
    .locals 9

    .prologue
    .line 60
    iget-boolean v0, p0, Lcom/facebook/backgroundtasks/e;->h:Z

    if-nez v0, :cond_0

    .line 61
    sget-object v0, Lcom/facebook/backgroundtasks/e;->a:Ljava/lang/Class;

    const-string v1, "Background tasks are not enabled. Not starting background task thread."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 87
    :goto_0
    return-void

    .line 64
    :cond_0
    iget-object v0, p0, Lcom/facebook/backgroundtasks/e;->e:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 65
    sget-object v0, Lcom/facebook/backgroundtasks/e;->a:Ljava/lang/Class;

    const-string v1, "No background tasks. Not starting background task thread."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0

    .line 69
    :cond_1
    sget-object v0, Lcom/facebook/backgroundtasks/e;->a:Ljava/lang/Class;

    const-string v1, "Starting background task thread."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 70
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "BackgroundTaskManager"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 74
    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 75
    new-instance v7, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v7, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 76
    new-instance v0, Lcom/facebook/backgroundtasks/j;

    iget-object v1, p0, Lcom/facebook/backgroundtasks/e;->b:Lcom/facebook/common/v/f;

    iget-object v2, p0, Lcom/facebook/backgroundtasks/e;->c:Lcom/facebook/common/v/a;

    iget-object v3, p0, Lcom/facebook/backgroundtasks/e;->d:Landroid/support/v4/a/e;

    iget-object v4, p0, Lcom/facebook/backgroundtasks/e;->e:Ljava/util/Set;

    iget-object v5, p0, Lcom/facebook/backgroundtasks/e;->f:Lcom/facebook/backgroundtasks/d;

    iget-object v6, p0, Lcom/facebook/backgroundtasks/e;->g:Lcom/facebook/common/executors/a;

    iget-object v8, p0, Lcom/facebook/backgroundtasks/e;->i:Lcom/facebook/common/time/a;

    invoke-direct/range {v0 .. v8}, Lcom/facebook/backgroundtasks/j;-><init>(Lcom/facebook/common/v/f;Lcom/facebook/common/v/a;Landroid/support/v4/a/e;Ljava/util/Set;Lcom/facebook/backgroundtasks/d;Lcom/facebook/common/executors/a;Landroid/os/Handler;Lcom/facebook/common/time/a;)V

    iput-object v0, p0, Lcom/facebook/backgroundtasks/e;->j:Lcom/facebook/backgroundtasks/j;

    .line 86
    iget-object v0, p0, Lcom/facebook/backgroundtasks/e;->j:Lcom/facebook/backgroundtasks/j;

    invoke-virtual {v0}, Lcom/facebook/backgroundtasks/j;->a()V

    goto :goto_0
.end method

.method public a(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 98
    iget-object v0, p0, Lcom/facebook/backgroundtasks/e;->j:Lcom/facebook/backgroundtasks/j;

    if-eqz v0, :cond_0

    .line 99
    iget-object v0, p0, Lcom/facebook/backgroundtasks/e;->j:Lcom/facebook/backgroundtasks/j;

    invoke-virtual {v0, p1}, Lcom/facebook/backgroundtasks/j;->b(Ljava/lang/Class;)V

    .line 101
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/Class;Lcom/facebook/fbservice/service/ac;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Ljava/lang/annotation/Annotation;",
            ">;",
            "Lcom/facebook/fbservice/service/ac;",
            ")V"
        }
    .end annotation

    .prologue
    .line 91
    iget-object v0, p0, Lcom/facebook/backgroundtasks/e;->j:Lcom/facebook/backgroundtasks/j;

    if-eqz v0, :cond_0

    .line 92
    iget-object v0, p0, Lcom/facebook/backgroundtasks/e;->j:Lcom/facebook/backgroundtasks/j;

    invoke-virtual {v0, p1}, Lcom/facebook/backgroundtasks/j;->a(Ljava/lang/Class;)V

    .line 94
    :cond_0
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Lcom/facebook/backgroundtasks/e;->j:Lcom/facebook/backgroundtasks/j;

    if-eqz v0, :cond_0

    .line 105
    iget-object v0, p0, Lcom/facebook/backgroundtasks/e;->j:Lcom/facebook/backgroundtasks/j;

    invoke-virtual {v0}, Lcom/facebook/backgroundtasks/j;->b()V

    .line 107
    :cond_0
    return-void
.end method
