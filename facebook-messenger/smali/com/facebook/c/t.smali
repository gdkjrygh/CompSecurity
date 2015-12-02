.class public Lcom/facebook/c/t;
.super Ljava/lang/Object;
.source "SecureContextHelperUtil.java"


# instance fields
.field private final a:Landroid/content/pm/PackageManager;

.field private final b:Landroid/content/pm/ApplicationInfo;


# direct methods
.method public constructor <init>(Landroid/content/pm/PackageManager;Landroid/content/pm/ApplicationInfo;)V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/facebook/c/t;->a:Landroid/content/pm/PackageManager;

    .line 24
    iput-object p2, p0, Lcom/facebook/c/t;->b:Landroid/content/pm/ApplicationInfo;

    .line 25
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Intent;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            ")",
            "Ljava/util/List",
            "<",
            "Landroid/content/pm/ActivityInfo;",
            ">;"
        }
    .end annotation

    .prologue
    .line 33
    iget-object v0, p0, Lcom/facebook/c/t;->b:Landroid/content/pm/ApplicationInfo;

    iget v1, v0, Landroid/content/pm/ApplicationInfo;->uid:I

    .line 34
    iget-object v0, p0, Lcom/facebook/c/t;->a:Landroid/content/pm/PackageManager;

    const/16 v2, 0x40

    invoke-virtual {v0, p1, v2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    .line 38
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 40
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 41
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 42
    iget-object v4, v0, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v4, v4, Landroid/content/pm/ApplicationInfo;->uid:I

    .line 43
    if-eq v1, v4, :cond_1

    iget-object v5, p0, Lcom/facebook/c/t;->a:Landroid/content/pm/PackageManager;

    invoke-virtual {v5, v1, v4}, Landroid/content/pm/PackageManager;->checkSignatures(II)I

    move-result v4

    if-nez v4, :cond_0

    .line 45
    :cond_1
    invoke-virtual {v2, v0}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 49
    :cond_2
    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v0

    return-object v0
.end method
