.class public abstract Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;
.super Lcom/qihoo/security/dialog/AbsDialogListActivity;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/receiver/PackageMonitor$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$b;,
        Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;
    }
.end annotation


# instance fields
.field protected c:Landroid/support/v4/content/g;

.field protected d:Landroid/content/BroadcastReceiver;

.field private e:Lcom/qihoo/security/dialog/g;

.field private f:Lcom/qihoo/security/malware/a/b;

.field private g:Lcom/qihoo/security/receiver/PackageMonitor;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;"
        }
    .end annotation
.end field

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private k:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;

.field private l:Z

.field private final m:Lcom/qihoo/security/malware/a/a$a;

.field private final n:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 51
    invoke-direct {p0}, Lcom/qihoo/security/dialog/AbsDialogListActivity;-><init>()V

    .line 57
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->f:Lcom/qihoo/security/malware/a/b;

    .line 113
    new-instance v0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$1;-><init>(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)V

    iput-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->m:Lcom/qihoo/security/malware/a/a$a;

    .line 143
    new-instance v0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$2;

    invoke-direct {v0, p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$2;-><init>(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)V

    iput-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->d:Landroid/content/BroadcastReceiver;

    .line 332
    new-instance v0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$6;

    invoke-direct {v0, p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$6;-><init>(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)V

    iput-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->n:Ljava/util/Comparator;

    .line 565
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Lcom/qihoo/security/dialog/g;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->e:Lcom/qihoo/security/dialog/g;

    return-object v0
.end method

.method static synthetic a(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;Lcom/qihoo/security/malware/vo/MaliciousInfo;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0, p1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->a(Lcom/qihoo/security/malware/vo/MaliciousInfo;)V

    return-void
.end method

.method private a(Lcom/qihoo/security/malware/vo/MaliciousInfo;)V
    .locals 3

    .prologue
    .line 326
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->b:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/ui/antivirus/MalwareDetailActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 327
    const-string/jumbo v1, "extra_detail_info"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 328
    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->startActivity(Landroid/content/Intent;)V

    .line 329
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->finish()V

    .line 330
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;Z)Z
    .locals 0

    .prologue
    .line 51
    iput-boolean p1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->l:Z

    return p1
.end method

.method public static a(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 424
    const-class v0, Lcom/qihoo/security/dialog/monitor/MonitorDangerDialog;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 425
    invoke-static {}, Lcom/qihoo/security/dialog/monitor/MonitorDangerDialog;->i()Z

    move-result v0

    .line 429
    :goto_0
    return v0

    .line 426
    :cond_0
    const-class v0, Lcom/qihoo/security/dialog/monitor/MonitorWarningDialog;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 427
    invoke-static {}, Lcom/qihoo/security/dialog/monitor/MonitorWarningDialog;->i()Z

    move-result v0

    goto :goto_0

    .line 429
    :cond_1
    invoke-static {}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->h()Z

    move-result v0

    goto :goto_0
.end method

.method static synthetic b(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->i()V

    return-void
.end method

.method static synthetic c(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Z
    .locals 1

    .prologue
    .line 51
    iget-boolean v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->l:Z

    return v0
.end method

.method static synthetic d(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->k:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;

    return-object v0
.end method

.method static synthetic f(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->l()V

    return-void
.end method

.method static synthetic g(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Ljava/util/List;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->i:Ljava/util/List;

    return-object v0
.end method

.method static synthetic h(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Ljava/util/List;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->j:Ljava/util/List;

    return-object v0
.end method

.method public static h()Z
    .locals 1

    .prologue
    .line 420
    const/4 v0, 0x0

    return v0
.end method

.method static synthetic i(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->b:Landroid/content/Context;

    return-object v0
.end method

.method private i()V
    .locals 5

    .prologue
    .line 222
    iget-object v1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->j:Ljava/util/List;

    .line 223
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->j:Ljava/util/List;

    .line 224
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->d()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->h:Ljava/util/List;

    .line 225
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 226
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 227
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 231
    invoke-virtual {v0, p0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isUninstall(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 232
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 233
    iget v3, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->_id:I

    invoke-static {p0, v3}, Lcom/qihoo/security/malware/db/a;->a(Landroid/content/Context;I)V

    .line 234
    iget-object v3, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->i:Ljava/util/List;

    iget v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->_id:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 236
    :cond_0
    invoke-virtual {v0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isMalware()Z

    move-result v3

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->_id:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 237
    iget-object v3, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->i:Ljava/util/List;

    iget v4, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->_id:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 239
    :cond_1
    iget-object v3, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->j:Ljava/util/List;

    iget v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->_id:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 244
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 245
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 246
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 247
    iget-object v2, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->j:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 248
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 253
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 258
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->finish()V

    .line 266
    :goto_2
    return-void

    .line 261
    :cond_5
    invoke-direct {p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->k()V

    .line 264
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->h:Ljava/util/List;

    iget-object v1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->n:Ljava/util/Comparator;

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 265
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->k:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;

    invoke-virtual {v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;->notifyDataSetChanged()V

    goto :goto_2
.end method

.method static synthetic j(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Ljava/util/List;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->h:Ljava/util/List;

    return-object v0
.end method

.method private j()V
    .locals 3

    .prologue
    .line 269
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->g()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->a(I)V

    .line 270
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->c()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->setDialogTitle(I)V

    .line 271
    new-instance v0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;

    invoke-direct {v0, p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;-><init>(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)V

    iput-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->k:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;

    .line 272
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->k:Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$a;

    new-instance v1, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$3;

    invoke-direct {v1, p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$3;-><init>(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)V

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->a(Landroid/widget/BaseAdapter;Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 280
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/view/View$OnClickListener;

    const/4 v1, 0x0

    new-instance v2, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$4;

    invoke-direct {v2, p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$4;-><init>(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)V

    aput-object v2, v0, v1

    const/4 v1, 0x1

    new-instance v2, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$5;

    invoke-direct {v2, p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog$5;-><init>(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)V

    aput-object v2, v0, v1

    invoke-virtual {p0, v0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 306
    return-void
.end method

.method static synthetic k(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->b:Landroid/content/Context;

    return-object v0
.end method

.method private k()V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x0

    const/4 v3, 0x1

    .line 309
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->a:Lcom/qihoo/security/locale/d;

    const v1, 0x7f0c011f

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v0

    .line 310
    iget-object v1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->a:Lcom/qihoo/security/locale/d;

    const v2, 0x7f0c014f

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    .line 311
    new-array v2, v5, [Ljava/lang/CharSequence;

    aput-object v0, v2, v4

    aput-object v1, v2, v3

    invoke-virtual {p0, v2}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->setButtonText([Ljava/lang/CharSequence;)V

    .line 312
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->getShownButtons()[Lcom/qihoo/security/locale/widget/LocaleButton;

    move-result-object v0

    .line 313
    array-length v1, v0

    if-ne v1, v5, :cond_0

    .line 314
    iget-object v1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 315
    aget-object v1, v0, v3

    invoke-virtual {v1, v3}, Lcom/qihoo/security/locale/widget/LocaleButton;->setEnabled(Z)V

    .line 316
    aget-object v0, v0, v3

    invoke-virtual {p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f080056

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleButton;->setTextColor(I)V

    .line 322
    :cond_0
    :goto_0
    return-void

    .line 318
    :cond_1
    aget-object v1, v0, v3

    invoke-virtual {v1, v4}, Lcom/qihoo/security/locale/widget/LocaleButton;->setEnabled(Z)V

    .line 319
    aget-object v0, v0, v3

    invoke-virtual {p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f08006b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleButton;->setTextColor(I)V

    goto :goto_0
.end method

.method static synthetic l(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->b:Landroid/content/Context;

    return-object v0
.end method

.method private l()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 365
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 366
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->d()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->h:Ljava/util/List;

    .line 367
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 369
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 370
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 374
    invoke-virtual {v0, p0}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isUninstall(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 375
    iget-object v3, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->i:Ljava/util/List;

    iget v4, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->_id:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 376
    iget-object v3, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->j:Ljava/util/List;

    iget v4, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->_id:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 377
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 378
    iget v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->_id:I

    invoke-static {p0, v0}, Lcom/qihoo/security/malware/db/a;->a(Landroid/content/Context;I)V

    goto :goto_0

    .line 379
    :cond_1
    iget-object v3, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->i:Ljava/util/List;

    iget v4, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->_id:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 380
    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 384
    :cond_2
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 385
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->f:Lcom/qihoo/security/malware/a/b;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/malware/a/b;->a(Ljava/util/List;)V

    .line 387
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->e:Lcom/qihoo/security/dialog/g;

    if-eqz v0, :cond_3

    .line 388
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->e:Lcom/qihoo/security/dialog/g;

    invoke-static {}, Lcom/qihoo/security/locale/d;->a()Lcom/qihoo/security/locale/d;

    move-result-object v2

    const v3, 0x7f0c00ec

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v6

    const/4 v5, 0x1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v4, v5

    invoke-virtual {v2, v3, v4}, Lcom/qihoo/security/locale/d;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/g;->a(Ljava/lang/CharSequence;)V

    .line 390
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->e:Lcom/qihoo/security/dialog/g;

    invoke-virtual {v0}, Lcom/qihoo/security/dialog/g;->show()V

    .line 393
    :cond_3
    return-void
.end method

.method static synthetic m(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic n(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic o(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic p(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Lcom/qihoo/security/locale/d;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->a:Lcom/qihoo/security/locale/d;

    return-object v0
.end method

.method static synthetic q(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic r(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic s(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic t(Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;)V
    .locals 0

    .prologue
    .line 51
    invoke-direct {p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->k()V

    return-void
.end method


# virtual methods
.method protected a()I
    .locals 1

    .prologue
    .line 110
    const v0, 0x7f030077

    return v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 397
    return-void
.end method

.method public b()V
    .locals 0

    .prologue
    .line 401
    invoke-direct {p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->i()V

    .line 402
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 407
    return-void
.end method

.method protected abstract c()I
.end method

.method protected abstract d()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;"
        }
    .end annotation
.end method

.method protected abstract e()V
.end method

.method protected abstract f()V
.end method

.method protected abstract g()I
.end method

.method public onBackPressed()V
    .locals 3

    .prologue
    const/16 v2, 0x37e9

    .line 643
    invoke-super {p0}, Lcom/qihoo/security/dialog/AbsDialogListActivity;->onBackPressed()V

    .line 644
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->j:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 645
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-long v0, v0

    invoke-static {v2, v0, v1}, Lcom/qihoo/security/support/b;->a(IJ)V

    .line 649
    :goto_0
    return-void

    .line 647
    :cond_0
    invoke-static {v2}, Lcom/qihoo/security/support/b;->b(I)V

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 72
    invoke-super {p0, p1}, Lcom/qihoo/security/dialog/AbsDialogListActivity;->onCreate(Landroid/os/Bundle;)V

    .line 83
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->i:Ljava/util/List;

    .line 84
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->j:Ljava/util/List;

    .line 86
    invoke-direct {p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->j()V

    .line 87
    const/16 v0, 0x37e7

    invoke-static {v0}, Lcom/qihoo/security/support/b;->b(I)V

    .line 90
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/content/g;->a(Landroid/content/Context;)Landroid/support/v4/content/g;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->c:Landroid/support/v4/content/g;

    .line 91
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->e()V

    .line 93
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/support/a;->c(Landroid/content/Context;)Z

    move-result v0

    .line 94
    if-eqz v0, :cond_0

    .line 95
    new-instance v1, Lcom/qihoo/security/dialog/g;

    invoke-direct {v1, p0}, Lcom/qihoo/security/dialog/g;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->e:Lcom/qihoo/security/dialog/g;

    .line 96
    iget-object v1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->e:Lcom/qihoo/security/dialog/g;

    invoke-virtual {v1, v2}, Lcom/qihoo/security/dialog/g;->setCancelable(Z)V

    .line 97
    iget-object v1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->e:Lcom/qihoo/security/dialog/g;

    invoke-virtual {v1, v2}, Lcom/qihoo/security/dialog/g;->setCanceledOnTouchOutside(Z)V

    .line 100
    :cond_0
    new-instance v1, Lcom/qihoo/security/malware/a/b;

    iget-object v2, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->m:Lcom/qihoo/security/malware/a/a$a;

    invoke-direct {v1, p0, v0, v2}, Lcom/qihoo/security/malware/a/b;-><init>(Landroid/content/Context;ZLcom/qihoo/security/malware/a/a$a;)V

    iput-object v1, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->f:Lcom/qihoo/security/malware/a/b;

    .line 103
    new-instance v0, Lcom/qihoo/security/receiver/PackageMonitor;

    invoke-direct {v0, p0}, Lcom/qihoo/security/receiver/PackageMonitor;-><init>(Lcom/qihoo/security/receiver/PackageMonitor$a;)V

    iput-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->g:Lcom/qihoo/security/receiver/PackageMonitor;

    .line 104
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->g:Lcom/qihoo/security/receiver/PackageMonitor;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/receiver/PackageMonitor;->a(Landroid/content/Context;)V

    .line 105
    invoke-direct {p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->i()V

    .line 106
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 202
    invoke-super {p0}, Lcom/qihoo/security/dialog/AbsDialogListActivity;->onDestroy()V

    .line 208
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->e:Lcom/qihoo/security/dialog/g;

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->dismissDialog(Landroid/app/Dialog;)V

    .line 210
    invoke-virtual {p0}, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->f()V

    .line 212
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->g:Lcom/qihoo/security/receiver/PackageMonitor;

    if-eqz v0, :cond_0

    .line 213
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->g:Lcom/qihoo/security/receiver/PackageMonitor;

    invoke-virtual {v0, p0}, Lcom/qihoo/security/receiver/PackageMonitor;->b(Landroid/content/Context;)V

    .line 215
    :cond_0
    return-void
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 180
    invoke-super {p0}, Lcom/qihoo/security/dialog/AbsDialogListActivity;->onResume()V

    .line 186
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->f:Lcom/qihoo/security/malware/a/b;

    invoke-virtual {v0}, Lcom/qihoo/security/malware/a/b;->c()V

    .line 187
    return-void
.end method

.method protected onStart()V
    .locals 1

    .prologue
    .line 169
    invoke-super {p0}, Lcom/qihoo/security/dialog/AbsDialogListActivity;->onStart()V

    .line 175
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->f:Lcom/qihoo/security/malware/a/b;

    invoke-virtual {v0}, Lcom/qihoo/security/malware/a/b;->a()V

    .line 176
    return-void
.end method

.method protected onStop()V
    .locals 1

    .prologue
    .line 191
    invoke-super {p0}, Lcom/qihoo/security/dialog/AbsDialogListActivity;->onStop()V

    .line 197
    iget-object v0, p0, Lcom/qihoo/security/dialog/monitor/AbsMonitorDialog;->f:Lcom/qihoo/security/malware/a/b;

    invoke-virtual {v0}, Lcom/qihoo/security/malware/a/b;->b()V

    .line 198
    return-void
.end method
