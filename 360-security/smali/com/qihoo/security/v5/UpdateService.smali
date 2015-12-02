.class public Lcom/qihoo/security/v5/UpdateService;
.super Lcom/qihoo/security/app/UiProcessService;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/v5/UpdateService$a;
    }
.end annotation


# static fields
.field private static j:Lcom/qihoo/security/clearengine/b/a$a;


# instance fields
.field private c:I

.field private d:I

.field private e:Lcom/qihoo/security/v5/b;

.field private f:Z

.field private final g:Landroid/os/IBinder;

.field private h:J

.field private i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final k:Landroid/content/BroadcastReceiver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 91
    new-instance v0, Lcom/qihoo/security/v5/UpdateService$1;

    invoke-direct {v0}, Lcom/qihoo/security/v5/UpdateService$1;-><init>()V

    sput-object v0, Lcom/qihoo/security/v5/UpdateService;->j:Lcom/qihoo/security/clearengine/b/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 66
    invoke-direct {p0}, Lcom/qihoo/security/app/UiProcessService;-><init>()V

    .line 72
    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/v5/UpdateService;->c:I

    .line 80
    new-instance v0, Lcom/qihoo/security/v5/UpdateService$a;

    invoke-direct {v0, p0}, Lcom/qihoo/security/v5/UpdateService$a;-><init>(Lcom/qihoo/security/v5/UpdateService;)V

    iput-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->g:Landroid/os/IBinder;

    .line 83
    invoke-static {}, Lcom/google/android/collect/Maps;->newHashMap()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->i:Ljava/util/Map;

    .line 107
    new-instance v0, Lcom/qihoo/security/v5/UpdateService$2;

    invoke-direct {v0, p0}, Lcom/qihoo/security/v5/UpdateService$2;-><init>(Lcom/qihoo/security/v5/UpdateService;)V

    iput-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->k:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    return-object v0
.end method

.method public static a()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 697
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "setting_auto_update"

    invoke-static {v0, v1, v7}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 708
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 709
    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v0

    .line 713
    rem-int/lit8 v0, v0, 0x1e

    if-nez v0, :cond_2

    .line 751
    :cond_1
    :goto_0
    return-void

    .line 717
    :cond_2
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    .line 724
    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0}, Lcom/qihoo/security/locale/d;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lcom/qihoo/security/v5/UpdateService;->j:Lcom/qihoo/security/clearengine/b/a$a;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/qihoo/security/clearengine/b/a;->a(Landroid/content/Context;Ljava/util/List;ILjava/lang/String;Lcom/qihoo/security/clearengine/b/a$a;)V

    .line 728
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v1

    const-string/jumbo v2, "sp.key.update.check.timestp"

    const-wide/16 v4, 0x0

    invoke-static {v1, v2, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v2

    .line 730
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 736
    cmp-long v1, v4, v2

    if-lez v1, :cond_3

    sub-long v2, v4, v2

    const-wide/32 v4, 0x5265c00

    cmp-long v1, v2, v4

    if-lez v1, :cond_1

    .line 741
    :cond_3
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/qihoo/security/v5/UpdateService;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 742
    const-string/jumbo v2, "com.qihoo.security.action.ACTION_CHECK_UPDATE"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 743
    const-string/jumbo v2, "update_in_background"

    invoke-virtual {v1, v2, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 744
    const-string/jumbo v2, "key_malware_is_avc"

    invoke-static {v0, v2, v6}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 745
    const-string/jumbo v2, "type"

    const/16 v3, 0x3ea

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 749
    :goto_1
    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0

    .line 747
    :cond_4
    const-string/jumbo v2, "type"

    invoke-virtual {v1, v2, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    goto :goto_1
.end method

.method private a(ILandroid/content/Intent;)V
    .locals 6

    .prologue
    .line 807
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 808
    const-string/jumbo v1, "i18ntype"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 809
    invoke-static {p0}, Lcom/qihoo/security/locale/c;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/qihoo/security/v5/UpdateService;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 810
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    .line 811
    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v3}, Lcom/qihoo/security/v5/UpdateService;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 812
    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/qihoo/security/v5/UpdateService;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 813
    const-string/jumbo v4, "applang"

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 814
    const-string/jumbo v1, "syslang1"

    invoke-virtual {v0, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 815
    const-string/jumbo v1, "syslang2"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 820
    sparse-switch p1, :sswitch_data_0

    .line 848
    :goto_0
    :sswitch_0
    invoke-static {}, Lcom/qihoo/security/v5/c;->a()Ljava/lang/String;

    move-result-object v1

    .line 852
    iget-object v2, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    const/4 v3, 0x3

    invoke-static {v2, v3, v1, v0}, Lcom/qihoo/security/v5/c;->a(Landroid/content/Context;ILjava/lang/String;Ljava/util/HashMap;)I

    move-result v0

    .line 853
    invoke-direct {p0}, Lcom/qihoo/security/v5/UpdateService;->e()V

    .line 854
    const/16 v1, 0x698d

    int-to-long v2, v0

    invoke-static {v1, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    .line 855
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/qihoo/security/v5/UpdateService;->h:J

    .line 860
    if-nez v0, :cond_0

    .line 861
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    const-string/jumbo v2, "sp.key.update.check.timestp"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v1, v2, v4, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 863
    iput p1, p0, Lcom/qihoo/security/v5/UpdateService;->c:I

    .line 866
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService;->e:Lcom/qihoo/security/v5/b;

    if-eqz v1, :cond_1

    invoke-direct {p0}, Lcom/qihoo/security/v5/UpdateService;->g()Z

    move-result v1

    if-nez v1, :cond_1

    .line 867
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService;->e:Lcom/qihoo/security/v5/b;

    invoke-interface {v1, v0}, Lcom/qihoo/security/v5/b;->a(I)V

    .line 888
    :goto_1
    return-void

    .line 823
    :sswitch_1
    const/16 v1, 0x6994

    invoke-static {v1}, Lcom/qihoo/security/support/b;->b(I)V

    goto :goto_0

    .line 833
    :sswitch_2
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    const/4 v2, 0x0

    const/16 v3, 0x8

    iget-object v4, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    invoke-static {v4}, Lcom/qihoo/security/locale/d;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/qihoo/security/v5/UpdateService;->j:Lcom/qihoo/security/clearengine/b/a$a;

    invoke-static {v1, v2, v3, v4, v5}, Lcom/qihoo/security/clearengine/b/a;->a(Landroid/content/Context;Ljava/util/List;ILjava/lang/String;Lcom/qihoo/security/clearengine/b/a$a;)V

    goto :goto_0

    .line 872
    :cond_1
    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_1

    .line 882
    :pswitch_1
    invoke-direct {p0}, Lcom/qihoo/security/v5/UpdateService;->c()V

    goto :goto_1

    .line 874
    :pswitch_2
    invoke-direct {p0}, Lcom/qihoo/security/v5/UpdateService;->d()V

    goto :goto_1

    .line 878
    :pswitch_3
    invoke-direct {p0}, Lcom/qihoo/security/v5/UpdateService;->c()V

    goto :goto_1

    .line 820
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x7d1 -> :sswitch_0
        0xbb9 -> :sswitch_2
        0xfa1 -> :sswitch_0
    .end sparse-switch

    .line 872
    :pswitch_data_0
    .packed-switch -0x3
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method private a(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 687
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/v5/UpdatedDialog;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 688
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 689
    if-eqz p1, :cond_0

    .line 690
    invoke-virtual {v0, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 692
    :cond_0
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 693
    return-void
.end method

.method private a(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 777
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Lcom/qihoo/security/v5/UpdateService;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string/jumbo v2, "v5/saved/info"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/os/Bundle;Ljava/lang/String;)Z

    .line 779
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    const-string/jumbo v1, "skfutv"

    invoke-static {v0, v1, p2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 780
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/v5/UpdateService;Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0, p1}, Lcom/qihoo/security/v5/UpdateService;->a(Landroid/os/Bundle;)V

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/v5/UpdateService;Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/v5/UpdateService;->a(Landroid/os/Bundle;Ljava/lang/String;)V

    return-void
.end method

.method private a(ILjava/lang/String;)Z
    .locals 1

    .prologue
    .line 434
    const/16 v0, 0xbba

    if-eq p1, v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    const/4 v0, 0x1

    .line 438
    :goto_0
    return v0

    .line 434
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lcom/qihoo/security/v5/UpdateService;ILjava/lang/String;)Z
    .locals 1

    .prologue
    .line 66
    invoke-direct {p0, p1, p2}, Lcom/qihoo/security/v5/UpdateService;->a(ILjava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 791
    if-nez p1, :cond_0

    .line 792
    const-string/jumbo v0, ""

    .line 795
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private b()V
    .locals 4

    .prologue
    .line 660
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 661
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.INSTALL_NOTICE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 662
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.UPDATE_NOTICE"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 663
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.PATCH_FILE_NOTIFY"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 664
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.UPDATED_FILE_NOTIFY"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 665
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.APK_PATCH_ERROR"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 666
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.CONNECT_RETRY"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 667
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_BEGIN"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 668
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_END"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 669
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_INI"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 670
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.DATA_FILE_PROGRESS"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 671
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.ERROR"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 672
    const-string/jumbo v1, "com.qihoo.antivirus.update.action.UPDATE_CHECK_OVER"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 673
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService;->k:Landroid/content/BroadcastReceiver;

    const-string/jumbo v2, "com.qihoo.security.lite.PERMISSION"

    const/4 v3, 0x0

    invoke-virtual {p0, v1, v0, v2, v3}, Lcom/qihoo/security/v5/UpdateService;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 678
    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/v5/UpdateService;)V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0}, Lcom/qihoo/security/v5/UpdateService;->d()V

    return-void
.end method

.method static synthetic c(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    return-object v0
.end method

.method private c()V
    .locals 3

    .prologue
    .line 754
    iget v0, p0, Lcom/qihoo/security/v5/UpdateService;->c:I

    const/16 v1, 0xbb9

    if-eq v0, v1, :cond_1

    .line 764
    :cond_0
    :goto_0
    return-void

    .line 757
    :cond_1
    invoke-direct {p0}, Lcom/qihoo/security/v5/UpdateService;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 759
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/a;->d(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 760
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c0188

    const v2, 0x7f020142

    invoke-virtual {v0, v1, v2}, Lcom/qihoo360/mobilesafe/b/q;->a(II)V

    goto :goto_0
.end method

.method static synthetic d(Lcom/qihoo/security/v5/UpdateService;)I
    .locals 1

    .prologue
    .line 66
    iget v0, p0, Lcom/qihoo/security/v5/UpdateService;->c:I

    return v0
.end method

.method private d()V
    .locals 3

    .prologue
    .line 783
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Lcom/qihoo/security/v5/UpdateService;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string/jumbo v2, "v5/saved/info"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 784
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 785
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 787
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    const-string/jumbo v1, "skfutv"

    const-string/jumbo v2, "0.0.0.0"

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 788
    return-void
.end method

.method private e()V
    .locals 4

    .prologue
    .line 891
    invoke-static {p0}, Lcom/qihoo/security/locale/language/b;->d(Landroid/content/Context;)I

    move-result v0

    .line 892
    const/16 v1, 0x698c

    int-to-long v2, v0

    invoke-static {v1, v2, v3}, Lcom/qihoo/security/support/b;->a(IJ)V

    .line 894
    return-void
.end method

.method static synthetic e(Lcom/qihoo/security/v5/UpdateService;)Z
    .locals 1

    .prologue
    .line 66
    invoke-direct {p0}, Lcom/qihoo/security/v5/UpdateService;->f()Z

    move-result v0

    return v0
.end method

.method static synthetic f(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    return-object v0
.end method

.method private f()Z
    .locals 1

    .prologue
    .line 897
    iget-boolean v0, p0, Lcom/qihoo/security/v5/UpdateService;->f:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic g(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    return-object v0
.end method

.method private g()Z
    .locals 2

    .prologue
    .line 907
    iget v0, p0, Lcom/qihoo/security/v5/UpdateService;->c:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/qihoo/security/v5/UpdateService;->c:I

    const/16 v1, 0xbb9

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/qihoo/security/v5/UpdateService;->c:I

    const/16 v1, 0x3ea

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private h()V
    .locals 3

    .prologue
    .line 916
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 917
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    const-string/jumbo v1, "i18n_security_lite"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/qihoo/antivirus/update/b;->a(Landroid/content/Context;Ljava/lang/String;I)I

    .line 920
    :cond_0
    return-void
.end method

.method static synthetic h(Lcom/qihoo/security/v5/UpdateService;)V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0}, Lcom/qihoo/security/v5/UpdateService;->h()V

    return-void
.end method

.method static synthetic i(Lcom/qihoo/security/v5/UpdateService;)Lcom/qihoo/security/v5/b;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->e:Lcom/qihoo/security/v5/b;

    return-object v0
.end method

.method static synthetic j(Lcom/qihoo/security/v5/UpdateService;)Z
    .locals 1

    .prologue
    .line 66
    invoke-direct {p0}, Lcom/qihoo/security/v5/UpdateService;->g()Z

    move-result v0

    return v0
.end method

.method static synthetic k(Lcom/qihoo/security/v5/UpdateService;)V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0}, Lcom/qihoo/security/v5/UpdateService;->c()V

    return-void
.end method

.method static synthetic l(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic m(Lcom/qihoo/security/v5/UpdateService;)I
    .locals 1

    .prologue
    .line 66
    iget v0, p0, Lcom/qihoo/security/v5/UpdateService;->d:I

    return v0
.end method

.method static synthetic n(Lcom/qihoo/security/v5/UpdateService;)I
    .locals 2

    .prologue
    .line 66
    iget v0, p0, Lcom/qihoo/security/v5/UpdateService;->d:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/qihoo/security/v5/UpdateService;->d:I

    return v0
.end method

.method static synthetic o(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic p(Lcom/qihoo/security/v5/UpdateService;)Ljava/util/Map;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->i:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic q(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic r(Lcom/qihoo/security/v5/UpdateService;)J
    .locals 2

    .prologue
    .line 66
    iget-wide v0, p0, Lcom/qihoo/security/v5/UpdateService;->h:J

    return-wide v0
.end method

.method static synthetic s(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic t(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic u(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic v(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic w(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic x(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic y(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic z(Lcom/qihoo/security/v5/UpdateService;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/qihoo/security/v5/b;)V
    .locals 0

    .prologue
    .line 912
    iput-object p1, p0, Lcom/qihoo/security/v5/UpdateService;->e:Lcom/qihoo/security/v5/b;

    .line 913
    return-void
.end method

.method protected a(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 460
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 586
    :cond_0
    :goto_0
    return-void

    .line 464
    :cond_1
    const-string/jumbo v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 466
    const-string/jumbo v1, "o_c_spb.dat"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string/jumbo v1, "lock_screen.dat"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string/jumbo v1, "locale.dat"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 469
    :cond_2
    new-instance v1, Landroid/content/Intent;

    const-string/jumbo v2, "com.qihoo.security.action.RELOAD_CONFIG"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 470
    const-string/jumbo v2, "CONFIG_FILENAME"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 471
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_0

    .line 475
    :cond_3
    sget-object v1, Lcom/qihoo/security/env/a;->d:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 477
    new-instance v1, Lcom/qihoo/security/v5/UpdateService$3;

    invoke-direct {v1, p0, v0}, Lcom/qihoo/security/v5/UpdateService$3;-><init>(Lcom/qihoo/security/v5/UpdateService;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/qihoo/security/v5/UpdateService$3;->start()V

    goto :goto_0

    .line 537
    :cond_4
    const-string/jumbo v1, "root.conf"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 538
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/qihoo360/common/utils/Utils;->openLatestInputFile(Landroid/content/Context;Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v4

    .line 539
    const/4 v0, 0x0

    .line 540
    if-eqz v4, :cond_6

    .line 541
    const/4 v3, 0x0

    .line 543
    :try_start_0
    new-instance v2, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, v4}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v2, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 544
    :try_start_1
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    .line 545
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v3, "1"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_7
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result v1

    if-eqz v1, :cond_5

    .line 546
    const/4 v0, 0x1

    .line 551
    :cond_5
    if-eqz v2, :cond_7

    .line 553
    :try_start_2
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_5

    .line 566
    :cond_6
    :goto_1
    iget-object v1, p0, Lcom/qihoo/security/v5/UpdateService;->b:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/qihoo360/mobilesafe/support/a;->a(Landroid/content/Context;Z)V

    goto/16 :goto_0

    .line 559
    :cond_7
    :try_start_3
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1

    .line 560
    :catch_0
    move-exception v1

    goto :goto_1

    .line 548
    :catch_1
    move-exception v1

    move-object v2, v3

    .line 549
    :goto_2
    :try_start_4
    const-string/jumbo v3, "V5UpdateService"

    const-string/jumbo v5, " load cfg fail "

    invoke-static {v3, v5, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 551
    if-eqz v2, :cond_8

    .line 553
    :try_start_5
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_1

    .line 554
    :catch_2
    move-exception v1

    goto :goto_1

    .line 559
    :cond_8
    :try_start_6
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_1

    .line 560
    :catch_3
    move-exception v1

    goto :goto_1

    .line 551
    :catchall_0
    move-exception v0

    move-object v2, v3

    :goto_3
    if-eqz v2, :cond_9

    .line 553
    :try_start_7
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6

    .line 562
    :goto_4
    throw v0

    .line 559
    :cond_9
    :try_start_8
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4

    goto :goto_4

    .line 560
    :catch_4
    move-exception v1

    goto :goto_4

    .line 571
    :cond_a
    const-string/jumbo v1, "c_t.config"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 572
    new-instance v0, Lcom/qihoo/security/v5/UpdateService$4;

    invoke-direct {v0, p0}, Lcom/qihoo/security/v5/UpdateService$4;-><init>(Lcom/qihoo/security/v5/UpdateService;)V

    invoke-virtual {v0}, Lcom/qihoo/security/v5/UpdateService$4;->start()V

    goto/16 :goto_0

    .line 554
    :catch_5
    move-exception v1

    goto :goto_1

    :catch_6
    move-exception v1

    goto :goto_4

    .line 551
    :catchall_1
    move-exception v0

    goto :goto_3

    .line 548
    :catch_7
    move-exception v1

    goto :goto_2
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    .prologue
    .line 631
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->g:Landroid/os/IBinder;

    return-object v0
.end method

.method public onCreate()V
    .locals 0

    .prologue
    .line 443
    invoke-super {p0}, Lcom/qihoo/security/app/UiProcessService;->onCreate()V

    .line 447
    invoke-direct {p0}, Lcom/qihoo/security/v5/UpdateService;->b()V

    .line 448
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 649
    invoke-direct {p0}, Lcom/qihoo/security/v5/UpdateService;->h()V

    .line 651
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdateService;->k:Landroid/content/BroadcastReceiver;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/v5/UpdateService;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 656
    :goto_0
    invoke-super {p0}, Lcom/qihoo/security/app/UiProcessService;->onDestroy()V

    .line 657
    return-void

    .line 652
    :catch_0
    move-exception v0

    .line 653
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 5

    .prologue
    const/16 v4, 0xbba

    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 590
    invoke-super {p0, p1, p2, p3}, Lcom/qihoo/security/app/UiProcessService;->onStartCommand(Landroid/content/Intent;II)I

    .line 596
    if-nez p1, :cond_1

    .line 623
    :cond_0
    :goto_0
    return v2

    .line 600
    :cond_1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 602
    const-string/jumbo v1, "com.qihoo.security.action.ACTION_CHECK_UPDATE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 603
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 607
    invoke-virtual {p0}, Lcom/qihoo/security/v5/UpdateService;->stopSelf()V

    goto :goto_0

    .line 610
    :cond_2
    const-string/jumbo v0, "update_in_background"

    invoke-virtual {p1, v0, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/qihoo/security/v5/UpdateService;->f:Z

    .line 611
    const-string/jumbo v0, "type"

    invoke-virtual {p1, v0, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    .line 612
    iget v1, p0, Lcom/qihoo/security/v5/UpdateService;->c:I

    if-nez v1, :cond_3

    if-eqz v0, :cond_3

    .line 614
    invoke-direct {p0}, Lcom/qihoo/security/v5/UpdateService;->h()V

    .line 616
    :cond_3
    iget v1, p0, Lcom/qihoo/security/v5/UpdateService;->c:I

    if-ne v1, v4, :cond_4

    if-ne v0, v4, :cond_4

    .line 617
    invoke-static {p0}, Lcom/qihoo/security/v5/c;->b(Landroid/content/Context;)I

    .line 619
    :cond_4
    invoke-direct {p0, v0, p1}, Lcom/qihoo/security/v5/UpdateService;->a(ILandroid/content/Intent;)V

    goto :goto_0
.end method

.method public onTaskRemoved(Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 636
    invoke-super {p0, p1}, Lcom/qihoo/security/app/UiProcessService;->onTaskRemoved(Landroid/content/Intent;)V

    .line 640
    invoke-direct {p0}, Lcom/qihoo/security/v5/UpdateService;->h()V

    .line 642
    return-void
.end method
