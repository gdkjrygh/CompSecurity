.class Lcom/arist/MusicPlayer/MainActivity$5$1;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MainActivity$5;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/arist/MusicPlayer/MainActivity$5;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/MainActivity$5;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$5$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$5;

    .line 289
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .param p1, "dialog"    # Landroid/content/DialogInterface;
    .param p2, "which"    # I

    .prologue
    .line 292
    add-int/lit8 v0, p2, 0x1

    .line 293
    .local v0, "playModeTemp":I
    sput v0, Lcom/arist/MusicPlayer/MyApplication;->playMode:I

    .line 294
    sget-object v1, Lcom/arist/MusicPlayer/MyApplication;->musicPref:Lcom/arist/util/MusicPreference;

    .line 295
    invoke-virtual {v1, v0}, Lcom/arist/util/MusicPreference;->savePlayMode(I)V

    .line 297
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$5$1;->this$1:Lcom/arist/MusicPlayer/MainActivity$5;

    # getter for: Lcom/arist/MusicPlayer/MainActivity$5;->this$0:Lcom/arist/MusicPlayer/MainActivity;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MainActivity$5;->access$0(Lcom/arist/MusicPlayer/MainActivity$5;)Lcom/arist/MusicPlayer/MainActivity;

    move-result-object v1

    # invokes: Lcom/arist/MusicPlayer/MainActivity;->setPlaymodeLeftDrawable()V
    invoke-static {v1}, Lcom/arist/MusicPlayer/MainActivity;->access$32(Lcom/arist/MusicPlayer/MainActivity;)V

    .line 298
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 299
    return-void
.end method
