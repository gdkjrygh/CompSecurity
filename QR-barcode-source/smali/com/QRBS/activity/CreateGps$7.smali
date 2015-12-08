.class Lcom/QRBS/activity/CreateGps$7;
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
    iput-object p1, p0, Lcom/QRBS/activity/CreateGps$7;->this$0:Lcom/QRBS/activity/CreateGps;

    .line 285
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "id"    # I

    .prologue
    .line 287
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 288
    return-void
.end method
