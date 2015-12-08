.class public Lcom/QRBS/activity/CreateGps$MyCurrentLocationListener;
.super Ljava/lang/Object;
.source "CreateGps.java"

# interfaces
.implements Landroid/location/LocationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/QRBS/activity/CreateGps;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "MyCurrentLocationListener"
.end annotation


# instance fields
.field lat:Landroid/widget/EditText;

.field lon:Landroid/widget/EditText;

.field final synthetic this$0:Lcom/QRBS/activity/CreateGps;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/CreateGps;Landroid/widget/EditText;Landroid/widget/EditText;)V
    .locals 0
    .param p2, "lat"    # Landroid/widget/EditText;
    .param p3, "lon"    # Landroid/widget/EditText;

    .prologue
    .line 241
    iput-object p1, p0, Lcom/QRBS/activity/CreateGps$MyCurrentLocationListener;->this$0:Lcom/QRBS/activity/CreateGps;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 242
    iput-object p2, p0, Lcom/QRBS/activity/CreateGps$MyCurrentLocationListener;->lat:Landroid/widget/EditText;

    .line 243
    iput-object p3, p0, Lcom/QRBS/activity/CreateGps$MyCurrentLocationListener;->lon:Landroid/widget/EditText;

    .line 244
    return-void
.end method


# virtual methods
.method public onLocationChanged(Landroid/location/Location;)V
    .locals 4
    .param p1, "location"    # Landroid/location/Location;

    .prologue
    .line 248
    iget-object v0, p0, Lcom/QRBS/activity/CreateGps$MyCurrentLocationListener;->lat:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 249
    iget-object v0, p0, Lcom/QRBS/activity/CreateGps$MyCurrentLocationListener;->lon:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 250
    iget-object v0, p0, Lcom/QRBS/activity/CreateGps$MyCurrentLocationListener;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v0, v0, Lcom/QRBS/activity/CreateGps;->prog:Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 251
    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 0
    .param p1, "provider"    # Ljava/lang/String;

    .prologue
    .line 257
    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 0
    .param p1, "provider"    # Ljava/lang/String;

    .prologue
    .line 263
    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0
    .param p1, "provider"    # Ljava/lang/String;
    .param p2, "status"    # I
    .param p3, "extras"    # Landroid/os/Bundle;

    .prologue
    .line 269
    return-void
.end method
