.class public Lcom/facebook/widget/c/a;
.super Landroid/preference/EditTextPreference;
.source "EditTextPreferenceWithSummaryValue.java"


# instance fields
.field private a:Lcom/facebook/prefs/shared/f;

.field private b:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0, p1}, Landroid/preference/EditTextPreference;-><init>(Landroid/content/Context;)V

    .line 34
    invoke-direct {p0, p1}, Lcom/facebook/widget/c/a;->a(Landroid/content/Context;)V

    .line 35
    return-void
.end method

.method private a()V
    .locals 2

    .prologue
    .line 66
    invoke-virtual {p0}, Lcom/facebook/widget/c/a;->getText()Ljava/lang/String;

    move-result-object v0

    .line 67
    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 68
    iget-object v0, p0, Lcom/facebook/widget/c/a;->b:Ljava/lang/CharSequence;

    invoke-virtual {p0, v0}, Lcom/facebook/widget/c/a;->setSummary(Ljava/lang/CharSequence;)V

    .line 72
    :goto_0
    return-void

    .line 70
    :cond_0
    invoke-virtual {p0, v0}, Lcom/facebook/widget/c/a;->setSummary(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method private a(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 38
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 39
    const-class v1, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    .line 40
    invoke-virtual {p0}, Lcom/facebook/widget/c/a;->getKey()Ljava/lang/String;

    move-result-object v1

    .line 41
    new-instance v2, Lcom/facebook/widget/c/b;

    invoke-direct {v2, p0, v1}, Lcom/facebook/widget/c/b;-><init>(Lcom/facebook/widget/c/a;Ljava/lang/String;)V

    iput-object v2, p0, Lcom/facebook/widget/c/a;->a:Lcom/facebook/prefs/shared/f;

    .line 50
    iget-object v1, p0, Lcom/facebook/widget/c/a;->a:Lcom/facebook/prefs/shared/f;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/f;)V

    .line 51
    invoke-virtual {p0}, Lcom/facebook/widget/c/a;->getSummary()Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/widget/c/a;->b:Ljava/lang/CharSequence;

    .line 52
    return-void
.end method

.method static synthetic a(Lcom/facebook/widget/c/a;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0}, Lcom/facebook/widget/c/a;->a()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Lcom/facebook/widget/c/a;->b:Ljava/lang/CharSequence;

    .line 56
    invoke-direct {p0}, Lcom/facebook/widget/c/a;->a()V

    .line 57
    return-void
.end method

.method protected onBindView(Landroid/view/View;)V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0}, Lcom/facebook/widget/c/a;->a()V

    .line 62
    invoke-super {p0, p1}, Landroid/preference/EditTextPreference;->onBindView(Landroid/view/View;)V

    .line 63
    return-void
.end method
