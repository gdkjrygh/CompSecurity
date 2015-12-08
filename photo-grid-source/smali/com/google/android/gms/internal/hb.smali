.class final Lcom/google/android/gms/internal/hb;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/hs;

.field final synthetic b:Lcom/google/android/gms/internal/ha;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ha;Lcom/google/android/gms/internal/hs;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/hb;->b:Lcom/google/android/gms/internal/ha;

    iput-object p2, p0, Lcom/google/android/gms/internal/hb;->a:Lcom/google/android/gms/internal/hs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 0
    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->b:Lcom/google/android/gms/internal/ha;

    invoke-static {v0}, Lcom/google/android/gms/internal/ha;->a(Lcom/google/android/gms/internal/ha;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/hb;->b:Lcom/google/android/gms/internal/ha;

    invoke-static {v1}, Lcom/google/android/gms/internal/ha;->b(Lcom/google/android/gms/internal/ha;)Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;

    move-result-object v1

    .line 1000
    new-instance v2, Lcom/google/android/gms/internal/bl;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lcom/google/android/gms/internal/bl;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/util/client/VersionInfoParcel;Lcom/google/android/gms/internal/ad;)V

    .line 0
    new-instance v0, Lcom/google/android/gms/internal/hc;

    invoke-direct {v0, p0, v2}, Lcom/google/android/gms/internal/hc;-><init>(Lcom/google/android/gms/internal/hb;Lcom/google/android/gms/internal/bg;)V

    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/bg;->a(Lcom/google/android/gms/internal/bh;)V

    const-string v0, "/jsLoaded"

    new-instance v1, Lcom/google/android/gms/internal/hf;

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/internal/hf;-><init>(Lcom/google/android/gms/internal/hb;Lcom/google/android/gms/internal/bg;)V

    invoke-interface {v2, v0, v1}, Lcom/google/android/gms/internal/bg;->a(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    new-instance v0, Lcom/google/android/gms/internal/rd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/rd;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/hg;

    invoke-direct {v1, p0, v2, v0}, Lcom/google/android/gms/internal/hg;-><init>(Lcom/google/android/gms/internal/hb;Lcom/google/android/gms/internal/bg;Lcom/google/android/gms/internal/rd;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/rd;->a(Ljava/lang/Object;)V

    const-string v0, "/requestReload"

    invoke-interface {v2, v0, v1}, Lcom/google/android/gms/internal/bg;->a(Ljava/lang/String;Lcom/google/android/gms/internal/fz;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->b:Lcom/google/android/gms/internal/ha;

    invoke-static {v0}, Lcom/google/android/gms/internal/ha;->f(Lcom/google/android/gms/internal/ha;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ".js"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->b:Lcom/google/android/gms/internal/ha;

    invoke-static {v0}, Lcom/google/android/gms/internal/ha;->f(Lcom/google/android/gms/internal/ha;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/bg;->a(Ljava/lang/String;)V

    :goto_0
    sget-object v0, Lcom/google/android/gms/internal/qa;->a:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/internal/hh;

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/internal/hh;-><init>(Lcom/google/android/gms/internal/hb;Lcom/google/android/gms/internal/bg;)V

    sget v2, Lcom/google/android/gms/internal/hl;->a:I

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->b:Lcom/google/android/gms/internal/ha;

    invoke-static {v0}, Lcom/google/android/gms/internal/ha;->f(Lcom/google/android/gms/internal/ha;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "<html>"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->b:Lcom/google/android/gms/internal/ha;

    invoke-static {v0}, Lcom/google/android/gms/internal/ha;->f(Lcom/google/android/gms/internal/ha;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/bg;->c(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/hb;->b:Lcom/google/android/gms/internal/ha;

    invoke-static {v0}, Lcom/google/android/gms/internal/ha;->f(Lcom/google/android/gms/internal/ha;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/google/android/gms/internal/bg;->b(Ljava/lang/String;)V

    goto :goto_0
.end method
