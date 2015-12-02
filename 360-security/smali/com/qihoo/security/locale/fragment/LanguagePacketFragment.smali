.class public Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;
.super Lcom/qihoo/security/locale/LanguageFragment;
.source "360Security"


# instance fields
.field protected final c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private j:Lcom/qihoo/security/v5/UpdateService;

.field private k:Lcom/qihoo/security/dialog/k;

.field private final l:Lcom/qihoo/security/v5/e;

.field private final m:Landroid/content/ServiceConnection;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 42
    invoke-direct {p0}, Lcom/qihoo/security/locale/LanguageFragment;-><init>()V

    .line 44
    iput-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->j:Lcom/qihoo/security/v5/UpdateService;

    .line 46
    iput-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->k:Lcom/qihoo/security/dialog/k;

    .line 49
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 51
    new-instance v0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$1;

    invoke-direct {v0, p0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$1;-><init>(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)V

    iput-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->l:Lcom/qihoo/security/v5/e;

    .line 124
    new-instance v0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$5;

    invoke-direct {v0, p0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$5;-><init>(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)V

    iput-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->m:Landroid/content/ServiceConnection;

    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;Lcom/qihoo/security/v5/UpdateService;)Lcom/qihoo/security/v5/UpdateService;
    .locals 0

    .prologue
    .line 42
    iput-object p1, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->j:Lcom/qihoo/security/v5/UpdateService;

    return-object p1
.end method

.method static synthetic a(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)V
    .locals 0

    .prologue
    .line 42
    invoke-direct {p0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->c()V

    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->a:Ljava/lang/String;

    return-object v0
.end method

.method private c()V
    .locals 1

    .prologue
    .line 322
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->k:Lcom/qihoo/security/dialog/k;

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->dismissDialog(Landroid/app/Dialog;)V

    .line 323
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 324
    invoke-virtual {p0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->b()V

    .line 330
    :goto_0
    return-void

    .line 325
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->isNetworkAvailable(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 326
    invoke-direct {p0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->g()V

    goto :goto_0

    .line 328
    :cond_1
    invoke-direct {p0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->d()V

    goto :goto_0
.end method

.method static synthetic d(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)Lcom/qihoo/security/v5/UpdateService;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->j:Lcom/qihoo/security/v5/UpdateService;

    return-object v0
.end method

.method private d()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x1

    .line 372
    invoke-virtual {p0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 390
    :goto_0
    return-void

    .line 375
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x7f0c01c7

    .line 376
    :goto_1
    iget-object v1, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_2

    const v1, 0x7f0c01c6

    .line 378
    :goto_2
    iget-object v2, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_3

    const v2, 0x7f0c01d0

    .line 380
    :goto_3
    new-instance v3, Lcom/qihoo/security/dialog/i;

    invoke-virtual {p0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    invoke-direct {v3, v4, v0, v1}, Lcom/qihoo/security/dialog/i;-><init>(Landroid/content/Context;II)V

    .line 381
    invoke-virtual {v3, v5}, Lcom/qihoo/security/dialog/i;->setCancelable(Z)V

    .line 382
    new-array v0, v5, [I

    aput v2, v0, v6

    invoke-virtual {v3, v0}, Lcom/qihoo/security/dialog/i;->setButtonText([I)V

    .line 383
    new-array v0, v5, [Landroid/view/View$OnClickListener;

    new-instance v1, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$3;

    invoke-direct {v1, p0, v3}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$3;-><init>(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;Lcom/qihoo/security/dialog/i;)V

    aput-object v1, v0, v6

    invoke-virtual {v3, v0}, Lcom/qihoo/security/dialog/i;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 389
    invoke-static {v3}, Lcom/qihoo360/common/utils/Utils;->showDialog(Landroid/app/Dialog;)V

    goto :goto_0

    .line 375
    :cond_1
    const v0, 0x7f0c0163

    goto :goto_1

    .line 376
    :cond_2
    const v1, 0x7f0c00c5

    goto :goto_2

    .line 378
    :cond_3
    const v2, 0x7f0c0156

    goto :goto_3
.end method

.method static synthetic e(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)Lcom/qihoo/security/dialog/k;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->k:Lcom/qihoo/security/dialog/k;

    return-object v0
.end method

.method static synthetic f(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)Lcom/qihoo/security/locale/d;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->f:Lcom/qihoo/security/locale/d;

    return-object v0
.end method

.method static synthetic g(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 42
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->d:Landroid/content/Context;

    return-object v0
.end method

.method private g()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x1

    .line 396
    invoke-virtual {p0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 415
    :goto_0
    return-void

    .line 399
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x7f0c01c7

    .line 400
    :goto_1
    iget-object v1, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_2

    const v1, 0x7f0c01ca

    .line 402
    :goto_2
    iget-object v2, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_3

    const v2, 0x7f0c01d0

    .line 404
    :goto_3
    new-instance v3, Lcom/qihoo/security/dialog/i;

    invoke-virtual {p0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    invoke-direct {v3, v4, v0, v1}, Lcom/qihoo/security/dialog/i;-><init>(Landroid/content/Context;II)V

    .line 405
    invoke-virtual {v3, v5}, Lcom/qihoo/security/dialog/i;->setCancelable(Z)V

    .line 406
    new-array v0, v5, [I

    aput v2, v0, v6

    invoke-virtual {v3, v0}, Lcom/qihoo/security/dialog/i;->setButtonText([I)V

    .line 407
    new-array v0, v5, [Landroid/view/View$OnClickListener;

    new-instance v1, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$4;

    invoke-direct {v1, p0, v3}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$4;-><init>(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;Lcom/qihoo/security/dialog/i;)V

    aput-object v1, v0, v6

    invoke-virtual {v3, v0}, Lcom/qihoo/security/dialog/i;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 414
    invoke-static {v3}, Lcom/qihoo360/common/utils/Utils;->showDialog(Landroid/app/Dialog;)V

    goto :goto_0

    .line 399
    :cond_1
    const v0, 0x7f0c0163

    goto :goto_1

    .line 400
    :cond_2
    const v1, 0x7f0c0176

    goto :goto_2

    .line 402
    :cond_3
    const v2, 0x7f0c0156

    goto :goto_3
.end method


# virtual methods
.method public a()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v5, 0x1

    .line 240
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->k:Lcom/qihoo/security/dialog/k;

    if-nez v0, :cond_1

    .line 241
    invoke-virtual {p0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 277
    :goto_0
    return-void

    .line 244
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_2

    const v0, 0x7f0c01c7

    .line 246
    :goto_1
    iget-object v1, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_3

    const v1, 0x7f0c01c9

    .line 248
    :goto_2
    iget-object v2, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_4

    const v2, 0x7f0c01cf

    .line 250
    :goto_3
    new-instance v3, Lcom/qihoo/security/dialog/k;

    invoke-virtual {p0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    invoke-direct {v3, v4, v0, v1}, Lcom/qihoo/security/dialog/k;-><init>(Landroid/content/Context;II)V

    iput-object v3, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->k:Lcom/qihoo/security/dialog/k;

    .line 251
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->k:Lcom/qihoo/security/dialog/k;

    invoke-virtual {v0, v5}, Lcom/qihoo/security/dialog/k;->setCancelable(Z)V

    .line 252
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->k:Lcom/qihoo/security/dialog/k;

    new-array v3, v5, [I

    aput v2, v3, v6

    invoke-virtual {v0, v3}, Lcom/qihoo/security/dialog/k;->setButtonText([I)V

    .line 253
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->k:Lcom/qihoo/security/dialog/k;

    new-array v2, v5, [Landroid/view/View$OnClickListener;

    new-instance v3, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$8;

    invoke-direct {v3, p0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$8;-><init>(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)V

    aput-object v3, v2, v6

    invoke-virtual {v0, v2}, Lcom/qihoo/security/dialog/k;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 260
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->k:Lcom/qihoo/security/dialog/k;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/k;->a(I)V

    .line 261
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->k:Lcom/qihoo/security/dialog/k;

    new-instance v1, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$9;

    invoke-direct {v1, p0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$9;-><init>(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/k;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 276
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->k:Lcom/qihoo/security/dialog/k;

    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->showDialog(Landroid/app/Dialog;)V

    goto :goto_0

    .line 244
    :cond_2
    const v0, 0x7f0c0163

    goto :goto_1

    .line 246
    :cond_3
    const v1, 0x7f0c0175

    goto :goto_2

    .line 248
    :cond_4
    const v2, 0x7f0c014f

    goto :goto_3
.end method

.method public a(Lcom/qihoo/security/locale/LocaleInfo;)V
    .locals 6

    .prologue
    const v5, 0x7f0c016d

    const/4 v3, 0x2

    const/4 v4, 0x1

    .line 204
    invoke-virtual {p0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 234
    :goto_0
    return-void

    .line 208
    :cond_0
    new-instance v0, Lcom/qihoo/security/dialog/i;

    invoke-virtual {p0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const v2, 0x7f0c0163

    invoke-direct {v0, v1, v2, v5}, Lcom/qihoo/security/dialog/i;-><init>(Landroid/content/Context;II)V

    .line 210
    invoke-virtual {v0, v5}, Lcom/qihoo/security/dialog/i;->setDialogMessage(I)V

    .line 211
    invoke-virtual {v0, v4}, Lcom/qihoo/security/dialog/i;->setCancelable(Z)V

    .line 212
    new-array v1, v3, [I

    fill-array-data v1, :array_0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/i;->setButtonText([I)V

    .line 213
    new-array v1, v3, [Landroid/view/View$OnClickListener;

    const/4 v2, 0x0

    new-instance v3, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$6;

    invoke-direct {v3, p0, p1, v0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$6;-><init>(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;Lcom/qihoo/security/locale/LocaleInfo;Lcom/qihoo/security/dialog/i;)V

    aput-object v3, v1, v2

    new-instance v2, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$7;

    invoke-direct {v2, p0, v0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$7;-><init>(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;Lcom/qihoo/security/dialog/i;)V

    aput-object v2, v1, v4

    invoke-virtual {v0, v1}, Lcom/qihoo/security/dialog/i;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 233
    invoke-static {v0}, Lcom/qihoo360/common/utils/Utils;->showDialog(Landroid/app/Dialog;)V

    goto :goto_0

    .line 212
    :array_0
    .array-data 4
        0x7f0c0156
        0x7f0c014f
    .end array-data
.end method

.method protected a(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 163
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->j:Lcom/qihoo/security/v5/UpdateService;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 164
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->j:Lcom/qihoo/security/v5/UpdateService;

    iget-object v1, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->l:Lcom/qihoo/security/v5/e;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/v5/UpdateService;->a(Lcom/qihoo/security/v5/b;)V

    .line 166
    :cond_0
    iput-object p1, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->a:Ljava/lang/String;

    .line 167
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->d:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/v5/UpdateService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 168
    const-string/jumbo v1, "com.qihoo.security.action.ACTION_CHECK_UPDATE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 169
    const-string/jumbo v1, "type"

    const/16 v2, 0x7d1

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 170
    const-string/jumbo v1, "locale"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 171
    iget-object v1, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->d:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 172
    return-void
.end method

.method protected b()V
    .locals 9

    .prologue
    const/4 v8, 0x2

    const/4 v7, 0x0

    const/4 v6, 0x1

    .line 336
    invoke-virtual {p0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 366
    :goto_0
    return-void

    .line 339
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x7f0c01cb

    .line 341
    :goto_1
    iget-object v1, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_2

    const v1, 0x7f0c01ce

    .line 343
    :goto_2
    iget-object v2, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_3

    const v2, 0x7f0c01d0

    .line 344
    :goto_3
    iget-object v3, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3

    if-eqz v3, :cond_4

    const v3, 0x7f0c01cc

    .line 347
    :goto_4
    new-instance v4, Lcom/qihoo/security/dialog/i;

    invoke-virtual {p0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v5

    invoke-direct {v4, v5, v0, v1}, Lcom/qihoo/security/dialog/i;-><init>(Landroid/content/Context;II)V

    .line 348
    invoke-virtual {v4, v6}, Lcom/qihoo/security/dialog/i;->setCancelable(Z)V

    .line 349
    new-array v0, v8, [I

    aput v2, v0, v7

    aput v3, v0, v6

    invoke-virtual {v4, v0}, Lcom/qihoo/security/dialog/i;->setButtonText([I)V

    .line 350
    new-array v0, v8, [Landroid/view/View$OnClickListener;

    new-instance v1, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$12;

    invoke-direct {v1, p0, v4}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$12;-><init>(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;Lcom/qihoo/security/dialog/i;)V

    aput-object v1, v0, v7

    new-instance v1, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$2;

    invoke-direct {v1, p0, v4}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$2;-><init>(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;Lcom/qihoo/security/dialog/i;)V

    aput-object v1, v0, v6

    invoke-virtual {v4, v0}, Lcom/qihoo/security/dialog/i;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 365
    invoke-static {v4}, Lcom/qihoo360/common/utils/Utils;->showDialog(Landroid/app/Dialog;)V

    goto :goto_0

    .line 339
    :cond_1
    const v0, 0x7f0c01a1

    goto :goto_1

    .line 341
    :cond_2
    const v1, 0x7f0c01a3

    goto :goto_2

    .line 343
    :cond_3
    const v2, 0x7f0c0156

    goto :goto_3

    .line 344
    :cond_4
    const v3, 0x7f0c01a2

    goto :goto_4
.end method

.method public b(Ljava/lang/String;)V
    .locals 9

    .prologue
    const/4 v8, 0x2

    const/4 v7, 0x0

    const/4 v6, 0x1

    .line 285
    invoke-virtual {p0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 316
    :goto_0
    return-void

    .line 289
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x7f0c01c7

    .line 290
    :goto_1
    iget-object v1, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_2

    const v1, 0x7f0c01c8

    .line 292
    :goto_2
    iget-object v2, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_3

    const v2, 0x7f0c01d0

    .line 293
    :goto_3
    iget-object v3, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3

    if-eqz v3, :cond_4

    const v3, 0x7f0c01cf

    .line 295
    :goto_4
    new-instance v4, Lcom/qihoo/security/dialog/i;

    invoke-virtual {p0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v5

    invoke-direct {v4, v5, v0, v1}, Lcom/qihoo/security/dialog/i;-><init>(Landroid/content/Context;II)V

    .line 296
    invoke-virtual {v4, v6}, Lcom/qihoo/security/dialog/i;->setCancelable(Z)V

    .line 297
    new-array v0, v8, [I

    aput v2, v0, v7

    aput v3, v0, v6

    invoke-virtual {v4, v0}, Lcom/qihoo/security/dialog/i;->setButtonText([I)V

    .line 298
    new-array v0, v8, [Landroid/view/View$OnClickListener;

    new-instance v1, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$10;

    invoke-direct {v1, p0, p1, v4}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$10;-><init>(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;Ljava/lang/String;Lcom/qihoo/security/dialog/i;)V

    aput-object v1, v0, v7

    new-instance v1, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$11;

    invoke-direct {v1, p0, v4}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment$11;-><init>(Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;Lcom/qihoo/security/dialog/i;)V

    aput-object v1, v0, v6

    invoke-virtual {v4, v0}, Lcom/qihoo/security/dialog/i;->setButtonOnClickListener([Landroid/view/View$OnClickListener;)V

    .line 315
    invoke-static {v4}, Lcom/qihoo360/common/utils/Utils;->showDialog(Landroid/app/Dialog;)V

    goto :goto_0

    .line 289
    :cond_1
    const v0, 0x7f0c0163

    goto :goto_1

    .line 290
    :cond_2
    const v1, 0x7f0c016a

    goto :goto_2

    .line 292
    :cond_3
    const v2, 0x7f0c0156

    goto :goto_3

    .line 293
    :cond_4
    const v3, 0x7f0c014f

    goto :goto_4
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 4

    .prologue
    .line 148
    invoke-super {p0, p1}, Lcom/qihoo/security/locale/LanguageFragment;->onAttach(Landroid/app/Activity;)V

    .line 152
    invoke-virtual {p0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/qihoo/security/v5/UpdateService;

    invoke-direct {v1, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v2, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->m:Landroid/content/ServiceConnection;

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 155
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 423
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->j:Lcom/qihoo/security/v5/UpdateService;

    if-eqz v0, :cond_0

    .line 424
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->j:Lcom/qihoo/security/v5/UpdateService;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/v5/UpdateService;->a(Lcom/qihoo/security/v5/b;)V

    .line 425
    iput-object v1, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->j:Lcom/qihoo/security/v5/UpdateService;

    .line 428
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->b:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 430
    invoke-super {p0}, Lcom/qihoo/security/locale/LanguageFragment;->onDestroy()V

    .line 431
    return-void
.end method

.method public onDetach()V
    .locals 2

    .prologue
    .line 438
    invoke-virtual {p0}, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/locale/fragment/LanguagePacketFragment;->m:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 439
    invoke-super {p0}, Lcom/qihoo/security/locale/LanguageFragment;->onDetach()V

    .line 440
    return-void
.end method
