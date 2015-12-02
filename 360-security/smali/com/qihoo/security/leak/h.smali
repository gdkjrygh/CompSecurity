.class Lcom/qihoo/security/leak/h;
.super Lcom/qihoo/security/leak/c;
.source "360Security"


# direct methods
.method constructor <init>(Lcom/qihoo/security/leak/d;)V
    .locals 0

    .prologue
    .line 494
    invoke-direct {p0, p1}, Lcom/qihoo/security/leak/c;-><init>(Lcom/qihoo/security/leak/d;)V

    .line 495
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 499
    const-string/jumbo v0, "leak_samsung_backup"

    return-object v0
.end method

.method b()Z
    .locals 7

    .prologue
    const/4 v4, 0x2

    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 504
    const/4 v2, 0x5

    new-array v3, v2, [Ljava/lang/String;

    const-string/jumbo v2, "GT-I9500"

    aput-object v2, v3, v0

    const-string/jumbo v2, "GT-I9502"

    aput-object v2, v3, v1

    const-string/jumbo v2, "GT-I9505"

    aput-object v2, v3, v4

    const/4 v2, 0x3

    const-string/jumbo v4, "GT-I9508"

    aput-object v4, v3, v2

    const/4 v2, 0x4

    const-string/jumbo v4, "SCH-I959"

    aput-object v4, v3, v2

    .line 506
    array-length v4, v3

    move v2, v0

    :goto_0
    if-ge v2, v4, :cond_4

    aget-object v5, v3, v2

    .line 507
    sget-object v6, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v2, v1

    .line 512
    :goto_1
    if-nez v2, :cond_2

    .line 537
    :cond_0
    :goto_2
    return v0

    .line 506
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 516
    :cond_2
    iget-object v2, p0, Lcom/qihoo/security/leak/h;->a:Landroid/content/Context;

    .line 517
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 518
    const/4 v2, 0x0

    .line 520
    :try_start_0
    sget-object v4, Lcom/qihoo/security/leak/b;->a:Ljava/lang/String;

    const/4 v5, 0x2

    invoke-virtual {v3, v4, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 524
    :goto_3
    if-eqz v2, :cond_0

    .line 527
    iget v3, v2, Landroid/content/pm/PackageInfo;->versionCode:I

    const/16 v4, 0xe

    if-gt v3, v4, :cond_0

    .line 530
    iget-object v3, v2, Landroid/content/pm/PackageInfo;->receivers:[Landroid/content/pm/ActivityInfo;

    if-eqz v3, :cond_0

    .line 531
    iget-object v3, v2, Landroid/content/pm/PackageInfo;->receivers:[Landroid/content/pm/ActivityInfo;

    array-length v4, v3

    move v2, v0

    :goto_4
    if-ge v2, v4, :cond_0

    aget-object v5, v3, v2

    .line 532
    sget-object v6, Lcom/qihoo/security/leak/b;->b:Ljava/lang/String;

    iget-object v5, v5, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move v0, v1

    .line 533
    goto :goto_2

    .line 531
    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 522
    :catch_0
    move-exception v3

    goto :goto_3

    :cond_4
    move v2, v0

    goto :goto_1
.end method

.method public c()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 542
    iget-object v1, p0, Lcom/qihoo/security/leak/h;->a:Landroid/content/Context;

    .line 543
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 546
    :try_start_0
    sget-object v2, Lcom/qihoo/security/leak/b;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getApplicationEnabledSetting(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    .line 548
    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    const/4 v2, 0x3

    if-ne v1, v2, :cond_1

    .line 552
    :cond_0
    :goto_0
    return v0

    .line 548
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 550
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public d()Landroid/graphics/drawable/Drawable;
    .locals 2

    .prologue
    .line 563
    iget-object v0, p0, Lcom/qihoo/security/leak/h;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0200a9

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method e()I
    .locals 1

    .prologue
    .line 573
    const v0, 0x7f0e0011

    return v0
.end method

.method public f()Z
    .locals 1

    .prologue
    .line 557
    invoke-virtual {p0}, Lcom/qihoo/security/leak/h;->c()Z

    move-result v0

    return v0
.end method
