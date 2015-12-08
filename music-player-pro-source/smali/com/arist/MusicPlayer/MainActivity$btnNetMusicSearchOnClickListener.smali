.class Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/arist/MusicPlayer/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "btnNetMusicSearchOnClickListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/arist/MusicPlayer/MainActivity;


# direct methods
.method private constructor <init>(Lcom/arist/MusicPlayer/MainActivity;)V
    .locals 0

    .prologue
    .line 1695
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/arist/MusicPlayer/MainActivity;Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;)V
    .locals 0

    .prologue
    .line 1695
    invoke-direct {p0, p1}, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;-><init>(Lcom/arist/MusicPlayer/MainActivity;)V

    return-void
.end method

.method static synthetic access$1(Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;)Lcom/arist/MusicPlayer/MainActivity;
    .locals 1

    .prologue
    .line 1695
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 1697
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->etNetMusicSearch:Landroid/widget/EditText;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MainActivity;->access$24(Lcom/arist/MusicPlayer/MainActivity;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1698
    .local v0, "text":Ljava/lang/String;
    if-eqz v0, :cond_0

    const-string v1, ""

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1741
    :cond_0
    :goto_0
    return-void

    .line 1701
    :cond_1
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->tv_netMusicTips:Landroid/widget/TextView;
    invoke-static {v1}, Lcom/arist/MusicPlayer/MainActivity;->access$25(Lcom/arist/MusicPlayer/MainActivity;)Landroid/widget/TextView;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 1703
    iget-object v1, p0, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->searchThreadRunning:Z
    invoke-static {v1}, Lcom/arist/MusicPlayer/MainActivity;->access$26(Lcom/arist/MusicPlayer/MainActivity;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 1705
    new-instance v1, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener$1;

    invoke-direct {v1, p0, v0}, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener$1;-><init>(Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener;Ljava/lang/String;)V

    .line 1740
    invoke-virtual {v1}, Lcom/arist/MusicPlayer/MainActivity$btnNetMusicSearchOnClickListener$1;->start()V

    goto :goto_0
.end method
