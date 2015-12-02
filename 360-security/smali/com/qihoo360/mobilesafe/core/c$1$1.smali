.class Lcom/qihoo360/mobilesafe/core/c$1$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/core/c$1;->a(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/core/c$1;

.field private final synthetic b:Z


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/core/c$1;Z)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/core/c$1$1;->a:Lcom/qihoo360/mobilesafe/core/c$1;

    iput-boolean p2, p0, Lcom/qihoo360/mobilesafe/core/c$1$1;->b:Z

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/qihoo360/mobilesafe/core/c$1$1;)Lcom/qihoo360/mobilesafe/core/c$1;
    .locals 1

    .prologue
    .line 99
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1$1;->a:Lcom/qihoo360/mobilesafe/core/c$1;

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 102
    new-instance v0, Lcom/qihoo360/mobilesafe/core/c$1$1$1;

    iget-boolean v1, p0, Lcom/qihoo360/mobilesafe/core/c$1$1;->b:Z

    invoke-direct {v0, p0, v1}, Lcom/qihoo360/mobilesafe/core/c$1$1$1;-><init>(Lcom/qihoo360/mobilesafe/core/c$1$1;Z)V

    .line 127
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c$1$1;->a:Lcom/qihoo360/mobilesafe/core/c$1;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/c$1;->a(Lcom/qihoo360/mobilesafe/core/c$1;)Lcom/qihoo360/mobilesafe/core/c;

    move-result-object v1

    const/4 v2, 0x1

    iget-boolean v3, p0, Lcom/qihoo360/mobilesafe/core/c$1$1;->b:Z

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4, v0}, Lcom/qihoo360/mobilesafe/core/c;->a(Lcom/qihoo360/mobilesafe/core/c;ZZZLcom/qihoo360/mobilesafe/core/b/d;)V

    .line 129
    return-void
.end method
