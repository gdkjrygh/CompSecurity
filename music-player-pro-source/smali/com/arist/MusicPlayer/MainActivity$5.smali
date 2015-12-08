.class Lcom/arist/MusicPlayer/MainActivity$5;
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
    iput-object p1, p0, Lcom/arist/MusicPlayer/MainActivity$5;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    .line 280
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lcom/arist/MusicPlayer/MainActivity$5;)Lcom/arist/MusicPlayer/MainActivity;
    .locals 1

    .prologue
    .line 280
    iget-object v0, p0, Lcom/arist/MusicPlayer/MainActivity$5;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 283
    new-instance v1, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$5;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 284
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$5;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    const v3, 0x7f080056

    invoke-virtual {v2, v3}, Lcom/arist/MusicPlayer/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 285
    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 286
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$5;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    const v3, 0x7f080051

    invoke-virtual {v2, v3}, Lcom/arist/MusicPlayer/MainActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 287
    iget-object v2, p0, Lcom/arist/MusicPlayer/MainActivity$5;->this$0:Lcom/arist/MusicPlayer/MainActivity;

    # getter for: Lcom/arist/MusicPlayer/MainActivity;->playModeEntries:[Ljava/lang/String;
    invoke-static {v2}, Lcom/arist/MusicPlayer/MainActivity;->access$31(Lcom/arist/MusicPlayer/MainActivity;)[Ljava/lang/String;

    move-result-object v2

    .line 288
    sget v3, Lcom/arist/MusicPlayer/MyApplication;->playMode:I

    add-int/lit8 v3, v3, -0x1

    .line 289
    new-instance v4, Lcom/arist/MusicPlayer/MainActivity$5$1;

    invoke-direct {v4, p0}, Lcom/arist/MusicPlayer/MainActivity$5$1;-><init>(Lcom/arist/MusicPlayer/MainActivity$5;)V

    .line 287
    invoke-virtual {v1, v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setSingleChoiceItems([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v1

    .line 300
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    .line 301
    .local v0, "dialog":Landroid/app/Dialog;
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 302
    return-void
.end method
