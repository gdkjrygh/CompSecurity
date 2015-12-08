.class Lcom/QRBS/activity/CreateGps$3;
.super Ljava/lang/Object;
.source "CreateGps.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/CreateGps;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/CreateGps;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/CreateGps;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/CreateGps$3;->this$0:Lcom/QRBS/activity/CreateGps;

    .line 156
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    .line 158
    iget-object v0, p0, Lcom/QRBS/activity/CreateGps$3;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v0, v0, Lcom/QRBS/activity/CreateGps;->address:Landroid/widget/EditText;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 160
    iget-object v1, p0, Lcom/QRBS/activity/CreateGps$3;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v0, p0, Lcom/QRBS/activity/CreateGps$3;->this$0:Lcom/QRBS/activity/CreateGps;

    const-string v5, "location"

    invoke-virtual {v0, v5}, Lcom/QRBS/activity/CreateGps;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    iput-object v0, v1, Lcom/QRBS/activity/CreateGps;->locationManager:Landroid/location/LocationManager;

    .line 161
    iget-object v0, p0, Lcom/QRBS/activity/CreateGps$3;->this$0:Lcom/QRBS/activity/CreateGps;

    new-instance v1, Lcom/QRBS/activity/CreateGps$MyCurrentLocationListener;

    iget-object v5, p0, Lcom/QRBS/activity/CreateGps$3;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v7, p0, Lcom/QRBS/activity/CreateGps$3;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v7, v7, Lcom/QRBS/activity/CreateGps;->lat:Landroid/widget/EditText;

    iget-object v8, p0, Lcom/QRBS/activity/CreateGps$3;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v8, v8, Lcom/QRBS/activity/CreateGps;->lon:Landroid/widget/EditText;

    invoke-direct {v1, v5, v7, v8}, Lcom/QRBS/activity/CreateGps$MyCurrentLocationListener;-><init>(Lcom/QRBS/activity/CreateGps;Landroid/widget/EditText;Landroid/widget/EditText;)V

    iput-object v1, v0, Lcom/QRBS/activity/CreateGps;->locationListener:Lcom/QRBS/activity/CreateGps$MyCurrentLocationListener;

    .line 162
    iget-object v0, p0, Lcom/QRBS/activity/CreateGps$3;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v0, v0, Lcom/QRBS/activity/CreateGps;->locationManager:Landroid/location/LocationManager;

    const-string v1, "gps"

    invoke-virtual {v0, v1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 163
    iget-object v0, p0, Lcom/QRBS/activity/CreateGps$3;->this$0:Lcom/QRBS/activity/CreateGps;

    # invokes: Lcom/QRBS/activity/CreateGps;->showGPSDisabledAlertToUser()V
    invoke-static {v0}, Lcom/QRBS/activity/CreateGps;->access$1(Lcom/QRBS/activity/CreateGps;)V

    .line 173
    :goto_0
    return-void

    .line 166
    :cond_0
    new-instance v6, Lcom/scannerfire/utils/Utils;

    invoke-direct {v6}, Lcom/scannerfire/utils/Utils;-><init>()V

    .line 167
    .local v6, "u":Lcom/scannerfire/utils/Utils;
    iget-object v0, p0, Lcom/QRBS/activity/CreateGps$3;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v1, p0, Lcom/QRBS/activity/CreateGps$3;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v1, v1, Lcom/QRBS/activity/CreateGps;->activity:Landroid/app/Activity;

    iget-object v5, p0, Lcom/QRBS/activity/CreateGps$3;->this$0:Lcom/QRBS/activity/CreateGps;

    const v7, 0x7f080104

    invoke-virtual {v5, v7}, Lcom/QRBS/activity/CreateGps;->getString(I)Ljava/lang/String;

    move-result-object v5

    iget-object v7, p0, Lcom/QRBS/activity/CreateGps$3;->this$0:Lcom/QRBS/activity/CreateGps;

    const v8, 0x7f0800f9

    invoke-virtual {v7, v8}, Lcom/QRBS/activity/CreateGps;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v1, v5, v7}, Lcom/scannerfire/utils/Utils;->showProgress(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)Landroid/app/ProgressDialog;

    move-result-object v1

    iput-object v1, v0, Lcom/QRBS/activity/CreateGps;->prog:Landroid/app/ProgressDialog;

    .line 168
    iget-object v0, p0, Lcom/QRBS/activity/CreateGps$3;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v0, v0, Lcom/QRBS/activity/CreateGps;->prog:Landroid/app/ProgressDialog;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setCancelable(Z)V

    .line 169
    iget-object v0, p0, Lcom/QRBS/activity/CreateGps$3;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v0, v0, Lcom/QRBS/activity/CreateGps;->locationManager:Landroid/location/LocationManager;

    const-string v1, "gps"

    iget-object v5, p0, Lcom/QRBS/activity/CreateGps$3;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v5, v5, Lcom/QRBS/activity/CreateGps;->locationListener:Lcom/QRBS/activity/CreateGps$MyCurrentLocationListener;

    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V

    .line 170
    iget-object v0, p0, Lcom/QRBS/activity/CreateGps$3;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v0, v0, Lcom/QRBS/activity/CreateGps;->locationManager:Landroid/location/LocationManager;

    const-string v1, "network"

    iget-object v5, p0, Lcom/QRBS/activity/CreateGps$3;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v5, v5, Lcom/QRBS/activity/CreateGps;->locationListener:Lcom/QRBS/activity/CreateGps$MyCurrentLocationListener;

    invoke-virtual/range {v0 .. v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V

    .line 172
    const-string v0, ""

    const-string v1, "CHECKPOINT"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0
.end method
