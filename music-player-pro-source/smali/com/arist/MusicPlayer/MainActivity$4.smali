.class Lcom/arist/MusicPlayer/MainActivity$4;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MainActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/MainActivity;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/MainActivity;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$4;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 269
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 271
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$4;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 272
    const-class v2, Lcom/arist/MusicPlayer/ScanMusicActivity;

    .line 271
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 273
    .local v0, "ii":Landroid/content/Intent;
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$4;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-virtual {v1, v0}, Lcom/arist/MusicPlayer/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 275
    return-void
.end method
