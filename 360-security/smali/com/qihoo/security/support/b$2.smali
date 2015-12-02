.class final Lcom/qihoo/security/support/b$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/support/b;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 2152
    iput-object p1, p0, Lcom/qihoo/security/support/b$2;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 2156
    iget-object v0, p0, Lcom/qihoo/security/support/b$2;->a:Landroid/content/Context;

    new-instance v1, Lcom/qihoo/security/d/a;

    iget-object v2, p0, Lcom/qihoo/security/support/b$2;->a:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/qihoo/security/d/a;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v1}, Lcom/qihoo/security/g/a;->a(Landroid/content/Context;Lcom/qihoo/security/d/a;)Lorg/apache/http/HttpHost;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/g/a;->a(Lorg/apache/http/HttpHost;)Lorg/apache/http/client/HttpClient;

    move-result-object v1

    .line 2159
    :try_start_0
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/o;->a()Ljava/lang/String;

    move-result-object v0

    .line 2160
    iget-object v2, p0, Lcom/qihoo/security/support/b$2;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 2161
    const-string/jumbo v2, "Statistician2"

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/qihoo/security/service/d;->a(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 2164
    :cond_0
    iget-object v2, p0, Lcom/qihoo/security/support/b$2;->a:Landroid/content/Context;

    invoke-static {v2, v1}, Lcom/qihoo/security/support/b;->b(Landroid/content/Context;Lorg/apache/http/client/HttpClient;)V

    .line 2165
    iget-object v2, p0, Lcom/qihoo/security/support/b$2;->a:Landroid/content/Context;

    invoke-static {v2, v1}, Lcom/qihoo/security/support/b;->a(Landroid/content/Context;Lorg/apache/http/client/HttpClient;)V

    .line 2166
    iget-object v2, p0, Lcom/qihoo/security/support/b$2;->a:Landroid/content/Context;

    invoke-static {v2, v1}, Lcom/qihoo/security/support/b;->c(Landroid/content/Context;Lorg/apache/http/client/HttpClient;)V

    .line 2168
    iget-object v2, p0, Lcom/qihoo/security/support/b$2;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 2169
    const-string/jumbo v0, "Statistician2"

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/qihoo/security/service/d;->b(Ljava/lang/String;Ljava/lang/Integer;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2177
    :cond_1
    if-eqz v1, :cond_2

    .line 2179
    invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    .line 2182
    :cond_2
    :goto_0
    return-void

    .line 2171
    :catch_0
    move-exception v0

    .line 2177
    if-eqz v1, :cond_2

    .line 2179
    invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    goto :goto_0

    .line 2177
    :catchall_0
    move-exception v0

    if-eqz v1, :cond_3

    .line 2179
    invoke-interface {v1}, Lorg/apache/http/client/HttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V

    :cond_3
    throw v0
.end method
