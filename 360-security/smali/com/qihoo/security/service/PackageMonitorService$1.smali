.class Lcom/qihoo/security/service/PackageMonitorService$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/malware/a$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/service/PackageMonitorService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/service/PackageMonitorService;


# direct methods
.method constructor <init>(Lcom/qihoo/security/service/PackageMonitorService;)V
    .locals 0

    .prologue
    .line 84
    iput-object p1, p0, Lcom/qihoo/security/service/PackageMonitorService$1;->a:Lcom/qihoo/security/service/PackageMonitorService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/malware/a$a;)V
    .locals 0

    .prologue
    .line 139
    return-void
.end method

.method public a(Lcom/qihoo/security/malware/a$d;)V
    .locals 3

    .prologue
    .line 88
    iget-object v0, p1, Lcom/qihoo/security/malware/a$d;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 89
    iget v1, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->state:I

    const/16 v2, 0x7f

    if-ne v1, v2, :cond_0

    .line 101
    iget-object v1, p0, Lcom/qihoo/security/service/PackageMonitorService$1;->a:Lcom/qihoo/security/service/PackageMonitorService;

    invoke-static {v1, v0}, Lcom/qihoo/security/service/PackageMonitorService;->a(Lcom/qihoo/security/service/PackageMonitorService;Lcom/qihoo/security/malware/vo/MaliciousInfo;)V

    .line 103
    :cond_0
    return-void
.end method

.method public b(Lcom/qihoo/security/malware/a$d;)V
    .locals 4

    .prologue
    .line 107
    iget-object v0, p1, Lcom/qihoo/security/malware/a$d;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 108
    if-eqz v0, :cond_0

    .line 109
    iget v2, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->state:I

    const/16 v3, 0x7f

    if-ne v2, v3, :cond_0

    .line 121
    iget-object v2, p0, Lcom/qihoo/security/service/PackageMonitorService$1;->a:Lcom/qihoo/security/service/PackageMonitorService;

    invoke-static {v2, v0}, Lcom/qihoo/security/service/PackageMonitorService;->a(Lcom/qihoo/security/service/PackageMonitorService;Lcom/qihoo/security/malware/vo/MaliciousInfo;)V

    goto :goto_0

    .line 125
    :cond_1
    return-void
.end method
