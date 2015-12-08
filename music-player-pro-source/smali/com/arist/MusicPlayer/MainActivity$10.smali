.class Lcom/arist/MusicPlayer/MainActivity$10;
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
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$10;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 360
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 363
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$10;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$10;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    const-class v3, Lcom/arist/MusicPlayer/SettingScreen;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/arist/MusicPlayer/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 364
    return-void
.end method
