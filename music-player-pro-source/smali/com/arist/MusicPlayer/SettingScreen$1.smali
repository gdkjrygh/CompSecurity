.class Lcom/arist/MusicPlayer/SettingScreen$1;
.super Ljava/lang/Object;
.source "SettingScreen.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/SettingScreen;->onOptionsItemSelected(Landroid/view/MenuItem;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/SettingScreen;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/SettingScreen;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/SettingScreen$1;->this$0:Lcom/arist/MusicPlayer/SettingScreen;

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 41
    iget-object v0, p0, Lcom/arist/MusicPlayer/SettingScreen$1;->this$0:Lcom/arist/MusicPlayer/SettingScreen;

    # invokes: Lcom/arist/MusicPlayer/SettingScreen;->resetSettings()V
    invoke-static {v0}, Lcom/arist/MusicPlayer/SettingScreen;->access$0(Lcom/arist/MusicPlayer/SettingScreen;)V

    .line 42
    return-void
.end method
