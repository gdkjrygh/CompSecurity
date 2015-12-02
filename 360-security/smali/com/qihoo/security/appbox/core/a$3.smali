.class Lcom/qihoo/security/appbox/core/a$3;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/appbox/core/a;->a(Landroid/content/Context;Lcom/qihoo/security/appbox/b/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/qihoo/security/appbox/b/c;

.field final synthetic c:Lcom/qihoo/security/appbox/core/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/appbox/core/a;Landroid/content/Context;Lcom/qihoo/security/appbox/b/c;)V
    .locals 0

    .prologue
    .line 372
    iput-object p1, p0, Lcom/qihoo/security/appbox/core/a$3;->c:Lcom/qihoo/security/appbox/core/a;

    iput-object p2, p0, Lcom/qihoo/security/appbox/core/a$3;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/qihoo/security/appbox/core/a$3;->b:Lcom/qihoo/security/appbox/b/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .prologue
    .line 376
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$3;->a:Landroid/content/Context;

    const-string/jumbo v1, "0"

    invoke-static {v0, v1}, Lcom/qihoo/security/appbox/core/b;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/qihoo/security/appbox/core/a$a;

    move-result-object v6

    .line 377
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, v6, Lcom/qihoo/security/appbox/core/a$a;->c:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    const/4 v0, 0x1

    .line 382
    :goto_0
    iget-object v1, v6, Lcom/qihoo/security/appbox/core/a$a;->a:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 386
    iget-object v1, p0, Lcom/qihoo/security/appbox/core/a$3;->c:Lcom/qihoo/security/appbox/core/a;

    iget-object v2, p0, Lcom/qihoo/security/appbox/core/a$3;->a:Landroid/content/Context;

    const-string/jumbo v3, "0"

    iget-object v4, v6, Lcom/qihoo/security/appbox/core/a$a;->a:Ljava/lang/String;

    iget-object v5, p0, Lcom/qihoo/security/appbox/core/a$3;->b:Lcom/qihoo/security/appbox/b/c;

    iget-wide v6, v6, Lcom/qihoo/security/appbox/core/a$a;->c:J

    invoke-static/range {v1 .. v7}, Lcom/qihoo/security/appbox/core/a;->a(Lcom/qihoo/security/appbox/core/a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/qihoo/security/appbox/b/c;J)V

    .line 389
    :cond_0
    if-eqz v0, :cond_1

    .line 390
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$3;->c:Lcom/qihoo/security/appbox/core/a;

    iget-object v1, p0, Lcom/qihoo/security/appbox/core/a$3;->a:Landroid/content/Context;

    const-string/jumbo v2, "appbox"

    iget-object v3, p0, Lcom/qihoo/security/appbox/core/a$3;->b:Lcom/qihoo/security/appbox/b/c;

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/appbox/core/a;->a(Landroid/content/Context;Ljava/lang/String;Lcom/qihoo/security/appbox/b/c;)V

    .line 392
    :cond_1
    return-void

    .line 377
    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method
