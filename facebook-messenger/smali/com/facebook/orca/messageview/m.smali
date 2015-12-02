.class Lcom/facebook/orca/messageview/m;
.super Ljava/lang/Object;
.source "MessageViewOtherAttachmentView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/facebook/orca/messageview/l;


# direct methods
.method constructor <init>(Lcom/facebook/orca/messageview/l;)V
    .locals 0

    .prologue
    .line 61
    iput-object p1, p0, Lcom/facebook/orca/messageview/m;->a:Lcom/facebook/orca/messageview/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/facebook/orca/messageview/m;->a:Lcom/facebook/orca/messageview/l;

    invoke-static {v0}, Lcom/facebook/orca/messageview/l;->a(Lcom/facebook/orca/messageview/l;)V

    .line 65
    return-void
.end method
