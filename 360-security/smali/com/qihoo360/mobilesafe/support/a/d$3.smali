.class Lcom/qihoo360/mobilesafe/support/a/d$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/support/a/d;->b(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/support/a/d;

.field private final synthetic b:Lcom/qihoo360/mobilesafe/support/a/c$a;


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/support/a/d;Lcom/qihoo360/mobilesafe/support/a/c$a;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/support/a/d$3;->a:Lcom/qihoo360/mobilesafe/support/a/d;

    iput-object p2, p0, Lcom/qihoo360/mobilesafe/support/a/d$3;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    .line 385
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 389
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/d$3;->a:Lcom/qihoo360/mobilesafe/support/a/d;

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/d$3;->b:Lcom/qihoo360/mobilesafe/support/a/c$a;

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/support/a/d;->a(Lcom/qihoo360/mobilesafe/support/a/d;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 395
    :cond_0
    :goto_0
    return-void

    .line 390
    :catch_0
    move-exception v0

    .line 391
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/d$3;->a:Lcom/qihoo360/mobilesafe/support/a/d;

    iget-boolean v1, v1, Lcom/qihoo360/mobilesafe/support/a/d;->e:Z

    if-eqz v1, :cond_0

    .line 392
    const-string/jumbo v1, "RootClient"

    const-string/jumbo v2, ""

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method
