.class final La/a/a/a/t;
.super La/a/a/a/p;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/a/a/a/p",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:La/a/a/a/a/e/m;

.field private b:Landroid/content/pm/PackageManager;

.field private c:Ljava/lang/String;

.field private d:Landroid/content/pm/PackageInfo;

.field private j:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;

.field private m:Ljava/lang/String;

.field private n:Ljava/lang/String;

.field private final o:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future",
            "<",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "La/a/a/a/r;",
            ">;>;"
        }
    .end annotation
.end field

.field private final p:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection",
            "<",
            "La/a/a/a/p;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Future;Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future",
            "<",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "La/a/a/a/r;",
            ">;>;",
            "Ljava/util/Collection",
            "<",
            "La/a/a/a/p;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 61
    invoke-direct {p0}, La/a/a/a/p;-><init>()V

    .line 62
    new-instance v0, La/a/a/a/a/e/b;

    invoke-direct {v0}, La/a/a/a/a/e/b;-><init>()V

    iput-object v0, p0, La/a/a/a/t;->a:La/a/a/a/a/e/m;

    .line 63
    iput-object p1, p0, La/a/a/a/t;->o:Ljava/util/concurrent/Future;

    .line 64
    iput-object p2, p0, La/a/a/a/t;->p:Ljava/util/Collection;

    .line 65
    return-void
.end method

.method private a(La/a/a/a/a/g/n;Ljava/util/Collection;)La/a/a/a/a/g/d;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/a/a/a/a/g/n;",
            "Ljava/util/Collection",
            "<",
            "La/a/a/a/r;",
            ">;)",
            "La/a/a/a/a/g/d;"
        }
    .end annotation

    .prologue
    .line 208
    .line 8113
    iget-object v0, p0, La/a/a/a/p;->g:Landroid/content/Context;

    .line 209
    new-instance v1, La/a/a/a/a/b/j;

    invoke-direct {v1}, La/a/a/a/a/b/j;-><init>()V

    invoke-static {v0}, La/a/a/a/a/b/j;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 210
    invoke-static {v0}, La/a/a/a/a/b/l;->l(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 212
    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v2}, La/a/a/a/a/b/l;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 213
    iget-object v0, p0, La/a/a/a/t;->l:Ljava/lang/String;

    invoke-static {v0}, La/a/a/a/a/b/r;->a(Ljava/lang/String;)La/a/a/a/a/b/r;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/a/a/b/r;->a()I

    move-result v7

    .line 9106
    iget-object v0, p0, La/a/a/a/p;->i:La/a/a/a/a/b/x;

    .line 214
    invoke-virtual {v0}, La/a/a/a/a/b/x;->c()Ljava/lang/String;

    move-result-object v2

    .line 216
    new-instance v0, La/a/a/a/a/g/d;

    iget-object v3, p0, La/a/a/a/t;->k:Ljava/lang/String;

    iget-object v4, p0, La/a/a/a/t;->j:Ljava/lang/String;

    iget-object v6, p0, La/a/a/a/t;->m:Ljava/lang/String;

    iget-object v8, p0, La/a/a/a/t;->n:Ljava/lang/String;

    const-string v9, "0"

    move-object v10, p1

    move-object v11, p2

    invoke-direct/range {v0 .. v11}, La/a/a/a/a/g/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;La/a/a/a/a/g/n;Ljava/util/Collection;)V

    return-object v0
.end method

.method private static a(Ljava/util/Map;Ljava/util/Collection;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "La/a/a/a/r;",
            ">;",
            "Ljava/util/Collection",
            "<",
            "La/a/a/a/p;",
            ">;)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "La/a/a/a/r;",
            ">;"
        }
    .end annotation

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

    check-cast v0, La/a/a/a/p;

    .line 138
    invoke-virtual {v0}, La/a/a/a/p;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 139
    invoke-virtual {v0}, La/a/a/a/p;->b()Ljava/lang/String;

    move-result-object v2

    new-instance v3, La/a/a/a/r;

    invoke-virtual {v0}, La/a/a/a/p;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, La/a/a/a/p;->a()Ljava/lang/String;

    move-result-object v0

    const-string v5, "binary"

    invoke-direct {v3, v4, v0, v5}, La/a/a/a/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 143
    :cond_1
    return-object p0
.end method

.method private e()Ljava/lang/Boolean;
    .locals 7

    .prologue
    const/4 v1, 0x0

    .line 97
    .line 5113
    iget-object v0, p0, La/a/a/a/p;->g:Landroid/content/Context;

    .line 97
    invoke-static {v0}, La/a/a/a/a/b/l;->j(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 99
    invoke-direct {p0}, La/a/a/a/t;->f()La/a/a/a/a/g/v;

    move-result-object v3

    .line 101
    if-eqz v3, :cond_1

    .line 104
    :try_start_0
    iget-object v0, p0, La/a/a/a/t;->o:Ljava/util/concurrent/Future;

    if-eqz v0, :cond_2

    .line 105
    iget-object v0, p0, La/a/a/a/t;->o:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    .line 111
    :goto_0
    iget-object v4, p0, La/a/a/a/t;->p:Ljava/util/Collection;

    invoke-static {v0, v4}, La/a/a/a/t;->a(Ljava/util/Map;Ljava/util/Collection;)Ljava/util/Map;

    move-result-object v0

    .line 112
    iget-object v3, v3, La/a/a/a/a/g/v;->a:La/a/a/a/a/g/e;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v4

    .line 5153
    const/4 v0, 0x1

    .line 5155
    const-string v5, "new"

    iget-object v6, v3, La/a/a/a/a/g/e;->b:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 6113
    iget-object v0, p0, La/a/a/a/p;->g:Landroid/content/Context;

    .line 5183
    invoke-static {v0, v2}, La/a/a/a/a/g/n;->a(Landroid/content/Context;Ljava/lang/String;)La/a/a/a/a/g/n;

    move-result-object v0

    invoke-direct {p0, v0, v4}, La/a/a/a/t;->a(La/a/a/a/a/g/n;Ljava/util/Collection;)La/a/a/a/a/g/d;

    move-result-object v0

    .line 5185
    new-instance v2, La/a/a/a/a/g/h;

    invoke-direct {p0}, La/a/a/a/t;->g()Ljava/lang/String;

    move-result-object v4

    iget-object v3, v3, La/a/a/a/a/g/e;->c:Ljava/lang/String;

    iget-object v5, p0, La/a/a/a/t;->a:La/a/a/a/a/e/m;

    invoke-direct {v2, p0, v4, v3, v5}, La/a/a/a/a/g/h;-><init>(La/a/a/a/p;Ljava/lang/String;Ljava/lang/String;La/a/a/a/a/e/m;)V

    invoke-virtual {v2, v0}, La/a/a/a/a/g/h;->a(La/a/a/a/a/g/d;)Z

    move-result v0

    .line 5157
    if-eqz v0, :cond_3

    .line 5160
    invoke-static {}, La/a/a/a/a/g/q;->a()La/a/a/a/a/g/q;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/a/a/g/q;->d()Z
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
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v2

    const-string v3, "Fabric"

    const-string v4, "Error performing auto configuration."

    invoke-interface {v2, v3, v4, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    .line 5163
    :cond_3
    :try_start_2
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v0

    const-string v2, "Fabric"

    const-string v3, "Failed to create app with Crashlytics service."

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v4}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    move v0, v1

    .line 5165
    goto :goto_1

    .line 5167
    :cond_4
    const-string v5, "configured"

    iget-object v6, v3, La/a/a/a/a/g/e;->b:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 5169
    invoke-static {}, La/a/a/a/a/g/q;->a()La/a/a/a/a/g/q;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/a/a/g/q;->d()Z

    move-result v0

    goto :goto_1

    .line 5170
    :cond_5
    iget-boolean v5, v3, La/a/a/a/a/g/e;->e:Z

    if-eqz v5, :cond_0

    .line 5173
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    .line 7113
    iget-object v5, p0, La/a/a/a/p;->g:Landroid/content/Context;

    .line 6194
    invoke-static {v5, v2}, La/a/a/a/a/g/n;->a(Landroid/content/Context;Ljava/lang/String;)La/a/a/a/a/g/n;

    move-result-object v2

    .line 7202
    invoke-direct {p0, v2, v4}, La/a/a/a/t;->a(La/a/a/a/a/g/n;Ljava/util/Collection;)La/a/a/a/a/g/d;

    move-result-object v2

    .line 7203
    new-instance v4, La/a/a/a/a/g/aa;

    invoke-direct {p0}, La/a/a/a/t;->g()Ljava/lang/String;

    move-result-object v5

    iget-object v3, v3, La/a/a/a/a/g/e;->c:Ljava/lang/String;

    iget-object v6, p0, La/a/a/a/t;->a:La/a/a/a/a/e/m;

    invoke-direct {v4, p0, v5, v3, v6}, La/a/a/a/a/g/aa;-><init>(La/a/a/a/p;Ljava/lang/String;Ljava/lang/String;La/a/a/a/a/e/m;)V

    invoke-virtual {v4, v2}, La/a/a/a/a/g/aa;->a(La/a/a/a/a/g/d;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1
.end method

.method private f()La/a/a/a/a/g/v;
    .locals 7

    .prologue
    .line 123
    :try_start_0
    invoke-static {}, La/a/a/a/a/g/q;->a()La/a/a/a/a/g/q;

    move-result-object v0

    iget-object v2, p0, La/a/a/a/t;->i:La/a/a/a/a/b/x;

    iget-object v3, p0, La/a/a/a/t;->a:La/a/a/a/a/e/m;

    iget-object v4, p0, La/a/a/a/t;->j:Ljava/lang/String;

    iget-object v5, p0, La/a/a/a/t;->k:Ljava/lang/String;

    invoke-direct {p0}, La/a/a/a/t;->g()Ljava/lang/String;

    move-result-object v6

    move-object v1, p0

    invoke-virtual/range {v0 .. v6}, La/a/a/a/a/g/q;->a(La/a/a/a/p;La/a/a/a/a/b/x;La/a/a/a/a/e/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)La/a/a/a/a/g/q;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/a/a/g/q;->c()Z

    .line 128
    invoke-static {}, La/a/a/a/a/g/q;->a()La/a/a/a/a/g/q;

    move-result-object v0

    invoke-virtual {v0}, La/a/a/a/a/g/q;->b()La/a/a/a/a/g/v;
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
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v1

    const-string v2, "Fabric"

    const-string v3, "Error dealing with settings"

    invoke-interface {v1, v2, v3, v0}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 131
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private g()Ljava/lang/String;
    .locals 2

    .prologue
    .line 221
    .line 9113
    iget-object v0, p0, La/a/a/a/p;->g:Landroid/content/Context;

    .line 221
    const-string v1, "com.crashlytics.ApiEndpoint"

    invoke-static {v0, v1}, La/a/a/a/a/b/l;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 69
    const-string v0, "1.3.6.79"

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 148
    const-string v0, "io.fabric.sdk.android:fabric"

    return-object v0
.end method

.method protected final synthetic d()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 45
    invoke-direct {p0}, La/a/a/a/t;->e()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method protected final e_()Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 75
    .line 1106
    :try_start_0
    iget-object v1, p0, La/a/a/a/p;->i:La/a/a/a/a/b/x;

    .line 75
    invoke-virtual {v1}, La/a/a/a/a/b/x;->h()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, La/a/a/a/t;->l:Ljava/lang/String;

    .line 1113
    iget-object v1, p0, La/a/a/a/p;->g:Landroid/content/Context;

    .line 76
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    iput-object v1, p0, La/a/a/a/t;->b:Landroid/content/pm/PackageManager;

    .line 2113
    iget-object v1, p0, La/a/a/a/p;->g:Landroid/content/Context;

    .line 77
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, La/a/a/a/t;->c:Ljava/lang/String;

    .line 78
    iget-object v1, p0, La/a/a/a/t;->b:Landroid/content/pm/PackageManager;

    iget-object v2, p0, La/a/a/a/t;->c:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iput-object v1, p0, La/a/a/a/t;->d:Landroid/content/pm/PackageInfo;

    .line 79
    iget-object v1, p0, La/a/a/a/t;->d:Landroid/content/pm/PackageInfo;

    iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, La/a/a/a/t;->j:Ljava/lang/String;

    .line 80
    iget-object v1, p0, La/a/a/a/t;->d:Landroid/content/pm/PackageInfo;

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v1, "0.0"

    :goto_0
    iput-object v1, p0, La/a/a/a/t;->k:Ljava/lang/String;

    .line 82
    iget-object v1, p0, La/a/a/a/t;->b:Landroid/content/pm/PackageManager;

    .line 3113
    iget-object v2, p0, La/a/a/a/p;->g:Landroid/content/Context;

    .line 82
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, La/a/a/a/t;->m:Ljava/lang/String;

    .line 4113
    iget-object v1, p0, La/a/a/a/p;->g:Landroid/content/Context;

    .line 85
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget v1, v1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, La/a/a/a/t;->n:Ljava/lang/String;

    .line 88
    const/4 v0, 0x1

    .line 92
    :goto_1
    return v0

    .line 80
    :cond_0
    iget-object v1, p0, La/a/a/a/t;->d:Landroid/content/pm/PackageInfo;

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 89
    :catch_0
    move-exception v1

    .line 90
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v2

    const-string v3, "Fabric"

    const-string v4, "Failed init"

    invoke-interface {v2, v3, v4, v1}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1
.end method
