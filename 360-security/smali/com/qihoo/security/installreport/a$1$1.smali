.class Lcom/qihoo/security/installreport/a$1$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/installreport/a$1;->a(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/installreport/a$1;


# direct methods
.method constructor <init>(Lcom/qihoo/security/installreport/a$1;)V
    .locals 0

    .prologue
    .line 413
    iput-object p1, p0, Lcom/qihoo/security/installreport/a$1$1;->a:Lcom/qihoo/security/installreport/a$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 417
    iget-object v0, p0, Lcom/qihoo/security/installreport/a$1$1;->a:Lcom/qihoo/security/installreport/a$1;

    iget-object v0, v0, Lcom/qihoo/security/installreport/a$1;->c:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    sget-object v1, Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;->LaunchApp:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    if-ne v0, v1, :cond_0

    .line 421
    iget-object v0, p0, Lcom/qihoo/security/installreport/a$1$1;->a:Lcom/qihoo/security/installreport/a$1;

    iget-object v0, v0, Lcom/qihoo/security/installreport/a$1;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/installreport/a$1$1;->a:Lcom/qihoo/security/installreport/a$1;

    iget-object v1, v1, Lcom/qihoo/security/installreport/a$1;->d:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/qihoo/security/installreport/a;->b(Landroid/content/Context;Ljava/util/List;)V

    .line 432
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/installreport/a$1$1;->a:Lcom/qihoo/security/installreport/a$1;

    iget-object v0, v0, Lcom/qihoo/security/installreport/a$1;->c:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/installreport/a;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;Z)V

    .line 433
    return-void

    .line 423
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/installreport/a$1$1;->a:Lcom/qihoo/security/installreport/a$1;

    iget-boolean v0, v0, Lcom/qihoo/security/installreport/a$1;->e:Z

    if-nez v0, :cond_1

    .line 427
    iget-object v0, p0, Lcom/qihoo/security/installreport/a$1$1;->a:Lcom/qihoo/security/installreport/a$1;

    iget-object v0, v0, Lcom/qihoo/security/installreport/a$1;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/installreport/a;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 429
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/installreport/a$1$1;->a:Lcom/qihoo/security/installreport/a$1;

    iget-object v0, v0, Lcom/qihoo/security/installreport/a$1;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/qihoo/security/installreport/a$1$1;->a:Lcom/qihoo/security/installreport/a$1;

    iget-object v1, v1, Lcom/qihoo/security/installreport/a$1;->d:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/qihoo/security/installreport/a;->b(Landroid/content/Context;Ljava/util/List;)V

    goto :goto_0
.end method
