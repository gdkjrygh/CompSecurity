.class Lcom/facebook/bugreporter/af;
.super Lcom/facebook/m/a;
.source "RageShakeDetector.java"


# instance fields
.field final synthetic a:Lcom/facebook/bugreporter/ae;


# direct methods
.method constructor <init>(Lcom/facebook/bugreporter/ae;)V
    .locals 0

    .prologue
    .line 145
    iput-object p1, p0, Lcom/facebook/bugreporter/af;->a:Lcom/facebook/bugreporter/ae;

    invoke-direct {p0}, Lcom/facebook/m/a;-><init>()V

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 1

    .prologue
    .line 148
    iget-object v0, p0, Lcom/facebook/bugreporter/af;->a:Lcom/facebook/bugreporter/ae;

    iget-object v0, v0, Lcom/facebook/bugreporter/ae;->a:Lcom/facebook/bugreporter/ab;

    invoke-virtual {v0}, Lcom/facebook/bugreporter/ab;->b()V

    .line 149
    return-void
.end method
