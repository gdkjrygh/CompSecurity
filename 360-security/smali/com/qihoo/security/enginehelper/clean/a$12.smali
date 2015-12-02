.class Lcom/qihoo/security/enginehelper/clean/a$12;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/enginehelper/clean/a;->c()V
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
    .line 226
    iput-object p1, p0, Lcom/qihoo/security/enginehelper/clean/a$12;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 230
    invoke-static {}, Lcom/qihoo/security/enginehelper/clean/a;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 231
    invoke-static {}, Lcom/qihoo/security/enginehelper/clean/a;->i()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "target stop"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 233
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$12;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->b(Lcom/qihoo/security/enginehelper/clean/a;)V

    .line 235
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$12;->a:Lcom/qihoo/security/enginehelper/clean/a;

    const/16 v1, 0x16

    invoke-static {v0, v1}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/a;I)I

    .line 236
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$12;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/a;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 237
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$12;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->e(Lcom/qihoo/security/enginehelper/clean/a;)[B

    move-result-object v1

    monitor-enter v1

    .line 238
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$12;->a:Lcom/qihoo/security/enginehelper/clean/a;

    const/16 v2, 0xf

    invoke-static {v0, v2}, Lcom/qihoo/security/enginehelper/clean/a;->b(Lcom/qihoo/security/enginehelper/clean/a;I)I

    .line 239
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$12;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->f(Lcom/qihoo/security/enginehelper/clean/a;)V

    .line 240
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 241
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$12;->a:Lcom/qihoo/security/enginehelper/clean/a;

    invoke-static {v0}, Lcom/qihoo/security/enginehelper/clean/a;->c(Lcom/qihoo/security/enginehelper/clean/a;)V

    .line 245
    :goto_0
    return-void

    .line 240
    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    .line 243
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/enginehelper/clean/a$12;->a:Lcom/qihoo/security/enginehelper/clean/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/enginehelper/clean/a;->a(Lcom/qihoo/security/enginehelper/clean/a;I)I

    goto :goto_0
.end method
