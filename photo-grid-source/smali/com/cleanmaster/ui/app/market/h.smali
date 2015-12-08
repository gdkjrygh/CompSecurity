.class final Lcom/cleanmaster/ui/app/market/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/cleanmaster/ui/app/market/n;


# instance fields
.field final synthetic a:Lcom/cleanmaster/ui/app/market/Ad;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/picksinit/ClickAdFinishListener;

.field final synthetic d:Landroid/content/Context;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/cleanmaster/ui/app/market/Ad;Ljava/lang/String;Lcom/picksinit/ClickAdFinishListener;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 511
    iput-object p1, p0, Lcom/cleanmaster/ui/app/market/h;->a:Lcom/cleanmaster/ui/app/market/Ad;

    iput-object p2, p0, Lcom/cleanmaster/ui/app/market/h;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/cleanmaster/ui/app/market/h;->c:Lcom/picksinit/ClickAdFinishListener;

    iput-object p4, p0, Lcom/cleanmaster/ui/app/market/h;->d:Landroid/content/Context;

    iput-object p5, p0, Lcom/cleanmaster/ui/app/market/h;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 515
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 516
    invoke-static {p1}, Lcom/cleanmaster/ui/app/market/d;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 517
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "market://details?id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/h;->a:Lcom/cleanmaster/ui/app/market/Ad;

    invoke-virtual {v1}, Lcom/cleanmaster/ui/app/market/Ad;->getPkg()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 518
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/h;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/h;->a:Lcom/cleanmaster/ui/app/market/Ad;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/cleanmaster/ui/app/market/d;->b(Ljava/lang/String;Lcom/cleanmaster/ui/app/market/Ad;Ljava/lang/String;)V

    .line 520
    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/h;->c:Lcom/picksinit/ClickAdFinishListener;

    if-eqz v0, :cond_2

    .line 521
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/h;->c:Lcom/picksinit/ClickAdFinishListener;

    new-instance v1, Lcom/picksinit/SmartGoGp;

    invoke-direct {v1, p1}, Lcom/picksinit/SmartGoGp;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/picksinit/ClickAdFinishListener;->onClickFinish(Lcom/picksinit/goGp;)V

    .line 525
    :goto_0
    sget-object v0, Lcom/cleanmaster/ui/app/market/d;->a:Lcom/cleanmaster/util/n;

    iget-object v1, p0, Lcom/cleanmaster/ui/app/market/h;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/cleanmaster/util/n;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 527
    :cond_1
    return-void

    .line 523
    :cond_2
    iget-object v0, p0, Lcom/cleanmaster/ui/app/market/h;->d:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/cleanmaster/ui/app/market/d;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0
.end method
