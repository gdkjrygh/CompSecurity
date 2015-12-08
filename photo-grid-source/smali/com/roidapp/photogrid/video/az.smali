.class final Lcom/roidapp/photogrid/video/az;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/TrackSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/TrackSelector;)V
    .locals 0

    .prologue
    .line 290
    iput-object p1, p0, Lcom/roidapp/photogrid/video/az;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 293
    iget-object v0, p0, Lcom/roidapp/photogrid/video/az;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 294
    if-eqz v0, :cond_0

    .line 295
    iget-object v1, p0, Lcom/roidapp/photogrid/video/az;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    const-string v2, "music_policy"

    const/4 v3, 0x1

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/video/TrackSelector;->a(Lcom/roidapp/photogrid/video/TrackSelector;Z)Z

    .line 296
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/az;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->n(Lcom/roidapp/photogrid/video/TrackSelector;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 297
    iget-object v0, p0, Lcom/roidapp/photogrid/video/az;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->o(Lcom/roidapp/photogrid/video/TrackSelector;)V

    .line 300
    :goto_0
    return-void

    .line 299
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/az;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->p(Lcom/roidapp/photogrid/video/TrackSelector;)V

    goto :goto_0
.end method
