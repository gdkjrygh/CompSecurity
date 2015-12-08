.class Lcom/QRBS/activity/CreateGps$6;
.super Ljava/lang/Object;
.source "CreateGps.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/CreateGps;->showGPSDisabledAlertToUser()V
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
    iput-object p1, p0, Lcom/QRBS/activity/CreateGps$6;->this$0:Lcom/QRBS/activity/CreateGps;

    .line 277
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "id"    # I

    .prologue
    .line 279
    new-instance v0, Landroid/content/Intent;

    .line 280
    const-string v1, "android.settings.LOCATION_SOURCE_SETTINGS"

    .line 279
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 281
    .local v0, "callGPSSettingIntent":Landroid/content/Intent;
    iget-object v1, p0, Lcom/QRBS/activity/CreateGps$6;->this$0:Lcom/QRBS/activity/CreateGps;

    invoke-virtual {v1, v0}, Lcom/QRBS/activity/CreateGps;->startActivity(Landroid/content/Intent;)V

    .line 282
    return-void
.end method
