.class public final Lcom/roidapp/photogrid/common/ap;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/graphics/drawable/Drawable;

.field private c:Landroid/graphics/drawable/Drawable;

.field private d:Landroid/widget/ImageView;

.field private e:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    new-instance v0, Lcom/roidapp/photogrid/common/aq;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/aq;-><init>(Lcom/roidapp/photogrid/common/ap;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/common/ap;->e:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/common/ap;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/roidapp/photogrid/common/ap;->a:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/common/ap;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/roidapp/photogrid/common/ap;->d:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/common/ap;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/roidapp/photogrid/common/ap;->b:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/common/ap;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/roidapp/photogrid/common/ap;->c:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/common/ap;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 25
    iget-object v0, p0, Lcom/roidapp/photogrid/common/ap;->e:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/app/Activity;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 59
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 133
    :cond_0
    :goto_0
    return-void

    .line 63
    :cond_1
    :try_start_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    .line 65
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 68
    new-instance v0, Lcom/roidapp/photogrid/common/ar;

    invoke-direct {v0, p0, p1, v1}, Lcom/roidapp/photogrid/common/ar;-><init>(Lcom/roidapp/photogrid/common/ap;Landroid/app/Activity;Landroid/app/AlertDialog;)V

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 83
    invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V

    .line 84
    const v0, 0x7f030108

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->setContentView(I)V

    .line 87
    const v0, 0x7f0d0419

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 88
    new-instance v2, Lcom/roidapp/photogrid/common/as;

    invoke-direct {v2, p0, v1, p1}, Lcom/roidapp/photogrid/common/as;-><init>(Lcom/roidapp/photogrid/common/ap;Landroid/app/AlertDialog;Landroid/app/Activity;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 98
    const v0, 0x7f0d0418

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 99
    new-instance v2, Lcom/roidapp/photogrid/common/at;

    invoke-direct {v2, p0, p1, v1}, Lcom/roidapp/photogrid/common/at;-><init>(Lcom/roidapp/photogrid/common/ap;Landroid/app/Activity;Landroid/app/AlertDialog;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 114
    const v0, 0x7f0d0415

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 115
    new-instance v2, Lcom/roidapp/photogrid/common/au;

    invoke-direct {v2, p0, p1, v1}, Lcom/roidapp/photogrid/common/au;-><init>(Lcom/roidapp/photogrid/common/ap;Landroid/app/Activity;Landroid/app/AlertDialog;)V

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_0
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 129
    :catch_0
    move-exception v0

    .line 130
    check-cast p1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-boolean v3, p1, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 131
    invoke-virtual {v0}, Landroid/view/WindowManager$BadTokenException;->printStackTrace()V

    goto :goto_0
.end method

.method public final b(Landroid/app/Activity;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 138
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 235
    :cond_0
    :goto_0
    return-void

    .line 142
    :cond_1
    :try_start_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v1

    .line 144
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 146
    new-instance v0, Lcom/roidapp/photogrid/common/av;

    invoke-direct {v0, p0, p1, v1}, Lcom/roidapp/photogrid/common/av;-><init>(Lcom/roidapp/photogrid/common/ap;Landroid/app/Activity;Landroid/app/AlertDialog;)V

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 160
    new-instance v0, Lcom/roidapp/photogrid/common/aw;

    invoke-direct {v0, p0, p1}, Lcom/roidapp/photogrid/common/aw;-><init>(Lcom/roidapp/photogrid/common/ap;Landroid/app/Activity;)V

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 179
    invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V

    .line 180
    const v0, 0x7f030107

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->setContentView(I)V

    .line 182
    const v0, 0x7f0d0410

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/common/ap;->d:Landroid/widget/ImageView;

    .line 183
    const v0, 0x7f0d0411

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/roidapp/photogrid/common/ap;->a:Landroid/widget/TextView;
    :try_end_0
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_0 .. :try_end_0} :catch_0

    .line 185
    :try_start_1
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0205e7

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/common/ap;->b:Landroid/graphics/drawable/Drawable;

    .line 186
    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f0205e8

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/common/ap;->c:Landroid/graphics/drawable/Drawable;
    :try_end_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_1 .. :try_end_1} :catch_0

    .line 192
    :goto_1
    :try_start_2
    iget-object v0, p0, Lcom/roidapp/photogrid/common/ap;->d:Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/roidapp/photogrid/common/ap;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 195
    const v0, 0x7f0d0413

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 196
    new-instance v2, Lcom/roidapp/photogrid/common/ax;

    invoke-direct {v2, p0, p1, v1}, Lcom/roidapp/photogrid/common/ax;-><init>(Lcom/roidapp/photogrid/common/ap;Landroid/app/Activity;Landroid/app/AlertDialog;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 218
    const v0, 0x7f0d0414

    invoke-virtual {v1, v0}, Landroid/app/AlertDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 219
    new-instance v2, Lcom/roidapp/photogrid/common/ay;

    invoke-direct {v2, p0, p1, v1}, Lcom/roidapp/photogrid/common/ay;-><init>(Lcom/roidapp/photogrid/common/ap;Landroid/app/Activity;Landroid/app/AlertDialog;)V

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 229
    iget-object v0, p0, Lcom/roidapp/photogrid/common/ap;->e:Landroid/os/Handler;

    const/4 v1, 0x1

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z
    :try_end_2
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_0

    .line 230
    :catch_0
    move-exception v0

    .line 231
    check-cast p1, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iput-boolean v4, p1, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    .line 232
    invoke-virtual {v0}, Landroid/view/WindowManager$BadTokenException;->printStackTrace()V

    goto/16 :goto_0

    .line 188
    :catch_1
    move-exception v0

    :try_start_3
    invoke-virtual {v0}, Ljava/lang/OutOfMemoryError;->printStackTrace()V

    goto :goto_1

    .line 190
    :catch_2
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_3
    .catch Landroid/view/WindowManager$BadTokenException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1
.end method
