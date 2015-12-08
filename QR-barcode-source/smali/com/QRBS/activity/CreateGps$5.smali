.class Lcom/QRBS/activity/CreateGps$5;
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
    iput-object p1, p0, Lcom/QRBS/activity/CreateGps$5;->this$0:Lcom/QRBS/activity/CreateGps;

    .line 202
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 204
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.PICK"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 205
    .local v0, "intent":Landroid/content/Intent;
    const-string v1, "vnd.android.cursor.dir/postal-address_v2"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 206
    iget-object v1, p0, Lcom/QRBS/activity/CreateGps$5;->this$0:Lcom/QRBS/activity/CreateGps;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lcom/QRBS/activity/CreateGps;->startActivityForResult(Landroid/content/Intent;I)V

    .line 207
    return-void
.end method
