.class Lcom/qihoo/security/app/a$2;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/app/a;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/app/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/app/a;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 254
    iput-object p1, p0, Lcom/qihoo/security/app/a$2;->a:Lcom/qihoo/security/app/a;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .prologue
    .line 257
    iget-object v0, p0, Lcom/qihoo/security/app/a$2;->a:Lcom/qihoo/security/app/a;

    invoke-static {v0, p1, p0}, Lcom/qihoo/security/app/a;->a(Lcom/qihoo/security/app/a;Landroid/os/Message;Landroid/os/Handler;)V

    .line 258
    return-void
.end method
