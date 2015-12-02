.class Lcom/facebook/ui/images/b/d;
.super Ljava/lang/Object;
.source "FetchImageCoordinator.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/ui/images/b/c;


# direct methods
.method constructor <init>(Lcom/facebook/ui/images/b/c;)V
    .locals 0

    .prologue
    .line 39
    iput-object p1, p0, Lcom/facebook/ui/images/b/d;->a:Lcom/facebook/ui/images/b/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/facebook/ui/images/b/d;->a:Lcom/facebook/ui/images/b/c;

    invoke-static {v0}, Lcom/facebook/ui/images/b/c;->a(Lcom/facebook/ui/images/b/c;)V

    .line 43
    return-void
.end method
