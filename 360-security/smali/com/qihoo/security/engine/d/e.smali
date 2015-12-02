.class public Lcom/qihoo/security/engine/d/e;
.super Lcom/qihoo/security/engine/d/c;


# instance fields
.field final c:Landroid/content/Context;

.field final d:Landroid/content/pm/PackageManager;

.field final e:Ljava/lang/String;

.field final f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/content/pm/PackageInfo;",
            ">;"
        }
    .end annotation
.end field

.field private g:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/qihoo/security/engine/d/c$a;)V
    .locals 1

    invoke-direct {p0, p3}, Lcom/qihoo/security/engine/d/c;-><init>(Lcom/qihoo/security/engine/d/c$a;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/engine/d/e;->f:Ljava/util/ArrayList;

    const/4 v0, 0x0

    iput v0, p0, Lcom/qihoo/security/engine/d/e;->g:I

    iput-object p1, p0, Lcom/qihoo/security/engine/d/e;->c:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/engine/d/e;->d:Landroid/content/pm/PackageManager;

    iput-object p2, p0, Lcom/qihoo/security/engine/d/e;->e:Ljava/lang/String;

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/engine/d/e;->f:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/qihoo/security/engine/d/e;->d:Landroid/content/pm/PackageManager;

    const/16 v2, 0x40

    invoke-virtual {v1, p1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    goto :goto_0
.end method


# virtual methods
.method public a()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)I
    .locals 1

    const v0, -0x7fffbfff

    return v0
.end method

.method public b()I
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/qihoo/security/engine/d/e;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lcom/qihoo/security/engine/d/e;->e:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/engine/d/e;->d:Landroid/content/pm/PackageManager;

    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->getInstalledApplications(I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/engine/d/e;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/engine/d/e;->g:I

    return v2

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ApplicationInfo;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/qihoo/security/engine/d/e;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/engine/d/e;->e:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/qihoo/security/engine/d/e;->a(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lcom/qihoo/security/engine/d/e;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    return v0
.end method

.method public d()I
    .locals 5

    iget-object v0, p0, Lcom/qihoo/security/engine/d/e;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PackageInfo;

    iget-boolean v2, p0, Lcom/qihoo/security/engine/d/e;->b:Z

    if-nez v2, :cond_0

    new-instance v2, Lcom/qihoo/security/engine/FileInfo;

    iget-object v3, p0, Lcom/qihoo/security/engine/d/e;->d:Landroid/content/pm/PackageManager;

    invoke-direct {v2, v3, v0}, Lcom/qihoo/security/engine/FileInfo;-><init>(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageInfo;)V

    new-instance v0, Lcom/qihoo/security/engine/d/b;

    const/4 v3, 0x3

    const/4 v4, 0x1

    invoke-direct {v0, v3, v4}, Lcom/qihoo/security/engine/d/b;-><init>(II)V

    iput-object v2, v0, Lcom/qihoo/security/engine/d/b;->c:Lcom/qihoo/security/engine/FileInfo;

    iget-object v2, p0, Lcom/qihoo/security/engine/d/e;->a:Lcom/qihoo/security/engine/d/c$a;

    invoke-interface {v2, v0}, Lcom/qihoo/security/engine/d/c$a;->a(Lcom/qihoo/security/engine/d/b;)I

    goto :goto_0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/qihoo/security/engine/d/e;->g:I

    return v0
.end method
