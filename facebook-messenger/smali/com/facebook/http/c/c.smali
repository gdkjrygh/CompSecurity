.class Lcom/facebook/http/c/c;
.super Ljava/lang/Object;
.source "DefaultNetworkConfig.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/http/c/a;


# direct methods
.method constructor <init>(Lcom/facebook/http/c/a;)V
    .locals 0

    .prologue
    .line 52
    iput-object p1, p0, Lcom/facebook/http/c/c;->a:Lcom/facebook/http/c/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/facebook/http/c/c;->a:Lcom/facebook/http/c/a;

    invoke-static {v0}, Lcom/facebook/http/c/a;->a(Lcom/facebook/http/c/a;)V

    .line 56
    return-void
.end method
