.class Lcom/facebook/bugreporter/ad;
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
    .line 99
    iput-object p1, p0, Lcom/facebook/bugreporter/ad;->a:Lcom/facebook/bugreporter/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .prologue
    .line 102
    iget-object v0, p0, Lcom/facebook/bugreporter/ad;->a:Lcom/facebook/bugreporter/ab;

    invoke-static {v0}, Lcom/facebook/bugreporter/ab;->a(Lcom/facebook/bugreporter/ab;)Lcom/facebook/bugreporter/ae;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/bugreporter/ae;->a()V

    .line 103
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 104
    return-void
.end method
