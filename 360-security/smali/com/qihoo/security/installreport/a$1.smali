.class final Lcom/qihoo/security/installreport/a$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/adv/AdvDataManager$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/installreport/a;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/qihoo/security/adv/AdvDataManager$c",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Long;",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lorg/json/JSONArray;

.field final synthetic c:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

.field final synthetic d:Ljava/util/List;

.field final synthetic e:Z

.field final synthetic f:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Lorg/json/JSONArray;Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;Ljava/util/List;ZLjava/lang/String;)V
    .locals 0

    .prologue
    .line 402
    iput-object p1, p0, Lcom/qihoo/security/installreport/a$1;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/qihoo/security/installreport/a$1;->b:Lorg/json/JSONArray;

    iput-object p3, p0, Lcom/qihoo/security/installreport/a$1;->c:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    iput-object p4, p0, Lcom/qihoo/security/installreport/a$1;->d:Ljava/util/List;

    iput-boolean p5, p0, Lcom/qihoo/security/installreport/a$1;->e:Z

    iput-object p6, p0, Lcom/qihoo/security/installreport/a$1;->f:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 0

    .prologue
    .line 453
    return-void
.end method

.method public a(Ljava/lang/Long;Ljava/lang/Long;I)V
    .locals 2

    .prologue
    .line 444
    iget-object v0, p0, Lcom/qihoo/security/installreport/a$1;->f:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/installreport/a$1;->f:Ljava/lang/String;

    iget-object v1, p0, Lcom/qihoo/security/installreport/a$1;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 445
    invoke-static {}, Lcom/qihoo/security/installreport/a;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/installreport/a$1;->b:Lorg/json/JSONArray;

    invoke-virtual {v1}, Lorg/json/JSONArray;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/service/d;->b(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 447
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/installreport/a$1;->c:Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/installreport/a;->a(Lcom/qihoo/security/adv/AdvDataManager$AdvReportType;Z)V

    .line 448
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 402
    check-cast p1, Ljava/lang/Long;

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/installreport/a$1;->a(Ljava/lang/Long;Ljava/lang/Long;)V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .prologue
    .line 402
    check-cast p1, Ljava/lang/Long;

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p0, p1, p2, p3}, Lcom/qihoo/security/installreport/a$1;->a(Ljava/lang/Long;Ljava/lang/Long;I)V

    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 402
    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/Long;

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p0, p1, p2, p3}, Lcom/qihoo/security/installreport/a$1;->a(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 2

    .prologue
    .line 406
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->c()Ljava/lang/String;

    move-result-object v0

    .line 407
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/qihoo/security/installreport/a$1;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 408
    invoke-static {}, Lcom/qihoo/security/installreport/a;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/installreport/a$1;->b:Lorg/json/JSONArray;

    invoke-virtual {v1}, Lorg/json/JSONArray;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/service/d;->b(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 413
    :cond_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/qihoo/security/installreport/a$1$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/installreport/a$1$1;-><init>(Lcom/qihoo/security/installreport/a$1;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 437
    return-void
.end method
