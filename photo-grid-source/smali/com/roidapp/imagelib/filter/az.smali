.class public final Lcom/roidapp/imagelib/filter/az;
.super Lcom/roidapp/baselib/hlistview/HListView;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/baselib/hlistview/s;


# instance fields
.field private aA:Lcom/roidapp/imagelib/filter/bj;

.field private aB:[Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

.field private final aC:Lcom/roidapp/imagelib/filter/be;

.field private final az:Lcom/roidapp/imagelib/filter/bf;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/roidapp/imagelib/filter/bf;Z)V
    .locals 3

    .prologue
    .line 35
    invoke-direct {p0, p1}, Lcom/roidapp/baselib/hlistview/HListView;-><init>(Landroid/content/Context;)V

    .line 27
    new-instance v0, Lcom/roidapp/imagelib/filter/bj;

    invoke-direct {v0}, Lcom/roidapp/imagelib/filter/bj;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/az;->aA:Lcom/roidapp/imagelib/filter/bj;

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/az;->aB:[Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    .line 75
    new-instance v0, Lcom/roidapp/imagelib/filter/ba;

    invoke-direct {v0, p0}, Lcom/roidapp/imagelib/filter/ba;-><init>(Lcom/roidapp/imagelib/filter/az;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/az;->aC:Lcom/roidapp/imagelib/filter/be;

    .line 37
    iput-object p2, p0, Lcom/roidapp/imagelib/filter/az;->az:Lcom/roidapp/imagelib/filter/bf;

    .line 1042
    invoke-virtual {p0, p0}, Lcom/roidapp/imagelib/filter/az;->a(Lcom/roidapp/baselib/hlistview/s;)V

    .line 1043
    sget v0, Lcom/roidapp/imagelib/f;->bp:I

    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/filter/az;->a(I)V

    .line 1044
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/az;->aA:Lcom/roidapp/imagelib/filter/bj;

    iget-object v0, v0, Lcom/roidapp/imagelib/filter/bj;->b:[Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    iput-object v0, p0, Lcom/roidapp/imagelib/filter/az;->aB:[Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    .line 1045
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/az;->aB:[Lcom/roidapp/imagelib/filter/groupinfo/LocalGroupInfo;

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1046
    new-instance v1, Lcom/roidapp/imagelib/filter/ab;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/az;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v0, v2, p3}, Lcom/roidapp/imagelib/filter/ab;-><init>(Ljava/util/List;Landroid/content/Context;Z)V

    invoke-virtual {p0, v1}, Lcom/roidapp/imagelib/filter/az;->a(Landroid/widget/ListAdapter;)V

    .line 39
    return-void
.end method


# virtual methods
.method public final A()Lcom/roidapp/imagelib/filter/be;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/imagelib/filter/az;->aC:Lcom/roidapp/imagelib/filter/be;

    return-object v0
.end method

.method public final B()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;
    .locals 1

    .prologue
    .line 136
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/az;->z()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/ab;

    .line 137
    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 138
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, v0, Lcom/roidapp/imagelib/filter/ab;->a:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    goto :goto_0
.end method

.method public final a(Lcom/roidapp/baselib/hlistview/AdapterView;Landroid/view/View;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roidapp/baselib/hlistview/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "I)V"
        }
    .end annotation

    .prologue
    .line 91
    invoke-virtual {p1, p3}, Lcom/roidapp/baselib/hlistview/AdapterView;->j(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;

    .line 93
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v1

    const-string v2, "ImageFilterBaseView/onItemClick/position:"

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 94
    instance-of v1, v0, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    if-eqz v1, :cond_2

    .line 95
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/az;->getContext()Landroid/content/Context;

    move-result-object v2

    move-object v1, v0

    check-cast v1, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    iget-object v1, v1, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c:Ljava/lang/String;

    .line 2041
    invoke-static {v2, v1}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    .line 95
    if-nez v1, :cond_1

    .line 97
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/az;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 99
    sget v2, Lcom/roidapp/imagelib/j;->m:I

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 100
    sget v2, Lcom/roidapp/imagelib/j;->c:I

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 101
    sget v2, Lcom/roidapp/imagelib/j;->a:I

    new-instance v3, Lcom/roidapp/imagelib/filter/bb;

    invoke-direct {v3, p0}, Lcom/roidapp/imagelib/filter/bb;-><init>(Lcom/roidapp/imagelib/filter/az;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 110
    sget v2, Lcom/roidapp/imagelib/j;->d:I

    new-instance v3, Lcom/roidapp/imagelib/filter/bc;

    invoke-direct {v3, p0, v0}, Lcom/roidapp/imagelib/filter/bc;-><init>(Lcom/roidapp/imagelib/filter/az;Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;)V

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 121
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 131
    :cond_0
    :goto_0
    return-void

    .line 124
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/az;->getContext()Landroid/content/Context;

    move-result-object v2

    move-object v1, v0

    check-cast v1, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    iget-object v1, v1, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c:Ljava/lang/String;

    invoke-static {v2, v1}, Lcom/roidapp/imagelib/filter/r;->b(Landroid/content/Context;Ljava/lang/String;)[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/groupinfo/BaseGroupInfo;->a([Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 129
    :cond_2
    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/roidapp/imagelib/filter/az;->az:Lcom/roidapp/imagelib/filter/bf;

    if-eqz v1, :cond_0

    .line 130
    iget-object v1, p0, Lcom/roidapp/imagelib/filter/az;->az:Lcom/roidapp/imagelib/filter/bf;

    invoke-interface {v1, v0}, Lcom/roidapp/imagelib/filter/bf;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    goto :goto_0
.end method

.method public final a(Lcom/roidapp/imagelib/filter/b;Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;Lcom/roidapp/imagelib/filter/bd;)V
    .locals 8

    .prologue
    .line 147
    iget v1, p1, Lcom/roidapp/imagelib/filter/b;->c:I

    .line 148
    iget-object v2, p1, Lcom/roidapp/imagelib/filter/b;->a:Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;

    .line 149
    iget v3, p1, Lcom/roidapp/imagelib/filter/b;->b:I

    .line 150
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/az;->z()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/ab;

    .line 151
    invoke-virtual {v2}, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c()J

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Lcom/roidapp/imagelib/filter/ab;->a(J)Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v4

    .line 152
    if-eqz v4, :cond_0

    invoke-virtual {v0, v4}, Lcom/roidapp/imagelib/filter/ab;->b(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    .line 153
    :cond_0
    add-int/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/imagelib/filter/ab;->a(ILcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    .line 154
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->c()J

    move-result-wide v4

    invoke-virtual {v2}, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c()J

    move-result-wide v6

    cmp-long v1, v4, v6

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/az;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v3, v2, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c:Ljava/lang/String;

    .line 3041
    invoke-static {v1, v3}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    .line 154
    if-eqz v1, :cond_1

    .line 155
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/az;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v3, v2, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lcom/roidapp/imagelib/filter/r;->b(Landroid/content/Context;Ljava/lang/String;)[Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->a([Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 156
    invoke-interface {p2}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/roidapp/imagelib/filter/groupinfo/CloudGroupInfo;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 157
    invoke-virtual {p0, v2}, Lcom/roidapp/imagelib/filter/az;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    .line 159
    invoke-interface {p3, v2}, Lcom/roidapp/imagelib/filter/bd;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V

    .line 161
    :cond_1
    invoke-virtual {v0}, Lcom/roidapp/imagelib/filter/ab;->notifyDataSetChanged()V

    .line 162
    return-void
.end method

.method public final a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)V
    .locals 4

    .prologue
    .line 50
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/az;->z()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/ab;

    .line 51
    if-nez v0, :cond_1

    .line 69
    :cond_0
    :goto_0
    return-void

    .line 53
    :cond_1
    iget-object v1, v0, Lcom/roidapp/imagelib/filter/ab;->a:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    if-eq p1, v1, :cond_0

    .line 55
    iget-object v1, v0, Lcom/roidapp/imagelib/filter/ab;->a:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 56
    if-eqz v1, :cond_2

    .line 57
    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/ab;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)I

    move-result v2

    .line 58
    const/4 v3, 0x0

    invoke-interface {v1, v3}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 59
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/roidapp/imagelib/filter/az;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v1

    .line 60
    if-eqz v1, :cond_2

    .line 62
    sget v2, Lcom/roidapp/imagelib/f;->bp:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 64
    :cond_2
    iput-object p1, v0, Lcom/roidapp/imagelib/filter/ab;->a:Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    .line 65
    invoke-virtual {v0, p1}, Lcom/roidapp/imagelib/filter/ab;->a(Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/roidapp/imagelib/filter/az;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    .line 66
    if-eqz v0, :cond_0

    .line 67
    invoke-virtual {p0}, Lcom/roidapp/imagelib/filter/az;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/roidapp/imagelib/d;->b:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_0
.end method
