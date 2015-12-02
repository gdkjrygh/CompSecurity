.class Lcom/facebook/bugreporter/ac;
.super Ljava/lang/Object;
.source "RageShakeDetector.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/bugreporter/ab;


# direct methods
.method constructor <init>(Lcom/facebook/bugreporter/ab;)V
    .locals 0

    .prologue
    .line 91
    iput-object p1, p0, Lcom/facebook/bugreporter/ac;->a:Lcom/facebook/bugreporter/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 94
    iget-object v0, p0, Lcom/facebook/bugreporter/ac;->a:Lcom/facebook/bugreporter/ab;

    invoke-static {v0}, Lcom/facebook/bugreporter/ab;->a(Lcom/facebook/bugreporter/ab;)Lcom/facebook/bugreporter/ae;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/bugreporter/ae;->a()V

    .line 95
    iget-object v0, p0, Lcom/facebook/bugreporter/ac;->a:Lcom/facebook/bugreporter/ab;

    invoke-static {v0}, Lcom/facebook/bugreporter/ab;->c(Lcom/facebook/bugreporter/ab;)Lcom/facebook/bugreporter/g;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/bugreporter/ac;->a:Lcom/facebook/bugreporter/ab;

    invoke-static {v1}, Lcom/facebook/bugreporter/ab;->b(Lcom/facebook/bugreporter/ab;)Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/bugreporter/g;->a(Landroid/content/Context;)V

    .line 96
    return-void
.end method
