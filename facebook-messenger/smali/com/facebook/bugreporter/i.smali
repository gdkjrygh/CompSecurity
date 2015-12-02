.class Lcom/facebook/bugreporter/i;
.super Ljava/lang/Object;
.source "BugReporter.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Lcom/facebook/bugreporter/BugReport;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/facebook/bugreporter/g;


# direct methods
.method constructor <init>(Lcom/facebook/bugreporter/g;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 175
    iput-object p1, p0, Lcom/facebook/bugreporter/i;->b:Lcom/facebook/bugreporter/g;

    iput-object p2, p0, Lcom/facebook/bugreporter/i;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/bugreporter/BugReport;)V
    .locals 2

    .prologue
    .line 178
    iget-object v0, p0, Lcom/facebook/bugreporter/i;->b:Lcom/facebook/bugreporter/g;

    iget-object v1, p0, Lcom/facebook/bugreporter/i;->a:Landroid/content/Context;

    invoke-static {v0, v1, p1}, Lcom/facebook/bugreporter/g;->a(Lcom/facebook/bugreporter/g;Landroid/content/Context;Lcom/facebook/bugreporter/BugReport;)V

    .line 179
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 175
    check-cast p1, Lcom/facebook/bugreporter/BugReport;

    invoke-virtual {p0, p1}, Lcom/facebook/bugreporter/i;->a(Lcom/facebook/bugreporter/BugReport;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 183
    iget-object v0, p0, Lcom/facebook/bugreporter/i;->b:Lcom/facebook/bugreporter/g;

    invoke-static {v0, p1}, Lcom/facebook/bugreporter/g;->a(Lcom/facebook/bugreporter/g;Ljava/lang/Throwable;)V

    .line 184
    return-void
.end method
