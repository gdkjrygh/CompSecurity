.class Lcom/qihoo/security/e/a$1;
.super Landroid/os/Handler;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/e/a;-><init>(Ljava/io/File;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/e/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/e/a;Landroid/os/Looper;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/qihoo/security/e/a$1;->a:Lcom/qihoo/security/e/a;

    .line 132
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .prologue
    .line 136
    iget-object v0, p0, Lcom/qihoo/security/e/a$1;->a:Lcom/qihoo/security/e/a;

    invoke-static {v0, p1}, Lcom/qihoo/security/e/a;->a(Lcom/qihoo/security/e/a;Landroid/os/Message;)V

    .line 137
    return-void
.end method
