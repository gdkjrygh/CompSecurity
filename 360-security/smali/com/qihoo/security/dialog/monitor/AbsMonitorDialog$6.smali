.class Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$6;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;


# direct methods
.method constructor <init>(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)V
    .locals 0

    .prologue
    .line 332
    iput-object p1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$6;->a:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/malware/vo/MaliciousInfo;Lcom/qihoo/security/malware/vo/MaliciousInfo;)I
    .locals 6

    .prologue
    const/4 v4, 0x3

    const/4 v3, 0x2

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 340
    invoke-virtual {p1}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isTrojan()Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 350
    :goto_0
    invoke-virtual {p2}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isTrojan()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 360
    :goto_1
    sub-int/2addr v0, v1

    return v0

    .line 342
    :cond_0
    invoke-virtual {p1}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isDanger()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    .line 343
    goto :goto_0

    .line 344
    :cond_1
    invoke-virtual {p1}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isWarning()Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v3

    .line 345
    goto :goto_0

    :cond_2
    move v0, v4

    .line 347
    goto :goto_0

    .line 352
    :cond_3
    invoke-virtual {p2}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isDanger()Z

    move-result v1

    if-eqz v1, :cond_4

    move v1, v2

    .line 353
    goto :goto_1

    .line 354
    :cond_4
    invoke-virtual {p2}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isWarning()Z

    move-result v1

    if-eqz v1, :cond_5

    move v1, v3

    .line 355
    goto :goto_1

    :cond_5
    move v1, v4

    .line 357
    goto :goto_1
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 332
    check-cast p1, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    check-cast p2, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    invoke-virtual {p0, p1, p2}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$6;->a(Lcom/qihoo/security/malware/vo/MaliciousInfo;Lcom/qihoo/security/malware/vo/MaliciousInfo;)I

    move-result v0

    return v0
.end method
