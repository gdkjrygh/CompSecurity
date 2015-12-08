.class public Lcom/hmobile/biblekjv/AddDetailDialog;
.super Landroid/app/Dialog;
.source "AddDetailDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static final BUTTON_NEGATIVE:I = 0x2

.field private static final BUTTON_NEUTRAL:I = 0x1

.field private static final BUTTON_POSITIVE:I


# instance fields
.field private activity:Landroid/app/Activity;

.field private btnCancel:Landroid/widget/Button;

.field private btnNever:Landroid/widget/Button;

.field private btnNotNow:Landroid/widget/Button;

.field private btnOkay:Landroid/widget/Button;

.field private btnRate:Landroid/widget/Button;

.field editor:Landroid/content/SharedPreferences$Editor;

.field private rlContent:Landroid/widget/RelativeLayout;

.field private rlRate:Landroid/widget/RelativeLayout;

.field settings:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 4
    .param p1, "act"    # Landroid/app/Activity;

    .prologue
    .line 39
    invoke-direct {p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 41
    iput-object p1, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->activity:Landroid/app/Activity;

    .line 43
    const/4 v2, 0x1

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/AddDetailDialog;->requestWindowFeature(I)Z

    .line 44
    const v2, 0x7f03001a

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/AddDetailDialog;->setContentView(I)V

    .line 47
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 46
    iput-object v2, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->settings:Landroid/content/SharedPreferences;

    .line 48
    iget-object v2, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->settings:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    iput-object v2, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->editor:Landroid/content/SharedPreferences$Editor;

    .line 50
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f07009a

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/AddDetailDialog;->setTitle(Ljava/lang/CharSequence;)V

    .line 52
    const v2, 0x7f0e008f

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/AddDetailDialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 53
    .local v1, "txtTitle":Landroid/widget/TextView;
    const v2, 0x7f0e0094

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/AddDetailDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 55
    .local v0, "txtRateTitle":Landroid/widget/TextView;
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 56
    const v3, 0x7f0700a3

    .line 55
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 57
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 58
    const v3, 0x7f07009d

    .line 57
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    const v2, 0x7f0e0091

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/AddDetailDialog;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    iput-object v2, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->btnOkay:Landroid/widget/Button;

    .line 61
    const v2, 0x7f0e0092

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/AddDetailDialog;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    iput-object v2, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->btnCancel:Landroid/widget/Button;

    .line 63
    const v2, 0x7f0e0095

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/AddDetailDialog;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    iput-object v2, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->btnRate:Landroid/widget/Button;

    .line 64
    const v2, 0x7f0e0096

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/AddDetailDialog;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    iput-object v2, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->btnNotNow:Landroid/widget/Button;

    .line 65
    const v2, 0x7f0e0097

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/AddDetailDialog;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/Button;

    iput-object v2, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->btnNever:Landroid/widget/Button;

    .line 67
    const v2, 0x7f0e0093

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/AddDetailDialog;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout;

    iput-object v2, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->rlRate:Landroid/widget/RelativeLayout;

    .line 68
    const v2, 0x7f0e0090

    invoke-virtual {p0, v2}, Lcom/hmobile/biblekjv/AddDetailDialog;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout;

    iput-object v2, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->rlContent:Landroid/widget/RelativeLayout;

    .line 70
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v3, 0x0

    .line 73
    iget-object v1, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->btnOkay:Landroid/widget/Button;

    if-ne p1, v1, :cond_1

    .line 74
    iget-object v1, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->rlRate:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 95
    :cond_0
    :goto_0
    return-void

    .line 76
    :cond_1
    iget-object v1, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->btnCancel:Landroid/widget/Button;

    if-ne p1, v1, :cond_2

    .line 77
    invoke-virtual {p0}, Lcom/hmobile/biblekjv/AddDetailDialog;->dismiss()V

    goto :goto_0

    .line 78
    :cond_2
    iget-object v1, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->btnNever:Landroid/widget/Button;

    if-eq p1, v1, :cond_0

    .line 80
    iget-object v1, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->btnNotNow:Landroid/widget/Button;

    if-ne p1, v1, :cond_3

    .line 81
    iget-object v1, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v2, "exit_alert"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 82
    iget-object v1, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 83
    iget-object v1, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->activity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    goto :goto_0

    .line 85
    :cond_3
    iget-object v1, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->btnRate:Landroid/widget/Button;

    if-ne p1, v1, :cond_0

    .line 86
    iget-object v1, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v2, "exit_alert"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 87
    iget-object v1, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 89
    iget-object v1, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->activity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    .line 90
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 91
    .local v0, "intent":Landroid/content/Intent;
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "market://details?id="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->activity:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 92
    iget-object v1, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->activity:Landroid/app/Activity;

    invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 93
    iget-object v1, p0, Lcom/hmobile/biblekjv/AddDetailDialog;->activity:Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    goto :goto_0
.end method
