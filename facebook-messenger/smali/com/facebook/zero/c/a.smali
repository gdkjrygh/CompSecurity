.class public Lcom/facebook/zero/c/a;
.super Landroid/preference/Preference;
.source "ClearZeroRatingPreference.java"


# instance fields
.field private final a:Lcom/facebook/zero/d/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 20
    invoke-direct {p0, p1}, Landroid/preference/Preference;-><init>(Landroid/content/Context;)V

    .line 22
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 23
    const-class v1, Lcom/facebook/zero/d/a;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/zero/d/a;

    iput-object v0, p0, Lcom/facebook/zero/c/a;->a:Lcom/facebook/zero/d/a;

    .line 25
    new-instance v0, Lcom/facebook/zero/c/b;

    invoke-direct {v0, p0}, Lcom/facebook/zero/c/b;-><init>(Lcom/facebook/zero/c/a;)V

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c/a;->setOnPreferenceClickListener(Landroid/preference/Preference$OnPreferenceClickListener;)V

    .line 33
    sget v0, Lcom/facebook/o;->preference_zero_rating_clear_preferences:I

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c/a;->setTitle(I)V

    .line 34
    return-void
.end method

.method private a()V
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/facebook/zero/c/a;->a:Lcom/facebook/zero/d/a;

    invoke-virtual {v0}, Lcom/facebook/zero/d/a;->b()V

    .line 38
    return-void
.end method

.method static synthetic a(Lcom/facebook/zero/c/a;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0}, Lcom/facebook/zero/c/a;->a()V

    return-void
.end method
