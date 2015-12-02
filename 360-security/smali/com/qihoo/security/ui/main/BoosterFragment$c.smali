.class Lcom/qihoo/security/ui/main/BoosterFragment$c;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/main/BoosterFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/main/BoosterFragment;


# direct methods
.method private constructor <init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V
    .locals 0

    .prologue
    .line 863
    iput-object p1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$c;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/qihoo/security/ui/main/BoosterFragment;Lcom/qihoo/security/ui/main/BoosterFragment$1;)V
    .locals 0

    .prologue
    .line 863
    invoke-direct {p0, p1}, Lcom/qihoo/security/ui/main/BoosterFragment$c;-><init>(Lcom/qihoo/security/ui/main/BoosterFragment;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/a;)V
    .locals 3

    .prologue
    .line 867
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$c;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    const v1, 0x7f020084

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->b_(I)V

    .line 868
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$c;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    iget-object v1, p0, Lcom/qihoo/security/ui/main/BoosterFragment$c;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->e(Lcom/qihoo/security/ui/main/BoosterFragment;)Lcom/qihoo/security/locale/d;

    move-result-object v1

    const v2, 0x7f0c0017

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->a_(Ljava/lang/String;)V

    .line 869
    return-void
.end method

.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 4

    .prologue
    .line 876
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$c;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->f(Lcom/qihoo/security/ui/main/BoosterFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/app/a;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 877
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$c;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment;I)V

    .line 886
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lcom/qihoo/security/ui/main/BoosterFragment$c;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-static {v2}, Lcom/qihoo/security/ui/main/BoosterFragment;->g(Lcom/qihoo/security/ui/main/BoosterFragment;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    long-to-int v0, v0

    .line 887
    const/16 v1, 0x2c3a

    invoke-static {v1, v0}, Lcom/qihoo/security/support/b;->b(II)V

    .line 888
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$c;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/main/BoosterFragment;->m()V

    .line 889
    return-void

    .line 879
    :cond_0
    invoke-static {}, Lcom/qihoo/security/booster/a;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 880
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$c;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment;I)V

    goto :goto_0

    .line 882
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/main/BoosterFragment$c;->a:Lcom/qihoo/security/ui/main/BoosterFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/main/BoosterFragment;->a(Lcom/qihoo/security/ui/main/BoosterFragment;I)V

    goto :goto_0
.end method
