.class public Lnet/coocent/android/exitwithrate/InstallTimeChecker;
.super Ljava/lang/Object;
.source "InstallTimeChecker.java"


# instance fields
.field public promotionEndString:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const-string v0, "2015-06-10 23:59:59"

    iput-object v0, p0, Lnet/coocent/android/exitwithrate/InstallTimeChecker;->promotionEndString:Ljava/lang/String;

    .line 19
    return-void
.end method


# virtual methods
.method public apkUpdateTime(Landroid/content/pm/PackageManager;Ljava/lang/String;)Ljava/util/Date;
    .locals 8
    .param p1, "packageManager"    # Landroid/content/pm/PackageManager;
    .param p2, "packageName"    # Ljava/lang/String;

    .prologue
    const/4 v4, 0x0

    .line 104
    .line 105
    const/4 v3, 0x0

    .line 104
    :try_start_0
    invoke-virtual {p1, p2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    .line 106
    .local v2, "info":Landroid/content/pm/ApplicationInfo;
    new-instance v0, Ljava/io/File;

    iget-object v3, v2, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 107
    .local v0, "apkFile":Ljava/io/File;
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v3, Ljava/util/Date;

    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    move-result-wide v6

    invoke-direct {v3, v6, v7}, Ljava/util/Date;-><init>(J)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 109
    .end local v0    # "apkFile":Ljava/io/File;
    .end local v2    # "info":Landroid/content/pm/ApplicationInfo;
    :goto_0
    return-object v3

    .restart local v0    # "apkFile":Ljava/io/File;
    .restart local v2    # "info":Landroid/content/pm/ApplicationInfo;
    :cond_0
    move-object v3, v4

    .line 107
    goto :goto_0

    .line 108
    .end local v0    # "apkFile":Ljava/io/File;
    .end local v2    # "info":Landroid/content/pm/ApplicationInfo;
    :catch_0
    move-exception v1

    .local v1, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    move-object v3, v4

    .line 109
    goto :goto_0
.end method

.method public isPromotionTime(Landroid/content/Context;)Z
    .locals 6
    .param p1, "ctxt"    # Landroid/content/Context;

    .prologue
    .line 44
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 45
    const-string v5, "yyyy-MM-dd HH:mm:ss"

    .line 44
    invoke-direct {v0, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 50
    .local v0, "dateFormat":Ljava/text/SimpleDateFormat;
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    .line 51
    .local v4, "ownPackageName":Ljava/lang/String;
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    invoke-virtual {p0, v5, v4}, Lnet/coocent/android/exitwithrate/InstallTimeChecker;->apkUpdateTime(Landroid/content/pm/PackageManager;Ljava/lang/String;)Ljava/util/Date;

    move-result-object v3

    .line 54
    .local v3, "installTime":Ljava/util/Date;
    if-eqz v3, :cond_0

    .line 56
    :try_start_0
    new-instance v2, Ljava/util/GregorianCalendar;

    invoke-direct {v2}, Ljava/util/GregorianCalendar;-><init>()V

    .line 57
    .local v2, "endBound":Ljava/util/Calendar;
    iget-object v5, p0, Lnet/coocent/android/exitwithrate/InstallTimeChecker;->promotionEndString:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 82
    invoke-virtual {v2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/Date;->before(Ljava/util/Date;)Z
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v5

    .line 92
    .end local v2    # "endBound":Ljava/util/Calendar;
    :goto_0
    return v5

    .line 84
    :catch_0
    move-exception v1

    .line 85
    .local v1, "e":Ljava/text/ParseException;
    invoke-virtual {v1}, Ljava/text/ParseException;->printStackTrace()V

    .line 92
    .end local v1    # "e":Ljava/text/ParseException;
    :cond_0
    const/4 v5, 0x0

    goto :goto_0
.end method

.method public setpromotionTime(Ljava/lang/String;)V
    .locals 0
    .param p1, "str"    # Ljava/lang/String;

    .prologue
    .line 30
    iput-object p1, p0, Lnet/coocent/android/exitwithrate/InstallTimeChecker;->promotionEndString:Ljava/lang/String;

    .line 31
    return-void
.end method
