.class Lcom/qihoo360/mobilesafe/core/c$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo360/mobilesafe/core/a/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/core/c;->b(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/core/c;


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/core/c;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/core/c$2;->a:Lcom/qihoo360/mobilesafe/core/c;

    .line 445
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 1

    .prologue
    .line 458
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$2;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0, p1, p2}, Lcom/qihoo360/mobilesafe/core/c;->b(Lcom/qihoo360/mobilesafe/core/c;II)V

    .line 459
    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 1
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
    .line 448
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$2;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0, p1}, Lcom/qihoo360/mobilesafe/core/c;->d(Lcom/qihoo360/mobilesafe/core/c;Ljava/util/List;)V

    .line 449
    return-void
.end method

.method public c()V
    .locals 1

    .prologue
    .line 453
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$2;->a:Lcom/qihoo360/mobilesafe/core/c;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->m(Lcom/qihoo360/mobilesafe/core/c;)V

    .line 454
    return-void
.end method
