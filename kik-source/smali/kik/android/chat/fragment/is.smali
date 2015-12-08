.class final Lkik/android/chat/fragment/is;
.super Lkik/android/util/cv$a;
.source "SourceFile"


# instance fields
.field final synthetic a:Lkik/android/chat/fragment/KikCodeFragment;


# direct methods
.method constructor <init>(Lkik/android/chat/fragment/KikCodeFragment;)V
    .locals 0

    .prologue
    .line 187
    iput-object p1, p0, Lkik/android/chat/fragment/is;->a:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-direct {p0}, Lkik/android/util/cv$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    .prologue
    const/4 v5, 0x0

    const/4 v7, 0x1

    const/4 v6, 0x0

    const/high16 v4, 0x41a00000    # 20.0f

    .line 191
    iget-object v0, p0, Lkik/android/chat/fragment/is;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikCodeFragment;->f:Lcom/kik/android/a;

    const-string v1, "Share Code Tapped"

    invoke-virtual {v0, v1}, Lcom/kik/android/a;->b(Ljava/lang/String;)Lcom/kik/android/a$f;

    move-result-object v0

    const-string v1, "Colour"

    iget-object v2, p0, Lkik/android/chat/fragment/is;->a:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-static {v2}, Lkik/android/chat/fragment/KikCodeFragment;->i(Lkik/android/chat/fragment/KikCodeFragment;)Lcom/kik/scan/KikCode;

    move-result-object v2

    invoke-static {v2}, Lkik/android/chat/b/a;->a(Lcom/kik/scan/KikCode;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/kik/android/a$f;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/kik/android/a$f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kik/android/a$f;->b()V

    .line 192
    iget-object v0, p0, Lkik/android/chat/fragment/is;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-virtual {v0}, Lkik/android/widget/KikFinderCodeImageView;->getWidth()I

    move-result v0

    add-int/lit8 v0, v0, 0x28

    iget-object v1, p0, Lkik/android/chat/fragment/is;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-virtual {v1}, Lkik/android/widget/KikFinderCodeImageView;->getWidth()I

    move-result v1

    add-int/lit8 v1, v1, 0x28

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    .line 193
    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 194
    iget-object v1, p0, Lkik/android/chat/fragment/is;->a:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikCodeFragment;->i(Lkik/android/chat/fragment/KikCodeFragment;)Lcom/kik/scan/KikCode;

    move-result-object v1

    invoke-static {v1}, Lkik/android/chat/b/a;->b(Lcom/kik/scan/KikCode;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 195
    iget-object v1, p0, Lkik/android/chat/fragment/is;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v1, v1, Lkik/android/chat/fragment/KikCodeFragment;->_drawArea:Lkik/android/widget/KikFinderCodeImageView;

    invoke-virtual {v1}, Lkik/android/widget/KikFinderCodeImageView;->e()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1, v4, v4, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 197
    iget-object v0, p0, Lkik/android/chat/fragment/is;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikCodeFragment;->e:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    .line 201
    iget-object v0, v0, Lkik/a/d/aa;->c:Ljava/lang/String;

    .line 205
    iget-object v1, p0, Lkik/android/chat/fragment/is;->a:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-static {v1}, Lkik/android/chat/fragment/KikCodeFragment;->j(Lkik/android/chat/fragment/KikCodeFragment;)Lkik/a/d/n;

    move-result-object v1

    if-nez v1, :cond_0

    .line 206
    const v1, 0x7f09023d

    new-array v2, v7, [Ljava/lang/Object;

    aput-object v0, v2, v6

    invoke-static {v1, v2}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 207
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const v2, 0x7f09008d

    new-array v4, v7, [Ljava/lang/Object;

    aput-object v0, v4, v6

    invoke-static {v2, v4}, Lkik/android/chat/KikApplication;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 208
    const v0, 0x7f090238

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v6

    .line 215
    :goto_0
    iget-object v0, p0, Lkik/android/chat/fragment/is;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v0, v0, Lkik/android/chat/fragment/KikCodeFragment;->e:Lkik/a/e/w;

    invoke-interface {v0}, Lkik/a/e/w;->d()Lkik/a/d/aa;

    move-result-object v0

    iget-object v1, p0, Lkik/android/chat/fragment/is;->a:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-virtual {v1}, Lkik/android/chat/fragment/KikCodeFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    iget-object v2, p0, Lkik/android/chat/fragment/is;->a:Lkik/android/chat/fragment/KikCodeFragment;

    iget-object v2, v2, Lkik/android/chat/fragment/KikCodeFragment;->f:Lcom/kik/android/a;

    iget-object v7, p0, Lkik/android/chat/fragment/is;->a:Lkik/android/chat/fragment/KikCodeFragment;

    invoke-static {v7}, Lkik/android/chat/fragment/KikCodeFragment;->i(Lkik/android/chat/fragment/KikCodeFragment;)Lcom/kik/scan/KikCode;

    move-result-object v7

    invoke-static {v7}, Lkik/android/chat/b/a;->a(Lcom/kik/scan/KikCode;)Ljava/lang/String;

    move-result-object v7

    invoke-static/range {v0 .. v7}, Lkik/android/util/cc;->a(Lkik/a/d/aa;Landroid/content/Context;Lcom/kik/android/a;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 217
    return-void

    .line 211
    :cond_0
    const v0, 0x7f09023b

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v4

    .line 212
    const v0, 0x7f09023c

    invoke-static {v0}, Lkik/android/chat/KikApplication;->f(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_0
.end method
