.class Lcom/google/android/gms/internal/v$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/ComponentCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic kE:Lcom/google/android/gms/internal/v;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/v;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/v$1;->kE:Lcom/google/android/gms/internal/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1
    .param p1, "newConfig"    # Landroid/content/res/Configuration;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/internal/v$1;->kE:Lcom/google/android/gms/internal/v;

    invoke-static {v0}, Lcom/google/android/gms/internal/v;->a(Lcom/google/android/gms/internal/v;)Lcom/google/android/gms/internal/v$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/v$1;->kE:Lcom/google/android/gms/internal/v;

    invoke-static {v0}, Lcom/google/android/gms/internal/v;->a(Lcom/google/android/gms/internal/v;)Lcom/google/android/gms/internal/v$b;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/v$1;->kE:Lcom/google/android/gms/internal/v;

    invoke-static {v0}, Lcom/google/android/gms/internal/v;->a(Lcom/google/android/gms/internal/v;)Lcom/google/android/gms/internal/v$b;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->oj:Lcom/google/android/gms/internal/dz;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/v$1;->kE:Lcom/google/android/gms/internal/v;

    invoke-static {v0}, Lcom/google/android/gms/internal/v;->a(Lcom/google/android/gms/internal/v;)Lcom/google/android/gms/internal/v$b;

    move-result-object v0

    iget-object v0, v0, Lcom/google/android/gms/internal/v$b;->kO:Lcom/google/android/gms/internal/dh;

    iget-object v0, v0, Lcom/google/android/gms/internal/dh;->oj:Lcom/google/android/gms/internal/dz;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dz;->bE()V

    :cond_0
    return-void
.end method

.method public onLowMemory()V
    .locals 0

    return-void
.end method
