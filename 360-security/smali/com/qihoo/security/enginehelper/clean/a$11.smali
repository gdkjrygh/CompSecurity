.class Lcom/qihoo/security/enginehelper/clean/a$11;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/enginehelper/clean/a;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/enginehelper/clean/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/enginehelper/clean/a;)V
    .locals 0

    .prologue
    .line 205
    iput-object p1, p0, Lcom/qihoo/security/enginehelper/clean/a$11;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 209
    invoke-static {}, Lcom/qihoo/security/enginehelper/clean/a;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 210
    invoke-static {}, Lcom/qihoo/security/enginehelper/clean/a;->i()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "scantest target start"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 212
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$11;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->b(Lcom/qihoo/security/enginehelper/clean/a;)V

    .line 213
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$11;->a:Lcom/qihoo/security/enginehelper/clean/a;

    const/16 v1, 0x15

    invoke-static {v0, v1}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/a;I)I

    .line 214
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$11;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 215
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$11;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->c(Lcom/qihoo/security/enginehelper/clean/a;)V

    .line 220
    :goto_0
    return-void

    .line 217
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$11;->a:Lcom/qihoo/security/enginehelper/clean/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/a;I)I

    .line 218
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$11;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->d(Lcom/qihoo/security/enginehelper/clean/a;)V

    goto :goto_0
.end method
