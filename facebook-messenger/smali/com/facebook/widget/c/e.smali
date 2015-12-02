.class public Lcom/facebook/widget/c/e;
.super Lcom/facebook/widget/c/d;
.source "OrcaListPreferenceWithSummaryValue.java"


# instance fields
.field private final a:Lcom/facebook/prefs/shared/f;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 19
    invoke-direct {p0, p1}, Lcom/facebook/widget/c/d;-><init>(Landroid/content/Context;)V

    .line 21
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 22
    const-class v1, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    .line 23
    new-instance v1, Lcom/facebook/widget/c/f;

    invoke-direct {v1, p0}, Lcom/facebook/widget/c/f;-><init>(Lcom/facebook/widget/c/e;)V

    iput-object v1, p0, Lcom/facebook/widget/c/e;->a:Lcom/facebook/prefs/shared/f;

    .line 33
    iget-object v1, p0, Lcom/facebook/widget/c/e;->a:Lcom/facebook/prefs/shared/f;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/f;)V

    .line 34
    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 43
    invoke-virtual {p0}, Lcom/facebook/widget/c/e;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/facebook/widget/c/e;->findIndexOfValue(Ljava/lang/String;)I

    move-result v0

    .line 44
    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    .line 45
    const/4 v0, 0x0

    .line 47
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/widget/c/e;->getEntries()[Ljava/lang/CharSequence;

    move-result-object v1

    aget-object v0, v1, v0

    invoke-virtual {p0, v0}, Lcom/facebook/widget/c/e;->setSummary(Ljava/lang/CharSequence;)V

    .line 48
    return-void
.end method

.method static synthetic a(Lcom/facebook/widget/c/e;)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Lcom/facebook/widget/c/e;->a()V

    return-void
.end method


# virtual methods
.method protected onBindView(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/facebook/widget/c/e;->a()V

    .line 39
    invoke-super {p0, p1}, Lcom/facebook/widget/c/d;->onBindView(Landroid/view/View;)V

    .line 40
    return-void
.end method
