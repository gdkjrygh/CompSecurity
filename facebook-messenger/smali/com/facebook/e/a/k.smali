.class Lcom/facebook/e/a/k;
.super Ljava/lang/Object;
.source "ResourceMonitor.java"

# interfaces
.implements Lcom/facebook/common/hardware/t;


# instance fields
.field final synthetic a:Lcom/facebook/e/a/h;


# direct methods
.method constructor <init>(Lcom/facebook/e/a/h;)V
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lcom/facebook/e/a/k;->a:Lcom/facebook/e/a/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 86
    iget-object v0, p0, Lcom/facebook/e/a/k;->a:Lcom/facebook/e/a/h;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/facebook/e/a/h;->a(Lcom/facebook/e/a/h;Z)Z

    .line 87
    iget-object v0, p0, Lcom/facebook/e/a/k;->a:Lcom/facebook/e/a/h;

    invoke-static {v0}, Lcom/facebook/e/a/h;->b(Lcom/facebook/e/a/h;)V

    .line 88
    return-void
.end method

.method public b()V
    .locals 2

    .prologue
    .line 92
    iget-object v0, p0, Lcom/facebook/e/a/k;->a:Lcom/facebook/e/a/h;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/e/a/h;->a(Lcom/facebook/e/a/h;Z)Z

    .line 93
    iget-object v0, p0, Lcom/facebook/e/a/k;->a:Lcom/facebook/e/a/h;

    invoke-static {v0}, Lcom/facebook/e/a/h;->c(Lcom/facebook/e/a/h;)V

    .line 94
    return-void
.end method
