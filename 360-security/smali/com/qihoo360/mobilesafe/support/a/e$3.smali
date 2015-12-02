.class Lcom/qihoo360/mobilesafe/support/a/e$3;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/support/a/e;->b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/qihoo360/mobilesafe/support/a/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/support/a/e;

.field private final synthetic b:Ljava/lang/String;

.field private final synthetic c:Ljava/util/List;

.field private final synthetic d:Ljava/util/List;

.field private final synthetic e:Lcom/qihoo360/mobilesafe/support/a/a;


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/support/a/e;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/qihoo360/mobilesafe/support/a/a;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/support/a/e$3;->a:Lcom/qihoo360/mobilesafe/support/a/e;

    iput-object p2, p0, Lcom/qihoo360/mobilesafe/support/a/e$3;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/qihoo360/mobilesafe/support/a/e$3;->c:Ljava/util/List;

    iput-object p4, p0, Lcom/qihoo360/mobilesafe/support/a/e$3;->d:Ljava/util/List;

    iput-object p5, p0, Lcom/qihoo360/mobilesafe/support/a/e$3;->e:Lcom/qihoo360/mobilesafe/support/a/a;

    .line 263
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 265
    .line 266
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e$3;->a:Lcom/qihoo360/mobilesafe/support/a/e;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/support/a/e;->d()Lcom/qihoo360/mobilesafe/support/a/c;

    move-result-object v0

    .line 267
    if-eqz v0, :cond_1

    .line 268
    iget-object v1, p0, Lcom/qihoo360/mobilesafe/support/a/e$3;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/qihoo360/mobilesafe/support/a/e$3;->c:Ljava/util/List;

    iget-object v3, p0, Lcom/qihoo360/mobilesafe/support/a/e$3;->d:Ljava/util/List;

    iget-object v4, p0, Lcom/qihoo360/mobilesafe/support/a/e$3;->e:Lcom/qihoo360/mobilesafe/support/a/a;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/qihoo360/mobilesafe/support/a/c;->b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/qihoo360/mobilesafe/support/a/a;)V

    .line 276
    :cond_0
    :goto_0
    return-void

    .line 270
    :cond_1
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e$3;->e:Lcom/qihoo360/mobilesafe/support/a/a;

    if-eqz v0, :cond_0

    .line 272
    :try_start_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/e$3;->e:Lcom/qihoo360/mobilesafe/support/a/a;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/support/a/a;->a(IZ[B)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 273
    :catch_0
    move-exception v0

    goto :goto_0
.end method
