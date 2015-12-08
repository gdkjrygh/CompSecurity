.class Lcom/QRBS/activity/CreateGps$1;
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
    iput-object p1, p0, Lcom/QRBS/activity/CreateGps$1;->this$0:Lcom/QRBS/activity/CreateGps;

    .line 80
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 13
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const v12, 0x7f080100

    .line 84
    iget-object v9, p0, Lcom/QRBS/activity/CreateGps$1;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v9, v9, Lcom/QRBS/activity/CreateGps;->locationManager:Landroid/location/LocationManager;

    if-eqz v9, :cond_0

    iget-object v9, p0, Lcom/QRBS/activity/CreateGps$1;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v9, v9, Lcom/QRBS/activity/CreateGps;->locationListener:Lcom/QRBS/activity/CreateGps$MyCurrentLocationListener;

    if-eqz v9, :cond_0

    .line 85
    iget-object v9, p0, Lcom/QRBS/activity/CreateGps$1;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v9, v9, Lcom/QRBS/activity/CreateGps;->locationManager:Landroid/location/LocationManager;

    iget-object v10, p0, Lcom/QRBS/activity/CreateGps$1;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v10, v10, Lcom/QRBS/activity/CreateGps;->locationListener:Lcom/QRBS/activity/CreateGps$MyCurrentLocationListener;

    invoke-virtual {v9, v10}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V

    .line 86
    :cond_0
    iget-object v9, p0, Lcom/QRBS/activity/CreateGps$1;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v9, v9, Lcom/QRBS/activity/CreateGps;->lat:Landroid/widget/EditText;

    const-string v10, ""

    invoke-virtual {v9, v10}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 87
    iget-object v9, p0, Lcom/QRBS/activity/CreateGps$1;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v9, v9, Lcom/QRBS/activity/CreateGps;->lon:Landroid/widget/EditText;

    const-string v10, ""

    invoke-virtual {v9, v10}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 90
    iget-object v9, p0, Lcom/QRBS/activity/CreateGps$1;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v9, v9, Lcom/QRBS/activity/CreateGps;->address:Landroid/widget/EditText;

    invoke-virtual {v9}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v9

    invoke-interface {v9}, Landroid/text/Editable;->length()I

    move-result v9

    if-nez v9, :cond_1

    .line 91
    iget-object v9, p0, Lcom/QRBS/activity/CreateGps$1;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v9, v9, Lcom/QRBS/activity/CreateGps;->activity:Landroid/app/Activity;

    iget-object v10, p0, Lcom/QRBS/activity/CreateGps$1;->this$0:Lcom/QRBS/activity/CreateGps;

    const v11, 0x7f0800fe

    invoke-virtual {v10, v11}, Lcom/QRBS/activity/CreateGps;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    .line 128
    :goto_0
    return-void

    .line 95
    :cond_1
    new-instance v8, Lcom/scannerfire/utils/Utils;

    invoke-direct {v8}, Lcom/scannerfire/utils/Utils;-><init>()V

    .line 96
    .local v8, "u":Lcom/scannerfire/utils/Utils;
    iget-object v9, p0, Lcom/QRBS/activity/CreateGps$1;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v9, v9, Lcom/QRBS/activity/CreateGps;->activity:Landroid/app/Activity;

    invoke-virtual {v8, v9}, Lcom/scannerfire/utils/Utils;->checkConnectivity(Landroid/app/Activity;)Z

    move-result v9

    if-nez v9, :cond_2

    .line 97
    iget-object v9, p0, Lcom/QRBS/activity/CreateGps$1;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v9, v9, Lcom/QRBS/activity/CreateGps;->activity:Landroid/app/Activity;

    iget-object v10, p0, Lcom/QRBS/activity/CreateGps$1;->this$0:Lcom/QRBS/activity/CreateGps;

    const v11, 0x7f0800ff

    invoke-virtual {v10, v11}, Lcom/QRBS/activity/CreateGps;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    goto :goto_0

    .line 103
    :cond_2
    const/4 v7, 0x0

    .line 104
    .local v7, "myAddress":Landroid/location/Address;
    :try_start_0
    iget-object v9, p0, Lcom/QRBS/activity/CreateGps$1;->this$0:Lcom/QRBS/activity/CreateGps;

    # getter for: Lcom/QRBS/activity/CreateGps;->geoCoder:Landroid/location/Geocoder;
    invoke-static {v9}, Lcom/QRBS/activity/CreateGps;->access$0(Lcom/QRBS/activity/CreateGps;)Landroid/location/Geocoder;

    move-result-object v9

    iget-object v10, p0, Lcom/QRBS/activity/CreateGps$1;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v10, v10, Lcom/QRBS/activity/CreateGps;->address:Landroid/widget/EditText;

    invoke-virtual {v10}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v10

    invoke-interface {v10}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x1

    invoke-virtual {v9, v10, v11}, Landroid/location/Geocoder;->getFromLocationName(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v9

    const/4 v10, 0x0

    invoke-interface {v9, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v0, v9

    check-cast v0, Landroid/location/Address;

    move-object v7, v0

    .line 105
    invoke-virtual {v7}, Landroid/location/Address;->hasLongitude()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-virtual {v7}, Landroid/location/Address;->hasLatitude()Z

    move-result v9

    if-eqz v9, :cond_3

    .line 106
    invoke-virtual {v7}, Landroid/location/Address;->getLongitude()D

    move-result-wide v2

    .line 107
    .local v2, "d1":D
    invoke-virtual {v7}, Landroid/location/Address;->getLatitude()D

    move-result-wide v4

    .line 108
    .local v4, "d2":D
    iget-object v9, p0, Lcom/QRBS/activity/CreateGps$1;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v9, v9, Lcom/QRBS/activity/CreateGps;->lon:Landroid/widget/EditText;

    invoke-static {v2, v3}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 109
    iget-object v9, p0, Lcom/QRBS/activity/CreateGps$1;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v9, v9, Lcom/QRBS/activity/CreateGps;->lat:Landroid/widget/EditText;

    invoke-static {v4, v5}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 115
    .end local v2    # "d1":D
    .end local v4    # "d2":D
    :catch_0
    move-exception v6

    .line 116
    .local v6, "e":Ljava/io/IOException;
    iget-object v9, p0, Lcom/QRBS/activity/CreateGps$1;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v9, v9, Lcom/QRBS/activity/CreateGps;->activity:Landroid/app/Activity;

    iget-object v10, p0, Lcom/QRBS/activity/CreateGps$1;->this$0:Lcom/QRBS/activity/CreateGps;

    const v11, 0x7f080101

    invoke-virtual {v10, v11}, Lcom/QRBS/activity/CreateGps;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    .line 117
    invoke-virtual {v6}, Ljava/io/IOException;->printStackTrace()V

    goto/16 :goto_0

    .line 111
    .end local v6    # "e":Ljava/io/IOException;
    :cond_3
    :try_start_1
    iget-object v9, p0, Lcom/QRBS/activity/CreateGps$1;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v9, v9, Lcom/QRBS/activity/CreateGps;->activity:Landroid/app/Activity;

    iget-object v10, p0, Lcom/QRBS/activity/CreateGps$1;->this$0:Lcom/QRBS/activity/CreateGps;

    const v11, 0x7f080100

    invoke-virtual {v10, v11}, Lcom/QRBS/activity/CreateGps;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_0

    .line 120
    :catch_1
    move-exception v6

    .line 121
    .local v6, "e":Ljava/lang/IndexOutOfBoundsException;
    iget-object v9, p0, Lcom/QRBS/activity/CreateGps$1;->this$0:Lcom/QRBS/activity/CreateGps;

    iget-object v9, v9, Lcom/QRBS/activity/CreateGps;->activity:Landroid/app/Activity;

    iget-object v10, p0, Lcom/QRBS/activity/CreateGps$1;->this$0:Lcom/QRBS/activity/CreateGps;

    invoke-virtual {v10, v12}, Lcom/QRBS/activity/CreateGps;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lcom/scannerfire/utils/Utils;->showToastNotification(Landroid/app/Activity;Ljava/lang/String;)V

    .line 122
    invoke-virtual {v6}, Ljava/lang/IndexOutOfBoundsException;->printStackTrace()V

    goto/16 :goto_0
.end method
