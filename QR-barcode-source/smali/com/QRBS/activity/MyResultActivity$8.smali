.class Lcom/QRBS/activity/MyResultActivity$8;
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
    iput-object p1, p0, Lcom/QRBS/activity/MyResultActivity$8;->this$0:Lcom/QRBS/activity/MyResultActivity;

    iput-object p2, p0, Lcom/QRBS/activity/MyResultActivity$8;->val$text:Ljava/lang/String;

    .line 222
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 224
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.SENDTO"

    iget-object v2, p0, Lcom/QRBS/activity/MyResultActivity$8;->val$text:Ljava/lang/String;

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 225
    .local v0, "emailIntent":Landroid/content/Intent;
    iget-object v1, p0, Lcom/QRBS/activity/MyResultActivity$8;->this$0:Lcom/QRBS/activity/MyResultActivity;

    const-string v2, "Send with:"

    invoke-static {v0, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/QRBS/activity/MyResultActivity;->startActivity(Landroid/content/Intent;)V

    .line 226
    return-void
.end method
