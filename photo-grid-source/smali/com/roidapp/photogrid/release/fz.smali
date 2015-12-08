.class final Lcom/roidapp/photogrid/release/fz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/fr;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/fr;)V
    .locals 0

    .prologue
    .line 281
    iput-object p1, p0, Lcom/roidapp/photogrid/release/fz;->a:Lcom/roidapp/photogrid/release/fr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 3

    .prologue
    const/high16 v2, 0x41200000    # 10.0f

    .line 312
    invoke-virtual {p1}, Landroid/widget/SeekBar;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "storke"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 313
    int-to-float v0, p2

    div-float/2addr v0, v2

    .line 314
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fz;->a:Lcom/roidapp/photogrid/release/fr;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/fr;->a(F)V

    .line 325
    :cond_0
    :goto_0
    return-void

    .line 315
    :cond_1
    invoke-virtual {p1}, Landroid/widget/SeekBar;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "shadow_space"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 316
    add-int/lit8 v0, p2, -0x64

    int-to-float v0, v0

    div-float/2addr v0, v2

    .line 317
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fz;->a:Lcom/roidapp/photogrid/release/fr;

    invoke-virtual {v1, v0, v0}, Lcom/roidapp/photogrid/release/fr;->a(FF)V

    goto :goto_0

    .line 318
    :cond_2
    invoke-virtual {p1}, Landroid/widget/SeekBar;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "shadow_size"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 319
    int-to-float v0, p2

    const/high16 v1, 0x41a00000    # 20.0f

    div-float/2addr v0, v1

    .line 320
    const/4 v1, 0x0

    cmpl-float v1, v0, v1

    if-nez v1, :cond_3

    .line 321
    const v0, 0x38d1b717    # 1.0E-4f

    .line 323
    :cond_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/fz;->a:Lcom/roidapp/photogrid/release/fr;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/fr;->b(F)V

    goto :goto_0
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .prologue
    .line 307
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 4

    .prologue
    const/high16 v3, 0x41200000    # 10.0f

    .line 285
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fz;->a:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fr;->c(Lcom/roidapp/photogrid/release/fr;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    .line 286
    invoke-virtual {p1}, Landroid/widget/SeekBar;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v2, "storke"

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 287
    invoke-virtual {p1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v3

    .line 288
    const-string v2, "free_text_stroke_scale"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    .line 299
    :cond_0
    :goto_0
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 301
    return-void

    .line 289
    :cond_1
    invoke-virtual {p1}, Landroid/widget/SeekBar;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v2, "shadow_space"

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 290
    invoke-virtual {p1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v0

    add-int/lit8 v0, v0, -0x64

    int-to-float v0, v0

    div-float/2addr v0, v3

    .line 291
    const-string v2, "free_text_shadow_space"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    goto :goto_0

    .line 292
    :cond_2
    invoke-virtual {p1}, Landroid/widget/SeekBar;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-string v2, "shadow_size"

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 293
    invoke-virtual {p1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v0

    int-to-float v0, v0

    const/high16 v2, 0x41a00000    # 20.0f

    div-float/2addr v0, v2

    .line 294
    const/4 v2, 0x0

    cmpl-float v2, v0, v2

    if-nez v2, :cond_3

    .line 295
    const v0, 0x38d1b717    # 1.0E-4f

    .line 297
    :cond_3
    const-string v2, "free_text_shadow_radius"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    goto :goto_0
.end method
