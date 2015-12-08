.class public final Lcom/roidapp/photogrid/video/bp;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnTouchListener;
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Lcom/roidapp/baselib/view/d;
.implements Lcom/roidapp/baselib/view/u;


# static fields
.field private static l:I

.field private static m:I

.field private static n:[Z


# instance fields
.field private a:Lcom/roidapp/photogrid/video/VideoPictureEditActivity;

.field private b:Lcom/roidapp/baselib/view/DraggableGridView;

.field private c:Lcom/roidapp/photogrid/video/ca;

.field private d:[Lcom/roidapp/photogrid/release/ig;

.field private e:Lcom/roidapp/baselib/view/r;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:I

.field private i:Z

.field private j:Z

.field private k:Z

.field private o:[Ljava/lang/String;

.field private p:Z

.field private q:Landroid/widget/RelativeLayout;

.field private r:Landroid/widget/TextView;

.field private s:Z

.field private t:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 59
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 70
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/bp;->i:Z

    .line 71
    iput-boolean v1, p0, Lcom/roidapp/photogrid/video/bp;->j:Z

    .line 72
    iput-boolean v1, p0, Lcom/roidapp/photogrid/video/bp;->k:Z

    .line 87
    iput-object v2, p0, Lcom/roidapp/photogrid/video/bp;->o:[Ljava/lang/String;

    .line 88
    iput-boolean v1, p0, Lcom/roidapp/photogrid/video/bp;->p:Z

    .line 91
    iput-boolean v1, p0, Lcom/roidapp/photogrid/video/bp;->s:Z

    .line 92
    iput-object v2, p0, Lcom/roidapp/photogrid/video/bp;->t:Landroid/widget/ImageView;

    .line 1190
    return-void
.end method

.method private a(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 558
    .line 561
    :try_start_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const/4 v1, 0x1

    new-array v2, v1, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v3, "_data"

    aput-object v3, v2, v1

    const/4 v5, 0x0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 562
    if-eqz v1, :cond_1

    .line 563
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 564
    const-string v0, "_data"

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v1, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v0

    .line 570
    :goto_0
    if-eqz v1, :cond_0

    .line 572
    :try_start_2
    invoke-interface {v1}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 577
    :cond_0
    :goto_1
    return-object v0

    .line 567
    :catch_0
    move-exception v0

    move-object v1, v6

    :goto_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move-object v0, v6

    .line 568
    goto :goto_0

    .line 574
    :catch_1
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    .line 567
    :catch_2
    move-exception v0

    goto :goto_2

    :cond_1
    move-object v0, v6

    goto :goto_0
.end method

.method private a(I)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 581
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 582
    const v1, 0x7f0702e7

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 583
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 584
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    .line 585
    const v1, 0x7f07032f

    new-instance v2, Lcom/roidapp/photogrid/video/bx;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/video/bx;-><init>(Lcom/roidapp/photogrid/video/bp;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 590
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 591
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog;->setCancelable(Z)V

    .line 592
    invoke-virtual {v0, v3}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 593
    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 594
    return-void
.end method

.method private a(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 897
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 898
    iget-object v1, p0, Lcom/roidapp/photogrid/video/bp;->b:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-virtual {v1, v0}, Lcom/roidapp/baselib/view/DraggableGridView;->getLocationOnScreen([I)V

    .line 899
    aget v1, v0, v3

    .line 900
    aget v2, v0, v4

    .line 902
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 903
    aget v3, v0, v3

    .line 904
    aget v0, v0, v4

    .line 906
    sub-int v1, v3, v1

    .line 907
    sub-int/2addr v0, v2

    .line 908
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    add-int/2addr v2, v1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {p2, v1, v0, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 909
    return-void
.end method

.method private a(Lcom/roidapp/photogrid/release/ig;I)V
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 782
    const-string v0, "Video/SingleEdit"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 783
    const/16 v0, 0x9

    sput v0, Lcom/roidapp/photogrid/common/az;->q:I

    .line 785
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    .line 787
    invoke-virtual {v3, v1}, Lcom/roidapp/photogrid/release/ih;->k(I)V

    .line 788
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/util/List;)V

    .line 789
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->d:[Lcom/roidapp/photogrid/release/ig;

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/ih;->b([Lcom/roidapp/photogrid/release/ig;)V

    .line 790
    invoke-virtual {v3, v2}, Lcom/roidapp/photogrid/release/ih;->i(I)V

    .line 792
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->av()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 793
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->am()V

    .line 799
    :goto_0
    sput-boolean v2, Lcom/roidapp/photogrid/common/az;->F:Z

    .line 800
    iput-boolean v2, p1, Lcom/roidapp/photogrid/release/ig;->m:Z

    .line 802
    iput p2, p1, Lcom/roidapp/photogrid/release/ig;->h:I

    .line 803
    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/bp;->p:Z

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->ax()Z

    move-result v4

    if-eq v0, v4, :cond_0

    .line 804
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/bp;->f()V

    .line 806
    :cond_0
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->ax()Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    :goto_1
    iput-boolean v0, p1, Lcom/roidapp/photogrid/release/ig;->B:Z

    .line 807
    invoke-virtual {p1}, Lcom/roidapp/photogrid/release/ig;->f()V

    .line 808
    new-array v0, v1, [Lcom/roidapp/photogrid/release/ig;

    aput-object p1, v0, v2

    invoke-virtual {v3, v0}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 810
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 811
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 812
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/bp;->startActivity(Landroid/content/Intent;)V

    .line 813
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 814
    return-void

    .line 795
    :cond_1
    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->al()V

    goto :goto_0

    :cond_2
    move v0, v2

    .line 806
    goto :goto_1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/video/bp;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/bp;->d()V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/video/bp;Lcom/roidapp/photogrid/release/ig;I)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0, p1, p2}, Lcom/roidapp/photogrid/video/bp;->a(Lcom/roidapp/photogrid/release/ig;I)V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/video/bp;[Lcom/roidapp/photogrid/release/ig;)[Lcom/roidapp/photogrid/release/ig;
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lcom/roidapp/photogrid/video/bp;->d:[Lcom/roidapp/photogrid/release/ig;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/video/bp;[Ljava/lang/String;)[Ljava/lang/String;
    .locals 0

    .prologue
    .line 59
    iput-object p1, p0, Lcom/roidapp/photogrid/video/bp;->o:[Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lcom/roidapp/photogrid/video/bp;)Lcom/roidapp/photogrid/video/ca;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->c:Lcom/roidapp/photogrid/video/ca;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/video/bp;)[Lcom/roidapp/photogrid/release/ig;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->d:[Lcom/roidapp/photogrid/release/ig;

    return-object v0
.end method

.method static synthetic c()[Z
    .locals 1

    .prologue
    .line 59
    sget-object v0, Lcom/roidapp/photogrid/video/bp;->n:[Z

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/video/bp;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->f:Landroid/widget/TextView;

    return-object v0
.end method

.method private d()V
    .locals 1

    .prologue
    .line 252
    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/bp;->s:Z

    if-eqz v0, :cond_1

    .line 262
    :cond_0
    :goto_0
    return-void

    .line 255
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/bp;->s:Z

    .line 256
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/bp;->e()V

    .line 258
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->aj()V

    .line 259
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->a:Lcom/roidapp/photogrid/video/VideoPictureEditActivity;

    if-eqz v0, :cond_0

    .line 260
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->a:Lcom/roidapp/photogrid/video/VideoPictureEditActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/VideoPictureEditActivity;->a()V

    goto :goto_0
.end method

.method private e()V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 271
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->b:Lcom/roidapp/baselib/view/DraggableGridView;

    if-eqz v0, :cond_0

    .line 272
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->b:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->a()V

    .line 273
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->b:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/DraggableGridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 274
    iput-object v1, p0, Lcom/roidapp/photogrid/video/bp;->b:Lcom/roidapp/baselib/view/DraggableGridView;

    .line 277
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->c:Lcom/roidapp/photogrid/video/ca;

    if-eqz v0, :cond_1

    .line 278
    iput-object v1, p0, Lcom/roidapp/photogrid/video/bp;->c:Lcom/roidapp/photogrid/video/ca;

    .line 281
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->r:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 282
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->r:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getResources()Landroid/content/res/Resources;

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

    .line 284
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->q:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_3

    .line 285
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->q:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 287
    :cond_3
    return-void
.end method

.method static synthetic e(Lcom/roidapp/photogrid/video/bp;)[Ljava/lang/String;
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->o:[Ljava/lang/String;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/video/bp;)I
    .locals 1

    .prologue
    .line 59
    iget v0, p0, Lcom/roidapp/photogrid/video/bp;->h:I

    return v0
.end method

.method private f()V
    .locals 5

    .prologue
    .line 597
    iget-object v1, p0, Lcom/roidapp/photogrid/video/bp;->d:[Lcom/roidapp/photogrid/release/ig;

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 598
    const/4 v4, 0x0

    iput-object v4, v3, Lcom/roidapp/photogrid/release/ig;->f:Ljava/lang/String;

    .line 597
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 600
    :cond_0
    return-void
.end method

.method private g()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1207
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->f:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 1208
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1209
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->g:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 1210
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1211
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->t:Landroid/widget/ImageView;

    if-eqz v0, :cond_2

    .line 1212
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->t:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1213
    :cond_2
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 889
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/bp;->g()V

    .line 890
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->d:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-nez v0, :cond_0

    .line 891
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/bp;->d()V

    .line 893
    :cond_0
    return-void
.end method

.method public final a(II)V
    .locals 1

    .prologue
    .line 841
    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/bp;->i:Z

    if-eqz v0, :cond_0

    .line 842
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/bp;->i:Z

    .line 844
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->c:Lcom/roidapp/photogrid/video/ca;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/photogrid/video/ca;->a(II)V

    .line 845
    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 2

    .prologue
    const/16 v1, 0x8

    .line 823
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/bp;->j:Z

    .line 3197
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->f:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 3198
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->f:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3199
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->g:Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 3200
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->g:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3201
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->t:Landroid/widget/ImageView;

    if-eqz v0, :cond_2

    .line 3202
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->t:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 825
    :cond_2
    instance-of v0, p1, Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_3

    .line 826
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/cb;

    .line 827
    if-eqz v0, :cond_3

    .line 828
    iget-object v0, v0, Lcom/roidapp/photogrid/video/cb;->b:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 831
    :cond_3
    return-void
.end method

.method public final a(Landroid/view/View;I)Z
    .locals 7

    .prologue
    const/4 v2, 0x2

    const/4 v6, 0x0

    const/4 v5, 0x1

    .line 913
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 914
    new-array v1, v2, [I

    .line 915
    invoke-virtual {p1, v1}, Landroid/view/View;->getLocationInWindow([I)V

    .line 917
    invoke-virtual {p1, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 919
    new-array v2, v2, [I

    .line 920
    iget-object v3, p0, Lcom/roidapp/photogrid/video/bp;->b:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-virtual {v3, v2}, Lcom/roidapp/baselib/view/DraggableGridView;->getLocationOnScreen([I)V

    .line 922
    aget v3, v1, v6

    aget v4, v2, v6

    sub-int/2addr v3, v4

    aput v3, v1, v6

    .line 923
    aget v3, v1, v5

    aget v2, v2, v5

    sub-int v2, v3, v2

    aput v2, v1, v5

    .line 925
    iget-object v2, p0, Lcom/roidapp/photogrid/video/bp;->t:Landroid/widget/ImageView;

    invoke-direct {p0, v2, v0}, Lcom/roidapp/photogrid/video/bp;->a(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 928
    aget v2, v1, v5

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v3

    add-int/2addr v2, v3

    aget v1, v1, v5

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v3

    add-int/2addr v1, v3

    invoke-virtual {v0, p2, v2, p2, v1}, Landroid/graphics/Rect;->contains(IIII)Z

    move-result v0

    .line 4215
    if-eqz v0, :cond_0

    .line 4217
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f020410

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 4218
    iget-object v2, p0, Lcom/roidapp/photogrid/video/bp;->t:Landroid/widget/ImageView;

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4219
    iget-object v1, p0, Lcom/roidapp/photogrid/video/bp;->t:Landroid/widget/ImageView;

    const v2, 0x7f020600

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 930
    :goto_0
    return v0

    .line 4222
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f02040f

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 4223
    iget-object v2, p0, Lcom/roidapp/photogrid/video/bp;->t:Landroid/widget/ImageView;

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4224
    iget-object v1, p0, Lcom/roidapp/photogrid/video/bp;->t:Landroid/widget/ImageView;

    const/high16 v2, -0x1000000

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    goto :goto_0
.end method

.method public final a(Landroid/view/View;I[I)[I
    .locals 9

    .prologue
    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 854
    instance-of v0, p1, Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    .line 855
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/cb;

    .line 856
    iget-object v1, v0, Lcom/roidapp/photogrid/video/cb;->b:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->isShown()Z

    move-result v1

    if-nez v1, :cond_0

    .line 857
    iget-object v0, v0, Lcom/roidapp/photogrid/video/cb;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setVisibility(I)V

    .line 861
    :cond_0
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 862
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->t:Landroid/widget/ImageView;

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/video/bp;->a(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 863
    const/4 v0, 0x0

    .line 865
    if-eqz p1, :cond_2

    aget v2, p3, v7

    aget v3, p3, v8

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    add-int/2addr v3, v4

    aget v4, p3, v7

    aget v5, p3, v8

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v6

    add-int/2addr v5, v6

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/graphics/Rect;->contains(IIII)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 3666
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->c:Lcom/roidapp/photogrid/video/ca;

    if-eqz v0, :cond_1

    .line 3669
    sget-object v0, Lcom/roidapp/photogrid/video/bp;->n:[Z

    aput-boolean v7, v0, p2

    .line 3670
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->c:Lcom/roidapp/photogrid/video/ca;

    invoke-virtual {v0, p2}, Lcom/roidapp/photogrid/video/ca;->a(I)V

    .line 869
    :cond_1
    const/4 v0, 0x2

    new-array v0, v0, [I

    .line 870
    iget-object v1, p0, Lcom/roidapp/photogrid/video/bp;->t:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->getLocationOnScreen([I)V

    .line 873
    aget v1, v0, v7

    iget-object v2, p0, Lcom/roidapp/photogrid/video/bp;->t:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getMeasuredWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v1, v2

    aput v1, v0, v7

    .line 874
    aget v1, v0, v8

    iget-object v2, p0, Lcom/roidapp/photogrid/video/bp;->t:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getMeasuredHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    add-int/2addr v1, v2

    aput v1, v0, v8

    .line 881
    :goto_0
    iput-boolean v7, p0, Lcom/roidapp/photogrid/video/bp;->j:Z

    .line 882
    iput-boolean v7, p0, Lcom/roidapp/photogrid/video/bp;->k:Z

    .line 883
    iput-boolean v8, p0, Lcom/roidapp/photogrid/video/bp;->i:Z

    .line 884
    return-object v0

    .line 878
    :cond_2
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/bp;->g()V

    .line 879
    iget-object v1, p0, Lcom/roidapp/photogrid/video/bp;->c:Lcom/roidapp/photogrid/video/ca;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/ca;->a()V

    goto :goto_0
.end method

.method public final b()V
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 340
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 341
    const-string v0, "video_exit_tip"

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 342
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v4, 0x7f0300ed

    const/4 v5, 0x0

    invoke-virtual {v0, v4, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 344
    if-eqz v4, :cond_0

    .line 345
    const v0, 0x7f0d03c1

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    .line 346
    const-string v5, "video_exit_tip"

    invoke-interface {v3, v5, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    if-nez v5, :cond_1

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 347
    const v1, 0x7f0d03c0

    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Lcom/roidapp/photogrid/video/br;

    invoke-direct {v2, p0, v0}, Lcom/roidapp/photogrid/video/br;-><init>(Lcom/roidapp/photogrid/video/bp;Landroid/widget/CheckBox;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 353
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x1080027

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f070325

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f070043

    new-instance v4, Lcom/roidapp/photogrid/video/bt;

    invoke-direct {v4, p0, v3, v0}, Lcom/roidapp/photogrid/video/bt;-><init>(Lcom/roidapp/photogrid/video/bp;Landroid/content/SharedPreferences;Landroid/widget/CheckBox;)V

    invoke-virtual {v1, v2, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f070044

    new-instance v4, Lcom/roidapp/photogrid/video/bs;

    invoke-direct {v4, p0, v3, v0}, Lcom/roidapp/photogrid/video/bs;-><init>(Lcom/roidapp/photogrid/video/bp;Landroid/content/SharedPreferences;Landroid/widget/CheckBox;)V

    invoke-virtual {v1, v2, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 379
    :cond_0
    :goto_1
    return-void

    :cond_1
    move v1, v2

    .line 346
    goto :goto_0

    .line 377
    :cond_2
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/bp;->d()V

    goto :goto_1
.end method

.method public final b(II)V
    .locals 8

    .prologue
    const/4 v1, 0x1

    .line 980
    sparse-switch p1, :sswitch_data_0

    .line 6424
    :cond_0
    :goto_0
    return-void

    .line 982
    :sswitch_0
    iput-boolean v1, p0, Lcom/roidapp/photogrid/video/bp;->k:Z

    .line 983
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->b:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-virtual {v0, p2}, Lcom/roidapp/baselib/view/DraggableGridView;->a(I)V

    goto :goto_0

    .line 986
    :sswitch_1
    if-ltz p2, :cond_1

    sget-object v0, Lcom/roidapp/photogrid/video/bp;->n:[Z

    if-eqz v0, :cond_1

    sget-object v0, Lcom/roidapp/photogrid/video/bp;->n:[Z

    array-length v0, v0

    if-ge p2, v0, :cond_1

    sget-object v0, Lcom/roidapp/photogrid/video/bp;->n:[Z

    aget-boolean v0, v0, p2

    if-nez v0, :cond_1

    .line 987
    sget-object v0, Lcom/roidapp/photogrid/video/bp;->n:[Z

    aput-boolean v1, v0, p2

    .line 988
    sget v0, Lcom/roidapp/photogrid/video/bp;->m:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/roidapp/photogrid/video/bp;->m:I

    .line 990
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->c:Lcom/roidapp/photogrid/video/ca;

    invoke-virtual {v0, p2}, Lcom/roidapp/photogrid/video/ca;->b(I)Lcom/roidapp/photogrid/release/ig;

    move-result-object v4

    .line 991
    if-eqz v4, :cond_0

    .line 992
    iget-object v0, v4, Lcom/roidapp/photogrid/release/ig;->e:Ljava/lang/String;

    if-nez v0, :cond_2

    .line 993
    invoke-direct {p0, v4, p2}, Lcom/roidapp/photogrid/video/bp;->a(Lcom/roidapp/photogrid/release/ig;I)V

    goto :goto_0

    .line 6388
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 6389
    const-string v0, "video_single_edit_tip"

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 6390
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0300ed

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 6391
    if-eqz v1, :cond_0

    .line 6392
    const v0, 0x7f0d03c1

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/CheckBox;

    .line 6393
    const v0, 0x7f0d03bf

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 6394
    const v5, 0x7f07031a

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(I)V

    .line 6395
    const v0, 0x7f0d03c0

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v5, Lcom/roidapp/photogrid/video/bu;

    invoke-direct {v5, p0, v2}, Lcom/roidapp/photogrid/video/bu;-><init>(Lcom/roidapp/photogrid/video/bp;Landroid/widget/CheckBox;)V

    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6401
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v5

    invoke-direct {v0, v5}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v5, 0x1080027

    invoke-virtual {v0, v5}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v5, 0x7f0702e7

    invoke-virtual {v0, v5}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v6

    const v7, 0x7f07016b

    new-instance v0, Lcom/roidapp/photogrid/video/bw;

    move-object v1, p0

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/photogrid/video/bw;-><init>(Lcom/roidapp/photogrid/video/bp;Landroid/widget/CheckBox;Landroid/content/SharedPreferences;Lcom/roidapp/photogrid/release/ig;I)V

    invoke-virtual {v6, v7, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f07016a

    new-instance v2, Lcom/roidapp/photogrid/video/bv;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/video/bv;-><init>(Lcom/roidapp/photogrid/video/bp;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto/16 :goto_0

    .line 6425
    :cond_3
    invoke-direct {p0, v4, p2}, Lcom/roidapp/photogrid/video/bp;->a(Lcom/roidapp/photogrid/release/ig;I)V

    goto/16 :goto_0

    .line 1001
    :sswitch_2
    sget-object v0, Lcom/roidapp/photogrid/video/bp;->n:[Z

    const/4 v1, 0x0

    aput-boolean v1, v0, p2

    .line 1002
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->c:Lcom/roidapp/photogrid/video/ca;

    invoke-virtual {v0, p2}, Lcom/roidapp/photogrid/video/ca;->a(I)V

    .line 1003
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->d:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-nez v0, :cond_0

    .line 1004
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/bp;->d()V

    goto/16 :goto_0

    .line 980
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x1 -> :sswitch_2
        0x64 -> :sswitch_0
    .end sparse-switch
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 8

    .prologue
    const v7, 0x7f070026

    const/4 v6, 0x1

    const v5, 0x7f070181

    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 431
    packed-switch p1, :pswitch_data_0

    .line 538
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    .line 541
    :cond_0
    :goto_0
    return-void

    .line 433
    :pswitch_0
    if-eqz p3, :cond_0

    .line 436
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    .line 438
    if-eqz v0, :cond_0

    .line 439
    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 440
    const-string v3, "com.google.android.apps.docs.storage"

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 441
    invoke-direct {p0, v5}, Lcom/roidapp/photogrid/video/bp;->a(I)V

    goto :goto_0

    .line 443
    :cond_1
    const-string v3, "com.google.android.apps.docs.files"

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 444
    invoke-direct {p0, v5}, Lcom/roidapp/photogrid/video/bp;->a(I)V

    goto :goto_0

    .line 446
    :cond_2
    const-string v3, "com.google.android.apps.photos.content"

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 447
    invoke-direct {p0, v5}, Lcom/roidapp/photogrid/video/bp;->a(I)V

    goto :goto_0

    .line 451
    :cond_3
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "file:///"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 452
    invoke-virtual {v0}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 504
    :goto_1
    if-nez v0, :cond_d

    .line 505
    invoke-direct {p0, v7}, Lcom/roidapp/photogrid/video/bp;->a(I)V

    goto :goto_0

    .line 454
    :cond_4
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x13

    if-lt v3, v4, :cond_c

    invoke-static {}, Lcom/roidapp/photogrid/common/bo;->a()Lcom/roidapp/photogrid/common/bo;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-static {v3, v0}, Lcom/roidapp/photogrid/common/bo;->a(Landroid/content/Context;Landroid/net/Uri;)Z

    move-result v3

    if-eqz v3, :cond_c

    .line 456
    const-string v3, "com.android.providers.media.documents"

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 457
    invoke-static {}, Lcom/roidapp/photogrid/common/bo;->a()Lcom/roidapp/photogrid/common/bo;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/bo;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    .line 458
    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, v6

    .line 459
    const-string v2, "_id=?"

    .line 460
    sget-object v3, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    new-array v4, v6, [Ljava/lang/String;

    aput-object v0, v4, v1

    invoke-direct {p0, v3, v2, v4}, Lcom/roidapp/photogrid/video/bp;->a(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 462
    :cond_5
    const-string v3, "com.android.providers.downloads.documents"

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 463
    invoke-static {}, Lcom/roidapp/photogrid/common/bo;->a()Lcom/roidapp/photogrid/common/bo;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/bo;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    .line 464
    const-string v3, "content://downloads/public_downloads"

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static {v3, v4, v5}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    move-result-object v0

    .line 466
    invoke-direct {p0, v0, v2, v2}, Lcom/roidapp/photogrid/video/bp;->a(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 468
    :cond_6
    const-string v3, "com.android.externalstorage.documents"

    invoke-virtual {v0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 469
    invoke-static {}, Lcom/roidapp/photogrid/common/bo;->a()Lcom/roidapp/photogrid/common/bo;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/bo;->a(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    .line 470
    const-string v3, ":"

    invoke-virtual {v0, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 471
    aget-object v3, v0, v1

    .line 472
    aget-object v4, v0, v6

    .line 473
    const-string v0, "primary"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 474
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    .line 476
    :cond_7
    new-instance v0, Ljava/io/File;

    const-string v3, "/storage"

    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    .line 477
    if-nez v3, :cond_8

    .line 478
    invoke-direct {p0, v7}, Lcom/roidapp/photogrid/video/bp;->a(I)V

    goto/16 :goto_0

    :cond_8
    move v0, v1

    .line 481
    :goto_2
    array-length v5, v3

    if-ge v0, v5, :cond_a

    .line 482
    new-instance v5, Ljava/io/File;

    aget-object v6, v3, v0

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v5

    if-eqz v5, :cond_9

    .line 483
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v0, v3, v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    .line 481
    :cond_9
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_a
    move-object v0, v2

    .line 488
    goto/16 :goto_1

    .line 492
    :cond_b
    :try_start_0
    invoke-static {}, Lcom/roidapp/photogrid/common/bo;->a()Lcom/roidapp/photogrid/common/bo;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/bo;->a(Landroid/net/Uri;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto/16 :goto_1

    .line 494
    :catch_0
    move-exception v0

    invoke-direct {p0, v5}, Lcom/roidapp/photogrid/video/bp;->a(I)V

    goto/16 :goto_0

    .line 500
    :cond_c
    invoke-direct {p0, v0, v2, v2}, Lcom/roidapp/photogrid/video/bp;->a(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_1

    .line 508
    :cond_d
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    .line 509
    const-string v3, ".png"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_e

    const-string v3, ".jpg"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_e

    const-string v3, ".gif"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_e

    const-string v3, ".bmp"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_e

    const-string v3, ".jpeg"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_e

    const-string v3, ".mpo"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_e

    invoke-static {v0}, Lcom/roidapp/photogrid/common/bn;->a(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_10

    .line 517
    :cond_e
    invoke-static {v0}, Lcom/roidapp/photogrid/release/rf;->b(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_f

    .line 518
    new-instance v2, Lcom/roidapp/photogrid/release/ig;

    invoke-direct {v2, v0}, Lcom/roidapp/photogrid/release/ig;-><init>(Ljava/lang/String;)V

    .line 520
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->c:Lcom/roidapp/photogrid/video/ca;

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/video/ca;->a(Lcom/roidapp/photogrid/release/ig;)V

    .line 521
    sget-object v0, Lcom/roidapp/photogrid/video/bp;->n:[Z

    array-length v0, v0

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [Z

    .line 522
    sget-object v2, Lcom/roidapp/photogrid/video/bp;->n:[Z

    sget-object v3, Lcom/roidapp/photogrid/video/bp;->n:[Z

    array-length v3, v3

    invoke-static {v2, v1, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 523
    sput-object v0, Lcom/roidapp/photogrid/video/bp;->n:[Z

    .line 524
    sget v0, Lcom/roidapp/photogrid/video/bp;->l:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/roidapp/photogrid/video/bp;->l:I

    goto/16 :goto_0

    .line 527
    :cond_f
    invoke-direct {p0, v7}, Lcom/roidapp/photogrid/video/bp;->a(I)V

    goto/16 :goto_0

    .line 531
    :cond_10
    const v0, 0x7f07015d

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/video/bp;->a(I)V

    goto/16 :goto_0

    .line 431
    :pswitch_data_0
    .packed-switch 0xaa02
        :pswitch_0
    .end packed-switch
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 97
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 98
    check-cast p1, Lcom/roidapp/photogrid/video/VideoPictureEditActivity;

    iput-object p1, p0, Lcom/roidapp/photogrid/video/bp;->a:Lcom/roidapp/photogrid/video/VideoPictureEditActivity;

    .line 99
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const/16 v3, 0x32

    const/4 v2, 0x1

    const/4 v4, 0x0

    .line 936
    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/bp;->j:Z

    if-eqz v0, :cond_1

    .line 5553
    :cond_0
    :goto_0
    return-void

    .line 940
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 942
    :sswitch_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->b()V

    goto :goto_0

    .line 4606
    :sswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->d:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-nez v0, :cond_2

    .line 4607
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f0701e9

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/video/bp;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0

    .line 4609
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/16 v1, 0xf

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/rf;->a(Landroid/content/Context;I)Z

    move-result v0

    if-nez v0, :cond_3

    .line 4610
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 4613
    :cond_3
    const-string v0, "Video/Preview"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 4614
    const/4 v0, 0x6

    sput v0, Lcom/roidapp/photogrid/common/az;->q:I

    .line 4616
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->e(Z)V

    .line 4617
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->n(I)V

    .line 4618
    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/bp;->p:Z

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->ax()Z

    move-result v1

    if-eq v0, v1, :cond_4

    .line 4619
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/bp;->f()V

    .line 4621
    :cond_4
    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/bp;->s:Z

    if-nez v0, :cond_0

    .line 4624
    iput-boolean v2, p0, Lcom/roidapp/photogrid/video/bp;->s:Z

    .line 4625
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/bp;->e()V

    .line 4626
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 4627
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/video/bp;->startActivity(Landroid/content/Intent;)V

    .line 4628
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 4629
    const-string v0, "EditPage_View"

    const-string v1, "Sort_Edit"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 948
    :sswitch_2
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 4641
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070177

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    const v2, 0x7f07032f

    new-instance v3, Lcom/roidapp/photogrid/video/bq;

    invoke-direct {v3, p0, v0}, Lcom/roidapp/photogrid/video/bq;-><init>(Lcom/roidapp/photogrid/video/bp;I)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f0701ec

    new-instance v2, Lcom/roidapp/photogrid/video/by;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/video/by;-><init>(Lcom/roidapp/photogrid/video/bp;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto/16 :goto_0

    .line 951
    :sswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->d:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-lt v0, v3, :cond_5

    .line 952
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f0701f7

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/video/bp;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 5544
    :cond_5
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 5547
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.GET_CONTENT"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 5548
    const-string v1, "image/*"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 5550
    const v1, 0xaa02

    :try_start_0
    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/video/bp;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    .line 5552
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Landroid/content/ActivityNotFoundException;->printStackTrace()V

    goto/16 :goto_0

    .line 960
    :sswitch_4
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ax()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 961
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->g:Landroid/widget/TextView;

    const v1, 0x7f070115

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 962
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->g:Landroid/widget/TextView;

    const v1, 0x7f02038f

    invoke-virtual {v0, v4, v1, v4, v4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 963
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/release/ih;->l(Z)V

    .line 970
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->c:Lcom/roidapp/photogrid/video/ca;

    if-eqz v0, :cond_0

    .line 972
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->c:Lcom/roidapp/photogrid/video/ca;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/ca;->notifyDataSetChanged()V

    goto/16 :goto_0

    .line 965
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->g:Landroid/widget/TextView;

    const v1, 0x7f07032c

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 966
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->g:Landroid/widget/TextView;

    const v1, 0x7f0203cb

    invoke-virtual {v0, v4, v1, v4, v4}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 967
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->l(Z)V

    goto :goto_1

    .line 940
    nop

    :sswitch_data_0
    .sparse-switch
        0x7f0d00e8 -> :sswitch_0
        0x7f0d04d5 -> :sswitch_1
        0x7f0d04d8 -> :sswitch_3
        0x7f0d04d9 -> :sswitch_4
        0x7f0d04dc -> :sswitch_2
    .end sparse-switch
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 103
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 105
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->M()[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/bp;->d:[Lcom/roidapp/photogrid/release/ig;

    .line 106
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ax()Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/video/bp;->p:Z

    .line 107
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->d:[Lcom/roidapp/photogrid/release/ig;

    if-nez v0, :cond_0

    .line 108
    const-string v0, "210"

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    .line 123
    :goto_0
    return-void

    .line 110
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 111
    const-string v1, "first_in"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 112
    iget-object v1, p0, Lcom/roidapp/photogrid/video/bp;->d:[Lcom/roidapp/photogrid/release/ig;

    array-length v1, v1

    .line 113
    sput v1, Lcom/roidapp/photogrid/video/bp;->l:I

    new-array v1, v1, [Z

    sput-object v1, Lcom/roidapp/photogrid/video/bp;->n:[Z

    .line 114
    sput v2, Lcom/roidapp/photogrid/video/bp;->m:I

    .line 119
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "first_in"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 2144
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0900e3

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    .line 2145
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    mul-float/2addr v0, v2

    sub-float v0, v1, v0

    const/high16 v1, 0x40400000    # 3.0f

    div-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/video/bp;->h:I

    .line 2147
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->o:[Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 2148
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/bp;->o:[Ljava/lang/String;

    .line 2150
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->d:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/bp;->o:[Ljava/lang/String;

    goto :goto_0
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 8

    .prologue
    const v7, 0x7f0204e6

    const/16 v6, 0x32

    const/4 v2, 0x0

    const/4 v5, 0x0

    .line 129
    const v0, 0x7f030130

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 134
    if-eqz v1, :cond_0

    .line 135
    iget-object v3, p0, Lcom/roidapp/photogrid/video/bp;->d:[Lcom/roidapp/photogrid/release/ig;

    .line 2171
    const v0, 0x7f0d0102

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/DraggableGridView;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/bp;->b:Lcom/roidapp/baselib/view/DraggableGridView;

    .line 2173
    new-instance v0, Lcom/roidapp/photogrid/video/ca;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    invoke-direct {v0, p0, v4, v3}, Lcom/roidapp/photogrid/video/ca;-><init>(Lcom/roidapp/photogrid/video/bp;Landroid/content/Context;[Lcom/roidapp/photogrid/release/ig;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/bp;->c:Lcom/roidapp/photogrid/video/ca;

    .line 2174
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->b:Lcom/roidapp/baselib/view/DraggableGridView;

    iget-object v3, p0, Lcom/roidapp/photogrid/video/bp;->c:Lcom/roidapp/photogrid/video/ca;

    invoke-virtual {v0, v3}, Lcom/roidapp/baselib/view/DraggableGridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 2175
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->b:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/view/DraggableGridView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 2176
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->b:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/view/DraggableGridView;->a(Lcom/roidapp/baselib/view/d;)V

    .line 2178
    const v0, 0x7f0d00e8

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2179
    const v0, 0x7f0d04d5

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 2180
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2182
    const v0, 0x7f0d04d7

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/bp;->t:Landroid/widget/ImageView;

    .line 2183
    const v0, 0x7f0d04d8

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/bp;->f:Landroid/widget/TextView;

    .line 2184
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->f:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2185
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->d:[Lcom/roidapp/photogrid/release/ig;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->d:[Lcom/roidapp/photogrid/release/ig;

    array-length v0, v0

    if-lt v0, v6, :cond_1

    .line 2186
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->f:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0c00c0

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2187
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 2188
    invoke-virtual {v0, v6}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 2189
    iget-object v3, p0, Lcom/roidapp/photogrid/video/bp;->f:Landroid/widget/TextView;

    invoke-virtual {v3, v2, v0, v2, v2}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 2196
    :goto_0
    const v0, 0x7f0d04d9

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/bp;->g:Landroid/widget/TextView;

    .line 2197
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ax()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2198
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->g:Landroid/widget/TextView;

    const v2, 0x7f07032c

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 2199
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->g:Landroid/widget/TextView;

    const v2, 0x7f0203cb

    invoke-virtual {v0, v5, v2, v5, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    .line 2204
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2205
    const v0, 0x7f0d040d

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/bp;->q:Landroid/widget/RelativeLayout;

    .line 2206
    const v0, 0x7f0d01ac

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/bp;->r:Landroid/widget/TextView;

    .line 2207
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->q:Landroid/widget/RelativeLayout;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :cond_0
    move-object v0, v1

    .line 137
    :goto_2
    return-object v0

    .line 131
    :catch_0
    move-exception v0

    const-string v0, "211"

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    move-object v0, v2

    .line 132
    goto :goto_2

    .line 2191
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->f:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0c00bf

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 2192
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 2193
    const/16 v3, 0xff

    invoke-virtual {v0, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 2194
    iget-object v3, p0, Lcom/roidapp/photogrid/video/bp;->f:Landroid/widget/TextView;

    invoke-virtual {v3, v2, v0, v2, v2}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 2201
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->g:Landroid/widget/TextView;

    const v2, 0x7f070115

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 2202
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->g:Landroid/widget/TextView;

    const v2, 0x7f02038f

    invoke-virtual {v0, v5, v2, v5, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(IIII)V

    goto :goto_1
.end method

.method public final onDestroyView()V
    .locals 1

    .prologue
    .line 698
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V

    .line 700
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->o:[Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 701
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/bp;->o:[Ljava/lang/String;

    .line 703
    :cond_0
    return-void
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6
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
    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 760
    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->isDetached()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 773
    :cond_0
    :goto_0
    return-void

    .line 763
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->e:Lcom/roidapp/baselib/view/r;

    if-nez v0, :cond_2

    .line 764
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07013c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v4

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070126

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v5

    .line 766
    new-instance v1, Lcom/roidapp/photogrid/video/bz;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Lcom/roidapp/photogrid/video/bz;-><init>(Lcom/roidapp/photogrid/video/bp;Landroid/content/Context;)V

    .line 767
    new-instance v2, Lcom/roidapp/baselib/view/r;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v3

    invoke-direct {v2, v3, v0, v5}, Lcom/roidapp/baselib/view/r;-><init>(Landroid/content/Context;[Ljava/lang/String;I)V

    iput-object v2, p0, Lcom/roidapp/photogrid/video/bp;->e:Lcom/roidapp/baselib/view/r;

    .line 768
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->e:Lcom/roidapp/baselib/view/r;

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/view/r;->a(Lcom/roidapp/baselib/view/u;)V

    .line 769
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->e:Lcom/roidapp/baselib/view/r;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/r;->a(Lcom/roidapp/baselib/view/t;)V

    .line 771
    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x4

    .line 772
    iget-object v1, p0, Lcom/roidapp/photogrid/video/bp;->e:Lcom/roidapp/baselib/view/r;

    neg-int v0, v0

    invoke-virtual {v1, p2, p3, v4, v0}, Lcom/roidapp/baselib/view/r;->a(Landroid/view/View;III)V

    goto :goto_0
.end method

.method public final onResume()V
    .locals 2

    .prologue
    .line 680
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onResume()V

    .line 681
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->d:[Lcom/roidapp/photogrid/release/ig;

    if-nez v0, :cond_0

    .line 682
    const-string v0, "211"

    invoke-virtual {p0}, Lcom/roidapp/photogrid/video/bp;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/common/c;->a(Ljava/lang/String;Landroid/app/Activity;)V

    .line 685
    :cond_0
    return-void
.end method

.method public final onStop()V
    .locals 1

    .prologue
    .line 689
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->b:Lcom/roidapp/baselib/view/DraggableGridView;

    if-eqz v0, :cond_0

    .line 690
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bp;->b:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-virtual {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->a()V

    .line 693
    :cond_0
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onStop()V

    .line 694
    return-void
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .prologue
    .line 707
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 716
    :goto_0
    const/4 v0, 0x0

    return v0

    .line 709
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 710
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/roidapp/photogrid/video/bp;->k:Z

    .line 711
    iget-object v1, p0, Lcom/roidapp/photogrid/video/bp;->b:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-virtual {v1, v0}, Lcom/roidapp/baselib/view/DraggableGridView;->a(I)V

    goto :goto_0

    .line 707
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
