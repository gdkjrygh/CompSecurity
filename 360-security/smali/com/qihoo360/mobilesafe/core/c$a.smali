.class Lcom/qihoo360/mobilesafe/core/c$a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo360/mobilesafe/core/a/a;
.implements Lcom/qihoo360/mobilesafe/core/b/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/core/c;->a(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/core/c;

.field private final synthetic b:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/core/c;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 398
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/core/c$a;->a:Lcom/qihoo360/mobilesafe/core/c;

    iput-object p2, p0, Lcom/qihoo360/mobilesafe/core/c$a;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 402
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$a;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->l(Lcom/qihoo360/mobilesafe/core/c;)V

    .line 403
    return-void
.end method

.method public a(II)V
    .locals 1

    .prologue
    .line 428
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$a;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0, p1, p2}, Lcom/qihoo360/mobilesafe/core/c;->a(Lcom/qihoo360/mobilesafe/core/c;II)V

    .line 429
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 434
    return-void
.end method

.method public a(Ljava/util/List;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 412
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$a;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->e(Lcom/qihoo360/mobilesafe/core/c;)Lcom/qihoo360/mobilesafe/core/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 413
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$a;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->e(Lcom/qihoo360/mobilesafe/core/c;)Lcom/qihoo360/mobilesafe/core/a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c$a;->b:Ljava/util/List;

    invoke-virtual {v0, p1, v1, p0}, Lcom/qihoo360/mobilesafe/core/a;->a(Ljava/util/List;Ljava/util/List;Lcom/qihoo360/mobilesafe/core/a/a;)V

    .line 415
    :cond_0
    return-void
.end method

.method public b()V
    .locals 0

    .prologue
    .line 407
    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/KillBean;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 419
    return-void
.end method

.method public c()V
    .locals 0

    .prologue
    .line 423
    return-void
.end method
