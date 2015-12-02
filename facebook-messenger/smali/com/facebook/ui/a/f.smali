.class Lcom/facebook/ui/a/f;
.super Lcom/a/a/c;
.source "AnimatorEndFuture.java"


# instance fields
.field final synthetic a:Lcom/facebook/ui/a/e;


# direct methods
.method constructor <init>(Lcom/facebook/ui/a/e;)V
    .locals 0

    .prologue
    .line 15
    iput-object p1, p0, Lcom/facebook/ui/a/f;->a:Lcom/facebook/ui/a/e;

    invoke-direct {p0}, Lcom/a/a/c;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/a/a/a;)V
    .locals 2

    .prologue
    .line 18
    iget-object v0, p0, Lcom/facebook/ui/a/f;->a:Lcom/facebook/ui/a/e;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/ui/a/e;->a(Lcom/facebook/ui/a/e;Ljava/lang/Object;)Z

    .line 19
    return-void
.end method

.method public c(Lcom/a/a/a;)V
    .locals 2

    .prologue
    .line 23
    iget-object v0, p0, Lcom/facebook/ui/a/f;->a:Lcom/facebook/ui/a/e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/facebook/ui/a/e;->cancel(Z)Z

    .line 24
    return-void
.end method
