.class Lcom/thetransitapp/droid/widget/LegalAdapter$1;
.super Ljava/lang/Object;
.source "LegalAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/thetransitapp/droid/widget/LegalAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/thetransitapp/droid/widget/LegalAdapter;

.field private final synthetic val$feed:Lcom/thetransitapp/droid/model/Feed;


# direct methods
.method constructor <init>(Lcom/thetransitapp/droid/widget/LegalAdapter;Lcom/thetransitapp/droid/model/Feed;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/thetransitapp/droid/widget/LegalAdapter$1;->this$0:Lcom/thetransitapp/droid/widget/LegalAdapter;

    iput-object p2, p0, Lcom/thetransitapp/droid/widget/LegalAdapter$1;->val$feed:Lcom/thetransitapp/droid/model/Feed;

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 73
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/LegalAdapter$1;->val$feed:Lcom/thetransitapp/droid/model/Feed;

    invoke-virtual {v2}, Lcom/thetransitapp/droid/model/Feed;->getLicenceUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 74
    .local v1, "url":Landroid/net/Uri;
    new-instance v0, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 76
    .local v0, "intent":Landroid/content/Intent;
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/LegalAdapter$1;->this$0:Lcom/thetransitapp/droid/widget/LegalAdapter;

    # getter for: Lcom/thetransitapp/droid/widget/LegalAdapter;->activity:Landroid/app/Activity;
    invoke-static {v2}, Lcom/thetransitapp/droid/widget/LegalAdapter;->access$0(Lcom/thetransitapp/droid/widget/LegalAdapter;)Landroid/app/Activity;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 77
    iget-object v2, p0, Lcom/thetransitapp/droid/widget/LegalAdapter$1;->this$0:Lcom/thetransitapp/droid/widget/LegalAdapter;

    # getter for: Lcom/thetransitapp/droid/widget/LegalAdapter;->activity:Landroid/app/Activity;
    invoke-static {v2}, Lcom/thetransitapp/droid/widget/LegalAdapter;->access$0(Lcom/thetransitapp/droid/widget/LegalAdapter;)Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 79
    :cond_0
    return-void
.end method
