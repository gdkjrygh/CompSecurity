.class public final Lcom/google/android/gms/internal/dh;
.super Lcom/google/android/gms/internal/dc$a;


# instance fields
.field private final mB:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/dc$a;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/dh;->mB:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/db;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/dh;->mB:Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;

    new-instance v1, Lcom/google/android/gms/internal/dk;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/dk;-><init>(Lcom/google/android/gms/internal/db;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/ads/purchase/InAppPurchaseListener;->onInAppPurchaseRequested(Lcom/google/android/gms/ads/purchase/InAppPurchase;)V

    return-void
.end method
