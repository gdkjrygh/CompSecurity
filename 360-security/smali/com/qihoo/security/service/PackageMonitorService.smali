.class public Lcom/qihoo/security/service/PackageMonitorService;
.super Lcom/qihoo/security/app/UiProcessService;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/receiver/PackageMonitor$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/service/PackageMonitorService$a;
    }
.end annotation


# static fields
.field private static c:Z


# instance fields
.field private d:Lcom/qihoo/security/receiver/PackageMonitor;

.field private e:Lcom/qihoo/security/malware/a;

.field private final f:I

.field private final g:I

.field private final h:I

.field private final i:Landroid/os/Handler;

.field private final j:Lcom/qihoo/security/malware/a$e;

.field private final k:Landroid/os/Handler;

.field private final l:Ljava/lang/Runnable;

.field private final m:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 50
    const/4 v0, 0x0

    sput-boolean v0, Lcom/qihoo/security/service/PackageMonitorService;->c:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/qihoo/security/app/UiProcessService;-><init>()V

    .line 55
    const/4 v0, 0x1

    iput v0, p0, Lcom/qihoo/security/service/PackageMonitorService;->f:I

    .line 56
    const/4 v0, 0x2

    iput v0, p0, Lcom/qihoo/security/service/PackageMonitorService;->g:I

    .line 57
    const/4 v0, 0x3

    iput v0, p0, Lcom/qihoo/security/service/PackageMonitorService;->h:I

    .line 59
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/service/PackageMonitorService;->i:Landroid/os/Handler;

    .line 84
    new-instance v0, Lcom/qihoo/security/service/PackageMonitorService$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/service/PackageMonitorService$1;-><init>(Lcom/qihoo/security/service/PackageMonitorService;)V

    iput-object v0, p0, Lcom/qihoo/security/service/PackageMonitorService;->j:Lcom/qihoo/security/malware/a$e;

    .line 263
    new-instance v0, Lcom/qihoo/security/service/PackageMonitorService$2;

    invoke-direct {v0, p0}, Lcom/qihoo/security/service/PackageMonitorService$2;-><init>(Lcom/qihoo/security/service/PackageMonitorService;)V

    iput-object v0, p0, Lcom/qihoo/security/service/PackageMonitorService;->k:Landroid/os/Handler;

    .line 274
    new-instance v0, Lcom/qihoo/security/service/PackageMonitorService$3;

    invoke-direct {v0, p0}, Lcom/qihoo/security/service/PackageMonitorService$3;-><init>(Lcom/qihoo/security/service/PackageMonitorService;)V

    iput-object v0, p0, Lcom/qihoo/security/service/PackageMonitorService;->l:Ljava/lang/Runnable;

    .line 285
    new-instance v0, Lcom/qihoo/security/service/PackageMonitorService$4;

    invoke-direct {v0, p0}, Lcom/qihoo/security/service/PackageMonitorService$4;-><init>(Lcom/qihoo/security/service/PackageMonitorService;)V

    iput-object v0, p0, Lcom/qihoo/security/service/PackageMonitorService;->m:Ljava/lang/Runnable;

    .line 406
    return-void
.end method

.method private a()V
    .locals 4

    .prologue
    .line 316
    iget-object v0, p0, Lcom/qihoo/security/service/PackageMonitorService;->i:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/service/PackageMonitorService;->m:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 317
    iget-object v0, p0, Lcom/qihoo/security/service/PackageMonitorService;->i:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/service/PackageMonitorService;->l:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 319
    invoke-direct {p0}, Lcom/qihoo/security/service/PackageMonitorService;->c()Lcom/qihoo/security/service/PackageMonitorService$a;

    move-result-object v0

    .line 320
    iget-object v1, v0, Lcom/qihoo/security/service/PackageMonitorService$a;->a:[I

    const/4 v2, 0x0

    aget v1, v1, v2

    iget-object v0, v0, Lcom/qihoo/security/service/PackageMonitorService$a;->a:[I

    const/4 v2, 0x1

    aget v0, v0, v2

    add-int/2addr v0, v1

    .line 322
    if-nez v0, :cond_0

    .line 323
    iget-object v0, p0, Lcom/qihoo/security/service/PackageMonitorService;->i:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/service/PackageMonitorService;->l:Ljava/lang/Runnable;

    const-wide/32 v2, 0xea60

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 327
    :goto_0
    return-void

    .line 325
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/service/PackageMonitorService;->i:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/service/PackageMonitorService;->m:Ljava/lang/Runnable;

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method private a(I)V
    .locals 6

    .prologue
    .line 422
    invoke-static {p0}, Lcom/qihoo/security/malware/db/a;->e(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    .line 423
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 424
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 425
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 426
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 427
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 428
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 429
    if-eqz v0, :cond_3

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_3

    .line 430
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 431
    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 432
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 433
    if-eqz v0, :cond_0

    .line 434
    invoke-virtual {v0, p0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isUninstall(Landroid/content/Context;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 435
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    .line 436
    iget v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->_id:I

    invoke-static {p0, v0}, Lcom/qihoo/security/malware/db/a;->a(Landroid/content/Context;I)V

    goto :goto_0

    .line 438
    :cond_1
    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isMalware()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 439
    iget-object v5, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 442
    :cond_2
    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isWarning()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 443
    iget-object v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 459
    :cond_3
    const/4 v0, 0x1

    if-ne p1, v0, :cond_4

    .line 460
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_7

    .line 461
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->a(Ljava/util/ArrayList;)V

    .line 467
    :cond_4
    :goto_1
    const/4 v0, 0x2

    if-ne p1, v0, :cond_5

    .line 468
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    .line 469
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/utils/notice/a;->b(Ljava/util/ArrayList;)V

    .line 475
    :cond_5
    :goto_2
    const/4 v0, 0x3

    if-ne p1, v0, :cond_6

    .line 476
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_9

    .line 477
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/qihoo/utils/notice/a;->c(Ljava/util/ArrayList;)V

    .line 482
    :cond_6
    :goto_3
    return-void

    .line 463
    :cond_7
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    const/16 v1, 0x1001

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->b(I)V

    goto :goto_1

    .line 471
    :cond_8
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    const/16 v1, 0x1002

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->b(I)V

    goto :goto_2

    .line 479
    :cond_9
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    const/16 v1, 0x100d

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->b(I)V

    goto :goto_3
.end method

.method private a(Lcom/qihoo/security/malware/vo/MaliciousInfo;)V
    .locals 4

    .prologue
    .line 204
    iget-object v0, p0, Lcom/qihoo/security/service/PackageMonitorService;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/utils/notice/c;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 261
    :cond_0
    :goto_0
    return-void

    .line 208
    :cond_1
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    const/16 v1, 0x1000

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->b(I)V

    .line 210
    invoke-virtual {p0}, Lcom/qihoo/security/service/PackageMonitorService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    iget-object v2, p1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->filePath:Ljava/lang/String;

    iget-boolean v3, p1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isInstalled:Z

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v0

    .line 212
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 213
    iget-object v0, p1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    .line 216
    :cond_2
    invoke-virtual {p1}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isWarning()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/qihoo/security/service/PackageMonitorService;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/qihoo/security/malware/db/c;->a(Landroid/content/Context;Lcom/qihoo/security/malware/vo/MaliciousInfo;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 217
    const/4 v0, 0x0

    iput v0, p1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->riskClass:I

    .line 220
    :cond_3
    invoke-virtual {p1}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isHarmful()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 229
    invoke-virtual {p1}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isMalware()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 230
    const-class v0, Lcom/qihoo/security/dialog/monitor/MonitorDangerDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->a(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_4

    sget-boolean v0, Lcom/qihoo/security/service/PackageMonitorService;->c:Z

    if-nez v0, :cond_4

    .line 231
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/qihoo/security/service/PackageMonitorService;->a(I)V

    .line 232
    iget-object v0, p0, Lcom/qihoo/security/service/PackageMonitorService;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/app/b;->a(Landroid/content/Context;)V

    .line 238
    :cond_4
    const-string/jumbo v0, "malware_find_issue_time"

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 239
    iget-object v0, p0, Lcom/qihoo/security/service/PackageMonitorService;->b:Landroid/content/Context;

    const-string/jumbo v1, "malware_find_issue_time"

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 248
    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/service/PackageMonitorService;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/content/g;->a(Landroid/content/Context;)Landroid/support/v4/content/g;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string/jumbo v2, "com.qihoo.action.MONITOR_UPDATE"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/content/g;->a(Landroid/content/Intent;)Z

    goto :goto_0

    .line 241
    :cond_6
    invoke-virtual {p1}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isWarning()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 242
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/qihoo/security/service/PackageMonitorService;->a(I)V

    goto :goto_1

    .line 243
    :cond_7
    invoke-virtual {p1}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isAdvert()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_1

    .line 254
    :cond_8
    invoke-static {}, Lcom/qihoo/security/service/e;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 255
    invoke-static {}, Lcom/qihoo/utils/notice/a;->a()Lcom/qihoo/utils/notice/a;

    move-result-object v0

    iget-object v1, p1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/qihoo/utils/notice/a;->a(Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/service/PackageMonitorService;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/qihoo/security/service/PackageMonitorService;->a()V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/service/PackageMonitorService;Lcom/qihoo/security/malware/vo/MaliciousInfo;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0, p1}, Lcom/qihoo/security/service/PackageMonitorService;->a(Lcom/qihoo/security/malware/vo/MaliciousInfo;)V

    return-void
.end method

.method public static a(Z)V
    .locals 3

    .prologue
    .line 396
    sput-boolean p0, Lcom/qihoo/security/service/PackageMonitorService;->c:Z

    .line 398
    if-eqz p0, :cond_1

    const-class v0, Lcom/qihoo/security/dialog/monitor/MonitorDangerDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->a(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_0

    const-class v0, Lcom/qihoo/security/dialog/monitor/MonitorWarningDialog;

    invoke-static {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->a(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 401
    :cond_0
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/g;->a(Landroid/content/Context;)Landroid/support/v4/content/g;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string/jumbo v2, "com.qihoo.action.MONITOR_DIALOG_FORCE_FINISH"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/support/v4/content/g;->a(Landroid/content/Intent;)Z

    .line 404
    :cond_1
    return-void
.end method

.method private c()Lcom/qihoo/security/service/PackageMonitorService$a;
    .locals 11

    .prologue
    const/4 v1, 0x0

    const/4 v10, 0x0

    const/4 v9, 0x1

    .line 342
    invoke-static {p0}, Lcom/qihoo/security/malware/db/a;->e(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    .line 344
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 345
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 346
    new-instance v5, Lcom/qihoo/security/service/PackageMonitorService$a;

    invoke-direct {v5, p0}, Lcom/qihoo/security/service/PackageMonitorService$a;-><init>(Lcom/qihoo/security/service/PackageMonitorService;)V

    .line 351
    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_5

    .line 352
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move-object v2, v1

    .line 353
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 354
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 355
    if-eqz v0, :cond_8

    .line 356
    invoke-virtual {v0, p0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isUninstall(Landroid/content/Context;)Z

    move-result v7

    if-eqz v7, :cond_0

    .line 357
    invoke-interface {v6}, Ljava/util/Iterator;->remove()V

    .line 358
    iget v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->_id:I

    invoke-static {p0, v0}, Lcom/qihoo/security/malware/db/a;->a(Landroid/content/Context;I)V

    move-object v0, v1

    move-object v1, v2

    :goto_1
    move-object v2, v1

    move-object v1, v0

    .line 384
    goto :goto_0

    .line 360
    :cond_0
    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isHarmful()Z

    move-result v7

    if-eqz v7, :cond_8

    .line 361
    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isMalware()Z

    move-result v7

    if-eqz v7, :cond_2

    .line 362
    iget-object v2, v5, Lcom/qihoo/security/service/PackageMonitorService$a;->a:[I

    aget v7, v2, v10

    add-int/lit8 v7, v7, 0x1

    aput v7, v2, v10

    .line 363
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-lez v2, :cond_1

    .line 364
    const-string/jumbo v2, ", "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    :cond_1
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->getLabel(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 367
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 370
    :cond_2
    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isWarning()Z

    move-result v7

    if-eqz v7, :cond_8

    .line 371
    iget-object v7, v5, Lcom/qihoo/security/service/PackageMonitorService$a;->a:[I

    aget v8, v7, v9

    add-int/lit8 v8, v8, 0x1

    aput v8, v7, v9

    .line 372
    if-eqz v4, :cond_8

    .line 373
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-lez v1, :cond_3

    .line 374
    const-string/jumbo v1, ","

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    :cond_3
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->getLabel(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 377
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object v1, v2

    goto :goto_1

    .line 385
    :cond_4
    iget-object v3, v5, Lcom/qihoo/security/service/PackageMonitorService$a;->b:[Ljava/lang/CharSequence;

    iget-object v4, p0, Lcom/qihoo/security/service/PackageMonitorService;->a:Lcom/qihoo/security/locale/d;

    iget-object v0, v5, Lcom/qihoo/security/service/PackageMonitorService$a;->a:[I

    aget v0, v0, v10

    if-le v0, v9, :cond_6

    const v0, 0x7f0c011c

    :goto_2
    new-array v6, v9, [Ljava/lang/Object;

    aput-object v2, v6, v10

    invoke-virtual {v4, v0, v6}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v10

    .line 387
    iget-object v2, v5, Lcom/qihoo/security/service/PackageMonitorService$a;->b:[Ljava/lang/CharSequence;

    iget-object v3, p0, Lcom/qihoo/security/service/PackageMonitorService;->a:Lcom/qihoo/security/locale/d;

    iget-object v0, v5, Lcom/qihoo/security/service/PackageMonitorService$a;->a:[I

    aget v0, v0, v9

    if-le v0, v9, :cond_7

    const v0, 0x7f0c011e

    :goto_3
    new-array v4, v9, [Ljava/lang/Object;

    aput-object v1, v4, v10

    invoke-virtual {v3, v0, v4}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v9

    .line 392
    :cond_5
    return-object v5

    .line 385
    :cond_6
    const v0, 0x7f0c011b

    goto :goto_2

    .line 387
    :cond_7
    const v0, 0x7f0c011d

    goto :goto_3

    :cond_8
    move-object v0, v1

    move-object v1, v2

    goto/16 :goto_1
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 300
    return-void
.end method

.method public b()V
    .locals 1

    .prologue
    .line 304
    invoke-direct {p0}, Lcom/qihoo/security/service/PackageMonitorService;->a()V

    .line 305
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/qihoo/security/service/PackageMonitorService;->a(I)V

    .line 306
    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/qihoo/security/service/PackageMonitorService;->a(I)V

    .line 307
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lcom/qihoo/security/service/PackageMonitorService;->a(I)V

    .line 308
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 313
    return-void
.end method

.method public onCreate()V
    .locals 4

    .prologue
    .line 63
    invoke-super {p0}, Lcom/qihoo/security/app/UiProcessService;->onCreate()V

    .line 69
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-ge v0, v1, :cond_0

    .line 71
    :try_start_0
    new-instance v0, Landroid/app/Notification;

    invoke-direct {v0}, Landroid/app/Notification;-><init>()V

    .line 72
    const/4 v1, 0x0

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const/4 v3, 0x0

    invoke-static {p0, v1, v2, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    .line 73
    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, p0, v2, v3, v1}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 74
    const/16 v1, 0x100

    invoke-virtual {p0, v1, v0}, Lcom/qihoo/security/service/PackageMonitorService;->startForeground(ILandroid/app/Notification;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 80
    :cond_0
    :goto_0
    new-instance v0, Lcom/qihoo/security/receiver/PackageMonitor;

    invoke-direct {v0, p0}, Lcom/qihoo/security/receiver/PackageMonitor;-><init>(Lcom/qihoo/security/receiver/PackageMonitor$a;)V

    iput-object v0, p0, Lcom/qihoo/security/service/PackageMonitorService;->d:Lcom/qihoo/security/receiver/PackageMonitor;

    .line 81
    iget-object v0, p0, Lcom/qihoo/security/service/PackageMonitorService;->d:Lcom/qihoo/security/receiver/PackageMonitor;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/receiver/PackageMonitor;->a(Landroid/content/Context;)V

    .line 82
    return-void

    .line 75
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    .line 180
    invoke-super {p0}, Lcom/qihoo/security/app/UiProcessService;->onDestroy()V

    .line 186
    iget-object v0, p0, Lcom/qihoo/security/service/PackageMonitorService;->i:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/service/PackageMonitorService;->m:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 187
    iget-object v0, p0, Lcom/qihoo/security/service/PackageMonitorService;->i:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/service/PackageMonitorService;->l:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 189
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_0

    .line 191
    const/4 v0, 0x1

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/qihoo/security/service/PackageMonitorService;->stopForeground(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 197
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/service/PackageMonitorService;->d:Lcom/qihoo/security/receiver/PackageMonitor;

    if-eqz v0, :cond_1

    .line 198
    iget-object v0, p0, Lcom/qihoo/security/service/PackageMonitorService;->d:Lcom/qihoo/security/receiver/PackageMonitor;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/receiver/PackageMonitor;->b(Landroid/content/Context;)V

    .line 200
    :cond_1
    return-void

    .line 192
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 144
    invoke-super {p0, p1, p2, p3}, Lcom/qihoo/security/app/UiProcessService;->onStartCommand(Landroid/content/Intent;II)I

    .line 150
    if-nez p1, :cond_1

    .line 175
    :cond_0
    :goto_0
    return v4

    .line 157
    :cond_1
    sget-boolean v0, Lcom/qihoo/security/service/PackageMonitorService;->c:Z

    if-nez v0, :cond_0

    .line 161
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    .line 162
    if-eqz v0, :cond_0

    .line 163
    invoke-virtual {v0}, Landroid/net/Uri;->getEncodedSchemeSpecificPart()Ljava/lang/String;

    move-result-object v0

    .line 164
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 165
    iget-object v1, p0, Lcom/qihoo/security/service/PackageMonitorService;->i:Landroid/os/Handler;

    iget-object v2, p0, Lcom/qihoo/security/service/PackageMonitorService;->m:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 166
    iget-object v1, p0, Lcom/qihoo/security/service/PackageMonitorService;->i:Landroid/os/Handler;

    iget-object v2, p0, Lcom/qihoo/security/service/PackageMonitorService;->l:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 167
    new-instance v1, Lcom/qihoo/security/malware/a;

    invoke-direct {v1}, Lcom/qihoo/security/malware/a;-><init>()V

    iput-object v1, p0, Lcom/qihoo/security/service/PackageMonitorService;->e:Lcom/qihoo/security/malware/a;

    .line 168
    iget-object v1, p0, Lcom/qihoo/security/service/PackageMonitorService;->e:Lcom/qihoo/security/malware/a;

    iget-object v2, p0, Lcom/qihoo/security/service/PackageMonitorService;->j:Lcom/qihoo/security/malware/a$e;

    invoke-virtual {v1, v2}, Lcom/qihoo/security/malware/a;->a(Lcom/qihoo/security/malware/a$e;)V

    .line 169
    iget-object v1, p0, Lcom/qihoo/security/service/PackageMonitorService;->e:Lcom/qihoo/security/malware/a;

    invoke-virtual {v1}, Lcom/qihoo/security/malware/a;->a()V

    .line 170
    iget-object v1, p0, Lcom/qihoo/security/service/PackageMonitorService;->e:Lcom/qihoo/security/malware/a;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/malware/a;->a(Ljava/lang/String;)V

    .line 171
    iget-object v0, p0, Lcom/qihoo/security/service/PackageMonitorService;->i:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/service/PackageMonitorService;->m:Ljava/lang/Runnable;

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method
