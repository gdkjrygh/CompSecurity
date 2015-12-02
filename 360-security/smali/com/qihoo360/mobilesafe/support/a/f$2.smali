.class Lcom/qihoo360/mobilesafe/support/a/f$2;
.super Lcom/qihoo360/mobilesafe/support/a/a$a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo360/mobilesafe/support/a/f;->b(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/qihoo360/mobilesafe/support/a/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo360/mobilesafe/support/a/f;

.field private final synthetic b:Lcom/qihoo360/mobilesafe/support/a/a;


# direct methods
.method constructor <init>(Lcom/qihoo360/mobilesafe/support/a/f;Lcom/qihoo360/mobilesafe/support/a/a;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo360/mobilesafe/support/a/f$2;->a:Lcom/qihoo360/mobilesafe/support/a/f;

    iput-object p2, p0, Lcom/qihoo360/mobilesafe/support/a/f$2;->b:Lcom/qihoo360/mobilesafe/support/a/a;

    .line 129
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/support/a/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IZ[B)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 131
    if-nez p3, :cond_0

    .line 132
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/f$2;->a:Lcom/qihoo360/mobilesafe/support/a/f;

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/support/a/f;->e()V

    .line 134
    :cond_0
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/f$2;->b:Lcom/qihoo360/mobilesafe/support/a/a;

    if-eqz v0, :cond_1

    .line 135
    iget-object v0, p0, Lcom/qihoo360/mobilesafe/support/a/f$2;->b:Lcom/qihoo360/mobilesafe/support/a/a;

    invoke-interface {v0, p1, p2, p3}, Lcom/qihoo360/mobilesafe/support/a/a;->a(IZ[B)V

    .line 136
    :cond_1
    return-void
.end method
