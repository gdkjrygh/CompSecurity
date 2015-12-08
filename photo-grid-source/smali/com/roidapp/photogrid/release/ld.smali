.class public final Lcom/roidapp/photogrid/release/ld;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Landroid/widget/PopupWindow;

.field private b:Lcom/roidapp/photogrid/release/PhotoGridActivity;

.field private c:Landroid/widget/RelativeLayout;

.field private d:Lcom/roidapp/photogrid/release/lj;

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private g:Z

.field private h:Z


# direct methods
.method public constructor <init>(Lcom/roidapp/photogrid/release/PhotoGridActivity;Landroid/widget/RelativeLayout;Lcom/roidapp/photogrid/release/lj;Z)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ld;->b:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 42
    iput-object p2, p0, Lcom/roidapp/photogrid/release/ld;->c:Landroid/widget/RelativeLayout;

    .line 43
    iput-object p3, p0, Lcom/roidapp/photogrid/release/ld;->d:Lcom/roidapp/photogrid/release/lj;

    .line 44
    iput-boolean p4, p0, Lcom/roidapp/photogrid/release/ld;->h:Z

    .line 45
    invoke-static {}, Lcom/roidapp/photogrid/release/ld;->a()I

    move-result v0

    if-ne v0, v1, :cond_0

    .line 46
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ld;->g:Z

    .line 1056
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ld;->e:Ljava/util/ArrayList;

    .line 1057
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ld;->f:Ljava/util/ArrayList;

    .line 1058
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ld;->b:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ld;->b:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v1}, Lcom/roidapp/photogrid/common/an;->a(Landroid/content/Context;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/cloud/w;->a(Landroid/content/Context;I)Lcom/roidapp/photogrid/cloud/w;

    move-result-object v0

    .line 1059
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ld;->g:Z

    if-eqz v1, :cond_2

    .line 1060
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ld;->e:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ld;->b:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v3, 0x7f0701ae

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1061
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ld;->f:Ljava/util/ArrayList;

    const v2, 0x7f0203f6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1068
    :goto_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ld;->e:Ljava/util/ArrayList;

    const-string v2, "main_freemode"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ld;->b:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v4, 0x7f0701a8

    invoke-virtual {v3, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/photogrid/cloud/w;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1069
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ld;->f:Ljava/util/ArrayList;

    const v2, 0x7f020399

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1071
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ld;->h:Z

    if-eqz v1, :cond_1

    .line 1072
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ld;->e:Ljava/util/ArrayList;

    const-string v2, "main_video"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ld;->b:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v4, 0x7f0701b1

    invoke-virtual {v3, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/photogrid/cloud/w;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1073
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ld;->f:Ljava/util/ArrayList;

    const v2, 0x7f020419

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1076
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ld;->e:Ljava/util/ArrayList;

    const-string v2, "main_templatemode"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ld;->b:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v4, 0x7f0701af

    invoke-virtual {v3, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/photogrid/cloud/w;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1077
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ld;->f:Ljava/util/ArrayList;

    const v2, 0x7f020404

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1079
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ld;->e:Ljava/util/ArrayList;

    const-string v2, "main_high_wide"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ld;->b:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v4, 0x7f0701aa

    invoke-virtual {v3, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/photogrid/cloud/w;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1080
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ld;->f:Ljava/util/ArrayList;

    const v1, 0x7f0203a5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    return-void

    .line 1065
    :cond_2
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ld;->e:Ljava/util/ArrayList;

    const-string v2, "main_gridmode"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ld;->b:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const v4, 0x7f0701a9

    invoke-virtual {v3, v4}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/photogrid/cloud/w;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1066
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ld;->f:Ljava/util/ArrayList;

    const v2, 0x7f0203a2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0
.end method

.method public static a()I
    .locals 1

    .prologue
    .line 84
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 85
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    array-length v0, v0

    .line 87
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ld;)Lcom/roidapp/photogrid/release/PhotoGridActivity;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ld;->b:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ld;)Z
    .locals 1

    .prologue
    .line 30
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ld;->g:Z

    return v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/ld;)Z
    .locals 1

    .prologue
    .line 30
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ld;->h:Z

    return v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/ld;)Lcom/roidapp/photogrid/release/lj;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ld;->d:Lcom/roidapp/photogrid/release/lj;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/ld;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ld;->e:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/ld;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ld;->f:Ljava/util/ArrayList;

    return-object v0
.end method


# virtual methods
.method public final b()V
    .locals 6

    .prologue
    const/4 v5, -0x2

    const/4 v4, 0x1

    .line 380
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ld;->a:Landroid/widget/PopupWindow;

    if-nez v0, :cond_0

    .line 1091
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ld;->b:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0300ff

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 1092
    const v0, 0x7f0d03f6

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    .line 1093
    new-instance v2, Lcom/roidapp/photogrid/release/li;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ld;->b:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v2, p0, v3}, Lcom/roidapp/photogrid/release/li;-><init>(Lcom/roidapp/photogrid/release/ld;Landroid/content/Context;)V

    .line 1094
    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1095
    new-instance v2, Lcom/roidapp/photogrid/release/le;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/le;-><init>(Lcom/roidapp/photogrid/release/ld;)V

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 1281
    new-instance v2, Lcom/roidapp/photogrid/release/lf;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/lf;-><init>(Lcom/roidapp/photogrid/release/ld;)V

    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 1293
    invoke-virtual {v1, v4}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 1294
    new-instance v0, Lcom/roidapp/photogrid/release/lg;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/lg;-><init>(Lcom/roidapp/photogrid/release/ld;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 1309
    new-instance v0, Landroid/widget/PopupWindow;

    invoke-direct {v0, v1, v5, v5, v4}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ld;->a:Landroid/widget/PopupWindow;

    .line 1310
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ld;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 1311
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ld;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setTouchable(Z)V

    .line 1312
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ld;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 1313
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ld;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 1314
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ld;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/release/lh;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/lh;-><init>(Lcom/roidapp/photogrid/release/ld;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 1322
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ld;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->update()V

    .line 383
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ld;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 384
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ld;->a:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 392
    :goto_0
    return-void

    .line 387
    :cond_1
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ld;->a:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ld;->c:Landroid/widget/RelativeLayout;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 389
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->printStackTrace()V

    goto :goto_0
.end method
