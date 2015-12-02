.class public Lcom/facebook/zero/c/e;
.super Landroid/preference/Preference;
.source "IsZeroRatingFeatureAvailablePreference.java"


# instance fields
.field private final a:Ljavax/inject/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/a",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 18
    invoke-direct {p0, p1}, Landroid/preference/Preference;-><init>(Landroid/content/Context;)V

    .line 20
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    .line 21
    const-class v1, Ljava/lang/Boolean;

    const-class v2, Lcom/facebook/zero/annotations/IsZeroRatingFeatureEnabled;

    invoke-virtual {v0, v1, v2}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/zero/c/e;->a:Ljavax/inject/a;

    .line 24
    sget v0, Lcom/facebook/o;->preference_zero_rating_available_title:I

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c/e;->setTitle(I)V

    .line 25
    iget-object v0, p0, Lcom/facebook/zero/c/e;->a:Ljavax/inject/a;

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 26
    sget v0, Lcom/facebook/o;->preference_zero_rating_available_yes:I

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c/e;->setSummary(I)V

    .line 30
    :goto_0
    return-void

    .line 28
    :cond_0
    sget v0, Lcom/facebook/o;->preference_zero_rating_available_no:I

    invoke-virtual {p0, v0}, Lcom/facebook/zero/c/e;->setSummary(I)V

    goto :goto_0
.end method
