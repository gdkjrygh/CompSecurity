.class Lcom/hmobile/biblekjv/SettingsActivity$6;
.super Ljava/lang/Object;
.source "SettingsActivity.java"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/hmobile/biblekjv/SettingsActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/hmobile/biblekjv/SettingsActivity;


# direct methods
.method constructor <init>(Lcom/hmobile/biblekjv/SettingsActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/hmobile/biblekjv/SettingsActivity$6;->this$0:Lcom/hmobile/biblekjv/SettingsActivity;

    .line 227
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 2
    .param p1, "seekBar"    # Landroid/widget/SeekBar;
    .param p2, "progress"    # I
    .param p3, "fromUser"    # Z

    .prologue
    .line 239
    iget-object v0, p0, Lcom/hmobile/biblekjv/SettingsActivity$6;->this$0:Lcom/hmobile/biblekjv/SettingsActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/SettingsActivity;->editor:Landroid/content/SharedPreferences$Editor;

    const-string v1, "speech_pitch"

    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 240
    iget-object v0, p0, Lcom/hmobile/biblekjv/SettingsActivity$6;->this$0:Lcom/hmobile/biblekjv/SettingsActivity;

    iget-object v0, v0, Lcom/hmobile/biblekjv/SettingsActivity;->editor:Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 241
    return-void
.end method

.method public onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0
    .param p1, "seekBar"    # Landroid/widget/SeekBar;

    .prologue
    .line 234
    return-void
.end method

.method public onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0
    .param p1, "seekBar"    # Landroid/widget/SeekBar;

    .prologue
    .line 230
    return-void
.end method
