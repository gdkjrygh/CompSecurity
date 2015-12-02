.class Lcom/qihoo360/mobilesafe/core/c$1$4;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/core/c$1;->a(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/core/c$1;

.field private final synthetic b:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/core/c$1;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/core/c$1$4;->a:Lcom/qihoo360/mobilesafe/core/c$1;

    iput-object p2, p0, Lcom/qihoo360/mobilesafe/core/c$1$4;->b:Ljava/util/List;

    .line 185
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 188
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1$4;->a:Lcom/qihoo360/mobilesafe/core/c$1;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c$1;->a(Lcom/qihoo360/mobilesafe/core/c$1;)Lcom/qihoo360/mobilesafe/core/c;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c;->e(Lcom/qihoo360/mobilesafe/core/c;)Lcom/qihoo360/mobilesafe/core/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 189
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1$4;->a:Lcom/qihoo360/mobilesafe/core/c$1;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c$1;->a(Lcom/qihoo360/mobilesafe/core/c$1;)Lcom/qihoo360/mobilesafe/core/c;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c$1$4;->b:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/core/c;->b(Lcom/qihoo360/mobilesafe/core/c;Ljava/util/List;)V

    .line 191
    :cond_0
    return-void
.end method
