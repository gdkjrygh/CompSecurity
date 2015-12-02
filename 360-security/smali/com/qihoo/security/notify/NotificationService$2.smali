.class Lcom/qihoo/security/notify/NotificationService$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/opti/a/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/notify/NotificationService;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/notify/NotificationService;


# direct methods
.method constructor <init>(Lcom/qihoo/security/notify/NotificationService;)V
    .locals 0

    .prologue
    .line 58
    iput-object p1, p0, Lcom/qihoo/security/notify/NotificationService$2;->a:Lcom/qihoo/security/notify/NotificationService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 61
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c007e

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    .line 62
    return-void
.end method

.method public a(II)V
    .locals 6

    .prologue
    .line 66
    int-to-long v0, p2

    const-wide/16 v2, 0x64

    mul-long/2addr v0, v2

    invoke-static {}, Lcom/qihoo360/common/utils/Utils;->getMemoryTotalKb()J

    move-result-wide v2

    div-long/2addr v0, v2

    long-to-int v0, v0

    .line 67
    iget-object v1, p0, Lcom/qihoo/security/notify/NotificationService$2;->a:Lcom/qihoo/security/notify/NotificationService;

    iget-object v1, v1, Lcom/qihoo/security/notify/NotificationService;->a:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c007d

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v4

    const/4 v4, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 69
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qihoo360/mobilesafe/b/q;->a(Ljava/lang/CharSequence;)V

    .line 70
    return-void
.end method
