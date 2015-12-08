.class public Lcom/roidapp/photogrid/release/hh;
.super Lcom/roidapp/photogrid/release/ht;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 23
    const-class v0, Lcom/roidapp/photogrid/release/hh;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/roidapp/photogrid/release/hh;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ht;-><init>()V

    return-void
.end method


# virtual methods
.method protected final a()V
    .locals 9

    .prologue
    const/4 v8, 0x0

    .line 26
    sget-object v0, Lcom/roidapp/videolib/b/u;->k:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v0

    new-array v0, v0, [Lcom/roidapp/photogrid/video/bj;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/hh;->e:[Lcom/roidapp/photogrid/video/bj;

    .line 27
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hh;->e:[Lcom/roidapp/photogrid/video/bj;

    sget-object v1, Lcom/roidapp/videolib/b/u;->a:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v1}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v1

    new-instance v2, Lcom/roidapp/photogrid/video/bj;

    sget-object v3, Lcom/roidapp/videolib/b/u;->a:Lcom/roidapp/videolib/b/u;

    const v4, 0x7f0703cb

    const v5, 0x7f0203c2

    invoke-direct {v2, v3, v4, v5, v8}, Lcom/roidapp/photogrid/video/bj;-><init>(Lcom/roidapp/videolib/b/u;IIZ)V

    aput-object v2, v0, v1

    .line 28
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hh;->e:[Lcom/roidapp/photogrid/video/bj;

    sget-object v1, Lcom/roidapp/videolib/b/u;->b:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v1}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v1

    new-instance v2, Lcom/roidapp/photogrid/video/bj;

    sget-object v3, Lcom/roidapp/videolib/b/u;->b:Lcom/roidapp/videolib/b/u;

    const v4, 0x7f0703cd

    const v5, 0x7f0203ca

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/hh;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v6

    invoke-static {v6}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v6

    const-string v7, "new_feature_video_transition_one_love"

    invoke-interface {v6, v7, v8}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v6

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/roidapp/photogrid/video/bj;-><init>(Lcom/roidapp/videolib/b/u;IIZ)V

    aput-object v2, v0, v1

    .line 30
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hh;->e:[Lcom/roidapp/photogrid/video/bj;

    sget-object v1, Lcom/roidapp/videolib/b/u;->c:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v1}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v1

    new-instance v2, Lcom/roidapp/photogrid/video/bj;

    sget-object v3, Lcom/roidapp/videolib/b/u;->c:Lcom/roidapp/videolib/b/u;

    const v4, 0x7f0703c6

    const v5, 0x7f020420

    invoke-direct {v2, v3, v4, v5, v8}, Lcom/roidapp/photogrid/video/bj;-><init>(Lcom/roidapp/videolib/b/u;IIZ)V

    aput-object v2, v0, v1

    .line 31
    return-void
.end method

.method protected final b()I
    .locals 1

    .prologue
    .line 35
    const v0, 0x7f0300c5

    return v0
.end method

.method protected final c()I
    .locals 1

    .prologue
    .line 39
    const v0, 0x7f030134

    return v0
.end method

.method protected final d()V
    .locals 4

    .prologue
    const/16 v3, 0x8

    .line 43
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ab()Lcom/roidapp/videolib/b/u;

    move-result-object v0

    .line 44
    sget-object v1, Lcom/roidapp/videolib/b/u;->a:Lcom/roidapp/videolib/b/u;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/roidapp/videolib/b/u;->b:Lcom/roidapp/videolib/b/u;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/roidapp/videolib/b/u;->c:Lcom/roidapp/videolib/b/u;

    if-ne v0, v1, :cond_2

    .line 45
    :cond_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hh;->e:[Lcom/roidapp/photogrid/video/bj;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v2

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/roidapp/photogrid/video/bj;->g:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v1

    iput v1, p0, Lcom/roidapp/photogrid/release/hh;->f:I

    .line 51
    :goto_0
    sget-object v1, Lcom/roidapp/videolib/b/u;->d:Lcom/roidapp/videolib/b/u;

    if-eq v0, v1, :cond_1

    .line 52
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hh;->e:[Lcom/roidapp/photogrid/video/bj;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v0

    aget-object v0, v1, v0

    iget-object v0, v0, Lcom/roidapp/photogrid/video/bj;->g:Landroid/view/View;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setSelected(Z)V

    .line 55
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/hh;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ng;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 56
    sget-object v0, Lcom/roidapp/videolib/b/u;->b:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/hh;->b(I)V

    .line 57
    sget-object v0, Lcom/roidapp/videolib/b/u;->c:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/hh;->b(I)V

    .line 62
    :goto_1
    return-void

    .line 47
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hh;->e:[Lcom/roidapp/photogrid/video/bj;

    sget-object v1, Lcom/roidapp/videolib/b/u;->a:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v1}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v1

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/roidapp/photogrid/video/bj;->g:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/release/hh;->f:I

    .line 48
    sget-object v0, Lcom/roidapp/videolib/b/u;->a:Lcom/roidapp/videolib/b/u;

    goto :goto_0

    .line 59
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hh;->e:[Lcom/roidapp/photogrid/video/bj;

    sget-object v1, Lcom/roidapp/videolib/b/u;->b:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v1}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v1

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/roidapp/photogrid/video/bj;->g:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 60
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hh;->e:[Lcom/roidapp/photogrid/video/bj;

    sget-object v1, Lcom/roidapp/videolib/b/u;->c:Lcom/roidapp/videolib/b/u;

    invoke-virtual {v1}, Lcom/roidapp/videolib/b/u;->ordinal()I

    move-result v1

    aget-object v0, v0, v1

    iget-object v0, v0, Lcom/roidapp/photogrid/video/bj;->g:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
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
    const/4 v2, 0x1

    .line 66
    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result v0

    .line 68
    :try_start_0
    iget v1, p0, Lcom/roidapp/photogrid/release/hh;->f:I

    if-ne v1, v0, :cond_0

    .line 142
    :goto_0
    return-void

    .line 69
    :cond_0
    invoke-static {}, Lcom/roidapp/videolib/b/u;->values()[Lcom/roidapp/videolib/b/u;

    move-result-object v1

    aget-object v1, v1, v0

    invoke-static {v1}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 70
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/release/hh;->a(I)Z

    move-result v1

    if-nez v1, :cond_1

    .line 71
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/hh;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v2, 0x7f0702f8

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {}, Lcom/roidapp/videolib/b/u;->values()[Lcom/roidapp/videolib/b/u;

    move-result-object v5

    aget-object v0, v5, v0

    invoke-static {v0}, Lcom/roidapp/videolib/core/e;->c(Lcom/roidapp/videolib/b/u;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, v4

    invoke-virtual {p0, v2, v3}, Lcom/roidapp/photogrid/release/hh;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0

    .line 142
    :catch_0
    move-exception v0

    goto :goto_0

    .line 76
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hh;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v1}, Lcom/roidapp/videolib/core/n;->b(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 77
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hh;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v1}, Lcom/roidapp/videolib/core/n;->a(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 78
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/hh;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 80
    const v1, 0x7f0702e7

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 81
    const v1, 0x7f070134

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;

    .line 82
    const v1, 0x7f070049

    new-instance v2, Lcom/roidapp/photogrid/release/hi;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/hi;-><init>(Lcom/roidapp/photogrid/release/hh;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 91
    const v1, 0x7f07027f

    new-instance v2, Lcom/roidapp/photogrid/release/hj;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/release/hj;-><init>(Lcom/roidapp/photogrid/release/hh;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 102
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    goto :goto_0

    .line 105
    :cond_2
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hh;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-static {v1}, Lcom/roidapp/videolib/core/n;->c(Landroid/content/Context;)I

    move-result v1

    if-ne v2, v1, :cond_3

    .line 106
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/hh;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f070048

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/release/hh;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->a(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 114
    :cond_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hh;->e:[Lcom/roidapp/photogrid/video/bj;

    iget v2, p0, Lcom/roidapp/photogrid/release/hh;->f:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/roidapp/photogrid/video/bj;->g:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setSelected(Z)V

    .line 115
    iput v0, p0, Lcom/roidapp/photogrid/release/hh;->f:I

    .line 116
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hh;->e:[Lcom/roidapp/photogrid/video/bj;

    iget v2, p0, Lcom/roidapp/photogrid/release/hh;->f:I

    aget-object v1, v1, v2

    iget-object v1, v1, Lcom/roidapp/photogrid/video/bj;->g:Landroid/view/View;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/view/View;->setSelected(Z)V

    .line 118
    invoke-static {}, Lcom/roidapp/videolib/b/u;->values()[Lcom/roidapp/videolib/b/u;

    move-result-object v1

    aget-object v1, v1, v0

    .line 119
    sget-object v2, Lcom/roidapp/videolib/b/u;->b:Lcom/roidapp/videolib/b/u;

    if-ne v1, v2, :cond_6

    .line 120
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hh;->e:[Lcom/roidapp/photogrid/video/bj;

    aget-object v2, v2, v0

    iget-object v2, v2, Lcom/roidapp/photogrid/video/bj;->f:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->isShown()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 121
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hh;->e:[Lcom/roidapp/photogrid/video/bj;

    aget-object v0, v2, v0

    iget-object v0, v0, Lcom/roidapp/photogrid/video/bj;->f:Landroid/widget/ImageView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 122
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/hh;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v2, "new_feature_video_transition_one_love"

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 124
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hh;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->f(Z)V

    .line 134
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hh;->d:Lcom/roidapp/photogrid/release/ng;

    if-eqz v0, :cond_5

    .line 135
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hh;->d:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ng;->a(Lcom/roidapp/videolib/b/u;)V

    .line 138
    :cond_5
    invoke-virtual {p0}, Lcom/roidapp/photogrid/release/hh;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->G()V

    goto/16 :goto_0

    .line 125
    :cond_6
    sget-object v2, Lcom/roidapp/videolib/b/u;->c:Lcom/roidapp/videolib/b/u;

    if-ne v1, v2, :cond_8

    .line 126
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hh;->e:[Lcom/roidapp/photogrid/video/bj;

    aget-object v2, v2, v0

    iget-object v2, v2, Lcom/roidapp/photogrid/video/bj;->f:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->isShown()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 127
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hh;->e:[Lcom/roidapp/photogrid/video/bj;

    aget-object v0, v2, v0

    iget-object v0, v0, Lcom/roidapp/photogrid/video/bj;->f:Landroid/widget/ImageView;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 129
    :cond_7
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hh;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->f(Z)V

    goto :goto_1

    .line 131
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hh;->c:Lcom/roidapp/photogrid/release/PhotoGridActivity;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->f(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1
.end method
