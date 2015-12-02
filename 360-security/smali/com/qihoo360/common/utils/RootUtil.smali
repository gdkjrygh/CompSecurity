.class public Lcom/qihoo360/common/utils/RootUtil;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field private static final a:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 24
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string/jumbo v2, "360s"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string/jumbo v2, "su"

    aput-object v2, v0, v1

    sput-object v0, Lcom/qihoo360/common/utils/RootUtil;->a:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static batchRemoveSystemPackage(Landroid/content/Context;Lcom/qihoo360/mobilesafe/support/a/b;Ljava/util/ArrayList;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/qihoo360/mobilesafe/support/a/b;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 212
    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Lcom/qihoo360/common/utils/RootUtil;->batchRemoveSystemPackage(Landroid/content/Context;Lcom/qihoo360/mobilesafe/support/a/b;Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result v0

    return v0
.end method

.method public static final batchRemoveSystemPackage(Landroid/content/Context;Lcom/qihoo360/mobilesafe/support/a/b;Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/qihoo360/mobilesafe/support/a/b;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .prologue
    const-wide/16 v8, 0x1388

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 139
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 140
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 141
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 160
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v1

    .line 207
    :goto_1
    return v0

    .line 141
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 144
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    const/4 v7, 0x0

    invoke-virtual {v6, v0, v7}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v6

    .line 145
    iget-object v7, v6, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_0

    .line 150
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    iget-object v0, v6, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 153
    :catch_0
    move-exception v0

    goto :goto_0

    .line 167
    :cond_2
    const-string/jumbo v0, "rw"

    invoke-static {p0, p1, v0}, Lcom/qihoo360/common/utils/RootUtil;->mountSystem(Landroid/content/Context;Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 170
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_4

    .line 180
    if-eqz p3, :cond_3

    .line 181
    invoke-virtual {p3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_5

    .line 192
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_6

    .line 202
    const-string/jumbo v0, "ro"

    invoke-static {p0, p1, v0}, Lcom/qihoo360/common/utils/RootUtil;->mountSystem(Landroid/content/Context;Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;)Z

    move v0, v1

    .line 204
    goto :goto_1

    .line 170
    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 171
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 172
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 173
    const-string/jumbo v0, "/system/bin/rm"

    invoke-static {p1, v0, v4, v8, v9}, Lcom/qihoo360/mobilesafe/support/a;->b(Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;Ljava/util/List;J)I

    goto :goto_2

    .line 181
    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 182
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 183
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 184
    const-string/jumbo v0, "/system/bin/rm"

    invoke-static {p1, v0, v4, v8, v9}, Lcom/qihoo360/mobilesafe/support/a;->b(Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;Ljava/util/List;J)I

    goto :goto_3

    .line 192
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 193
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 194
    const-string/jumbo v4, "-c"

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 195
    new-instance v4, Ljava/lang/StringBuilder;

    const-string/jumbo v5, "pm uninstall "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 196
    const-string/jumbo v0, "sh"

    const-wide/32 v4, 0xea60

    invoke-static {p1, v0, v3, v4, v5}, Lcom/qihoo360/mobilesafe/support/a;->b(Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;Ljava/util/List;J)I

    goto :goto_4

    :cond_7
    move v0, v2

    .line 207
    goto/16 :goto_1
.end method

.method public static isPhoneRooted()Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 28
    sget-object v2, Lcom/qihoo360/common/utils/RootUtil;->a:[Ljava/lang/String;

    array-length v3, v2

    move v1, v0

    :goto_0
    if-lt v1, v3, :cond_0

    .line 35
    :goto_1
    return v0

    .line 28
    :cond_0
    aget-object v4, v2, v1

    .line 29
    invoke-static {v4}, Lcom/qihoo360/common/utils/Utils;->isCmdExist(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 30
    const/4 v0, 0x1

    .line 31
    goto :goto_1

    .line 28
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public static mountSystem(Landroid/content/Context;Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 74
    invoke-static {p0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 75
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 92
    :cond_0
    :goto_0
    return v0

    .line 80
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 81
    const-string/jumbo v3, "-o"

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    new-instance v3, Ljava/lang/StringBuilder;

    const-string/jumbo v4, "remount,"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    const-string/jumbo v1, "/system"

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    const-string/jumbo v1, "/system/bin/mount"

    const-wide/16 v4, 0x1388

    invoke-static {p1, v1, v2, v4, v5}, Lcom/qihoo360/mobilesafe/support/a;->b(Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;Ljava/util/List;J)I

    move-result v1

    .line 89
    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static removePkg(Landroid/content/Context;Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;Z)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 39
    if-nez p1, :cond_1

    .line 69
    :cond_0
    :goto_0
    return v0

    .line 42
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 45
    if-eqz p3, :cond_2

    .line 47
    :try_start_0
    const-string/jumbo v1, "rw"

    invoke-static {p0, p1, v1}, Lcom/qihoo360/common/utils/RootUtil;->mountSystem(Landroid/content/Context;Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 48
    invoke-static {p0, p1, p2}, Lcom/qihoo360/common/utils/RootUtil;->removeSystemPackage(Landroid/content/Context;Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;)Z

    move-result v1

    .line 49
    const-string/jumbo v2, "ro"

    invoke-static {p0, p1, v2}, Lcom/qihoo360/common/utils/RootUtil;->mountSystem(Landroid/content/Context;Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;)Z

    move v0, v1

    .line 50
    goto :goto_0

    .line 55
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 56
    const-string/jumbo v2, "-c"

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "pm uninstall "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    const-string/jumbo v2, "sh"

    const-wide/32 v4, 0xea60

    invoke-static {p1, v2, v1, v4, v5}, Lcom/qihoo360/mobilesafe/support/a;->b(Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;Ljava/util/List;J)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-nez v1, :cond_0

    .line 69
    const/4 v0, 0x1

    goto :goto_0

    .line 62
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public static removeSystemPackage(Landroid/content/Context;Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;)Z
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 99
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, p2, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    .line 100
    iget-object v2, v1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 122
    :cond_0
    :goto_0
    return v0

    .line 107
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 108
    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    const-string/jumbo v1, "/system/bin/rm"

    const-wide/16 v4, 0x1388

    invoke-static {p1, v1, v2, v4, v5}, Lcom/qihoo360/mobilesafe/support/a;->b(Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;Ljava/util/List;J)I

    .line 114
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 115
    const-string/jumbo v1, "-c"

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "pm uninstall "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    const-string/jumbo v1, "sh"

    const-wide/32 v4, 0xea60

    invoke-static {p1, v1, v2, v4, v5}, Lcom/qihoo360/mobilesafe/support/a;->b(Lcom/qihoo360/mobilesafe/support/a/b;Ljava/lang/String;Ljava/util/List;J)I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    .line 119
    :catch_0
    move-exception v1

    goto :goto_0
.end method
