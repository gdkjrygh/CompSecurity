.class Lcom/facebook/prefs/shared/k;
.super Ljava/lang/Object;
.source "FbSharedPreferencesImpl.java"

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# instance fields
.field final synthetic a:Lcom/facebook/prefs/shared/j;


# direct methods
.method constructor <init>(Lcom/facebook/prefs/shared/j;)V
    .locals 0

    .prologue
    .line 156
    iput-object p1, p0, Lcom/facebook/prefs/shared/k;->a:Lcom/facebook/prefs/shared/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 159
    iget-object v0, p0, Lcom/facebook/prefs/shared/k;->a:Lcom/facebook/prefs/shared/j;

    invoke-static {v0, p2}, Lcom/facebook/prefs/shared/j;->a(Lcom/facebook/prefs/shared/j;Ljava/lang/String;)V

    .line 160
    return-void
.end method
