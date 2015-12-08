.class public Lcom/arist/MusicPlayer/AboutDialog;
.super Landroid/app/Activity;
.source "AboutDialog.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    .line 14
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 15
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/AboutDialog;->requestWindowFeature(I)Z

    .line 16
    const v0, 0x7f030001

    invoke-virtual {p0, v0}, Lcom/arist/MusicPlayer/AboutDialog;->setContentView(I)V

    .line 17
    return-void
.end method
