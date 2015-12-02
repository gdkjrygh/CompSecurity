.class public Lcom/facebook/bugreporter/ab;
.super Ljava/lang/Object;
.source "RageShakeDetector.java"


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
.field private b:Lcom/facebook/bugreporter/ae;

.field private final c:Lcom/facebook/bugreporter/g;

.field private final d:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private f:Landroid/app/Activity;

.field private g:Z

.field private h:Lcom/facebook/ui/i/g;

.field private i:Landroid/app/Dialog;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 32
    const-class v0, Lcom/facebook/bugreporter/ab;

    sput-object v0, Lcom/facebook/bugreporter/ab;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lcom/facebook/bugreporter/g;Ljavax/inject/a;Ljavax/inject/a;Lcom/facebook/ui/i/g;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/bugreporter/g;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;",
            "Lcom/facebook/ui/i/g;",
            ")V"
        }
    .end annotation

    .prologue
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/bugreporter/ab;->i:Landroid/app/Dialog;

    .line 52
    iput-object p1, p0, Lcom/facebook/bugreporter/ab;->c:Lcom/facebook/bugreporter/g;

    .line 53
    iput-object p2, p0, Lcom/facebook/bugreporter/ab;->d:Ljavax/inject/a;

    .line 54
    iput-object p3, p0, Lcom/facebook/bugreporter/ab;->e:Ljavax/inject/a;

    .line 55
    iput-object p4, p0, Lcom/facebook/bugreporter/ab;->h:Lcom/facebook/ui/i/g;

    .line 56
    new-instance v0, Lcom/facebook/bugreporter/ae;

    invoke-direct {v0, p0}, Lcom/facebook/bugreporter/ae;-><init>(Lcom/facebook/bugreporter/ab;)V

    iput-object v0, p0, Lcom/facebook/bugreporter/ab;->b:Lcom/facebook/bugreporter/ae;

    .line 57
    return-void
.end method

.method static synthetic a(Lcom/facebook/bugreporter/ab;Landroid/app/Activity;)Landroid/app/Activity;
    .locals 0

    .prologue
    .line 30
    iput-object p1, p0, Lcom/facebook/bugreporter/ab;->f:Landroid/app/Activity;

    return-object p1
.end method

.method static synthetic a(Lcom/facebook/bugreporter/ab;)Lcom/facebook/bugreporter/ae;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/facebook/bugreporter/ab;->b:Lcom/facebook/bugreporter/ae;

    return-object v0
.end method

.method static synthetic a(Lcom/facebook/bugreporter/ab;Z)Z
    .locals 0

    .prologue
    .line 30
    iput-boolean p1, p0, Lcom/facebook/bugreporter/ab;->g:Z

    return p1
.end method

.method static synthetic b(Lcom/facebook/bugreporter/ab;)Landroid/app/Activity;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/facebook/bugreporter/ab;->f:Landroid/app/Activity;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/bugreporter/ab;)Lcom/facebook/bugreporter/g;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/facebook/bugreporter/ab;->c:Lcom/facebook/bugreporter/g;

    return-object v0
.end method

.method private c()Z
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/bugreporter/ab;->d:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/google/common/base/Strings;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic d(Lcom/facebook/bugreporter/ab;)Ljavax/inject/a;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/facebook/bugreporter/ab;->e:Ljavax/inject/a;

    return-object v0
.end method

.method private d()V
    .locals 5

    .prologue
    .line 69
    new-instance v2, Landroid/app/AlertDialog$Builder;

    iget-object v0, p0, Lcom/facebook/bugreporter/ab;->f:Landroid/app/Activity;

    invoke-direct {v2, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 71
    const/4 v0, 0x0

    .line 74
    :try_start_0
    iget-object v1, p0, Lcom/facebook/bugreporter/ab;->f:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 75
    iget-object v3, p0, Lcom/facebook/bugreporter/ab;->f:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    .line 76
    invoke-virtual {v1, v3}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v1

    .line 77
    if-eqz v1, :cond_0

    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 84
    :cond_0
    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Strings;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 85
    iget-object v0, p0, Lcom/facebook/bugreporter/ab;->f:Landroid/app/Activity;

    sget v1, Lcom/facebook/o;->bug_report_title:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 88
    :cond_1
    invoke-virtual {v2, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/bugreporter/ab;->f:Landroid/app/Activity;

    sget v3, Lcom/facebook/o;->bug_report_question:I

    invoke-virtual {v1, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/bugreporter/ab;->f:Landroid/app/Activity;

    sget v3, Lcom/facebook/o;->dialog_yes:I

    invoke-virtual {v1, v3}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lcom/facebook/bugreporter/ac;

    invoke-direct {v3, p0}, Lcom/facebook/bugreporter/ac;-><init>(Lcom/facebook/bugreporter/ab;)V

    invoke-virtual {v0, v1, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 98
    iget-object v0, p0, Lcom/facebook/bugreporter/ab;->f:Landroid/app/Activity;

    sget v1, Lcom/facebook/o;->dialog_cancel:I

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/facebook/bugreporter/ad;

    invoke-direct {v1, p0}, Lcom/facebook/bugreporter/ad;-><init>(Lcom/facebook/bugreporter/ab;)V

    invoke-virtual {v2, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 106
    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/bugreporter/ab;->i:Landroid/app/Dialog;

    .line 108
    iget-object v0, p0, Lcom/facebook/bugreporter/ab;->i:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 109
    return-void

    .line 80
    :catch_0
    move-exception v1

    .line 81
    sget-object v3, Lcom/facebook/bugreporter/ab;->a:Ljava/lang/Class;

    invoke-virtual {v1}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private e()Z
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lcom/facebook/bugreporter/ab;->i:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/facebook/bugreporter/ab;->i:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic e(Lcom/facebook/bugreporter/ab;)Z
    .locals 1

    .prologue
    .line 30
    iget-boolean v0, p0, Lcom/facebook/bugreporter/ab;->g:Z

    return v0
.end method

.method static synthetic f(Lcom/facebook/bugreporter/ab;)Z
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0}, Lcom/facebook/bugreporter/ab;->e()Z

    move-result v0

    return v0
.end method

.method static synthetic g(Lcom/facebook/bugreporter/ab;)Landroid/app/Dialog;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/facebook/bugreporter/ab;->i:Landroid/app/Dialog;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/facebook/bugreporter/ae;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/facebook/bugreporter/ab;->b:Lcom/facebook/bugreporter/ae;

    return-object v0
.end method

.method public b()V
    .locals 3

    .prologue
    .line 112
    iget-object v0, p0, Lcom/facebook/bugreporter/ab;->f:Landroid/app/Activity;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/facebook/bugreporter/ab;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/facebook/bugreporter/ab;->f:Landroid/app/Activity;

    instance-of v0, v0, Lcom/facebook/bugreporter/activity/BugReportActivity;

    if-nez v0, :cond_0

    .line 116
    invoke-direct {p0}, Lcom/facebook/bugreporter/ab;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 117
    iget-object v0, p0, Lcom/facebook/bugreporter/ab;->h:Lcom/facebook/ui/i/g;

    new-instance v1, Lcom/facebook/ui/i/a;

    sget v2, Lcom/facebook/o;->bug_report_please_log_in:I

    invoke-direct {v1, v2}, Lcom/facebook/ui/i/a;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/facebook/ui/i/g;->a(Lcom/facebook/ui/i/a;)V

    .line 122
    :cond_0
    :goto_0
    return-void

    .line 119
    :cond_1
    invoke-direct {p0}, Lcom/facebook/bugreporter/ab;->d()V

    goto :goto_0
.end method
