.class Lcom/facebook/common/a/b;
.super Landroid/os/AsyncTask;
.source "AsyncTaskRunner.java"


# annotations
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


# instance fields
.field final synthetic a:Ljava/lang/Runnable;

.field final synthetic b:Lcom/facebook/common/a/a;


# direct methods
.method constructor <init>(Lcom/facebook/common/a/a;Ljava/lang/Runnable;)V
    .locals 0

    .prologue
    .line 15
    iput-object p1, p0, Lcom/facebook/common/a/b;->b:Lcom/facebook/common/a/a;

    iput-object p2, p0, Lcom/facebook/common/a/b;->a:Ljava/lang/Runnable;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 1

    .prologue
    .line 19
    iget-object v0, p0, Lcom/facebook/common/a/b;->a:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 20
    const/4 v0, 0x0

    return-object v0
.end method

.method protected synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 15
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/facebook/common/a/b;->a([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
