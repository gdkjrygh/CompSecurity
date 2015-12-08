.class Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity$2;
.super Landroid/text/style/ClickableSpan;
.source "ExpressSignInIntroActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;

.field final synthetic val$introHeaderTextView:Landroid/widget/TextView;


# direct methods
.method constructor <init>(Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;Landroid/widget/TextView;)V
    .locals 0

    .prologue
    .line 90
    iput-object p1, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity$2;->this$0:Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;

    iput-object p2, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity$2;->val$introHeaderTextView:Landroid/widget/TextView;

    invoke-direct {p0}, Landroid/text/style/ClickableSpan;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5
    .param p1, "widget"    # Landroid/view/View;

    .prologue
    .line 94
    iget-object v1, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity$2;->this$0:Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;

    const v2, 0x7f0900cc

    invoke-virtual {v1, v2}, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 95
    .local v0, "IntroAdditionalText":Ljava/lang/String;
    iget-object v1, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity$2;->val$introHeaderTextView:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity$2;->val$introHeaderTextView:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity$2;->val$introHeaderTextView:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    add-int/lit8 v4, v4, -0x7

    invoke-interface {v2, v3, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 97
    iget-object v1, p0, Lcom/capitalone/mobile/banking/security/ExpressSignInIntroActivity$2;->val$introHeaderTextView:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    .line 99
    return-void
.end method
