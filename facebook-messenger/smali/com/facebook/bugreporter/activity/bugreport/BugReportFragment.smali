.class public Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;
.super Lcom/facebook/base/fragment/FbFragment;
.source "BugReportFragment.java"

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
.field private Z:Lcom/facebook/bugreporter/b;

.field private aa:Lcom/facebook/base/fragment/c;

.field private ab:Lcom/facebook/widget/titlebar/a;

.field private ac:Landroid/widget/EditText;

.field private ad:Landroid/view/View;

.field private ae:Lcom/facebook/widget/images/UrlImage;

.field private af:Landroid/view/View;

.field private ag:Landroid/widget/TextView;

.field private ah:Landroid/widget/TextView;

.field private ai:Z

.field private aj:Z

.field private ak:Lcom/facebook/bugreporter/ConstBugReporterConfig;

.field private b:Lcom/facebook/config/b/a;

.field private c:Lcom/facebook/bugreporter/f;

.field private d:Lcom/google/common/d/a/u;

.field private e:Ljava/util/concurrent/Executor;

.field private f:Lcom/facebook/common/l/a;

.field private g:Lcom/facebook/common/n/a;

.field private h:Lcom/facebook/base/j;

.field private i:Lcom/facebook/ui/i/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 63
    const-class v0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;

    sput-object v0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0}, Lcom/facebook/base/fragment/FbFragment;-><init>()V

    return-void
.end method

.method private a()V
    .locals 3

    .prologue
    .line 216
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->Z:Lcom/facebook/bugreporter/b;

    invoke-virtual {v0}, Lcom/facebook/bugreporter/b;->d()Landroid/net/Uri;

    move-result-object v0

    .line 217
    iget-object v1, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->d:Lcom/google/common/d/a/u;

    new-instance v2, Lcom/facebook/bugreporter/activity/bugreport/d;

    invoke-direct {v2, p0, v0}, Lcom/facebook/bugreporter/activity/bugreport/d;-><init>(Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;Landroid/net/Uri;)V

    invoke-interface {v1, v2}, Lcom/google/common/d/a/u;->c(Ljava/util/concurrent/Callable;)Lcom/google/common/d/a/s;

    move-result-object v0

    .line 224
    new-instance v1, Lcom/facebook/bugreporter/activity/bugreport/e;

    invoke-direct {v1, p0}, Lcom/facebook/bugreporter/activity/bugreport/e;-><init>(Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;)V

    iget-object v2, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->e:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, v2}, Lcom/google/common/d/a/i;->a(Lcom/google/common/d/a/s;Lcom/google/common/d/a/h;Ljava/util/concurrent/Executor;)V

    .line 237
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->Z:Lcom/facebook/bugreporter/b;

    invoke-virtual {v0}, Lcom/facebook/bugreporter/b;->d()Landroid/net/Uri;

    .line 238
    return-void
.end method

.method static synthetic a(Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->b()V

    return-void
.end method

.method private b()V
    .locals 2

    .prologue
    .line 241
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ai:Z

    .line 242
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ad:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 243
    return-void
.end method

.method static synthetic b(Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->c()V

    return-void
.end method

.method static synthetic c(Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;)Lcom/facebook/common/n/a;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->g:Lcom/facebook/common/n/a;

    return-object v0
.end method

.method private c()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 246
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ac:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 247
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    .line 248
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->i:Lcom/facebook/ui/i/g;

    new-instance v1, Lcom/facebook/ui/i/a;

    sget v2, Lcom/facebook/o;->bug_report_please_enter_text:I

    invoke-direct {v1, v2}, Lcom/facebook/ui/i/a;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/facebook/ui/i/g;->a(Lcom/facebook/ui/i/a;)V

    .line 299
    :goto_0
    return-void

    .line 251
    :cond_0
    iget-object v1, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->Z:Lcom/facebook/bugreporter/b;

    invoke-virtual {v1, v0}, Lcom/facebook/bugreporter/b;->a(Ljava/lang/String;)Lcom/facebook/bugreporter/b;

    .line 253
    iget-boolean v1, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ai:Z

    if-eqz v1, :cond_1

    .line 254
    iget-object v1, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->Z:Lcom/facebook/bugreporter/b;

    invoke-virtual {v1, v4}, Lcom/facebook/bugreporter/b;->c(Landroid/net/Uri;)Lcom/facebook/bugreporter/b;

    .line 259
    :cond_1
    :try_start_0
    new-instance v1, Ljava/io/File;

    new-instance v2, Ljava/net/URI;

    iget-object v3, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->Z:Lcom/facebook/bugreporter/b;

    invoke-virtual {v3}, Lcom/facebook/bugreporter/b;->a()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/net/URI;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 264
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_2

    .line 265
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 270
    :cond_2
    :try_start_1
    new-instance v2, Ljava/io/File;

    const-string v3, "description.txt"

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 271
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-static {v0, v2}, Lcom/facebook/common/f/e;->a([BLjava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 276
    :goto_1
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->b:Lcom/facebook/config/b/a;

    invoke-interface {v0}, Lcom/facebook/config/b/a;->b()I

    move-result v0

    int-to-long v0, v0

    .line 277
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_3

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    .line 279
    :goto_2
    iget-object v1, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->Z:Lcom/facebook/bugreporter/b;

    iget-object v2, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->f:Lcom/facebook/common/l/a;

    iget-object v2, v2, Lcom/facebook/common/l/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/facebook/bugreporter/b;->d(Ljava/lang/String;)Lcom/facebook/bugreporter/b;

    .line 280
    iget-object v1, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->Z:Lcom/facebook/bugreporter/b;

    invoke-virtual {v1, v0}, Lcom/facebook/bugreporter/b;->e(Ljava/lang/String;)Lcom/facebook/bugreporter/b;

    .line 282
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->h:Lcom/facebook/base/j;

    sget-object v1, Lcom/facebook/base/j;->PROD:Lcom/facebook/base/j;

    if-ne v0, v1, :cond_4

    .line 283
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->Z:Lcom/facebook/bugreporter/b;

    invoke-virtual {v0, v4}, Lcom/facebook/bugreporter/b;->f(Ljava/lang/String;)Lcom/facebook/bugreporter/b;

    .line 284
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->Z:Lcom/facebook/bugreporter/b;

    invoke-virtual {v0, v4}, Lcom/facebook/bugreporter/b;->g(Ljava/lang/String;)Lcom/facebook/bugreporter/b;

    .line 290
    :goto_3
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->d:Lcom/google/common/d/a/u;

    new-instance v1, Lcom/facebook/bugreporter/activity/bugreport/f;

    invoke-direct {v1, p0}, Lcom/facebook/bugreporter/activity/bugreport/f;-><init>(Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;)V

    invoke-interface {v0, v1}, Lcom/google/common/d/a/u;->execute(Ljava/lang/Runnable;)V

    .line 296
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->aa:Lcom/facebook/base/fragment/c;

    invoke-interface {v0, p0, v4}, Lcom/facebook/base/fragment/c;->a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V

    .line 298
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->aj:Z

    goto :goto_0

    .line 260
    :catch_0
    move-exception v0

    .line 261
    sget-object v0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->a:Ljava/lang/Class;

    const-string v1, "Cannot resolve bug report directory."

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 272
    :catch_1
    move-exception v0

    .line 273
    sget-object v0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->a:Ljava/lang/Class;

    const-string v1, "Cannot save description"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_1

    .line 277
    :cond_3
    const-string v0, ""

    goto :goto_2

    .line 286
    :cond_4
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->Z:Lcom/facebook/bugreporter/b;

    iget-object v1, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->f:Lcom/facebook/common/l/a;

    iget-object v1, v1, Lcom/facebook/common/l/a;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/bugreporter/b;->f(Ljava/lang/String;)Lcom/facebook/bugreporter/b;

    .line 287
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->Z:Lcom/facebook/bugreporter/b;

    iget-object v1, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->f:Lcom/facebook/common/l/a;

    iget-object v1, v1, Lcom/facebook/common/l/a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/bugreporter/b;->g(Ljava/lang/String;)Lcom/facebook/bugreporter/b;

    goto :goto_3
.end method

.method static synthetic d(Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ag:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic e(Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;)Lcom/facebook/bugreporter/b;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->Z:Lcom/facebook/bugreporter/b;

    return-object v0
.end method

.method static synthetic f(Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;)Lcom/facebook/bugreporter/ConstBugReporterConfig;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ak:Lcom/facebook/bugreporter/ConstBugReporterConfig;

    return-object v0
.end method

.method static synthetic g(Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;)Lcom/facebook/bugreporter/f;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->c:Lcom/facebook/bugreporter/f;

    return-object v0
.end method


# virtual methods
.method public A()V
    .locals 2

    .prologue
    .line 204
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->A()V

    .line 205
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ac:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->requestFocus()Z

    .line 206
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->n()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ac:Landroid/widget/EditText;

    invoke-static {v0, v1}, Lcom/facebook/ui/e/a;->a(Landroid/content/Context;Landroid/view/View;)V

    .line 207
    return-void
.end method

.method public B()V
    .locals 1

    .prologue
    .line 211
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->B()V

    .line 212
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->l()Landroid/support/v4/app/i;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/ui/e/a;->a(Landroid/app/Activity;)V

    .line 213
    return-void
.end method

.method public a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .prologue
    .line 93
    sget v0, Lcom/facebook/k;->bug_reporter_fragment:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/base/fragment/c;)V
    .locals 0

    .prologue
    .line 303
    iput-object p1, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->aa:Lcom/facebook/base/fragment/c;

    .line 304
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    const/4 v3, 0x1

    .line 98
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->d(Landroid/os/Bundle;)V

    .line 100
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->n()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 101
    const-class v0, Lcom/facebook/config/b/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/b/a;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->b:Lcom/facebook/config/b/a;

    .line 102
    const-class v0, Lcom/facebook/bugreporter/f;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/f;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->c:Lcom/facebook/bugreporter/f;

    .line 103
    const-class v0, Lcom/google/common/d/a/u;

    const-class v2, Lcom/facebook/common/executors/DefaultExecutorService;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/d/a/u;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->d:Lcom/google/common/d/a/u;

    .line 105
    const-class v0, Ljava/util/concurrent/Executor;

    const-class v2, Lcom/facebook/common/executors/ForUiThread;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/Executor;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->e:Ljava/util/concurrent/Executor;

    .line 106
    const-class v0, Lcom/facebook/common/l/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/l/a;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->f:Lcom/facebook/common/l/a;

    .line 107
    const-class v0, Lcom/facebook/common/n/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/n/a;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->g:Lcom/facebook/common/n/a;

    .line 108
    const-class v0, Lcom/facebook/base/j;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/j;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->h:Lcom/facebook/base/j;

    .line 109
    const-class v0, Lcom/facebook/ui/i/g;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/ui/i/g;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->i:Lcom/facebook/ui/i/g;

    .line 112
    if-eqz p1, :cond_0

    .line 113
    const-string v0, "report"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/BugReport;

    move-object v1, v0

    .line 117
    :goto_0
    if-nez v1, :cond_1

    .line 118
    sget-object v0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->a:Ljava/lang/Class;

    const-string v1, "Missing bug report in intent"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 119
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->aa:Lcom/facebook/base/fragment/c;

    const/4 v1, 0x0

    invoke-interface {v0, p0, v1}, Lcom/facebook/base/fragment/c;->a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V

    .line 120
    iput-boolean v3, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->aj:Z

    .line 192
    :goto_1
    return-void

    .line 115
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->k()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "report"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/BugReport;

    move-object v1, v0

    goto :goto_0

    .line 123
    :cond_1
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->k()Landroid/os/Bundle;

    move-result-object v0

    const-string v2, "reporter_config"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/facebook/bugreporter/ConstBugReporterConfig;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ak:Lcom/facebook/bugreporter/ConstBugReporterConfig;

    .line 125
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->z()Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/widget/titlebar/c;->a(Landroid/view/View;)Z

    .line 126
    sget v0, Lcom/facebook/i;->titlebar:I

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/titlebar/a;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ab:Lcom/facebook/widget/titlebar/a;

    .line 127
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ab:Lcom/facebook/widget/titlebar/a;

    sget v2, Lcom/facebook/o;->bug_report_title:I

    invoke-interface {v0, v2}, Lcom/facebook/widget/titlebar/a;->setTitle(I)V

    .line 129
    sget v0, Lcom/facebook/i;->text:I

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ac:Landroid/widget/EditText;

    .line 130
    sget v0, Lcom/facebook/i;->screenshot_section:I

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->d(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ad:Landroid/view/View;

    .line 131
    sget v0, Lcom/facebook/i;->screenshot:I

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/images/UrlImage;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ae:Lcom/facebook/widget/images/UrlImage;

    .line 132
    sget v0, Lcom/facebook/i;->screenshot_remove:I

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->d(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->af:Landroid/view/View;

    .line 133
    sget v0, Lcom/facebook/i;->screenshot_description:I

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ag:Landroid/widget/TextView;

    .line 134
    sget v0, Lcom/facebook/i;->bug_report_disclaimer:I

    invoke-virtual {p0, v0}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->d(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ah:Landroid/widget/TextView;

    .line 136
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->af:Landroid/view/View;

    new-instance v2, Lcom/facebook/bugreporter/activity/bugreport/a;

    invoke-direct {v2, p0}, Lcom/facebook/bugreporter/activity/bugreport/a;-><init>(Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 143
    invoke-static {}, Lcom/facebook/widget/titlebar/d;->newBuilder()Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/facebook/widget/titlebar/e;->a(I)Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    sget v2, Lcom/facebook/o;->bug_report_send:I

    invoke-virtual {p0, v2}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->a(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/facebook/widget/titlebar/e;->b(Ljava/lang/String;)Lcom/facebook/widget/titlebar/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/widget/titlebar/e;->k()Lcom/facebook/widget/titlebar/d;

    move-result-object v0

    .line 147
    iget-object v2, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ab:Lcom/facebook/widget/titlebar/a;

    invoke-static {v0}, Lcom/google/common/a/es;->a(Ljava/lang/Object;)Lcom/google/common/a/es;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/facebook/widget/titlebar/a;->setButtonSpecs(Ljava/util/List;)V

    .line 148
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ab:Lcom/facebook/widget/titlebar/a;

    new-instance v2, Lcom/facebook/bugreporter/activity/bugreport/b;

    invoke-direct {v2, p0}, Lcom/facebook/bugreporter/activity/bugreport/b;-><init>(Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;)V

    invoke-interface {v0, v2}, Lcom/facebook/widget/titlebar/a;->setOnToolbarButtonListener(Lcom/facebook/widget/titlebar/b;)V

    .line 155
    invoke-static {}, Lcom/facebook/bugreporter/BugReport;->newBuilder()Lcom/facebook/bugreporter/b;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/facebook/bugreporter/b;->a(Lcom/facebook/bugreporter/BugReport;)Lcom/facebook/bugreporter/b;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->Z:Lcom/facebook/bugreporter/b;

    .line 158
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->Z:Lcom/facebook/bugreporter/b;

    invoke-virtual {v0}, Lcom/facebook/bugreporter/b;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 159
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ac:Landroid/widget/EditText;

    iget-object v1, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->Z:Lcom/facebook/bugreporter/b;

    invoke-virtual {v1}, Lcom/facebook/bugreporter/b;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 162
    :cond_2
    if-eqz p1, :cond_3

    .line 163
    const-string v0, "screenshotRemoved"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ai:Z

    .line 166
    :cond_3
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->Z:Lcom/facebook/bugreporter/b;

    invoke-virtual {v0}, Lcom/facebook/bugreporter/b;->d()Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ai:Z

    if-eqz v0, :cond_5

    .line 167
    :cond_4
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ad:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 174
    :goto_2
    new-instance v0, Lcom/facebook/widget/text/CustomUrlLikeSpan;

    invoke-direct {v0}, Lcom/facebook/widget/text/CustomUrlLikeSpan;-><init>()V

    .line 175
    new-instance v1, Lcom/facebook/bugreporter/activity/bugreport/c;

    invoke-direct {v1, p0}, Lcom/facebook/bugreporter/activity/bugreport/c;-><init>(Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;)V

    invoke-virtual {v0, v1}, Lcom/facebook/widget/text/CustomUrlLikeSpan;->a(Lcom/facebook/widget/text/f;)V

    .line 184
    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->o()Landroid/content/res/Resources;

    move-result-object v1

    .line 185
    new-instance v2, Lcom/facebook/common/w/o;

    invoke-virtual {p0}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->o()Landroid/content/res/Resources;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/facebook/common/w/o;-><init>(Landroid/content/res/Resources;)V

    .line 186
    sget v3, Lcom/facebook/o;->bug_report_disclaimer:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;)Lcom/facebook/common/w/o;

    .line 187
    const-string v3, "[[link]]"

    sget v4, Lcom/facebook/o;->bug_report_disclaimer_data_use_link:I

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/16 v4, 0x21

    invoke-virtual {v2, v3, v1, v0, v4}, Lcom/facebook/common/w/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;I)Lcom/facebook/common/w/o;

    .line 190
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ah:Landroid/widget/TextView;

    invoke-virtual {v2}, Lcom/facebook/common/w/o;->b()Landroid/text/SpannableString;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 191
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ah:Landroid/widget/TextView;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    goto/16 :goto_1

    .line 169
    :cond_5
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ad:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 170
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ae:Lcom/facebook/widget/images/UrlImage;

    iget-object v1, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->Z:Lcom/facebook/bugreporter/b;

    invoke-virtual {v1}, Lcom/facebook/bugreporter/b;->d()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/widget/images/UrlImage;->setImageParams(Landroid/net/Uri;)V

    .line 171
    invoke-direct {p0}, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->a()V

    goto :goto_2
.end method

.method public e()V
    .locals 3

    .prologue
    .line 308
    invoke-super {p0}, Lcom/facebook/base/fragment/FbFragment;->e()V

    .line 309
    iget-boolean v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->aj:Z

    if-nez v0, :cond_0

    .line 310
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 311
    const-string v1, "bug_desc"

    iget-object v2, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ac:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 312
    iget-object v1, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->aa:Lcom/facebook/base/fragment/c;

    invoke-interface {v1, p0, v0}, Lcom/facebook/base/fragment/c;->a(Lcom/facebook/base/fragment/b;Landroid/content/Intent;)V

    .line 314
    :cond_0
    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 196
    invoke-super {p0, p1}, Lcom/facebook/base/fragment/FbFragment;->e(Landroid/os/Bundle;)V

    .line 197
    iget-object v0, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->Z:Lcom/facebook/bugreporter/b;

    iget-object v1, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ac:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/bugreporter/b;->a(Ljava/lang/String;)Lcom/facebook/bugreporter/b;

    .line 198
    const-string v0, "report"

    iget-object v1, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->Z:Lcom/facebook/bugreporter/b;

    invoke-virtual {v1}, Lcom/facebook/bugreporter/b;->o()Lcom/facebook/bugreporter/BugReport;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 199
    const-string v0, "screenshotRemoved"

    iget-boolean v1, p0, Lcom/facebook/bugreporter/activity/bugreport/BugReportFragment;->ai:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 200
    return-void
.end method
