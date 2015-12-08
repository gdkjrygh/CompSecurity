.class public final Lcom/google/android/gms/internal/ff$a;
.super Lcom/google/android/gms/internal/ff;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ff;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/fh;Lcom/google/android/gms/internal/fe$a;)V
    .locals 0

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ff;-><init>(Lcom/google/android/gms/internal/fh;Lcom/google/android/gms/internal/fe$a;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/ff$a;->mContext:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public cJ()V
    .locals 0

    return-void
.end method

.method public cK()Lcom/google/android/gms/internal/fl;
    .locals 6

    invoke-static {}, Lcom/google/android/gms/internal/ga;->bN()Landroid/os/Bundle;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/bm;

    const-string v2, "gads:sdk_core_location"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "gads:sdk_core_experiment_id"

    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "gads:block_autoclicks_experiment_id"

    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "gads:spam_app_context:experiment_id"

    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v3, v4, v0}, Lcom/google/android/gms/internal/bm;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ff$a;->mContext:Landroid/content/Context;

    new-instance v2, Lcom/google/android/gms/internal/co;

    invoke-direct {v2}, Lcom/google/android/gms/internal/co;-><init>()V

    new-instance v3, Lcom/google/android/gms/internal/fx;

    invoke-direct {v3}, Lcom/google/android/gms/internal/fx;-><init>()V

    invoke-static {v0, v1, v2, v3}, Lcom/google/android/gms/internal/fq;->a(Landroid/content/Context;Lcom/google/android/gms/internal/bm;Lcom/google/android/gms/internal/cn;Lcom/google/android/gms/internal/fw;)Lcom/google/android/gms/internal/fq;

    move-result-object v0

    return-object v0
.end method
