.class public final Lcom/roidapp/cloudlib/sns/h/h;
.super Lcom/roidapp/cloudlib/sns/basepost/h;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private A:Landroid/widget/TextView;

.field private B:Landroid/view/View;

.field private C:Landroid/view/View;

.field private D:Landroid/widget/RelativeLayout;

.field private E:Landroid/widget/ProgressBar;

.field private F:Landroid/widget/LinearLayout;

.field private G:Landroid/view/View;

.field private H:Z

.field private I:J

.field private J:Z

.field private K:Lcom/roidapp/cloudlib/sns/b/x;

.field private L:Lcom/roidapp/cloudlib/sns/b/c;

.field private M:Z

.field private N:Ljava/lang/String;

.field private O:Z

.field private P:Lcom/roidapp/cloudlib/sns/b/a/e;

.field private Q:Lcom/roidapp/cloudlib/sns/o;

.field private R:Z

.field private S:Z

.field private T:Ljava/lang/String;

.field private U:Ljava/lang/String;

.field private V:Z

.field private W:I

.field private X:Z

.field private Y:Z

.field private Z:Z

.field private aa:Z

.field private ab:Landroid/view/View;

.field private ac:Landroid/view/View;

.field private ad:Landroid/view/View;

.field private ae:Landroid/widget/TextView;

.field private af:Landroid/widget/TextView;

.field private ag:Z

.field private ah:Lcom/roidapp/cloudlib/sns/upload/j;

.field private v:Lcom/roidapp/baselib/view/RoundImageView;

.field private w:Landroid/widget/TextView;

.field private x:Landroid/widget/TextView;

.field private y:Landroid/widget/TextView;

.field private z:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 72
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;-><init>()V

    .line 95
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->N:Ljava/lang/String;

    .line 504
    new-instance v0, Lcom/roidapp/cloudlib/sns/h/j;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/h/j;-><init>(Lcom/roidapp/cloudlib/sns/h/h;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->ah:Lcom/roidapp/cloudlib/sns/upload/j;

    .line 1088
    return-void
.end method

.method private D()V
    .locals 5

    .prologue
    .line 352
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/ap;->b:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    mul-int/lit8 v1, v1, 0x3

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/ap;->a:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    sub-int/2addr v0, v1

    .line 353
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/as;->al:I

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/h/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    const/4 v4, 0x0

    invoke-virtual {v1, v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->ab:Landroid/view/View;

    .line 354
    new-instance v1, Landroid/widget/AbsListView$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v0}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    .line 355
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->ab:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 356
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->ab:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->bA:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->ae:Landroid/widget/TextView;

    .line 357
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->ab:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->ci:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->ac:Landroid/view/View;

    .line 358
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->ab:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->cl:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->ad:Landroid/view/View;

    .line 359
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->ab:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->bI:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->af:Landroid/widget/TextView;

    .line 360
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->c:Lcom/roidapp/baselib/c/y;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->ab:Landroid/view/View;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/c/y;->b(Landroid/view/View;)V

    .line 361
    return-void
.end method

.method private E()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1224
    iput-boolean v2, p0, Lcom/roidapp/cloudlib/sns/h/h;->e:Z

    .line 1225
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->z()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1234
    :cond_0
    :goto_0
    return-void

    .line 1226
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->X:Z

    if-eqz v0, :cond_2

    .line 1227
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    .line 1231
    :goto_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1232
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    goto :goto_0

    .line 1229
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    goto :goto_1
.end method

.method public static a(JLjava/lang/String;Ljava/lang/String;)Lcom/roidapp/cloudlib/sns/h/h;
    .locals 4

    .prologue
    .line 127
    new-instance v0, Lcom/roidapp/cloudlib/sns/h/h;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/h/h;-><init>()V

    .line 128
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 129
    const-string v2, "user_id"

    invoke-virtual {v1, v2, p0, p1}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    .line 130
    const-string v2, "user_name"

    invoke-virtual {v1, v2, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    const-string v2, "user_photo_url"

    invoke-virtual {v1, v2, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/h/h;->setArguments(Landroid/os/Bundle;)V

    .line 133
    return-object v0
.end method

.method private static a(Landroid/widget/TextView;I)V
    .locals 3

    .prologue
    .line 1261
    const v0, 0x3b9ac9ff

    if-le p1, v0, :cond_1

    .line 1262
    const v0, 0x5f5e100

    div-int v0, p1, v0

    .line 1263
    rem-int/lit8 v1, v0, 0xa

    if-lez v1, :cond_0

    .line 1264
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    div-int/lit8 v2, v0, 0xa

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    rem-int/lit8 v0, v0, 0xa

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "b"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1287
    :goto_0
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1288
    return-void

    .line 1266
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    div-int/lit8 v0, v0, 0xa

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "b"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1268
    :cond_1
    const v0, 0xf423f

    if-le p1, v0, :cond_3

    .line 1269
    const v0, 0x186a0

    div-int v0, p1, v0

    .line 1270
    rem-int/lit8 v1, v0, 0xa

    if-lez v1, :cond_2

    .line 1271
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    div-int/lit8 v2, v0, 0xa

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    rem-int/lit8 v0, v0, 0xa

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "m"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1273
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    div-int/lit8 v0, v0, 0xa

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "m"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1275
    :cond_3
    const v0, 0x1869f

    if-le p1, v0, :cond_5

    .line 1276
    div-int/lit8 v0, p1, 0x64

    .line 1277
    rem-int/lit8 v1, v0, 0xa

    if-lez v1, :cond_4

    .line 1278
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    div-int/lit8 v2, v0, 0xa

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    rem-int/lit8 v0, v0, 0xa

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "k"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 1280
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    div-int/lit8 v0, v0, 0xa

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "k"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 1282
    :cond_5
    if-lez p1, :cond_6

    .line 1283
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    .line 1285
    :cond_6
    const-string v0, "0"

    goto/16 :goto_0
.end method

.method private a(Lcom/roidapp/cloudlib/sns/b/x;)V
    .locals 5

    .prologue
    const/16 v4, 0x8

    const/4 v3, 0x0

    .line 871
    if-eqz p1, :cond_e

    .line 872
    iget-wide v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iput-wide v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->I:J

    .line 873
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->T:Ljava/lang/String;

    .line 874
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->U:Ljava/lang/String;

    .line 875
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->z()Z

    move-result v0

    if-nez v0, :cond_1

    .line 997
    :cond_0
    :goto_0
    return-void

    .line 876
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->J:Z

    if-eqz v0, :cond_2

    .line 877
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->t:Lcom/roidapp/cloudlib/sns/ab;

    iget-object v1, p1, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Ljava/lang/CharSequence;)V

    .line 880
    :cond_2
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->O:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->ag:Z

    if-eqz v0, :cond_5

    .line 881
    :cond_3
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->ag:Z

    if-eqz v0, :cond_4

    .line 882
    iput-boolean v3, p0, Lcom/roidapp/cloudlib/sns/h/h;->ag:Z

    .line 884
    :cond_4
    iput-boolean v3, p0, Lcom/roidapp/cloudlib/sns/h/h;->O:Z

    .line 885
    iget-object v0, p1, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->N:Ljava/lang/String;

    .line 888
    :cond_5
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->H:Z

    if-eqz v0, :cond_8

    .line 889
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;)Lcom/roidapp/cloudlib/sns/g/f;

    move-result-object v0

    .line 890
    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/g/f;->a(Lcom/roidapp/cloudlib/sns/g/f;)Ljava/lang/String;

    move-result-object v1

    .line 892
    if-eqz v1, :cond_7

    .line 893
    invoke-static {p0}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v2

    iget-object v3, p1, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-static {v0, v3}, Lcom/roidapp/cloudlib/sns/g/f;->b(Lcom/roidapp/cloudlib/sns/g/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v2

    invoke-virtual {v2}, Lcom/bumptech/glide/d;->i()Lcom/bumptech/glide/b;

    move-result-object v2

    invoke-static {p0}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bumptech/glide/d;->i()Lcom/bumptech/glide/b;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/bumptech/glide/b;->a(Lcom/bumptech/glide/a;)Lcom/bumptech/glide/a;

    move-result-object v1

    sget-object v2, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/a;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bumptech/glide/a;->a()Lcom/bumptech/glide/a;

    move-result-object v1

    new-instance v2, Lcom/roidapp/cloudlib/sns/e/a;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/h/h;->v:Lcom/roidapp/baselib/view/RoundImageView;

    invoke-direct {v2, v3}, Lcom/roidapp/cloudlib/sns/e/a;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/a;->a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;

    .line 909
    :goto_1
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->w:Landroid/widget/TextView;

    iget-object v2, p1, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/roidapp/cloudlib/sns/g/f;->a(Lcom/roidapp/cloudlib/sns/g/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 913
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->x:Landroid/widget/TextView;

    iget v2, p1, Lcom/roidapp/cloudlib/sns/b/x;->i:I

    invoke-static {v0, v2}, Lcom/roidapp/cloudlib/sns/g/f;->c(Lcom/roidapp/cloudlib/sns/g/f;I)I

    move-result v2

    invoke-static {v1, v2}, Lcom/roidapp/cloudlib/sns/h/h;->a(Landroid/widget/TextView;I)V

    .line 914
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->y:Landroid/widget/TextView;

    iget v2, p1, Lcom/roidapp/cloudlib/sns/b/x;->k:I

    invoke-static {v0, v2}, Lcom/roidapp/cloudlib/sns/g/f;->d(Lcom/roidapp/cloudlib/sns/g/f;I)I

    move-result v0

    invoke-static {v1, v0}, Lcom/roidapp/cloudlib/sns/h/h;->a(Landroid/widget/TextView;I)V

    .line 915
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->z:Landroid/widget/TextView;

    iget v1, p1, Lcom/roidapp/cloudlib/sns/b/x;->j:I

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/h/h;->a(Landroid/widget/TextView;I)V

    .line 994
    :cond_6
    :goto_2
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/h/h;->c(I)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 995
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/h/h;->E()V

    goto/16 :goto_0

    .line 901
    :cond_7
    invoke-static {p0}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v1

    iget-object v2, p1, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-static {v0, v2}, Lcom/roidapp/cloudlib/sns/g/f;->b(Lcom/roidapp/cloudlib/sns/g/f;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bumptech/glide/d;->i()Lcom/bumptech/glide/b;

    move-result-object v1

    sget-object v2, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/b;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/bumptech/glide/a;->a()Lcom/bumptech/glide/a;

    move-result-object v1

    new-instance v2, Lcom/roidapp/cloudlib/sns/e/a;

    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/h/h;->v:Lcom/roidapp/baselib/view/RoundImageView;

    invoke-direct {v2, v3}, Lcom/roidapp/cloudlib/sns/e/a;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {v1, v2}, Lcom/bumptech/glide/a;->a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;

    goto :goto_1

    .line 918
    :cond_8
    invoke-static {p0}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v0

    iget-object v1, p1, Lcom/roidapp/cloudlib/sns/b/x;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/d;->i()Lcom/bumptech/glide/b;

    move-result-object v0

    sget-object v1, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/b;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/a;->a()Lcom/bumptech/glide/a;

    move-result-object v0

    new-instance v1, Lcom/roidapp/cloudlib/sns/e/a;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/h/h;->v:Lcom/roidapp/baselib/view/RoundImageView;

    invoke-direct {v1, v2}, Lcom/roidapp/cloudlib/sns/e/a;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/a;->a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;

    .line 925
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    invoke-static {p1}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/b/x;)Lcom/roidapp/cloudlib/sns/g/f;

    move-result-object v0

    .line 926
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->w:Landroid/widget/TextView;

    iget-object v2, p1, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 930
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->x:Landroid/widget/TextView;

    iget v2, p1, Lcom/roidapp/cloudlib/sns/b/x;->i:I

    invoke-static {v1, v2}, Lcom/roidapp/cloudlib/sns/h/h;->a(Landroid/widget/TextView;I)V

    .line 931
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->y:Landroid/widget/TextView;

    iget v2, p1, Lcom/roidapp/cloudlib/sns/b/x;->k:I

    invoke-static {v1, v2}, Lcom/roidapp/cloudlib/sns/h/h;->a(Landroid/widget/TextView;I)V

    .line 932
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->z:Landroid/widget/TextView;

    iget v2, p1, Lcom/roidapp/cloudlib/sns/b/x;->j:I

    invoke-static {v0, v2}, Lcom/roidapp/cloudlib/sns/g/f;->a(Lcom/roidapp/cloudlib/sns/g/f;I)I

    move-result v2

    invoke-static {v1, v2}, Lcom/roidapp/cloudlib/sns/h/h;->a(Landroid/widget/TextView;I)V

    .line 934
    iget-object v1, p1, Lcom/roidapp/cloudlib/sns/b/x;->q:Lcom/roidapp/cloudlib/sns/b/c;

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/sns/g/f;->a(Lcom/roidapp/cloudlib/sns/g/f;Lcom/roidapp/cloudlib/sns/b/c;)Lcom/roidapp/cloudlib/sns/b/c;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->L:Lcom/roidapp/cloudlib/sns/b/c;

    .line 935
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->L:Lcom/roidapp/cloudlib/sns/b/c;

    sget-object v1, Lcom/roidapp/cloudlib/sns/b/c;->b:Lcom/roidapp/cloudlib/sns/b/c;

    if-ne v0, v1, :cond_a

    .line 936
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->A:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_9

    .line 937
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->A:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 939
    :cond_9
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->E:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 940
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->A:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/cloudlib/at;->P:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 941
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->A:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/ao;->a:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 942
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->A:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/cloudlib/aq;->K:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_2

    .line 943
    :cond_a
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->L:Lcom/roidapp/cloudlib/sns/b/c;

    sget-object v1, Lcom/roidapp/cloudlib/sns/b/c;->c:Lcom/roidapp/cloudlib/sns/b/c;

    if-ne v0, v1, :cond_c

    .line 944
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->A:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_b

    .line 945
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->A:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 947
    :cond_b
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->E:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 948
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->A:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/cloudlib/at;->N:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 949
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->A:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x106000b

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 950
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->A:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/cloudlib/aq;->k:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_2

    .line 952
    :cond_c
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->A:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_d

    .line 953
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->A:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 955
    :cond_d
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->E:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v3}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 956
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->A:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 957
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->A:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/cloudlib/aq;->K:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto/16 :goto_2

    .line 961
    :cond_e
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->J:Z

    if-eqz v0, :cond_f

    .line 962
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->T:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 963
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->t:Lcom/roidapp/cloudlib/sns/ab;

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Ljava/lang/CharSequence;)V

    .line 968
    :cond_f
    :goto_3
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->X:Z

    if-eqz v0, :cond_13

    .line 969
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->U:Ljava/lang/String;

    .line 970
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->w:Landroid/widget/TextView;

    const-string v0, ""

    .line 972
    :goto_4
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 974
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->O:Z

    if-nez v0, :cond_10

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->U:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_11

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->N:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->U:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    .line 975
    :cond_10
    iput-boolean v3, p0, Lcom/roidapp/cloudlib/sns/h/h;->O:Z

    .line 976
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->U:Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->N:Ljava/lang/String;

    .line 977
    invoke-static {p0}, Lcom/bumptech/glide/h;->a(Landroid/support/v4/app/Fragment;)Lcom/bumptech/glide/p;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->N:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/p;->a(Ljava/lang/String;)Lcom/bumptech/glide/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/d;->i()Lcom/bumptech/glide/b;

    move-result-object v0

    sget-object v1, Lcom/bumptech/glide/load/b/e;->c:Lcom/bumptech/glide/load/b/e;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/b;->a(Lcom/bumptech/glide/load/b/e;)Lcom/bumptech/glide/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/bumptech/glide/a;->a()Lcom/bumptech/glide/a;

    move-result-object v0

    new-instance v1, Lcom/roidapp/cloudlib/sns/e/a;

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/h/h;->v:Lcom/roidapp/baselib/view/RoundImageView;

    invoke-direct {v1, v2}, Lcom/roidapp/cloudlib/sns/e/a;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/a;->a(Lcom/bumptech/glide/g/b/k;)Lcom/bumptech/glide/g/b/k;

    .line 984
    :cond_11
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->x:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 985
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->y:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 986
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->z:Landroid/widget/TextView;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 987
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->H:Z

    if-nez v0, :cond_6

    .line 988
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->E:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v4}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 989
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->A:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    if-eq v0, v4, :cond_6

    .line 990
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->A:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_2

    .line 965
    :cond_12
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->t:Lcom/roidapp/cloudlib/sns/ab;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->T:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Ljava/lang/CharSequence;)V

    goto/16 :goto_3

    .line 972
    :cond_13
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->w:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->T:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_14

    const-string v0, ""

    goto/16 :goto_4

    :cond_14
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->T:Ljava/lang/String;

    goto/16 :goto_4
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/h/h;I)V
    .locals 0

    .prologue
    .line 72
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/h/h;->a(I)V

    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/h/h;Lcom/roidapp/cloudlib/sns/b/a/e;)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 72
    .line 5006
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->Z:Z

    .line 5007
    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->X:Z

    .line 5008
    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/h/h;->c(I)I

    .line 5009
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->R:Z

    .line 5010
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/h/h;->P:Lcom/roidapp/cloudlib/sns/b/a/e;

    .line 6000
    invoke-virtual {p0, p1, v1, v1}, Lcom/roidapp/cloudlib/sns/h/h;->a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V

    .line 5012
    invoke-direct {p0, v1}, Lcom/roidapp/cloudlib/sns/h/h;->g(Z)V

    .line 5013
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/e;->size()I

    move-result v2

    const/16 v3, 0xa

    if-ge v2, v3, :cond_1

    :cond_0
    move v0, v1

    :cond_1
    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->aa:Z

    .line 72
    return-void
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/h/h;Lcom/roidapp/cloudlib/sns/b/x;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 8046
    if-nez p1, :cond_1

    .line 8047
    iput-boolean v2, p0, Lcom/roidapp/cloudlib/sns/h/h;->X:Z

    .line 8048
    sget v0, Lcom/roidapp/cloudlib/at;->ah:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/h/h;->a(I)V

    .line 8052
    :goto_0
    iput-boolean v2, p0, Lcom/roidapp/cloudlib/sns/h/h;->S:Z

    .line 8053
    invoke-direct {p0, v1}, Lcom/roidapp/cloudlib/sns/h/h;->c(I)I

    .line 8054
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->H:Z

    if-eqz v0, :cond_2

    .line 8055
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/h/h;->K:Lcom/roidapp/cloudlib/sns/b/x;

    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/h/h;->h:Lcom/roidapp/cloudlib/sns/b/x;

    .line 8056
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 8057
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    iput-object p1, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    .line 8062
    :cond_0
    :goto_1
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/sns/h/h;->a(Lcom/roidapp/cloudlib/sns/b/x;)V

    .line 72
    return-void

    .line 8050
    :cond_1
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->X:Z

    goto :goto_0

    .line 8060
    :cond_2
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/h/h;->K:Lcom/roidapp/cloudlib/sns/b/x;

    goto :goto_1
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/h/h;Ljava/lang/Exception;)V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 72
    .line 6018
    iput-boolean v3, p0, Lcom/roidapp/cloudlib/sns/h/h;->Z:Z

    .line 6019
    invoke-direct {p0, v2}, Lcom/roidapp/cloudlib/sns/h/h;->c(I)I

    .line 6020
    iput-boolean v2, p0, Lcom/roidapp/cloudlib/sns/h/h;->R:Z

    .line 6021
    instance-of v0, p1, Lcom/roidapp/cloudlib/sns/z;

    if-eqz v0, :cond_1

    .line 6022
    check-cast p1, Lcom/roidapp/cloudlib/sns/z;

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/z;->a()I

    move-result v0

    const/16 v1, 0x3ee

    if-ne v0, v1, :cond_0

    .line 6023
    iput-boolean v3, p0, Lcom/roidapp/cloudlib/sns/h/h;->X:Z

    .line 6032
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->P:Lcom/roidapp/cloudlib/sns/b/a/e;

    .line 7000
    invoke-virtual {p0, v0, v3, v2}, Lcom/roidapp/cloudlib/sns/h/h;->a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V

    .line 6033
    invoke-direct {p0, v3}, Lcom/roidapp/cloudlib/sns/h/h;->g(Z)V

    .line 72
    return-void

    .line 6025
    :cond_0
    iput-boolean v2, p0, Lcom/roidapp/cloudlib/sns/h/h;->X:Z

    .line 6026
    sget v0, Lcom/roidapp/cloudlib/at;->aD:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/h/h;->a(I)V

    goto :goto_0

    .line 6029
    :cond_1
    iput-boolean v2, p0, Lcom/roidapp/cloudlib/sns/h/h;->X:Z

    .line 6030
    sget v0, Lcom/roidapp/cloudlib/at;->aG:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/h/h;->a(I)V

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/h/h;)Z
    .locals 1

    .prologue
    .line 72
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->z()Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/roidapp/cloudlib/sns/h/h;JI)Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 72
    .line 4557
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->F:Landroid/widget/LinearLayout;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;

    .line 4558
    if-eqz v0, :cond_1

    .line 4559
    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->a(I)V

    .line 4560
    invoke-virtual {v0, p3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->b(I)V

    .line 4561
    const/16 v2, 0x64

    if-ne p3, v2, :cond_0

    .line 4562
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/h/h;->F:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v0}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V

    .line 4563
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->onRefresh()V

    :cond_0
    move v0, v1

    .line 4565
    :goto_0
    return v0

    .line 4567
    :cond_1
    const/4 v0, 0x0

    .line 72
    goto :goto_0
.end method

.method public static b(Ljava/lang/String;)Lcom/roidapp/cloudlib/sns/h/h;
    .locals 3

    .prologue
    .line 123
    const-wide/16 v0, -0x1

    const-string v2, ""

    invoke-static {v0, v1, p0, v2}, Lcom/roidapp/cloudlib/sns/h/h;->a(JLjava/lang/String;Ljava/lang/String;)Lcom/roidapp/cloudlib/sns/h/h;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/h/h;I)V
    .locals 0

    .prologue
    .line 72
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/h/h;->a(I)V

    return-void
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/h/h;Lcom/roidapp/cloudlib/sns/b/a/e;)V
    .locals 4

    .prologue
    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 72
    .line 7038
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/h/h;->P:Lcom/roidapp/cloudlib/sns/b/a/e;

    .line 8000
    invoke-virtual {p0, p1, v1, v1}, Lcom/roidapp/cloudlib/sns/h/h;->a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V

    .line 7040
    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/h/h;->g(Z)V

    .line 7041
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/roidapp/cloudlib/sns/b/a/e;->size()I

    move-result v2

    const/16 v3, 0xa

    if-ge v2, v3, :cond_1

    :cond_0
    move v0, v1

    :cond_1
    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->aa:Z

    .line 72
    return-void
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/h/h;Lcom/roidapp/cloudlib/sns/b/x;)V
    .locals 1

    .prologue
    .line 72
    .line 8080
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->H:Z

    if-eqz v0, :cond_0

    .line 8081
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/h/h;->K:Lcom/roidapp/cloudlib/sns/b/x;

    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/h/h;->h:Lcom/roidapp/cloudlib/sns/b/x;

    .line 8085
    :goto_0
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/sns/h/h;->a(Lcom/roidapp/cloudlib/sns/b/x;)V

    .line 72
    return-void

    .line 8083
    :cond_0
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/h/h;->K:Lcom/roidapp/cloudlib/sns/b/x;

    goto :goto_0
.end method

.method static synthetic b(Lcom/roidapp/cloudlib/sns/h/h;Ljava/lang/Exception;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 72
    .line 9067
    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->X:Z

    .line 9068
    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->S:Z

    .line 9069
    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/h/h;->c(I)I

    .line 9070
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->K:Lcom/roidapp/cloudlib/sns/b/x;

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/h/h;->a(Lcom/roidapp/cloudlib/sns/b/x;)V

    .line 9071
    instance-of v0, p1, Lcom/roidapp/cloudlib/sns/z;

    if-eqz v0, :cond_0

    .line 9072
    sget v0, Lcom/roidapp/cloudlib/at;->aD:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/h/h;->a(I)V

    :goto_0
    return-void

    .line 9074
    :cond_0
    sget v0, Lcom/roidapp/cloudlib/at;->aG:I

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/h/h;->a(I)V

    goto :goto_0
.end method

.method private declared-synchronized c(I)I
    .locals 1

    .prologue
    .line 111
    monitor-enter p0

    if-nez p1, :cond_0

    .line 112
    :try_start_0
    iget v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->W:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->W:I

    .line 114
    :cond_0
    iget v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->W:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v0

    .line 111
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/cloudlib/sns/h/h;I)V
    .locals 0

    .prologue
    .line 72
    invoke-virtual {p0, p1}, Lcom/roidapp/cloudlib/sns/h/h;->a(I)V

    return-void
.end method

.method private c(Z)V
    .locals 9

    .prologue
    const/4 v6, 0x1

    const/4 v8, 0x0

    .line 1108
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->H:Z

    if-eqz v0, :cond_1

    .line 1109
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->h:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    new-instance v1, Lcom/roidapp/cloudlib/sns/h/p;

    invoke-direct {v1, p0, v8}, Lcom/roidapp/cloudlib/sns/h/p;-><init>(Lcom/roidapp/cloudlib/sns/h/h;B)V

    invoke-static {v0, v2, v3, v6, v1}, Lcom/roidapp/cloudlib/sns/q;->f(Ljava/lang/String;JILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 1114
    :goto_0
    if-eqz p1, :cond_0

    .line 1115
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->l()Lcom/roidapp/cloudlib/sns/o;

    .line 1117
    :cond_0
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 1118
    return-void

    .line 1111
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->h:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-wide v4, p0, Lcom/roidapp/cloudlib/sns/h/h;->I:J

    new-instance v7, Lcom/roidapp/cloudlib/sns/h/p;

    invoke-direct {v7, p0, v8}, Lcom/roidapp/cloudlib/sns/h/p;-><init>(Lcom/roidapp/cloudlib/sns/h/h;B)V

    invoke-static/range {v1 .. v7}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;JJILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    goto :goto_0
.end method

.method static synthetic d(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method private d(Z)V
    .locals 7

    .prologue
    .line 1123
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->h:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v4, p0, Lcom/roidapp/cloudlib/sns/h/h;->T:Ljava/lang/String;

    const/4 v5, 0x1

    new-instance v6, Lcom/roidapp/cloudlib/sns/h/p;

    const/4 v0, 0x0

    invoke-direct {v6, p0, v0}, Lcom/roidapp/cloudlib/sns/h/p;-><init>(Lcom/roidapp/cloudlib/sns/h/h;B)V

    invoke-static/range {v1 .. v6}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;JLjava/lang/String;ILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 1125
    if-eqz p1, :cond_0

    .line 1126
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->l()Lcom/roidapp/cloudlib/sns/o;

    .line 1128
    :cond_0
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 1129
    return-void
.end method

.method private e(Z)V
    .locals 7

    .prologue
    .line 1132
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->h:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-wide v4, p0, Lcom/roidapp/cloudlib/sns/h/h;->I:J

    new-instance v6, Lcom/roidapp/cloudlib/sns/h/n;

    invoke-direct {v6, p0}, Lcom/roidapp/cloudlib/sns/h/n;-><init>(Lcom/roidapp/cloudlib/sns/h/h;)V

    invoke-static/range {v1 .. v6}, Lcom/roidapp/cloudlib/sns/q;->c(Ljava/lang/String;JJLcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 1149
    if-eqz p1, :cond_0

    .line 1150
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->l()Lcom/roidapp/cloudlib/sns/o;

    .line 1152
    :cond_0
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 1153
    return-void
.end method

.method static synthetic e(Lcom/roidapp/cloudlib/sns/h/h;)Z
    .locals 1

    .prologue
    .line 72
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->e:Z

    return v0
.end method

.method private f(Z)V
    .locals 3

    .prologue
    .line 1156
    const/4 v0, 0x1

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->T:Ljava/lang/String;

    new-instance v2, Lcom/roidapp/cloudlib/sns/h/o;

    invoke-direct {v2, p0}, Lcom/roidapp/cloudlib/sns/h/o;-><init>(Lcom/roidapp/cloudlib/sns/h/h;)V

    invoke-static {v0, v1, v2}, Lcom/roidapp/cloudlib/sns/q;->a(ZLjava/lang/String;Lcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    .line 1180
    if-eqz p1, :cond_0

    .line 1181
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->l()Lcom/roidapp/cloudlib/sns/o;

    .line 1183
    :cond_0
    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    .line 1184
    return-void
.end method

.method static synthetic f(Lcom/roidapp/cloudlib/sns/h/h;)Z
    .locals 1

    .prologue
    .line 72
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->aa:Z

    return v0
.end method

.method static synthetic g(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/basepost/bc;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    return-object v0
.end method

.method private declared-synchronized g(Z)V
    .locals 2

    .prologue
    .line 1213
    monitor-enter p0

    if-eqz p1, :cond_1

    .line 1214
    const/4 v0, 0x1

    :try_start_0
    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/h/h;->c(I)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 1215
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/h/h;->E()V

    .line 1217
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    if-eqz v0, :cond_1

    .line 1218
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1221
    :cond_1
    monitor-exit p0

    return-void

    .line 1213
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method static synthetic h(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    return-object v0
.end method

.method static synthetic i(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic j(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/o;
    .locals 1

    .prologue
    .line 72
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->Q:Lcom/roidapp/cloudlib/sns/o;

    return-object v0
.end method

.method static synthetic k(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic l(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic m(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    return-object v0
.end method

.method static synthetic n(Lcom/roidapp/cloudlib/sns/h/h;)Z
    .locals 1

    .prologue
    .line 72
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->e:Z

    return v0
.end method

.method static synthetic o(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/basepost/bc;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    return-object v0
.end method

.method static synthetic p(Lcom/roidapp/cloudlib/sns/h/h;)Landroid/widget/LinearLayout;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->F:Landroid/widget/LinearLayout;

    return-object v0
.end method

.method static synthetic q(Lcom/roidapp/cloudlib/sns/h/h;)Landroid/view/View;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->G:Landroid/view/View;

    return-object v0
.end method

.method static synthetic r(Lcom/roidapp/cloudlib/sns/h/h;)Lcom/roidapp/cloudlib/sns/b/x;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->K:Lcom/roidapp/cloudlib/sns/b/x;

    return-object v0
.end method


# virtual methods
.method public final B()J
    .locals 2

    .prologue
    .line 137
    iget-wide v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->I:J

    return-wide v0
.end method

.method public final C()V
    .locals 1

    .prologue
    .line 679
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->J:Z

    .line 680
    return-void
.end method

.method public final a(Landroid/content/Context;)Landroid/view/View;
    .locals 2

    .prologue
    .line 179
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->J:Z

    if-eqz v0, :cond_2

    .line 180
    new-instance v0, Lcom/roidapp/cloudlib/sns/ab;

    invoke-direct {v0, p1}, Lcom/roidapp/cloudlib/sns/ab;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->t:Lcom/roidapp/cloudlib/sns/ab;

    .line 181
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->t:Lcom/roidapp/cloudlib/sns/ab;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->u:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Landroid/view/View$OnClickListener;)V

    .line 182
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->K:Lcom/roidapp/cloudlib/sns/b/x;

    if-eqz v0, :cond_1

    .line 183
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->t:Lcom/roidapp/cloudlib/sns/ab;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->K:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Ljava/lang/CharSequence;)V

    .line 187
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->t:Lcom/roidapp/cloudlib/sns/ab;

    .line 189
    :goto_1
    return-object v0

    .line 184
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->T:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 185
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->t:Lcom/roidapp/cloudlib/sns/ab;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->T:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/ab;->a(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 189
    :cond_2
    const/4 v0, 0x0

    goto :goto_1
.end method

.method protected final a(Landroid/view/View;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 1

    .prologue
    const/4 v0, 0x1

    .line 195
    invoke-super {p0, p1, p2, p3, p4}, Lcom/roidapp/cloudlib/sns/basepost/h;->a(Landroid/view/View;Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    .line 197
    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->M:Z

    .line 198
    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->O:Z

    .line 200
    return-void
.end method

.method protected final a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V
    .locals 0

    .prologue
    .line 206
    if-nez p1, :cond_0

    .line 207
    new-instance p1, Lcom/roidapp/cloudlib/sns/b/a/e;

    invoke-direct {p1}, Lcom/roidapp/cloudlib/sns/b/a/e;-><init>()V

    .line 213
    :cond_0
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/cloudlib/sns/basepost/h;->a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V

    .line 214
    return-void
.end method

.method public final a(Lcom/roidapp/cloudlib/sns/g/e;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 1238
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->isDetached()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1239
    sget-object v0, Lcom/roidapp/cloudlib/sns/g/e;->a:Lcom/roidapp/cloudlib/sns/g/e;

    if-ne v0, p1, :cond_1

    .line 1240
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->K:Lcom/roidapp/cloudlib/sns/b/x;

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/h/h;->a(Lcom/roidapp/cloudlib/sns/b/x;)V

    .line 1257
    :cond_0
    :goto_0
    return-void

    .line 1241
    :cond_1
    sget-object v0, Lcom/roidapp/cloudlib/sns/g/e;->d:Lcom/roidapp/cloudlib/sns/g/e;

    if-ne v0, p1, :cond_2

    .line 1242
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->K:Lcom/roidapp/cloudlib/sns/b/x;

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/h/h;->a(Lcom/roidapp/cloudlib/sns/b/x;)V

    .line 1243
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    if-eqz v0, :cond_0

    .line 1244
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->c()V

    goto :goto_0

    .line 1246
    :cond_2
    sget-object v0, Lcom/roidapp/cloudlib/sns/g/e;->b:Lcom/roidapp/cloudlib/sns/g/e;

    if-ne v0, p1, :cond_3

    .line 1247
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    if-eqz v0, :cond_0

    .line 1248
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->c()V

    goto :goto_0

    .line 1250
    :cond_3
    sget-object v0, Lcom/roidapp/cloudlib/sns/g/e;->c:Lcom/roidapp/cloudlib/sns/g/e;

    if-ne v0, p1, :cond_0

    .line 1251
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->K:Lcom/roidapp/cloudlib/sns/b/x;

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/h/h;->a(Lcom/roidapp/cloudlib/sns/b/x;)V

    .line 1252
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    if-eqz v0, :cond_0

    .line 1253
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->e(I)V

    goto :goto_0
.end method

.method public final a(Ljava/util/Collection;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/roidapp/cloudlib/sns/upload/i;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 571
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 572
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 573
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/upload/i;

    .line 574
    iget-wide v4, v0, Lcom/roidapp/cloudlib/sns/upload/i;->e:J

    .line 575
    iget-byte v3, v0, Lcom/roidapp/cloudlib/sns/upload/i;->f:B

    .line 576
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->F:Landroid/widget/LinearLayout;

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/widget/LinearLayout;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;

    .line 577
    if-nez v1, :cond_0

    .line 1523
    new-instance v1, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    invoke-direct {v1, v6}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;-><init>(Landroid/content/Context;)V

    .line 1524
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->setTag(Ljava/lang/Object;)V

    .line 1525
    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->a(I)V

    .line 1526
    iget v3, v0, Lcom/roidapp/cloudlib/sns/upload/i;->d:I

    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->b(I)V

    .line 1527
    iget-object v3, v0, Lcom/roidapp/cloudlib/sns/upload/i;->a:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->a(Ljava/lang/String;)V

    .line 1528
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x1

    const/4 v5, -0x2

    invoke-direct {v3, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1529
    const/16 v4, 0x14

    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1530
    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1531
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/h/h;->F:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 1532
    new-instance v3, Lcom/roidapp/cloudlib/sns/h/k;

    invoke-direct {v3, p0, v1, v0}, Lcom/roidapp/cloudlib/sns/h/k;-><init>(Lcom/roidapp/cloudlib/sns/h/h;Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;Lcom/roidapp/cloudlib/sns/upload/i;)V

    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->a(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 580
    :cond_0
    invoke-virtual {v1, v3}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->a(I)V

    .line 581
    iget v0, v0, Lcom/roidapp/cloudlib/sns/upload/i;->d:I

    invoke-virtual {v1, v0}, Lcom/roidapp/cloudlib/sns/upload/UploadProgressStatusView;->b(I)V

    goto :goto_0

    .line 585
    :cond_1
    return-void
.end method

.method protected final a(Z)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 599
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/basepost/h;->a(Z)V

    .line 600
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    const-string v1, "UserCenter"

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/al;->a(Ljava/lang/String;)V

    .line 602
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->Q:Lcom/roidapp/cloudlib/sns/o;

    if-eqz v0, :cond_1

    .line 603
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->Q:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->f()V

    .line 604
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 605
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a()V

    .line 607
    :cond_0
    iput-boolean v3, p0, Lcom/roidapp/cloudlib/sns/h/h;->e:Z

    .line 609
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->J:Z

    if-nez v0, :cond_2

    .line 610
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "Personal page"

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/al;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 611
    const-string v0, "Personal page"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->b(Ljava/lang/String;)V

    .line 613
    :cond_2
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->Y:Z

    if-eqz v0, :cond_3

    .line 651
    :goto_0
    return-void

    .line 614
    :cond_3
    if-eqz p1, :cond_5

    .line 617
    new-array v0, v4, [Lcom/roidapp/cloudlib/sns/g/e;

    sget-object v1, Lcom/roidapp/cloudlib/sns/g/e;->a:Lcom/roidapp/cloudlib/sns/g/e;

    aput-object v1, v0, v3

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/h/h;->a([Lcom/roidapp/cloudlib/sns/g/e;)V

    .line 620
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    .line 621
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v4}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 622
    iput-boolean v4, p0, Lcom/roidapp/cloudlib/sns/h/h;->e:Z

    .line 623
    iput v3, p0, Lcom/roidapp/cloudlib/sns/h/h;->W:I

    .line 624
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->V:Z

    if-eqz v0, :cond_4

    .line 625
    invoke-direct {p0, v3}, Lcom/roidapp/cloudlib/sns/h/h;->e(Z)V

    .line 626
    invoke-direct {p0, v3}, Lcom/roidapp/cloudlib/sns/h/h;->c(Z)V

    goto :goto_0

    .line 628
    :cond_4
    invoke-direct {p0, v3}, Lcom/roidapp/cloudlib/sns/h/h;->f(Z)V

    .line 629
    invoke-direct {p0, v3}, Lcom/roidapp/cloudlib/sns/h/h;->d(Z)V

    goto :goto_0

    .line 632
    :cond_5
    const/4 v0, 0x2

    iput v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->W:I

    .line 641
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->e:Z

    if-eqz v0, :cond_6

    .line 642
    iput-boolean v3, p0, Lcom/roidapp/cloudlib/sns/h/h;->e:Z

    .line 643
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->Q:Lcom/roidapp/cloudlib/sns/o;

    if-eqz v0, :cond_6

    .line 644
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->Q:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->f()V

    .line 647
    :cond_6
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->P:Lcom/roidapp/cloudlib/sns/b/a/e;

    .line 2000
    invoke-virtual {p0, v0, v4, v3}, Lcom/roidapp/cloudlib/sns/h/h;->a(Lcom/roidapp/cloudlib/sns/b/a/e;ZZ)V

    .line 648
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->K:Lcom/roidapp/cloudlib/sns/b/x;

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/sns/h/h;->a(Lcom/roidapp/cloudlib/sns/b/x;)V

    .line 649
    invoke-direct {p0, v4}, Lcom/roidapp/cloudlib/sns/h/h;->g(Z)V

    goto :goto_0
.end method

.method protected final b()V
    .locals 2

    .prologue
    .line 655
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->b()V

    .line 656
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->J:Z

    if-nez v0, :cond_2

    .line 657
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    if-eqz v0, :cond_1

    .line 658
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 659
    const-string v0, "Personal page"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->e(Ljava/lang/String;)V

    .line 661
    :cond_0
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->g()I

    move-result v0

    .line 662
    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 663
    const-string v1, "Personal page"

    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/b;->b(Ljava/lang/String;I)V

    .line 666
    :cond_1
    const-string v0, "Personal page"

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->a()I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;I)V

    .line 668
    :cond_2
    return-void
.end method

.method public final b(Z)V
    .locals 4

    .prologue
    const/16 v2, 0x8

    const/4 v3, 0x0

    .line 365
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->ab:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->c:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->h()I

    move-result v0

    if-gtz v0, :cond_3

    :cond_0
    if-eqz p1, :cond_3

    .line 366
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/h/h;->D()V

    .line 371
    :cond_1
    :goto_0
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/basepost/h;->b(Z)V

    .line 374
    if-eqz p1, :cond_2

    .line 375
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->Z:Z

    if-eqz v0, :cond_9

    .line 376
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->H:Z

    if-eqz v0, :cond_5

    .line 377
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->R:Z

    if-eqz v0, :cond_4

    .line 378
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->ae:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 379
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->ac:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 380
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->ad:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 400
    :goto_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->ab:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 453
    :cond_2
    :goto_2
    return-void

    .line 367
    :cond_3
    if-nez p1, :cond_1

    .line 368
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->c:Lcom/roidapp/baselib/c/y;

    invoke-virtual {v0}, Lcom/roidapp/baselib/c/y;->f()V

    .line 369
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->ab:Landroid/view/View;

    goto :goto_0

    .line 382
    :cond_4
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->ae:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/cloudlib/at;->X:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 383
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->ac:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 384
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->ae:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 387
    :cond_5
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->R:Z

    if-eqz v0, :cond_6

    .line 388
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->af:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/cloudlib/at;->af:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 394
    :goto_3
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->X:Z

    if-eqz v0, :cond_8

    .line 395
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->af:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 389
    :cond_6
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 390
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->af:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/at;->e:I

    invoke-virtual {v1, v2}, Landroid/support/v4/app/FragmentActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 392
    :cond_7
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->af:Landroid/widget/TextView;

    sget v1, Lcom/roidapp/cloudlib/at;->X:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_3

    .line 397
    :cond_8
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->af:Landroid/widget/TextView;

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_1

    .line 402
    :cond_9
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->ab:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2
.end method

.method protected final d()V
    .locals 5

    .prologue
    const/16 v4, 0x8

    const/4 v3, 0x0

    .line 458
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->ag:Z

    .line 459
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/as;->G:I

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/h/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->j:Landroid/view/View;

    .line 460
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->j:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->bD:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/baselib/view/RoundImageView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->v:Lcom/roidapp/baselib/view/RoundImageView;

    .line 461
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->j:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->bC:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->w:Landroid/widget/TextView;

    .line 462
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->H:Z

    if-eqz v0, :cond_0

    .line 463
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->j:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->i:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 464
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->j:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->cj:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->B:Landroid/view/View;

    .line 465
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->B:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 466
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->B:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 475
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->j:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->bN:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->x:Landroid/widget/TextView;

    .line 476
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->j:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->aW:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->y:Landroid/widget/TextView;

    .line 477
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->j:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->aV:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->z:Landroid/widget/TextView;

    .line 479
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->j:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->bM:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 480
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->j:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->aX:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 481
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->j:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->aU:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 483
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->j:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->J:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->F:Landroid/widget/LinearLayout;

    .line 484
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->H:Z

    if-eqz v0, :cond_1

    .line 485
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/upload/e;->c()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/h/h;->a(Ljava/util/Collection;)V

    .line 486
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->ah:Lcom/roidapp/cloudlib/sns/upload/j;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/upload/e;->a(Lcom/roidapp/cloudlib/sns/upload/j;)V

    .line 491
    :goto_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->j:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->K:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->G:Landroid/view/View;

    .line 492
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->F:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->F:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v0

    if-lez v0, :cond_2

    .line 493
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->G:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 498
    :goto_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->c:Lcom/roidapp/baselib/c/y;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->j:Landroid/view/View;

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/c/y;->a(Landroid/view/View;)V

    .line 500
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/h/h;->D()V

    .line 502
    return-void

    .line 468
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->j:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->i:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->D:Landroid/widget/RelativeLayout;

    .line 469
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->D:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 470
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->j:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->h:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->A:Landroid/widget/TextView;

    .line 471
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->j:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->aR:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->E:Landroid/widget/ProgressBar;

    .line 472
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->j:Landroid/view/View;

    sget v1, Lcom/roidapp/cloudlib/ar;->ba:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->C:Landroid/view/View;

    .line 473
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->D:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_0

    .line 488
    :cond_1
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->ah:Lcom/roidapp/cloudlib/sns/upload/j;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/upload/e;->b(Lcom/roidapp/cloudlib/sns/upload/j;)V

    goto :goto_1

    .line 495
    :cond_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->G:Landroid/view/View;

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2
.end method

.method protected final f()V
    .locals 1

    .prologue
    .line 594
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->r:Z

    .line 595
    return-void
.end method

.method public final j()Z
    .locals 9

    .prologue
    const/4 v8, 0x1

    const/4 v1, 0x0

    .line 261
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->j()Z

    .line 264
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->aa:Z

    if-eqz v0, :cond_1

    .line 265
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a()I

    .line 344
    :cond_0
    :goto_0
    return v1

    .line 270
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    if-eqz v0, :cond_2

    .line 271
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->K:Lcom/roidapp/cloudlib/sns/b/x;

    if-eqz v0, :cond_0

    .line 274
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a()I

    move-result v0

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/h/h;->K:Lcom/roidapp/cloudlib/sns/b/x;

    iget v2, v2, Lcom/roidapp/cloudlib/sns/b/x;->i:I

    if-ne v0, v2, :cond_3

    move v0, v8

    :goto_1
    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->aa:Z

    .line 276
    :cond_2
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->aa:Z

    if-eqz v0, :cond_4

    .line 277
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a()I

    move-result v0

    if-gtz v0, :cond_0

    .line 278
    invoke-virtual {p0, v8}, Lcom/roidapp/cloudlib/sns/h/h;->b(Z)V

    goto :goto_0

    :cond_3
    move v0, v1

    .line 274
    goto :goto_1

    .line 283
    :cond_4
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a()I

    move-result v0

    if-gtz v0, :cond_5

    .line 284
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->onRefresh()V

    goto :goto_0

    .line 288
    :cond_5
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->e:Z

    if-nez v0, :cond_0

    .line 291
    iput-boolean v8, p0, Lcom/roidapp/cloudlib/sns/h/h;->e:Z

    .line 295
    new-instance v7, Lcom/roidapp/cloudlib/sns/h/i;

    invoke-direct {v7, p0}, Lcom/roidapp/cloudlib/sns/h/i;-><init>(Lcom/roidapp/cloudlib/sns/h/h;)V

    .line 332
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->V:Z

    if-eqz v0, :cond_7

    .line 333
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->H:Z

    if-eqz v0, :cond_6

    .line 334
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->h:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v1, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->f()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v2, v3, v1, v7}, Lcom/roidapp/cloudlib/sns/q;->f(Ljava/lang/String;JILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->Q:Lcom/roidapp/cloudlib/sns/o;

    .line 342
    :goto_2
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->Q:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->l()Lcom/roidapp/cloudlib/sns/o;

    .line 343
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->Q:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    move v1, v8

    .line 344
    goto :goto_0

    .line 337
    :cond_6
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->h:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-wide v4, p0, Lcom/roidapp/cloudlib/sns/h/h;->I:J

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->f()I

    move-result v0

    add-int/lit8 v6, v0, 0x1

    invoke-static/range {v1 .. v7}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;JJILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->Q:Lcom/roidapp/cloudlib/sns/o;

    goto :goto_2

    .line 340
    :cond_7
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->h:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v3, v0, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-object v5, p0, Lcom/roidapp/cloudlib/sns/h/h;->T:Ljava/lang/String;

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->f()I

    move-result v0

    add-int/lit8 v6, v0, 0x1

    invoke-static/range {v2 .. v7}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;JLjava/lang/String;ILcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->Q:Lcom/roidapp/cloudlib/sns/o;

    goto :goto_2
.end method

.method protected final o()V
    .locals 1

    .prologue
    .line 672
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->o()V

    .line 673
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    if-eqz v0, :cond_0

    .line 674
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->c()V

    .line 676
    :cond_0
    return-void
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    .prologue
    .line 589
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/cloudlib/sns/basepost/h;->onActivityResult(IILandroid/content/Intent;)V

    .line 590
    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x1

    .line 684
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->bM:I

    if-ne v0, v1, :cond_1

    .line 685
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->K:Lcom/roidapp/cloudlib/sns/b/x;

    if-eqz v0, :cond_0

    .line 686
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a()I

    move-result v0

    if-lez v0, :cond_0

    .line 687
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->b:Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/PinnedListView2;->a_(I)V

    .line 2797
    :cond_0
    :goto_0
    return-void

    .line 690
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->aX:I

    if-ne v0, v1, :cond_3

    .line 691
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/Profile/Following"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 692
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/Profile/Following"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 693
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->K:Lcom/roidapp/cloudlib/sns/b/x;

    if-eqz v0, :cond_0

    .line 694
    new-instance v0, Lcom/roidapp/cloudlib/sns/login/e;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/login/e;-><init>()V

    .line 695
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/login/e;->b(Z)V

    .line 696
    iget-boolean v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->H:Z

    if-nez v1, :cond_2

    .line 697
    iget-wide v2, p0, Lcom/roidapp/cloudlib/sns/h/h;->I:J

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/cloudlib/sns/login/e;->a(J)V

    .line 698
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/e;->d()V

    .line 700
    :cond_2
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/h/h;->a(Lcom/roidapp/cloudlib/sns/main/b;)V

    goto :goto_0

    .line 702
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->aU:I

    if-ne v0, v1, :cond_5

    .line 703
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/Profile/Followers"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 704
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/Profile/Followers"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 705
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->K:Lcom/roidapp/cloudlib/sns/b/x;

    if-eqz v0, :cond_0

    .line 706
    new-instance v0, Lcom/roidapp/cloudlib/sns/login/e;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/sns/login/e;-><init>()V

    .line 707
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/login/e;->b(Z)V

    .line 708
    iget-boolean v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->H:Z

    if-nez v1, :cond_4

    .line 709
    iget-wide v2, p0, Lcom/roidapp/cloudlib/sns/h/h;->I:J

    invoke-virtual {v0, v2, v3}, Lcom/roidapp/cloudlib/sns/login/e;->a(J)V

    .line 710
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/login/e;->d()V

    .line 712
    :cond_4
    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/h/h;->a(Lcom/roidapp/cloudlib/sns/main/b;)V

    goto/16 :goto_0

    .line 714
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->i:I

    if-ne v0, v1, :cond_7

    .line 715
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->K:Lcom/roidapp/cloudlib/sns/b/x;

    if-eqz v0, :cond_0

    .line 716
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->L:Lcom/roidapp/cloudlib/sns/b/c;

    .line 2796
    sget-object v1, Lcom/roidapp/cloudlib/sns/b/c;->b:Lcom/roidapp/cloudlib/sns/b/c;

    if-ne v0, v1, :cond_6

    .line 2839
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    .line 2840
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/h/h;->K:Lcom/roidapp/cloudlib/sns/b/x;

    invoke-virtual {v1, v2, v0}, Lcom/roidapp/cloudlib/sns/g/b;->b(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;)V

    .line 2841
    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v2, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-wide v4, p0, Lcom/roidapp/cloudlib/sns/h/h;->I:J

    new-instance v6, Lcom/roidapp/cloudlib/sns/h/m;

    invoke-direct {v6, p0, v0}, Lcom/roidapp/cloudlib/sns/h/m;-><init>(Lcom/roidapp/cloudlib/sns/h/h;Lcom/roidapp/cloudlib/sns/b/p;)V

    invoke-static/range {v1 .. v6}, Lcom/roidapp/cloudlib/sns/q;->b(Ljava/lang/String;JJLcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 2798
    :cond_6
    sget-object v1, Lcom/roidapp/cloudlib/sns/b/c;->c:Lcom/roidapp/cloudlib/sns/b/c;

    if-ne v0, v1, :cond_0

    .line 3804
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v0

    .line 3805
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/h/h;->K:Lcom/roidapp/cloudlib/sns/b/x;

    invoke-virtual {v1, v2, v0}, Lcom/roidapp/cloudlib/sns/g/b;->b(Lcom/roidapp/cloudlib/sns/b/x;Lcom/roidapp/cloudlib/sns/b/p;)V

    .line 3806
    iget-object v1, v0, Lcom/roidapp/cloudlib/sns/b/p;->a:Ljava/lang/String;

    iget-object v2, v0, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v2, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-wide v4, p0, Lcom/roidapp/cloudlib/sns/h/h;->I:J

    new-instance v6, Lcom/roidapp/cloudlib/sns/h/l;

    invoke-direct {v6, p0, v0}, Lcom/roidapp/cloudlib/sns/h/l;-><init>(Lcom/roidapp/cloudlib/sns/h/h;Lcom/roidapp/cloudlib/sns/b/p;)V

    invoke-static/range {v1 .. v6}, Lcom/roidapp/cloudlib/sns/q;->a(Ljava/lang/String;JJLcom/roidapp/cloudlib/sns/w;)Lcom/roidapp/cloudlib/sns/o;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/o;->a(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 718
    :cond_7
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->cl:I

    if-ne v0, v1, :cond_8

    .line 719
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->y()V

    goto/16 :goto_0

    .line 720
    :cond_8
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sget v1, Lcom/roidapp/cloudlib/ar;->cj:I

    if-ne v0, v1, :cond_0

    .line 721
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    const-string v0, "SNS"

    const-string v1, "click"

    const-string v2, "SNS/Profile/Setting"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    invoke-static {v0, v1, v2}, Lcom/roidapp/baselib/c/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 722
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    const-string v2, "SNS"

    const-string v3, "click"

    const-string v4, "SNS/Profile/Setting"

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roidapp/cloudlib/al;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V

    .line 723
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->A()V

    goto/16 :goto_0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 8

    .prologue
    const-wide/16 v6, -0x1

    const/4 v1, 0x0

    const/4 v0, 0x1

    .line 142
    invoke-super {p0, p1}, Lcom/roidapp/cloudlib/sns/basepost/h;->onCreate(Landroid/os/Bundle;)V

    .line 143
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/cloudlib/sns/af;->a(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 144
    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->Y:Z

    .line 175
    :cond_0
    :goto_0
    return-void

    .line 147
    :cond_1
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/h/h;->h:Lcom/roidapp/cloudlib/sns/b/x;

    if-nez v2, :cond_2

    .line 148
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-static {v2}, Lcom/roidapp/cloudlib/sns/b/q;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/sns/b/q;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/cloudlib/sns/b/q;->c()Lcom/roidapp/cloudlib/sns/b/p;

    move-result-object v2

    iput-object v2, p0, Lcom/roidapp/cloudlib/sns/h/h;->i:Lcom/roidapp/cloudlib/sns/b/p;

    .line 149
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/h/h;->i:Lcom/roidapp/cloudlib/sns/b/p;

    if-eqz v2, :cond_2

    .line 150
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/h/h;->i:Lcom/roidapp/cloudlib/sns/b/p;

    iget-object v2, v2, Lcom/roidapp/cloudlib/sns/b/p;->b:Lcom/roidapp/cloudlib/sns/b/x;

    iput-object v2, p0, Lcom/roidapp/cloudlib/sns/h/h;->h:Lcom/roidapp/cloudlib/sns/b/x;

    .line 153
    :cond_2
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/h/h;->h:Lcom/roidapp/cloudlib/sns/b/x;

    if-nez v2, :cond_3

    .line 154
    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->Y:Z

    goto :goto_0

    .line 157
    :cond_3
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/h/h;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    .line 158
    if-eqz v2, :cond_0

    .line 159
    const-string v3, "user_id"

    invoke-virtual {v2, v3, v6, v7}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    iput-wide v4, p0, Lcom/roidapp/cloudlib/sns/h/h;->I:J

    .line 160
    const-string v3, "user_name"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/roidapp/cloudlib/sns/h/h;->T:Ljava/lang/String;

    .line 161
    const-string v3, "user_photo_url"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/roidapp/cloudlib/sns/h/h;->U:Ljava/lang/String;

    .line 162
    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->V:Z

    .line 163
    iget-wide v2, p0, Lcom/roidapp/cloudlib/sns/h/h;->I:J

    cmp-long v2, v2, v6

    if-eqz v2, :cond_5

    .line 164
    iget-object v2, p0, Lcom/roidapp/cloudlib/sns/h/h;->h:Lcom/roidapp/cloudlib/sns/b/x;

    iget-wide v2, v2, Lcom/roidapp/cloudlib/sns/b/x;->a:J

    iget-wide v4, p0, Lcom/roidapp/cloudlib/sns/h/h;->I:J

    cmp-long v2, v2, v4

    if-nez v2, :cond_4

    :goto_1
    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->H:Z

    .line 171
    :goto_2
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->H:Z

    if-eqz v0, :cond_0

    .line 172
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->h:Lcom/roidapp/cloudlib/sns/b/x;

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->K:Lcom/roidapp/cloudlib/sns/b/x;

    goto :goto_0

    :cond_4
    move v0, v1

    .line 164
    goto :goto_1

    .line 165
    :cond_5
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->T:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 166
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->V:Z

    .line 167
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->h:Lcom/roidapp/cloudlib/sns/b/x;

    iget-object v0, v0, Lcom/roidapp/cloudlib/sns/b/x;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->T:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->H:Z

    goto :goto_2

    .line 169
    :cond_6
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->H:Z

    goto :goto_2
.end method

.method public final onDestroyView()V
    .locals 2

    .prologue
    .line 252
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->onDestroyView()V

    .line 253
    invoke-static {}, Lcom/roidapp/cloudlib/sns/upload/e;->a()Lcom/roidapp/cloudlib/sns/upload/e;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->ah:Lcom/roidapp/cloudlib/sns/upload/j;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/upload/e;->b(Lcom/roidapp/cloudlib/sns/upload/j;)V

    .line 254
    return-void
.end method

.method public final onRefresh()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 218
    invoke-super {p0}, Lcom/roidapp/cloudlib/sns/basepost/h;->onRefresh()V

    .line 219
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->Y:Z

    if-eqz v0, :cond_1

    .line 248
    :cond_0
    :goto_0
    return-void

    .line 221
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->e:Z

    if-nez v0, :cond_0

    .line 222
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->Q:Lcom/roidapp/cloudlib/sns/o;

    if-eqz v0, :cond_2

    .line 223
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->Q:Lcom/roidapp/cloudlib/sns/o;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/o;->f()V

    .line 224
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 225
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a()V

    .line 228
    :cond_2
    iput-boolean v1, p0, Lcom/roidapp/cloudlib/sns/h/h;->e:Z

    .line 230
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b()Z

    move-result v0

    if-nez v0, :cond_3

    .line 231
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(Z)V

    .line 234
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    if-eqz v0, :cond_4

    .line 235
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/basepost/bc;->d()V

    .line 236
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->d:Lcom/roidapp/cloudlib/sns/basepost/bc;

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/basepost/bc;->a(Z)V

    .line 238
    :cond_4
    iput v2, p0, Lcom/roidapp/cloudlib/sns/h/h;->W:I

    .line 239
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->V:Z

    if-eqz v0, :cond_5

    .line 240
    invoke-direct {p0, v1}, Lcom/roidapp/cloudlib/sns/h/h;->e(Z)V

    .line 241
    invoke-direct {p0, v1}, Lcom/roidapp/cloudlib/sns/h/h;->c(Z)V

    .line 246
    :goto_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/h/h;->f:Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->setEnabled(Z)V

    goto :goto_0

    .line 243
    :cond_5
    invoke-direct {p0, v1}, Lcom/roidapp/cloudlib/sns/h/h;->f(Z)V

    .line 244
    invoke-direct {p0, v1}, Lcom/roidapp/cloudlib/sns/h/h;->d(Z)V

    goto :goto_1
.end method
