.class Lcom/arist/MusicPlayer/MainActivity$27;
.super Lcom/google/android/gms/ads/AdListener;
.source "MainActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MainActivity;->onCreate(Landroid/os/Bundle;)V
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
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$27;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 1142
    invoke-direct {p0}, Lcom/google/android/gms/ads/AdListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdLoaded()V
    .locals 2

    .prologue
    .line 1145
    invoke-super {p0}, Lcom/google/android/gms/ads/AdListener;->onAdLoaded()V

    .line 1146
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$27;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/arist/MusicPlayer/MainActivity;->isExitAdLoad:Z

    .line 1147
    return-void
.end method
