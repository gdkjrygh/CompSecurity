.class public Lcom/facebook/orca/threadview/w;
.super Ljava/lang/Object;
.source "MuteThreadWarningController.java"


# instance fields
.field private final a:Lcom/facebook/prefs/shared/d;

.field private final b:Lcom/facebook/prefs/shared/f;

.field private final c:Lcom/facebook/orca/notify/as;

.field private final d:Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

.field private e:Ljava/lang/String;

.field private f:Lcom/facebook/prefs/shared/ae;


# direct methods
.method public constructor <init>(Lcom/facebook/prefs/shared/d;Lcom/facebook/orca/notify/as;Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;)V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/facebook/orca/threadview/w;->a:Lcom/facebook/prefs/shared/d;

    .line 35
    iput-object p2, p0, Lcom/facebook/orca/threadview/w;->c:Lcom/facebook/orca/notify/as;

    .line 36
    iput-object p3, p0, Lcom/facebook/orca/threadview/w;->d:Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

    .line 38
    new-instance v0, Lcom/facebook/orca/threadview/x;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threadview/x;-><init>(Lcom/facebook/orca/threadview/w;)V

    invoke-virtual {p3, v0}, Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;->setOnButtonClickListener(Landroid/view/View$OnClickListener;)V

    .line 45
    new-instance v0, Lcom/facebook/orca/threadview/y;

    invoke-direct {v0, p0}, Lcom/facebook/orca/threadview/y;-><init>(Lcom/facebook/orca/threadview/w;)V

    iput-object v0, p0, Lcom/facebook/orca/threadview/w;->b:Lcom/facebook/prefs/shared/f;

    .line 52
    iget-object v0, p0, Lcom/facebook/orca/threadview/w;->b:Lcom/facebook/prefs/shared/f;

    invoke-interface {p1, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/f;)V

    .line 54
    invoke-direct {p0}, Lcom/facebook/orca/threadview/w;->b()V

    .line 55
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/w;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Lcom/facebook/orca/threadview/w;->c()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/threadview/w;Lcom/facebook/prefs/shared/ae;)V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0, p1}, Lcom/facebook/orca/threadview/w;->a(Lcom/facebook/prefs/shared/ae;)V

    return-void
.end method

.method private a(Lcom/facebook/prefs/shared/ae;)V
    .locals 1

    .prologue
    .line 62
    iget-object v0, p0, Lcom/facebook/orca/threadview/w;->f:Lcom/facebook/prefs/shared/ae;

    invoke-static {v0, p1}, Lcom/google/common/base/Objects;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 63
    invoke-direct {p0}, Lcom/facebook/orca/threadview/w;->b()V

    .line 65
    :cond_0
    return-void
.end method

.method private b()V
    .locals 2

    .prologue
    .line 68
    iget-object v0, p0, Lcom/facebook/orca/threadview/w;->e:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 69
    iget-object v0, p0, Lcom/facebook/orca/threadview/w;->d:Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;->e()V

    .line 79
    :goto_0
    return-void

    .line 73
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/threadview/w;->c:Lcom/facebook/orca/notify/as;

    iget-object v1, p0, Lcom/facebook/orca/threadview/w;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/notify/as;->a(Ljava/lang/String;)Lcom/facebook/orca/notify/NotificationSetting;

    move-result-object v0

    .line 74
    iget-object v1, p0, Lcom/facebook/orca/threadview/w;->c:Lcom/facebook/orca/notify/as;

    invoke-virtual {v1, v0}, Lcom/facebook/orca/notify/as;->a(Lcom/facebook/orca/notify/NotificationSetting;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 75
    iget-object v0, p0, Lcom/facebook/orca/threadview/w;->d:Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;->d()V

    goto :goto_0

    .line 77
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/threadview/w;->d:Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;->e()V

    goto :goto_0
.end method

.method private c()V
    .locals 4

    .prologue
    .line 82
    iget-object v0, p0, Lcom/facebook/orca/threadview/w;->d:Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;

    invoke-virtual {v0}, Lcom/facebook/orca/common/ui/widgets/SlidingOutSuggestionView;->f()V

    .line 84
    iget-object v0, p0, Lcom/facebook/orca/threadview/w;->a:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/threadview/w;->f:Lcom/facebook/prefs/shared/ae;

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 87
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .prologue
    .line 58
    invoke-direct {p0}, Lcom/facebook/orca/threadview/w;->b()V

    .line 59
    return-void
.end method

.method public a(Lcom/facebook/messages/threads/model/ThreadViewSpec;)V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 93
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 94
    invoke-virtual {p1}, Lcom/facebook/messages/threads/model/ThreadViewSpec;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/w;->e:Ljava/lang/String;

    .line 95
    iget-object v0, p0, Lcom/facebook/orca/threadview/w;->e:Ljava/lang/String;

    invoke-static {v0}, Lcom/facebook/orca/prefs/n;->a(Ljava/lang/String;)Lcom/facebook/prefs/shared/ae;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/threadview/w;->f:Lcom/facebook/prefs/shared/ae;

    .line 100
    :goto_0
    invoke-direct {p0}, Lcom/facebook/orca/threadview/w;->b()V

    .line 101
    return-void

    .line 97
    :cond_0
    iput-object v1, p0, Lcom/facebook/orca/threadview/w;->e:Ljava/lang/String;

    .line 98
    iput-object v1, p0, Lcom/facebook/orca/threadview/w;->f:Lcom/facebook/prefs/shared/ae;

    goto :goto_0
.end method
