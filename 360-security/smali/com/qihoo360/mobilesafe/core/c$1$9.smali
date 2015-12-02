.class Lcom/qihoo360/mobilesafe/core/c$1$9;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/core/c$1;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/core/c$1;


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/core/c$1;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/core/c$1$9;->a:Lcom/qihoo360/mobilesafe/core/c$1;

    .line 288
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 291
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1$9;->a:Lcom/qihoo360/mobilesafe/core/c$1;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c$1;->a(Lcom/qihoo360/mobilesafe/core/c$1;)Lcom/qihoo360/mobilesafe/core/c;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->g(Lcom/qihoo360/mobilesafe/core/c;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/b/e;->a(Landroid/content/Context;)Lcom/qihoo360/mobilesafe/core/b/e;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c$1$9;->a:Lcom/qihoo360/mobilesafe/core/c$1;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/c$1;->a(Lcom/qihoo360/mobilesafe/core/c$1;)Lcom/qihoo360/mobilesafe/core/c;

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/c;->g(Lcom/qihoo360/mobilesafe/core/c;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/core/b/e;->c(Landroid/content/Context;)V

    .line 292
    return-void
.end method
