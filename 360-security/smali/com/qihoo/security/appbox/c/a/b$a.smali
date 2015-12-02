.class Lcom/qihoo/security/appbox/c/a/b$a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/appbox/c/a/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/appbox/c/a/b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/appbox/c/a/b;)V
    .locals 0

    .prologue
    .line 84
    iput-object p1, p0, Lcom/qihoo/security/appbox/c/a/b$a;->a:Lcom/qihoo/security/appbox/c/a/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 90
    iget-object v0, p0, Lcom/qihoo/security/appbox/c/a/b$a;->a:Lcom/qihoo/security/appbox/c/a/b;

    invoke-static {v0}, Lcom/qihoo/security/appbox/c/a/b;->a(Lcom/qihoo/security/appbox/c/a/b;)Lcom/qihoo360/mobilesafe/core/d/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo360/mobilesafe/core/d/b;->a()Ljava/lang/String;

    move-result-object v0

    .line 94
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string/jumbo v1, "com.qihoo.security.lite"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 99
    iget-object v0, p0, Lcom/qihoo/security/appbox/c/a/b$a;->a:Lcom/qihoo/security/appbox/c/a/b;

    invoke-static {v0}, Lcom/qihoo/security/appbox/c/a/b;->b(Lcom/qihoo/security/appbox/c/a/b;)V

    .line 107
    :goto_0
    return-void

    .line 104
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/appbox/c/a/b$a;->a:Lcom/qihoo/security/appbox/c/a/b;

    invoke-virtual {v0}, Lcom/qihoo/security/appbox/c/a/b;->b()V

    goto :goto_0
.end method
