.class Lcom/qihoo360/mobilesafe/core/c$1$3$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo360/mobilesafe/core/b/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/core/c$1$3;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/core/c$1$3;

.field private final synthetic b:Z


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/core/c$1$3;Z)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/core/c$1$3$1;->a:Lcom/qihoo360/mobilesafe/core/c$1$3;

    iput-boolean p2, p0, Lcom/qihoo360/mobilesafe/core/c$1$3$1;->b:Z

    .line 142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 145
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1$3$1;->a:Lcom/qihoo360/mobilesafe/core/c$1$3;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c$1$3;->a(Lcom/qihoo360/mobilesafe/core/c$1$3;)Lcom/qihoo360/mobilesafe/core/c$1;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c$1;->a(Lcom/qihoo360/mobilesafe/core/c$1;)Lcom/qihoo360/mobilesafe/core/c;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->c(Lcom/qihoo360/mobilesafe/core/c;)V

    .line 146
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
    .line 161
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1$3$1;->a:Lcom/qihoo360/mobilesafe/core/c$1$3;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c$1$3;->a(Lcom/qihoo360/mobilesafe/core/c$1$3;)Lcom/qihoo360/mobilesafe/core/c$1;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c$1;->a(Lcom/qihoo360/mobilesafe/core/c$1;)Lcom/qihoo360/mobilesafe/core/c;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/qihoo360/mobilesafe/core/c;->a(Lcom/qihoo360/mobilesafe/core/c;Ljava/util/List;)V

    .line 162
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
    .line 150
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1$3$1;->a:Lcom/qihoo360/mobilesafe/core/c$1$3;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c$1$3;->a(Lcom/qihoo360/mobilesafe/core/c$1$3;)Lcom/qihoo360/mobilesafe/core/c$1;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c$1;->a(Lcom/qihoo360/mobilesafe/core/c$1;)Lcom/qihoo360/mobilesafe/core/c;

    move-result-object v0

    iget-boolean v1, p0, Lcom/qihoo360/mobilesafe/core/c$1$3$1;->b:Z

    invoke-static {v0, v1, p1, p2}, Lcom/qihoo360/mobilesafe/core/c;->a(Lcom/qihoo360/mobilesafe/core/c;ZLjava/util/List;Ljava/util/List;)V

    .line 152
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 156
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1$3$1;->a:Lcom/qihoo360/mobilesafe/core/c$1$3;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c$1$3;->a(Lcom/qihoo360/mobilesafe/core/c$1$3;)Lcom/qihoo360/mobilesafe/core/c$1;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c$1;->a(Lcom/qihoo360/mobilesafe/core/c$1;)Lcom/qihoo360/mobilesafe/core/c;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->d(Lcom/qihoo360/mobilesafe/core/c;)V

    .line 157
    return-void
.end method
