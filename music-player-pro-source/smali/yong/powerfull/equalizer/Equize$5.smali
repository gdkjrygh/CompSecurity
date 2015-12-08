.class Lyong/powerfull/equalizer/Equize$5;
.super Ljava/lang/Object;
.source "Equize.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyong/powerfull/equalizer/Equize;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lyong/powerfull/equalizer/Equize;

.field private final synthetic val$equizeBar:[Lyong/powerfull/equalizer/MySeekBar;


# direct methods
.method constructor <init>(Lyong/powerfull/equalizer/Equize;[Lyong/powerfull/equalizer/MySeekBar;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lyong/powerfull/equalizer/Equize$5;->this$0:Lyong/powerfull/equalizer/Equize;

    iput-object p2, p0, Lyong/powerfull/equalizer/Equize$5;->val$equizeBar:[Lyong/powerfull/equalizer/MySeekBar;

    .line 215
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$0(Lyong/powerfull/equalizer/Equize$5;)Lyong/powerfull/equalizer/Equize;
    .locals 1

    .prologue
    .line 215
    iget-object v0, p0, Lyong/powerfull/equalizer/Equize$5;->this$0:Lyong/powerfull/equalizer/Equize;

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4
    .param p1, "arg0"    # Landroid/view/View;

    .prologue
    .line 218
    iget-object v0, p0, Lyong/powerfull/equalizer/Equize$5;->this$0:Lyong/powerfull/equalizer/Equize;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lyong/powerfull/equalizer/Equize;->choose:Z

    .line 219
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lyong/powerfull/equalizer/Equize$5;->this$0:Lyong/powerfull/equalizer/Equize;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 220
    iget-object v1, p0, Lyong/powerfull/equalizer/Equize$5;->this$0:Lyong/powerfull/equalizer/Equize;

    # getter for: Lyong/powerfull/equalizer/Equize;->presetName:[Ljava/lang/String;
    invoke-static {v1}, Lyong/powerfull/equalizer/Equize;->access$5(Lyong/powerfull/equalizer/Equize;)[Ljava/lang/String;

    move-result-object v1

    .line 221
    new-instance v2, Lyong/powerfull/equalizer/Equize$5$1;

    iget-object v3, p0, Lyong/powerfull/equalizer/Equize$5;->val$equizeBar:[Lyong/powerfull/equalizer/MySeekBar;

    invoke-direct {v2, p0, v3}, Lyong/powerfull/equalizer/Equize$5$1;-><init>(Lyong/powerfull/equalizer/Equize$5;[Lyong/powerfull/equalizer/MySeekBar;)V

    .line 220
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setItems([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 234
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 235
    return-void
.end method
