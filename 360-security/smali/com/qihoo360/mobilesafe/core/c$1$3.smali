.class Lcom/qihoo360/mobilesafe/core/c$1$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/core/c$1;->b(Z)V
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
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/core/c$1$3;->a:Lcom/qihoo360/mobilesafe/core/c$1;

    iput-boolean p2, p0, Lcom/qihoo360/mobilesafe/core/c$1$3;->b:Z

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/qihoo360/mobilesafe/core/c$1$3;)Lcom/qihoo360/mobilesafe/core/c$1;
    .locals 1

    .prologue
    .line 139
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/core/c$1$3;->a:Lcom/qihoo360/mobilesafe/core/c$1;

    return-object v0
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 142
    new-instance v0, Lcom/qihoo360/mobilesafe/core/c$1$3$1;

    iget-boolean v1, p0, Lcom/qihoo360/mobilesafe/core/c$1$3;->b:Z

    invoke-direct {v0, p0, v1}, Lcom/qihoo360/mobilesafe/core/c$1$3$1;-><init>(Lcom/qihoo360/mobilesafe/core/c$1$3;Z)V

    .line 167
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/core/c$1$3;->a:Lcom/qihoo360/mobilesafe/core/c$1;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/core/c$1;->a(Lcom/qihoo360/mobilesafe/core/c$1;)Lcom/qihoo360/mobilesafe/core/c;

    move-result-object v1

    .line 168
    iget-boolean v2, p0, Lcom/qihoo360/mobilesafe/core/c$1$3;->b:Z

    invoke-static {v1, v3, v2, v3, v0}, Lcom/qihoo360/mobilesafe/core/c;->a(Lcom/qihoo360/mobilesafe/core/c;ZZZLcom/qihoo360/mobilesafe/core/b/d;)V

    .line 169
    return-void
.end method
