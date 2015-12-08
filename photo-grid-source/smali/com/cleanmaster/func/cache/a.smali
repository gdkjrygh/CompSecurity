.class public Lcom/cleanmaster/func/cache/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/cleanmaster/func/cache/a;


# instance fields
.field private b:Landroid/content/Context;

.field private c:Landroid/content/pm/PackageManager;

.field private d:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 16
    new-instance v0, Lcom/cleanmaster/func/cache/a;

    invoke-direct {v0}, Lcom/cleanmaster/func/cache/a;-><init>()V

    sput-object v0, Lcom/cleanmaster/func/cache/a;->a:Lcom/cleanmaster/func/cache/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    invoke-static {}, Lcom/picksinit/PicksMob;->getInstance()Lcom/picksinit/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/picksinit/b;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/cleanmaster/func/cache/a;->b:Landroid/content/Context;

    .line 18
    iget-object v0, p0, Lcom/cleanmaster/func/cache/a;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/cleanmaster/func/cache/a;->c:Landroid/content/pm/PackageManager;

    return-void
.end method

.method public static declared-synchronized a()Lcom/cleanmaster/func/cache/a;
    .locals 2

    .prologue
    .line 22
    const-class v0, Lcom/cleanmaster/func/cache/a;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/cleanmaster/func/cache/a;->a:Lcom/cleanmaster/func/cache/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method private a(I)Ljava/util/List;
    .locals 1

    .prologue
    .line 86
    :try_start_0
    iget-object v0, p0, Lcom/cleanmaster/func/cache/a;->d:Ljava/util/List;

    if-nez v0, :cond_0

    .line 87
    iget-object v0, p0, Lcom/cleanmaster/func/cache/a;->c:Landroid/content/pm/PackageManager;

    invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/cleanmaster/func/cache/a;->d:Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/cleanmaster/func/cache/a;->d:Ljava/util/List;

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 95
    iget-object v0, p0, Lcom/cleanmaster/func/cache/a;->d:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 96
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/cleanmaster/func/cache/a;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 97
    iget-object v0, p0, Lcom/cleanmaster/func/cache/a;->d:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageInfo;

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 98
    iget-object v0, p0, Lcom/cleanmaster/func/cache/a;->d:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 103
    :cond_0
    return-void

    .line 96
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Landroid/content/Context;)V
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 107
    :try_start_0
    iget-object v1, p0, Lcom/cleanmaster/func/cache/a;->d:Ljava/util/List;

    if-eqz v1, :cond_1

    .line 108
    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    move v1, v0

    .line 109
    :goto_0
    iget-object v0, p0, Lcom/cleanmaster/func/cache/a;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_0

    .line 110
    iget-object v0, p0, Lcom/cleanmaster/func/cache/a;->d:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageInfo;

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 111
    iget-object v0, p0, Lcom/cleanmaster/func/cache/a;->d:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 115
    :cond_0
    iget-object v0, p0, Lcom/cleanmaster/func/cache/a;->d:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 119
    :cond_1
    :goto_1
    return-void

    .line 109
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 119
    :catch_0
    move-exception v0

    goto :goto_1
.end method

.method public b()Ljava/util/List;
    .locals 4

    .prologue
    .line 55
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/cleanmaster/func/cache/a;->a(I)Ljava/util/List;

    move-result-object v0

    .line 56
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 57
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_1

    .line 58
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageInfo;

    .line 59
    iget-object v3, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-static {v3}, Lcom/cleanmaster/common/a;->a(Landroid/content/pm/ApplicationInfo;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 60
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 64
    :cond_1
    return-object v1
.end method

.method public c()Ljava/util/List;
    .locals 4

    .prologue
    .line 71
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/cleanmaster/func/cache/a;->a(I)Ljava/util/List;

    move-result-object v0

    .line 72
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 73
    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_1

    .line 74
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageInfo;

    .line 75
    iget-object v3, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-static {v3}, Lcom/cleanmaster/common/a;->a(Landroid/content/pm/ApplicationInfo;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 76
    iget-object v0, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 80
    :cond_1
    return-object v1
.end method
