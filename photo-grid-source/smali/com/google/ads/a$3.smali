.class Lcom/google/ads/a$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/ads/doubleclick/PublisherAdView;

.field final synthetic b:Lcom/google/ads/a;


# direct methods
.method constructor <init>(Lcom/google/ads/a;Lcom/google/android/gms/ads/doubleclick/PublisherAdView;)V
    .locals 0

    .prologue
    .line 163
    iput-object p1, p0, Lcom/google/ads/a$3;->b:Lcom/google/ads/a;

    iput-object p2, p0, Lcom/google/ads/a$3;->a:Lcom/google/android/gms/ads/doubleclick/PublisherAdView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lcom/google/ads/a$3;->a:Lcom/google/android/gms/ads/doubleclick/PublisherAdView;

    invoke-virtual {v0}, Lcom/google/android/gms/ads/doubleclick/PublisherAdView;->destroy()V

    .line 167
    return-void
.end method
