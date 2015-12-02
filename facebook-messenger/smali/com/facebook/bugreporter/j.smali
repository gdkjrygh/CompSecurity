.class Lcom/facebook/bugreporter/j;
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
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/app/ProgressDialog;

.field final synthetic b:Lcom/facebook/bugreporter/g;


# direct methods
.method constructor <init>(Lcom/facebook/bugreporter/g;Landroid/app/ProgressDialog;)V
    .locals 0

    .prologue
    .line 337
    iput-object p1, p0, Lcom/facebook/bugreporter/j;->b:Lcom/facebook/bugreporter/g;

    iput-object p2, p0, Lcom/facebook/bugreporter/j;->a:Landroid/app/ProgressDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 340
    iget-object v0, p0, Lcom/facebook/bugreporter/j;->a:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 341
    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 345
    iget-object v0, p0, Lcom/facebook/bugreporter/j;->a:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 346
    return-void
.end method
