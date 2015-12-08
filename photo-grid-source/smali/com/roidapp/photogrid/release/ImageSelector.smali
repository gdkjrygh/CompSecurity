.class public Lcom/roidapp/photogrid/release/ImageSelector;
.super Lcom/roidapp/photogrid/release/ParentActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private A:Ljava/lang/String;

.field private B:Z

.field private C:Z

.field private D:Z

.field private E:Ljava/lang/String;

.field private F:Landroid/net/Uri;

.field private G:Landroid/os/Bundle;

.field private H:Lcom/roidapp/photogrid/release/kt;

.field private I:Landroid/widget/TextView;

.field private J:Z

.field private K:Lcom/roidapp/baselib/view/FixedDrawerLayout;

.field private L:Landroid/widget/LinearLayout;

.field private M:Landroid/widget/ListView;

.field private N:I

.field private O:Lcom/roidapp/photogrid/release/la;

.field private P:Landroid/widget/FrameLayout;

.field private Q:Z

.field private R:Z

.field private S:Z

.field private T:Lcom/roidapp/photogrid/release/kp;

.field private U:Z

.field private V:Ljava/lang/String;

.field private W:Ljava/lang/String;

.field private final X:Ljava/util/concurrent/ExecutorService;

.field private Y:I

.field private Z:Landroid/os/Handler;

.field public a:I

.field private aa:Landroid/view/View;

.field private ab:Lcom/roidapp/photogrid/common/al;

.field private ac:Landroid/view/View$OnTouchListener;

.field private ad:Ljava/lang/String;

.field public b:[Ljava/lang/String;

.field public c:[I

.field private d:Landroid/widget/GridView;

.field private e:Lcom/roidapp/photogrid/release/ia;

.field private f:Landroid/widget/LinearLayout;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/HorizontalScrollView;

.field private j:Landroid/widget/LinearLayout;

.field private k:Landroid/widget/RelativeLayout;

.field private l:Landroid/widget/ProgressBar;

.field private m:Landroid/widget/RelativeLayout;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/ImageButton;

.field private p:Landroid/widget/TextView;

.field private q:Landroid/widget/TextView;

.field private r:Landroid/widget/RelativeLayout;

.field private s:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private y:I

.field private z:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/ig;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 88
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ParentActivity;-><init>()V

    .line 142
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->B:Z

    .line 158
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->J:Z

    .line 165
    const/4 v0, 0x3

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->N:I

    .line 170
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Q:Z

    .line 171
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->R:Z

    .line 173
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->S:Z

    .line 177
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->U:Z

    .line 178
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->V:Ljava/lang/String;

    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->W:Ljava/lang/String;

    .line 183
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->X:Ljava/util/concurrent/ExecutorService;

    .line 193
    sget v0, Lcom/roidapp/photogrid/release/ke;->a:I

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Y:I

    .line 195
    new-instance v0, Lcom/roidapp/photogrid/release/jm;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/jm;-><init>(Lcom/roidapp/photogrid/release/ImageSelector;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Z:Landroid/os/Handler;

    .line 1975
    new-instance v0, Lcom/roidapp/photogrid/release/jr;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/jr;-><init>(Lcom/roidapp/photogrid/release/ImageSelector;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->ac:Landroid/view/View$OnTouchListener;

    return-void
.end method

.method static synthetic A(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->I:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic B(Lcom/roidapp/photogrid/release/ImageSelector;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->ad:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic C(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->p:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic D(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/LinearLayout;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->f:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic E(Lcom/roidapp/photogrid/release/ImageSelector;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->s:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic F(Lcom/roidapp/photogrid/release/ImageSelector;)V
    .locals 0

    .prologue
    .line 88
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->g()V

    return-void
.end method

.method static synthetic G(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/HorizontalScrollView;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->i:Landroid/widget/HorizontalScrollView;

    return-object v0
.end method

.method static synthetic H(Lcom/roidapp/photogrid/release/ImageSelector;)V
    .locals 0

    .prologue
    .line 88
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->i()V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->k:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ImageSelector;Ljava/lang/String;)Ljava/util/List;
    .locals 1

    .prologue
    .line 88
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/ImageSelector;->e(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private declared-synchronized a(ILandroid/graphics/Bitmap;Lcom/roidapp/photogrid/release/ig;)V
    .locals 2

    .prologue
    .line 1484
    monitor-enter p0

    if-eqz p2, :cond_0

    :try_start_0
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1486
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p3, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1487
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->s:Ljava/util/HashMap;

    invoke-virtual {v1, v0, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1488
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 1489
    const/16 v1, 0xf

    iput v1, v0, Landroid/os/Message;->what:I

    .line 1490
    iput p1, v0, Landroid/os/Message;->arg1:I

    .line 1491
    iput-object p3, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1492
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Z:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1496
    :goto_0
    monitor-exit p0

    return-void

    .line 1494
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    invoke-interface {v0, p3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 1484
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method private a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 2109
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->h()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2128
    :cond_0
    :goto_0
    return-void

    .line 2113
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 2114
    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v4/app/FragmentTransaction;->replace(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;

    .line 2117
    :try_start_0
    iput-object p3, p0, Lcom/roidapp/photogrid/release/ImageSelector;->ad:Ljava/lang/String;

    .line 2118
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 2119
    :catch_0
    move-exception v0

    .line 2120
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Q:Z

    .line 2122
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->ad:Ljava/lang/String;

    .line 2123
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method

.method private declared-synchronized a(ILcom/roidapp/photogrid/release/ig;)V
    .locals 7

    .prologue
    .line 1499
    monitor-enter p0

    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "#"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p2, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 1501
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->s:Ljava/util/HashMap;

    invoke-virtual {v1, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    .line 1503
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    invoke-interface {v2, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 1504
    :cond_0
    const/4 v2, 0x0

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->C:Z

    .line 1505
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->s:Ljava/util/HashMap;

    invoke-virtual {v2, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1506
    if-eqz v1, :cond_1

    .line 1507
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1605
    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    .line 1511
    :cond_2
    if-eqz v1, :cond_6

    :try_start_1
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_6

    .line 1512
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    const v3, 0x7f030121

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 1513
    const v2, 0x7f0d04bb

    invoke-virtual {v5, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageButton;

    .line 1514
    const v3, 0x7f0d04ba

    invoke-virtual {v5, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    .line 1515
    sget-object v6, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v3, v6}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 1516
    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 1517
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 1518
    new-instance v1, Lcom/roidapp/photogrid/release/kc;

    invoke-direct {v1, p0, p2}, Lcom/roidapp/photogrid/release/kc;-><init>(Lcom/roidapp/photogrid/release/ImageSelector;Lcom/roidapp/photogrid/release/ig;)V

    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1547
    invoke-virtual {v2, v4}, Landroid/widget/ImageButton;->setTag(Ljava/lang/Object;)V

    .line 1548
    new-instance v1, Lcom/roidapp/photogrid/release/kd;

    invoke-direct {v1, p0, p2}, Lcom/roidapp/photogrid/release/kd;-><init>(Lcom/roidapp/photogrid/release/ImageSelector;Lcom/roidapp/photogrid/release/ig;)V

    invoke-virtual {v2, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1568
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->C:Z

    if-eqz v1, :cond_5

    iget v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_5

    .line 1570
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x2

    if-lt v1, v2, :cond_4

    .line 1571
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->s:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    move-object v2, v0

    .line 1572
    const-string v1, "#"

    invoke-virtual {v2, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 1573
    iget-object v1, p2, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 1574
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v1

    .line 1575
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    if-eqz v6, :cond_3

    .line 1576
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 1577
    iget-object v6, p0, Lcom/roidapp/photogrid/release/ImageSelector;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v6, v1}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    .line 1578
    const/4 v1, 0x0

    invoke-direct {p0, v4, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Ljava/lang/String;Z)V

    .line 1579
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->s:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    .line 1580
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_3

    .line 1581
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 1499
    :catchall_0
    move-exception v1

    monitor-exit p0

    throw v1

    .line 1589
    :cond_4
    :try_start_2
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 1590
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1591
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->g()V

    .line 1592
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 1593
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->k()V

    goto/16 :goto_0

    .line 1595
    :cond_5
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->g()V

    .line 1596
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v5}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 6791
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->i:Landroid/widget/HorizontalScrollView;

    new-instance v2, Lcom/roidapp/photogrid/release/jo;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/jo;-><init>(Lcom/roidapp/photogrid/release/ImageSelector;)V

    invoke-virtual {v1, v2}, Landroid/widget/HorizontalScrollView;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_0

    .line 1601
    :cond_6
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->C:Z

    .line 1602
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ImageSelector;I)V
    .locals 0

    .prologue
    .line 88
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/ImageSelector;->b(I)V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ImageSelector;ILandroid/graphics/Bitmap;Lcom/roidapp/photogrid/release/ig;)V
    .locals 0

    .prologue
    .line 88
    invoke-direct {p0, p1, p2, p3}, Lcom/roidapp/photogrid/release/ImageSelector;->a(ILandroid/graphics/Bitmap;Lcom/roidapp/photogrid/release/ig;)V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ImageSelector;ILcom/roidapp/photogrid/release/ig;)V
    .locals 0

    .prologue
    .line 88
    invoke-direct {p0, p1, p2}, Lcom/roidapp/photogrid/release/ImageSelector;->a(ILcom/roidapp/photogrid/release/ig;)V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ImageSelector;Landroid/view/View;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 10277
    if-nez p1, :cond_1

    .line 10278
    const-string v0, "ImgFolderListNew/jumpCloudNull"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 10310
    :cond_0
    :goto_0
    return-void

    .line 10282
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 10283
    if-eqz v0, :cond_0

    .line 10286
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ImageSelector/jumpCloud/"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 10287
    const-string v1, "cloudfolder_download"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 10288
    invoke-static {}, Lcom/roidapp/baselib/d/a;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    .line 10289
    invoke-virtual {p0, v4}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Z)Z

    .line 10290
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->o:Landroid/widget/ImageButton;

    invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto :goto_0

    .line 10291
    :cond_2
    const-string v1, "Flickr"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 10292
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    if-eqz v0, :cond_3

    .line 10293
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    new-array v2, v3, [Lcom/roidapp/photogrid/release/ig;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 10403
    :cond_3
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Q:Z

    if-nez v0, :cond_0

    .line 10406
    iput-boolean v4, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Q:Z

    .line 10407
    invoke-direct {p0, v3}, Lcom/roidapp/photogrid/release/ImageSelector;->d(Z)V

    .line 10408
    const-string v0, "ImageSelector"

    const-string v1, "Cloud/Flickr"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 10410
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->w:Z

    if-nez v0, :cond_4

    .line 10411
    const/4 v0, 0x3

    invoke-static {p0, v0}, Lcom/roidapp/cloudlib/common/a;->b(Landroid/content/Context;I)V

    .line 10413
    :cond_4
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 10414
    const-class v1, Lcom/roidapp/cloudlib/flickr/FlickrListCloud;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 10415
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->startActivity(Landroid/content/Intent;)V

    .line 10417
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->finish()V

    goto :goto_0

    .line 10296
    :cond_5
    const-string v1, "FaceBook"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 10297
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    if-eqz v0, :cond_6

    .line 10298
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    new-array v2, v3, [Lcom/roidapp/photogrid/release/ig;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 11385
    :cond_6
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Q:Z

    if-nez v0, :cond_0

    .line 11388
    iput-boolean v4, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Q:Z

    .line 11389
    invoke-direct {p0, v3}, Lcom/roidapp/photogrid/release/ImageSelector;->d(Z)V

    .line 11390
    const-string v0, "ImageSelector"

    const-string v1, "Cloud/Facebook"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 11392
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->w:Z

    if-nez v0, :cond_7

    .line 11393
    invoke-static {p0, v4}, Lcom/roidapp/cloudlib/common/a;->b(Landroid/content/Context;I)V

    .line 11395
    :cond_7
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 11396
    const-class v1, Lcom/roidapp/cloudlib/facebook/FbAlbumListActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 11397
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->startActivity(Landroid/content/Intent;)V

    .line 11399
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->finish()V

    goto/16 :goto_0

    .line 10301
    :cond_8
    const-string v1, "DropBox"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 10302
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    if-eqz v0, :cond_9

    .line 10303
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    new-array v2, v3, [Lcom/roidapp/photogrid/release/ig;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 12364
    :cond_9
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Q:Z

    if-nez v0, :cond_0

    .line 12367
    iput-boolean v4, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Q:Z

    .line 12368
    invoke-direct {p0, v3}, Lcom/roidapp/photogrid/release/ImageSelector;->d(Z)V

    .line 12369
    const-string v0, "ImageSelector"

    const-string v1, "Cloud/Dropbox"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 12371
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->w:Z

    if-nez v0, :cond_a

    .line 12372
    const/4 v0, 0x5

    invoke-static {p0, v0}, Lcom/roidapp/cloudlib/common/a;->b(Landroid/content/Context;I)V

    .line 12374
    :cond_a
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 12375
    const-class v1, Lcom/roidapp/photogrid/cloud/DropBoxSelectorActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 12376
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->u:Landroid/widget/LinearLayout;

    if-eqz v1, :cond_b

    .line 12377
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 12379
    :cond_b
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->startActivity(Landroid/content/Intent;)V

    .line 12381
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->finish()V

    goto/16 :goto_0

    .line 10306
    :cond_c
    const-string v1, "Google"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_10

    .line 10307
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    if-eqz v0, :cond_d

    .line 10308
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    new-array v2, v3, [Lcom/roidapp/photogrid/release/ig;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 13343
    :cond_d
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Q:Z

    if-nez v0, :cond_0

    .line 13346
    iput-boolean v4, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Q:Z

    .line 13347
    invoke-direct {p0, v3}, Lcom/roidapp/photogrid/release/ImageSelector;->d(Z)V

    .line 13348
    const-string v0, "ImageSelector"

    const-string v1, "Cloud/Google"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 13350
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->w:Z

    if-nez v0, :cond_e

    .line 13351
    const/4 v0, 0x4

    invoke-static {p0, v0}, Lcom/roidapp/cloudlib/common/a;->b(Landroid/content/Context;I)V

    .line 13353
    :cond_e
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 13354
    const-class v1, Lcom/roidapp/photogrid/cloud/GoogleSearchSelectorActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 13355
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->u:Landroid/widget/LinearLayout;

    if-eqz v1, :cond_f

    .line 13356
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 13358
    :cond_f
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->startActivity(Landroid/content/Intent;)V

    .line 13360
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->finish()V

    goto/16 :goto_0

    .line 10311
    :cond_10
    const-string v1, "Instagram"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10312
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    if-eqz v0, :cond_11

    .line 10313
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    new-array v2, v3, [Lcom/roidapp/photogrid/release/ig;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 14322
    :cond_11
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Q:Z

    if-nez v0, :cond_0

    .line 14325
    iput-boolean v4, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Q:Z

    .line 14326
    invoke-direct {p0, v3}, Lcom/roidapp/photogrid/release/ImageSelector;->d(Z)V

    .line 14327
    const-string v0, "ImageSelector"

    const-string v1, "Cloud/Instagram"

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 14329
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->w:Z

    if-nez v0, :cond_12

    .line 14330
    const/4 v0, 0x2

    invoke-static {p0, v0}, Lcom/roidapp/cloudlib/common/a;->b(Landroid/content/Context;I)V

    .line 14332
    :cond_12
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 14333
    const-class v1, Lcom/roidapp/cloudlib/instagram/InstagramListCloud;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 14334
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->u:Landroid/widget/LinearLayout;

    if-eqz v1, :cond_13

    .line 14335
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 14337
    :cond_13
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->startActivity(Landroid/content/Intent;)V

    .line 14339
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->finish()V

    goto/16 :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ImageSelector;Ljava/lang/Object;)V
    .locals 12

    .prologue
    const/4 v11, 0x3

    const/4 v10, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    .line 88
    .line 7925
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->J:Z

    if-nez v0, :cond_0

    .line 7928
    if-nez p1, :cond_1

    .line 7929
    invoke-direct {p0, v9}, Lcom/roidapp/photogrid/release/ImageSelector;->b(Z)V

    .line 8013
    :cond_0
    :goto_0
    return-void

    .line 7932
    :cond_1
    check-cast p1, Ljava/util/HashMap;

    .line 7933
    const-string v0, "folders_array"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/String;

    .line 7934
    const-string v0, "first_pics"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Ljava/lang/String;

    .line 7935
    const-string v0, "count"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [Ljava/lang/Integer;

    .line 7942
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    if-eqz v0, :cond_e

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    .line 7944
    array-length v2, v3

    move v0, v9

    move v1, v9

    :goto_1
    if-ge v0, v2, :cond_e

    aget-object v6, v3, v0

    .line 7945
    iget-object v7, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 7946
    add-int/lit8 v0, v1, 0x2

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->N:I

    move v0, v8

    .line 7954
    :goto_2
    if-eqz v0, :cond_9

    .line 7955
    iget v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->N:I

    if-ne v0, v10, :cond_8

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    const v1, 0x7f0702cd

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 7956
    aget-object v0, v4, v9

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_7

    move v7, v8

    .line 7963
    :goto_3
    new-instance v0, Lcom/roidapp/photogrid/release/la;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->M:Landroid/widget/ListView;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/ImageSelector;->T:Lcom/roidapp/photogrid/release/kp;

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/la;-><init>(Landroid/content/Context;Landroid/widget/ListView;[Ljava/lang/String;[Ljava/lang/Integer;[Ljava/lang/String;Lcom/roidapp/photogrid/release/kp;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->O:Lcom/roidapp/photogrid/release/la;

    .line 7965
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->O:Lcom/roidapp/photogrid/release/la;

    iget v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->N:I

    invoke-virtual {v0, v1, v9}, Lcom/roidapp/photogrid/release/la;->a(IZ)V

    .line 7988
    :goto_4
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->U:Z

    if-eqz v0, :cond_3

    .line 7989
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->M:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    if-nez v0, :cond_2

    .line 7990
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->M:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->O:Lcom/roidapp/photogrid/release/la;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 7991
    iget v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->N:I

    if-le v0, v10, :cond_2

    .line 7992
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->M:Landroid/widget/ListView;

    iget v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->N:I

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 7995
    :cond_2
    sget v0, Lcom/roidapp/photogrid/release/ke;->f:I

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Y:I

    .line 7998
    :cond_3
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->S:Z

    if-eqz v0, :cond_5

    .line 7999
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "image_selector_sliding_new"

    invoke-interface {v0, v1, v9}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 8000
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->M:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->O:Lcom/roidapp/photogrid/release/la;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 8001
    iget v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->N:I

    if-le v0, v10, :cond_4

    .line 8002
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->M:Landroid/widget/ListView;

    iget v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->N:I

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 8004
    :cond_4
    sget v0, Lcom/roidapp/photogrid/release/ke;->f:I

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Y:I

    .line 8005
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->K:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->L:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->e(Landroid/view/View;)V

    .line 8006
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Z:Landroid/os/Handler;

    const/16 v1, 0x1a

    const-wide/16 v2, 0x528

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 8008
    :cond_5
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->R:Z

    if-eqz v0, :cond_c

    .line 8009
    invoke-direct {p0, v8}, Lcom/roidapp/photogrid/release/ImageSelector;->b(Z)V

    goto/16 :goto_0

    .line 7950
    :cond_6
    add-int/lit8 v1, v1, 0x1

    .line 7944
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_1

    .line 7959
    :cond_7
    aget-object v0, v3, v8

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    .line 7960
    iput v11, p0, Lcom/roidapp/photogrid/release/ImageSelector;->N:I

    :cond_8
    move v7, v9

    goto/16 :goto_3

    .line 7967
    :cond_9
    array-length v0, v3

    if-lez v0, :cond_b

    .line 7968
    aget-object v0, v4, v9

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_a

    .line 7970
    aget-object v0, v3, v9

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    .line 7971
    iput v10, p0, Lcom/roidapp/photogrid/release/ImageSelector;->N:I

    move v7, v8

    .line 7978
    :goto_5
    new-instance v0, Lcom/roidapp/photogrid/release/la;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->M:Landroid/widget/ListView;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/ImageSelector;->T:Lcom/roidapp/photogrid/release/kp;

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/la;-><init>(Landroid/content/Context;Landroid/widget/ListView;[Ljava/lang/String;[Ljava/lang/Integer;[Ljava/lang/String;Lcom/roidapp/photogrid/release/kp;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->O:Lcom/roidapp/photogrid/release/la;

    .line 7979
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->O:Lcom/roidapp/photogrid/release/la;

    iget v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->N:I

    invoke-virtual {v0, v1, v9}, Lcom/roidapp/photogrid/release/la;->a(IZ)V

    goto/16 :goto_4

    .line 7973
    :cond_a
    aget-object v0, v3, v8

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    .line 7974
    iput v11, p0, Lcom/roidapp/photogrid/release/ImageSelector;->N:I

    move v7, v9

    goto :goto_5

    .line 7983
    :cond_b
    invoke-direct {p0, v9}, Lcom/roidapp/photogrid/release/ImageSelector;->b(Z)V

    goto/16 :goto_0

    .line 8011
    :cond_c
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->I:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8012
    if-eqz v7, :cond_d

    .line 8013
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->H:Lcom/roidapp/photogrid/release/kt;

    invoke-virtual {v0, v10}, Lcom/roidapp/photogrid/release/kt;->a(I)V

    goto/16 :goto_0

    .line 8015
    :cond_d
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    invoke-virtual {p0, v0, v10}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Ljava/lang/String;I)V

    goto/16 :goto_0

    :cond_e
    move v0, v9

    goto/16 :goto_2
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ImageSelector;Ljava/lang/Object;I)V
    .locals 2

    .prologue
    .line 88
    .line 9200
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->J:Z

    if-nez v0, :cond_0

    .line 9206
    if-nez p1, :cond_1

    .line 9207
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->b:[Ljava/lang/String;

    .line 9214
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->b:[Ljava/lang/String;

    array-length v0, v0

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->c:[I

    .line 9215
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->I:Landroid/widget/TextView;

    const v1, 0x7f0702cd

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 9217
    invoke-direct {p0, p2}, Lcom/roidapp/photogrid/release/ImageSelector;->b(I)V

    .line 88
    :cond_0
    return-void

    .line 9209
    :cond_1
    check-cast p1, Ljava/util/HashMap;

    .line 9211
    const-string v0, "pics"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->b:[Ljava/lang/String;

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ImageSelector;[Lcom/roidapp/photogrid/release/ig;)V
    .locals 0

    .prologue
    .line 88
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/release/ImageSelector;->a([Lcom/roidapp/photogrid/release/ig;)V

    return-void
.end method

.method private a(Lcom/roidapp/photogrid/release/ig;I)V
    .locals 2

    .prologue
    .line 1438
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->J:Z

    if-eqz v0, :cond_0

    .line 1481
    :goto_0
    return-void

    .line 1441
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->X:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lcom/roidapp/photogrid/release/kb;

    invoke-direct {v1, p0, p1, p2}, Lcom/roidapp/photogrid/release/kb;-><init>(Lcom/roidapp/photogrid/release/ImageSelector;Lcom/roidapp/photogrid/release/ig;I)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Z)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    const/4 v2, 0x0

    .line 2039
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->b:[Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->c:[I

    if-nez v0, :cond_2

    .line 2040
    :cond_0
    const-string v0, "370"

    invoke-static {v0, p0}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    .line 2079
    :cond_1
    :goto_0
    return-void

    .line 2043
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->d:Landroid/widget/GridView;

    if-eqz v0, :cond_1

    move v1, v2

    .line 2046
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->b:[Ljava/lang/String;

    array-length v0, v0

    if-ge v1, v0, :cond_1

    .line 2047
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->b:[Ljava/lang/String;

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    move v3, v2

    .line 2048
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->d:Landroid/widget/GridView;

    invoke-virtual {v0}, Landroid/widget/GridView;->getChildCount()I

    move-result v0

    if-ge v3, v0, :cond_4

    .line 2049
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->d:Landroid/widget/GridView;

    invoke-virtual {v0, v3}, Landroid/widget/GridView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 2050
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->d:Landroid/widget/GridView;

    invoke-virtual {v0, v3}, Landroid/widget/GridView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ib;

    .line 2051
    iget-object v4, v0, Lcom/roidapp/photogrid/release/ib;->a:Lcom/roidapp/photogrid/release/GridImageView;

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/GridImageView;->getTag()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 2052
    if-eqz p2, :cond_5

    .line 2053
    iget v3, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    if-ne v3, v5, :cond_3

    iget v3, v0, Lcom/roidapp/photogrid/release/ib;->d:I

    if-eq v3, v5, :cond_1

    .line 2056
    :cond_3
    iget v3, v0, Lcom/roidapp/photogrid/release/ib;->d:I

    add-int/lit8 v3, v3, 0x1

    iput v3, v0, Lcom/roidapp/photogrid/release/ib;->d:I

    .line 2060
    :goto_3
    iget v3, v0, Lcom/roidapp/photogrid/release/ib;->d:I

    if-nez v3, :cond_6

    .line 2061
    iget-object v0, v0, Lcom/roidapp/photogrid/release/ib;->b:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2070
    :cond_4
    :goto_4
    if-eqz p2, :cond_8

    .line 2071
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->c:[I

    aget v2, v0, v1

    add-int/lit8 v2, v2, 0x1

    aput v2, v0, v1

    .line 2075
    :goto_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->e:Lcom/roidapp/photogrid/release/ia;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->c:[I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ia;->a([I)V

    goto :goto_0

    .line 2058
    :cond_5
    iget v3, v0, Lcom/roidapp/photogrid/release/ib;->d:I

    add-int/lit8 v3, v3, -0x1

    iput v3, v0, Lcom/roidapp/photogrid/release/ib;->d:I

    goto :goto_3

    .line 2063
    :cond_6
    iget-object v3, v0, Lcom/roidapp/photogrid/release/ib;->b:Landroid/widget/TextView;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2064
    iget-object v2, v0, Lcom/roidapp/photogrid/release/ib;->b:Landroid/widget/TextView;

    iget v0, v0, Lcom/roidapp/photogrid/release/ib;->d:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    .line 2048
    :cond_7
    add-int/lit8 v0, v3, 0x1

    move v3, v0

    goto :goto_2

    .line 2073
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->c:[I

    aget v2, v0, v1

    add-int/lit8 v2, v2, -0x1

    aput v2, v0, v1

    goto :goto_5

    .line 2046
    :cond_9
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto/16 :goto_1
.end method

.method private declared-synchronized a([Lcom/roidapp/photogrid/release/ig;)V
    .locals 4

    .prologue
    .line 1608
    monitor-enter p0

    :try_start_0
    array-length v0, p1

    .line 1609
    iget v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    if-le v0, v1, :cond_0

    iget v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    .line 1612
    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 1613
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    aget-object v3, p1, v1

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1614
    iget v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->y:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->y:I

    .line 1615
    aget-object v2, p1, v1

    iget v3, p0, Lcom/roidapp/photogrid/release/ImageSelector;->y:I

    invoke-direct {p0, v2, v3}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Lcom/roidapp/photogrid/release/ig;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1612
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1618
    :cond_1
    monitor-exit p0

    return-void

    .line 1608
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/ImageSelector;Z)Z
    .locals 0

    .prologue
    .line 88
    iput-boolean p1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->U:Z

    return p1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ImageSelector;I)I
    .locals 0

    .prologue
    .line 88
    iput p1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Y:I

    return p1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/ProgressBar;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->l:Landroid/widget/ProgressBar;

    return-object v0
.end method

.method private b(I)V
    .locals 10

    .prologue
    const/16 v4, 0x8

    const/4 v3, 0x0

    .line 1877
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->m:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    .line 1878
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->m:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v4}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1880
    :cond_0
    invoke-virtual {p0, v3}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Z)Z

    .line 1883
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 1885
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 1886
    const-string v0, "IS/loadimgs"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 1887
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    array-length v0, v0

    if-nez v0, :cond_2

    .line 1888
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1892
    :goto_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 1898
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->b:[Ljava/lang/String;

    if-eqz v0, :cond_a

    .line 1905
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    if-eqz v0, :cond_b

    .line 1907
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_8

    .line 1910
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 1911
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ig;

    .line 1912
    iget-object v1, v0, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 1913
    iget-object v1, v0, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    invoke-virtual {v5, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 1914
    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 1890
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 1894
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 1916
    :cond_4
    iget-object v0, v0, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 1920
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1922
    iget-object v6, p0, Lcom/roidapp/photogrid/release/ImageSelector;->b:[Ljava/lang/String;

    array-length v7, v6

    move v2, v3

    move v4, v3

    :goto_3
    if-ge v2, v7, :cond_9

    aget-object v1, v6, v2

    .line 1923
    invoke-virtual {v5}, Ljava/util/HashMap;->size()I

    move-result v0

    if-eqz v0, :cond_9

    .line 1926
    invoke-virtual {v5}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1927
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 1928
    iget-object v8, p0, Lcom/roidapp/photogrid/release/ImageSelector;->c:[I

    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aput v1, v8, v4

    .line 1929
    invoke-virtual {v5, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1933
    :cond_7
    add-int/lit8 v1, v4, 0x1

    .line 1922
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    move v4, v1

    goto :goto_3

    .line 1936
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 6946
    :cond_9
    :goto_4
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->J:Z

    if-nez v0, :cond_a

    .line 6949
    iput-boolean v3, p0, Lcom/roidapp/photogrid/release/ImageSelector;->D:Z

    .line 6955
    new-instance v0, Lcom/roidapp/photogrid/release/ia;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->b:[Ljava/lang/String;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->c:[I

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ImageSelector;->T:Lcom/roidapp/photogrid/release/kp;

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/roidapp/photogrid/release/ia;-><init>(Landroid/content/Context;[Ljava/lang/String;[ILcom/roidapp/photogrid/release/kp;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->e:Lcom/roidapp/photogrid/release/ia;

    .line 6957
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->d:Landroid/widget/GridView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->e:Lcom/roidapp/photogrid/release/ia;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 6958
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->d:Landroid/widget/GridView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->ac:Landroid/view/View$OnTouchListener;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 6960
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->d:Landroid/widget/GridView;

    new-instance v1, Lcom/roidapp/photogrid/release/jq;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/jq;-><init>(Lcom/roidapp/photogrid/release/ImageSelector;)V

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 1943
    :cond_a
    return-void

    .line 1939
    :cond_b
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_4
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ImageSelector;Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 88
    .line 8224
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->J:Z

    if-nez v0, :cond_1

    .line 8227
    new-instance v3, Lcom/roidapp/photogrid/release/kf;

    invoke-direct {v3}, Lcom/roidapp/photogrid/release/kf;-><init>()V

    .line 8228
    if-eqz p1, :cond_0

    .line 8229
    check-cast p1, Ljava/util/HashMap;

    .line 8230
    if-eqz p1, :cond_1

    .line 8233
    const-string v0, "folders_array"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 8234
    const-string v1, "first_pics"

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    .line 8235
    const-string v2, "count"

    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/Integer;

    .line 8237
    invoke-virtual {v3, v0, v1, v2}, Lcom/roidapp/photogrid/release/kf;->a([Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/Integer;)V

    .line 8240
    :cond_0
    new-instance v0, Lcom/roidapp/photogrid/release/js;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/js;-><init>(Lcom/roidapp/photogrid/release/ImageSelector;)V

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/kf;->a(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 8245
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->P:Landroid/widget/FrameLayout;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->P:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->isShown()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 8246
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->P:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->bringToFront()V

    .line 8247
    const v0, 0x7f0d037d

    const-string v1, "cloudFragment"

    invoke-direct {p0, v0, v3, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 8248
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->I:Landroid/widget/TextView;

    const v1, 0x7f070105

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 88
    :cond_1
    return-void
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/ImageSelector;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 88
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Ljava/lang/String;Z)V

    return-void
.end method

.method private b(Z)V
    .locals 8

    .prologue
    const/4 v4, 0x0

    const/4 v7, 0x0

    .line 1029
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->J:Z

    if-eqz v0, :cond_0

    .line 1053
    :goto_0
    return-void

    .line 1033
    :cond_0
    if-nez p1, :cond_1

    .line 1034
    new-instance v0, Lcom/roidapp/photogrid/release/la;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->M:Landroid/widget/ListView;

    new-array v3, v7, [Ljava/lang/String;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/ImageSelector;->T:Lcom/roidapp/photogrid/release/kp;

    move-object v1, p0

    move-object v5, v4

    invoke-direct/range {v0 .. v6}, Lcom/roidapp/photogrid/release/la;-><init>(Landroid/content/Context;Landroid/widget/ListView;[Ljava/lang/String;[Ljava/lang/Integer;[Ljava/lang/String;Lcom/roidapp/photogrid/release/kp;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->O:Lcom/roidapp/photogrid/release/la;

    .line 1036
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->O:Lcom/roidapp/photogrid/release/la;

    invoke-virtual {v0, v7, v7}, Lcom/roidapp/photogrid/release/la;->a(IZ)V

    .line 1037
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->M:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->O:Lcom/roidapp/photogrid/release/la;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1038
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->S:Z

    if-eqz v0, :cond_2

    .line 1039
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "image_selector_sliding_new"

    invoke-interface {v0, v1, v7}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1040
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->K:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->L:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->e(Landroid/view/View;)V

    .line 1041
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Z:Landroid/os/Handler;

    new-instance v1, Lcom/roidapp/photogrid/release/ka;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/ka;-><init>(Lcom/roidapp/photogrid/release/ImageSelector;)V

    const-wide/16 v2, 0x528

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1051
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->o:Landroid/widget/ImageButton;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 1052
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->H:Lcom/roidapp/photogrid/release/kt;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kt;->b()V

    goto :goto_0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/ImageSelector;I)I
    .locals 0

    .prologue
    .line 88
    iput p1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->N:I

    return p1
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/common/al;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->ab:Lcom/roidapp/photogrid/common/al;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/ImageSelector;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .prologue
    .line 88
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 88
    invoke-static {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/ImageSelector;Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 88
    .line 9175
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->J:Z

    if-nez v0, :cond_0

    .line 9178
    if-eqz p1, :cond_0

    .line 9181
    check-cast p1, Ljava/util/HashMap;

    .line 9183
    const-string v0, "folders_array"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    .line 9184
    const-string v1, "first_pics"

    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    .line 9185
    const-string v2, "count"

    invoke-virtual {p1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/Integer;

    .line 9187
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ImageSelector;->P:Landroid/widget/FrameLayout;

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ImageSelector;->P:Landroid/widget/FrameLayout;

    invoke-virtual {v3}, Landroid/widget/FrameLayout;->isShown()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 9188
    iget-object v3, p0, Lcom/roidapp/photogrid/release/ImageSelector;->P:Landroid/widget/FrameLayout;

    invoke-virtual {v3}, Landroid/widget/FrameLayout;->bringToFront()V

    .line 9189
    new-instance v3, Lcom/roidapp/photogrid/release/km;

    invoke-direct {v3}, Lcom/roidapp/photogrid/release/km;-><init>()V

    .line 9190
    invoke-virtual {v3, v0, v1, v2}, Lcom/roidapp/photogrid/release/km;->a([Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/Integer;)V

    .line 9191
    const v0, 0x7f0d037d

    const-string v1, "myfolder"

    invoke-direct {p0, v0, v3, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 9192
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->I:Landroid/widget/TextView;

    const v1, 0x7f0702eb

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 88
    :cond_0
    return-void
.end method

.method private c(Z)Z
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v0, 0x0

    .line 1113
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->h()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1132
    :cond_0
    :goto_0
    return v0

    .line 1116
    :cond_1
    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Q:Z

    .line 1117
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ImageSelector;->ad:Ljava/lang/String;

    invoke-virtual {v1, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v1

    .line 1118
    if-eqz v1, :cond_0

    .line 1119
    instance-of v0, v1, Lcom/roidapp/photogrid/release/kg;

    if-eqz v0, :cond_2

    move-object v0, v1

    .line 1120
    check-cast v0, Lcom/roidapp/photogrid/release/kg;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kg;->b()V

    .line 1122
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    .line 1123
    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 1124
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 1125
    if-eqz p1, :cond_3

    .line 1126
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->ad:Ljava/lang/String;

    .line 1127
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->I:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1128
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->O:Lcom/roidapp/photogrid/release/la;

    iget v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->N:I

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/la;->a(IZ)V

    :cond_3
    move v0, v2

    .line 1130
    goto :goto_0
.end method

.method private static d(Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 503
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 504
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_1

    .line 522
    :cond_0
    return-void

    .line 507
    :cond_1
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 511
    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v1

    .line 512
    if-eqz v1, :cond_0

    .line 514
    const/4 v0, 0x0

    :goto_0
    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 515
    new-instance v2, Ljava/io/File;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    aget-object v4, v1, v0

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 516
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 517
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 514
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method private d(Z)V
    .locals 4

    .prologue
    const/16 v2, 0x8

    const/4 v1, 0x0

    .line 1171
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->J:Z

    .line 1172
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->ab:Lcom/roidapp/photogrid/common/al;

    if-eqz v0, :cond_0

    .line 1173
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->ab:Lcom/roidapp/photogrid/common/al;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/al;->c()V

    .line 1179
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->K:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    if-eqz v0, :cond_1

    .line 1180
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->K:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->b()V

    .line 1183
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->T:Lcom/roidapp/photogrid/release/kp;

    if-eqz v0, :cond_2

    .line 1184
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->T:Lcom/roidapp/photogrid/release/kp;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kp;->e()V

    .line 1193
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->d:Landroid/widget/GridView;

    if-eqz v0, :cond_3

    .line 1194
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->d:Landroid/widget/GridView;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1195
    iput-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->d:Landroid/widget/GridView;

    .line 1197
    :cond_3
    iput-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->e:Lcom/roidapp/photogrid/release/ia;

    .line 1199
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->M:Landroid/widget/ListView;

    if-eqz v0, :cond_4

    .line 1200
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->M:Landroid/widget/ListView;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1204
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->L:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1206
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->r:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1208
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 1210
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->T:Lcom/roidapp/photogrid/release/kp;

    if-eqz v0, :cond_5

    .line 1211
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->T:Lcom/roidapp/photogrid/release/kp;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kp;->f()V

    .line 1214
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->X:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_6

    .line 1215
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->X:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 1218
    :cond_6
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->j()V

    .line 1220
    if-eqz p1, :cond_8

    .line 1221
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->n:Landroid/widget/TextView;

    if-eqz v0, :cond_7

    .line 1222
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->n:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0701a0

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " 10%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1224
    :cond_7
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->m:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_8

    .line 1225
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->m:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1242
    :cond_8
    return-void
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/ImageSelector;)Z
    .locals 1

    .prologue
    .line 88
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->J:Z

    return v0
.end method

.method private e(Ljava/lang/String;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 2478
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->a(I)V

    .line 2479
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2480
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v0

    const-string v3, "mounted"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2481
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Z:Landroid/os/Handler;

    const/16 v1, 0xe

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    move-object v0, v2

    .line 2544
    :goto_0
    return-object v0

    .line 2484
    :cond_0
    const/16 v0, 0xa

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->a(I)V

    .line 2485
    if-eqz p1, :cond_1

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    move-object v0, v2

    .line 2486
    goto :goto_0

    .line 2488
    :cond_2
    const/16 v0, 0xf

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->a(I)V

    .line 2490
    invoke-static {}, Lcom/roidapp/baselib/d/a;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 2491
    const/4 v0, 0x1

    .line 2494
    :goto_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 2495
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2496
    const/16 v5, 0x14

    invoke-virtual {p0, v5}, Lcom/roidapp/photogrid/release/ImageSelector;->a(I)V

    .line 2497
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result v5

    if-eqz v5, :cond_6

    .line 2498
    const/16 v5, 0x15

    invoke-virtual {p0, v5}, Lcom/roidapp/photogrid/release/ImageSelector;->a(I)V

    .line 2499
    invoke-virtual {v4}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v4

    .line 2500
    const/16 v5, 0x19

    invoke-virtual {p0, v5}, Lcom/roidapp/photogrid/release/ImageSelector;->a(I)V

    .line 2501
    if-eqz v4, :cond_6

    .line 2502
    const/16 v5, 0x1a

    invoke-virtual {p0, v5}, Lcom/roidapp/photogrid/release/ImageSelector;->a(I)V

    .line 2503
    array-length v5, v4

    :goto_2
    if-ge v1, v5, :cond_6

    aget-object v6, v4, v1

    .line 2504
    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    .line 2505
    const-string v8, ".png"

    invoke-virtual {v7, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_3

    const-string v8, ".jpg"

    invoke-virtual {v7, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_3

    const-string v8, ".gif"

    invoke-virtual {v7, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_3

    const-string v8, ".bmp"

    invoke-virtual {v7, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_3

    const-string v8, ".jpeg"

    invoke-virtual {v7, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_3

    const-string v8, ".mpo"

    invoke-virtual {v7, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-nez v8, :cond_3

    invoke-static {v7}, Lcom/roidapp/photogrid/common/bn;->a(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 2512
    :cond_3
    if-eqz v0, :cond_5

    .line 2514
    invoke-static {v6}, Lcom/roidapp/photogrid/release/rf;->a(Ljava/io/File;)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 2515
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2503
    :cond_4
    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 2518
    :cond_5
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 2524
    :cond_6
    const/16 v0, 0x32

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->a(I)V

    .line 2526
    :try_start_0
    new-instance v0, Lcom/roidapp/photogrid/release/ju;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/release/ju;-><init>(Lcom/roidapp/photogrid/release/ImageSelector;)V

    invoke-static {v3, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2539
    :goto_4
    const/16 v0, 0x46

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->a(I)V

    .line 2540
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    .line 2541
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 2536
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    goto :goto_4

    .line 2543
    :cond_7
    const/16 v0, 0x50

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->a(I)V

    move-object v0, v2

    .line 2544
    goto/16 :goto_0

    :cond_8
    move v0, v1

    goto/16 :goto_1
.end method

.method private e(Z)V
    .locals 6

    .prologue
    const/4 v5, 0x0

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 1246
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Q:Z

    if-eqz v0, :cond_0

    .line 1286
    :goto_0
    return-void

    .line 1249
    :cond_0
    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->K:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->L:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->L:Landroid/widget/LinearLayout;

    invoke-static {v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->g(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1250
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->M:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    if-nez v0, :cond_2

    .line 1251
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->T:Lcom/roidapp/photogrid/release/kp;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kp;->b()V

    .line 1252
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->M:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->O:Lcom/roidapp/photogrid/release/la;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1253
    iget v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->N:I

    const/4 v1, 0x2

    if-le v0, v1, :cond_1

    .line 1254
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->M:Landroid/widget/ListView;

    iget v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->N:I

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 1260
    :cond_1
    :goto_1
    sget v0, Lcom/roidapp/photogrid/release/ke;->f:I

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Y:I

    .line 1263
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->K:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->L:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->e(Landroid/view/View;)V

    goto :goto_0

    .line 1257
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->T:Lcom/roidapp/photogrid/release/kp;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kp;->b()V

    .line 1258
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->T:Lcom/roidapp/photogrid/release/kp;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kp;->c()V

    goto :goto_1

    .line 1267
    :cond_3
    iput-boolean v4, p0, Lcom/roidapp/photogrid/release/ImageSelector;->J:Z

    .line 1269
    iput-boolean v4, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Q:Z

    .line 1271
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->w:Z

    .line 1272
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_4

    if-nez v0, :cond_4

    .line 1273
    invoke-direct {p0, v3}, Lcom/roidapp/photogrid/release/ImageSelector;->d(Z)V

    .line 5313
    invoke-static {}, Lcom/roidapp/photogrid/common/ba;->a()Lcom/roidapp/photogrid/common/ba;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/photogrid/common/ba;->a(Landroid/app/Activity;)V

    .line 5314
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/ih;->a(Lcom/roidapp/cloudlib/template/d;)V

    .line 5315
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 5316
    const-class v1, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 5317
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->startActivity(Landroid/content/Intent;)V

    .line 5318
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->finish()V

    .line 5319
    const-string v0, "TemplateSelect_View"

    const-string v1, "Cart_TemplateSelect"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 1276
    :cond_4
    if-eqz v0, :cond_7

    .line 1277
    invoke-direct {p0, v4}, Lcom/roidapp/photogrid/release/ImageSelector;->d(Z)V

    .line 6292
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0x9

    if-eq v0, v1, :cond_5

    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_6

    .line 6293
    :cond_5
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    new-array v1, v4, [Lcom/roidapp/photogrid/release/ig;

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->au()Lcom/roidapp/photogrid/release/ig;

    move-result-object v2

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 6294
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/ih;->a(Lcom/roidapp/photogrid/release/ig;)V

    .line 6295
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/16 v1, 0x32

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 6303
    :goto_2
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 6304
    const-class v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 6305
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->startActivity(Landroid/content/Intent;)V

    .line 6306
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->finish()V

    .line 1279
    sput-boolean v3, Lcom/roidapp/photogrid/common/az;->w:Z

    goto/16 :goto_0

    .line 6297
    :cond_6
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->O()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 6298
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/roidapp/photogrid/release/ih;->b([Lcom/roidapp/photogrid/release/ig;)V

    .line 6299
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ak()I

    goto :goto_2

    .line 1281
    :cond_7
    invoke-direct {p0, v3}, Lcom/roidapp/photogrid/release/ImageSelector;->d(Z)V

    .line 6326
    invoke-static {}, Lcom/roidapp/photogrid/common/ba;->a()Lcom/roidapp/photogrid/common/ba;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/photogrid/common/ba;->a(Landroid/app/Activity;)V

    .line 6327
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_8

    .line 6328
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    new-array v2, v3, [Lcom/roidapp/photogrid/release/ig;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 6332
    :cond_8
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v3}, Lcom/roidapp/photogrid/release/ImageSelector;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "folder_name"

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 6333
    sput-boolean v3, Lcom/roidapp/photogrid/common/az;->z:Z

    .line 6334
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->d(Ljava/lang/String;)V

    .line 6335
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 6336
    const-class v1, Lcom/roidapp/photogrid/MainPage;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 6337
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->startActivity(Landroid/content/Intent;)V

    .line 6338
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->finish()V

    .line 6339
    const-string v0, "MainPage_View"

    const-string v1, "Cart_Home"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/ImageSelector;)Z
    .locals 1

    .prologue
    .line 88
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->D:Z

    return v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Z:Landroid/os/Handler;

    return-object v0
.end method

.method private static f(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 2609
    if-eqz p0, :cond_0

    .line 2610
    const-string v0, "/"

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    .line 2611
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 2614
    :goto_0
    return-object v0

    :cond_0
    const-string v0, ""

    goto :goto_0
.end method

.method private g()V
    .locals 8

    .prologue
    const v7, 0x7f0c0043

    const v6, 0x7f0200bc

    const/16 v1, 0x8

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 452
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->J:Z

    if-eqz v0, :cond_1

    .line 499
    :cond_0
    :goto_0
    return-void

    .line 455
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_2

    .line 456
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 457
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 458
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->g:Landroid/widget/TextView;

    const v1, -0xa9a9aa

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 463
    :goto_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->P()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 464
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->g:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "( "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " )"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 465
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->V:Ljava/lang/String;

    new-array v2, v5, [Ljava/lang/Object;

    iget v3, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 488
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_6

    .line 489
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->B:Z

    if-nez v0, :cond_0

    .line 490
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 492
    iput-boolean v5, p0, Lcom/roidapp/photogrid/release/ImageSelector;->B:Z

    goto :goto_0

    .line 460
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 461
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0c0062

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1

    .line 467
    :cond_3
    iget v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v0, v1

    .line 468
    sget v1, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_5

    .line 469
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->g:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "( "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " )"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 470
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->W:Ljava/lang/String;

    new-array v2, v5, [Ljava/lang/Object;

    iget v3, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 471
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    if-ge v0, v1, :cond_4

    .line 472
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->j:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 473
    iput-boolean v4, p0, Lcom/roidapp/photogrid/release/ImageSelector;->B:Z

    goto/16 :goto_0

    .line 476
    :cond_4
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->B:Z

    if-nez v0, :cond_0

    .line 477
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v6}, Landroid/widget/LinearLayout;->setBackgroundResource(I)V

    .line 479
    iput-boolean v5, p0, Lcom/roidapp/photogrid/release/ImageSelector;->B:Z

    goto/16 :goto_0

    .line 484
    :cond_5
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->g:Landroid/widget/TextView;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v3, 0x7f07022d

    invoke-virtual {p0, v3}, Lcom/roidapp/photogrid/release/ImageSelector;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const v2, 0x7f07022c

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/release/ImageSelector;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    .line 494
    :cond_6
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->B:Z

    if-eqz v0, :cond_0

    .line 495
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    new-array v1, v4, [Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 496
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->j:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 497
    iput-boolean v4, p0, Lcom/roidapp/photogrid/release/ImageSelector;->B:Z

    goto/16 :goto_0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/release/ImageSelector;)Z
    .locals 1

    .prologue
    .line 88
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->D:Z

    return v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/release/ImageSelector;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic i(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->n:Landroid/widget/TextView;

    return-object v0
.end method

.method private i()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1344
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->w:Z

    .line 1345
    if-eqz v0, :cond_0

    .line 1346
    sput-boolean v2, Lcom/roidapp/photogrid/common/az;->w:Z

    .line 1347
    invoke-static {}, Lcom/roidapp/photogrid/release/qx;->a()Lcom/roidapp/photogrid/release/qx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/qx;->d()V

    .line 1349
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 1350
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    new-array v2, v2, [Lcom/roidapp/photogrid/release/ig;

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 1352
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 1353
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1354
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->startActivity(Landroid/content/Intent;)V

    .line 1355
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->u:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_2

    .line 1356
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 1358
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->finish()V

    .line 1359
    const-string v0, "MainPage_View"

    const-string v1, "Cart_Home"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1360
    return-void
.end method

.method static synthetic j(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->q:Landroid/widget/TextView;

    return-object v0
.end method

.method private declared-synchronized j()V
    .locals 3

    .prologue
    .line 1623
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->s:Ljava/util/HashMap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    .line 1634
    :goto_0
    monitor-exit p0

    return-void

    .line 1626
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->s:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1627
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->s:Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    .line 1628
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-nez v2, :cond_1

    .line 1629
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 1623
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 1632
    :cond_2
    :try_start_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->s:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method static synthetic k(Lcom/roidapp/photogrid/release/ImageSelector;)Ljava/util/List;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    return-object v0
.end method

.method private k()V
    .locals 8

    .prologue
    const/4 v6, 0x6

    const/4 v0, 0x5

    const/4 v7, 0x1

    const/4 v1, 0x0

    .line 1638
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_1

    .line 1788
    :cond_0
    :goto_0
    return-void

    .line 1642
    :cond_1
    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Q:Z

    if-nez v2, :cond_0

    .line 1645
    iput-boolean v7, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Q:Z

    .line 1646
    iput-boolean v7, p0, Lcom/roidapp/photogrid/release/ImageSelector;->J:Z

    .line 1648
    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->c(Z)Z

    .line 1650
    sget v2, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v2, v6, :cond_c

    .line 1651
    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->d(Z)V

    .line 1655
    :goto_1
    sget-boolean v2, Lcom/roidapp/photogrid/common/az;->w:Z

    .line 1657
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    .line 1693
    if-nez v2, :cond_d

    .line 1694
    sget v4, Lcom/roidapp/photogrid/common/az;->q:I

    if-eqz v4, :cond_2

    sget v4, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v4, v0, :cond_4

    .line 1695
    :cond_2
    iget-object v4, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-le v4, v7, :cond_3

    move v0, v1

    :cond_3
    sput v0, Lcom/roidapp/photogrid/common/az;->q:I

    .line 1697
    :cond_4
    invoke-virtual {v3, v7}, Lcom/roidapp/photogrid/release/ih;->e(Z)V

    .line 1702
    :goto_2
    const-string v0, "FaceClip"

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 1703
    sget v4, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v5, 0x4

    if-eq v4, v5, :cond_5

    .line 1704
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    const-string v5, "needFaceClip"

    invoke-interface {v4, v5, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1706
    :cond_5
    const-string v4, "needFaceClip"

    invoke-interface {v0, v4, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 1707
    sget-boolean v4, Lcom/roidapp/photogrid/common/az;->w:Z

    if-eqz v4, :cond_6

    move v0, v1

    .line 1712
    :cond_6
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 1714
    sget v5, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v5, :pswitch_data_0

    .line 1737
    :cond_7
    :goto_3
    :pswitch_0
    sget v5, Lcom/roidapp/photogrid/common/az;->q:I

    if-ne v5, v6, :cond_e

    .line 1738
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v5, "first_in"

    invoke-interface {v0, v5, v7}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1739
    invoke-virtual {v3, v7}, Lcom/roidapp/photogrid/release/ih;->l(Z)V

    .line 1740
    const-class v0, Lcom/roidapp/photogrid/video/VideoPictureEditActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1741
    const-string v0, "VideoSortPage_View"

    const-string v5, "Cart_VideoSort"

    invoke-static {v0, v5}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1763
    :goto_4
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 1764
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getWindow()Landroid/view/Window;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 1765
    iget v5, v0, Landroid/graphics/Rect;->top:I

    if-lez v5, :cond_8

    .line 1766
    iget v0, v0, Landroid/graphics/Rect;->top:I

    sput v0, Lcom/roidapp/photogrid/common/az;->g:I

    .line 1768
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->u:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_9

    .line 1769
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->u:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 1772
    :cond_9
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    new-array v5, v1, [Lcom/roidapp/photogrid/release/ig;

    invoke-interface {v0, v5}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 1773
    iget v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/ih;->j(I)V

    .line 1774
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/ih;->d(Ljava/lang/String;)V

    .line 1775
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->w:Z

    if-nez v0, :cond_a

    .line 1776
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/aa;->d()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/ih;->b(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    .line 1777
    invoke-static {}, Lcom/roidapp/imagelib/filter/aa;->a()Lcom/roidapp/imagelib/filter/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/aa;->f()V

    .line 1779
    :cond_a
    if-eqz v2, :cond_b

    .line 1780
    sput-boolean v1, Lcom/roidapp/photogrid/common/az;->w:Z

    .line 1783
    :cond_b
    invoke-static {p0}, Lcom/roidapp/cloudlib/common/a;->A(Landroid/content/Context;)V

    .line 1784
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v2, "folder_name"

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1785
    invoke-virtual {p0, v4}, Lcom/roidapp/photogrid/release/ImageSelector;->startActivity(Landroid/content/Intent;)V

    .line 1786
    invoke-virtual {p0, v1, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->overridePendingTransition(II)V

    .line 1787
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->finish()V

    goto/16 :goto_0

    .line 1653
    :cond_c
    invoke-direct {p0, v7}, Lcom/roidapp/photogrid/release/ImageSelector;->d(Z)V

    goto/16 :goto_1

    .line 1699
    :cond_d
    invoke-virtual {v3, v1}, Lcom/roidapp/photogrid/release/ih;->e(Z)V

    goto/16 :goto_2

    .line 1717
    :pswitch_1
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->Y()Ljava/lang/String;

    move-result-object v5

    .line 1718
    if-eqz v5, :cond_7

    .line 1719
    invoke-virtual {v3, v5}, Lcom/roidapp/photogrid/release/ih;->c(Ljava/lang/String;)V

    goto/16 :goto_3

    .line 1723
    :pswitch_2
    if-nez v2, :cond_7

    .line 1724
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->Y()Ljava/lang/String;

    move-result-object v5

    .line 1725
    if-eqz v5, :cond_7

    .line 1726
    invoke-virtual {v3, v5}, Lcom/roidapp/photogrid/release/ih;->c(Ljava/lang/String;)V

    goto/16 :goto_3

    .line 1743
    :cond_e
    if-eqz v0, :cond_f

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    sget-object v6, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "/face"

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_f

    .line 1744
    const-class v0, Lcom/roidapp/photogrid/release/FaceDetectorActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1745
    const-string v0, "entryFrom"

    invoke-virtual {v4, v0, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1746
    const-string v0, "entryType"

    invoke-virtual {v4, v0, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    goto/16 :goto_4

    .line 1747
    :cond_f
    if-eqz v2, :cond_10

    .line 1749
    const-class v0, Lcom/roidapp/photogrid/release/ImageEditFreeCropActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto/16 :goto_4

    .line 1751
    :cond_10
    if-eqz v0, :cond_11

    .line 1752
    const-string v0, "entryFrom"

    const/4 v5, 0x3

    invoke-virtual {v4, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1753
    const-string v0, "entryType"

    invoke-virtual {v4, v0, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1757
    :cond_11
    const-class v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 1758
    const-string v0, "EditPage_View"

    const-string v5, "Cart_Edit"

    invoke-static {v0, v5}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_4

    .line 1714
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method static synthetic l(Lcom/roidapp/photogrid/release/ImageSelector;)Z
    .locals 1

    .prologue
    .line 88
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->C:Z

    return v0
.end method

.method static synthetic m(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->m:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic n(Lcom/roidapp/photogrid/release/ImageSelector;)Z
    .locals 1

    .prologue
    .line 88
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->R:Z

    return v0
.end method

.method static synthetic o(Lcom/roidapp/photogrid/release/ImageSelector;)Z
    .locals 1

    .prologue
    .line 88
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->R:Z

    return v0
.end method

.method static synthetic p(Lcom/roidapp/photogrid/release/ImageSelector;)V
    .locals 1

    .prologue
    .line 88
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->b(Z)V

    return-void
.end method

.method static synthetic q(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/LinearLayout;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->L:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic r(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/baselib/view/FixedDrawerLayout;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->K:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    return-object v0
.end method

.method static synthetic s(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/kp;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->T:Lcom/roidapp/photogrid/release/kp;

    return-object v0
.end method

.method static synthetic t(Lcom/roidapp/photogrid/release/ImageSelector;)V
    .locals 8

    .prologue
    const v6, 0x7f0d03c3

    const/4 v7, 0x0

    .line 88
    .line 9377
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->J:Z

    if-nez v0, :cond_0

    .line 9381
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->v:Z

    if-eqz v0, :cond_1

    .line 9392
    :cond_0
    :goto_0
    return-void

    .line 9382
    :cond_1
    const v0, 0x7f0d008d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 9383
    if-eqz v0, :cond_0

    .line 9384
    new-instance v3, Landroid/app/Dialog;

    const v1, 0x7f0b001d

    invoke-direct {v3, p0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 9386
    const v1, 0x7f0300f0

    :try_start_0
    invoke-virtual {v3, v1}, Landroid/app/Dialog;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 9394
    invoke-virtual {v3, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/release/jw;

    invoke-direct {v2, p0, v3}, Lcom/roidapp/photogrid/release/jw;-><init>(Lcom/roidapp/photogrid/release/ImageSelector;Landroid/app/Dialog;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9401
    const v1, 0x7f0d0377

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 9402
    invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v5

    .line 9403
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    add-int v2, v5, v1

    .line 9404
    const v1, 0x7f0d03ca

    invoke-virtual {v3, v1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 9405
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout$LayoutParams;

    .line 9406
    iput v2, v1, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 9408
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->I:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v2

    .line 9409
    invoke-virtual {v3, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 9410
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 9411
    iget-object v6, p0, Lcom/roidapp/photogrid/release/ImageSelector;->aa:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 9413
    iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 9415
    const v2, 0x7f0d03c8

    invoke-virtual {v3, v2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    .line 9416
    invoke-virtual {v0}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    add-int/2addr v0, v4

    iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->width:I

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    .line 9419
    new-instance v1, Lcom/roidapp/photogrid/release/jx;

    invoke-direct {v1, p0, v0, v2}, Lcom/roidapp/photogrid/release/jx;-><init>(Lcom/roidapp/photogrid/release/ImageSelector;ILandroid/view/ViewGroup;)V

    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    .line 9427
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->aa:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    .line 9428
    const v0, 0x7f0d03cb

    invoke-virtual {v3, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 9429
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 9430
    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    .line 9432
    const v0, 0x7f0d03c4

    invoke-virtual {v3, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 9433
    invoke-virtual {v0, v5, v7, v5, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 9434
    invoke-virtual {v3}, Landroid/app/Dialog;->show()V

    goto/16 :goto_0

    .line 9388
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto/16 :goto_0

    .line 9391
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_0
.end method

.method static synthetic u(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/ListView;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->M:Landroid/widget/ListView;

    return-object v0
.end method

.method static synthetic v(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/la;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->O:Lcom/roidapp/photogrid/release/la;

    return-object v0
.end method

.method static synthetic w(Lcom/roidapp/photogrid/release/ImageSelector;)I
    .locals 1

    .prologue
    .line 88
    iget v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->N:I

    return v0
.end method

.method static synthetic x(Lcom/roidapp/photogrid/release/ImageSelector;)I
    .locals 1

    .prologue
    .line 88
    iget v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Y:I

    return v0
.end method

.method static synthetic y(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/photogrid/release/kt;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->H:Lcom/roidapp/photogrid/release/kt;

    return-object v0
.end method

.method static synthetic z(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/ImageButton;
    .locals 1

    .prologue
    .line 88
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->o:Landroid/widget/ImageButton;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 2022
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 2023
    const/4 v1, 0x7

    iput v1, v0, Landroid/os/Message;->what:I

    .line 2024
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Z:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 2025
    return-void
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 1799
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 1800
    const/16 v1, 0x13

    iput v1, v0, Landroid/os/Message;->what:I

    .line 1801
    iput p1, v0, Landroid/os/Message;->arg1:I

    .line 1802
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Z:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1803
    return-void
.end method

.method public final a(Lcom/roidapp/photogrid/release/ig;)V
    .locals 1

    .prologue
    .line 2471
    iget-object v0, p1, Lcom/roidapp/photogrid/release/ig;->n:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Ljava/lang/String;)V

    .line 2472
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 1992
    iget v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    if-nez v0, :cond_0

    .line 1993
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->i()V

    .line 2019
    :goto_0
    return-void

    .line 1996
    :cond_0
    const/4 v0, 0x0

    .line 1997
    iget v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    if-ne v2, v1, :cond_2

    .line 1998
    iget-boolean v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->C:Z

    if-eqz v2, :cond_1

    move v0, v1

    .line 2006
    :cond_1
    :goto_1
    if-eqz v0, :cond_3

    .line 2007
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 2008
    const/4 v1, 0x7

    iput v1, v0, Landroid/os/Message;->what:I

    .line 2009
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Z:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 2002
    :cond_2
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    iget v3, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    if-lt v2, v3, :cond_1

    move v0, v1

    .line 2003
    goto :goto_1

    .line 2013
    :cond_3
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->C:Z

    .line 2014
    new-instance v0, Lcom/roidapp/photogrid/release/ig;

    invoke-direct {v0, p1}, Lcom/roidapp/photogrid/release/ig;-><init>(Ljava/lang/String;)V

    .line 2015
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2016
    iget v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->y:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->y:I

    .line 2017
    iget v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->y:I

    invoke-direct {p0, v0, v2}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Lcom/roidapp/photogrid/release/ig;I)V

    .line 2018
    invoke-direct {p0, p1, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Ljava/lang/String;Z)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;I)V
    .locals 4

    .prologue
    const/16 v3, 0xc

    const/4 v2, 0x0

    .line 1835
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->d:Landroid/widget/GridView;

    if-eqz v0, :cond_0

    .line 1836
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->d:Landroid/widget/GridView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 1838
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->m:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_1

    .line 1839
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->m:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 1846
    :cond_1
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->D:Z

    .line 1847
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Z:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeMessages(I)V

    .line 1848
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 1849
    iput v3, v0, Landroid/os/Message;->what:I

    .line 1850
    iput p2, v0, Landroid/os/Message;->arg1:I

    .line 1851
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Z:Landroid/os/Handler;

    const-wide/16 v2, 0x1388

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1852
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/photogrid/release/jp;

    invoke-direct {v1, p0, p1, p2}, Lcom/roidapp/photogrid/release/jp;-><init>(Lcom/roidapp/photogrid/release/ImageSelector;Ljava/lang/String;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 1873
    return-void
.end method

.method public final a(Ljava/lang/String;II)V
    .locals 3

    .prologue
    .line 2090
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "FragmentImagePreview"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2103
    :cond_0
    :goto_0
    return-void

    .line 2093
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->c:[I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->c:[I

    array-length v0, v0

    if-ge p2, v0, :cond_0

    .line 2096
    const-string v0, "FragmentImagePreview"

    .line 7136
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->h()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 2098
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->T:Lcom/roidapp/photogrid/release/kp;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kp;->b()V

    .line 2099
    new-instance v0, Lcom/roidapp/photogrid/release/kg;

    invoke-direct {v0}, Lcom/roidapp/photogrid/release/kg;-><init>()V

    .line 2100
    invoke-virtual {v0, p1, p2, p3}, Lcom/roidapp/photogrid/release/kg;->a(Ljava/lang/String;II)V

    .line 2101
    const v1, 0x7f0d037e

    const-string v2, "FragmentImagePreview"

    invoke-direct {p0, v1, v0, v2}, Lcom/roidapp/photogrid/release/ImageSelector;->a(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)V

    .line 2102
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->d(Ljava/lang/String;)V

    goto :goto_0

    .line 7139
    :cond_3
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 7140
    if-eqz v0, :cond_2

    .line 7141
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    .line 7142
    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 7144
    :try_start_0
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 7146
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->printStackTrace()V

    goto :goto_1
.end method

.method public final a(Z)Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 2137
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->h()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->isFinishing()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    move v0, v1

    .line 2160
    :goto_0
    return v0

    .line 2140
    :cond_1
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Q:Z

    .line 2141
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->ad:Ljava/lang/String;

    if-eqz v2, :cond_3

    .line 2142
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ImageSelector;->ad:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v2

    .line 2143
    if-eqz v2, :cond_3

    .line 2144
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    .line 2145
    invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    .line 2146
    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 2147
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->ad:Ljava/lang/String;

    .line 2148
    if-eqz p1, :cond_2

    .line 2149
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->I:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ImageSelector;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2150
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    invoke-virtual {p0, v1, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Ljava/lang/String;I)V

    goto :goto_0

    .line 2153
    :cond_2
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->T:Lcom/roidapp/photogrid/release/kp;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/kp;->d()V

    .line 2154
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->I:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ImageSelector;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2155
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->O:Lcom/roidapp/photogrid/release/la;

    iget v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->N:I

    invoke-virtual {v1, v2, v0}, Lcom/roidapp/photogrid/release/la;->a(IZ)V

    goto :goto_0

    :cond_3
    move v0, v1

    .line 2160
    goto :goto_0
.end method

.method public final b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/photogrid/release/ig;",
            ">;"
        }
    .end annotation

    .prologue
    .line 2082
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    return-object v0
.end method

.method protected final b(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 2269
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    .line 2270
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->I:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2271
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Ljava/lang/String;I)V

    .line 2272
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->o:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 2273
    return-void
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1063
    const-string v0, "CartPage"

    return-object v0
.end method

.method protected final d()V
    .locals 1

    .prologue
    .line 2164
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->H:Lcom/roidapp/photogrid/release/kt;

    if-eqz v0, :cond_0

    .line 2165
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->H:Lcom/roidapp/photogrid/release/kt;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kt;->c()V

    .line 2167
    :cond_0
    return-void
.end method

.method public final f()Z
    .locals 2

    .prologue
    .line 2474
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    .prologue
    .line 1404
    const/16 v0, 0x3ea

    if-ne p1, v0, :cond_2

    .line 1405
    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    .line 1418
    :goto_0
    return-void

    .line 1408
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->F:Landroid/net/Uri;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->G:Landroid/os/Bundle;

    const-string v1, "PATH"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1409
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->G:Landroid/os/Bundle;

    const-string v1, "PATH"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->F:Landroid/net/Uri;

    .line 1411
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->F:Landroid/net/Uri;

    if-eqz v0, :cond_2

    .line 1412
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->F:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1413
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->a(Ljava/lang/String;)V

    .line 1414
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.MEDIA_SCANNER_SCAN_FILE"

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->F:Landroid/net/Uri;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->sendBroadcast(Landroid/content/Intent;)V

    .line 1417
    :cond_2
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/photogrid/release/ParentActivity;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 6

    .prologue
    const v4, 0x7f0701ea

    const/16 v3, 0x8

    const/4 v0, 0x1

    const/4 v2, 0x0

    .line 2620
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Q:Z

    if-eqz v1, :cond_1

    .line 7398
    :cond_0
    :goto_0
    return-void

    .line 2623
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    .line 2625
    :sswitch_0
    invoke-direct {p0, v2}, Lcom/roidapp/photogrid/release/ImageSelector;->e(Z)V

    goto :goto_0

    .line 2629
    :sswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 2630
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 2635
    :sswitch_2
    const-string v1, "ImageSelector/toCamrea"

    invoke-static {v1}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 7364
    iget v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    if-ne v1, v0, :cond_3

    .line 7365
    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->C:Z

    if-eqz v1, :cond_2

    move v2, v0

    .line 7373
    :cond_2
    :goto_1
    if-eqz v2, :cond_4

    .line 7374
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 7375
    const/4 v1, 0x7

    iput v1, v0, Landroid/os/Message;->what:I

    .line 7376
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Z:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    goto :goto_0

    .line 7369
    :cond_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget v3, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    if-lt v1, v3, :cond_2

    move v2, v0

    .line 7370
    goto :goto_1

    .line 7379
    :cond_4
    invoke-static {}, Lcom/roidapp/photogrid/release/rf;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 7380
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

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 7385
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "camera_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".jpg"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 7387
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v2

    invoke-virtual {v2, p0, v0, v1}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    .line 7388
    if-eqz v2, :cond_0

    .line 7389
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v3}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->F:Landroid/net/Uri;

    .line 7392
    const/16 v0, 0x3ea

    :try_start_0
    invoke-virtual {p0, v2, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 7394
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_0

    .line 7399
    :cond_5
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07028d

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 2641
    :sswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2642
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->q:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2643
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 2644
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->j()V

    .line 2645
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    .line 2646
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->d:Landroid/widget/GridView;

    if-eqz v0, :cond_7

    move v1, v2

    .line 2647
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->d:Landroid/widget/GridView;

    invoke-virtual {v0}, Landroid/widget/GridView;->getChildCount()I

    move-result v0

    if-ge v1, v0, :cond_7

    .line 2648
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->d:Landroid/widget/GridView;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 2649
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->d:Landroid/widget/GridView;

    invoke-virtual {v0, v1}, Landroid/widget/GridView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ib;

    .line 2650
    iput v2, v0, Lcom/roidapp/photogrid/release/ib;->d:I

    .line 2651
    iget-object v0, v0, Lcom/roidapp/photogrid/release/ib;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2647
    :cond_6
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_2

    .line 2655
    :cond_7
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->c:[I

    if-eqz v0, :cond_8

    move v0, v2

    .line 2656
    :goto_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->c:[I

    array-length v1, v1

    if-ge v0, v1, :cond_8

    .line 2657
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->c:[I

    aput v2, v1, v0

    .line 2656
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 2660
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->e:Lcom/roidapp/photogrid/release/ia;

    if-nez v0, :cond_9

    .line 2661
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->d:Landroid/widget/GridView;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->d:Landroid/widget/GridView;

    invoke-virtual {v0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 2662
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->d:Landroid/widget/GridView;

    invoke-virtual {v0}, Landroid/widget/GridView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/ia;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->e:Lcom/roidapp/photogrid/release/ia;

    .line 2665
    :cond_9
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->e:Lcom/roidapp/photogrid/release/ia;

    if-eqz v0, :cond_a

    .line 2666
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->e:Lcom/roidapp/photogrid/release/ia;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->c:[I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ia;->a([I)V

    .line 2668
    :cond_a
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    new-array v1, v2, [Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 2669
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->C:Z

    .line 2670
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->g()V

    .line 2671
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_b

    .line 2672
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/roidapp/imagelib/ImageLibrary;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->d(Ljava/lang/String;)V

    .line 2674
    :cond_b
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "FragmentImagePreview"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 2675
    if-eqz v0, :cond_0

    .line 2676
    check-cast v0, Lcom/roidapp/photogrid/release/kg;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kg;->a()V

    goto/16 :goto_0

    .line 2681
    :sswitch_4
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    if-eqz v1, :cond_c

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_c

    iget-boolean v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->B:Z

    if-nez v1, :cond_10

    .line 2683
    :cond_c
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    if-eqz v1, :cond_d

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-eqz v1, :cond_d

    .line 2684
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, v4}, Lcom/roidapp/photogrid/release/ImageSelector;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-array v0, v0, [Ljava/lang/Object;

    iget v4, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    iget-object v5, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    sub-int/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v0, v2

    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 2686
    :cond_d
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->P()Z

    move-result v1

    if-eqz v1, :cond_e

    .line 2687
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f0701e9

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 2689
    :cond_e
    iget v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    if-ne v1, v0, :cond_f

    .line 2690
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f0701eb

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/ImageSelector;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 2692
    :cond_f
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, v4}, Lcom/roidapp/photogrid/release/ImageSelector;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-array v0, v0, [Ljava/lang/Object;

    iget v4, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v0, v2

    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 2698
    :cond_10
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->k()V

    goto/16 :goto_0

    .line 2702
    :sswitch_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->p:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_11

    .line 2703
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->p:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2709
    :cond_11
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->M:Landroid/widget/ListView;

    invoke-virtual {v0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    if-nez v0, :cond_14

    .line 2710
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->T:Lcom/roidapp/photogrid/release/kp;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kp;->b()V

    .line 2711
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->M:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->O:Lcom/roidapp/photogrid/release/la;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 2712
    iget v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->N:I

    const/4 v1, 0x2

    if-le v0, v1, :cond_12

    .line 2713
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->M:Landroid/widget/ListView;

    iget v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->N:I

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 2715
    :cond_12
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->L:Landroid/widget/LinearLayout;

    invoke-static {v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->g(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_13

    .line 2716
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->K:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->L:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->f(Landroid/view/View;)V

    goto/16 :goto_0

    .line 2718
    :cond_13
    sget v0, Lcom/roidapp/photogrid/release/ke;->f:I

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Y:I

    .line 2720
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->K:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->L:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->e(Landroid/view/View;)V

    goto/16 :goto_0

    .line 2723
    :cond_14
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->L:Landroid/widget/LinearLayout;

    invoke-static {v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->g(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_15

    .line 2724
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->K:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->L:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->f(Landroid/view/View;)V

    goto/16 :goto_0

    .line 2726
    :cond_15
    sget v0, Lcom/roidapp/photogrid/release/ke;->f:I

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Y:I

    .line 2727
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->T:Lcom/roidapp/photogrid/release/kp;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kp;->b()V

    .line 2728
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->T:Lcom/roidapp/photogrid/release/kp;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kp;->c()V

    .line 2730
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->K:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->L:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->e(Landroid/view/View;)V

    goto/16 :goto_0

    .line 2623
    :sswitch_data_0
    .sparse-switch
        0x7f0d008d -> :sswitch_0
        0x7f0d00ad -> :sswitch_4
        0x7f0d00af -> :sswitch_1
        0x7f0d00b1 -> :sswitch_3
        0x7f0d0378 -> :sswitch_2
        0x7f0d037a -> :sswitch_5
    .end sparse-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 8

    .prologue
    const/16 v7, 0xa5

    const/4 v1, 0x0

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 526
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 527
    invoke-static {}, Lcom/roidapp/photogrid/common/ba;->a()Lcom/roidapp/photogrid/common/ba;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/photogrid/common/ba;->a(Landroid/app/Activity;)V

    .line 529
    const v0, 0x7f0300d4

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 535
    :goto_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->v:Z

    if-nez v0, :cond_5

    .line 536
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->z:Ljava/util/List;

    .line 537
    const v0, 0x7f0d00b3

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->f:Landroid/widget/LinearLayout;

    .line 538
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->s:Ljava/util/HashMap;

    .line 539
    const v0, 0x7f0d00af

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->g:Landroid/widget/TextView;

    .line 540
    const v0, 0x7f0d00b0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->h:Landroid/widget/TextView;

    .line 541
    const v0, 0x7f0d008b

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->l:Landroid/widget/ProgressBar;

    .line 542
    const v0, 0x7f0d00b2

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/HorizontalScrollView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->i:Landroid/widget/HorizontalScrollView;

    .line 543
    const v0, 0x7f0d040d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->m:Landroid/widget/RelativeLayout;

    .line 544
    const v0, 0x7f0d01ac

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->n:Landroid/widget/TextView;

    .line 545
    const v0, 0x7f0d00b4

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->q:Landroid/widget/TextView;

    .line 546
    const v0, 0x7f0d0102

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/GridView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->d:Landroid/widget/GridView;

    .line 548
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0701b8

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->V:Ljava/lang/String;

    .line 549
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f070268

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->W:Ljava/lang/String;

    .line 550
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->K()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    .line 551
    iget v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    if-nez v0, :cond_0

    .line 552
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ak()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    .line 554
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->P()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 555
    iget v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    if-ne v0, v6, :cond_6

    .line 556
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->q:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0701f1

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 568
    :goto_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 569
    if-eqz v0, :cond_a

    .line 570
    const-string v2, "fromCloud"

    invoke-virtual {v0, v2, v5}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->R:Z

    .line 572
    const-string v2, "folder_path"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_9

    .line 573
    const-string v2, "folder_path"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    .line 591
    :goto_2
    const v0, 0x7f0d037d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->P:Landroid/widget/FrameLayout;

    .line 599
    const v0, 0x7f0d008d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 604
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 606
    const v0, 0x7f0d037b

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->I:Landroid/widget/TextView;

    .line 607
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->I:Landroid/widget/TextView;

    const v2, 0x7f0701a0

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 609
    const v0, 0x7f0d0378

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->o:Landroid/widget/ImageButton;

    .line 610
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->o:Landroid/widget/ImageButton;

    invoke-virtual {v0, v7}, Landroid/widget/ImageButton;->setAlpha(I)V

    .line 611
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->o:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 612
    const v0, 0x7f0d00b1

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->p:Landroid/widget/TextView;

    .line 613
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->p:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 614
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f02037b

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 615
    invoke-virtual {v0, v7}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 616
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->g:Landroid/widget/TextView;

    invoke-virtual {v2, v0, v1, v1, v1}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 617
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 618
    const v0, 0x7f0d037c

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->r:Landroid/widget/RelativeLayout;

    .line 619
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->r:Landroid/widget/RelativeLayout;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->ac:Landroid/view/View$OnTouchListener;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 620
    const v0, 0x7f0d00ad

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->j:Landroid/widget/LinearLayout;

    .line 631
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p0}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 636
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->g()V

    .line 4067
    const-string v0, "DebugMode"

    invoke-virtual {p0, v0, v5}, Lcom/roidapp/photogrid/release/ImageSelector;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 4068
    const-string v2, "DebugMode"

    invoke-interface {v0, v2, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 3074
    if-eqz v0, :cond_1

    .line 3075
    new-instance v0, Lcom/roidapp/photogrid/common/al;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Z:Landroid/os/Handler;

    invoke-direct {v0, p0, v2}, Lcom/roidapp/photogrid/common/al;-><init>(Landroid/app/Activity;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->ab:Lcom/roidapp/photogrid/common/al;

    .line 3076
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->ab:Lcom/roidapp/photogrid/common/al;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/al;->b()V

    .line 3077
    invoke-static {}, Lcom/roidapp/photogrid/common/ba;->a()Lcom/roidapp/photogrid/common/ba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/ba;->b()V

    .line 638
    :cond_1
    const-string v0, "IS/create"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 641
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 642
    const-string v2, "NEW_USER_SELECTOR"

    invoke-interface {v0, v2, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 643
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "NEW_USER_SELECTOR"

    invoke-interface {v2, v3, v5}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 646
    :cond_2
    const-string v2, "image_selector_sliding_new"

    invoke-interface {v0, v2, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->S:Z

    .line 656
    sget v0, Lcom/roidapp/photogrid/common/az;->q:I

    packed-switch v0, :pswitch_data_0

    .line 689
    :goto_3
    :pswitch_0
    const v0, 0x7f0d037a

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->aa:Landroid/view/View;

    .line 690
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->aa:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 691
    const v0, 0x7f0d00e7

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    .line 692
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->ac:Landroid/view/View$OnTouchListener;

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 693
    sget-boolean v0, Lcom/roidapp/photogrid/common/az;->w:Z

    if-eqz v0, :cond_3

    .line 694
    const-string v0, "FreeCrop"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->E:Ljava/lang/String;

    .line 707
    :cond_3
    new-instance v0, Lcom/roidapp/photogrid/release/kt;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Z:Landroid/os/Handler;

    invoke-direct {v0, p0, v2}, Lcom/roidapp/photogrid/release/kt;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->H:Lcom/roidapp/photogrid/release/kt;

    .line 4716
    const/16 v0, 0x64

    .line 4717
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 4718
    const/16 v3, 0x1e0

    if-gt v2, v3, :cond_b

    .line 4719
    const/16 v0, 0x46

    .line 4723
    :cond_4
    :goto_4
    new-instance v2, Lcom/roidapp/photogrid/release/kp;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ImageSelector;->Z:Landroid/os/Handler;

    invoke-direct {v2, p0, v0, v3}, Lcom/roidapp/photogrid/release/kp;-><init>(Landroid/content/Context;ILandroid/os/Handler;)V

    iput-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->T:Lcom/roidapp/photogrid/release/kp;

    .line 4725
    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 4726
    iput-boolean v5, v0, Landroid/graphics/BitmapFactory$Options;->inScaled:Z

    .line 4728
    :try_start_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f020086

    invoke-static {v2, v3, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;ILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v0

    .line 4736
    :goto_5
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->T:Lcom/roidapp/photogrid/release/kp;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/kp;->a(Landroid/graphics/Bitmap;)V

    .line 4741
    const v0, 0x7f0d002d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/FixedDrawerLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->K:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    .line 4742
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->K:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    invoke-virtual {v0, v5}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->setFocusableInTouchMode(Z)V

    .line 4743
    const v0, 0x7f0d002f

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->L:Landroid/widget/LinearLayout;

    .line 4744
    const v0, 0x7f0d0031

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->M:Landroid/widget/ListView;

    .line 4747
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->K:Lcom/roidapp/baselib/view/FixedDrawerLayout;

    new-instance v1, Lcom/roidapp/photogrid/release/jy;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/jy;-><init>(Lcom/roidapp/photogrid/release/ImageSelector;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->a(Lcom/roidapp/baselib/view/j;)V

    .line 4842
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->M:Landroid/widget/ListView;

    new-instance v1, Lcom/roidapp/photogrid/release/jz;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/release/jz;-><init>(Lcom/roidapp/photogrid/release/ImageSelector;)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 710
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->H:Lcom/roidapp/photogrid/release/kt;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/kt;->a()V

    .line 712
    :cond_5
    return-void

    .line 531
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 532
    iput-boolean v6, p0, Lcom/roidapp/photogrid/release/ImageSelector;->v:Z

    .line 533
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto/16 :goto_0

    .line 558
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->q:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0701f0

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-array v3, v6, [Ljava/lang/Object;

    iget v4, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 561
    :cond_7
    iget v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    if-ne v0, v6, :cond_8

    .line 562
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->q:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0701f3

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 564
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->q:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0701f2

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-array v3, v6, [Ljava/lang/Object;

    iget v4, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v5

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    .line 575
    :cond_9
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v5}, Lcom/roidapp/photogrid/release/ImageSelector;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v2, "folder_name"

    const-string v3, ""

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    goto/16 :goto_2

    .line 578
    :cond_a
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v5}, Lcom/roidapp/photogrid/release/ImageSelector;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v2, "folder_name"

    const-string v3, ""

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->A:Ljava/lang/String;

    goto/16 :goto_2

    .line 658
    :pswitch_1
    const-string v0, "GridActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->E:Ljava/lang/String;

    goto/16 :goto_3

    .line 661
    :pswitch_2
    const-string v0, "GridActivity/Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->E:Ljava/lang/String;

    goto/16 :goto_3

    .line 664
    :pswitch_3
    const-string v0, "VideoActivity/Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->E:Ljava/lang/String;

    goto/16 :goto_3

    .line 667
    :pswitch_4
    const-string v0, "CameraActivity/Single"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->E:Ljava/lang/String;

    goto/16 :goto_3

    .line 670
    :pswitch_5
    const-string v0, "GridActivity/Movie"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->E:Ljava/lang/String;

    goto/16 :goto_3

    .line 673
    :pswitch_6
    const-string v0, "FreeActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->E:Ljava/lang/String;

    goto/16 :goto_3

    .line 676
    :pswitch_7
    const-string v0, "VideoActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->E:Ljava/lang/String;

    goto/16 :goto_3

    .line 679
    :pswitch_8
    const-string v0, "WideActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->E:Ljava/lang/String;

    goto/16 :goto_3

    .line 682
    :pswitch_9
    const-string v0, "HighActivity"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->E:Ljava/lang/String;

    goto/16 :goto_3

    .line 685
    :pswitch_a
    const-string v0, "GridActivity/Template"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->E:Ljava/lang/String;

    goto/16 :goto_3

    .line 4720
    :cond_b
    const/16 v3, 0x5a0

    if-lt v2, v3, :cond_4

    .line 4721
    const/16 v0, 0x96

    goto/16 :goto_4

    .line 4730
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    move-object v0, v1

    .line 4735
    goto/16 :goto_5

    .line 4733
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move-object v0, v1

    .line 4734
    goto/16 :goto_5

    .line 656
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_6
        :pswitch_8
        :pswitch_9
        :pswitch_a
        :pswitch_2
        :pswitch_7
        :pswitch_0
        :pswitch_5
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public onDestroy()V
    .locals 1

    .prologue
    .line 1153
    const-string v0, "IS/des"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 1154
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->J:Z

    .line 1160
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->T:Lcom/roidapp/photogrid/release/kp;

    .line 1161
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onDestroy()V

    .line 1162
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 1083
    const/4 v1, 0x4

    if-ne p1, v1, :cond_2

    .line 1084
    const-string v1, "FragmentImagePreview"

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ImageSelector;->ad:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->c(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1095
    :goto_0
    return v0

    .line 1087
    :cond_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->p:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getVisibility()I

    move-result v1

    if-nez v1, :cond_1

    .line 1088
    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->p:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 1090
    :cond_1
    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->e(Z)V

    goto :goto_0

    .line 1095
    :cond_2
    invoke-super {p0, p1, p2}, Lcom/roidapp/photogrid/release/ParentActivity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onPause()V
    .locals 2

    .prologue
    .line 1105
    const-string v0, "FragmentImagePreview"

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->ad:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1106
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/release/ImageSelector;->c(Z)Z

    .line 1108
    :cond_0
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onPause()V

    .line 1109
    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 1422
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 1423
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->G:Landroid/os/Bundle;

    .line 1424
    return-void
.end method

.method public onResume()V
    .locals 1

    .prologue
    .line 1098
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onResume()V

    .line 1099
    iget v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->a:I

    if-nez v0, :cond_0

    .line 1100
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->i()V

    .line 1102
    :cond_0
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 1428
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->F:Landroid/net/Uri;

    if-eqz v0, :cond_0

    .line 1429
    const-string v0, "PATH"

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ImageSelector;->F:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1430
    :cond_0
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 1431
    return-void
.end method

.method public onStart()V
    .locals 1

    .prologue
    .line 2745
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onStart()V

    .line 2746
    const-string v0, "ImageSelector/start"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 2747
    const-string v0, "ImageSelector"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;)V

    .line 2748
    return-void
.end method

.method protected onStop()V
    .locals 2

    .prologue
    .line 2752
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onStop()V

    .line 2753
    const-string v0, "ImageSelector"

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/ImageSelector;->A()I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;I)V

    .line 2754
    return-void
.end method

.method public final x()V
    .locals 1

    .prologue
    .line 1058
    const-string v0, "image_selector"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/ImageSelector;->t:Ljava/lang/String;

    .line 1059
    return-void
.end method
