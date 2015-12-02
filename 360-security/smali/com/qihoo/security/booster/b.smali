.class public abstract Lcom/qihoo/security/booster/b;
.super Lcom/qihoo360/mobilesafe/core/c/b;
.source "360Security"


# static fields
.field private static final a:Ljava/lang/String;


# instance fields
.field private b:Landroid/os/Handler;

.field private c:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24
    const-string/jumbo v0, "pbca"

    sput-object v0, Lcom/qihoo/security/booster/b;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/os/Handler;)V
    .locals 1

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/qihoo360/mobilesafe/core/c/b;-><init>()V

    .line 26
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/booster/b;->b:Landroid/os/Handler;

    .line 30
    iput-object p1, p0, Lcom/qihoo/security/booster/b;->b:Landroid/os/Handler;

    .line 31
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/booster/b;)J
    .locals 2

    .prologue
    .line 22
    iget-wide v0, p0, Lcom/qihoo/security/booster/b;->c:J

    return-wide v0
.end method


# virtual methods
.method public a()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 35
    invoke-super {p0}, Lcom/qihoo360/mobilesafe/core/c/b;->a()V

    .line 36
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/qihoo/security/booster/b;->c:J

    .line 37
    return-void
.end method

.method public abstract a(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;)V"
        }
    .end annotation
.end method

.method public a(Ljava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo360/mobilesafe/service/ProcessInfo;",
            ">;Z)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 40
    invoke-super {p0, p1, p2}, Lcom/qihoo360/mobilesafe/core/c/b;->a(Ljava/util/List;Z)V

    .line 44
    iget-object v0, p0, Lcom/qihoo/security/booster/b;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 45
    iget-object v0, p0, Lcom/qihoo/security/booster/b;->b:Landroid/os/Handler;

    new-instance v1, Lcom/qihoo/security/booster/b$1;

    invoke-direct {v1, p0, p1}, Lcom/qihoo/security/booster/b$1;-><init>(Lcom/qihoo/security/booster/b;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 55
    :cond_0
    return-void
.end method

.method public abstract a_(II)V
.end method

.method public b(II)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 76
    invoke-super {p0, p1, p2}, Lcom/qihoo360/mobilesafe/core/c/b;->b(II)V

    .line 80
    iget-object v0, p0, Lcom/qihoo/security/booster/b;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 81
    iget-object v0, p0, Lcom/qihoo/security/booster/b;->b:Landroid/os/Handler;

    new-instance v1, Lcom/qihoo/security/booster/b$2;

    invoke-direct {v1, p0, p1, p2}, Lcom/qihoo/security/booster/b$2;-><init>(Lcom/qihoo/security/booster/b;II)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 89
    :cond_0
    return-void
.end method
