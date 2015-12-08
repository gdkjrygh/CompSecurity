.class public final Lcom/google/android/gms/internal/bn;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation


# static fields
.field public static ph:Lcom/google/android/gms/internal/iy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iy",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static pi:Lcom/google/android/gms/internal/iy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iy",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static pj:Lcom/google/android/gms/internal/iy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iy",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static pk:Lcom/google/android/gms/internal/iy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iy",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static pl:Lcom/google/android/gms/internal/iy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iy",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static pm:Lcom/google/android/gms/internal/iy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iy",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static pn:Lcom/google/android/gms/internal/iy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iy",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static po:Lcom/google/android/gms/internal/iy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iy",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static pp:Lcom/google/android/gms/internal/iy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iy",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static pq:Lcom/google/android/gms/internal/iy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iy",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static pr:Lcom/google/android/gms/internal/iy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iy",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static ps:Lcom/google/android/gms/internal/iy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iy",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static pt:Lcom/google/android/gms/internal/iy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iy",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static pu:Lcom/google/android/gms/internal/iy;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/iy",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final pv:Landroid/os/Bundle;

.field private static pw:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/16 v5, 0xa

    const/4 v1, 0x0

    const/4 v4, 0x1

    const/4 v3, 0x0

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/bn;->pv:Landroid/os/Bundle;

    sput-boolean v3, Lcom/google/android/gms/internal/bn;->pw:Z

    const-string v0, "gads:sdk_core_location"

    const-string v2, "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40.html"

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/bn;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/iy;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->ph:Lcom/google/android/gms/internal/iy;

    const-string v2, "gads:sdk_core_experiment_id"

    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/bn;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/iy;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->pi:Lcom/google/android/gms/internal/iy;

    const-string v0, "gads:sdk_crash_report_enabled"

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/bn;->c(Ljava/lang/String;Z)Lcom/google/android/gms/internal/iy;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->pj:Lcom/google/android/gms/internal/iy;

    const-string v0, "gads:sdk_crash_report_full_stacktrace"

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/bn;->c(Ljava/lang/String;Z)Lcom/google/android/gms/internal/iy;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->pk:Lcom/google/android/gms/internal/iy;

    const-string v0, "gads:block_autoclicks"

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/bn;->c(Ljava/lang/String;Z)Lcom/google/android/gms/internal/iy;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->pl:Lcom/google/android/gms/internal/iy;

    const-string v2, "gads:block_autoclicks_experiment_id"

    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    invoke-static {v2, v0}, Lcom/google/android/gms/internal/bn;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/iy;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->pm:Lcom/google/android/gms/internal/iy;

    sput-boolean v4, Lcom/google/android/gms/internal/bn;->pw:Z

    const-string v0, "gads:enable_content_fetching"

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/bn;->c(Ljava/lang/String;Z)Lcom/google/android/gms/internal/iy;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->pp:Lcom/google/android/gms/internal/iy;

    const-string v0, "gads:content_length_weight"

    invoke-static {v0, v4}, Lcom/google/android/gms/internal/bn;->a(Ljava/lang/String;I)Lcom/google/android/gms/internal/iy;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->pq:Lcom/google/android/gms/internal/iy;

    const-string v0, "gads:content_age_weight"

    invoke-static {v0, v4}, Lcom/google/android/gms/internal/bn;->a(Ljava/lang/String;I)Lcom/google/android/gms/internal/iy;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->pr:Lcom/google/android/gms/internal/iy;

    const-string v0, "gads:min_content_len"

    const/16 v2, 0xb

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/bn;->a(Ljava/lang/String;I)Lcom/google/android/gms/internal/iy;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->ps:Lcom/google/android/gms/internal/iy;

    const-string v0, "gads:fingerprint_number"

    invoke-static {v0, v5}, Lcom/google/android/gms/internal/bn;->a(Ljava/lang/String;I)Lcom/google/android/gms/internal/iy;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->pt:Lcom/google/android/gms/internal/iy;

    const-string v0, "gads:sleep_sec"

    invoke-static {v0, v5}, Lcom/google/android/gms/internal/bn;->a(Ljava/lang/String;I)Lcom/google/android/gms/internal/iy;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->pu:Lcom/google/android/gms/internal/iy;

    const-string v0, "gads:spam_app_context:enabled"

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/bn;->c(Ljava/lang/String;Z)Lcom/google/android/gms/internal/iy;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->pn:Lcom/google/android/gms/internal/iy;

    const-string v0, "gads:spam_app_context:experiment_id"

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/bn;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/iy;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/bn;->po:Lcom/google/android/gms/internal/iy;

    return-void
.end method

.method private static a(Ljava/lang/String;I)Lcom/google/android/gms/internal/iy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lcom/google/android/gms/internal/iy",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/bn;->pv:Landroid/os/Bundle;

    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/iy;->a(Ljava/lang/String;Ljava/lang/Integer;)Lcom/google/android/gms/internal/iy;

    move-result-object v0

    return-object v0
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/iy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/internal/iy",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/bn;->pv:Landroid/os/Bundle;

    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/iy;->l(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/iy;

    move-result-object v0

    return-object v0
.end method

.method public static by()Landroid/os/Bundle;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/bn;->pv:Landroid/os/Bundle;

    return-object v0
.end method

.method private static c(Ljava/lang/String;Z)Lcom/google/android/gms/internal/iy;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z)",
            "Lcom/google/android/gms/internal/iy",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/bn;->pv:Landroid/os/Bundle;

    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/iy;->h(Ljava/lang/String;Z)Lcom/google/android/gms/internal/iy;

    move-result-object v0

    return-object v0
.end method
