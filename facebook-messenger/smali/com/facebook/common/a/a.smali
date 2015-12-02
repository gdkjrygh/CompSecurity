.class public Lcom/facebook/common/a/a;
.super Ljava/lang/Object;
.source "AsyncTaskRunner.java"


# instance fields
.field private final a:Landroid/os/AsyncTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/AsyncTask",
            "<",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Lcom/facebook/common/a/b;

    invoke-direct {v0, p0, p1}, Lcom/facebook/common/a/b;-><init>(Lcom/facebook/common/a/a;Ljava/lang/Runnable;)V

    iput-object v0, p0, Lcom/facebook/common/a/a;->a:Landroid/os/AsyncTask;

    .line 23
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    .line 26
    iget-object v1, p0, Lcom/facebook/common/a/a;->a:Landroid/os/AsyncTask;

    const/4 v0, 0x1

    new-array v2, v0, [Ljava/lang/Void;

    const/4 v3, 0x0

    const/4 v0, 0x0

    check-cast v0, Ljava/lang/Void;

    aput-object v0, v2, v3

    invoke-virtual {v1, v2}, Landroid/os/AsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 27
    return-void
.end method
