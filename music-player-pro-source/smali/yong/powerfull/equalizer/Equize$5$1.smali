.class Lyong/powerfull/equalizer/Equize$5$1;
.super Ljava/lang/Object;
.source "Equize.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyong/powerfull/equalizer/Equize$5;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lyong/powerfull/equalizer/Equize$5;

.field private final synthetic val$equizeBar:[Lyong/powerfull/equalizer/MySeekBar;


# direct methods
.method constructor <init>(Lyong/powerfull/equalizer/Equize$5;[Lyong/powerfull/equalizer/MySeekBar;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lyong/powerfull/equalizer/Equize$5$1;->this$1:Lyong/powerfull/equalizer/Equize$5;

    iput-object p2, p0, Lyong/powerfull/equalizer/Equize$5$1;->val$equizeBar:[Lyong/powerfull/equalizer/MySeekBar;

    .line 221
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4
    .param p1, "arg0"    # Landroid/content/DialogInterface;
    .param p2, "arg1"    # I

    .prologue
    .line 225
    iget-object v1, p0, Lyong/powerfull/equalizer/Equize$5$1;->this$1:Lyong/powerfull/equalizer/Equize$5;

    # getter for: Lyong/powerfull/equalizer/Equize$5;->this$0:Lyong/powerfull/equalizer/Equize;
    invoke-static {v1}, Lyong/powerfull/equalizer/Equize$5;->access$0(Lyong/powerfull/equalizer/Equize$5;)Lyong/powerfull/equalizer/Equize;

    move-result-object v1

    # getter for: Lyong/powerfull/equalizer/Equize;->equzechoosebtn:Landroid/widget/Button;
    invoke-static {v1}, Lyong/powerfull/equalizer/Equize;->access$4(Lyong/powerfull/equalizer/Equize;)Landroid/widget/Button;

    move-result-object v1

    .line 226
    iget-object v2, p0, Lyong/powerfull/equalizer/Equize$5$1;->this$1:Lyong/powerfull/equalizer/Equize$5;

    # getter for: Lyong/powerfull/equalizer/Equize$5;->this$0:Lyong/powerfull/equalizer/Equize;
    invoke-static {v2}, Lyong/powerfull/equalizer/Equize$5;->access$0(Lyong/powerfull/equalizer/Equize$5;)Lyong/powerfull/equalizer/Equize;

    move-result-object v2

    # getter for: Lyong/powerfull/equalizer/Equize;->presetName:[Ljava/lang/String;
    invoke-static {v2}, Lyong/powerfull/equalizer/Equize;->access$5(Lyong/powerfull/equalizer/Equize;)[Ljava/lang/String;

    move-result-object v2

    aget-object v2, v2, p2

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 227
    const/4 v0, 0x0

    .local v0, "j":I
    :goto_0
    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    .line 232
    return-void

    .line 228
    :cond_0
    iget-object v1, p0, Lyong/powerfull/equalizer/Equize$5$1;->val$equizeBar:[Lyong/powerfull/equalizer/MySeekBar;

    aget-object v1, v1, v0

    .line 229
    iget-object v2, p0, Lyong/powerfull/equalizer/Equize$5$1;->this$1:Lyong/powerfull/equalizer/Equize$5;

    # getter for: Lyong/powerfull/equalizer/Equize$5;->this$0:Lyong/powerfull/equalizer/Equize;
    invoke-static {v2}, Lyong/powerfull/equalizer/Equize$5;->access$0(Lyong/powerfull/equalizer/Equize$5;)Lyong/powerfull/equalizer/Equize;

    move-result-object v2

    iget-object v2, v2, Lyong/powerfull/equalizer/Equize;->presetEQ:[[I

    aget-object v2, v2, p2

    aget v2, v2, v0

    .line 230
    iget-object v3, p0, Lyong/powerfull/equalizer/Equize$5$1;->this$1:Lyong/powerfull/equalizer/Equize$5;

    # getter for: Lyong/powerfull/equalizer/Equize$5;->this$0:Lyong/powerfull/equalizer/Equize;
    invoke-static {v3}, Lyong/powerfull/equalizer/Equize$5;->access$0(Lyong/powerfull/equalizer/Equize$5;)Lyong/powerfull/equalizer/Equize;

    move-result-object v3

    iget-short v3, v3, Lyong/powerfull/equalizer/Equize;->maxEQLevel:S

    .line 229
    add-int/2addr v2, v3

    invoke-virtual {v1, v2}, Lyong/powerfull/equalizer/MySeekBar;->setProgress(I)V

    .line 227
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
