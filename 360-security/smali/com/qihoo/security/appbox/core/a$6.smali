.class Lcom/qihoo/security/appbox/core/a$6;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/appbox/core/a;->a(Landroid/content/Context;Lcom/qihoo/security/appbox/b/c;Ljava/lang/String;ILjava/util/concurrent/atomic/AtomicBoolean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/qihoo/security/appbox/b/c;

.field final synthetic d:I

.field final synthetic e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field final synthetic f:Lcom/qihoo/security/appbox/core/a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/appbox/core/a;Landroid/content/Context;Ljava/lang/String;Lcom/qihoo/security/appbox/b/c;ILjava/util/concurrent/atomic/AtomicBoolean;)V
    .locals 0

    .prologue
    .line 532
    iput-object p1, p0, Lcom/qihoo/security/appbox/core/a$6;->f:Lcom/qihoo/security/appbox/core/a;

    iput-object p2, p0, Lcom/qihoo/security/appbox/core/a$6;->a:Landroid/content/Context;

    iput-object p3, p0, Lcom/qihoo/security/appbox/core/a$6;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/qihoo/security/appbox/core/a$6;->c:Lcom/qihoo/security/appbox/b/c;

    iput p5, p0, Lcom/qihoo/security/appbox/core/a$6;->d:I

    iput-object p6, p0, Lcom/qihoo/security/appbox/core/a$6;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .prologue
    const/4 v9, 0x0

    .line 536
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$6;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/appbox/core/a$6;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/qihoo/security/appbox/core/b;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/qihoo/security/appbox/core/a$a;

    move-result-object v8

    .line 537
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, v8, Lcom/qihoo/security/appbox/core/a$a;->c:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x5265c00

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    const/4 v0, 0x1

    .line 542
    :goto_0
    iget-object v1, v8, Lcom/qihoo/security/appbox/core/a$a;->a:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 546
    iget-object v1, p0, Lcom/qihoo/security/appbox/core/a$6;->f:Lcom/qihoo/security/appbox/core/a;

    iget-object v2, p0, Lcom/qihoo/security/appbox/core/a$6;->a:Landroid/content/Context;

    iget-object v3, p0, Lcom/qihoo/security/appbox/core/a$6;->b:Ljava/lang/String;

    iget-object v4, v8, Lcom/qihoo/security/appbox/core/a$a;->a:Ljava/lang/String;

    iget-object v5, p0, Lcom/qihoo/security/appbox/core/a$6;->c:Lcom/qihoo/security/appbox/b/c;

    iget-wide v6, v8, Lcom/qihoo/security/appbox/core/a$a;->c:J

    invoke-static/range {v1 .. v7}, Lcom/qihoo/security/appbox/core/a;->a(Lcom/qihoo/security/appbox/core/a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/qihoo/security/appbox/b/c;J)V

    .line 549
    :cond_0
    if-eqz v0, :cond_1

    .line 553
    iget-object v0, p0, Lcom/qihoo/security/appbox/core/a$6;->f:Lcom/qihoo/security/appbox/core/a;

    iget-object v2, p0, Lcom/qihoo/security/appbox/core/a$6;->a:Landroid/content/Context;

    iget-object v3, p0, Lcom/qihoo/security/appbox/core/a$6;->b:Ljava/lang/String;

    iget v4, p0, Lcom/qihoo/security/appbox/core/a$6;->d:I

    iget-object v5, p0, Lcom/qihoo/security/appbox/core/a$6;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-wide v6, v8, Lcom/qihoo/security/appbox/core/a$a;->b:J

    iget-object v8, p0, Lcom/qihoo/security/appbox/core/a$6;->c:Lcom/qihoo/security/appbox/b/c;

    move v1, v9

    invoke-virtual/range {v0 .. v8}, Lcom/qihoo/security/appbox/core/a;->a(ZLandroid/content/Context;Ljava/lang/String;ILjava/util/concurrent/atomic/AtomicBoolean;JLcom/qihoo/security/appbox/b/c;)V

    .line 556
    :cond_1
    return-void

    :cond_2
    move v0, v9

    .line 537
    goto :goto_0
.end method
