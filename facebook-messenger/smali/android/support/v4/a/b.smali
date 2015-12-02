.class final Landroid/support/v4/a/b;
.super Landroid/support/v4/a/i;
.source "AsyncTaskLoader.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v4/a/i",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "TD;>;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TD;"
        }
    .end annotation
.end field

.field b:Z

.field final synthetic c:Landroid/support/v4/a/a;

.field private e:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method constructor <init>(Landroid/support/v4/a/a;)V
    .locals 2

    .prologue
    .line 40
    iput-object p1, p0, Landroid/support/v4/a/b;->c:Landroid/support/v4/a/a;

    invoke-direct {p0}, Landroid/support/v4/a/i;-><init>()V

    .line 45
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Landroid/support/v4/a/b;->e:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method protected bridge synthetic a([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 40
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Landroid/support/v4/a/b;->a([Ljava/lang/Void;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Void;",
            ")TD;"
        }
    .end annotation

    .prologue
    .line 51
    iget-object v0, p0, Landroid/support/v4/a/b;->c:Landroid/support/v4/a/a;

    invoke-virtual {v0}, Landroid/support/v4/a/a;->e()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/a/b;->a:Ljava/lang/Object;

    .line 53
    iget-object v0, p0, Landroid/support/v4/a/b;->a:Ljava/lang/Object;

    return-object v0
.end method

.method protected a()V
    .locals 2

    .prologue
    .line 71
    :try_start_0
    iget-object v0, p0, Landroid/support/v4/a/b;->c:Landroid/support/v4/a/a;

    iget-object v1, p0, Landroid/support/v4/a/b;->a:Ljava/lang/Object;

    invoke-virtual {v0, p0, v1}, Landroid/support/v4/a/a;->a(Landroid/support/v4/a/b;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    iget-object v0, p0, Landroid/support/v4/a/b;->e:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 75
    return-void

    .line 73
    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroid/support/v4/a/b;->e:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    throw v0
.end method

.method protected a(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)V"
        }
    .end annotation

    .prologue
    .line 61
    :try_start_0
    iget-object v0, p0, Landroid/support/v4/a/b;->c:Landroid/support/v4/a/a;

    invoke-virtual {v0, p0, p1}, Landroid/support/v4/a/a;->b(Landroid/support/v4/a/b;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    iget-object v0, p0, Landroid/support/v4/a/b;->e:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 65
    return-void

    .line 63
    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroid/support/v4/a/b;->e:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    throw v0
.end method

.method public run()V
    .locals 1

    .prologue
    .line 79
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/a/b;->b:Z

    .line 80
    iget-object v0, p0, Landroid/support/v4/a/b;->c:Landroid/support/v4/a/a;

    invoke-virtual {v0}, Landroid/support/v4/a/a;->c()V

    .line 81
    return-void
.end method
