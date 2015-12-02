.class Lcom/qihoo360/mobilesafe/core/c$1$1$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo360/mobilesafe/core/b/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/core/c$1$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/core/c$1$1;

.field private final synthetic b:Z


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/core/c$1$1;Z)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/core/c$1$1$1;->a:Lcom/qihoo360/mobilesafe/core/c$1$1;

    iput-boolean p2, p0, Lcom/qihoo360/mobilesafe/core/c$1$1$1;->b:Z

    .line 102
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 105
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1$1$1;->a:Lcom/qihoo360/mobilesafe/core/c$1$1;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c$1$1;->a(Lcom/qihoo360/mobilesafe/core/c$1$1;)Lcom/qihoo360/mobilesafe/core/c$1;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c$1;->a(Lcom/qihoo360/mobilesafe/core/c$1;)Lcom/qihoo360/mobilesafe/core/c;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->c(Lcom/qihoo360/mobilesafe/core/c;)V

    .line 106
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 1
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
    .line 121
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1$1$1;->a:Lcom/qihoo360/mobilesafe/core/c$1$1;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c$1$1;->a(Lcom/qihoo360/mobilesafe/core/c$1$1;)Lcom/qihoo360/mobilesafe/core/c$1;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c$1;->a(Lcom/qihoo360/mobilesafe/core/c$1;)Lcom/qihoo360/mobilesafe/core/c;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/qihoo360/mobilesafe/core/c;->a(Lcom/qihoo360/mobilesafe/core/c;Ljava/util/List;)V

    .line 122
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
    .line 110
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1$1$1;->a:Lcom/qihoo360/mobilesafe/core/c$1$1;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c$1$1;->a(Lcom/qihoo360/mobilesafe/core/c$1$1;)Lcom/qihoo360/mobilesafe/core/c$1;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c$1;->a(Lcom/qihoo360/mobilesafe/core/c$1;)Lcom/qihoo360/mobilesafe/core/c;

    move-result-object v0

    iget-boolean v1, p0, Lcom/qihoo360/mobilesafe/core/c$1$1$1;->b:Z

    invoke-static {v0, v1, p1, p2}, Lcom/qihoo360/mobilesafe/core/c;->a(Lcom/qihoo360/mobilesafe/core/c;ZLjava/util/List;Ljava/util/List;)V

    .line 112
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1$1$1;->a:Lcom/qihoo360/mobilesafe/core/c$1$1;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c$1$1;->a(Lcom/qihoo360/mobilesafe/core/c$1$1;)Lcom/qihoo360/mobilesafe/core/c$1;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c$1;->a(Lcom/qihoo360/mobilesafe/core/c$1;)Lcom/qihoo360/mobilesafe/core/c;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->d(Lcom/qihoo360/mobilesafe/core/c;)V

    .line 117
    return-void
.end method
