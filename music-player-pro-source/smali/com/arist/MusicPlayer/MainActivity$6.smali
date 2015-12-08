.class Lcom/arist/MusicPlayer/MainActivity$6;
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
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$6;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 307
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 309
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    .line 310
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$6;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$6;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    const-class v3, Lyong/powerfull/equalizer/Equize;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/arist/MusicPlayer/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 311
    :cond_0
    return-void
.end method
