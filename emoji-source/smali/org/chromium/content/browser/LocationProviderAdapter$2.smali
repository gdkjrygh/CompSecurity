.class Lorg/chromium/content/browser/LocationProviderAdapter$2;
.super Ljava/lang/Object;
.source "LocationProviderAdapter.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/LocationProviderAdapter;->stop()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/content/browser/LocationProviderAdapter;


# direct methods
.method constructor <init>(Lorg/chromium/content/browser/LocationProviderAdapter;)V
    .locals 0

    .prologue
    .line 60
    iput-object p1, p0, Lorg/chromium/content/browser/LocationProviderAdapter$2;->this$0:Lorg/chromium/content/browser/LocationProviderAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lorg/chromium/content/browser/LocationProviderAdapter$2;->this$0:Lorg/chromium/content/browser/LocationProviderAdapter;

    # getter for: Lorg/chromium/content/browser/LocationProviderAdapter;->mImpl:Lorg/chromium/content/browser/LocationProviderFactory$LocationProvider;
    invoke-static {v0}, Lorg/chromium/content/browser/LocationProviderAdapter;->access$000(Lorg/chromium/content/browser/LocationProviderAdapter;)Lorg/chromium/content/browser/LocationProviderFactory$LocationProvider;

    move-result-object v0

    invoke-interface {v0}, Lorg/chromium/content/browser/LocationProviderFactory$LocationProvider;->stop()V

    .line 64
    return-void
.end method
