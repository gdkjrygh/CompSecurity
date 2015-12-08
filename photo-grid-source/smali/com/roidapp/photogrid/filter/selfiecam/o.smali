.class public final Lcom/roidapp/photogrid/filter/selfiecam/o;
.super Landroid/app/Dialog;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/view/View;

.field private final b:Lcom/roidapp/photogrid/filter/selfiecam/w;

.field private final c:[I

.field private d:Lcom/roidapp/photogrid/filter/selfiecam/v;

.field private e:Lcom/roidapp/photogrid/filter/selfiecam/v;

.field private f:Landroid/widget/CheckBox;

.field private g:Lcom/roidapp/photogrid/release/ParentActivity;

.field private h:Landroid/widget/TextView;

.field private i:Z

.field private j:F

.field private k:F

.field private l:Z

.field private m:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lcom/roidapp/photogrid/filter/selfiecam/w;[IZZ)V
    .locals 1

    .prologue
    .line 62
    const v0, 0x7f0b0027

    invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 63
    check-cast p1, Lcom/roidapp/photogrid/release/ParentActivity;

    iput-object p1, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->g:Lcom/roidapp/photogrid/release/ParentActivity;

    .line 64
    iput-object p2, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->b:Lcom/roidapp/photogrid/filter/selfiecam/w;

    .line 65
    iput-object p3, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->c:[I

    .line 66
    iput-boolean p4, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->i:Z

    .line 67
    iput-boolean p5, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->l:Z

    .line 68
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->l:Z

    if-eqz v0, :cond_0

    .line 69
    new-instance v0, Lcom/roidapp/photogrid/filter/selfiecam/p;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/filter/selfiecam/p;-><init>(Lcom/roidapp/photogrid/filter/selfiecam/o;)V

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 85
    :cond_0
    return-void
.end method

.method private a()V
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 224
    const v0, 0x7f0d04a5

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 225
    const v1, 0x7f0d04a4

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/filter/selfiecam/o;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 226
    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 227
    new-instance v1, Lcom/roidapp/photogrid/filter/selfiecam/r;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/filter/selfiecam/r;-><init>(Lcom/roidapp/photogrid/filter/selfiecam/o;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 234
    const v0, 0x7f0d04a6

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 235
    new-instance v1, Lcom/roidapp/photogrid/filter/selfiecam/aa;

    iget-object v3, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->c:[I

    invoke-direct {v1, v3, v0}, Lcom/roidapp/photogrid/filter/selfiecam/aa;-><init>([ILandroid/widget/TextView;)V

    iput-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->d:Lcom/roidapp/photogrid/filter/selfiecam/v;

    .line 236
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->g:Lcom/roidapp/photogrid/release/ParentActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hw;->c(Landroid/content/Context;)I

    move-result v3

    .line 238
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->c:[I

    array-length v4, v0

    move v1, v2

    :goto_0
    if-ge v1, v4, :cond_2

    .line 239
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->c:[I

    aget v0, v0, v1

    if-ne v0, v3, :cond_1

    .line 240
    const/4 v0, 0x1

    .line 241
    iget-object v3, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->d:Lcom/roidapp/photogrid/filter/selfiecam/v;

    invoke-interface {v3, v1}, Lcom/roidapp/photogrid/filter/selfiecam/v;->b(I)V

    .line 245
    :goto_1
    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->d:Lcom/roidapp/photogrid/filter/selfiecam/v;

    invoke-interface {v0, v2}, Lcom/roidapp/photogrid/filter/selfiecam/v;->b(I)V

    .line 246
    :cond_0
    return-void

    .line 238
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    :cond_2
    move v0, v2

    goto :goto_1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/filter/selfiecam/o;Landroid/view/View;Lcom/roidapp/photogrid/filter/selfiecam/v;)V
    .locals 7

    .prologue
    const/4 v6, -0x2

    const/4 v5, 0x0

    const/4 v4, 0x1

    .line 48
    .line 3249
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0300fb

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 3250
    const v0, 0x7f0d03f6

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    .line 3251
    new-instance v2, Lcom/roidapp/photogrid/filter/selfiecam/y;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3, p2}, Lcom/roidapp/photogrid/filter/selfiecam/y;-><init>(Landroid/content/Context;Lcom/roidapp/photogrid/filter/selfiecam/v;)V

    .line 3252
    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 3253
    new-instance v2, Landroid/widget/PopupWindow;

    invoke-direct {v2, v1, v6, v6, v4}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    .line 3254
    new-instance v1, Lcom/roidapp/photogrid/filter/selfiecam/s;

    invoke-direct {v1, p0, p2, v2}, Lcom/roidapp/photogrid/filter/selfiecam/s;-><init>(Lcom/roidapp/photogrid/filter/selfiecam/o;Lcom/roidapp/photogrid/filter/selfiecam/v;Landroid/widget/PopupWindow;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 3263
    invoke-virtual {v2, v4}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 3264
    invoke-virtual {v2, v4}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    .line 3265
    invoke-virtual {v2, v4}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 3266
    invoke-virtual {v2, v4}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 3267
    new-instance v1, Lcom/roidapp/photogrid/filter/selfiecam/t;

    invoke-direct {v1, p0, v2}, Lcom/roidapp/photogrid/filter/selfiecam/t;-><init>(Lcom/roidapp/photogrid/filter/selfiecam/o;Landroid/widget/PopupWindow;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 3277
    invoke-virtual {v2}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/filter/selfiecam/u;

    invoke-direct {v1, p0, v2}, Lcom/roidapp/photogrid/filter/selfiecam/u;-><init>(Lcom/roidapp/photogrid/filter/selfiecam/o;Landroid/widget/PopupWindow;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 3287
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-lt v0, v1, :cond_0

    .line 3288
    invoke-virtual {v2, v5}, Landroid/widget/PopupWindow;->setAttachedInDecor(Z)V

    .line 3290
    :cond_0
    invoke-virtual {v2, p1, v5, v5}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 48
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/filter/selfiecam/o;)Z
    .locals 1

    .prologue
    .line 48
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->l:Z

    return v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/filter/selfiecam/o;)Lcom/roidapp/photogrid/release/ParentActivity;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->g:Lcom/roidapp/photogrid/release/ParentActivity;

    return-object v0
.end method

.method private b()Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 370
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 371
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 372
    const-string v1, "WATER_MARK"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/filter/selfiecam/o;)Z
    .locals 1

    .prologue
    .line 48
    iget-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->i:Z

    return v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/filter/selfiecam/o;)Z
    .locals 1

    .prologue
    .line 48
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->l:Z

    return v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/filter/selfiecam/o;)Lcom/roidapp/photogrid/filter/selfiecam/v;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->e:Lcom/roidapp/photogrid/filter/selfiecam/v;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/filter/selfiecam/o;)Lcom/roidapp/photogrid/filter/selfiecam/v;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->d:Lcom/roidapp/photogrid/filter/selfiecam/v;

    return-object v0
.end method


# virtual methods
.method public final a(IILandroid/content/Intent;)V
    .locals 2

    .prologue
    .line 353
    const v0, 0xcc01

    if-ne p1, v0, :cond_0

    .line 354
    const v0, 0xcc02

    if-ne p2, v0, :cond_0

    .line 356
    if-eqz p3, :cond_0

    invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 357
    const-string v1, "file"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 358
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->h:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 363
    :cond_0
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 7

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 315
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    .line 350
    :cond_0
    :goto_0
    return-void

    .line 317
    :sswitch_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->cancel()V

    goto :goto_0

    .line 320
    :sswitch_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->dismiss()V

    .line 321
    iget-object v2, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->d:Lcom/roidapp/photogrid/filter/selfiecam/v;

    invoke-interface {v2}, Lcom/roidapp/photogrid/filter/selfiecam/v;->b()I

    move-result v2

    .line 322
    iget-object v3, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->c:[I

    add-int/lit8 v2, v2, 0x1

    invoke-static {v3, v1, v2}, Ljava/util/Arrays;->copyOfRange([III)[I

    move-result-object v3

    .line 323
    array-length v4, v3

    .line 324
    add-int/lit8 v2, v4, 0x1

    new-array v5, v2, [Ljava/lang/Integer;

    move v2, v1

    .line 325
    :goto_1
    if-ge v2, v4, :cond_1

    .line 326
    add-int/lit8 v6, v4, -0x1

    sub-int/2addr v6, v2

    aget v6, v3, v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v2

    .line 325
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 328
    :cond_1
    const/16 v2, 0x168

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v5, v4

    .line 329
    iget-object v2, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->e:Lcom/roidapp/photogrid/filter/selfiecam/v;

    invoke-interface {v2}, Lcom/roidapp/photogrid/filter/selfiecam/v;->b()I

    move-result v2

    if-ne v2, v0, :cond_2

    .line 330
    :goto_2
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->b:Lcom/roidapp/photogrid/filter/selfiecam/w;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->b:Lcom/roidapp/photogrid/filter/selfiecam/w;

    invoke-interface {v1, v5, v0}, Lcom/roidapp/photogrid/filter/selfiecam/w;->a([Ljava/lang/Integer;Z)V

    goto :goto_0

    :cond_2
    move v0, v1

    .line 329
    goto :goto_2

    .line 333
    :sswitch_2
    iget-object v2, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->b:Lcom/roidapp/photogrid/filter/selfiecam/w;

    if-eqz v2, :cond_0

    .line 334
    iget-object v2, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->g:Lcom/roidapp/photogrid/release/ParentActivity;

    iget-object v3, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->m:Ljava/lang/String;

    iget-object v4, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->b:Lcom/roidapp/photogrid/filter/selfiecam/w;

    invoke-interface {v4}, Lcom/roidapp/photogrid/filter/selfiecam/w;->b()I

    move-result v4

    if-nez v4, :cond_3

    :goto_3
    invoke-static {v2, v3, v0}, Lcom/roidapp/photogrid/common/e;->a(Landroid/app/Activity;Ljava/lang/String;Z)Lcom/roidapp/photogrid/common/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/e;->a()V

    goto :goto_0

    :cond_3
    move v0, v1

    goto :goto_3

    .line 2379
    :sswitch_3
    invoke-virtual {p0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 2380
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 2381
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    .line 2382
    const-string v4, "WATER_MARK"

    invoke-interface {v2, v4, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 2383
    const-string v0, "WATER_MARK"

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 2387
    :goto_4
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 338
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->f:Landroid/widget/CheckBox;

    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->b()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto/16 :goto_0

    .line 2385
    :cond_4
    const-string v1, "WATER_MARK"

    invoke-interface {v3, v1, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    goto :goto_4

    .line 341
    :sswitch_4
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v1

    const-string v2, "mounted"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 342
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->g:Lcom/roidapp/photogrid/release/ParentActivity;

    const-class v3, Lcom/roidapp/photogrid/release/PathSelector;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 343
    const-string v2, "isFromDialogFragment"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 344
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->g:Lcom/roidapp/photogrid/release/ParentActivity;

    const v2, 0xcc01

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/ParentActivity;->startActivityForResult(Landroid/content/Intent;I)V

    goto/16 :goto_0

    .line 346
    :cond_5
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->g:Lcom/roidapp/photogrid/release/ParentActivity;

    const v2, 0x7f07028d

    invoke-static {v1, v2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_0

    .line 315
    :sswitch_data_0
    .sparse-switch
        0x7f0d04a0 -> :sswitch_0
        0x7f0d04ac -> :sswitch_3
        0x7f0d04b0 -> :sswitch_4
        0x7f0d04b4 -> :sswitch_2
        0x7f0d04b8 -> :sswitch_1
    .end sparse-switch
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 12

    .prologue
    const/16 v6, 0x8

    const/4 v11, 0x2

    const/high16 v10, 0x4e800000

    const/4 v3, 0x0

    const/4 v2, 0x1

    .line 90
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 91
    const v0, 0x7f030120

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->setContentView(I)V

    .line 1295
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-nez v0, :cond_2

    .line 1296
    const-string v0, "Grid"

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->m:Ljava/lang/String;

    .line 93
    :cond_0
    :goto_0
    const v0, 0x7f0d04b0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 94
    const v1, 0x7f0d04b2

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/filter/selfiecam/o;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->h:Landroid/widget/TextView;

    .line 95
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->h:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->g:Lcom/roidapp/photogrid/release/ParentActivity;

    invoke-static {v4}, Lcom/roidapp/photogrid/release/ap;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 97
    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    const v1, 0x7f0d04ae

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/filter/selfiecam/o;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    iput-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->f:Landroid/widget/CheckBox;

    .line 99
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->f:Landroid/widget/CheckBox;

    invoke-virtual {v1, v3}, Landroid/widget/CheckBox;->setClickable(Z)V

    .line 100
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->f:Landroid/widget/CheckBox;

    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->b()Z

    move-result v4

    invoke-virtual {v1, v4}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 101
    const v1, 0x7f0d04a0

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/filter/selfiecam/o;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->a:Landroid/view/View;

    .line 102
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->a:Landroid/view/View;

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 103
    const v1, 0x7f0d03da

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/filter/selfiecam/o;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 104
    iget-boolean v4, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->i:Z

    if-eqz v4, :cond_7

    .line 105
    const v4, 0x7f070150

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(I)V

    .line 109
    :goto_1
    const v1, 0x7f0d04ac

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/filter/selfiecam/o;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 110
    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 111
    const v1, 0x7f0d020f

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/filter/selfiecam/o;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 112
    iget-object v4, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->b:Lcom/roidapp/photogrid/filter/selfiecam/w;

    invoke-interface {v4}, Lcom/roidapp/photogrid/filter/selfiecam/w;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 113
    const v1, 0x7f0d04b8

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/filter/selfiecam/o;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 116
    const v1, 0x7f0d04b4

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/filter/selfiecam/o;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    .line 122
    iget-object v4, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->g:Lcom/roidapp/photogrid/release/ParentActivity;

    const-string v5, "com.cleanmaster.mguard"

    invoke-static {v4, v5}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    iget-object v4, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->g:Lcom/roidapp/photogrid/release/ParentActivity;

    invoke-static {v4}, Lcom/roidapp/photogrid/a/m;->a(Landroid/content/Context;)I

    move-result v4

    if-ne v4, v2, :cond_8

    .line 124
    :cond_1
    invoke-virtual {v1, v6}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 125
    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->removeAllViews()V

    .line 126
    const v1, 0x7f0d04b3

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/filter/selfiecam/o;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 127
    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 128
    const/4 v4, -0x1

    iput v4, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 129
    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 148
    :goto_2
    const v0, 0x7f0d04b9

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 149
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->b:Lcom/roidapp/photogrid/filter/selfiecam/w;

    invoke-interface {v1}, Lcom/roidapp/photogrid/filter/selfiecam/w;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 2209
    const v0, 0x7f0d04aa

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 2210
    new-instance v1, Lcom/roidapp/photogrid/filter/selfiecam/x;

    invoke-direct {v1, v0, v3}, Lcom/roidapp/photogrid/filter/selfiecam/x;-><init>(Landroid/widget/TextView;B)V

    iput-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->e:Lcom/roidapp/photogrid/filter/selfiecam/v;

    .line 2211
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->g:Lcom/roidapp/photogrid/release/ParentActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hw;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_c

    move v0, v2

    .line 2212
    :goto_3
    iget-object v1, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->e:Lcom/roidapp/photogrid/filter/selfiecam/v;

    invoke-interface {v1, v0}, Lcom/roidapp/photogrid/filter/selfiecam/v;->b(I)V

    .line 2213
    const v0, 0x7f0d04a9

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 2214
    new-instance v1, Lcom/roidapp/photogrid/filter/selfiecam/q;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/filter/selfiecam/q;-><init>(Lcom/roidapp/photogrid/filter/selfiecam/o;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 151
    invoke-direct {p0}, Lcom/roidapp/photogrid/filter/selfiecam/o;->a()V

    .line 152
    return-void

    .line 1297
    :cond_2
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_3

    .line 1298
    const-string v0, "Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->m:Ljava/lang/String;

    goto/16 :goto_0

    .line 1299
    :cond_3
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v2, :cond_4

    .line 1300
    const-string v0, "Free"

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->m:Ljava/lang/String;

    goto/16 :goto_0

    .line 1301
    :cond_4
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v0, v11, :cond_5

    .line 1303
    const-string v0, "Wide"

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->m:Ljava/lang/String;

    goto/16 :goto_0

    .line 1304
    :cond_5
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_6

    .line 1306
    const-string v0, "High"

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->m:Ljava/lang/String;

    goto/16 :goto_0

    .line 1307
    :cond_6
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    .line 1309
    const-string v0, "Video"

    iput-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->m:Ljava/lang/String;

    goto/16 :goto_0

    .line 107
    :cond_7
    const v4, 0x7f07027d

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(I)V

    goto/16 :goto_1

    .line 2161
    :cond_8
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v4, "mounted"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 2162
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->g:Lcom/roidapp/photogrid/release/ParentActivity;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 2163
    const-string v4, "SAVEPATH"

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 2164
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2165
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_9

    .line 2166
    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    move-result v4

    if-eqz v4, :cond_b

    .line 2170
    :cond_9
    const-string v4, "get_memory_error"

    invoke-interface {v0, v4, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-eq v0, v2, :cond_b

    move v0, v2

    .line 132
    :goto_4
    if-eqz v0, :cond_a

    .line 2184
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->g:Lcom/roidapp/photogrid/release/ParentActivity;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 2185
    const-string v4, "get_memory_error"

    invoke-interface {v0, v4, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v4

    if-eq v4, v2, :cond_d

    .line 2187
    const-string v4, "SAVEPATH"

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 2188
    if-eqz v4, :cond_d

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    .line 2189
    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2190
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_d

    .line 2192
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v5

    const-string v6, "get_memory_error"

    invoke-interface {v5, v6, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v5

    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 2193
    new-instance v5, Landroid/os/StatFs;

    invoke-direct {v5, v4}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    .line 2194
    invoke-virtual {v5}, Landroid/os/StatFs;->getBlockSize()I

    move-result v4

    int-to-long v6, v4

    .line 2195
    invoke-virtual {v5}, Landroid/os/StatFs;->getAvailableBlocks()I

    move-result v4

    int-to-long v8, v4

    .line 2196
    invoke-virtual {v5}, Landroid/os/StatFs;->getBlockCount()I

    move-result v4

    int-to-long v4, v4

    .line 2197
    mul-long/2addr v8, v6

    long-to-float v8, v8

    iput v8, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->j:F

    .line 2198
    mul-long/2addr v4, v6

    long-to-float v4, v4

    iput v4, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->k:F

    .line 2201
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v4, "get_memory_error"

    invoke-interface {v0, v4, v11}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move v0, v2

    .line 133
    :goto_5
    if-eqz v0, :cond_a

    .line 134
    new-instance v4, Lcom/roidapp/photogrid/release/PhotoSaveDialogCircle;

    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->g:Lcom/roidapp/photogrid/release/ParentActivity;

    iget v5, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->j:F

    iget v6, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->k:F

    invoke-direct {v4, v0, v5, v6}, Lcom/roidapp/photogrid/release/PhotoSaveDialogCircle;-><init>(Landroid/content/Context;FF)V

    .line 135
    iget-object v0, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->g:Lcom/roidapp/photogrid/release/ParentActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ParentActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v5, 0x41a00000    # 20.0f

    mul-float/2addr v0, v5

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/roidapp/photogrid/release/PhotoSaveDialogCircle;->a(I)V

    .line 136
    const v0, 0x7f0d04b6

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 137
    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 139
    new-instance v4, Ljava/text/DecimalFormat;

    const-string v0, "0.0"

    invoke-direct {v4, v0}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    .line 140
    const v0, 0x7f0d04b7

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 141
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget v6, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->j:F

    div-float/2addr v6, v10

    float-to-double v6, v6

    invoke-virtual {v4, v6, v7}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "/"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget v6, p0, Lcom/roidapp/photogrid/filter/selfiecam/o;->k:F

    div-float/2addr v6, v10

    float-to-double v6, v6

    invoke-virtual {v4, v6, v7}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "GB"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    :cond_a
    invoke-virtual {v1, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_2

    :cond_b
    move v0, v3

    .line 2175
    goto/16 :goto_4

    :cond_c
    move v0, v3

    .line 2211
    goto/16 :goto_3

    :cond_d
    move v0, v3

    goto :goto_5
.end method
