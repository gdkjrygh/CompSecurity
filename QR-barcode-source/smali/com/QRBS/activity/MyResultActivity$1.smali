.class Lcom/QRBS/activity/MyResultActivity$1;
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

.field private final synthetic val$text:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/QRBS/activity/MyResultActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/QRBS/activity/MyResultActivity$1;->this$0:Lcom/QRBS/activity/MyResultActivity;

    iput-object p2, p0, Lcom/QRBS/activity/MyResultActivity$1;->val$text:Ljava/lang/String;

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 107
    const-string v1, ""

    const-string v2, "SHARE"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    new-instance v0, Lcom/scannerfire/utils/EncodeUtils;

    iget-object v1, p0, Lcom/QRBS/activity/MyResultActivity$1;->this$0:Lcom/QRBS/activity/MyResultActivity;

    invoke-direct {v0, v1}, Lcom/scannerfire/utils/EncodeUtils;-><init>(Landroid/app/Activity;)V

    .line 109
    .local v0, "eu":Lcom/scannerfire/utils/EncodeUtils;
    iget-object v1, p0, Lcom/QRBS/activity/MyResultActivity$1;->val$text:Ljava/lang/String;

    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity$1;->this$0:Lcom/QRBS/activity/MyResultActivity;

    iget-object v2, v2, Lcom/QRBS/activity/MyResultActivity;->label:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/scannerfire/utils/EncodeUtils;->start(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    return-void
.end method
