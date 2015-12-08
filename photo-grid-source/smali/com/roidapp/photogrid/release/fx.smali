.class final Lcom/roidapp/photogrid/release/fx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/view/ViewGroup;

.field final synthetic b:Lcom/roidapp/photogrid/release/fr;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/fr;Landroid/view/ViewGroup;)V
    .locals 0

    .prologue
    .line 160
    iput-object p1, p0, Lcom/roidapp/photogrid/release/fx;->b:Lcom/roidapp/photogrid/release/fr;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/fx;->a:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 164
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fx;->b:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fr;->a(Lcom/roidapp/photogrid/release/fr;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 165
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fx;->a:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/fx;->b:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/fr;->a(Lcom/roidapp/photogrid/release/fr;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0d0493

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 166
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fx;->b:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fr;->d(Lcom/roidapp/photogrid/release/fr;)Landroid/widget/SeekBar;

    move-result-object v0

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 167
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fx;->b:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fr;->e(Lcom/roidapp/photogrid/release/fr;)Landroid/widget/SeekBar;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 168
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fx;->b:Lcom/roidapp/photogrid/release/fr;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fr;->c(Lcom/roidapp/photogrid/release/fr;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "free_text_shadow_space"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "free_text_shadow_radius"

    const v2, 0x38d1b717    # 1.0E-4f

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 169
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fx;->b:Lcom/roidapp/photogrid/release/fr;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/fr;->c()V

    .line 170
    return-void
.end method
