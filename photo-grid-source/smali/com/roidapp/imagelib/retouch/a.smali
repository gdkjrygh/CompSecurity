.class public final Lcom/roidapp/imagelib/retouch/a;
.super Landroid/support/v4/app/Fragment;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:I

.field protected a:Landroid/view/View;

.field protected b:Lcom/roidapp/imagelib/retouch/BlemishImageView;

.field protected c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private e:Landroid/os/Handler;

.field private f:Lcom/roidapp/imagelib/retouch/t;

.field private g:[Ljava/lang/Integer;

.field private h:Landroid/graphics/Bitmap;

.field private i:Lcom/roidapp/imagelib/retouch/w;

.field private j:Landroid/graphics/Bitmap;

.field private k:Lcom/roidapp/imagelib/retouch/Magnifier;

.field private l:Landroid/widget/RelativeLayout;

.field private m:Landroid/view/View;

.field private n:Landroid/view/View;

.field private o:Landroid/view/View;

.field private p:Landroid/view/View;

.field private q:Landroid/view/View;

.field private r:I

.field private s:I

.field private t:Landroid/widget/CheckedTextView;

.field private u:Landroid/widget/CheckedTextView;

.field private v:Landroid/widget/CheckedTextView;

.field private w:Landroid/widget/CheckedTextView;

.field private x:Landroid/widget/CheckedTextView;

.field private volatile y:Z

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 37
    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    .line 39
    const-string v0, "BlemishFragment"

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->d:Ljava/lang/String;

    .line 54
    new-instance v0, Lcom/roidapp/imagelib/retouch/f;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/imagelib/retouch/f;-><init>(Lcom/roidapp/imagelib/retouch/a;B)V

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->e:Landroid/os/Handler;

    .line 69
    iput-boolean v1, p0, Lcom/roidapp/imagelib/retouch/a;->y:Z

    .line 508
    return-void
.end method

.method static synthetic a(Lcom/roidapp/imagelib/retouch/a;)I
    .locals 1

    .prologue
    .line 37
    iget v0, p0, Lcom/roidapp/imagelib/retouch/a;->r:I

    return v0
.end method

.method static synthetic a(Lcom/roidapp/imagelib/retouch/a;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    .prologue
    .line 37
    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/a;->h:Landroid/graphics/Bitmap;

    return-object p1
.end method

.method static synthetic a(Lcom/roidapp/imagelib/retouch/a;Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 37
    .line 3371
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->e:Landroid/os/Handler;

    new-instance v1, Lcom/roidapp/imagelib/retouch/d;

    invoke-direct {v1, p0, p1, p2}, Lcom/roidapp/imagelib/retouch/d;-><init>(Lcom/roidapp/imagelib/retouch/a;Ljava/lang/Throwable;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 37
    return-void
.end method

.method static synthetic b(Lcom/roidapp/imagelib/retouch/a;)I
    .locals 1

    .prologue
    .line 37
    iget v0, p0, Lcom/roidapp/imagelib/retouch/a;->s:I

    return v0
.end method

.method static synthetic c(Lcom/roidapp/imagelib/retouch/a;)Lcom/roidapp/imagelib/retouch/t;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->f:Lcom/roidapp/imagelib/retouch/t;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/imagelib/retouch/a;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->h:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/imagelib/retouch/a;)Z
    .locals 1

    .prologue
    .line 37
    iget-boolean v0, p0, Lcom/roidapp/imagelib/retouch/a;->y:Z

    return v0
.end method

.method static synthetic f(Lcom/roidapp/imagelib/retouch/a;)[Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->g:[Ljava/lang/Integer;

    return-object v0
.end method

.method static synthetic g(Lcom/roidapp/imagelib/retouch/a;)Z
    .locals 1

    .prologue
    .line 37
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/imagelib/retouch/a;->y:Z

    return v0
.end method

.method static synthetic h(Lcom/roidapp/imagelib/retouch/a;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->e:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 339
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/a;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 340
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->i:Lcom/roidapp/imagelib/retouch/w;

    invoke-interface {v0}, Lcom/roidapp/imagelib/retouch/w;->d()V

    .line 342
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 345
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 346
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->i:Lcom/roidapp/imagelib/retouch/w;

    invoke-interface {v0}, Lcom/roidapp/imagelib/retouch/w;->e()V

    .line 348
    :cond_0
    return-void
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 351
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->i:Lcom/roidapp/imagelib/retouch/w;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->i:Lcom/roidapp/imagelib/retouch/w;

    invoke-interface {v0}, Lcom/roidapp/imagelib/retouch/w;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 355
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->i:Lcom/roidapp/imagelib/retouch/w;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->i:Lcom/roidapp/imagelib/retouch/w;

    invoke-interface {v0}, Lcom/roidapp/imagelib/retouch/w;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()Z
    .locals 4

    .prologue
    const/4 v0, 0x1

    .line 359
    iput-boolean v0, p0, Lcom/roidapp/imagelib/retouch/a;->y:Z

    .line 360
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/a;->b:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    invoke-virtual {v1, v0}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->a(Z)V

    .line 361
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/a;->b:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 362
    invoke-static {}, Lcom/roidapp/imagelib/retouch/l;->f()Lcom/roidapp/imagelib/retouch/l;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/a;->i:Lcom/roidapp/imagelib/retouch/w;

    invoke-interface {v2}, Lcom/roidapp/imagelib/retouch/w;->f()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/roidapp/imagelib/retouch/l;->c(I)V

    .line 363
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/a;->b:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    invoke-virtual {v1}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->a()Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/imagelib/retouch/a;->j:Landroid/graphics/Bitmap;

    .line 364
    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lcom/roidapp/imagelib/retouch/g;

    iget-object v3, p0, Lcom/roidapp/imagelib/retouch/a;->j:Landroid/graphics/Bitmap;

    invoke-direct {v2, p0, v3}, Lcom/roidapp/imagelib/retouch/g;-><init>(Lcom/roidapp/imagelib/retouch/a;Landroid/graphics/Bitmap;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 367
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final onAttach(Landroid/app/Activity;)V
    .locals 3

    .prologue
    .line 151
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 152
    instance-of v0, p1, Lcom/roidapp/imagelib/retouch/t;

    if-eqz v0, :cond_0

    .line 153
    check-cast p1, Lcom/roidapp/imagelib/retouch/t;

    iput-object p1, p0, Lcom/roidapp/imagelib/retouch/a;->f:Lcom/roidapp/imagelib/retouch/t;

    return-void

    .line 155
    :cond_0
    new-instance v0, Ljava/lang/ClassCastException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " must implemenet SkinFragment.OnImageReTouchListener"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/ClassCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 162
    iget-boolean v0, p0, Lcom/roidapp/imagelib/retouch/a;->y:Z

    if-eqz v0, :cond_1

    .line 200
    :cond_0
    :goto_0
    return-void

    .line 166
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    .line 167
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/a;->m:Landroid/view/View;

    sget v2, Lcom/roidapp/imagelib/d;->k:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 168
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/a;->n:Landroid/view/View;

    sget v2, Lcom/roidapp/imagelib/d;->k:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 169
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/a;->o:Landroid/view/View;

    sget v2, Lcom/roidapp/imagelib/d;->k:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 170
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/a;->p:Landroid/view/View;

    sget v2, Lcom/roidapp/imagelib/d;->k:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 171
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/a;->q:Landroid/view/View;

    sget v2, Lcom/roidapp/imagelib/d;->k:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 173
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/a;->t:Landroid/widget/CheckedTextView;

    invoke-virtual {v1, v3}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    .line 174
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/a;->u:Landroid/widget/CheckedTextView;

    invoke-virtual {v1, v3}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    .line 175
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/a;->v:Landroid/widget/CheckedTextView;

    invoke-virtual {v1, v3}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    .line 176
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/a;->w:Landroid/widget/CheckedTextView;

    invoke-virtual {v1, v3}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    .line 177
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/a;->x:Landroid/widget/CheckedTextView;

    invoke-virtual {v1, v3}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    .line 179
    sget v1, Lcom/roidapp/imagelib/g;->r:I

    if-ne v0, v1, :cond_2

    .line 180
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->m:Landroid/view/View;

    sget v1, Lcom/roidapp/imagelib/d;->j:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 181
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->t:Landroid/widget/CheckedTextView;

    invoke-virtual {v0, v4}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    .line 182
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->b:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    iget v1, p0, Lcom/roidapp/imagelib/retouch/a;->z:I

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->a(I)V

    goto :goto_0

    .line 183
    :cond_2
    sget v1, Lcom/roidapp/imagelib/g;->s:I

    if-ne v0, v1, :cond_3

    .line 184
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->n:Landroid/view/View;

    sget v1, Lcom/roidapp/imagelib/d;->j:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 185
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->u:Landroid/widget/CheckedTextView;

    invoke-virtual {v0, v4}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    .line 186
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->b:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    iget v1, p0, Lcom/roidapp/imagelib/retouch/a;->A:I

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->a(I)V

    goto :goto_0

    .line 187
    :cond_3
    sget v1, Lcom/roidapp/imagelib/g;->t:I

    if-ne v0, v1, :cond_4

    .line 188
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->o:Landroid/view/View;

    sget v1, Lcom/roidapp/imagelib/d;->j:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 189
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->v:Landroid/widget/CheckedTextView;

    invoke-virtual {v0, v4}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    .line 190
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->b:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    iget v1, p0, Lcom/roidapp/imagelib/retouch/a;->B:I

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->a(I)V

    goto/16 :goto_0

    .line 191
    :cond_4
    sget v1, Lcom/roidapp/imagelib/g;->u:I

    if-ne v0, v1, :cond_5

    .line 192
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->p:Landroid/view/View;

    sget v1, Lcom/roidapp/imagelib/d;->j:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 193
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->w:Landroid/widget/CheckedTextView;

    invoke-virtual {v0, v4}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    .line 194
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->b:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    iget v1, p0, Lcom/roidapp/imagelib/retouch/a;->C:I

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->a(I)V

    goto/16 :goto_0

    .line 195
    :cond_5
    sget v1, Lcom/roidapp/imagelib/g;->v:I

    if-ne v0, v1, :cond_0

    .line 196
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->q:Landroid/view/View;

    sget v1, Lcom/roidapp/imagelib/d;->j:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 197
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->x:Landroid/widget/CheckedTextView;

    invoke-virtual {v0, v4}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    .line 198
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->b:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    iget v1, p0, Lcom/roidapp/imagelib/retouch/a;->D:I

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->a(I)V

    goto/16 :goto_0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 121
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 122
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/a;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    .line 123
    if-eqz v0, :cond_0

    .line 124
    const-string v1, "image_path"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->c:Ljava/lang/String;

    .line 126
    :cond_0
    return-void
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 10

    .prologue
    const/4 v9, 0x3

    const/16 v8, 0x280

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v3, 0x0

    .line 132
    sget v0, Lcom/roidapp/imagelib/h;->a:I

    invoke-virtual {p1, v0, p2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->a:Landroid/view/View;

    .line 134
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->a:Landroid/view/View;

    .line 1268
    sget v1, Lcom/roidapp/imagelib/g;->e:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/retouch/BlemishImageView;

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->b:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    .line 1269
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->c:Ljava/lang/String;

    .line 1386
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1390
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v4

    long-to-float v2, v4

    const/high16 v4, 0x44800000    # 1024.0f

    div-float/2addr v2, v4

    const/high16 v4, 0x44800000    # 1024.0f

    div-float/2addr v2, v4

    .line 1391
    const/high16 v4, 0x42c00000    # 96.0f

    cmpl-float v4, v2, v4

    if-ltz v4, :cond_1

    .line 1392
    const/16 v2, 0x1000

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1393
    const/16 v2, 0x800

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v7, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1394
    const/16 v2, 0x400

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v6, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1395
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v9, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1396
    const/4 v2, 0x4

    const/16 v4, 0x140

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1413
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    new-array v2, v2, [Ljava/lang/Integer;

    .line 1414
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1415
    invoke-static {v0, v2}, Lcom/roidapp/imagelib/b/d;->a(Ljava/lang/String;[Ljava/lang/Integer;)[Ljava/lang/Integer;

    move-result-object v0

    .line 1418
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Load min length is "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1269
    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->g:[Ljava/lang/Integer;

    .line 1271
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/a;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/e;->a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/retouch/a;->z:I

    .line 1272
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/a;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/e;->b:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/retouch/a;->A:I

    .line 1273
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/a;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/e;->c:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/retouch/a;->B:I

    .line 1274
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/a;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/e;->d:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/retouch/a;->C:I

    .line 1275
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/a;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/roidapp/imagelib/e;->e:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/roidapp/imagelib/retouch/a;->D:I

    .line 1277
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->b:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->i:Lcom/roidapp/imagelib/retouch/w;

    .line 1278
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->b:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/a;->f:Lcom/roidapp/imagelib/retouch/t;

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->a(Lcom/roidapp/imagelib/retouch/t;)V

    .line 1279
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->b:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    invoke-virtual {v0, v7}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->a(Z)V

    .line 1280
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/a;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iput v0, p0, Lcom/roidapp/imagelib/retouch/a;->r:I

    .line 1281
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/a;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iput v0, p0, Lcom/roidapp/imagelib/retouch/a;->s:I

    .line 1282
    new-instance v6, Ljava/lang/Thread;

    new-instance v0, Lcom/roidapp/imagelib/retouch/e;

    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/a;->c:Ljava/lang/String;

    iget v4, p0, Lcom/roidapp/imagelib/retouch/a;->r:I

    iget v5, p0, Lcom/roidapp/imagelib/retouch/a;->s:I

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/imagelib/retouch/e;-><init>(Lcom/roidapp/imagelib/retouch/a;Ljava/lang/String;III)V

    invoke-direct {v6, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v6}, Ljava/lang/Thread;->start()V

    .line 135
    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/a;->a:Landroid/view/View;

    .line 2286
    sget v0, Lcom/roidapp/imagelib/g;->aI:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->l:Landroid/widget/RelativeLayout;

    .line 2288
    sget v0, Lcom/roidapp/imagelib/g;->aJ:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/retouch/Magnifier;

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->k:Lcom/roidapp/imagelib/retouch/Magnifier;

    .line 2289
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/a;->k:Lcom/roidapp/imagelib/retouch/Magnifier;

    invoke-virtual {v2}, Lcom/roidapp/imagelib/retouch/Magnifier;->a()I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/imagelib/retouch/a;->k:Lcom/roidapp/imagelib/retouch/Magnifier;

    invoke-virtual {v3}, Lcom/roidapp/imagelib/retouch/Magnifier;->a()I

    move-result v3

    invoke-direct {v0, v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 2290
    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/a;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 2292
    sget v0, Lcom/roidapp/imagelib/g;->r:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->m:Landroid/view/View;

    .line 2293
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->m:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2294
    sget v0, Lcom/roidapp/imagelib/g;->s:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->n:Landroid/view/View;

    .line 2295
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->n:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2296
    sget v0, Lcom/roidapp/imagelib/g;->t:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->o:Landroid/view/View;

    .line 2297
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->o:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2298
    sget v0, Lcom/roidapp/imagelib/g;->u:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->p:Landroid/view/View;

    .line 2299
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->p:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2300
    sget v0, Lcom/roidapp/imagelib/g;->v:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->q:Landroid/view/View;

    .line 2301
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->q:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2303
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->m:Landroid/view/View;

    sget v2, Lcom/roidapp/imagelib/g;->w:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckedTextView;

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->t:Landroid/widget/CheckedTextView;

    .line 2304
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->n:Landroid/view/View;

    sget v2, Lcom/roidapp/imagelib/g;->x:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckedTextView;

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->u:Landroid/widget/CheckedTextView;

    .line 2305
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->o:Landroid/view/View;

    sget v2, Lcom/roidapp/imagelib/g;->y:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckedTextView;

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->v:Landroid/widget/CheckedTextView;

    .line 2306
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->p:Landroid/view/View;

    sget v2, Lcom/roidapp/imagelib/g;->z:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckedTextView;

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->w:Landroid/widget/CheckedTextView;

    .line 2307
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->q:Landroid/view/View;

    sget v2, Lcom/roidapp/imagelib/g;->A:I

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckedTextView;

    iput-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->x:Landroid/widget/CheckedTextView;

    .line 2309
    sget v0, Lcom/roidapp/imagelib/g;->f:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 2310
    new-instance v1, Lcom/roidapp/imagelib/retouch/c;

    invoke-direct {v1, p0, v0}, Lcom/roidapp/imagelib/retouch/c;-><init>(Lcom/roidapp/imagelib/retouch/a;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 2332
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->b:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    iget-object v1, p0, Lcom/roidapp/imagelib/retouch/a;->k:Lcom/roidapp/imagelib/retouch/Magnifier;

    iget-object v2, p0, Lcom/roidapp/imagelib/retouch/a;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->a(Lcom/roidapp/imagelib/retouch/Magnifier;Landroid/widget/RelativeLayout;)V

    .line 2333
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->m:Landroid/view/View;

    sget v1, Lcom/roidapp/imagelib/d;->j:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 2334
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->t:Landroid/widget/CheckedTextView;

    invoke-virtual {v0, v7}, Landroid/widget/CheckedTextView;->setChecked(Z)V

    .line 2335
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->b:Lcom/roidapp/imagelib/retouch/BlemishImageView;

    iget v1, p0, Lcom/roidapp/imagelib/retouch/a;->z:I

    invoke-virtual {v0, v1}, Lcom/roidapp/imagelib/retouch/BlemishImageView;->a(I)V

    .line 136
    iget-object v0, p0, Lcom/roidapp/imagelib/retouch/a;->a:Landroid/view/View;

    return-object v0

    .line 1397
    :cond_1
    const/high16 v4, 0x42c00000    # 96.0f

    cmpg-float v4, v2, v4

    if-gez v4, :cond_2

    const/high16 v4, 0x42800000    # 64.0f

    cmpl-float v4, v2, v4

    if-ltz v4, :cond_2

    .line 1398
    const/16 v2, 0x800

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1399
    const/16 v2, 0x400

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v7, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1400
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v6, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 1401
    :cond_2
    const/high16 v4, 0x42800000    # 64.0f

    cmpg-float v4, v2, v4

    if-gez v4, :cond_3

    const/high16 v4, 0x42000000    # 32.0f

    cmpl-float v4, v2, v4

    if-ltz v4, :cond_3

    .line 1402
    const/16 v2, 0x67c

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1403
    const/16 v2, 0x3c0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v7, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1404
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v6, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1405
    const/16 v2, 0x140

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v9, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto/16 :goto_0

    .line 1406
    :cond_3
    const/high16 v4, 0x42000000    # 32.0f

    cmpg-float v2, v2, v4

    if-gez v2, :cond_0

    .line 1407
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1408
    const/16 v2, 0x1e0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v7, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1409
    const/16 v2, 0x140

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v6, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 1410
    const/16 v2, 0xa0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v9, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto/16 :goto_0
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 4

    .prologue
    .line 141
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 142
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 143
    const-string v0, "key_blemish_new"

    const/4 v2, 0x1

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3203
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/a;->isAdded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3204
    invoke-virtual {p0}, Lcom/roidapp/imagelib/retouch/a;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    .line 3205
    new-instance v2, Landroid/app/Dialog;

    sget v3, Lcom/roidapp/imagelib/k;->a:I

    invoke-direct {v2, v0, v3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 3207
    :try_start_0
    sget v0, Lcom/roidapp/imagelib/h;->b:I

    invoke-virtual {v2, v0}, Landroid/app/Dialog;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 3215
    sget v0, Lcom/roidapp/imagelib/g;->j:I

    invoke-virtual {v2, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v3, Lcom/roidapp/imagelib/retouch/b;

    invoke-direct {v3, p0, v2}, Lcom/roidapp/imagelib/retouch/b;-><init>(Lcom/roidapp/imagelib/retouch/a;Landroid/app/Dialog;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 3221
    invoke-virtual {v2}, Landroid/app/Dialog;->show()V

    .line 145
    :cond_0
    :goto_0
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "key_blemish_new"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 147
    :cond_1
    return-void

    .line 3209
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_0

    .line 3212
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0
.end method
