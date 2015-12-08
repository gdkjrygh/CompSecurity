.class public final Lcom/google/android/gms/internal/bs;
.super Lcom/google/android/gms/internal/br$a;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation


# instance fields
.field private final oO:Lcom/google/android/gms/ads/doubleclick/b;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/doubleclick/b;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/br$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/bs;->oO:Lcom/google/android/gms/ads/doubleclick/b;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/bq;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/bs;->oO:Lcom/google/android/gms/ads/doubleclick/b;

    new-instance v1, Lcom/google/android/gms/internal/bp;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/bp;-><init>(Lcom/google/android/gms/internal/bq;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/doubleclick/b;->a(Lcom/google/android/gms/ads/doubleclick/a;)V

    return-void
.end method
