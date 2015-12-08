.class public Lcom/roidapp/cloudlib/sns/main/b;
.super Lcom/roidapp/baselib/c/a;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/sns/g/c;


# instance fields
.field private a:Z

.field private b:I

.field private c:Landroid/support/v4/app/FragmentManager;

.field private d:[Lcom/roidapp/cloudlib/sns/g/e;

.field protected s:Lcom/roidapp/cloudlib/sns/main/a;

.field protected t:Lcom/roidapp/cloudlib/sns/ab;

.field protected final u:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 26
    invoke-direct {p0}, Lcom/roidapp/baselib/c/a;-><init>()V

    .line 28
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->a:Z

    .line 30
    const/high16 v0, -0x80000000

    iput v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->b:I

    .line 40
    new-instance v0, Lcom/roidapp/cloudlib/sns/main/c;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/sns/main/c;-><init>(Lcom/roidapp/cloudlib/sns/main/b;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->u:Landroid/view/View$OnClickListener;

    .line 48
    return-void
.end method

.method private d()V
    .locals 1

    .prologue
    .line 334
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    if-eqz v0, :cond_0

    .line 335
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/main/a;->a()Landroid/support/v4/view/ViewPager;

    move-result-object v0

    .line 336
    if-eqz v0, :cond_0

    .line 337
    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->notifyDataSetChanged()V

    .line 340
    :cond_0
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 1

    .prologue
    .line 356
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/main/a;->m()V

    .line 357
    return-void
.end method

.method public a(Landroid/content/Context;)Landroid/view/View;
    .locals 1

    .prologue
    .line 282
    const/4 v0, 0x0

    return-object v0
.end method

.method public final a(ILcom/roidapp/cloudlib/sns/main/b;)Lcom/roidapp/cloudlib/sns/main/d;
    .locals 6

    .prologue
    const/4 v2, 0x0

    .line 73
    new-instance v0, Lcom/roidapp/cloudlib/sns/main/d;

    move v1, p1

    move-object v3, p0

    move-object v4, p2

    move v5, v2

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/cloudlib/sns/main/d;-><init>(IZLcom/roidapp/cloudlib/sns/main/b;Lcom/roidapp/cloudlib/sns/main/b;Z)V

    return-object v0
.end method

.method public final a(ILcom/roidapp/cloudlib/sns/main/b;Z)Lcom/roidapp/cloudlib/sns/main/d;
    .locals 1

    .prologue
    .line 69
    new-instance v0, Lcom/roidapp/cloudlib/sns/main/d;

    invoke-direct {v0, p1, p3, p0, p2}, Lcom/roidapp/cloudlib/sns/main/d;-><init>(IZLcom/roidapp/cloudlib/sns/main/b;Lcom/roidapp/cloudlib/sns/main/b;)V

    return-object v0
.end method

.method protected final a(Landroid/support/v4/widget/SwipeRefreshLayout;)V
    .locals 3

    .prologue
    .line 302
    if-eqz p1, :cond_0

    .line 303
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/main/b;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/ap;->m:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    .line 304
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/main/b;->t()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float v2, v0, v2

    sub-float/2addr v1, v2

    float-to-int v1, v1

    .line 305
    int-to-float v2, v1

    add-float/2addr v0, v2

    float-to-int v0, v0

    .line 306
    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setProgressViewOffset(ZII)V

    .line 307
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    invoke-virtual {p1, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setColorSchemeColors([I)V

    .line 309
    :cond_0
    return-void

    .line 307
    :array_0
    .array-data 4
        -0xff8000
        -0x10000
        -0x5b00
        -0x100
    .end array-data
.end method

.method public final a(Landroid/view/View;Lcom/roidapp/cloudlib/sns/main/b;)V
    .locals 1

    .prologue
    .line 189
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    if-eqz v0, :cond_0

    .line 190
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v0, p1}, Lcom/roidapp/cloudlib/sns/main/a;->a(Landroid/view/View;)V

    .line 192
    :cond_0
    if-eqz p2, :cond_1

    instance-of v0, p1, Lcom/roidapp/cloudlib/sns/ab;

    if-eqz v0, :cond_1

    .line 193
    check-cast p1, Lcom/roidapp/cloudlib/sns/ab;

    iput-object p1, p2, Lcom/roidapp/cloudlib/sns/main/b;->t:Lcom/roidapp/cloudlib/sns/ab;

    .line 195
    :cond_1
    return-void
.end method

.method public a(Lcom/roidapp/cloudlib/sns/g/e;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 353
    return-void
.end method

.method public final a(Lcom/roidapp/cloudlib/sns/main/b;)V
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/main/a;->a()Landroid/support/v4/view/ViewPager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    invoke-virtual {p0, v0, p1}, Lcom/roidapp/cloudlib/sns/main/b;->b(ILcom/roidapp/cloudlib/sns/main/b;)V

    .line 83
    return-void
.end method

.method protected final a(Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;ZZ)V
    .locals 8

    .prologue
    .line 312
    if-eqz p1, :cond_0

    .line 313
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/main/b;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/cloudlib/ap;->j:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 314
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/main/b;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/cloudlib/ap;->m:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    .line 315
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/main/b;->t()I

    move-result v2

    int-to-double v2, v2

    float-to-double v4, v1

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    div-double/2addr v4, v6

    sub-double/2addr v2, v4

    double-to-int v2, v2

    .line 316
    int-to-float v3, v2

    add-float/2addr v1, v3

    float-to-int v1, v1

    .line 318
    sub-int/2addr v2, v0

    invoke-virtual {p1, v2, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(II)V

    .line 319
    const/4 v1, 0x4

    new-array v1, v1, [I

    fill-array-data v1, :array_0

    invoke-virtual {p1, v1}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a([I)V

    .line 321
    invoke-virtual {p1, p2}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->c(Z)V

    .line 322
    invoke-virtual {p1, p3}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->b(Z)V

    .line 323
    if-eqz p3, :cond_0

    .line 324
    invoke-virtual {p1, v0}, Lcom/roidapp/cloudlib/sns/modifiedrefresh/SwipeRefreshLayout2;->a(I)V

    .line 327
    :cond_0
    return-void

    .line 319
    nop

    :array_0
    .array-data 4
        -0xff8000
        -0x10000
        -0x5b00
        -0x100
    .end array-data
.end method

.method protected final varargs a([Lcom/roidapp/cloudlib/sns/g/e;)V
    .locals 5

    .prologue
    .line 251
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->d:[Lcom/roidapp/cloudlib/sns/g/e;

    if-nez v0, :cond_0

    .line 252
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/main/b;->d:[Lcom/roidapp/cloudlib/sns/g/e;

    .line 253
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/main/b;->d:[Lcom/roidapp/cloudlib/sns/g/e;

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 254
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v4

    invoke-virtual {v4, v3, p0}, Lcom/roidapp/cloudlib/sns/g/b;->a(Lcom/roidapp/cloudlib/sns/g/e;Lcom/roidapp/cloudlib/sns/g/c;)V

    .line 253
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 257
    :cond_0
    return-void
.end method

.method public final varargs a([Lcom/roidapp/cloudlib/sns/main/d;)V
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 110
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    if-nez v1, :cond_1

    .line 146
    :cond_0
    :goto_0
    return-void

    .line 119
    :cond_1
    array-length v2, p1

    move v1, v0

    :goto_1
    if-ge v0, v2, :cond_7

    aget-object v1, p1, v0

    .line 120
    iget-boolean v3, v1, Lcom/roidapp/cloudlib/sns/main/d;->e:Z

    if-eqz v3, :cond_2

    .line 121
    iget-object v3, v1, Lcom/roidapp/cloudlib/sns/main/d;->d:Lcom/roidapp/cloudlib/sns/main/b;

    .line 1286
    iget-boolean v3, v3, Lcom/roidapp/cloudlib/sns/main/b;->a:Z

    .line 121
    if-eqz v3, :cond_5

    .line 122
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v3}, Lcom/roidapp/cloudlib/sns/main/a;->f()V

    .line 128
    :cond_2
    :goto_2
    iget-boolean v3, v1, Lcom/roidapp/cloudlib/sns/main/d;->b:Z

    if-eqz v3, :cond_6

    .line 129
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v3, p0}, Lcom/roidapp/cloudlib/sns/main/a;->a(Landroid/support/v4/app/Fragment;)V

    .line 135
    :cond_3
    :goto_3
    iget-boolean v3, v1, Lcom/roidapp/cloudlib/sns/main/d;->e:Z

    if-eqz v3, :cond_4

    .line 136
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v3}, Lcom/roidapp/cloudlib/sns/main/a;->b()Landroid/view/View;

    move-result-object v3

    iget-object v4, v1, Lcom/roidapp/cloudlib/sns/main/d;->d:Lcom/roidapp/cloudlib/sns/main/b;

    invoke-virtual {v4}, Lcom/roidapp/cloudlib/sns/main/b;->hashCode()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/roidapp/cloudlib/sns/a/a;->a(Landroid/view/View;Ljava/lang/Object;)V

    .line 137
    iget-object v3, v1, Lcom/roidapp/cloudlib/sns/main/d;->d:Lcom/roidapp/cloudlib/sns/main/b;

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/main/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/roidapp/cloudlib/sns/main/b;->a(Landroid/content/Context;)Landroid/view/View;

    move-result-object v3

    iget-object v4, v1, Lcom/roidapp/cloudlib/sns/main/d;->d:Lcom/roidapp/cloudlib/sns/main/b;

    invoke-virtual {p0, v3, v4}, Lcom/roidapp/cloudlib/sns/main/b;->a(Landroid/view/View;Lcom/roidapp/cloudlib/sns/main/b;)V

    .line 139
    :cond_4
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    iget v4, v1, Lcom/roidapp/cloudlib/sns/main/d;->a:I

    iget-object v1, v1, Lcom/roidapp/cloudlib/sns/main/d;->d:Lcom/roidapp/cloudlib/sns/main/b;

    invoke-interface {v3, v4, v1}, Lcom/roidapp/cloudlib/sns/main/a;->a(ILcom/roidapp/cloudlib/sns/main/b;)V

    .line 140
    const/4 v1, 0x1

    .line 119
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 124
    :cond_5
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v3}, Lcom/roidapp/cloudlib/sns/main/a;->m_()V

    goto :goto_2

    .line 130
    :cond_6
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/main/b;->c:Landroid/support/v4/app/FragmentManager;

    if-eqz v3, :cond_3

    .line 131
    iget-object v3, p0, Lcom/roidapp/cloudlib/sns/main/b;->c:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v3}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v3

    iget-object v4, v1, Lcom/roidapp/cloudlib/sns/main/d;->c:Lcom/roidapp/cloudlib/sns/main/b;

    invoke-virtual {v3, v4}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v4/app/FragmentTransaction;->commitAllowingStateLoss()I

    goto :goto_3

    .line 143
    :cond_7
    if-eqz v1, :cond_0

    .line 144
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/main/b;->d()V

    goto :goto_0
.end method

.method public final b(I)Lcom/roidapp/cloudlib/sns/main/b;
    .locals 1

    .prologue
    .line 198
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    if-eqz v0, :cond_0

    .line 199
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v0, p1}, Lcom/roidapp/cloudlib/sns/main/a;->a(I)Lcom/roidapp/cloudlib/sns/main/b;

    move-result-object v0

    .line 201
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(ILcom/roidapp/cloudlib/sns/main/b;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 96
    new-array v0, v2, [Lcom/roidapp/cloudlib/sns/main/d;

    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, v2}, Lcom/roidapp/cloudlib/sns/main/b;->a(ILcom/roidapp/cloudlib/sns/main/b;Z)Lcom/roidapp/cloudlib/sns/main/d;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-virtual {p0, v0}, Lcom/roidapp/cloudlib/sns/main/b;->a([Lcom/roidapp/cloudlib/sns/main/d;)V

    .line 97
    return-void
.end method

.method public h_()Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 152
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    if-nez v0, :cond_0

    move v0, v1

    .line 180
    :goto_0
    return v0

    .line 156
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/main/a;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v1

    .line 157
    goto :goto_0

    .line 160
    :cond_1
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/main/a;->a()Landroid/support/v4/view/ViewPager;

    move-result-object v2

    .line 161
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/main/a;->g()Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/sns/main/b;

    .line 162
    if-eqz v0, :cond_4

    .line 2286
    iget-boolean v1, v0, Lcom/roidapp/cloudlib/sns/main/b;->a:Z

    .line 163
    if-eqz v1, :cond_3

    .line 164
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v1}, Lcom/roidapp/cloudlib/sns/main/a;->f()V

    .line 169
    :goto_1
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/main/b;->c:Landroid/support/v4/app/FragmentManager;

    if-eqz v1, :cond_2

    .line 170
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/main/b;->c:Landroid/support/v4/app/FragmentManager;

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 174
    :cond_2
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v1}, Lcom/roidapp/cloudlib/sns/main/a;->b()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/sns/main/b;->hashCode()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/roidapp/cloudlib/sns/a/a;->a(Landroid/view/View;Ljava/lang/Object;)V

    .line 175
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/main/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/sns/main/b;->a(Landroid/content/Context;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lcom/roidapp/cloudlib/sns/main/b;->a(Landroid/view/View;Lcom/roidapp/cloudlib/sns/main/b;)V

    .line 176
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-virtual {v2}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v2

    invoke-interface {v1, v2, v0}, Lcom/roidapp/cloudlib/sns/main/a;->a(ILcom/roidapp/cloudlib/sns/main/b;)V

    .line 177
    invoke-direct {p0}, Lcom/roidapp/cloudlib/sns/main/b;->d()V

    .line 178
    const/4 v0, 0x1

    goto :goto_0

    .line 166
    :cond_3
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v1}, Lcom/roidapp/cloudlib/sns/main/a;->m_()V

    goto :goto_1

    :cond_4
    move v0, v1

    .line 180
    goto :goto_0
.end method

.method public i_()V
    .locals 0

    .prologue
    .line 344
    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 261
    invoke-super {p0, p1}, Lcom/roidapp/baselib/c/a;->onAttach(Landroid/app/Activity;)V

    .line 262
    check-cast p1, Lcom/roidapp/cloudlib/sns/main/a;

    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    .line 263
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/main/b;->getFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->c:Landroid/support/v4/app/FragmentManager;

    .line 264
    return-void
.end method

.method public onDestroy()V
    .locals 5

    .prologue
    .line 268
    invoke-super {p0}, Lcom/roidapp/baselib/c/a;->onDestroy()V

    .line 2330
    invoke-static {}, Lcom/roidapp/cloudlib/sns/u;->a()Lcom/roidapp/cloudlib/sns/u;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/cloudlib/sns/u;->a(Ljava/lang/Object;)V

    .line 270
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->d:[Lcom/roidapp/cloudlib/sns/g/e;

    if-eqz v0, :cond_0

    .line 271
    iget-object v1, p0, Lcom/roidapp/cloudlib/sns/main/b;->d:[Lcom/roidapp/cloudlib/sns/g/e;

    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 272
    invoke-static {}, Lcom/roidapp/cloudlib/sns/g/b;->a()Lcom/roidapp/cloudlib/sns/g/b;

    move-result-object v4

    invoke-virtual {v4, v3, p0}, Lcom/roidapp/cloudlib/sns/g/b;->b(Lcom/roidapp/cloudlib/sns/g/e;Lcom/roidapp/cloudlib/sns/g/c;)V

    .line 271
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 275
    :cond_0
    return-void
.end method

.method public final r()V
    .locals 1

    .prologue
    .line 205
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    if-eqz v0, :cond_0

    .line 206
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/main/a;->i()V

    .line 208
    :cond_0
    return-void
.end method

.method public final s()Z
    .locals 1

    .prologue
    .line 211
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    if-eqz v0, :cond_0

    .line 212
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/main/a;->k()Z

    move-result v0

    .line 214
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final t()I
    .locals 2

    .prologue
    .line 218
    iget v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->b:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_0

    .line 219
    iget v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->b:I

    .line 228
    :goto_0
    return v0

    .line 222
    :cond_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    if-eqz v0, :cond_1

    .line 223
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/main/a;->b()Landroid/view/View;

    move-result-object v0

    .line 224
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 225
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->b:I

    .line 226
    iget v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->b:I

    goto :goto_0

    .line 228
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final u()I
    .locals 1

    .prologue
    .line 232
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    if-eqz v0, :cond_0

    .line 233
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/main/a;->b()Landroid/view/View;

    move-result-object v0

    .line 234
    if-eqz v0, :cond_0

    .line 235
    invoke-static {v0}, Landroid/support/v4/view/ViewCompat;->getTranslationY(Landroid/view/View;)F

    move-result v0

    float-to-int v0, v0

    .line 238
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final v()Lcom/roidapp/cloudlib/sns/i;
    .locals 1

    .prologue
    .line 243
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/main/a;->l()Lcom/roidapp/cloudlib/sns/i;

    move-result-object v0

    return-object v0
.end method

.method public final w()Z
    .locals 1

    .prologue
    .line 286
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->a:Z

    return v0
.end method

.method public final x()V
    .locals 1

    .prologue
    .line 290
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->a:Z

    .line 291
    return-void
.end method

.method public final y()V
    .locals 1

    .prologue
    .line 298
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/main/b;->s:Lcom/roidapp/cloudlib/sns/main/a;

    invoke-interface {v0}, Lcom/roidapp/cloudlib/sns/main/a;->d()V

    .line 299
    return-void
.end method

.method protected final z()Z
    .locals 1

    .prologue
    .line 347
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/main/b;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/roidapp/cloudlib/sns/main/b;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
