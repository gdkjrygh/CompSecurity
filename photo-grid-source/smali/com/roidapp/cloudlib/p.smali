.class final Lcom/roidapp/cloudlib/p;
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
    .line 400
    iput-object p1, p0, Lcom/roidapp/cloudlib/p;->b:Lcom/roidapp/cloudlib/AccountMgrActivity;

    iput-object p2, p0, Lcom/roidapp/cloudlib/p;->a:Lcom/roidapp/cloudlib/IconCheckBoxPreference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 404
    iget-object v0, p0, Lcom/roidapp/cloudlib/p;->a:Lcom/roidapp/cloudlib/IconCheckBoxPreference;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->isChecked()Z

    move-result v0

    if-nez v0, :cond_0

    .line 405
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/roidapp/cloudlib/p;->b:Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 407
    sget v1, Lcom/roidapp/cloudlib/at;->bo:I

    new-instance v2, Lcom/roidapp/cloudlib/q;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/q;-><init>(Lcom/roidapp/cloudlib/p;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 418
    sget v1, Lcom/roidapp/cloudlib/at;->ab:I

    new-instance v2, Lcom/roidapp/cloudlib/r;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/r;-><init>(Lcom/roidapp/cloudlib/p;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 428
    invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/at;->aE:I

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 430
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 431
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 436
    :goto_0
    return v4

    .line 433
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/p;->b:Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->g(Lcom/roidapp/cloudlib/AccountMgrActivity;)V

    .line 434
    iget-object v0, p0, Lcom/roidapp/cloudlib/p;->b:Lcom/roidapp/cloudlib/AccountMgrActivity;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/roidapp/cloudlib/p;->b:Lcom/roidapp/cloudlib/AccountMgrActivity;

    const-class v3, Lcom/roidapp/cloudlib/instagram/InstagramAuthActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/AccountMgrActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0
.end method
