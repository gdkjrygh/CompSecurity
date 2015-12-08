.class public final Lcom/google/android/gms/internal/cv;
.super Lcom/google/android/gms/internal/cu;


# instance fields
.field private final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/cd;Lcom/google/android/gms/internal/ct;)V
    .locals 0

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/cu;-><init>(Lcom/google/android/gms/internal/cd;Lcom/google/android/gms/internal/ct;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/cv;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 0

    return-void
.end method

.method public final d()Lcom/google/android/gms/internal/dc;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/cv;->a:Landroid/content/Context;

    new-instance v1, Lcom/google/android/gms/internal/al;

    invoke-direct {v1}, Lcom/google/android/gms/internal/al;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/df;->a(Landroid/content/Context;Lcom/google/android/gms/internal/ak;)Lcom/google/android/gms/internal/df;

    move-result-object v0

    return-object v0
.end method
