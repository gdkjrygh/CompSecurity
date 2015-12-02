.class Lcom/facebook/ui/images/b/x;
.super Ljava/lang/Object;
.source "ImageFetchOperation.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/ui/images/b/w;


# direct methods
.method constructor <init>(Lcom/facebook/ui/images/b/w;)V
    .locals 0

    .prologue
    .line 143
    iput-object p1, p0, Lcom/facebook/ui/images/b/x;->a:Lcom/facebook/ui/images/b/w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 145
    iget-object v0, p0, Lcom/facebook/ui/images/b/x;->a:Lcom/facebook/ui/images/b/w;

    invoke-static {v0}, Lcom/facebook/ui/images/b/w;->a(Lcom/facebook/ui/images/b/w;)V

    .line 146
    iget-object v0, p0, Lcom/facebook/ui/images/b/x;->a:Lcom/facebook/ui/images/b/w;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/facebook/ui/images/b/w;->a(Lcom/facebook/ui/images/b/w;Ljava/lang/Runnable;)Ljava/lang/Runnable;

    .line 147
    return-void
.end method
