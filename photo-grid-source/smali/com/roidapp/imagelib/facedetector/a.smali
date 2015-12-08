.class public final Lcom/roidapp/imagelib/facedetector/a;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field protected a:Landroid/view/View;

.field protected b:I

.field private c:Landroid/widget/Button;

.field private d:Landroid/widget/ImageButton;

.field private e:Lcom/roidapp/imagelib/facedetector/LoadImageView;

.field private f:Ljava/lang/String;

.field private g:I

.field private h:[F

.field private i:Z

.field private j:Z

.field private k:Lcom/roidapp/imagelib/filter/bi;

.field private l:Lcom/roidapp/imagelib/b/b;

.field private volatile m:Z

.field private n:[Ljava/lang/Integer;

.field private o:Lcom/roidapp/imagelib/facedetector/e;

.field private p:Landroid/graphics/Bitmap;

.field private q:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 36
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 56
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/imagelib/facedetector/a;->j:Z

    .line 58
    const/16 v0, 0x14

    iput v0, p0, Lcom/roidapp/imagelib/facedetector/a;->b:I

    .line 59
    new-instance v0, Lcom/roidapp/imagelib/b/b;

    invoke-direct {v0}, Lcom/roidapp/imagelib/b/b;-><init>()V

    iput-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->l:Lcom/roidapp/imagelib/b/b;

    .line 60
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/imagelib/facedetector/a;->m:Z

    .line 78
    new-instance v0, Lcom/roidapp/imagelib/facedetector/b;

    invoke-direct {v0, p0}, Lcom/roidapp/imagelib/facedetector/b;-><init>(Lcom/roidapp/imagelib/facedetector/a;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->q:Landroid/os/Handler;

    .line 328
    return-void
.end method

.method static synthetic a(Lcom/roidapp/imagelib/facedetector/a;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/roidapp/imagelib/facedetector/a;->p:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/imagelib/facedetector/a;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->f:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/imagelib/facedetector/a;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 36
    .line 2248
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->q:Landroid/os/Handler;

    new-instance v1, Lcom/roidapp/imagelib/facedetector/c;

    invoke-direct {v1, p0, p1, p2}, Lcom/roidapp/imagelib/facedetector/c;-><init>(Lcom/roidapp/imagelib/facedetector/a;Ljava/lang/Throwable;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 36
    return-void
.end method

.method static synthetic a(Lcom/roidapp/imagelib/facedetector/a;Z)Z
    .locals 0

    .prologue
    .line 36
    iput-boolean p1, p0, Lcom/roidapp/imagelib/facedetector/a;->m:Z

    return p1
.end method

.method static synthetic b(Lcom/roidapp/imagelib/facedetector/a;)Lcom/roidapp/imagelib/facedetector/e;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->o:Lcom/roidapp/imagelib/facedetector/e;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/imagelib/facedetector/a;)Lcom/roidapp/imagelib/facedetector/LoadImageView;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->e:Lcom/roidapp/imagelib/facedetector/LoadImageView;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/imagelib/facedetector/a;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->p:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/imagelib/facedetector/a;)[F
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->h:[F

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/imagelib/facedetector/a;)[Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->n:[Ljava/lang/Integer;

    return-object v0
.end method

.method static synthetic g(Lcom/roidapp/imagelib/facedetector/a;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->q:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public final onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 173
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 174
    return-void
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 178
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 179
    instance-of v0, p1, Lcom/roidapp/imagelib/facedetector/e;

    if-eqz v0, :cond_0

    .line 180
    check-cast p1, Lcom/roidapp/imagelib/facedetector/e;

    iput-object p1, p0, Lcom/roidapp/imagelib/facedetector/a;->o:Lcom/roidapp/imagelib/facedetector/e;

    return-void

    .line 182
    :cond_0
    new-instance v0, Ljava/lang/ClassCastException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " must implemenet ImagePreviewFragment.OnCameraEditListener"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 201
    iget-boolean v0, p0, Lcom/roidapp/imagelib/facedetector/a;->m:Z

    if-eqz v0, :cond_1

    .line 210
    :cond_0
    :goto_0
    return-void

    .line 203
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 204
    sget v1, Lcom/roidapp/imagelib/g;->P:I

    if-ne v0, v1, :cond_2

    .line 205
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/imagelib/facedetector/f;

    invoke-direct {v1, p0}, Lcom/roidapp/imagelib/facedetector/f;-><init>(Lcom/roidapp/imagelib/facedetector/a;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0

    .line 206
    :cond_2
    sget v1, Lcom/roidapp/imagelib/g;->M:I

    if-ne v0, v1, :cond_0

    .line 207
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->o:Lcom/roidapp/imagelib/facedetector/e;

    if-eqz v0, :cond_0

    .line 208
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->o:Lcom/roidapp/imagelib/facedetector/e;

    invoke-interface {v0}, Lcom/roidapp/imagelib/facedetector/e;->b()V

    goto :goto_0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 117
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 118
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "ImagePreviewFragment/onCreate"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 120
    invoke-virtual {p0}, Lcom/roidapp/imagelib/facedetector/a;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    .line 121
    if-eqz v0, :cond_0

    .line 122
    const-string v1, "edit_image_path"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/imagelib/facedetector/a;->f:Ljava/lang/String;

    .line 123
    const-string v1, "entry_from"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    iput v1, p0, Lcom/roidapp/imagelib/facedetector/a;->g:I

    .line 124
    const-string v1, "edit_face_matrix"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getFloatArray(Ljava/lang/String;)[F

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->h:[F

    .line 127
    :cond_0
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/facedetector/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/gl/c;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 128
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/imagelib/facedetector/a;->i:Z

    .line 129
    new-instance v0, Lcom/roidapp/imagelib/filter/bi;

    invoke-virtual {p0}, Lcom/roidapp/imagelib/facedetector/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/roidapp/imagelib/filter/bi;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->k:Lcom/roidapp/imagelib/filter/bi;

    .line 130
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->k:Lcom/roidapp/imagelib/filter/bi;

    if-eqz v0, :cond_1

    .line 131
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->k:Lcom/roidapp/imagelib/filter/bi;

    iget-object v1, p0, Lcom/roidapp/imagelib/facedetector/a;->l:Lcom/roidapp/imagelib/b/b;

    iget v2, p0, Lcom/roidapp/imagelib/facedetector/a;->b:I

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/imagelib/filter/bi;->a(Lcom/roidapp/imagelib/b/b;I)V

    .line 132
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->k:Lcom/roidapp/imagelib/filter/bi;

    iget-boolean v1, p0, Lcom/roidapp/imagelib/facedetector/a;->i:Z

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/filter/bi;->c(Z)V

    .line 136
    :cond_1
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    .prologue
    const/high16 v8, 0x42000000    # 32.0f

    const/16 v7, 0x280

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 142
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v0

    const-string v1, "ImagePreviewFragment/onCreateView"

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 144
    sget v0, Lcom/roidapp/imagelib/h;->k:I

    invoke-virtual {p1, v0, p2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->a:Landroid/view/View;

    .line 146
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->a:Landroid/view/View;

    .line 1154
    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v1

    const-string v2, "ImagePreviewFragment/initView"

    invoke-virtual {v1, v2}, Lcom/roidapp/imagelib/ImageLibrary;->a(Ljava/lang/String;)V

    .line 1156
    sget v1, Lcom/roidapp/imagelib/g;->aF:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/facedetector/LoadImageView;

    iput-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->e:Lcom/roidapp/imagelib/facedetector/LoadImageView;

    .line 1158
    invoke-virtual {p0}, Lcom/roidapp/imagelib/facedetector/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->f:Ljava/lang/String;

    .line 1215
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1219
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v2

    long-to-float v2, v2

    const/high16 v3, 0x44800000    # 1024.0f

    div-float/2addr v2, v3

    const/high16 v3, 0x44800000    # 1024.0f

    div-float/2addr v2, v3

    .line 1220
    const/high16 v3, 0x42c00000    # 96.0f

    cmpl-float v3, v2, v3

    if-ltz v3, :cond_1

    .line 1221
    const/16 v2, 0x1000

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1222
    const/16 v2, 0x800

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v5, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1223
    const/16 v2, 0x400

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v6, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1238
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/Integer;

    .line 1239
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1240
    invoke-static {v0, v2}, Lcom/roidapp/imagelib/b/d;->a(Ljava/lang/String;[Ljava/lang/Integer;)[Ljava/lang/Integer;

    move-result-object v0

    .line 1243
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Load min length is "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1158
    iput-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->n:[Ljava/lang/Integer;

    .line 1160
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/roidapp/imagelib/facedetector/d;

    iget-object v2, p0, Lcom/roidapp/imagelib/facedetector/a;->f:Ljava/lang/String;

    invoke-direct {v1, p0, v2, v4}, Lcom/roidapp/imagelib/facedetector/d;-><init>(Lcom/roidapp/imagelib/facedetector/a;Ljava/lang/String;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 148
    iget-object v1, p0, Lcom/roidapp/imagelib/facedetector/a;->a:Landroid/view/View;

    .line 2165
    sget v0, Lcom/roidapp/imagelib/g;->P:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->c:Landroid/widget/Button;

    .line 2166
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->c:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2167
    sget v0, Lcom/roidapp/imagelib/g;->M:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->d:Landroid/widget/ImageButton;

    .line 2168
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->d:Landroid/widget/ImageButton;

    invoke-virtual {v0, p0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 150
    iget-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->a:Landroid/view/View;

    return-object v0

    .line 1224
    :cond_1
    const/high16 v3, 0x42c00000    # 96.0f

    cmpg-float v3, v2, v3

    if-gez v3, :cond_2

    const/high16 v3, 0x42800000    # 64.0f

    cmpl-float v3, v2, v3

    if-ltz v3, :cond_2

    .line 1225
    const/16 v2, 0x800

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1226
    const/16 v2, 0x400

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v5, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1227
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v6, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_0

    .line 1228
    :cond_2
    const/high16 v3, 0x42800000    # 64.0f

    cmpg-float v3, v2, v3

    if-gez v3, :cond_3

    cmpl-float v3, v2, v8

    if-ltz v3, :cond_3

    .line 1229
    const/16 v2, 0x67c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1230
    const/16 v2, 0x3c0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v5, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1231
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v6, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 1232
    :cond_3
    cmpg-float v2, v2, v8

    if-gez v2, :cond_0

    .line 1233
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v4, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1234
    const/16 v2, 0x1e0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v5, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1235
    const/16 v2, 0x140

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v6, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto/16 :goto_0
.end method

.method public final onDestroyView()V
    .locals 0

    .prologue
    .line 195
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDestroyView()V

    .line 196
    return-void
.end method

.method public final onDetach()V
    .locals 1

    .prologue
    .line 189
    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V

    .line 190
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/imagelib/facedetector/a;->o:Lcom/roidapp/imagelib/facedetector/e;

    .line 191
    return-void
.end method
