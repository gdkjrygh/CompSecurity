.class Lcom/facebook/base/a/e;
.super Ljava/lang/Object;
.source "AppInitLock.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/base/a/d;


# direct methods
.method constructor <init>(Lcom/facebook/base/a/d;)V
    .locals 0

    .prologue
    .line 84
    iput-object p1, p0, Lcom/facebook/base/a/e;->a:Lcom/facebook/base/a/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 87
    iget-object v0, p0, Lcom/facebook/base/a/e;->a:Lcom/facebook/base/a/d;

    invoke-static {v0}, Lcom/facebook/base/a/d;->a(Lcom/facebook/base/a/d;)V

    .line 88
    return-void
.end method
