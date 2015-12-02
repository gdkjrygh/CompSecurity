.class Lcom/qihoo/security/booster/b$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/booster/b;->a(Ljava/util/List;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/qihoo/security/booster/b;


# direct methods
.method constructor <init>(Lcom/qihoo/security/booster/b;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 45
    iput-object p1, p0, Lcom/qihoo/security/booster/b$1;->b:Lcom/qihoo/security/booster/b;

    iput-object p2, p0, Lcom/qihoo/security/booster/b$1;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 49
    iget-object v0, p0, Lcom/qihoo/security/booster/b$1;->b:Lcom/qihoo/security/booster/b;

    iget-object v1, p0, Lcom/qihoo/security/booster/b$1;->a:Ljava/util/List;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/booster/b;->a(Ljava/util/List;)V

    .line 50
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/qihoo/security/booster/b$1;->b:Lcom/qihoo/security/booster/b;

    invoke-static {v2}, Lcom/qihoo/security/booster/b;->a(Lcom/qihoo/security/booster/b;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int v0, v0

    .line 51
    const/16 v1, 0x2c39

    invoke-static {v1, v0}, Lcom/qihoo/security/support/b;->b(II)V

    .line 52
    return-void
.end method
