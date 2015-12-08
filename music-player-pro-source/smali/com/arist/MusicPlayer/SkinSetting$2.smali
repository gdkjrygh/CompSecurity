.class Lcom/arist/MusicPlayer/SkinSetting$2;
.super Ljava/lang/Object;
.source "SkinSetting.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/SkinSetting;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/SkinSetting;


# direct methods
.method constructor <init>(Lcom/arist/MusicPlayer/SkinSetting;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/arist/MusicPlayer/SkinSetting$2;->this$0:Lcom/arist/MusicPlayer/SkinSetting;

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 78
    iget-object v0, p0, Lcom/arist/MusicPlayer/SkinSetting$2;->this$0:Lcom/arist/MusicPlayer/SkinSetting;

    invoke-virtual {v0}, Lcom/arist/MusicPlayer/SkinSetting;->finish()V

    .line 79
    return-void
.end method
