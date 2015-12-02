.class Lcom/facebook/zero/c/b;
.super Ljava/lang/Object;
.source "ClearZeroRatingPreference.java"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/zero/c/a;


# direct methods
.method constructor <init>(Lcom/facebook/zero/c/a;)V
    .locals 0

    .prologue
    .line 25
    iput-object p1, p0, Lcom/facebook/zero/c/b;->a:Lcom/facebook/zero/c/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 1

    .prologue
    .line 28
    iget-object v0, p0, Lcom/facebook/zero/c/b;->a:Lcom/facebook/zero/c/a;

    invoke-static {v0}, Lcom/facebook/zero/c/a;->a(Lcom/facebook/zero/c/a;)V

    .line 29
    const/4 v0, 0x1

    return v0
.end method
