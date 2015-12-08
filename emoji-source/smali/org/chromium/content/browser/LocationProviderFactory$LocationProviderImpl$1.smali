.class Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl$1;
.super Ljava/lang/Object;
.source "LocationProviderFactory.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->usePassiveOneShotLocation()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;

.field final synthetic val$location:Landroid/location/Location;


# direct methods
.method constructor <init>(Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;Landroid/location/Location;)V
    .locals 0

    .prologue
    .line 182
    iput-object p1, p0, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl$1;->this$0:Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;

    iput-object p2, p0, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl$1;->val$location:Landroid/location/Location;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 185
    iget-object v0, p0, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl$1;->this$0:Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;

    iget-object v1, p0, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl$1;->val$location:Landroid/location/Location;

    # invokes: Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->updateNewLocation(Landroid/location/Location;)V
    invoke-static {v0, v1}, Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;->access$000(Lorg/chromium/content/browser/LocationProviderFactory$LocationProviderImpl;Landroid/location/Location;)V

    .line 186
    return-void
.end method
