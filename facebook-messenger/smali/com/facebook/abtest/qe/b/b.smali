.class Lcom/facebook/abtest/qe/b/b;
.super Ljava/lang/Object;
.source "QuickExperimentMemoryCache.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/facebook/abtest/qe/b/a;


# direct methods
.method constructor <init>(Lcom/facebook/abtest/qe/b/a;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 213
    iput-object p1, p0, Lcom/facebook/abtest/qe/b/b;->b:Lcom/facebook/abtest/qe/b/a;

    iput-object p2, p0, Lcom/facebook/abtest/qe/b/b;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 216
    iget-object v0, p0, Lcom/facebook/abtest/qe/b/b;->b:Lcom/facebook/abtest/qe/b/a;

    invoke-static {v0}, Lcom/facebook/abtest/qe/b/a;->a(Lcom/facebook/abtest/qe/b/a;)Lcom/facebook/abtest/qe/c/e;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/abtest/qe/b/b;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/abtest/qe/c/e;->a(Ljava/lang/String;)V

    .line 217
    return-void
.end method
