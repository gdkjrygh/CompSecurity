.class final Lcom/roidapp/photogrid/video/ax;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/TrackSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/TrackSelector;)V
    .locals 0

    .prologue
    .line 1209
    iput-object p1, p0, Lcom/roidapp/photogrid/video/ax;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1213
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ax;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->b(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "music_policy"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1214
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 1215
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ax;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/video/TrackSelector;->a(Lcom/roidapp/photogrid/video/TrackSelector;Z)Z

    .line 1216
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ax;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->p(Lcom/roidapp/photogrid/video/TrackSelector;)V

    .line 1217
    iget-object v0, p0, Lcom/roidapp/photogrid/video/ax;->a:Lcom/roidapp/photogrid/video/TrackSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/TrackSelector;->J(Lcom/roidapp/photogrid/video/TrackSelector;)Landroid/app/AlertDialog;

    .line 1218
    return-void
.end method
