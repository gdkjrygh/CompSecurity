.class public Lcom/qihoo/security/ui/settings/LocaleSettingActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/settings/LocaleSettingActivity$4;
    }
.end annotation


# instance fields
.field private A:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

.field private final B:Landroid/os/Handler;

.field private C:Lcom/qihoo/security/service/a;

.field private final D:Landroid/content/ServiceConnection;

.field private final E:Lcom/qihoo/security/locale/b$a;

.field private y:Landroid/widget/ListView;

.field private z:Lcom/qihoo/security/ui/settings/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 42
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    .line 53
    new-instance v0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/settings/LocaleSettingActivity$1;-><init>(Lcom/qihoo/security/ui/settings/LocaleSettingActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->B:Landroid/os/Handler;

    .line 101
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->C:Lcom/qihoo/security/service/a;

    .line 102
    new-instance v0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity$2;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/settings/LocaleSettingActivity$2;-><init>(Lcom/qihoo/security/ui/settings/LocaleSettingActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->D:Landroid/content/ServiceConnection;

    .line 118
    new-instance v0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity$3;

    invoke-direct {v0, p0}, Lcom/qihoo/security/ui/settings/LocaleSettingActivity$3;-><init>(Lcom/qihoo/security/ui/settings/LocaleSettingActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->E:Lcom/qihoo/security/locale/b$a;

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/ui/settings/LocaleSettingActivity;Lcom/qihoo/security/service/a;)Lcom/qihoo/security/service/a;
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->C:Lcom/qihoo/security/service/a;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/ui/settings/LocaleSettingActivity;)Lcom/qihoo/security/ui/settings/a;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->z:Lcom/qihoo/security/ui/settings/a;

    return-object v0
.end method

.method static synthetic b(Lcom/qihoo/security/ui/settings/LocaleSettingActivity;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->B:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/ui/settings/LocaleSettingActivity;)Lcom/qihoo/security/service/a;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->C:Lcom/qihoo/security/service/a;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 168
    invoke-super {p0, p1, p2}, Lcom/qihoo/security/app/BaseActivity;->a(Lcom/qihoo/security/ui/fragment/utils/FragmentAction;Landroid/os/Bundle;)V

    .line 169
    sget-object v0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity$4;->a:[I

    invoke-virtual {p1}, Lcom/qihoo/security/ui/fragment/utils/FragmentAction;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 176
    :goto_0
    return-void

    .line 171
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->B:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 169
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public finish()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 218
    invoke-virtual {p0}, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 219
    if-eqz v0, :cond_0

    const-string/jumbo v1, "from"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 221
    const-class v0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v2}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 223
    :cond_0
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->finish()V

    .line 224
    return-void
.end method

.method protected j()V
    .locals 2

    .prologue
    .line 95
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->j()V

    .line 96
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->r:Landroid/support/v7/app/ActionBar;

    if-eqz v0, :cond_0

    .line 97
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->o:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c0163

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->b(Ljava/lang/String;)V

    .line 99
    :cond_0
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    .prologue
    .line 75
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 76
    const v0, 0x7f030073

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->setContentView(I)V

    .line 77
    const v0, 0x7f0b0182

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->y:Landroid/widget/ListView;

    .line 78
    const v0, 0x7f0b012f

    invoke-virtual {p0, v0}, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 79
    iget-object v1, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->y:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setEmptyView(Landroid/view/View;)V

    .line 80
    new-instance v0, Lcom/qihoo/security/ui/settings/a;

    iget-object v1, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->p:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/ui/settings/a;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->z:Lcom/qihoo/security/ui/settings/a;

    .line 81
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->y:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->z:Lcom/qihoo/security/ui/settings/a;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 82
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->y:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 83
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->o:Lcom/qihoo/security/locale/d;

    iget-object v1, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->E:Lcom/qihoo/security/locale/b$a;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(Lcom/qihoo/security/locale/b;)V

    .line 84
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->p:Landroid/content/Context;

    const-class v1, Lcom/qihoo/security/service/SecurityService;

    const-string/jumbo v2, "com.qihoo.security.service.INTERNAL_CONTROL"

    iget-object v3, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->D:Landroid/content/ServiceConnection;

    const/4 v4, 0x1

    invoke-static {v0, v1, v2, v3, v4}, Lcom/qihoo360/common/utils/Utils;->bindService(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;Landroid/content/ServiceConnection;I)V

    .line 87
    new-instance v0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    invoke-direct {v0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->A:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    .line 88
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->s:Landroid/support/v4/app/f;

    invoke-virtual {v0}, Landroid/support/v4/app/f;->a()Landroid/support/v4/app/h;

    move-result-object v0

    .line 89
    iget-object v1, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->A:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    const-string/jumbo v2, "language fragment"

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/app/h;->a(Landroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/h;

    .line 90
    invoke-virtual {v0}, Landroid/support/v4/app/h;->a()I

    .line 91
    return-void
.end method

.method protected onDestroy()V
    .locals 3

    .prologue
    .line 211
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onDestroy()V

    .line 212
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->o:Lcom/qihoo/security/locale/d;

    iget-object v1, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->E:Lcom/qihoo/security/locale/b$a;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->b(Lcom/qihoo/security/locale/b;)V

    .line 213
    const-string/jumbo v0, "LocaleSettingActivity"

    iget-object v1, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->p:Landroid/content/Context;

    iget-object v2, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->D:Landroid/content/ServiceConnection;

    invoke-static {v0, v1, v2}, Lcom/qihoo360/common/utils/Utils;->unbindService(Ljava/lang/String;Landroid/content/Context;Landroid/content/ServiceConnection;)V

    .line 214
    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 180
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/f;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 207
    :cond_0
    :goto_0
    return-void

    .line 183
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->z:Lcom/qihoo/security/ui/settings/a;

    invoke-virtual {v0, p3}, Lcom/qihoo/security/ui/settings/a;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/LocaleInfo;

    .line 184
    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/locale/d;->f()Ljava/lang/String;

    move-result-object v1

    .line 185
    iget-boolean v2, v0, Lcom/qihoo/security/locale/LocaleInfo;->buildin:Z

    if-eqz v2, :cond_2

    .line 186
    iget-object v2, v0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 187
    iget-object v1, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->A:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    iget-object v0, v0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 189
    :cond_2
    iget-boolean v2, v0, Lcom/qihoo/security/locale/LocaleInfo;->support:Z

    if-eqz v2, :cond_3

    .line 190
    iget-object v1, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->A:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->a(Lcom/qihoo/security/locale/LocaleInfo;)V

    goto :goto_0

    .line 192
    :cond_3
    iget v2, v0, Lcom/qihoo/security/locale/LocaleInfo;->state:I

    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 195
    :pswitch_0
    iget-object v2, v0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 196
    iget-object v1, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->A:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    iget-object v0, v0, Lcom/qihoo/security/locale/LocaleInfo;->locale:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 200
    :pswitch_1
    iget-object v1, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->A:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->a(Lcom/qihoo/security/locale/LocaleInfo;)V

    goto :goto_0

    .line 203
    :pswitch_2
    iget-object v1, p0, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;->A:Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->a(Lcom/qihoo/security/locale/LocaleInfo;)V

    goto :goto_0

    .line 192
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method
