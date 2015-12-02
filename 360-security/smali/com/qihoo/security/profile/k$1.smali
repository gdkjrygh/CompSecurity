.class Lcom/qihoo/security/profile/k$1;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/profile/k;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/profile/k;


# direct methods
.method constructor <init>(Lcom/qihoo/security/profile/k;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 170
    iput-object p1, p0, Lcom/qihoo/security/profile/k$1;->a:Lcom/qihoo/security/profile/k;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .prologue
    .line 175
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/profile/k$1;->a:Lcom/qihoo/security/profile/k;

    invoke-static {v0, p1}, Lcom/qihoo/security/profile/k;->a(Lcom/qihoo/security/profile/k;Landroid/os/Message;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    .line 181
    :goto_0
    return-void

    .line 176
    :catch_0
    move-exception v0

    goto :goto_0
.end method
