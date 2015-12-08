.class Lcom/arist/MusicPlayer/MainActivity$18;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MainActivity;->initListener()V
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
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$18;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 620
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 622
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$18;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # invokes: Lcom/arist/MusicPlayer/MainActivity;->doPlayNext()V
    invoke-static {v0}, Lcom/arist/MusicPlayer/MainActivity;->access$46(Lcom/arist/MusicPlayer/MainActivity;)V

    .line 623
    return-void
.end method
