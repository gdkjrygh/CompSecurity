.class public Lcom/roidapp/photogrid/release/Preference;
.super Lcom/roidapp/photogrid/release/ParentActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/ListView;

.field private b:Lcom/roidapp/photogrid/common/o;

.field private c:I

.field private d:Z

.field private e:Z

.field private final f:[Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 45
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ParentActivity;-><init>()V

    .line 50
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/Preference;->d:Z

    .line 53
    const/16 v0, 0x21

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "English"

    aput-object v1, v0, v2

    const/4 v1, 0x1

    const-string v2, "Deutsch"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "French"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "\u65e5\u672c\u8a9e"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "\ud55c\uad6d\uc5b4"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "\u0e20\u0e32\u0e29\u0e32\u0e44\u0e17\u0e22"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "\u7b80\u4f53\u4e2d\u6587"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "\u7e41\u4f53\u4e2d\u6587"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "Espa\u00f1a"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "\u0627\u0644\u0639\u0631\u0628\u064a\u0629"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "T\u00fcrk\u00e7e"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "\u0420\u0443\u0441\u0441\u043a\u0438\u0439"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "\u0939\u093f\u0902\u0926\u0940"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "Indonesia"

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string v2, "Italiano"

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-string v2, "Melayu"

    aput-object v2, v0, v1

    const/16 v1, 0x10

    const-string v2, "Portugu\u00eas"

    aput-object v2, v0, v1

    const/16 v1, 0x11

    const-string v2, "\u0423\u043a\u0440\u0430\u0457\u043d\u0441\u044c\u043a\u0438\u0439"

    aput-object v2, v0, v1

    const/16 v1, 0x12

    const-string v2, "Vi\u1ec7t"

    aput-object v2, v0, v1

    const/16 v1, 0x13

    const-string v2, "\u0641\u0627\u0631\u0633\u06cc"

    aput-object v2, v0, v1

    const/16 v1, 0x14

    const-string v2, "Polski"

    aput-object v2, v0, v1

    const/16 v1, 0x15

    const-string v2, "Az\u0259rbaycan"

    aput-object v2, v0, v1

    const/16 v1, 0x16

    const-string v2, "Dansk"

    aput-object v2, v0, v1

    const/16 v1, 0x17

    const-string v2, "Norsk"

    aput-object v2, v0, v1

    const/16 v1, 0x18

    const-string v2, "\u05e9\u05e4\u05ea \u05e2\u05d1\u05e8\u05d9\u05ea"

    aput-object v2, v0, v1

    const/16 v1, 0x19

    const-string v2, "Nederlands"

    aput-object v2, v0, v1

    const/16 v1, 0x1a

    const-string v2, "Rom\u00e2n"

    aput-object v2, v0, v1

    const/16 v1, 0x1b

    const-string v2, "\u0388\u03bb\u03bb\u03b7\u03bd\u03b9\u03ba\u03ac"

    aput-object v2, v0, v1

    const/16 v1, 0x1c

    const-string v2, "\u010ce\u0161tina"

    aput-object v2, v0, v1

    const/16 v1, 0x1d

    const-string v2, "Magyar Nyelv"

    aput-object v2, v0, v1

    const/16 v1, 0x1e

    const-string v2, "\u0431\u044a\u043b\u0433\u0430\u0440\u0441\u043a\u0438"

    aput-object v2, v0, v1

    const/16 v1, 0x1f

    const-string v2, "Svenska"

    aput-object v2, v0, v1

    const/16 v1, 0x20

    const-string v2, "\u0421\u0440\u043f\u0441\u043a\u0430"

    aput-object v2, v0, v1

    iput-object v0, p0, Lcom/roidapp/photogrid/release/Preference;->f:[Ljava/lang/String;

    .line 981
    return-void
.end method

.method static synthetic A(Lcom/roidapp/photogrid/release/Preference;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 45
    .line 11434
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/Preference;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lcom/roidapp/photogrid/release/Preference;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 11435
    const-string v2, "SHARE_BORDER"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 11436
    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method static synthetic B(Lcom/roidapp/photogrid/release/Preference;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 11732
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const v1, 0x7f07021d

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/Preference;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Lcom/roidapp/baselib/c/n;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const v1, 0x7f07021e

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/Preference;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 45
    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/Preference;)Z
    .locals 1

    .prologue
    .line 45
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/Preference;->e:Z

    return v0
.end method

.method private b()V
    .locals 2

    .prologue
    .line 843
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/Preference;->d:Z

    if-eqz v0, :cond_0

    .line 853
    :goto_0
    return-void

    .line 846
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/Preference;->d:Z

    .line 847
    invoke-static {}, Lcom/roidapp/photogrid/common/ba;->a()Lcom/roidapp/photogrid/common/ba;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/photogrid/common/ba;->a(Landroid/app/Activity;)V

    .line 848
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 849
    const-class v1, Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 850
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/Preference;->startActivity(Landroid/content/Intent;)V

    .line 851
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/Preference;->finish()V

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/Preference;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/Preference;->d()V

    return-void
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/Preference;)V
    .locals 0

    .prologue
    .line 45
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/Preference;->b()V

    return-void
.end method

.method private d()V
    .locals 1

    .prologue
    .line 859
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/Preference;->d:Z

    if-eqz v0, :cond_0

    .line 868
    :goto_0
    return-void

    .line 862
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/Preference;->d:Z

    .line 863
    invoke-static {}, Lcom/roidapp/photogrid/common/ba;->a()Lcom/roidapp/photogrid/common/ba;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/photogrid/common/ba;->a(Landroid/app/Activity;)V

    .line 867
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/Preference;->finish()V

    goto :goto_0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/Preference;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 45
    .line 1410
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/Preference;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/Preference;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 1411
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 1412
    const-string v2, "SHAKE"

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 1422
    :goto_0
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1424
    iget-object v0, p0, Lcom/roidapp/photogrid/release/Preference;->a:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/qh;

    .line 1425
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qh;->notifyDataSetChanged()V

    .line 45
    return-void

    .line 1414
    :pswitch_0
    const-string v0, "SHAKE"

    invoke-interface {v1, v0, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 1417
    :pswitch_1
    const-string v0, "SHAKE"

    const/4 v2, 0x2

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 1412
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/Preference;)V
    .locals 4

    .prologue
    .line 2266
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f07019a

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/Preference;->f:[Ljava/lang/String;

    invoke-static {p0}, Lcom/roidapp/photogrid/common/an;->a(Landroid/content/Context;)I

    move-result v2

    new-instance v3, Lcom/roidapp/photogrid/release/qd;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/release/qd;-><init>(Lcom/roidapp/photogrid/release/Preference;)V

    invoke-virtual {v0, v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setSingleChoiceItems([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 45
    return-void
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/Preference;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 45
    .line 2943
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/Preference;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v3}, Lcom/roidapp/photogrid/release/Preference;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 2944
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 2945
    const-string v2, "WATER_MARK"

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2946
    const-string v0, "WATER_MARK"

    invoke-interface {v1, v0, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 2950
    :goto_0
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2952
    iget-object v0, p0, Lcom/roidapp/photogrid/release/Preference;->a:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/qh;

    .line 2953
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qh;->notifyDataSetChanged()V

    .line 45
    return-void

    .line 2948
    :cond_0
    const-string v0, "WATER_MARK"

    const/4 v2, 0x1

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    goto :goto_0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/release/Preference;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 45
    .line 3917
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 3918
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 3919
    const-string v2, "SHOW_NOTIFICATION_FLAG"

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3920
    const-string v0, "SHOW_NOTIFICATION_FLAG"

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 3924
    :goto_0
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 3926
    iget-object v0, p0, Lcom/roidapp/photogrid/release/Preference;->a:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/qh;

    .line 3927
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qh;->notifyDataSetChanged()V

    .line 45
    return-void

    .line 3922
    :cond_0
    const-string v0, "SHOW_NOTIFICATION_FLAG"

    invoke-interface {v1, v0, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    goto :goto_0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/release/Preference;)V
    .locals 2

    .prologue
    .line 4228
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mounted"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4229
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/release/PathSelector;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 4230
    const v1, 0xcc01

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/Preference;->startActivityForResult(Landroid/content/Intent;I)V

    .line 4231
    :goto_0
    return-void

    .line 4232
    :cond_0
    const v0, 0x7f07028d

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method

.method static synthetic i(Lcom/roidapp/photogrid/release/Preference;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 45
    .line 4756
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/Preference;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v3}, Lcom/roidapp/photogrid/release/Preference;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 4757
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 4758
    const-string v2, "FILTER_OPTIMIZATION"

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4759
    const-string v0, "FILTER_OPTIMIZATION"

    invoke-interface {v1, v0, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 4772
    :goto_0
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 4774
    iget-object v0, p0, Lcom/roidapp/photogrid/release/Preference;->a:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/qh;

    .line 4775
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qh;->notifyDataSetChanged()V

    .line 45
    return-void

    .line 4762
    :cond_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/Preference;->a:Landroid/widget/ListView;

    invoke-virtual {v2}, Landroid/widget/ListView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f070224

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v2, 0x7f07024f

    new-instance v3, Lcom/roidapp/photogrid/release/qe;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/release/qe;-><init>(Lcom/roidapp/photogrid/release/Preference;)V

    invoke-virtual {v0, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 4770
    const-string v0, "FILTER_OPTIMIZATION"

    const/4 v2, 0x1

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    goto :goto_0
.end method

.method static synthetic j(Lcom/roidapp/photogrid/release/Preference;)V
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/4 v2, 0x0

    .line 45
    .line 5444
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/Preference;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v2}, Lcom/roidapp/photogrid/release/Preference;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 5445
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    .line 5446
    const-string v1, "SHARE_BORDER"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5447
    const-string v0, "SHARE_BORDER"

    invoke-interface {v3, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 5452
    :goto_0
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 5453
    iget-object v0, p0, Lcom/roidapp/photogrid/release/Preference;->a:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/qh;

    .line 5454
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qh;->notifyDataSetChanged()V

    .line 45
    return-void

    .line 5449
    :cond_0
    const-string v0, "SHARE_BORDER"

    invoke-interface {v3, v0, v9}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 5874
    new-instance v4, Landroid/app/AlertDialog$Builder;

    invoke-direct {v4, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 5875
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030123

    const/4 v5, 0x0

    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 5876
    invoke-virtual {v4, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 5877
    const v1, 0x7f07024f

    new-instance v5, Lcom/roidapp/photogrid/release/qf;

    invoke-direct {v5, p0}, Lcom/roidapp/photogrid/release/qf;-><init>(Lcom/roidapp/photogrid/release/Preference;)V

    invoke-virtual {v4, v1, v5}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 5885
    const v1, 0x7f0d010c

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 5886
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/Preference;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v5, 0x7f080001

    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v5

    .line 5887
    array-length v1, v5

    new-array v6, v1, [I

    .line 5888
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    move v1, v2

    .line 5889
    :goto_1
    array-length v8, v5

    if-ge v1, v8, :cond_1

    .line 5890
    aget-object v8, v5, v1

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    aput v8, v6, v1

    .line 5891
    aget-object v8, v5, v1

    invoke-virtual {v7, v8}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 5889
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 5893
    :cond_1
    new-instance v1, Landroid/text/SpannableString;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v5}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 5894
    new-instance v5, Landroid/text/style/ForegroundColorSpan;

    const/high16 v7, -0x10000

    invoke-direct {v5, v7}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    aget v7, v6, v2

    aget v2, v6, v2

    aget v6, v6, v9

    add-int/2addr v2, v6

    const/16 v6, 0x21

    invoke-virtual {v1, v5, v7, v2, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 5895
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5896
    invoke-virtual {v4}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    .line 5897
    invoke-virtual {v4}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto/16 :goto_0
.end method

.method static synthetic k(Lcom/roidapp/photogrid/release/Preference;)V
    .locals 2

    .prologue
    .line 6380
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/photogrid/common/az;->k:Z

    .line 6381
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 6382
    const-class v1, Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 6383
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/Preference;->startActivity(Landroid/content/Intent;)V

    .line 45
    return-void
.end method

.method static synthetic l(Lcom/roidapp/photogrid/release/Preference;)V
    .locals 3

    .prologue
    .line 45
    .line 7316
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "SAVEPATH"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7318
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const v1, 0x7f07002e

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/Preference;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 7319
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "SAVEPATH"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 7323
    :cond_0
    const-string v0, "Update/Click"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 7324
    invoke-static {}, Lcom/roidapp/photogrid/common/bq;->d()V

    .line 7325
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/Preference;->a()Z

    move-result v0

    invoke-static {v0, p0}, Lcom/roidapp/photogrid/common/bq;->a(ZLandroid/app/Activity;)Lcom/roidapp/photogrid/common/bq;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/bq;->a()V

    .line 45
    return-void
.end method

.method static synthetic m(Lcom/roidapp/photogrid/release/Preference;)V
    .locals 1

    .prologue
    .line 45
    .line 7333
    iget-object v0, p0, Lcom/roidapp/photogrid/release/Preference;->b:Lcom/roidapp/photogrid/common/o;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/o;->b()V

    .line 45
    return-void
.end method

.method static synthetic n(Lcom/roidapp/photogrid/release/Preference;)V
    .locals 1

    .prologue
    .line 45
    .line 7340
    iget-object v0, p0, Lcom/roidapp/photogrid/release/Preference;->b:Lcom/roidapp/photogrid/common/o;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/o;->a()V

    .line 45
    return-void
.end method

.method static synthetic o(Lcom/roidapp/photogrid/release/Preference;)V
    .locals 2

    .prologue
    .line 7346
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/photogrid/common/az;->l:Z

    .line 7347
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 7348
    const-class v1, Lcom/roidapp/photogrid/common/JoinAndroidBeta;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 7349
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/Preference;->startActivity(Landroid/content/Intent;)V

    .line 45
    return-void
.end method

.method static synthetic p(Lcom/roidapp/photogrid/release/Preference;)V
    .locals 1

    .prologue
    .line 45
    .line 7373
    iget-object v0, p0, Lcom/roidapp/photogrid/release/Preference;->b:Lcom/roidapp/photogrid/common/o;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/o;->c()V

    .line 45
    return-void
.end method

.method static synthetic q(Lcom/roidapp/photogrid/release/Preference;)V
    .locals 2

    .prologue
    .line 8356
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/photogrid/common/az;->l:Z

    .line 8357
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 8358
    const-class v1, Lcom/roidapp/photogrid/common/PrivacyPolicy;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 8359
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/Preference;->startActivity(Landroid/content/Intent;)V

    .line 45
    return-void
.end method

.method static synthetic r(Lcom/roidapp/photogrid/release/Preference;)V
    .locals 2

    .prologue
    .line 8363
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/photogrid/common/az;->l:Z

    .line 8364
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 8365
    const-class v1, Lcom/roidapp/photogrid/common/Eula;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 8366
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/Preference;->startActivity(Landroid/content/Intent;)V

    .line 45
    return-void
.end method

.method static synthetic s(Lcom/roidapp/photogrid/release/Preference;)I
    .locals 2

    .prologue
    .line 45
    iget v0, p0, Lcom/roidapp/photogrid/release/Preference;->c:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/roidapp/photogrid/release/Preference;->c:I

    return v0
.end method

.method static synthetic t(Lcom/roidapp/photogrid/release/Preference;)I
    .locals 1

    .prologue
    .line 45
    iget v0, p0, Lcom/roidapp/photogrid/release/Preference;->c:I

    return v0
.end method

.method static synthetic u(Lcom/roidapp/photogrid/release/Preference;)I
    .locals 1

    .prologue
    .line 45
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/release/Preference;->c:I

    return v0
.end method

.method static synthetic v(Lcom/roidapp/photogrid/release/Preference;)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 45
    .line 8742
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/Preference;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2, v1}, Lcom/roidapp/photogrid/release/Preference;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 8743
    const-string v3, "SHAKE"

    invoke-interface {v2, v3, v0}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    .line 8745
    if-ne v2, v0, :cond_0

    .line 8746
    :goto_0
    return v0

    :cond_0
    move v0, v1

    .line 45
    goto :goto_0
.end method

.method static synthetic w(Lcom/roidapp/photogrid/release/Preference;)Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 45
    .line 8935
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/Preference;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v2}, Lcom/roidapp/photogrid/release/Preference;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 8936
    const-string v1, "WATER_MARK"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 45
    return v0
.end method

.method static synthetic x(Lcom/roidapp/photogrid/release/Preference;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 45
    .line 9905
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "SHOW_NOTIFICATION_FLAG"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 9906
    :goto_0
    return v0

    .line 9908
    :cond_0
    const/4 v0, 0x0

    .line 45
    goto :goto_0
.end method

.method static synthetic y(Lcom/roidapp/photogrid/release/Preference;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 10256
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const v1, 0x7f07002e

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/Preference;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 10257
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 10259
    const-string v2, "SAVEPATH"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 45
    return-object v0
.end method

.method static synthetic z(Lcom/roidapp/photogrid/release/Preference;)Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 45
    .line 10783
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/Preference;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v2}, Lcom/roidapp/photogrid/release/Preference;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 10784
    const-string v1, "FILTER_OPTIMIZATION"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 45
    return v0
.end method


# virtual methods
.method public final a(Z)V
    .locals 2

    .prologue
    .line 214
    const-string v0, "DebugMode"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/Preference;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 215
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "DebugMode"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 216
    return-void
.end method

.method public final a()Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 219
    const-string v0, "DebugMode"

    invoke-virtual {p0, v0, v2}, Lcom/roidapp/photogrid/release/Preference;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 220
    const-string v1, "DebugMode"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .prologue
    .line 289
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/photogrid/release/ParentActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 290
    const v0, 0xcc01

    if-ne p1, v0, :cond_0

    .line 291
    const v0, 0xcc02

    if-ne p2, v0, :cond_0

    .line 292
    if-eqz p3, :cond_0

    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 293
    iget-object v0, p0, Lcom/roidapp/photogrid/release/Preference;->a:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/qh;

    .line 294
    if-eqz v0, :cond_0

    .line 295
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qh;->notifyDataSetChanged()V

    .line 301
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 90
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 92
    const v0, 0x7f030101

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/Preference;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    :goto_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/Preference;->v:Z

    if-nez v0, :cond_1

    .line 99
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/Preference;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    const/16 v0, 0xa

    iput v0, p0, Lcom/roidapp/photogrid/release/Preference;->c:I

    .line 103
    :cond_0
    new-instance v0, Lcom/roidapp/photogrid/common/o;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/o;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/Preference;->b:Lcom/roidapp/photogrid/common/o;

    .line 104
    const v0, 0x7f0d03fc

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/Preference;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/Preference;->a:Landroid/widget/ListView;

    .line 106
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/Preference;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "fromPhotoGrid"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/Preference;->e:Z

    .line 109
    const v0, 0x7f0d0021

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/Preference;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 110
    const v1, 0x7f070298

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 111
    new-instance v1, Lcom/roidapp/photogrid/release/qb;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/qb;-><init>(Lcom/roidapp/photogrid/release/Preference;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 125
    new-instance v0, Lcom/roidapp/photogrid/release/qh;

    invoke-direct {v0, p0, v2}, Lcom/roidapp/photogrid/release/qh;-><init>(Lcom/roidapp/photogrid/release/Preference;B)V

    .line 126
    iget-object v1, p0, Lcom/roidapp/photogrid/release/Preference;->a:Landroid/widget/ListView;

    invoke-virtual {v1, v0}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 127
    iget-object v1, p0, Lcom/roidapp/photogrid/release/Preference;->a:Landroid/widget/ListView;

    new-instance v2, Lcom/roidapp/photogrid/release/qc;

    invoke-direct {v2, p0, v0}, Lcom/roidapp/photogrid/release/qc;-><init>(Lcom/roidapp/photogrid/release/Preference;Lcom/roidapp/photogrid/release/qh;)V

    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 211
    :cond_1
    return-void

    .line 94
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 95
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/Preference;->v:Z

    .line 96
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto :goto_0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 828
    const/4 v0, 0x4

    if-ne p1, v0, :cond_1

    .line 829
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/Preference;->e:Z

    if-eqz v0, :cond_0

    .line 830
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/Preference;->d()V

    .line 834
    :goto_0
    const/4 v0, 0x1

    .line 836
    :goto_1
    return v0

    .line 832
    :cond_0
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/Preference;->b()V

    goto :goto_0

    .line 836
    :cond_1
    invoke-super {p0, p1, p2}, Lcom/roidapp/photogrid/release/ParentActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_1
.end method

.method protected onPause()V
    .locals 0

    .prologue
    .line 992
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onPause()V

    .line 993
    invoke-static {}, Lcom/roidapp/photogrid/common/bq;->d()V

    .line 994
    return-void
.end method

.method public final x()V
    .locals 0

    .prologue
    .line 999
    return-void
.end method
