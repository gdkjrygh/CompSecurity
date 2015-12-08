.class public final Lcom/google/android/gms/internal/cp;
.super Lcom/google/android/gms/internal/co$a;


# instance fields
.field private final mp:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/co$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/cp;->mp:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/cn;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/cp;->mp:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    new-instance v1, Lcom/google/android/gms/internal/cq;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/cq;-><init>(Lcom/google/android/gms/internal/cn;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;->onInAppPurchaseRequested(Lcom/google/android/gms/ads/purchase/InAppPurchase;)V

    return-void
.end method
