.class public final Lcom/google/android/gms/analytics/internal/ac;
.super Ljava/lang/Object;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "Application context can\'t be null"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/bl;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Lcom/google/android/gms/analytics/internal/ac;->a:Landroid/content/Context;

    iput-object v0, p0, Lcom/google/android/gms/analytics/internal/ac;->b:Landroid/content/Context;

    return-void
.end method

.method protected static a(Lcom/google/android/gms/analytics/internal/aa;)Lcom/google/android/gms/analytics/internal/as;
    .locals 1

    new-instance v0, Lcom/google/android/gms/analytics/internal/as;

    invoke-direct {v0, p0}, Lcom/google/android/gms/analytics/internal/as;-><init>(Lcom/google/android/gms/analytics/internal/aa;)V

    return-object v0
.end method

.method protected static b(Lcom/google/android/gms/analytics/internal/aa;)Lcom/google/android/gms/analytics/internal/az;
    .locals 1

    new-instance v0, Lcom/google/android/gms/analytics/internal/az;

    invoke-direct {v0, p0}, Lcom/google/android/gms/analytics/internal/az;-><init>(Lcom/google/android/gms/analytics/internal/aa;)V

    return-object v0
.end method

.method public static d(Lcom/google/android/gms/analytics/internal/aa;)Lcom/google/android/gms/analytics/internal/ae;
    .locals 1

    new-instance v0, Lcom/google/android/gms/analytics/internal/ae;

    invoke-direct {v0, p0}, Lcom/google/android/gms/analytics/internal/ae;-><init>(Lcom/google/android/gms/analytics/internal/aa;)V

    return-object v0
.end method

.method public static e(Lcom/google/android/gms/analytics/internal/aa;)Lcom/google/android/gms/analytics/internal/be;
    .locals 1

    new-instance v0, Lcom/google/android/gms/analytics/internal/be;

    invoke-direct {v0, p0}, Lcom/google/android/gms/analytics/internal/be;-><init>(Lcom/google/android/gms/analytics/internal/aa;)V

    return-object v0
.end method

.method public static f(Lcom/google/android/gms/analytics/internal/aa;)Lcom/google/android/gms/analytics/internal/n;
    .locals 1

    new-instance v0, Lcom/google/android/gms/analytics/internal/n;

    invoke-direct {v0, p0}, Lcom/google/android/gms/analytics/internal/n;-><init>(Lcom/google/android/gms/analytics/internal/aa;)V

    return-object v0
.end method


# virtual methods
.method public final a()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ac;->a:Landroid/content/Context;

    return-object v0
.end method

.method public final b()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/analytics/internal/ac;->b:Landroid/content/Context;

    return-object v0
.end method

.method final c(Lcom/google/android/gms/analytics/internal/aa;)Lcom/google/android/gms/analytics/internal/am;
    .locals 1

    new-instance v0, Lcom/google/android/gms/analytics/internal/am;

    invoke-direct {v0, p1, p0}, Lcom/google/android/gms/analytics/internal/am;-><init>(Lcom/google/android/gms/analytics/internal/aa;Lcom/google/android/gms/analytics/internal/ac;)V

    return-object v0
.end method
