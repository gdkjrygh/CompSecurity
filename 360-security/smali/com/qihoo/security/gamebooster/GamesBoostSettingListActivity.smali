.class public Lcom/qihoo/security/gamebooster/GamesBoostSettingListActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    return-void
.end method


# virtual methods
.method protected j()V
    .locals 2

    .prologue
    .line 29
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->j()V

    .line 30
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostSettingListActivity;->r:Landroid/support/v7/app/ActionBar;

    if-eqz v0, :cond_0

    .line 31
    iget-object v0, p0, Lcom/qihoo/security/gamebooster/GamesBoostSettingListActivity;->o:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c00a0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/GamesBoostSettingListActivity;->b(Ljava/lang/String;)V

    .line 33
    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .prologue
    .line 23
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 24
    const v0, 0x7f03001c

    invoke-virtual {p0, v0}, Lcom/qihoo/security/gamebooster/GamesBoostSettingListActivity;->setContentView(I)V

    .line 25
    return-void
.end method
