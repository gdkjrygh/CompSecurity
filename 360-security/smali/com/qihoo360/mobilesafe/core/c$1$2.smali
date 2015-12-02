.class Lcom/qihoo360/mobilesafe/core/c$1$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/core/c$1;->b(Ljava/util/List;)V
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
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/core/c$1$2;->a:Lcom/qihoo360/mobilesafe/core/c$1;

    iput-object p2, p0, Lcom/qihoo360/mobilesafe/core/c$1$2;->b:Ljava/util/List;

    .line 319
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 322
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1$2;->a:Lcom/qihoo360/mobilesafe/core/c$1;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/c$1;->a(Lcom/qihoo360/mobilesafe/core/c$1;)Lcom/qihoo360/mobilesafe/core/c;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c$1$2;->b:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/core/c;->c(Lcom/qihoo360/mobilesafe/core/c;Ljava/util/List;)V

    .line 323
    return-void
.end method
