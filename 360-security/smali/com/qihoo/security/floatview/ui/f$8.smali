.class Lcom/qihoo/security/floatview/ui/f$8;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/opti/a/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/floatview/ui/f;->u()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/floatview/ui/f;


# direct methods
.method constructor <init>(Lcom/qihoo/security/floatview/ui/f;)V
    .locals 0

    .prologue
    .line 709
    iput-object p1, p0, Lcom/qihoo/security/floatview/ui/f$8;->a:Lcom/qihoo/security/floatview/ui/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    .line 713
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f$8;->a:Lcom/qihoo/security/floatview/ui/f;

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v1

    const v2, 0x7f0c007e

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/floatview/ui/f;->a(Lcom/qihoo/security/floatview/ui/f;Ljava/lang/String;)Ljava/lang/String;

    .line 714
    return-void
.end method

.method public a(II)V
    .locals 8

    .prologue
    const/4 v1, 0x1

    .line 718
    int-to-long v2, p2

    const-wide/16 v4, 0x64

    mul-long/2addr v2, v4

    invoke-static {}, Lcom/qihoo360/common/utils/Utils;->getMemoryTotalKb()J

    move-result-wide v4

    div-long/2addr v2, v4

    long-to-int v0, v2

    .line 720
    if-lez p1, :cond_0

    .line 721
    :goto_0
    if-lez v0, :cond_1

    .line 722
    :goto_1
    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/f$8;->a:Lcom/qihoo/security/floatview/ui/f;

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v3

    const v4, 0x7f0c007d

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v5, v6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v5, v1

    invoke-virtual {v3, v4, v5}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/qihoo/security/floatview/ui/f;->a(Lcom/qihoo/security/floatview/ui/f;Ljava/lang/String;)Ljava/lang/String;

    .line 724
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/f$8;->a:Lcom/qihoo/security/floatview/ui/f;

    invoke-static {v0}, Lcom/qihoo/security/floatview/ui/f;->g(Lcom/qihoo/security/floatview/ui/f;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/floatview/ui/f$8$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/floatview/ui/f$8$1;-><init>(Lcom/qihoo/security/floatview/ui/f$8;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 741
    return-void

    :cond_0
    move p1, v1

    .line 720
    goto :goto_0

    :cond_1
    move v0, v1

    .line 721
    goto :goto_1
.end method
