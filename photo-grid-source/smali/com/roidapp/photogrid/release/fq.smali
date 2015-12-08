.class final Lcom/roidapp/photogrid/release/fq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/fo;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/fo;)V
    .locals 0

    .prologue
    .line 49
    iput-object p1, p0, Lcom/roidapp/photogrid/release/fq;->a:Lcom/roidapp/photogrid/release/fo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 1

    .prologue
    .line 66
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fq;->a:Lcom/roidapp/photogrid/release/fo;

    invoke-virtual {v0, p2}, Lcom/roidapp/photogrid/release/fo;->a(I)V

    .line 68
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .prologue
    .line 61
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 3

    .prologue
    .line 53
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fq;->a:Lcom/roidapp/photogrid/release/fo;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fo;->a(Lcom/roidapp/photogrid/release/fo;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 54
    const-string v1, "free_text_alpha"

    invoke-virtual {p1}, Landroid/widget/SeekBar;->getProgress()I

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 55
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 56
    return-void
.end method
