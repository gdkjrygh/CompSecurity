.class Lcom/facebook/i/a/l;
.super Ljava/lang/Object;
.source "PeerProcessManagerImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/i/a/k;


# direct methods
.method constructor <init>(Lcom/facebook/i/a/k;)V
    .locals 0

    .prologue
    .line 414
    iput-object p1, p0, Lcom/facebook/i/a/l;->a:Lcom/facebook/i/a/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 417
    iget-object v0, p0, Lcom/facebook/i/a/l;->a:Lcom/facebook/i/a/k;

    iget-object v0, v0, Lcom/facebook/i/a/k;->b:Lcom/facebook/i/a/d;

    iget-object v1, p0, Lcom/facebook/i/a/l;->a:Lcom/facebook/i/a/k;

    iget-object v1, v1, Lcom/facebook/i/a/k;->a:Lcom/facebook/i/a/a;

    invoke-static {v0, v1}, Lcom/facebook/i/a/d;->a(Lcom/facebook/i/a/d;Lcom/facebook/i/a/a;)V

    .line 418
    return-void
.end method
