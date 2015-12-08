.class Lcom/QRBS/activity/MyResultActivity$5;
.super Ljava/lang/Object;
.source "MyResultActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/QRBS/activity/MyResultActivity;->buildButton(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/QRBS/activity/MyResultActivity;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/MyResultActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/MyResultActivity$5;->this$0:Lcom/QRBS/activity/MyResultActivity;

    .line 170
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 172
    iget-object v0, p0, Lcom/QRBS/activity/MyResultActivity$5;->this$0:Lcom/QRBS/activity/MyResultActivity;

    iget-object v0, v0, Lcom/QRBS/activity/MyResultActivity;->bundle:Landroid/os/Bundle;

    iget-object v1, p0, Lcom/QRBS/activity/MyResultActivity$5;->this$0:Lcom/QRBS/activity/MyResultActivity;

    iget-object v1, v1, Lcom/QRBS/activity/MyResultActivity;->a:Landroid/app/Activity;

    invoke-static {v0, v1}, Lcom/scannerfire/utils/ResultUtils;->myAddressbookIntent(Landroid/os/Bundle;Landroid/app/Activity;)V

    .line 173
    return-void
.end method
