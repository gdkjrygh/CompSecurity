.class final Lcom/roidapp/cloudlib/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/IconCheckBoxPreference;

.field final synthetic b:Lcom/roidapp/cloudlib/AccountMgrActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/AccountMgrActivity;Lcom/roidapp/cloudlib/IconCheckBoxPreference;)V
    .locals 0

    .prologue
    .line 226
    iput-object p1, p0, Lcom/roidapp/cloudlib/g;->b:Lcom/roidapp/cloudlib/AccountMgrActivity;

    iput-object p2, p0, Lcom/roidapp/cloudlib/g;->a:Lcom/roidapp/cloudlib/IconCheckBoxPreference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 230
    iget-object v0, p0, Lcom/roidapp/cloudlib/g;->a:Lcom/roidapp/cloudlib/IconCheckBoxPreference;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->isChecked()Z

    move-result v0

    if-nez v0, :cond_0

    .line 232
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/roidapp/cloudlib/g;->b:Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 234
    sget v1, Lcom/roidapp/cloudlib/at;->bo:I

    new-instance v2, Lcom/roidapp/cloudlib/h;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/h;-><init>(Lcom/roidapp/cloudlib/g;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 246
    sget v1, Lcom/roidapp/cloudlib/at;->ab:I

    new-instance v2, Lcom/roidapp/cloudlib/i;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/i;-><init>(Lcom/roidapp/cloudlib/g;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 255
    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/at;->aE:I

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 257
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 258
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 264
    :goto_0
    return v4

    .line 260
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/g;->b:Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->e(Lcom/roidapp/cloudlib/AccountMgrActivity;)V

    .line 261
    iget-object v0, p0, Lcom/roidapp/cloudlib/g;->a:Lcom/roidapp/cloudlib/IconCheckBoxPreference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->setSummaryOn(Ljava/lang/CharSequence;)V

    .line 262
    iget-object v0, p0, Lcom/roidapp/cloudlib/g;->b:Lcom/roidapp/cloudlib/AccountMgrActivity;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/roidapp/cloudlib/g;->b:Lcom/roidapp/cloudlib/AccountMgrActivity;

    const-class v3, Lcom/roidapp/cloudlib/twitter/TwitterVerifyActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/AccountMgrActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0
.end method
