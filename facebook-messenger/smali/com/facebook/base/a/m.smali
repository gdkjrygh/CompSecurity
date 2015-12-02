.class Lcom/facebook/base/a/m;
.super Ljava/lang/Object;
.source "FbAppInitializer.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/base/a/l;


# direct methods
.method constructor <init>(Lcom/facebook/base/a/l;)V
    .locals 0

    .prologue
    .line 94
    iput-object p1, p0, Lcom/facebook/base/a/m;->a:Lcom/facebook/base/a/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/facebook/base/a/m;->a:Lcom/facebook/base/a/l;

    iget-object v0, v0, Lcom/facebook/base/a/l;->b:Lcom/facebook/base/a/k;

    invoke-static {v0}, Lcom/facebook/base/a/k;->b(Lcom/facebook/base/a/k;)V

    .line 98
    return-void
.end method
