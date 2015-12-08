.class final Lcom/google/android/gms/internal/pr;
.super Lcom/google/android/gms/internal/ps;


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/google/android/gms/internal/pt;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/pt;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/pr;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/pr;->b:Lcom/google/android/gms/internal/pt;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ps;-><init>(B)V

    return-void
.end method


# virtual methods
.method public final zzbn()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 0
    iget-object v0, p0, Lcom/google/android/gms/internal/pr;->a:Landroid/content/Context;

    .line 2000
    const-string v1, "admob"

    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "webview_cache_version"

    const-string v3, "webview_cache_version"

    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/google/android/gms/internal/pr;->b:Lcom/google/android/gms/internal/pt;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/pr;->b:Lcom/google/android/gms/internal/pt;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/pt;->a(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method
