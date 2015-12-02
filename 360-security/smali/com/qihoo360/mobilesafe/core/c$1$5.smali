.class Lcom/qihoo360/mobilesafe/core/c$1$5;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/core/c$1;->a(Lcom/qihoo360/mobilesafe/core/c/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/core/c$1;

.field private final synthetic b:Lcom/qihoo360/mobilesafe/core/c/a;


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/core/c$1;Lcom/qihoo360/mobilesafe/core/c/a;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/core/c$1$5;->a:Lcom/qihoo360/mobilesafe/core/c$1;

    iput-object p2, p0, Lcom/qihoo360/mobilesafe/core/c$1$5;->b:Lcom/qihoo360/mobilesafe/core/c/a;

    .line 202
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 205
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1$5;->a:Lcom/qihoo360/mobilesafe/core/c$1;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c$1;->a(Lcom/qihoo360/mobilesafe/core/c$1;)Lcom/qihoo360/mobilesafe/core/c;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->f(Lcom/qihoo360/mobilesafe/core/c;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 206
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1$5;->a:Lcom/qihoo360/mobilesafe/core/c$1;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c$1;->a(Lcom/qihoo360/mobilesafe/core/c$1;)Lcom/qihoo360/mobilesafe/core/c;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->f(Lcom/qihoo360/mobilesafe/core/c;)Landroid/os/RemoteCallbackList;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c$1$5;->b:Lcom/qihoo360/mobilesafe/core/c/a;

    invoke-virtual {v0, v1}, Landroid/os/RemoteCallbackList;->register(Landroid/os/IInterface;)Z

    .line 211
    :cond_0
    return-void
.end method
