.class Lcom/facebook/common/i/c;
.super Ljava/lang/Object;
.source "IncrementalTaskExecutor.java"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field final synthetic a:Lcom/facebook/common/i/b;


# direct methods
.method constructor <init>(Lcom/facebook/common/i/b;)V
    .locals 0

    .prologue
    .line 46
    iput-object p1, p0, Lcom/facebook/common/i/c;->a:Lcom/facebook/common/i/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/facebook/common/i/c;->a:Lcom/facebook/common/i/b;

    invoke-static {v0}, Lcom/facebook/common/i/b;->a(Lcom/facebook/common/i/b;)V

    .line 50
    const/4 v0, 0x1

    return v0
.end method
