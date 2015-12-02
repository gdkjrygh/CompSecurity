.class public Lcom/facebook/bugreporter/z;
.super Ljava/lang/Object;
.source "FbAppInfoFetcher.java"


# static fields
.field private static final a:[Ljava/lang/String;


# instance fields
.field private b:Landroid/content/pm/PackageManager;

.field private c:Lcom/facebook/common/l/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 28
    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "com.facebook.katana"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "com.facebook.wakizashi"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "com.facebook.orca"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "com.facebook.home"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "com.facebook.pages.app"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "com.instagram.android"

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/bugreporter/z;->a:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/pm/PackageManager;Lcom/facebook/common/l/b;)V
    .locals 1

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageManager;

    iput-object v0, p0, Lcom/facebook/bugreporter/z;->b:Landroid/content/pm/PackageManager;

    .line 42
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/l/b;

    iput-object v0, p0, Lcom/facebook/bugreporter/z;->c:Lcom/facebook/common/l/b;

    .line 43
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/bugreporter/aa;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 46
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 48
    iget-object v0, p0, Lcom/facebook/bugreporter/z;->b:Landroid/content/pm/PackageManager;

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    move-result-object v0

    .line 49
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 50
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageInfo;

    .line 51
    iget-object v5, v0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-interface {v3, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 54
    :cond_0
    sget-object v4, Lcom/facebook/bugreporter/z;->a:[Ljava/lang/String;

    array-length v5, v4

    :goto_1
    if-ge v1, v5, :cond_2

    aget-object v6, v4, v1

    .line 55
    invoke-interface {v3, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 57
    :try_start_0
    iget-object v0, p0, Lcom/facebook/bugreporter/z;->c:Lcom/facebook/common/l/b;

    invoke-virtual {v0, v6}, Lcom/facebook/common/l/b;->a(Ljava/lang/String;)Lcom/facebook/common/l/a;

    move-result-object v7

    .line 58
    invoke-interface {v3, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageInfo;

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    .line 59
    new-instance v8, Lcom/facebook/bugreporter/aa;

    invoke-direct {v8, v6, v0, v7}, Lcom/facebook/bugreporter/aa;-><init>(Ljava/lang/String;ILcom/facebook/common/l/a;)V

    invoke-interface {v2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    :cond_1
    :goto_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 60
    :catch_0
    move-exception v0

    .line 62
    const-class v7, Lcom/facebook/bugreporter/z;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "Unable to parse AppBuildInfo from package: "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v7, v6, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    .line 70
    :cond_2
    return-object v2
.end method
