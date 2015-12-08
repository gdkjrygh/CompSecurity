.class final Lb/a/a/a/p;
.super Lb/a/a/a/l;
.source "SourceFile"


# instance fields
.field private final a:Lb/a/a/a/a/e/g;

.field private b:Landroid/content/pm/PackageManager;

.field private c:Ljava/lang/String;

.field private d:Landroid/content/pm/PackageInfo;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private final o:Ljava/util/concurrent/Future;

.field private final p:Ljava/util/Collection;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Future;Ljava/util/Collection;)V
    .locals 1

    .prologue
    .line 61
    invoke-direct {p0}, Lb/a/a/a/l;-><init>()V

    .line 62
    new-instance v0, Lb/a/a/a/a/e/b;

    invoke-direct {v0}, Lb/a/a/a/a/e/b;-><init>()V

    iput-object v0, p0, Lb/a/a/a/p;->a:Lb/a/a/a/a/e/g;

    .line 63
    iput-object p1, p0, Lb/a/a/a/p;->o:Ljava/util/concurrent/Future;

    .line 64
    iput-object p2, p0, Lb/a/a/a/p;->p:Ljava/util/Collection;

    .line 65
    return-void
.end method

.method private a(Lb/a/a/a/a/g/n;Ljava/util/Collection;)Lb/a/a/a/a/g/d;
    .locals 12

    .prologue
    .line 208
    iget-object v0, p0, Lb/a/a/a/l;->g:Landroid/content/Context;

    .line 209
    new-instance v1, Lb/a/a/a/a/b/h;

    invoke-direct {v1}, Lb/a/a/a/a/b/h;-><init>()V

    invoke-static {v0}, Lb/a/a/a/a/b/h;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 210
    invoke-static {v0}, Lb/a/a/a/a/b/j;->m(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 212
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v2}, Lb/a/a/a/a/b/j;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 213
    iget-object v0, p0, Lb/a/a/a/p;->l:Ljava/lang/String;

    invoke-static {v0}, Lb/a/a/a/a/b/n;->a(Ljava/lang/String;)Lb/a/a/a/a/b/n;

    move-result-object v0

    invoke-virtual {v0}, Lb/a/a/a/a/b/n;->a()I

    move-result v7

    .line 214
    iget-object v0, p0, Lb/a/a/a/l;->i:Lb/a/a/a/a/b/t;

    invoke-virtual {v0}, Lb/a/a/a/a/b/t;->c()Ljava/lang/String;

    move-result-object v2

    .line 216
    new-instance v0, Lb/a/a/a/a/g/d;

    iget-object v3, p0, Lb/a/a/a/p;->k:Ljava/lang/String;

    iget-object v4, p0, Lb/a/a/a/p;->j:Ljava/lang/String;

    iget-object v6, p0, Lb/a/a/a/p;->m:Ljava/lang/String;

    iget-object v8, p0, Lb/a/a/a/p;->n:Ljava/lang/String;

    const-string v9, "0"

    move-object v10, p1

    move-object v11, p2

    invoke-direct/range {v0 .. v11}, Lb/a/a/a/a/g/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lb/a/a/a/a/g/n;Ljava/util/Collection;)V

    return-object v0
.end method

.method private static a(Ljava/util/Map;Ljava/util/Collection;)Ljava/util/Map;
    .locals 6

    .prologue
    .line 137
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb/a/a/a/l;

    .line 138
    invoke-virtual {v0}, Lb/a/a/a/l;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 139
    invoke-virtual {v0}, Lb/a/a/a/l;->b()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lb/a/a/a/n;

    invoke-virtual {v0}, Lb/a/a/a/l;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lb/a/a/a/l;->a()Ljava/lang/String;

    move-result-object v0

    const-string v5, "binary"

    invoke-direct {v3, v4, v0, v5}, Lb/a/a/a/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 143
    :cond_1
    return-object p0
.end method

.method private c()Ljava/lang/Boolean;
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 97
    iget-object v0, p0, Lb/a/a/a/l;->g:Landroid/content/Context;

    invoke-static {v0}, Lb/a/a/a/a/b/j;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 99
    invoke-direct {p0}, Lb/a/a/a/p;->f()Lb/a/a/a/a/g/t;

    move-result-object v3

    .line 101
    if-eqz v3, :cond_1

    .line 104
    :try_start_0
    iget-object v0, p0, Lb/a/a/a/p;->o:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_2

    .line 105
    iget-object v0, p0, Lb/a/a/a/p;->o:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 111
    :goto_0
    iget-object v4, p0, Lb/a/a/a/p;->p:Ljava/util/Collection;

    invoke-static {v0, v4}, Lb/a/a/a/p;->a(Ljava/util/Map;Ljava/util/Collection;)Ljava/util/Map;

    move-result-object v0

    .line 112
    iget-object v3, v3, Lb/a/a/a/a/g/t;->a:Lb/a/a/a/a/g/e;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v4

    const/4 v0, 0x1

    const-string v5, "new"

    iget-object v6, v3, Lb/a/a/a/a/g/e;->b:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    iget-object v0, p0, Lb/a/a/a/l;->g:Landroid/content/Context;

    invoke-static {v0, v2}, Lb/a/a/a/a/g/n;->a(Landroid/content/Context;Ljava/lang/String;)Lb/a/a/a/a/g/n;

    move-result-object v0

    invoke-direct {p0, v0, v4}, Lb/a/a/a/p;->a(Lb/a/a/a/a/g/n;Ljava/util/Collection;)Lb/a/a/a/a/g/d;

    move-result-object v0

    new-instance v2, Lb/a/a/a/a/g/h;

    invoke-direct {p0}, Lb/a/a/a/p;->g()Ljava/lang/String;

    move-result-object v4

    iget-object v3, v3, Lb/a/a/a/a/g/e;->c:Ljava/lang/String;

    iget-object v5, p0, Lb/a/a/a/p;->a:Lb/a/a/a/a/e/g;

    invoke-direct {v2, p0, v4, v3, v5}, Lb/a/a/a/a/g/h;-><init>(Lb/a/a/a/l;Ljava/lang/String;Ljava/lang/String;Lb/a/a/a/a/e/g;)V

    invoke-virtual {v2, v0}, Lb/a/a/a/a/g/h;->a(Lb/a/a/a/a/g/d;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lb/a/a/a/a/g/q;->a()Lb/a/a/a/a/g/q;

    move-result-object v0

    invoke-virtual {v0}, Lb/a/a/a/a/g/q;->d()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :cond_0
    :goto_1
    move v1, v0

    .line 118
    :cond_1
    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 107
    :cond_2
    :try_start_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 114
    :catch_0
    move-exception v0

    .line 115
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v2

    const-string v3, "Fabric"

    const-string v4, "Error performing auto configuration."

    invoke-interface {v2, v3, v4, v0}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    .line 112
    :cond_3
    :try_start_2
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v0

    const-string v2, "Fabric"

    const-string v3, "Failed to create app with Crashlytics service."

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v4}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move v0, v1

    goto :goto_1

    :cond_4
    const-string v5, "configured"

    iget-object v6, v3, Lb/a/a/a/a/g/e;->b:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-static {}, Lb/a/a/a/a/g/q;->a()Lb/a/a/a/a/g/q;

    move-result-object v0

    invoke-virtual {v0}, Lb/a/a/a/a/g/q;->d()Z

    move-result v0

    goto :goto_1

    :cond_5
    iget-boolean v5, v3, Lb/a/a/a/a/g/e;->e:Z

    if-eqz v5, :cond_0

    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    iget-object v5, p0, Lb/a/a/a/l;->g:Landroid/content/Context;

    invoke-static {v5, v2}, Lb/a/a/a/a/g/n;->a(Landroid/content/Context;Ljava/lang/String;)Lb/a/a/a/a/g/n;

    move-result-object v2

    invoke-direct {p0, v2, v4}, Lb/a/a/a/p;->a(Lb/a/a/a/a/g/n;Ljava/util/Collection;)Lb/a/a/a/a/g/d;

    move-result-object v2

    new-instance v4, Lb/a/a/a/a/g/y;

    invoke-direct {p0}, Lb/a/a/a/p;->g()Ljava/lang/String;

    move-result-object v5

    iget-object v3, v3, Lb/a/a/a/a/g/e;->c:Ljava/lang/String;

    iget-object v6, p0, Lb/a/a/a/p;->a:Lb/a/a/a/a/e/g;

    invoke-direct {v4, p0, v5, v3, v6}, Lb/a/a/a/a/g/y;-><init>(Lb/a/a/a/l;Ljava/lang/String;Ljava/lang/String;Lb/a/a/a/a/e/g;)V

    invoke-virtual {v4, v2}, Lb/a/a/a/a/g/y;->a(Lb/a/a/a/a/g/d;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1
.end method

.method private f()Lb/a/a/a/a/g/t;
    .locals 7

    .prologue
    .line 123
    :try_start_0
    invoke-static {}, Lb/a/a/a/a/g/q;->a()Lb/a/a/a/a/g/q;

    move-result-object v0

    iget-object v2, p0, Lb/a/a/a/p;->i:Lb/a/a/a/a/b/t;

    iget-object v3, p0, Lb/a/a/a/p;->a:Lb/a/a/a/a/e/g;

    iget-object v4, p0, Lb/a/a/a/p;->j:Ljava/lang/String;

    iget-object v5, p0, Lb/a/a/a/p;->k:Ljava/lang/String;

    invoke-direct {p0}, Lb/a/a/a/p;->g()Ljava/lang/String;

    move-result-object v6

    move-object v1, p0

    invoke-virtual/range {v0 .. v6}, Lb/a/a/a/a/g/q;->a(Lb/a/a/a/l;Lb/a/a/a/a/b/t;Lb/a/a/a/a/e/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lb/a/a/a/a/g/q;

    move-result-object v0

    invoke-virtual {v0}, Lb/a/a/a/a/g/q;->c()Z

    .line 128
    invoke-static {}, Lb/a/a/a/a/g/q;->a()Lb/a/a/a/a/g/q;

    move-result-object v0

    invoke-virtual {v0}, Lb/a/a/a/a/g/q;->b()Lb/a/a/a/a/g/t;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 131
    :goto_0
    return-object v0

    .line 129
    :catch_0
    move-exception v0

    .line 130
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Error dealing with settings"

    invoke-interface {v1, v2, v3, v0}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 131
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private g()Ljava/lang/String;
    .locals 2

    .prologue
    .line 221
    iget-object v0, p0, Lb/a/a/a/l;->g:Landroid/content/Context;

    const-string v1, "com.crashlytics.ApiEndpoint"

    invoke-static {v0, v1}, Lb/a/a/a/a/b/j;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 69
    const-string v0, "1.3.3.56"

    return-object v0
.end method

.method protected final a_()Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 75
    :try_start_0
    iget-object v1, p0, Lb/a/a/a/l;->i:Lb/a/a/a/a/b/t;

    invoke-virtual {v1}, Lb/a/a/a/a/b/t;->h()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lb/a/a/a/p;->l:Ljava/lang/String;

    .line 76
    iget-object v1, p0, Lb/a/a/a/l;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    iput-object v1, p0, Lb/a/a/a/p;->b:Landroid/content/pm/PackageManager;

    .line 77
    iget-object v1, p0, Lb/a/a/a/l;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lb/a/a/a/p;->c:Ljava/lang/String;

    .line 78
    iget-object v1, p0, Lb/a/a/a/p;->b:Landroid/content/pm/PackageManager;

    iget-object v2, p0, Lb/a/a/a/p;->c:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iput-object v1, p0, Lb/a/a/a/p;->d:Landroid/content/pm/PackageInfo;

    .line 79
    iget-object v1, p0, Lb/a/a/a/p;->d:Landroid/content/pm/PackageInfo;

    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lb/a/a/a/p;->j:Ljava/lang/String;

    .line 80
    iget-object v1, p0, Lb/a/a/a/p;->d:Landroid/content/pm/PackageInfo;

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v1, "0.0"

    :goto_0
    iput-object v1, p0, Lb/a/a/a/p;->k:Ljava/lang/String;

    .line 82
    iget-object v1, p0, Lb/a/a/a/p;->b:Landroid/content/pm/PackageManager;

    iget-object v2, p0, Lb/a/a/a/l;->g:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lb/a/a/a/p;->m:Ljava/lang/String;

    .line 85
    iget-object v1, p0, Lb/a/a/a/l;->g:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget v1, v1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lb/a/a/a/p;->n:Ljava/lang/String;

    .line 88
    const/4 v0, 0x1

    .line 92
    :goto_1
    return v0

    .line 80
    :cond_0
    iget-object v1, p0, Lb/a/a/a/p;->d:Landroid/content/pm/PackageInfo;

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 89
    :catch_0
    move-exception v1

    .line 90
    invoke-static {}, Lb/a/a/a/d;->c()Lb/a/a/a/o;

    move-result-object v2

    const-string v3, "Fabric"

    const-string v4, "Failed init"

    invoke-interface {v2, v3, v4, v1}, Lb/a/a/a/o;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 148
    const-string v0, "io.fabric.sdk.android:fabric"

    return-object v0
.end method

.method protected final synthetic e()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 45
    invoke-direct {p0}, Lb/a/a/a/p;->c()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
