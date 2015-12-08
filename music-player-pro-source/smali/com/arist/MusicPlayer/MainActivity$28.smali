.class Lcom/arist/MusicPlayer/MainActivity$28;
.super Ljava/lang/Object;
.source "MainActivity.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/arist/MusicPlayer/MainActivity;->onCreateDialog(I)Landroid/app/Dialog;
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
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$28;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 1475
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .param p1, "v"    # Landroid/view/View;

    .prologue
    const/4 v2, 0x2

    .line 1477
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$28;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/arist/MusicPlayer/MainActivity;->showDialog(I)V

    .line 1478
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$28;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-virtual {v0, v2}, Lcom/arist/MusicPlayer/MainActivity;->dismissDialog(I)V

    .line 1479
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$28;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-virtual {v0, v2}, Lcom/arist/MusicPlayer/MainActivity;->removeDialog(I)V

    .line 1480
    return-void
.end method
