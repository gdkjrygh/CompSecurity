.class final Lcom/qihoo/security/appbox/bi/a$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/g/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/appbox/bi/a;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/qihoo/security/g/b;

.field final synthetic c:J


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/qihoo/security/g/b;J)V
    .locals 1

    .prologue
    .line 247
    iput-object p1, p0, Lcom/qihoo/security/appbox/bi/a$1;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/qihoo/security/appbox/bi/a$1;->b:Lcom/qihoo/security/g/b;

    iput-wide p3, p0, Lcom/qihoo/security/appbox/bi/a$1;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 250
    return-void
.end method

.method public a(I)V
    .locals 4

    .prologue
    .line 259
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/qihoo/security/appbox/bi/a;->a(Z)Z

    .line 260
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/o;->a()Ljava/lang/String;

    move-result-object v0

    .line 261
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/appbox/bi/a$1;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 262
    invoke-static {}, Lcom/qihoo/security/appbox/bi/a;->c()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/appbox/bi/a$1;->b:Lcom/qihoo/security/g/b;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/service/d;->b(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 265
    :cond_0
    if-nez p1, :cond_1

    .line 272
    iget-object v0, p0, Lcom/qihoo/security/appbox/bi/a$1;->a:Landroid/content/Context;

    const-string/jumbo v1, "last_appbox_report_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 273
    iget-object v0, p0, Lcom/qihoo/security/appbox/bi/a$1;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/appbox/bi/a;->a(Landroid/content/Context;)V

    .line 278
    :cond_1
    return-void
.end method
