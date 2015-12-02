.class public abstract Lcom/qihoo/security/base/a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/base/a$a;
    }
.end annotation


# instance fields
.field protected final a:Landroid/content/Context;

.field protected b:Lcom/qihoo/security/base/a$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/qihoo/security/base/a;->a:Landroid/content/Context;

    .line 32
    new-instance v0, Lcom/qihoo/security/base/a$a;

    invoke-direct {v0, p0}, Lcom/qihoo/security/base/a$a;-><init>(Lcom/qihoo/security/base/a;)V

    iput-object v0, p0, Lcom/qihoo/security/base/a;->b:Lcom/qihoo/security/base/a$a;

    .line 33
    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .prologue
    .line 57
    iget-object v0, p0, Lcom/qihoo/security/base/a;->b:Lcom/qihoo/security/base/a$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/base/a$a;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 58
    return-void
.end method

.method protected abstract a(Landroid/os/Message;)V
.end method
