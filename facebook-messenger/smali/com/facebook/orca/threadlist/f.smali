.class public Lcom/facebook/orca/threadlist/f;
.super Ljava/lang/Object;
.source "MuteGlobalWarningController.java"


# instance fields
.field private final a:Lcom/facebook/prefs/shared/d;

.field private final b:Lcom/facebook/prefs/shared/f;

.field private final c:Lcom/facebook/orca/notify/as;

.field private final d:Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/notify/as;Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;)V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/facebook/orca/threadlist/f;->a:Lcom/facebook/prefs/shared/d;

    .line 28
    iput-object p2, p0, Lcom/facebook/orca/threadlist/f;->c:Lcom/facebook/orca/notify/as;

    .line 29
    iput-object p3, p0, Lcom/facebook/orca/threadlist/f;->d:Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

    .line 31
    new-instance v0, Lcom/facebook/orca/threadlist/g;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threadlist/g;-><init>(Lcom/facebook/orca/threadlist/f;)V

    invoke-virtual {p3, v0}, Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;->setOnButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    new-instance v0, Lcom/facebook/orca/threadlist/h;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threadlist/h;-><init>(Lcom/facebook/orca/threadlist/f;)V

    iput-object v0, p0, Lcom/facebook/orca/threadlist/f;->b:Lcom/facebook/prefs/shared/f;

    .line 45
    iget-object v0, p0, Lcom/facebook/orca/threadlist/f;->b:Lcom/facebook/prefs/shared/f;

    invoke-interface {p1, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/f;)V

    .line 47
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/f;->b()V

    .line 48
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/f;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/f;->c()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadlist/f;Lcom/facebook/prefs/shared/ae;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadlist/f;->a(Lcom/facebook/prefs/shared/ae;)V

    return-void
.end method

.method private a(Lcom/facebook/prefs/shared/ae;)V
    .locals 1

    .prologue
    .line 55
    sget-object v0, Lcom/facebook/orca/prefs/n;->o:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {v0, p1}, Lcom/facebook/prefs/shared/ae;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 56
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/f;->b()V

    .line 58
    :cond_0
    return-void
.end method

.method private b()V
    .locals 2

    .prologue
    .line 61
    iget-object v0, p0, Lcom/facebook/orca/threadlist/f;->c:Lcom/facebook/orca/notify/as;

    invoke-virtual {v0}, Lcom/facebook/orca/notify/as;->a()Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v0

    .line 62
    iget-object v1, p0, Lcom/facebook/orca/threadlist/f;->c:Lcom/facebook/orca/notify/as;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/notify/as;->a(Lcom/facebook/orca/notify/NotificationSetting;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 63
    iget-object v0, p0, Lcom/facebook/orca/threadlist/f;->d:Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;->d()V

    .line 67
    :goto_0
    return-void

    .line 65
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadlist/f;->d:Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;->e()V

    goto :goto_0
.end method

.method private c()V
    .locals 4

    .prologue
    .line 70
    iget-object v0, p0, Lcom/facebook/orca/threadlist/f;->d:Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;->f()V

    .line 72
    iget-object v0, p0, Lcom/facebook/orca/threadlist/f;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/prefs/n;->o:Lcom/facebook/prefs/shared/ae;

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 75
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Lcom/facebook/orca/threadlist/f;->b()V

    .line 52
    return-void
.end method
