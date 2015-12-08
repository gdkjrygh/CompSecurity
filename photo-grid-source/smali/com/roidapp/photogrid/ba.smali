.class public final Lcom/roidapp/photogrid/ba;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Landroid/widget/PopupWindow;

.field private b:Landroid/content/Context;

.field private c:Landroid/view/View;

.field private d:Lcom/roidapp/photogrid/bh;

.field private e:Z

.field private f:Z

.field private g:[Ljava/lang/String;

.field private h:Z

.field private i:I

.field private j:I

.field private k:I

.field private l:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;ZLandroid/view/View;Lcom/roidapp/photogrid/bh;ZZII)V
    .locals 4

    .prologue
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/ba;->f:Z

    .line 34
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/ba;->l:Z

    .line 37
    iput-object p1, p0, Lcom/roidapp/photogrid/ba;->b:Landroid/content/Context;

    .line 38
    iput-object p3, p0, Lcom/roidapp/photogrid/ba;->c:Landroid/view/View;

    .line 39
    iput-object p4, p0, Lcom/roidapp/photogrid/ba;->d:Lcom/roidapp/photogrid/bh;

    .line 40
    iput-boolean p5, p0, Lcom/roidapp/photogrid/ba;->e:Z

    .line 41
    iput-boolean p2, p0, Lcom/roidapp/photogrid/ba;->h:Z

    .line 43
    iput p7, p0, Lcom/roidapp/photogrid/ba;->j:I

    .line 44
    iput p8, p0, Lcom/roidapp/photogrid/ba;->k:I

    .line 46
    if-eqz p6, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-le v0, v1, :cond_0

    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->B:Z

    if-eqz v0, :cond_1

    .line 47
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/ba;->l:Z

    .line 1066
    :cond_1
    const/16 v0, 0xa

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/ba;->g:[Ljava/lang/String;

    .line 1067
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->g:[Ljava/lang/String;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/roidapp/photogrid/ba;->b:Landroid/content/Context;

    const v3, 0x7f070244

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 1068
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->g:[Ljava/lang/String;

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/roidapp/photogrid/ba;->b:Landroid/content/Context;

    const v3, 0x7f070246

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 1069
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->g:[Ljava/lang/String;

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/roidapp/photogrid/ba;->b:Landroid/content/Context;

    const v3, 0x7f07023f

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 1070
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->g:[Ljava/lang/String;

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/roidapp/photogrid/ba;->b:Landroid/content/Context;

    const v3, 0x7f070243

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 1071
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->g:[Ljava/lang/String;

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/roidapp/photogrid/ba;->b:Landroid/content/Context;

    const v3, 0x7f070245

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 1072
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->g:[Ljava/lang/String;

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/roidapp/photogrid/ba;->b:Landroid/content/Context;

    const v3, 0x7f07023b

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 1073
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->g:[Ljava/lang/String;

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/roidapp/photogrid/ba;->b:Landroid/content/Context;

    const v3, 0x7f07023c

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 1075
    iget-boolean v0, p0, Lcom/roidapp/photogrid/ba;->l:Z

    if-eqz v0, :cond_5

    .line 1076
    iget v0, p0, Lcom/roidapp/photogrid/ba;->j:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    iget v0, p0, Lcom/roidapp/photogrid/ba;->k:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    .line 1077
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->g:[Ljava/lang/String;

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/roidapp/photogrid/ba;->b:Landroid/content/Context;

    const v3, 0x7f070242

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 1078
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->g:[Ljava/lang/String;

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/roidapp/photogrid/ba;->b:Landroid/content/Context;

    const v3, 0x7f07023e

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 1079
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/photogrid/ba;->i:I

    .line 1086
    :cond_2
    :goto_0
    return-void

    .line 1080
    :cond_3
    iget v0, p0, Lcom/roidapp/photogrid/ba;->j:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    iget v0, p0, Lcom/roidapp/photogrid/ba;->k:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    .line 1082
    :cond_4
    iget v0, p0, Lcom/roidapp/photogrid/ba;->j:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    iget v0, p0, Lcom/roidapp/photogrid/ba;->k:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    .line 1083
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->g:[Ljava/lang/String;

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/roidapp/photogrid/ba;->b:Landroid/content/Context;

    const v3, 0x7f070240

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 1084
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->g:[Ljava/lang/String;

    const/16 v1, 0x8

    iget-object v2, p0, Lcom/roidapp/photogrid/ba;->b:Landroid/content/Context;

    const v3, 0x7f070241

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 1085
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->g:[Ljava/lang/String;

    const/16 v1, 0x9

    iget-object v2, p0, Lcom/roidapp/photogrid/ba;->b:Landroid/content/Context;

    const v3, 0x7f07023e

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    .line 1086
    const/4 v0, 0x1

    iput v0, p0, Lcom/roidapp/photogrid/ba;->i:I

    goto :goto_0

    .line 1089
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->g:[Ljava/lang/String;

    const/4 v1, 0x7

    iget-object v2, p0, Lcom/roidapp/photogrid/ba;->b:Landroid/content/Context;

    const v3, 0x7f07023e

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/ba;)Z
    .locals 1

    .prologue
    .line 21
    iget-boolean v0, p0, Lcom/roidapp/photogrid/ba;->l:Z

    return v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/ba;)Lcom/roidapp/photogrid/bh;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->d:Lcom/roidapp/photogrid/bh;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/ba;)Z
    .locals 1

    .prologue
    .line 21
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/ba;->h:Z

    return v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/ba;)I
    .locals 1

    .prologue
    .line 21
    iget v0, p0, Lcom/roidapp/photogrid/ba;->j:I

    return v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/ba;)I
    .locals 1

    .prologue
    .line 21
    iget v0, p0, Lcom/roidapp/photogrid/ba;->k:I

    return v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/ba;)I
    .locals 1

    .prologue
    .line 21
    iget v0, p0, Lcom/roidapp/photogrid/ba;->i:I

    return v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/ba;)Z
    .locals 1

    .prologue
    .line 21
    iget-boolean v0, p0, Lcom/roidapp/photogrid/ba;->f:Z

    return v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/ba;)[Ljava/lang/String;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->g:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic i(Lcom/roidapp/photogrid/ba;)Z
    .locals 1

    .prologue
    .line 21
    iget-boolean v0, p0, Lcom/roidapp/photogrid/ba;->h:Z

    return v0
.end method


# virtual methods
.method public final a()V
    .locals 7

    .prologue
    const/4 v6, 0x0

    const/4 v5, -0x2

    const/4 v4, 0x1

    .line 369
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->a:Landroid/widget/PopupWindow;

    if-nez v0, :cond_0

    .line 1096
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0300fb

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 1097
    const v0, 0x7f0d03f6

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    .line 1098
    new-instance v2, Lcom/roidapp/photogrid/bg;

    iget-object v3, p0, Lcom/roidapp/photogrid/ba;->b:Landroid/content/Context;

    invoke-direct {v2, p0, v3}, Lcom/roidapp/photogrid/bg;-><init>(Lcom/roidapp/photogrid/ba;Landroid/content/Context;)V

    .line 1099
    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1100
    new-instance v2, Lcom/roidapp/photogrid/bb;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/bb;-><init>(Lcom/roidapp/photogrid/ba;)V

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 1184
    new-instance v2, Lcom/roidapp/photogrid/bc;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/bc;-><init>(Lcom/roidapp/photogrid/ba;)V

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 1196
    invoke-virtual {v1, v4}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 1197
    new-instance v0, Lcom/roidapp/photogrid/bd;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/bd;-><init>(Lcom/roidapp/photogrid/ba;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 1212
    new-instance v0, Landroid/widget/PopupWindow;

    invoke-direct {v0, v1, v5, v5, v4}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    iput-object v0, p0, Lcom/roidapp/photogrid/ba;->a:Landroid/widget/PopupWindow;

    .line 1214
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->a:Landroid/widget/PopupWindow;

    invoke-static {v0}, Lcom/roidapp/baselib/c/n;->a(Landroid/widget/PopupWindow;)V

    .line 1216
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 1217
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    .line 1218
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 1219
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 1220
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/be;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/be;-><init>(Lcom/roidapp/photogrid/ba;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1228
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->update()V

    .line 372
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 373
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 378
    :goto_0
    return-void

    .line 375
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/ba;->a:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/roidapp/photogrid/ba;->c:Landroid/view/View;

    invoke-virtual {v0, v1, v6, v6}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    goto :goto_0
.end method
