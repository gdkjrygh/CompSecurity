.class public final Lcom/google/android/gms/internal/es;
.super Lcom/google/android/gms/internal/en$a;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ey;
.end annotation


# instance fields
.field private final oM:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/en$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/es;->oM:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/em;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/es;->oM:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    new-instance v1, Lcom/google/android/gms/internal/ev;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ev;-><init>(Lcom/google/android/gms/internal/em;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;->onInAppPurchaseRequested(Lcom/google/android/gms/ads/purchase/InAppPurchase;)V

    return-void
.end method
