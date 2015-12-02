.class public Lcom/qihoo/utils/notice/a;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static a:Lcom/qihoo/utils/notice/a;


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Lcom/qihoo/security/locale/d;

.field private final d:Landroid/support/v4/app/y;

.field private e:Landroid/app/Notification;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    .line 64
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    .line 65
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/support/v4/app/y;->a(Landroid/content/Context;)Landroid/support/v4/app/y;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/utils/notice/a;->d:Landroid/support/v4/app/y;

    .line 66
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;I)Landroid/app/Notification;
    .locals 4

    .prologue
    .line 969
    new-instance v0, Landroid/support/v4/app/q$d;

    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/support/v4/app/q$d;-><init>(Landroid/content/Context;)V

    .line 970
    invoke-virtual {v0, p3}, Landroid/support/v4/app/q$d;->a(I)Landroid/support/v4/app/q$d;

    .line 971
    invoke-virtual {v0, p1}, Landroid/support/v4/app/q$d;->a(Ljava/lang/CharSequence;)Landroid/support/v4/app/q$d;

    .line 972
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x14

    if-lt v1, v2, :cond_0

    .line 973
    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q$d;->b(I)Landroid/support/v4/app/q$d;

    .line 977
    :goto_0
    invoke-virtual {v0, p2}, Landroid/support/v4/app/q$d;->a(Ljava/lang/String;)Landroid/support/v4/app/q$d;

    .line 978
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Landroid/support/v4/app/q$d;->a(J)Landroid/support/v4/app/q$d;

    .line 979
    invoke-virtual {v0}, Landroid/support/v4/app/q$d;->a()Landroid/app/Notification;

    move-result-object v0

    return-object v0

    .line 975
    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/app/q$d;->b(I)Landroid/support/v4/app/q$d;

    goto :goto_0
.end method

.method private a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)Landroid/widget/RemoteViews;
    .locals 4

    .prologue
    const v3, 0x7f0b0199

    .line 993
    .line 994
    invoke-static {}, Lcom/qihoo/utils/notice/c;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 995
    new-instance v0, Landroid/widget/RemoteViews;

    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f03007a

    invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 999
    :goto_0
    const v1, 0x7f0b0196

    invoke-static {}, Lcom/qihoo/utils/notice/c;->a()Lcom/qihoo/utils/notice/c;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/qihoo/utils/notice/c;->c(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    .line 1000
    const v1, 0x7f0b0197

    invoke-virtual {v0, v1, p2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 1001
    const v1, 0x7f0b0198

    invoke-virtual {v0, v1, p3}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 1002
    if-eqz p4, :cond_1

    .line 1003
    invoke-virtual {v0, v3, p4}, Landroid/widget/RemoteViews;->setImageViewResource(II)V

    .line 1004
    const/4 v1, 0x0

    invoke-virtual {v0, v3, v1}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    .line 1008
    :goto_1
    return-object v0

    .line 997
    :cond_0
    new-instance v0, Landroid/widget/RemoteViews;

    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f030079

    invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    goto :goto_0

    .line 1006
    :cond_1
    const/16 v1, 0x8

    invoke-virtual {v0, v3, v1}, Landroid/widget/RemoteViews;->setViewVisibility(II)V

    goto :goto_1
.end method

.method public static a()Lcom/qihoo/utils/notice/a;
    .locals 1

    .prologue
    .line 69
    sget-object v0, Lcom/qihoo/utils/notice/a;->a:Lcom/qihoo/utils/notice/a;

    if-nez v0, :cond_0

    .line 70
    new-instance v0, Lcom/qihoo/utils/notice/a;

    invoke-direct {v0}, Lcom/qihoo/utils/notice/a;-><init>()V

    sput-object v0, Lcom/qihoo/utils/notice/a;->a:Lcom/qihoo/utils/notice/a;

    .line 72
    :cond_0
    sget-object v0, Lcom/qihoo/utils/notice/a;->a:Lcom/qihoo/utils/notice/a;

    return-object v0
.end method

.method private a(ILandroid/app/Notification;)V
    .locals 1

    .prologue
    .line 1034
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->d:Landroid/support/v4/app/y;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/app/y;->a(ILandroid/app/Notification;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1040
    :goto_0
    return-void

    .line 1035
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private f()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    .line 548
    .line 550
    invoke-static {}, Lcom/qihoo/utils/notice/c;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 551
    new-instance v0, Landroid/widget/RemoteViews;

    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f03007c

    invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    .line 556
    :goto_0
    new-instance v1, Landroid/support/v4/app/q$d;

    iget-object v2, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/support/v4/app/q$d;-><init>(Landroid/content/Context;)V

    .line 557
    const v2, 0x7f0200cf

    invoke-virtual {v1, v2}, Landroid/support/v4/app/q$d;->a(I)Landroid/support/v4/app/q$d;

    .line 558
    iget-object v2, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c018a

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/support/v4/app/q$d;->a(Ljava/lang/CharSequence;)Landroid/support/v4/app/q$d;

    .line 559
    invoke-virtual {v1, v4}, Landroid/support/v4/app/q$d;->b(I)Landroid/support/v4/app/q$d;

    .line 560
    const-string/jumbo v2, "sort_key_00"

    invoke-virtual {v1, v2}, Landroid/support/v4/app/q$d;->a(Ljava/lang/String;)Landroid/support/v4/app/q$d;

    .line 561
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Landroid/support/v4/app/q$d;->a(J)Landroid/support/v4/app/q$d;

    .line 562
    invoke-virtual {v1}, Landroid/support/v4/app/q$d;->a()Landroid/app/Notification;

    move-result-object v1

    iput-object v1, p0, Lcom/qihoo/utils/notice/a;->e:Landroid/app/Notification;

    .line 563
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->e:Landroid/app/Notification;

    iput v4, v1, Landroid/app/Notification;->flags:I

    .line 564
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->e:Landroid/app/Notification;

    iput-object v0, v1, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 566
    return-void

    .line 553
    :cond_0
    new-instance v0, Landroid/widget/RemoteViews;

    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f03007b

    invoke-direct {v0, v1, v2}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    goto :goto_0
.end method


# virtual methods
.method public a(I)V
    .locals 4

    .prologue
    .line 584
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->e:Landroid/app/Notification;

    if-nez v0, :cond_0

    .line 592
    :goto_0
    return-void

    .line 587
    :cond_0
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->e:Landroid/app/Notification;

    iget-object v0, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    const v1, 0x7f0b019a

    iget-object v2, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c0175

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 589
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->e:Landroid/app/Notification;

    iget-object v0, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    const v1, 0x7f0b0108

    const/16 v2, 0x64

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, p1, v3}, Landroid/widget/RemoteViews;->setProgressBar(IIIZ)V

    .line 590
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->e:Landroid/app/Notification;

    iget-object v0, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    const v1, 0x7f0b0198

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, "%"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 591
    const/16 v0, 0x100a

    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->e:Landroid/app/Notification;

    invoke-direct {p0, v0, v1}, Lcom/qihoo/utils/notice/a;->a(ILandroid/app/Notification;)V

    goto :goto_0
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/16 v6, 0x1009

    .line 519
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->d:Landroid/support/v4/app/y;

    invoke-virtual {v0, v6}, Landroid/support/v4/app/y;->a(I)V

    .line 521
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const v1, 0x7f0c0173

    const v2, 0x7f08006f

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/b/n;->a(Landroid/content/Context;II)Landroid/text/SpannableString;

    move-result-object v0

    .line 523
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0174

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 525
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "sort_key_01"

    invoke-static {}, Lcom/qihoo/utils/notice/c;->a()Lcom/qihoo/utils/notice/c;

    move-result-object v4

    sget-object v5, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {v4, v5}, Lcom/qihoo/utils/notice/c;->d(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v4

    invoke-direct {p0, v2, v3, v4}, Lcom/qihoo/utils/notice/a;->a(Ljava/lang/String;Ljava/lang/String;I)Landroid/app/Notification;

    move-result-object v2

    .line 528
    sget-object v3, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-direct {p0, v3, v0, v1, v7}, Lcom/qihoo/utils/notice/a;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)Landroid/widget/RemoteViews;

    move-result-object v0

    iput-object v0, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 530
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const-class v3, Lcom/qihoo/security/v5/UpdatedDialog;

    invoke-direct {v0, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 531
    if-nez p1, :cond_0

    .line 532
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 534
    :cond_0
    const-string/jumbo v1, "FromNotify"

    const/4 v3, 0x1

    invoke-virtual {p1, v1, v3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 535
    const-string/jumbo v1, "type"

    invoke-virtual {p1, v1, v7}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 536
    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 537
    const-string/jumbo v1, "com.qihoo.security.action.ACTION_SHOW_NEW_VERSION_DIALOG"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 538
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const/high16 v3, 0x10000000

    invoke-static {v1, v6, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, v2, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 541
    const/16 v0, 0x10

    iput v0, v2, Landroid/app/Notification;->flags:I

    .line 543
    invoke-direct {p0, v6, v2}, Lcom/qihoo/utils/notice/a;->a(ILandroid/app/Notification;)V

    .line 544
    return-void
.end method

.method public a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 426
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/i;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 465
    :cond_0
    :goto_0
    return-void

    .line 430
    :cond_1
    const/16 v0, 0x1008

    .line 431
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 434
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/qihoo/utils/notice/c;->b(Landroid/content/Context;I)V

    .line 435
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->d:Landroid/support/v4/app/y;

    invoke-virtual {v1, v0}, Landroid/support/v4/app/y;->a(I)V

    .line 437
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0201

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 438
    iget-object v2, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c0202

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 440
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string/jumbo v4, "sort_key_05"

    invoke-static {}, Lcom/qihoo/utils/notice/c;->a()Lcom/qihoo/utils/notice/c;

    move-result-object v5

    invoke-virtual {v5, p1}, Lcom/qihoo/utils/notice/c;->d(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v5

    invoke-direct {p0, v3, v4, v5}, Lcom/qihoo/utils/notice/a;->a(Ljava/lang/String;Ljava/lang/String;I)Landroid/app/Notification;

    move-result-object v3

    .line 443
    invoke-static {}, Lcom/qihoo/utils/notice/c;->a()Lcom/qihoo/utils/notice/c;

    move-result-object v4

    invoke-virtual {v4, p1}, Lcom/qihoo/utils/notice/c;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v4

    invoke-direct {p0, p1, v1, v2, v4}, Lcom/qihoo/utils/notice/a;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)Landroid/widget/RemoteViews;

    move-result-object v1

    iput-object v1, v3, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 447
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const-class v4, Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-direct {v1, v2, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 448
    const/high16 v2, 0x14000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 449
    const-string/jumbo v2, "com.qihoo.security.notify.ACTION_BOOST"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 450
    const-string/jumbo v2, "from_notify"

    invoke-virtual {v1, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 452
    const-string/jumbo v2, "reset_main_page"

    invoke-virtual {v1, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 453
    const-string/jumbo v2, "fragment_index"

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 454
    iget-object v2, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const/high16 v4, 0x10000000

    invoke-static {v2, v0, v1, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    iput-object v1, v3, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 456
    const/16 v1, 0x10

    iput v1, v3, Landroid/app/Notification;->flags:I

    .line 458
    invoke-direct {p0, v0, v3}, Lcom/qihoo/utils/notice/a;->a(ILandroid/app/Notification;)V

    .line 460
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 461
    const/16 v0, 0x7154

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto/16 :goto_0

    .line 463
    :cond_2
    const/16 v0, 0x4e39

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto/16 :goto_0
.end method

.method public a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;I)V
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v6, 0x1

    .line 473
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/i;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 512
    :cond_0
    :goto_0
    return-void

    .line 477
    :cond_1
    const/16 v0, 0x1013

    .line 478
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 481
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/qihoo/utils/notice/c;->b(Landroid/content/Context;I)V

    .line 482
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->d:Landroid/support/v4/app/y;

    invoke-virtual {v1, v0}, Landroid/support/v4/app/y;->a(I)V

    .line 484
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c020b

    new-array v3, v6, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v7

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 485
    iget-object v2, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c020c

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 487
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string/jumbo v4, "sort_key_05"

    invoke-static {}, Lcom/qihoo/utils/notice/c;->a()Lcom/qihoo/utils/notice/c;

    move-result-object v5

    invoke-virtual {v5, p1}, Lcom/qihoo/utils/notice/c;->d(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v5

    invoke-direct {p0, v3, v4, v5}, Lcom/qihoo/utils/notice/a;->a(Ljava/lang/String;Ljava/lang/String;I)Landroid/app/Notification;

    move-result-object v3

    .line 490
    invoke-static {}, Lcom/qihoo/utils/notice/c;->a()Lcom/qihoo/utils/notice/c;

    move-result-object v4

    invoke-virtual {v4, p1}, Lcom/qihoo/utils/notice/c;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v4

    invoke-direct {p0, p1, v1, v2, v4}, Lcom/qihoo/utils/notice/a;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)Landroid/widget/RemoteViews;

    move-result-object v1

    iput-object v1, v3, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 494
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const-class v4, Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-direct {v1, v2, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 495
    const/high16 v2, 0x14000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 496
    const-string/jumbo v2, "com.qihoo.security.notify.ACTION_BOOST_ACTIVE"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 497
    const-string/jumbo v2, "from_notify"

    invoke-virtual {v1, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 499
    const-string/jumbo v2, "reset_main_page"

    invoke-virtual {v1, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 500
    const-string/jumbo v2, "fragment_index"

    invoke-virtual {v1, v2, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 501
    iget-object v2, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const/high16 v4, 0x10000000

    invoke-static {v2, v0, v1, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    iput-object v1, v3, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 503
    const/16 v1, 0x10

    iput v1, v3, Landroid/app/Notification;->flags:I

    .line 505
    invoke-direct {p0, v0, v3}, Lcom/qihoo/utils/notice/a;->a(ILandroid/app/Notification;)V

    .line 507
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 508
    const/16 v0, 0x7164

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto/16 :goto_0

    .line 510
    :cond_2
    const/16 v0, 0x4e46

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto/16 :goto_0
.end method

.method public a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Ljava/lang/String;)V
    .locals 7

    .prologue
    const/16 v6, 0x1007

    const/4 v5, 0x1

    .line 377
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/i;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 418
    :goto_0
    return-void

    .line 385
    :cond_0
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->d:Landroid/support/v4/app/y;

    invoke-virtual {v0, v6}, Landroid/support/v4/app/y;->a(I)V

    .line 387
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const v1, 0x7f0c01ff

    const v2, 0x7f080070

    invoke-static {v0, v1, v2, p2}, Lcom/qihoo360/mobilesafe/b/n;->a(Landroid/content/Context;IILjava/lang/String;)Landroid/text/SpannableString;

    move-result-object v0

    .line 389
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0200

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 391
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "sort_key_04"

    invoke-static {}, Lcom/qihoo/utils/notice/c;->a()Lcom/qihoo/utils/notice/c;

    move-result-object v4

    invoke-virtual {v4, p1}, Lcom/qihoo/utils/notice/c;->d(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v4

    invoke-direct {p0, v2, v3, v4}, Lcom/qihoo/utils/notice/a;->a(Ljava/lang/String;Ljava/lang/String;I)Landroid/app/Notification;

    move-result-object v2

    .line 394
    invoke-static {}, Lcom/qihoo/utils/notice/c;->a()Lcom/qihoo/utils/notice/c;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/qihoo/utils/notice/c;->b(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v3

    invoke-direct {p0, p1, v0, v1, v3}, Lcom/qihoo/utils/notice/a;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)Landroid/widget/RemoteViews;

    move-result-object v0

    iput-object v0, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 396
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const-class v3, Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-direct {v0, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 397
    const/high16 v1, 0x14000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 398
    const-string/jumbo v1, "fragment_index"

    invoke-virtual {v0, v1, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 399
    const-string/jumbo v1, "from_notify"

    invoke-virtual {v0, v1, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 401
    const-string/jumbo v1, "reset_main_page"

    invoke-virtual {v0, v1, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 402
    const-string/jumbo v1, "do_scan"

    invoke-virtual {v0, v1, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 403
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_CLEAN"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 404
    const-string/jumbo v1, "do_scan_size"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 405
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const/high16 v3, 0x10000000

    invoke-static {v1, v6, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, v2, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 408
    const/16 v0, 0x10

    iput v0, v2, Landroid/app/Notification;->flags:I

    .line 410
    invoke-direct {p0, v6, v2}, Lcom/qihoo/utils/notice/a;->a(ILandroid/app/Notification;)V

    .line 412
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 413
    const/16 v0, 0x7152

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 415
    :cond_1
    const/16 v0, 0x4e38

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p2}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method public a(Ljava/lang/String;)V
    .locals 9

    .prologue
    const/high16 v8, 0x10000000

    const/4 v7, 0x0

    const/16 v6, 0x1003

    .line 264
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/i;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 303
    :cond_0
    :goto_0
    return-void

    .line 268
    :cond_1
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/utils/notice/c;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 273
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->d:Landroid/support/v4/app/y;

    invoke-virtual {v0, v6}, Landroid/support/v4/app/y;->a(I)V

    .line 275
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c01fb

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v3, p1}, Lcom/qihoo360/mobilesafe/b/i;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v7

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 277
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c01fc

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 279
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "sort_key_02"

    invoke-static {}, Lcom/qihoo/utils/notice/c;->a()Lcom/qihoo/utils/notice/c;

    move-result-object v4

    sget-object v5, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {v4, v5}, Lcom/qihoo/utils/notice/c;->d(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v4

    invoke-direct {p0, v2, v3, v4}, Lcom/qihoo/utils/notice/a;->a(Ljava/lang/String;Ljava/lang/String;I)Landroid/app/Notification;

    move-result-object v2

    .line 282
    sget-object v3, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-direct {p0, v3, v0, v1, v7}, Lcom/qihoo/utils/notice/a;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)Landroid/widget/RemoteViews;

    move-result-object v0

    iput-object v0, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 284
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const-class v3, Lcom/qihoo/security/notify/NotificationActivity;

    invoke-direct {v0, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 285
    invoke-virtual {v0, v8}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 286
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_SAFE_APP"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 287
    const-string/jumbo v1, "pkg_name"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 289
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v1, v6, v0, v8}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, v2, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 291
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    const-string/jumbo v3, "com.qihoo.security.notify.ACTION_SAFE_APP"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v3, 0x8000000

    invoke-static {v0, v6, v1, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, v2, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 294
    const/16 v0, 0x10

    iput v0, v2, Landroid/app/Notification;->flags:I

    .line 296
    invoke-direct {p0, v6, v2}, Lcom/qihoo/utils/notice/a;->a(ILandroid/app/Notification;)V

    .line 298
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 299
    const/16 v0, 0x714e

    const-string/jumbo v1, ""

    invoke-static {v0, p1, v1}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 301
    :cond_2
    const/16 v0, 0x4e36

    const-string/jumbo v1, ""

    invoke-static {v0, p1, v1}, Lcom/qihoo/security/support/b;->a(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method public a(Ljava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v7, 0x1

    const/4 v5, 0x0

    const/16 v6, 0x1001

    .line 110
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/i;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 155
    :cond_0
    :goto_0
    return-void

    .line 115
    :cond_1
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/utils/notice/c;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 118
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 123
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->d:Landroid/support/v4/app/y;

    invoke-virtual {v0, v6}, Landroid/support/v4/app/y;->a(I)V

    .line 124
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c01f7

    new-array v3, v7, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v4, v0}, Lcom/qihoo360/mobilesafe/b/i;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v5

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 126
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const v2, 0x7f080071

    invoke-static {v1, v0, v2}, Lcom/qihoo360/mobilesafe/b/n;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/text/SpannableString;

    move-result-object v0

    .line 127
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c01f8

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 129
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "sort_key_01"

    invoke-static {}, Lcom/qihoo/utils/notice/c;->a()Lcom/qihoo/utils/notice/c;

    move-result-object v4

    sget-object v5, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {v4, v5}, Lcom/qihoo/utils/notice/c;->d(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v4

    invoke-direct {p0, v2, v3, v4}, Lcom/qihoo/utils/notice/a;->a(Ljava/lang/String;Ljava/lang/String;I)Landroid/app/Notification;

    move-result-object v2

    .line 132
    sget-object v3, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    const v4, 0x7f0200cc

    invoke-direct {p0, v3, v0, v1, v4}, Lcom/qihoo/utils/notice/a;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)Landroid/widget/RemoteViews;

    move-result-object v0

    iput-object v0, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 135
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const-class v3, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-direct {v0, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 136
    const/high16 v1, 0x14000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 137
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_MALWARE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 138
    const-string/jumbo v1, "from_notify"

    invoke-virtual {v0, v1, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 139
    const-string/jumbo v1, "size"

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 140
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const/high16 v3, 0x10000000

    invoke-static {v1, v6, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, v2, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 142
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    const-string/jumbo v3, "com.qihoo.security.notify.ACTION_MALWARE"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v3, 0x8000000

    invoke-static {v0, v6, v1, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, v2, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 145
    const/16 v0, 0x20

    iput v0, v2, Landroid/app/Notification;->flags:I

    .line 147
    invoke-direct {p0, v6, v2}, Lcom/qihoo/utils/notice/a;->a(ILandroid/app/Notification;)V

    .line 149
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 150
    const/16 v0, 0x714a

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    int-to-long v2, v1

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto/16 :goto_0

    .line 152
    :cond_2
    const/16 v0, 0x4e34

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    int-to-long v2, v1

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto/16 :goto_0
.end method

.method public b()V
    .locals 7

    .prologue
    const/16 v6, 0x1004

    .line 309
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/i;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 345
    :goto_0
    return-void

    .line 315
    :cond_0
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->d:Landroid/support/v4/app/y;

    invoke-virtual {v0, v6}, Landroid/support/v4/app/y;->a(I)V

    .line 317
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c01fd

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 318
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c01fe

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 320
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "sort_key_03"

    invoke-static {}, Lcom/qihoo/utils/notice/c;->a()Lcom/qihoo/utils/notice/c;

    move-result-object v4

    sget-object v5, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {v4, v5}, Lcom/qihoo/utils/notice/c;->d(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v4

    invoke-direct {p0, v2, v3, v4}, Lcom/qihoo/utils/notice/a;->a(Ljava/lang/String;Ljava/lang/String;I)Landroid/app/Notification;

    move-result-object v2

    .line 323
    sget-object v3, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    const/4 v4, 0x0

    invoke-direct {p0, v3, v0, v1, v4}, Lcom/qihoo/utils/notice/a;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)Landroid/widget/RemoteViews;

    move-result-object v0

    iput-object v0, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 325
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const-class v3, Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-direct {v0, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 326
    const/high16 v1, 0x14000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 327
    const-string/jumbo v1, "fragment_index"

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 328
    const-string/jumbo v1, "reset_main_page"

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 329
    const-string/jumbo v1, "custom_action"

    const/4 v3, 0x3

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 330
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_ANTIVIRUS_UPGRADE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 331
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const/high16 v3, 0x10000000

    invoke-static {v1, v6, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, v2, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 333
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    const-string/jumbo v3, "com.qihoo.security.notify.ACTION_ANTIVIRUS_UPGRADE"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v3, 0x8000000

    invoke-static {v0, v6, v1, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, v2, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 336
    const/16 v0, 0x10

    iput v0, v2, Landroid/app/Notification;->flags:I

    .line 338
    invoke-direct {p0, v6, v2}, Lcom/qihoo/utils/notice/a;->a(ILandroid/app/Notification;)V

    .line 340
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 341
    const/16 v0, 0x7150

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    goto/16 :goto_0

    .line 343
    :cond_1
    const/16 v0, 0x4e37

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    goto/16 :goto_0
.end method

.method public b(I)V
    .locals 1

    .prologue
    .line 1046
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->d:Landroid/support/v4/app/y;

    if-eqz v0, :cond_0

    .line 1047
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->d:Landroid/support/v4/app/y;

    invoke-virtual {v0, p1}, Landroid/support/v4/app/y;->a(I)V

    .line 1049
    :cond_0
    return-void
.end method

.method public b(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Ljava/lang/String;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 686
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/i;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 721
    :cond_0
    :goto_0
    return-void

    .line 690
    :cond_1
    const/16 v0, 0x100f

    .line 691
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 694
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/qihoo/utils/notice/c;->b(Landroid/content/Context;I)V

    .line 695
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->d:Landroid/support/v4/app/y;

    invoke-virtual {v1, v0}, Landroid/support/v4/app/y;->a(I)V

    .line 697
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0209

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 698
    iget-object v2, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c020a

    new-array v4, v6, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p2, v4, v5

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 700
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string/jumbo v4, "sort_key_05"

    invoke-static {}, Lcom/qihoo/utils/notice/c;->a()Lcom/qihoo/utils/notice/c;

    move-result-object v5

    invoke-virtual {v5, p1}, Lcom/qihoo/utils/notice/c;->d(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v5

    invoke-direct {p0, v3, v4, v5}, Lcom/qihoo/utils/notice/a;->a(Ljava/lang/String;Ljava/lang/String;I)Landroid/app/Notification;

    move-result-object v3

    .line 703
    invoke-static {}, Lcom/qihoo/utils/notice/c;->a()Lcom/qihoo/utils/notice/c;

    move-result-object v4

    invoke-virtual {v4, p1}, Lcom/qihoo/utils/notice/c;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v4

    invoke-direct {p0, p1, v1, v2, v4}, Lcom/qihoo/utils/notice/a;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)Landroid/widget/RemoteViews;

    move-result-object v1

    iput-object v1, v3, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 705
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const-class v4, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-direct {v1, v2, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 706
    const/high16 v2, 0x14000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 707
    const-string/jumbo v2, "com.qihoo.security.notify.ACTION_BATTERY_LOW"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 708
    const-string/jumbo v2, "from_notify"

    invoke-virtual {v1, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 710
    iget-object v2, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const/high16 v4, 0x10000000

    invoke-static {v2, v0, v1, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    iput-object v1, v3, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 712
    const/16 v1, 0x10

    iput v1, v3, Landroid/app/Notification;->flags:I

    .line 714
    invoke-direct {p0, v0, v3}, Lcom/qihoo/utils/notice/a;->a(ILandroid/app/Notification;)V

    .line 716
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 717
    const/16 v0, 0x715a

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    goto/16 :goto_0

    .line 719
    :cond_2
    const/16 v0, 0x4e3d

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    goto/16 :goto_0
.end method

.method public b(Ljava/lang/String;)V
    .locals 8

    .prologue
    const/high16 v7, 0x10000000

    const/16 v6, 0x100b

    .line 599
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->d:Landroid/support/v4/app/y;

    invoke-virtual {v0, v6}, Landroid/support/v4/app/y;->a(I)V

    .line 600
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c01bd

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 601
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c01be

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 602
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "sort_key_01"

    invoke-static {}, Lcom/qihoo/utils/notice/c;->a()Lcom/qihoo/utils/notice/c;

    move-result-object v4

    sget-object v5, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {v4, v5}, Lcom/qihoo/utils/notice/c;->d(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v4

    invoke-direct {p0, v2, v3, v4}, Lcom/qihoo/utils/notice/a;->a(Ljava/lang/String;Ljava/lang/String;I)Landroid/app/Notification;

    move-result-object v2

    .line 605
    sget-object v3, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    const/4 v4, 0x0

    invoke-direct {p0, v3, v0, v1, v4}, Lcom/qihoo/utils/notice/a;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)Landroid/widget/RemoteViews;

    move-result-object v0

    iput-object v0, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 607
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 608
    new-instance v1, Landroid/content/Intent;

    const-string/jumbo v3, "android.intent.action.VIEW"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 609
    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    const-string/jumbo v3, "application/vnd.android.package-archive"

    invoke-virtual {v1, v0, v3}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 610
    invoke-virtual {v1, v7}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 611
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const/16 v3, 0x1009

    invoke-static {v0, v3, v1, v7}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, v2, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 613
    const/16 v0, 0x10

    iput v0, v2, Landroid/app/Notification;->flags:I

    .line 614
    invoke-direct {p0, v6, v2}, Lcom/qihoo/utils/notice/a;->a(ILandroid/app/Notification;)V

    .line 615
    return-void
.end method

.method public b(Ljava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v7, 0x1

    const/4 v5, 0x0

    const/16 v6, 0x1002

    .line 164
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/i;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 205
    :cond_0
    :goto_0
    return-void

    .line 168
    :cond_1
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/utils/notice/c;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 171
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 176
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->d:Landroid/support/v4/app/y;

    invoke-virtual {v0, v6}, Landroid/support/v4/app/y;->a(I)V

    .line 177
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c01f9

    new-array v3, v7, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v4, v0}, Lcom/qihoo360/mobilesafe/b/i;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v5

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 179
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const v2, 0x7f080070

    invoke-static {v1, v0, v2}, Lcom/qihoo360/mobilesafe/b/n;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/text/SpannableString;

    move-result-object v0

    .line 180
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c01fa

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 182
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "sort_key_03"

    invoke-static {}, Lcom/qihoo/utils/notice/c;->a()Lcom/qihoo/utils/notice/c;

    move-result-object v4

    sget-object v5, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {v4, v5}, Lcom/qihoo/utils/notice/c;->d(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v4

    invoke-direct {p0, v2, v3, v4}, Lcom/qihoo/utils/notice/a;->a(Ljava/lang/String;Ljava/lang/String;I)Landroid/app/Notification;

    move-result-object v2

    .line 185
    sget-object v3, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    const v4, 0x7f0200cd

    invoke-direct {p0, v3, v0, v1, v4}, Lcom/qihoo/utils/notice/a;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)Landroid/widget/RemoteViews;

    move-result-object v0

    iput-object v0, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 188
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const-class v3, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-direct {v0, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 189
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_RISKY_APP"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 190
    const-string/jumbo v1, "from_notify"

    invoke-virtual {v0, v1, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 191
    const-string/jumbo v1, "size"

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 192
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const/high16 v3, 0x10000000

    invoke-static {v1, v6, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, v2, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 194
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    const-string/jumbo v3, "com.qihoo.security.notify.ACTION_RISKY_APP"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v3, 0x8000000

    invoke-static {v0, v6, v1, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, v2, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 198
    invoke-direct {p0, v6, v2}, Lcom/qihoo/utils/notice/a;->a(ILandroid/app/Notification;)V

    .line 200
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 201
    const/16 v0, 0x714c

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    int-to-long v2, v1

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto/16 :goto_0

    .line 203
    :cond_2
    const/16 v0, 0x4e35

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    int-to-long v2, v1

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto/16 :goto_0
.end method

.method public c()V
    .locals 6

    .prologue
    const/16 v5, 0x100a

    const/4 v4, 0x0

    .line 572
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->d:Landroid/support/v4/app/y;

    invoke-virtual {v0, v5}, Landroid/support/v4/app/y;->a(I)V

    .line 573
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->e:Landroid/app/Notification;

    if-nez v0, :cond_0

    .line 574
    invoke-direct {p0}, Lcom/qihoo/utils/notice/a;->f()V

    .line 576
    :cond_0
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->e:Landroid/app/Notification;

    iget-object v0, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    const v1, 0x7f0b019a

    iget-object v2, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c0175

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 578
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->e:Landroid/app/Notification;

    iget-object v0, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    const v1, 0x7f0b0108

    const/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v4, v4}, Landroid/widget/RemoteViews;->setProgressBar(IIIZ)V

    .line 579
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->e:Landroid/app/Notification;

    iget-object v0, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    const v1, 0x7f0b0198

    const-string/jumbo v2, "0%"

    invoke-virtual {v0, v1, v2}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    .line 580
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->e:Landroid/app/Notification;

    invoke-direct {p0, v5, v0}, Lcom/qihoo/utils/notice/a;->a(ILandroid/app/Notification;)V

    .line 581
    return-void
.end method

.method public c(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Ljava/lang/String;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 727
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/i;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 762
    :cond_0
    :goto_0
    return-void

    .line 731
    :cond_1
    const/16 v0, 0x1010

    .line 732
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 735
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/qihoo/utils/notice/c;->b(Landroid/content/Context;I)V

    .line 736
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->d:Landroid/support/v4/app/y;

    invoke-virtual {v1, v0}, Landroid/support/v4/app/y;->a(I)V

    .line 738
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0205

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 739
    iget-object v2, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c0206

    new-array v4, v6, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object p2, v4, v5

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 741
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string/jumbo v4, "sort_key_05"

    invoke-static {}, Lcom/qihoo/utils/notice/c;->a()Lcom/qihoo/utils/notice/c;

    move-result-object v5

    invoke-virtual {v5, p1}, Lcom/qihoo/utils/notice/c;->d(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v5

    invoke-direct {p0, v3, v4, v5}, Lcom/qihoo/utils/notice/a;->a(Ljava/lang/String;Ljava/lang/String;I)Landroid/app/Notification;

    move-result-object v3

    .line 744
    invoke-static {}, Lcom/qihoo/utils/notice/c;->a()Lcom/qihoo/utils/notice/c;

    move-result-object v4

    invoke-virtual {v4, p1}, Lcom/qihoo/utils/notice/c;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v4

    invoke-direct {p0, p1, v1, v2, v4}, Lcom/qihoo/utils/notice/a;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)Landroid/widget/RemoteViews;

    move-result-object v1

    iput-object v1, v3, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 746
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const-class v4, Lcom/qihoo/security/ui/opti/sysclear/PowerActivity;

    invoke-direct {v1, v2, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 747
    const/high16 v2, 0x14000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 748
    const-string/jumbo v2, "com.qihoo.security.notify.ACTION_BATTERY_LOW_POWER_REMIND"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 749
    const-string/jumbo v2, "from_notify"

    invoke-virtual {v1, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 751
    iget-object v2, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const/high16 v4, 0x10000000

    invoke-static {v2, v0, v1, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    iput-object v1, v3, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 753
    const/16 v1, 0x10

    iput v1, v3, Landroid/app/Notification;->flags:I

    .line 755
    invoke-direct {p0, v0, v3}, Lcom/qihoo/utils/notice/a;->a(ILandroid/app/Notification;)V

    .line 757
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 758
    const/16 v0, 0x715c

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    goto/16 :goto_0

    .line 760
    :cond_2
    const/16 v0, 0x4e41

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    goto/16 :goto_0
.end method

.method public c(Ljava/lang/String;)V
    .locals 8

    .prologue
    const/16 v7, 0x100c

    const/4 v6, 0x0

    .line 618
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->d:Landroid/support/v4/app/y;

    invoke-virtual {v0, v7}, Landroid/support/v4/app/y;->a(I)V

    .line 619
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const v1, 0x7f0c0173

    const v2, 0x7f08006f

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/b/n;->a(Landroid/content/Context;II)Landroid/text/SpannableString;

    move-result-object v0

    .line 621
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0174

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 622
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "sort_key_01"

    invoke-static {}, Lcom/qihoo/utils/notice/c;->a()Lcom/qihoo/utils/notice/c;

    move-result-object v4

    sget-object v5, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {v4, v5}, Lcom/qihoo/utils/notice/c;->d(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v4

    invoke-direct {p0, v2, v3, v4}, Lcom/qihoo/utils/notice/a;->a(Ljava/lang/String;Ljava/lang/String;I)Landroid/app/Notification;

    move-result-object v2

    .line 624
    sget-object v3, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-direct {p0, v3, v0, v1, v6}, Lcom/qihoo/utils/notice/a;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)Landroid/widget/RemoteViews;

    move-result-object v0

    iput-object v0, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 626
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const-class v3, Lcom/qihoo/security/v5/UpdatedDialog;

    invoke-direct {v0, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 627
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 628
    const-string/jumbo v3, "FromNotify"

    const/4 v4, 0x1

    invoke-virtual {v1, v3, v4}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 629
    const-string/jumbo v3, "type"

    invoke-virtual {v1, v3, v6}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 630
    const-string/jumbo v3, "path"

    invoke-virtual {v1, v3, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 631
    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 632
    const-string/jumbo v1, "com.qihoo.security.action.ACTION_SHOW_NEW_VERSION_DIALOG"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 634
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const/16 v3, 0x1009

    const/high16 v4, 0x10000000

    invoke-static {v1, v3, v0, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, v2, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 636
    const/16 v0, 0x10

    iput v0, v2, Landroid/app/Notification;->flags:I

    .line 637
    invoke-direct {p0, v7, v2}, Lcom/qihoo/utils/notice/a;->a(ILandroid/app/Notification;)V

    .line 638
    return-void
.end method

.method public c(Ljava/util/ArrayList;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v7, 0x1

    const/4 v5, 0x0

    const/16 v6, 0x100d

    .line 214
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/i;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 255
    :cond_0
    :goto_0
    return-void

    .line 218
    :cond_1
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/utils/notice/c;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 221
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 226
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->d:Landroid/support/v4/app/y;

    invoke-virtual {v0, v6}, Landroid/support/v4/app/y;->a(I)V

    .line 227
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0203

    new-array v3, v7, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v4, v0}, Lcom/qihoo360/mobilesafe/b/i;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v3, v5

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 229
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const v2, 0x7f080070

    invoke-static {v1, v0, v2}, Lcom/qihoo360/mobilesafe/b/n;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/text/SpannableString;

    move-result-object v0

    .line 230
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0204

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 232
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string/jumbo v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string/jumbo v3, "sort_key_03"

    invoke-static {}, Lcom/qihoo/utils/notice/c;->a()Lcom/qihoo/utils/notice/c;

    move-result-object v4

    sget-object v5, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {v4, v5}, Lcom/qihoo/utils/notice/c;->d(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v4

    invoke-direct {p0, v2, v3, v4}, Lcom/qihoo/utils/notice/a;->a(Ljava/lang/String;Ljava/lang/String;I)Landroid/app/Notification;

    move-result-object v2

    .line 235
    sget-object v3, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->NEED_OPTIMIZE:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    const v4, 0x7f0200cd

    invoke-direct {p0, v3, v0, v1, v4}, Lcom/qihoo/utils/notice/a;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)Landroid/widget/RemoteViews;

    move-result-object v0

    iput-object v0, v2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 238
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const-class v3, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-direct {v0, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 239
    const-string/jumbo v1, "com.qihoo.security.notify.ACTION_ADV_APP"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 240
    const-string/jumbo v1, "from_notify"

    invoke-virtual {v0, v1, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 241
    const-string/jumbo v1, "size"

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 242
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const/high16 v3, 0x10000000

    invoke-static {v1, v6, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, v2, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 244
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    new-instance v1, Landroid/content/Intent;

    const-string/jumbo v3, "com.qihoo.security.notify.ACTION_ADV_APP"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v3, 0x8000000

    invoke-static {v0, v6, v1, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    iput-object v0, v2, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 248
    invoke-direct {p0, v6, v2}, Lcom/qihoo/utils/notice/a;->a(ILandroid/app/Notification;)V

    .line 250
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 251
    const/16 v0, 0x7158

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    int-to-long v2, v1

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto/16 :goto_0

    .line 253
    :cond_2
    const/16 v0, 0x4e3b

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    int-to-long v2, v1

    invoke-static {v0, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    goto/16 :goto_0
.end method

.method public d()V
    .locals 2

    .prologue
    .line 595
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->d:Landroid/support/v4/app/y;

    const/16 v1, 0x100a

    invoke-virtual {v0, v1}, Landroid/support/v4/app/y;->a(I)V

    .line 596
    return-void
.end method

.method public d(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Ljava/lang/String;)V
    .locals 7

    .prologue
    const/4 v6, 0x1

    .line 768
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/i;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 804
    :cond_0
    :goto_0
    return-void

    .line 772
    :cond_1
    const/16 v0, 0x1011

    .line 773
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;I)Z

    move-result v1

    if-nez v1, :cond_0

    .line 776
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/qihoo/utils/notice/c;->b(Landroid/content/Context;I)V

    .line 777
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->d:Landroid/support/v4/app/y;

    invoke-virtual {v1, v0}, Landroid/support/v4/app/y;->a(I)V

    .line 779
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0207

    new-array v3, v6, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v5, p2}, Lcom/qihoo360/mobilesafe/b/i;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 781
    iget-object v2, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c0208

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 783
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string/jumbo v4, " "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string/jumbo v4, "sort_key_05"

    invoke-static {}, Lcom/qihoo/utils/notice/c;->a()Lcom/qihoo/utils/notice/c;

    move-result-object v5

    invoke-virtual {v5, p1}, Lcom/qihoo/utils/notice/c;->d(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v5

    invoke-direct {p0, v3, v4, v5}, Lcom/qihoo/utils/notice/a;->a(Ljava/lang/String;Ljava/lang/String;I)Landroid/app/Notification;

    move-result-object v3

    .line 786
    invoke-static {}, Lcom/qihoo/utils/notice/c;->a()Lcom/qihoo/utils/notice/c;

    move-result-object v4

    invoke-virtual {v4, p1}, Lcom/qihoo/utils/notice/c;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v4

    invoke-direct {p0, p1, v1, v2, v4}, Lcom/qihoo/utils/notice/a;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)Landroid/widget/RemoteViews;

    move-result-object v1

    iput-object v1, v3, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 788
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const-class v4, Lcom/qihoo/security/ui/opti/sysclear/ProcessClearActivity;

    invoke-direct {v1, v2, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 789
    const/high16 v2, 0x14000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 790
    const-string/jumbo v2, "com.qihoo.security.notify.ACTION_POWER_REMIND"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 791
    const-string/jumbo v2, "from_notify"

    invoke-virtual {v1, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 793
    iget-object v2, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const/high16 v4, 0x10000000

    invoke-static {v2, v0, v1, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    iput-object v1, v3, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 795
    const/16 v1, 0x10

    iput v1, v3, Landroid/app/Notification;->flags:I

    .line 797
    invoke-direct {p0, v0, v3}, Lcom/qihoo/utils/notice/a;->a(ILandroid/app/Notification;)V

    .line 799
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 800
    const/16 v0, 0x715e

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    goto/16 :goto_0

    .line 802
    :cond_2
    const/16 v0, 0x4e42

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    goto/16 :goto_0
.end method

.method public e()V
    .locals 9

    .prologue
    const/16 v8, 0x4e3c

    const/4 v7, 0x1

    const/16 v6, 0x100e

    .line 644
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/i;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 680
    :goto_0
    return-void

    .line 648
    :cond_0
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->d:Landroid/support/v4/app/y;

    invoke-virtual {v0, v6}, Landroid/support/v4/app/y;->a(I)V

    .line 650
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c0066

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 651
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c0067

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 652
    iget-object v2, p0, Lcom/qihoo/utils/notice/a;->c:Lcom/qihoo/security/locale/d;

    const v3, 0x7f0c0068

    invoke-virtual {v2, v3}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 654
    const-string/jumbo v3, "sort_key_04"

    invoke-static {}, Lcom/qihoo/utils/notice/c;->a()Lcom/qihoo/utils/notice/c;

    move-result-object v4

    sget-object v5, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {v4, v5}, Lcom/qihoo/utils/notice/c;->d(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;)I

    move-result v4

    invoke-direct {p0, v0, v3, v4}, Lcom/qihoo/utils/notice/a;->a(Ljava/lang/String;Ljava/lang/String;I)Landroid/app/Notification;

    move-result-object v0

    .line 657
    sget-object v3, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    const/4 v4, 0x0

    invoke-direct {p0, v3, v1, v2, v4}, Lcom/qihoo/utils/notice/a;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Ljava/lang/CharSequence;Ljava/lang/CharSequence;I)Landroid/widget/RemoteViews;

    move-result-object v1

    iput-object v1, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 659
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const-class v3, Lcom/qihoo/security/ui/main/HomeActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 660
    const/high16 v2, 0x14000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 661
    const-string/jumbo v2, "fragment_index"

    invoke-virtual {v1, v2, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 662
    const-string/jumbo v2, "from_notify"

    invoke-virtual {v1, v2, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 664
    const-string/jumbo v2, "reset_main_page"

    invoke-virtual {v1, v2, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 665
    const-string/jumbo v2, "com.qihoo.security.notify.ACTION_WEEKLY_CLEAN_TIP"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 666
    iget-object v2, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    const/high16 v3, 0x10000000

    invoke-static {v2, v6, v1, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    iput-object v1, v0, Landroid/app/Notification;->contentIntent:Landroid/app/PendingIntent;

    .line 668
    iget-object v1, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    new-instance v2, Landroid/content/Intent;

    const-string/jumbo v3, "com.qihoo.security.notify.ACTION_ANTIVIRUS_UPGRADE"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v3, 0x8000000

    invoke-static {v1, v6, v2, v3}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    iput-object v1, v0, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 671
    const/16 v1, 0x10

    iput v1, v0, Landroid/app/Notification;->flags:I

    .line 673
    invoke-direct {p0, v6, v0}, Lcom/qihoo/utils/notice/a;->a(ILandroid/app/Notification;)V

    .line 675
    iget-object v0, p0, Lcom/qihoo/utils/notice/a;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 676
    invoke-static {v8}, Lcom/qihoo/security/support/b;->b(I)V

    goto/16 :goto_0

    .line 678
    :cond_1
    invoke-static {v8}, Lcom/qihoo/security/support/b;->b(I)V

    goto/16 :goto_0
.end method
