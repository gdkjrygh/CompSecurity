.class public abstract Lcom/roidapp/cloudlib/sns/topic/a;
.super Landroid/support/v7/widget/al;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/k;
.implements Lcom/bumptech/glide/l;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/support/v7/widget/al",
        "<",
        "Lcom/roidapp/baselib/c/s;",
        ">;",
        "Lcom/bumptech/glide/k",
        "<TU;>;",
        "Lcom/bumptech/glide/l",
        "<TU;>;"
    }
.end annotation


# instance fields
.field protected final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/sns/b/n;",
            ">;"
        }
    .end annotation
.end field

.field protected b:Landroid/support/v4/app/Fragment;

.field protected c:Landroid/content/Context;

.field protected d:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field protected final e:I

.field protected final f:I

.field protected final g:I

.field protected h:Landroid/view/View$OnClickListener;

.field protected i:I


# direct methods
.method public constructor <init>(Landroid/support/v4/app/Fragment;Landroid/view/View$OnClickListener;I)V
    .locals 1

    .prologue
    .line 33
    invoke-direct {p0}, Landroid/support/v7/widget/al;-><init>()V

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a;->a:Ljava/util/List;

    .line 34
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/topic/a;->b:Landroid/support/v4/app/Fragment;

    .line 35
    invoke-virtual {p1}, Landroid/support/v4/app/Fragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a;->c:Landroid/content/Context;

    .line 36
    iput-object p2, p0, Lcom/roidapp/cloudlib/sns/topic/a;->h:Landroid/view/View$OnClickListener;

    .line 37
    iput p3, p0, Lcom/roidapp/cloudlib/sns/topic/a;->f:I

    .line 38
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/cloudlib/sns/topic/a;->g:I

    .line 39
    iget v0, p0, Lcom/roidapp/cloudlib/sns/topic/a;->g:I

    div-int/2addr v0, p3

    iput v0, p0, Lcom/roidapp/cloudlib/sns/topic/a;->e:I

    .line 40
    return-void
.end method


# virtual methods
.method protected final a(Landroid/view/View;Lcom/roidapp/cloudlib/sns/b/n;)V
    .locals 1

    .prologue
    .line 212
    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a;->h:Landroid/view/View$OnClickListener;

    if-eqz v0, :cond_0

    .line 213
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 214
    iget-object v0, p0, Lcom/roidapp/cloudlib/sns/topic/a;->h:Landroid/view/View$OnClickListener;

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 216
    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 43
    iput-object p1, p0, Lcom/roidapp/cloudlib/sns/topic/a;->d:Ljava/lang/Object;

    .line 44
    return-void
.end method

.method public abstract e(I)Z
.end method

.method public final f(I)V
    .locals 0

    .prologue
    .line 221
    iput p1, p0, Lcom/roidapp/cloudlib/sns/topic/a;->i:I

    .line 222
    return-void
.end method
