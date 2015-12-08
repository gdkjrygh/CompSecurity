.class Lcom/pinterest/pinit/PinItButton$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic this$0:Lcom/pinterest/pinit/PinItButton;


# direct methods
.method constructor <init>(Lcom/pinterest/pinit/PinItButton;)V
    .locals 0

    .prologue
    .line 65
    iput-object p1, p0, Lcom/pinterest/pinit/PinItButton$1;->this$0:Lcom/pinterest/pinit/PinItButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 68
    if-eqz p1, :cond_0

    .line 69
    iget-object v0, p0, Lcom/pinterest/pinit/PinItButton$1;->this$0:Lcom/pinterest/pinit/PinItButton;

    # getter for: Lcom/pinterest/pinit/PinItButton;->_pinIt:Lcom/pinterest/pinit/PinIt;
    invoke-static {v0}, Lcom/pinterest/pinit/PinItButton;->access$000(Lcom/pinterest/pinit/PinItButton;)Lcom/pinterest/pinit/PinIt;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pinterest/pinit/PinIt;->doPinIt(Landroid/content/Context;)V

    .line 70
    :cond_0
    return-void
.end method
