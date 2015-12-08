.class Lcom/thetransitapp/droid/TransitActivity$2;
.super Ljava/lang/Object;
.source "TransitActivity.java"

# interfaces
.implements Lcom/google/android/gms/common/GooglePlayServicesClient$OnConnectionFailedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/thetransitapp/droid/TransitActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/TransitActivity;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/TransitActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/TransitActivity$2;->this$0:Lcom/thetransitapp/droid/TransitActivity;

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2
    .param p1, "arg0"    # Lcom/google/android/gms/common/ConnectionResult;

    .prologue
    .line 118
    # getter for: Lcom/thetransitapp/droid/TransitActivity;->TAG:Ljava/lang/String;
    invoke-static {}, Lcom/thetransitapp/droid/TransitActivity;->access$3()Ljava/lang/String;

    move-result-object v0

    const-string v1, "LocationClient connection failed"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 119
    return-void
.end method
