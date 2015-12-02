.class Lcom/facebook/common/executors/e;
.super Ljava/lang/Object;
.source "ExecutorWithProgressDialog.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/app/ProgressDialog;

.field final synthetic b:Lcom/facebook/common/executors/d;


# direct methods
.method constructor <init>(Lcom/facebook/common/executors/d;Landroid/app/ProgressDialog;)V
    .locals 0

    .prologue
    .line 57
    iput-object p1, p0, Lcom/facebook/common/executors/e;->b:Lcom/facebook/common/executors/d;

    iput-object p2, p0, Lcom/facebook/common/executors/e;->a:Landroid/app/ProgressDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 60
    iget-object v0, p0, Lcom/facebook/common/executors/e;->a:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 61
    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/common/executors/e;->a:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 66
    return-void
.end method
