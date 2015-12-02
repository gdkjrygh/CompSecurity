.class public Lcom/facebook/bugreporter/activity/BugReportActivity;
.super Lcom/facebook/base/activity/i;
.source "BugReportActivity.java"

# interfaces
.implements Lcom/facebook/bugreporter/x;


# annotations
.annotation runtime Lcom/facebook/base/activity/AuthNotRequired;
.end annotation


# static fields
.field private static final p:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private q:Lcom/facebook/bugreporter/ConstBugReporterConfig;

.field private r:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private s:Lcom/facebook/bugreporter/m;

.field private t:Lcom/facebook/common/w/q;

.field private u:Lcom/facebook/base/fragment/c;

.field private v:Lcom/facebook/bugreporter/b;

.field private w:Lcom/facebook/ui/i/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 46
    const-class v0, Lcom/facebook/bugreporter/activity/BugReportActivity;

    sput-object v0, Lcom/facebook/bugreporter/activity/BugReportActivity;->p:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    .line 287
    return-void
.end method

.method private a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V
    .locals 5

    .prologue
    const/4 v4, -0x1

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 210
    if-nez p2, :cond_1

    .line 211
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/BugReportActivity;->finish()V

    .line 261
    :cond_0
    :goto_0
    return-void

    .line 215
    :cond_1
    instance-of v2, p1, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;

    if-eqz v2, :cond_5

    .line 216
    const-string v2, "retry"

    invoke-virtual {p2, v2, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    .line 217
    if-nez v2, :cond_3

    .line 218
    const-string v0, "category_id"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 219
    if-nez v0, :cond_2

    const-string v0, "100977986739334"

    .line 220
    :cond_2
    iget-object v3, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->v:Lcom/facebook/bugreporter/b;

    invoke-virtual {v3, v0}, Lcom/facebook/bugreporter/b;->c(Ljava/lang/String;)Lcom/facebook/bugreporter/b;

    .line 223
    :cond_3
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->t:Lcom/facebook/common/w/q;

    sget-object v3, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    if-ne v0, v3, :cond_4

    .line 224
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->v:Lcom/facebook/bugreporter/b;

    invoke-virtual {v0}, Lcom/facebook/bugreporter/b;->h()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0, v2}, Lcom/facebook/bugreporter/activity/BugReportActivity;->a(ZLjava/lang/String;Z)V

    goto :goto_0

    .line 226
    :cond_4
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->v:Lcom/facebook/bugreporter/b;

    invoke-virtual {v0}, Lcom/facebook/bugreporter/b;->o()Lcom/facebook/bugreporter/BugReport;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lcom/facebook/bugreporter/activity/BugReportActivity;->a(ZLcom/facebook/bugreporter/BugReport;)V

    goto :goto_0

    .line 228
    :cond_5
    instance-of v2, p1, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;

    if-eqz v2, :cond_9

    .line 229
    const-string v2, "task_number"

    invoke-virtual {p2, v2, v4}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    .line 230
    const-string v3, "remove_fragment"

    invoke-virtual {p2, v3, v0}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v3

    .line 233
    if-eq v2, v4, :cond_6

    .line 234
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->s:Lcom/facebook/bugreporter/m;

    iget-object v1, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->v:Lcom/facebook/bugreporter/b;

    invoke-virtual {v1}, Lcom/facebook/bugreporter/b;->a()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/bugreporter/m;->a(Landroid/net/Uri;)V

    .line 235
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->w:Lcom/facebook/ui/i/g;

    new-instance v1, Lcom/facebook/ui/i/a;

    sget v2, Lcom/facebook/o;->bug_report_thank_you_toast:I

    invoke-direct {v1, v2}, Lcom/facebook/ui/i/a;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/facebook/ui/i/g;->a(Lcom/facebook/ui/i/a;)V

    .line 237
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/BugReportActivity;->finish()V

    goto :goto_0

    .line 241
    :cond_6
    if-eqz v3, :cond_8

    .line 242
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/BugReportActivity;->f()Landroid/support/v4/app/q;

    move-result-object v2

    .line 245
    invoke-virtual {v2}, Landroid/support/v4/app/q;->f()I

    move-result v3

    if-nez v3, :cond_7

    .line 252
    :goto_1
    iget-object v1, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->v:Lcom/facebook/bugreporter/b;

    invoke-virtual {v1}, Lcom/facebook/bugreporter/b;->o()Lcom/facebook/bugreporter/BugReport;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/facebook/bugreporter/activity/BugReportActivity;->a(ZLcom/facebook/bugreporter/BugReport;)V

    goto :goto_0

    .line 249
    :cond_7
    const-string v0, "task_list_bs"

    invoke-virtual {v2, v0, v1}, Landroid/support/v4/app/q;->a(Ljava/lang/String;I)V

    :cond_8
    move v0, v1

    goto :goto_1

    .line 254
    :cond_9
    instance-of v0, p1, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;

    if-eqz v0, :cond_0

    .line 255
    const-string v0, "bug_desc"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 257
    invoke-static {v0}, Lcom/google/common/base/Strings;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 258
    iget-object v1, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->v:Lcom/facebook/bugreporter/b;

    invoke-virtual {v1, v0}, Lcom/facebook/bugreporter/b;->a(Ljava/lang/String;)Lcom/facebook/bugreporter/b;

    goto/16 :goto_0
.end method

.method static synthetic a(Lcom/facebook/bugreporter/activity/BugReportActivity;Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0, p1, p2}, Lcom/facebook/bugreporter/activity/BugReportActivity;->a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic a(Lcom/facebook/bugreporter/activity/BugReportActivity;Z)V
    .locals 0

    .prologue
    .line 44
    invoke-direct {p0, p1}, Lcom/facebook/bugreporter/activity/BugReportActivity;->b(Z)V

    return-void
.end method

.method private a(ZLcom/facebook/bugreporter/BugReport;)V
    .locals 4

    .prologue
    .line 194
    invoke-direct {p0}, Lcom/facebook/bugreporter/activity/BugReportActivity;->j()Landroid/os/Bundle;

    move-result-object v0

    .line 195
    const-string v1, "report"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 197
    new-instance v1, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;

    invoke-direct {v1}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;-><init>()V

    .line 198
    invoke-virtual {v1, v0}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->g(Landroid/os/Bundle;)V

    .line 199
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->u:Lcom/facebook/base/fragment/c;

    invoke-virtual {v1, v0}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->a(Lcom/facebook/base/fragment/c;)V

    .line 201
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/BugReportActivity;->f()Landroid/support/v4/app/q;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v0

    .line 202
    sget v2, Lcom/facebook/i;->container:I

    const-string v3, "bugReport"

    invoke-virtual {v0, v2, v1, v3}, Landroid/support/v4/app/ad;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 203
    if-eqz p1, :cond_0

    .line 204
    const-string v1, "bugReport_bs"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/ad;->a(Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 206
    :cond_0
    invoke-virtual {v0}, Landroid/support/v4/app/ad;->a()I

    .line 207
    return-void
.end method

.method private a(ZLjava/lang/String;Z)V
    .locals 4

    .prologue
    .line 177
    invoke-direct {p0}, Lcom/facebook/bugreporter/activity/BugReportActivity;->j()Landroid/os/Bundle;

    move-result-object v0

    .line 178
    const-string v1, "category_id"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    const-string v1, "retry"

    invoke-virtual {v0, v1, p3}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 181
    new-instance v1, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;

    invoke-direct {v1}, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;-><init>()V

    .line 182
    invoke-virtual {v1, v0}, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->g(Landroid/os/Bundle;)V

    .line 183
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->u:Lcom/facebook/base/fragment/c;

    invoke-virtual {v1, v0}, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->a(Lcom/facebook/base/fragment/c;)V

    .line 185
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/BugReportActivity;->f()Landroid/support/v4/app/q;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v0

    .line 186
    sget v2, Lcom/facebook/i;->container:I

    const-string v3, "tagList"

    invoke-virtual {v0, v2, v1, v3}, Landroid/support/v4/app/ad;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 187
    if-eqz p1, :cond_0

    .line 188
    const-string v1, "task_list_bs"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/ad;->a(Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 190
    :cond_0
    invoke-virtual {v0}, Landroid/support/v4/app/ad;->a()I

    .line 191
    return-void
.end method

.method private a(ZZ)V
    .locals 4

    .prologue
    .line 161
    invoke-direct {p0}, Lcom/facebook/bugreporter/activity/BugReportActivity;->j()Landroid/os/Bundle;

    move-result-object v0

    .line 162
    const-string v1, "retry"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 164
    new-instance v1, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;

    invoke-direct {v1}, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;-><init>()V

    .line 165
    iget-object v2, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->u:Lcom/facebook/base/fragment/c;

    invoke-virtual {v1, v2}, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;->a(Lcom/facebook/base/fragment/c;)V

    .line 166
    invoke-virtual {v1, v0}, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;->g(Landroid/os/Bundle;)V

    .line 168
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/BugReportActivity;->f()Landroid/support/v4/app/q;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/q;->a()Landroid/support/v4/app/ad;

    move-result-object v0

    .line 169
    sget v2, Lcom/facebook/i;->container:I

    const-string v3, "categoryList"

    invoke-virtual {v0, v2, v1, v3}, Landroid/support/v4/app/ad;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 170
    if-eqz p1, :cond_0

    .line 171
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/app/ad;->a(Ljava/lang/String;)Landroid/support/v4/app/ad;

    .line 173
    :cond_0
    invoke-virtual {v0}, Landroid/support/v4/app/ad;->a()I

    .line 174
    return-void
.end method

.method private b(Z)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 134
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->q:Lcom/facebook/bugreporter/ConstBugReporterConfig;

    invoke-virtual {v0}, Lcom/facebook/bugreporter/ConstBugReporterConfig;->a()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/es;->size()I

    move-result v0

    .line 135
    if-le v0, v1, :cond_0

    .line 137
    invoke-direct {p0, v2, p1}, Lcom/facebook/bugreporter/activity/BugReportActivity;->a(ZZ)V

    .line 158
    :goto_0
    return-void

    .line 141
    :cond_0
    if-ne v0, v1, :cond_1

    .line 142
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->q:Lcom/facebook/bugreporter/ConstBugReporterConfig;

    invoke-virtual {v0}, Lcom/facebook/bugreporter/ConstBugReporterConfig;->a()Lcom/google/common/a/es;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/google/common/a/es;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;

    iget-wide v0, v0, Lcom/facebook/bugreporter/activity/categorylist/CategoryInfo;->b:J

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    .line 149
    iget-object v1, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->v:Lcom/facebook/bugreporter/b;

    invoke-virtual {v1, v0}, Lcom/facebook/bugreporter/b;->c(Ljava/lang/String;)Lcom/facebook/bugreporter/b;

    .line 152
    sget-object v0, Lcom/facebook/common/w/q;->YES:Lcom/facebook/common/w/q;

    iget-object v1, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->t:Lcom/facebook/common/w/q;

    invoke-virtual {v0, v1}, Lcom/facebook/common/w/q;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 153
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->v:Lcom/facebook/bugreporter/b;

    invoke-virtual {v0}, Lcom/facebook/bugreporter/b;->h()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v2, v0, p1}, Lcom/facebook/bugreporter/activity/BugReportActivity;->a(ZLjava/lang/String;Z)V

    goto :goto_0

    .line 146
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/BugReportActivity;->finish()V

    goto :goto_0

    .line 155
    :cond_2
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->v:Lcom/facebook/bugreporter/b;

    invoke-virtual {v0}, Lcom/facebook/bugreporter/b;->o()Lcom/facebook/bugreporter/BugReport;

    move-result-object v0

    invoke-direct {p0, v2, v0}, Lcom/facebook/bugreporter/activity/BugReportActivity;->a(ZLcom/facebook/bugreporter/BugReport;)V

    goto :goto_0
.end method

.method private j()Landroid/os/Bundle;
    .locals 3

    .prologue
    .line 279
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 280
    const-string v1, "reporter_config"

    iget-object v2, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->q:Lcom/facebook/bugreporter/ConstBugReporterConfig;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 281
    return-object v0
.end method


# virtual methods
.method protected b(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    .line 70
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 72
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/BugReportActivity;->i()Lcom/facebook/inject/t;

    move-result-object v1

    .line 73
    const-class v0, Lcom/facebook/bugreporter/m;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/m;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->s:Lcom/facebook/bugreporter/m;

    .line 74
    const-class v0, Lcom/facebook/common/w/q;

    const-class v2, Lcom/facebook/auth/annotations/IsMeUserAnEmployee;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/w/q;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->t:Lcom/facebook/common/w/q;

    .line 75
    const-class v0, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/bugreporter/annotations/IsOldVersionOfTheApp;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->r:Ljavax/inject/a;

    .line 76
    const-class v0, Lcom/facebook/ui/i/g;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/i/g;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->w:Lcom/facebook/ui/i/g;

    .line 78
    sget v0, Lcom/facebook/k;->bug_reporter:I

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/BugReportActivity;->setContentView(I)V

    .line 80
    new-instance v0, Lcom/facebook/bugreporter/activity/c;

    invoke-direct {v0, p0}, Lcom/facebook/bugreporter/activity/c;-><init>(Lcom/facebook/bugreporter/activity/BugReportActivity;)V

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->u:Lcom/facebook/base/fragment/c;

    .line 87
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/BugReportActivity;->f()Landroid/support/v4/app/q;

    move-result-object v1

    .line 89
    const-string v0, "categoryList"

    invoke-virtual {v1, v0}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;

    .line 91
    if-eqz v0, :cond_0

    .line 92
    iget-object v2, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->u:Lcom/facebook/base/fragment/c;

    invoke-virtual {v0, v2}, Lcom/facebook/bugreporter/activity/categorylist/CategoryListFragment;->a(Lcom/facebook/base/fragment/c;)V

    .line 95
    :cond_0
    const-string v0, "tagList"

    invoke-virtual {v1, v0}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;

    .line 96
    if-eqz v0, :cond_1

    .line 97
    iget-object v2, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->u:Lcom/facebook/base/fragment/c;

    invoke-virtual {v0, v2}, Lcom/facebook/bugreporter/activity/tasklist/TaskListFragment;->a(Lcom/facebook/base/fragment/c;)V

    .line 100
    :cond_1
    const-string v0, "bugReport"

    invoke-virtual {v1, v0}, Landroid/support/v4/app/q;->a(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;

    .line 101
    if-eqz v0, :cond_2

    .line 102
    iget-object v2, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->u:Lcom/facebook/base/fragment/c;

    invoke-virtual {v0, v2}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->a(Lcom/facebook/base/fragment/c;)V

    .line 105
    :cond_2
    if-eqz p1, :cond_3

    .line 107
    const-string v0, "report"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/BugReport;

    .line 108
    invoke-static {}, Lcom/facebook/bugreporter/BugReport;->newBuilder()Lcom/facebook/bugreporter/b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/facebook/bugreporter/b;->a(Lcom/facebook/bugreporter/BugReport;)Lcom/facebook/bugreporter/b;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->v:Lcom/facebook/bugreporter/b;

    .line 109
    const-string v0, "reporter_config"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/ConstBugReporterConfig;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->q:Lcom/facebook/bugreporter/ConstBugReporterConfig;

    .line 131
    :goto_0
    return-void

    .line 112
    :cond_3
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/BugReportActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 113
    const-string v0, "retry"

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v3

    .line 114
    const-string v0, "report"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/BugReport;

    .line 115
    if-nez v0, :cond_4

    .line 116
    sget-object v0, Lcom/facebook/bugreporter/activity/BugReportActivity;->p:Ljava/lang/Class;

    const-string v1, "Missing bug report in intent"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 117
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/BugReportActivity;->finish()V

    goto :goto_0

    .line 120
    :cond_4
    invoke-static {}, Lcom/facebook/bugreporter/BugReport;->newBuilder()Lcom/facebook/bugreporter/b;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/facebook/bugreporter/b;->a(Lcom/facebook/bugreporter/BugReport;)Lcom/facebook/bugreporter/b;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->v:Lcom/facebook/bugreporter/b;

    .line 122
    const-string v0, "reporter_config"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/ConstBugReporterConfig;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->q:Lcom/facebook/bugreporter/ConstBugReporterConfig;

    .line 124
    if-nez v3, :cond_5

    iget-object v0, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->r:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 125
    new-instance v0, Lcom/facebook/bugreporter/activity/d;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/facebook/bugreporter/activity/d;-><init>(Lcom/facebook/bugreporter/activity/BugReportActivity;Lcom/facebook/bugreporter/activity/c;)V

    .line 126
    const-string v2, "oldVersionDialog"

    invoke-virtual {v0, v1, v2}, Lcom/facebook/bugreporter/activity/d;->a(Landroid/support/v4/app/q;Ljava/lang/String;)V

    goto :goto_0

    .line 128
    :cond_5
    invoke-direct {p0, v3}, Lcom/facebook/bugreporter/activity/BugReportActivity;->b(Z)V

    goto :goto_0
.end method

.method public onBackPressed()V
    .locals 2

    .prologue
    .line 272
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/BugReportActivity;->f()Landroid/support/v4/app/q;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/q;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 273
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->s:Lcom/facebook/bugreporter/m;

    iget-object v1, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->v:Lcom/facebook/bugreporter/b;

    invoke-virtual {v1}, Lcom/facebook/bugreporter/b;->a()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/bugreporter/m;->a(Landroid/net/Uri;)V

    .line 274
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/BugReportActivity;->finish()V

    .line 276
    :cond_0
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 265
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 266
    const-string v0, "reporter_config"

    iget-object v1, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->q:Lcom/facebook/bugreporter/ConstBugReporterConfig;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 267
    const-string v0, "report"

    iget-object v1, p0, Lcom/facebook/bugreporter/activity/BugReportActivity;->v:Lcom/facebook/bugreporter/b;

    invoke-virtual {v1}, Lcom/facebook/bugreporter/b;->o()Lcom/facebook/bugreporter/BugReport;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 268
    return-void
.end method
