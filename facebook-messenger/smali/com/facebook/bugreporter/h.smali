.class Lcom/facebook/bugreporter/h;
.super Ljava/lang/Object;
.source "BugReporter.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Lcom/facebook/bugreporter/BugReport;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/graphics/Bitmap;

.field final synthetic b:Lcom/google/common/a/ev;

.field final synthetic c:Lcom/google/common/a/ev;

.field final synthetic d:Lcom/facebook/bugreporter/g;


# direct methods
.method constructor <init>(Lcom/facebook/bugreporter/g;Landroid/graphics/Bitmap;Lcom/google/common/a/ev;Lcom/google/common/a/ev;)V
    .locals 0

    .prologue
    .line 166
    iput-object p1, p0, Lcom/facebook/bugreporter/h;->d:Lcom/facebook/bugreporter/g;

    iput-object p2, p0, Lcom/facebook/bugreporter/h;->a:Landroid/graphics/Bitmap;

    iput-object p3, p0, Lcom/facebook/bugreporter/h;->b:Lcom/google/common/a/ev;

    iput-object p4, p0, Lcom/facebook/bugreporter/h;->c:Lcom/google/common/a/ev;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/facebook/bugreporter/BugReport;
    .locals 4

    .prologue
    .line 169
    iget-object v0, p0, Lcom/facebook/bugreporter/h;->d:Lcom/facebook/bugreporter/g;

    iget-object v1, p0, Lcom/facebook/bugreporter/h;->a:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/facebook/bugreporter/h;->b:Lcom/google/common/a/ev;

    iget-object v3, p0, Lcom/facebook/bugreporter/h;->c:Lcom/google/common/a/ev;

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/bugreporter/g;->a(Lcom/facebook/bugreporter/g;Landroid/graphics/Bitmap;Lcom/google/common/a/ev;Lcom/google/common/a/ev;)Lcom/facebook/bugreporter/BugReport;

    move-result-object v0

    return-object v0
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 166
    invoke-virtual {p0}, Lcom/facebook/bugreporter/h;->a()Lcom/facebook/bugreporter/BugReport;

    move-result-object v0

    return-object v0
.end method
