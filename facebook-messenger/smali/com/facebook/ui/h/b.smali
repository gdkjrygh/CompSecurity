.class Lcom/facebook/ui/h/b;
.super Lcom/facebook/base/a/f;
.source "BaseSplashScreenActivity.java"


# instance fields
.field final synthetic a:Lcom/facebook/ui/h/a;


# direct methods
.method constructor <init>(Lcom/facebook/ui/h/a;)V
    .locals 0

    .prologue
    .line 84
    iput-object p1, p0, Lcom/facebook/ui/h/b;->a:Lcom/facebook/ui/h/a;

    invoke-direct {p0}, Lcom/facebook/base/a/f;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 87
    iget-object v0, p0, Lcom/facebook/ui/h/b;->a:Lcom/facebook/ui/h/a;

    invoke-static {v0}, Lcom/facebook/ui/h/a;->a(Lcom/facebook/ui/h/a;)V

    .line 88
    iget-object v0, p0, Lcom/facebook/ui/h/b;->a:Lcom/facebook/ui/h/a;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/facebook/ui/h/a;->setResult(I)V

    .line 89
    iget-object v0, p0, Lcom/facebook/ui/h/b;->a:Lcom/facebook/ui/h/a;

    invoke-virtual {v0}, Lcom/facebook/ui/h/a;->finish()V

    .line 90
    iget-object v0, p0, Lcom/facebook/ui/h/b;->a:Lcom/facebook/ui/h/a;

    invoke-virtual {v0, v2, v2}, Lcom/facebook/ui/h/a;->overridePendingTransition(II)V

    .line 91
    return-void
.end method
