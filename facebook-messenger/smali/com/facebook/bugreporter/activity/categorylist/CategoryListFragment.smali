.class public Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;
.super Lcom/facebook/base/fragment/FbFragment;
.source "CategoryListFragment.java"

# interfaces
.implements Lcom/facebook/base/fragment/b;


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private b:Lcom/facebook/bugreporter/activity/categorylist/b;

.field private c:Lcom/facebook/base/fragment/c;

.field private d:Lcom/facebook/widget/titlebar/a;

.field private e:Landroid/widget/ListView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 34
    const-class v0, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;

    sput-object v0, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0}, Lcom/facebook/base/fragment/FbFragment;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;I)V
    .locals 0

    .prologue
    .line 32
    invoke-direct {p0, p1}, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;->e(I)V

    return-void
.end method

.method private e(I)V
    .locals 5

    .prologue
    .line 96
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;->c:Lcom/facebook/base/fragment/c;

    if-eqz v0, :cond_1

    .line 97
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 98
    iget-object v1, p0, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;->b:Lcom/facebook/bugreporter/activity/categorylist/b;

    invoke-virtual {v1, p1}, Lcom/facebook/bugreporter/activity/categorylist/b;->a(I)Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;

    move-result-object v1

    .line 99
    if-eqz v1, :cond_0

    .line 100
    const-string v2, "category_id"

    iget-wide v3, v1, Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;->b:J

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 102
    :cond_0
    iget-object v1, p0, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;->c:Lcom/facebook/base/fragment/c;

    invoke-interface {v1, p0, v0}, Lcom/facebook/base/fragment/c;->a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V

    .line 104
    :cond_1
    return-void
.end method


# virtual methods
.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 45
    sget v0, Lcom/facebook/k;->category_list_view:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/base/fragment/c;)V
    .locals 0

    .prologue
    .line 92
    iput-object p1, p0, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;->c:Lcom/facebook/base/fragment/c;

    .line 93
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    .line 50
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->d(Landroid/os/Bundle;)V

    .line 52
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;->S()Lcom/facebook/inject/t;

    move-result-object v1

    .line 53
    const-class v0, Lcom/facebook/bugreporter/activity/categorylist/b;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/activity/categorylist/b;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;->b:Lcom/facebook/bugreporter/activity/categorylist/b;

    .line 54
    const-class v0, Lcom/facebook/common/w/q;

    const-class v2, Lcom/facebook/auth/annotations/IsMeUserAnEmployee;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/w/q;

    .line 57
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;->k()Landroid/os/Bundle;

    move-result-object v1

    const-string v2, "reporter_config"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lcom/facebook/bugreporter/ConstBugReporterConfig;

    .line 59
    invoke-static {}, Lcom/google/common/a/es;->e()Lcom/google/common/a/et;

    move-result-object v2

    .line 60
    invoke-virtual {v1}, Lcom/facebook/bugreporter/ConstBugReporterConfig;->a()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/a/es;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;

    .line 61
    sget-object v4, Lcom/facebook/common/w/q;->NO:Lcom/facebook/common/w/q;

    if-ne v4, v0, :cond_1

    iget-boolean v4, v1, Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;->c:Z

    if-eqz v4, :cond_0

    .line 63
    :cond_1
    invoke-virtual {v2, v1}, Lcom/google/common/a/et;->b(Ljava/lang/Object;)Lcom/google/common/a/et;

    goto :goto_0

    .line 65
    :cond_2
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;->b:Lcom/facebook/bugreporter/activity/categorylist/b;

    invoke-virtual {v2}, Lcom/google/common/a/et;->b()Lcom/google/common/a/es;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/bugreporter/activity/categorylist/b;->a(Lcom/google/common/a/es;)V

    .line 67
    const v0, 0x102000a

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;->e:Landroid/widget/ListView;

    .line 68
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;->e:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;->b:Lcom/facebook/bugreporter/activity/categorylist/b;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 70
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;->z()Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/widget/titlebar/c;->a(Landroid/view/View;)Z

    .line 71
    sget v0, Lcom/facebook/i;->titlebar:I

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/titlebar/a;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;->d:Lcom/facebook/widget/titlebar/a;

    .line 72
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;->d:Lcom/facebook/widget/titlebar/a;

    sget v1, Lcom/facebook/o;->bug_report_category_list_title:I

    invoke-interface {v0, v1}, Lcom/facebook/widget/titlebar/a;->setTitle(I)V

    .line 74
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;->e:Landroid/widget/ListView;

    new-instance v1, Lcom/facebook/bugreporter/activity/categorylist/c;

    invoke-direct {v1, p0}, Lcom/facebook/bugreporter/activity/categorylist/c;-><init>(Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 81
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;->k()Landroid/os/Bundle;

    move-result-object v0

    .line 82
    const-string v1, "retry"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 83
    if-eqz v0, :cond_3

    .line 84
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 85
    const-string v1, "retry"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 86
    iget-object v1, p0, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;->c:Lcom/facebook/base/fragment/c;

    invoke-interface {v1, p0, v0}, Lcom/facebook/base/fragment/c;->a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V

    .line 88
    :cond_3
    return-void
.end method
