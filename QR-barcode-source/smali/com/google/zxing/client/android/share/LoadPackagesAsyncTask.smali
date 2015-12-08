.class final Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;
.super Landroid/os/AsyncTask;
.source "LoadPackagesAsyncTask.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/util/List",
        "<",
        "Lcom/google/zxing/client/android/share/AppInfo;",
        ">;>;"
    }
.end annotation


# static fields
.field private static final PKG_PREFIX_BLACKLIST:[Ljava/lang/String;

.field private static final PKG_PREFIX_WHITELIST:[Ljava/lang/String;


# instance fields
.field private final activity:Landroid/app/ListActivity;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 42
    new-array v0, v3, [Ljava/lang/String;

    .line 43
    const-string v1, "com.google.android.apps."

    aput-object v1, v0, v2

    .line 42
    sput-object v0, Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;->PKG_PREFIX_WHITELIST:[Ljava/lang/String;

    .line 45
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    .line 46
    const-string v1, "com.android."

    aput-object v1, v0, v2

    .line 47
    const-string v1, "android"

    aput-object v1, v0, v3

    const/4 v1, 0x2

    .line 48
    const-string v2, "com.google.android."

    aput-object v2, v0, v1

    const/4 v1, 0x3

    .line 49
    const-string v2, "com.htc"

    aput-object v2, v0, v1

    .line 45
    sput-object v0, Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;->PKG_PREFIX_BLACKLIST:[Ljava/lang/String;

    .line 50
    return-void
.end method

.method constructor <init>(Landroid/app/ListActivity;)V
    .locals 0
    .param p1, "activity"    # Landroid/app/ListActivity;

    .prologue
    .line 54
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 55
    iput-object p1, p0, Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;->activity:Landroid/app/ListActivity;

    .line 56
    return-void
.end method

.method private static isHidden(Ljava/lang/String;)Z
    .locals 7
    .param p0, "packageName"    # Ljava/lang/String;

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 78
    if-nez p0, :cond_1

    .line 91
    :cond_0
    :goto_0
    return v1

    .line 81
    :cond_1
    sget-object v4, Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;->PKG_PREFIX_WHITELIST:[Ljava/lang/String;

    array-length v5, v4

    move v3, v2

    :goto_1
    if-lt v3, v5, :cond_2

    .line 86
    sget-object v4, Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;->PKG_PREFIX_BLACKLIST:[Ljava/lang/String;

    array-length v5, v4

    move v3, v2

    :goto_2
    if-lt v3, v5, :cond_4

    move v1, v2

    .line 91
    goto :goto_0

    .line 81
    :cond_2
    aget-object v0, v4, v3

    .line 82
    .local v0, "prefix":Ljava/lang/String;
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    move v1, v2

    .line 83
    goto :goto_0

    .line 81
    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 86
    .end local v0    # "prefix":Ljava/lang/String;
    :cond_4
    aget-object v0, v4, v3

    .line 87
    .restart local v0    # "prefix":Ljava/lang/String;
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_0

    .line 86
    add-int/lit8 v3, v3, 0x1

    goto :goto_2
.end method


# virtual methods
.method protected bridge varargs synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;->doInBackground([Ljava/lang/Void;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/util/List;
    .locals 10
    .param p1, "objects"    # [Ljava/lang/Void;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Void;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/zxing/client/android/share/AppInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 60
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .local v4, "labelsPackages":Ljava/util/List;, "Ljava/util/List<Lcom/google/zxing/client/android/share/AppInfo;>;"
    iget-object v7, p0, Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;->activity:Landroid/app/ListActivity;

    invoke-virtual {v7}, Landroid/app/ListActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    .line 62
    .local v5, "packageManager":Landroid/content/pm/PackageManager;
    const/4 v7, 0x0

    invoke-virtual {v5, v7}, Landroid/content/pm/PackageManager;->getInstalledApplications(I)Ljava/util/List;

    move-result-object v1

    .line 63
    .local v1, "appInfos":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/ApplicationInfo;>;"
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_0
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_1

    .line 73
    invoke-static {v4}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 74
    return-object v4

    .line 63
    :cond_1
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ApplicationInfo;

    .line 64
    .local v0, "appInfo":Landroid/content/pm/ApplicationInfo;
    iget-object v6, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 65
    .local v6, "packageName":Ljava/lang/String;
    invoke-static {v6}, Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;->isHidden(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_0

    .line 66
    invoke-virtual {v0, v5}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v3

    .line 67
    .local v3, "label":Ljava/lang/CharSequence;
    invoke-virtual {v0, v5}, Landroid/content/pm/ApplicationInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 68
    .local v2, "icon":Landroid/graphics/drawable/Drawable;
    if-eqz v3, :cond_0

    .line 69
    new-instance v8, Lcom/google/zxing/client/android/share/AppInfo;

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v6, v9, v2}, Lcom/google/zxing/client/android/share/AppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    invoke-interface {v4, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;->onPostExecute(Ljava/util/List;)V

    return-void
.end method

.method protected onPostExecute(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/zxing/client/android/share/AppInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 96
    .local p1, "results":Ljava/util/List;, "Ljava/util/List<Lcom/google/zxing/client/android/share/AppInfo;>;"
    new-instance v0, Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask$1;

    iget-object v2, p0, Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;->activity:Landroid/app/ListActivity;

    .line 97
    sget v3, Lcom/google/zxing/client/android/R$layout;->app_picker_list_item:I

    .line 98
    sget v4, Lcom/google/zxing/client/android/R$id;->app_picker_list_item_label:I

    move-object v1, p0

    move-object v5, p1

    move-object v6, p1

    .line 96
    invoke-direct/range {v0 .. v6}, Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask$1;-><init>(Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;Landroid/content/Context;IILjava/util/List;Ljava/util/List;)V

    .line 110
    .local v0, "listAdapter":Landroid/widget/ListAdapter;
    iget-object v1, p0, Lcom/google/zxing/client/android/share/LoadPackagesAsyncTask;->activity:Landroid/app/ListActivity;

    invoke-virtual {v1, v0}, Landroid/app/ListActivity;->setListAdapter(Landroid/widget/ListAdapter;)V

    .line 111
    return-void
.end method
