.class final Lcom/roidapp/cloudlib/m;
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
    .line 340
    iput-object p1, p0, Lcom/roidapp/cloudlib/m;->b:Lcom/roidapp/cloudlib/AccountMgrActivity;

    iput-object p2, p0, Lcom/roidapp/cloudlib/m;->a:Lcom/roidapp/cloudlib/IconCheckBoxPreference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 344
    iget-object v0, p0, Lcom/roidapp/cloudlib/m;->a:Lcom/roidapp/cloudlib/IconCheckBoxPreference;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->isChecked()Z

    move-result v0

    if-nez v0, :cond_0

    .line 346
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/roidapp/cloudlib/m;->b:Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 348
    sget v1, Lcom/roidapp/cloudlib/at;->bo:I

    new-instance v2, Lcom/roidapp/cloudlib/n;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/n;-><init>(Lcom/roidapp/cloudlib/m;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 359
    sget v1, Lcom/roidapp/cloudlib/at;->ab:I

    new-instance v2, Lcom/roidapp/cloudlib/o;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/o;-><init>(Lcom/roidapp/cloudlib/m;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 369
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/at;->aE:I

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 371
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 372
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 379
    :goto_0
    return v3

    .line 374
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/m;->b:Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->b(Lcom/roidapp/cloudlib/AccountMgrActivity;)V

    .line 375
    iget-object v0, p0, Lcom/roidapp/cloudlib/m;->a:Lcom/roidapp/cloudlib/IconCheckBoxPreference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/IconCheckBoxPreference;->setSummaryOn(Ljava/lang/CharSequence;)V

    .line 376
    iget-object v0, p0, Lcom/roidapp/cloudlib/m;->b:Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->a(Lcom/roidapp/cloudlib/AccountMgrActivity;)Lcom/dropbox/client2/DropboxAPI;

    move-result-object v0

    invoke-virtual {v0}, Lcom/dropbox/client2/DropboxAPI;->getSession()Lcom/dropbox/client2/session/Session;

    move-result-object v0

    check-cast v0, Lcom/dropbox/client2/android/AndroidAuthSession;

    iget-object v1, p0, Lcom/roidapp/cloudlib/m;->b:Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-virtual {v0, v1}, Lcom/dropbox/client2/android/AndroidAuthSession;->startAuthentication(Landroid/content/Context;)V

    .line 377
    iget-object v0, p0, Lcom/roidapp/cloudlib/m;->b:Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/AccountMgrActivity;->f(Lcom/roidapp/cloudlib/AccountMgrActivity;)Z

    goto :goto_0
.end method
